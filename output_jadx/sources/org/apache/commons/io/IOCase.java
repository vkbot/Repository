package org.apache.commons.io;

import java.util.Objects;
import java.util.stream.Stream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public enum IOCase {
    SENSITIVE("Sensitive", true),
    INSENSITIVE("Insensitive", false),
    SYSTEM("System", FileSystem.getCurrent().isCaseSensitive());

    private static final long serialVersionUID = -6343169151696340687L;
    private final String name;
    private final transient boolean sensitive;

    IOCase(String str, boolean z9) {
        this.name = str;
        this.sensitive = z9;
    }

    public static IOCase forName(String str) {
        return (IOCase) Stream.of((Object[]) values()).filter(new a(str, 2)).findFirst().orElseThrow(new v(1, str));
    }

    public static boolean isCaseSensitive(IOCase iOCase) {
        if (iOCase != null && iOCase.isCaseSensitive()) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean lambda$forName$0(String str, IOCase iOCase) {
        return iOCase.getName().equals(str);
    }

    public static /* synthetic */ IllegalArgumentException lambda$forName$1(String str) {
        return new IllegalArgumentException(ai.onnxruntime.a.l("Illegal IOCase name: ", str));
    }

    private Object readResolve() {
        return forName(this.name);
    }

    public static IOCase value(IOCase iOCase, IOCase iOCase2) {
        if (iOCase != null) {
            return iOCase;
        }
        return iOCase2;
    }

    public int checkCompareTo(String str, String str2) {
        Objects.requireNonNull(str, "str1");
        Objects.requireNonNull(str2, "str2");
        if (this.sensitive) {
            return str.compareTo(str2);
        }
        return str.compareToIgnoreCase(str2);
    }

    public boolean checkEndsWith(String str, String str2) {
        if (str != null && str2 != null) {
            int length = str2.length();
            return str.regionMatches(!this.sensitive, str.length() - length, str2, 0, length);
        }
        return false;
    }

    public boolean checkEquals(String str, String str2) {
        if (str != str2) {
            if (str != null) {
                if (this.sensitive) {
                    if (!str.equals(str2)) {
                        return false;
                    }
                    return true;
                }
                if (!str.equalsIgnoreCase(str2)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public int checkIndexOf(String str, int i10, String str2) {
        int length;
        if (str != null && str2 != null && (length = str.length() - str2.length()) >= i10) {
            while (i10 <= length) {
                if (checkRegionMatches(str, i10, str2)) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        return -1;
    }

    public boolean checkRegionMatches(String str, int i10, String str2) {
        if (str != null && str2 != null && str.regionMatches(!this.sensitive, i10, str2, 0, str2.length())) {
            return true;
        }
        return false;
    }

    public boolean checkStartsWith(String str, String str2) {
        if (str != null && str2 != null && str.regionMatches(!this.sensitive, 0, str2, 0, str2.length())) {
            return true;
        }
        return false;
    }

    public String getName() {
        return this.name;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }

    public boolean isCaseSensitive() {
        return this.sensitive;
    }
}
