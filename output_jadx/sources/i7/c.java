package i7;

import android.content.pm.ResolveInfo;
import java.io.File;
import java.nio.file.Path;
import java.util.function.Predicate;
import m0.k2;
import org.apache.commons.io.ByteOrderMark;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.filefilter.WildcardFilter;
import org.apache.commons.io.input.BOMInputStream;
import org.apache.commons.io.monitor.FileAlterationListener;
import org.apache.commons.io.monitor.FileAlterationObserver;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPFileFilter;
import s1.q0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2783a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2784b;

    public /* synthetic */ c(int i10, Object obj) {
        this.f2783a = i10;
        this.f2784b = obj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i10;
        char c;
        boolean wildcardMatch;
        boolean lambda$accept$2;
        int i11 = this.f2783a;
        Object obj2 = this.f2784b;
        switch (i11) {
            case 0:
                a aVar = (a) obj;
                double d = aVar.f2779a.f2838b;
                x xVar = ((a) obj2).f2779a;
                if (Math.abs(d - xVar.f2838b) < 1.0E-4d && Math.abs(aVar.f2779a.c - xVar.c) < 1.0E-4d) {
                    return true;
                }
                return false;
            case 1:
                e4.o oVar = (e4.o) obj2;
                String str = (String) obj;
                if (str != null && oVar != null && ((a5.h) oVar.c) != null && ((a5.h) oVar.d) != null) {
                    String[] split = str.split(e0.m.h(new byte[]{112}, new byte[]{92, 44, -115, -88, -46, -67, 68, -73}));
                    if (split.length >= 3) {
                        char c10 = 2;
                        try {
                            int parseInt = Integer.parseInt(split[2].trim());
                            if (split.length >= 4) {
                                i10 = Integer.parseInt(split[3].trim());
                            } else {
                                i10 = 50;
                            }
                            if (parseInt == 2) {
                                c = 2;
                            } else {
                                c = 1;
                            }
                            if (oVar.f2149a != 2) {
                                c10 = 1;
                            }
                            if (c == c10 && k2.w(i10) == k2.w(oVar.f2150b) && k2.v(split[0].trim(), split[1].trim(), (String) ((a5.h) oVar.c).d, (String) ((a5.h) oVar.d).d)) {
                                return true;
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
                return false;
            case 2:
                return ((IOFileFilter) obj2).accept((File) obj);
            case 3:
                wildcardMatch = FilenameUtils.wildcardMatch((String) obj2, (String) obj);
                return wildcardMatch;
            case 4:
                lambda$accept$2 = WildcardFilter.lambda$accept$2((Path) obj2, (String) obj);
                return lambda$accept$2;
            case 5:
                return BOMInputStream.b((BOMInputStream) obj2, (ByteOrderMark) obj);
            case 6:
                return ((FileAlterationObserver) obj2).equals((FileAlterationObserver) obj);
            case 7:
                return ((FileAlterationListener) obj2).equals((FileAlterationListener) obj);
            case 8:
                return ((FTPFileFilter) obj2).accept((FTPFile) obj);
            default:
                q0 q0Var = (q0) obj2;
                ResolveInfo resolveInfo = (ResolveInfo) obj;
                if (resolveInfo.activityInfo == null || q0Var.getContext().getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                    return true;
                }
                return false;
        }
    }

    public /* synthetic */ c(int i10, Object obj, Object obj2) {
        this.f2783a = i10;
        this.f2784b = obj2;
    }
}
