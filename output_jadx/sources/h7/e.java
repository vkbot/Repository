package h7;

import com.woha.appmanag.ManageAppsActivity;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2605b;
    public final /* synthetic */ ManageAppsActivity c;

    public /* synthetic */ e(ManageAppsActivity manageAppsActivity, int i10) {
        this.f2605b = i10;
        this.c = manageAppsActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f2605b;
        ManageAppsActivity manageAppsActivity = this.c;
        switch (i10) {
            case 0:
                String str = ManageAppsActivity.e;
                manageAppsActivity.runOnUiThread(new e(manageAppsActivity, 1));
                return;
            default:
                String str2 = ManageAppsActivity.e;
                if (!manageAppsActivity.isFinishing() && !manageAppsActivity.isDestroyed()) {
                    try {
                        manageAppsActivity.s();
                    } catch (Exception unused) {
                    } catch (Throwable th) {
                        manageAppsActivity.d.notifyDataSetChanged();
                        throw th;
                    }
                    manageAppsActivity.d.notifyDataSetChanged();
                    return;
                }
                return;
        }
    }
}
