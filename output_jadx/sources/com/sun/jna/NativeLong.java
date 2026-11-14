package com.sun.jna;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class NativeLong extends IntegerType {
    public static final int SIZE = Native.LONG_SIZE;
    private static final long serialVersionUID = 1;

    public NativeLong() {
        this(0L);
    }

    public NativeLong(long j10) {
        this(j10, false);
    }

    public NativeLong(long j10, boolean z9) {
        super(SIZE, j10, z9);
    }
}
