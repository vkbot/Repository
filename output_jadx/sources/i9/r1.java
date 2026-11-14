package i9;

import androidx.navigation.serialization.RouteDecoder;
import kotlin.Triple;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class r1 implements e9.b {

    /* renamed from: a, reason: collision with root package name */
    public final e9.b f2940a;

    /* renamed from: b, reason: collision with root package name */
    public final e9.b f2941b;
    public final e9.b c;
    public final g9.f d = com.bumptech.glide.c.a("kotlin.Triple", new g9.e[0], new d9.h(5, this));

    public r1(e9.b bVar, e9.b bVar2, e9.b bVar3) {
        this.f2940a = bVar;
        this.f2941b = bVar2;
        this.c = bVar3;
    }

    @Override // e9.h, e9.a
    public final g9.e a() {
        return this.d;
    }

    @Override // e9.h
    public final void b(h9.b bVar, Object obj) {
        Triple triple = (Triple) obj;
        triple.getClass();
        g9.f fVar = this.d;
        h9.d beginStructure = bVar.beginStructure(fVar);
        beginStructure.encodeSerializableElement(fVar, 0, this.f2940a, triple.getFirst());
        beginStructure.encodeSerializableElement(fVar, 1, this.f2941b, triple.getSecond());
        beginStructure.encodeSerializableElement(fVar, 2, this.c, triple.getThird());
        beginStructure.endStructure(fVar);
    }

    @Override // e9.a
    public final Object c(RouteDecoder routeDecoder) {
        g9.f fVar = this.d;
        h9.c beginStructure = routeDecoder.beginStructure(fVar);
        boolean decodeSequentially = beginStructure.decodeSequentially();
        e9.b bVar = this.c;
        e9.b bVar2 = this.f2941b;
        e9.b bVar3 = this.f2940a;
        if (decodeSequentially) {
            Object decodeSerializableElement = beginStructure.decodeSerializableElement(fVar, 0, bVar3, null);
            Object decodeSerializableElement2 = beginStructure.decodeSerializableElement(fVar, 1, bVar2, null);
            Object decodeSerializableElement3 = beginStructure.decodeSerializableElement(fVar, 2, bVar, null);
            beginStructure.endStructure(fVar);
            return new Triple(decodeSerializableElement, decodeSerializableElement2, decodeSerializableElement3);
        }
        Object obj = d1.c;
        Object obj2 = obj;
        Object obj3 = obj2;
        Object obj4 = obj3;
        while (true) {
            int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
            if (decodeElementIndex != -1) {
                if (decodeElementIndex != 0) {
                    if (decodeElementIndex != 1) {
                        if (decodeElementIndex == 2) {
                            obj4 = beginStructure.decodeSerializableElement(fVar, 2, bVar, null);
                        } else {
                            throw new IllegalArgumentException(ai.onnxruntime.a.e(decodeElementIndex, "Unexpected index "));
                        }
                    } else {
                        obj3 = beginStructure.decodeSerializableElement(fVar, 1, bVar2, null);
                    }
                } else {
                    obj2 = beginStructure.decodeSerializableElement(fVar, 0, bVar3, null);
                }
            } else {
                beginStructure.endStructure(fVar);
                if (obj2 != obj) {
                    if (obj3 != obj) {
                        if (obj4 != obj) {
                            return new Triple(obj2, obj3, obj4);
                        }
                        throw new IllegalArgumentException("Element 'third' is missing");
                    }
                    throw new IllegalArgumentException("Element 'second' is missing");
                }
                throw new IllegalArgumentException("Element 'first' is missing");
            }
        }
    }
}
