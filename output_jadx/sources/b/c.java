package b;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c extends Binder implements b {
    public static final /* synthetic */ int d = 0;
    public final /* synthetic */ d c;

    public c(d dVar) {
        this.c = dVar;
        attachInterface(this, b.f260b);
    }

    @Override // b.b
    public final void a(int i10, Bundle bundle) {
        this.c.q(i10, bundle);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        Object obj;
        String str = b.f260b;
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i10 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i10 != 1) {
            return super.onTransact(i10, parcel, parcel2, i11);
        }
        int readInt = parcel.readInt();
        Parcelable.Creator creator = Bundle.CREATOR;
        if (parcel.readInt() != 0) {
            obj = creator.createFromParcel(parcel);
        } else {
            obj = null;
        }
        a(readInt, (Bundle) obj);
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
