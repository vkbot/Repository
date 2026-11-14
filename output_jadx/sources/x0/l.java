package x0;

import android.widget.SeekBar;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class l implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IntConsumer f6458a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6459b;

    public l(IntConsumer intConsumer, int i10) {
        this.f6458a = intConsumer;
        this.f6459b = i10;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i10, boolean z9) {
        this.f6458a.accept(i10 + this.f6459b);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        seekBar.getParent().requestDisallowInterceptTouchEvent(true);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        seekBar.getParent().requestDisallowInterceptTouchEvent(false);
    }
}
