package b7;

import android.graphics.Rect;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final s f425a;

    /* renamed from: b, reason: collision with root package name */
    public final int f426b;
    public final int c;
    public Rect d;
    public boolean e;

    public v(int i10, int i11, int i12, int i13, byte[] bArr) {
        this.f425a = new s(bArr, i10, i11);
        this.c = i13;
        this.f426b = i12;
        if (i10 * i11 <= bArr.length) {
            return;
        }
        StringBuilder v9 = ai.onnxruntime.a.v("Image data does not match the resolution. ", i10, i11, "x", " > ");
        v9.append(bArr.length);
        throw new IllegalArgumentException(v9.toString());
    }
}
