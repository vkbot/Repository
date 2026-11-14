package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class g implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134a;

    /* JADX WARN: Type inference failed for: r0v1, types: [android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.support.v4.media.session.ParcelableVolumeInfo, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f134a) {
            case 0:
                ?? obj = new Object();
                obj.f119b = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return obj;
            case 1:
                return new MediaSessionCompat$QueueItem(parcel);
            case 2:
                return new MediaSessionCompat$Token(parcel.readParcelable(null), null);
            case 3:
                ?? obj2 = new Object();
                obj2.f121b = parcel.readInt();
                obj2.d = parcel.readInt();
                obj2.e = parcel.readInt();
                obj2.f122f = parcel.readInt();
                obj2.c = parcel.readInt();
                return obj2;
            default:
                return new PlaybackStateCompat(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f134a) {
            case 0:
                return new MediaSessionCompat$ResultReceiverWrapper[i10];
            case 1:
                return new MediaSessionCompat$QueueItem[i10];
            case 2:
                return new MediaSessionCompat$Token[i10];
            case 3:
                return new ParcelableVolumeInfo[i10];
            default:
                return new PlaybackStateCompat[i10];
        }
    }
}
