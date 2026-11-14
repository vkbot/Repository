package org.apache.commons.io;

import java.io.Closeable;
import java.io.File;
import org.apache.commons.io.function.IOConsumer;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class s implements IOConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4926a;

    public /* synthetic */ s(int i10) {
        this.f4926a = i10;
    }

    @Override // org.apache.commons.io.function.IOConsumer
    public final void accept(Object obj) {
        switch (this.f4926a) {
            case 0:
                FileUtils.forceDeleteOnExit((File) obj);
                return;
            case 1:
                FileUtils.forceDelete((File) obj, false);
                return;
            default:
                IOUtils.close((Closeable) obj);
                return;
        }
    }
}
