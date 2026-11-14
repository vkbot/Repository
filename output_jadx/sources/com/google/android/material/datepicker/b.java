package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.util.ObjectsCompat;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new android.support.v4.media.g(5);

    /* renamed from: b, reason: collision with root package name */
    public final r f1297b;
    public final r c;
    public final d d;
    public final r e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1298f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1299g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1300h;

    public b(r rVar, r rVar2, d dVar, r rVar3, int i10) {
        Objects.requireNonNull(rVar, "start cannot be null");
        Objects.requireNonNull(rVar2, "end cannot be null");
        Objects.requireNonNull(dVar, "validator cannot be null");
        this.f1297b = rVar;
        this.c = rVar2;
        this.e = rVar3;
        this.f1298f = i10;
        this.d = dVar;
        if (rVar3 != null && rVar.f1345b.compareTo(rVar3.f1345b) > 0) {
            j1.i.k("start Month cannot be after current Month");
            throw null;
        }
        if (rVar3 != null && rVar3.f1345b.compareTo(rVar2.f1345b) > 0) {
            j1.i.k("current Month cannot be after end Month");
            throw null;
        }
        if (i10 >= 0 && i10 <= a0.c(null).getMaximum(7)) {
            this.f1300h = rVar.t(rVar2) + 1;
            this.f1299g = (rVar2.d - rVar.d) + 1;
        } else {
            j1.i.k("firstDayOfWeek is not valid");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f1297b.equals(bVar.f1297b) && this.c.equals(bVar.c) && ObjectsCompat.equals(this.e, bVar.e) && this.f1298f == bVar.f1298f && this.d.equals(bVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1297b, this.c, this.e, Integer.valueOf(this.f1298f), this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f1297b, 0);
        parcel.writeParcelable(this.c, 0);
        parcel.writeParcelable(this.e, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeInt(this.f1298f);
    }
}
