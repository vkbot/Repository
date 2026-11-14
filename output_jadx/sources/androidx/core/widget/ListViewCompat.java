package androidx.core.widget;

import android.widget.ListView;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Deprecated
/* loaded from: classes.dex */
public final class ListViewCompat {
    private ListViewCompat() {
    }

    @Deprecated
    public static boolean canScrollList(@NonNull ListView listView, int i10) {
        return listView.canScrollList(i10);
    }

    @Deprecated
    public static void scrollListBy(@NonNull ListView listView, int i10) {
        listView.scrollListBy(i10);
    }
}
