package s8;

import b8.d;
import c7.l;
import p8.e;
import p8.f;
import x7.h;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a implements z7.a, d {

    /* renamed from: b, reason: collision with root package name */
    public final h f5728b;
    public final b c;
    public boolean d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public l f5729f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5730g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f5731h;

    /* renamed from: i, reason: collision with root package name */
    public long f5732i;

    public a(h hVar, b bVar) {
        this.f5728b = hVar;
        this.c = bVar;
    }

    public final void a(Object obj, long j10) {
        if (this.f5731h) {
            return;
        }
        if (!this.f5730g) {
            synchronized (this) {
                try {
                    if (this.f5731h) {
                        return;
                    }
                    if (this.f5732i == j10) {
                        return;
                    }
                    if (this.e) {
                        l lVar = this.f5729f;
                        if (lVar == null) {
                            lVar = new l();
                            this.f5729f = lVar;
                        }
                        int i10 = lVar.f575b;
                        if (i10 == 4) {
                            Object[] objArr = new Object[5];
                            ((Object[]) lVar.d)[4] = objArr;
                            lVar.d = objArr;
                            i10 = 0;
                        }
                        ((Object[]) lVar.d)[i10] = obj;
                        lVar.f575b = i10 + 1;
                        return;
                    }
                    this.d = true;
                    this.f5730g = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        test(obj);
    }

    @Override // z7.a
    public final void dispose() {
        if (!this.f5731h) {
            this.f5731h = true;
            this.c.f(this);
        }
    }

    @Override // b8.d
    public final boolean test(Object obj) {
        if (!this.f5731h) {
            h hVar = this.f5728b;
            if (obj == f.f5116b) {
                hVar.a();
                return true;
            }
            if (obj instanceof e) {
                hVar.onError(((e) obj).f5115b);
                return true;
            }
            hVar.e(obj);
            return false;
        }
        return true;
    }
}
