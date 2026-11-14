package androidx.navigation;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistry;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements LifecycleEventObserver {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f234b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(int i10, Object obj) {
        this.f234b = i10;
        this.c = obj;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        switch (this.f234b) {
            case 0:
                NavController.a((NavController) this.c, lifecycleOwner, event);
                return;
            default:
                SavedStateRegistry.a((SavedStateRegistry) this.c, lifecycleOwner, event);
                return;
        }
    }
}
