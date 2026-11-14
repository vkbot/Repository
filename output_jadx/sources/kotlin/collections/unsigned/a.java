package kotlin.collections.unsigned;

import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import l9.i;
import org.apache.commons.net.imap.IMAPSClient;
import y0.d;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ boolean a(int i10) {
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return false;
        }
        if (i10 == 4 || i10 == 5) {
            return true;
        }
        throw null;
    }

    public static int b(CharSequence charSequence, Function1 function1) {
        charSequence.getClass();
        function1.getClass();
        return charSequence.length();
    }

    public static Object c(CharSequence charSequence, int i10, Function1 function1) {
        return function1.invoke(Character.valueOf(charSequence.charAt(i10)));
    }

    public static Object d(byte[] bArr, int i10, Function1 function1) {
        return function1.invoke(UByte.m107boximpl(UByteArray.m171getw2LRezQ(bArr, i10)));
    }

    public static Object e(int[] iArr, int i10, Function1 function1) {
        return function1.invoke(UInt.m184boximpl(UIntArray.m250getpVg5ArA(iArr, i10)));
    }

    public static Iterator f(Sequence sequence, Function1 function1) {
        sequence.getClass();
        function1.getClass();
        return sequence.iterator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void g(d dVar) {
        boolean isTerminated;
        if (dVar instanceof AutoCloseable) {
            dVar.close();
            return;
        }
        if (dVar instanceof ExecutorService) {
            ExecutorService executorService = (ExecutorService) dVar;
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
        i.a();
    }

    public static /* synthetic */ String h(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return "null";
            }
            return "PLAINTEXT";
        }
        return IMAPSClient.DEFAULT_PROTOCOL;
    }

    public static /* synthetic */ String i(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return "null";
            }
            return "OUTBOUND";
        }
        return "INBOUND";
    }

    public static /* synthetic */ String j(int i10) {
        switch (i10) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }
}
