package o2;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new android.support.v4.media.g(12);

    /* renamed from: b, reason: collision with root package name */
    public int f4348b;
    public int c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "SavedState{mAnchorPosition=" + this.f4348b + ", mAnchorOffset=" + this.c + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f4348b);
        parcel.writeInt(this.c);
    }
}
