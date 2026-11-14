package g9;

import i9.d1;
import i9.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class f implements e, l {

    /* renamed from: a, reason: collision with root package name */
    public final String f2506a;

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.d f2507b;
    public final int c;
    public final List d;
    public final HashSet e;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f2508f;

    /* renamed from: g, reason: collision with root package name */
    public final e[] f2509g;

    /* renamed from: h, reason: collision with root package name */
    public final List[] f2510h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f2511i;

    /* renamed from: j, reason: collision with root package name */
    public final Map f2512j;

    /* renamed from: k, reason: collision with root package name */
    public final e[] f2513k;

    /* renamed from: l, reason: collision with root package name */
    public final Lazy f2514l;

    public f(String str, com.bumptech.glide.d dVar, int i10, List list, a aVar) {
        HashSet hashSet;
        boolean[] booleanArray;
        Map map;
        list.getClass();
        this.f2506a = str;
        this.f2507b = dVar;
        this.c = i10;
        this.d = aVar.f2493b;
        ArrayList arrayList = aVar.c;
        hashSet = CollectionsKt___CollectionsKt.toHashSet(arrayList);
        this.e = hashSet;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f2508f = strArr;
        this.f2509g = d1.c(aVar.e);
        this.f2510h = (List[]) aVar.f2494f.toArray(new List[0]);
        booleanArray = CollectionsKt___CollectionsKt.toBooleanArray(aVar.f2495g);
        this.f2511i = booleanArray;
        Iterable<IndexedValue> withIndex = ArraysKt.withIndex(strArr);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(withIndex, 10));
        for (IndexedValue indexedValue : withIndex) {
            arrayList2.add(TuplesKt.to(indexedValue.getValue(), Integer.valueOf(indexedValue.getIndex())));
        }
        map = MapsKt__MapsKt.toMap(arrayList2);
        this.f2512j = map;
        this.f2513k = d1.c(list);
        this.f2514l = LazyKt.lazy(new e9.d(2, this));
    }

    @Override // g9.e
    public final String a() {
        return this.f2506a;
    }

    @Override // i9.l
    public final Set b() {
        return this.e;
    }

    @Override // g9.e
    public final boolean c() {
        return false;
    }

    @Override // g9.e
    public final int d() {
        return this.c;
    }

    @Override // g9.e
    public final String e(int i10) {
        return this.f2508f[i10];
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                e eVar = (e) obj;
                if (Intrinsics.areEqual(this.f2506a, eVar.a()) && Arrays.equals(this.f2513k, ((f) obj).f2513k)) {
                    int d = eVar.d();
                    int i10 = this.c;
                    if (i10 == d) {
                        for (int i11 = 0; i11 < i10; i11++) {
                            e[] eVarArr = this.f2509g;
                            if (Intrinsics.areEqual(eVarArr[i11].a(), eVar.f(i11).a()) && Intrinsics.areEqual(eVarArr[i11].getKind(), eVar.f(i11).getKind())) {
                            }
                        }
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // g9.e
    public final e f(int i10) {
        return this.f2509g[i10];
    }

    @Override // g9.e
    public final boolean g(int i10) {
        return this.f2511i[i10];
    }

    @Override // g9.e
    public final com.bumptech.glide.d getKind() {
        return this.f2507b;
    }

    public final int hashCode() {
        return ((Number) this.f2514l.getValue()).intValue();
    }

    @Override // g9.e
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        String joinToString$default;
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(RangesKt.until(0, this.c), ", ", this.f2506a.concat("("), ")", 0, null, new d9.h(2, this), 24, null);
        return joinToString$default;
    }
}
