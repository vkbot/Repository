package k3;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.g;
import android.view.View;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b extends View.BaseSavedState {

    @NonNull
    public static final Parcelable.Creator<b> CREATOR = new g(9);

    /* renamed from: b, reason: collision with root package name */
    public int f3397b;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i10 = this.f3397b;
        if (i10 != 1) {
            if (i10 != 2) {
                str = "unchecked";
            } else {
                str = "indeterminate";
            }
        } else {
            str = "checked";
        }
        return ai.onnxruntime.a.p(sb, str, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeValue(Integer.valueOf(this.f3397b));
    }
}
