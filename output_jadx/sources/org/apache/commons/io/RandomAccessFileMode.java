package org.apache.commons.io;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Objects;
import org.apache.commons.io.function.IOConsumer;
import org.apache.commons.io.function.IOFunction;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public enum RandomAccessFileMode {
    READ_ONLY(R, 1),
    READ_WRITE(RW, 2),
    READ_WRITE_SYNC_ALL(RWS, 4),
    READ_WRITE_SYNC_CONTENT(RWD, 3);

    private static final String R = "r";
    private static final String RW = "rw";
    private static final String RWD = "rwd";
    private static final String RWS = "rws";
    private final int level;
    private final String mode;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* renamed from: org.apache.commons.io.RandomAccessFileMode$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$nio$file$StandardOpenOption;

        static {
            StandardOpenOption[] values;
            int ordinal;
            int ordinal2;
            int ordinal3;
            StandardOpenOption unused;
            StandardOpenOption unused2;
            StandardOpenOption unused3;
            values = StandardOpenOption.values();
            int[] iArr = new int[values.length];
            $SwitchMap$java$nio$file$StandardOpenOption = iArr;
            try {
                unused = StandardOpenOption.WRITE;
                ordinal3 = StandardOpenOption.WRITE.ordinal();
                iArr[ordinal3] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int[] iArr2 = $SwitchMap$java$nio$file$StandardOpenOption;
                unused2 = StandardOpenOption.DSYNC;
                ordinal2 = StandardOpenOption.DSYNC.ordinal();
                iArr2[ordinal2] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                int[] iArr3 = $SwitchMap$java$nio$file$StandardOpenOption;
                unused3 = StandardOpenOption.SYNC;
                ordinal = StandardOpenOption.SYNC.ordinal();
                iArr3[ordinal] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    RandomAccessFileMode(String str, int i10) {
        this.mode = str;
        this.level = i10;
    }

    private int getLevel() {
        return this.level;
    }

    public static RandomAccessFileMode valueOf(OpenOption... openOptionArr) {
        int ordinal;
        RandomAccessFileMode randomAccessFileMode;
        RandomAccessFileMode randomAccessFileMode2 = READ_ONLY;
        for (OpenOption openOption : openOptionArr) {
            if (d.v(openOption)) {
                int[] iArr = AnonymousClass1.$SwitchMap$java$nio$file$StandardOpenOption;
                ordinal = d.k(openOption).ordinal();
                int i10 = iArr[ordinal];
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            randomAccessFileMode = READ_WRITE_SYNC_ALL;
                            if (randomAccessFileMode2.implies(randomAccessFileMode)) {
                            }
                            randomAccessFileMode2 = randomAccessFileMode;
                        }
                    } else {
                        randomAccessFileMode = READ_WRITE_SYNC_CONTENT;
                        if (randomAccessFileMode2.implies(randomAccessFileMode)) {
                        }
                        randomAccessFileMode2 = randomAccessFileMode;
                    }
                } else {
                    randomAccessFileMode = READ_WRITE;
                    if (randomAccessFileMode2.implies(randomAccessFileMode)) {
                    }
                    randomAccessFileMode2 = randomAccessFileMode;
                }
            }
        }
        return randomAccessFileMode2;
    }

    public static RandomAccessFileMode valueOfMode(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case 114:
                if (str.equals(R)) {
                    c = 0;
                    break;
                }
                break;
            case 3653:
                if (str.equals(RW)) {
                    c = 1;
                    break;
                }
                break;
            case 113343:
                if (str.equals(RWD)) {
                    c = 2;
                    break;
                }
                break;
            case 113358:
                if (str.equals(RWS)) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return READ_ONLY;
            case 1:
                return READ_WRITE;
            case 2:
                return READ_WRITE_SYNC_CONTENT;
            case 3:
                return READ_WRITE_SYNC_ALL;
            default:
                j1.i.k(str);
                return null;
        }
    }

    public void accept(Path path, IOConsumer<RandomAccessFile> iOConsumer) {
        RandomAccessFile create = create(path);
        try {
            iOConsumer.accept(create);
            if (create != null) {
                create.close();
            }
        } catch (Throwable th) {
            if (create != null) {
                try {
                    create.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public <T> T apply(Path path, IOFunction<RandomAccessFile, T> iOFunction) {
        RandomAccessFile create = create(path);
        try {
            T apply = iOFunction.apply(create);
            if (create != null) {
                create.close();
            }
            return apply;
        } catch (Throwable th) {
            if (create != null) {
                try {
                    create.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public RandomAccessFile create(Path path) {
        File file;
        file = path.toFile();
        Objects.requireNonNull(file, "file");
        return create(file);
    }

    public String getMode() {
        return this.mode;
    }

    public boolean implies(RandomAccessFileMode randomAccessFileMode) {
        if (getLevel() >= randomAccessFileMode.getLevel()) {
            return true;
        }
        return false;
    }

    public IORandomAccessFile io(String str) {
        return new IORandomAccessFile(str, this.mode);
    }

    public RandomAccessFile create(File file) {
        return new IORandomAccessFile(file, this.mode);
    }

    public RandomAccessFile create(String str) {
        return new IORandomAccessFile(str, this.mode);
    }
}
