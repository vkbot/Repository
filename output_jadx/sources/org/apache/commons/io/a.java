package org.apache.commons.io;

import java.util.function.Predicate;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4808a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4809b;

    public /* synthetic */ a(String str, int i10) {
        this.f4808a = i10;
        this.f4809b = str;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f4808a) {
            case 0:
                return this.f4809b.equalsIgnoreCase((String) obj);
            case 1:
                return this.f4809b.equals((String) obj);
            default:
                return IOCase.a(this.f4809b, (IOCase) obj);
        }
    }
}
