package androidx.viewpager2.adapter;

import android.os.Parcelable;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public interface StatefulAdapter {
    void restoreState(@NonNull Parcelable parcelable);

    @NonNull
    Parcelable saveState();
}
