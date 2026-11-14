package w0;

import android.util.Log;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicLong f6106k = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    public final q0.f f6107a;

    /* renamed from: b, reason: collision with root package name */
    public final e1 f6108b;
    public final f1 c;
    public final f1 d;
    public long e;

    /* renamed from: f, reason: collision with root package name */
    public long f6109f;

    /* renamed from: g, reason: collision with root package name */
    public long f6110g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6111h;

    /* renamed from: i, reason: collision with root package name */
    public String f6112i;

    /* renamed from: j, reason: collision with root package name */
    public String f6113j;

    /* JADX WARN: Type inference failed for: r0v0, types: [w0.e1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [w0.f1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [w0.f1, java.lang.Object] */
    public g1(q0.f fVar) {
        ?? obj = new Object();
        this.c = new Object();
        this.d = new Object();
        this.f6107a = fVar;
        this.f6108b = obj;
    }

    public static String f(int i10, String str) {
        if (i10 > 0 && i10 < str.length() && Character.isHighSurrogate(str.charAt(i10 - 1))) {
            i10--;
        }
        return str.substring(0, i10);
    }

    public static void g(t5.e eVar, String str, Object obj) {
        if (obj == null) {
            eVar.h(str, null);
            return;
        }
        if (obj instanceof Boolean) {
            eVar.i(str, (Boolean) obj);
            return;
        }
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if (Double.isFinite(number.doubleValue())) {
                eVar.j(str, number);
                return;
            }
        }
        String valueOf = String.valueOf(obj);
        if (valueOf.length() > 1200) {
            valueOf = f(1200, valueOf);
            eVar.i(e0.m.h(new byte[]{-25, 112, 111, 101, 18, 5, -105, -62, -9}, new byte[]{-109, 2, 26, 11, 113, 100, -29, -89}), Boolean.TRUE);
        }
        eVar.k(str, valueOf);
    }

    public static boolean h(String str) {
        if (!str.equals(e0.m.h(new byte[]{72, -32, 119, -37, -39}, new byte[]{45, -106, 18, -75, -83, 96, -79, -59})) && !str.equals(e0.m.h(new byte[]{-126, 77, 122, 118, -16, -103, 60}, new byte[]{-15, 40, 9, 5, -103, -10, 82, 75})) && !str.equals(e0.m.h(new byte[]{-116, -60, 83, 31, 25, 12, -103, -70, -102}, new byte[]{-23, -88, 50, 111, 106, 105, -3, -9})) && !str.equals(e0.m.h(new byte[]{-54, 80, -15, -97, -65, -2, -120, -44, -38}, new byte[]{-66, 34, -124, -15, -36, -97, -4, -79}))) {
            return false;
        }
        return true;
    }

    public final synchronized void a(boolean z9, long j10, long j11, int i10, long j12) {
        f1 f1Var;
        try {
            if (z9) {
                f1Var = this.d;
            } else {
                f1Var = this.c;
            }
            long max = Math.max(0L, j11);
            long max2 = Math.max(0L, j12);
            f1Var.f6083a++;
            f1Var.f6084b += max;
            f1Var.c = Math.max(f1Var.c, max);
            f1Var.d += max2;
            f1Var.e = Math.max(f1Var.e, max2);
            long j13 = f1Var.f6085f;
            this.f6108b.getClass();
            f1Var.f6085f = Math.max(j13, Math.max(0L, System.nanoTime() - j10));
            f1Var.f6087h = Math.max(f1Var.f6087h, Math.max(0, i10));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final t5.e b(long j10, String str) {
        String str2;
        double max;
        t5.e eVar = new t5.e();
        String h2 = e0.m.h(new byte[]{-26, -67, 71, 55, -116}, new byte[]{-125, -53, 34, 89, -8, -96, -127, 37});
        if (str.length() > 80) {
            str2 = f(80, str);
        } else {
            str2 = str;
        }
        g(eVar, h2, str2);
        if (str.length() > 80) {
            eVar.i(e0.m.h(new byte[]{44, 68, -86, -105, -106, -122, -38, 29, 60}, new byte[]{88, 54, -33, -7, -11, -25, -82, 120}), Boolean.TRUE);
        }
        eVar.j(e0.m.h(new byte[]{-63, 42, 71, -12, 43, 49, -51}, new byte[]{-78, 79, 52, -121, 66, 94, -93, -101}), Long.valueOf(this.e));
        String h10 = e0.m.h(new byte[]{124, 82, 112, 81, 28, 29, -71, -126, 106}, new byte[]{25, 62, 17, 33, 111, 120, -35, -49});
        if (this.e == 0) {
            max = 0.0d;
        } else {
            max = Math.max(0L, j10 - this.f6109f) / 1000000.0d;
        }
        eVar.j(h10, Double.valueOf(max));
        return eVar;
    }

    public final void c(t5.e eVar) {
        try {
            String bVar = eVar.toString();
            u5.e eVar2 = eVar.f5823b;
            while (bVar.getBytes(StandardCharsets.UTF_8).length > 3500) {
                String str = "";
                Iterator it = ((u5.c) eVar2.entrySet()).iterator();
                String str2 = null;
                String str3 = null;
                while (((u5.b) it).hasNext()) {
                    u5.d b10 = ((u5.b) it).b();
                    if (!h((String) b10.getKey())) {
                        str3 = (String) b10.getKey();
                        t5.b bVar2 = (t5.b) b10.getValue();
                        bVar2.getClass();
                        if (bVar2 instanceof t5.f) {
                            t5.b bVar3 = (t5.b) b10.getValue();
                            bVar3.getClass();
                            if (bVar3 instanceof t5.f) {
                                if (((t5.f) bVar3).f5824b instanceof String) {
                                    String g10 = ((t5.b) b10.getValue()).g();
                                    if (g10.length() > str.length()) {
                                        str2 = (String) b10.getKey();
                                        str = g10;
                                    }
                                }
                            } else {
                                throw new IllegalStateException("Not a JSON Primitive: " + bVar3);
                            }
                        } else {
                            continue;
                        }
                    }
                }
                if (str2 != null) {
                    eVar.k(str2, f(str.length() / 2, str));
                } else if (str3 == null) {
                    break;
                }
                eVar.i(e0.m.h(new byte[]{Base64.padSymbol, -105, 44, 93, -92, 23, -13, 74, 45}, new byte[]{73, -27, 89, 51, -57, 118, -121, 47}), Boolean.TRUE);
                bVar = eVar.toString();
            }
            Log.i(((x) this.f6107a.c).f6262a, e0.m.h(new byte[]{86, 122, -119, 29, -58, -20, -86, 72, 103, 53}, new byte[]{0, 21, -32, 126, -93, -88, -61, 41}) + bVar);
        } catch (RuntimeException unused) {
        }
    }

    public final synchronized void d(String str) {
        if (this.e == 0) {
            return;
        }
        String h2 = e0.m.h(new byte[]{122, -8, -62, -61, -24, 98, -22, 16, 108, -13, -43}, new byte[]{9, -99, -79, -80, -127, 13, -124, 79});
        this.f6108b.getClass();
        t5.e b10 = b(System.nanoTime(), h2);
        g(b10, e0.m.h(new byte[]{53, -24, -12, -126, -78, 71}, new byte[]{71, -115, -107, -15, -35, 41, 125, 103}), str);
        this.c.a(b10, e0.m.h(new byte[]{13, -96, 64, 53}, new byte[]{122, -63, 43, 80, -51, -27, 81, 101}));
        this.d.a(b10, e0.m.h(new byte[]{-57, 77, -119, -30}, new byte[]{-95, 56, -27, -114, -67, 84, -101, 54}));
        this.e = 0L;
        this.c.b();
        this.d.b();
        this.f6111h = false;
        this.f6113j = null;
        this.f6112i = null;
        c(b10);
    }

    public final synchronized void e(String str, Object... objArr) {
        try {
            this.f6108b.getClass();
            t5.e b10 = b(System.nanoTime(), str);
            int min = Math.min(objArr.length / 2, 24);
            for (int i10 = 0; i10 < min; i10++) {
                int i11 = i10 * 2;
                Object obj = objArr[i11];
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!h(str2)) {
                        if (str2.length() > 80) {
                            str2 = f(80, str2);
                            b10.i(e0.m.h(new byte[]{107, 101, 65, -37, 5, 43, -14, -62, 123}, new byte[]{31, 23, 52, -75, 102, 74, -122, -89}), Boolean.TRUE);
                        }
                        g(b10, str2, objArr[i11 + 1]);
                    }
                }
            }
            if (objArr.length > 48 || objArr.length % 2 != 0) {
                b10.i(e0.m.h(new byte[]{ByteCompanionObject.MAX_VALUE, -103, -61, -4, -18, 10, -59, -23, 111}, new byte[]{11, -21, -74, -110, -115, 107, -79, -116}), Boolean.TRUE);
            }
            c(b10);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long i() {
        return this.e;
    }

    public final synchronized void j(String str, String str2, String str3) {
        this.f6108b.getClass();
        long nanoTime = System.nanoTime();
        if (!e0.m.h(new byte[]{71, -125, -55, -64, 85}, new byte[]{33, -22, -89, -95, 57, 122, 64, 35}).equals(str) && !str.endsWith(e0.m.h(new byte[]{107, -19, -114, 81, 117, -104}, new byte[]{52, -117, -25, 63, 20, -12, -22, -120}))) {
            if (this.f6111h && Objects.equals(str2, this.f6112i) && Objects.equals(str3, this.f6113j)) {
                return;
            }
            if (this.f6111h && nanoTime - this.f6110g < 750000000) {
                return;
            }
            this.f6111h = true;
            this.f6110g = nanoTime;
            this.f6112i = str2;
            this.f6113j = str3;
        }
        t5.e b10 = b(nanoTime, e0.m.h(new byte[]{23, 40, 49, 108, ByteCompanionObject.MAX_VALUE, -107, 120, -104, 19, 46}, new byte[]{99, 90, 80, 2, 12, -10, 10, -15}));
        g(b10, e0.m.h(new byte[]{101, -127, -109, -107}, new byte[]{14, -24, -3, -15, 77, 97, -61, 36}), str);
        g(b10, e0.m.h(new byte[]{58, 84, 91, Base64.padSymbol, 24, 21, -124}, new byte[]{73, 49, 60, 80, 125, 123, -16, 38}), str2);
        g(b10, e0.m.h(new byte[]{27, -89, 71, 48, -102, -18, 65, 5}, new byte[]{120, -56, 42, 82, -13, ByteCompanionObject.MIN_VALUE, 36, 97}), str3);
        c(b10);
    }
}
