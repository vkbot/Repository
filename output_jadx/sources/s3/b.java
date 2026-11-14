package s3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b extends AbsSavedState {
    public static final Parcelable.Creator<b> CREATOR = new a4.e(5);

    /* renamed from: b, reason: collision with root package name */
    public boolean f5655b;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f5655b = parcel.readInt() == 1;
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f5655b ? 1 : 0);
    }
}
