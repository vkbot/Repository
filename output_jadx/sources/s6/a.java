package s6;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5712a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5713b;
    public final int c;
    public final int d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public int f5714f;

    public a(int i10, int i11, int i12, int i13, int i14) {
        this.f5712a = i14;
        switch (i14) {
            case 1:
                this.f5714f = -1;
                this.f5713b = i10;
                this.c = i11;
                this.d = i12;
                this.e = i13;
                return;
            default:
                this.f5713b = i10;
                this.c = i13;
                this.d = i11;
                this.e = i12;
                this.f5714f = i11 + i12;
                return;
        }
    }

    public boolean a(int i10) {
        if (i10 != -1) {
            if (this.d == (i10 % 3) * 3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void b() {
        this.f5714f = (this.d / 3) + ((this.e / 30) * 3);
    }

    public String toString() {
        switch (this.f5712a) {
            case 1:
                return this.f5714f + "|" + this.e;
            default:
                return super.toString();
        }
    }
}
