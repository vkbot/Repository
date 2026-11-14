package j0;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.google.protobuf.q;
import e0.m;
import j1.t;
import kotlin.io.encoding.Base64;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3101a = m.h(new byte[]{-95, -42, 6, 3, 18}, new byte[]{-60, -72, 115, 110, 40, 0, -95, -10});

    /* renamed from: b, reason: collision with root package name */
    public static final String f3102b = m.h(new byte[]{49, -50, 70, -28}, new byte[]{80, -66, 54, -34, 47, -111, -87, 100});
    public static final String c = m.h(new byte[]{120, -110, -5, 13, -36, -107}, new byte[]{11, -30, -105, 100, -88, -81, -9, 76});
    public static final String d = m.h(new byte[]{-108, -34, 68, -94, 43, 24, -41, -20}, new byte[]{-28, -84, 43, -60, 66, 116, -78, -42});
    public static final String e = m.h(new byte[]{101, 37, 114, 113, -2, 43, 66, -107, 95, Base64.padSymbol, 102, 112, -79, 0}, new byte[]{0, 75, 7, 28, -60, 101, 45, -31});

    public static e a(Context context, String str) {
        n0.d dVar = (n0.d) com.bumptech.glide.d.i(n0.d.class, str);
        if (dVar == null) {
            dVar = (n0.d) com.bumptech.glide.d.i(n0.d.class, str.toUpperCase());
        }
        if (dVar == null) {
            dVar = n0.d.e;
        }
        return e.c(dVar, context);
    }

    public static e b(Context context, String str) {
        if (str == null) {
            return e.c(n0.d.e, context);
        }
        String trim = str.trim();
        String str2 = f3101a;
        if (trim.startsWith(str2)) {
            return a(context, trim.substring(str2.length()));
        }
        String str3 = f3102b;
        if (trim.startsWith(str3)) {
            String substring = trim.substring(str3.length());
            if (substring.trim().isEmpty()) {
                return e.c(n0.d.e, context);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(substring.trim());
                if (launchIntentForPackage == null) {
                    return e.c(n0.d.e, context);
                }
                ResolveInfo resolveActivity = packageManager.resolveActivity(launchIntentForPackage, 0);
                if (resolveActivity != null) {
                    return e.b(resolveActivity, packageManager);
                }
                return e.c(n0.d.e, context);
            } catch (Exception unused) {
                return e.c(n0.d.e, context);
            }
        }
        String str4 = c;
        if (trim.startsWith(str4)) {
            return c(context, trim.substring(str4.length()));
        }
        String str5 = d;
        if (trim.startsWith(str5)) {
            String substring2 = trim.substring(str5.length());
            if (substring2.trim().isEmpty()) {
                return e.c(n0.d.e, context);
            }
            try {
                h0.b.a();
                e d10 = e.d(h0.b.g().g(substring2.trim()), context);
                if (d10 != null) {
                    return d10;
                }
                return e.c(n0.d.e, context);
            } catch (Exception unused2) {
                return e.c(n0.d.e, context);
            }
        }
        return a(context, trim);
    }

    public static e c(Context context, String str) {
        int i10;
        if (str == null) {
            return e.c(n0.d.e, context);
        }
        String[] split = str.split(m.h(new byte[]{60}, new byte[]{16, -98, 9, 69, -109, 116, 105, -121}));
        if (split.length < 3) {
            return e.c(n0.d.e, context);
        }
        try {
            int parseInt = Integer.parseInt(split[2].trim());
            if (split.length >= 4) {
                i10 = Integer.parseInt(split[3].trim());
            } else {
                i10 = 50;
            }
            e e6 = e.e(context, split[0], parseInt, i10, split[1]);
            if (e6 != null) {
                return e6;
            }
            return e.c(n0.d.e, context);
        } catch (Exception unused) {
            return e.c(n0.d.e, context);
        }
    }

    public static boolean d(e eVar) {
        d dVar;
        if (eVar != null && (dVar = eVar.f3094a) != null) {
            if (dVar == d.c) {
                if (eVar.c == null) {
                    return false;
                }
                return true;
            }
            if (dVar == d.d) {
                if (eVar.c == null || eVar.d == null) {
                    return false;
                }
                return true;
            }
            if (dVar == d.e) {
                t tVar = eVar.f3096f;
                if (tVar == null || !tVar.a()) {
                    return false;
                }
                return true;
            }
            n0.d dVar2 = eVar.f3095b;
            if (dVar2 != null && !dVar2.equals(n0.d.e)) {
                return true;
            }
        }
        return false;
    }

    public static e e(Context context, String str) {
        return b(context, h0.b.o().loadString(str, e));
    }

    public static void f(String str, e eVar) {
        h0.b.o().saveString(str, g(eVar));
    }

    public static String g(e eVar) {
        d dVar;
        if (eVar != null && (dVar = eVar.f3094a) != null) {
            if (dVar == d.f3092b && eVar.f3095b != null) {
                return f3101a + eVar.f3095b.name();
            }
            if (dVar == d.c && eVar.c != null) {
                return f3102b + eVar.c;
            }
            if (dVar == d.d && eVar.c != null && eVar.d != null) {
                int i10 = 2;
                if (eVar.f3097g != 2) {
                    i10 = 1;
                }
                int i11 = eVar.f3098h;
                if (i11 != 30 && i11 != 70) {
                    i11 = 50;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(c);
                sb.append(eVar.c);
                sb.append(m.h(new byte[]{-111}, new byte[]{-67, -73, -7, -127, 91, 14, 47, 77}));
                sb.append(eVar.d);
                q.t(new byte[]{-8}, new byte[]{-44, 46, 73, 14, -37, -120, -75, -21}, sb, i10);
                return q.j(new byte[]{-70}, new byte[]{-106, 69, -108, -92, -99, -61, -26, 121}, sb, i11);
            }
            if (dVar == d.e && eVar.e != null) {
                return d + eVar.e;
            }
        }
        return e;
    }
}
