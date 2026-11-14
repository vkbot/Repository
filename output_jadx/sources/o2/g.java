package o2;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class g extends RecyclerView.LayoutParams implements b {
    public static final Parcelable.Creator<g> CREATOR = new android.support.v4.media.g(11);

    /* renamed from: b, reason: collision with root package name */
    public float f4336b;
    public float c;
    public int d;
    public float e;

    /* renamed from: f, reason: collision with root package name */
    public int f4337f;

    /* renamed from: g, reason: collision with root package name */
    public int f4338g;

    /* renamed from: h, reason: collision with root package name */
    public int f4339h;

    /* renamed from: i, reason: collision with root package name */
    public int f4340i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4341j;

    @Override // o2.b
    public final int a() {
        return this.d;
    }

    @Override // o2.b
    public final float b() {
        return this.c;
    }

    @Override // o2.b
    public final int c() {
        return this.f4337f;
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
        this.f4337f = i10;
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
        return 1;
    }

    @Override // o2.b
    public final int h() {
        return ((ViewGroup.MarginLayoutParams) this).topMargin;
    }

    @Override // o2.b
    public final void i(int i10) {
        this.f4338g = i10;
    }

    @Override // o2.b
    public final float j() {
        return this.f4336b;
    }

    @Override // o2.b
    public final float k() {
        return this.e;
    }

    @Override // o2.b
    public final int l() {
        return ((ViewGroup.MarginLayoutParams) this).rightMargin;
    }

    @Override // o2.b
    public final int m() {
        return this.f4338g;
    }

    @Override // o2.b
    public final boolean n() {
        return this.f4341j;
    }

    @Override // o2.b
    public final int o() {
        return this.f4340i;
    }

    @Override // o2.b
    public final int p() {
        return this.f4339h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f4336b);
        parcel.writeFloat(this.c);
        parcel.writeInt(this.d);
        parcel.writeFloat(this.e);
        parcel.writeInt(this.f4337f);
        parcel.writeInt(this.f4338g);
        parcel.writeInt(this.f4339h);
        parcel.writeInt(this.f4340i);
        parcel.writeByte(this.f4341j ? (byte) 1 : (byte) 0);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
    }
}
