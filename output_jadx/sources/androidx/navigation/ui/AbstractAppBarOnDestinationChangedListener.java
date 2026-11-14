package androidx.navigation.ui;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.annotation.StringRes;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.customview.widget.Openable;
import androidx.navigation.FloatingWindow;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\b \u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\"\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019H\u0003J\u001c\u0010\u001a\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0001\u0010\u001d\u001a\u00020\u001eH$J\u0012\u0010\u001f\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010!H$R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Landroidx/navigation/ui/AbstractAppBarOnDestinationChangedListener;", "Landroidx/navigation/NavController$OnDestinationChangedListener;", "context", "Landroid/content/Context;", "configuration", "Landroidx/navigation/ui/AppBarConfiguration;", "(Landroid/content/Context;Landroidx/navigation/ui/AppBarConfiguration;)V", "animator", "Landroid/animation/ValueAnimator;", "arrowDrawable", "Landroidx/appcompat/graphics/drawable/DrawerArrowDrawable;", "openableLayoutWeakReference", "Ljava/lang/ref/WeakReference;", "Landroidx/customview/widget/Openable;", "kotlin.jvm.PlatformType", "onDestinationChanged", "", "controller", "Landroidx/navigation/NavController;", "destination", "Landroidx/navigation/NavDestination;", "arguments", "Landroid/os/Bundle;", "setActionBarUpIndicator", "showAsDrawerIndicator", "", "setNavigationIcon", "icon", "Landroid/graphics/drawable/Drawable;", "contentDescription", "", "setTitle", "title", "", "navigation-ui_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAbstractAppBarOnDestinationChangedListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractAppBarOnDestinationChangedListener.kt\nandroidx/navigation/ui/AbstractAppBarOnDestinationChangedListener\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n1#2:100\n*E\n"})
/* loaded from: classes.dex */
public abstract class AbstractAppBarOnDestinationChangedListener implements NavController.OnDestinationChangedListener {
    private ValueAnimator animator;
    private DrawerArrowDrawable arrowDrawable;
    private final AppBarConfiguration configuration;
    private final Context context;
    private final WeakReference<Openable> openableLayoutWeakReference;

    public AbstractAppBarOnDestinationChangedListener(Context context, AppBarConfiguration appBarConfiguration) {
        WeakReference<Openable> weakReference;
        context.getClass();
        appBarConfiguration.getClass();
        this.context = context;
        this.configuration = appBarConfiguration;
        Openable openableLayout = appBarConfiguration.getOpenableLayout();
        if (openableLayout != null) {
            weakReference = new WeakReference<>(openableLayout);
        } else {
            weakReference = null;
        }
        this.openableLayoutWeakReference = weakReference;
    }

    private final void setActionBarUpIndicator(boolean showAsDrawerIndicator) {
        Pair pair;
        int i10;
        float f8;
        DrawerArrowDrawable drawerArrowDrawable = this.arrowDrawable;
        if (drawerArrowDrawable == null || (pair = TuplesKt.to(drawerArrowDrawable, Boolean.TRUE)) == null) {
            DrawerArrowDrawable drawerArrowDrawable2 = new DrawerArrowDrawable(this.context);
            this.arrowDrawable = drawerArrowDrawable2;
            pair = TuplesKt.to(drawerArrowDrawable2, Boolean.FALSE);
        }
        DrawerArrowDrawable drawerArrowDrawable3 = (DrawerArrowDrawable) pair.component1();
        boolean booleanValue = ((Boolean) pair.component2()).booleanValue();
        if (showAsDrawerIndicator) {
            i10 = R.string.nav_app_bar_open_drawer_description;
        } else {
            i10 = R.string.nav_app_bar_navigate_up_description;
        }
        setNavigationIcon(drawerArrowDrawable3, i10);
        if (showAsDrawerIndicator) {
            f8 = 0.0f;
        } else {
            f8 = 1.0f;
        }
        if (booleanValue) {
            float progress = drawerArrowDrawable3.getProgress();
            ValueAnimator valueAnimator = this.animator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(drawerArrowDrawable3, "progress", progress, f8);
            this.animator = ofFloat;
            ofFloat.getClass();
            ofFloat.start();
            return;
        }
        drawerArrowDrawable3.setProgress(f8);
    }

    @Override // androidx.navigation.NavController.OnDestinationChangedListener
    public void onDestinationChanged(NavController controller, NavDestination destination, Bundle arguments) {
        Openable openable;
        controller.getClass();
        destination.getClass();
        if (destination instanceof FloatingWindow) {
            return;
        }
        WeakReference<Openable> weakReference = this.openableLayoutWeakReference;
        if (weakReference != null) {
            openable = weakReference.get();
        } else {
            openable = null;
        }
        if (this.openableLayoutWeakReference != null && openable == null) {
            controller.removeOnDestinationChangedListener(this);
            return;
        }
        String fillInLabel = destination.fillInLabel(this.context, arguments);
        if (fillInLabel != null) {
            setTitle(fillInLabel);
        }
        boolean isTopLevelDestination = this.configuration.isTopLevelDestination(destination);
        boolean z9 = false;
        if (openable == null && isTopLevelDestination) {
            setNavigationIcon(null, 0);
            return;
        }
        if (openable != null && isTopLevelDestination) {
            z9 = true;
        }
        setActionBarUpIndicator(z9);
    }

    public abstract void setNavigationIcon(Drawable icon, @StringRes int contentDescription);

    public abstract void setTitle(CharSequence title);
}
