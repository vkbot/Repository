package e0;

import android.view.View;
import android.widget.AdapterView;
import com.example.navistart.MainActivity;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d1 implements AdapterView.OnItemSelectedListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1901b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public d1(String[] strArr, String str) {
        this.f1901b = 2;
        this.c = strArr;
        this.d = str;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
        switch (this.f1901b) {
            case 0:
                String str = ((String[]) this.c)[i10];
                h0.b.o().saveString(m.h(new byte[]{-86, 7, 45, 39, -37, 109, -117, -77, -123, 35}, new byte[]{-23, 70, ByteCompanionObject.MAX_VALUE, 119, -87, 2, -19, -38}), str);
                synchronized (h0.b.class) {
                    h0.b.x(false);
                }
                MainActivity mainActivity = (MainActivity) this.d;
                String str2 = MainActivity.f750e1;
                mainActivity.t(str);
                return;
            case 1:
                j0.e eVar = (j0.e) adapterView.getItemAtPosition(i10);
                j0.c cVar = (j0.c) this.d;
                String str3 = (String) this.c;
                cVar.getClass();
                j0.f.f(str3, eVar);
                return;
            case 2:
                String str4 = ((String[]) this.c)[i10];
                u0.a o5 = h0.b.o();
                String str5 = (String) this.d;
                if (!str4.equals(o5.loadString(str5, ""))) {
                    h0.b.o().saveString(str5, str4);
                    return;
                }
                return;
            default:
                ((w0.o0) this.c).f6217b = (j0.e) adapterView.getItemAtPosition(i10);
                f5.j jVar = ((m0.q1) this.d).d;
                if (jVar != null) {
                    jVar.run();
                    return;
                }
                return;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i10 = this.f1901b;
    }

    public /* synthetic */ d1(int i10, Object obj, Object obj2) {
        this.f1901b = i10;
        this.d = obj;
        this.c = obj2;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }

    private final void c(AdapterView adapterView) {
    }

    private final void d(AdapterView adapterView) {
    }
}
