package com.bumptech.glide;

import java.util.Iterator;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f627a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static /* synthetic */ boolean a(int i10, int i11) {
        if (i10 != 0) {
            if (i10 == i11) {
                return true;
            }
            return false;
        }
        throw null;
    }

    public static ClassCastException b(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static /* synthetic */ int c(int i10) {
        if (i10 != 0) {
            return i10 - 1;
        }
        throw null;
    }

    public static /* synthetic */ int[] d(int i10) {
        int[] iArr = new int[i10];
        System.arraycopy(f627a, 0, iArr, 0, i10);
        return iArr;
    }
}
