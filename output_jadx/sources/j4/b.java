package j4;

import com.bumptech.glide.manager.s;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3267a;

    /* renamed from: b, reason: collision with root package name */
    public int f3268b;
    public boolean c;
    public Object d;

    public b(n7.c cVar, int i10, boolean z9) {
        this.f3267a = 1;
        o4.b.i(cVar, "callOptions");
        this.d = cVar;
        this.f3268b = i10;
        this.c = z9;
    }

    public static int b(int i10, int i11) {
        if (i11 >= 0) {
            int i12 = i10 + (i10 >> 1) + 1;
            if (i12 < i11) {
                i12 = Integer.highestOneBit(i11 - 1) << 1;
            }
            if (i12 < 0) {
                return Integer.MAX_VALUE;
            }
            return i12;
        }
        j1.i.e("cannot store more than MAX_VALUE elements");
        return 0;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [q0.b, java.lang.Object] */
    public static b c(byte[] bArr) {
        b bVar = new b(2);
        j6.a aVar = new j6.a(bArr);
        while (aVar.f3310b < aVar.f3309a.length) {
            long e = aVar.e();
            if (e > 0 && e <= 2147483647L) {
                int i10 = (int) e;
                int i11 = i10 >>> 3;
                int i12 = i10 & 7;
                if (i11 == 1 && i12 == 2) {
                    new String(aVar.b(), StandardCharsets.UTF_8);
                    bVar.c = true;
                } else if (i11 == 2 && i12 == 0) {
                    bVar.f3268b = (int) aVar.e();
                    bVar.c = true;
                } else if (i11 == 3 && i12 == 2) {
                    byte[] b10 = aVar.b();
                    ?? obj = new Object();
                    obj.f5170h = e0.m.h(new byte[]{-99, 96, -121, 60, 22, 41, -17, 73, -97, 98, -85, 10, 10, 63}, new byte[]{-6, 16, -12, 99, 101, 76, -99, 63});
                    j6.a aVar2 = new j6.a(b10);
                    while (aVar2.f3310b < aVar2.f3309a.length) {
                        long e6 = aVar2.e();
                        if (e6 > 0 && e6 <= 2147483647L) {
                            int i13 = (int) e6;
                            int i14 = i13 >>> 3;
                            int i15 = i13 & 7;
                            if (i14 == 1 && i15 == 0) {
                                obj.f5166a = aVar2.e();
                            } else if (i14 == 2 && i15 == 1) {
                                obj.f5167b = Double.longBitsToDouble(aVar2.d());
                            } else if (i14 == 3 && i15 == 1) {
                                obj.c = Double.longBitsToDouble(aVar2.d());
                            } else if (i14 == 4 && i15 == 1) {
                                obj.d = Double.longBitsToDouble(aVar2.d());
                                obj.f5171i = true;
                            } else if (i14 == 5 && i15 == 5) {
                                obj.e = Float.intBitsToFloat(aVar2.c());
                                obj.f5172j = true;
                            } else if (i14 == 6 && i15 == 5) {
                                obj.f5168f = Float.intBitsToFloat(aVar2.c());
                                obj.f5173k = true;
                            } else if (i14 == 7 && i15 == 5) {
                                obj.f5169g = Float.intBitsToFloat(aVar2.c());
                                obj.f5174l = true;
                            } else if (i14 == 9 && i15 == 2) {
                                obj.f5170h = new String(aVar2.b(), StandardCharsets.UTF_8);
                            } else {
                                aVar2.g(i15);
                            }
                        } else {
                            throw j6.a.a();
                        }
                    }
                    bVar.d = obj;
                    bVar.c = true;
                } else {
                    aVar.g(i12);
                }
            } else {
                throw j6.a.a();
            }
        }
        return bVar;
    }

    public void a(Object obj) {
        obj.getClass();
        int i10 = this.f3268b + 1;
        Object[] objArr = (Object[]) this.d;
        if (objArr.length < i10) {
            this.d = Arrays.copyOf(objArr, b(objArr.length, i10));
            this.c = false;
        } else if (this.c) {
            this.d = (Object[]) objArr.clone();
            this.c = false;
        }
        Object[] objArr2 = (Object[]) this.d;
        int i11 = this.f3268b;
        this.f3268b = i11 + 1;
        objArr2[i11] = obj;
    }

    public String toString() {
        switch (this.f3267a) {
            case 1:
                s t = com.bumptech.glide.c.t(this);
                t.c((n7.c) this.d, "callOptions");
                t.e("previousAttempts", String.valueOf(this.f3268b));
                t.d("isTransparentRetry", this.c);
                return t.toString();
            default:
                return super.toString();
        }
    }

    public b(FloatingActionButton floatingActionButton) {
        this.f3267a = 3;
        this.c = false;
        this.f3268b = 0;
        this.d = floatingActionButton;
    }

    public /* synthetic */ b(int i10) {
        this.f3267a = i10;
    }
}
