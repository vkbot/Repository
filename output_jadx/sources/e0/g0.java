package e0;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.core.os.ConfigurationCompat;
import java.util.Locale;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1916a = m.h(new byte[]{24, -72, -94, -5, -58, -7, -16, -57, 12, -87, -75, -63}, new byte[]{121, -56, -46, -92, -86, -104, -98, -96});

    /* renamed from: b, reason: collision with root package name */
    public static final String f1917b = m.h(new byte[]{-1, -96, 33, 76, -4, -126}, new byte[]{-116, -39, 82, 56, -103, -17, 38, 48});

    public static String a() {
        String loadString = h0.b.o().loadString(f1916a, Locale.getDefault().getLanguage());
        if (loadString.equals(f1917b)) {
            return Resources.getSystem().getConfiguration().getLocales().get(0).getLanguage();
        }
        return loadString;
    }

    public static Context b(Context context) {
        Locale locale = new Locale(a());
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(locale);
        return context.createConfigurationContext(configuration);
    }

    public static void c(Activity activity, String str) {
        Locale locale;
        if (str.equals(f1917b)) {
            locale = ConfigurationCompat.getLocales(Resources.getSystem().getConfiguration()).get(0);
        } else {
            locale = new Locale(str);
        }
        Locale.setDefault(locale);
        Configuration configuration = new Configuration(activity.getResources().getConfiguration());
        configuration.setLocale(locale);
        activity.getResources().updateConfiguration(configuration, activity.getResources().getDisplayMetrics());
        h0.b.o().saveString(f1916a, str);
    }
}
