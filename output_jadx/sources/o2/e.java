package o2;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e extends ViewGroup.MarginLayoutParams implements b {
    public static final Parcelable.Creator<e> CREATOR = new android.support.v4.media.g(10);

    /* renamed from: b, reason: collision with root package name */
    public int f4324b;
    public float c;
    public float d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public float f4325f;

    /* renamed from: g, reason: collision with root package name */
    public int f4326g;

    /* renamed from: h, reason: collision with root package name */
    public int f4327h;

    /* renamed from: i, reason: collision with root package name */
    public int f4328i;

    /* renamed from: j, reason: collision with root package name */
    public int f4329j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4330k;

    @Override // o2.b
    public final int a() {
        return this.e;
    }

    @Override // o2.b
    public final float b() {
        return this.d;
    }

    @Override // o2.b
    public final int c() {
        return this.f4326g;
    }

    @Override // o2.b
    public final int d() {
        return ((ViewGroup.MarginLayoutParams) this).width;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // o2.b
    public final void e(int i10) {
        this.f4326g = i10;
    }

    @Override // o2.b
    public final int f() {
        return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
    }

    @Override // o2.b
    public final int g() {
        return ((ViewGroup.MarginLayoutParams) this).leftMargin;
    }

    @Override // o2.b
    public final int getHeight() {
        return ((ViewGroup.MarginLayoutParams) this).height;
    }

    @Override // o2.b
    public final int getOrder() {
        return this.f4324b;
    }

    @Override // o2.b
    public final int h() {
        return ((ViewGroup.MarginLayoutParams) this).topMargin;
    }

    @Override // o2.b
    public final void i(int i10) {
        this.f4327h = i10;
    }

    @Override // o2.b
    public final float j() {
        return this.c;
    }

    @Override // o2.b
    public final float k() {
        return this.f4325f;
    }

    @Override // o2.b
    public final int l() {
        return ((ViewGroup.MarginLayoutParams) this).rightMargin;
    }

    @Override // o2.b
    public final int m() {
        return this.f4327h;
    }

    @Override // o2.b
    public final boolean n() {
        return this.f4330k;
    }

    @Override // o2.b
    public final int o() {
        return this.f4329j;
    }

    @Override // o2.b
    public final int p() {
        return this.f4328i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f4324b);
        parcel.writeFloat(this.c);
        parcel.writeFloat(this.d);
        parcel.writeInt(this.e);
        parcel.writeFloat(this.f4325f);
        parcel.writeInt(this.f4326g);
        parcel.writeInt(this.f4327h);
        parcel.writeInt(this.f4328i);
        parcel.writeInt(this.f4329j);
        parcel.writeByte(this.f4330k ? (byte) 1 : (byte) 0);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
    }
}
