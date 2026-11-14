package androidx.core.math;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class MathUtils {
    private MathUtils() {
    }

    public static long addExact(long j10, long j11) {
        boolean z9;
        boolean z10;
        boolean z11;
        long j12 = j10 + j11;
        boolean z12 = false;
        if (j10 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (j11 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 == z10) {
            if (j10 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (j12 >= 0) {
                z12 = true;
            }
            if (z11 != z12) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return j12;
    }

    public static double clamp(double d, double d10, double d11) {
        if (d < d10) {
            return d10;
        }
        if (d > d11) {
            return d11;
        }
        return d;
    }

    public static long decrementExact(long j10) {
        if (j10 != Long.MIN_VALUE) {
            return j10 - 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long incrementExact(long j10) {
        if (j10 != Long.MAX_VALUE) {
            return j10 + 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long multiplyExact(long j10, long j11) {
        long j12 = j10 * j11;
        if (j10 != 0 && j11 != 0 && (j12 / j10 != j11 || j12 / j11 != j10)) {
            throw new ArithmeticException("integer overflow");
        }
        return j12;
    }

    public static long negateExact(long j10) {
        if (j10 != Long.MIN_VALUE) {
            return -j10;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long subtractExact(long j10, long j11) {
        boolean z9;
        boolean z10;
        boolean z11;
        long j12 = j10 - j11;
        boolean z12 = false;
        if (j10 < 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (j11 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 != z10) {
            if (j10 < 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (j12 < 0) {
                z12 = true;
            }
            if (z11 != z12) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return j12;
    }

    public static int toIntExact(long j10) {
        if (j10 <= 2147483647L && j10 >= -2147483648L) {
            return (int) j10;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static float clamp(float f8, float f10, float f11) {
        return f8 < f10 ? f10 : f8 > f11 ? f11 : f8;
    }

    public static int clamp(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
    }

    public static long clamp(long j10, long j11, long j12) {
        return j10 < j11 ? j11 : j10 > j12 ? j12 : j10;
    }

    public static int negateExact(int i10) {
        if (i10 != Integer.MIN_VALUE) {
            return -i10;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int decrementExact(int i10) {
        if (i10 != Integer.MIN_VALUE) {
            return i10 - 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int incrementExact(int i10) {
        if (i10 != Integer.MAX_VALUE) {
            return i10 + 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int multiplyExact(int i10, int i11) {
        int i12 = i10 * i11;
        if (i10 == 0 || i11 == 0 || (i12 / i10 == i11 && i12 / i11 == i10)) {
            return i12;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int addExact(int i10, int i11) {
        int i12 = i10 + i11;
        if ((i10 >= 0) == (i11 >= 0)) {
            if ((i10 >= 0) != (i12 >= 0)) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return i12;
    }

    public static int subtractExact(int i10, int i11) {
        int i12 = i10 - i11;
        if ((i10 < 0) != (i11 < 0)) {
            if ((i10 < 0) != (i12 < 0)) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return i12;
    }
}
