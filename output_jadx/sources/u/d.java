package u;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import c0.p;
import j1.i;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d implements z.d {

    /* renamed from: b, reason: collision with root package name */
    public final int f5844b;
    public final int c;
    public y.c d;
    public final Handler e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5845f;

    /* renamed from: g, reason: collision with root package name */
    public final long f5846g;

    /* renamed from: h, reason: collision with root package name */
    public Bitmap f5847h;

    public d(Handler handler, int i10, long j10) {
        if (p.i(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            this.f5844b = Integer.MIN_VALUE;
            this.c = Integer.MIN_VALUE;
            this.e = handler;
            this.f5845f = i10;
            this.f5846g = j10;
            return;
        }
        i.k("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        throw null;
    }

    @Override // z.d
    public final void a(y.f fVar) {
        fVar.m(this.f5844b, this.c);
    }

    @Override // z.d
    public final void b(Object obj) {
        this.f5847h = (Bitmap) obj;
        Handler handler = this.e;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f5846g);
    }

    @Override // z.d
    public final void h(y.c cVar) {
        this.d = cVar;
    }

    @Override // z.d
    public final y.c i() {
        return this.d;
    }

    @Override // z.d
    public final void j(Drawable drawable) {
        this.f5847h = null;
    }

    @Override // com.bumptech.glide.manager.i
    public final void c() {
    }

    @Override // com.bumptech.glide.manager.i
    public final void e() {
    }

    @Override // com.bumptech.glide.manager.i
    public final void onStart() {
    }

    @Override // z.d
    public final void d(Drawable drawable) {
    }

    @Override // z.d
    public final void f(y.f fVar) {
    }

    @Override // z.d
    public final void g(Drawable drawable) {
    }
}
