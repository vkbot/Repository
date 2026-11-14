package o7;

import androidx.core.app.NotificationManagerCompat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f4460a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4461b;
    public final int c;
    public final AtomicInteger d;

    public d4(float f8, float f10) {
        AtomicInteger atomicInteger = new AtomicInteger();
        this.d = atomicInteger;
        this.c = (int) (f10 * 1000.0f);
        int i10 = (int) (f8 * 1000.0f);
        this.f4460a = i10;
        this.f4461b = i10 / 2;
        atomicInteger.set(i10);
    }

    public final boolean a() {
        AtomicInteger atomicInteger;
        int i10;
        int i11;
        do {
            atomicInteger = this.d;
            i10 = atomicInteger.get();
            if (i10 == 0) {
                return false;
            }
            i11 = i10 + NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
        } while (!atomicInteger.compareAndSet(i10, Math.max(i11, 0)));
        if (i11 <= this.f4461b) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4)) {
            return false;
        }
        d4 d4Var = (d4) obj;
        if (this.f4460a == d4Var.f4460a && this.c == d4Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4460a), Integer.valueOf(this.c)});
    }
}
