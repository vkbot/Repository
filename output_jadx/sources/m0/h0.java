package m0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import android.view.View;
import com.example.navistart.DialogUni.Fragmenti.ExlantixTelemetryFragment;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h0 extends View {

    /* renamed from: b, reason: collision with root package name */
    public final Paint f3710b;
    public final /* synthetic */ ExlantixTelemetryFragment c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(ExlantixTelemetryFragment exlantixTelemetryFragment, Context context) {
        super(context);
        this.c = exlantixTelemetryFragment;
        this.f3710b = new Paint(1);
        setContentDescription(e0.m.h(new byte[]{-97, 91, -77, 96, -69, -16, 4, 32, -98, 67, -78, 89, -69, -3, -12, 78, -13, 19, -36, 48, -29, -94, 105, 78, -15, 18, -29, 48, -24, -94, 108, -66, -97, 114, -78, 81, -69, -16, 4, 46, -98, 67, -78, 84, -70, -54}, new byte[]{79, -61, 98, -31, 106, 114, -44, -98}));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        int dp;
        int dp2;
        int dp3;
        int dp4;
        ArrayDeque arrayDeque;
        int dp5;
        int dp6;
        int i11;
        int dp7;
        int dp8;
        int dp9;
        ArrayDeque arrayDeque2;
        float f8;
        float f10;
        float f11;
        ExlantixTelemetryFragment exlantixTelemetryFragment;
        int dp10;
        int dp11;
        int dp12;
        int i12;
        int i13;
        int dp13;
        super.onDraw(canvas);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ExlantixTelemetryFragment exlantixTelemetryFragment2 = this.c;
        i10 = exlantixTelemetryFragment2.minutes;
        long j10 = i10 * 60000;
        dp = exlantixTelemetryFragment2.dp(44.0f);
        float f12 = dp;
        int width = getWidth();
        dp2 = exlantixTelemetryFragment2.dp(8.0f);
        float f13 = width - dp2;
        dp3 = exlantixTelemetryFragment2.dp(12.0f);
        float f14 = dp3;
        int height = getHeight();
        dp4 = exlantixTelemetryFragment2.dp(26.0f);
        float f15 = height - dp4;
        if (f13 > f12) {
            arrayDeque = exlantixTelemetryFragment2.history;
            Iterator it = arrayDeque.iterator();
            double d = 10.0d;
            boolean z9 = false;
            while (it.hasNext()) {
                g0 g0Var = (g0) it.next();
                long j11 = g0Var.f3699a;
                Iterator it2 = it;
                float f16 = f12;
                double d10 = g0Var.f3700b;
                if (elapsedRealtime - j11 <= j10 && Double.isFinite(d10)) {
                    d = Math.max(d, Math.ceil(Math.abs(d10) / 10.0d) * 10.0d);
                    z9 = true;
                }
                f12 = f16;
                it = it2;
            }
            float f17 = f12;
            dp5 = exlantixTelemetryFragment2.dp(11.0f);
            Paint paint = this.f3710b;
            paint.setTextSize(dp5);
            dp6 = exlantixTelemetryFragment2.dp(1.0f);
            paint.setStrokeWidth(dp6);
            int i14 = 0;
            while (i14 < 5) {
                float f18 = (((f15 - f14) * i14) / 4.0f) + f14;
                i12 = exlantixTelemetryFragment2.muted;
                paint.setColor(i12);
                if (i14 == 2) {
                    i13 = 130;
                } else {
                    i13 = 35;
                }
                paint.setAlpha(i13);
                int i15 = i14;
                float f19 = f17;
                canvas.drawLine(f19, f18, f13, f18, paint);
                float f20 = f13;
                paint.setAlpha(255);
                String format = String.format(Locale.getDefault(), e0.m.h(new byte[]{27, 51, -18, 111}, new byte[]{62, 29, -34, 9, -17, 12, 18, -50}), Double.valueOf((1.0d - (i15 / 2.0d)) * d));
                dp13 = exlantixTelemetryFragment2.dp(4.0f);
                canvas.drawText(format, 0.0f, f18 + dp13, paint);
                i14 = i15 + 1;
                f17 = f19;
                f13 = f20;
                elapsedRealtime = elapsedRealtime;
            }
            float f21 = f13;
            long j12 = elapsedRealtime;
            float f22 = f17;
            StringBuilder sb = new StringBuilder();
            sb.append(e0.m.h(new byte[]{-64, -44, 99}, new byte[]{34, 92, -15, 109, -69, 26, -69, 120}));
            i11 = exlantixTelemetryFragment2.minutes;
            sb.append(i11);
            String i16 = com.google.protobuf.q.i(new byte[]{75, 9, 65, 126, 70, 3, -46}, new byte[]{107, -39, -3, -82, -2, -45, 111, 123}, sb);
            int height2 = getHeight();
            dp7 = exlantixTelemetryFragment2.dp(4.0f);
            canvas.drawText(i16, f22, height2 - dp7, paint);
            paint.setTextAlign(Paint.Align.RIGHT);
            String h2 = e0.m.h(new byte[]{29, -92, -1, -70, -91, -58, 46, 56, 29, -75, -2, -114}, new byte[]{-51, 5, 47, 15, 117, ByteCompanionObject.MAX_VALUE, -1, -65});
            int height3 = getHeight();
            dp8 = exlantixTelemetryFragment2.dp(4.0f);
            canvas.drawText(h2, f21, height3 - dp8, paint);
            paint.setTextAlign(Paint.Align.LEFT);
            if (!z9) {
                String h10 = e0.m.h(new byte[]{18, -88, 62, 62, 18, -85, -23, 75, 118, -27, 94, 91, 126, -7, 116, 74, 73, -28, 107}, new byte[]{-62, 53, -18, -117, -61, 41, -55, -101});
                dp11 = exlantixTelemetryFragment2.dp(12.0f);
                float f23 = f22 + dp11;
                dp12 = exlantixTelemetryFragment2.dp(30.0f);
                canvas.drawText(h10, f23, f14 + dp12, paint);
                return;
            }
            float f24 = 2.0f;
            dp9 = exlantixTelemetryFragment2.dp(2.0f);
            paint.setStrokeWidth(dp9);
            arrayDeque2 = exlantixTelemetryFragment2.history;
            Iterator it3 = arrayDeque2.iterator();
            while (true) {
                g0 g0Var2 = null;
                while (it3.hasNext()) {
                    g0 g0Var3 = (g0) it3.next();
                    float f25 = f24;
                    long j13 = g0Var3.f3699a;
                    ExlantixTelemetryFragment exlantixTelemetryFragment3 = exlantixTelemetryFragment2;
                    double d11 = g0Var3.f3700b;
                    if (j12 - j13 <= j10 && Double.isFinite(d11)) {
                        float f26 = f21 - f22;
                        float f27 = (float) j10;
                        float f28 = f21 - ((((float) (j12 - j13)) * f26) / f27);
                        double d12 = (f14 + f15) / f25;
                        double d13 = f15 - f14;
                        float f29 = (float) (d12 - (((d11 / d) * d13) / 2.0d));
                        paint.setColor(d11 < 0.0d ? exlantixTelemetryFragment3.green : exlantixTelemetryFragment3.blue);
                        if (g0Var2 != null) {
                            long j14 = g0Var2.f3699a;
                            if (j13 - j14 <= 2500) {
                                float f30 = f21 - ((f26 * ((float) (j12 - j14))) / f27);
                                float f31 = (float) (d12 - (((g0Var2.f3700b / d) * d13) / 2.0d));
                                f8 = f22;
                                f10 = f21;
                                canvas.drawLine(f30, f31, f28, f29, paint);
                                f11 = f25;
                                exlantixTelemetryFragment = exlantixTelemetryFragment3;
                                float f32 = f11;
                                f22 = f8;
                                f24 = f32;
                                exlantixTelemetryFragment2 = exlantixTelemetryFragment;
                                f21 = f10;
                                g0Var2 = g0Var3;
                            }
                        }
                        f8 = f22;
                        f10 = f21;
                        f11 = f25;
                        exlantixTelemetryFragment = exlantixTelemetryFragment3;
                        dp10 = exlantixTelemetryFragment.dp(f11);
                        canvas.drawCircle(f28, f29, dp10, paint);
                        float f322 = f11;
                        f22 = f8;
                        f24 = f322;
                        exlantixTelemetryFragment2 = exlantixTelemetryFragment;
                        f21 = f10;
                        g0Var2 = g0Var3;
                    } else {
                        f22 = f22;
                        f24 = f25;
                        exlantixTelemetryFragment2 = exlantixTelemetryFragment3;
                        f21 = f21;
                    }
                }
                return;
            }
        }
    }
}
