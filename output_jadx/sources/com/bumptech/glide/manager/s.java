package com.bumptech.glide.manager;

import java.io.File;
import java.util.Arrays;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f674a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f675b;
    public final Object c;
    public Object d;
    public Object e;

    public s(f6.b bVar) {
        this.f674a = 3;
        int i10 = bVar.c;
        if (i10 >= 21 && (i10 & 3) == 1) {
            this.c = bVar;
            return;
        }
        throw z5.e.a();
    }

    public void a() {
        f.c.b((f.c) this.e, this, false);
    }

    public void b(long j10, String str) {
        e(str, String.valueOf(j10));
    }

    public void c(Object obj, String str) {
        a5.h hVar = new a5.h(10);
        ((a5.h) this.e).e = hVar;
        this.e = hVar;
        hVar.d = obj;
        hVar.c = str;
    }

    public void d(String str, boolean z9) {
        e(str, String.valueOf(z9));
    }

    public void e(String str, String str2) {
        a5.h hVar = new a5.h(10);
        ((a5.h) this.e).e = hVar;
        this.e = hVar;
        hVar.d = str2;
        hVar.c = str;
    }

    public int f(int i10, int i11, int i12) {
        boolean b10;
        boolean z9 = this.f675b;
        f6.b bVar = (f6.b) this.c;
        if (z9) {
            b10 = bVar.b(i11, i10);
        } else {
            b10 = bVar.b(i10, i11);
        }
        if (b10) {
            return (i12 << 1) | 1;
        }
        return i12 << 1;
    }

    public File g() {
        File file;
        synchronized (((f.c) this.e)) {
            try {
                f.b bVar = (f.b) this.c;
                if (bVar.f2221f == this) {
                    if (!bVar.e) {
                        ((boolean[]) this.d)[0] = true;
                    }
                    file = bVar.d[0];
                    ((f.c) this.e).f2223b.mkdirs();
                } else {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    public w6.c h() {
        w6.c cVar = (w6.c) this.e;
        if (cVar != null) {
            return cVar;
        }
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 6; i12++) {
            i11 = f(i12, 8, i11);
        }
        int f8 = f(8, 7, f(8, 8, f(7, 8, i11)));
        for (int i13 = 5; i13 >= 0; i13--) {
            f8 = f(8, i13, f8);
        }
        int i14 = ((f6.b) this.c).c;
        int i15 = i14 - 7;
        for (int i16 = i14 - 1; i16 >= i15; i16--) {
            i10 = f(8, i16, i10);
        }
        for (int i17 = i14 - 8; i17 < i14; i17++) {
            i10 = f(i17, 8, i10);
        }
        w6.c a10 = w6.c.a(f8, i10);
        if (a10 == null) {
            a10 = w6.c.a(f8 ^ 21522, i10 ^ 21522);
        }
        this.e = a10;
        if (a10 != null) {
            return a10;
        }
        throw z5.e.a();
    }

    public w6.f i() {
        w6.f fVar = (w6.f) this.d;
        if (fVar != null) {
            return fVar;
        }
        int i10 = ((f6.b) this.c).c;
        int i11 = (i10 - 17) / 4;
        if (i11 <= 6) {
            return w6.f.c(i11);
        }
        int i12 = i10 - 11;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 5; i15 >= 0; i15--) {
            for (int i16 = i10 - 9; i16 >= i12; i16--) {
                i14 = f(i16, i15, i14);
            }
        }
        w6.f b10 = w6.f.b(i14);
        if (b10 != null && (b10.f6409a * 4) + 17 == i10) {
            this.d = b10;
            return b10;
        }
        for (int i17 = 5; i17 >= 0; i17--) {
            for (int i18 = i10 - 9; i18 >= i12; i18--) {
                i13 = f(i17, i18, i13);
            }
        }
        w6.f b11 = w6.f.b(i13);
        if (b11 != null && (b11.f6409a * 4) + 17 == i10) {
            this.d = b11;
            return b11;
        }
        throw z5.e.a();
    }

    public void j() {
        if (((w6.c) this.e) != null) {
            int i10 = com.bumptech.glide.g.d(8)[((w6.c) this.e).f6397b];
            f6.b bVar = (f6.b) this.c;
            int i11 = bVar.c;
            for (int i12 = 0; i12 < i11; i12++) {
                for (int i13 = 0; i13 < i11; i13++) {
                    if (w6.b.a(i10, i12, i13)) {
                        bVar.a(i13, i12);
                    }
                }
            }
        }
    }

    public String toString() {
        switch (this.f674a) {
            case 2:
                boolean z9 = this.f675b;
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.c);
                sb.append('{');
                String str = "";
                for (a5.h hVar = (a5.h) ((a5.h) this.d).e; hVar != null; hVar = (a5.h) hVar.e) {
                    Object obj = hVar.d;
                    if ((hVar instanceof i4.c) || obj != null || !z9) {
                        sb.append(str);
                        String str2 = (String) hVar.c;
                        if (str2 != null) {
                            sb.append(str2);
                            sb.append('=');
                        }
                        if (obj != null && obj.getClass().isArray()) {
                            String deepToString = Arrays.deepToString(new Object[]{obj});
                            sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                        } else {
                            sb.append(obj);
                        }
                        str = ", ";
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public s(String str) {
        this.f674a = 2;
        a5.h hVar = new a5.h(10);
        this.d = hVar;
        this.e = hVar;
        this.f675b = false;
        this.c = str;
    }

    public s(c0.h hVar, p pVar) {
        this.f674a = 0;
        this.e = new r(0, this);
        this.d = hVar;
        this.c = pVar;
    }

    public s(f.c cVar, f.b bVar) {
        this.f674a = 1;
        this.e = cVar;
        this.c = bVar;
        this.d = bVar.e ? null : new boolean[cVar.f2226h];
    }
}
