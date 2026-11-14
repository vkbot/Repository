package n7;

import androidx.core.os.EnvironmentCompat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.logging.Logger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b1 {
    public static final Logger d = Logger.getLogger(b1.class.getName());
    public static b1 e;

    /* renamed from: a, reason: collision with root package name */
    public String f4161a = EnvironmentCompat.MEDIA_UNKNOWN;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f4162b = new LinkedHashSet();
    public j4.n c = j4.n.f3279h;

    public final synchronized void a() {
        try {
            HashMap hashMap = new HashMap();
            String str = EnvironmentCompat.MEDIA_UNKNOWN;
            Iterator it = this.f4162b.iterator();
            char c = 0;
            while (it.hasNext()) {
                a1 a1Var = (a1) it.next();
                a1Var.getClass();
                if (((a1) hashMap.get("dns")) == null) {
                    hashMap.put("dns", a1Var);
                }
                if (c < 5) {
                    str = "dns";
                    c = 5;
                }
            }
            this.c = j4.n.a(hashMap);
            this.f4161a = str;
        } catch (Throwable th) {
            throw th;
        }
    }
}
