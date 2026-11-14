package com.sun.jna;

import androidx.navigation.b;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class IntegerType extends Number implements NativeMapped {
    private static final long serialVersionUID = 1;
    private Number number;
    private int size;
    private boolean unsigned;
    private long value;

    public IntegerType(int i10, long j10, boolean z9) {
        this.size = i10;
        this.unsigned = z9;
        setValue(j10);
    }

    public static <T extends IntegerType> int compare(T t, T t3) {
        if (t == t3) {
            return 0;
        }
        if (t == null) {
            return 1;
        }
        if (t3 == null) {
            return -1;
        }
        return compare(t.longValue(), t3.longValue());
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.number.doubleValue();
    }

    public boolean equals(Object obj) {
        if ((obj instanceof IntegerType) && this.number.equals(((IntegerType) obj).number)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.number.floatValue();
    }

    @Override // com.sun.jna.NativeMapped
    public Object fromNative(Object obj, FromNativeContext fromNativeContext) {
        long longValue;
        if (obj == null) {
            longValue = 0;
        } else {
            longValue = ((Number) obj).longValue();
        }
        IntegerType integerType = (IntegerType) Klass.newInstance(getClass());
        integerType.setValue(longValue);
        return integerType;
    }

    public int hashCode() {
        return this.number.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.value;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.value;
    }

    @Override // com.sun.jna.NativeMapped
    public Class<?> nativeType() {
        return this.number.getClass();
    }

    public void setValue(long j10) {
        long j11;
        this.value = j10;
        int i10 = this.size;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 == 8) {
                        this.number = Long.valueOf(j10);
                        j11 = j10;
                    } else {
                        b.b(this.size, "Unsupported size: ");
                        return;
                    }
                } else {
                    if (this.unsigned) {
                        this.value = 4294967295L & j10;
                    }
                    int i11 = (int) j10;
                    j11 = i11;
                    this.number = Integer.valueOf(i11);
                }
            } else {
                if (this.unsigned) {
                    this.value = WebSocketProtocol.PAYLOAD_SHORT_MAX & j10;
                }
                short s5 = (short) j10;
                j11 = s5;
                this.number = Short.valueOf(s5);
            }
        } else {
            if (this.unsigned) {
                this.value = 255 & j10;
            }
            byte b10 = (byte) j10;
            j11 = b10;
            this.number = Byte.valueOf(b10);
        }
        int i12 = this.size;
        if (i12 < 8) {
            long j12 = ~((1 << (i12 * 8)) - 1);
            if ((j10 < 0 && j11 != j10) || (j10 >= 0 && (j12 & j10) != 0)) {
                throw new IllegalArgumentException("Argument value 0x" + Long.toHexString(j10) + " exceeds native capacity (" + this.size + " bytes) mask=0x" + Long.toHexString(j12));
            }
        }
    }

    @Override // com.sun.jna.NativeMapped
    public Object toNative() {
        return this.number;
    }

    public String toString() {
        return this.number.toString();
    }

    public IntegerType(int i10, boolean z9) {
        this(i10, 0L, z9);
    }

    public IntegerType(int i10, long j10) {
        this(i10, j10, false);
    }

    public IntegerType(int i10) {
        this(i10, 0L, false);
    }

    public static final int compare(long j10, long j11) {
        if (j10 == j11) {
            return 0;
        }
        return j10 < j11 ? -1 : 1;
    }

    public static int compare(IntegerType integerType, long j10) {
        if (integerType == null) {
            return 1;
        }
        return compare(integerType.longValue(), j10);
    }
}
