package n;

import java.io.File;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4004a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4005b;

    public /* synthetic */ c(int i10, Object obj) {
        this.f4004a = i10;
        this.f4005b = obj;
    }

    @Override // n.r
    public final boolean a(Object obj) {
        switch (this.f4004a) {
            case 0:
                return true;
            case 1:
                return obj.toString().startsWith("data:image");
            default:
                return true;
        }
    }

    @Override // n.r
    public final q b(Object obj, int i10, int i11, h.h hVar) {
        switch (this.f4004a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new q(new b0.b(bArr), new l(1, bArr, (c0) this.f4005b));
            case 1:
                return new q(new b0.b(obj), new l(obj.toString(), (c0) this.f4005b));
            default:
                File file = (File) obj;
                return new q(new b0.b(file), new i.b(1, file, (c0) this.f4005b));
        }
    }
}
