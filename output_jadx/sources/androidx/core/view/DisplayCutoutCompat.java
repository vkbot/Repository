package androidx.core.view;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.util.ObjectsCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class DisplayCutoutCompat {
    private final DisplayCutout mDisplayCutout;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @RequiresApi(28)
    /* loaded from: classes.dex */
    public static class Api28Impl {
        private Api28Impl() {
        }

        @DoNotInline
        public static DisplayCutout createDisplayCutout(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        @DoNotInline
        public static List<Rect> getBoundingRects(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        @DoNotInline
        public static int getSafeInsetBottom(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        @DoNotInline
        public static int getSafeInsetLeft(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        @DoNotInline
        public static int getSafeInsetRight(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        @DoNotInline
        public static int getSafeInsetTop(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @RequiresApi(29)
    /* loaded from: classes.dex */
    public static class Api29Impl {
        private Api29Impl() {
        }

        @DoNotInline
        public static DisplayCutout createDisplayCutout(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4);
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @RequiresApi(30)
    /* loaded from: classes.dex */
    public static class Api30Impl {
        private Api30Impl() {
        }

        @DoNotInline
        public static DisplayCutout createDisplayCutout(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, Insets insets2) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4, insets2);
        }

        @DoNotInline
        public static Insets getWaterfallInsets(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DisplayCutoutCompat(@androidx.annotation.Nullable android.graphics.Rect r3, @androidx.annotation.Nullable java.util.List<android.graphics.Rect> r4) {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            android.view.DisplayCutout r3 = androidx.core.view.DisplayCutoutCompat.Api28Impl.createDisplayCutout(r3, r4)
            goto Lc
        Lb:
            r3 = 0
        Lc:
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.DisplayCutoutCompat.<init>(android.graphics.Rect, java.util.List):void");
    }

    private static DisplayCutout constructDisplayCutout(@NonNull androidx.core.graphics.Insets insets, @Nullable Rect rect, @Nullable Rect rect2, @Nullable Rect rect3, @Nullable Rect rect4, @NonNull androidx.core.graphics.Insets insets2) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            return Api30Impl.createDisplayCutout(insets.toPlatformInsets(), rect, rect2, rect3, rect4, insets2.toPlatformInsets());
        }
        if (i10 >= 29) {
            return Api29Impl.createDisplayCutout(insets.toPlatformInsets(), rect, rect2, rect3, rect4);
        }
        if (i10 >= 28) {
            Rect rect5 = new Rect(insets.left, insets.top, insets.right, insets.bottom);
            ArrayList arrayList = new ArrayList();
            if (rect != null) {
                arrayList.add(rect);
            }
            if (rect2 != null) {
                arrayList.add(rect2);
            }
            if (rect3 != null) {
                arrayList.add(rect3);
            }
            if (rect4 != null) {
                arrayList.add(rect4);
            }
            return Api28Impl.createDisplayCutout(rect5, arrayList);
        }
        return null;
    }

    public static DisplayCutoutCompat wrap(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new DisplayCutoutCompat(displayCutout);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DisplayCutoutCompat.class == obj.getClass()) {
            return ObjectsCompat.equals(this.mDisplayCutout, ((DisplayCutoutCompat) obj).mDisplayCutout);
        }
        return false;
    }

    @NonNull
    public List<Rect> getBoundingRects() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.getBoundingRects(this.mDisplayCutout);
        }
        return Collections.EMPTY_LIST;
    }

    public int getSafeInsetBottom() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.getSafeInsetBottom(this.mDisplayCutout);
        }
        return 0;
    }

    public int getSafeInsetLeft() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.getSafeInsetLeft(this.mDisplayCutout);
        }
        return 0;
    }

    public int getSafeInsetRight() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.getSafeInsetRight(this.mDisplayCutout);
        }
        return 0;
    }

    public int getSafeInsetTop() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.getSafeInsetTop(this.mDisplayCutout);
        }
        return 0;
    }

    @NonNull
    public androidx.core.graphics.Insets getWaterfallInsets() {
        if (Build.VERSION.SDK_INT >= 30) {
            return androidx.core.graphics.Insets.toCompatInsets(Api30Impl.getWaterfallInsets(this.mDisplayCutout));
        }
        return androidx.core.graphics.Insets.NONE;
    }

    public int hashCode() {
        int hashCode;
        DisplayCutout displayCutout = this.mDisplayCutout;
        if (displayCutout != null) {
            hashCode = displayCutout.hashCode();
            return hashCode;
        }
        return 0;
    }

    @NonNull
    public String toString() {
        return "DisplayCutoutCompat{" + this.mDisplayCutout + "}";
    }

    @RequiresApi(28)
    public DisplayCutout unwrap() {
        return this.mDisplayCutout;
    }

    public DisplayCutoutCompat(@NonNull androidx.core.graphics.Insets insets, @Nullable Rect rect, @Nullable Rect rect2, @Nullable Rect rect3, @Nullable Rect rect4, @NonNull androidx.core.graphics.Insets insets2) {
        this(constructDisplayCutout(insets, rect, rect2, rect3, rect4, insets2));
    }

    private DisplayCutoutCompat(DisplayCutout displayCutout) {
        this.mDisplayCutout = displayCutout;
    }
}
