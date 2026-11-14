package e0;

import android.view.KeyEvent;
import com.example.navistart.ModernMainActivity;
import com.example.navistart.mainview.YMovLay;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class r1 implements t1.p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f2018b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ KeyEvent.Callback e;

    public /* synthetic */ r1(KeyEvent.Callback callback, Object obj, Object obj2, KeyEvent.Callback callback2) {
        this.f2018b = callback;
        this.c = obj;
        this.d = obj2;
        this.e = callback2;
    }

    @Override // t1.p
    public void a(int i10, boolean z9) {
        ModernMainActivity modernMainActivity = (ModernMainActivity) this.f2018b;
        String str = (String) this.c;
        String str2 = (String) this.d;
        YMovLay yMovLay = (YMovLay) this.e;
        String str3 = ModernMainActivity.B1;
        u0.a o5 = h0.b.o();
        if (!z9) {
            str = str2;
        }
        o5.saveString(str, String.valueOf(i10));
        if (z9) {
            yMovLay.setYLayMovX(String.valueOf(i10));
        } else {
            yMovLay.setYLayMovY(String.valueOf(i10));
        }
        n3.a(modernMainActivity);
    }
}
