package com.sun.jna;

import ai.onnxruntime.a;
import ai.onnxruntime.b;
import com.sun.jna.internal.Cleaner;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class NativeLibrary implements Closeable {
    private static final Level DEBUG_LOAD_LEVEL;
    private static final int DEFAULT_OPEN_OPTIONS = -1;
    private static final Logger LOG = Logger.getLogger(NativeLibrary.class.getName());
    private static final SymbolProvider NATIVE_SYMBOL_PROVIDER;
    private static Method addSuppressedMethod;
    private static final Map<String, Reference<NativeLibrary>> libraries;
    private static final LinkedHashSet<String> librarySearchPath;
    private static final Map<String, List<String>> searchPaths;
    final int callFlags;
    private Cleaner.Cleanable cleanable;
    private String encoding;
    private final Map<String, Function> functions;
    private long handle;
    private final String libraryName;
    private final String libraryPath;
    final Map<String, ?> options;
    private final SymbolProvider symbolProvider;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static final class NativeLibraryDisposer implements Runnable {
        private long handle;

        public NativeLibraryDisposer(long j10) {
            this.handle = j10;
        }

        @Override // java.lang.Runnable
        public synchronized void run() {
            try {
                long j10 = this.handle;
                if (j10 != 0) {
                    try {
                        Native.close(j10);
                        this.handle = 0L;
                    } catch (Throwable th) {
                        this.handle = 0L;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static {
        Level level;
        String str;
        String sb;
        if (Native.DEBUG_LOAD) {
            level = Level.INFO;
        } else {
            level = Level.FINE;
        }
        DEBUG_LOAD_LEVEL = level;
        NATIVE_SYMBOL_PROVIDER = new SymbolProvider() { // from class: com.sun.jna.NativeLibrary.1
            @Override // com.sun.jna.SymbolProvider
            public long getSymbolAddress(long j10, String str2, SymbolProvider symbolProvider) {
                return Native.findSymbol(j10, str2);
            }
        };
        libraries = new HashMap();
        searchPaths = new ConcurrentHashMap();
        librarySearchPath = new LinkedHashSet<>();
        if (Native.POINTER_SIZE != 0) {
            addSuppressedMethod = null;
            try {
                addSuppressedMethod = Throwable.class.getMethod("addSuppressed", Throwable.class);
            } catch (NoSuchMethodException unused) {
            } catch (SecurityException e) {
                Logger.getLogger(NativeLibrary.class.getName()).log(Level.SEVERE, "Failed to initialize 'addSuppressed' method", (Throwable) e);
            }
            String webStartLibraryPath = Native.getWebStartLibraryPath("jnidispatch");
            if (webStartLibraryPath != null) {
                librarySearchPath.add(webStartLibraryPath);
            }
            if (System.getProperty("jna.platform.library.path") == null && !Platform.isWindows()) {
                if (!Platform.isLinux() && !Platform.isSolaris() && !Platform.isFreeBSD() && !Platform.iskFreeBSD()) {
                    sb = "";
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    if (!Platform.isSolaris()) {
                        str = "";
                    } else {
                        str = "/";
                    }
                    sb2.append(str);
                    sb2.append(Native.POINTER_SIZE * 8);
                    sb = sb2.toString();
                }
                String[] strArr = {"/usr/lib".concat(sb), "/lib".concat(sb), "/usr/lib", "/lib"};
                if (Platform.isLinux() || Platform.iskFreeBSD() || Platform.isGNU()) {
                    String multiArchPath = getMultiArchPath();
                    strArr = new String[]{a.l("/usr/lib/", multiArchPath), a.l("/lib/", multiArchPath), "/usr/lib".concat(sb), "/lib".concat(sb), "/usr/lib", "/lib"};
                }
                if (Platform.isLinux()) {
                    ArrayList<String> linuxLdPaths = getLinuxLdPaths();
                    for (int length = strArr.length - 1; length >= 0; length--) {
                        int indexOf = linuxLdPaths.indexOf(strArr[length]);
                        if (indexOf != -1) {
                            linuxLdPaths.remove(indexOf);
                        }
                        linuxLdPaths.add(0, strArr[length]);
                    }
                    strArr = (String[]) linuxLdPaths.toArray(new String[0]);
                }
                String str2 = "";
                String str3 = str2;
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    File file = new File(strArr[i10]);
                    if (file.exists() && file.isDirectory()) {
                        StringBuilder w = a.w(str2, str3);
                        w.append(strArr[i10]);
                        str2 = w.toString();
                        str3 = File.pathSeparator;
                    }
                }
                if (!"".equals(str2)) {
                    System.setProperty("jna.platform.library.path", str2);
                }
            }
            librarySearchPath.addAll(initPaths("jna.platform.library.path"));
            return;
        }
        throw new Error("Native library not initialized");
    }

    private NativeLibrary(String str, String str2, long j10, Map<String, ?> map) {
        int i10;
        HashMap hashMap = new HashMap();
        this.functions = hashMap;
        String libraryName = getLibraryName(str);
        this.libraryName = libraryName;
        this.libraryPath = str2;
        this.handle = j10;
        this.cleanable = Cleaner.getCleaner().register(this, new NativeLibraryDisposer(j10));
        Object obj = map.get(Library.OPTION_CALLING_CONVENTION);
        if (obj instanceof Number) {
            i10 = ((Number) obj).intValue();
        } else {
            i10 = 0;
        }
        this.callFlags = i10;
        this.options = map;
        this.encoding = (String) map.get(Library.OPTION_STRING_ENCODING);
        SymbolProvider symbolProvider = (SymbolProvider) map.get(Library.OPTION_SYMBOL_PROVIDER);
        if (symbolProvider == null) {
            this.symbolProvider = NATIVE_SYMBOL_PROVIDER;
        } else {
            this.symbolProvider = symbolProvider;
        }
        if (this.encoding == null) {
            this.encoding = Native.getDefaultStringEncoding();
        }
        if (Platform.isWindows() && "kernel32".equals(libraryName.toLowerCase())) {
            synchronized (hashMap) {
                try {
                    try {
                        hashMap.put(functionKey("GetLastError", i10, this.encoding), new Function(this, "GetLastError", 63, this.encoding) { // from class: com.sun.jna.NativeLibrary.2
                            @Override // com.sun.jna.Function
                            public Object invoke(Object[] objArr, Class<?> cls, boolean z9, int i11) {
                                return Integer.valueOf(Native.getLastError());
                            }

                            @Override // com.sun.jna.Function
                            public Object invoke(Method method, Class<?>[] clsArr, Class<?> cls, Object[] objArr, Map<String, ?> map2) {
                                return Integer.valueOf(Native.getLastError());
                            }
                        });
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        }
    }

    public static final void addSearchPath(String str, String str2) {
        Map<String, List<String>> map = searchPaths;
        List<String> list = map.get(str);
        if (list == null) {
            list = Collections.synchronizedList(new ArrayList());
            map.put(str, list);
        }
        list.add(str2);
    }

    private static void addSuppressedReflected(Throwable th, Throwable th2) {
        Method method = addSuppressedMethod;
        if (method == null) {
            return;
        }
        try {
            method.invoke(th, th2);
        } catch (IllegalAccessException e) {
            b.o("Failed to call addSuppressedMethod", e);
        } catch (IllegalArgumentException e6) {
            b.o("Failed to call addSuppressedMethod", e6);
        } catch (InvocationTargetException e10) {
            b.o("Failed to call addSuppressedMethod", e10);
        }
    }

    public static void disposeAll() {
        LinkedHashSet linkedHashSet;
        Map<String, Reference<NativeLibrary>> map = libraries;
        synchronized (map) {
            linkedHashSet = new LinkedHashSet(map.values());
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            NativeLibrary nativeLibrary = (NativeLibrary) ((Reference) it.next()).get();
            if (nativeLibrary != null) {
                nativeLibrary.close();
            }
        }
    }

    private static String findLibraryPath(String str, Collection<String> collection) {
        if (new File(str).isAbsolute()) {
            return str;
        }
        String mapSharedLibraryName = mapSharedLibraryName(str);
        for (String str2 : collection) {
            File file = new File(str2, mapSharedLibraryName);
            if (file.exists()) {
                return file.getAbsolutePath();
            }
            if (Platform.isMac() && mapSharedLibraryName.endsWith(".dylib")) {
                File file2 = new File(str2, mapSharedLibraryName.substring(0, mapSharedLibraryName.lastIndexOf(".dylib")).concat(".jnilib"));
                if (file2.exists()) {
                    return file2.getAbsolutePath();
                }
            }
        }
        return mapSharedLibraryName;
    }

    private static String functionKey(String str, int i10, String str2) {
        return str + "|" + i10 + "|" + str2;
    }

    public static final NativeLibrary getInstance(String str, Map<String, ?> map) {
        NativeLibrary nativeLibrary;
        HashMap hashMap = new HashMap(map);
        if (hashMap.get(Library.OPTION_CALLING_CONVENTION) == null) {
            hashMap.put(Library.OPTION_CALLING_CONVENTION, 0);
        }
        if ((Platform.isLinux() || Platform.isFreeBSD() || Platform.isAIX()) && Platform.C_LIBRARY_NAME.equals(str)) {
            str = null;
        }
        Map<String, Reference<NativeLibrary>> map2 = libraries;
        synchronized (map2) {
            try {
                Reference<NativeLibrary> reference = map2.get(str + hashMap);
                if (reference != null) {
                    nativeLibrary = reference.get();
                } else {
                    nativeLibrary = null;
                }
                if (nativeLibrary == null) {
                    if (str == null) {
                        nativeLibrary = new NativeLibrary("<process>", null, Native.open(null, openFlags(hashMap)), hashMap);
                    } else {
                        nativeLibrary = loadLibrary(str, hashMap);
                    }
                    WeakReference weakReference = new WeakReference(nativeLibrary);
                    map2.put(nativeLibrary.getName() + hashMap, weakReference);
                    File file = nativeLibrary.getFile();
                    if (file != null) {
                        map2.put(file.getAbsolutePath() + hashMap, weakReference);
                        map2.put(file.getName() + hashMap, weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return nativeLibrary;
    }

    private String getLibraryName(String str) {
        String mapSharedLibraryName = mapSharedLibraryName("---");
        int indexOf = mapSharedLibraryName.indexOf("---");
        if (indexOf > 0 && str.startsWith(mapSharedLibraryName.substring(0, indexOf))) {
            str = str.substring(indexOf);
        }
        int indexOf2 = str.indexOf(mapSharedLibraryName.substring(indexOf + 3));
        if (indexOf2 != -1) {
            return str.substring(0, indexOf2);
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x006a, code lost:
    
        if (r2 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.ArrayList<java.lang.String> getLinuxLdPaths() {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L58
            java.lang.String r3 = "/sbin/ldconfig -p"
            java.lang.Process r2 = r2.exec(r3)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L58
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L65
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L65
            java.io.InputStream r5 = r2.getInputStream()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L65
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L65
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L65
        L1e:
            java.lang.String r1 = r3.readLine()     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4a
            if (r1 == 0) goto L4c
            java.lang.String r4 = " => "
            int r4 = r1.indexOf(r4)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4a
            r5 = 47
            int r5 = r1.lastIndexOf(r5)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4a
            r6 = -1
            if (r4 == r6) goto L1e
            if (r5 == r6) goto L1e
            if (r4 >= r5) goto L1e
            int r4 = r4 + 4
            java.lang.String r1 = r1.substring(r4, r5)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4a
            boolean r4 = r0.contains(r1)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4a
            if (r4 != 0) goto L1e
            r0.add(r1)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4a
            goto L1e
        L47:
            r0 = move-exception
            r1 = r3
            goto L5a
        L4a:
            r1 = r3
            goto L65
        L4c:
            r3.close()     // Catch: java.io.IOException -> L4f
        L4f:
            r2.waitFor()     // Catch: java.lang.InterruptedException -> L6d
            goto L6d
        L53:
            r0 = move-exception
            goto L5a
        L55:
            r0 = move-exception
            r2 = r1
            goto L5a
        L58:
            r2 = r1
            goto L65
        L5a:
            if (r1 == 0) goto L5f
            r1.close()     // Catch: java.io.IOException -> L5f
        L5f:
            if (r2 == 0) goto L64
            r2.waitFor()     // Catch: java.lang.InterruptedException -> L64
        L64:
            throw r0
        L65:
            if (r1 == 0) goto L6a
            r1.close()     // Catch: java.io.IOException -> L6a
        L6a:
            if (r2 == 0) goto L6d
            goto L4f
        L6d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.jna.NativeLibrary.getLinuxLdPaths():java.util.ArrayList");
    }

    private static String getMultiArchPath() {
        String str;
        String str2 = Platform.ARCH;
        if (Platform.iskFreeBSD()) {
            str = "-kfreebsd";
        } else if (Platform.isGNU()) {
            str = "";
        } else {
            str = "-linux";
        }
        String str3 = "-gnu";
        if (Platform.isIntel()) {
            str2 = Platform.is64Bit() ? "x86_64" : "i386";
        } else if (Platform.isPPC()) {
            str2 = Platform.is64Bit() ? "powerpc64" : "powerpc";
        } else if (Platform.isARM()) {
            str2 = "arm";
            str3 = "-gnueabi";
        } else if (str2.equals("mips64el")) {
            str3 = "-gnuabi64";
        }
        return a.D(str2, str, str3);
    }

    public static final synchronized NativeLibrary getProcess() {
        NativeLibrary nativeLibrary;
        synchronized (NativeLibrary.class) {
            nativeLibrary = getInstance(null);
        }
        return nativeLibrary;
    }

    private static List<String> initPaths(String str) {
        String property = System.getProperty(str, "");
        if ("".equals(property)) {
            return Collections.EMPTY_LIST;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(property, File.pathSeparator);
        ArrayList arrayList = new ArrayList();
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (!"".equals(nextToken)) {
                arrayList.add(nextToken);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isVersionedName(String str) {
        int lastIndexOf;
        int i10;
        if (!str.startsWith("lib") || (lastIndexOf = str.lastIndexOf(".so.")) == -1 || (i10 = lastIndexOf + 4) >= str.length()) {
            return false;
        }
        for (i10 = lastIndexOf + 4; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (!Character.isDigit(charAt) && charAt != '.') {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02b2  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.sun.jna.NativeLibrary loadLibrary(java.lang.String r18, java.util.Map<java.lang.String, ?> r19) {
        /*
            Method dump skipped, instructions count: 798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.jna.NativeLibrary.loadLibrary(java.lang.String, java.util.Map):com.sun.jna.NativeLibrary");
    }

    public static String mapSharedLibraryName(String str) {
        if (Platform.isMac()) {
            if (str.startsWith("lib") && (str.endsWith(".dylib") || str.endsWith(".jnilib"))) {
                return str;
            }
            String mapLibraryName = System.mapLibraryName(str);
            if (mapLibraryName.endsWith(".jnilib")) {
                return mapLibraryName.substring(0, mapLibraryName.lastIndexOf(".jnilib")).concat(".dylib");
            }
            return mapLibraryName;
        }
        if (!Platform.isLinux() && !Platform.isFreeBSD()) {
            if (Platform.isAIX()) {
                if (isVersionedName(str) || str.endsWith(".so") || str.startsWith("lib") || str.endsWith(".a")) {
                    return str;
                }
            } else if (Platform.isWindows() && (str.endsWith(".drv") || str.endsWith(".dll") || str.endsWith(".ocx"))) {
                return str;
            }
        } else if (isVersionedName(str) || str.endsWith(".so")) {
            return str;
        }
        String mapLibraryName2 = System.mapLibraryName(str);
        if (Platform.isAIX() && mapLibraryName2.endsWith(".so")) {
            return mapLibraryName2.replaceAll(".so$", ".a");
        }
        return mapLibraryName2;
    }

    public static String[] matchFramework(String str) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        File file = new File(str);
        if (file.isAbsolute()) {
            if (str.contains(".framework")) {
                if (file.exists()) {
                    return new String[]{file.getAbsolutePath()};
                }
                linkedHashSet.add(file.getAbsolutePath());
            } else {
                File file2 = new File(new File(file.getParentFile(), file.getName() + ".framework"), file.getName());
                if (file2.exists()) {
                    return new String[]{file2.getAbsolutePath()};
                }
                linkedHashSet.add(file2.getAbsolutePath());
            }
        } else {
            String[] strArr = {System.getProperty("user.home"), "", "/System"};
            if (!str.contains(".framework")) {
                str = a.D(str, ".framework/", str);
            }
            for (int i10 = 0; i10 < 3; i10++) {
                File file3 = new File(a.D(strArr[i10], "/Library/Frameworks/", str));
                if (file3.exists()) {
                    return new String[]{file3.getAbsolutePath()};
                }
                linkedHashSet.add(file3.getAbsolutePath());
            }
        }
        return (String[]) linkedHashSet.toArray(new String[0]);
    }

    public static String matchLibrary(final String str, Collection<String> collection) {
        File file = new File(str);
        if (file.isAbsolute()) {
            collection = Arrays.asList(file.getParent());
        }
        FilenameFilter filenameFilter = new FilenameFilter() { // from class: com.sun.jna.NativeLibrary.3
            @Override // java.io.FilenameFilter
            public boolean accept(File file2, String str2) {
                if (!str2.startsWith("lib" + str + ".so")) {
                    if (!str2.startsWith(str + ".so") || !str.startsWith("lib")) {
                        return false;
                    }
                }
                if (NativeLibrary.isVersionedName(str2)) {
                    return true;
                }
                return false;
            }
        };
        LinkedList linkedList = new LinkedList();
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            File[] listFiles = new File(it.next()).listFiles(filenameFilter);
            if (listFiles != null && listFiles.length > 0) {
                linkedList.addAll(Arrays.asList(listFiles));
            }
        }
        Iterator it2 = linkedList.iterator();
        double d = -1.0d;
        String str2 = null;
        while (it2.hasNext()) {
            String absolutePath = ((File) it2.next()).getAbsolutePath();
            double parseVersion = parseVersion(absolutePath.substring(absolutePath.lastIndexOf(".so.") + 4));
            if (parseVersion > d) {
                str2 = absolutePath;
                d = parseVersion;
            }
        }
        return str2;
    }

    private static int openFlags(Map<String, ?> map) {
        Object obj = map.get(Library.OPTION_OPEN_FLAGS);
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        return -1;
    }

    public static double parseVersion(String str) {
        String str2;
        int indexOf = str.indexOf(".");
        double d = 1.0d;
        double d10 = 0.0d;
        while (str != null) {
            if (indexOf != -1) {
                String substring = str.substring(0, indexOf);
                String substring2 = str.substring(indexOf + 1);
                indexOf = substring2.indexOf(".");
                str2 = substring2;
                str = substring;
            } else {
                str2 = null;
            }
            try {
                d10 += Integer.parseInt(str) / d;
                d *= 100.0d;
                str = str2;
            } catch (NumberFormatException unused) {
                return 0.0d;
            }
        }
        return d10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        HashSet hashSet = new HashSet();
        Map<String, Reference<NativeLibrary>> map = libraries;
        synchronized (map) {
            try {
                for (Map.Entry<String, Reference<NativeLibrary>> entry : map.entrySet()) {
                    if (entry.getValue().get() == this) {
                        hashSet.add(entry.getKey());
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    libraries.remove((String) it.next());
                }
            } finally {
            }
        }
        synchronized (this) {
            try {
                if (this.handle != 0) {
                    this.cleanable.clean();
                    this.handle = 0L;
                }
            } finally {
            }
        }
    }

    @Deprecated
    public void dispose() {
        close();
    }

    public File getFile() {
        if (this.libraryPath == null) {
            return null;
        }
        return new File(this.libraryPath);
    }

    public Function getFunction(String str, Method method) {
        FunctionMapper functionMapper = (FunctionMapper) this.options.get(Library.OPTION_FUNCTION_MAPPER);
        if (functionMapper != null) {
            str = functionMapper.getFunctionName(this, method);
        }
        String property = System.getProperty("jna.profiler.prefix", "$$YJP$$");
        if (str.startsWith(property)) {
            str = str.substring(property.length());
        }
        int i10 = this.callFlags;
        for (Class<?> cls : method.getExceptionTypes()) {
            if (LastErrorException.class.isAssignableFrom(cls)) {
                i10 |= 64;
            }
        }
        return getFunction(str, i10);
    }

    public Pointer getGlobalVariableAddress(String str) {
        try {
            return new Pointer(getSymbolAddress(str));
        } catch (UnsatisfiedLinkError e) {
            StringBuilder x9 = a.x("Error looking up '", str, "': ");
            x9.append(e.getMessage());
            throw new UnsatisfiedLinkError(x9.toString());
        }
    }

    public String getName() {
        return this.libraryName;
    }

    public Map<String, ?> getOptions() {
        return this.options;
    }

    public long getSymbolAddress(String str) {
        long j10 = this.handle;
        if (j10 != 0) {
            return this.symbolProvider.getSymbolAddress(j10, str, NATIVE_SYMBOL_PROVIDER);
        }
        throw new UnsatisfiedLinkError("Library has been unloaded");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Native Library <");
        sb.append(this.libraryPath);
        sb.append("@");
        return a.n(sb, this.handle, ">");
    }

    public static final synchronized NativeLibrary getProcess(Map<String, ?> map) {
        NativeLibrary nativeLibrary;
        synchronized (NativeLibrary.class) {
            nativeLibrary = getInstance((String) null, map);
        }
        return nativeLibrary;
    }

    public Function getFunction(String str) {
        return getFunction(str, this.callFlags);
    }

    public Function getFunction(String str, int i10) {
        return getFunction(str, i10, this.encoding);
    }

    public Function getFunction(String str, int i10, String str2) {
        Function function;
        if (str != null) {
            synchronized (this.functions) {
                try {
                    String functionKey = functionKey(str, i10, str2);
                    function = this.functions.get(functionKey);
                    if (function == null) {
                        function = new Function(this, str, i10, str2);
                        this.functions.put(functionKey, function);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return function;
        }
        n0.b.n("Function name may not be null");
        return null;
    }

    public static final NativeLibrary getInstance(String str, ClassLoader classLoader) {
        return getInstance(str, (Map<String, ?>) Collections.singletonMap(Library.OPTION_CLASSLOADER, classLoader));
    }

    public static final NativeLibrary getInstance(String str) {
        return getInstance(str, (Map<String, ?>) Collections.EMPTY_MAP);
    }
}
