package com.google.protobuf;

import java.io.IOException;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class x implements x0 {

    /* renamed from: b, reason: collision with root package name */
    public static final p f1643b = p.a();

    /* renamed from: a, reason: collision with root package name */
    public final y f1644a;

    public x(y yVar) {
        this.f1644a = yVar;
    }

    public final y a(j jVar, p pVar) {
        y k6 = this.f1644a.k();
        try {
            y0 y0Var = y0.c;
            y0Var.getClass();
            b1 a10 = y0Var.a(k6.getClass());
            c3.i iVar = jVar.c;
            if (iVar == null) {
                iVar = new c3.i(jVar);
            }
            a10.h(k6, iVar, pVar);
            a10.c(k6);
            return k6;
        } catch (d0 e) {
            if (e.f1549b) {
                throw new IOException(e.getMessage(), e);
            }
            throw e;
        } catch (i1 e6) {
            throw new IOException(e6.getMessage());
        } catch (IOException e10) {
            if (e10.getCause() instanceof d0) {
                throw ((d0) e10.getCause());
            }
            throw new IOException(e10.getMessage(), e10);
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof d0) {
                throw ((d0) e11.getCause());
            }
            throw e11;
        }
    }
}
