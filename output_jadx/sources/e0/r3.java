package e0;

import android.os.CountDownTimer;
import com.example.navistart.R;
import com.example.navistart.punto;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class r3 extends CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ punto f2020a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(punto puntoVar) {
        super(60000L, 1000L);
        this.f2020a = puntoVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        punto puntoVar = this.f2020a;
        puntoVar.f1074l.setText(puntoVar.getResources().getString(R.string.b_sing));
        puntoVar.f1074l.setEnabled(true);
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j10) {
        this.f2020a.f1074l.setText((j10 / 1000) + m.h(new byte[]{67, 66, 44, 30, -118, -32, -71}, new byte[]{99, -109, -83, -50, 63, 48, 3, -40}));
    }
}
