package t1;

import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.navistart.OverlayService;
import com.example.navistart.R;
import com.example.navistart.mainview.FireballView;
import e0.u1;
import kotlin.jvm.internal.ByteCompanionObject;
import s1.x0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public final WindowManager f5746b;
    public final LinearLayout c;
    public final TextView d;
    public final FireballView e;

    /* renamed from: f, reason: collision with root package name */
    public OverlayService f5747f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f5748g;

    public a(OverlayService overlayService, w0.b bVar) {
        super(overlayService);
        this.f5748g = new Handler(Looper.getMainLooper());
        LayoutInflater.from(overlayService).inflate(R.layout.overlay_layout, (ViewGroup) this, true);
        this.c = (LinearLayout) findViewById(R.id.text_spich_lay);
        this.d = (TextView) findViewById(R.id.tvStatus);
        this.e = (FireballView) findViewById(R.id.fireball);
        this.f5747f = overlayService;
        u1 u1Var = new u1(overlayService, e0.m.h(new byte[]{96, 64, -4, -94, 21, -20, 6, -49, 74, 68, -17, -71, 26, -24}, new byte[]{47, 54, -103, -48, 121, -115, ByteCompanionObject.MAX_VALUE, -100}));
        h0.b.a();
        WindowManager f8 = h0.b.g().b().f(this, u1Var.c);
        this.f5746b = f8;
        u1Var.a(this, f8, new x0(3, this, overlayService));
        u1Var.d();
        setStatusSpickView(bVar);
    }

    public final void a(boolean z9) {
        this.f5748g.post(new c7.e(this, z9, 10));
    }

    public void setStatusSpickView(w0.b bVar) {
        this.f5748g.post(new x0(4, this, bVar));
    }

    public void setText(String str) {
        this.f5748g.post(new x0(2, this, str));
    }
}
