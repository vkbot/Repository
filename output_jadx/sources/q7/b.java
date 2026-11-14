package q7;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5306a;

    /* renamed from: b, reason: collision with root package name */
    public String[] f5307b;
    public String[] c;
    public boolean d;

    public b(c cVar) {
        this.f5306a = cVar.f5308a;
        this.f5307b = cVar.f5309b;
        this.c = cVar.c;
        this.d = cVar.d;
    }

    public final void a(a... aVarArr) {
        if (this.f5306a) {
            String[] strArr = new String[aVarArr.length];
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                strArr[i10] = aVarArr[i10].f5305b;
            }
            this.f5307b = strArr;
            return;
        }
        j1.i.l("no cipher suites for cleartext connections");
    }

    public final void b(m... mVarArr) {
        if (this.f5306a) {
            if (mVarArr.length != 0) {
                String[] strArr = new String[mVarArr.length];
                for (int i10 = 0; i10 < mVarArr.length; i10++) {
                    strArr[i10] = mVarArr[i10].f5336b;
                }
                this.c = strArr;
                return;
            }
            j1.i.k("At least one TlsVersion is required");
            return;
        }
        j1.i.l("no TLS versions for cleartext connections");
    }

    public b(boolean z9) {
        this.f5306a = z9;
    }
}
