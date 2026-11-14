package g3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e extends AbsSavedState {
    public static final Parcelable.Creator<e> CREATOR = new a4.e(3);

    /* renamed from: b, reason: collision with root package name */
    public final int f2448b;
    public final int c;
    public final boolean d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2449f;

    public e(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z9;
        boolean z10;
        this.f2448b = parcel.readInt();
        this.c = parcel.readInt();
        if (parcel.readInt() == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.d = z9;
        if (parcel.readInt() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.e = z10;
        this.f2449f = parcel.readInt() == 1;
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f2448b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f2449f ? 1 : 0);
    }

    public e(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
        super(parcelable);
        this.f2448b = bottomSheetBehavior.N;
        this.c = bottomSheetBehavior.e;
        this.d = bottomSheetBehavior.f1223b;
        this.e = bottomSheetBehavior.I;
        this.f2449f = bottomSheetBehavior.J;
    }
}
