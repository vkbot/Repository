package n;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class g implements h.e {

    /* renamed from: b, reason: collision with root package name */
    public final h f4015b;
    public final URL c;
    public final String d;
    public String e;

    /* renamed from: f, reason: collision with root package name */
    public URL f4016f;

    /* renamed from: g, reason: collision with root package name */
    public volatile byte[] f4017g;

    /* renamed from: h, reason: collision with root package name */
    public int f4018h;

    public g(String str) {
        k kVar = h.f4021a;
        this.c = null;
        if (!TextUtils.isEmpty(str)) {
            this.d = str;
            c0.g.c(kVar, "Argument must not be null");
            this.f4015b = kVar;
            return;
        }
        j1.i.k("Must not be null or empty");
        throw null;
    }

    @Override // h.e
    public final void b(MessageDigest messageDigest) {
        if (this.f4017g == null) {
            this.f4017g = c().getBytes(h.e.f2522a);
        }
        messageDigest.update(this.f4017g);
    }

    public final String c() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        URL url = this.c;
        c0.g.c(url, "Argument must not be null");
        return url.toString();
    }

    public final URL d() {
        if (this.f4016f == null) {
            if (TextUtils.isEmpty(this.e)) {
                String str = this.d;
                if (TextUtils.isEmpty(str)) {
                    URL url = this.c;
                    c0.g.c(url, "Argument must not be null");
                    str = url.toString();
                }
                this.e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f4016f = new URL(this.e);
        }
        return this.f4016f;
    }

    @Override // h.e
    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (c().equals(gVar.c()) && this.f4015b.equals(gVar.f4015b)) {
                return true;
            }
        }
        return false;
    }

    @Override // h.e
    public final int hashCode() {
        if (this.f4018h == 0) {
            int hashCode = c().hashCode();
            this.f4018h = hashCode;
            this.f4018h = this.f4015b.hashCode() + (hashCode * 31);
        }
        return this.f4018h;
    }

    public final String toString() {
        return c();
    }

    public g(URL url) {
        k kVar = h.f4021a;
        c0.g.c(url, "Argument must not be null");
        this.c = url;
        this.d = null;
        c0.g.c(kVar, "Argument must not be null");
        this.f4015b = kVar;
    }
}
