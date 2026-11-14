package s8;

import c7.l;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p8.c;
import p8.d;
import p8.e;
import p8.f;
import x7.g;
import x7.h;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b extends g implements h {

    /* renamed from: h, reason: collision with root package name */
    public static final Object[] f5733h = new Object[0];

    /* renamed from: i, reason: collision with root package name */
    public static final a[] f5734i = new a[0];

    /* renamed from: j, reason: collision with root package name */
    public static final a[] f5735j = new a[0];

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f5736b;
    public final AtomicReference c;
    public final Lock d;
    public final Lock e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f5737f;

    /* renamed from: g, reason: collision with root package name */
    public long f5738g;

    public b() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.d = reentrantReadWriteLock.readLock();
        this.e = reentrantReadWriteLock.writeLock();
        this.c = new AtomicReference(f5734i);
        this.f5736b = new AtomicReference();
        this.f5737f = new AtomicReference();
    }

    @Override // x7.h
    public final void a() {
        AtomicReference atomicReference;
        c cVar = d.f5114a;
        do {
            atomicReference = this.f5737f;
            if (atomicReference.compareAndSet(null, cVar)) {
                AtomicReference atomicReference2 = this.c;
                a[] aVarArr = f5735j;
                a[] aVarArr2 = (a[]) atomicReference2.getAndSet(aVarArr);
                f fVar = f.f5116b;
                if (aVarArr2 != aVarArr) {
                    Lock lock = this.e;
                    lock.lock();
                    this.f5738g++;
                    this.f5736b.lazySet(fVar);
                    lock.unlock();
                }
                for (a aVar : aVarArr2) {
                    aVar.a(fVar, this.f5738g);
                }
                return;
            }
        } while (atomicReference.get() == null);
    }

    @Override // x7.h
    public final void b(z7.a aVar) {
        if (this.f5737f.get() != null) {
            aVar.dispose();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x7.g
    public final void d(h hVar) {
        boolean z9;
        l lVar;
        Object obj;
        a aVar = new a(hVar, this);
        hVar.b(aVar);
        AtomicReference atomicReference = this.c;
        while (true) {
            a[] aVarArr = (a[]) atomicReference.get();
            if (aVarArr == f5735j) {
                Throwable th = (Throwable) this.f5737f.get();
                if (th == d.f5114a) {
                    hVar.a();
                    return;
                } else {
                    hVar.onError(th);
                    return;
                }
            }
            int length = aVarArr.length;
            a[] aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
            while (!atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                if (atomicReference.get() != aVarArr) {
                    break;
                }
            }
            if (aVar.f5731h) {
                f(aVar);
                return;
            }
            if (!aVar.f5731h) {
                synchronized (aVar) {
                    try {
                        if (aVar.f5731h) {
                            return;
                        }
                        if (aVar.d) {
                            return;
                        }
                        b bVar = aVar.c;
                        Lock lock = bVar.d;
                        lock.lock();
                        aVar.f5732i = bVar.f5738g;
                        Object obj2 = bVar.f5736b.get();
                        lock.unlock();
                        if (obj2 != null) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        aVar.e = z9;
                        aVar.d = true;
                        if (obj2 != null && !aVar.test(obj2)) {
                            while (!aVar.f5731h) {
                                synchronized (aVar) {
                                    try {
                                        lVar = aVar.f5729f;
                                        if (lVar == null) {
                                            aVar.e = false;
                                            return;
                                        }
                                        aVar.f5729f = null;
                                    } finally {
                                    }
                                }
                                for (Object[] objArr = (Object[]) lVar.c; objArr != null; objArr = objArr[4]) {
                                    for (int i10 = 0; i10 < 4 && (obj = objArr[i10]) != null; i10++) {
                                        if (aVar.test(obj)) {
                                            break;
                                        }
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            }
            return;
        }
    }

    @Override // x7.h
    public final void e(Object obj) {
        d8.b.a(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f5737f.get() == null) {
            Lock lock = this.e;
            lock.lock();
            this.f5738g++;
            this.f5736b.lazySet(obj);
            lock.unlock();
            for (a aVar : (a[]) this.c.get()) {
                aVar.a(obj, this.f5738g);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(a aVar) {
        a[] aVarArr;
        while (true) {
            AtomicReference atomicReference = this.c;
            a[] aVarArr2 = (a[]) atomicReference.get();
            int length = aVarArr2.length;
            if (length != 0) {
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        if (aVarArr2[i10] == aVar) {
                            break;
                        } else {
                            i10++;
                        }
                    } else {
                        i10 = -1;
                        break;
                    }
                }
                if (i10 >= 0) {
                    if (length == 1) {
                        aVarArr = f5734i;
                    } else {
                        a[] aVarArr3 = new a[length - 1];
                        System.arraycopy(aVarArr2, 0, aVarArr3, 0, i10);
                        System.arraycopy(aVarArr2, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                        aVarArr = aVarArr3;
                    }
                    while (!atomicReference.compareAndSet(aVarArr2, aVarArr)) {
                        if (atomicReference.get() != aVarArr2) {
                            break;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
    }

    @Override // x7.h
    public final void onError(Throwable th) {
        AtomicReference atomicReference;
        d8.b.a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        do {
            atomicReference = this.f5737f;
            if (atomicReference.compareAndSet(null, th)) {
                e eVar = new e(th);
                AtomicReference atomicReference2 = this.c;
                a[] aVarArr = f5735j;
                a[] aVarArr2 = (a[]) atomicReference2.getAndSet(aVarArr);
                if (aVarArr2 != aVarArr) {
                    Lock lock = this.e;
                    lock.lock();
                    this.f5738g++;
                    this.f5736b.lazySet(eVar);
                    lock.unlock();
                }
                for (a aVar : aVarArr2) {
                    aVar.a(eVar, this.f5738g);
                }
                return;
            }
        } while (atomicReference.get() == null);
        a.a.s(th);
    }
}
