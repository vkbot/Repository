package i7;

import android.widget.TextView;
import com.woha.atir.RadarActivity;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2822b;
    public final /* synthetic */ RadarActivity c;

    public /* synthetic */ q(RadarActivity radarActivity, int i10) {
        this.f2822b = i10;
        this.c = radarActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2822b) {
            case 0:
                RadarActivity radarActivity = this.c;
                TextView textView = radarActivity.c;
                if (textView != null) {
                    textView.setVisibility(8);
                    radarActivity.c.setText("");
                    return;
                }
                return;
            default:
                this.c.f1674f = 0;
                return;
        }
    }
}
