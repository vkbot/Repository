package t0;

import android.widget.CompoundButton;
import w0.o0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5739a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f5740b;

    public /* synthetic */ a(o0 o0Var, int i10) {
        this.f5739a = i10;
        this.f5740b = o0Var;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
        switch (this.f5739a) {
            case 0:
                this.f5740b.c = z9;
                return;
            default:
                this.f5740b.c = z9;
                return;
        }
    }
}
