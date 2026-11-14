package i7;

import android.widget.SeekBar;
import android.widget.TextView;
import m0.y1;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2827b;
    public final /* synthetic */ SeekBar c;
    public final /* synthetic */ int d;
    public final /* synthetic */ TextView e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2828f;

    public /* synthetic */ t(SeekBar seekBar, int i10, TextView textView, int i11, int i12) {
        this.f2827b = i12;
        this.c = seekBar;
        this.d = i10;
        this.e = textView;
        this.f2828f = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f2827b;
        int i11 = this.f2828f;
        TextView textView = this.e;
        int i12 = this.d;
        SeekBar seekBar = this.c;
        switch (i10) {
            case 0:
                seekBar.setProgress(i12);
                textView.setText(String.valueOf(i11));
                return;
            default:
                String str = y1.e;
                seekBar.setProgress(i12);
                textView.setText(String.valueOf(i11));
                return;
        }
    }
}
