package androidx.activity;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/activity/OnBackPressedDispatcher;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ComponentActivity$onBackPressedDispatcher$2 extends Lambda implements Function0<OnBackPressedDispatcher> {
    final /* synthetic */ ComponentActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComponentActivity$onBackPressedDispatcher$2(ComponentActivity componentActivity) {
        super(0);
        this.this$0 = componentActivity;
    }

    public static final void invoke$lambda$0(ComponentActivity componentActivity) {
        try {
            super/*android.app.Activity*/.onBackPressed();
        } catch (IllegalStateException e) {
            if (Intrinsics.areEqual(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
            } else {
                throw e;
            }
        } catch (NullPointerException e6) {
            if (!Intrinsics.areEqual(e6.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e6;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final OnBackPressedDispatcher invoke() {
        final OnBackPressedDispatcher onBackPressedDispatcher = new OnBackPressedDispatcher(new g(this.this$0, 0));
        final ComponentActivity componentActivity = this.this$0;
        if (Build.VERSION.SDK_INT >= 33) {
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                componentActivity.addObserverForBackInvoker(onBackPressedDispatcher);
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComponentActivity.access$addObserverForBackInvoker(ComponentActivity.this, onBackPressedDispatcher);
                    }
                });
                return onBackPressedDispatcher;
            }
        }
        return onBackPressedDispatcher;
    }
}
