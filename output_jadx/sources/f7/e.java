package f7;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.time.Duration;
import java.time.Instant;
import java.util.Optional;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f2366g = Pattern.compile("^[^\\[\\]]*:[^\\[\\]]*");

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f2367h = Pattern.compile("[/?#]");

    /* renamed from: a, reason: collision with root package name */
    public final String f2368a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2369b;
    public final Object c = new Object();
    public final int d;
    public Instant e;

    /* renamed from: f, reason: collision with root package name */
    public e f2370f;

    public e(int i10, String str, boolean z9) {
        Instant instant;
        instant = Instant.EPOCH;
        this.e = instant;
        this.f2368a = str;
        this.f2369b = z9;
        this.d = i10;
    }

    public static e b(String str) {
        if (!f2367h.matcher(str).find()) {
            try {
                URI uri = new URI("wg://" + str);
                if (uri.getPort() >= 0 && uri.getPort() <= 65535) {
                    try {
                        d.a(uri.getHost());
                        return new e(uri.getPort(), uri.getHost(), true);
                    } catch (i unused) {
                        return new e(uri.getPort(), uri.getHost(), false);
                    }
                }
                throw new i(e.class, str, "Missing/invalid port number", null);
            } catch (URISyntaxException e) {
                throw new i(e.class, str, null, e);
            }
        }
        throw new i(e.class, str, "Forbidden characters", null);
    }

    public final Optional a() {
        Instant now;
        Duration between;
        long minutes;
        Instant now2;
        Optional ofNullable;
        if (this.f2369b) {
            return Optional.of(this);
        }
        synchronized (this.c) {
            try {
                Instant instant = this.e;
                now = Instant.now();
                between = Duration.between(instant, now);
                minutes = between.toMinutes();
                if (minutes > 1) {
                    try {
                        InetAddress[] allByName = InetAddress.getAllByName(this.f2368a);
                        int i10 = 0;
                        InetAddress inetAddress = allByName[0];
                        int length = allByName.length;
                        while (true) {
                            if (i10 >= length) {
                                break;
                            }
                            InetAddress inetAddress2 = allByName[i10];
                            if (inetAddress2 instanceof Inet4Address) {
                                inetAddress = inetAddress2;
                                break;
                            }
                            i10++;
                        }
                        this.f2370f = new e(this.d, inetAddress.getHostAddress(), true);
                        now2 = Instant.now();
                        this.e = now2;
                    } catch (UnknownHostException unused) {
                        this.f2370f = null;
                    }
                }
                ofNullable = Optional.ofNullable(this.f2370f);
            } catch (Throwable th) {
                throw th;
            }
        }
        return ofNullable;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f2368a.equals(eVar.f2368a) || this.d != eVar.d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f2368a.hashCode() ^ this.d;
    }

    public final String toString() {
        boolean z9;
        boolean z10 = this.f2369b;
        String str = this.f2368a;
        if (z10 && f2366g.matcher(str).matches()) {
            z9 = true;
        } else {
            z9 = false;
        }
        StringBuilder sb = new StringBuilder();
        if (z9) {
            str = "[" + str + ']';
        }
        sb.append(str);
        sb.append(':');
        sb.append(this.d);
        return sb.toString();
    }
}
