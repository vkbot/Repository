package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class MediaSessionCompat$QueueItem implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new g(1);

    /* renamed from: b, reason: collision with root package name */
    public final MediaDescriptionCompat f118b;
    public final long c;

    public MediaSessionCompat$QueueItem(Parcel parcel) {
        this.f118b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.c = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
        sb.append(this.f118b);
        sb.append(", Id=");
        return ai.onnxruntime.a.n(sb, this.c, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        this.f118b.writeToParcel(parcel, i10);
        parcel.writeLong(this.c);
    }
}
