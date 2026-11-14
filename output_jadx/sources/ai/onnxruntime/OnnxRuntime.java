package ai.onnxruntime;

import j1.i;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Locale;
import java.util.Optional;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.IOUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class OnnxRuntime {
    static final String ONNXRUNTIME_JNI_LIBRARY_NAME = "onnxruntime4j_jni";
    static final String ONNXRUNTIME_LIBRARY_CUDA_NAME = "onnxruntime_providers_cuda";
    static final String ONNXRUNTIME_LIBRARY_DNNL_NAME = "onnxruntime_providers_dnnl";
    static final String ONNXRUNTIME_LIBRARY_NAME = "onnxruntime";
    static final String ONNXRUNTIME_LIBRARY_OPENVINO_NAME = "onnxruntime_providers_openvino";
    static final String ONNXRUNTIME_LIBRARY_QNN_NAME = "onnxruntime_providers_qnn";
    static final String ONNXRUNTIME_LIBRARY_ROCM_NAME = "onnxruntime_providers_rocm";
    static final String ONNXRUNTIME_LIBRARY_SHARED_NAME = "onnxruntime_providers_shared";
    static final String ONNXRUNTIME_LIBRARY_TENSORRT_NAME = "onnxruntime_providers_tensorrt";
    static final String ONNXRUNTIME_LIBRARY_WEBGPU_DAWN_NAME = "webgpu_dawn";
    static final String ONNXRUNTIME_LIBRARY_WEBGPU_DXC_DXCOMPILER_NAME = "dxcompiler";
    static final String ONNXRUNTIME_LIBRARY_WEBGPU_DXC_DXIL_NAME = "dxil";
    static final String ONNXRUNTIME_NATIVE_PATH = "onnxruntime.native.path";
    private static final int ORT_API_VERSION_1 = 1;
    private static final int ORT_API_VERSION_11 = 11;
    private static final int ORT_API_VERSION_13 = 13;
    private static final int ORT_API_VERSION_14 = 14;
    private static final int ORT_API_VERSION_2 = 2;
    private static final int ORT_API_VERSION_23 = 23;
    private static final int ORT_API_VERSION_3 = 3;
    private static final int ORT_API_VERSION_7 = 7;
    private static final int ORT_API_VERSION_8 = 8;
    private static final int ORT_TRAINING_API_VERSION_1 = 1;
    private static String libraryDirPathProperty;
    static long ortApiHandle;
    static long ortCompileApiHandle;
    static long ortTrainingApiHandle;
    static EnumSet<OrtProvider> providers;
    private static Path tempDirectory;
    static boolean trainingEnabled;
    private static String version;
    private static final Logger logger = Logger.getLogger(OnnxRuntime.class.getName());
    private static final String OS_ARCH_STR = initOsArch();
    private static boolean loaded = false;
    private static final Set<String> extractedSharedProviders = new HashSet();

    private OnnxRuntime() {
    }

    private static void cleanUp(File file) {
        if (!file.exists()) {
            return;
        }
        logger.log(Level.FINE, "Deleting " + file + " on exit");
        file.deleteOnExit();
    }

    public static boolean extractCUDA() {
        return extractProviderLibrary(ONNXRUNTIME_LIBRARY_CUDA_NAME);
    }

    public static boolean extractDNNL() {
        return extractProviderLibrary(ONNXRUNTIME_LIBRARY_DNNL_NAME);
    }

    private static Optional<File> extractFromResources(String str) {
        Path resolve;
        File file;
        String mapLibraryName = mapLibraryName(str);
        String str2 = "/ai/onnxruntime/native/" + OS_ARCH_STR + IOUtils.DIR_SEPARATOR_UNIX + mapLibraryName;
        resolve = tempDirectory.resolve(mapLibraryName);
        file = resolve.toFile();
        try {
            InputStream resourceAsStream = OnnxRuntime.class.getResourceAsStream(str2);
            try {
                if (resourceAsStream == null) {
                    Optional<File> empty = Optional.empty();
                    if (resourceAsStream != null) {
                        resourceAsStream.close();
                    }
                    return empty;
                }
                logger.log(Level.FINE, "Attempting to load native library '" + str + "' from resource path " + str2 + " copying to " + file);
                byte[] bArr = new byte[4096];
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                while (true) {
                    try {
                        int read = resourceAsStream.read(bArr);
                        if (read != -1) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            fileOutputStream.close();
                            logger.log(Level.FINE, "Extracted native library '" + str + "' from resource path");
                            Optional<File> of = Optional.of(file);
                            resourceAsStream.close();
                            return of;
                        }
                    } catch (Throwable th) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                if (resourceAsStream != null) {
                    try {
                        resourceAsStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (IOException e) {
            logger.log(Level.WARNING, "Failed to extract library '" + str + "' from the resources", (Throwable) e);
            return Optional.empty();
        } finally {
            cleanUp(file);
        }
    }

    public static boolean extractOpenVINO() {
        return extractProviderLibrary(ONNXRUNTIME_LIBRARY_OPENVINO_NAME);
    }

    public static synchronized boolean extractProviderLibrary(String str) {
        Path path;
        File file;
        synchronized (OnnxRuntime.class) {
            if (isAndroid()) {
                return false;
            }
            Set<String> set = extractedSharedProviders;
            if (set.contains(str)) {
                return true;
            }
            if (libraryDirPathProperty != null) {
                path = Paths.get(libraryDirPathProperty, mapLibraryName(str));
                file = path.toFile();
                if (file.exists()) {
                    set.add(str);
                    return true;
                }
            }
            if (!extractFromResources(str).isPresent()) {
                return false;
            }
            set.add(str);
            return true;
        }
    }

    public static boolean extractQNN() {
        return extractProviderLibrary(ONNXRUNTIME_LIBRARY_QNN_NAME);
    }

    public static boolean extractROCM() {
        return extractProviderLibrary(ONNXRUNTIME_LIBRARY_ROCM_NAME);
    }

    public static boolean extractTensorRT() {
        return extractProviderLibrary(ONNXRUNTIME_LIBRARY_TENSORRT_NAME);
    }

    private static native String[] getAvailableProviders(long j10);

    public static synchronized void init() {
        Path createTempDirectory;
        File file;
        File file2;
        synchronized (OnnxRuntime.class) {
            if (loaded) {
                return;
            }
            boolean z9 = false;
            if (!isAndroid()) {
                createTempDirectory = Files.createTempDirectory("onnxruntime-java", new FileAttribute[0]);
            } else {
                createTempDirectory = null;
            }
            tempDirectory = createTempDirectory;
            try {
                libraryDirPathProperty = System.getProperty(ONNXRUNTIME_NATIVE_PATH);
                extractProviderLibrary(ONNXRUNTIME_LIBRARY_SHARED_NAME);
                extractProviderLibrary(ONNXRUNTIME_LIBRARY_WEBGPU_DAWN_NAME);
                extractProviderLibrary(ONNXRUNTIME_LIBRARY_WEBGPU_DXC_DXIL_NAME);
                extractProviderLibrary(ONNXRUNTIME_LIBRARY_WEBGPU_DXC_DXCOMPILER_NAME);
                if (!isAndroid()) {
                    load(ONNXRUNTIME_LIBRARY_NAME);
                }
                load(ONNXRUNTIME_JNI_LIBRARY_NAME);
                long initialiseAPIBase = initialiseAPIBase(23);
                ortApiHandle = initialiseAPIBase;
                if (initialiseAPIBase != 0) {
                    ortTrainingApiHandle = initialiseTrainingAPIBase(initialiseAPIBase, 23);
                    ortCompileApiHandle = initialiseCompileAPIBase(ortApiHandle);
                    if (ortTrainingApiHandle != 0) {
                        z9 = true;
                    }
                    trainingEnabled = z9;
                    providers = initialiseProviders(ortApiHandle);
                    version = initialiseVersion();
                    loaded = true;
                    Path path = tempDirectory;
                    if (path != null) {
                        file2 = path.toFile();
                        cleanUp(file2);
                    }
                    return;
                }
                throw new IllegalStateException("There is a mismatch between the ORT class files and the ORT native library, and the native library could not be loaded");
            } catch (Throwable th) {
                Path path2 = tempDirectory;
                if (path2 != null) {
                    file = path2.toFile();
                    cleanUp(file);
                }
                throw th;
            }
        }
    }

    private static String initOsArch() {
        String str;
        String property = System.getProperty("os.name", "generic");
        Locale locale = Locale.ENGLISH;
        String lowerCase = property.toLowerCase(locale);
        if (!lowerCase.contains("mac") && !lowerCase.contains("darwin")) {
            str = "win";
            if (!lowerCase.contains("win")) {
                if (lowerCase.contains("nux")) {
                    str = "linux";
                } else if (isAndroid()) {
                    str = "android";
                } else {
                    i.l("Unsupported os:".concat(lowerCase));
                    return null;
                }
            }
        } else {
            str = "osx";
        }
        String lowerCase2 = System.getProperty("os.arch", "generic").toLowerCase(locale);
        if (!lowerCase2.startsWith("amd64") && !lowerCase2.startsWith("x86_64")) {
            String str2 = "x86";
            if (!lowerCase2.startsWith("x86")) {
                str2 = "aarch64";
                if (!lowerCase2.startsWith("aarch64")) {
                    str2 = "ppc64";
                    if (!lowerCase2.startsWith("ppc64")) {
                        str2 = "loongarch64";
                        if (!lowerCase2.startsWith("loongarch64")) {
                            if (!isAndroid()) {
                                i.l("Unsupported arch:".concat(lowerCase2));
                                return null;
                            }
                        }
                    }
                }
            }
            lowerCase2 = str2;
        } else {
            lowerCase2 = "x64";
        }
        return str + '-' + lowerCase2;
    }

    private static native long initialiseAPIBase(int i10);

    private static native long initialiseCompileAPIBase(long j10);

    private static EnumSet<OrtProvider> initialiseProviders(long j10) {
        String[] availableProviders = getAvailableProviders(j10);
        EnumSet<OrtProvider> noneOf = EnumSet.noneOf(OrtProvider.class);
        for (String str : availableProviders) {
            noneOf.add(OrtProvider.mapFromName(str));
        }
        return noneOf;
    }

    private static native long initialiseTrainingAPIBase(long j10, int i10);

    private static native String initialiseVersion();

    public static boolean isAndroid() {
        return System.getProperty("java.vendor", "generic").equals("The Android Project");
    }

    private static void load(String str) {
        Path path;
        File file;
        if (isAndroid()) {
            System.loadLibrary(str);
            return;
        }
        if (Boolean.TRUE.toString().equalsIgnoreCase(System.getProperty("onnxruntime.native." + str + ".skip"))) {
            logger.log(Level.FINE, "Skipping load of native library '" + str + "'");
            return;
        }
        String mapLibraryName = mapLibraryName(str);
        if (libraryDirPathProperty != null) {
            Logger logger2 = logger;
            Level level = Level.FINE;
            StringBuilder x9 = a.x("Attempting to load native library '", str, "' from specified path: ");
            x9.append(libraryDirPathProperty);
            logger2.log(level, x9.toString());
            path = Paths.get(libraryDirPathProperty, mapLibraryName);
            file = path.toFile();
            String absolutePath = file.getAbsolutePath();
            if (file.exists()) {
                System.load(absolutePath);
                logger2.log(level, "Loaded native library '" + str + "' from specified path");
                return;
            }
            b.m("Native library '", str, "' not found at ", absolutePath);
            return;
        }
        String property = System.getProperty("onnxruntime.native." + str + ".path");
        if (property != null) {
            Logger logger3 = logger;
            Level level2 = Level.FINE;
            logger3.log(level2, "Attempting to load native library '" + str + "' from specified path: " + property);
            File file2 = new File(property);
            String absolutePath2 = file2.getAbsolutePath();
            if (file2.exists()) {
                System.load(absolutePath2);
                logger3.log(level2, "Loaded native library '" + str + "' from specified path");
                return;
            }
            b.m("Native library '", str, "' not found at ", absolutePath2);
            return;
        }
        Optional<File> extractFromResources = extractFromResources(str);
        if (extractFromResources.isPresent()) {
            System.load(extractFromResources.get().getAbsolutePath());
            logger.log(Level.FINE, "Loaded native library '" + str + "' from resource path");
            return;
        }
        Logger logger4 = logger;
        Level level3 = Level.FINE;
        logger4.log(level3, "Attempting to load native library '" + str + "' from library path");
        System.loadLibrary(str);
        logger4.log(level3, "Loaded native library '" + str + "' from library path");
    }

    private static String mapLibraryName(String str) {
        return System.mapLibraryName(str).replace("jnilib", "dylib");
    }

    public static String version() {
        return version;
    }
}
