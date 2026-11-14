package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new g(0);

    /* renamed from: b, reason: collision with root package name */
    public final int f96b;
    public final MediaDescriptionCompat c;

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f96b = parcel.readInt();
        this.c = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaItem{mFlags=" + this.f96b + ", mDescription=" + this.c + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f96b);
        this.c.writeToParcel(parcel, i10);
    }
}
