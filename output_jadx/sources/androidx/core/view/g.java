package androidx.core.view;

import android.view.View;
import androidx.core.view.SoftwareKeyboardControllerCompat;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f195b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g(int i10, Object obj) {
        this.f195b = i10;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f195b) {
            case 0:
                SoftwareKeyboardControllerCompat.Impl20.a((View) this.c);
                return;
            default:
                ViewKt.a((Function0) this.c);
                return;
        }
    }
}
