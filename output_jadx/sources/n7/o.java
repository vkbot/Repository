package n7;

import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class o implements Comparable {
    public static final h e = new h(3);

    /* renamed from: f, reason: collision with root package name */
    public static final long f4231f = -3153600000000000000L;

    /* renamed from: b, reason: collision with root package name */
    public final h f4232b;
    public final long c;
    public volatile boolean d;

    public o(long j10) {
        boolean z9;
        h hVar = e;
        long nanoTime = System.nanoTime();
        this.f4232b = hVar;
        long min = Math.min(3153600000000000000L, Math.max(f4231f, j10));
        this.c = nanoTime + min;
        if (min <= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.d = z9;
    }

    public final boolean a() {
        if (!this.d) {
            long j10 = this.c;
            this.f4232b.getClass();
            if (j10 - System.nanoTime() <= 0) {
                this.d = true;
            } else {
                return false;
            }
        }
        return true;
    }

    public final long b() {
        this.f4232b.getClass();
        long nanoTime = System.nanoTime();
        if (!this.d && this.c - nanoTime <= 0) {
            this.d = true;
        }
        return this.c - nanoTime;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        o oVar = (o) obj;
        h hVar = oVar.f4232b;
        h hVar2 = this.f4232b;
        if (hVar2 == hVar) {
            long j10 = this.c - oVar.c;
            if (j10 < 0) {
                return -1;
            }
            if (j10 > 0) {
                return 1;
            }
            return 0;
        }
        StringBuilder sb = new StringBuilder("Tickers (");
        sb.append(hVar2);
        h hVar3 = oVar.f4232b;
        sb.append(" and ");
        sb.append(hVar3);
        sb.append(") don't match. Custom Ticker should only be used in tests!");
        throw new AssertionError(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        h hVar = oVar.f4232b;
        h hVar2 = this.f4232b;
        if (hVar2 != null ? hVar2 != hVar : hVar != null) {
            return false;
        }
        if (this.c == oVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.asList(this.f4232b, Long.valueOf(this.c)).hashCode();
    }

    public final String toString() {
        long b10 = b();
        long abs = Math.abs(b10) / 1000000000;
        long abs2 = Math.abs(b10) % 1000000000;
        StringBuilder sb = new StringBuilder();
        if (b10 < 0) {
            sb.append('-');
        }
        sb.append(abs);
        if (abs2 > 0) {
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
        }
        sb.append("s from now");
        h hVar = e;
        h hVar2 = this.f4232b;
        if (hVar2 != hVar) {
            sb.append(" (ticker=" + hVar2 + ")");
        }
        return sb.toString();
    }
}
