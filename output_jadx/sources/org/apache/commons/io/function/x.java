package org.apache.commons.io.function;

import java.util.function.Predicate;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class x implements Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4873a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IOPredicate f4874b;

    public /* synthetic */ x(IOPredicate iOPredicate, int i10) {
        this.f4873a = i10;
        this.f4874b = iOPredicate;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean test;
        boolean test2;
        boolean test3;
        boolean test4;
        switch (this.f4873a) {
            case 0:
                return IOPredicate.a(this.f4874b, obj);
            case 1:
                test = Erase.test(this.f4874b, obj);
                return test;
            case 2:
                test2 = Erase.test(this.f4874b, obj);
                return test2;
            case 3:
                test3 = Erase.test(this.f4874b, obj);
                return test3;
            default:
                test4 = Erase.test(this.f4874b, obj);
                return test4;
        }
    }
}
