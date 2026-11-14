package s3;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class j {
    public float c;
    public float d;

    /* renamed from: f, reason: collision with root package name */
    public final WeakReference f5704f;

    /* renamed from: g, reason: collision with root package name */
    public w3.f f5705g;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f5702a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final l3.a f5703b = new l3.a(1, this);
    public boolean e = true;

    public j(i iVar) {
        this.f5704f = new WeakReference(null);
        this.f5704f = new WeakReference(iVar);
    }

    public final void a(String str) {
        float measureText;
        TextPaint textPaint = this.f5702a;
        float f8 = 0.0f;
        if (str == null) {
            measureText = 0.0f;
        } else {
            measureText = textPaint.measureText((CharSequence) str, 0, str.length());
        }
        this.c = measureText;
        if (str != null) {
            f8 = Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.d = f8;
        this.e = false;
    }

    public final void b(w3.f fVar, Context context) {
        if (this.f5705g != fVar) {
            this.f5705g = fVar;
            if (fVar != null) {
                TextPaint textPaint = this.f5702a;
                l3.a aVar = this.f5703b;
                fVar.e(context, textPaint, aVar);
                i iVar = (i) this.f5704f.get();
                if (iVar != null) {
                    textPaint.drawableState = iVar.getState();
                }
                fVar.d(context, textPaint, aVar);
                this.e = true;
            }
            i iVar2 = (i) this.f5704f.get();
            if (iVar2 != null) {
                iVar2.a();
                iVar2.onStateChange(iVar2.getState());
            }
        }
    }
}
