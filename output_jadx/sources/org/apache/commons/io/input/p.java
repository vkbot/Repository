package org.apache.commons.io.input;

import org.apache.commons.io.function.IORunnable;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class p implements IORunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4901a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UncheckedFilterInputStream f4902b;

    public /* synthetic */ p(UncheckedFilterInputStream uncheckedFilterInputStream, int i10) {
        this.f4901a = i10;
        this.f4902b = uncheckedFilterInputStream;
    }

    @Override // org.apache.commons.io.function.IORunnable
    public final void run() {
        switch (this.f4901a) {
            case 0:
                UncheckedFilterInputStream.y(this.f4902b);
                return;
            default:
                UncheckedFilterInputStream.c(this.f4902b);
                return;
        }
    }
}
