package w0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public long f6293a;

    /* renamed from: b, reason: collision with root package name */
    public long f6294b;
    public String c = "";
    public String d = "";

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0112, code lost:
    
        if (a.a.m(r10) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0114, code lost:
    
        r10 = e0.m.h(new byte[]{-4, 119, -69, -43, -12, 124, -116, 118, -3, 73, -70, -22, -11, 76, -116, 126, 13, 37, -21, -124, -97, 46, -30, 23, -83, 36, -44, -123, -92, 47, -34, 23, -95, -44, -70, -26, -11, 75, -116, 123, -4, 118, -70, -20, -11, 69, -115, 73, -4, 118, -70, -22, -12, 126, -116, 118, 13}, new byte[]{45, -12, 106, 84, 37, -2, 92, -58}).concat(r10);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.lang.String a(java.lang.String r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.x0.a(java.lang.String, boolean):java.lang.String");
    }

    public final synchronized void b(long j10, String str, String str2) {
        try {
            if (this.f6294b == 0) {
                d(j10);
            }
            this.c = str;
            this.d = str2;
            this.f6293a = Math.min(this.f6294b, j10 + 20000);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean c() {
        return !this.d.isEmpty();
    }

    public final synchronized void d(long j10) {
        this.f6293a = 10000 + j10;
        this.f6294b = j10 + 60000;
        this.d = "";
        this.c = "";
    }

    public final synchronized long e() {
        return this.f6293a;
    }
}
