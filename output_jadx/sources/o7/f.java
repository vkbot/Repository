package o7;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f implements r1 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f4479a;

    public f(int i10) {
        switch (i10) {
            case 1:
                this.f4479a = new AtomicLong();
                return;
            default:
                this.f4479a = new AtomicLong();
                return;
        }
    }

    @Override // o7.r1
    public void a() {
        this.f4479a.getAndAdd(1L);
    }
}
