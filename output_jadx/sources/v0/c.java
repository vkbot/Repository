package v0;

import android.os.Handler;
import android.widget.TextView;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int[] f5912b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ TextView e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Handler f5913f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5914g;

    public c(int[] iArr, int i10, int i11, TextView textView, Handler handler, int i12) {
        this.f5912b = iArr;
        this.c = i10;
        this.d = i11;
        this.e = textView;
        this.f5913f = handler;
        this.f5914g = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr = this.f5912b;
        int i10 = iArr[0];
        int i11 = this.c;
        int i12 = i10 + i11;
        TextView textView = this.e;
        int i13 = this.d;
        if ((i11 > 0 && i12 > i13) || (i11 < 0 && i12 < i13)) {
            iArr[0] = i13;
            textView.setText(String.valueOf(i13));
        } else {
            iArr[0] = i12;
            textView.setText(String.valueOf(i12));
            this.f5913f.postDelayed(this, this.f5914g);
        }
    }
}
