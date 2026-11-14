package f5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Trace;
import com.google.firebase.FirebaseCommonRegistrar;
import java.io.File;
import java.nio.file.Path;
import java.time.chrono.ChronoZonedDateTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.function.Supplier;
import m0.s0;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.AgeFileFilter;
import org.apache.commons.io.filefilter.EmptyFileFilter;
import org.apache.commons.io.filefilter.HiddenFileFilter;
import org.apache.commons.io.filefilter.SizeFileFilter;
import org.apache.commons.io.function.IOBiConsumer;
import org.apache.commons.io.function.IOBooleanSupplier;
import org.apache.commons.io.function.IOFunction;
import org.apache.commons.io.function.IOQuadFunction;
import org.apache.commons.io.function.IOSupplier;
import org.apache.commons.io.function.IOTriConsumer;
import org.apache.commons.io.function.IOTriFunction;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements b8.a, b8.c, k5.a, j1.u, l2.b, k2.f, IOBooleanSupplier, IOSupplier, IOBiConsumer, IOQuadFunction, IOTriConsumer, IOTriFunction, t4.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2281b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f(s0 s0Var, p0.b bVar, p0.a aVar) {
        this.f2281b = 12;
        this.c = s0Var;
        this.d = aVar;
    }

    @Override // t4.c
    public Object a(d2.h hVar) {
        String valueOf;
        switch (this.f2281b) {
            case 24:
                String str = (String) this.c;
                n0.b bVar = (n0.b) this.d;
                Context context = (Context) hVar.b(Context.class);
                switch (bVar.f4050b) {
                    case 8:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            valueOf = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        }
                        valueOf = "";
                        break;
                    case 9:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 != null) {
                            valueOf = String.valueOf(applicationInfo2.minSdkVersion);
                            break;
                        }
                        valueOf = "";
                        break;
                    case 10:
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            valueOf = "tv";
                            break;
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            valueOf = "watch";
                            break;
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            valueOf = "auto";
                            break;
                        } else {
                            if (Build.VERSION.SDK_INT >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                valueOf = "embedded";
                                break;
                            }
                            valueOf = "";
                            break;
                        }
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName != null) {
                            valueOf = FirebaseCommonRegistrar.a(installerPackageName);
                            break;
                        }
                        valueOf = "";
                        break;
                }
                return new r5.a(str, valueOf);
            default:
                String str2 = (String) this.c;
                t4.a aVar = (t4.a) this.d;
                try {
                    Trace.beginSection(str2);
                    return aVar.f5797f.a(hVar);
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override // org.apache.commons.io.function.IOBiConsumer
    public void accept(Object obj, Object obj2) {
        ((IOBiConsumer) this.c).lambda$andThen$0((IOBiConsumer) this.d, obj, obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5 A[Catch: all -> 0x013c, TryCatch #11 {all -> 0x013c, blocks: (B:37:0x00af, B:39:0x00b5, B:41:0x00c5, B:43:0x00d1), top: B:36:0x00af }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0  */
    /* JADX WARN: Type inference failed for: r8v9, types: [u7.c, java.lang.Object, java.util.concurrent.ConcurrentLinkedQueue] */
    @Override // b8.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object apply(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 1518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.f.apply(java.lang.Object):java.lang.Object");
    }

    @Override // j1.u
    public void c(Context context) {
        j1.o.i((Integer) this.d, (String) this.c);
    }

    @Override // k5.a
    public void e(k5.b bVar) {
        switch (this.f2281b) {
            case 7:
                a0 a0Var = (a0) this.c;
                p2.e eVar = (p2.e) this.d;
                if (a0Var.f2271b != a0.c) {
                    a0 a10 = ((b0) bVar.get()).a(eVar);
                    a0Var.f2271b = a10;
                    synchronized (a0Var) {
                        try {
                            if (!a0Var.f2270a.isEmpty()) {
                                a10.a(a0Var.f2270a);
                                a0Var.f2270a = new HashSet();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
                return;
            default:
                k5.a aVar = (k5.a) this.c;
                k5.a aVar2 = (k5.a) this.d;
                aVar.e(bVar);
                aVar2.e(bVar);
                return;
        }
    }

    @Override // l2.b
    public Object execute() {
        switch (this.f2281b) {
            case 9:
                j2.i iVar = (j2.i) this.c;
                Iterable iterable = (Iterable) this.d;
                k2.h hVar = (k2.h) iVar.c;
                hVar.getClass();
                if (iterable.iterator().hasNext()) {
                    hVar.b().compileStatement("DELETE FROM events WHERE _id in ".concat(k2.h.d0(iterable))).execute();
                    return null;
                }
                return null;
            default:
                j2.i iVar2 = (j2.i) this.c;
                for (Map.Entry entry : ((HashMap) this.d).entrySet()) {
                    ((k2.h) iVar2.f3258i).V(((Integer) entry.getValue()).intValue(), g2.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                return null;
        }
    }

    @Override // org.apache.commons.io.function.IOSupplier
    public Object get() {
        Object lambda$compose$7;
        Object lambda$compose$8;
        switch (this.f2281b) {
            case 14:
                return AgeFileFilter.a((AgeFileFilter) this.c, (Path) this.d);
            case 15:
                return EmptyFileFilter.a((EmptyFileFilter) this.c, (Path) this.d);
            case 16:
                return HiddenFileFilter.a((HiddenFileFilter) this.c, (Path) this.d);
            case 17:
                return SizeFileFilter.a((SizeFileFilter) this.c, (Path) this.d);
            case 18:
            default:
                lambda$compose$8 = ((IOFunction) this.c).lambda$compose$8((Supplier) this.d);
                return lambda$compose$8;
            case 19:
                lambda$compose$7 = ((IOFunction) this.c).lambda$compose$7((IOSupplier) this.d);
                return lambda$compose$7;
        }
    }

    @Override // org.apache.commons.io.function.IOBooleanSupplier
    public boolean getAsBoolean() {
        boolean lambda$isFileNewer$1;
        lambda$isFileNewer$1 = FileUtils.lambda$isFileNewer$1((File) this.c, (ChronoZonedDateTime) this.d);
        return lambda$isFileNewer$1;
    }

    @Override // b8.a
    public void run() {
        switch (this.f2281b) {
            case 0:
                ((g) this.c).d = (y5.i) this.d;
                return;
            default:
                o oVar = (o) this.c;
                y5.c cVar = (y5.c) this.d;
                oVar.getClass();
                oVar.f2307b = x7.e.a(cVar);
                return;
        }
    }

    public /* synthetic */ f(int i10, Object obj, Object obj2) {
        this.f2281b = i10;
        this.c = obj;
        this.d = obj2;
    }

    @Override // org.apache.commons.io.function.IOTriConsumer
    public void accept(Object obj, Object obj2, Object obj3) {
        IOTriConsumer.n((IOTriConsumer) this.c, (IOTriConsumer) this.d, obj, obj2, obj3);
    }

    @Override // org.apache.commons.io.function.IOQuadFunction
    public Object apply(Object obj, Object obj2, Object obj3, Object obj4) {
        return IOQuadFunction.g((IOQuadFunction) this.c, (IOFunction) this.d, obj, obj2, obj3, obj4);
    }

    @Override // org.apache.commons.io.function.IOTriFunction
    public Object apply(Object obj, Object obj2, Object obj3) {
        Object lambda$andThen$0;
        lambda$andThen$0 = ((IOTriFunction) this.c).lambda$andThen$0((IOFunction) this.d, obj, obj2, obj3);
        return lambda$andThen$0;
    }
}
