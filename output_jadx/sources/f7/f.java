package f7;

import java.net.Inet4Address;
import java.net.InetAddress;
import org.apache.commons.io.IOUtils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final InetAddress f2371a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2372b;

    public f(InetAddress inetAddress, int i10) {
        this.f2371a = inetAddress;
        this.f2372b = i10;
    }

    public static f a(String str) {
        String str2;
        int i10;
        int i11;
        int lastIndexOf = str.lastIndexOf(47);
        if (lastIndexOf >= 0) {
            str2 = str.substring(lastIndexOf + 1);
            try {
                i10 = Integer.parseInt(str2, 10);
                str = str.substring(0, lastIndexOf);
            } catch (NumberFormatException unused) {
                throw new i(Integer.class, str2, null, null);
            }
        } else {
            str2 = "";
            i10 = -1;
        }
        InetAddress a10 = d.a(str);
        if (a10 instanceof Inet4Address) {
            i11 = 32;
        } else {
            i11 = 128;
        }
        if (i10 <= i11) {
            if (i10 < 0) {
                i10 = i11;
            }
            return new f(a10, i10);
        }
        throw new i(f.class, str2, "Invalid network mask", null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!this.f2371a.equals(fVar.f2371a) || this.f2372b != fVar.f2372b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f2371a.hashCode() ^ this.f2372b;
    }

    public final String toString() {
        return this.f2371a.getHostAddress() + IOUtils.DIR_SEPARATOR_UNIX + this.f2372b;
    }
}
