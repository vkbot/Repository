package androidx.fragment.app;

import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.SpecialEffectsController;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f225b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ SpecialEffectsController.Operation d;

    public /* synthetic */ j(Object obj, SpecialEffectsController.Operation operation, int i10) {
        this.f225b = i10;
        this.c = obj;
        this.d = operation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f225b) {
            case 0:
                SpecialEffectsController.a((SpecialEffectsController) this.c, (SpecialEffectsController.FragmentStateManagerOperation) this.d);
                return;
            case 1:
                SpecialEffectsController.b((SpecialEffectsController) this.c, (SpecialEffectsController.FragmentStateManagerOperation) this.d);
                return;
            default:
                DefaultSpecialEffectsController.h((DefaultSpecialEffectsController.TransitionInfo) this.c, this.d);
                return;
        }
    }
}
