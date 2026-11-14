package l5;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f3542b = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static k c;

    /* renamed from: a, reason: collision with root package name */
    public final w7.c f3543a;

    public k(w7.c cVar) {
        this.f3543a = cVar;
    }

    public final boolean a(m5.b bVar) {
        if (!TextUtils.isEmpty(bVar.c)) {
            long j10 = bVar.f3941f + bVar.e;
            this.f3543a.getClass();
            if (j10 < (System.currentTimeMillis() / 1000) + 3600) {
                return true;
            }
            return false;
        }
        return true;
    }
}
