package i9;

import androidx.navigation.serialization.RouteDecoder;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class t0 implements e9.b {

    /* renamed from: a, reason: collision with root package name */
    public final e9.b f2945a;

    /* renamed from: b, reason: collision with root package name */
    public final e9.b f2946b;
    public final /* synthetic */ int c;
    public final g9.f d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t0(e9.b bVar, e9.b bVar2, int i10) {
        this(bVar, bVar2, (byte) 0);
        this.c = i10;
        switch (i10) {
            case 1:
                this(bVar, bVar2, (byte) 0);
                this.d = com.bumptech.glide.c.a("kotlin.Pair", new g9.e[0], new s0(1, bVar, bVar2));
                return;
            default:
                this.d = com.bumptech.glide.c.b("kotlin.collections.Map.Entry", g9.j.f2518f, new g9.e[0], new s0(0, bVar, bVar2));
                return;
        }
    }

    @Override // e9.h, e9.a
    public final g9.e a() {
        switch (this.c) {
            case 0:
                return this.d;
            default:
                return this.d;
        }
    }

    @Override // e9.h
    public final void b(h9.b bVar, Object obj) {
        Object key;
        Object value;
        h9.d beginStructure = bVar.beginStructure(a());
        g9.e a10 = a();
        switch (this.c) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                key = entry.getKey();
                break;
            default:
                Pair pair = (Pair) obj;
                pair.getClass();
                key = pair.getFirst();
                break;
        }
        beginStructure.encodeSerializableElement(a10, 0, this.f2945a, key);
        g9.e a11 = a();
        switch (this.c) {
            case 0:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                value = entry2.getValue();
                break;
            default:
                Pair pair2 = (Pair) obj;
                pair2.getClass();
                value = pair2.getSecond();
                break;
        }
        beginStructure.encodeSerializableElement(a11, 1, this.f2946b, value);
        beginStructure.endStructure(a());
    }

    @Override // e9.a
    public final Object c(RouteDecoder routeDecoder) {
        Object d;
        Object obj = d1.c;
        g9.e a10 = a();
        h9.c beginStructure = routeDecoder.beginStructure(a10);
        boolean decodeSequentially = beginStructure.decodeSequentially();
        e9.b bVar = this.f2946b;
        e9.b bVar2 = this.f2945a;
        if (decodeSequentially) {
            d = d(beginStructure.decodeSerializableElement(a(), 0, bVar2, null), beginStructure.decodeSerializableElement(a(), 1, bVar, null));
        } else {
            Object obj2 = obj;
            Object obj3 = obj2;
            while (true) {
                int decodeElementIndex = beginStructure.decodeElementIndex(a());
                if (decodeElementIndex != -1) {
                    if (decodeElementIndex != 0) {
                        if (decodeElementIndex == 1) {
                            obj3 = beginStructure.decodeSerializableElement(a(), 1, bVar, null);
                        } else {
                            throw new IllegalArgumentException(ai.onnxruntime.a.e(decodeElementIndex, "Invalid index: "));
                        }
                    } else {
                        obj2 = beginStructure.decodeSerializableElement(a(), 0, bVar2, null);
                    }
                } else if (obj2 != obj) {
                    if (obj3 != obj) {
                        d = d(obj2, obj3);
                    } else {
                        throw new IllegalArgumentException("Element 'value' is missing");
                    }
                } else {
                    throw new IllegalArgumentException("Element 'key' is missing");
                }
            }
        }
        beginStructure.endStructure(a10);
        return d;
    }

    public final Object d(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                return new r0(obj, obj2);
            default:
                return TuplesKt.to(obj, obj2);
        }
    }

    public t0(e9.b bVar, e9.b bVar2, byte b10) {
        this.f2945a = bVar;
        this.f2946b = bVar2;
    }
}
