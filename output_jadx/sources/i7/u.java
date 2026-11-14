package i7;

import android.widget.SeekBar;
import android.widget.TextView;
import com.example.navistart.BlackActivity;
import com.example.navistart.R;
import kotlin.jvm.internal.ByteCompanionObject;
import m0.a0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class u implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2829a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f2830b;
    public final /* synthetic */ Object c;

    public u(a0 a0Var, TextView textView) {
        this.f2829a = 2;
        this.c = a0Var;
        this.f2830b = textView;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i10, boolean z9) {
        int i11 = this.f2829a;
        TextView textView = this.f2830b;
        switch (i11) {
            case 0:
                textView.setText(String.valueOf(i10));
                return;
            case 1:
                textView.setText(String.valueOf(1 + i10));
                return;
            default:
                a0 a0Var = (a0) this.c;
                BlackActivity blackActivity = a0Var.f3600b;
                if (blackActivity != null) {
                    blackActivity.d.setAlpha(i10 / 100.0f);
                }
                textView.setText(a0Var.getString(R.string.zatemneie_clock) + " " + i10 + e0.m.h(new byte[]{-87}, new byte[]{-116, 70, -5, -3, -36, 58, -5, -79}));
                h0.b.o().saveInt(e0.m.h(new byte[]{74, 39, -36, -58, -95, -92, -7, 95, 105, 33, -47, -43, -110, -75, -14, 113, ByteCompanionObject.MAX_VALUE, 35, -40, -41, -91, -85, -17, 109, 113}, new byte[]{5, 81, -71, -76, -51, -59, ByteCompanionObject.MIN_VALUE, 30}), i10);
                return;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        int i10 = this.f2829a;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        switch (this.f2829a) {
            case 0:
                h0.b.o().saveInt((String) this.c, seekBar.getProgress());
                return;
            case 1:
                h0.b.o().saveInt((String) this.c, seekBar.getProgress() + 1);
                return;
            default:
                return;
        }
    }

    public /* synthetic */ u(TextView textView, String str, int i10) {
        this.f2829a = i10;
        this.f2830b = textView;
        this.c = str;
    }

    private final void a(SeekBar seekBar) {
    }

    private final void b(SeekBar seekBar) {
    }

    private final void c(SeekBar seekBar) {
    }

    private final void d(SeekBar seekBar) {
    }
}
