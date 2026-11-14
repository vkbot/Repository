package org.apache.commons.io.output;

import org.apache.commons.io.function.IORunnable;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements IORunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4916a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UncheckedFilterOutputStream f4917b;

    public /* synthetic */ d(UncheckedFilterOutputStream uncheckedFilterOutputStream, int i10) {
        this.f4916a = i10;
        this.f4917b = uncheckedFilterOutputStream;
    }

    @Override // org.apache.commons.io.function.IORunnable
    public final void run() {
        switch (this.f4916a) {
            case 0:
                UncheckedFilterOutputStream.V(this.f4917b);
                return;
            default:
                UncheckedFilterOutputStream.b(this.f4917b);
                return;
        }
    }
}
