package androidx.recyclerview.widget;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class SimpleItemAnimator extends RecyclerView.ItemAnimator {
    private static final boolean DEBUG = false;
    private static final String TAG = "SimpleItemAnimator";
    boolean mSupportsChangeAnimations = true;

    public abstract boolean animateAdd(RecyclerView.ViewHolder viewHolder);

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean animateAppearance(@NonNull RecyclerView.ViewHolder viewHolder, @Nullable RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        int i10;
        int i11;
        if (itemHolderInfo != null && ((i10 = itemHolderInfo.left) != (i11 = itemHolderInfo2.left) || itemHolderInfo.top != itemHolderInfo2.top)) {
            return animateMove(viewHolder, i10, itemHolderInfo.top, i11, itemHolderInfo2.top);
        }
        return animateAdd(viewHolder);
    }

    public abstract boolean animateChange(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i10, int i11, int i12, int i13);

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean animateChange(@NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder viewHolder2, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        int i10;
        int i11 = itemHolderInfo.left;
        int i12 = itemHolderInfo.top;
        if (viewHolder2.shouldIgnore()) {
            i10 = itemHolderInfo.left;
        } else {
            i10 = itemHolderInfo2.left;
            itemHolderInfo = itemHolderInfo2;
        }
        return animateChange(viewHolder, viewHolder2, i11, i12, i10, itemHolderInfo.top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean animateDisappearance(@NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, @Nullable RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        int i10;
        int i11;
        int i12 = itemHolderInfo.left;
        int i13 = itemHolderInfo.top;
        View view = viewHolder.itemView;
        if (itemHolderInfo2 == null) {
            i10 = view.getLeft();
        } else {
            i10 = itemHolderInfo2.left;
        }
        int i14 = i10;
        if (itemHolderInfo2 == null) {
            i11 = view.getTop();
        } else {
            i11 = itemHolderInfo2.top;
        }
        int i15 = i11;
        if (!viewHolder.isRemoved() && (i12 != i14 || i13 != i15)) {
            view.layout(i14, i15, view.getWidth() + i14, view.getHeight() + i15);
            return animateMove(viewHolder, i12, i13, i14, i15);
        }
        return animateRemove(viewHolder);
    }

    public abstract boolean animateMove(RecyclerView.ViewHolder viewHolder, int i10, int i11, int i12, int i13);

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean animatePersistence(@NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        int i10 = itemHolderInfo.left;
        int i11 = itemHolderInfo2.left;
        if (i10 == i11 && itemHolderInfo.top == itemHolderInfo2.top) {
            dispatchMoveFinished(viewHolder);
            return false;
        }
        return animateMove(viewHolder, i10, itemHolderInfo.top, i11, itemHolderInfo2.top);
    }

    public abstract boolean animateRemove(RecyclerView.ViewHolder viewHolder);

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean canReuseUpdatedViewHolder(@NonNull RecyclerView.ViewHolder viewHolder) {
        if (this.mSupportsChangeAnimations && !viewHolder.isInvalid()) {
            return false;
        }
        return true;
    }

    public final void dispatchAddFinished(RecyclerView.ViewHolder viewHolder) {
        onAddFinished(viewHolder);
        dispatchAnimationFinished(viewHolder);
    }

    public final void dispatchAddStarting(RecyclerView.ViewHolder viewHolder) {
        onAddStarting(viewHolder);
    }

    public final void dispatchChangeFinished(RecyclerView.ViewHolder viewHolder, boolean z9) {
        onChangeFinished(viewHolder, z9);
        dispatchAnimationFinished(viewHolder);
    }

    public final void dispatchChangeStarting(RecyclerView.ViewHolder viewHolder, boolean z9) {
        onChangeStarting(viewHolder, z9);
    }

    public final void dispatchMoveFinished(RecyclerView.ViewHolder viewHolder) {
        onMoveFinished(viewHolder);
        dispatchAnimationFinished(viewHolder);
    }

    public final void dispatchMoveStarting(RecyclerView.ViewHolder viewHolder) {
        onMoveStarting(viewHolder);
    }

    public final void dispatchRemoveFinished(RecyclerView.ViewHolder viewHolder) {
        onRemoveFinished(viewHolder);
        dispatchAnimationFinished(viewHolder);
    }

    public final void dispatchRemoveStarting(RecyclerView.ViewHolder viewHolder) {
        onRemoveStarting(viewHolder);
    }

    public boolean getSupportsChangeAnimations() {
        return this.mSupportsChangeAnimations;
    }

    public void setSupportsChangeAnimations(boolean z9) {
        this.mSupportsChangeAnimations = z9;
    }

    public void onAddFinished(RecyclerView.ViewHolder viewHolder) {
    }

    public void onAddStarting(RecyclerView.ViewHolder viewHolder) {
    }

    public void onMoveFinished(RecyclerView.ViewHolder viewHolder) {
    }

    public void onMoveStarting(RecyclerView.ViewHolder viewHolder) {
    }

    public void onRemoveFinished(RecyclerView.ViewHolder viewHolder) {
    }

    public void onRemoveStarting(RecyclerView.ViewHolder viewHolder) {
    }

    public void onChangeFinished(RecyclerView.ViewHolder viewHolder, boolean z9) {
    }

    public void onChangeStarting(RecyclerView.ViewHolder viewHolder, boolean z9) {
    }
}
