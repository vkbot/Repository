package c8;

import a8.e;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d extends AtomicReference implements z7.a, x7.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f580b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj) {
        super(obj);
        this.f580b = 2;
    }

    @Override // x7.a, x7.f
    public void a() {
        lazySet(a.f577b);
    }

    @Override // x7.a, x7.f
    public void b(z7.a aVar) {
        a.d(this, aVar);
    }

    public boolean c() {
        switch (this.f580b) {
            case 0:
                return a.b((z7.a) get());
            default:
                if (get() == null) {
                    return true;
                }
                return false;
        }
    }

    public void d(z7.a aVar) {
        while (true) {
            z7.a aVar2 = (z7.a) get();
            if (aVar2 == a.f577b) {
                aVar.dispose();
                return;
            }
            while (!compareAndSet(aVar2, aVar)) {
                if (get() != aVar2) {
                    break;
                }
            }
            if (aVar2 != null) {
                aVar2.dispose();
                return;
            }
            return;
        }
    }

    @Override // z7.a
    public final void dispose() {
        Object andSet;
        switch (this.f580b) {
            case 0:
                a.a(this);
                return;
            case 1:
                a.a(this);
                return;
            default:
                if (get() != null && (andSet = getAndSet(null)) != null) {
                    ((Runnable) andSet).run();
                    return;
                }
                return;
        }
    }

    @Override // x7.a, x7.f
    public void onError(Throwable th) {
        lazySet(a.f577b);
        a.a.s(new e(th));
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        switch (this.f580b) {
            case 2:
                return "RunnableDisposable(disposed=" + c() + ", " + get() + ")";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ d(int i10) {
        this.f580b = i10;
    }
}
