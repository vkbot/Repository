package x1;

import android.os.Parcel;
import android.os.Parcelable;
import j1.i;
import w1.e;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final a CREATOR = new Object();

    /* renamed from: b, reason: collision with root package name */
    public e f6487b;
    public float c;
    public float d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final float f6488f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6489g;

    /* renamed from: h, reason: collision with root package name */
    public final c f6490h;

    public b(float f8, float f10, int i10, float f11, c cVar) {
        cVar.getClass();
        this.c = f11;
        this.e = f8;
        this.f6488f = f10;
        this.f6489g = i10;
        this.f6490h = cVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void q(e eVar) {
        if (this.f6487b == null) {
            this.f6487b = eVar;
        } else {
            i.k("This instance of Section is already attached to a Gauge.");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.getClass();
        parcel.writeFloat(this.e);
        parcel.writeFloat(this.f6488f);
        parcel.writeInt(this.f6489g);
        parcel.writeFloat(this.c);
        parcel.writeSerializable(Integer.valueOf(this.f6490h.ordinal()));
        parcel.writeFloat(this.d);
    }

    public /* synthetic */ b(float f8, float f10, float f11, int i10) {
        this(f8, f10, i10, f11, c.c);
    }
}
