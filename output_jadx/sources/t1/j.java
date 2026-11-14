package t1;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.example.navistart.LounchB;
import com.example.navistart.ModernMainActivity;
import com.example.navistart.R;
import com.google.protobuf.q;
import e0.p3;
import e0.x1;
import kotlin.io.encoding.Base64;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class j extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public final Handler f5767b;
    public final Handler c;
    public final i d;
    public final i e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5768f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageView f5769g;

    /* renamed from: h, reason: collision with root package name */
    public final ImageView f5770h;

    /* renamed from: i, reason: collision with root package name */
    public final ImageView f5771i;

    /* renamed from: j, reason: collision with root package name */
    public final ImageView f5772j;

    /* renamed from: k, reason: collision with root package name */
    public final ImageView f5773k;

    /* renamed from: l, reason: collision with root package name */
    public final ImageView f5774l;

    /* renamed from: m, reason: collision with root package name */
    public final ImageView f5775m;

    /* renamed from: n, reason: collision with root package name */
    public final ImageView f5776n;

    /* renamed from: o, reason: collision with root package name */
    public final ImageView f5777o;

    /* renamed from: p, reason: collision with root package name */
    public final FrameLayout f5778p;

    /* renamed from: q, reason: collision with root package name */
    public final FrameLayout f5779q;
    public final FrameLayout r;

    /* renamed from: s, reason: collision with root package name */
    public final FrameLayout f5780s;
    public final FrameLayout t;

    /* renamed from: u, reason: collision with root package name */
    public final FrameLayout f5781u;

    /* renamed from: v, reason: collision with root package name */
    public final FrameLayout f5782v;
    public final FrameLayout w;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v53, types: [t1.i] */
    /* JADX WARN: Type inference failed for: r1v1, types: [t1.i, java.lang.Runnable] */
    public j(LounchB lounchB) {
        super(lounchB, null);
        this.f5768f = false;
        View.inflate(lounchB, R.layout.multibutton, this);
        this.f5769g = (ImageView) findViewById(R.id.centerImage);
        this.f5778p = (FrameLayout) findViewById(R.id.imgTop);
        this.f5779q = (FrameLayout) findViewById(R.id.imgBottom);
        this.r = (FrameLayout) findViewById(R.id.imgLeft);
        this.f5780s = (FrameLayout) findViewById(R.id.imgRight);
        this.t = (FrameLayout) findViewById(R.id.imgTopLeft);
        this.f5781u = (FrameLayout) findViewById(R.id.imgTopRight);
        this.f5782v = (FrameLayout) findViewById(R.id.imgBottomLeft);
        this.w = (FrameLayout) findViewById(R.id.imgBottomRight);
        this.f5770h = (ImageView) findViewById(R.id.badgeTop);
        this.f5771i = (ImageView) findViewById(R.id.badgeBottom);
        this.f5772j = (ImageView) findViewById(R.id.badgeLeft);
        this.f5773k = (ImageView) findViewById(R.id.badgeRight);
        this.f5774l = (ImageView) findViewById(R.id.badgeTopLeft);
        this.f5775m = (ImageView) findViewById(R.id.badgeTopRight);
        this.f5776n = (ImageView) findViewById(R.id.badgeBottomLeft);
        this.f5777o = (ImageView) findViewById(R.id.badgeBottomRight);
        final int i10 = 0;
        g(false, false, false, false, false, false, false, false);
        this.f5767b = new Handler();
        this.d = new Runnable(this) { // from class: t1.i
            public final /* synthetic */ j c;

            {
                this.c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        j jVar = this.c;
                        if (jVar.f5768f) {
                            jVar.b();
                            return;
                        }
                        return;
                    default:
                        j.a(this.c);
                        return;
                }
            }
        };
        Handler handler = new Handler();
        this.c = handler;
        final int i11 = 1;
        ?? r1 = new Runnable(this) { // from class: t1.i
            public final /* synthetic */ j c;

            {
                this.c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        j jVar = this.c;
                        if (jVar.f5768f) {
                            jVar.b();
                            return;
                        }
                        return;
                    default:
                        j.a(this.c);
                        return;
                }
            }
        };
        this.e = r1;
        handler.removeCallbacks(r1);
        this.c.postDelayed(this.e, 10000L);
    }

    public static /* synthetic */ void a(j jVar) {
        if (!jVar.f5768f) {
            jVar.setCenterImageHide(true);
        }
    }

    public static Boolean c() {
        StringBuilder sb = new StringBuilder();
        u0.a o5 = h0.b.o();
        byte[] bArr = e0.m.f1973j;
        String[] strArr = p3.f2001a;
        q.s(bArr, o5, "", sb);
        q.r(new byte[]{108, 105, 99, 116, 95, 114, 105, 117, 101}, sb);
        String g10 = q.g(sb, x1.f2066q);
        u0.a o9 = h0.b.o();
        byte[] bArr2 = e0.m.f1969f;
        if (q.w(bArr2, o9, "", g10)) {
            boolean z9 = true;
            if (q.d(Long.MAX_VALUE, h0.b.a().j()) >= Long.parseLong(new String(q.x(new byte[]{Base64.padSymbol}, new byte[]{13, 51, -84, 27, -34, 103, -70, 0}, h0.b.o(), q.h(e0.m.f1970g, h0.b.o(), new String(bArr2)), 0)))) {
                z9 = false;
            }
            return Boolean.valueOf(z9);
        }
        return Boolean.FALSE;
    }

    public static void f(View view, Runnable runnable) {
        if (c().booleanValue()) {
            view.setOnClickListener(new f1.c(runnable, 1));
        }
    }

    private void setCenterImageHide(boolean z9) {
        ImageView imageView = this.f5769g;
        if (imageView != null) {
            if (z9) {
                imageView.animate().alpha(0.3f).setDuration(300L).start();
            } else {
                imageView.animate().alpha(1.0f).setDuration(300L).start();
            }
        }
    }

    public final void b() {
        if (c().booleanValue()) {
            int loadInt = h0.b.o().loadInt(e0.m.h(new byte[]{7, 81, 82, -32, 31, 44, 78, -79, 15, 123, 91, -3, 17, 27, 79, -99, 8, 81, 74, -32, 25, 29, 72}, new byte[]{106, 36, 62, -108, 118, 115, 59, -62}), 8);
            if (this.f5768f) {
                g(false, false, false, false, false, false, false, false);
                this.f5768f = false;
                Handler handler = this.c;
                i iVar = this.e;
                handler.removeCallbacks(iVar);
                handler.postDelayed(iVar, 10000L);
                return;
            }
            if (loadInt == 8) {
                g(true, true, true, true, true, true, true, true);
            } else if (loadInt == 6) {
                g(true, true, true, true, false, false, false, false);
            }
            this.f5768f = true;
            Handler handler2 = this.f5767b;
            i iVar2 = this.d;
            handler2.removeCallbacks(iVar2);
            handler2.postDelayed(iVar2, 10000L);
        }
    }

    public final void d(Context context) {
        if (c().booleanValue()) {
            b();
            setCenterImageHide(false);
        } else {
            y5.k.u(context, new Intent(context, (Class<?>) ModernMainActivity.class).addFlags(268435456), null);
        }
    }

    public final void e(Runnable runnable, Runnable runnable2, Runnable runnable3, Runnable runnable4, Runnable runnable5, Runnable runnable6, Runnable runnable7, Runnable runnable8) {
        f(this.f5778p, runnable);
        f(this.f5779q, runnable2);
        f(this.r, runnable3);
        f(this.f5780s, runnable4);
        f(this.t, runnable5);
        f(this.f5781u, runnable6);
        f(this.f5782v, runnable7);
        f(this.w, runnable8);
    }

    public final void g(boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        h(this.f5778p, z9);
        h(this.f5779q, z10);
        h(this.r, z11);
        h(this.f5780s, z12);
        h(this.t, z13);
        h(this.f5781u, z14);
        h(this.f5782v, z15);
        h(this.w, z16);
    }

    public final void h(View view, boolean z9) {
        ImageView imageView = this.f5769g;
        if (z9 && view.getVisibility() != 0) {
            view.setScaleX(0.5f);
            view.setScaleY(0.5f);
            view.setAlpha(0.0f);
            view.setVisibility(0);
            view.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(800L).setInterpolator(new OvershootInterpolator()).start();
            if (imageView != null) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, e0.m.h(new byte[]{82, -90, -91, -40, -72, -28}, new byte[]{33, -59, -60, -76, -35, -68, 44, -98}), 1.0f, 1.1f, 1.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, e0.m.h(new byte[]{55, 72, 98, -15, -45, 110}, new byte[]{68, 43, 3, -99, -74, 55, 38, 97}), 1.0f, 1.1f, 1.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofFloat, ofFloat2);
                animatorSet.setDuration(300L);
                animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
                animatorSet.start();
                return;
            }
            return;
        }
        if (!z9 && view.getVisibility() == 0) {
            view.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setDuration(600L).setInterpolator(new AnticipateInterpolator()).withEndAction(new s3.o(1, view)).start();
            if (imageView != null) {
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView, e0.m.h(new byte[]{85, 20, 25, -19, 65, -14}, new byte[]{38, 119, 120, -127, 36, -86, 32, 28}), 1.0f, 0.95f, 1.0f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(imageView, e0.m.h(new byte[]{57, -91, -81, -46, -99, 40}, new byte[]{74, -58, -50, -66, -8, 113, -111, -91}), 1.0f, 0.95f, 1.0f);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ofFloat3, ofFloat4);
                animatorSet2.setDuration(250L);
                animatorSet2.setInterpolator(new AccelerateDecelerateInterpolator());
                animatorSet2.start();
            }
        }
    }

    public void setImageRun(Drawable[] drawableArr) {
        this.f5770h.setImageDrawable(drawableArr[0]);
        this.f5771i.setImageDrawable(drawableArr[1]);
        this.f5772j.setImageDrawable(drawableArr[2]);
        this.f5773k.setImageDrawable(drawableArr[3]);
        this.f5774l.setImageDrawable(drawableArr[4]);
        this.f5775m.setImageDrawable(drawableArr[5]);
        this.f5776n.setImageDrawable(drawableArr[6]);
        this.f5777o.setImageDrawable(drawableArr[7]);
    }
}
