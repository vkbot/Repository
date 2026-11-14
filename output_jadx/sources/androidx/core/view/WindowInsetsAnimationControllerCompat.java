package androidx.core.view;

import android.view.WindowInsetsAnimationController;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.Insets;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class WindowInsetsAnimationControllerCompat {
    private final Impl mImpl;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @RequiresApi(30)
    /* loaded from: classes.dex */
    public static class Impl30 extends Impl {
        private final WindowInsetsAnimationController mController;

        public Impl30(@NonNull WindowInsetsAnimationController windowInsetsAnimationController) {
            this.mController = windowInsetsAnimationController;
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public void finish(boolean z9) {
            this.mController.finish(z9);
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public float getCurrentAlpha() {
            float currentAlpha;
            currentAlpha = this.mController.getCurrentAlpha();
            return currentAlpha;
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public float getCurrentFraction() {
            float currentFraction;
            currentFraction = this.mController.getCurrentFraction();
            return currentFraction;
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        @NonNull
        public Insets getCurrentInsets() {
            android.graphics.Insets currentInsets;
            currentInsets = this.mController.getCurrentInsets();
            return Insets.toCompatInsets(currentInsets);
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        @NonNull
        public Insets getHiddenStateInsets() {
            return Insets.toCompatInsets(m.d(this.mController));
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        @NonNull
        public Insets getShownStateInsets() {
            android.graphics.Insets shownStateInsets;
            shownStateInsets = this.mController.getShownStateInsets();
            return Insets.toCompatInsets(shownStateInsets);
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public int getTypes() {
            int types;
            types = this.mController.getTypes();
            return types;
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public boolean isCancelled() {
            return m.q(this.mController);
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public boolean isFinished() {
            boolean isFinished;
            isFinished = this.mController.isFinished();
            return isFinished;
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public void setInsetsAndAlpha(@Nullable Insets insets, float f8, float f10) {
            android.graphics.Insets platformInsets;
            WindowInsetsAnimationController windowInsetsAnimationController = this.mController;
            if (insets == null) {
                platformInsets = null;
            } else {
                platformInsets = insets.toPlatformInsets();
            }
            m.j(windowInsetsAnimationController, platformInsets, f8, f10);
        }
    }

    @RequiresApi(30)
    public WindowInsetsAnimationControllerCompat(@NonNull WindowInsetsAnimationController windowInsetsAnimationController) {
        this.mImpl = new Impl30(windowInsetsAnimationController);
    }

    public void finish(boolean z9) {
        this.mImpl.finish(z9);
    }

    public float getCurrentAlpha() {
        return this.mImpl.getCurrentAlpha();
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getCurrentFraction() {
        return this.mImpl.getCurrentFraction();
    }

    @NonNull
    public Insets getCurrentInsets() {
        return this.mImpl.getCurrentInsets();
    }

    @NonNull
    public Insets getHiddenStateInsets() {
        return this.mImpl.getHiddenStateInsets();
    }

    @NonNull
    public Insets getShownStateInsets() {
        return this.mImpl.getShownStateInsets();
    }

    public int getTypes() {
        return this.mImpl.getTypes();
    }

    public boolean isCancelled() {
        return this.mImpl.isCancelled();
    }

    public boolean isFinished() {
        return this.mImpl.isFinished();
    }

    public boolean isReady() {
        if (!isFinished() && !isCancelled()) {
            return true;
        }
        return false;
    }

    public void setInsetsAndAlpha(@Nullable Insets insets, @FloatRange(from = 0.0d, to = 1.0d) float f8, @FloatRange(from = 0.0d, to = 1.0d) float f10) {
        this.mImpl.setInsetsAndAlpha(insets, f8, f10);
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class Impl {
        public float getCurrentAlpha() {
            return 0.0f;
        }

        @FloatRange(from = 0.0d, to = 1.0d)
        public float getCurrentFraction() {
            return 0.0f;
        }

        @NonNull
        public Insets getCurrentInsets() {
            return Insets.NONE;
        }

        @NonNull
        public Insets getHiddenStateInsets() {
            return Insets.NONE;
        }

        @NonNull
        public Insets getShownStateInsets() {
            return Insets.NONE;
        }

        public int getTypes() {
            return 0;
        }

        public boolean isCancelled() {
            return true;
        }

        public boolean isFinished() {
            return false;
        }

        public void finish(boolean z9) {
        }

        public void setInsetsAndAlpha(@Nullable Insets insets, @FloatRange(from = 0.0d, to = 1.0d) float f8, @FloatRange(from = 0.0d, to = 1.0d) float f10) {
        }
    }
}
