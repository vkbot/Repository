package org.apache.commons.io.function;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class v implements IOPredicate, IOFunction {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4871b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v(int i10, Object obj) {
        this.f4871b = i10;
        this.c = obj;
    }

    @Override // org.apache.commons.io.function.IOFunction
    public Object apply(Object obj) {
        return ((IOBaseStream) this.c).onClose((IORunnable) obj);
    }

    @Override // org.apache.commons.io.function.IOPredicate
    public boolean test(Object obj) {
        boolean lambda$negate$3;
        boolean equals;
        switch (this.f4871b) {
            case 0:
                lambda$negate$3 = ((IOPredicate) this.c).lambda$negate$3(obj);
                return lambda$negate$3;
            default:
                equals = this.c.equals(obj);
                return equals;
        }
    }
}
