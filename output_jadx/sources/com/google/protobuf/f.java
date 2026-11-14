package com.google.protobuf;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: f, reason: collision with root package name */
    public final int f1563f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1564g;

    public f(byte[] bArr, int i10, int i11) {
        super(bArr);
        g.d(i10, i10 + i11, bArr.length);
        this.f1563f = i10;
        this.f1564g = i11;
    }

    @Override // com.google.protobuf.g
    public final byte a(int i10) {
        int i11 = this.f1564g;
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException(ai.onnxruntime.a.e(i10, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(ai.onnxruntime.a.g(i10, "Index > length: ", ", ", i11));
        }
        return this.c[this.f1563f + i10];
    }

    @Override // com.google.protobuf.g
    public final int f() {
        return this.f1563f;
    }

    @Override // com.google.protobuf.g
    public final byte g(int i10) {
        return this.c[this.f1563f + i10];
    }

    @Override // com.google.protobuf.g
    public final int size() {
        return this.f1564g;
    }
}
