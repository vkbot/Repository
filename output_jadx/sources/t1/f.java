package t1;

import android.widget.SeekBar;
import android.widget.TextView;
import com.example.navistart.mainview.HeatManSetView;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5757a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f5758b;
    public final /* synthetic */ HeatManSetView c;

    public /* synthetic */ f(HeatManSetView heatManSetView, TextView textView, int i10) {
        this.f5757a = i10;
        this.c = heatManSetView;
        this.f5758b = textView;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i10, boolean z9) {
        int i11 = this.f5757a;
        TextView textView = this.f5758b;
        HeatManSetView heatManSetView = this.c;
        switch (i11) {
            case 0:
                heatManSetView.f1015f = i10;
                boolean equals = e0.m.h(new byte[]{-76, 59, 40, 101, 5, -52, 20, 43, -108}, new byte[]{-32, 82, 69, 0, 119, -124, 113, 74}).equals(heatManSetView.f1023n);
                int i12 = heatManSetView.f1015f;
                if (equals) {
                    textView.setText(HeatManSetView.b(i12));
                } else {
                    textView.setText(HeatManSetView.b(i12));
                }
                Runnable runnable = heatManSetView.r;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                heatManSetView.f1019j = i10;
                boolean equals2 = e0.m.h(new byte[]{-27, -91, -51, -35, -18, 84, -38, -45, -59}, new byte[]{-79, -52, -96, -72, -100, 28, -65, -78}).equals(heatManSetView.f1023n);
                int i13 = heatManSetView.f1019j;
                if (equals2) {
                    textView.setText(HeatManSetView.b(i13));
                } else {
                    textView.setText(HeatManSetView.a(i13));
                }
                Runnable runnable2 = heatManSetView.f1027s;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        int i10 = this.f5757a;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        int i10 = this.f5757a;
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
