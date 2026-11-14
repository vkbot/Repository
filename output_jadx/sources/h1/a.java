package h1;

import android.content.Intent;
import android.os.Bundle;
import e0.m;
import e0.v0;
import e0.w;
import i0.b;
import java.util.concurrent.TimeUnit;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a implements b {
    public static boolean c = false;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2549a;

    /* renamed from: b, reason: collision with root package name */
    public String f2550b;

    public a(int i10) {
        this.f2549a = i10;
        switch (i10) {
            case 1:
                this.f2550b = m.h(new byte[]{41, 87, 19, -2, 50, 56, -85, -9, 34, 83, 4, -4, 42, 101, -67, -85, 32, 83, 16, -79, 38, 115, -67, -32, 63, 28, 9, -15, 63, 115, -69, -28, 46, 70, 9, -16, 37}, new byte[]{77, 50, 96, -97, 75, 22, -55, -123});
                return;
            case 2:
                this.f2550b = m.h(new byte[]{6, 104, 81, 85, -32, -45, 56, -90, 13, 108, 70, 87, -8, -114, 46, -6, 15, 108, 82, 26, -12, -104, 46, -79, 16, 35, 75, 90, -19, -104, 40, -75, 1, 121, 75, 91, -9}, new byte[]{98, 13, 34, 52, -103, -3, 90, -44});
                return;
            case 3:
                return;
            case 4:
                this.f2550b = m.h(new byte[]{-32, -78, -118, 76, 98, 122, 5, 119, -2, -76, -118, 66, 98, ByteCompanionObject.MAX_VALUE, 18, 108, -27, -72, -100, 81, 99, 122, 23, 125, -32, -76, -118, 92, 126, 126, 16, 104}, new byte[]{-95, -25, -34, 3, 44, 59, 83, 62});
                return;
            default:
                this.f2550b = m.h(new byte[]{7, -101, 38, 46, 38, -97, -77, -42, 12, -97, 49, 44, 62, -62, -91, -118, 14, -97, 37, 97, 50, -44, -91, -63, 17, -48, 60, 33, 43, -44, -93, -59, 0, -118, 60, 32, 49}, new byte[]{99, -2, 85, 79, 95, -79, -47, -92});
                return;
        }
    }

    @Override // i0.b
    public final void a(Intent intent) {
        switch (this.f2549a) {
            case 0:
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    extras.getInt(m.h(new byte[]{54, 114, -92, 50, 48, -96, 12, -84}, new byte[]{91, 19, -44, 109, 81, -46, 105, -51}));
                    int i10 = extras.getInt(m.h(new byte[]{41, 126, -67, 62, 10, -50, 83, 116, 49, 108}, new byte[]{68, 31, -51, 97, 121, -70, 50, 0}));
                    if (i10 == 1) {
                        h0.b.a();
                        h0.b.c().OpenProPri();
                    }
                    if (i10 == 0 && h0.b.o().loadInt(m.h(new byte[]{-97, 90, -79, 64, 92, 87, 27, 46}, new byte[]{-2, 40, -44, 33, 30, 56, 116, 90}), 1) != 2) {
                        h0.b.a();
                        h0.b.c().OpenProGu();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                String action = intent.getAction();
                if (action != null && action.equals(i0.a.e.name())) {
                    d(1000);
                    return;
                }
                Bundle extras2 = intent.getExtras();
                if (extras2 != null) {
                    int i11 = extras2.getInt(m.h(new byte[]{120, -105, 17, -113, -3, -113, -56, 1}, new byte[]{21, -10, 97, -48, -100, -3, -83, 96}));
                    int i12 = extras2.getInt(m.h(new byte[]{-78, 123, 77, -126, 6, -74, -64, -29, -86, 105}, new byte[]{-33, 26, Base64.padSymbol, -35, 117, -62, -95, -105}));
                    if (!c) {
                        if (i11 == 1) {
                            if (h0.b.o().loadInt(m.h(new byte[]{-17, 60, 89, 8, -24, -51, 85, 105}, new byte[]{-114, 78, 60, 105, -86, -94, 58, 29}), 1) != 1) {
                                h0.b.a();
                                h0.b.c().OpenProPri();
                            }
                        } else if (i11 == 2 && h0.b.o().loadInt(m.h(new byte[]{-116, 41, -32, -19, 124, -46, 82, 37}, new byte[]{-19, 91, -123, -116, 62, -67, Base64.padSymbol, 81}), 1) == 1) {
                            h0.b.a();
                            h0.b.c().OpenProGu();
                        }
                    }
                    if (i12 == 0) {
                        c = true;
                        h0.b.o().saveInt(m.h(new byte[]{-111, -120, -53, -7, 74, -5, -7, 115}, new byte[]{-16, -6, -82, -104, 8, -108, -106, 7}), 2);
                    }
                    if (i12 == 1) {
                        if (c) {
                            d(10000);
                        }
                        c = false;
                        return;
                    }
                    return;
                }
                return;
            case 2:
                String action2 = intent.getAction();
                if (action2 != null && action2.equals(i0.a.e.name())) {
                    boolean loadBoolean = h0.b.o().loadBoolean(m.h(new byte[]{-62, 16, 74, -62, 48, -70, -31, -77, -36, 55, 69, -46, 49, -88, -25, -88}, new byte[]{-79, 103, 21, -127, 69, -55, -107, -36}), false);
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    if (loadBoolean) {
                        w.c(-1, m.h(new byte[]{-127, -54, 30, 85, 0, 49, -55, 51, -87, -63, 6, 100, 81}, new byte[]{-52, -77, 76, 48, 99, 84, -96, 69})).schedule(new v0(20, this), 1000L, timeUnit);
                        return;
                    } else {
                        if (h0.b.o().loadBoolean(m.h(new byte[]{10, 65, 103, 55}, new byte[]{104, 46, 8, 67, -17, -10, -57, 41}), false)) {
                            w.c(-1, m.h(new byte[]{59, 71, -5, 6, -56, -15, 94, -27, 19, 76, -29, 55, -103}, new byte[]{118, 62, -87, 99, -85, -108, 55, -109})).schedule(new v0(21, this), 1000L, timeUnit);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 3:
                intent.getExtras();
                return;
            default:
                intent.getExtras();
                return;
        }
    }

    @Override // i0.b
    public final String b() {
        switch (this.f2549a) {
            case 0:
                return this.f2550b;
            case 1:
                return this.f2550b;
            case 2:
                return this.f2550b;
            case 3:
                return this.f2550b;
            default:
                return this.f2550b;
        }
    }

    @Override // i0.b
    public final i0.a c() {
        switch (this.f2549a) {
            case 0:
                return i0.a.c;
            case 1:
                return i0.a.f2746b;
            case 2:
                return i0.a.f2746b;
            case 3:
                return i0.a.d;
            default:
                return i0.a.c;
        }
    }

    public void d(int i10) {
        boolean loadBoolean = h0.b.o().loadBoolean(m.h(new byte[]{0, -125, 41, -30, 29, -114, 102, -56, 30, -92, 38, -14, 28, -100, 96, -45}, new byte[]{115, -12, 118, -95, 104, -3, 18, -89}), false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (loadBoolean) {
            w.c(-1, m.h(new byte[]{-6, 111, -88, 96, -125, 101, 79, -40, -46, 100, -80}, new byte[]{-73, 22, -6, 5, -32, 0, 38, -82})).schedule(new v0(18, this), i10, timeUnit);
        } else if (h0.b.o().loadBoolean(m.h(new byte[]{6, -54, 14, 72}, new byte[]{100, -91, 97, 60, -56, 10, 24, 112}), false)) {
            w.c(-1, m.h(new byte[]{-56, -47, 53, 21, 101, 54, -21, 33, -32, -38, 45}, new byte[]{-123, -88, 103, 112, 6, 83, -126, 87})).schedule(new v0(19, this), i10, timeUnit);
        }
    }
}
