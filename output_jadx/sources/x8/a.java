package x8;

import a9.u;
import a9.v;
import a9.w;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import v8.a0;
import v8.u1;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class a implements u1 {

    /* renamed from: b, reason: collision with root package name */
    public Object f6509b = d.f6530p;
    public v8.e c;
    public final /* synthetic */ b d;

    public a(b bVar) {
        this.d = bVar;
    }

    public static final void a(a aVar) {
        v8.e eVar = aVar.c;
        eVar.getClass();
        aVar.c = null;
        aVar.f6509b = d.f6526l;
        Throwable m10 = aVar.d.m();
        if (m10 == null) {
            Result.Companion companion = Result.INSTANCE;
            eVar.resumeWith(Result.m95constructorimpl(Boolean.FALSE));
        } else {
            Result.Companion companion2 = Result.INSTANCE;
            eVar.resumeWith(Result.m95constructorimpl(ResultKt.createFailure(m10)));
        }
    }

    @Override // v8.u1
    public final void b(u uVar, int i10) {
        v8.e eVar = this.c;
        if (eVar != null) {
            eVar.b(uVar, i10);
        }
    }

    public final Object c(ContinuationImpl continuationImpl) {
        k kVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f6512h;
        b bVar = this.d;
        k kVar2 = (k) atomicReferenceFieldUpdater.get(bVar);
        while (!bVar.q(b.c.get(bVar), true)) {
            long andIncrement = b.d.getAndIncrement(bVar);
            long j10 = d.f6519b;
            long j11 = andIncrement / j10;
            int i10 = (int) (andIncrement % j10);
            if (kVar2.d != j11) {
                kVar = bVar.l(j11, kVar2);
                if (kVar == null) {
                    continue;
                }
            } else {
                kVar = kVar2;
            }
            Object z9 = bVar.z(kVar, i10, andIncrement, null);
            w wVar = d.f6527m;
            if (z9 != wVar) {
                w wVar2 = d.f6529o;
                if (z9 == wVar2) {
                    if (andIncrement < bVar.o()) {
                        kVar.a();
                    }
                    kVar2 = kVar;
                } else {
                    if (z9 == d.f6528n) {
                        v8.e b10 = a0.b(IntrinsicsKt.intercepted(continuationImpl));
                        try {
                            this.c = b10;
                            Object z10 = bVar.z(kVar, i10, andIncrement, this);
                            if (z10 == wVar) {
                                b(kVar, i10);
                            } else {
                                if (z10 == wVar2) {
                                    if (andIncrement < bVar.o()) {
                                        kVar.a();
                                    }
                                    k kVar3 = (k) b.f6512h.get(bVar);
                                    while (true) {
                                        if (bVar.q(b.c.get(bVar), true)) {
                                            a(this);
                                            break;
                                        }
                                        long andIncrement2 = b.d.getAndIncrement(bVar);
                                        long j12 = d.f6519b;
                                        long j13 = andIncrement2 / j12;
                                        int i11 = (int) (andIncrement2 % j12);
                                        if (kVar3.d != j13) {
                                            k l10 = bVar.l(j13, kVar3);
                                            if (l10 != null) {
                                                kVar3 = l10;
                                            }
                                        }
                                        Object z11 = bVar.z(kVar3, i11, andIncrement2, this);
                                        if (z11 == d.f6527m) {
                                            b(kVar3, i11);
                                            break;
                                        }
                                        if (z11 == d.f6529o) {
                                            if (andIncrement2 < bVar.o()) {
                                                kVar3.a();
                                            }
                                        } else if (z11 != d.f6528n) {
                                            kVar3.a();
                                            this.f6509b = z11;
                                            this.c = null;
                                        } else {
                                            throw new IllegalStateException("unexpected");
                                        }
                                    }
                                } else {
                                    kVar.a();
                                    this.f6509b = z10;
                                    this.c = null;
                                }
                                b10.d(Boxing.boxBoolean(true), null);
                            }
                            Object q8 = b10.q();
                            if (q8 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                DebugProbesKt.probeCoroutineSuspended(continuationImpl);
                            }
                            return q8;
                        } catch (Throwable th) {
                            b10.x();
                            throw th;
                        }
                    }
                    kVar.a();
                    this.f6509b = z9;
                    return Boxing.boxBoolean(true);
                }
            } else {
                j1.i.l("unreachable");
                return null;
            }
        }
        this.f6509b = d.f6526l;
        Throwable m10 = bVar.m();
        if (m10 == null) {
            return Boxing.boxBoolean(false);
        }
        int i12 = v.f87a;
        throw m10;
    }

    public final Object d() {
        Object obj = this.f6509b;
        w wVar = d.f6530p;
        if (obj != wVar) {
            this.f6509b = wVar;
            if (obj != d.f6526l) {
                return obj;
            }
            Throwable m10 = this.d.m();
            if (m10 == null) {
                m10 = new NoSuchElementException("Channel was closed");
            }
            int i10 = v.f87a;
            throw m10;
        }
        j1.i.l("`hasNext()` has not been invoked");
        return null;
    }
}
