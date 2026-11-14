package x1;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import w1.e;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        float readFloat = parcel.readFloat();
        float readFloat2 = parcel.readFloat();
        int readInt = parcel.readInt();
        float readFloat3 = parcel.readFloat();
        Serializable readSerializable = parcel.readSerializable();
        readSerializable.getClass();
        b bVar = new b(readFloat, readFloat2, readInt, readFloat3, (c) readSerializable);
        bVar.d = parcel.readFloat();
        e eVar = bVar.f6487b;
        if (eVar != null) {
            eVar.i();
        }
        return bVar;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new b[i10];
    }
}
