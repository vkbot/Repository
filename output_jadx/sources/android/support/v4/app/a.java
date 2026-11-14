package android.support.v4.app;

import android.app.Notification;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a implements c {
    public IBinder c;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.c;
    }

    @Override // android.support.v4.app.c
    public final void cancel(String str, int i10, String str2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(c.f95a);
            obtain.writeString(str);
            obtain.writeInt(i10);
            obtain.writeString(str2);
            this.c.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.app.c
    public final void cancelAll(String str) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(c.f95a);
            obtain.writeString(str);
            this.c.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.app.c
    public final void notify(String str, int i10, String str2, Notification notification) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(c.f95a);
            obtain.writeString(str);
            obtain.writeInt(i10);
            obtain.writeString(str2);
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.c.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
