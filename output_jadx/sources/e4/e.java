package e4;

import com.google.android.material.internal.CheckableImageButton;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e extends q {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(p pVar, int i10) {
        super(pVar);
        this.e = i10;
    }

    @Override // e4.q
    public void q() {
        switch (this.e) {
            case 0:
                p pVar = this.f2168b;
                pVar.f2162p = null;
                CheckableImageButton checkableImageButton = pVar.f2154h;
                checkableImageButton.setOnLongClickListener(null);
                y5.k.s(checkableImageButton, null);
                return;
            default:
                return;
        }
    }
}
