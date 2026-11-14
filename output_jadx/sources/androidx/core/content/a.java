package androidx.core.content;

import androidx.core.util.Consumer;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Consumer {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f167b;

    public /* synthetic */ a(int i10) {
        this.f167b = i10;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        String str = (String) obj;
        switch (this.f167b) {
            case 0:
                IntentSanitizer.lambda$sanitizeByThrowing$1(str);
                return;
            default:
                IntentSanitizer.lambda$sanitizeByFiltering$0(str);
                return;
        }
    }
}
