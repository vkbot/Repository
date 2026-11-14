package g;

import android.util.Log;
import androidx.core.view.ViewCompat;
import j1.i;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import kotlin.UByte;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f2399b;
    public b c;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f2398a = new byte[256];
    public int d = 0;

    public final boolean a() {
        if (this.c.f2391b != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r6v29, types: [java.lang.Object, g.a] */
    /* JADX WARN: Type inference failed for: r6v37, types: [java.lang.Object, g.a] */
    public final b b() {
        boolean z9;
        boolean z10;
        boolean z11;
        byte[] bArr;
        boolean z12;
        if (this.f2399b != null) {
            if (a()) {
                return this.c;
            }
            StringBuilder sb = new StringBuilder();
            for (int i10 = 0; i10 < 6; i10++) {
                sb.append((char) c());
            }
            boolean startsWith = sb.toString().startsWith("GIF");
            b bVar = this.c;
            if (!startsWith) {
                bVar.f2391b = 1;
            } else {
                bVar.f2392f = this.f2399b.getShort();
                this.c.f2393g = this.f2399b.getShort();
                int c = c();
                b bVar2 = this.c;
                if ((c & 128) != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                bVar2.f2394h = z9;
                bVar2.f2395i = (int) Math.pow(2.0d, (c & 7) + 1);
                this.c.f2396j = c();
                b bVar3 = this.c;
                c();
                bVar3.getClass();
                if (this.c.f2394h && !a()) {
                    b bVar4 = this.c;
                    bVar4.f2390a = e(bVar4.f2395i);
                    b bVar5 = this.c;
                    bVar5.f2397k = bVar5.f2390a[bVar5.f2396j];
                }
            }
            if (!a()) {
                boolean z13 = false;
                while (!z13 && !a() && this.c.c <= Integer.MAX_VALUE) {
                    int c10 = c();
                    if (c10 != 33) {
                        if (c10 != 44) {
                            if (c10 != 59) {
                                this.c.f2391b = 1;
                            } else {
                                z13 = true;
                            }
                        } else {
                            b bVar6 = this.c;
                            if (bVar6.d == null) {
                                bVar6.d = new Object();
                            }
                            bVar6.d.f2382a = this.f2399b.getShort();
                            this.c.d.f2383b = this.f2399b.getShort();
                            this.c.d.c = this.f2399b.getShort();
                            this.c.d.d = this.f2399b.getShort();
                            int c11 = c();
                            if ((c11 & 128) != 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            int pow = (int) Math.pow(2.0d, (c11 & 7) + 1);
                            a aVar = this.c.d;
                            if ((c11 & 64) != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            aVar.e = z11;
                            if (z10) {
                                aVar.f2389k = e(pow);
                            } else {
                                aVar.f2389k = null;
                            }
                            this.c.d.f2388j = this.f2399b.position();
                            c();
                            f();
                            if (!a()) {
                                b bVar7 = this.c;
                                bVar7.c++;
                                bVar7.e.add(bVar7.d);
                            }
                        }
                    } else {
                        int c12 = c();
                        if (c12 != 1) {
                            if (c12 != 249) {
                                if (c12 != 254) {
                                    if (c12 != 255) {
                                        f();
                                    } else {
                                        d();
                                        StringBuilder sb2 = new StringBuilder();
                                        int i11 = 0;
                                        while (true) {
                                            bArr = this.f2398a;
                                            if (i11 >= 11) {
                                                break;
                                            }
                                            sb2.append((char) bArr[i11]);
                                            i11++;
                                        }
                                        if (sb2.toString().equals("NETSCAPE2.0")) {
                                            do {
                                                d();
                                                if (bArr[0] == 1) {
                                                    byte b10 = bArr[1];
                                                    byte b11 = bArr[2];
                                                    this.c.getClass();
                                                }
                                                if (this.d > 0) {
                                                }
                                            } while (!a());
                                        } else {
                                            f();
                                        }
                                    }
                                } else {
                                    f();
                                }
                            } else {
                                this.c.d = new Object();
                                c();
                                int c13 = c();
                                a aVar2 = this.c.d;
                                int i12 = (c13 & 28) >> 2;
                                aVar2.f2385g = i12;
                                if (i12 == 0) {
                                    aVar2.f2385g = 1;
                                }
                                if ((c13 & 1) != 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                aVar2.f2384f = z12;
                                short s5 = this.f2399b.getShort();
                                if (s5 < 2) {
                                    s5 = 10;
                                }
                                a aVar3 = this.c.d;
                                aVar3.f2387i = s5 * 10;
                                aVar3.f2386h = c();
                                c();
                            }
                        } else {
                            f();
                        }
                    }
                }
                b bVar8 = this.c;
                if (bVar8.c < 0) {
                    bVar8.f2391b = 1;
                }
            }
            return this.c;
        }
        i.l("You must call setData() before parseHeader()");
        return null;
    }

    public final int c() {
        try {
            return this.f2399b.get() & UByte.MAX_VALUE;
        } catch (Exception unused) {
            this.c.f2391b = 1;
            return 0;
        }
    }

    public final void d() {
        int c = c();
        this.d = c;
        if (c > 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                try {
                    i11 = this.d;
                    if (i10 < i11) {
                        i11 -= i10;
                        this.f2399b.get(this.f2398a, i10, i11);
                        i10 += i11;
                    } else {
                        return;
                    }
                } catch (Exception e) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        StringBuilder v9 = ai.onnxruntime.a.v("Error Reading Block n: ", i10, i11, " count: ", " blockSize: ");
                        v9.append(this.d);
                        Log.d("GifHeaderParser", v9.toString(), e);
                    }
                    this.c.f2391b = 1;
                    return;
                }
            }
        }
    }

    public final int[] e(int i10) {
        byte[] bArr = new byte[i10 * 3];
        int[] iArr = null;
        try {
            this.f2399b.get(bArr);
            iArr = new int[256];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = bArr[i12] & UByte.MAX_VALUE;
                int i14 = i12 + 2;
                int i15 = bArr[i12 + 1] & UByte.MAX_VALUE;
                i12 += 3;
                int i16 = i11 + 1;
                iArr[i11] = (i15 << 8) | (i13 << 16) | ViewCompat.MEASURED_STATE_MASK | (bArr[i14] & UByte.MAX_VALUE);
                i11 = i16;
            }
            return iArr;
        } catch (BufferUnderflowException e) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
            }
            this.c.f2391b = 1;
            return iArr;
        }
    }

    public final void f() {
        int c;
        do {
            c = c();
            this.f2399b.position(Math.min(this.f2399b.position() + c, this.f2399b.limit()));
        } while (c > 0);
    }
}
