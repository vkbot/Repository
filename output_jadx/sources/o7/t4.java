package o7;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class t4 {

    /* renamed from: a, reason: collision with root package name */
    public final n7.e[] f4728a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f4729b = new AtomicBoolean(false);

    static {
        new t4(new n7.e[0]);
    }

    public t4(n7.e[] eVarArr) {
        this.f4728a = eVarArr;
    }

    public final void a(long j10) {
        for (n7.e eVar : this.f4728a) {
            eVar.l(j10);
        }
    }
}
