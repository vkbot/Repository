package com.google.protobuf;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public int f1579a;

    /* renamed from: b, reason: collision with root package name */
    public int f1580b = 100;
    public c3.i c;

    public static h d(byte[] bArr, int i10, int i11, boolean z9) {
        h hVar = new h(bArr, i10, i11, z9);
        try {
            hVar.f(i11);
            return hVar;
        } catch (d0 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract void a(int i10);

    public abstract int b();

    public abstract boolean c();

    public abstract void e(int i10);

    public abstract int f(int i10);

    public abstract boolean g();

    public abstract g h();

    public abstract double i();

    public abstract int j();

    public abstract int k();

    public abstract long l();

    public abstract float m();

    public abstract int n();

    public abstract long o();

    public abstract int p();

    public abstract long q();

    public abstract int r();

    public abstract long s();

    public abstract String t();

    public abstract String u();

    public abstract int v();

    public abstract int w();

    public abstract long x();

    public abstract boolean y(int i10);
}
