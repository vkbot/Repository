package androidx.activity;

import androidx.activity.ComponentActivity;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f139b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(int i10, Object obj) {
        this.f139b = i10;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f139b) {
            case 0:
                ComponentActivity.ReportFullyDrawnExecutorImpl.a((ComponentActivity.ReportFullyDrawnExecutorImpl) this.c);
                return;
            case 1:
                ComponentDialog.a((ComponentDialog) this.c);
                return;
            default:
                FullyDrawnReporter.a((FullyDrawnReporter) this.c);
                return;
        }
    }
}
