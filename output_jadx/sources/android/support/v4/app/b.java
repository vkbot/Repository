package android.support.v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class b extends Binder implements c {
    static final int TRANSACTION_cancel = 2;
    static final int TRANSACTION_cancelAll = 3;
    static final int TRANSACTION_notify = 1;

    /* JADX WARN: Type inference failed for: r0v2, types: [android.support.v4.app.c, android.support.v4.app.a, java.lang.Object] */
    public static c asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(c.f95a);
        if (queryLocalInterface != null && (queryLocalInterface instanceof c)) {
            return (c) queryLocalInterface;
        }
        ?? obj = new Object();
        obj.c = iBinder;
        return obj;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        Object obj;
        String str = c.f95a;
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i10 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                cancelAll(parcel.readString());
            } else {
                cancel(parcel.readString(), parcel.readInt(), parcel.readString());
            }
        } else {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            String readString2 = parcel.readString();
            Parcelable.Creator creator = Notification.CREATOR;
            if (parcel.readInt() != 0) {
                obj = creator.createFromParcel(parcel);
            } else {
                obj = null;
            }
            notify(readString, readInt, readString2, (Notification) obj);
        }
        return true;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
