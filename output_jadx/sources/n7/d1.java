package n7;

import java.util.Comparator;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d1 implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f4171b;

    public d1(h hVar) {
        this.f4171b = hVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        h hVar = this.f4171b;
        int c = hVar.c(obj) - hVar.c(obj2);
        if (c != 0) {
            return c;
        }
        return obj.getClass().getName().compareTo(obj2.getClass().getName());
    }
}
