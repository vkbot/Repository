package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.window.core.ExperimentalWindowApi;
import j1.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@ExperimentalWindowApi
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Landroidx/window/embedding/ActivityFilter;", "", "componentName", "Landroid/content/ComponentName;", "intentAction", "", "(Landroid/content/ComponentName;Ljava/lang/String;)V", "getComponentName", "()Landroid/content/ComponentName;", "getIntentAction", "()Ljava/lang/String;", "equals", "", "other", "hashCode", "", "matchesActivity", "activity", "Landroid/app/Activity;", "matchesIntent", "intent", "Landroid/content/Intent;", "toString", "window_release"}, k = 1, mv = {1, 6, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ActivityFilter {
    private final ComponentName componentName;
    private final String intentAction;

    public ActivityFilter(ComponentName componentName, String str) {
        boolean contains$default;
        boolean contains$default2;
        int indexOf$default;
        int indexOf$default2;
        componentName.getClass();
        this.componentName = componentName;
        this.intentAction = str;
        String packageName = componentName.getPackageName();
        packageName.getClass();
        String className = componentName.getClassName();
        className.getClass();
        if (packageName.length() > 0) {
            if (className.length() > 0) {
                contains$default = StringsKt__StringsKt.contains$default(packageName, (CharSequence) "*", false, 2, (Object) null);
                if (contains$default) {
                    indexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) packageName, "*", 0, false, 6, (Object) null);
                    if (indexOf$default2 != packageName.length() - 1) {
                        i.k("Wildcard in package name is only allowed at the end.");
                        throw null;
                    }
                }
                contains$default2 = StringsKt__StringsKt.contains$default(className, (CharSequence) "*", false, 2, (Object) null);
                if (contains$default2) {
                    indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) className, "*", 0, false, 6, (Object) null);
                    if (indexOf$default != className.length() - 1) {
                        i.k("Wildcard in class name is only allowed at the end.");
                        throw null;
                    }
                    return;
                }
                return;
            }
            i.k("Activity class name must not be empty.");
            throw null;
        }
        i.k("Package name must not be empty");
        throw null;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivityFilter)) {
            return false;
        }
        ActivityFilter activityFilter = (ActivityFilter) other;
        if (Intrinsics.areEqual(this.componentName, activityFilter.componentName) && Intrinsics.areEqual(this.intentAction, activityFilter.intentAction)) {
            return true;
        }
        return false;
    }

    public final ComponentName getComponentName() {
        return this.componentName;
    }

    public final String getIntentAction() {
        return this.intentAction;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.componentName.hashCode() * 31;
        String str = this.intentAction;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final boolean matchesActivity(Activity activity) {
        String action;
        activity.getClass();
        if (MatcherUtils.INSTANCE.areActivityOrIntentComponentsMatching$window_release(activity, this.componentName)) {
            String str = this.intentAction;
            if (str != null) {
                Intent intent = activity.getIntent();
                if (intent == null) {
                    action = null;
                } else {
                    action = intent.getAction();
                }
                if (Intrinsics.areEqual(str, action)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean matchesIntent(Intent intent) {
        intent.getClass();
        if (!MatcherUtils.INSTANCE.areComponentsMatching$window_release(intent.getComponent(), this.componentName)) {
            return false;
        }
        String str = this.intentAction;
        if (str != null && !Intrinsics.areEqual(str, intent.getAction())) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "ActivityFilter(componentName=" + this.componentName + ", intentAction=" + ((Object) this.intentAction) + ')';
    }
}
