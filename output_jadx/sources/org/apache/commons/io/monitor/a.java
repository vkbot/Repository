package org.apache.commons.io.monitor;

import java.util.function.Consumer;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Consumer {
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        ((FileAlterationObserver) obj).checkAndNotify();
    }
}
