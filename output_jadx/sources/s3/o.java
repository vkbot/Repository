package s3;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.core.content.ContextCompat;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5710b;
    public final /* synthetic */ View c;

    public /* synthetic */ o(int i10, View view) {
        this.f5710b = i10;
        this.c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5710b) {
            case 0:
                View view = this.c;
                ((InputMethodManager) ContextCompat.getSystemService(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                return;
            case 1:
                this.c.setVisibility(8);
                return;
            default:
                this.c.performClick();
                return;
        }
    }
}
