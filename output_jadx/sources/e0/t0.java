package e0;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.widget.CompoundButton;
import com.example.navistart.MainActivity;
import com.example.navistart.cores.BezFunEnum;
import com.google.android.material.materialswitch.MaterialSwitch;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class t0 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2032a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2033b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ t0(Object obj, Object obj2, Object obj3, int i10) {
        this.f2032a = i10;
        this.f2033b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
        int i10;
        switch (this.f2032a) {
            case 0:
                MainActivity mainActivity = (MainActivity) this.f2033b;
                String str = (String) this.c;
                MaterialSwitch materialSwitch = (MaterialSwitch) this.d;
                String str2 = MainActivity.f750e1;
                h0.b.o().saveBoolean(str, z9);
                try {
                    BezFunEnum valueOf = BezFunEnum.valueOf(str);
                    h0.b.a();
                    h0.b.d().bezoff(valueOf, !z9);
                    mainActivity.f765d1.put(valueOf, materialSwitch);
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                m0.s0 s0Var = (m0.s0) this.f2033b;
                p0.b bVar = (p0.b) this.c;
                p0.a aVar = (p0.a) this.d;
                f5.f fVar = new f5.f(s0Var, bVar, aVar);
                if (!aVar.e) {
                    synchronized (p0.b.c) {
                        try {
                            if (!p0.b.f(bVar.f4961a)) {
                                if (!h0.b.o().loadBoolean(m.h(new byte[]{-125, -73, 8, 16, -9, -49, 43, -65, -123, -101, 5, 11, -52, -53, 4, -86, -104, -91, 15, 14, -51, -54}, new byte[]{-10, -60, 109, 98, -88, -82, 91, -49}), false)) {
                                    ComponentName componentName = aVar.f4954b;
                                    PackageManager packageManager = bVar.f4961a.getPackageManager();
                                    if (z9) {
                                        i10 = 1;
                                    } else {
                                        i10 = 2;
                                    }
                                    packageManager.setComponentEnabledSetting(componentName, i10, 1);
                                }
                                h0.b.o().saveBoolean(p0.b.f4957h + aVar.f4953a, z9);
                                if (!z9) {
                                    new Thread(new b1.n(bVar, aVar.f4954b, fVar, 11), m.h(new byte[]{-15, -11, 26, -116, 6, -5, -49, -26, -49, -43, 59, -43, 88, -16, -52, -15, -38, -40, 59, -47}, new byte[]{-69, -74, 78, -95, 117, -109, -96, -108})).start();
                                    return;
                                }
                                return;
                            }
                            return;
                        } finally {
                        }
                    }
                }
                return;
        }
    }
}
