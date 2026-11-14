package w2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class a implements IInterface {
    public final IBinder c;
    public final String d;

    public a(IBinder iBinder, String str) {
        this.c = iBinder;
        this.d = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.c;
    }

    public final Parcel b(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.c.transact(i10, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    public final Parcel c() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.d);
        return obtain;
    }
}
