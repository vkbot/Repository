package a5;

import java.util.Map;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements x4.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40a;

    @Override // x4.a
    public final void a(Object obj, Object obj2) {
        switch (this.f40a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                x4.e eVar = (x4.e) obj2;
                eVar.d(f.f42g, entry.getKey());
                eVar.d(f.f43h, entry.getValue());
                return;
            case 1:
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            default:
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
