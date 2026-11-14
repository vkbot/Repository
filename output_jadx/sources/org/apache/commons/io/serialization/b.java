package org.apache.commons.io.serialization;

import java.util.function.Function;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Function {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4928b;

    public /* synthetic */ b(int i10) {
        this.f4928b = i10;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f4928b) {
            case 0:
                return new WildcardClassNameMatcher((String) obj);
            case 1:
                return ObjectStreamClassPredicate.b((Class) obj);
            default:
                return ObjectStreamClassPredicate.a((Class) obj);
        }
    }
}
