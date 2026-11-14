package org.apache.commons.io.input;

import org.apache.commons.io.function.IORunnable;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class r implements IORunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4904a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UncheckedFilterReader f4905b;

    public /* synthetic */ r(UncheckedFilterReader uncheckedFilterReader, int i10) {
        this.f4904a = i10;
        this.f4905b = uncheckedFilterReader;
    }

    @Override // org.apache.commons.io.function.IORunnable
    public final void run() {
        switch (this.f4904a) {
            case 0:
                UncheckedFilterReader.c(this.f4905b);
                return;
            default:
                UncheckedFilterReader.b(this.f4905b);
                return;
        }
    }
}
