package org.apache.commons.io.function;

import java.util.Comparator;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class k implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4860b;
    public final /* synthetic */ IOComparator c;

    public /* synthetic */ k(IOComparator iOComparator, int i10) {
        this.f4860b = i10;
        this.c = iOComparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compare;
        int compare2;
        int compare3;
        switch (this.f4860b) {
            case 0:
                return IOComparator.a(this.c, obj, obj2);
            case 1:
                compare = Erase.compare(this.c, obj, obj2);
                return compare;
            case 2:
                compare2 = Erase.compare(this.c, obj, obj2);
                return compare2;
            default:
                compare3 = Erase.compare(this.c, obj, obj2);
                return compare3;
        }
    }
}
