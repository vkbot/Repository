package w0;

import com.example.navistart.R;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class s0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6229b;
    public final /* synthetic */ v0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ s0(v0 v0Var, int i10, int i11) {
        this.f6229b = i11;
        this.c = v0Var;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6229b) {
            case 0:
                v0 v0Var = this.c;
                v0Var.f6249i.setText(v0Var.getString(R.string.vosk_model_loading, Integer.valueOf(this.d)));
                return;
            default:
                v0 v0Var2 = this.c;
                v0Var2.f6252l.setText(v0Var2.getString(R.string.voice_engine_loading, Integer.valueOf(this.d)));
                return;
        }
    }
}
