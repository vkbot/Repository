package q;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class g implements h.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5130a;

    /* renamed from: b, reason: collision with root package name */
    public final q f5131b;

    public /* synthetic */ g(q qVar, int i10) {
        this.f5130a = i10;
        this.f5131b = qVar;
    }

    @Override // h.j
    public final j.d0 a(Object obj, int i10, int i11, h.h hVar) {
        switch (this.f5130a) {
            case 0:
                q qVar = this.f5131b;
                return qVar.a(new a5.h((ByteBuffer) obj, qVar.d, qVar.c, 21), i10, i11, hVar, q.f5148j);
            default:
                q qVar2 = this.f5131b;
                return qVar2.a(new a5.h((ParcelFileDescriptor) obj, qVar2.d, qVar2.c), i10, i11, hVar, q.f5148j);
        }
    }

    @Override // h.j
    public final boolean b(Object obj, h.h hVar) {
        switch (this.f5130a) {
            case 0:
                return true;
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                if (((!"HUAWEI".equalsIgnoreCase(str) && !"HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) && !"robolectric".equals(Build.FINGERPRINT)) {
                    return true;
                }
                return false;
        }
    }
}
