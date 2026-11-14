package g9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f2492a;

    /* renamed from: b, reason: collision with root package name */
    public List f2493b = CollectionsKt.emptyList();
    public final ArrayList c = new ArrayList();
    public final HashSet d = new HashSet();
    public final ArrayList e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2494f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f2495g = new ArrayList();

    public a(String str) {
        this.f2492a = str;
    }

    public static void a(a aVar, String str, e eVar) {
        List emptyList = CollectionsKt.emptyList();
        aVar.getClass();
        eVar.getClass();
        emptyList.getClass();
        if (aVar.d.add(str)) {
            aVar.c.add(str);
            aVar.e.add(eVar);
            aVar.f2494f.add(emptyList);
            aVar.f2495g.add(false);
            return;
        }
        StringBuilder x9 = ai.onnxruntime.a.x("Element with name '", str, "' is already registered in ");
        x9.append(aVar.f2492a);
        throw new IllegalArgumentException(x9.toString().toString());
    }
}
