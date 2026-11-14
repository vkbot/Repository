package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new g(3);

    /* renamed from: b, reason: collision with root package name */
    public final int f104b;
    public final float c;

    public RatingCompat(int i10, float f8) {
        this.f104b = i10;
        this.c = f8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f104b;
    }

    public final String toString() {
        String valueOf;
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f104b);
        sb.append(" rating=");
        float f8 = this.c;
        if (f8 < 0.0f) {
            valueOf = "unrated";
        } else {
            valueOf = String.valueOf(f8);
        }
        sb.append(valueOf);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f104b);
        parcel.writeFloat(this.c);
    }
}
