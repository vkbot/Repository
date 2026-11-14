package androidx.navigation.ui;

import android.graphics.drawable.Drawable;
import androidx.annotation.StringRes;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.b;
import kotlin.Metadata;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0014J\u0012\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/navigation/ui/ActionBarOnDestinationChangedListener;", "Landroidx/navigation/ui/AbstractAppBarOnDestinationChangedListener;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "configuration", "Landroidx/navigation/ui/AppBarConfiguration;", "(Landroidx/appcompat/app/AppCompatActivity;Landroidx/navigation/ui/AppBarConfiguration;)V", "setNavigationIcon", "", "icon", "Landroid/graphics/drawable/Drawable;", "contentDescription", "", "setTitle", "title", "", "navigation-ui_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ActionBarOnDestinationChangedListener extends AbstractAppBarOnDestinationChangedListener {
    private final AppCompatActivity activity;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ActionBarOnDestinationChangedListener(androidx.appcompat.app.AppCompatActivity r2, androidx.navigation.ui.AppBarConfiguration r3) {
        /*
            r1 = this;
            r2.getClass()
            r3.getClass()
            androidx.appcompat.app.ActionBarDrawerToggle$Delegate r0 = r2.getDrawerToggleDelegate()
            if (r0 == 0) goto L19
            android.content.Context r0 = r0.getActionBarThemedContext()
            r0.getClass()
            r1.<init>(r0, r3)
            r1.activity = r2
            return
        L19:
            java.lang.String r3 = "Activity "
            java.lang.String r0 = " does not have a DrawerToggleDelegate set"
            androidx.navigation.b.f(r2, r3, r0)
            r2 = 0
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.ui.ActionBarOnDestinationChangedListener.<init>(androidx.appcompat.app.AppCompatActivity, androidx.navigation.ui.AppBarConfiguration):void");
    }

    @Override // androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener
    public void setNavigationIcon(Drawable icon, @StringRes int contentDescription) {
        boolean z9;
        ActionBar supportActionBar = this.activity.getSupportActionBar();
        if (supportActionBar != null) {
            if (icon != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            supportActionBar.setDisplayHomeAsUpEnabled(z9);
            ActionBarDrawerToggle.Delegate drawerToggleDelegate = this.activity.getDrawerToggleDelegate();
            if (drawerToggleDelegate != null) {
                drawerToggleDelegate.setActionBarUpIndicator(icon, contentDescription);
                return;
            } else {
                b.f(this.activity, "Activity ", " does not have a DrawerToggleDelegate set");
                return;
            }
        }
        b.f(this.activity, "Activity ", " does not have an ActionBar set via setSupportActionBar()");
    }

    @Override // androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener
    public void setTitle(CharSequence title) {
        ActionBar supportActionBar = this.activity.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setTitle(title);
        } else {
            b.f(this.activity, "Activity ", " does not have an ActionBar set via setSupportActionBar()");
        }
    }
}
