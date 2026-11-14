package o2;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c {
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f4311f;

    /* renamed from: g, reason: collision with root package name */
    public int f4312g;

    /* renamed from: h, reason: collision with root package name */
    public int f4313h;

    /* renamed from: i, reason: collision with root package name */
    public int f4314i;

    /* renamed from: j, reason: collision with root package name */
    public float f4315j;

    /* renamed from: k, reason: collision with root package name */
    public float f4316k;

    /* renamed from: l, reason: collision with root package name */
    public int f4317l;

    /* renamed from: m, reason: collision with root package name */
    public int f4318m;

    /* renamed from: o, reason: collision with root package name */
    public int f4320o;

    /* renamed from: p, reason: collision with root package name */
    public int f4321p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4322q;
    public boolean r;

    /* renamed from: a, reason: collision with root package name */
    public int f4309a = Integer.MAX_VALUE;

    /* renamed from: b, reason: collision with root package name */
    public int f4310b = Integer.MAX_VALUE;
    public int c = Integer.MIN_VALUE;
    public int d = Integer.MIN_VALUE;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f4319n = new ArrayList();

    public final int a() {
        return this.f4313h - this.f4314i;
    }

    public final void b(View view, int i10, int i11, int i12, int i13) {
        b bVar = (b) view.getLayoutParams();
        this.f4309a = Math.min(this.f4309a, (view.getLeft() - bVar.g()) - i10);
        this.f4310b = Math.min(this.f4310b, (view.getTop() - bVar.h()) - i11);
        this.c = Math.max(this.c, bVar.l() + view.getRight() + i12);
        this.d = Math.max(this.d, bVar.f() + view.getBottom() + i13);
    }
}
