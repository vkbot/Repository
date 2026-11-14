package b4;

import android.os.Handler;
import android.os.Message;
import j.d0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f350a;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f350a) {
            case 0:
                int i10 = message.what;
                if (i10 != 0) {
                    if (i10 != 1) {
                        return false;
                    }
                    ((j) message.obj).getClass();
                    Object obj = null;
                    obj.getClass();
                    throw null;
                }
                ((j) message.obj).getClass();
                throw null;
            default:
                if (message.what == 1) {
                    ((d0) message.obj).recycle();
                    return true;
                }
                return false;
        }
    }
}
