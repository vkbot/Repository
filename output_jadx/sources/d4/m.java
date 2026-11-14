package d4;

import androidx.viewpager.widget.ViewPager;
import com.example.navistart.MainActivity;
import com.example.navistart.R;
import kotlin.jvm.internal.ByteCompanionObject;
import m0.c0;
import m0.d0;
import m0.e0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class m implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1823a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1824b;

    public /* synthetic */ m(int i10, Object obj) {
        this.f1823a = i10;
        this.f1824b = obj;
    }

    @Override // d4.d
    public final void a(i iVar) {
        int i10 = this.f1823a;
        Object obj = this.f1824b;
        switch (i10) {
            case 0:
                ((ViewPager) obj).setCurrentItem(iVar.e);
                return;
            case 1:
                ((MainActivity) obj).findViewById(R.id.main).post(new a4.g(11, this));
                return;
            default:
                d0 d0Var = iVar.f1805a;
                if (d0Var != null) {
                    e0 e0Var = (e0) obj;
                    if (d0Var != e0Var.f3670z) {
                        e0Var.F();
                        c0 c0Var = e0Var.f3664q;
                        if (c0Var != null) {
                            e0Var.f3662o.removeCallbacks(c0Var);
                            e0Var.f3664q = null;
                        }
                        e0Var.z();
                        e0Var.A(e0.m.h(new byte[]{-102, 28, -101, ByteCompanionObject.MAX_VALUE, -7, 82, 23, -89, -116, 31, -100, 98, -18, ByteCompanionObject.MAX_VALUE, 11, -85, -102}, new byte[]{-1, 106, -2, 17, -115, 13, 98, -55}));
                        e0Var.f3670z = d0Var;
                        e0Var.w();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
