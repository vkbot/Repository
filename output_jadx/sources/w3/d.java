package w3;

import android.graphics.Typeface;
import androidx.core.content.res.ResourcesCompat;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d extends ResourcesCompat.FontCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f6359a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f6360b;

    public d(f fVar, g gVar) {
        this.f6360b = fVar;
        this.f6359a = gVar;
    }

    @Override // androidx.core.content.res.ResourcesCompat.FontCallback
    /* renamed from: onFontRetrievalFailed */
    public final void lambda$callbackFailAsync$1(int i10) {
        this.f6360b.f6373n = true;
        this.f6359a.a(i10);
    }

    @Override // androidx.core.content.res.ResourcesCompat.FontCallback
    /* renamed from: onFontRetrieved */
    public final void lambda$callbackSuccessAsync$0(Typeface typeface) {
        f fVar = this.f6360b;
        Typeface create = Typeface.create(typeface, fVar.d);
        fVar.f6375p = create;
        fVar.f6373n = true;
        this.f6359a.b(create, false);
    }
}
