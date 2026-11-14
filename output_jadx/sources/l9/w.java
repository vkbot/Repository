package l9;

import java.util.RandomAccess;
import kotlin.collections.AbstractList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class w extends AbstractList implements RandomAccess {
    public static final /* synthetic */ int d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final o[] f3585b;
    public final int[] c;

    public w(o[] oVarArr, int[] iArr) {
        this.f3585b = oVarArr;
        this.c = iArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        return super.contains((o) obj);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final Object get(int i10) {
        return this.f3585b[i10];
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    /* renamed from: getSize */
    public final int get_size() {
        return this.f3585b.length;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof o)) {
            return -1;
        }
        return super.indexOf((o) obj);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof o)) {
            return -1;
        }
        return super.lastIndexOf((o) obj);
    }
}
