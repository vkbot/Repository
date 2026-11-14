package org.apache.commons.io.filefilter;

import java.io.File;
import java.util.function.Predicate;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4832a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ File f4833b;

    public /* synthetic */ c(File file, int i10) {
        this.f4832a = i10;
        this.f4833b = file;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean lambda$accept$0;
        boolean lambda$accept$02;
        switch (this.f4832a) {
            case 0:
                lambda$accept$0 = AndFileFilter.lambda$accept$0(this.f4833b, (IOFileFilter) obj);
                return lambda$accept$0;
            case 1:
                lambda$accept$02 = OrFileFilter.lambda$accept$0(this.f4833b, (IOFileFilter) obj);
                return lambda$accept$02;
            default:
                return WildcardFilter.c(this.f4833b, (String) obj);
        }
    }
}
