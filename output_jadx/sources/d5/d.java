package d5;

import com.google.protobuf.z;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public enum d implements z {
    UNKNOWN_TRIGGER(0),
    APP_LAUNCH(1),
    ON_FOREGROUND(2),
    UNRECOGNIZED(-1);


    /* renamed from: b, reason: collision with root package name */
    public final int f1827b;

    d(int i10) {
        this.f1827b = i10;
    }

    @Override // com.google.protobuf.z
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f1827b;
        }
        j1.i.k("Can't get the number of an unknown enum value.");
        return 0;
    }
}
