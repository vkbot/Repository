package com.sun.jna;

import ai.onnxruntime.a;
import androidx.navigation.b;
import com.sun.jna.Library;
import com.sun.jna.Structure;
import com.sun.jna.internal.Cleaner;
import com.sun.jna.win32.DLLCallback;
import j1.i;
import java.io.Closeable;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class CallbackReference extends WeakReference<Callback> implements Closeable {
    private static final Class<?> DLL_CALLBACK_CLASS;
    private static final Method PROXY_CALLBACK_METHOD;
    private static final Map<Callback, CallbackThreadInitializer> initializers;
    int callingConvention;
    Pointer cbstruct;
    Cleaner.Cleanable cleanable;
    Method method;
    CallbackProxy proxy;
    Pointer trampoline;
    static final Map<Callback, CallbackReference> callbackMap = new WeakHashMap();
    static final Map<Callback, CallbackReference> directCallbackMap = new WeakHashMap();
    static final Map<Pointer, Reference<Callback>[]> pointerCallbackMap = new WeakHashMap();
    static final Map<Object, Object> allocations = Collections.synchronizedMap(new WeakHashMap());
    private static final Map<Long, Reference<CallbackReference>> allocatedMemory = new ConcurrentHashMap();

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class AttachOptions extends Structure {
        public static final List<String> FIELDS = Structure.createFieldsOrder("daemon", "detach", "name");
        public boolean daemon;
        public boolean detach;
        public String name;

        public AttachOptions() {
            setStringEncoding("utf8");
        }

        @Override // com.sun.jna.Structure
        public List<String> getFieldOrder() {
            return FIELDS;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static final class CallbackReferenceDisposer implements Runnable {
        private Pointer cbstruct;

        public CallbackReferenceDisposer(Pointer pointer) {
            this.cbstruct = pointer;
        }

        @Override // java.lang.Runnable
        public synchronized void run() {
            try {
                Pointer pointer = this.cbstruct;
                if (pointer != null) {
                    try {
                        Native.freeNativeCallback(pointer.peer);
                        CallbackReference.allocatedMemory.remove(Long.valueOf(this.cbstruct.peer));
                        this.cbstruct.peer = 0L;
                        this.cbstruct = null;
                    } catch (Throwable th) {
                        CallbackReference.allocatedMemory.remove(Long.valueOf(this.cbstruct.peer));
                        this.cbstruct.peer = 0L;
                        this.cbstruct = null;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public class DefaultCallbackProxy implements CallbackProxy {
        private final Method callbackMethod;
        private final String encoding;
        private final FromNativeConverter[] fromNative;
        private ToNativeConverter toNative;

        public DefaultCallbackProxy(Method method, TypeMapper typeMapper, String str) {
            this.callbackMethod = method;
            this.encoding = str;
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?> returnType = method.getReturnType();
            this.fromNative = new FromNativeConverter[parameterTypes.length];
            if (NativeMapped.class.isAssignableFrom(returnType)) {
                this.toNative = NativeMappedConverter.getInstance(returnType);
            } else if (typeMapper != null) {
                this.toNative = typeMapper.getToNativeConverter(returnType);
            }
            for (int i10 = 0; i10 < this.fromNative.length; i10++) {
                if (NativeMapped.class.isAssignableFrom(parameterTypes[i10])) {
                    this.fromNative[i10] = new NativeMappedConverter(parameterTypes[i10]);
                } else if (typeMapper != null) {
                    this.fromNative[i10] = typeMapper.getFromNativeConverter(parameterTypes[i10]);
                }
            }
            if (!method.isAccessible()) {
                try {
                    method.setAccessible(true);
                } catch (SecurityException unused) {
                    b.t(method, "Callback method is inaccessible, make sure the interface is public: ");
                    throw null;
                }
            }
        }

        private Object convertArgument(Object obj, Class<?> cls) {
            boolean z9;
            if (obj instanceof Pointer) {
                if (cls == String.class) {
                    return ((Pointer) obj).getString(0L, this.encoding);
                }
                if (cls == WString.class) {
                    return new WString(((Pointer) obj).getWideString(0L));
                }
                if (cls == String[].class) {
                    return ((Pointer) obj).getStringArray(0L, this.encoding);
                }
                if (cls == WString[].class) {
                    return ((Pointer) obj).getWideStringArray(0L);
                }
                if (Callback.class.isAssignableFrom(cls)) {
                    return CallbackReference.getCallback(cls, (Pointer) obj);
                }
                if (Structure.class.isAssignableFrom(cls)) {
                    if (Structure.ByValue.class.isAssignableFrom(cls)) {
                        Structure newInstance = Structure.newInstance(cls);
                        int size = newInstance.size();
                        byte[] bArr = new byte[size];
                        ((Pointer) obj).read(0L, bArr, 0, size);
                        newInstance.getPointer().write(0L, bArr, 0, size);
                        newInstance.read();
                        return newInstance;
                    }
                    Structure newInstance2 = Structure.newInstance((Class<Structure>) cls, (Pointer) obj);
                    newInstance2.conditionalAutoRead();
                    return newInstance2;
                }
                return obj;
            }
            if ((Boolean.TYPE == cls || Boolean.class == cls) && (obj instanceof Number)) {
                if (((Number) obj).intValue() != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                return Function.valueOf(z9);
            }
            return obj;
        }

        private Object convertResult(Object obj) {
            boolean z9;
            StringArray stringArray;
            ToNativeConverter toNativeConverter = this.toNative;
            if (toNativeConverter != null) {
                obj = toNativeConverter.toNative(obj, new CallbackResultContext(this.callbackMethod));
            }
            if (obj == null) {
                return null;
            }
            Class<?> cls = obj.getClass();
            if (Structure.class.isAssignableFrom(cls)) {
                if (!Structure.ByValue.class.isAssignableFrom(cls)) {
                    return ((Structure) obj).getPointer();
                }
                return obj;
            }
            if (cls != Boolean.TYPE && cls != Boolean.class) {
                if (cls != String.class && cls != WString.class) {
                    if (cls != String[].class && cls != WString[].class) {
                        if (Callback.class.isAssignableFrom(cls)) {
                            return CallbackReference.getFunctionPointer((Callback) obj);
                        }
                        return obj;
                    }
                    if (cls == String[].class) {
                        stringArray = new StringArray((String[]) obj, this.encoding);
                    } else {
                        stringArray = new StringArray((WString[]) obj);
                    }
                    CallbackReference.allocations.put(obj, stringArray);
                    return stringArray;
                }
                if (cls == WString.class) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                return CallbackReference.getNativeString(obj, z9);
            }
            if (Boolean.TRUE.equals(obj)) {
                return Function.INTEGER_TRUE;
            }
            return Function.INTEGER_FALSE;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private java.lang.Object invokeCallback(java.lang.Object[] r10) {
            /*
                r9 = this;
                java.lang.reflect.Method r0 = r9.callbackMethod
                java.lang.Class[] r0 = r0.getParameterTypes()
                int r1 = r10.length
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r3 = 0
                r4 = r3
            Lb:
                int r5 = r10.length
                if (r4 >= r5) goto L33
                r5 = r0[r4]
                r6 = r10[r4]
                com.sun.jna.FromNativeConverter[] r7 = r9.fromNative
                r7 = r7[r4]
                if (r7 == 0) goto L2a
                com.sun.jna.CallbackParameterContext r7 = new com.sun.jna.CallbackParameterContext
                java.lang.reflect.Method r8 = r9.callbackMethod
                r7.<init>(r5, r8, r10, r4)
                com.sun.jna.FromNativeConverter[] r5 = r9.fromNative
                r5 = r5[r4]
                java.lang.Object r5 = r5.fromNative(r6, r7)
                r2[r4] = r5
                goto L30
            L2a:
                java.lang.Object r5 = r9.convertArgument(r6, r5)
                r2[r4] = r5
            L30:
                int r4 = r4 + 1
                goto Lb
            L33:
                com.sun.jna.Callback r10 = r9.getCallback()
                if (r10 == 0) goto L65
                java.lang.reflect.Method r0 = r9.callbackMethod     // Catch: java.lang.reflect.InvocationTargetException -> L44 java.lang.IllegalAccessException -> L46 java.lang.IllegalArgumentException -> L48
                java.lang.Object r0 = r0.invoke(r10, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L44 java.lang.IllegalAccessException -> L46 java.lang.IllegalArgumentException -> L48
                java.lang.Object r10 = r9.convertResult(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L44 java.lang.IllegalAccessException -> L46 java.lang.IllegalArgumentException -> L48
                goto L66
            L44:
                r0 = move-exception
                goto L4a
            L46:
                r0 = move-exception
                goto L56
            L48:
                r0 = move-exception
                goto L5e
            L4a:
                com.sun.jna.Callback$UncaughtExceptionHandler r4 = com.sun.jna.Native.getCallbackExceptionHandler()
                java.lang.Throwable r0 = r0.getTargetException()
                r4.uncaughtException(r10, r0)
                goto L65
            L56:
                com.sun.jna.Callback$UncaughtExceptionHandler r4 = com.sun.jna.Native.getCallbackExceptionHandler()
                r4.uncaughtException(r10, r0)
                goto L65
            L5e:
                com.sun.jna.Callback$UncaughtExceptionHandler r4 = com.sun.jna.Native.getCallbackExceptionHandler()
                r4.uncaughtException(r10, r0)
            L65:
                r10 = 0
            L66:
                if (r3 >= r1) goto L7a
                r0 = r2[r3]
                boolean r4 = r0 instanceof com.sun.jna.Structure
                if (r4 == 0) goto L77
                boolean r4 = r0 instanceof com.sun.jna.Structure.ByValue
                if (r4 != 0) goto L77
                com.sun.jna.Structure r0 = (com.sun.jna.Structure) r0
                r0.autoWrite()
            L77:
                int r3 = r3 + 1
                goto L66
            L7a:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sun.jna.CallbackReference.DefaultCallbackProxy.invokeCallback(java.lang.Object[]):java.lang.Object");
        }

        @Override // com.sun.jna.CallbackProxy
        public Object callback(Object[] objArr) {
            try {
                return invokeCallback(objArr);
            } catch (Throwable th) {
                Native.getCallbackExceptionHandler().uncaughtException(getCallback(), th);
                return null;
            }
        }

        public Callback getCallback() {
            return CallbackReference.this.getCallback();
        }

        @Override // com.sun.jna.CallbackProxy
        public Class<?>[] getParameterTypes() {
            return this.callbackMethod.getParameterTypes();
        }

        @Override // com.sun.jna.CallbackProxy
        public Class<?> getReturnType() {
            return this.callbackMethod.getReturnType();
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class NativeFunctionHandler implements InvocationHandler {
        private final Function function;
        private final Map<String, ?> options;

        public NativeFunctionHandler(Pointer pointer, int i10, Map<String, ?> map) {
            this.options = map;
            this.function = new Function(pointer, i10, (String) map.get(Library.OPTION_STRING_ENCODING));
        }

        public Pointer getPointer() {
            return this.function;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (Library.Handler.OBJECT_TOSTRING.equals(method)) {
                String str = "Proxy interface to " + this.function;
                Class<?> findCallbackClass = CallbackReference.findCallbackClass(((Method) this.options.get("invoking-method")).getDeclaringClass());
                StringBuilder w = a.w(str, " (");
                w.append(findCallbackClass.getName());
                w.append(")");
                return w.toString();
            }
            if (Library.Handler.OBJECT_HASHCODE.equals(method)) {
                return Integer.valueOf(hashCode());
            }
            if (Library.Handler.OBJECT_EQUALS.equals(method)) {
                boolean z9 = false;
                Object obj2 = objArr[0];
                if (obj2 != null && Proxy.isProxyClass(obj2.getClass())) {
                    if (Proxy.getInvocationHandler(obj2) == this) {
                        z9 = true;
                    }
                    return Function.valueOf(z9);
                }
                return Boolean.FALSE;
            }
            if (Function.isVarArgs(method)) {
                objArr = Function.concatenateVarArgs(objArr);
            }
            return this.function.invoke(method.getReturnType(), objArr, this.options);
        }
    }

    static {
        try {
            PROXY_CALLBACK_METHOD = CallbackProxy.class.getMethod(Callback.METHOD_NAME, Object[].class);
            if (Platform.isWindows()) {
                try {
                    DLL_CALLBACK_CLASS = DLLCallback.class;
                } catch (ClassNotFoundException e) {
                    throw new Error("Error loading DLLCallback class", e);
                }
            } else {
                DLL_CALLBACK_CLASS = null;
            }
            initializers = new WeakHashMap();
        } catch (Exception unused) {
            throw new Error("Error looking up CallbackProxy.callback() method");
        }
    }

    private CallbackReference(Callback callback, int i10, boolean z9) {
        super(callback);
        long createNativeCallback;
        Pointer pointer;
        int i11;
        Class<?> cls;
        TypeMapper typeMapper = Native.getTypeMapper(callback.getClass());
        this.callingConvention = i10;
        boolean isPPC = Platform.isPPC();
        int i12 = 0;
        if (z9) {
            Method callbackMethod = getCallbackMethod(callback);
            Class<?>[] parameterTypes = callbackMethod.getParameterTypes();
            for (int i13 = 0; i13 < parameterTypes.length; i13++) {
                if ((isPPC && ((cls = parameterTypes[i13]) == Float.TYPE || cls == Double.TYPE)) || (typeMapper != null && typeMapper.getFromNativeConverter(parameterTypes[i13]) != null)) {
                    z9 = false;
                    break;
                }
            }
            if (typeMapper != null && typeMapper.getToNativeConverter(callbackMethod.getReturnType()) != null) {
                z9 = false;
            }
        }
        String stringEncoding = Native.getStringEncoding(callback.getClass());
        if (z9) {
            Method callbackMethod2 = getCallbackMethod(callback);
            this.method = callbackMethod2;
            Class<?>[] parameterTypes2 = callbackMethod2.getParameterTypes();
            Class<?> returnType = this.method.getReturnType();
            Class<?> cls2 = DLL_CALLBACK_CLASS;
            if (cls2 != null && cls2.isInstance(callback)) {
                i11 = 3;
            } else {
                i11 = 1;
            }
            createNativeCallback = Native.createNativeCallback(callback, this.method, parameterTypes2, returnType, i10, i11, stringEncoding);
        } else {
            if (callback instanceof CallbackProxy) {
                this.proxy = (CallbackProxy) callback;
            } else {
                this.proxy = new DefaultCallbackProxy(getCallbackMethod(callback), typeMapper, stringEncoding);
            }
            Class<?>[] parameterTypes3 = this.proxy.getParameterTypes();
            Class<?> returnType2 = this.proxy.getReturnType();
            if (typeMapper != null) {
                for (int i14 = 0; i14 < parameterTypes3.length; i14++) {
                    FromNativeConverter fromNativeConverter = typeMapper.getFromNativeConverter(parameterTypes3[i14]);
                    if (fromNativeConverter != null) {
                        parameterTypes3[i14] = fromNativeConverter.nativeType();
                    }
                }
                ToNativeConverter toNativeConverter = typeMapper.getToNativeConverter(returnType2);
                if (toNativeConverter != null) {
                    returnType2 = toNativeConverter.nativeType();
                }
            }
            for (int i15 = 0; i15 < parameterTypes3.length; i15++) {
                Class<?> nativeType = getNativeType(parameterTypes3[i15]);
                parameterTypes3[i15] = nativeType;
                if (!isAllowableNativeType(nativeType)) {
                    b.x(parameterTypes3[i15], "Callback argument ", " requires custom type conversion");
                    throw null;
                }
            }
            Class<?> nativeType2 = getNativeType(returnType2);
            if (isAllowableNativeType(nativeType2)) {
                Class<?> cls3 = DLL_CALLBACK_CLASS;
                if (cls3 != null && cls3.isInstance(callback)) {
                    i12 = 2;
                }
                createNativeCallback = Native.createNativeCallback(this.proxy, PROXY_CALLBACK_METHOD, parameterTypes3, nativeType2, i10, i12, stringEncoding);
            } else {
                b.x(nativeType2, "Callback return type ", " requires custom type conversion");
                throw null;
            }
        }
        if (createNativeCallback != 0) {
            pointer = new Pointer(createNativeCallback);
        } else {
            pointer = null;
        }
        this.cbstruct = pointer;
        if (createNativeCallback != 0) {
            allocatedMemory.put(Long.valueOf(createNativeCallback), new WeakReference(this));
            this.cleanable = Cleaner.getCleaner().register(this, new CallbackReferenceDisposer(this.cbstruct));
        }
    }

    private static Reference<Callback>[] addCallbackToArray(Callback callback, Reference<Callback>[] referenceArr) {
        int i10 = 0;
        int i11 = 1;
        if (referenceArr != null) {
            for (int i12 = 0; i12 < referenceArr.length; i12++) {
                if (referenceArr[i12].get() == null) {
                    referenceArr[i12] = null;
                } else {
                    i11++;
                }
            }
        }
        Reference<Callback>[] referenceArr2 = new Reference[i11];
        if (referenceArr != null) {
            int i13 = 0;
            while (i10 < referenceArr.length) {
                Reference<Callback> reference = referenceArr[i10];
                if (reference != null) {
                    referenceArr2[i13] = reference;
                    i13++;
                }
                i10++;
            }
            i10 = i13;
        }
        referenceArr2[i10] = new WeakReference(callback);
        return referenceArr2;
    }

    private static Method checkMethod(Method method) {
        if (method.getParameterTypes().length <= 256) {
            return method;
        }
        b.e(method, "Method signature exceeds the maximum parameter count: ");
        return null;
    }

    private static Callback createCallback(Class<?> cls, Pointer pointer) {
        int i10;
        if (AltCallingConvention.class.isAssignableFrom(cls)) {
            i10 = 63;
        } else {
            i10 = 0;
        }
        HashMap hashMap = new HashMap(Native.getLibraryOptions(cls));
        hashMap.put("invoking-method", getCallbackMethod(cls));
        return (Callback) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new NativeFunctionHandler(pointer, i10, hashMap));
    }

    public static void disposeAll() {
        Iterator it = new LinkedList(allocatedMemory.values()).iterator();
        while (it.hasNext()) {
            CallbackReference callbackReference = (CallbackReference) ((Reference) it.next()).get();
            if (callbackReference != null) {
                callbackReference.close();
            }
        }
    }

    public static Class<?> findCallbackClass(Class<?> cls) {
        if (Callback.class.isAssignableFrom(cls)) {
            if (!cls.isInterface()) {
                Class<?>[] interfaces = cls.getInterfaces();
                int i10 = 0;
                while (true) {
                    if (i10 >= interfaces.length) {
                        break;
                    }
                    if (Callback.class.isAssignableFrom(interfaces[i10])) {
                        try {
                            getCallbackMethod(interfaces[i10]);
                            return interfaces[i10];
                        } catch (IllegalArgumentException unused) {
                            if (Callback.class.isAssignableFrom(cls.getSuperclass())) {
                                return findCallbackClass(cls.getSuperclass());
                            }
                            return cls;
                        }
                    }
                    i10++;
                }
            } else {
                return cls;
            }
        } else {
            i.k(cls.getName().concat(" is not derived from com.sun.jna.Callback"));
            return null;
        }
    }

    private static Callback getCallback(Class<?> cls, Pointer pointer, boolean z9) {
        Map<Callback, CallbackReference> map;
        if (pointer == null) {
            return null;
        }
        if (cls.isInterface()) {
            if (z9) {
                map = directCallbackMap;
            } else {
                map = callbackMap;
            }
            Map<Pointer, Reference<Callback>[]> map2 = pointerCallbackMap;
            synchronized (map2) {
                try {
                    Reference<Callback>[] referenceArr = map2.get(pointer);
                    Callback typeAssignableCallback = getTypeAssignableCallback(cls, referenceArr);
                    if (typeAssignableCallback != null) {
                        return typeAssignableCallback;
                    }
                    Callback createCallback = createCallback(cls, pointer);
                    map2.put(pointer, addCallbackToArray(createCallback, referenceArr));
                    map.remove(createCallback);
                    return createCallback;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        i.k("Callback type must be an interface");
        return null;
    }

    private static Method getCallbackMethod(Class<?> cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        Method[] methods = cls.getMethods();
        HashSet hashSet = new HashSet(Arrays.asList(declaredMethods));
        hashSet.retainAll(Arrays.asList(methods));
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (Callback.FORBIDDEN_NAMES.contains(((Method) it.next()).getName())) {
                it.remove();
            }
        }
        Method[] methodArr = (Method[]) hashSet.toArray(new Method[0]);
        if (methodArr.length == 1) {
            return checkMethod(methodArr[0]);
        }
        for (Method method : methodArr) {
            if (Callback.METHOD_NAME.equals(method.getName())) {
                return checkMethod(method);
            }
        }
        i.k("Callback must implement a single public method, or one public method named 'callback'");
        return null;
    }

    private static Pointer getFunctionPointer(Callback callback, boolean z9) {
        int i10;
        Map<Callback, CallbackReference> map;
        Pointer trampoline;
        if (callback == null) {
            return null;
        }
        Pointer nativeFunctionPointer = getNativeFunctionPointer(callback);
        if (nativeFunctionPointer != null) {
            return nativeFunctionPointer;
        }
        Map<String, Object> libraryOptions = Native.getLibraryOptions(callback.getClass());
        if (callback instanceof AltCallingConvention) {
            i10 = 63;
        } else if (libraryOptions != null && libraryOptions.containsKey(Library.OPTION_CALLING_CONVENTION)) {
            i10 = ((Integer) libraryOptions.get(Library.OPTION_CALLING_CONVENTION)).intValue();
        } else {
            i10 = 0;
        }
        if (z9) {
            map = directCallbackMap;
        } else {
            map = callbackMap;
        }
        Map<Pointer, Reference<Callback>[]> map2 = pointerCallbackMap;
        synchronized (map2) {
            try {
                CallbackReference callbackReference = map.get(callback);
                if (callbackReference == null) {
                    callbackReference = new CallbackReference(callback, i10, z9);
                    map.put(callback, callbackReference);
                    map2.put(callbackReference.getTrampoline(), addCallbackToArray(callback, null));
                    if (initializers.containsKey(callback)) {
                        callbackReference.setCallbackOptions(1);
                    }
                }
                trampoline = callbackReference.getTrampoline();
            } catch (Throwable th) {
                throw th;
            }
        }
        return trampoline;
    }

    private static Pointer getNativeFunctionPointer(Callback callback) {
        if (Proxy.isProxyClass(callback.getClass())) {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(callback);
            if (invocationHandler instanceof NativeFunctionHandler) {
                return ((NativeFunctionHandler) invocationHandler).getPointer();
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Pointer getNativeString(Object obj, boolean z9) {
        if (obj != null) {
            NativeString nativeString = new NativeString(obj.toString(), z9);
            allocations.put(obj, nativeString);
            return nativeString.getPointer();
        }
        return null;
    }

    private Class<?> getNativeType(Class<?> cls) {
        if (Structure.class.isAssignableFrom(cls)) {
            Structure.validate(cls);
            if (!Structure.ByValue.class.isAssignableFrom(cls)) {
                return Pointer.class;
            }
        } else {
            if (NativeMapped.class.isAssignableFrom(cls)) {
                return NativeMappedConverter.getInstance(cls).nativeType();
            }
            if (cls == String.class || cls == WString.class || cls == String[].class || cls == WString[].class || Callback.class.isAssignableFrom(cls)) {
                return Pointer.class;
            }
        }
        return cls;
    }

    private static Callback getTypeAssignableCallback(Class<?> cls, Reference<Callback>[] referenceArr) {
        if (referenceArr != null) {
            for (Reference<Callback> reference : referenceArr) {
                Callback callback = reference.get();
                if (callback != null && cls.isAssignableFrom(callback.getClass())) {
                    return callback;
                }
            }
            return null;
        }
        return null;
    }

    private static ThreadGroup initializeThread(Callback callback, AttachOptions attachOptions) {
        CallbackThreadInitializer callbackThreadInitializer;
        if (callback instanceof DefaultCallbackProxy) {
            callback = ((DefaultCallbackProxy) callback).getCallback();
        }
        Map<Callback, CallbackThreadInitializer> map = initializers;
        synchronized (map) {
            callbackThreadInitializer = map.get(callback);
        }
        if (callbackThreadInitializer != null) {
            ThreadGroup threadGroup = callbackThreadInitializer.getThreadGroup(callback);
            attachOptions.name = callbackThreadInitializer.getName(callback);
            attachOptions.daemon = callbackThreadInitializer.isDaemon(callback);
            attachOptions.detach = callbackThreadInitializer.detach(callback);
            attachOptions.write();
            return threadGroup;
        }
        return null;
    }

    private static boolean isAllowableNativeType(Class<?> cls) {
        if (cls != Void.TYPE && cls != Void.class && cls != Boolean.TYPE && cls != Boolean.class && cls != Byte.TYPE && cls != Byte.class && cls != Short.TYPE && cls != Short.class && cls != Character.TYPE && cls != Character.class && cls != Integer.TYPE && cls != Integer.class && cls != Long.TYPE && cls != Long.class && cls != Float.TYPE && cls != Float.class && cls != Double.TYPE && cls != Double.class) {
            if ((!Structure.ByValue.class.isAssignableFrom(cls) || !Structure.class.isAssignableFrom(cls)) && !Pointer.class.isAssignableFrom(cls)) {
                return false;
            }
            return true;
        }
        return true;
    }

    private void setCallbackOptions(int i10) {
        this.cbstruct.setInt(Native.POINTER_SIZE, i10);
    }

    public static CallbackThreadInitializer setCallbackThreadInitializer(Callback callback, CallbackThreadInitializer callbackThreadInitializer) {
        Map<Callback, CallbackThreadInitializer> map = initializers;
        synchronized (map) {
            try {
                if (callbackThreadInitializer != null) {
                    return map.put(callback, callbackThreadInitializer);
                }
                return map.remove(callback);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Cleaner.Cleanable cleanable = this.cleanable;
        if (cleanable != null) {
            cleanable.clean();
        }
        this.cbstruct = null;
    }

    @Deprecated
    public void dispose() {
        close();
    }

    public Pointer getTrampoline() {
        if (this.trampoline == null) {
            this.trampoline = this.cbstruct.getPointer(0L);
        }
        return this.trampoline;
    }

    public static Callback getCallback(Class<?> cls, Pointer pointer) {
        return getCallback(cls, pointer, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Callback getCallback() {
        return get();
    }

    private static Method getCallbackMethod(Callback callback) {
        return getCallbackMethod(findCallbackClass(callback.getClass()));
    }

    public static Pointer getFunctionPointer(Callback callback) {
        return getFunctionPointer(callback, false);
    }
}
