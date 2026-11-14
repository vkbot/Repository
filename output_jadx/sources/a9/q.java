package a9;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import kotlin.sequences.SequencesKt;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final w8.c f85a;

    static {
        String str;
        int i10 = x.f89a;
        Object obj = null;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        try {
            Iterator it = SequencesKt.toList(SequencesKt.asSequence(Arrays.asList(new w8.a()).iterator())).iterator();
            if (it.hasNext()) {
                obj = it.next();
                if (it.hasNext()) {
                    ((w8.a) obj).getClass();
                    do {
                        ((w8.a) it.next()).getClass();
                    } while (it.hasNext());
                }
            }
            if (((w8.a) obj) != null) {
                Looper mainLooper = Looper.getMainLooper();
                if (mainLooper != null) {
                    f85a = new w8.c(w8.e.a(mainLooper), false);
                    return;
                } else {
                    j1.i.l("The main looper is not available");
                    return;
                }
            }
            j1.i.l("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
