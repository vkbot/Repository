package org.apache.commons.io.input;

import org.apache.commons.io.function.IORunnable;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class n implements IORunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4898a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UncheckedBufferedReader f4899b;

    public /* synthetic */ n(UncheckedBufferedReader uncheckedBufferedReader, int i10) {
        this.f4898a = i10;
        this.f4899b = uncheckedBufferedReader;
    }

    @Override // org.apache.commons.io.function.IORunnable
    public final void run() {
        switch (this.f4898a) {
            case 0:
                UncheckedBufferedReader.c0(this.f4899b);
                return;
            default:
                UncheckedBufferedReader.V(this.f4899b);
                return;
        }
    }
}
