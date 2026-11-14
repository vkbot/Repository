package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new g(1);

    /* renamed from: b, reason: collision with root package name */
    public final String f97b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;

    /* renamed from: f, reason: collision with root package name */
    public final Bitmap f98f;

    /* renamed from: g, reason: collision with root package name */
    public final Uri f99g;

    /* renamed from: h, reason: collision with root package name */
    public final Bundle f100h;

    /* renamed from: i, reason: collision with root package name */
    public final Uri f101i;

    /* renamed from: j, reason: collision with root package name */
    public MediaDescription f102j;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f97b = str;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = charSequence3;
        this.f98f = bitmap;
        this.f99g = uri;
        this.f100h = bundle;
        this.f101i = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.c) + ", " + ((Object) this.d) + ", " + ((Object) this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        MediaDescription mediaDescription = this.f102j;
        if (mediaDescription == null) {
            MediaDescription.Builder b10 = j.b();
            j.n(b10, this.f97b);
            j.p(b10, this.c);
            j.o(b10, this.d);
            j.j(b10, this.e);
            j.l(b10, this.f98f);
            j.m(b10, this.f99g);
            j.k(b10, this.f100h);
            k.b(b10, this.f101i);
            mediaDescription = j.a(b10);
            this.f102j = mediaDescription;
        }
        mediaDescription.writeToParcel(parcel, i10);
    }
}
