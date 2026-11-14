package org.apache.commons.io.filefilter;

import java.io.File;
import java.util.function.Predicate;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4834a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ File f4835b;
    public final /* synthetic */ String c;

    public /* synthetic */ d(File file, int i10, String str) {
        this.f4834a = i10;
        this.f4835b = file;
        this.c = str;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean lambda$accept$1;
        boolean lambda$accept$12;
        switch (this.f4834a) {
            case 0:
                lambda$accept$1 = AndFileFilter.lambda$accept$1(this.f4835b, this.c, (IOFileFilter) obj);
                return lambda$accept$1;
            default:
                lambda$accept$12 = OrFileFilter.lambda$accept$1(this.f4835b, this.c, (IOFileFilter) obj);
                return lambda$accept$12;
        }
    }
}
