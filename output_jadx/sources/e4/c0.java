package e4;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.customview.view.AbsSavedState;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c0 extends AbsSavedState {
    public static final Parcelable.Creator<c0> CREATOR = new a4.e(2);

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f2121b;
    public boolean c;

    public c0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2121b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.c = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f2121b) + "}";
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        TextUtils.writeToParcel(this.f2121b, parcel, i10);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
