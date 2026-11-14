package b2;

import java.net.URL;
import java.util.regex.Pattern;
import l5.k;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public long f334a;

    /* renamed from: b, reason: collision with root package name */
    public int f335b;
    public final Object c;

    public b() {
        if (w7.c.c == null) {
            Pattern pattern = k.f3542b;
            w7.c.c = new w7.c(15);
        }
        w7.c cVar = w7.c.c;
        if (k.c == null) {
            k.c = new k(cVar);
        }
        this.c = k.c;
    }

    public synchronized boolean a() {
        boolean z9;
        if (this.f335b != 0) {
            ((k) this.c).f3543a.getClass();
            if (System.currentTimeMillis() <= this.f334a) {
                z9 = false;
            }
        }
        z9 = true;
        return z9;
    }

    public synchronized void b(int i10) {
        long min;
        if ((i10 < 200 || i10 >= 300) && i10 != 401 && i10 != 404) {
            this.f335b++;
            synchronized (this) {
                if (i10 != 429 && (i10 < 500 || i10 >= 600)) {
                    min = 86400000;
                    ((k) this.c).f3543a.getClass();
                    this.f334a = System.currentTimeMillis() + min;
                }
                double pow = Math.pow(2.0d, this.f335b);
                ((k) this.c).getClass();
                min = (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), 1800000L);
                ((k) this.c).f3543a.getClass();
                this.f334a = System.currentTimeMillis() + min;
            }
            return;
        }
        synchronized (this) {
            this.f335b = 0;
        }
        return;
    }

    public b(int i10, URL url, long j10) {
        this.f335b = i10;
        this.c = url;
        this.f334a = j10;
    }
}
