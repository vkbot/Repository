package q;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f0 implements h.j {
    public static final h.g d = new h.g("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new k(1));
    public static final h.g e = new h.g("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new k(2));

    /* renamed from: f, reason: collision with root package name */
    public static final c5.e f5126f = new c5.e(17);

    /* renamed from: g, reason: collision with root package name */
    public static final List f5127g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* renamed from: a, reason: collision with root package name */
    public final e0 f5128a;

    /* renamed from: b, reason: collision with root package name */
    public final k.b f5129b;
    public final c5.e c = f5126f;

    public f0(k.b bVar, e0 e0Var) {
        this.f5129b = bVar;
        this.f5128a = e0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h.j
    public final j.d0 a(Object obj, int i10, int i11, h.h hVar) {
        boolean isTerminated;
        boolean isTerminated2;
        TimeUnit timeUnit = TimeUnit.DAYS;
        long longValue = ((Long) hVar.c(d)).longValue();
        if (longValue < 0 && longValue != -1) {
            j1.i.k(ai.onnxruntime.a.h(longValue, "Requested frame must be non-negative, or DEFAULT_FRAME, given: "));
            return null;
        }
        Integer num = (Integer) hVar.c(e);
        if (num == null) {
            num = 2;
        }
        o oVar = (o) hVar.c(o.f5141g);
        if (oVar == null) {
            oVar = o.f5140f;
        }
        o oVar2 = oVar;
        this.c.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        boolean z9 = false;
        try {
            this.f5128a.h(mediaMetadataRetriever, obj);
            Bitmap c = c(obj, mediaMetadataRetriever, longValue, num.intValue(), i10, i11, oVar2);
            if (Build.VERSION.SDK_INT >= 29) {
                if (mediaMetadataRetriever instanceof AutoCloseable) {
                    mediaMetadataRetriever.close();
                } else if (mediaMetadataRetriever instanceof ExecutorService) {
                    ExecutorService executorService = (ExecutorService) mediaMetadataRetriever;
                    if (executorService != ForkJoinPool.commonPool() && !(isTerminated2 = executorService.isTerminated())) {
                        executorService.shutdown();
                        while (!isTerminated2) {
                            try {
                                isTerminated2 = executorService.awaitTermination(1L, timeUnit);
                            } catch (InterruptedException unused) {
                                if (!z9) {
                                    executorService.shutdownNow();
                                    z9 = true;
                                }
                            }
                        }
                        if (z9) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } else {
                    mediaMetadataRetriever.release();
                }
            } else {
                mediaMetadataRetriever.release();
            }
            return e.c(c, this.f5129b);
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 29) {
                if (!(mediaMetadataRetriever instanceof AutoCloseable)) {
                    if (mediaMetadataRetriever instanceof ExecutorService) {
                        ExecutorService executorService2 = (ExecutorService) mediaMetadataRetriever;
                        if (executorService2 != ForkJoinPool.commonPool() && !(isTerminated = executorService2.isTerminated())) {
                            executorService2.shutdown();
                            while (!isTerminated) {
                                try {
                                    isTerminated = executorService2.awaitTermination(1L, timeUnit);
                                } catch (InterruptedException unused2) {
                                    if (!z9) {
                                        executorService2.shutdownNow();
                                        z9 = true;
                                    }
                                }
                            }
                            if (z9) {
                                Thread.currentThread().interrupt();
                            }
                        }
                    } else {
                        mediaMetadataRetriever.release();
                    }
                } else {
                    mediaMetadataRetriever.close();
                }
            } else {
                mediaMetadataRetriever.release();
            }
            throw th;
        }
    }

    @Override // h.j
    public final boolean b(Object obj, h.h hVar) {
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(4:5|6|7|(1:9)(6:10|11|12|(2:14|(1:16)(3:17|18|19))|22|23))|38|(5:45|46|47|(1:53)|51)|(1:59)|60|(3:93|(0)|(1:76)(2:77|78))(4:64|(3:67|(1:69)(1:91)|65)|92|(0)(0))|70|71|72|(3:80|81|(3:83|(1:85)|86))|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        if (r5 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x017c, code lost:
    
        if (android.util.Log.isLoggable("VideoDecoder", 3) != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x017e, code lost:
    
        android.util.Log.d("VideoDecoder", "Exception trying to extract HDR transfer function or rotation");
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x010b, code lost:
    
        if (r0 < 33) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0185 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap c(java.lang.Object r14, android.media.MediaMetadataRetriever r15, long r16, int r18, int r19, int r20, q.o r21) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q.f0.c(java.lang.Object, android.media.MediaMetadataRetriever, long, int, int, int, q.o):android.graphics.Bitmap");
    }
}
