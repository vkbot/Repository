package com.google.android.material.appbar;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d extends AbsSavedState {
    public static final Parcelable.Creator<d> CREATOR = new Object();

    /* renamed from: b, reason: collision with root package name */
    public boolean f1195b;
    public boolean c;
    public int d;
    public float e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1196f;

    public d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z9;
        boolean z10;
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f1195b = z9;
        if (parcel.readByte() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.c = z10;
        this.d = parcel.readInt();
        this.e = parcel.readFloat();
        this.f1196f = parcel.readByte() != 0;
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeByte(this.f1195b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.d);
        parcel.writeFloat(this.e);
        parcel.writeByte(this.f1196f ? (byte) 1 : (byte) 0);
    }
}
