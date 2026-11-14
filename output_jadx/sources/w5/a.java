package w5;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import kotlin.text.Typography;
import org.apache.commons.io.FilenameUtils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class a implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final Reader f6376b;

    /* renamed from: j, reason: collision with root package name */
    public long f6381j;

    /* renamed from: k, reason: collision with root package name */
    public int f6382k;

    /* renamed from: l, reason: collision with root package name */
    public String f6383l;

    /* renamed from: m, reason: collision with root package name */
    public int[] f6384m;

    /* renamed from: o, reason: collision with root package name */
    public String[] f6386o;

    /* renamed from: p, reason: collision with root package name */
    public int[] f6387p;
    public boolean c = false;
    public final char[] d = new char[1024];
    public int e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f6377f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f6378g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f6379h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f6380i = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f6385n = 1;

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f6384m = iArr;
        iArr[0] = 6;
        this.f6386o = new String[32];
        this.f6387p = new int[32];
        this.f6376b = reader;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x020b, code lost:
    
        if (g0(r12) != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x019c, code lost:
    
        r13 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x020e, code lost:
    
        if (r5 != 2) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0210, code lost:
    
        if (r10 == false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0216, code lost:
    
        if (r1 != Long.MIN_VALUE) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0218, code lost:
    
        if (r17 == 0) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x021f, code lost:
    
        if (r1 != 0) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0221, code lost:
    
        if (r17 != 0) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0223, code lost:
    
        if (r17 == 0) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0226, code lost:
    
        r1 = -r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0227, code lost:
    
        r24.f6381j = r1;
        r24.e += r7;
        r9 = 15;
        r24.f6380i = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x021b, code lost:
    
        r13 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0233, code lost:
    
        if (r5 == r13) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0236, code lost:
    
        if (r5 == 4) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0239, code lost:
    
        if (r5 != 7) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x023b, code lost:
    
        r24.f6382k = r7;
        r9 = 16;
        r24.f6380i = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x017b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0263 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int S() {
        /*
            Method dump skipped, instructions count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.a.S():int");
    }

    public final void V() {
        int i10 = this.f6380i;
        if (i10 == 0) {
            i10 = S();
        }
        if (i10 == 4) {
            int i11 = this.f6385n;
            this.f6385n = i11 - 1;
            int[] iArr = this.f6387p;
            int i12 = i11 - 2;
            iArr[i12] = iArr[i12] + 1;
            this.f6380i = 0;
            return;
        }
        n0.b.j(kotlin.collections.unsigned.a.j(p0()), "Expected END_ARRAY but was ", h0());
    }

    public final void b() {
        int i10 = this.f6380i;
        if (i10 == 0) {
            i10 = S();
        }
        if (i10 == 3) {
            q0(1);
            this.f6387p[this.f6385n - 1] = 0;
            this.f6380i = 0;
            return;
        }
        n0.b.j(kotlin.collections.unsigned.a.j(p0()), "Expected BEGIN_ARRAY but was ", h0());
    }

    public final void c() {
        int i10 = this.f6380i;
        if (i10 == 0) {
            i10 = S();
        }
        if (i10 == 1) {
            q0(3);
            this.f6380i = 0;
        } else {
            n0.b.j(kotlin.collections.unsigned.a.j(p0()), "Expected BEGIN_OBJECT but was ", h0());
        }
    }

    public final void c0() {
        int i10 = this.f6380i;
        if (i10 == 0) {
            i10 = S();
        }
        if (i10 == 2) {
            int i11 = this.f6385n;
            int i12 = i11 - 1;
            this.f6385n = i12;
            this.f6386o[i12] = null;
            int[] iArr = this.f6387p;
            int i13 = i11 - 2;
            iArr[i13] = iArr[i13] + 1;
            this.f6380i = 0;
            return;
        }
        n0.b.j(kotlin.collections.unsigned.a.j(p0()), "Expected END_OBJECT but was ", h0());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6380i = 0;
        this.f6384m[0] = 8;
        this.f6385n = 1;
        this.f6376b.close();
    }

    public final boolean d0(int i10) {
        int i11;
        int i12;
        int i13 = this.f6379h;
        int i14 = this.e;
        this.f6379h = i13 - i14;
        int i15 = this.f6377f;
        char[] cArr = this.d;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f6377f = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f6377f = 0;
        }
        this.e = 0;
        do {
            int i17 = this.f6377f;
            int read = this.f6376b.read(cArr, i17, cArr.length - i17);
            if (read == -1) {
                return false;
            }
            i11 = this.f6377f + read;
            this.f6377f = i11;
            if (this.f6378g == 0 && (i12 = this.f6379h) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.e++;
                this.f6379h = i12 + 1;
                i10++;
            }
        } while (i11 < i10);
        return true;
    }

    public final String e0(boolean z9) {
        StringBuilder sb = new StringBuilder("$");
        int i10 = 0;
        while (true) {
            int i11 = this.f6385n;
            if (i10 < i11) {
                int i12 = this.f6384m[i10];
                if (i12 != 1 && i12 != 2) {
                    if (i12 == 3 || i12 == 4 || i12 == 5) {
                        sb.append(FilenameUtils.EXTENSION_SEPARATOR);
                        String str = this.f6386o[i10];
                        if (str != null) {
                            sb.append(str);
                        }
                    }
                } else {
                    int i13 = this.f6387p[i10];
                    if (z9 && i13 > 0 && i10 == i11 - 1) {
                        i13--;
                    }
                    sb.append('[');
                    sb.append(i13);
                    sb.append(']');
                }
                i10++;
            } else {
                return sb.toString();
            }
        }
    }

    public final boolean f0() {
        int i10 = this.f6380i;
        if (i10 == 0) {
            i10 = S();
        }
        if (i10 != 2 && i10 != 4 && i10 != 17) {
            return true;
        }
        return false;
    }

    public final boolean g0(char c) {
        if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
            if (c != '#') {
                if (c != ',') {
                    if (c != '/' && c != '=') {
                        if (c != '{' && c != '}' && c != ':') {
                            if (c != ';') {
                                switch (c) {
                                    case '[':
                                    case ']':
                                        return false;
                                    case '\\':
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
            y();
            return false;
        }
        return false;
    }

    public final String h0() {
        StringBuilder v9 = ai.onnxruntime.a.v(" at line ", this.f6378g + 1, (this.e - this.f6379h) + 1, " column ", " path ");
        v9.append(e0(false));
        return v9.toString();
    }

    public final boolean i0() {
        int i10 = this.f6380i;
        if (i10 == 0) {
            i10 = S();
        }
        if (i10 == 5) {
            this.f6380i = 0;
            int[] iArr = this.f6387p;
            int i11 = this.f6385n - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        }
        if (i10 == 6) {
            this.f6380i = 0;
            int[] iArr2 = this.f6387p;
            int i12 = this.f6385n - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        }
        n0.b.j(kotlin.collections.unsigned.a.j(p0()), "Expected a boolean but was ", h0());
        return false;
    }

    public final String j0() {
        String m02;
        int i10 = this.f6380i;
        if (i10 == 0) {
            i10 = S();
        }
        if (i10 == 14) {
            m02 = o0();
        } else if (i10 == 12) {
            m02 = m0('\'');
        } else if (i10 == 13) {
            m02 = m0(Typography.quote);
        } else {
            n0.b.j(kotlin.collections.unsigned.a.j(p0()), "Expected a name but was ", h0());
            return null;
        }
        this.f6380i = 0;
        this.f6386o[this.f6385n - 1] = m02;
        return m02;
    }

    public final int k0(boolean z9) {
        char c;
        int i10 = this.e;
        int i11 = this.f6377f;
        while (true) {
            if (i10 == i11) {
                this.e = i10;
                if (!d0(1)) {
                    if (!z9) {
                        return -1;
                    }
                    throw new EOFException("End of input".concat(h0()));
                }
                i10 = this.e;
                i11 = this.f6377f;
            }
            int i12 = i10 + 1;
            char[] cArr = this.d;
            c = cArr[i10];
            if (c == '\n') {
                this.f6378g++;
                this.f6379h = i12;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.e = i12;
                    if (i12 == i11) {
                        this.e = i10;
                        boolean d02 = d0(2);
                        this.e++;
                        if (!d02) {
                            break;
                        }
                    }
                    y();
                    int i13 = this.e;
                    char c10 = cArr[i13];
                    if (c10 != '*') {
                        if (c10 != '/') {
                            break;
                        }
                        this.e = i13 + 1;
                        r0();
                        i10 = this.e;
                        i11 = this.f6377f;
                    } else {
                        this.e = i13 + 1;
                        while (true) {
                            if (this.e + 2 > this.f6377f && !d0(2)) {
                                s0("Unterminated comment");
                                throw null;
                            }
                            int i14 = this.e;
                            if (cArr[i14] == '\n') {
                                this.f6378g++;
                                this.f6379h = i14 + 1;
                            } else {
                                int i15 = 0;
                                while (true) {
                                    int i16 = this.e;
                                    if (i15 < 2) {
                                        if (cArr[i16 + i15] != "*/".charAt(i15)) {
                                            break;
                                        }
                                        i15++;
                                    } else {
                                        i10 = i16 + 2;
                                        i11 = this.f6377f;
                                        break;
                                    }
                                }
                            }
                            this.e++;
                        }
                    }
                } else if (c == '#') {
                    this.e = i12;
                    y();
                    r0();
                    i10 = this.e;
                    i11 = this.f6377f;
                } else {
                    this.e = i12;
                    return c;
                }
            }
            i10 = i12;
        }
        return c;
    }

    public final void l0() {
        int i10 = this.f6380i;
        if (i10 == 0) {
            i10 = S();
        }
        if (i10 == 7) {
            this.f6380i = 0;
            int[] iArr = this.f6387p;
            int i11 = this.f6385n - 1;
            iArr[i11] = iArr[i11] + 1;
            return;
        }
        n0.b.j(kotlin.collections.unsigned.a.j(p0()), "Expected null but was ", h0());
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0115, code lost:
    
        if (r1 != null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0117, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0125, code lost:
    
        r1.append(r7, r3, r2 - r3);
        r11.e = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        r11.e = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        if (r1 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        r1.append(r7, r3, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        if (r11.e != r11.f6377f) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        if (d0(1) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        s0("Unterminated escape sequence");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
    
        r2 = r11.e;
        r3 = r2 + 1;
        r11.e = r3;
        r5 = r7[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        if (r5 == '\n') goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
    
        if (r5 == '\"') goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if (r5 == '\'') goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006b, code lost:
    
        if (r5 == '/') goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006d, code lost:
    
        if (r5 == '\\') goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0071, code lost:
    
        if (r5 == 'b') goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
    
        if (r5 == 'f') goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0079, code lost:
    
        if (r5 == 'n') goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007d, code lost:
    
        if (r5 == 'r') goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
    
        if (r5 == 't') goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0085, code lost:
    
        if (r5 != 'u') goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x008c, code lost:
    
        if ((r2 + 5) <= r11.f6377f) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0092, code lost:
    
        if (d0(4) == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0095, code lost:
    
        s0("Unterminated escape sequence");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0098, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0099, code lost:
    
        r2 = r11.e;
        r4 = r2 + 4;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009f, code lost:
    
        if (r2 >= r4) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a1, code lost:
    
        r5 = r7[r2];
        r8 = (char) (r9 << 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a8, code lost:
    
        if (r5 < '0') goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ac, code lost:
    
        if (r5 > '9') goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ae, code lost:
    
        r5 = r5 - '0';
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b0, code lost:
    
        r9 = (char) (r5 + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c8, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b6, code lost:
    
        if (r5 < 'a') goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b8, code lost:
    
        if (r5 > 'f') goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ba, code lost:
    
        r5 = r5 - 'W';
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00bf, code lost:
    
        if (r5 < 'A') goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00c3, code lost:
    
        if (r5 > 'F') goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c5, code lost:
    
        r5 = r5 - '7';
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00dd, code lost:
    
        throw new java.lang.NumberFormatException("\\u".concat(new java.lang.String(r7, r11.e, 4)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00de, code lost:
    
        r11.e += 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00e4, code lost:
    
        s0("Invalid escape sequence");
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00e9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00ea, code lost:
    
        r9 = '\t';
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00ed, code lost:
    
        r9 = '\r';
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0100, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00f0, code lost:
    
        r9 = '\f';
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00f3, code lost:
    
        r9 = '\b';
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00f6, code lost:
    
        r9 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00f8, code lost:
    
        r11.f6378g++;
        r11.f6379h = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m0(char r12) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.a.m0(char):java.lang.String");
    }

    public final String n0() {
        String str;
        int i10 = this.f6380i;
        if (i10 == 0) {
            i10 = S();
        }
        if (i10 == 10) {
            str = o0();
        } else if (i10 == 8) {
            str = m0('\'');
        } else if (i10 == 9) {
            str = m0(Typography.quote);
        } else if (i10 == 11) {
            str = this.f6383l;
            this.f6383l = null;
        } else if (i10 == 15) {
            str = Long.toString(this.f6381j);
        } else if (i10 == 16) {
            str = new String(this.d, this.e, this.f6382k);
            this.e += this.f6382k;
        } else {
            n0.b.j(kotlin.collections.unsigned.a.j(p0()), "Expected a string but was ", h0());
            return null;
        }
        this.f6380i = 0;
        int[] iArr = this.f6387p;
        int i11 = this.f6385n - 1;
        iArr[i11] = iArr[i11] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0048, code lost:
    
        y();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:55:0x0042. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String o0() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r6.e
            int r3 = r3 + r2
            int r4 = r6.f6377f
            char[] r5 = r6.d
            if (r3 >= r4) goto L4c
            char r3 = r5[r3]
            r4 = 9
            if (r3 == r4) goto L58
            r4 = 10
            if (r3 == r4) goto L58
            r4 = 12
            if (r3 == r4) goto L58
            r4 = 13
            if (r3 == r4) goto L58
            r4 = 32
            if (r3 == r4) goto L58
            r4 = 35
            if (r3 == r4) goto L48
            r4 = 44
            if (r3 == r4) goto L58
            r4 = 47
            if (r3 == r4) goto L48
            r4 = 61
            if (r3 == r4) goto L48
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L58
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L58
            r4 = 58
            if (r3 == r4) goto L58
            r4 = 59
            if (r3 == r4) goto L48
            switch(r3) {
                case 91: goto L58;
                case 92: goto L48;
                case 93: goto L58;
                default: goto L45;
            }
        L45:
            int r2 = r2 + 1
            goto L3
        L48:
            r6.y()
            goto L58
        L4c:
            int r3 = r5.length
            if (r2 >= r3) goto L5a
            int r3 = r2 + 1
            boolean r3 = r6.d0(r3)
            if (r3 == 0) goto L58
            goto L3
        L58:
            r1 = r2
            goto L78
        L5a:
            if (r0 != 0) goto L67
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L67:
            int r3 = r6.e
            r0.append(r5, r3, r2)
            int r3 = r6.e
            int r3 = r3 + r2
            r6.e = r3
            r2 = 1
            boolean r2 = r6.d0(r2)
            if (r2 != 0) goto L2
        L78:
            int r2 = r6.e
            if (r0 != 0) goto L82
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r2, r1)
            goto L89
        L82:
            r0.append(r5, r2, r1)
            java.lang.String r0 = r0.toString()
        L89:
            int r2 = r6.e
            int r2 = r2 + r1
            r6.e = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.a.o0():java.lang.String");
    }

    public final int p0() {
        int i10 = this.f6380i;
        if (i10 == 0) {
            i10 = S();
        }
        switch (i10) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void q0(int i10) {
        int i11 = this.f6385n;
        int[] iArr = this.f6384m;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.f6384m = Arrays.copyOf(iArr, i12);
            this.f6387p = Arrays.copyOf(this.f6387p, i12);
            this.f6386o = (String[]) Arrays.copyOf(this.f6386o, i12);
        }
        int[] iArr2 = this.f6384m;
        int i13 = this.f6385n;
        this.f6385n = i13 + 1;
        iArr2[i13] = i10;
    }

    public final void r0() {
        char c;
        do {
            if (this.e < this.f6377f || d0(1)) {
                int i10 = this.e;
                int i11 = i10 + 1;
                this.e = i11;
                c = this.d[i10];
                if (c == '\n') {
                    this.f6378g++;
                    this.f6379h = i11;
                    return;
                }
            } else {
                return;
            }
        } while (c != '\r');
    }

    public final void s0(String str) {
        throw new IOException(str.concat(h0()));
    }

    public final String toString() {
        return a.class.getSimpleName().concat(h0());
    }

    public final void y() {
        if (this.c) {
            return;
        }
        s0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }
}
