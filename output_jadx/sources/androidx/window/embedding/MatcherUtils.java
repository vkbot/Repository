package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.window.core.ExperimentalWindowApi;
import j1.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@ExperimentalWindowApi
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\fJ\u001f\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\u000fJ\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroidx/window/embedding/MatcherUtils;", "", "()V", "sDebugMatchers", "", "sMatchersTag", "", "areActivityOrIntentComponentsMatching", "activity", "Landroid/app/Activity;", "ruleComponent", "Landroid/content/ComponentName;", "areActivityOrIntentComponentsMatching$window_release", "areComponentsMatching", "activityComponent", "areComponentsMatching$window_release", "wildcardMatch", "name", "pattern", "window_release"}, k = 1, mv = {1, 6, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class MatcherUtils {
    public static final MatcherUtils INSTANCE = new MatcherUtils();
    public static final boolean sDebugMatchers = false;
    public static final String sMatchersTag = "SplitRuleResolution";

    private MatcherUtils() {
    }

    private final boolean wildcardMatch(String name, String pattern) {
        boolean contains$default;
        int indexOf$default;
        int lastIndexOf$default;
        boolean endsWith$default;
        boolean startsWith$default;
        contains$default = StringsKt__StringsKt.contains$default(pattern, (CharSequence) "*", false, 2, (Object) null);
        if (!contains$default) {
            return false;
        }
        if (!Intrinsics.areEqual(pattern, "*")) {
            indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) pattern, "*", 0, false, 6, (Object) null);
            lastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) pattern, "*", 0, false, 6, (Object) null);
            if (indexOf$default == lastIndexOf$default) {
                endsWith$default = StringsKt__StringsJVMKt.endsWith$default(pattern, "*", false, 2, null);
                if (endsWith$default) {
                    startsWith$default = StringsKt__StringsJVMKt.startsWith$default(name, pattern.substring(0, pattern.length() - 1), false, 2, null);
                    return startsWith$default;
                }
            }
            i.k("Name pattern with a wildcard must only contain a single wildcard in the end");
            return false;
        }
        return true;
    }

    public final boolean areActivityOrIntentComponentsMatching$window_release(Activity activity, ComponentName ruleComponent) {
        ComponentName component;
        activity.getClass();
        ruleComponent.getClass();
        if (areComponentsMatching$window_release(activity.getComponentName(), ruleComponent)) {
            return true;
        }
        Intent intent = activity.getIntent();
        if (intent == null || (component = intent.getComponent()) == null) {
            return false;
        }
        return INSTANCE.areComponentsMatching$window_release(component, ruleComponent);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x007c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean areComponentsMatching$window_release(android.content.ComponentName r6, android.content.ComponentName r7) {
        /*
            r5 = this;
            r7.getClass()
            java.lang.String r0 = "*"
            r1 = 1
            r2 = 0
            if (r6 != 0) goto L1e
            java.lang.String r6 = r7.getPackageName()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r0)
            if (r6 == 0) goto L7c
            java.lang.String r6 = r7.getClassName()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r0)
            if (r6 == 0) goto L7c
            goto L7b
        L1e:
            java.lang.String r3 = r6.toString()
            r3.getClass()
            boolean r0 = kotlin.text.StringsKt.o(r3, r0)
            if (r0 != 0) goto L7d
            java.lang.String r0 = r6.getPackageName()
            java.lang.String r3 = r7.getPackageName()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r0 != 0) goto L50
            java.lang.String r0 = r6.getPackageName()
            r0.getClass()
            java.lang.String r3 = r7.getPackageName()
            r3.getClass()
            boolean r0 = r5.wildcardMatch(r0, r3)
            if (r0 == 0) goto L4e
            goto L50
        L4e:
            r0 = r2
            goto L51
        L50:
            r0 = r1
        L51:
            java.lang.String r3 = r6.getClassName()
            java.lang.String r4 = r7.getClassName()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L76
            java.lang.String r6 = r6.getClassName()
            r6.getClass()
            java.lang.String r7 = r7.getClassName()
            r7.getClass()
            boolean r6 = r5.wildcardMatch(r6, r7)
            if (r6 == 0) goto L74
            goto L76
        L74:
            r6 = r2
            goto L77
        L76:
            r6 = r1
        L77:
            if (r0 == 0) goto L7c
            if (r6 == 0) goto L7c
        L7b:
            return r1
        L7c:
            return r2
        L7d:
            java.lang.String r6 = "Wildcard can only be part of the rule."
            j1.i.k(r6)
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.embedding.MatcherUtils.areComponentsMatching$window_release(android.content.ComponentName, android.content.ComponentName):boolean");
    }
}
