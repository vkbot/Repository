package org.apache.commons.io.function;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class d0 implements IORunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4843a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4844b;

    public /* synthetic */ d0(int i10, Object obj) {
        this.f4843a = i10;
        this.f4844b = obj;
    }

    @Override // org.apache.commons.io.function.IORunnable
    public final void run() {
        switch (this.f4843a) {
            case 0:
                UncheckedIOBaseStream.b((Runnable) this.f4844b);
                return;
            default:
                ((IOIterator) this.f4844b).remove();
                return;
        }
    }
}
