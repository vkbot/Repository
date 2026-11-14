package t1;

import android.widget.SeekBar;
import android.widget.TextView;
import com.example.navistart.mainview.YMovLay;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class o implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f5791a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f5792b;
    public final /* synthetic */ YMovLay c;

    public o(YMovLay yMovLay, boolean z9, TextView textView) {
        this.c = yMovLay;
        this.f5791a = z9;
        this.f5792b = textView;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i10, boolean z9) {
        int i11;
        boolean z10 = this.f5791a;
        YMovLay yMovLay = this.c;
        if (z10) {
            i11 = yMovLay.r;
        } else {
            i11 = yMovLay.t;
        }
        this.f5792b.setText(String.valueOf(i10 + i11));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        int i10;
        int progress = seekBar.getProgress();
        boolean z9 = this.f5791a;
        YMovLay yMovLay = this.c;
        if (z9) {
            i10 = yMovLay.r;
        } else {
            i10 = yMovLay.t;
        }
        int i11 = progress + i10;
        if (z9) {
            yMovLay.f1052i.setText(String.valueOf(i11));
        } else {
            yMovLay.f1053j.setText(String.valueOf(i11));
        }
        p pVar = yMovLay.f1063v;
        if (pVar != null) {
            pVar.a(i11, z9);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }
}
