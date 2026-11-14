package t0;

import android.view.View;
import android.widget.AdapterView;
import j0.e;
import w0.o0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b implements AdapterView.OnItemSelectedListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5741b;
    public final /* synthetic */ o0 c;

    public /* synthetic */ b(o0 o0Var, int i10) {
        this.f5741b = i10;
        this.c = o0Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
        switch (this.f5741b) {
            case 0:
                this.c.f6217b = (e) adapterView.getItemAtPosition(i10);
                return;
            default:
                this.c.f6217b = (e) adapterView.getItemAtPosition(i10);
                return;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i10 = this.f5741b;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
