package org.apache.commons.io.output;

import org.apache.commons.io.function.IORunnable;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements IORunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4919a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UncheckedFilterWriter f4920b;

    public /* synthetic */ f(UncheckedFilterWriter uncheckedFilterWriter, int i10) {
        this.f4919a = i10;
        this.f4920b = uncheckedFilterWriter;
    }

    @Override // org.apache.commons.io.function.IORunnable
    public final void run() {
        switch (this.f4919a) {
            case 0:
                UncheckedFilterWriter.g0(this.f4920b);
                return;
            default:
                UncheckedFilterWriter.V(this.f4920b);
                return;
        }
    }
}
