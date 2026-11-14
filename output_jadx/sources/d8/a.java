package d8;

import b8.c;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a implements Callable, c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1856b;
    public final Object c;

    public /* synthetic */ a(int i10, Object obj) {
        this.f1856b = i10;
        this.c = obj;
    }

    @Override // b8.c
    public Object apply(Object obj) {
        return this.c;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f1856b) {
            case 0:
                return this.c;
            default:
                synchronized (((f.c) this.c)) {
                    try {
                        f.c cVar = (f.c) this.c;
                        if (cVar.f2228j != null) {
                            cVar.k0();
                            if (((f.c) this.c).d0()) {
                                ((f.c) this.c).i0();
                                ((f.c) this.c).f2230l = 0;
                            }
                            return null;
                        }
                        return null;
                    } finally {
                    }
                }
        }
    }
}
