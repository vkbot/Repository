package p7;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final l9.l f5107a;

    /* renamed from: b, reason: collision with root package name */
    public int f5108b;
    public int c;

    public u(int i10, l9.l lVar) {
        this.f5107a = lVar;
        this.f5108b = i10;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        this.f5107a.m1558write(bArr, i10, i11);
        this.f5108b -= i11;
        this.c += i11;
    }
}
