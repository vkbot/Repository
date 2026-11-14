package org.apache.commons.io.filefilter;

import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.Predicate;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4829a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Path f4830b;
    public final /* synthetic */ BasicFileAttributes c;

    public /* synthetic */ a(Path path, BasicFileAttributes basicFileAttributes, int i10) {
        this.f4829a = i10;
        this.f4830b = path;
        this.c = basicFileAttributes;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean lambda$accept$2;
        switch (this.f4829a) {
            case 0:
                lambda$accept$2 = AndFileFilter.lambda$accept$2(this.f4830b, this.c, (IOFileFilter) obj);
                return lambda$accept$2;
            default:
                return OrFileFilter.a(this.f4830b, this.c, (IOFileFilter) obj);
        }
    }
}
