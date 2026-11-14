package j3;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.example.navistart.R;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b extends RecyclerView.ItemDecoration {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f3259a;

    /* renamed from: b, reason: collision with root package name */
    public final List f3260b;

    public b() {
        Paint paint = new Paint();
        this.f3259a = paint;
        this.f3260b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        Canvas canvas2;
        super.onDrawOver(canvas, recyclerView, state);
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.f3259a;
        paint.setStrokeWidth(dimension);
        Iterator it = this.f3260b.iterator();
        while (it.hasNext()) {
            ((g) it.next()).getClass();
            paint.setColor(ColorUtils.blendARGB(-65281, -16776961, 0.0f));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).l()) {
                canvas2 = canvas;
                canvas2.drawLine(0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).c.e(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).c.a(), paint);
            } else {
                canvas2 = canvas;
                canvas2.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).c.b(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).c.c(), 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
