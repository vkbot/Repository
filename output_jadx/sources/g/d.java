package g;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import k.g;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int[] f2400a;
    public final l.d c;
    public ByteBuffer d;
    public byte[] e;

    /* renamed from: f, reason: collision with root package name */
    public short[] f2402f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f2403g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f2404h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f2405i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f2406j;

    /* renamed from: k, reason: collision with root package name */
    public int f2407k;

    /* renamed from: l, reason: collision with root package name */
    public b f2408l;

    /* renamed from: m, reason: collision with root package name */
    public Bitmap f2409m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f2410n;

    /* renamed from: o, reason: collision with root package name */
    public int f2411o;

    /* renamed from: p, reason: collision with root package name */
    public final int f2412p;

    /* renamed from: q, reason: collision with root package name */
    public final int f2413q;
    public final int r;

    /* renamed from: s, reason: collision with root package name */
    public Boolean f2414s;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f2401b = new int[256];
    public Bitmap.Config t = Bitmap.Config.ARGB_8888;

    public d(l.d dVar, b bVar, ByteBuffer byteBuffer, int i10) {
        byte[] bArr;
        int[] iArr;
        this.c = dVar;
        this.f2408l = new b();
        synchronized (this) {
            try {
                if (i10 > 0) {
                    int highestOneBit = Integer.highestOneBit(i10);
                    int i11 = 0;
                    this.f2411o = 0;
                    this.f2408l = bVar;
                    this.f2407k = -1;
                    ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                    this.d = asReadOnlyBuffer;
                    asReadOnlyBuffer.position(0);
                    this.d.order(ByteOrder.LITTLE_ENDIAN);
                    this.f2410n = false;
                    ArrayList arrayList = bVar.e;
                    int size = arrayList.size();
                    while (true) {
                        if (i11 >= size) {
                            break;
                        }
                        Object obj = arrayList.get(i11);
                        i11++;
                        if (((a) obj).f2385g == 3) {
                            this.f2410n = true;
                            break;
                        }
                    }
                    this.f2412p = highestOneBit;
                    int i12 = bVar.f2392f;
                    this.r = i12 / highestOneBit;
                    int i13 = bVar.f2393g;
                    this.f2413q = i13 / highestOneBit;
                    int i14 = i12 * i13;
                    g gVar = (g) this.c.d;
                    if (gVar == null) {
                        bArr = new byte[i14];
                    } else {
                        bArr = (byte[]) gVar.c(i14, byte[].class);
                    }
                    this.f2405i = bArr;
                    l.d dVar2 = this.c;
                    int i15 = this.r * this.f2413q;
                    g gVar2 = (g) dVar2.d;
                    if (gVar2 == null) {
                        iArr = new int[i15];
                    } else {
                        iArr = (int[]) gVar2.c(i15, int[].class);
                    }
                    this.f2406j = iArr;
                } else {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bitmap a() {
        Bitmap.Config config;
        Boolean bool = this.f2414s;
        if (bool != null && !bool.booleanValue()) {
            config = this.t;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap b10 = ((k.b) this.c.c).b(this.r, this.f2413q, config);
        b10.setHasAlpha(true);
        return b10;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:20:0x005e, B:21:0x0068, B:23:0x0079, B:24:0x0085, B:27:0x008e, B:29:0x0092, B:31:0x009a, B:32:0x00ad, B:36:0x00b1, B:38:0x00b5, B:40:0x00c7, B:42:0x00cb, B:43:0x00cf, B:46:0x008a, B:48:0x00d5, B:50:0x00dd, B:53:0x0017, B:55:0x001f, B:56:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:20:0x005e, B:21:0x0068, B:23:0x0079, B:24:0x0085, B:27:0x008e, B:29:0x0092, B:31:0x009a, B:32:0x00ad, B:36:0x00b1, B:38:0x00b5, B:40:0x00c7, B:42:0x00cb, B:43:0x00cf, B:46:0x008a, B:48:0x00d5, B:50:0x00dd, B:53:0x0017, B:55:0x001f, B:56:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:20:0x005e, B:21:0x0068, B:23:0x0079, B:24:0x0085, B:27:0x008e, B:29:0x0092, B:31:0x009a, B:32:0x00ad, B:36:0x00b1, B:38:0x00b5, B:40:0x00c7, B:42:0x00cb, B:43:0x00cf, B:46:0x008a, B:48:0x00d5, B:50:0x00dd, B:53:0x0017, B:55:0x001f, B:56:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1 A[Catch: all -> 0x0014, TRY_ENTER, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:20:0x005e, B:21:0x0068, B:23:0x0079, B:24:0x0085, B:27:0x008e, B:29:0x0092, B:31:0x009a, B:32:0x00ad, B:36:0x00b1, B:38:0x00b5, B:40:0x00c7, B:42:0x00cb, B:43:0x00cf, B:46:0x008a, B:48:0x00d5, B:50:0x00dd, B:53:0x0017, B:55:0x001f, B:56:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:20:0x005e, B:21:0x0068, B:23:0x0079, B:24:0x0085, B:27:0x008e, B:29:0x0092, B:31:0x009a, B:32:0x00ad, B:36:0x00b1, B:38:0x00b5, B:40:0x00c7, B:42:0x00cb, B:43:0x00cf, B:46:0x008a, B:48:0x00d5, B:50:0x00dd, B:53:0x0017, B:55:0x001f, B:56:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dd A[Catch: all -> 0x0014, TRY_LEAVE, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:20:0x005e, B:21:0x0068, B:23:0x0079, B:24:0x0085, B:27:0x008e, B:29:0x0092, B:31:0x009a, B:32:0x00ad, B:36:0x00b1, B:38:0x00b5, B:40:0x00c7, B:42:0x00cb, B:43:0x00cf, B:46:0x008a, B:48:0x00d5, B:50:0x00dd, B:53:0x0017, B:55:0x001f, B:56:0x003e), top: B:3:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized android.graphics.Bitmap b() {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g.d.b():android.graphics.Bitmap");
    }

    public final void c(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config != config3 && config != (config2 = Bitmap.Config.RGB_565)) {
            throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
        }
        this.t = config;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
    
        if (r5.f2396j == r36.f2386h) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap d(g.a r36, g.a r37) {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g.d.d(g.a, g.a):android.graphics.Bitmap");
    }
}
