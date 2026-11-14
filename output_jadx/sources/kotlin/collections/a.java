package kotlin.collections;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3435b;
    public final /* synthetic */ KMappedMarker c;

    public /* synthetic */ a(KMappedMarker kMappedMarker, int i10) {
        this.f3435b = i10;
        this.c = kMappedMarker;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f3435b) {
            case 0:
                return AbstractCollection.a((AbstractCollection) this.c, obj);
            default:
                return AbstractMap.a((AbstractMap) this.c, (Map.Entry) obj);
        }
    }
}
