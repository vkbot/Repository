package z1;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.example.navistart.R;
import com.github.clans.fab.FloatingActionButton;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6688a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f6689b;

    public /* synthetic */ b(int i10, View view) {
        this.f6688a = i10;
        this.f6689b = view;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.f6688a) {
            case 0:
                FloatingActionButton floatingActionButton = (FloatingActionButton) this.f6689b;
                k kVar = (k) floatingActionButton.getTag(R.id.fab_label);
                if (kVar != null) {
                    kVar.c();
                }
                floatingActionButton.h();
                return super.onDown(motionEvent);
            default:
                k kVar2 = (k) this.f6689b;
                kVar2.c();
                FloatingActionButton floatingActionButton2 = kVar2.f6720n;
                if (floatingActionButton2 != null) {
                    floatingActionButton2.h();
                }
                return super.onDown(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        switch (this.f6688a) {
            case 0:
                FloatingActionButton floatingActionButton = (FloatingActionButton) this.f6689b;
                k kVar = (k) floatingActionButton.getTag(R.id.fab_label);
                if (kVar != null) {
                    kVar.d();
                }
                floatingActionButton.i();
                return super.onSingleTapUp(motionEvent);
            default:
                k kVar2 = (k) this.f6689b;
                kVar2.d();
                FloatingActionButton floatingActionButton2 = kVar2.f6720n;
                if (floatingActionButton2 != null) {
                    floatingActionButton2.i();
                }
                return super.onSingleTapUp(motionEvent);
        }
    }
}
