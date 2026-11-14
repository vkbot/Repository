package e0;

import android.view.View;
import android.widget.AdapterView;
import com.example.navistart.LocServ;
import com.example.navistart.MainActivity;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f1 implements AdapterView.OnItemSelectedListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String[] f1911b;
    public final /* synthetic */ String c;
    public final /* synthetic */ androidx.core.view.inputmethod.a d;

    public f1(String[] strArr, String str, androidx.core.view.inputmethod.a aVar) {
        this.f1911b = strArr;
        this.c = str;
        this.d = aVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
        int i11;
        LocServ locServ;
        i7.m mVar;
        String str = this.f1911b[i10];
        h0.b.o().saveString(this.c, str);
        View view2 = this.d.f197a;
        String str2 = MainActivity.f750e1;
        n0.a aVar = n0.a.e;
        if (aVar.name().equals(str)) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        view2.setVisibility(i11);
        if (str.equals(aVar.name())) {
            LocServ.f742n = Boolean.TRUE;
        } else {
            LocServ.f742n = Boolean.FALSE;
            androidx.fragment.app.h hVar = LocServ.f736h;
            if (hVar != null && (mVar = (locServ = (LocServ) hVar.c).d) != null) {
                mVar.e.e();
                locServ.d = null;
                LocServ.f736h = null;
            }
        }
        try {
            h0.b.a();
            h0.b.i().d();
        } catch (Exception unused) {
            w.c(-1, m.h(new byte[]{-100, -16, -116, -126, -86, 1, 16, 46, -89, -8, -111, -107}, new byte[]{-47, -111, -27, -20, -21, 98, 100, 71})).schedule(new v0(0), 1000L, TimeUnit.MILLISECONDS);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
