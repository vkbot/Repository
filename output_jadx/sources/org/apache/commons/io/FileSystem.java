package org.apache.commons.io;

import androidx.core.view.PointerIconCompat;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.text.BreakIterator;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import org.apache.commons.net.ftp.FTPClientConfig;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'GENERIC' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class FileSystem {
    private static final /* synthetic */ FileSystem[] $VALUES;
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final FileSystem CURRENT;
    public static final FileSystem GENERIC;
    private static final boolean IS_OS_LINUX;
    private static final boolean IS_OS_MAC;
    private static final boolean IS_OS_WINDOWS;
    public static final FileSystem LINUX;
    public static final FileSystem MAC_OSX;
    private static final String OS_NAME_WINDOWS_PREFIX = "Windows";
    public static final FileSystem WINDOWS;
    private final int blockSize;
    private final boolean casePreserving;
    private final boolean caseSensitive;
    private final int[] illegalFileNameChars;
    private final int maxFileNameLength;
    private final int maxPathLength;
    private final NameLengthStrategy nameLengthStrategy;
    private final char nameSeparator;
    private final char nameSeparatorOther;
    private final String[] reservedFileNames;
    private final boolean reservedFileNamesExtensions;
    private final boolean supportsDriveLetter;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public enum NameLengthStrategy {
        BYTES { // from class: org.apache.commons.io.FileSystem.NameLengthStrategy.1
            @Override // org.apache.commons.io.FileSystem.NameLengthStrategy
            public int getLength(CharSequence charSequence, Charset charset) {
                CharsetEncoder newEncoder = charset.newEncoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                try {
                    return newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(charSequence)).remaining();
                } catch (CharacterCodingException unused) {
                    return Integer.MAX_VALUE;
                }
            }

            @Override // org.apache.commons.io.FileSystem.NameLengthStrategy
            public CharSequence truncate(CharSequence charSequence, int i10, Charset charset) {
                CharsetEncoder newEncoder = charset.newEncoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                CharsetEncoder onUnmappableCharacter = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
                if (onUnmappableCharacter.canEncode(charSequence)) {
                    if (charSequence.length() > Math.floor(i10 / onUnmappableCharacter.maxBytesPerChar())) {
                        CharSequence[] splitExtension = FileSystem.splitExtension(charSequence);
                        int length = getLength(splitExtension[1], charset);
                        if (length > 0 && length >= i10) {
                            throw new IllegalArgumentException("The extension of " + ((Object) charSequence) + " is too long to fit within " + i10 + " bytes");
                        }
                        ByteBuffer allocate = ByteBuffer.allocate(i10 - length);
                        CharBuffer wrap = CharBuffer.wrap(splitExtension[0]);
                        if (!onUnmappableCharacter.encode(wrap, allocate, true).isUnderflow()) {
                            CharSequence safeTruncate = FileSystem.safeTruncate(charSequence, wrap.position());
                            if (length == 0) {
                                return safeTruncate;
                            }
                            return safeTruncate.toString() + ((Object) splitExtension[1]);
                        }
                    }
                    return charSequence;
                }
                StringBuilder sb = new StringBuilder("The value ");
                sb.append((Object) charSequence);
                androidx.navigation.b.s(sb, " cannot be encoded using ", charset.name());
                return null;
            }
        },
        UTF16_CODE_UNITS { // from class: org.apache.commons.io.FileSystem.NameLengthStrategy.2
            @Override // org.apache.commons.io.FileSystem.NameLengthStrategy
            public int getLength(CharSequence charSequence, Charset charset) {
                return charSequence.length();
            }

            @Override // org.apache.commons.io.FileSystem.NameLengthStrategy
            public CharSequence truncate(CharSequence charSequence, int i10, Charset charset) {
                Charset charset2 = StandardCharsets.UTF_16;
                if (charset2.newEncoder().canEncode(charSequence)) {
                    if (charSequence.length() <= i10) {
                        return charSequence;
                    }
                    CharSequence[] splitExtension = FileSystem.splitExtension(charSequence);
                    int length = splitExtension[1].length();
                    if (length <= 0 || length < i10) {
                        CharSequence safeTruncate = FileSystem.safeTruncate(charSequence, i10 - length);
                        if (length == 0) {
                            return safeTruncate;
                        }
                        return safeTruncate.toString() + ((Object) splitExtension[1]);
                    }
                    throw new IllegalArgumentException("The extension of " + ((Object) charSequence) + " is too long to fit within " + i10 + " characters");
                }
                StringBuilder sb = new StringBuilder("The value ");
                sb.append((Object) charSequence);
                androidx.navigation.b.s(sb, " can not be encoded using ", charset2.name());
                return null;
            }
        };

        public abstract int getLength(CharSequence charSequence, Charset charset);

        public final boolean isWithinLimit(CharSequence charSequence, int i10, Charset charset) {
            if (getLength(charSequence, charset) <= i10) {
                return true;
            }
            return false;
        }

        public abstract CharSequence truncate(CharSequence charSequence, int i10, Charset charset);
    }

    private static /* synthetic */ FileSystem[] $values() {
        return new FileSystem[]{GENERIC, LINUX, MAC_OSX, WINDOWS};
    }

    static {
        NameLengthStrategy nameLengthStrategy = NameLengthStrategy.BYTES;
        GENERIC = new FileSystem("GENERIC", 0, 4096, false, false, PointerIconCompat.TYPE_GRAB, 1048576, new int[]{0}, new String[0], false, false, IOUtils.DIR_SEPARATOR_UNIX, nameLengthStrategy);
        LINUX = new FileSystem("LINUX", 1, 8192, true, true, 255, 4096, new int[]{0, 47}, new String[0], false, false, IOUtils.DIR_SEPARATOR_UNIX, nameLengthStrategy);
        MAC_OSX = new FileSystem("MAC_OSX", 2, 4096, true, true, 255, 1024, new int[]{0, 47, 58}, new String[0], false, false, IOUtils.DIR_SEPARATOR_UNIX, nameLengthStrategy);
        WINDOWS = new FileSystem(FTPClientConfig.SYST_NT, 3, 4096, false, true, 255, 32767, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 34, 42, 47, 58, 60, 62, 63, 92, 124}, new String[]{"AUX", "COM1", "COM2", "COM3", "COM4", "COM5", "COM6", "COM7", "COM8", "COM9", "COM²", "COM³", "COM¹", "CON", "CONIN$", "CONOUT$", "LPT1", "LPT2", "LPT3", "LPT4", "LPT5", "LPT6", "LPT7", "LPT8", "LPT9", "LPT²", "LPT³", "LPT¹", "NUL", "PRN"}, true, true, IOUtils.DIR_SEPARATOR_WINDOWS, NameLengthStrategy.UTF16_CODE_UNITS);
        $VALUES = $values();
        IS_OS_LINUX = getOsMatchesName("Linux");
        IS_OS_MAC = getOsMatchesName("Mac");
        IS_OS_WINDOWS = getOsMatchesName(OS_NAME_WINDOWS_PREFIX);
        CURRENT = current();
    }

    private FileSystem(String str, int i10, int i11, boolean z9, boolean z10, int i12, int i13, int[] iArr, String[] strArr, boolean z11, boolean z12, char c, NameLengthStrategy nameLengthStrategy) {
        this.blockSize = i11;
        this.maxFileNameLength = i12;
        this.maxPathLength = i13;
        Objects.requireNonNull(iArr, "illegalFileNameChars");
        this.illegalFileNameChars = iArr;
        Objects.requireNonNull(strArr, "reservedFileNames");
        this.reservedFileNames = strArr;
        this.reservedFileNamesExtensions = z11;
        this.caseSensitive = z9;
        this.casePreserving = z10;
        this.supportsDriveLetter = z12;
        this.nameSeparator = c;
        this.nameSeparatorOther = FilenameUtils.flipSeparator(c);
        this.nameLengthStrategy = nameLengthStrategy;
    }

    private static FileSystem current() {
        if (IS_OS_LINUX) {
            return LINUX;
        }
        if (IS_OS_MAC) {
            return MAC_OSX;
        }
        if (IS_OS_WINDOWS) {
            return WINDOWS;
        }
        return GENERIC;
    }

    public static FileSystem getCurrent() {
        return CURRENT;
    }

    private static boolean getOsMatchesName(String str) {
        return isOsNameMatch(getSystemProperty("os.name"), str);
    }

    private static String getSystemProperty(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            System.err.println("Caught a SecurityException reading the system property '" + str + "'; the SystemUtils property value will default to null.");
            return null;
        }
    }

    private static int indexOfFirstDot(CharSequence charSequence) {
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(46);
        }
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (charSequence.charAt(i10) == '.') {
                return i10;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isIllegalFileNameChar(int i10) {
        if (Arrays.binarySearch(this.illegalFileNameChars, i10) >= 0) {
            return true;
        }
        return false;
    }

    private static boolean isOsNameMatch(String str, String str2) {
        if (str == null) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str.toUpperCase(locale).startsWith(str2.toUpperCase(locale));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ int lambda$toLegalFileName$0(char c, int i10) {
        if (isIllegalFileNameChar(i10)) {
            return c;
        }
        return i10;
    }

    private static String replace(String str, char c, char c10) {
        if (str == null) {
            return null;
        }
        return str.replace(c, c10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CharSequence safeTruncate(CharSequence charSequence, int i10) {
        String str;
        if (charSequence.length() <= i10) {
            return charSequence;
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance(Locale.ROOT);
        String charSequence2 = charSequence.toString();
        characterInstance.setText(charSequence2);
        int preceding = characterInstance.preceding(i10 + 1);
        if (preceding == 0) {
            if (i10 <= 1) {
                str = "1 character";
            } else {
                str = i10 + " characters";
            }
            androidx.navigation.b.r("The value ", charSequence, " can not be truncated to ", str, " without breaking the first codepoint or grapheme cluster");
            return null;
        }
        return charSequence2.substring(0, preceding);
    }

    public static CharSequence[] splitExtension(CharSequence charSequence) {
        int indexOfFirstDot = indexOfFirstDot(charSequence);
        if (indexOfFirstDot < 1) {
            return new CharSequence[]{charSequence, ""};
        }
        return new CharSequence[]{charSequence.subSequence(0, indexOfFirstDot), charSequence.subSequence(indexOfFirstDot, charSequence.length())};
    }

    public static CharSequence trimExtension(CharSequence charSequence) {
        int indexOfFirstDot = indexOfFirstDot(charSequence);
        if (indexOfFirstDot < 1) {
            return charSequence;
        }
        return charSequence.subSequence(0, indexOfFirstDot);
    }

    public static FileSystem valueOf(String str) {
        return (FileSystem) Enum.valueOf(FileSystem.class, str);
    }

    public static FileSystem[] values() {
        return (FileSystem[]) $VALUES.clone();
    }

    public int getBlockSize() {
        return this.blockSize;
    }

    public char[] getIllegalFileNameChars() {
        char[] cArr = new char[this.illegalFileNameChars.length];
        int i10 = 0;
        while (true) {
            int[] iArr = this.illegalFileNameChars;
            if (i10 < iArr.length) {
                cArr[i10] = (char) iArr[i10];
                i10++;
            } else {
                return cArr;
            }
        }
    }

    public int[] getIllegalFileNameCodePoints() {
        return (int[]) this.illegalFileNameChars.clone();
    }

    public int getMaxFileNameLength() {
        return this.maxFileNameLength;
    }

    public int getMaxPathLength() {
        return this.maxPathLength;
    }

    public NameLengthStrategy getNameLengthStrategy() {
        return this.nameLengthStrategy;
    }

    public char getNameSeparator() {
        return this.nameSeparator;
    }

    public String[] getReservedFileNames() {
        return (String[]) this.reservedFileNames.clone();
    }

    public boolean isCasePreserving() {
        return this.casePreserving;
    }

    public boolean isCaseSensitive() {
        return this.caseSensitive;
    }

    public boolean isLegalFileName(CharSequence charSequence, Charset charset) {
        if (charSequence != null && charSequence.length() != 0 && this.nameLengthStrategy.isWithinLimit(charSequence, getMaxFileNameLength(), charset) && !isReservedFileName(charSequence) && charSequence.chars().noneMatch(new IntPredicate() { // from class: org.apache.commons.io.c
            @Override // java.util.function.IntPredicate
            public final boolean test(int i10) {
                boolean isIllegalFileNameChar;
                isIllegalFileNameChar = FileSystem.this.isIllegalFileNameChar(i10);
                return isIllegalFileNameChar;
            }
        })) {
            return true;
        }
        return false;
    }

    public boolean isReservedFileName(CharSequence charSequence) {
        if (this.reservedFileNamesExtensions) {
            charSequence = trimExtension(charSequence);
        }
        if (Arrays.binarySearch(this.reservedFileNames, charSequence) >= 0) {
            return true;
        }
        return false;
    }

    public String normalizeSeparators(String str) {
        return replace(str, this.nameSeparatorOther, this.nameSeparator);
    }

    public boolean supportsDriveLetter() {
        return this.supportsDriveLetter;
    }

    public String toLegalFileName(CharSequence charSequence, final char c, Charset charset) {
        Object valueOf;
        Objects.requireNonNull(charSequence, "candidate");
        if (charSequence.length() != 0) {
            if (isIllegalFileNameChar(c)) {
                if (c == 0) {
                    valueOf = "\\0";
                } else {
                    valueOf = Character.valueOf(c);
                }
                throw new IllegalArgumentException(String.format("The replacement character '%s' cannot be one of the %s illegal characters: %s", valueOf, name(), Arrays.toString(this.illegalFileNameChars)));
            }
            int[] array = this.nameLengthStrategy.truncate(charSequence, getMaxFileNameLength(), charset).chars().map(new IntUnaryOperator() { // from class: org.apache.commons.io.b
                @Override // java.util.function.IntUnaryOperator
                public final int applyAsInt(int i10) {
                    int lambda$toLegalFileName$0;
                    lambda$toLegalFileName$0 = FileSystem.this.lambda$toLegalFileName$0(c, i10);
                    return lambda$toLegalFileName$0;
                }
            }).toArray();
            return new String(array, 0, array.length);
        }
        j1.i.k("The candidate file name is empty");
        return null;
    }

    public boolean isLegalFileName(CharSequence charSequence) {
        return isLegalFileName(charSequence, Charset.defaultCharset());
    }

    public String toLegalFileName(String str, char c) {
        return toLegalFileName(str, c, Charset.defaultCharset());
    }
}
