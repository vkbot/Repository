package f5;

import android.app.Application;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f2303a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2304b;
    public boolean c;
    public int d = 0;

    public m0(l0 l0Var) {
        boolean z9 = false;
        this.f2303a = l0Var;
        o4.f fVar = l0Var.f2301a;
        fVar.a();
        SharedPreferences sharedPreferences = ((Application) fVar.f4359a).getSharedPreferences("com.google.firebase.inappmessaging", 0);
        boolean z10 = true;
        if (sharedPreferences.contains("fresh_install")) {
            z10 = sharedPreferences.getBoolean("fresh_install", true);
        } else {
            l0Var.a("fresh_install", true);
        }
        this.c = z10;
        o4.f fVar2 = l0Var.f2301a;
        fVar2.a();
        SharedPreferences sharedPreferences2 = ((Application) fVar2.f4359a).getSharedPreferences("com.google.firebase.inappmessaging", 0);
        if (sharedPreferences2.contains("test_device")) {
            z9 = sharedPreferences2.getBoolean("test_device", false);
        } else {
            l0Var.a("test_device", false);
        }
        this.f2304b = z9;
    }
}
