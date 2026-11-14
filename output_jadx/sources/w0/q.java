package w0;

import android.media.AudioRecord;
import android.os.Debug;
import android.os.Process;
import android.util.Log;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6221b;
    public final /* synthetic */ x c;
    public final /* synthetic */ int d;

    public /* synthetic */ q(x xVar, int i10, int i11) {
        this.f6221b = i11;
        this.c = xVar;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList p9;
        int i10;
        f1 f1Var;
        boolean z9 = true;
        switch (this.f6221b) {
            case 0:
                x xVar = this.c;
                int i11 = this.d;
                if (!xVar.f6284o && i11 == xVar.r) {
                    try {
                        try {
                            Process.setThreadPriority(10);
                            p9 = xVar.p();
                            xVar.Q(p9);
                        } finally {
                            if (i11 == xVar.r) {
                                xVar.f6286q = false;
                            }
                        }
                    } catch (Exception e) {
                        xVar.r().e(e0.m.h(new byte[]{-98, 56, 58, 120, 10}, new byte[]{-5, 74, 72, 23, 120, 97, 23, 100}), e0.m.h(new byte[]{117, 59, -122, 2, -47}, new byte[]{6, 79, -25, 101, -76, -22, 48, 48}), e0.m.h(new byte[]{-84, 114, -16, 22, 96, -78, -3, -7, -65, 97, -31, 7, 109, -81, -1}, new byte[]{-49, 19, -124, 119, 12, -35, -102, -90}), e0.m.h(new byte[]{-109, 93, -127, -71, 65, -117, 115, 62, -101, 86}, new byte[]{-12, 56, -17, -36, 51, -22, 7, 87}), Integer.valueOf(i11), e0.m.h(new byte[]{-55, 124, -35, 8}, new byte[]{-67, 5, -83, 109, 90, 56, -27, 56}), e.getClass().getSimpleName(), e0.m.h(new byte[]{-41, 100, 31, -28, -63, -25, -73}, new byte[]{-70, 1, 108, -105, -96, ByteCompanionObject.MIN_VALUE, -46, -81}), e.getMessage());
                        Log.e(xVar.f6262a, e0.m.h(new byte[]{40, 52, 118, 99, -37, -87, -24, 23, 31, 123, 115, 125, -38, -7, -25, 10, 14, 123, 112, 106, -46, -24, -24, 12, 2, 56, 35, 108, -34, -25, -30, 17, 15, 58, 119, 106, -52}, new byte[]{107, 91, 3, 15, -65, -119, -122, 120}), e);
                        if (i11 == xVar.r) {
                            xVar.f6285p = Collections.EMPTY_LIST;
                        }
                        if (i11 != xVar.r) {
                            return;
                        }
                    }
                    if (!xVar.f6284o && i11 == xVar.r) {
                        xVar.f6285p = Collections.unmodifiableList(p9);
                        g1 r = xVar.r();
                        String h2 = e0.m.h(new byte[]{-31, -66, 44, 47, -47, 22, -41, 77, -16, -70, 57, 42, -60}, new byte[]{-126, -33, 88, 78, -67, 121, -80, 18});
                        String h10 = e0.m.h(new byte[]{-65, -27, -72, 100, 69, 119, -49, -117, -71, -9}, new byte[]{-36, -124, -42, 0, 44, 19, -82, -1});
                        Integer valueOf = Integer.valueOf(p9.size());
                        String h11 = e0.m.h(new byte[]{114, 36, -38, Base64.padSymbol, -42, 107, 44, 101, 122, 47}, new byte[]{21, 65, -76, 88, -92, 10, 88, 12});
                        Integer valueOf2 = Integer.valueOf(i11);
                        String h12 = e0.m.h(new byte[]{-103, -44, 120, 38, -104, 39, -7, 39, -72, -44, 116, 35, -113}, new byte[]{-22, -79, 21, 71, -10, 83, -112, 68});
                        if (xVar.f6288u == null || xVar.f6287s == null) {
                            z9 = false;
                        }
                        r.e(h2, h10, valueOf, h11, valueOf2, h12, Boolean.valueOf(z9));
                        Log.i(xVar.f6262a, e0.m.h(new byte[]{-46, -58, 62, -21, -7, -86, 64, 68, -95, -64, 50, -28, -13, -73, 77, 70, -11, -58, 32, -86, -25, -84, 76, 87, -32, -47, 54, -18, -83, -2}, new byte[]{-127, -93, 83, -118, -105, -34, 41, 39}) + p9.size());
                        if (i11 != xVar.r) {
                            return;
                        }
                        return;
                    }
                    if (i11 != i10) {
                        return;
                    }
                    return;
                }
                return;
            case 1:
                Toast.makeText(this.c.f6282m, this.d, 1).show();
                return;
            case 2:
                x xVar2 = this.c;
                int i12 = this.d;
                Process.setThreadPriority(-16);
                while (i12 == xVar2.f6272g0 && !Thread.currentThread().isInterrupted()) {
                    try {
                        t tVar = (t) xVar2.f6269f.poll(250L, TimeUnit.MILLISECONDS);
                        if (tVar == null) {
                            xVar2.M();
                            xVar2.o();
                        } else {
                            boolean z10 = xVar2.T;
                            long nanoTime = System.nanoTime();
                            long threadCpuTimeNanos = Debug.threadCpuTimeNanos();
                            String S = xVar2.S(tVar.f6231b, tVar.f6230a);
                            xVar2.r().a(z10, tVar.c, System.nanoTime() - nanoTime, xVar2.f6269f.size(), Math.max(0L, Debug.threadCpuTimeNanos() - threadCpuTimeNanos));
                            xVar2.V(S);
                            xVar2.M();
                            xVar2.o();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return;
                    } catch (Exception e6) {
                        xVar2.r().e(e0.m.h(new byte[]{111, -119, 67, -71, 96}, new byte[]{10, -5, 49, -42, 18, 51, -1, -39}), e0.m.h(new byte[]{-95, 110, 66, -101, -35}, new byte[]{-46, 26, 35, -4, -72, 1, 42, -33}), e0.m.h(new byte[]{69, 105, -47, 100, -41, 17, -98, 110, 94, 99, -36}, new byte[]{55, 12, -78, 11, -80, ByteCompanionObject.MAX_VALUE, -9, 26}), e0.m.h(new byte[]{-70, 5, -50, -106}, new byte[]{-50, 124, -66, -13, -72, 91, 107, -10}), e6.getClass().getSimpleName(), e0.m.h(new byte[]{12, -13, 120, 90, -117, 123, 81}, new byte[]{97, -106, 11, 41, -22, 28, 52, 5}), e6.getMessage());
                        Log.e(xVar2.f6262a, e0.m.h(new byte[]{-108, 118, 96, 80, 96, 11, 39, 95, -81, 124, 109, 31, 119, 23, 33, 72, -93, 96, 112, 86, 105, 2, 110, 77, -89, 122, 111, 90, 99}, new byte[]{-58, 19, 3, 63, 7, 101, 78, 43}), e6);
                        if (i12 == xVar2.f6272g0) {
                            xVar2.X();
                            return;
                        }
                        return;
                    }
                }
                return;
            default:
                x xVar3 = this.c;
                int i13 = this.d;
                if (i13 == xVar3.f6272g0) {
                    try {
                        AudioRecord audioRecord = xVar3.f6279k;
                        if (audioRecord != null && audioRecord.getRecordingState() == 3) {
                            AudioRecord audioRecord2 = xVar3.f6279k;
                            byte[] bArr = xVar3.M;
                            int read = audioRecord2.read(bArr, 0, bArr.length, 0);
                            if (read > 0) {
                                if (x.f6259l0 != b.d) {
                                    xVar3.O(b.c);
                                }
                                xVar3.T(read, xVar3.M);
                                t tVar2 = new t(Arrays.copyOf(xVar3.M, read), read);
                                if (!xVar3.f6269f.offer(tVar2)) {
                                    xVar3.f6269f.poll();
                                    xVar3.f6269f.offer(tVar2);
                                    g1 r9 = xVar3.r();
                                    int size = xVar3.f6269f.size();
                                    synchronized (r9) {
                                        try {
                                            if (r9.e == 0) {
                                                f1Var = r9.c;
                                            } else {
                                                f1Var = r9.d;
                                            }
                                            f1Var.f6086g++;
                                            f1Var.f6087h = Math.max(f1Var.f6087h, Math.max(0, size));
                                        } finally {
                                        }
                                    }
                                    Log.w(xVar3.f6262a, e0.m.h(new byte[]{58, -33, 25, 36, -28, -66, 43, -25, 1, -43, 20, 107, -14, -91, 39, -26, 13, -102, 21, Base64.padSymbol, -26, -94, 36, -1, 7, -51, 65, 107, -20, -68, 38, -10, 27, -50, 90, 42, -10, -76, 43, -4, 72, -34, 8, 36, -13, -96, 39, -9}, new byte[]{104, -70, 122, 75, -125, -48, 66, -109}));
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        if (i13 == xVar3.f6272g0) {
                            xVar3.X();
                            return;
                        }
                        return;
                    } catch (Exception e10) {
                        xVar3.r().e(e0.m.h(new byte[]{-124, 72, -112, 69, -39}, new byte[]{-31, 58, -30, 42, -85, 72, 109, 68}), e0.m.h(new byte[]{-122, 96, -28, 64, -106}, new byte[]{-11, 20, -123, 39, -13, -105, 69, 77}), e0.m.h(new byte[]{57, 78, 69, 42, 124, -77, 113, 2, 57, 95}, new byte[]{88, 59, 33, 67, 19, -20, 3, 103}), e0.m.h(new byte[]{9, 117, 94, -6}, new byte[]{125, 12, 46, -97, 22, 66, -16, -50}), e10.getClass().getSimpleName(), e0.m.h(new byte[]{-69, -99, 117, 73, -52, 7, -124}, new byte[]{-42, -8, 6, 58, -83, 96, -31, ByteCompanionObject.MIN_VALUE}), e10.getMessage());
                        Log.e(xVar3.f6262a, e0.m.h(new byte[]{-26, 77, 76, -110, 97, 28, -98, 32, -56, 91, 77, -120, 125, 85, ByteCompanionObject.MIN_VALUE, 53, -121, 94, 73, -110, 98, 89, -118}, new byte[]{-89, 56, 40, -5, 14, 60, -18, 82}), e10);
                        if (i13 == xVar3.f6272g0) {
                            xVar3.X();
                            return;
                        }
                        return;
                    }
                }
                return;
        }
    }
}
