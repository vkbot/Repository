package i8;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class v extends AtomicInteger implements z7.a {

    /* renamed from: b, reason: collision with root package name */
    public final x7.f f2860b;
    public final p2.e c;
    public final w[] d;
    public final Object[] e;

    public v(x7.f fVar, int i10, p2.e eVar) {
        super(i10);
        this.f2860b = fVar;
        this.c = eVar;
        w[] wVarArr = new w[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            wVarArr[i11] = new w(this, i11);
        }
        this.d = wVarArr;
        this.e = new Object[i10];
    }

    public final void a(int i10) {
        w[] wVarArr = this.d;
        int length = wVarArr.length;
        for (int i11 = 0; i11 < i10; i11++) {
            w wVar = wVarArr[i11];
            wVar.getClass();
            c8.a.a(wVar);
        }
        while (true) {
            i10++;
            if (i10 < length) {
                w wVar2 = wVarArr[i10];
                wVar2.getClass();
                c8.a.a(wVar2);
            } else {
                return;
            }
        }
    }

    @Override // z7.a
    public final void dispose() {
        if (getAndSet(0) > 0) {
            for (w wVar : this.d) {
                wVar.getClass();
                c8.a.a(wVar);
            }
        }
    }
}
