package org.apache.commons.net.ftp;

import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import d2.h;
import java.io.IOException;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import org.apache.commons.net.imap.IMAP;
import r5.b;
import t4.c;
import t4.l;
import t4.p;
import u4.j;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements FTPFileFilter, IMAP.IMAPChunkListener, c, k5.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4936b;

    public /* synthetic */ a(int i10) {
        this.f4936b = i10;
    }

    public static /* synthetic */ void b(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IOException(sb.toString());
    }

    public static /* synthetic */ void c(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void d(Object obj, String str, Object obj2) {
        throw new a8.a(str + obj + obj2, 4);
    }

    @Override // t4.c
    public Object a(h hVar) {
        switch (this.f4936b) {
            case 4:
                return AbtRegistrar.a(hVar);
            case 5:
                Set e = hVar.e(p.a(r5.a.class));
                r5.c cVar = r5.c.d;
                if (cVar == null) {
                    synchronized (r5.c.class) {
                        try {
                            cVar = r5.c.d;
                            if (cVar == null) {
                                cVar = new r5.c(0);
                                r5.c.d = cVar;
                            }
                        } finally {
                        }
                    }
                }
                return new b(e, cVar);
            case 6:
            case 7:
            default:
                return TransportRegistrar.a(hVar);
            case 8:
                return (ScheduledExecutorService) ExecutorsRegistrar.f1526a.get();
            case 9:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 10:
                return (ScheduledExecutorService) ExecutorsRegistrar.f1527b.get();
            case 11:
                l lVar = ExecutorsRegistrar.f1526a;
                return j.f5883b;
            case 12:
                return TransportRegistrar.c(hVar);
            case 13:
                return TransportRegistrar.b(hVar);
        }
    }

    @Override // org.apache.commons.net.ftp.FTPFileFilter
    public boolean accept(FTPFile fTPFile) {
        boolean lambda$static$1;
        switch (this.f4936b) {
            case 0:
                return Objects.nonNull(fTPFile);
            default:
                lambda$static$1 = FTPFileFilters.lambda$static$1(fTPFile);
                return lambda$static$1;
        }
    }

    @Override // org.apache.commons.net.imap.IMAP.IMAPChunkListener
    public boolean chunkReceived(IMAP imap) {
        return IMAP.a(imap);
    }

    @Override // k5.a
    public void e(k5.b bVar) {
    }
}
