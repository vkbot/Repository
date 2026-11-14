package s1;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class l0 extends o0 {

    /* renamed from: b, reason: collision with root package name */
    public j0 f5535b;
    public View c;
    public TextView d;
    public TextView e;

    /* renamed from: f, reason: collision with root package name */
    public b f5536f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5537g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f5538h;

    /* renamed from: i, reason: collision with root package name */
    public TextView f5539i;

    /* renamed from: j, reason: collision with root package name */
    public ImageView f5540j;

    /* renamed from: k, reason: collision with root package name */
    public TextView f5541k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f5542l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f5543m;

    /* renamed from: n, reason: collision with root package name */
    public ImageView f5544n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f5545o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f5546p;

    /* renamed from: q, reason: collision with root package name */
    public final View[] f5547q;

    public l0(Context context) {
        super(context);
        this.f5547q = new View[3];
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f5536f != null && this.f5537g) {
            if (this.e != null && motionEvent.getX() >= this.e.getLeft() && motionEvent.getY() >= this.e.getTop()) {
                return false;
            }
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
