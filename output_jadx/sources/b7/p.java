package b7;

import android.os.Handler;
import android.os.HandlerThread;
import java.io.IOException;
import java.util.Formatter;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class p implements l {

    /* renamed from: f, reason: collision with root package name */
    public static p f418f;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f419a;

    /* renamed from: b, reason: collision with root package name */
    public int f420b;
    public Object c;
    public Object d;
    public Object e;

    public p(p7.n nVar, p7.d dVar) {
        this.f419a = 3;
        this.c = nVar;
        this.d = dVar;
        this.f420b = 65535;
        this.e = new p7.v(this, 0, 65535, null);
    }

    public void a(l.d dVar) {
        z5.o oVar;
        z5.o oVar2;
        boolean z9;
        if (dVar != null) {
            s6.e eVar = (s6.e) dVar;
            s6.a aVar = (s6.a) this.c;
            s6.a[] aVarArr = (s6.a[]) eVar.d;
            for (s6.a aVar2 : aVarArr) {
                if (aVar2 != null) {
                    aVar2.b();
                }
            }
            eVar.T(aVarArr, aVar);
            s6.c cVar = (s6.c) eVar.c;
            boolean z10 = eVar.e;
            if (z10) {
                oVar = cVar.f5717b;
            } else {
                oVar = cVar.d;
            }
            if (z10) {
                oVar2 = cVar.c;
            } else {
                oVar2 = cVar.e;
            }
            int x9 = eVar.x((int) oVar2.f6876b);
            int i10 = -1;
            int i11 = 1;
            int i12 = 0;
            for (int x10 = eVar.x((int) oVar.f6876b); x10 < x9; x10++) {
                s6.a aVar3 = aVarArr[x10];
                if (aVar3 != null) {
                    int i13 = aVar3.f5714f;
                    int i14 = i13 - i10;
                    if (i14 == 0) {
                        i12++;
                    } else {
                        if (i14 == 1) {
                            i11 = Math.max(i11, i12);
                            i10 = aVar3.f5714f;
                        } else if (i14 >= 0 && i13 < aVar.f5714f && i14 <= x10) {
                            if (i11 > 2) {
                                i14 *= i11 - 2;
                            }
                            if (i14 >= x10) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            for (int i15 = 1; i15 <= i14 && !z9; i15++) {
                                if (aVarArr[x10 - i15] != null) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                            }
                            if (z9) {
                                aVarArr[x10] = null;
                            } else {
                                i10 = aVar3.f5714f;
                            }
                        } else {
                            aVarArr[x10] = null;
                        }
                        i12 = 1;
                    }
                }
            }
        }
    }

    public void b() {
        synchronized (this.e) {
            try {
                if (((Handler) this.c) == null) {
                    if (this.f420b > 0) {
                        HandlerThread handlerThread = new HandlerThread("CameraThread");
                        this.d = handlerThread;
                        handlerThread.start();
                        this.c = new Handler(((HandlerThread) this.d).getLooper());
                    } else {
                        throw new IllegalStateException("CameraThread is not open");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(boolean z9, p7.v vVar, l9.l lVar, boolean z10) {
        boolean z11;
        o4.b.i(lVar, "source");
        int min = Math.min(vVar.c, ((p7.v) vVar.f5112g.e).c);
        l9.l lVar2 = vVar.f5109a;
        if (lVar2.c > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i10 = (int) lVar.c;
        if (!z11 && min >= i10) {
            vVar.b(i10, z9, lVar);
        } else {
            if (!z11 && min > 0) {
                vVar.b(min, false, lVar);
            }
            lVar2.write(lVar, (int) lVar.c);
            vVar.f5111f = z9 | vVar.f5111f;
        }
        if (z10) {
            try {
                ((p7.d) this.d).flush();
            } catch (IOException e) {
                n0.b.w(e);
            }
        }
    }

    public void d(Runnable runnable) {
        synchronized (this.e) {
            b();
            ((Handler) this.c).post(runnable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, c9.i] */
    public void e(p7.v vVar, int i10) {
        if (vVar == 0) {
            ((p7.v) this.e).a(i10);
            f();
            return;
        }
        vVar.a(i10);
        ?? obj = new Object();
        vVar.c(Math.min(vVar.c, ((p7.v) vVar.f5112g.e).c), obj);
        if (obj.f599b > 0) {
            try {
                ((p7.d) this.d).flush();
            } catch (IOException e) {
                n0.b.w(e);
            }
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, c9.i] */
    public void f() {
        /*
            r13 = this;
            java.lang.Object r0 = r13.c
            p7.n r0 = (p7.n) r0
            p7.v[] r1 = r0.i()
            java.util.List r2 = java.util.Arrays.asList(r1)
            java.util.Collections.shuffle(r2)
            java.lang.Object r2 = r13.e
            p7.v r2 = (p7.v) r2
            int r2 = r2.c
            int r3 = r1.length
        L16:
            r4 = 0
            if (r3 <= 0) goto L6a
            if (r2 <= 0) goto L6a
            float r5 = (float) r2
            float r6 = (float) r3
            float r5 = r5 / r6
            double r5 = (double) r5
            double r5 = java.lang.Math.ceil(r5)
            int r5 = (int) r5
            r6 = r4
            r7 = r6
        L26:
            if (r7 >= r3) goto L68
            if (r2 <= 0) goto L68
            r8 = r1[r7]
            int r9 = r8.c
            l9.l r10 = r8.f5109a
            long r11 = r10.c
            int r11 = (int) r11
            int r9 = java.lang.Math.min(r9, r11)
            int r9 = java.lang.Math.max(r4, r9)
            int r11 = r8.d
            int r9 = r9 - r11
            int r9 = java.lang.Math.min(r9, r5)
            int r9 = java.lang.Math.min(r2, r9)
            if (r9 <= 0) goto L4e
            int r11 = r8.d
            int r11 = r11 + r9
            r8.d = r11
            int r2 = r2 - r9
        L4e:
            int r9 = r8.c
            long r10 = r10.c
            int r10 = (int) r10
            int r9 = java.lang.Math.min(r9, r10)
            int r9 = java.lang.Math.max(r4, r9)
            int r10 = r8.d
            int r9 = r9 - r10
            if (r9 <= 0) goto L65
            int r9 = r6 + 1
            r1[r6] = r8
            r6 = r9
        L65:
            int r7 = r7 + 1
            goto L26
        L68:
            r3 = r6
            goto L16
        L6a:
            c9.i r1 = new c9.i
            r1.<init>()
            p7.v[] r0 = r0.i()
            int r2 = r0.length
            r3 = r4
        L75:
            if (r3 >= r2) goto L83
            r5 = r0[r3]
            int r6 = r5.d
            r5.c(r6, r1)
            r5.d = r4
            int r3 = r3 + 1
            goto L75
        L83:
            int r0 = r1.f599b
            if (r0 <= 0) goto L93
            java.lang.Object r0 = r13.d     // Catch: java.io.IOException -> L8f
            p7.d r0 = (p7.d) r0     // Catch: java.io.IOException -> L8f
            r0.flush()     // Catch: java.io.IOException -> L8f
            return
        L8f:
            r0 = move-exception
            n0.b.w(r0)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.p.f():void");
    }

    public String toString() {
        switch (this.f419a) {
            case 4:
                int i10 = this.f420b;
                l.d[] dVarArr = (l.d[]) this.d;
                l.d dVar = dVarArr[0];
                if (dVar == null) {
                    dVar = dVarArr[i10 + 1];
                }
                Formatter formatter = new Formatter();
                for (int i11 = 0; i11 < ((s6.a[]) dVar.d).length; i11++) {
                    try {
                        formatter.format("CW %3d:", Integer.valueOf(i11));
                        for (int i12 = 0; i12 < i10 + 2; i12++) {
                            l.d dVar2 = dVarArr[i12];
                            if (dVar2 == null) {
                                formatter.format("    |   ", new Object[0]);
                            } else {
                                s6.a aVar = ((s6.a[]) dVar2.d)[i11];
                                if (aVar == null) {
                                    formatter.format("    |   ", new Object[0]);
                                } else {
                                    formatter.format(" %3d|%3d", Integer.valueOf(aVar.f5714f), Integer.valueOf(aVar.e));
                                }
                            }
                        }
                        formatter.format("%n", new Object[0]);
                    } finally {
                    }
                }
                String formatter2 = formatter.toString();
                formatter.close();
                return formatter2;
            default:
                return super.toString();
        }
    }

    public p() {
        this.f419a = 2;
        this.f420b = 0;
        this.e = new Object();
    }

    public p(s6.a aVar, s6.c cVar) {
        this.f419a = 4;
        this.c = aVar;
        int i10 = aVar.f5713b;
        this.f420b = i10;
        this.e = cVar;
        this.d = new l.d[i10 + 2];
    }

    public /* synthetic */ p(int i10) {
        this.f419a = i10;
    }
}
