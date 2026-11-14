package s3;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f5692a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f5693b;
    public final int c;
    public int d;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5699k;

    /* renamed from: m, reason: collision with root package name */
    public androidx.fragment.app.h f5701m;
    public Layout.Alignment e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f5694f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f5695g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f5696h = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    public int f5697i = 1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5698j = true;

    /* renamed from: l, reason: collision with root package name */
    public TextUtils.TruncateAt f5700l = null;

    public h(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f5692a = charSequence;
        this.f5693b = textPaint;
        this.c = i10;
        this.d = charSequence.length();
    }

    public final StaticLayout a() {
        TextDirectionHeuristic textDirectionHeuristic;
        if (this.f5692a == null) {
            this.f5692a = "";
        }
        int max = Math.max(0, this.c);
        CharSequence charSequence = this.f5692a;
        int i10 = this.f5694f;
        TextPaint textPaint = this.f5693b;
        if (i10 == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f5700l);
        }
        int min = Math.min(charSequence.length(), this.d);
        this.d = min;
        if (this.f5699k && this.f5694f == 1) {
            this.e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.e);
        obtain.setIncludePad(this.f5698j);
        if (this.f5699k) {
            textDirectionHeuristic = TextDirectionHeuristics.RTL;
        } else {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        }
        obtain.setTextDirection(textDirectionHeuristic);
        TextUtils.TruncateAt truncateAt = this.f5700l;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f5694f);
        float f8 = this.f5695g;
        if (f8 != 0.0f || this.f5696h != 1.0f) {
            obtain.setLineSpacing(f8, this.f5696h);
        }
        if (this.f5694f > 1) {
            obtain.setHyphenationFrequency(this.f5697i);
        }
        androidx.fragment.app.h hVar = this.f5701m;
        if (hVar != null) {
            obtain.setBreakStrategy(((TextInputLayout) hVar.c).f1478v.getBreakStrategy());
        }
        return obtain.build();
    }
}
