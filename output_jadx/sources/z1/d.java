package z1;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d extends View.BaseSavedState {
    public static final Parcelable.Creator<d> CREATOR = new android.support.v4.media.g(13);

    /* renamed from: b, reason: collision with root package name */
    public float f6692b;
    public float c;
    public float d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f6693f;

    /* renamed from: g, reason: collision with root package name */
    public int f6694g;

    /* renamed from: h, reason: collision with root package name */
    public int f6695h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6696i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f6697j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f6698k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f6699l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6700m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f6701n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f6702o;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeFloat(this.f6692b);
        parcel.writeFloat(this.c);
        parcel.writeInt(this.f6696i ? 1 : 0);
        parcel.writeFloat(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f6693f);
        parcel.writeInt(this.f6694g);
        parcel.writeInt(this.f6695h);
        parcel.writeInt(this.f6697j ? 1 : 0);
        parcel.writeInt(this.f6698k ? 1 : 0);
        parcel.writeInt(this.f6699l ? 1 : 0);
        parcel.writeInt(this.f6700m ? 1 : 0);
        parcel.writeInt(this.f6701n ? 1 : 0);
        parcel.writeInt(this.f6702o ? 1 : 0);
    }
}
