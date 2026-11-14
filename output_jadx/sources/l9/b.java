package l9;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.List;
import java.util.logging.Logger;
import kotlin.UByte;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final j f3559a = new j();

    public static final z a(e0 e0Var) {
        e0Var.getClass();
        return new z(e0Var);
    }

    public static final a0 b(g0 g0Var) {
        g0Var.getClass();
        return new a0(g0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [l9.g0, java.lang.Object, l9.l] */
    /* JADX WARN: Type inference failed for: r4v9, types: [l9.g0, java.lang.Object, l9.l] */
    public static void c(long j10, l lVar, int i10, List list, int i11, int i12, List list2) {
        int i13;
        int i14;
        List list3;
        long j11;
        int i15;
        int i16 = i10;
        List list4 = list;
        List list5 = list2;
        if (i11 < i12) {
            for (int i17 = i11; i17 < i12; i17++) {
                if (((o) list4.get(i17)).c() < i16) {
                    j1.i.k("Failed requirement.");
                    return;
                }
            }
            o oVar = (o) list.get(i11);
            o oVar2 = (o) list4.get(i12 - 1);
            if (i16 == oVar.c()) {
                int intValue = ((Number) list5.get(i11)).intValue();
                int i18 = i11 + 1;
                o oVar3 = (o) list4.get(i18);
                i13 = i18;
                i14 = intValue;
                oVar = oVar3;
            } else {
                i13 = i11;
                i14 = -1;
            }
            if (oVar.f(i16) != oVar2.f(i16)) {
                int i19 = 1;
                for (int i20 = i13 + 1; i20 < i12; i20++) {
                    if (((o) list4.get(i20 - 1)).f(i16) != ((o) list4.get(i20)).f(i16)) {
                        i19++;
                    }
                }
                long j12 = 4;
                long j13 = (lVar.c / j12) + j10 + 2 + (i19 * 2);
                lVar.p0(i19);
                lVar.p0(i14);
                for (int i21 = i13; i21 < i12; i21++) {
                    byte f8 = ((o) list4.get(i21)).f(i16);
                    if (i21 == i13 || f8 != ((o) list4.get(i21 - 1)).f(i16)) {
                        lVar.p0(f8 & UByte.MAX_VALUE);
                    }
                }
                ?? obj = new Object();
                int i22 = i13;
                while (i22 < i12) {
                    byte f10 = ((o) list4.get(i22)).f(i16);
                    int i23 = i22 + 1;
                    int i24 = i23;
                    while (true) {
                        if (i24 < i12) {
                            if (f10 != ((o) list4.get(i24)).f(i16)) {
                                break;
                            } else {
                                i24++;
                            }
                        } else {
                            i24 = i12;
                            break;
                        }
                    }
                    if (i23 == i24 && i16 + 1 == ((o) list4.get(i22)).c()) {
                        lVar.p0(((Number) list5.get(i22)).intValue());
                        list3 = list5;
                        j11 = j13;
                        i15 = i24;
                    } else {
                        lVar.p0(((int) ((obj.c / j12) + j13)) * (-1));
                        list3 = list5;
                        j11 = j13;
                        i15 = i24;
                        c(j11, obj, i16 + 1, list, i22, i15, list3);
                        list4 = list;
                    }
                    j13 = j11;
                    i22 = i15;
                    list5 = list3;
                }
                lVar.G(obj);
                return;
            }
            int min = Math.min(oVar.c(), oVar2.c());
            int i25 = 0;
            for (int i26 = i16; i26 < min && oVar.f(i26) == oVar2.f(i26); i26++) {
                i25++;
            }
            long j14 = 4;
            long j15 = (lVar.c / j14) + j10 + 2 + i25 + 1;
            lVar.p0(-i25);
            lVar.p0(i14);
            int i27 = i16 + i25;
            while (i16 < i27) {
                lVar.p0(oVar.f(i16) & UByte.MAX_VALUE);
                i16++;
            }
            if (i13 + 1 == i12) {
                if (i27 == ((o) list4.get(i13)).c()) {
                    lVar.p0(((Number) list5.get(i13)).intValue());
                    return;
                } else {
                    j1.i.l("Check failed.");
                    return;
                }
            }
            ?? obj2 = new Object();
            lVar.p0(((int) ((obj2.c / j14) + j15)) * (-1));
            c(j15, obj2, i27, list4, i13, i12, list5);
            lVar.G(obj2);
            return;
        }
        j1.i.k("Failed requirement.");
    }

    public static final void d(long j10, long j11, long j12) {
        if ((j11 | j12) >= 0 && j11 <= j10 && j10 - j11 >= j12) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("size=" + j10 + " offset=" + j11 + " byteCount=" + j12);
    }

    public static final boolean e(AssertionError assertionError) {
        boolean z9;
        Logger logger = v.f3584a;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null) {
                z9 = StringsKt.o(message, "getsockname failed");
            } else {
                z9 = false;
            }
            if (z9) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c0, code lost:
    
        continue;
     */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, l9.l] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l9.w f(l9.o... r11) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.b.f(l9.o[]):l9.w");
    }

    public static final e0 g(Socket socket) {
        Logger logger = v.f3584a;
        socket.getClass();
        f0 f0Var = new f0(socket);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.getClass();
        return f0Var.sink(new x(outputStream, f0Var));
    }

    public static final g0 h(Socket socket) {
        Logger logger = v.f3584a;
        socket.getClass();
        f0 f0Var = new f0(socket);
        InputStream inputStream = socket.getInputStream();
        inputStream.getClass();
        return f0Var.source(new f(inputStream, f0Var));
    }
}
