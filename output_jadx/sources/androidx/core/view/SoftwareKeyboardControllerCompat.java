package androidx.core.view;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.view.SoftwareKeyboardControllerCompat;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class SoftwareKeyboardControllerCompat {
    private final Impl mImpl;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @RequiresApi(20)
    /* loaded from: classes.dex */
    public static class Impl20 extends Impl {

        @Nullable
        private final View mView;

        public Impl20(@Nullable View view) {
            this.mView = view;
        }

        public static /* synthetic */ void lambda$show$0(View view) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
        }

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl
        public void hide() {
            View view = this.mView;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.mView.getWindowToken(), 0);
            }
        }

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl
        public void show() {
            View view = this.mView;
            if (view != null) {
                if (!view.isInEditMode() && !view.onCheckIsTextEditor()) {
                    view = view.getRootView().findFocus();
                } else {
                    view.requestFocus();
                }
                if (view == null) {
                    view = this.mView.getRootView().findViewById(R.id.content);
                }
                if (view != null && view.hasWindowFocus()) {
                    view.post(new g(0, view));
                }
            }
        }
    }

    public SoftwareKeyboardControllerCompat(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.mImpl = new Impl30(view);
        } else {
            this.mImpl = new Impl20(view);
        }
    }

    public void hide() {
        this.mImpl.hide();
    }

    public void show() {
        this.mImpl.show();
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @RequiresApi(30)
    /* loaded from: classes.dex */
    public static class Impl30 extends Impl20 {

        @Nullable
        private View mView;

        @Nullable
        private WindowInsetsController mWindowInsetsController;

        public Impl30(@Nullable WindowInsetsController windowInsetsController) {
            super(null);
            this.mWindowInsetsController = windowInsetsController;
        }

        public static /* synthetic */ void lambda$hide$0(AtomicBoolean atomicBoolean, WindowInsetsController windowInsetsController, int i10) {
            boolean z9;
            if ((i10 & 8) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            atomicBoolean.set(z9);
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [androidx.core.view.h] */
        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl20, androidx.core.view.SoftwareKeyboardControllerCompat.Impl
        public void hide() {
            int ime;
            View view;
            WindowInsetsController windowInsetsController = this.mWindowInsetsController;
            if (windowInsetsController == null) {
                View view2 = this.mView;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                ?? r32 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.core.view.h
                    @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                    public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i10) {
                        SoftwareKeyboardControllerCompat.Impl30.lambda$hide$0(atomicBoolean, windowInsetsController2, i10);
                    }
                };
                windowInsetsController.addOnControllableInsetsChangedListener(r32);
                if (!atomicBoolean.get() && (view = this.mView) != null) {
                    ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.mView.getWindowToken(), 0);
                }
                windowInsetsController.removeOnControllableInsetsChangedListener(r32);
                ime = WindowInsets.Type.ime();
                windowInsetsController.hide(ime);
                return;
            }
            super.hide();
        }

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl20, androidx.core.view.SoftwareKeyboardControllerCompat.Impl
        public void show() {
            int ime;
            View view = this.mView;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.mWindowInsetsController;
            if (windowInsetsController == null) {
                View view2 = this.mView;
                if (view2 != null) {
                    windowInsetsController = view2.getWindowInsetsController();
                } else {
                    windowInsetsController = null;
                }
            }
            if (windowInsetsController != null) {
                ime = WindowInsets.Type.ime();
                windowInsetsController.show(ime);
            } else {
                super.show();
            }
        }

        public Impl30(@NonNull View view) {
            super(view);
            this.mView = view;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class Impl {
        public void hide() {
        }

        public void show() {
        }
    }

    @RequiresApi(30)
    @Deprecated
    public SoftwareKeyboardControllerCompat(@NonNull WindowInsetsController windowInsetsController) {
        this.mImpl = new Impl30(windowInsetsController);
    }
}
