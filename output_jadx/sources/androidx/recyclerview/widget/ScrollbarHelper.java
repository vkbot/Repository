package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class ScrollbarHelper {
    private ScrollbarHelper() {
    }

    public static int computeScrollExtent(RecyclerView.State state, OrientationHelper orientationHelper, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z9) {
        if (layoutManager.getChildCount() != 0 && state.getItemCount() != 0 && view != null && view2 != null) {
            if (!z9) {
                return Math.abs(layoutManager.getPosition(view) - layoutManager.getPosition(view2)) + 1;
            }
            return Math.min(orientationHelper.getTotalSpace(), orientationHelper.getDecoratedEnd(view2) - orientationHelper.getDecoratedStart(view));
        }
        return 0;
    }

    public static int computeScrollOffset(RecyclerView.State state, OrientationHelper orientationHelper, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z9, boolean z10) {
        int max;
        if (layoutManager.getChildCount() == 0 || state.getItemCount() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(layoutManager.getPosition(view), layoutManager.getPosition(view2));
        int max2 = Math.max(layoutManager.getPosition(view), layoutManager.getPosition(view2));
        if (z10) {
            max = Math.max(0, (state.getItemCount() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z9) {
            return max;
        }
        return Math.round((max * (Math.abs(orientationHelper.getDecoratedEnd(view2) - orientationHelper.getDecoratedStart(view)) / (Math.abs(layoutManager.getPosition(view) - layoutManager.getPosition(view2)) + 1))) + (orientationHelper.getStartAfterPadding() - orientationHelper.getDecoratedStart(view)));
    }

    public static int computeScrollRange(RecyclerView.State state, OrientationHelper orientationHelper, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z9) {
        if (layoutManager.getChildCount() != 0 && state.getItemCount() != 0 && view != null && view2 != null) {
            if (!z9) {
                return state.getItemCount();
            }
            return (int) (((orientationHelper.getDecoratedEnd(view2) - orientationHelper.getDecoratedStart(view)) / (Math.abs(layoutManager.getPosition(view) - layoutManager.getPosition(view2)) + 1)) * state.getItemCount());
        }
        return 0;
    }
}
