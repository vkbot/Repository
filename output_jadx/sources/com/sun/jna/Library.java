package com.sun.jna;

import ai.onnxruntime.a;
import com.sun.jna.internal.ReflectionUtils;
import j1.i;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public interface Library {
    public static final String OPTION_ALLOW_OBJECTS = "allow-objects";
    public static final String OPTION_CALLING_CONVENTION = "calling-convention";
    public static final String OPTION_CLASSLOADER = "classloader";
    public static final String OPTION_FUNCTION_MAPPER = "function-mapper";
    public static final String OPTION_INVOCATION_MAPPER = "invocation-mapper";
    public static final String OPTION_OPEN_FLAGS = "open-flags";
    public static final String OPTION_STRING_ENCODING = "string-encoding";
    public static final String OPTION_STRUCTURE_ALIGNMENT = "structure-alignment";
    public static final String OPTION_SYMBOL_PROVIDER = "symbol-provider";
    public static final String OPTION_TYPE_MAPPER = "type-mapper";

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class Handler implements InvocationHandler {
        static final Method OBJECT_EQUALS;
        static final Method OBJECT_HASHCODE;
        static final Method OBJECT_TOSTRING;
        private final Map<Method, FunctionInfo> functions = new WeakHashMap();
        private final Class<?> interfaceClass;
        private final InvocationMapper invocationMapper;
        private final NativeLibrary nativeLibrary;
        private final Map<String, Object> options;

        static {
            try {
                OBJECT_TOSTRING = Object.class.getMethod("toString", null);
                OBJECT_HASHCODE = Object.class.getMethod("hashCode", null);
                OBJECT_EQUALS = Object.class.getMethod("equals", Object.class);
            } catch (Exception unused) {
                throw new Error("Error retrieving Object.toString() method");
            }
        }

        public Handler(String str, Class<?> cls, Map<String, ?> map) {
            int i10;
            if (str != null && "".equals(str.trim())) {
                i.k(a.m("Invalid library name \"", str, "\""));
                throw null;
            }
            if (cls.isInterface()) {
                this.interfaceClass = cls;
                HashMap hashMap = new HashMap(map);
                this.options = hashMap;
                if (AltCallingConvention.class.isAssignableFrom(cls)) {
                    i10 = 63;
                } else {
                    i10 = 0;
                }
                if (hashMap.get(Library.OPTION_CALLING_CONVENTION) == null) {
                    hashMap.put(Library.OPTION_CALLING_CONVENTION, Integer.valueOf(i10));
                }
                if (hashMap.get(Library.OPTION_CLASSLOADER) == null) {
                    hashMap.put(Library.OPTION_CLASSLOADER, cls.getClassLoader());
                }
                this.nativeLibrary = NativeLibrary.getInstance(str, hashMap);
                this.invocationMapper = (InvocationMapper) hashMap.get(Library.OPTION_INVOCATION_MAPPER);
                return;
            }
            StringBuilder w = a.w(str, " does not implement an interface: ");
            w.append(cls.getName());
            throw new IllegalArgumentException(w.toString());
        }

        public Class<?> getInterfaceClass() {
            return this.interfaceClass;
        }

        public String getLibraryName() {
            return this.nativeLibrary.getName();
        }

        public NativeLibrary getNativeLibrary() {
            return this.nativeLibrary;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            FunctionInfo functionInfo;
            InvocationHandler invocationHandler;
            Function function;
            Class<?>[] clsArr;
            HashMap hashMap;
            if (OBJECT_TOSTRING.equals(method)) {
                return "Proxy interface to " + this.nativeLibrary;
            }
            if (OBJECT_HASHCODE.equals(method)) {
                return Integer.valueOf(hashCode());
            }
            if (OBJECT_EQUALS.equals(method)) {
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
            FunctionInfo functionInfo2 = this.functions.get(method);
            if (functionInfo2 == null) {
                synchronized (this.functions) {
                    try {
                        functionInfo2 = this.functions.get(method);
                        if (functionInfo2 == null) {
                            if (!ReflectionUtils.isDefault(method)) {
                                boolean isVarArgs = Function.isVarArgs(method);
                                InvocationMapper invocationMapper = this.invocationMapper;
                                if (invocationMapper != null) {
                                    invocationHandler = invocationMapper.getInvocationHandler(this.nativeLibrary, method);
                                } else {
                                    invocationHandler = null;
                                }
                                if (invocationHandler == null) {
                                    Function function2 = this.nativeLibrary.getFunction(method.getName(), method);
                                    Class<?>[] parameterTypes = method.getParameterTypes();
                                    HashMap hashMap2 = new HashMap(this.options);
                                    hashMap2.put("invoking-method", method);
                                    clsArr = parameterTypes;
                                    hashMap = hashMap2;
                                    function = function2;
                                } else {
                                    function = null;
                                    clsArr = null;
                                    hashMap = null;
                                }
                                functionInfo = new FunctionInfo(invocationHandler, function, clsArr, isVarArgs, hashMap);
                            } else {
                                functionInfo = new FunctionInfo(ReflectionUtils.getMethodHandle(method));
                            }
                            this.functions.put(method, functionInfo);
                            functionInfo2 = functionInfo;
                        }
                    } finally {
                    }
                }
            }
            Object obj3 = functionInfo2.methodHandle;
            if (obj3 != null) {
                return ReflectionUtils.invokeDefaultMethod(obj, obj3, objArr);
            }
            if (functionInfo2.isVarArgs) {
                objArr = Function.concatenateVarArgs(objArr);
            }
            Object[] objArr2 = objArr;
            InvocationHandler invocationHandler2 = functionInfo2.handler;
            if (invocationHandler2 != null) {
                return invocationHandler2.invoke(obj, method, objArr2);
            }
            return functionInfo2.function.invoke(method, functionInfo2.parameterTypes, method.getReturnType(), objArr2, functionInfo2.options);
        }

        /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
        /* loaded from: classes.dex */
        public static final class FunctionInfo {
            final Function function;
            final InvocationHandler handler;
            final boolean isVarArgs;
            final Object methodHandle;
            final Map<String, ?> options;
            final Class<?>[] parameterTypes;

            public FunctionInfo(Object obj) {
                this.handler = null;
                this.function = null;
                this.isVarArgs = false;
                this.options = null;
                this.parameterTypes = null;
                this.methodHandle = obj;
            }

            public FunctionInfo(InvocationHandler invocationHandler, Function function, Class<?>[] clsArr, boolean z9, Map<String, ?> map) {
                this.handler = invocationHandler;
                this.function = function;
                this.isVarArgs = z9;
                this.options = map;
                this.parameterTypes = clsArr;
                this.methodHandle = null;
            }
        }
    }
}
