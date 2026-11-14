package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.SpecialEffectsController;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f218b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d(List list, SpecialEffectsController.Operation operation, DefaultSpecialEffectsController defaultSpecialEffectsController) {
        this.f218b = 1;
        this.d = list;
        this.e = operation;
        this.c = defaultSpecialEffectsController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f218b) {
            case 0:
                DefaultSpecialEffectsController$startAnimations$3.a((DefaultSpecialEffectsController) this.c, (View) this.d, (DefaultSpecialEffectsController.AnimationInfo) this.e);
                return;
            case 1:
                DefaultSpecialEffectsController.executeOperations$lambda$2((List) this.d, (SpecialEffectsController.Operation) this.e, (DefaultSpecialEffectsController) this.c);
                return;
            default:
                DefaultSpecialEffectsController.startTransitions$lambda$10((FragmentTransitionImpl) this.c, (View) this.d, (Rect) this.e);
                return;
        }
    }

    public /* synthetic */ d(Object obj, View view, Object obj2, int i10) {
        this.f218b = i10;
        this.c = obj;
        this.d = view;
        this.e = obj2;
    }
}
