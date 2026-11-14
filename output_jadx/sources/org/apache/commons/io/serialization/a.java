package org.apache.commons.io.serialization;

import java.util.List;
import java.util.function.Consumer;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Consumer {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4927b;
    public final /* synthetic */ List c;

    public /* synthetic */ a(List list, int i10) {
        this.f4927b = i10;
        this.c = list;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        List list;
        Object obj2;
        switch (this.f4927b) {
            case 0:
                list = this.c;
                obj2 = (FullClassNameMatcher) obj;
                break;
            default:
                list = this.c;
                obj2 = (WildcardClassNameMatcher) obj;
                break;
        }
        list.add(obj2);
    }
}
