package e0;

import android.view.View;
import com.example.navistart.VibVodPopUp;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class k3 implements View.OnLongClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1955b;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.f1955b) {
            case 0:
                h0.b.a();
                h0.b.d().carsavvod(1);
                a.a.v(VibVodPopUp.f950b, VibVodPopUp.c);
                throw null;
            case 1:
                h0.b.a();
                h0.b.d().carsavvod(2);
                a.a.v(VibVodPopUp.f950b, VibVodPopUp.c);
                throw null;
            default:
                h0.b.a();
                h0.b.d().carsavvod(3);
                a.a.v(VibVodPopUp.f950b, VibVodPopUp.c);
                throw null;
        }
    }
}
