package e0;

import android.view.View;
import android.widget.AdapterView;
import com.example.navistart.MainActivity;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class z0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i1 f2089b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ MainActivity e;

    public z0(MainActivity mainActivity, i1 i1Var, String str, boolean z9) {
        this.e = mainActivity;
        this.f2089b = i1Var;
        this.c = str;
        this.d = z9;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
        j1 j1Var = (j1) this.f2089b.getItem(i10);
        if (j1Var != null) {
            String str = j1Var.f1946a;
            h0.b.o().saveString(this.c, str);
            if (this.d) {
                this.e.w = str;
            }
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
