package androidx.window.layout;

import androidx.annotation.RestrictTo;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.Metadata;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@ExperimentalWindowApi
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H'¨\u0006\u0005"}, d2 = {"Landroidx/window/layout/WindowMetricsCalculatorDecorator;", "", "decorate", "Landroidx/window/layout/WindowMetricsCalculator;", "calculator", "window_release"}, k = 1, mv = {1, 6, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@RestrictTo({RestrictTo.Scope.TESTS})
/* loaded from: classes.dex */
public interface WindowMetricsCalculatorDecorator {
    @ExperimentalWindowApi
    @RestrictTo({RestrictTo.Scope.TESTS})
    WindowMetricsCalculator decorate(WindowMetricsCalculator calculator);
}
