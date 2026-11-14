package e0;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSessionManager;
import android.media.session.PlaybackState;
import android.os.Handler;
import android.os.Looper;
import com.example.navistart.NLService;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class x1 extends MediaController.Callback {

    /* renamed from: q, reason: collision with root package name */
    public static String f2066q;
    public static volatile MediaController r;

    /* renamed from: a, reason: collision with root package name */
    public n0.g f2067a = n0.g.c;

    /* renamed from: b, reason: collision with root package name */
    public String f2068b = "";
    public String c = "";
    public String d = "";
    public Bitmap e = null;

    /* renamed from: f, reason: collision with root package name */
    public Long f2069f = 0L;

    /* renamed from: g, reason: collision with root package name */
    public Long f2070g = 0L;

    /* renamed from: h, reason: collision with root package name */
    public final AudioManager f2071h;

    /* renamed from: i, reason: collision with root package name */
    public final MediaSessionManager f2072i;

    /* renamed from: j, reason: collision with root package name */
    public final ComponentName f2073j;

    /* renamed from: k, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f2074k;

    /* renamed from: l, reason: collision with root package name */
    public final v f2075l;

    /* renamed from: m, reason: collision with root package name */
    public final ScheduledFuture f2076m;

    /* renamed from: n, reason: collision with root package name */
    public final Handler f2077n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f2078o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2079p;

    public x1(Context context) {
        ScheduledThreadPoolExecutor c = w.c(-1, m.h(new byte[]{-20, -48, 10, 54, -35, 114, -118, -27, -50, -11, 11, 48, -58, 66}, new byte[]{-95, -91, 121, 95, -66, 59, -28, -125}));
        this.f2074k = c;
        this.f2075l = w.b(300L, m.h(new byte[]{-80, 72, 1, -127, 45, Base64.padSymbol, -48, 41, -66, 99, 51, -93, 8, 60, -42, 50, -114}, new byte[]{-9, 13, 85, -52, 88, 78, -71, 74}));
        this.f2077n = new Handler(Looper.getMainLooper());
        int i10 = 1;
        this.f2078o = true;
        this.f2079p = false;
        this.f2073j = new ComponentName(context, (Class<?>) NLService.class);
        this.f2071h = (AudioManager) context.getSystemService(m.h(new byte[]{48, 38, 92, -56, 117}, new byte[]{81, 83, 56, -95, 26, -113, -45, -42}));
        this.f2072i = (MediaSessionManager) context.getSystemService(m.h(new byte[]{ByteCompanionObject.MAX_VALUE, 31, -102, -118, -27, 41, 116, 20, 97, 9, -105, -116, -22}, new byte[]{18, 122, -2, -29, -124, 118, 7, 113}));
        e(a());
        ScheduledFuture scheduledFuture = this.f2076m;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.f2076m.cancel(true);
            this.f2076m = null;
        }
        this.f2076m = c.scheduleWithFixedDelay(new v1(this, i10), 0L, 3000L, TimeUnit.MILLISECONDS);
    }

    public static void b(String str, String str2, String str3, Bitmap bitmap) {
        int i10;
        if ("".equals(str) && "".equals(str2) && "".equals(str3)) {
            return;
        }
        h0.b.a();
        h0.b.a();
        h0.b.n().onIfoSend(str, str2, str3, bitmap);
        if (bitmap != null && !bitmap.isRecycled()) {
            i10 = bitmap.getByteCount();
        } else {
            i10 = 0;
        }
        StringBuilder sb = new StringBuilder();
        com.google.protobuf.q.u(new byte[]{9, 115, -80, 69, -78, -36, -124, 11, 43, 60, -29}, new byte[]{68, 6, -61, 44, -47, -107, -22, 109}, sb, str);
        com.google.protobuf.q.u(new byte[]{-44, -101}, new byte[]{-8, -69, -10, -87, 112, -31, 115, Base64.padSymbol}, sb, str2);
        com.google.protobuf.q.u(new byte[]{-41, -113}, new byte[]{-5, -81, 57, 76, -17, 22, 49, -65}, sb, str3);
        sb.append(m.h(new byte[]{70, 14}, new byte[]{106, 46, 65, -116, -13, 13, 15, -7}));
        sb.append(bitmap);
        sb.append(m.h(new byte[]{26, 84}, new byte[]{32, 116, -62, -32, -108, 50, 11, -34}));
        sb.append(i10);
        h0.b.v(sb.toString());
    }

    public static void d(MediaController mediaController) {
        r = mediaController;
        h0.b.a();
        if (mediaController != null) {
            h0.b.o().saveString(m.h(new byte[]{59, -17, 87, -94, -61, 66, 50, 45, 53, -1, 65, -71, -57, 115, 5, 29, 22, -18, 87, -65, -54, 64, 35, 0}, new byte[]{120, -102, 37, -48, -90, 44, 70, 114}), r.getPackageName());
        }
    }

    public final MediaController a() {
        List<MediaController> list;
        int i10 = 1;
        if (r == null) {
            if (!this.f2079p) {
                Object obj = null;
                try {
                    list = this.f2072i.getActiveSessions(this.f2073j);
                } catch (Exception unused) {
                    list = null;
                }
                if (list != null && !list.isEmpty()) {
                    for (MediaController mediaController : list) {
                        if (mediaController.getPackageName().equals(h0.b.o().loadString(m.h(new byte[]{-15, 28, 8, -121, 98, 77, -13, 43, -1, 12, 30, -100, 102, 124, -60, 27, -36, 29, 8, -102, 107, 79, -30, 6}, new byte[]{-78, 105, 122, -11, 7, 35, -121, 116}), ""))) {
                            r = mediaController;
                            this.f2077n.post(new b1.n(this, obj, r, i10));
                            this.f2079p = true;
                        }
                    }
                }
            }
        } else {
            this.f2079p = true;
        }
        return r;
    }

    public final void c(n0.g gVar) {
        this.f2074k.execute(new a4.g(12, gVar));
    }

    public final void e(MediaController mediaController) {
        this.f2077n.post(new a1.a(22, this, mediaController));
    }

    @Override // android.media.session.MediaController.Callback
    public final void onMetadataChanged(MediaMetadata mediaMetadata) {
        super.onMetadataChanged(mediaMetadata);
        this.f2075l.execute(new a1.a(21, this, mediaMetadata));
    }

    @Override // android.media.session.MediaController.Callback
    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        super.onPlaybackStateChanged(playbackState);
        this.f2075l.execute(new a1.a(23, this, playbackState));
    }
}
