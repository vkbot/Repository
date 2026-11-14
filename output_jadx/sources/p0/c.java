package p0;

import java.lang.reflect.Array;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4963a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4964b;
    public int c;
    public final Object d;

    public c(int i10, int i11, int i12) {
        this.f4963a = i12;
        switch (i12) {
            case 2:
                this.d = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i11, i10);
                this.f4964b = i10;
                this.c = i11;
                return;
            default:
                this.d = null;
                this.f4964b = i10;
                int i13 = i11 & 7;
                this.c = i13 == 0 ? 8 : i13;
                return;
        }
    }

    public byte a(int i10, int i11) {
        return ((byte[][]) this.d)[i11][i10];
    }

    public void b() {
        d dVar = (d) this.d;
        if (dVar != null) {
            dVar.b(this.c, this.f4964b);
        }
    }

    public void c(int i10, int i11, int i12) {
        ((byte[][]) this.d)[i11][i10] = (byte) i12;
    }

    public String toString() {
        switch (this.f4963a) {
            case 2:
                int i10 = this.f4964b;
                int i11 = this.c;
                StringBuilder sb = new StringBuilder((i10 * 2 * i11) + 2);
                for (int i12 = 0; i12 < i11; i12++) {
                    byte[] bArr = ((byte[][]) this.d)[i12];
                    for (int i13 = 0; i13 < i10; i13++) {
                        byte b10 = bArr[i13];
                        if (b10 != 0) {
                            if (b10 != 1) {
                                sb.append("  ");
                            } else {
                                sb.append(" 1");
                            }
                        } else {
                            sb.append(" 0");
                        }
                    }
                    sb.append('\n');
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public c() {
        this.f4963a = 1;
        this.d = new c[256];
        this.f4964b = 0;
        this.c = 0;
    }

    public c(d dVar, int i10) {
        this.f4963a = 0;
        this.d = dVar;
        this.f4964b = Math.max(1, i10);
        b();
    }
}
