package androidx.core.util;

import androidx.core.content.IntentSanitizer;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f186a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Predicate f187b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(Class cls, Predicate predicate) {
        this.f186a = 2;
        this.c = cls;
        this.f187b = predicate;
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        boolean lambda$or$2;
        boolean lambda$and$0;
        boolean lambda$allowExtra$13;
        switch (this.f186a) {
            case 0:
                lambda$or$2 = this.f187b.lambda$or$2((Predicate) this.c, obj);
                return lambda$or$2;
            case 1:
                lambda$and$0 = this.f187b.lambda$and$0((Predicate) this.c, obj);
                return lambda$and$0;
            default:
                lambda$allowExtra$13 = IntentSanitizer.Builder.lambda$allowExtra$13((Class) this.c, this.f187b, obj);
                return lambda$allowExtra$13;
        }
    }

    public /* synthetic */ a(Predicate predicate, Predicate predicate2, int i10) {
        this.f186a = i10;
        this.f187b = predicate;
        this.c = predicate2;
    }
}
