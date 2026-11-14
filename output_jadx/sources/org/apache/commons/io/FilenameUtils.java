package org.apache.commons.io;

import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class FilenameUtils {
    private static final int BASE_16 = 16;
    private static final String EMPTY_STRING = "";
    private static final String[] EMPTY_STRING_ARRAY = new String[0];
    public static final char EXTENSION_SEPARATOR = '.';
    public static final String EXTENSION_SEPARATOR_STR = Character.toString(EXTENSION_SEPARATOR);
    private static final int IPV4_MAX_OCTET_VALUE = 255;
    private static final Pattern IPV4_PATTERN;
    private static final int IPV6_MAX_HEX_DIGITS_PER_GROUP = 4;
    private static final int IPV6_MAX_HEX_GROUPS = 8;
    private static final int MAX_UNSIGNED_SHORT = 65535;
    private static final int NOT_FOUND = -1;
    private static final char OTHER_SEPARATOR;
    private static final Pattern REG_NAME_PART_PATTERN;
    private static final char SYSTEM_NAME_SEPARATOR;
    private static final char UNIX_NAME_SEPARATOR = '/';
    private static final char WINDOWS_NAME_SEPARATOR = '\\';

    static {
        char c = File.separatorChar;
        SYSTEM_NAME_SEPARATOR = c;
        OTHER_SEPARATOR = flipSeparator(c);
        IPV4_PATTERN = Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");
        REG_NAME_PART_PATTERN = Pattern.compile("^[a-zA-Z0-9][a-zA-Z0-9-]*$");
    }

    @Deprecated
    public FilenameUtils() {
    }

    public static String concat(String str, String str2) {
        int prefixLength = getPrefixLength(str2);
        if (prefixLength < 0) {
            return null;
        }
        if (prefixLength > 0) {
            return normalize(str2);
        }
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return normalize(str2);
        }
        if (isSeparator(str.charAt(length - 1))) {
            return normalize(str + str2);
        }
        return normalize(str + '/' + str2);
    }

    public static boolean directoryContains(String str, String str2) {
        boolean z9 = false;
        if (isEmpty(str) || isEmpty(str2)) {
            return false;
        }
        IOCase iOCase = IOCase.SYSTEM;
        if (iOCase.checkEquals(str, str2)) {
            return false;
        }
        if (str.charAt(0) == '/') {
            z9 = true;
        }
        char separator = toSeparator(z9);
        if (str.charAt(str.length() - 1) != separator) {
            str = str + separator;
        }
        return iOCase.checkStartsWith(str2, str);
    }

    private static String doGetFullPath(String str, boolean z9) {
        int prefixLength;
        if (str == null || (prefixLength = getPrefixLength(str)) < 0) {
            return null;
        }
        if (prefixLength >= str.length()) {
            if (z9) {
                return getPrefix(str);
            }
            return str;
        }
        int indexOfLastSeparator = indexOfLastSeparator(str);
        if (indexOfLastSeparator < 0) {
            return str.substring(0, prefixLength);
        }
        int i10 = indexOfLastSeparator + (z9 ? 1 : 0);
        if (i10 == 0) {
            i10++;
        }
        return str.substring(0, i10);
    }

    private static String doGetPath(String str, int i10) {
        int prefixLength;
        if (str == null || (prefixLength = getPrefixLength(str)) < 0) {
            return null;
        }
        int indexOfLastSeparator = indexOfLastSeparator(str);
        int i11 = i10 + indexOfLastSeparator;
        if (prefixLength < str.length() && indexOfLastSeparator >= 0 && prefixLength < i11) {
            return requireNonNullChars(str.substring(prefixLength, i11));
        }
        return "";
    }

    private static String doNormalize(String str, char c, boolean z9) {
        boolean z10;
        int i10;
        if (str == null) {
            return null;
        }
        requireNonNullChars(str);
        int length = str.length();
        if (length == 0) {
            return str;
        }
        int prefixLength = getPrefixLength(str);
        if (prefixLength < 0) {
            return null;
        }
        int i11 = length + 2;
        char[] cArr = new char[i11];
        str.getChars(0, str.length(), cArr, 0);
        char flipSeparator = flipSeparator(c);
        for (int i12 = 0; i12 < i11; i12++) {
            if (cArr[i12] == flipSeparator) {
                cArr[i12] = c;
            }
        }
        if (cArr[length - 1] != c) {
            cArr[length] = c;
            length++;
            z10 = false;
        } else {
            z10 = true;
        }
        if (prefixLength != 0) {
            i10 = prefixLength;
        } else {
            i10 = 1;
        }
        while (i10 < length) {
            if (cArr[i10] == c) {
                int i13 = i10 - 1;
                if (cArr[i13] == c) {
                    System.arraycopy(cArr, i10, cArr, i13, length - i10);
                    length--;
                    i10--;
                }
            }
            i10++;
        }
        int i14 = prefixLength + 1;
        int i15 = i14;
        while (i15 < length) {
            if (cArr[i15] == c) {
                int i16 = i15 - 1;
                if (cArr[i16] == '.' && (i15 == i14 || cArr[i15 - 2] == c)) {
                    if (i15 == length - 1) {
                        z10 = true;
                    }
                    System.arraycopy(cArr, i15 + 1, cArr, i16, length - i15);
                    length -= 2;
                    i15--;
                }
            }
            i15++;
        }
        int i17 = prefixLength + 2;
        int i18 = i17;
        while (i18 < length) {
            if (cArr[i18] == c && cArr[i18 - 1] == '.' && cArr[i18 - 2] == '.' && (i18 == i17 || cArr[i18 - 3] == c)) {
                if (i18 == i17) {
                    return null;
                }
                if (i18 == length - 1) {
                    z10 = true;
                }
                int i19 = i18 - 4;
                while (true) {
                    if (i19 >= prefixLength) {
                        if (cArr[i19] == c) {
                            int i20 = i19 + 1;
                            System.arraycopy(cArr, i18 + 1, cArr, i20, length - i18);
                            length -= i18 - i19;
                            i18 = i20;
                            break;
                        }
                        i19--;
                    } else {
                        int i21 = i18 + 1;
                        System.arraycopy(cArr, i21, cArr, prefixLength, length - i18);
                        length -= i21 - prefixLength;
                        i18 = i14;
                        break;
                    }
                }
            }
            i18++;
        }
        if (length <= 0) {
            return "";
        }
        if (length <= prefixLength) {
            return new String(cArr, 0, length);
        }
        if (z10 && z9) {
            return new String(cArr, 0, length);
        }
        return new String(cArr, 0, length - 1);
    }

    public static boolean equals(String str, String str2, boolean z9, IOCase iOCase) {
        if (str != null && str2 != null) {
            if (z9 && ((str = normalize(str)) == null || (str2 = normalize(str2)) == null)) {
                return false;
            }
            return IOCase.value(iOCase, IOCase.SENSITIVE).checkEquals(str, str2);
        }
        if (str != null || str2 != null) {
            return false;
        }
        return true;
    }

    public static boolean equalsNormalized(String str, String str2) {
        return equals(str, str2, true, IOCase.SENSITIVE);
    }

    public static boolean equalsNormalizedOnSystem(String str, String str2) {
        return equals(str, str2, true, IOCase.SYSTEM);
    }

    public static boolean equalsOnSystem(String str, String str2) {
        return equals(str, str2, false, IOCase.SYSTEM);
    }

    public static char flipSeparator(char c) {
        if (c == '/') {
            return '\\';
        }
        if (c == '\\') {
            return '/';
        }
        j1.i.k(String.valueOf(c));
        return (char) 0;
    }

    private static int getAdsCriticalOffset(String str) {
        int lastIndexOf = str.lastIndexOf(SYSTEM_NAME_SEPARATOR);
        int lastIndexOf2 = str.lastIndexOf(OTHER_SEPARATOR);
        if (lastIndexOf == -1) {
            if (lastIndexOf2 == -1) {
                return 0;
            }
            return lastIndexOf2 + 1;
        }
        if (lastIndexOf2 == -1) {
            return lastIndexOf + 1;
        }
        return Math.max(lastIndexOf, lastIndexOf2) + 1;
    }

    public static String getBaseName(String str) {
        return removeExtension(getName(str));
    }

    public static String getExtension(String str) {
        if (str == null) {
            return null;
        }
        int indexOfExtension = indexOfExtension(str);
        if (indexOfExtension == -1) {
            return "";
        }
        return str.substring(indexOfExtension + 1);
    }

    public static String getFullPath(String str) {
        return doGetFullPath(str, true);
    }

    public static String getFullPathNoEndSeparator(String str) {
        return doGetFullPath(str, false);
    }

    public static String getName(String str) {
        if (str == null) {
            return null;
        }
        return requireNonNullChars(str).substring(indexOfLastSeparator(str) + 1);
    }

    public static String getPath(String str) {
        return doGetPath(str, 1);
    }

    public static String getPathNoEndSeparator(String str) {
        return doGetPath(str, 0);
    }

    public static String getPrefix(String str) {
        int prefixLength;
        if (str == null || (prefixLength = getPrefixLength(str)) < 0) {
            return null;
        }
        if (prefixLength > str.length()) {
            requireNonNullChars(str);
            return str.concat("/");
        }
        return requireNonNullChars(str.substring(0, prefixLength));
    }

    public static int getPrefixLength(String str) {
        if (str == null) {
            return -1;
        }
        int length = str.length();
        if (length == 0) {
            return 0;
        }
        char charAt = str.charAt(0);
        if (charAt == ':') {
            return -1;
        }
        if (length == 1) {
            if (charAt == '~') {
                return 2;
            }
            return isSeparator(charAt) ? 1 : 0;
        }
        if (charAt == '~') {
            int indexOf = str.indexOf(47, 1);
            int indexOf2 = str.indexOf(92, 1);
            if (indexOf == -1 && indexOf2 == -1) {
                return length + 1;
            }
            if (indexOf == -1) {
                indexOf = indexOf2;
            }
            if (indexOf2 == -1) {
                indexOf2 = indexOf;
            }
            return Math.min(indexOf, indexOf2) + 1;
        }
        char charAt2 = str.charAt(1);
        if (charAt2 == ':') {
            char upperCase = Character.toUpperCase(charAt);
            if (upperCase >= 'A' && upperCase <= 'Z') {
                if (length == 2 && !FileSystem.getCurrent().supportsDriveLetter()) {
                    return 0;
                }
                if (length == 2 || !isSeparator(str.charAt(2))) {
                    return 2;
                }
                return 3;
            }
            if (upperCase != '/') {
                return -1;
            }
            return 1;
        }
        if (!isSeparator(charAt) || !isSeparator(charAt2)) {
            return isSeparator(charAt) ? 1 : 0;
        }
        int indexOf3 = str.indexOf(47, 2);
        int indexOf4 = str.indexOf(92, 2);
        if ((indexOf3 != -1 || indexOf4 != -1) && indexOf3 != 2 && indexOf4 != 2) {
            if (indexOf3 == -1) {
                indexOf3 = indexOf4;
            }
            if (indexOf4 == -1) {
                indexOf4 = indexOf3;
            }
            int min = Math.min(indexOf3, indexOf4);
            int i10 = min + 1;
            if (isValidHostName(str.substring(2, min))) {
                return i10;
            }
        }
        return -1;
    }

    public static int indexOfExtension(String str) {
        if (str == null) {
            return -1;
        }
        if (isSystemWindows() && str.indexOf(58, getAdsCriticalOffset(str)) != -1) {
            j1.i.k("NTFS ADS separator (':') in file name is forbidden.");
            return 0;
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (indexOfLastSeparator(str) > lastIndexOf) {
            return -1;
        }
        return lastIndexOf;
    }

    public static int indexOfLastSeparator(String str) {
        if (str == null) {
            return -1;
        }
        return Math.max(str.lastIndexOf(47), str.lastIndexOf(92));
    }

    private static boolean isEmpty(String str) {
        if (str != null && !str.isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean isExtension(String str, String... strArr) {
        if (str != null) {
            requireNonNullChars(str);
            if (strArr != null && strArr.length != 0) {
                String extension = getExtension(str);
                Stream of = Stream.of((Object[]) strArr);
                Objects.requireNonNull(extension);
                return of.anyMatch(new a(extension, 1));
            }
            if (indexOfExtension(str) == -1) {
                return true;
            }
            return false;
        }
        return false;
    }

    private static boolean isIPv4Address(String str) {
        Matcher matcher = IPV4_PATTERN.matcher(str);
        if (!matcher.matches() || matcher.groupCount() != 4) {
            return false;
        }
        for (int i10 = 1; i10 <= 4; i10++) {
            String group = matcher.group(i10);
            if (Integer.parseInt(group) > 255) {
                return false;
            }
            if (group.length() > 1 && group.startsWith("0")) {
                return false;
            }
        }
        return true;
    }

    private static boolean isIPv6Address(String str) {
        boolean contains = str.contains("::");
        if (contains && str.indexOf("::") != str.lastIndexOf("::")) {
            return false;
        }
        if ((str.startsWith(":") && !str.startsWith("::")) || (str.endsWith(":") && !str.endsWith("::"))) {
            return false;
        }
        String[] split = str.split(":");
        if (contains) {
            ArrayList arrayList = new ArrayList(Arrays.asList(split));
            if (str.endsWith("::")) {
                arrayList.add("");
            } else if (str.startsWith("::") && !arrayList.isEmpty()) {
                arrayList.remove(0);
            }
            split = (String[]) arrayList.toArray(EMPTY_STRING_ARRAY);
        }
        if (split.length > 8) {
            return false;
        }
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < split.length; i12++) {
            String str2 = split[i12];
            if (str2.isEmpty()) {
                i11++;
                if (i11 > 1) {
                    return false;
                }
            } else if (i12 == split.length - 1 && str2.contains(".")) {
                if (!isIPv4Address(str2)) {
                    return false;
                }
                i10 += 2;
                i11 = 0;
            } else {
                if (str2.length() > 4) {
                    return false;
                }
                try {
                    int parseInt = Integer.parseInt(str2, 16);
                    if (parseInt >= 0 && parseInt <= 65535) {
                        i11 = 0;
                    }
                } catch (NumberFormatException unused) {
                }
                return false;
            }
            i10++;
        }
        if (i10 > 8 || (i10 < 8 && !contains)) {
            return false;
        }
        return true;
    }

    private static boolean isRFC3986HostName(String str) {
        String[] split = str.split("\\.", -1);
        for (int i10 = 0; i10 < split.length; i10++) {
            if (split[i10].isEmpty()) {
                if (i10 != split.length - 1) {
                    return false;
                }
                return true;
            }
            if (!REG_NAME_PART_PATTERN.matcher(split[i10]).matches()) {
                return false;
            }
        }
        return true;
    }

    private static boolean isSeparator(char c) {
        if (c != '/' && c != '\\') {
            return false;
        }
        return true;
    }

    public static boolean isSystemWindows() {
        if (SYSTEM_NAME_SEPARATOR == '\\') {
            return true;
        }
        return false;
    }

    private static boolean isValidHostName(String str) {
        if (!isIPv6Address(str) && !isRFC3986HostName(str)) {
            return false;
        }
        return true;
    }

    public static String normalize(String str, boolean z9) {
        return doNormalize(str, toSeparator(z9), true);
    }

    public static String normalizeNoEndSeparator(String str, boolean z9) {
        return doNormalize(str, toSeparator(z9), false);
    }

    public static String removeExtension(String str) {
        if (str == null) {
            return null;
        }
        requireNonNullChars(str);
        int indexOfExtension = indexOfExtension(str);
        if (indexOfExtension == -1) {
            return str;
        }
        return str.substring(0, indexOfExtension);
    }

    private static String requireNonNullChars(String str) {
        if (str.indexOf(0) < 0) {
            return str;
        }
        j1.i.k("Null character present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it");
        return null;
    }

    public static String separatorsToSystem(String str) {
        return FileSystem.getCurrent().normalizeSeparators(str);
    }

    public static String separatorsToUnix(String str) {
        return FileSystem.LINUX.normalizeSeparators(str);
    }

    public static String separatorsToWindows(String str) {
        return FileSystem.WINDOWS.normalizeSeparators(str);
    }

    public static String[] splitOnTokens(String str) {
        if (str.indexOf(63) == -1 && str.indexOf(42) == -1) {
            return new String[]{str};
        }
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int length = charArray.length;
        int i10 = 0;
        char c = 0;
        while (i10 < length) {
            char c10 = charArray[i10];
            if (c10 != '?' && c10 != '*') {
                sb.append(c10);
            } else {
                if (sb.length() != 0) {
                    arrayList.add(sb.toString());
                    sb.setLength(0);
                }
                if (c10 == '?') {
                    arrayList.add("?");
                } else if (c != '*') {
                    arrayList.add("*");
                }
            }
            i10++;
            c = c10;
        }
        if (sb.length() != 0) {
            arrayList.add(sb.toString());
        }
        return (String[]) arrayList.toArray(EMPTY_STRING_ARRAY);
    }

    private static char toSeparator(boolean z9) {
        if (z9) {
            return '/';
        }
        return '\\';
    }

    public static boolean wildcardMatch(String str, String str2, IOCase iOCase) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str != null && str2 != null) {
            IOCase value = IOCase.value(iOCase, IOCase.SENSITIVE);
            String[] splitOnTokens = splitOnTokens(str2);
            ArrayDeque arrayDeque = new ArrayDeque(splitOnTokens.length);
            boolean z9 = false;
            int i10 = 0;
            int i11 = 0;
            do {
                if (!arrayDeque.isEmpty()) {
                    int[] iArr = (int[]) arrayDeque.pop();
                    i11 = iArr[0];
                    i10 = iArr[1];
                    z9 = true;
                }
                while (i11 < splitOnTokens.length) {
                    if (splitOnTokens[i11].equals("?")) {
                        i10++;
                        if (i10 > str.length()) {
                            break;
                        }
                        z9 = false;
                        i11++;
                    } else if (splitOnTokens[i11].equals("*")) {
                        if (i11 == splitOnTokens.length - 1) {
                            i10 = str.length();
                        }
                        z9 = true;
                        i11++;
                    } else {
                        if (z9) {
                            i10 = value.checkIndexOf(str, i10, splitOnTokens[i11]);
                            if (i10 == -1) {
                                break;
                            }
                            int checkIndexOf = value.checkIndexOf(str, i10 + 1, splitOnTokens[i11]);
                            if (checkIndexOf >= 0) {
                                arrayDeque.push(new int[]{i11, checkIndexOf});
                            }
                            i10 = splitOnTokens[i11].length() + i10;
                            z9 = false;
                        } else {
                            if (!value.checkRegionMatches(str, i10, splitOnTokens[i11])) {
                                break;
                            }
                            i10 = splitOnTokens[i11].length() + i10;
                            z9 = false;
                        }
                        i11++;
                    }
                }
                if (i11 == splitOnTokens.length && i10 == str.length()) {
                    return true;
                }
            } while (!arrayDeque.isEmpty());
        }
        return false;
    }

    public static boolean wildcardMatchOnSystem(String str, String str2) {
        return wildcardMatch(str, str2, IOCase.SYSTEM);
    }

    public static String normalize(String str) {
        return doNormalize(str, SYSTEM_NAME_SEPARATOR, true);
    }

    public static String normalizeNoEndSeparator(String str) {
        return doNormalize(str, SYSTEM_NAME_SEPARATOR, false);
    }

    public static boolean equals(String str, String str2) {
        return equals(str, str2, false, IOCase.SENSITIVE);
    }

    public static boolean isExtension(String str, String str2) {
        if (str == null) {
            return false;
        }
        requireNonNullChars(str);
        if (isEmpty(str2)) {
            return indexOfExtension(str) == -1;
        }
        return getExtension(str).equals(str2);
    }

    public static boolean isExtension(String str, Collection<String> collection) {
        if (str == null) {
            return false;
        }
        requireNonNullChars(str);
        if (collection == null || collection.isEmpty()) {
            return indexOfExtension(str) == -1;
        }
        return collection.contains(getExtension(str));
    }

    public static boolean wildcardMatch(String str, String str2) {
        return wildcardMatch(str, str2, IOCase.SENSITIVE);
    }
}
