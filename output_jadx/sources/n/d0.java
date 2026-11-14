package n;

import java.io.File;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d0 implements r {

    /* renamed from: b, reason: collision with root package name */
    public static final d0 f4008b = new d0(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4009a;

    public /* synthetic */ d0(int i10) {
        this.f4009a = i10;
    }

    @Override // n.r
    public final boolean a(Object obj) {
        switch (this.f4009a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // n.r
    public final q b(Object obj, int i10, int i11, h.h hVar) {
        switch (this.f4009a) {
            case 0:
                return new q(new b0.b(obj), new d(1, obj));
            case 1:
                File file = (File) obj;
                return new q(new b0.b(file), new d(0, file));
            default:
                return null;
        }
    }
}
