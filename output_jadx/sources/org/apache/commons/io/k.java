package org.apache.commons.io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.List;
import java.util.function.Consumer;
import org.apache.commons.io.monitor.FileAlterationListener;
import org.apache.commons.io.monitor.FileAlterationObserver;
import org.apache.commons.io.monitor.FileEntry;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class k implements Consumer {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4908b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k(int i10, Object obj, Object obj2) {
        this.f4908b = i10;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f4908b) {
            case 0:
                FileUtils.listFiles((File) obj, (List) this.c, true, (FilenameFilter) this.d);
                return;
            default:
                FileAlterationObserver.lambda$fireOnChange$2((FileEntry) this.c, (File) this.d, (FileAlterationListener) obj);
                return;
        }
    }
}
