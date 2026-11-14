package org.apache.commons.io.function;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4842b;
    public final /* synthetic */ IORunnable c;

    public /* synthetic */ d(IORunnable iORunnable, int i10) {
        this.f4842b = i10;
        this.c = iORunnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4842b) {
            case 0:
                IOBaseStream.U(this.c);
                return;
            default:
                IORunnable.a(this.c);
                return;
        }
    }
}
