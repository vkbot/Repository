package org.apache.commons.io.monitor;

import java.util.function.Consumer;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Consumer {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4912b;
    public final /* synthetic */ FileAlterationObserver c;

    public /* synthetic */ c(FileAlterationObserver fileAlterationObserver, int i10) {
        this.f4912b = i10;
        this.c = fileAlterationObserver;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f4912b) {
            case 0:
                this.c.fireOnCreate((FileEntry) obj);
                return;
            case 1:
                this.c.lambda$checkAndNotify$0((FileAlterationListener) obj);
                return;
            default:
                this.c.lambda$checkAndNotify$1((FileAlterationListener) obj);
                return;
        }
    }
}
