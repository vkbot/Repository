package com.sun.jna;

import ai.onnxruntime.a;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class Platform {
    public static final int AIX = 7;
    public static final int ANDROID = 8;
    public static final String ARCH;
    public static final String C_LIBRARY_NAME;
    public static final int FREEBSD = 4;
    public static final int GNU = 9;
    public static final boolean HAS_AWT;
    public static final boolean HAS_BUFFERS;
    public static final boolean HAS_DLL_CALLBACKS;
    public static final boolean HAS_JAWT;
    public static final int KFREEBSD = 10;
    public static final int LINUX = 1;
    public static final int MAC = 0;
    public static final String MATH_LIBRARY_NAME;
    public static final int NETBSD = 11;
    public static final int OPENBSD = 5;
    public static final String RESOURCE_PREFIX;
    public static final boolean RO_FIELDS;
    public static final int SOLARIS = 3;
    public static final int UNSPECIFIED = -1;
    public static final int WINDOWS = 2;
    public static final int WINDOWSCE = 6;
    private static final int osType;

    static {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        String property = System.getProperty("os.name");
        boolean z13 = false;
        if (property.startsWith("Linux")) {
            if ("dalvik".equals(System.getProperty("java.vm.name").toLowerCase())) {
                osType = 8;
                System.setProperty("jna.nounpack", "true");
            } else {
                osType = 1;
            }
        } else if (property.startsWith("AIX")) {
            osType = 7;
        } else if (!property.startsWith("Mac") && !property.startsWith("Darwin")) {
            if (property.startsWith("Windows CE")) {
                osType = 6;
            } else if (property.startsWith("Windows")) {
                osType = 2;
            } else if (!property.startsWith("Solaris") && !property.startsWith("SunOS")) {
                if (property.startsWith("FreeBSD")) {
                    osType = 4;
                } else if (property.startsWith("OpenBSD")) {
                    osType = 5;
                } else if (property.equalsIgnoreCase("gnu")) {
                    osType = 9;
                } else if (property.equalsIgnoreCase("gnu/kfreebsd")) {
                    osType = 10;
                } else if (property.equalsIgnoreCase("netbsd")) {
                    osType = 11;
                } else {
                    osType = -1;
                }
            } else {
                osType = 3;
            }
        } else {
            osType = 0;
        }
        try {
            Class.forName("java.nio.Buffer");
            z9 = true;
        } catch (ClassNotFoundException unused) {
            z9 = false;
        }
        int i10 = osType;
        if (i10 != 6 && i10 != 8 && i10 != 7) {
            z10 = true;
        } else {
            z10 = false;
        }
        HAS_AWT = z10;
        if (z10 && i10 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        HAS_JAWT = z11;
        HAS_BUFFERS = z9;
        if (i10 != 6) {
            z12 = true;
        } else {
            z12 = false;
        }
        RO_FIELDS = z12;
        String str2 = "coredll";
        if (i10 == 2) {
            str = "msvcrt";
        } else if (i10 == 6) {
            str = "coredll";
        } else {
            str = "c";
        }
        C_LIBRARY_NAME = str;
        if (i10 == 2) {
            str2 = "msvcrt";
        } else if (i10 != 6) {
            str2 = "m";
        }
        MATH_LIBRARY_NAME = str2;
        String canonicalArchitecture = getCanonicalArchitecture(System.getProperty("os.arch"), i10);
        ARCH = canonicalArchitecture;
        if (i10 == 2 && !canonicalArchitecture.startsWith("aarch")) {
            z13 = true;
        }
        HAS_DLL_CALLBACKS = z13;
        RESOURCE_PREFIX = getNativeLibraryResourcePrefix();
    }

    private Platform() {
    }

    public static String getCanonicalArchitecture(String str, int i10) {
        String trim = str.toLowerCase().trim();
        if ("powerpc".equals(trim)) {
            trim = "ppc";
        } else if ("powerpc64".equals(trim)) {
            trim = "ppc64";
        } else if (!"i386".equals(trim) && !"i686".equals(trim)) {
            if (!"x86_64".equals(trim) && !"amd64".equals(trim)) {
                if ("zarch_64".equals(trim)) {
                    trim = "s390x";
                }
            } else {
                trim = "x86-64";
            }
        } else {
            trim = "x86";
        }
        if ("ppc64".equals(trim) && "little".equals(System.getProperty("sun.cpu.endian"))) {
            trim = "ppc64le";
        }
        if ("arm".equals(trim) && i10 == 1 && isSoftFloat()) {
            return "armel";
        }
        return trim;
    }

    public static String getNativeLibraryResourcePrefix(int i10, String str, String str2) {
        String canonicalArchitecture = getCanonicalArchitecture(str, i10);
        switch (i10) {
            case 0:
                return a.l("darwin-", canonicalArchitecture);
            case 1:
                return a.l("linux-", canonicalArchitecture);
            case 2:
                return a.l("win32-", canonicalArchitecture);
            case 3:
                return a.l("sunos-", canonicalArchitecture);
            case 4:
                return a.l("freebsd-", canonicalArchitecture);
            case 5:
                return a.l("openbsd-", canonicalArchitecture);
            case 6:
                return a.l("w32ce-", canonicalArchitecture);
            case 7:
            case 9:
            default:
                String lowerCase = str2.toLowerCase();
                int indexOf = lowerCase.indexOf(" ");
                if (indexOf != -1) {
                    lowerCase = lowerCase.substring(0, indexOf);
                }
                return a.D(lowerCase, "-", canonicalArchitecture);
            case 8:
                if (canonicalArchitecture.startsWith("arm")) {
                    canonicalArchitecture = "arm";
                }
                return "android-".concat(canonicalArchitecture);
            case 10:
                return a.l("kfreebsd-", canonicalArchitecture);
            case 11:
                return a.l("netbsd-", canonicalArchitecture);
        }
    }

    public static final int getOSType() {
        return osType;
    }

    public static final boolean hasRuntimeExec() {
        if (isWindowsCE() && "J9".equals(System.getProperty("java.vm.name"))) {
            return false;
        }
        return true;
    }

    public static final boolean is64Bit() {
        String property = System.getProperty("sun.arch.data.model", System.getProperty("com.ibm.vm.bitmode"));
        if (property != null) {
            return "64".equals(property);
        }
        String str = ARCH;
        if ("x86-64".equals(str) || "ia64".equals(str) || "ppc64".equals(str) || "ppc64le".equals(str) || "sparcv9".equals(str) || "mips64".equals(str) || "mips64el".equals(str) || "loongarch64".equals(str) || "amd64".equals(str) || "aarch64".equals(str) || Native.POINTER_SIZE == 8) {
            return true;
        }
        return false;
    }

    public static final boolean isAIX() {
        if (osType == 7) {
            return true;
        }
        return false;
    }

    public static final boolean isARM() {
        String str = ARCH;
        if (!str.startsWith("arm") && !str.startsWith("aarch")) {
            return false;
        }
        return true;
    }

    public static final boolean isAndroid() {
        if (osType == 8) {
            return true;
        }
        return false;
    }

    public static final boolean isFreeBSD() {
        if (osType == 4) {
            return true;
        }
        return false;
    }

    public static final boolean isGNU() {
        if (osType == 9) {
            return true;
        }
        return false;
    }

    public static final boolean isIntel() {
        if (ARCH.startsWith("x86")) {
            return true;
        }
        return false;
    }

    public static final boolean isLinux() {
        if (osType == 1) {
            return true;
        }
        return false;
    }

    public static final boolean isLoongArch() {
        return ARCH.startsWith("loongarch");
    }

    public static final boolean isMIPS() {
        String str = ARCH;
        if (!str.equals("mips") && !str.equals("mips64") && !str.equals("mipsel") && !str.equals("mips64el")) {
            return false;
        }
        return true;
    }

    public static final boolean isMac() {
        if (osType == 0) {
            return true;
        }
        return false;
    }

    public static final boolean isNetBSD() {
        if (osType == 11) {
            return true;
        }
        return false;
    }

    public static final boolean isOpenBSD() {
        if (osType == 5) {
            return true;
        }
        return false;
    }

    public static final boolean isPPC() {
        if (ARCH.startsWith("ppc")) {
            return true;
        }
        return false;
    }

    public static final boolean isSPARC() {
        return ARCH.startsWith("sparc");
    }

    public static boolean isSoftFloat() {
        try {
            if (new File("/proc/self/exe").exists()) {
                return !ELFAnalyser.analyse(r1.getCanonicalPath()).isArmHardFloat();
            }
            return false;
        } catch (IOException e) {
            Logger.getLogger(Platform.class.getName()).log(Level.INFO, "Failed to read '/proc/self/exe' or the target binary.", (Throwable) e);
            return false;
        } catch (SecurityException e6) {
            Logger.getLogger(Platform.class.getName()).log(Level.INFO, "SecurityException while analysing '/proc/self/exe' or the target binary.", (Throwable) e6);
            return false;
        }
    }

    public static final boolean isSolaris() {
        if (osType == 3) {
            return true;
        }
        return false;
    }

    public static final boolean isWindows() {
        int i10 = osType;
        if (i10 != 2 && i10 != 6) {
            return false;
        }
        return true;
    }

    public static final boolean isWindowsCE() {
        if (osType == 6) {
            return true;
        }
        return false;
    }

    public static final boolean isX11() {
        if (!isWindows() && !isMac()) {
            return true;
        }
        return false;
    }

    public static final boolean iskFreeBSD() {
        if (osType == 10) {
            return true;
        }
        return false;
    }

    public static String getNativeLibraryResourcePrefix() {
        String property = System.getProperty("jna.prefix");
        return property != null ? property : getNativeLibraryResourcePrefix(getOSType(), System.getProperty("os.arch"), System.getProperty("os.name"));
    }
}
