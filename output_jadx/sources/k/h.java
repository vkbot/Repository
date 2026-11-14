package k;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import c0.p;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h implements b {

    /* renamed from: k, reason: collision with root package name */
    public static final Bitmap.Config f3362k = Bitmap.Config.ARGB_8888;

    /* renamed from: b, reason: collision with root package name */
    public final l f3363b;
    public final Set c;
    public final p2.e d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public long f3364f;

    /* renamed from: g, reason: collision with root package name */
    public int f3365g;

    /* renamed from: h, reason: collision with root package name */
    public int f3366h;

    /* renamed from: i, reason: collision with root package name */
    public int f3367i;

    /* renamed from: j, reason: collision with root package name */
    public int f3368j;

    public h(long j10) {
        Bitmap.Config config;
        l lVar = new l();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        if (Build.VERSION.SDK_INT >= 26) {
            config = Bitmap.Config.HARDWARE;
            hashSet.remove(config);
        }
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.e = j10;
        this.f3363b = lVar;
        this.c = unmodifiableSet;
        this.d = new p2.e(13);
    }

    public final void a() {
        Log.v("LruBitmapPool", "Hits=" + this.f3365g + ", misses=" + this.f3366h + ", puts=" + this.f3367i + ", evictions=" + this.f3368j + ", currentSize=" + this.f3364f + ", maxSize=" + this.e + "\nStrategy=" + this.f3363b);
    }

    @Override // k.b
    public final Bitmap b(int i10, int i11, Bitmap.Config config) {
        Bitmap d = d(i10, i11, config);
        if (d == null) {
            if (config == null) {
                config = f3362k;
            }
            return Bitmap.createBitmap(i10, i11, config);
        }
        return d;
    }

    @Override // k.b
    public final synchronized void c(Bitmap bitmap) {
        try {
            if (bitmap != null) {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable()) {
                        this.f3363b.getClass();
                        if (p.c(bitmap) <= this.e && this.c.contains(bitmap.getConfig())) {
                            this.f3363b.getClass();
                            int c = p.c(bitmap);
                            this.f3363b.e(bitmap);
                            this.d.getClass();
                            this.f3367i++;
                            this.f3364f += c;
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                this.f3363b.getClass();
                                Log.v("LruBitmapPool", "Put bitmap in pool=".concat(l.c(p.c(bitmap), bitmap.getConfig())));
                            }
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                a();
                            }
                            e(this.e);
                            return;
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        StringBuilder sb = new StringBuilder("Reject bitmap from pool, bitmap: ");
                        this.f3363b.getClass();
                        sb.append(l.c(p.c(bitmap), bitmap.getConfig()));
                        sb.append(", is mutable: ");
                        sb.append(bitmap.isMutable());
                        sb.append(", is allowed config: ");
                        sb.append(this.c.contains(bitmap.getConfig()));
                        Log.v("LruBitmapPool", sb.toString());
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            throw new NullPointerException("Bitmap must not be null");
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Bitmap d(int i10, int i11, Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3;
        Bitmap b10;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                config2 = Bitmap.Config.HARDWARE;
                if (config == config2) {
                    throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
                }
            }
            l lVar = this.f3363b;
            if (config != null) {
                config3 = config;
            } else {
                config3 = f3362k;
            }
            b10 = lVar.b(i10, i11, config3);
            if (b10 == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    this.f3363b.getClass();
                    Log.d("LruBitmapPool", "Missing bitmap=".concat(l.c(p.d(config) * i10 * i11, config)));
                }
                this.f3366h++;
            } else {
                this.f3365g++;
                long j10 = this.f3364f;
                this.f3363b.getClass();
                this.f3364f = j10 - p.c(b10);
                this.d.getClass();
                b10.setHasAlpha(true);
                b10.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.f3363b.getClass();
                Log.v("LruBitmapPool", "Get bitmap=".concat(l.c(p.d(config) * i10 * i11, config)));
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return b10;
    }

    public final synchronized void e(long j10) {
        while (this.f3364f > j10) {
            try {
                l lVar = this.f3363b;
                Bitmap bitmap = (Bitmap) lVar.f3376b.s();
                if (bitmap != null) {
                    lVar.a(Integer.valueOf(p.c(bitmap)), bitmap);
                }
                if (bitmap == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        a();
                    }
                    this.f3364f = 0L;
                    return;
                }
                this.d.getClass();
                long j11 = this.f3364f;
                this.f3363b.getClass();
                this.f3364f = j11 - p.c(bitmap);
                this.f3368j++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Evicting bitmap=");
                    this.f3363b.getClass();
                    sb.append(l.c(p.c(bitmap), bitmap.getConfig()));
                    Log.d("LruBitmapPool", sb.toString());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    a();
                }
                bitmap.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // k.b
    public final Bitmap j(int i10, int i11, Bitmap.Config config) {
        Bitmap d = d(i10, i11, config);
        if (d != null) {
            d.eraseColor(0);
            return d;
        }
        if (config == null) {
            config = f3362k;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // k.b
    public final void l(int i10) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i10);
        }
        if (i10 < 40 && i10 < 20) {
            if (i10 < 20 && i10 != 15) {
                return;
            }
            e(this.e / 2);
            return;
        }
        n();
    }

    @Override // k.b
    public final void n() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        e(0L);
    }
}
