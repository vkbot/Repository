package t1;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.navistart.R;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class n extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f5790b;
    public final l c;

    public n(Context context) {
        super(context);
        this.c = new l(1, this);
        View.inflate(context, R.layout.tempmashview, this);
        this.f5790b = (TextView) findViewById(R.id.textView39);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTemperatura(int i10) {
        this.f5790b.setText(i10 + e0.m.h(new byte[]{-94, -84, -51}, new byte[]{96, 28, -114, 89, -99, -8, 119, 102}));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.c);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        l lVar = this.c;
        if (i10 == 0) {
            post(lVar);
        } else {
            removeCallbacks(lVar);
        }
    }
}
