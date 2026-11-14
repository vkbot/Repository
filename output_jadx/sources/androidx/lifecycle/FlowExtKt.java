package androidx.lifecycle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import l.d;
import y8.f;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Ly8/f;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/lifecycle/Lifecycle$State;", "minActiveState", "flowWithLifecycle", "(Ly8/f;Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;)Ly8/f;", "lifecycle-runtime-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class FlowExtKt {
    public static final <T> f flowWithLifecycle(f fVar, Lifecycle lifecycle, Lifecycle.State state) {
        fVar.getClass();
        lifecycle.getClass();
        state.getClass();
        return new d((Function2) new FlowExtKt$flowWithLifecycle$1(lifecycle, state, fVar, null));
    }

    public static /* synthetic */ f flowWithLifecycle$default(f fVar, Lifecycle lifecycle, Lifecycle.State state, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return flowWithLifecycle(fVar, lifecycle, state);
    }
}
