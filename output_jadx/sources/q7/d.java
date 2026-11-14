package q7;

import javax.security.auth.x500.X500Principal;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f5310a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5311b;
    public int c;
    public int d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f5312f;

    /* renamed from: g, reason: collision with root package name */
    public char[] f5313g;

    public d(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f5310a = name;
        this.f5311b = name.length();
    }

    public final int a(int i10) {
        int i11;
        int i12;
        int i13 = i10 + 1;
        int i14 = this.f5311b;
        String str = this.f5310a;
        if (i13 < i14) {
            char[] cArr = this.f5313g;
            char c = cArr[i10];
            if (c >= '0' && c <= '9') {
                i11 = c - '0';
            } else if (c >= 'a' && c <= 'f') {
                i11 = c - 'W';
            } else if (c >= 'A' && c <= 'F') {
                i11 = c - '7';
            } else {
                ai.onnxruntime.b.q(str, "Malformed DN: ");
                return 0;
            }
            char c10 = cArr[i13];
            if (c10 >= '0' && c10 <= '9') {
                i12 = c10 - '0';
            } else if (c10 >= 'a' && c10 <= 'f') {
                i12 = c10 - 'W';
            } else if (c10 >= 'A' && c10 <= 'F') {
                i12 = c10 - '7';
            } else {
                ai.onnxruntime.b.q(str, "Malformed DN: ");
                return 0;
            }
            return (i11 << 4) + i12;
        }
        ai.onnxruntime.b.q(str, "Malformed DN: ");
        return 0;
    }

    public final char b() {
        int i10;
        int i11;
        int i12 = this.c + 1;
        this.c = i12;
        int i13 = this.f5311b;
        if (i12 != i13) {
            char c = this.f5313g[i12];
            if (c != ' ' && c != '%' && c != '\\' && c != '_' && c != '\"' && c != '#') {
                switch (c) {
                    default:
                        switch (c) {
                            case ';':
                            case '<':
                            case '=':
                            case '>':
                                break;
                            default:
                                int a10 = a(i12);
                                this.c++;
                                if (a10 < 128) {
                                    return (char) a10;
                                }
                                if (a10 >= 192 && a10 <= 247) {
                                    if (a10 <= 223) {
                                        i10 = a10 & 31;
                                        i11 = 1;
                                    } else if (a10 <= 239) {
                                        i10 = a10 & 15;
                                        i11 = 2;
                                    } else {
                                        i10 = a10 & 7;
                                        i11 = 3;
                                    }
                                    for (int i14 = 0; i14 < i11; i14++) {
                                        int i15 = this.c;
                                        int i16 = i15 + 1;
                                        this.c = i16;
                                        if (i16 != i13 && this.f5313g[i16] == '\\') {
                                            int i17 = i15 + 2;
                                            this.c = i17;
                                            int a11 = a(i17);
                                            this.c++;
                                            if ((a11 & 192) == 128) {
                                                i10 = (i10 << 6) + (a11 & 63);
                                            } else {
                                                return '?';
                                            }
                                        } else {
                                            return '?';
                                        }
                                    }
                                    return (char) i10;
                                }
                                return '?';
                        }
                    case '*':
                    case '+':
                    case ',':
                        return c;
                }
            }
            return c;
        }
        ai.onnxruntime.b.u(this.f5310a, "Unexpected end of DN: ");
        return (char) 0;
    }

    public final String c() {
        int i10;
        int i11;
        int i12;
        char c;
        int i13;
        char c10;
        char c11;
        while (true) {
            i10 = this.c;
            i11 = this.f5311b;
            if (i10 >= i11 || this.f5313g[i10] != ' ') {
                break;
            }
            this.c = i10 + 1;
        }
        if (i10 == i11) {
            return null;
        }
        this.d = i10;
        this.c = i10 + 1;
        while (true) {
            i12 = this.c;
            if (i12 >= i11 || (c11 = this.f5313g[i12]) == '=' || c11 == ' ') {
                break;
            }
            this.c = i12 + 1;
        }
        String str = this.f5310a;
        if (i12 < i11) {
            this.e = i12;
            if (this.f5313g[i12] == ' ') {
                while (true) {
                    i13 = this.c;
                    if (i13 >= i11 || (c10 = this.f5313g[i13]) == '=' || c10 != ' ') {
                        break;
                    }
                    this.c = i13 + 1;
                }
                if (this.f5313g[i13] != '=' || i13 == i11) {
                    ai.onnxruntime.b.q(str, "Unexpected end of DN: ");
                    return null;
                }
            }
            this.c++;
            while (true) {
                int i14 = this.c;
                if (i14 >= i11 || this.f5313g[i14] != ' ') {
                    break;
                }
                this.c = i14 + 1;
            }
            int i15 = this.e;
            int i16 = this.d;
            if (i15 - i16 > 4) {
                char[] cArr = this.f5313g;
                if (cArr[i16 + 3] == '.' && (((c = cArr[i16]) == 'O' || c == 'o') && ((cArr[i16 + 1] == 'I' || cArr[i16 + 1] == 'i') && (cArr[i16 + 2] == 'D' || cArr[i16 + 2] == 'd')))) {
                    this.d = i16 + 4;
                }
            }
            char[] cArr2 = this.f5313g;
            int i17 = this.d;
            return new String(cArr2, i17, i15 - i17);
        }
        ai.onnxruntime.b.q(str, "Unexpected end of DN: ");
        return null;
    }
}
