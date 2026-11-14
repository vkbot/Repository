package d5;

import com.google.protobuf.z;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public enum g implements z {
    UNKNOWN_DISMISS_TYPE(0),
    AUTO(1),
    CLICK(2),
    SWIPE(3);


    /* renamed from: b, reason: collision with root package name */
    public final int f1830b;

    g(int i10) {
        this.f1830b = i10;
    }

    @Override // com.google.protobuf.z
    public final int a() {
        return this.f1830b;
    }
}
