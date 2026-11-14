package i9;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.RangesKt;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class f1 implements g9.e, l {

    /* renamed from: a, reason: collision with root package name */
    public final String f2892a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f2893b;
    public final int c;
    public int d;
    public final String[] e;

    /* renamed from: f, reason: collision with root package name */
    public final List[] f2894f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f2895g;

    /* renamed from: h, reason: collision with root package name */
    public Map f2896h;

    /* renamed from: i, reason: collision with root package name */
    public final Lazy f2897i;

    /* renamed from: j, reason: collision with root package name */
    public final Lazy f2898j;

    /* renamed from: k, reason: collision with root package name */
    public final Lazy f2899k;

    public f1(String str, i0 i0Var, int i10) {
        str.getClass();
        this.f2892a = str;
        this.f2893b = i0Var;
        this.c = i10;
        this.d = -1;
        String[] strArr = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i12 = this.c;
        this.f2894f = new List[i12];
        this.f2895g = new boolean[i12];
        this.f2896h = MapsKt.emptyMap();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f2897i = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new e1(this, 1));
        this.f2898j = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new e1(this, 2));
        this.f2899k = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new e1(this, 0));
    }

    @Override // g9.e
    public final String a() {
        return this.f2892a;
    }

    @Override // i9.l
    public final Set b() {
        return this.f2896h.keySet();
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
        return this.e[i10];
    }

    @Override // g9.e
    public g9.e f(int i10) {
        return ((e9.b[]) this.f2897i.getValue())[i10].a();
    }

    @Override // g9.e
    public final boolean g(int i10) {
        return this.f2895g[i10];
    }

    @Override // g9.e
    public com.bumptech.glide.d getKind() {
        return g9.j.d;
    }

    public int hashCode() {
        return ((Number) this.f2899k.getValue()).intValue();
    }

    @Override // g9.e
    public boolean isInline() {
        return false;
    }

    public String toString() {
        String joinToString$default;
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(RangesKt.until(0, this.c), ", ", this.f2892a + '(', ")", 0, null, new d9.h(4, this), 24, null);
        return joinToString$default;
    }
}
