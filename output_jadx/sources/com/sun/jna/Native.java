package com.sun.jna;

import ai.onnxruntime.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.b;
import com.sun.jna.Callback;
import com.sun.jna.Library;
import com.sun.jna.Structure;
import j1.i;
import java.awt.Component;
import java.awt.GraphicsEnvironment;
import java.awt.HeadlessException;
import java.awt.Window;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class Native implements Version {
    public static final int BOOL_SIZE;
    static final int CB_HAS_INITIALIZER = 1;
    static final int CB_OPTION_DIRECT = 1;
    static final int CB_OPTION_IN_DLL = 2;
    private static final int CVT_ARRAY_BOOLEAN = 13;
    private static final int CVT_ARRAY_BYTE = 6;
    private static final int CVT_ARRAY_CHAR = 8;
    private static final int CVT_ARRAY_DOUBLE = 12;
    private static final int CVT_ARRAY_FLOAT = 11;
    private static final int CVT_ARRAY_INT = 9;
    private static final int CVT_ARRAY_LONG = 10;
    private static final int CVT_ARRAY_SHORT = 7;
    private static final int CVT_BOOLEAN = 14;
    private static final int CVT_BUFFER = 5;
    private static final int CVT_BYTE = 29;
    private static final int CVT_CALLBACK = 15;
    private static final int CVT_DEFAULT = 0;
    private static final int CVT_FLOAT = 16;
    private static final int CVT_INTEGER_TYPE = 21;
    private static final int CVT_JNIENV = 27;
    private static final int CVT_NATIVE_MAPPED = 17;
    private static final int CVT_NATIVE_MAPPED_STRING = 18;
    private static final int CVT_NATIVE_MAPPED_WSTRING = 19;
    private static final int CVT_OBJECT = 26;
    private static final int CVT_POINTER = 1;
    private static final int CVT_POINTER_TYPE = 22;
    private static final int CVT_SHORT = 28;
    private static final int CVT_STRING = 2;
    private static final int CVT_STRUCTURE = 3;
    private static final int CVT_STRUCTURE_BYVAL = 4;
    private static final int CVT_TYPE_MAPPER = 23;
    private static final int CVT_TYPE_MAPPER_STRING = 24;
    private static final int CVT_TYPE_MAPPER_WSTRING = 25;
    private static final int CVT_UNSUPPORTED = -1;
    private static final int CVT_WSTRING = 20;
    public static final boolean DEBUG_JNA_LOAD;
    private static final Level DEBUG_JNA_LOAD_LEVEL;
    public static final boolean DEBUG_LOAD;
    public static final Charset DEFAULT_CHARSET;
    public static final String DEFAULT_ENCODING;
    private static final Callback.UncaughtExceptionHandler DEFAULT_HANDLER;
    static final String JNA_TMPLIB_PREFIX = "jna";
    private static final Logger LOG = Logger.getLogger(Native.class.getName());
    public static final int LONG_DOUBLE_SIZE;
    public static final int LONG_SIZE;
    static final int MAX_ALIGNMENT;
    static final int MAX_PADDING;
    public static final int POINTER_SIZE;
    public static final int SIZE_T_SIZE;
    private static final int TYPE_BOOL = 4;
    private static final int TYPE_LONG = 1;
    private static final int TYPE_LONG_DOUBLE = 5;
    private static final int TYPE_SIZE_T = 3;
    private static final int TYPE_VOIDP = 0;
    private static final int TYPE_WCHAR_T = 2;
    public static final int WCHAR_SIZE;
    private static final String _OPTION_ENCLOSING_LIBRARY = "enclosing-library";
    private static Callback.UncaughtExceptionHandler callbackExceptionHandler;
    private static final Object finalizer;
    static String jnidispatchPath;
    private static final Map<Class<?>, Reference<?>> libraries;
    private static final ThreadLocal<Memory> nativeThreadTerminationFlag;
    private static final Map<Thread, Pointer> nativeThreads;
    private static final Map<Class<?>, long[]> registeredClasses;
    private static final Map<Class<?>, NativeLibrary> registeredLibraries;
    private static final Map<Class<?>, Map<String, Object>> typeOptions;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class AWT {
        private AWT() {
        }

        public static long getComponentID(Object obj) {
            if (!GraphicsEnvironment.isHeadless()) {
                Component component = (Component) obj;
                if (!component.isLightweight()) {
                    if (component.isDisplayable()) {
                        if (Platform.isX11() && System.getProperty("java.version").startsWith("1.4") && !component.isVisible()) {
                            i.l("Component must be visible");
                            return 0L;
                        }
                        return Native.getWindowHandle0(component);
                    }
                    i.l("Component must be displayable");
                    return 0L;
                }
                i.k("Component must be heavyweight");
                return 0L;
            }
            throw new HeadlessException("No native windows when headless");
        }

        public static long getWindowID(Window window) {
            return getComponentID(window);
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class Buffers {
        private Buffers() {
        }

        public static boolean isBuffer(Class<?> cls) {
            return Buffer.class.isAssignableFrom(cls);
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public interface ffi_callback {
        void invoke(long j10, long j11, long j12);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004b  */
    static {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.jna.Native.<clinit>():void");
    }

    private Native() {
    }

    private static native long _getDirectBufferPointer(Buffer buffer);

    private static native long _getPointer(long j10);

    private static Map<String, Object> cacheOptions(Class<?> cls, Map<String, ?> map, Object obj) {
        HashMap hashMap = new HashMap(map);
        hashMap.put(_OPTION_ENCLOSING_LIBRARY, cls);
        typeOptions.put(cls, hashMap);
        if (obj != null) {
            libraries.put(cls, new WeakReference(obj));
        }
        if (!cls.isInterface() && Library.class.isAssignableFrom(cls)) {
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (Library.class.isAssignableFrom(cls2)) {
                    cacheOptions(cls2, hashMap, obj);
                    return hashMap;
                }
            }
        }
        return hashMap;
    }

    public static native void close(long j10);

    public static native synchronized long createNativeCallback(Callback callback, Method method, Class<?>[] clsArr, Class<?> cls, int i10, int i11, String str);

    public static boolean deleteLibrary(File file) {
        if (file.delete()) {
            return true;
        }
        markTemporaryFile(file);
        return false;
    }

    public static void detach(boolean z9) {
        Thread currentThread = Thread.currentThread();
        if (z9) {
            nativeThreads.remove(currentThread);
            nativeThreadTerminationFlag.get();
            setDetachState(true, 0L);
        } else {
            Map<Thread, Pointer> map = nativeThreads;
            if (!map.containsKey(currentThread)) {
                Memory memory = nativeThreadTerminationFlag.get();
                map.put(currentThread, memory);
                setDetachState(false, memory.peer);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void dispose() {
        CallbackReference.disposeAll();
        Memory.disposeAll();
        NativeLibrary.disposeAll();
        unregisterAll();
        jnidispatchPath = null;
        System.setProperty("jna.loaded", "false");
    }

    public static File extractFromResourcePath(String str, ClassLoader classLoader) {
        Level level;
        String mapSharedLibraryName;
        String str2;
        File file;
        String str3;
        File createTempFile;
        FileOutputStream fileOutputStream;
        if (!DEBUG_LOAD && (!DEBUG_JNA_LOAD || !str.contains("jnidispatch"))) {
            level = Level.FINE;
        } else {
            level = Level.INFO;
        }
        if (classLoader == null && (classLoader = Thread.currentThread().getContextClassLoader()) == null) {
            classLoader = Native.class.getClassLoader();
        }
        Logger logger = LOG;
        logger.log(level, "Looking in classpath from {0} for {1}", new Object[]{classLoader, str});
        if (str.startsWith("/")) {
            mapSharedLibraryName = str;
        } else {
            mapSharedLibraryName = NativeLibrary.mapSharedLibraryName(str);
        }
        if (str.startsWith("/")) {
            str2 = str;
        } else {
            str2 = Platform.RESOURCE_PREFIX + "/" + mapSharedLibraryName;
        }
        if (str2.startsWith("/")) {
            str2 = str2.substring(1);
        }
        URL resource = classLoader.getResource(str2);
        if (resource == null) {
            String str4 = Platform.RESOURCE_PREFIX;
            if (str2.startsWith(str4)) {
                if (str4.startsWith("darwin")) {
                    resource = classLoader.getResource("darwin/".concat(str2.substring(str4.length() + 1)));
                }
                if (resource == null) {
                    resource = classLoader.getResource(mapSharedLibraryName);
                }
            } else {
                if (str2.startsWith("com/sun/jna/" + str4 + "/")) {
                    if (str4.startsWith("com/sun/jna/darwin")) {
                        resource = classLoader.getResource("com/sun/jna/darwin".concat(str2.substring(("com/sun/jna/" + str4).length() + 1)));
                    }
                    if (resource == null) {
                        resource = classLoader.getResource(mapSharedLibraryName);
                    }
                }
            }
        }
        if (resource == null) {
            String property = System.getProperty("java.class.path");
            if (classLoader instanceof URLClassLoader) {
                property = Arrays.asList(((URLClassLoader) classLoader).getURLs()).toString();
            }
            b.i("Native library (", str2, ") not found in resource path (", property, ")");
            return null;
        }
        logger.log(level, "Found library resource at {0}", resource);
        if (resource.getProtocol().toLowerCase().equals("file")) {
            try {
                file = new File(new URI(resource.toString()));
            } catch (URISyntaxException unused) {
                file = new File(resource.getPath());
            }
            LOG.log(level, "Looking in {0}", file.getAbsolutePath());
            if (!file.exists()) {
                b.u(resource, "File URL ", " could not be properly decoded");
                return null;
            }
            return file;
        }
        FileOutputStream fileOutputStream2 = null;
        if (Boolean.getBoolean("jna.nounpack")) {
            return null;
        }
        InputStream openStream = resource.openStream();
        if (openStream != null) {
            try {
                try {
                    File tempDir = getTempDir();
                    if (Platform.isWindows()) {
                        str3 = ".dll";
                    } else {
                        str3 = null;
                    }
                    createTempFile = File.createTempFile(JNA_TMPLIB_PREFIX, str3, tempDir);
                    if (!Boolean.getBoolean("jnidispatch.preserve")) {
                        createTempFile.deleteOnExit();
                    }
                    logger.log(level, "Extracting library to {0}", createTempFile.getAbsolutePath());
                    fileOutputStream = new FileOutputStream(createTempFile);
                } catch (IOException e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = openStream.read(bArr, 0, 1024);
                    if (read > 0) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        try {
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
                openStream.close();
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                }
                return createTempFile;
            } catch (IOException e6) {
                fileOutputStream2 = fileOutputStream;
                e = e6;
                throw new IOException("Failed to create temporary file for " + str + " library: " + e.getMessage());
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream2 = fileOutputStream;
                try {
                    openStream.close();
                } catch (IOException unused4) {
                }
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                        throw th;
                    } catch (IOException unused5) {
                        throw th;
                    }
                }
                throw th;
            }
        }
        n0.b.A("Can't obtain InputStream for ".concat(str2));
        return null;
    }

    public static native void ffi_call(long j10, long j11, long j12, long j13);

    public static native void ffi_free_closure(long j10);

    public static native long ffi_prep_cif(int i10, int i11, long j10, long j11);

    public static native long ffi_prep_closure(long j10, ffi_callback ffi_callbackVar);

    public static Class<?> findDirectMappedClass(Class<?> cls) {
        for (Method method : cls.getDeclaredMethods()) {
            if ((method.getModifiers() & 256) != 0) {
                return cls;
            }
        }
        int lastIndexOf = cls.getName().lastIndexOf("$");
        if (lastIndexOf != -1) {
            try {
                return findDirectMappedClass(Class.forName(cls.getName().substring(0, lastIndexOf), true, cls.getClassLoader()));
            } catch (ClassNotFoundException unused) {
            }
        }
        b.p(cls, "Can't determine class with native methods from the current context (", ")");
        return null;
    }

    public static Class<?> findEnclosingLibraryClass(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        Map<String, Object> map = typeOptions.get(cls);
        if (map != null) {
            Class<?> cls2 = (Class) map.get(_OPTION_ENCLOSING_LIBRARY);
            if (cls2 != null) {
                return cls2;
            }
        } else if (!Library.class.isAssignableFrom(cls)) {
            if (Callback.class.isAssignableFrom(cls)) {
                cls = CallbackReference.findCallbackClass(cls);
            }
            Class<?> findEnclosingLibraryClass = findEnclosingLibraryClass(cls.getDeclaringClass());
            if (findEnclosingLibraryClass != null) {
                return findEnclosingLibraryClass;
            }
            return findEnclosingLibraryClass(cls.getSuperclass());
        }
        return cls;
    }

    public static native long findSymbol(long j10, String str);

    public static native void free(long j10);

    public static native synchronized void freeNativeCallback(long j10);

    private static NativeMapped fromNative(Method method, Object obj) {
        Class<?> returnType = method.getReturnType();
        return (NativeMapped) NativeMappedConverter.getInstance(returnType).fromNative(obj, new MethodResultContext(returnType, null, null, method));
    }

    private static native String getAPIChecksum();

    public static native byte getByte(Pointer pointer, long j10, long j11);

    public static byte[] getBytes(String str) {
        return getBytes(str, getDefaultStringEncoding());
    }

    public static Callback.UncaughtExceptionHandler getCallbackExceptionHandler() {
        return callbackExceptionHandler;
    }

    public static Class<?> getCallingClass() {
        Class<?>[] classContext = new SecurityManager() { // from class: com.sun.jna.Native.6
            @Override // java.lang.SecurityManager
            public Class<?>[] getClassContext() {
                return super.getClassContext();
            }
        }.getClassContext();
        if (classContext != null) {
            if (classContext.length >= 4) {
                return classContext[3];
            }
            i.l("This method must be called from the static initializer of a class");
            return null;
        }
        i.l("The SecurityManager implementation on this platform is broken; you must explicitly provide the class to register");
        return null;
    }

    public static native char getChar(Pointer pointer, long j10, long j11);

    /* JADX WARN: Removed duplicated region for block: B:5:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.nio.charset.Charset getCharset(java.lang.String r4) {
        /*
            java.lang.String r0 = "JNA Warning: Encoding ''{0}'' is unsupported ({1})"
            if (r4 == 0) goto L2a
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)     // Catch: java.nio.charset.UnsupportedCharsetException -> L9 java.nio.charset.IllegalCharsetNameException -> L1a
            goto L2b
        L9:
            r1 = move-exception
            java.util.logging.Logger r2 = com.sun.jna.Native.LOG
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.String r1 = r1.getMessage()
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r1}
            r2.log(r3, r0, r4)
            goto L2a
        L1a:
            r1 = move-exception
            java.util.logging.Logger r2 = com.sun.jna.Native.LOG
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.String r1 = r1.getMessage()
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r1}
            r2.log(r3, r0, r4)
        L2a:
            r4 = 0
        L2b:
            if (r4 != 0) goto L39
            java.util.logging.Logger r4 = com.sun.jna.Native.LOG
            java.util.logging.Level r0 = java.util.logging.Level.WARNING
            java.nio.charset.Charset r1 = com.sun.jna.Native.DEFAULT_CHARSET
            java.lang.String r2 = "JNA Warning: Using fallback encoding {0}"
            r4.log(r0, r2, r1)
            r4 = r1
        L39:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.jna.Native.getCharset(java.lang.String):java.nio.charset.Charset");
    }

    public static long getComponentID(Component component) {
        return AWT.getComponentID(component);
    }

    public static Pointer getComponentPointer(Component component) {
        return new Pointer(AWT.getComponentID(component));
    }

    private static int getConversion(Class<?> cls, TypeMapper typeMapper, boolean z9) {
        if (cls == Void.class) {
            cls = Void.TYPE;
        }
        if (typeMapper != null) {
            FromNativeConverter fromNativeConverter = typeMapper.getFromNativeConverter(cls);
            ToNativeConverter toNativeConverter = typeMapper.getToNativeConverter(cls);
            if (fromNativeConverter != null) {
                Class<?> nativeType = fromNativeConverter.nativeType();
                if (nativeType == String.class) {
                    return 24;
                }
                if (nativeType != WString.class) {
                    return 23;
                }
                return 25;
            }
            if (toNativeConverter != null) {
                Class<?> nativeType2 = toNativeConverter.nativeType();
                if (nativeType2 == String.class) {
                    return 24;
                }
                if (nativeType2 != WString.class) {
                    return 23;
                }
                return 25;
            }
        }
        if (Pointer.class.isAssignableFrom(cls)) {
            return 1;
        }
        if (String.class == cls) {
            return 2;
        }
        if (WString.class.isAssignableFrom(cls)) {
            return 20;
        }
        if (Platform.HAS_BUFFERS && Buffers.isBuffer(cls)) {
            return 5;
        }
        if (Structure.class.isAssignableFrom(cls)) {
            if (Structure.ByValue.class.isAssignableFrom(cls)) {
                return 4;
            }
            return 3;
        }
        if (cls.isArray()) {
            char charAt = cls.getName().charAt(1);
            if (charAt != 'F') {
                if (charAt != 'S') {
                    if (charAt != 'Z') {
                        if (charAt != 'I') {
                            if (charAt != 'J') {
                                switch (charAt) {
                                    case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                                        return 6;
                                    case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                                        return 8;
                                    case 'D':
                                        return 12;
                                }
                            }
                            return 10;
                        }
                        return 9;
                    }
                    return 13;
                }
                return 7;
            }
            return 11;
        }
        if (cls.isPrimitive()) {
            if (cls == Boolean.TYPE) {
                return 14;
            }
            return 0;
        }
        if (Callback.class.isAssignableFrom(cls)) {
            return 15;
        }
        if (IntegerType.class.isAssignableFrom(cls)) {
            return 21;
        }
        if (PointerType.class.isAssignableFrom(cls)) {
            return 22;
        }
        if (NativeMapped.class.isAssignableFrom(cls)) {
            Class<?> nativeType3 = NativeMappedConverter.getInstance(cls).nativeType();
            if (nativeType3 == String.class) {
                return 18;
            }
            if (nativeType3 == WString.class) {
                return 19;
            }
            return 17;
        }
        if (JNIEnv.class == cls) {
            return 27;
        }
        if (z9) {
            return 26;
        }
        return -1;
    }

    public static String getDefaultStringEncoding() {
        return System.getProperty("jna.encoding", DEFAULT_ENCODING);
    }

    public static Pointer getDirectBufferPointer(Buffer buffer) {
        long _getDirectBufferPointer = _getDirectBufferPointer(buffer);
        if (_getDirectBufferPointer == 0) {
            return null;
        }
        return new Pointer(_getDirectBufferPointer);
    }

    public static native ByteBuffer getDirectByteBuffer(Pointer pointer, long j10, long j11, long j12);

    public static native double getDouble(Pointer pointer, long j10, long j11);

    public static native float getFloat(Pointer pointer, long j10, long j11);

    public static native int getInt(Pointer pointer, long j10, long j11);

    public static native int getLastError();

    public static Map<String, Object> getLibraryOptions(Class<?> cls) {
        Map map;
        Map<Class<?>, Map<String, Object>> map2 = typeOptions;
        Map<String, Object> map3 = map2.get(cls);
        if (map3 != null) {
            return map3;
        }
        Class<?> findEnclosingLibraryClass = findEnclosingLibraryClass(cls);
        if (findEnclosingLibraryClass != null) {
            loadLibraryInstance(findEnclosingLibraryClass);
        } else {
            findEnclosingLibraryClass = cls;
        }
        Map<String, Object> map4 = map2.get(findEnclosingLibraryClass);
        if (map4 != null) {
            map2.put(cls, map4);
            return map4;
        }
        try {
            Field field = findEnclosingLibraryClass.getField("OPTIONS");
            field.setAccessible(true);
            map = (Map) field.get(null);
        } catch (NoSuchFieldException unused) {
            map = Collections.EMPTY_MAP;
        } catch (Exception e) {
            b.v("OPTIONS must be a public field of type java.util.Map (", e, "): ", findEnclosingLibraryClass);
            return null;
        }
        if (map == null) {
            throw new IllegalStateException("Null options field");
        }
        HashMap hashMap = new HashMap(map);
        if (!hashMap.containsKey(Library.OPTION_TYPE_MAPPER)) {
            hashMap.put(Library.OPTION_TYPE_MAPPER, lookupField(findEnclosingLibraryClass, "TYPE_MAPPER", TypeMapper.class));
        }
        if (!hashMap.containsKey(Library.OPTION_STRUCTURE_ALIGNMENT)) {
            hashMap.put(Library.OPTION_STRUCTURE_ALIGNMENT, lookupField(findEnclosingLibraryClass, "STRUCTURE_ALIGNMENT", Integer.class));
        }
        if (!hashMap.containsKey(Library.OPTION_STRING_ENCODING)) {
            hashMap.put(Library.OPTION_STRING_ENCODING, lookupField(findEnclosingLibraryClass, "STRING_ENCODING", String.class));
        }
        Map<String, Object> cacheOptions = cacheOptions(findEnclosingLibraryClass, hashMap, null);
        if (cls != findEnclosingLibraryClass) {
            typeOptions.put(cls, cacheOptions);
        }
        return cacheOptions;
    }

    public static native long getLong(Pointer pointer, long j10, long j11);

    public static int getNativeSize(Class<?> cls) {
        if (NativeMapped.class.isAssignableFrom(cls)) {
            cls = NativeMappedConverter.getInstance(cls).nativeType();
        }
        if (cls == Boolean.TYPE || cls == Boolean.class) {
            return 4;
        }
        if (cls != Byte.TYPE && cls != Byte.class) {
            if (cls != Short.TYPE && cls != Short.class) {
                if (cls != Character.TYPE && cls != Character.class) {
                    if (cls == Integer.TYPE || cls == Integer.class) {
                        return 4;
                    }
                    if (cls == Long.TYPE || cls == Long.class) {
                        return 8;
                    }
                    if (cls == Float.TYPE || cls == Float.class) {
                        return 4;
                    }
                    if (cls == Double.TYPE || cls == Double.class) {
                        return 8;
                    }
                    if (Structure.class.isAssignableFrom(cls)) {
                        if (Structure.ByValue.class.isAssignableFrom(cls)) {
                            return Structure.size(cls);
                        }
                        return POINTER_SIZE;
                    }
                    if (!Pointer.class.isAssignableFrom(cls) && ((!Platform.HAS_BUFFERS || !Buffers.isBuffer(cls)) && !Callback.class.isAssignableFrom(cls) && String.class != cls && WString.class != cls)) {
                        b.x(cls.getName(), "Native size for type \"", "\" is unknown");
                        return 0;
                    }
                    return POINTER_SIZE;
                }
                return WCHAR_SIZE;
            }
            return 2;
        }
        return 1;
    }

    private static native String getNativeVersion();

    public static Pointer getPointer(long j10) {
        long _getPointer = _getPointer(j10);
        if (_getPointer == 0) {
            return null;
        }
        return new Pointer(_getPointer);
    }

    public static native short getShort(Pointer pointer, long j10, long j11);

    public static String getSignature(Class<?> cls) {
        if (cls.isArray()) {
            return "[" + getSignature(cls.getComponentType());
        }
        if (cls.isPrimitive()) {
            if (cls == Void.TYPE) {
                return ExifInterface.GPS_MEASUREMENT_INTERRUPTED;
            }
            if (cls == Boolean.TYPE) {
                return "Z";
            }
            if (cls == Byte.TYPE) {
                return "B";
            }
            if (cls == Short.TYPE) {
                return ExifInterface.LATITUDE_SOUTH;
            }
            if (cls == Character.TYPE) {
                return "C";
            }
            if (cls == Integer.TYPE) {
                return "I";
            }
            if (cls == Long.TYPE) {
                return "J";
            }
            if (cls == Float.TYPE) {
                return "F";
            }
            if (cls == Double.TYPE) {
                return "D";
            }
        }
        return "L" + replace(".", "/", cls.getName()) + ";";
    }

    public static String getString(Pointer pointer, long j10, String str) {
        byte[] stringBytes = getStringBytes(pointer, pointer.peer, j10);
        if (str != null) {
            try {
                return new String(stringBytes, str);
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return new String(stringBytes);
    }

    public static native byte[] getStringBytes(Pointer pointer, long j10, long j11);

    public static String getStringEncoding(Class<?> cls) {
        String str = (String) getLibraryOptions(cls).get(Library.OPTION_STRING_ENCODING);
        if (str != null) {
            return str;
        }
        return getDefaultStringEncoding();
    }

    public static int getStructureAlignment(Class<?> cls) {
        Integer num = (Integer) getLibraryOptions(cls).get(Library.OPTION_STRUCTURE_ALIGNMENT);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static File getTempDir() {
        File file;
        File file2;
        File file3;
        String property = System.getProperty("jna.tmpdir");
        if (property != null) {
            file = new File(property);
            file.mkdirs();
        } else {
            file = new File(System.getProperty("java.io.tmpdir"));
            if (Platform.isMac()) {
                file3 = new File(System.getProperty("user.home"), "Library/Caches/JNA/temp");
            } else if (!Platform.isLinux() && !Platform.isSolaris() && !Platform.isAIX() && !Platform.isFreeBSD() && !Platform.isNetBSD() && !Platform.isOpenBSD() && !Platform.iskFreeBSD()) {
                file3 = new File(file, "jna-" + System.getProperty("user.name").hashCode());
            } else {
                String str = System.getenv("XDG_CACHE_HOME");
                if (str != null && !str.trim().isEmpty()) {
                    file2 = new File(str);
                } else {
                    file2 = new File(System.getProperty("user.home"), ".cache");
                }
                file3 = new File(file2, "JNA/temp");
            }
            file3.mkdirs();
            if (file3.exists() && file3.canWrite()) {
                file = file3;
            }
        }
        if (file.exists()) {
            if (file.canWrite()) {
                return file;
            }
            b.u(file, "JNA temporary directory '", "' is not writable");
            return null;
        }
        b.u(file, "JNA temporary directory '", "' does not exist");
        return null;
    }

    public static Pointer getTerminationFlag(Thread thread) {
        return nativeThreads.get(thread);
    }

    public static TypeMapper getTypeMapper(Class<?> cls) {
        return (TypeMapper) getLibraryOptions(cls).get(Library.OPTION_TYPE_MAPPER);
    }

    public static String getWebStartLibraryPath(String str) {
        if (System.getProperty("javawebstart.version") == null) {
            return null;
        }
        try {
            String str2 = (String) ((Method) AccessController.doPrivileged(new PrivilegedAction<Method>() { // from class: com.sun.jna.Native.4
                @Override // java.security.PrivilegedAction
                public Method run() {
                    try {
                        Method declaredMethod = ClassLoader.class.getDeclaredMethod("findLibrary", String.class);
                        declaredMethod.setAccessible(true);
                        return declaredMethod;
                    } catch (Exception unused) {
                        return null;
                    }
                }
            })).invoke(Native.class.getClassLoader(), str);
            if (str2 != null) {
                return new File(str2).getParent();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static native String getWideString(Pointer pointer, long j10, long j11);

    public static native long getWindowHandle0(Component component);

    public static long getWindowID(Window window) {
        return AWT.getWindowID(window);
    }

    public static Pointer getWindowPointer(Window window) {
        return new Pointer(AWT.getWindowID(window));
    }

    public static native long indexOf(Pointer pointer, long j10, long j11, byte b10);

    private static native void initIDs();

    public static native int initialize_ffi_type(long j10);

    public static native double invokeDouble(Function function, long j10, int i10, Object[] objArr);

    public static native float invokeFloat(Function function, long j10, int i10, Object[] objArr);

    public static native int invokeInt(Function function, long j10, int i10, Object[] objArr);

    public static native long invokeLong(Function function, long j10, int i10, Object[] objArr);

    public static native Object invokeObject(Function function, long j10, int i10, Object[] objArr);

    public static native long invokePointer(Function function, long j10, int i10, Object[] objArr);

    public static Structure invokeStructure(Function function, long j10, int i10, Object[] objArr, Structure structure) {
        invokeStructure(function, j10, i10, objArr, structure.getPointer().peer, structure.getTypeInfo().peer);
        return structure;
    }

    private static native void invokeStructure(Function function, long j10, int i10, Object[] objArr, long j11, long j12);

    public static native void invokeVoid(Function function, long j10, int i10, Object[] objArr);

    public static boolean isCompatibleVersion(String str, String str2) {
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        if (split.length < 3 || split2.length < 3) {
            return false;
        }
        int parseInt = Integer.parseInt(split[0]);
        int parseInt2 = Integer.parseInt(split2[0]);
        int parseInt3 = Integer.parseInt(split[1]);
        int parseInt4 = Integer.parseInt(split2[1]);
        if (parseInt != parseInt2 || parseInt3 > parseInt4) {
            return false;
        }
        return true;
    }

    public static native synchronized boolean isProtected();

    public static boolean isSupportedNativeType(Class<?> cls) {
        if (Structure.class.isAssignableFrom(cls)) {
            return true;
        }
        if (getNativeSize(cls) != 0) {
            return true;
        }
        return false;
    }

    public static boolean isUnpacked(File file) {
        return file.getName().startsWith(JNA_TMPLIB_PREFIX);
    }

    public static <T extends Library> T load(String str, Class<T> cls, Map<String, ?> map) {
        if (Library.class.isAssignableFrom(cls)) {
            Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new Library.Handler(str, cls, map));
            cacheOptions(cls, map, newProxyInstance);
            return cls.cast(newProxyInstance);
        }
        b.w("Interface (", cls.getSimpleName(), ") of library=", str, " does not extend Library");
        return null;
    }

    @Deprecated
    public static <T> T loadLibrary(String str, Class<T> cls, Map<String, ?> map) {
        if (Library.class.isAssignableFrom(cls)) {
            Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new Library.Handler(str, cls, map));
            cacheOptions(cls, map, newProxyInstance);
            return cls.cast(newProxyInstance);
        }
        b.w("Interface (", cls.getSimpleName(), ") of library=", str, " does not extend Library");
        return null;
    }

    private static void loadLibraryInstance(Class<?> cls) {
        if (cls != null && !libraries.containsKey(cls)) {
            try {
                for (Field field : cls.getFields()) {
                    if (field.getType() == cls && Modifier.isStatic(field.getModifiers())) {
                        field.setAccessible(true);
                        libraries.put(cls, new WeakReference(field.get(null)));
                        return;
                    }
                }
            } catch (Exception e) {
                b.r("Could not access instance of ", cls, " (", e, ")");
            }
        }
    }

    private static void loadNativeDispatchLibrary() {
        if (!Boolean.getBoolean("jna.nounpack")) {
            try {
                removeTemporaryFiles();
            } catch (IOException e) {
                LOG.log(Level.WARNING, "JNA Warning: IOException removing temporary files", (Throwable) e);
            }
        }
        String property = System.getProperty("jna.boot.library.name", "jnidispatch");
        String property2 = System.getProperty("jna.boot.library.path");
        if (property2 != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property2, File.pathSeparator);
            while (stringTokenizer.hasMoreTokens()) {
                File file = new File(new File(stringTokenizer.nextToken()), System.mapLibraryName(property).replace(".dylib", ".jnilib"));
                String absolutePath = file.getAbsolutePath();
                Logger logger = LOG;
                Level level = DEBUG_JNA_LOAD_LEVEL;
                logger.log(level, "Looking in {0}", absolutePath);
                if (file.exists()) {
                    try {
                        logger.log(level, "Trying {0}", absolutePath);
                        System.setProperty("jnidispatch.path", absolutePath);
                        System.load(absolutePath);
                        jnidispatchPath = absolutePath;
                        logger.log(level, "Found jnidispatch at {0}", absolutePath);
                        return;
                    } catch (UnsatisfiedLinkError unused) {
                    }
                }
                if (Platform.isMac()) {
                    String str = "dylib";
                    String str2 = "jnilib";
                    if (!absolutePath.endsWith("dylib")) {
                        str2 = "dylib";
                        str = "jnilib";
                    }
                    String concat = absolutePath.substring(0, absolutePath.lastIndexOf(str)).concat(str2);
                    Logger logger2 = LOG;
                    Level level2 = DEBUG_JNA_LOAD_LEVEL;
                    logger2.log(level2, "Looking in {0}", concat);
                    if (new File(concat).exists()) {
                        try {
                            logger2.log(level2, "Trying {0}", concat);
                            System.setProperty("jnidispatch.path", concat);
                            System.load(concat);
                            jnidispatchPath = concat;
                            logger2.log(level2, "Found jnidispatch at {0}", concat);
                            return;
                        } catch (UnsatisfiedLinkError e6) {
                            Logger logger3 = LOG;
                            Level level3 = Level.WARNING;
                            StringBuilder x9 = a.x("File found at ", concat, " but not loadable: ");
                            x9.append(e6.getMessage());
                            logger3.log(level3, x9.toString(), (Throwable) e6);
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        if (!Boolean.parseBoolean(System.getProperty("jna.nosys", "true")) || Platform.isAndroid()) {
            try {
                Logger logger4 = LOG;
                Level level4 = DEBUG_JNA_LOAD_LEVEL;
                logger4.log(level4, "Trying (via loadLibrary) {0}", property);
                System.loadLibrary(property);
                logger4.log(level4, "Found jnidispatch on system path");
                return;
            } catch (UnsatisfiedLinkError unused2) {
            }
        }
        if (!Boolean.getBoolean("jna.noclasspath")) {
            loadNativeDispatchLibraryFromClasspath();
            return;
        }
        throw new UnsatisfiedLinkError("Unable to locate JNA native support library");
    }

    private static void loadNativeDispatchLibraryFromClasspath() {
        try {
            String replace = System.mapLibraryName("jnidispatch").replace(".dylib", ".jnilib");
            if (Platform.isAIX()) {
                replace = "libjnidispatch.a";
            }
            File extractFromResourcePath = extractFromResourcePath("/com/sun/jna/" + Platform.RESOURCE_PREFIX + "/" + replace, Native.class.getClassLoader());
            if (extractFromResourcePath == null && extractFromResourcePath == null) {
                throw new UnsatisfiedLinkError("Could not find JNA native support");
            }
            Logger logger = LOG;
            Level level = DEBUG_JNA_LOAD_LEVEL;
            logger.log(level, "Trying {0}", extractFromResourcePath.getAbsolutePath());
            System.setProperty("jnidispatch.path", extractFromResourcePath.getAbsolutePath());
            System.load(extractFromResourcePath.getAbsolutePath());
            String absolutePath = extractFromResourcePath.getAbsolutePath();
            jnidispatchPath = absolutePath;
            logger.log(level, "Found jnidispatch at {0}", absolutePath);
            if (isUnpacked(extractFromResourcePath) && !Boolean.getBoolean("jnidispatch.preserve")) {
                deleteLibrary(extractFromResourcePath);
            }
        } catch (IOException e) {
            throw new UnsatisfiedLinkError(e.getMessage());
        }
    }

    private static Object lookupField(Class<?> cls, String str, Class<?> cls2) {
        try {
            Field field = cls.getField(str);
            field.setAccessible(true);
            return field.get(null);
        } catch (NoSuchFieldException unused) {
            return null;
        } catch (Exception e) {
            b.m(a.w(str, " must be a public field of type "), cls2.getName(), " (", e, "): ", cls);
            return null;
        }
    }

    public static void main(String[] strArr) {
        String str;
        String str2;
        String str3;
        Package r32 = Native.class.getPackage();
        String str4 = "Java Native Access (JNA)";
        if (r32 == null) {
            str = "Java Native Access (JNA)";
        } else {
            str = r32.getSpecificationTitle();
        }
        if (str != null) {
            str4 = str;
        }
        String str5 = Version.VERSION;
        if (r32 != null) {
            str2 = r32.getSpecificationVersion();
        } else {
            str2 = Version.VERSION;
        }
        if (str2 != null) {
            str5 = str2;
        }
        System.out.println(a.D(str4, " API Version ", str5));
        String str6 = "5.13.0 (package information missing)";
        if (r32 == null) {
            str3 = "5.13.0 (package information missing)";
        } else {
            str3 = r32.getImplementationVersion();
        }
        if (str3 != null) {
            str6 = str3;
        }
        System.out.println("Version: ".concat(str6));
        System.out.println(" Native: " + getNativeVersion() + " (" + getAPIChecksum() + ")");
        PrintStream printStream = System.out;
        StringBuilder sb = new StringBuilder(" Prefix: ");
        sb.append(Platform.RESOURCE_PREFIX);
        printStream.println(sb.toString());
    }

    public static native long malloc(long j10);

    public static void markTemporaryFile(File file) {
        try {
            new File(file.getParentFile(), file.getName() + ".x").createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Class<?> nativeType(Class<?> cls) {
        return NativeMappedConverter.getInstance(cls).nativeType();
    }

    public static long open(String str) {
        return open(str, -1);
    }

    public static native long open(String str, int i10);

    public static native void read(Pointer pointer, long j10, long j11, byte[] bArr, int i10, int i11);

    public static native void read(Pointer pointer, long j10, long j11, char[] cArr, int i10, int i11);

    public static native void read(Pointer pointer, long j10, long j11, double[] dArr, int i10, int i11);

    public static native void read(Pointer pointer, long j10, long j11, float[] fArr, int i10, int i11);

    public static native void read(Pointer pointer, long j10, long j11, int[] iArr, int i10, int i11);

    public static native void read(Pointer pointer, long j10, long j11, long[] jArr, int i10, int i11);

    public static native void read(Pointer pointer, long j10, long j11, short[] sArr, int i10, int i11);

    /* JADX WARN: Can't wrap try/catch for region: R(18:14|(4:(18:(16:17|22|(3:25|(4:27|(1:59)(2:35|(1:58))|(4:42|(1:44)|54|55)(2:56|57)|48)(3:60|61|62)|23)|64|65|(2:66|(2:68|(2:71|72)(1:70))(2:91|92))|73|74|75|76|77|78|79|80|81|82)(1:100)|99|21|22|(1:23)|64|65|(3:66|(0)(0)|70)|73|74|75|76|77|78|79|80|81|82)|80|81|82)|101|102|20|21|22|(1:23)|64|65|(3:66|(0)(0)|70)|73|74|75|76|77|78|79) */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0265, code lost:
    
        r4 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0267, code lost:
    
        r4 = r30;
        r5 = r1;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x007a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0220 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void register(java.lang.Class<?> r30, com.sun.jna.NativeLibrary r31) {
        /*
            Method dump skipped, instructions count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.jna.Native.register(java.lang.Class, com.sun.jna.NativeLibrary):void");
    }

    private static native long registerMethod(Class<?> cls, String str, String str2, int[] iArr, long[] jArr, long[] jArr2, int i10, long j10, long j11, Method method, long j12, int i11, boolean z9, ToNativeConverter[] toNativeConverterArr, FromNativeConverter fromNativeConverter, String str3);

    public static boolean registered(Class<?> cls) {
        boolean containsKey;
        Map<Class<?>, long[]> map = registeredClasses;
        synchronized (map) {
            containsKey = map.containsKey(cls);
        }
        return containsKey;
    }

    public static void removeTemporaryFiles() {
        File[] listFiles = getTempDir().listFiles(new FilenameFilter() { // from class: com.sun.jna.Native.5
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                if (str.endsWith(".x") && str.startsWith(Native.JNA_TMPLIB_PREFIX)) {
                    return true;
                }
                return false;
            }
        });
        for (int i10 = 0; listFiles != null && i10 < listFiles.length; i10++) {
            File file = listFiles[i10];
            File file2 = new File(file.getParentFile(), file.getName().substring(0, r4.length() - 2));
            if (!file2.exists() || file2.delete()) {
                file.delete();
            }
        }
    }

    public static String replace(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            int indexOf = str3.indexOf(str);
            if (indexOf == -1) {
                sb.append(str3);
                return sb.toString();
            }
            sb.append(str3.substring(0, indexOf));
            sb.append(str2);
            str3 = str3.substring(str.length() + indexOf);
        }
    }

    public static native void setByte(Pointer pointer, long j10, long j11, byte b10);

    public static void setCallbackExceptionHandler(Callback.UncaughtExceptionHandler uncaughtExceptionHandler) {
        if (uncaughtExceptionHandler == null) {
            uncaughtExceptionHandler = DEFAULT_HANDLER;
        }
        callbackExceptionHandler = uncaughtExceptionHandler;
    }

    public static void setCallbackThreadInitializer(Callback callback, CallbackThreadInitializer callbackThreadInitializer) {
        CallbackReference.setCallbackThreadInitializer(callback, callbackThreadInitializer);
    }

    public static native void setChar(Pointer pointer, long j10, long j11, char c);

    private static native void setDetachState(boolean z9, long j10);

    public static native void setDouble(Pointer pointer, long j10, long j11, double d);

    public static native void setFloat(Pointer pointer, long j10, long j11, float f8);

    public static native void setInt(Pointer pointer, long j10, long j11, int i10);

    public static native void setLastError(int i10);

    public static native void setLong(Pointer pointer, long j10, long j11, long j12);

    public static native void setMemory(Pointer pointer, long j10, long j11, long j12, byte b10);

    public static native void setPointer(Pointer pointer, long j10, long j11, long j12);

    public static native synchronized void setProtected(boolean z9);

    public static native void setShort(Pointer pointer, long j10, long j11, short s5);

    public static native void setWideString(Pointer pointer, long j10, long j11, String str);

    private static native int sizeof(int i10);

    public static Library synchronizedLibrary(final Library library) {
        Class<?> cls = library.getClass();
        if (Proxy.isProxyClass(cls)) {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(library);
            if (invocationHandler instanceof Library.Handler) {
                final Library.Handler handler = (Library.Handler) invocationHandler;
                return (Library) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), new InvocationHandler() { // from class: com.sun.jna.Native.3
                    @Override // java.lang.reflect.InvocationHandler
                    public Object invoke(Object obj, Method method, Object[] objArr) {
                        Object invoke;
                        synchronized (Library.Handler.this.getNativeLibrary()) {
                            invoke = Library.Handler.this.invoke(library, method, objArr);
                        }
                        return invoke;
                    }
                });
            }
            b.t(invocationHandler, "Unrecognized proxy handler: ");
            return null;
        }
        i.k("Library must be a proxy class");
        return null;
    }

    public static byte[] toByteArray(String str, Charset charset) {
        byte[] bytes = getBytes(str, charset);
        byte[] bArr = new byte[bytes.length + 1];
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        return bArr;
    }

    public static char[] toCharArray(String str) {
        char[] charArray = str.toCharArray();
        char[] cArr = new char[charArray.length + 1];
        System.arraycopy(charArray, 0, cArr, 0, charArray.length);
        return cArr;
    }

    private static Object toNative(ToNativeConverter toNativeConverter, Object obj) {
        return toNativeConverter.toNative(obj, new ToNativeContext());
    }

    public static String toString(byte[] bArr, Charset charset) {
        int length = bArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if (bArr[i10] == 0) {
                length = i10;
                break;
            }
            i10++;
        }
        if (length == 0) {
            return "";
        }
        return new String(bArr, 0, length, charset);
    }

    public static List<String> toStringList(char[] cArr, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        int i12 = i11 + i10;
        int i13 = i10;
        while (true) {
            if (i10 < i12) {
                if (cArr[i10] == 0) {
                    if (i13 == i10) {
                        break;
                    }
                    arrayList.add(new String(cArr, i13, i10 - i13));
                    i13 = i10 + 1;
                }
                i10++;
            } else if (i13 < i12) {
                arrayList.add(new String(cArr, i13, i12 - i13));
            }
        }
        return arrayList;
    }

    public static void unregister(Class<?> cls) {
        Map<Class<?>, long[]> map = registeredClasses;
        synchronized (map) {
            try {
                long[] jArr = map.get(cls);
                if (jArr != null) {
                    unregister(cls, jArr);
                    map.remove(cls);
                    registeredLibraries.remove(cls);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static native void unregister(Class<?> cls, long[] jArr);

    private static void unregisterAll() {
        Map<Class<?>, long[]> map = registeredClasses;
        synchronized (map) {
            try {
                for (Map.Entry<Class<?>, long[]> entry : map.entrySet()) {
                    unregister(entry.getKey(), entry.getValue());
                }
                registeredClasses.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static native void write(Pointer pointer, long j10, long j11, byte[] bArr, int i10, int i11);

    public static native void write(Pointer pointer, long j10, long j11, char[] cArr, int i10, int i11);

    public static native void write(Pointer pointer, long j10, long j11, double[] dArr, int i10, int i11);

    public static native void write(Pointer pointer, long j10, long j11, float[] fArr, int i10, int i11);

    public static native void write(Pointer pointer, long j10, long j11, int[] iArr, int i10, int i11);

    public static native void write(Pointer pointer, long j10, long j11, long[] jArr, int i10, int i11);

    public static native void write(Pointer pointer, long j10, long j11, short[] sArr, int i10, int i11);

    public static byte[] getBytes(String str, String str2) {
        return getBytes(str, getCharset(str2));
    }

    public static byte[] getBytes(String str, Charset charset) {
        return str.getBytes(charset);
    }

    public static byte[] toByteArray(String str, String str2) {
        return toByteArray(str, getCharset(str2));
    }

    public static byte[] toByteArray(String str) {
        return toByteArray(str, getDefaultStringEncoding());
    }

    public static String getString(Pointer pointer, long j10) {
        return getString(pointer, j10, getDefaultStringEncoding());
    }

    private static NativeMapped fromNative(Class<?> cls, Object obj) {
        return (NativeMapped) NativeMappedConverter.getInstance(cls).fromNative(obj, new FromNativeContext(cls));
    }

    private static Object fromNative(FromNativeConverter fromNativeConverter, Object obj, Method method) {
        return fromNativeConverter.fromNative(obj, new MethodResultContext(method.getReturnType(), null, null, method));
    }

    public static String toString(byte[] bArr, String str) {
        return toString(bArr, getCharset(str));
    }

    public static String toString(byte[] bArr) {
        return toString(bArr, getDefaultStringEncoding());
    }

    public static String toString(char[] cArr) {
        int length = cArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if (cArr[i10] == 0) {
                length = i10;
                break;
            }
            i10++;
        }
        if (length == 0) {
            return "";
        }
        return new String(cArr, 0, length);
    }

    public static void unregister() {
        unregister(findDirectMappedClass(getCallingClass()));
    }

    public static List<String> toStringList(char[] cArr) {
        return toStringList(cArr, 0, cArr.length);
    }

    @Deprecated
    public static <T> T loadLibrary(Class<T> cls, Map<String, ?> map) {
        return (T) loadLibrary(null, cls, map);
    }

    @Deprecated
    public static <T> T loadLibrary(String str, Class<T> cls) {
        return (T) loadLibrary(str, cls, Collections.EMPTY_MAP);
    }

    public static <T extends Library> T load(Class<T> cls, Map<String, ?> map) {
        return (T) load(null, cls, map);
    }

    @Deprecated
    public static <T> T loadLibrary(Class<T> cls) {
        return (T) loadLibrary((String) null, cls);
    }

    public static <T extends Library> T load(String str, Class<T> cls) {
        return (T) load(str, cls, Collections.EMPTY_MAP);
    }

    public static <T extends Library> T load(Class<T> cls) {
        return (T) load((String) null, cls);
    }

    public static int getNativeSize(Class<?> cls, Object obj) {
        if (cls.isArray()) {
            int length = Array.getLength(obj);
            if (length > 0) {
                return getNativeSize(cls.getComponentType(), Array.get(obj, 0)) * length;
            }
            i.k(a.j(cls, "Arrays of length zero not allowed: "));
            return 0;
        }
        if (Structure.class.isAssignableFrom(cls) && !Structure.ByReference.class.isAssignableFrom(cls)) {
            return Structure.size(cls, (Structure) obj);
        }
        try {
            return getNativeSize(cls);
        } catch (IllegalArgumentException e) {
            b.y("The type \"", cls.getName(), "\" is not supported: ", e.getMessage());
            return 0;
        }
    }

    public static File extractFromResourcePath(String str) {
        return extractFromResourcePath(str, null);
    }

    public static void register(NativeLibrary nativeLibrary) {
        register(findDirectMappedClass(getCallingClass()), nativeLibrary);
    }

    public static void register(Class<?> cls, String str) {
        register(cls, NativeLibrary.getInstance(str, (Map<String, ?>) Collections.singletonMap(Library.OPTION_CLASSLOADER, cls.getClassLoader())));
    }

    public static void register(String str) {
        register(findDirectMappedClass(getCallingClass()), str);
    }
}
