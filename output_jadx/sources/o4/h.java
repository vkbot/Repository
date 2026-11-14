package o4;

import android.content.Context;
import android.text.TextUtils;
import j1.i;
import java.util.Arrays;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f4367a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4368b;
    public final String c;
    public final String d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final String f4369f;

    /* renamed from: g, reason: collision with root package name */
    public final String f4370g;

    public h(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        boolean z9;
        int i10 = s2.b.f5652a;
        if (str != null && !str.trim().isEmpty()) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!z9) {
            this.f4368b = str;
            this.f4367a = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f4369f = str6;
            this.f4370g = str7;
            return;
        }
        i.l("ApplicationId must be set.");
        throw null;
    }

    public static h a(Context context) {
        l.d dVar = new l.d(context, 11);
        String v9 = dVar.v("google_app_id");
        if (TextUtils.isEmpty(v9)) {
            return null;
        }
        return new h(v9, dVar.v("google_api_key"), dVar.v("firebase_database_url"), dVar.v("ga_trackingId"), dVar.v("gcm_defaultSenderId"), dVar.v("google_storage_bucket"), dVar.v("project_id"));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (r2.a.d(this.f4368b, hVar.f4368b) && r2.a.d(this.f4367a, hVar.f4367a) && r2.a.d(this.c, hVar.c) && r2.a.d(this.d, hVar.d) && r2.a.d(this.e, hVar.e) && r2.a.d(this.f4369f, hVar.f4369f) && r2.a.d(this.f4370g, hVar.f4370g)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4368b, this.f4367a, this.c, this.d, this.e, this.f4369f, this.f4370g});
    }

    public final String toString() {
        l.d dVar = new l.d(this);
        dVar.f(this.f4368b, "applicationId");
        dVar.f(this.f4367a, "apiKey");
        dVar.f(this.c, "databaseUrl");
        dVar.f(this.e, "gcmSenderId");
        dVar.f(this.f4369f, "storageBucket");
        dVar.f(this.f4370g, "projectId");
        return dVar.toString();
    }
}
