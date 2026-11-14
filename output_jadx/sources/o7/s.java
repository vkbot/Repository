package o7;

import java.util.Locale;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class s implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final long f4691b;
    public final /* synthetic */ t c;

    public s(t tVar, long j10) {
        this.c = tVar;
        this.f4691b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        double longValue;
        i7.i iVar = new i7.i(1);
        t tVar = this.c;
        tVar.f4707l.e(iVar);
        long j10 = this.f4691b;
        long abs = Math.abs(j10) / 1000000000;
        long abs2 = Math.abs(j10) % 1000000000;
        StringBuilder sb = new StringBuilder("deadline exceeded after ");
        if (j10 < 0) {
            sb.append('-');
        }
        sb.append(abs);
        Locale locale = Locale.US;
        sb.append(String.format(locale, ".%09d", Long.valueOf(abs2)));
        sb.append("s. ");
        if (((Long) tVar.f4706k.a(n7.e.f4172a)) == null) {
            longValue = 0.0d;
        } else {
            longValue = r3.longValue() / t.t;
        }
        sb.append(String.format(locale, "Name resolution delay %.9f seconds. ", Double.valueOf(longValue)));
        sb.append(iVar);
        tVar.f4707l.h(n7.f1.f4196h.b(sb.toString()));
    }
}
