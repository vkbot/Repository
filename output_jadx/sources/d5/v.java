package d5;

import com.google.protobuf.z;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public enum v implements z {
    UNSPECIFIED_RENDER_ERROR(0),
    IMAGE_FETCH_ERROR(1),
    IMAGE_DISPLAY_ERROR(2),
    IMAGE_UNSUPPORTED_FORMAT(3);


    /* renamed from: b, reason: collision with root package name */
    public final int f1838b;

    v(int i10) {
        this.f1838b = i10;
    }

    @Override // com.google.protobuf.z
    public final int a() {
        return this.f1838b;
    }
}
