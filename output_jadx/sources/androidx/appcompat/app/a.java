package androidx.appcompat.app;

import android.content.Context;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f152b;
    public final /* synthetic */ Context c;

    public /* synthetic */ a(Context context, int i10) {
        this.f152b = i10;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f152b) {
            case 0:
                AppCompatDelegate.a(this.c);
                return;
            default:
                AppCompatDelegate.b(this.c);
                return;
        }
    }
}
