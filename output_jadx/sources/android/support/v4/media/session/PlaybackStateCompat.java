package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new g(4);

    /* renamed from: b, reason: collision with root package name */
    public final int f123b;
    public final long c;
    public final long d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final long f124f;

    /* renamed from: g, reason: collision with root package name */
    public final int f125g;

    /* renamed from: h, reason: collision with root package name */
    public final CharSequence f126h;

    /* renamed from: i, reason: collision with root package name */
    public final long f127i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f128j;

    /* renamed from: k, reason: collision with root package name */
    public final long f129k;

    /* renamed from: l, reason: collision with root package name */
    public final Bundle f130l;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new Object();

        /* renamed from: b, reason: collision with root package name */
        public final String f131b;
        public final CharSequence c;
        public final int d;
        public final Bundle e;

        public CustomAction(Parcel parcel) {
            this.f131b = parcel.readString();
            this.c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.d = parcel.readInt();
            this.e = parcel.readBundle(h.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.c) + ", mIcon=" + this.d + ", mExtras=" + this.e;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f131b);
            TextUtils.writeToParcel(this.c, parcel, i10);
            parcel.writeInt(this.d);
            parcel.writeBundle(this.e);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f123b = parcel.readInt();
        this.c = parcel.readLong();
        this.e = parcel.readFloat();
        this.f127i = parcel.readLong();
        this.d = parcel.readLong();
        this.f124f = parcel.readLong();
        this.f126h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f128j = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f129k = parcel.readLong();
        this.f130l = parcel.readBundle(h.class.getClassLoader());
        this.f125g = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.f123b);
        sb.append(", position=");
        sb.append(this.c);
        sb.append(", buffered position=");
        sb.append(this.d);
        sb.append(", speed=");
        sb.append(this.e);
        sb.append(", updated=");
        sb.append(this.f127i);
        sb.append(", actions=");
        sb.append(this.f124f);
        sb.append(", error code=");
        sb.append(this.f125g);
        sb.append(", error message=");
        sb.append(this.f126h);
        sb.append(", custom actions=");
        sb.append(this.f128j);
        sb.append(", active item id=");
        return ai.onnxruntime.a.n(sb, this.f129k, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f123b);
        parcel.writeLong(this.c);
        parcel.writeFloat(this.e);
        parcel.writeLong(this.f127i);
        parcel.writeLong(this.d);
        parcel.writeLong(this.f124f);
        TextUtils.writeToParcel(this.f126h, parcel, i10);
        parcel.writeTypedList(this.f128j);
        parcel.writeLong(this.f129k);
        parcel.writeBundle(this.f130l);
        parcel.writeInt(this.f125g);
    }
}
