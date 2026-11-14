package g0;

import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ru.transfer.MessageData;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public TextView f2419b;
    public TextView c;
    public ImageView d;
    public Button e;

    /* renamed from: f, reason: collision with root package name */
    public LinearLayout f2420f;

    /* renamed from: g, reason: collision with root package name */
    public MessageData f2421g;

    /* renamed from: h, reason: collision with root package name */
    public ViewPropertyAnimator f2422h;

    /* renamed from: i, reason: collision with root package name */
    public d f2423i;

    public MessageData getMsg() {
        return this.f2421g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPropertyAnimator viewPropertyAnimator = this.f2422h;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            this.f2422h = null;
        }
    }

    public void setMessageBubbleViewListener(d dVar) {
        this.f2423i = dVar;
    }
}
