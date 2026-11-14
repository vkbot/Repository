package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandle;
import androidx.savedstate.SavedStateRegistry;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements SavedStateRegistry.SavedStateProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f219a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f220b;

    public /* synthetic */ e(int i10, Object obj) {
        this.f219a = i10;
        this.f220b = obj;
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    public final Bundle saveState() {
        Bundle lambda$init$0;
        switch (this.f219a) {
            case 0:
                lambda$init$0 = ((FragmentActivity) this.f220b).lambda$init$0();
                return lambda$init$0;
            case 1:
                return FragmentManager.b((FragmentManager) this.f220b);
            default:
                return SavedStateHandle.a((SavedStateHandle) this.f220b);
        }
    }
}
