package ai.onnxruntime;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.ULong;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import l9.i;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ void A(AutoCloseable autoCloseable) {
        boolean isTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (autoCloseable instanceof ExecutorService) {
            ExecutorService executorService = (ExecutorService) autoCloseable;
            if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                executorService.shutdown();
                boolean z9 = false;
                while (!isTerminated) {
                    try {
                        isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                    } catch (InterruptedException unused) {
                        if (!z9) {
                            executorService.shutdownNow();
                            z9 = true;
                        }
                    }
                }
                if (z9) {
                    Thread.currentThread().interrupt();
                    return;
                }
                return;
            }
            return;
        }
        if (autoCloseable instanceof TypedArray) {
            ((TypedArray) autoCloseable).recycle();
            return;
        }
        if (autoCloseable instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) autoCloseable).release();
        } else if (autoCloseable instanceof MediaDrm) {
            ((MediaDrm) autoCloseable).release();
        } else {
            i.a();
        }
    }

    public static void B(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
    }

    public static String C(String str, String str2) {
        return str + str2;
    }

    public static String D(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static double a(double d, double d10, double d11) {
        return (Math.sin(d) * d10) + d11;
    }

    public static float b(float f8, float f10, float f11, float f12) {
        return ((f8 - f10) * f11) + f12;
    }

    public static long c(long j10, long j11) {
        return ULong.m269constructorimpl(ULong.m269constructorimpl(j10) * j11);
    }

    public static Object d(Bundle bundle, String str, String str2) {
        bundle.getClass();
        str.getClass();
        return bundle.get(str2);
    }

    public static String e(int i10, String str) {
        return str + i10;
    }

    public static String f(int i10, String str, String str2) {
        return str + i10 + str2;
    }

    public static String g(int i10, String str, String str2, int i11) {
        return str + i10 + str2 + i11;
    }

    public static String h(long j10, String str) {
        return str + j10;
    }

    public static String i(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.exceptionLabel());
        return sb.toString();
    }

    public static String j(Class cls, String str) {
        return str + cls;
    }

    public static String k(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String l(String str, String str2) {
        return str + str2;
    }

    public static String m(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String n(StringBuilder sb, long j10, String str) {
        sb.append(j10);
        sb.append(str);
        return sb.toString();
    }

    public static String o(StringBuilder sb, String str, int i10) {
        sb.append(i10);
        sb.append(str);
        return sb.toString();
    }

    public static String p(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder q(int i10, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i10);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder r(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5) {
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        charSequence4.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence5);
        return sb;
    }

    public static StringBuilder s(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Function2 function2) {
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        charSequence4.getClass();
        function2.getClass();
        return new StringBuilder();
    }

    public static StringBuilder t(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Function2 function2, CharSequence charSequence4) {
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        function2.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence4);
        return sb;
    }

    public static StringBuilder u(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder v(String str, int i10, int i11, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i10);
        sb.append(str2);
        sb.append(i11);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder w(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder x(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static void y(int i10, int i11, int i12, Canvas canvas) {
        InlineMarker.finallyStart(i10);
        canvas.restoreToCount(i11);
        InlineMarker.finallyEnd(i12);
    }

    public static void z(int i10, int i11, Function1 function1) {
        function1.invoke(Integer.valueOf(i10 + i11));
    }
}
