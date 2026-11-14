package e0;

import android.view.View;
import com.example.navistart.VibVodPopUp;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class j3 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1949b;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1949b) {
            case 0:
                h0.b.a();
                h0.b.d().carsetvod(1);
                a.a.v(VibVodPopUp.f950b, VibVodPopUp.c);
                throw null;
            case 1:
                h0.b.a();
                h0.b.d().carsetvod(2);
                a.a.v(VibVodPopUp.f950b, VibVodPopUp.c);
                throw null;
            case 2:
                h0.b.a();
                h0.b.d().carsetvod(3);
                a.a.v(VibVodPopUp.f950b, VibVodPopUp.c);
                throw null;
            default:
                a.a.v(VibVodPopUp.f950b, VibVodPopUp.c);
                throw null;
        }
    }
}
