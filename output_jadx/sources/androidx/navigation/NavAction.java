package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.IdRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, d2 = {"Landroidx/navigation/NavAction;", "", "destinationId", "", "navOptions", "Landroidx/navigation/NavOptions;", "defaultArguments", "Landroid/os/Bundle;", "(ILandroidx/navigation/NavOptions;Landroid/os/Bundle;)V", "getDefaultArguments", "()Landroid/os/Bundle;", "setDefaultArguments", "(Landroid/os/Bundle;)V", "getDestinationId", "()I", "getNavOptions", "()Landroidx/navigation/NavOptions;", "setNavOptions", "(Landroidx/navigation/NavOptions;)V", "equals", "", "other", "hashCode", "toString", "", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNavAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavAction.kt\nandroidx/navigation/NavAction\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n1855#2,2:90\n*S KotlinDebug\n*F\n+ 1 NavAction.kt\nandroidx/navigation/NavAction\n*L\n58#1:87,3\n67#1:90,2\n*E\n"})
/* loaded from: classes.dex */
public final class NavAction {
    private Bundle defaultArguments;

    @IdRes
    private final int destinationId;
    private NavOptions navOptions;

    public /* synthetic */ NavAction(int i10, NavOptions navOptions, Bundle bundle, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? null : navOptions, (i11 & 4) != 0 ? null : bundle);
    }

    public boolean equals(Object other) {
        Set<String> keySet;
        Object obj;
        if (this == other) {
            return true;
        }
        if (other != null && (other instanceof NavAction)) {
            NavAction navAction = (NavAction) other;
            if (this.destinationId == navAction.destinationId && Intrinsics.areEqual(this.navOptions, navAction.navOptions)) {
                if (!Intrinsics.areEqual(this.defaultArguments, navAction.defaultArguments)) {
                    Bundle bundle = this.defaultArguments;
                    if (bundle != null && (keySet = bundle.keySet()) != null) {
                        if (!keySet.isEmpty()) {
                            for (String str : keySet) {
                                Bundle bundle2 = this.defaultArguments;
                                Object obj2 = null;
                                if (bundle2 != null) {
                                    obj = bundle2.get(str);
                                } else {
                                    obj = null;
                                }
                                Bundle bundle3 = navAction.defaultArguments;
                                if (bundle3 != null) {
                                    obj2 = bundle3.get(str);
                                }
                                if (!Intrinsics.areEqual(obj, obj2)) {
                                }
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final Bundle getDefaultArguments() {
        return this.defaultArguments;
    }

    public final int getDestinationId() {
        return this.destinationId;
    }

    public final NavOptions getNavOptions() {
        return this.navOptions;
    }

    public int hashCode() {
        int i10;
        Set<String> keySet;
        Object obj;
        int i11;
        int hashCode = Integer.hashCode(this.destinationId) * 31;
        NavOptions navOptions = this.navOptions;
        if (navOptions != null) {
            i10 = navOptions.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = hashCode + i10;
        Bundle bundle = this.defaultArguments;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            for (String str : keySet) {
                int i13 = i12 * 31;
                Bundle bundle2 = this.defaultArguments;
                if (bundle2 != null) {
                    obj = bundle2.get(str);
                } else {
                    obj = null;
                }
                if (obj != null) {
                    i11 = obj.hashCode();
                } else {
                    i11 = 0;
                }
                i12 = i13 + i11;
            }
        }
        return i12;
    }

    public final void setDefaultArguments(Bundle bundle) {
        this.defaultArguments = bundle;
    }

    public final void setNavOptions(NavOptions navOptions) {
        this.navOptions = navOptions;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NavAction(0x");
        sb.append(Integer.toHexString(this.destinationId));
        sb.append(")");
        if (this.navOptions != null) {
            sb.append(" navOptions=");
            sb.append(this.navOptions);
        }
        return sb.toString();
    }

    @JvmOverloads
    public NavAction(@IdRes int i10, NavOptions navOptions) {
        this(i10, navOptions, null, 4, null);
    }

    @JvmOverloads
    public NavAction(@IdRes int i10, NavOptions navOptions, Bundle bundle) {
        this.destinationId = i10;
        this.navOptions = navOptions;
        this.defaultArguments = bundle;
    }

    @JvmOverloads
    public NavAction(@IdRes int i10) {
        this(i10, null, null, 6, null);
    }
}
