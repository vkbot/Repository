package m8;

import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f3973a;

    /* renamed from: b, reason: collision with root package name */
    public final c[] f3974b;
    public long c;

    /* JADX WARN: Multi-variable type inference failed */
    public b(int i10, ThreadFactory threadFactory) {
        this.f3973a = i10;
        this.f3974b = new c[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f3974b[i11] = new j(threadFactory);
        }
    }
}
