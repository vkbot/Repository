package q;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: f, reason: collision with root package name */
    public static final h.g f5144f = h.g.a(h.a.d, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* renamed from: g, reason: collision with root package name */
    public static final h.g f5145g = new h.g("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, h.g.e);

    /* renamed from: h, reason: collision with root package name */
    public static final h.g f5146h;

    /* renamed from: i, reason: collision with root package name */
    public static final h.g f5147i;

    /* renamed from: j, reason: collision with root package name */
    public static final p2.e f5148j;

    /* renamed from: k, reason: collision with root package name */
    public static final ArrayDeque f5149k;

    /* renamed from: a, reason: collision with root package name */
    public final k.b f5150a;

    /* renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f5151b;
    public final k.g c;
    public final ArrayList d;
    public final w e = w.a();

    static {
        o oVar = o.f5139b;
        Boolean bool = Boolean.FALSE;
        f5146h = h.g.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f5147i = h.g.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f5148j = new p2.e(16);
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = c0.p.f446a;
        f5149k = new ArrayDeque(0);
    }

    public q(ArrayList arrayList, DisplayMetrics displayMetrics, k.b bVar, k.g gVar) {
        this.d = arrayList;
        c0.g.c(displayMetrics, "Argument must not be null");
        this.f5151b = displayMetrics;
        c0.g.c(bVar, "Argument must not be null");
        this.f5150a = bVar;
        c0.g.c(gVar, "Argument must not be null");
        this.c = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        throw r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap c(a5.h r9, android.graphics.BitmapFactory.Options r10, q.p r11, k.b r12) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r10.inJustDecodeBounds
            if (r1 != 0) goto L22
            r11.d()
            int r1 = r9.f48b
            switch(r1) {
                case 21: goto L22;
                case 22: goto Lf;
                default: goto Le;
            }
        Le:
            goto L22
        Lf:
            java.lang.Object r1 = r9.c
            com.bumptech.glide.load.data.i r1 = (com.bumptech.glide.load.data.i) r1
            java.lang.Object r1 = r1.c
            q.x r1 = (q.x) r1
            monitor-enter(r1)
            byte[] r2 = r1.f5160b     // Catch: java.lang.Throwable -> L1f
            int r2 = r2.length     // Catch: java.lang.Throwable -> L1f
            r1.d = r2     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r1)
            goto L22
        L1f:
            r9 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            throw r9
        L22:
            int r1 = r10.outWidth
            int r2 = r10.outHeight
            java.lang.String r3 = r10.outMimeType
            java.util.concurrent.locks.Lock r4 = q.z.f5164b
            r4.lock()
            android.graphics.Bitmap r9 = r9.e(r10)     // Catch: java.lang.IllegalArgumentException -> L35 java.lang.Throwable -> L7c
            r4.unlock()
            return r9
        L35:
            r4 = move-exception
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L7c
            java.lang.String r6 = "Exception decoding bitmap, outWidth: "
            java.lang.String r7 = ", outHeight: "
            java.lang.String r8 = ", outMimeType: "
            java.lang.StringBuilder r1 = ai.onnxruntime.a.v(r6, r1, r2, r7, r8)     // Catch: java.lang.Throwable -> L7c
            r1.append(r3)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r2 = ", inBitmap: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L7c
            android.graphics.Bitmap r2 = r10.inBitmap     // Catch: java.lang.Throwable -> L7c
            java.lang.String r2 = d(r2)     // Catch: java.lang.Throwable -> L7c
            r1.append(r2)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L7c
            r5.<init>(r1, r4)     // Catch: java.lang.Throwable -> L7c
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L7c
            if (r1 == 0) goto L66
            java.lang.String r1 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r1, r5)     // Catch: java.lang.Throwable -> L7c
        L66:
            android.graphics.Bitmap r0 = r10.inBitmap     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L7b
            r12.c(r0)     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L7c
            r0 = 0
            r10.inBitmap = r0     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L7c
            android.graphics.Bitmap r9 = c(r9, r10, r11, r12)     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L7c
            java.util.concurrent.locks.Lock r10 = q.z.f5164b
            r10.unlock()
            return r9
        L7a:
            throw r5     // Catch: java.lang.Throwable -> L7c
        L7b:
            throw r5     // Catch: java.lang.Throwable -> L7c
        L7c:
            r9 = move-exception
            java.util.concurrent.locks.Lock r10 = q.z.f5164b
            r10.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: q.q.c(a5.h, android.graphics.BitmapFactory$Options, q.p, k.b):android.graphics.Bitmap");
    }

    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static void e(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final e a(a5.h hVar, int i10, int i11, h.h hVar2, p pVar) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        boolean z9;
        byte[] bArr = (byte[]) this.c.c(65536, byte[].class);
        synchronized (q.class) {
            arrayDeque = f5149k;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                e(options);
            }
        }
        options.inTempStorage = bArr;
        h.a aVar = (h.a) hVar2.c(f5144f);
        h.i iVar = (h.i) hVar2.c(f5145g);
        o oVar = (o) hVar2.c(o.f5141g);
        boolean booleanValue = ((Boolean) hVar2.c(f5146h)).booleanValue();
        h.g gVar = f5147i;
        if (hVar2.c(gVar) != null && ((Boolean) hVar2.c(gVar)).booleanValue()) {
            z9 = true;
        } else {
            z9 = false;
        }
        try {
            e c = e.c(b(hVar, options, oVar, aVar, iVar, z9, i10, i11, booleanValue, pVar), this.f5150a);
            e(options);
            synchronized (arrayDeque) {
                arrayDeque.offer(options);
            }
            this.c.g(bArr);
            return c;
        } catch (Throwable th) {
            e(options);
            ArrayDeque arrayDeque2 = f5149k;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options);
                this.c.g(bArr);
                throw th;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x003c. Please report as an issue. */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0157 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0292 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x045b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0482  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap b(a5.h r44, android.graphics.BitmapFactory.Options r45, q.o r46, h.a r47, h.i r48, boolean r49, int r50, int r51, boolean r52, q.p r53) {
        /*
            Method dump skipped, instructions count: 1602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q.q.b(a5.h, android.graphics.BitmapFactory$Options, q.o, h.a, h.i, boolean, int, int, boolean, q.p):android.graphics.Bitmap");
    }
}
