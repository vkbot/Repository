package androidx.profileinstaller;

import androidx.profileinstaller.ProfileInstaller;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f245b;
    public final /* synthetic */ ProfileInstaller.DiagnosticsCallback c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(ProfileInstaller.DiagnosticsCallback diagnosticsCallback, int i10, Object obj, int i11) {
        this.f245b = i11;
        this.c = diagnosticsCallback;
        this.d = i10;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f245b) {
            case 0:
                ProfileInstaller.a(this.c, this.d, this.e);
                return;
            default:
                ProfileInstaller.b(this.c, this.d, this.e);
                return;
        }
    }
}
