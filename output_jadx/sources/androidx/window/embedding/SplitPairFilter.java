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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0016\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0014J\b\u0010\u0019\u001a\u00020\u0006H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001a"}, d2 = {"Landroidx/window/embedding/SplitPairFilter;", "", "primaryActivityName", "Landroid/content/ComponentName;", "secondaryActivityName", "secondaryActivityIntentAction", "", "(Landroid/content/ComponentName;Landroid/content/ComponentName;Ljava/lang/String;)V", "getPrimaryActivityName", "()Landroid/content/ComponentName;", "getSecondaryActivityIntentAction", "()Ljava/lang/String;", "getSecondaryActivityName", "equals", "", "other", "hashCode", "", "matchesActivityIntentPair", "primaryActivity", "Landroid/app/Activity;", "secondaryActivityIntent", "Landroid/content/Intent;", "matchesActivityPair", "secondaryActivity", "toString", "window_release"}, k = 1, mv = {1, 6, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class SplitPairFilter {
    private final ComponentName primaryActivityName;
    private final String secondaryActivityIntentAction;
    private final ComponentName secondaryActivityName;

    public SplitPairFilter(ComponentName componentName, ComponentName componentName2, String str) {
        boolean contains$default;
        boolean contains$default2;
        boolean contains$default3;
        boolean contains$default4;
        int indexOf$default;
        int indexOf$default2;
        int indexOf$default3;
        int indexOf$default4;
        componentName.getClass();
        componentName2.getClass();
        this.primaryActivityName = componentName;
        this.secondaryActivityName = componentName2;
        this.secondaryActivityIntentAction = str;
        String packageName = componentName.getPackageName();
        packageName.getClass();
        String className = componentName.getClassName();
        className.getClass();
        String packageName2 = componentName2.getPackageName();
        packageName2.getClass();
        String className2 = componentName2.getClassName();
        className2.getClass();
        if (packageName.length() != 0 && packageName2.length() != 0) {
            if (className.length() != 0 && className2.length() != 0) {
                contains$default = StringsKt__StringsKt.contains$default(packageName, (CharSequence) "*", false, 2, (Object) null);
                if (contains$default) {
                    indexOf$default4 = StringsKt__StringsKt.indexOf$default((CharSequence) packageName, "*", 0, false, 6, (Object) null);
                    if (indexOf$default4 != packageName.length() - 1) {
                        i.k("Wildcard in package name is only allowed at the end.");
                        throw null;
                    }
                }
                contains$default2 = StringsKt__StringsKt.contains$default(className, (CharSequence) "*", false, 2, (Object) null);
                if (contains$default2) {
                    indexOf$default3 = StringsKt__StringsKt.indexOf$default((CharSequence) className, "*", 0, false, 6, (Object) null);
                    if (indexOf$default3 != className.length() - 1) {
                        i.k("Wildcard in class name is only allowed at the end.");
                        throw null;
                    }
                }
                contains$default3 = StringsKt__StringsKt.contains$default(packageName2, (CharSequence) "*", false, 2, (Object) null);
                if (contains$default3) {
                    indexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) packageName2, "*", 0, false, 6, (Object) null);
                    if (indexOf$default2 != packageName2.length() - 1) {
                        i.k("Wildcard in package name is only allowed at the end.");
                        throw null;
                    }
                }
                contains$default4 = StringsKt__StringsKt.contains$default(className2, (CharSequence) "*", false, 2, (Object) null);
                if (contains$default4) {
                    indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) className2, "*", 0, false, 6, (Object) null);
                    if (indexOf$default != className2.length() - 1) {
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
        if (!(other instanceof SplitPairFilter)) {
            return false;
        }
        SplitPairFilter splitPairFilter = (SplitPairFilter) other;
        if (Intrinsics.areEqual(this.primaryActivityName, splitPairFilter.primaryActivityName) && Intrinsics.areEqual(this.secondaryActivityName, splitPairFilter.secondaryActivityName) && Intrinsics.areEqual(this.secondaryActivityIntentAction, splitPairFilter.secondaryActivityIntentAction)) {
            return true;
        }
        return false;
    }

    public final ComponentName getPrimaryActivityName() {
        return this.primaryActivityName;
    }

    public final String getSecondaryActivityIntentAction() {
        return this.secondaryActivityIntentAction;
    }

    public final ComponentName getSecondaryActivityName() {
        return this.secondaryActivityName;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.secondaryActivityName.hashCode() + (this.primaryActivityName.hashCode() * 31)) * 31;
        String str = this.secondaryActivityIntentAction;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final boolean matchesActivityIntentPair(Activity primaryActivity, Intent secondaryActivityIntent) {
        primaryActivity.getClass();
        secondaryActivityIntent.getClass();
        ComponentName componentName = primaryActivity.getComponentName();
        MatcherUtils matcherUtils = MatcherUtils.INSTANCE;
        if (!matcherUtils.areComponentsMatching$window_release(componentName, this.primaryActivityName) || !matcherUtils.areComponentsMatching$window_release(secondaryActivityIntent.getComponent(), this.secondaryActivityName)) {
            return false;
        }
        String str = this.secondaryActivityIntentAction;
        if (str != null && !Intrinsics.areEqual(str, secondaryActivityIntent.getAction())) {
            return false;
        }
        return true;
    }

    public final boolean matchesActivityPair(Activity primaryActivity, Activity secondaryActivity) {
        boolean z9;
        primaryActivity.getClass();
        secondaryActivity.getClass();
        MatcherUtils matcherUtils = MatcherUtils.INSTANCE;
        if (matcherUtils.areComponentsMatching$window_release(primaryActivity.getComponentName(), this.primaryActivityName) && matcherUtils.areComponentsMatching$window_release(secondaryActivity.getComponentName(), this.secondaryActivityName)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (secondaryActivity.getIntent() != null) {
            if (z9) {
                Intent intent = secondaryActivity.getIntent();
                intent.getClass();
                if (matchesActivityIntentPair(primaryActivity, intent)) {
                    return true;
                }
            }
            return false;
        }
        return z9;
    }

    public String toString() {
        return "SplitPairFilter{primaryActivityName=" + this.primaryActivityName + ", secondaryActivityName=" + this.secondaryActivityName + ", secondaryActivityAction=" + ((Object) this.secondaryActivityIntentAction) + '}';
    }
}
