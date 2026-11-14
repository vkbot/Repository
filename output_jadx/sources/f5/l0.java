package f5;

import android.app.Application;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final o4.f f2301a;

    public void a(String str, boolean z9) {
        o4.f fVar = this.f2301a;
        fVar.a();
        SharedPreferences.Editor edit = ((Application) fVar.f4359a).getSharedPreferences("com.google.firebase.inappmessaging", 0).edit();
        edit.putBoolean(str, z9);
        edit.apply();
    }
}
