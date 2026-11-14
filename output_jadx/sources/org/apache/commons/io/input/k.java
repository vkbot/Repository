package org.apache.commons.io.input;

import java.util.concurrent.ThreadFactory;
import org.apache.commons.io.input.Tailer;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class k implements ThreadFactory {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4894b;

    public /* synthetic */ k(int i10) {
        this.f4894b = i10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f4894b) {
            case 0:
                return ReadAheadInputStream.c(runnable);
            default:
                return Tailer.Builder.b(runnable);
        }
    }
}
