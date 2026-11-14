package j;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class s implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3054b;
    public final y.f c;
    public final /* synthetic */ v d;

    public /* synthetic */ s(v vVar, y.f fVar, int i10) {
        this.f3054b = i10;
        this.d = vVar;
        this.c = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c cVar;
        switch (this.f3054b) {
            case 0:
                y.f fVar = this.c;
                fVar.f6560b.a();
                synchronized (fVar.c) {
                    synchronized (this.d) {
                        try {
                            if (this.d.f3058b.f3057b.contains(new t(this.c, c0.g.f434b))) {
                                v vVar = this.d;
                                y.f fVar2 = this.c;
                                vVar.getClass();
                                try {
                                    fVar2.f(vVar.r, 5);
                                } finally {
                                }
                            }
                            this.d.b();
                        } finally {
                        }
                    }
                }
                return;
            default:
                y.f fVar3 = this.c;
                fVar3.f6560b.a();
                synchronized (fVar3.c) {
                    synchronized (this.d) {
                        try {
                            if (this.d.f3058b.f3057b.contains(new t(this.c, c0.g.f434b))) {
                                this.d.t.a();
                                v vVar2 = this.d;
                                y.f fVar4 = this.c;
                                vVar2.getClass();
                                try {
                                    fVar4.g(vVar2.t, vVar2.f3069p);
                                    this.d.g(this.c);
                                } finally {
                                }
                            }
                            this.d.b();
                        } finally {
                        }
                    }
                }
                return;
        }
    }
}
