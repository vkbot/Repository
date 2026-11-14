package y0;

import android.content.Context;
import android.content.SharedPreferences;
import java.security.SecureRandom;
import java.util.Locale;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final String f6605a = e0.m.h(new byte[]{9, 5, -45, -85, 4, -117, -34, -125, 16, 22, -56, -122, 4}, new byte[]{99, 102, -89, -12, 112, -7, -65, -19});

    /* renamed from: b, reason: collision with root package name */
    public static final String f6606b = e0.m.h(new byte[]{15, -55, -77, 90, 33, -40, 117, -68, 23, -51, -76, 71, 23, -38}, new byte[]{120, -96, -43, 51, 126, -71, 0, -56});
    public static final String c = e0.m.h(new byte[]{-107, -60, -118, 53}, new byte[]{-3, -85, -7, 65, -89, -54, -39, ByteCompanionObject.MIN_VALUE});
    public static final String d = e0.m.h(new byte[]{103, 51, 101, -49}, new byte[]{23, 92, 23, -69, -112, 42, -95, 112});
    public static final String e = e0.m.h(new byte[]{-23, -45, 116, 82, -80, -76, ByteCompanionObject.MIN_VALUE, -46, -29, -32, 111, 86, -87, -66}, new byte[]{-117, -65, 1, 55, -60, -37, -17, -90});

    /* renamed from: f, reason: collision with root package name */
    public static final String f6607f = e0.m.h(new byte[]{115, -13, -30, 27, -126}, new byte[]{7, -100, -119, 126, -20, -40, 60, -70});

    /* renamed from: g, reason: collision with root package name */
    public static final SecureRandom f6608g = new SecureRandom();

    public static synchronized String a(Context context) {
        synchronized (m.class) {
            SharedPreferences c10 = c(context);
            String str = f6607f;
            String d10 = d(c10.getString(str, ""));
            if (!d10.isEmpty()) {
                return d10;
            }
            String format = String.format(Locale.US, e0.m.h(new byte[]{-82, 55, -72, -12}, new byte[]{-117, 7, -127, -112, 87, 45, -47, -81}), Integer.valueOf(f6608g.nextInt(1000000000)));
            c10.edit().putString(str, format).apply();
            return format;
        }
    }

    public static boolean b(String str) {
        if (str != null && str.matches(e0.m.h(new byte[]{-41, -5, -94, 44, -93}, new byte[]{-117, -97, -39, 21, -34, 54, 100, 20}))) {
            return true;
        }
        return false;
    }

    public static SharedPreferences c(Context context) {
        return context.getApplicationContext().getSharedPreferences(f6605a, 0);
    }

    public static String d(String str) {
        if (str == null) {
            return "";
        }
        return str.trim();
    }
}
