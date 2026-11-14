package s7;

import q0.g;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f5726a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5727b;
    public final String c;

    public a(g gVar) {
        String str = gVar.f5193b;
        this.f5726a = gVar.c;
        int i10 = gVar.d;
        if (i10 == -1) {
            if (str.equals("http")) {
                i10 = 80;
            } else if (str.equals("https")) {
                i10 = 443;
            } else {
                i10 = -1;
            }
        }
        this.f5727b = i10;
        this.c = gVar.toString();
    }

    public static int a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c >= 'A' && c <= 'F') {
            return c - '7';
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof a) && ((a) obj).c.equals(this.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return this.c;
    }
}
