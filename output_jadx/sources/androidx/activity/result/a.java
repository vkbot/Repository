package androidx.activity.result;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ActivityResultCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f147a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f148b;

    public /* synthetic */ a(int i10, Function1 function1) {
        this.f147a = i10;
        this.f148b = function1;
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(Object obj) {
        switch (this.f147a) {
            case 0:
                ActivityResultCallerKt.a(obj, this.f148b);
                return;
            default:
                ActivityResultCallerKt.b(obj, this.f148b);
                return;
        }
    }
}
