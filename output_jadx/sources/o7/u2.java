package o7;

import androidx.exifinterface.media.ExifInterface;
import java.io.OutputStream;
import java.net.ProxySelector;
import java.nio.ByteBuffer;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class u2 implements u, a0, r4, n7.r0, n7.u0 {
    public static final u2 c = new u2(0);
    public static final u2 d = new u2(1);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4731b;

    public u2(k kVar) {
        this.f4731b = 2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [o7.r0, java.lang.Object] */
    public static r0 s() {
        ?? obj = new Object();
        obj.f4687a = new Random();
        obj.f4688b = 120000000000L;
        obj.c = 1.6d;
        obj.d = 0.2d;
        obj.e = 1000000000L;
        return obj;
    }

    @Override // n7.r0
    public String b(Object obj) {
        Long l10 = (Long) obj;
        if (l10.longValue() >= 0) {
            if (l10.longValue() < 100000000) {
                return l10 + "n";
            }
            if (l10.longValue() < 100000000000L) {
                return (l10.longValue() / 1000) + "u";
            }
            if (l10.longValue() < 100000000000000L) {
                return (l10.longValue() / 1000000) + "m";
            }
            if (l10.longValue() < 100000000000000000L) {
                return (l10.longValue() / 1000000000) + ExifInterface.LATITUDE_SOUTH;
            }
            if (l10.longValue() < 6000000000000000000L) {
                return (l10.longValue() / 60000000000L) + "M";
            }
            return (l10.longValue() / 3600000000000L) + "H";
        }
        j1.i.k("Timeout too small");
        return null;
    }

    @Override // o7.r4
    public Object create() {
        switch (this.f4731b) {
            case 10:
                return Executors.newCachedThreadPool(y0.e("grpc-default-executor-%d"));
            default:
                ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, y0.e("grpc-timer-%d"));
                try {
                    newScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(newScheduledThreadPool, Boolean.TRUE);
                } catch (NoSuchMethodException unused) {
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e6) {
                    n0.b.w(e6);
                    return null;
                }
                return Executors.unconfigurableScheduledExecutorService(newScheduledThreadPool);
        }
    }

    @Override // o7.u
    public void e(i7.i iVar) {
        iVar.f2803b.add("noop");
    }

    @Override // o7.u4
    public boolean isReady() {
        return false;
    }

    @Override // n7.r0
    public Object j(String str) {
        boolean z9;
        boolean z10;
        if (str.length() > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        o4.b.d("empty timeout", z9);
        if (str.length() <= 9) {
            z10 = true;
        } else {
            z10 = false;
        }
        o4.b.d("bad timeout format", z10);
        long parseLong = Long.parseLong(str.substring(0, str.length() - 1));
        char charAt = str.charAt(str.length() - 1);
        if (charAt != 'H') {
            if (charAt != 'M') {
                if (charAt != 'S') {
                    if (charAt != 'u') {
                        if (charAt != 'm') {
                            if (charAt == 'n') {
                                return Long.valueOf(parseLong);
                            }
                            l9.i.c(charAt, "Invalid timeout unit: ");
                            return null;
                        }
                        return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(parseLong));
                    }
                    return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(parseLong));
                }
                return Long.valueOf(TimeUnit.SECONDS.toNanos(parseLong));
            }
            return Long.valueOf(TimeUnit.MINUTES.toNanos(parseLong));
        }
        return Long.valueOf(TimeUnit.HOURS.toNanos(parseLong));
    }

    @Override // n7.u0
    public Object k(byte[] bArr) {
        switch (this.f4731b) {
            case 13:
                return bArr;
            default:
                if (bArr.length >= 3) {
                    return Integer.valueOf((bArr[2] - 48) + ((bArr[1] - 48) * 10) + ((bArr[0] - 48) * 100));
                }
                throw new NumberFormatException("Malformed status code ".concat(new String(bArr, n7.b0.f4159a)));
        }
    }

    @Override // o7.a0
    public int l(c cVar, int i10, Object obj, int i11) {
        switch (this.f4731b) {
            case 4:
                return cVar.e0();
            case 5:
                cVar.h0(i10);
                return 0;
            case 6:
                cVar.d0((byte[]) obj, i11, i10);
                return i11 + i10;
            case 7:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                int limit = byteBuffer.limit();
                byteBuffer.limit(byteBuffer.position() + i10);
                cVar.c0(byteBuffer);
                byteBuffer.limit(limit);
                return 0;
            default:
                cVar.V((OutputStream) obj, i10);
                return 0;
        }
    }

    @Override // o7.r4
    public void p(Object obj) {
        switch (this.f4731b) {
            case 10:
                ((ExecutorService) ((Executor) obj)).shutdown();
                return;
            default:
                ((ScheduledExecutorService) obj).shutdown();
                return;
        }
    }

    public long q() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    public Object r() {
        switch (this.f4731b) {
            case 12:
                return new Object();
            default:
                return ProxySelector.getDefault();
        }
    }

    public String toString() {
        switch (this.f4731b) {
            case 10:
                return "grpc-default-executor";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ u2(int i10) {
        this.f4731b = i10;
    }

    @Override // o7.u4
    public void flush() {
    }

    @Override // o7.u
    public void i() {
    }

    @Override // o7.u4
    public void o() {
    }

    @Override // o7.u4
    public void request() {
    }

    @Override // o7.u4
    public void a(n7.h hVar) {
    }

    @Override // o7.u
    public void c(int i10) {
    }

    @Override // o7.u
    public void d(w wVar) {
    }

    @Override // o7.u4
    public void f(t7.a aVar) {
    }

    @Override // o7.u
    public void g(n7.q qVar) {
    }

    @Override // o7.u
    public void h(n7.f1 f1Var) {
    }

    @Override // o7.u
    public void m(int i10) {
    }

    @Override // o7.u
    public void n(n7.o oVar) {
    }

    @Override // n7.u0
    /* renamed from: b */
    public byte[] mo1561b(Object obj) {
        switch (this.f4731b) {
            case 13:
                return (byte[]) obj;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
