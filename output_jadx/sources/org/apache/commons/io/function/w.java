package org.apache.commons.io.function;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class w implements IOPredicate {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4872b;
    public final /* synthetic */ IOPredicate c;
    public final /* synthetic */ IOPredicate d;

    public /* synthetic */ w(IOPredicate iOPredicate, IOPredicate iOPredicate2, int i10) {
        this.f4872b = i10;
        this.c = iOPredicate;
        this.d = iOPredicate2;
    }

    @Override // org.apache.commons.io.function.IOPredicate
    public final boolean test(Object obj) {
        switch (this.f4872b) {
            case 0:
                return IOPredicate.o(this.c, this.d, obj);
            default:
                return IOPredicate.b(this.c, this.d, obj);
        }
    }
}
