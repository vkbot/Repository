package h8;

import java.util.Iterator;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d0 extends o8.b {

    /* renamed from: b, reason: collision with root package name */
    public Iterator f2652b;
    public volatile boolean c;
    public boolean d;
    public final /* synthetic */ int e;

    /* renamed from: f, reason: collision with root package name */
    public final x7.d f2653f;

    public d0(x7.d dVar, Iterator it, int i10) {
        this.e = i10;
        this.f2652b = it;
        this.f2653f = dVar;
    }

    @Override // n9.b
    public final void cancel() {
        this.c = true;
    }

    @Override // e8.g
    public final void clear() {
        this.f2652b = null;
    }

    @Override // n9.b
    public final void d(long j10) {
        if (o8.f.c(j10) && e3.d.a(this, j10) == 0) {
            if (j10 == Long.MAX_VALUE) {
                switch (this.e) {
                    case 0:
                        Iterator it = this.f2652b;
                        e8.a aVar = (e8.a) this.f2653f;
                        while (!this.c) {
                            try {
                                Object next = it.next();
                                if (!this.c) {
                                    if (next == null) {
                                        aVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                                        return;
                                    }
                                    aVar.g(next);
                                    if (!this.c) {
                                        try {
                                            if (!it.hasNext()) {
                                                if (!this.c) {
                                                    aVar.a();
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            com.bumptech.glide.d.v(th);
                                            aVar.onError(th);
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } catch (Throwable th2) {
                                com.bumptech.glide.d.v(th2);
                                aVar.onError(th2);
                                return;
                            }
                        }
                        return;
                    default:
                        Iterator it2 = this.f2652b;
                        x7.d dVar = this.f2653f;
                        while (!this.c) {
                            try {
                                Object next2 = it2.next();
                                if (!this.c) {
                                    if (next2 == null) {
                                        dVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                                        return;
                                    }
                                    dVar.e(next2);
                                    if (!this.c) {
                                        try {
                                            if (!it2.hasNext()) {
                                                if (!this.c) {
                                                    dVar.a();
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (Throwable th3) {
                                            com.bumptech.glide.d.v(th3);
                                            dVar.onError(th3);
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } catch (Throwable th4) {
                                com.bumptech.glide.d.v(th4);
                                dVar.onError(th4);
                                return;
                            }
                        }
                        return;
                }
            }
            switch (this.e) {
                case 0:
                    Iterator it3 = this.f2652b;
                    e8.a aVar2 = (e8.a) this.f2653f;
                    do {
                        long j11 = 0;
                        while (true) {
                            if (j11 != j10) {
                                if (!this.c) {
                                    try {
                                        Object next3 = it3.next();
                                        if (!this.c) {
                                            if (next3 == null) {
                                                aVar2.onError(new NullPointerException("Iterator.next() returned a null value"));
                                                return;
                                            }
                                            boolean g10 = aVar2.g(next3);
                                            if (!this.c) {
                                                try {
                                                    if (!it3.hasNext()) {
                                                        if (!this.c) {
                                                            aVar2.a();
                                                            return;
                                                        }
                                                        return;
                                                    } else if (g10) {
                                                        j11++;
                                                    }
                                                } catch (Throwable th5) {
                                                    com.bumptech.glide.d.v(th5);
                                                    aVar2.onError(th5);
                                                    return;
                                                }
                                            } else {
                                                return;
                                            }
                                        } else {
                                            return;
                                        }
                                    } catch (Throwable th6) {
                                        com.bumptech.glide.d.v(th6);
                                        aVar2.onError(th6);
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                j10 = get();
                                if (j11 == j10) {
                                    j10 = addAndGet(-j11);
                                }
                            }
                        }
                    } while (j10 != 0);
                    return;
                default:
                    Iterator it4 = this.f2652b;
                    x7.d dVar2 = this.f2653f;
                    do {
                        long j12 = 0;
                        while (true) {
                            if (j12 != j10) {
                                if (!this.c) {
                                    try {
                                        Object next4 = it4.next();
                                        if (!this.c) {
                                            if (next4 == null) {
                                                dVar2.onError(new NullPointerException("Iterator.next() returned a null value"));
                                                return;
                                            }
                                            dVar2.e(next4);
                                            if (!this.c) {
                                                try {
                                                    if (!it4.hasNext()) {
                                                        if (!this.c) {
                                                            dVar2.a();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    j12++;
                                                } catch (Throwable th7) {
                                                    com.bumptech.glide.d.v(th7);
                                                    dVar2.onError(th7);
                                                    return;
                                                }
                                            } else {
                                                return;
                                            }
                                        } else {
                                            return;
                                        }
                                    } catch (Throwable th8) {
                                        com.bumptech.glide.d.v(th8);
                                        dVar2.onError(th8);
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                j10 = get();
                                if (j12 == j10) {
                                    j10 = addAndGet(-j12);
                                }
                            }
                        }
                    } while (j10 != 0);
                    return;
            }
        }
    }

    @Override // e8.c
    public final int h(int i10) {
        return 1;
    }

    @Override // e8.g
    public final boolean isEmpty() {
        Iterator it = this.f2652b;
        if (it != null && it.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // e8.g
    public final Object poll() {
        Iterator it = this.f2652b;
        if (it != null) {
            if (!this.d) {
                this.d = true;
            } else if (!it.hasNext()) {
                return null;
            }
            Object next = this.f2652b.next();
            d8.b.a(next, "Iterator.next() returned a null value");
            return next;
        }
        return null;
    }
}
