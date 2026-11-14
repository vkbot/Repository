package org.apache.commons.io;

import java.io.IOException;
import java.util.function.Consumer;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class t implements Consumer {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4929b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ t(Exception exc, int i10) {
        this.f4929b = i10;
        this.c = exc;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Throwable th;
        switch (this.f4929b) {
            case 0:
                th = this.c;
                break;
            default:
                th = (IOException) this.c;
                break;
        }
        th.addSuppressed((Exception) obj);
    }
}
