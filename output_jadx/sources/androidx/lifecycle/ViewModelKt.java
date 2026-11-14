package androidx.lifecycle;

import a9.q;
import androidx.constraintlayout.widget.ConstraintLayout;
import c9.d;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import v8.c1;
import v8.h0;
import v8.x;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0014\u0010\u0001\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0004*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"", "JOB_KEY", "Ljava/lang/String;", "Landroidx/lifecycle/ViewModel;", "Lv8/x;", "getViewModelScope", "(Landroidx/lifecycle/ViewModel;)Lv8/x;", "viewModelScope", "lifecycle-viewmodel-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ViewModelKt {
    private static final String JOB_KEY = "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY";

    public static final x getViewModelScope(ViewModel viewModel) {
        viewModel.getClass();
        x xVar = (x) viewModel.getTag(JOB_KEY);
        if (xVar != null) {
            return xVar;
        }
        c1 c1Var = new c1();
        d dVar = h0.f6029a;
        Object tagIfAbsent = viewModel.setTagIfAbsent(JOB_KEY, new CloseableCoroutineScope(CoroutineContext.Element.DefaultImpls.plus(c1Var, q.f85a.d)));
        tagIfAbsent.getClass();
        return (x) tagIfAbsent;
    }
}
