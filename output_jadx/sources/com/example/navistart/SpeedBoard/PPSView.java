package com.example.navistart.SpeedBoard;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.example.navistart.R;
import com.example.navistart.SpeedBoard.PPSView;
import com.example.navistart.cores.HUDMassageObj;
import com.github.anastr.speedviewlib.ImageSpeedometer;
import com.google.protobuf.q;
import e0.m;
import h0.b;
import java.util.Locale;
import k0.a;
import org.apache.commons.net.nntp.NNTPReply;
import s1.x0;
import v0.c;
import v0.h;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class PPSView extends FrameLayout implements h {

    /* renamed from: b, reason: collision with root package name */
    public ImageView f873b;
    public ImageView c;
    public View d;
    public ImageSpeedometer e;

    /* renamed from: f, reason: collision with root package name */
    public RelativeLayout f874f;

    /* renamed from: g, reason: collision with root package name */
    public TextView f875g;

    /* renamed from: h, reason: collision with root package name */
    public TextView f876h;

    /* renamed from: i, reason: collision with root package name */
    public TextView f877i;

    /* renamed from: j, reason: collision with root package name */
    public TextView f878j;

    /* renamed from: k, reason: collision with root package name */
    public TextView f879k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f880l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f881m;

    /* renamed from: n, reason: collision with root package name */
    public FrameLayout f882n;

    /* renamed from: o, reason: collision with root package name */
    public RelativeLayout f883o;

    public PPSView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        k(0, context);
    }

    public static /* synthetic */ void g(PPSView pPSView, HUDMassageObj hUDMassageObj) {
        String h2;
        pPSView.setCameraInfoViewVis(true);
        if (hUDMassageObj.getSpeedlimit() > 0) {
            h2 = String.valueOf(hUDMassageObj.getSpeedlimit());
        } else {
            h2 = m.h(new byte[]{34, -53}, new byte[]{15, -26, -64, -112, -33, 33, 50, -87});
        }
        pPSView.setCamspeedLimitText(h2);
        StringBuilder sb = new StringBuilder();
        sb.append(hUDMassageObj.v_mRemainDis);
        pPSView.setcameraDis(q.i(new byte[]{110, -66}, new byte[]{78, -45, -25, -61, -85, -102, 48, 124}, sb));
    }

    public static void i(PPSView pPSView, HUDMassageObj hUDMassageObj) {
        pPSView.setRastVis(true);
        pPSView.setMan_img_view(hUDMassageObj.v_mTurnType);
        int i10 = hUDMassageObj.v_mRemainDis;
        int i11 = hUDMassageObj.v_mTurnDis;
        pPSView.f876h.setText(l(i10));
        pPSView.f875g.setText(l(i11));
        if (hUDMassageObj.getSpeedlimit() > 0) {
            pPSView.setSpeedLimitText(String.valueOf(hUDMassageObj.getSpeedlimit()));
        } else {
            pPSView.setSpeedLimitText("");
            pPSView.f874f.setVisibility(4);
        }
    }

    public static void j(PPSView pPSView, HUDMassageObj.HudSenderType hudSenderType) {
        if (hudSenderType == HUDMassageObj.HudSenderType.NAVI) {
            pPSView.setRastVis(false);
            pPSView.setSpeedLimitText("");
            pPSView.f874f.setVisibility(4);
        }
        if (hudSenderType == HUDMassageObj.HudSenderType.ARAD) {
            pPSView.setCameraInfoViewVis(false);
            pPSView.setCamspeedLimitText("");
            pPSView.setcameraDis("");
        }
    }

    public static String l(int i10) {
        if (i10 >= 1000) {
            return String.format(Locale.US, m.h(new byte[]{52, 77, 65, 60, 115, -88, -27}, new byte[]{17, 99, 112, 90, 83, -61, -120, 60}), Double.valueOf(i10 / 1000.0d));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i10);
        return q.i(new byte[]{-117, 35}, new byte[]{-85, 78, 86, -87, -62, 79, 124, 102}, sb);
    }

    public static void m(View view, boolean z9) {
        if (z9) {
            if (view.getVisibility() != 0) {
                view.setAlpha(0.0f);
                view.setVisibility(0);
                view.animate().alpha(1.0f).setDuration(800L).start();
                return;
            }
            return;
        }
        if (view.getVisibility() == 0) {
            view.setAlpha(1.0f);
            view.setVisibility(4);
            view.animate().alpha(0.0f).setDuration(800L).start();
        }
    }

    private void setCamspeedLimitText(String str) {
        this.f878j.setText(str);
    }

    private void setMan_img_view(int i10) {
        int i11;
        ImageView imageView = this.f873b;
        String str = a.f3377a;
        if (i10 != 15) {
            if (i10 != 19) {
                if (i10 != 24) {
                    if (i10 != 49) {
                        switch (i10) {
                            case 2:
                                i11 = R.drawable.notification_left_sdl;
                                break;
                            case 3:
                                i11 = R.drawable.notification_right_sdl;
                                break;
                            case 4:
                                i11 = R.drawable.notification_fork_left_sdl;
                                break;
                            case 5:
                                i11 = R.drawable.notification_fork_right_sdl;
                                break;
                            case 6:
                                i11 = R.drawable.notification_hard_left_sdl;
                                break;
                            case 7:
                                i11 = R.drawable.notification_hard_right_sdl;
                                break;
                            case 8:
                                i11 = R.drawable.notification_uturn_left_sdl;
                                break;
                            case 9:
                                i11 = R.drawable.notification_straight_sdl;
                                break;
                            default:
                                i11 = R.drawable.notification_leave_roundabout_sdl;
                                break;
                        }
                    } else {
                        i11 = R.drawable.notification_board_ferry_sdl;
                    }
                } else {
                    i11 = R.drawable.notification_enter_roundabout_sdl;
                }
            } else {
                i11 = R.drawable.notification_uturn_right_sdl;
            }
        } else {
            i11 = R.drawable.notification_finish_sdl;
        }
        imageView.setImageResource(i11);
    }

    private void setRastVis(boolean z9) {
        m(this.f873b, z9);
        m(this.f876h, z9);
        m(this.f875g, z9);
    }

    private void setSpeedLimitText(String str) {
        this.f874f.setVisibility(0);
        this.f877i.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextSpeedWidg(int i10) {
        int i11;
        TextView textView = this.f880l;
        int parseInt = Integer.parseInt(textView.getText().toString());
        Handler handler = new Handler(Looper.getMainLooper());
        int i12 = i10 - parseInt;
        int abs = Math.abs(i12);
        if (abs == 0) {
            textView.setText(String.valueOf(i10));
            return;
        }
        int i13 = 500 / abs;
        if (i12 > 0) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        handler.postDelayed(new c(new int[]{parseInt}, i11, i10, textView, handler, i13), i13);
    }

    private void setcameraDis(String str) {
        this.f879k.setText(str);
    }

    @Override // v0.h
    public final void a() {
        setVisibility(0);
    }

    @Override // v0.h
    public final void b() {
        setVisibility(8);
    }

    @Override // v0.h
    public final void c() {
        b.a();
        setSpeed(b.d().getSpeed());
    }

    @Override // v0.h
    public final int d() {
        return NNTPReply.SERVICE_DISCONTINUED;
    }

    @Override // v0.h
    public WindowManager.LayoutParams getLayParams() {
        int i10;
        if (Build.VERSION.SDK_INT >= 26) {
            i10 = 2038;
        } else {
            i10 = 2002;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, i10, 776, -3);
        layoutParams.gravity = 81;
        layoutParams.x = 0;
        layoutParams.y = 30;
        return layoutParams;
    }

    public final void k(int i10, Context context) {
        if (i10 == 0) {
            View.inflate(context, R.layout.pps_view, this);
        } else {
            View.inflate(context, i10, this);
        }
        this.d = findViewById(R.id.viewWeatherBlock);
        this.f881m = (TextView) findViewById(R.id.textViewWeather);
        this.c = (ImageView) findViewById(R.id.imageViewWeather);
        this.f873b = (ImageView) findViewById(R.id.man_img_view);
        this.e = (ImageSpeedometer) findViewById(R.id.imageSpeedometer);
        this.f874f = (RelativeLayout) findViewById(R.id.speedLimitBlock);
        this.f875g = (TextView) findViewById(R.id.rast_man);
        this.f876h = (TextView) findViewById(R.id.rast_finish);
        this.f877i = (TextView) findViewById(R.id.speedLimitText);
        this.f878j = (TextView) findViewById(R.id.CamspeedLimitText);
        this.f879k = (TextView) findViewById(R.id.cameraDis);
        this.f882n = (FrameLayout) findViewById(R.id.CamAlarm);
        this.f883o = (RelativeLayout) findViewById(R.id.back_Frame_speedBoard);
        this.f880l = (TextView) findViewById(R.id.textspeedwidg);
    }

    @Override // android.view.View, v0.h
    public void setBackgroundColor(int i10) {
        super.setBackgroundColor(i10);
        this.f883o.setBackgroundColor(i10);
    }

    public void setCameraInfoViewVis(boolean z9) {
        m(this.f882n, z9);
    }

    @Override // v0.h
    public void setHudMassageObj(final HUDMassageObj hUDMassageObj) {
        HUDMassageObj.HudSenderType hudSenderType = hUDMassageObj.hudSenderType;
        if (hudSenderType == HUDMassageObj.HudSenderType.NAVI) {
            if (hUDMassageObj.NaviOn.booleanValue()) {
                final int i10 = 0;
                new Handler(Looper.getMainLooper()).post(new Runnable(this) { // from class: v0.a
                    public final /* synthetic */ PPSView c;

                    {
                        this.c = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                PPSView.i(this.c, hUDMassageObj);
                                return;
                            default:
                                PPSView.g(this.c, hUDMassageObj);
                                return;
                        }
                    }
                });
                return;
            } else {
                new Handler(Looper.getMainLooper()).post(new x0(9, this, hUDMassageObj.hudSenderType));
                return;
            }
        }
        if (hudSenderType == HUDMassageObj.HudSenderType.ARAD) {
            if (hUDMassageObj.AradarOn.booleanValue()) {
                final int i11 = 1;
                new Handler(Looper.getMainLooper()).post(new Runnable(this) { // from class: v0.a
                    public final /* synthetic */ PPSView c;

                    {
                        this.c = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                PPSView.i(this.c, hUDMassageObj);
                                return;
                            default:
                                PPSView.g(this.c, hUDMassageObj);
                                return;
                        }
                    }
                });
            } else {
                new Handler(Looper.getMainLooper()).post(new x0(9, this, hUDMassageObj.hudSenderType));
            }
        }
    }

    @Override // v0.h
    public void setSpeed(final int i10) {
        if (this.e != null) {
            final int i11 = 0;
            new Handler(Looper.getMainLooper()).post(new Runnable(this) { // from class: v0.b
                public final /* synthetic */ PPSView c;

                {
                    this.c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            this.c.e.k(i10);
                            return;
                        default:
                            this.c.setTextSpeedWidg(i10);
                            return;
                    }
                }
            });
        }
        if (this.f880l != null && i10 >= 0 && i10 < 300) {
            final int i12 = 1;
            new Handler(Looper.getMainLooper()).post(new Runnable(this) { // from class: v0.b
                public final /* synthetic */ PPSView c;

                {
                    this.c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            this.c.e.k(i10);
                            return;
                        default:
                            this.c.setTextSpeedWidg(i10);
                            return;
                    }
                }
            });
        }
    }

    public void setTexColor(int i10) {
        this.f875g.setTextColor(i10);
        this.f876h.setTextColor(i10);
        this.f879k.setTextColor(i10);
    }

    @Override // v0.h
    public View getView() {
        return this;
    }

    @Override // v0.h
    public final void e(float f8) {
    }

    public void setRPM(int i10) {
    }
}
