package i9;

import java.util.Iterator;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.ranges.RangesKt___RangesKt;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class u0 extends a {

    /* renamed from: a, reason: collision with root package name */
    public final e9.b f2948a;

    /* renamed from: b, reason: collision with root package name */
    public final e9.b f2949b;

    public u0(e9.b bVar, e9.b bVar2) {
        this.f2948a = bVar;
        this.f2949b = bVar2;
    }

    @Override // e9.h
    public final void b(h9.b bVar, Object obj) {
        int h2 = h(obj);
        g9.e a10 = a();
        h9.d beginCollection = bVar.beginCollection(a10, h2);
        Iterator g10 = g(obj);
        int i10 = 0;
        while (g10.hasNext()) {
            Map.Entry entry = (Map.Entry) g10.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i11 = i10 + 1;
            beginCollection.encodeSerializableElement(a(), i10, this.f2948a, key);
            i10 += 2;
            beginCollection.encodeSerializableElement(a(), i11, this.f2949b, value);
        }
        beginCollection.endStructure(a10);
    }

    @Override // i9.a
    public final void j(h9.c cVar, Object obj, int i10, int i11) {
        IntProgression step;
        Map map = (Map) obj;
        map.getClass();
        if (i11 >= 0) {
            step = RangesKt___RangesKt.step(RangesKt.until(0, i11 * 2), 2);
            int first = step.getFirst();
            int last = step.getLast();
            int step2 = step.getStep();
            if ((step2 <= 0 || first > last) && (step2 >= 0 || last > first)) {
                return;
            }
            while (true) {
                n(cVar, i10 + first, map, false);
                if (first != last) {
                    first += step2;
                } else {
                    return;
                }
            }
        } else {
            j1.i.k("Size must be known in advance when using READ_ALL");
        }
    }

    @Override // i9.a
    public final /* bridge */ /* synthetic */ void k(h9.c cVar, int i10, Object obj) {
        n(cVar, i10, (Map) obj, true);
    }

    public final void n(h9.c cVar, int i10, Map map, boolean z9) {
        int i11;
        Object decodeSerializableElement;
        map.getClass();
        Object decodeSerializableElement2 = cVar.decodeSerializableElement(a(), i10, this.f2948a, null);
        if (z9) {
            i11 = cVar.decodeElementIndex(a());
            if (i11 != i10 + 1) {
                l9.i.d(ai.onnxruntime.a.g(i10, "Value must follow key in a map, index for key: ", ", returned index for value: ", i11));
                return;
            }
        } else {
            i11 = i10 + 1;
        }
        boolean containsKey = map.containsKey(decodeSerializableElement2);
        e9.b bVar = this.f2949b;
        if (containsKey && !(bVar.a().getKind() instanceof g9.d)) {
            decodeSerializableElement = cVar.decodeSerializableElement(a(), i11, bVar, MapsKt.getValue(map, decodeSerializableElement2));
        } else {
            decodeSerializableElement = cVar.decodeSerializableElement(a(), i11, bVar, null);
        }
        map.put(decodeSerializableElement2, decodeSerializableElement);
    }
}
