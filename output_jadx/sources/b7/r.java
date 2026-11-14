package b7;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class r extends k {
    public boolean c;

    @Override // b7.k
    public final z5.b b(z5.j jVar) {
        if (this.c) {
            this.c = false;
            return new z5.b(new f6.e(new z5.f(jVar)));
        }
        this.c = true;
        return new z5.b(new f6.e(jVar));
    }
}
