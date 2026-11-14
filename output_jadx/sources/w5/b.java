package w5;

import j1.i;
import java.io.Closeable;
import java.io.Flushable;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b implements Closeable, Flushable {

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f6388i = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: j, reason: collision with root package name */
    public static final String[] f6389j = new String[128];

    /* renamed from: b, reason: collision with root package name */
    public final StringWriter f6390b;
    public int[] c;
    public int d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6391f;

    /* renamed from: g, reason: collision with root package name */
    public String f6392g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f6393h;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f6389j[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f6389j;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b(StringWriter stringWriter) {
        int[] iArr = new int[32];
        this.c = iArr;
        this.d = 0;
        if (iArr.length == 0) {
            this.c = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.c;
        int i10 = this.d;
        this.d = i10 + 1;
        iArr2[i10] = 6;
        this.e = ":";
        this.f6393h = true;
        this.f6390b = stringWriter;
    }

    public final int S() {
        int i10 = this.d;
        if (i10 != 0) {
            return this.c[i10 - 1];
        }
        i.l("JsonWriter is closed.");
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V(java.lang.String r8) {
        /*
            r7 = this;
            java.io.StringWriter r0 = r7.f6390b
            r1 = 34
            r0.write(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L3a
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L1e
            java.lang.String[] r6 = w5.b.f6389j
            r5 = r6[r5]
            if (r5 != 0) goto L2b
            goto L37
        L1e:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L25
            java.lang.String r5 = "\\u2028"
            goto L2b
        L25:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L37
            java.lang.String r5 = "\\u2029"
        L2b:
            if (r4 >= r3) goto L32
            int r6 = r3 - r4
            r0.write(r8, r4, r6)
        L32:
            r0.write(r5)
            int r4 = r3 + 1
        L37:
            int r3 = r3 + 1
            goto Ld
        L3a:
            if (r4 >= r2) goto L40
            int r2 = r2 - r4
            r0.write(r8, r4, r2)
        L40:
            r0.write(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.b.V(java.lang.String):void");
    }

    public final void b() {
        int S = S();
        if (S != 1) {
            StringWriter stringWriter = this.f6390b;
            if (S != 2) {
                if (S != 4) {
                    if (S != 6) {
                        if (S == 7) {
                            if (!this.f6391f) {
                                i.l("JSON must have only one top-level value.");
                                return;
                            }
                        } else {
                            i.l("Nesting problem.");
                            return;
                        }
                    }
                    this.c[this.d - 1] = 7;
                    return;
                }
                stringWriter.append((CharSequence) this.e);
                this.c[this.d - 1] = 5;
                return;
            }
            stringWriter.append(',');
            return;
        }
        this.c[this.d - 1] = 2;
    }

    public final void c(int i10, int i11, char c) {
        int S = S();
        if (S != i11 && S != i10) {
            i.l("Nesting problem.");
        } else if (this.f6392g == null) {
            this.d--;
            this.f6390b.write(c);
        } else {
            ai.onnxruntime.b.u(this.f6392g, "Dangling name: ");
        }
    }

    public final void c0() {
        if (this.f6392g != null) {
            int S = S();
            if (S == 5) {
                this.f6390b.write(44);
            } else if (S != 3) {
                i.l("Nesting problem.");
                return;
            }
            this.c[this.d - 1] = 4;
            V(this.f6392g);
            this.f6392g = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6390b.close();
        int i10 = this.d;
        if (i10 <= 1 && (i10 != 1 || this.c[i10 - 1] == 7)) {
            this.d = 0;
        } else {
            n0.b.A("Incomplete document");
        }
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.d != 0) {
            this.f6390b.flush();
        } else {
            i.l("JsonWriter is closed.");
        }
    }

    public final void y() {
        if (this.f6392g != null) {
            if (this.f6393h) {
                c0();
            } else {
                this.f6392g = null;
                return;
            }
        }
        b();
        this.f6390b.write("null");
    }
}
