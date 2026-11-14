package y5;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.DhcpInfo;
import android.net.LinkProperties;
import android.net.Network;
import android.net.RouteInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.core.graphics.drawable.DrawableCompat;
import b1.n;
import com.bumptech.glide.manager.t;
import com.example.navistart.MainActivity;
import com.example.navistart.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.protobuf.q;
import e0.j2;
import e0.m;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import n.p;
import n7.x0;
import w0.d1;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static volatile x0 f6635a = null;

    /* renamed from: b, reason: collision with root package name */
    public static int f6636b = -1;

    public static void a(int i10, Context context) {
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService(m.h(new byte[]{116, -36, 59, -13, -127}, new byte[]{21, -87, 95, -102, -18, 66, 117, -52}));
            if (audioManager == null) {
                return;
            }
            audioManager.adjustStreamVolume(3, i10, 0);
        } catch (Exception e) {
            Log.w(m.h(new byte[]{-67, -32, -18, -109, 1, 59, 14, -122}, new byte[]{-24, -108, -121, -1, 114, 122, 98, -22}), m.h(new byte[]{-55, 4, 123, -127, -123, -127, 31, -97, -13, 74, 121, -117, -120, -118, 88, -114, -68, 7, ByteCompanionObject.MAX_VALUE, -121, ByteCompanionObject.MIN_VALUE, -123, 31, -122, -23, 30, ByteCompanionObject.MAX_VALUE}, new byte[]{-100, 106, 26, -29, -23, -28, 63, -21}), e);
        }
    }

    public static void b(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = DrawableCompat.wrap(drawable).mutate();
            if (colorStateList != null && colorStateList.isStateful()) {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            } else {
                drawable.setTintList(colorStateList);
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static Object c(o7.a aVar) {
        boolean z9;
        Exception exc;
        Exception exc2;
        String name;
        if (Looper.getMainLooper() != Looper.myLooper()) {
            Looper myLooper = Looper.myLooper();
            if (myLooper != null && ((name = myLooper.getThread().getName()) == "GoogleApiHandler" || (name != null && name.equals("GoogleApiHandler")))) {
                j1.i.l("Must not be called on GoogleApiHandler thread.");
                return null;
            }
            synchronized (aVar.f4388b) {
                z9 = aVar.f4387a;
            }
            if (z9) {
                if (aVar.e()) {
                    return aVar.d();
                }
                synchronized (aVar.f4388b) {
                    exc2 = (Exception) aVar.e;
                }
                throw new ExecutionException(exc2);
            }
            p pVar = new p(18);
            c0.f fVar = z2.c.f6727a;
            ((t) aVar.c).m(new z2.e((Executor) fVar, (z2.b) pVar));
            aVar.i();
            ((t) aVar.c).m(new z2.e((Executor) fVar, (z2.a) pVar));
            aVar.i();
            ((t) aVar.c).m(new z2.d(fVar, pVar));
            aVar.i();
            ((CountDownLatch) pVar.c).await();
            if (aVar.e()) {
                return aVar.d();
            }
            synchronized (aVar.f4388b) {
                exc = (Exception) aVar.e;
            }
            throw new ExecutionException(exc);
        }
        j1.i.l("Must not be called on the main application thread");
        return null;
    }

    public static ImageView.ScaleType d(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                return ImageView.ScaleType.CENTER;
                            }
                            return ImageView.ScaleType.CENTER_INSIDE;
                        }
                        return ImageView.ScaleType.CENTER_CROP;
                    }
                    return ImageView.ScaleType.FIT_END;
                }
                return ImageView.ScaleType.FIT_CENTER;
            }
            return ImageView.ScaleType.FIT_START;
        }
        return ImageView.ScaleType.FIT_XY;
    }

    public static String e(Context context) {
        String f8;
        ConnectivityManager h2 = h(context);
        if (h2 == null) {
            return null;
        }
        Network activeNetwork = h2.getActiveNetwork();
        if (activeNetwork != null && (f8 = f(h2.getLinkProperties(activeNetwork))) != null) {
            return f8;
        }
        Network[] allNetworks = h2.getAllNetworks();
        if (allNetworks == null) {
            return null;
        }
        for (Network network : allNetworks) {
            String f10 = f(h2.getLinkProperties(network));
            if (f10 != null) {
                return f10;
            }
        }
        return null;
    }

    public static String f(LinkProperties linkProperties) {
        String hostAddress;
        String str = null;
        if (linkProperties == null) {
            return null;
        }
        for (RouteInfo routeInfo : linkProperties.getRoutes()) {
            if (routeInfo != null) {
                InetAddress gateway = routeInfo.getGateway();
                if ((gateway instanceof Inet4Address) && !gateway.isAnyLocalAddress() && !gateway.isLoopbackAddress() && (hostAddress = gateway.getHostAddress()) != null && !hostAddress.trim().isEmpty()) {
                    if (routeInfo.isDefaultRoute()) {
                        return hostAddress;
                    }
                    if (str == null) {
                        str = hostAddress;
                    }
                }
            }
        }
        return str;
    }

    public static String g(Context context) {
        WifiManager wifiManager;
        DhcpInfo dhcpInfo;
        if (context != null && (wifiManager = (WifiManager) context.getApplicationContext().getSystemService(m.h(new byte[]{68, -80, -12, 23}, new byte[]{51, -39, -110, 126, -49, 55, 121, -32}))) != null && (dhcpInfo = wifiManager.getDhcpInfo()) != null && dhcpInfo.gateway != 0) {
            return String.format(Locale.US, m.h(new byte[]{100, -66, -70, -95, -94, -89, 58, -29, 111, -1, -16}, new byte[]{65, -38, -108, -124, -58, -119, 31, -121}), Integer.valueOf(dhcpInfo.gateway & 255), Integer.valueOf((dhcpInfo.gateway >> 8) & 255), Integer.valueOf((dhcpInfo.gateway >> 16) & 255), Integer.valueOf((dhcpInfo.gateway >> 24) & 255));
        }
        return null;
    }

    public static ConnectivityManager h(Context context) {
        if (context == null) {
            return null;
        }
        return (ConnectivityManager) context.getApplicationContext().getSystemService(m.h(new byte[]{-116, -70, 66, -15, -121, 4, -45, 95, -103, -68, 88, -26}, new byte[]{-17, -43, 44, -97, -30, 103, -89, 54}));
    }

    public static String i() {
        String str = Build.FINGERPRINT;
        String j10 = j(m.h(new byte[]{-107, -13, 104, -96, 30, 84, 71, -91, -106, -17, 105, -3, 1, 66, 91, -30, -122, -6, ByteCompanionObject.MAX_VALUE, -3, 1, 78, 93}, new byte[]{-27, -106, 26, -45, 119, 39, 51, -117}));
        if (j10.isEmpty()) {
            j10 = j(m.h(new byte[]{-59, 59, -61, 1, 101, -58, -66, 65, -43, 46, -43, 1, 123, -62, -92, 76, -63, 35, -62, 74, Base64.padSymbol, -43, -65, 70, -104, 33, -33, 75, 118}, new byte[]{-74, 66, -80, 47, 19, -93, -42, 40}));
        }
        if (j10.isEmpty()) {
            j10 = j(m.h(new byte[]{87, -86, 36, 68, 88, -116, -50, -124, 71, -65, 50, 68, 70, -120, -44, -119, 83, -78, 37, 15, 0, -102, -61, -97, 77, -78, 59, 68, 64, -100, -53, -113, 65, -95}, new byte[]{36, -45, 87, 106, 46, -23, -90, -19}));
        }
        if (j10.isEmpty()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(m.h(new byte[]{-57, -60, 70, 13, 118, -61, 3}, new byte[]{-96, -95, 50, 125, 4, -84, 115, 113})).getInputStream()));
                Pattern compile = Pattern.compile(m.h(new byte[]{-122, ByteCompanionObject.MAX_VALUE, 99, -24, 60, 4, -10, 55, -120, 118, 15, -97, 68, 99, -30, 36, -93, 21, 21, -72, 80}, new byte[]{-40, 36, 34, -59, 116, 78, -37, 121}));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    int indexOf = readLine.indexOf(m.h(new byte[]{-2, 29, -22, 55}, new byte[]{-93, 39, -54, 108, 118, -30, 41, 57}));
                    if (indexOf >= 0) {
                        String trim = readLine.substring(indexOf + 4, readLine.length() - 1).trim();
                        if (compile.matcher(trim).matches()) {
                            j10 = trim;
                            break;
                        }
                    }
                }
            } catch (Exception unused) {
            }
            j10 = "";
        }
        return q.l(new byte[]{110, -88, -54, -106, 4, 22}, new byte[]{78, -2, -125, -40, 62, 54, 28, -71}, ai.onnxruntime.a.u(str), j10);
    }

    public static String j(String str) {
        try {
            return (String) Class.forName(m.h(new byte[]{81, 122, -17, -107, -23, 46, -125, -53, 95, 103, -91, -76, -1, 52, -109, ByteCompanionObject.MIN_VALUE, 93, 68, -7, -120, -10, 34, -107, -111, 89, 113, -8}, new byte[]{48, 20, -117, -25, -122, 71, -25, -27})).getMethod(m.h(new byte[]{17, -124, -78}, new byte[]{118, -31, -58, -92, -29, ByteCompanionObject.MIN_VALUE, -78, -123}), String.class).invoke(null, str);
        } catch (Exception unused) {
            return "";
        }
    }

    public static int k(Context context) {
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService(m.h(new byte[]{21, 38, -12, -59, -76}, new byte[]{116, 83, -112, -84, -37, -115, -37, 83}));
            if (audioManager != null) {
                int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                if (streamMaxVolume <= 0) {
                    return 0;
                }
                return Math.max(0, Math.min(Math.round((audioManager.getStreamVolume(3) * 100.0f) / streamMaxVolume), 100));
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static String l(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb = new StringBuilder(str2.length() + str.length());
            for (int i10 = 0; i10 < str.length(); i10++) {
                sb.append(str.charAt(i10));
                if (str2.length() > i10) {
                    sb.append(str2.charAt(i10));
                }
            }
            return sb.toString();
        }
        j1.i.k("Invalid input received");
        return null;
    }

    public static t5.b m(InputStreamReader inputStreamReader) {
        try {
            w5.a aVar = new w5.a(inputStreamReader);
            t5.b n10 = n(aVar);
            n10.getClass();
            if (!(n10 instanceof t5.d) && aVar.p0() != 10) {
                throw new a8.a("Did not consume the entire document.", 5);
            }
            return n10;
        } catch (IOException e) {
            throw new a8.a(5, e);
        } catch (NumberFormatException e6) {
            throw new a8.a(5, e6);
        } catch (w5.c e10) {
            throw new a8.a(5, e10);
        }
    }

    public static t5.b n(w5.a aVar) {
        boolean z9 = aVar.c;
        aVar.c = true;
        try {
            try {
                try {
                    return com.bumptech.glide.c.o(aVar);
                } catch (StackOverflowError e) {
                    throw new a8.a("Failed parsing JSON source: " + aVar + " to Json", 5, e);
                }
            } catch (OutOfMemoryError e6) {
                throw new a8.a("Failed parsing JSON source: " + aVar + " to Json", 5, e6);
            }
        } finally {
            aVar.c = z9;
        }
    }

    public static void o(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int[] drawableState = textInputLayout.getDrawableState();
            int[] drawableState2 = checkableImageButton.getDrawableState();
            int length = drawableState.length;
            int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
            System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
            int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
            Drawable mutate = DrawableCompat.wrap(drawable).mutate();
            mutate.setTintList(ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    public static int p(String str, String str2) {
        String a10 = d1.a(str2);
        if (str.equals(m.h(new byte[]{89, -99, -90, -6, 77, 66, 41, 17, 70, -120, -75, -4, 72}, new byte[]{42, -19, -61, -103, 36, 36, 80, 78}))) {
            if (a10.matches(m.h(new byte[]{-115, -2, 74, 44, -11, -52, -87, 111, 22, 4, -33, -62, 77, -52, -93, 111, 24, 5, -19, -62, 73, 96, 109, -38, -51, -96, 11, ByteCompanionObject.MAX_VALUE, -82, 104, 103, 111, 17, 4, -41, -61, 114, -51, -103, 111, 27, 4, -39, -62, 64, -51, -103, 111, 29, 5, -30, 111, -87, 125, 117, -61, 115, 106, -78, -94, 31, -88, -54, 60, 115, 102, 30, 114, -90, 110, 125, -45, -52, -93, 30, 114, -90, 110, 59, -39, -49, -69, 21, 58, -31, 54}, new byte[]{-93, -44, 98, 19, -49, 28, 27, -65}))) {
                return R.string.voice_ask_vent_level;
            }
            return R.string.voice_ask_heat_level;
        }
        if (str.equals(m.h(new byte[]{32, -5, -52, -7, -125, 58, 36, 126, 36, -30, -57, -2, -123, 43, 2, 70, 33, -28, -36, -22}, new byte[]{83, -117, -87, -102, -22, 92, 93, 33}))) {
            return R.string.voice_ask_window_group;
        }
        if (str.equals(m.h(new byte[]{71, -98, -17, -35, -62, 102, -94, 108, 85, -84, -22, -58, -54, 102, -67}, new byte[]{38, -13, -115, -76, -91, 19, -51, 25}))) {
            return R.string.voice_ask_window_group_ambiguous;
        }
        if (!str.equals(m.h(new byte[]{7, -101, 68, -73, -99, -120, 78, -71, 13, -102, 77, -114, -126, -124, 76, -71, 59, -103, 69, -75, -108, -110}, new byte[]{100, -12, 42, -47, -15, -31, 45, -51}))) {
            if (str.equals(m.h(new byte[]{-13, -35, -49, -47, 49, -43, -119, -121, -12, -56, -57, -62, Base64.padSymbol, -63, -111, -84, -11, -33, -49}, new byte[]{ByteCompanionObject.MIN_VALUE, -83, -86, -78, 88, -77, -16, -40}))) {
                return R.string.voice_ask_temperature;
            }
            if (str.equals(m.h(new byte[]{19, 19, 10, -23, 1, -44, 73, 93, 6, 2, 1, -43, 4, -41, 70, 103, 12}, new byte[]{96, 99, 111, -118, 104, -78, 48, 2}))) {
                return R.string.voice_ask_fan;
            }
            if (str.equals(m.h(new byte[]{5, 88, 32, -75, -81, -29, -76, 93, 40, 91, 45, -70, -124, -26, -89, 78, 18, 81, 19, -70, -76, -2, -99, 75, 2, 77, 60, -69, -87, -2, -89, 92}, new byte[]{119, Base64.padSymbol, 76, -44, -37, -118, -62, 56}))) {
                return R.string.voice_ask_fan_absolute;
            }
            if (!str.equals(m.h(new byte[]{-84, -80, 49, 40, 9, 97, 101, 106, -66, -87, 38, 45, 12, 104, 107, 106, -69, -87, 38, 46, 3, 115, 117, 90, -79}, new byte[]{-33, -64, 84, 75, 96, 7, 28, 53})) && !str.equals(m.h(new byte[]{44, -40, 91, 35, 9, 1, -37, 33, 62, -22, 88, 35, 28, 18, -40, 59, 58, -22, 93, 35, 28, 17, -41, 32, 36, -38, 87}, new byte[]{77, -75, 57, 74, 110, 116, -76, 84}))) {
                if (str.equals(m.h(new byte[]{-125, -34, -50, 1, 97, 121, -30, -3, -125, -53, -54, 22, 87, 119, -2, -61, -124, -57, -59, 5, 87, 112, -23, -3, -122, -53, -59, 22, 97, 115, -6, -42, -103, -63, -59}, new byte[]{-16, -82, -85, 98, 8, 31, -101, -94}))) {
                    return R.string.voice_ask_seat_mode;
                }
                if (str.equals(m.h(new byte[]{-33, 98, 29, 2, 124, 78, -91, -63, -61, 112, 18, 4, 118, 92}, new byte[]{-84, 18, 120, 97, 21, 40, -36, -98}))) {
                    return R.string.voice_ask_object;
                }
                if (str.equals(m.h(new byte[]{-23, 41, -2, 35, 79, -95, -24, 110, -18, 43, -6, 35, 77, -104, -11, 88, -24, 60, -8, 52, 79, -88, -1}, new byte[]{-102, 89, -101, 64, 38, -57, -111, 49}))) {
                    return R.string.voice_ask_track;
                }
                if (str.equals(m.h(new byte[]{124, 123, -103, 71, 47, -120, 115, 8, 126, 98, -113, 70, 39, -110, 125, 56, ByteCompanionObject.MAX_VALUE}, new byte[]{17, 18, -22, 52, 70, -26, 20, 87}))) {
                    if (a10.matches(m.h(new byte[]{7, -79, 15, -26, -101, -100, 66, 4, -109, 75, -102, -91, 113, -14, 44, 110, -7, 37, -10, 81, -35, -100, 72, 4, -101, 75, -110, 8, 33, 48, 44, 101, -7, 43, -10, 89, 113, -8, 44, 100, -8, 28, 91, 9, 16, -100, 76, 4, -102, 75, -105, 9, 23, 48, -117, -67, 71, -1, 72, -82, -35, 40, -109, -69, 91, -25, 83, -85, -44, 34, -105, -88, 78, -9, 72, -81, -60, 46, -109, -84, 0, -75, 13}, new byte[]{41, -101, 39, -39, -95, 76, -4, -44}))) {
                        return R.string.voice_ask_open_close;
                    }
                    if (a10.matches(m.h(new byte[]{-24, 79, 118, -30, 83, -88, 34, 82, 115, -75, -30, 13, -42, -87, 21, 83, 70, -75, -18, 12, -21, -88, 35, 83, 70, 25, -114, 110, -72, -7, 112, 50, 22, -47, -113, 94, -72, -8, -36, -10, -93, 8, 46, -72, 27, 24, -44, -9, -76, 0, 34, -71, 12, 30, -46, -25, -93, 76, 112, -9}, new byte[]{-58, 101, 94, -35, 105, 121, -96, -126}))) {
                        return R.string.voice_ask_temperature_action;
                    }
                    if (a10.matches(m.h(new byte[]{-11, -86, -72, -54, -95, -38, -78, 10, 101, 80, 36, 37, 37, -38, -66, 11, 91, 80, 37, 37, 41, 118, -35, 100, 11, 49, 64, 75, 75, -71, -36, 90, 11, 53, 64, 71, -25, -38, -65, 10, 110, 80, 45, 36, 25, -38, -75, 10, 96, 81, 31, 36, 29, 118, -35, 96, 11, 59, 64, 77, 75, -74, -35, 106, 10, 2, -20, 37, 33, -38, -77, 10, 102, 80, 36, 37, 35, -37, -117, 10, 99, 80, 46, 37, 38, -38, -72, 11, 91, -4, 65, 117, 74, -119, -35, 97, -89, -24, -11, -108, -17, 118, 123, -65, -75, -12, -7, -103, -6, 126, 113, -71, -73, -23, -3, -108, -17, 111, 36, -12, -15}, new byte[]{-37, ByteCompanionObject.MIN_VALUE, -112, -11, -101, 10, 13, -38}))) {
                        return R.string.voice_ask_on_off;
                    }
                    return R.string.voice_ask_operation;
                }
                if (!str.equals(m.h(new byte[]{5, 68, -83, -117, -66, -3, -106, 29, 15, 69, -92, -78, -95, -3, -111, 12}, new byte[]{102, 43, -61, -19, -46, -108, -11, 105})) && !str.equals(m.h(new byte[]{5, -114, 16, -60, 23, -31, -62, 108, 4, -123, 7, -18, 0, -29, -62, 107, 0}, new byte[]{112, -32, 99, -79, 103, -111, -83, 30}))) {
                    if (!str.contains(m.h(new byte[]{68, -127, 21, 52, 82}, new byte[]{50, -32, 121, 65, 55, 60, 75, 122})) && !str.contains(m.h(new byte[]{75, 37, 38, -17}, new byte[]{62, 75, 79, -101, -17, 73, 83, -74})) && !str.contains(m.h(new byte[]{57, 68, -40, 98, -67, 104}, new byte[]{88, 41, -73, 23, -45, 28, 38, -2}))) {
                        if (!str.equals(m.h(new byte[]{15, 106, 100, -13, -76, 44, 15, -67, Base64.padSymbol, 124, 103, -22, -80, Base64.padSymbol, 13, -68, 17}, new byte[]{98, 31, 8, -121, -35, 92, 99, -40})) && !str.equals(m.h(new byte[]{-52, -106, -14, -56, -8, -84, 82, 41, -2, -116, -4, -42, -12, -65, 74, 63}, new byte[]{-95, -29, -98, -68, -111, -36, 62, 76}))) {
                            if (!str.equals(m.h(new byte[]{-8, 106, 47, -88, 4, -91, 35, -67, -55, 96, 58, -106, 19, -83, 34, -80, -13, 99}, new byte[]{-106, 15, 72, -55, 112, -52, 76, -45})) && !str.startsWith(m.h(new byte[]{-20, -38, 8, 83, 98, -36, -38, 36, -4, -60, 20, 64, 112}, new byte[]{-103, -76, 123, 50, 4, -71, -123, 86})) && !str.equals(m.h(new byte[]{ByteCompanionObject.MAX_VALUE, 123, 82, 48, 51, -89, -61, -71, 81, 97, 69, 28, 36, -95, -62, -77, 103, 122, 94, 44, 41}, new byte[]{14, 14, 55, 67, 71, -50, -84, -41})) && !str.equals(m.h(new byte[]{-10, -31, 38, -124, 63, -73, 10, 76, -51, -21, 50, -66, 32, -80, 3, 92, -5, -12, 44, -124, 18, -90, 0, 69, -1, -27, 46, -123, 62}, new byte[]{-110, -124, 64, -31, 77, -59, 111, 40}))) {
                                if (str.equals(m.h(new byte[]{-6, 28, -101, 20, 105, 90, 1, 109, -8, 19, -109, 13, 97, 85, 42}, new byte[]{-105, 125, -11, 97, 8, 54, 94, 14}))) {
                                    return R.string.voice_ask_manual_conflict;
                                }
                                return R.string.voice_ask_repeat;
                            }
                            return R.string.voice_ask_new_command;
                        }
                        return R.string.voice_ask_one_command;
                    }
                    if (str.startsWith(m.h(new byte[]{-7, 11, 80, 69, 29, -101, 14, 95, -22, 55, 82, 77, 30, ByteCompanionObject.MIN_VALUE, 52, 111, -19, 6, 69, 90, 19, -100, Base64.padSymbol, 81, -6, 4, 65}, new byte[]{-104, 104, 36, 44, 114, -11, 81, 48}))) {
                        return R.string.voice_ask_unavailable;
                    }
                    return R.string.voice_ask_value;
                }
                return R.string.voice_ask_side;
            }
            return R.string.voice_ask_airflow;
        }
        return R.string.voice_ask_seat_mode;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static f6.b q(f6.b r22, int r23, int r24, f6.f r25) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.k.q(f6.b, int, int, f6.f):f6.b");
    }

    public static void r(Context context, Intent intent) {
        try {
            context.sendBroadcast(intent);
        } catch (Exception e) {
            Log.w(m.h(new byte[]{50, -123, -36, -34, 80, 27, -113, -40, 4, -92, -46, -39, 81}, new byte[]{112, -9, -77, -65, 52, 120, -18, -85}), m.h(new byte[]{-6, 122, 31, -36, 72, 24, 86, 12, -45, 59, 5, -43, 67, 24, 86, 26, -50, 116, 23, -44, 78, 29, 5, 12, -122, 59}, new byte[]{-68, 27, 118, -80, 45, 124, 118, 120}) + e.getMessage());
        }
    }

    public static void s(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean z9;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z10 = false;
        int i10 = 1;
        if (onLongClickListener != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (hasOnClickListeners || z9) {
            z10 = true;
        }
        checkableImageButton.setFocusable(z10);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z9);
        if (!z10) {
            i10 = 2;
        }
        checkableImageButton.setImportantForAccessibility(i10);
    }

    public static void t(int i10, Context context) {
        int streamMaxVolume;
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService(m.h(new byte[]{-66, -30, -78, 119, 42}, new byte[]{-33, -105, -42, 30, 69, 11, -60, -77}));
            if (audioManager != null && (streamMaxVolume = audioManager.getStreamMaxVolume(3)) > 0) {
                f6636b = Math.max(0, Math.min(i10, 100));
                audioManager.setStreamVolume(3, Math.round((r3 * streamMaxVolume) / 100.0f), 0);
            }
        } catch (Exception unused) {
        }
    }

    public static void u(Context context, Intent intent, Bundle bundle) {
        new Handler(Looper.getMainLooper()).post(new n(bundle, context, intent, 7));
    }

    public static void v(MainActivity mainActivity, Intent intent) {
        u(mainActivity, intent, null);
    }

    public static void w(int i10, Context context) {
        x(context, context.getText(i10));
    }

    public static void x(Context context, CharSequence charSequence) {
        try {
            new Handler(Looper.getMainLooper()).post(new j2(12, context, charSequence));
        } catch (Exception unused) {
        }
    }

    public static boolean y(n9.a aVar, x7.d dVar, b8.c cVar) {
        if (aVar instanceof Callable) {
            try {
                Object call = ((Callable) aVar).call();
                if (call == null) {
                    o8.d.a(dVar);
                    return true;
                }
                try {
                    Object apply = cVar.apply(call);
                    d8.b.a(apply, "The mapper returned a null Publisher");
                    n9.a aVar2 = (n9.a) apply;
                    if (aVar2 instanceof Callable) {
                        try {
                            Object call2 = ((Callable) aVar2).call();
                            if (call2 == null) {
                                o8.d.a(dVar);
                                return true;
                            }
                            dVar.f(new o8.e(call2, dVar));
                            return true;
                        } catch (Throwable th) {
                            com.bumptech.glide.d.v(th);
                            o8.d.b(th, dVar);
                            return true;
                        }
                    }
                    aVar2.a(dVar);
                    return true;
                } catch (Throwable th2) {
                    com.bumptech.glide.d.v(th2);
                    o8.d.b(th2, dVar);
                    return true;
                }
            } catch (Throwable th3) {
                com.bumptech.glide.d.v(th3);
                o8.d.b(th3, dVar);
                return true;
            }
        }
        return false;
    }

    public static void z(String str, boolean z9, Object obj) {
        if (z9) {
        } else {
            throw new a8.a(e3.d.l(str, obj), 1);
        }
    }
}
