package b1;

import android.view.View;
import androidx.fragment.app.Fragment;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements View.OnLongClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f287b;
    public final /* synthetic */ Fragment c;

    public /* synthetic */ g(Fragment fragment, int i10) {
        this.f287b = i10;
        this.c = fragment;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.f287b) {
            case 0:
                ((h) this.c).f292f.c();
                return true;
            case 1:
                ((f0.a) this.c).f2238b.c();
                return true;
            case 2:
                ((f0.d) this.c).f2241b.c();
                return true;
            default:
                ((f0.e) this.c).f2242b.c();
                return true;
        }
    }
}
