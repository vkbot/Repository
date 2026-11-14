package u;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import h.j;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a implements j {

    /* renamed from: f, reason: collision with root package name */
    public static final z3.f f5831f = new z3.f(17);

    /* renamed from: g, reason: collision with root package name */
    public static final l.c f5832g = new l.c(1);

    /* renamed from: a, reason: collision with root package name */
    public final Context f5833a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f5834b;
    public final l.d e;
    public final z3.f d = f5831f;
    public final l.c c = f5832g;

    public a(Context context, ArrayList arrayList, k.b bVar, k.g gVar) {
        this.f5833a = context.getApplicationContext();
        this.f5834b = arrayList;
        this.e = new l.d(18, bVar, gVar);
    }

    public static int d(g.b bVar, int i10, int i11) {
        int highestOneBit;
        int min = Math.min(bVar.f2393g / i11, bVar.f2392f / i10);
        if (min == 0) {
            highestOneBit = 0;
        } else {
            highestOneBit = Integer.highestOneBit(min);
        }
        int max = Math.max(1, highestOneBit);
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            StringBuilder v9 = ai.onnxruntime.a.v("Downsampling GIF, sampleSize: ", max, i10, ", target dimens: [", "x");
            v9.append(i11);
            v9.append("], actual dimens: [");
            v9.append(bVar.f2392f);
            v9.append("x");
            v9.append(bVar.f2393g);
            v9.append("]");
            Log.v("BufferGifDecoder", v9.toString());
        }
        return max;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:30:0x0059
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    @Override // h.j
    public final j.d0 a(java.lang.Object r8, int r9, int r10, h.h r11) {
        /*
            r7 = this;
            r2 = r8
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            l.c r8 = r7.c
            monitor-enter(r8)
            java.util.ArrayDeque r0 = r8.f3479a     // Catch: java.lang.Throwable -> L54
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L54
            g.c r0 = (g.c) r0     // Catch: java.lang.Throwable -> L54
            if (r0 != 0) goto L15
            g.c r0 = new g.c     // Catch: java.lang.Throwable -> L17
            r0.<init>()     // Catch: java.lang.Throwable -> L17
        L15:
            r5 = r0
            goto L1b
        L17:
            r0 = move-exception
            r9 = r0
            r1 = r7
            goto L57
        L1b:
            r0 = 0
            r5.f2399b = r0     // Catch: java.lang.Throwable -> L54
            byte[] r0 = r5.f2398a     // Catch: java.lang.Throwable -> L54
            r1 = 0
            java.util.Arrays.fill(r0, r1)     // Catch: java.lang.Throwable -> L54
            g.b r0 = new g.b     // Catch: java.lang.Throwable -> L54
            r0.<init>()     // Catch: java.lang.Throwable -> L54
            r5.c = r0     // Catch: java.lang.Throwable -> L54
            r5.d = r1     // Catch: java.lang.Throwable -> L54
            java.nio.ByteBuffer r0 = r2.asReadOnlyBuffer()     // Catch: java.lang.Throwable -> L54
            r5.f2399b = r0     // Catch: java.lang.Throwable -> L54
            r0.position(r1)     // Catch: java.lang.Throwable -> L54
            java.nio.ByteBuffer r0 = r5.f2399b     // Catch: java.lang.Throwable -> L54
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L54
            r0.order(r1)     // Catch: java.lang.Throwable -> L54
            monitor-exit(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r6 = r11
            s.b r8 = r1.c(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4c
            l.c r9 = r1.c
            r9.a(r5)
            return r8
        L4c:
            r0 = move-exception
            r8 = r0
            l.c r9 = r1.c
            r9.a(r5)
            throw r8
        L54:
            r0 = move-exception
            r1 = r7
        L56:
            r9 = r0
        L57:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L59
            throw r9
        L59:
            r0 = move-exception
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: u.a.a(java.lang.Object, int, int, h.h):j.d0");
    }

    @Override // h.j
    public final boolean b(Object obj, h.h hVar) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (!((Boolean) hVar.c(g.f5862b)).booleanValue() && o4.b.w(this.f5834b, byteBuffer) == ImageHeaderParser$ImageType.GIF) {
            return true;
        }
        return false;
    }

    public final s.b c(ByteBuffer byteBuffer, int i10, int i11, g.c cVar, h.h hVar) {
        StringBuilder sb;
        Bitmap.Config config;
        int i12 = c0.j.f437b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            g.b b10 = cVar.b();
            s.b bVar = null;
            if (b10.c > 0 && b10.f2391b == 0) {
                if (hVar.c(g.f5861a) == h.a.c) {
                    config = Bitmap.Config.RGB_565;
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                int d = d(b10, i10, i11);
                z3.f fVar = this.d;
                l.d dVar = this.e;
                fVar.getClass();
                g.d dVar2 = new g.d(dVar, b10, byteBuffer, d);
                dVar2.c(config);
                dVar2.f2407k = (dVar2.f2407k + 1) % dVar2.f2408l.c;
                Bitmap b11 = dVar2.b();
                if (b11 == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb = new StringBuilder("Decoded GIF from stream in ");
                    }
                    return null;
                }
                bVar = new s.b(new b(new r3.a(new f(com.bumptech.glide.b.a(this.f5833a), dVar2, i10, i11, b11))), 1);
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    sb = new StringBuilder("Decoded GIF from stream in ");
                } else {
                    return bVar;
                }
                sb.append(c0.j.a(elapsedRealtimeNanos));
                Log.v("BufferGifDecoder", sb.toString());
                return bVar;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                sb = new StringBuilder("Decoded GIF from stream in ");
                sb.append(c0.j.a(elapsedRealtimeNanos));
                Log.v("BufferGifDecoder", sb.toString());
                return bVar;
            }
            return null;
        } catch (Throwable th) {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + c0.j.a(elapsedRealtimeNanos));
            }
            throw th;
        }
    }
}
