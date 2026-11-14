package c7;

import b7.u;
import java.util.Comparator;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class m implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f576b;
    public final /* synthetic */ n c;

    public m(n nVar, u uVar) {
        this.c = nVar;
        this.f576b = uVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        n nVar = this.c;
        u uVar = this.f576b;
        return Float.compare(nVar.a((u) obj2, uVar), nVar.a((u) obj, uVar));
    }
}
