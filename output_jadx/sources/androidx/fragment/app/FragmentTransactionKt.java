package androidx.fragment.app;

import android.os.Bundle;
import androidx.annotation.IdRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0086\b\u001a-\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0086\b\u001a;\u0010\n\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0086\b¨\u0006\u000b"}, d2 = {"add", "Landroidx/fragment/app/FragmentTransaction;", "F", "Landroidx/fragment/app/Fragment;", "containerViewId", "", "tag", "", "args", "Landroid/os/Bundle;", "replace", "fragment-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class FragmentTransactionKt {
    public static final /* synthetic */ <F extends Fragment> FragmentTransaction add(FragmentTransaction fragmentTransaction, String str, Bundle bundle) {
        fragmentTransaction.getClass();
        str.getClass();
        Intrinsics.reifiedOperationMarker(4, "F");
        FragmentTransaction add = fragmentTransaction.add(Fragment.class, bundle, str);
        add.getClass();
        return add;
    }

    public static /* synthetic */ FragmentTransaction add$default(FragmentTransaction fragmentTransaction, int i10, String str, Bundle bundle, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            bundle = null;
        }
        fragmentTransaction.getClass();
        Intrinsics.reifiedOperationMarker(4, "F");
        FragmentTransaction add = fragmentTransaction.add(i10, Fragment.class, bundle, str);
        add.getClass();
        return add;
    }

    public static final /* synthetic */ <F extends Fragment> FragmentTransaction replace(FragmentTransaction fragmentTransaction, @IdRes int i10, String str, Bundle bundle) {
        fragmentTransaction.getClass();
        Intrinsics.reifiedOperationMarker(4, "F");
        FragmentTransaction replace = fragmentTransaction.replace(i10, Fragment.class, bundle, str);
        replace.getClass();
        return replace;
    }

    public static /* synthetic */ FragmentTransaction replace$default(FragmentTransaction fragmentTransaction, int i10, String str, Bundle bundle, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            bundle = null;
        }
        fragmentTransaction.getClass();
        Intrinsics.reifiedOperationMarker(4, "F");
        FragmentTransaction replace = fragmentTransaction.replace(i10, Fragment.class, bundle, str);
        replace.getClass();
        return replace;
    }

    public static final /* synthetic */ <F extends Fragment> FragmentTransaction add(FragmentTransaction fragmentTransaction, @IdRes int i10, String str, Bundle bundle) {
        fragmentTransaction.getClass();
        Intrinsics.reifiedOperationMarker(4, "F");
        FragmentTransaction add = fragmentTransaction.add(i10, Fragment.class, bundle, str);
        add.getClass();
        return add;
    }

    public static /* synthetic */ FragmentTransaction add$default(FragmentTransaction fragmentTransaction, String str, Bundle bundle, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bundle = null;
        }
        fragmentTransaction.getClass();
        str.getClass();
        Intrinsics.reifiedOperationMarker(4, "F");
        FragmentTransaction add = fragmentTransaction.add(Fragment.class, bundle, str);
        add.getClass();
        return add;
    }
}
