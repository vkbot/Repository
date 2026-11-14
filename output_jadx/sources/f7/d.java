package f7;

import android.net.InetAddresses;
import android.os.Build;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f2364a;

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f2365b = Pattern.compile("^(((([0-9A-Fa-f]{1,4}:){7}([0-9A-Fa-f]{1,4}|:))|(([0-9A-Fa-f]{1,4}:){6}(:[0-9A-Fa-f]{1,4}|((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3})|:))|(([0-9A-Fa-f]{1,4}:){5}(((:[0-9A-Fa-f]{1,4}){1,2})|:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3})|:))|(([0-9A-Fa-f]{1,4}:){4}(((:[0-9A-Fa-f]{1,4}){1,3})|((:[0-9A-Fa-f]{1,4})?:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){3}(((:[0-9A-Fa-f]{1,4}){1,4})|((:[0-9A-Fa-f]{1,4}){0,2}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){2}(((:[0-9A-Fa-f]{1,4}){1,5})|((:[0-9A-Fa-f]{1,4}){0,3}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){1}(((:[0-9A-Fa-f]{1,4}){1,6})|((:[0-9A-Fa-f]{1,4}){0,4}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(:(((:[0-9A-Fa-f]{1,4}){1,7})|((:[0-9A-Fa-f]{1,4}){0,5}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:)))(%.+)?)|((?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?))$");
    public static final Pattern c = Pattern.compile("^(?=.{1,255}$)[0-9A-Za-z](?:(?:[0-9A-Za-z]|-){0,61}[0-9A-Za-z])?(?:\\.[0-9A-Za-z](?:(?:[0-9A-Za-z]|-){0,61}[0-9A-Za-z])?)*\\.?$");

    static {
        Method method = null;
        try {
            if (Build.VERSION.SDK_INT < 29) {
                method = InetAddress.class.getMethod("parseNumericAddress", String.class);
            }
        } catch (Exception unused) {
        }
        f2364a = method;
    }

    public static InetAddress a(String str) {
        InetAddress parseNumericAddress;
        if (!str.isEmpty()) {
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    parseNumericAddress = InetAddresses.parseNumericAddress(str);
                    return parseNumericAddress;
                }
                Method method = f2364a;
                if (method != null) {
                    return (InetAddress) method.invoke(null, str);
                }
                throw new NoSuchMethodException("parseNumericAddress");
            } catch (IllegalArgumentException e) {
                throw new i(InetAddress.class, str, null, e);
            } catch (Exception e6) {
                Throwable cause = e6.getCause();
                if (!(cause instanceof IllegalArgumentException)) {
                    try {
                        if (f2365b.matcher(str).matches()) {
                            return InetAddress.getByName(str);
                        }
                        throw new i(InetAddress.class, str, "Not an IP address", null);
                    } catch (UnknownHostException e10) {
                        throw new i(InetAddress.class, str, null, e10);
                    }
                }
                throw new i(InetAddress.class, str, null, (Exception) cause);
            }
        }
        throw new i(InetAddress.class, str, "Empty address", null);
    }
}
