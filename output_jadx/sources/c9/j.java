package c9;

import v8.a0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class j extends h {
    public final Runnable d;

    public j(Runnable runnable, long j10, i iVar) {
        super(j10, iVar);
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.d.run();
        } finally {
            this.c.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.d;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(a0.a(runnable));
        sb.append(", ");
        sb.append(this.f598b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(']');
        return sb.toString();
    }
}
