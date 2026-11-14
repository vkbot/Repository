package p7;

import java.io.IOException;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: b, reason: collision with root package name */
    public final int f5110b;
    public int c;
    public int d;
    public final j e;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b7.p f5112g;

    /* renamed from: a, reason: collision with root package name */
    public final l9.l f5109a = new Object();

    /* renamed from: f, reason: collision with root package name */
    public boolean f5111f = false;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, l9.l] */
    public v(b7.p pVar, int i10, int i11, j jVar) {
        this.f5112g = pVar;
        this.f5110b = i10;
        this.c = i11;
        this.e = jVar;
    }

    public final int a(int i10) {
        if (i10 > 0 && Integer.MAX_VALUE - i10 < this.c) {
            androidx.navigation.b.b(this.f5110b, "Window size overflow for stream: ");
            return 0;
        }
        int i11 = this.c + i10;
        this.c = i11;
        return i11;
    }

    public final void b(int i10, boolean z9, l9.l lVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean f8;
        do {
            int min = Math.min(i10, ((d) this.f5112g.d).c.f5019b.e);
            int i11 = -min;
            ((v) this.f5112g.e).a(i11);
            a(i11);
            try {
                boolean z13 = false;
                if (lVar.c == min && z9) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ((d) this.f5112g.d).b(z10, this.f5110b, lVar, min);
                j jVar = this.e;
                synchronized (jVar.f4415b) {
                    o4.b.m(jVar.f4416f, "onStreamAllocated was not called, but it seems the stream is active");
                    int i12 = jVar.e;
                    if (i12 < 32768) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i13 = i12 - min;
                    jVar.e = i13;
                    if (i13 < 32768) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z11 && z12) {
                        z13 = true;
                    }
                }
                if (z13) {
                    synchronized (jVar.f4415b) {
                        f8 = jVar.f();
                    }
                    if (f8) {
                        jVar.f4420j.j();
                    }
                }
                i10 -= min;
            } catch (IOException e) {
                n0.b.w(e);
                return;
            }
        } while (i10 > 0);
    }

    public final void c(int i10, c9.i iVar) {
        int i11 = this.c;
        b7.p pVar = this.f5112g;
        int min = Math.min(i10, Math.min(i11, ((v) pVar.e).c));
        int i12 = 0;
        while (true) {
            l9.l lVar = this.f5109a;
            long j10 = lVar.c;
            if (j10 > 0 && min > 0) {
                if (min >= j10) {
                    int i13 = (int) j10;
                    i12 += i13;
                    b(i13, this.f5111f, lVar);
                } else {
                    i12 += min;
                    b(min, false, lVar);
                }
                iVar.f599b++;
                min = Math.min(i10 - i12, Math.min(this.c, ((v) pVar.e).c));
            } else {
                return;
            }
        }
    }
}
