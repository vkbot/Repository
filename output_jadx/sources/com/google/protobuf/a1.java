package com.google.protobuf;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final a f1529a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1530b;
    public final Object[] c;
    public final int d;

    public a1(a aVar, String str, Object[] objArr) {
        this.f1529a = aVar;
        this.f1530b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i10 = charAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char charAt2 = str.charAt(i12);
            if (charAt2 >= 55296) {
                i10 |= (charAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            } else {
                this.d = i10 | (charAt2 << i11);
                return;
            }
        }
    }

    public final int a() {
        int i10 = this.d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        if ((i10 & 4) == 4) {
            return 3;
        }
        return 2;
    }
}
