package b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.g;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new g(4);

    /* renamed from: b, reason: collision with root package name */
    public b f261b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void r(int i10, Bundle bundle) {
        b bVar = this.f261b;
        if (bVar != null) {
            try {
                bVar.a(i10, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            try {
                if (this.f261b == null) {
                    this.f261b = new c(this);
                }
                parcel.writeStrongBinder(this.f261b.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void q(int i10, Bundle bundle) {
    }
}
