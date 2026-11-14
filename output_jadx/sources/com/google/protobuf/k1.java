package com.google.protobuf;

import java.io.IOException;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class k1 {
    public static j1 a(Object obj) {
        y yVar = (y) obj;
        j1 j1Var = yVar.unknownFields;
        if (j1Var == j1.f1583f) {
            j1 j1Var2 = new j1(0, new int[8], new Object[8], true);
            yVar.unknownFields = j1Var2;
            return j1Var2;
        }
        return j1Var;
    }

    public static boolean b(Object obj, c3.i iVar) {
        int i10 = iVar.f522a;
        j jVar = (j) iVar.d;
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 == 4) {
                            return false;
                        }
                        if (i12 == 5) {
                            iVar.z(5);
                            ((j1) obj).c((i11 << 3) | 5, Integer.valueOf(jVar.k()));
                            return true;
                        }
                        throw d0.b();
                    }
                    j1 j1Var = new j1(0, new int[8], new Object[8], true);
                    int i13 = i11 << 3;
                    int i14 = i13 | 4;
                    while (iVar.c() != Integer.MAX_VALUE && b(j1Var, iVar)) {
                    }
                    if (i14 == iVar.f522a) {
                        if (j1Var.e) {
                            j1Var.e = false;
                        }
                        ((j1) obj).c(i13 | 3, j1Var);
                        return true;
                    }
                    throw new IOException("Protocol message end-group tag did not match expected tag.");
                }
                ((j1) obj).c((i11 << 3) | 2, iVar.g());
                return true;
            }
            iVar.z(1);
            ((j1) obj).c((i11 << 3) | 1, Long.valueOf(jVar.l()));
            return true;
        }
        iVar.z(0);
        ((j1) obj).c(i11 << 3, Long.valueOf(jVar.o()));
        return true;
    }
}
