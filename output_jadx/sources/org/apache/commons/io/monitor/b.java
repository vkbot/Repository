package org.apache.commons.io.monitor;

import java.util.function.Consumer;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Consumer {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4911b;
    public final /* synthetic */ FileEntry c;

    public /* synthetic */ b(FileEntry fileEntry, int i10) {
        this.f4911b = i10;
        this.c = fileEntry;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f4911b) {
            case 0:
                FileAlterationObserver.lambda$fireOnCreate$3(this.c, (FileAlterationListener) obj);
                return;
            default:
                FileAlterationObserver.lambda$fireOnDelete$4(this.c, (FileAlterationListener) obj);
                return;
        }
    }
}
