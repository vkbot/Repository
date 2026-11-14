package r7;

import b7.p;
import com.bumptech.glide.manager.t;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import l9.a0;
import l9.o;
import n7.e1;
import n7.f1;
import o7.c1;
import o7.d1;
import o7.i1;
import o7.k1;
import o7.o1;
import o7.v;
import o7.x0;
import p7.m;
import p7.n;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final a0 f5434b;
    public final f c;
    public final c d;

    public h(a0 a0Var) {
        this.f5434b = a0Var;
        f fVar = new f(a0Var);
        this.c = fVar;
        this.d = new c(fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [n7.v0, java.lang.Object] */
    public final void S(m mVar, int i10, byte b10, int i11) {
        boolean z9;
        short s5;
        String str;
        f1 f1Var = null;
        boolean z10 = false;
        if (i11 != 0) {
            if ((b10 & 1) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if ((b10 & 8) != 0) {
                s5 = (short) (this.f5434b.readByte() & UByte.MAX_VALUE);
            } else {
                s5 = 0;
            }
            if ((b10 & 32) != 0) {
                a0 a0Var = this.f5434b;
                a0Var.readInt();
                a0Var.readByte();
                i10 -= 5;
            }
            ArrayList y9 = y(j.b(i10, b10, s5), s5, b10, i11);
            l.d dVar = mVar.f5070b;
            if (dVar.z()) {
                ((Logger) dVar.c).log((Level) dVar.d, "INBOUND HEADERS: streamId=" + i11 + " headers=" + y9 + " endStream=" + z9);
            }
            if (mVar.e.K != Integer.MAX_VALUE) {
                long j10 = 0;
                for (int i12 = 0; i12 < y9.size(); i12++) {
                    b bVar = (b) y9.get(i12);
                    j10 += bVar.f5419b.c() + bVar.f5418a.c() + 32;
                }
                int min = (int) Math.min(j10, 2147483647L);
                int i13 = mVar.e.K;
                if (min > i13) {
                    f1 f1Var2 = f1.f4198j;
                    Locale locale = Locale.US;
                    if (z9) {
                        str = "trailer";
                    } else {
                        str = "header";
                    }
                    f1Var = f1Var2.h("Response " + str + " metadata larger than " + i13 + ": " + min);
                }
            }
            synchronized (mVar.e.f5078k) {
                try {
                    p7.k kVar = (p7.k) mVar.e.f5081n.get(Integer.valueOf(i11));
                    if (kVar == null) {
                        if (mVar.e.l(i11)) {
                            mVar.e.f5076i.S(i11, a.STREAM_CLOSED);
                        } else {
                            z10 = true;
                        }
                    } else if (f1Var == null) {
                        w7.c cVar = kVar.f5066m.I;
                        w7.b.f6413a.getClass();
                        kVar.f5066m.o(y9, z9);
                    } else {
                        if (!z9) {
                            mVar.e.f5076i.S(i11, a.CANCEL);
                        }
                        kVar.f5066m.g(f1Var, v.f4733b, false, new Object());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z10) {
                n.e(mVar.e, "Received header for unknown stream: " + i11);
                return;
            }
            return;
        }
        j.c("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        throw null;
    }

    public final void V(m mVar, int i10, byte b10, int i11) {
        short s5 = 0;
        if (i11 != 0) {
            if ((b10 & 8) != 0) {
                s5 = (short) (this.f5434b.readByte() & UByte.MAX_VALUE);
            }
            int readInt = this.f5434b.readInt() & Integer.MAX_VALUE;
            ArrayList y9 = y(j.b(i10 - 4, b10, s5), s5, b10, i11);
            l.d dVar = mVar.f5070b;
            if (dVar.z()) {
                ((Logger) dVar.c).log((Level) dVar.d, "INBOUND PUSH_PROMISE: streamId=" + i11 + " promisedStreamId=" + readInt + " headers=" + y9);
            }
            synchronized (mVar.e.f5078k) {
                mVar.e.f5076i.S(i11, a.PROTOCOL_ERROR);
            }
            return;
        }
        j.c("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        throw null;
    }

    public final boolean b(m mVar) {
        boolean z9;
        d1 d1Var;
        a aVar;
        x0 x0Var;
        f1 f1Var;
        p7.v vVar;
        int i10 = 0;
        try {
            this.f5434b.Y(9L);
            int a10 = j.a(this.f5434b);
            if (a10 >= 0 && a10 <= 16384) {
                byte readByte = (byte) (this.f5434b.readByte() & UByte.MAX_VALUE);
                byte readByte2 = (byte) (this.f5434b.readByte() & UByte.MAX_VALUE);
                int readInt = this.f5434b.readInt() & Integer.MAX_VALUE;
                Logger logger = j.f5437a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(g.a(true, readInt, a10, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        c(mVar, a10, readByte2, readInt);
                        return true;
                    case 1:
                        S(mVar, a10, readByte2, readInt);
                        return true;
                    case 2:
                        if (a10 == 5) {
                            if (readInt != 0) {
                                a0 a0Var = this.f5434b;
                                a0Var.readInt();
                                a0Var.readByte();
                                return true;
                            }
                            j.c("TYPE_PRIORITY streamId == 0", new Object[0]);
                            throw null;
                        }
                        j.c("TYPE_PRIORITY length: %d != 5", Integer.valueOf(a10));
                        throw null;
                    case 3:
                        c0(mVar, a10, readInt);
                        return true;
                    case 4:
                        d0(mVar, a10, readByte2, readInt);
                        return true;
                    case 5:
                        V(mVar, a10, readByte2, readInt);
                        return true;
                    case 6:
                        z9 = true;
                        if (a10 == 8) {
                            if (readInt == 0) {
                                int readInt2 = this.f5434b.readInt();
                                int readInt3 = this.f5434b.readInt();
                                if ((readByte2 & 1) != 0) {
                                    i10 = 1;
                                }
                                long j10 = (readInt2 << 32) | (readInt3 & 4294967295L);
                                mVar.f5070b.D(1, j10);
                                Object obj = mVar.e.f5078k;
                                if (i10 == 0) {
                                    synchronized (obj) {
                                        mVar.e.f5076i.y(true, readInt2, readInt3);
                                    }
                                } else {
                                    synchronized (obj) {
                                        try {
                                            n nVar = mVar.e;
                                            d1Var = nVar.f5088x;
                                            if (d1Var != null) {
                                                long j11 = d1Var.f4454a;
                                                if (j11 == j10) {
                                                    nVar.f5088x = null;
                                                } else {
                                                    Logger logger2 = n.Q;
                                                    Level level = Level.WARNING;
                                                    Locale locale = Locale.US;
                                                    logger2.log(level, "Received unexpected ping ack. Expecting " + j11 + ", got " + j10);
                                                }
                                            } else {
                                                n.Q.warning("Received unexpected ping ack. No ping outstanding");
                                            }
                                            d1Var = null;
                                        } finally {
                                        }
                                    }
                                    if (d1Var != null) {
                                        synchronized (d1Var) {
                                            try {
                                                if (!d1Var.d) {
                                                    d1Var.d = true;
                                                    long a11 = d1Var.f4455b.a();
                                                    d1Var.f4456f = a11;
                                                    LinkedHashMap linkedHashMap = d1Var.c;
                                                    d1Var.c = null;
                                                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                                                        try {
                                                            ((Executor) entry.getValue()).execute(new c1((o1) entry.getKey(), a11));
                                                        } catch (Throwable th) {
                                                            d1.f4453g.log(Level.SEVERE, "Failed to execute PingCallback", th);
                                                        }
                                                    }
                                                }
                                            } finally {
                                            }
                                        }
                                    }
                                }
                                return z9;
                            }
                            j.c("TYPE_PING streamId != 0", new Object[0]);
                            throw null;
                        }
                        j.c("TYPE_PING length != 8: %s", Integer.valueOf(a10));
                        throw null;
                    case 7:
                        a0 a0Var2 = this.f5434b;
                        if (a10 >= 8) {
                            if (readInt == 0) {
                                int readInt4 = a0Var2.readInt();
                                int readInt5 = a0Var2.readInt();
                                int i11 = a10 - 8;
                                a[] values = a.values();
                                int length = values.length;
                                while (true) {
                                    if (i10 < length) {
                                        aVar = values[i10];
                                        if (aVar.f5414b != readInt5) {
                                            i10++;
                                        }
                                    } else {
                                        aVar = null;
                                    }
                                }
                                if (aVar != null) {
                                    o oVar = o.e;
                                    if (i11 > 0) {
                                        oVar = a0Var2.f(i11);
                                    }
                                    n nVar2 = mVar.e;
                                    mVar.f5070b.C(1, readInt4, aVar, oVar);
                                    if (aVar == a.ENHANCE_YOUR_CALM) {
                                        String l10 = oVar.l();
                                        n.Q.log(Level.WARNING, mVar + ": Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: " + l10);
                                        if ("too_many_pings".equals(l10)) {
                                            nVar2.J.run();
                                        }
                                    }
                                    long j12 = aVar.f5414b;
                                    x0[] x0VarArr = x0.e;
                                    if (j12 < x0VarArr.length && j12 >= 0) {
                                        x0Var = x0VarArr[(int) j12];
                                    } else {
                                        x0Var = null;
                                    }
                                    if (x0Var == null) {
                                        f1Var = f1.d(x0.d.c.f4204a.f4189b).h("Unrecognized HTTP/2 error code: " + j12);
                                    } else {
                                        f1Var = x0Var.c;
                                    }
                                    f1 b10 = f1Var.b("Received Goaway");
                                    if (oVar.c() > 0) {
                                        b10 = b10.b(oVar.l());
                                    }
                                    Map map = n.P;
                                    nVar2.r(readInt4, null, b10);
                                    return true;
                                }
                                j.c("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt5));
                                throw null;
                            }
                            j.c("TYPE_GOAWAY streamId != 0", new Object[0]);
                            throw null;
                        }
                        j.c("TYPE_GOAWAY length < 8: %s", Integer.valueOf(a10));
                        throw null;
                    case 8:
                        if (a10 == 4) {
                            long readInt6 = this.f5434b.readInt() & 2147483647L;
                            if (readInt6 != 0) {
                                mVar.f5070b.G(readInt6, 1, readInt);
                                n nVar3 = mVar.e;
                                if (readInt6 == 0) {
                                    if (readInt == 0) {
                                        n.e(nVar3, "Received 0 flow control window increment.");
                                        return true;
                                    }
                                    nVar3.h(readInt, f1.f4200l.h("Received 0 flow control window increment."), v.f4733b, false, a.PROTOCOL_ERROR, null);
                                    return true;
                                }
                                z9 = true;
                                synchronized (nVar3.f5078k) {
                                    n nVar4 = mVar.e;
                                    try {
                                        if (readInt == 0) {
                                            nVar4.f5077j.e(null, (int) readInt6);
                                            return true;
                                        }
                                        p7.k kVar = (p7.k) nVar4.f5081n.get(Integer.valueOf(readInt));
                                        n nVar5 = mVar.e;
                                        if (kVar != null) {
                                            p pVar = nVar5.f5077j;
                                            p7.j jVar = kVar.f5066m;
                                            synchronized (jVar.w) {
                                                vVar = jVar.J;
                                            }
                                            pVar.e(vVar, (int) readInt6);
                                        } else if (!nVar5.l(readInt)) {
                                            i10 = 1;
                                        }
                                        if (i10 != 0) {
                                            n.e(mVar.e, "Received window_update for unknown stream: " + readInt);
                                            return true;
                                        }
                                        return z9;
                                    } finally {
                                    }
                                }
                            }
                            j.c("windowSizeIncrement was 0", new Object[0]);
                            throw null;
                        }
                        j.c("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(a10));
                        throw null;
                    default:
                        this.f5434b.skip(a10);
                        return true;
                }
            }
            j.c("FRAME_SIZE_ERROR: %s", Integer.valueOf(a10));
            throw null;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, l9.l] */
    public final void c(m mVar, int i10, byte b10, int i11) {
        boolean z9;
        short s5;
        p7.k kVar;
        if ((b10 & 1) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if ((b10 & 32) == 0) {
            if ((b10 & 8) != 0) {
                s5 = (short) (this.f5434b.readByte() & UByte.MAX_VALUE);
            } else {
                s5 = 0;
            }
            int b11 = j.b(i10, b10, s5);
            a0 a0Var = this.f5434b;
            mVar.f5070b.B(1, i11, a0Var.c, b11, z9);
            n nVar = mVar.e;
            synchronized (nVar.f5078k) {
                kVar = (p7.k) nVar.f5081n.get(Integer.valueOf(i11));
            }
            if (kVar == null) {
                boolean l10 = mVar.e.l(i11);
                n nVar2 = mVar.e;
                if (l10) {
                    synchronized (nVar2.f5078k) {
                        mVar.e.f5076i.S(i11, a.STREAM_CLOSED);
                    }
                    a0Var.skip(b11);
                } else {
                    n.e(nVar2, "Received data for unknown stream: " + i11);
                    this.f5434b.skip(s5);
                    return;
                }
            } else {
                long j10 = b11;
                a0Var.Y(j10);
                ?? obj = new Object();
                obj.write(a0Var.c, j10);
                w7.c cVar = kVar.f5066m.I;
                w7.b.f6413a.getClass();
                synchronized (mVar.e.f5078k) {
                    kVar.f5066m.n(i10 - b11, z9, obj);
                }
            }
            n nVar3 = mVar.e;
            int i12 = nVar3.f5085s + i10;
            nVar3.f5085s = i12;
            if (i12 >= nVar3.f5073f * 0.5f) {
                synchronized (nVar3.f5078k) {
                    mVar.e.f5076i.V(0, r11.f5085s);
                }
                mVar.e.f5085s = 0;
            }
            this.f5434b.skip(s5);
            return;
        }
        j.c("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        throw null;
    }

    public final void c0(m mVar, int i10, int i11) {
        a aVar;
        v vVar;
        if (i10 == 4) {
            if (i11 != 0) {
                int readInt = this.f5434b.readInt();
                a[] values = a.values();
                int length = values.length;
                int i12 = 0;
                while (true) {
                    if (i12 < length) {
                        aVar = values[i12];
                        if (aVar.f5414b == readInt) {
                            break;
                        } else {
                            i12++;
                        }
                    } else {
                        aVar = null;
                        break;
                    }
                }
                if (aVar != null) {
                    boolean z9 = true;
                    mVar.f5070b.E(1, i11, aVar);
                    f1 b10 = n.v(aVar).b("Rst Stream");
                    e1 e1Var = b10.f4204a;
                    if (e1Var != e1.CANCELLED && e1Var != e1.DEADLINE_EXCEEDED) {
                        z9 = false;
                    }
                    synchronized (mVar.e.f5078k) {
                        try {
                            p7.k kVar = (p7.k) mVar.e.f5081n.get(Integer.valueOf(i11));
                            if (kVar != null) {
                                w7.c cVar = kVar.f5066m.I;
                                w7.b.f6413a.getClass();
                                n nVar = mVar.e;
                                if (aVar == a.REFUSED_STREAM) {
                                    vVar = v.c;
                                } else {
                                    vVar = v.f4733b;
                                }
                                nVar.h(i11, b10, vVar, z9, null, null);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
                j.c("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
                throw null;
            }
            j.c("TYPE_RST_STREAM streamId == 0", new Object[0]);
            throw null;
        }
        j.c("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i10));
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5434b.close();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x002f. Please report as an issue. */
    public final void d0(m mVar, int i10, byte b10, int i11) {
        boolean z9;
        int i12;
        int readInt;
        if (i11 == 0) {
            if ((b10 & 1) != 0) {
                if (i10 != 0) {
                    j.c("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                    throw null;
                }
                return;
            }
            if (i10 % 6 == 0) {
                j.i iVar = new j.i(4);
                int i13 = 0;
                while (true) {
                    short s5 = 4;
                    if (i13 < i10) {
                        short readShort = this.f5434b.readShort();
                        readInt = this.f5434b.readInt();
                        switch (readShort) {
                            case 1:
                            case 6:
                                s5 = readShort;
                                iVar.c(s5, readInt);
                                i13 += 6;
                            case 2:
                                if (readInt != 0 && readInt != 1) {
                                    j.c("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                    throw null;
                                }
                                s5 = readShort;
                                iVar.c(s5, readInt);
                                i13 += 6;
                            case 3:
                                iVar.c(s5, readInt);
                                i13 += 6;
                            case 4:
                                if (readInt >= 0) {
                                    s5 = 7;
                                    iVar.c(s5, readInt);
                                    i13 += 6;
                                } else {
                                    j.c("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                    throw null;
                                }
                            case 5:
                                if (readInt < 16384 || readInt > 16777215) {
                                }
                                s5 = readShort;
                                iVar.c(s5, readInt);
                                i13 += 6;
                                break;
                            default:
                                i13 += 6;
                        }
                    } else {
                        mVar.f5070b.F(1, iVar);
                        synchronized (mVar.e.f5078k) {
                            try {
                                if (iVar.b(4)) {
                                    mVar.e.C = ((int[]) iVar.c)[4];
                                }
                                if (iVar.b(7)) {
                                    int i14 = ((int[]) iVar.c)[7];
                                    p pVar = mVar.e.f5077j;
                                    if (i14 >= 0) {
                                        int i15 = i14 - pVar.f420b;
                                        pVar.f420b = i14;
                                        z9 = false;
                                        for (p7.v vVar : ((n) pVar.c).i()) {
                                            vVar.a(i15);
                                        }
                                        if (i15 > 0) {
                                            z9 = true;
                                        }
                                    } else {
                                        pVar.getClass();
                                        j1.i.k(ai.onnxruntime.a.e(i14, "Invalid initial window size: "));
                                        z9 = false;
                                    }
                                } else {
                                    z9 = false;
                                }
                                if (mVar.d) {
                                    n nVar = mVar.e;
                                    t tVar = nVar.f5075h;
                                    n7.b bVar = nVar.f5086u;
                                    Iterator it = ((k1) tVar.e).f4583j.iterator();
                                    if (!it.hasNext()) {
                                        nVar.f5086u = bVar;
                                        t tVar2 = mVar.e.f5075h;
                                        k1 k1Var = (k1) tVar2.e;
                                        k1Var.f4582i.m(2, "READY");
                                        k1Var.f4584k.execute(new i1(tVar2, 0));
                                        mVar.d = false;
                                    } else {
                                        it.next().getClass();
                                        throw new ClassCastException();
                                    }
                                }
                                p7.d dVar = mVar.e.f5076i;
                                l.d dVar2 = dVar.d;
                                if (dVar2.z()) {
                                    ((Logger) dVar2.c).log((Level) dVar2.d, "OUTBOUND".concat(" SETTINGS: ack=true"));
                                }
                                try {
                                    dVar.c.b(iVar);
                                } catch (IOException e) {
                                    dVar.f5030b.n(e);
                                }
                                if (z9) {
                                    mVar.e.f5077j.f();
                                }
                                mVar.e.s();
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        int i16 = iVar.f3015b;
                        int i17 = -1;
                        if ((i16 & 2) != 0) {
                            i12 = ((int[]) iVar.c)[1];
                        } else {
                            i12 = -1;
                        }
                        if (i12 >= 0) {
                            c cVar = this.d;
                            if ((i16 & 2) != 0) {
                                i17 = ((int[]) iVar.c)[1];
                            }
                            cVar.c = i17;
                            cVar.d = i17;
                            int i18 = cVar.f5424h;
                            if (i17 < i18) {
                                if (i17 == 0) {
                                    Arrays.fill(cVar.e, (Object) null);
                                    cVar.f5422f = cVar.e.length - 1;
                                    cVar.f5423g = 0;
                                    cVar.f5424h = 0;
                                    return;
                                }
                                cVar.a(i18 - i17);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                j.c("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                throw null;
            }
            j.c("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i10));
            throw null;
        }
        j.c("TYPE_SETTINGS streamId != 0", new Object[0]);
        throw null;
    }

    public final ArrayList y(int i10, short s5, byte b10, int i11) {
        f fVar = this.c;
        fVar.f5430f = i10;
        fVar.c = i10;
        fVar.f5431g = s5;
        fVar.d = b10;
        fVar.e = i11;
        c cVar = this.d;
        a0 a0Var = cVar.f5421b;
        ArrayList arrayList = cVar.f5420a;
        while (!a0Var.k()) {
            byte readByte = a0Var.readByte();
            int i12 = readByte & UByte.MAX_VALUE;
            if (i12 != 128) {
                if ((readByte & ByteCompanionObject.MIN_VALUE) == 128) {
                    int e = cVar.e(i12, 127);
                    int i13 = e - 1;
                    if (i13 >= 0) {
                        b[] bVarArr = e.f5428b;
                        if (i13 <= bVarArr.length - 1) {
                            arrayList.add(bVarArr[i13]);
                        }
                    }
                    int length = cVar.f5422f + 1 + (i13 - e.f5428b.length);
                    if (length >= 0) {
                        b[] bVarArr2 = cVar.e;
                        if (length <= bVarArr2.length - 1) {
                            arrayList.add(bVarArr2[length]);
                        }
                    }
                    n0.b.A(ai.onnxruntime.a.e(e, "Header index too large "));
                    return null;
                }
                if (i12 == 64) {
                    o d = cVar.d();
                    e.a(d);
                    cVar.c(new b(d, cVar.d()));
                } else if ((readByte & 64) == 64) {
                    cVar.c(new b(cVar.b(cVar.e(i12, 63) - 1), cVar.d()));
                } else if ((readByte & 32) == 32) {
                    int e6 = cVar.e(i12, 31);
                    cVar.d = e6;
                    if (e6 >= 0 && e6 <= cVar.c) {
                        int i14 = cVar.f5424h;
                        if (e6 < i14) {
                            if (e6 == 0) {
                                Arrays.fill(cVar.e, (Object) null);
                                cVar.f5422f = cVar.e.length - 1;
                                cVar.f5423g = 0;
                                cVar.f5424h = 0;
                            } else {
                                cVar.a(i14 - e6);
                            }
                        }
                    } else {
                        n0.b.y(cVar.d, "Invalid dynamic table size update ");
                        return null;
                    }
                } else if (i12 != 16 && i12 != 0) {
                    arrayList.add(new b(cVar.b(cVar.e(i12, 15) - 1), cVar.d()));
                } else {
                    o d10 = cVar.d();
                    e.a(d10);
                    arrayList.add(new b(d10, cVar.d()));
                }
            } else {
                n0.b.A("index == 0");
                return null;
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        return arrayList2;
    }
}
