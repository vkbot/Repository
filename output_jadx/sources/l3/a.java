package l3;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import s3.i;
import s3.j;
import w3.g;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3491a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3492b;

    public /* synthetic */ a(int i10, Object obj) {
        this.f3491a = i10;
        this.f3492b = obj;
    }

    @Override // w3.g
    public final void a(int i10) {
        switch (this.f3491a) {
            case 0:
                return;
            default:
                j jVar = (j) this.f3492b;
                jVar.e = true;
                i iVar = (i) jVar.f5704f.get();
                if (iVar != null) {
                    iVar.a();
                    return;
                }
                return;
        }
    }

    @Override // w3.g
    public final void b(Typeface typeface, boolean z9) {
        CharSequence text;
        switch (this.f3491a) {
            case 0:
                Chip chip = (Chip) this.f3492b;
                e eVar = chip.f1279b;
                if (eVar.N0) {
                    text = eVar.P;
                } else {
                    text = chip.getText();
                }
                chip.setText(text);
                chip.requestLayout();
                chip.invalidate();
                return;
            default:
                if (!z9) {
                    j jVar = (j) this.f3492b;
                    jVar.e = true;
                    i iVar = (i) jVar.f5704f.get();
                    if (iVar != null) {
                        iVar.a();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    private final void c(int i10) {
    }
}
