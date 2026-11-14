package org.apache.commons.io.filefilter;

import com.example.navistart.SuperWidgets.WidgetBuilderFragment;
import java.util.function.Consumer;
import org.apache.commons.io.monitor.FileAlterationMonitor;
import org.apache.commons.io.monitor.FileAlterationObserver;
import org.apache.commons.net.io.CopyStreamEvent;
import org.apache.commons.net.io.CopyStreamListener;
import x0.m;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Consumer {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4831b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(int i10, Object obj) {
        this.f4831b = i10;
        this.c = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f4831b) {
            case 0:
                ((AndFileFilter) this.c).addFileFilter((IOFileFilter) obj);
                return;
            case 1:
                ((OrFileFilter) this.c).addFileFilter((IOFileFilter) obj);
                return;
            case 2:
                ((FileAlterationMonitor) this.c).addObserver((FileAlterationObserver) obj);
                return;
            case 3:
                ((CopyStreamListener) obj).bytesTransferred((CopyStreamEvent) this.c);
                return;
            default:
                ((WidgetBuilderFragment) this.c).lambda$preview$31((m) obj);
                return;
        }
    }
}
