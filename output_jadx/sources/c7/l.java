package c7;

import java.net.ProtocolException;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f574a;

    /* renamed from: b, reason: collision with root package name */
    public int f575b;
    public Object c;
    public Object d;

    public l() {
        this.f574a = 2;
        Object[] objArr = new Object[5];
        this.c = objArr;
        this.d = objArr;
    }

    public static l b(String str) {
        int i10;
        String str2;
        boolean startsWith = str.startsWith("HTTP/1.");
        q7.l lVar = q7.l.HTTP_1_0;
        if (startsWith) {
            i10 = 9;
            if (str.length() >= 9 && str.charAt(8) == ' ') {
                int charAt = str.charAt(7) - '0';
                if (charAt != 0) {
                    if (charAt == 1) {
                        lVar = q7.l.HTTP_1_1;
                    } else {
                        throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                }
            } else {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        } else if (str.startsWith("ICY ")) {
            i10 = 4;
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int i11 = i10 + 3;
        if (str.length() >= i11) {
            try {
                int parseInt = Integer.parseInt(str.substring(i10, i11));
                if (str.length() > i11) {
                    if (str.charAt(i11) == ' ') {
                        str2 = str.substring(i10 + 4);
                    } else {
                        throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                } else {
                    str2 = "";
                }
                return new l(lVar, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        }
        throw new ProtocolException("Unexpected status line: ".concat(str));
    }

    public n5.b a() {
        if ("".isEmpty()) {
            return new n5.b(this.f575b, (String) this.c, ((Long) this.d).longValue());
        }
        j1.i.l("Missing required properties:".concat(""));
        return null;
    }

    public String toString() {
        String str;
        switch (this.f574a) {
            case 3:
                String str2 = (String) this.d;
                StringBuilder sb = new StringBuilder();
                if (((q7.l) this.c) == q7.l.HTTP_1_0) {
                    str = "HTTP/1.0";
                } else {
                    str = "HTTP/1.1";
                }
                sb.append(str);
                sb.append(' ');
                sb.append(this.f575b);
                sb.append(' ');
                sb.append(str2);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public l(q7.l lVar, int i10, String str) {
        this.f574a = 3;
        this.c = lVar;
        this.f575b = i10;
        this.d = str;
    }
}
