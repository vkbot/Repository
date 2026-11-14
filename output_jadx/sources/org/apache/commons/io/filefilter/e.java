package org.apache.commons.io.filefilter;

import java.util.function.Predicate;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4836a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4837b;
    public final /* synthetic */ AbstractFileFilter c;

    public /* synthetic */ e(AbstractFileFilter abstractFileFilter, String str, int i10) {
        this.f4836a = i10;
        this.c = abstractFileFilter;
        this.f4837b = str;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f4836a) {
            case 0:
                return NameFileFilter.a((NameFileFilter) this.c, this.f4837b, (String) obj);
            case 1:
                return PrefixFileFilter.a((PrefixFileFilter) this.c, this.f4837b, (String) obj);
            case 2:
                return SuffixFileFilter.a((SuffixFileFilter) this.c, this.f4837b, (String) obj);
            default:
                return WildcardFileFilter.a((WildcardFileFilter) this.c, this.f4837b, (String) obj);
        }
    }
}
