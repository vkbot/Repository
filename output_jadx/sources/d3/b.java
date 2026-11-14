package d3;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.g;
import java.util.Locale;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new g(8);
    public Integer A;
    public Integer B;
    public Integer C;
    public Integer D;
    public Boolean E;
    public Integer F;

    /* renamed from: b, reason: collision with root package name */
    public int f1769b;
    public Integer c;
    public Integer d;
    public Integer e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f1770f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f1771g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f1772h;

    /* renamed from: i, reason: collision with root package name */
    public Integer f1773i;

    /* renamed from: k, reason: collision with root package name */
    public String f1775k;

    /* renamed from: o, reason: collision with root package name */
    public Locale f1779o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f1780p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f1781q;
    public int r;

    /* renamed from: s, reason: collision with root package name */
    public int f1782s;
    public Integer t;

    /* renamed from: v, reason: collision with root package name */
    public Integer f1784v;
    public Integer w;

    /* renamed from: x, reason: collision with root package name */
    public Integer f1785x;

    /* renamed from: y, reason: collision with root package name */
    public Integer f1786y;

    /* renamed from: z, reason: collision with root package name */
    public Integer f1787z;

    /* renamed from: j, reason: collision with root package name */
    public int f1774j = 255;

    /* renamed from: l, reason: collision with root package name */
    public int f1776l = -2;

    /* renamed from: m, reason: collision with root package name */
    public int f1777m = -2;

    /* renamed from: n, reason: collision with root package name */
    public int f1778n = -2;

    /* renamed from: u, reason: collision with root package name */
    public Boolean f1783u = Boolean.TRUE;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str;
        parcel.writeInt(this.f1769b);
        parcel.writeSerializable(this.c);
        parcel.writeSerializable(this.d);
        parcel.writeSerializable(this.e);
        parcel.writeSerializable(this.f1770f);
        parcel.writeSerializable(this.f1771g);
        parcel.writeSerializable(this.f1772h);
        parcel.writeSerializable(this.f1773i);
        parcel.writeInt(this.f1774j);
        parcel.writeString(this.f1775k);
        parcel.writeInt(this.f1776l);
        parcel.writeInt(this.f1777m);
        parcel.writeInt(this.f1778n);
        CharSequence charSequence = this.f1780p;
        String str2 = null;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        parcel.writeString(str);
        CharSequence charSequence2 = this.f1781q;
        if (charSequence2 != null) {
            str2 = charSequence2.toString();
        }
        parcel.writeString(str2);
        parcel.writeInt(this.r);
        parcel.writeSerializable(this.t);
        parcel.writeSerializable(this.f1784v);
        parcel.writeSerializable(this.w);
        parcel.writeSerializable(this.f1785x);
        parcel.writeSerializable(this.f1786y);
        parcel.writeSerializable(this.f1787z);
        parcel.writeSerializable(this.A);
        parcel.writeSerializable(this.D);
        parcel.writeSerializable(this.B);
        parcel.writeSerializable(this.C);
        parcel.writeSerializable(this.f1783u);
        parcel.writeSerializable(this.f1779o);
        parcel.writeSerializable(this.E);
        parcel.writeSerializable(this.F);
    }
}
