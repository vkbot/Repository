package a4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f extends AbsSavedState {
    public static final Parcelable.Creator<f> CREATOR = new e(0);

    /* renamed from: b, reason: collision with root package name */
    public final int f33b;

    public f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f33b = parcel.readInt();
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f33b);
    }

    public f(Parcelable parcelable, SideSheetBehavior sideSheetBehavior) {
        super(parcelable);
        this.f33b = sideSheetBehavior.f1404h;
    }
}
