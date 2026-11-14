package h8;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c0 extends o8.b {

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f2648b;
    public int c;
    public volatile boolean d;
    public final /* synthetic */ int e;

    /* renamed from: f, reason: collision with root package name */
    public final x7.d f2649f;

    public c0(x7.d dVar, Object[] objArr, int i10) {
        this.e = i10;
        this.f2648b = objArr;
        this.f2649f = dVar;
    }

    @Override // n9.b
    public final void cancel() {
        this.d = true;
    }

    @Override // e8.g
    public final void clear() {
        this.c = this.f2648b.length;
    }

    @Override // n9.b
    public final void d(long j10) {
        if (o8.f.c(j10) && e3.d.a(this, j10) == 0) {
            if (j10 == Long.MAX_VALUE) {
                switch (this.e) {
                    case 0:
                        Object[] objArr = this.f2648b;
                        int length = objArr.length;
                        e8.a aVar = (e8.a) this.f2649f;
                        int i10 = this.c;
                        while (true) {
                            boolean z9 = this.d;
                            if (i10 != length) {
                                if (!z9) {
                                    Object obj = objArr[i10];
                                    if (obj == null) {
                                        aVar.onError(new NullPointerException("array element is null"));
                                        return;
                                    } else {
                                        aVar.g(obj);
                                        i10++;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                if (!z9) {
                                    aVar.a();
                                    return;
                                }
                                return;
                            }
                        }
                    default:
                        Object[] objArr2 = this.f2648b;
                        int length2 = objArr2.length;
                        x7.d dVar = this.f2649f;
                        int i11 = this.c;
                        while (true) {
                            boolean z10 = this.d;
                            if (i11 != length2) {
                                if (!z10) {
                                    Object obj2 = objArr2[i11];
                                    if (obj2 == null) {
                                        dVar.onError(new NullPointerException("array element is null"));
                                        return;
                                    } else {
                                        dVar.e(obj2);
                                        i11++;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                if (!z10) {
                                    dVar.a();
                                    return;
                                }
                                return;
                            }
                        }
                }
            } else {
                switch (this.e) {
                    case 0:
                        Object[] objArr3 = this.f2648b;
                        int length3 = objArr3.length;
                        int i12 = this.c;
                        e8.a aVar2 = (e8.a) this.f2649f;
                        do {
                            long j11 = 0;
                            while (true) {
                                if (j11 != j10 && i12 != length3) {
                                    if (!this.d) {
                                        Object obj3 = objArr3[i12];
                                        if (obj3 == null) {
                                            aVar2.onError(new NullPointerException("array element is null"));
                                            return;
                                        } else {
                                            if (aVar2.g(obj3)) {
                                                j11++;
                                            }
                                            i12++;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if (i12 == length3) {
                                    if (!this.d) {
                                        aVar2.a();
                                        return;
                                    }
                                    return;
                                } else {
                                    j10 = get();
                                    if (j11 == j10) {
                                        this.c = i12;
                                        j10 = addAndGet(-j11);
                                    }
                                }
                            }
                        } while (j10 != 0);
                        return;
                    default:
                        Object[] objArr4 = this.f2648b;
                        int length4 = objArr4.length;
                        int i13 = this.c;
                        x7.d dVar2 = this.f2649f;
                        do {
                            long j12 = 0;
                            while (true) {
                                if (j12 != j10 && i13 != length4) {
                                    if (!this.d) {
                                        Object obj4 = objArr4[i13];
                                        if (obj4 == null) {
                                            dVar2.onError(new NullPointerException("array element is null"));
                                            return;
                                        } else {
                                            dVar2.e(obj4);
                                            j12++;
                                            i13++;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if (i13 == length4) {
                                    if (!this.d) {
                                        dVar2.a();
                                        return;
                                    }
                                    return;
                                } else {
                                    j10 = get();
                                    if (j12 == j10) {
                                        this.c = i13;
                                        j10 = addAndGet(-j12);
                                    }
                                }
                            }
                        } while (j10 != 0);
                        return;
                }
            }
        }
    }

    @Override // e8.c
    public final int h(int i10) {
        return 1;
    }

    @Override // e8.g
    public final boolean isEmpty() {
        if (this.c == this.f2648b.length) {
            return true;
        }
        return false;
    }

    @Override // e8.g
    public final Object poll() {
        int i10 = this.c;
        Object[] objArr = this.f2648b;
        if (i10 == objArr.length) {
            return null;
        }
        this.c = i10 + 1;
        Object obj = objArr[i10];
        d8.b.a(obj, "array element is null");
        return obj;
    }
}
