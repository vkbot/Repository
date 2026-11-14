package w0;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.os.Build;
import androidx.core.content.ContextCompat;
import com.example.navistart.cores.ColorText;
import com.sun.jna.Native;
import e0.p3;
import e0.x1;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.vosk.Model;
import org.vosk.Recognizer;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class g implements y {

    /* renamed from: u, reason: collision with root package name */
    public static b f6088u;

    /* renamed from: v, reason: collision with root package name */
    public static b f6089v;
    public static f w;

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f6090a;

    /* renamed from: b, reason: collision with root package name */
    public ScheduledFuture f6091b;
    public final AudioManager c;
    public AudioFocusRequest d;
    public AudioRecord e;

    /* renamed from: f, reason: collision with root package name */
    public final Model f6092f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f6093g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6094h;

    /* renamed from: i, reason: collision with root package name */
    public final int f6095i;

    /* renamed from: j, reason: collision with root package name */
    public final byte[] f6096j;

    /* renamed from: k, reason: collision with root package name */
    public final byte[] f6097k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f6098l;

    /* renamed from: m, reason: collision with root package name */
    public Recognizer f6099m;

    /* renamed from: n, reason: collision with root package name */
    public Recognizer f6100n;

    /* renamed from: o, reason: collision with root package name */
    public int f6101o;

    /* renamed from: p, reason: collision with root package name */
    public int f6102p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f6103q;
    public String r;

    /* renamed from: s, reason: collision with root package name */
    public long f6104s;
    public long t;

    static {
        b bVar = b.f6065b;
        f6088u = bVar;
        f6089v = bVar;
    }

    public g(Context context) {
        e0.m.h(new byte[]{63, -46, 125, 48, 114, 114, 8, -2, 5, -52, 113, 96}, new byte[]{108, -94, 20, 83, 26, 55, 102, -103});
        this.f6090a = e0.w.c(-1, e0.m.h(new byte[]{-118, -35, 50, 122, 32, 105, 93, -12, -80, -61, 62, 42}, new byte[]{-39, -83, 91, 25, 72, 44, 51, -109}));
        this.f6094h = false;
        this.f6095i = AudioRecord.getMinBufferSize(16000, 16, 2);
        this.f6096j = new byte[8192];
        this.f6097k = new byte[160000];
        this.f6098l = new Object();
        this.f6101o = 0;
        this.f6102p = 0;
        this.f6103q = false;
        this.r = "";
        this.f6104s = 0L;
        this.t = 0L;
        this.f6093g = context;
        System.setProperty(e0.m.h(new byte[]{-43, -37, 80, -120, 10, -71, 121, 43, -52}, new byte[]{-65, -75, 49, -90, 100, -42, 10, 82}), e0.m.h(new byte[]{7, -28, 88, -75}, new byte[]{115, -106, 45, -48, 36, 38, -14, 126}));
        Native.setProtected(true);
        System.setProperty(e0.m.h(new byte[]{119, -43, 54, 94, -64, 104, -50, 88, 51, -41, 62, 18, -48, 102, -45, 85, 51, -53, 54, 4, -54}, new byte[]{29, -69, 87, 112, -94, 7, -95, 44}), context.getApplicationInfo().nativeLibraryDir);
        System.loadLibrary(e0.m.h(new byte[]{-107, 108, -79, 86, 124, 46, -114, 107, -117, 97, -80}, new byte[]{-1, 2, -40, 50, 21, 93, -2, 10}));
        System.loadLibrary(e0.m.h(new byte[]{-96, -23, -91, 100}, new byte[]{-42, -122, -42, 15, 121, 112, -90, -53}));
        try {
            String str = l1.f6174a;
            File filesDir = context.getFilesDir();
            String str2 = l1.f6174a;
            if (l1.e(new File(filesDir, str2)) == null) {
                l1.f(context, k1.e, null);
            }
            File e = l1.e(new File(context.getFilesDir(), str2));
            if (e != null) {
                this.f6092f = new Model(e.getAbsolutePath());
                if (this.c == null) {
                    this.c = (AudioManager) context.getSystemService(e0.m.h(new byte[]{-122, 94, 14, -95, 60}, new byte[]{-25, 43, 106, -56, 83, 30, -19, -36}));
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    f fVar = w;
                    if (fVar != null) {
                        this.c.removeOnModeChangedListener(fVar);
                    }
                    w = new f(this, 0);
                    this.c.addOnModeChangedListener(Executors.newSingleThreadExecutor(), w);
                    return;
                }
                return;
            }
            throw new IOException(e0.m.h(new byte[]{-54, -76, -20, 37, 33, -50, -118, 12, -7, -73, -65, 39, 114, -125, -117, 7, -24, -5, -10, 32, 114, -41, -124, 4, -16, -66, -5}, new byte[]{-100, -37, -97, 78, 1, -93, -27, 104}));
        } catch (Exception unused) {
        }
    }

    public static Boolean f() {
        StringBuilder sb = new StringBuilder();
        u0.a o5 = h0.b.o();
        byte[] bArr = e0.m.f1973j;
        String[] strArr = p3.f2001a;
        com.google.protobuf.q.s(bArr, o5, "", sb);
        com.google.protobuf.q.r(new byte[]{108, 105, 99, 116, 95, 114, 105, 117, 101}, sb);
        String g10 = com.google.protobuf.q.g(sb, x1.f2066q);
        u0.a o9 = h0.b.o();
        byte[] bArr2 = e0.m.f1969f;
        if (com.google.protobuf.q.w(bArr2, o9, "", g10)) {
            boolean z9 = true;
            if (com.google.protobuf.q.d(Long.MAX_VALUE, h0.b.a().j()) >= Long.parseLong(new String(com.google.protobuf.q.x(new byte[]{-3}, new byte[]{-51, -35, 88, -92, -69, -108, 124, -3}, h0.b.o(), com.google.protobuf.q.h(e0.m.f1970g, h0.b.o(), new String(bArr2)), 0)))) {
                z9 = false;
            }
            return Boolean.valueOf(z9);
        }
        return Boolean.FALSE;
    }

    public static boolean g(String str) {
        h0.b.a();
        h0.b.f().getClass();
        String f8 = j0.c.f();
        if (f8 != null && !f8.trim().isEmpty() && str != null && str.toLowerCase().contains(f8.trim().toLowerCase())) {
            return true;
        }
        return false;
    }

    public static boolean h(String str) {
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty() && !trim.equals(e0.m.h(new byte[]{117, -41}, new byte[]{46, -118, 2, -101, 92, 112, -82, 81})) && !trim.equals(e0.m.h(new byte[]{79, 4}, new byte[]{52, 121, 59, -97, 55, 63, 12, -90})) && trim.length() >= 5 && trim.startsWith(e0.m.h(new byte[]{-111}, new byte[]{-54, -99, 53, -101, -119, -29, -83, 76})) && trim.endsWith(e0.m.h(new byte[]{86}, new byte[]{11, -106, 13, -82, 43, -86, -9, -77}))) {
                char[] charArray = trim.toCharArray();
                int length = charArray.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        char c = charArray[i10];
                        if (!Character.isLetterOrDigit(c) && e0.m.h(new byte[]{46, 104, -62, -55, -78}, new byte[]{12, 51, -97, -27, -110, -105, -54, 58}).indexOf(c) == -1) {
                            break;
                        }
                        i10++;
                    } else {
                        try {
                            new JSONArray(trim);
                            return true;
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // w0.y
    public final void a() {
        AudioFocusRequest audioFocusRequest;
        AudioManager audioManager = this.c;
        if (audioManager != null && (audioFocusRequest = this.d) != null && Build.VERSION.SDK_INT >= 26) {
            audioManager.abandonAudioFocusRequest(audioFocusRequest);
        }
        synchronized (this.f6098l) {
            try {
                this.f6103q = false;
                Recognizer recognizer = this.f6099m;
                if (recognizer != null) {
                    recognizer.reset();
                }
                Recognizer recognizer2 = this.f6100n;
                if (recognizer2 != null) {
                    recognizer2.reset();
                }
                this.f6101o = 0;
                this.f6102p = 0;
                this.r = "";
                this.f6104s = 0L;
            } catch (Throwable th) {
                throw th;
            }
        }
        j(f6089v);
    }

    @Override // w0.y
    public final void b() {
        h0.b.w(e0.m.h(new byte[]{47, -24, 112, -80, 18, -89, -126, -49}, new byte[]{92, -100, 31, -64, 68, -56, -15, -92}), ColorText.RED);
        ScheduledFuture scheduledFuture = this.f6091b;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.f6091b.cancel(true);
            this.f6091b = null;
        }
        o();
        j(b.f6065b);
    }

    @Override // w0.y
    public final void c() {
        h0.b.w(e0.m.h(new byte[]{ByteCompanionObject.MIN_VALUE, -122, 22, -125, 53, -127, -79, 15, -104}, new byte[]{-13, -14, 119, -15, 65, -41, -34, 124}), ColorText.RED);
        b();
        this.f6091b = this.f6090a.scheduleWithFixedDelay(new f5.j(20, this), 0L, 30L, TimeUnit.MILLISECONDS);
    }

    @Override // w0.y
    public final void d() {
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest build;
        f6089v = f6088u;
        if (this.d == null && Build.VERSION.SDK_INT >= 26) {
            onAudioFocusChangeListener = d.d().setOnAudioFocusChangeListener(new e(this, 0));
            audioAttributes = onAudioFocusChangeListener.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build());
            build = audioAttributes.build();
            this.d = build;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.c.requestAudioFocus(this.d);
        }
        p();
        j(b.d);
    }

    @Override // w0.y
    public final b e() {
        return f6088u;
    }

    public final synchronized void i(String str) {
        if (f().booleanValue()) {
            ArrayList arrayList = a0.e;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((b0) obj).i(str);
            }
        }
    }

    public final void j(b bVar) {
        if (f().booleanValue()) {
            f6088u = bVar;
            c.f6069a = bVar;
            ArrayList arrayList = a0.e;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((b0) obj).m(bVar);
            }
        }
    }

    public final String k(int i10) {
        Recognizer recognizer;
        String partialResult;
        synchronized (this.f6098l) {
            try {
                l(i10, this.f6096j);
                if (this.f6103q) {
                    recognizer = this.f6100n;
                } else {
                    recognizer = this.f6099m;
                }
                if (recognizer == null) {
                    return null;
                }
                if (recognizer.acceptWaveForm(this.f6096j, i10)) {
                    partialResult = recognizer.getResult();
                } else {
                    partialResult = recognizer.getPartialResult();
                }
                return partialResult;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(int i10, byte[] bArr) {
        if (bArr != null && i10 > 0) {
            int min = Math.min(i10, bArr.length);
            byte[] bArr2 = this.f6097k;
            int max = Math.max(0, min - bArr2.length);
            int i11 = min - max;
            while (i11 > 0) {
                int min2 = Math.min(i11, bArr2.length - this.f6102p);
                System.arraycopy(bArr, max, bArr2, this.f6102p, min2);
                this.f6102p = (this.f6102p + min2) % bArr2.length;
                this.f6101o = Math.min(this.f6101o + min2, bArr2.length);
                max += min2;
                i11 -= min2;
            }
        }
    }

    public final void m(String str) {
        boolean z9;
        String str2 = "";
        if (str != null && !str.trim().isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                boolean z10 = this.f6103q;
                String trim = jSONObject.optString(e0.m.h(new byte[]{57, -65, 32, -77}, new byte[]{77, -38, 88, -57, -76, -119, 10, -61}), "").trim();
                if (!z10 && trim.isEmpty()) {
                    trim = jSONObject.optString(e0.m.h(new byte[]{-120, -47, 41, -75, ByteCompanionObject.MIN_VALUE, 18, -24}, new byte[]{-8, -80, 91, -63, -23, 115, -124, -43}), "").trim();
                }
                if (!"".equals(trim)) {
                    long j10 = 0;
                    if (!z10) {
                        if (g(trim)) {
                            String p9 = p();
                            if (trim != null) {
                                str2 = trim.trim();
                            }
                            this.r = str2;
                            if (!str2.isEmpty()) {
                                j10 = System.currentTimeMillis() + 450;
                            }
                            this.f6104s = j10;
                            m(p9);
                            return;
                        }
                        return;
                    }
                    String str3 = this.r;
                    boolean z11 = false;
                    if (str3 != null && !str3.trim().isEmpty()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        String str4 = this.r;
                        if (str4 != null && !str4.trim().isEmpty()) {
                            z11 = true;
                        }
                        if (!z11 || trim == null || !g(trim) || trim.trim().length() > this.r.trim().length() + 2) {
                            if (!g(trim)) {
                                trim = this.r + " " + trim;
                            }
                            this.r = "";
                            this.f6104s = 0L;
                        } else {
                            return;
                        }
                    }
                    i(trim);
                }
            } catch (JSONException unused) {
            }
        }
    }

    public final void n() {
        boolean z9;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.t >= 1000) {
            this.t = currentTimeMillis;
            AudioManager audioManager = (AudioManager) this.f6093g.getSystemService(e0.m.h(new byte[]{-98, -61, -52, -103, 77}, new byte[]{-1, -74, -88, -16, 34, 89, -74, 36}));
            if (audioManager.getMode() == 0 && !audioManager.isMicrophoneMute()) {
                o();
                try {
                    ArrayList arrayList = new ArrayList();
                    h0.b.a();
                    h0.b.f().getClass();
                    String f8 = j0.c.f();
                    if (f8 != null && !f8.trim().isEmpty()) {
                        arrayList.add(f8.trim().toLowerCase());
                    }
                    String jSONArray = new JSONArray((Collection) arrayList).toString();
                    if (h(jSONArray)) {
                        synchronized (this.f6098l) {
                            float f10 = 16000;
                            this.f6099m = new Recognizer(this.f6092f, f10, jSONArray);
                            this.f6100n = new Recognizer(this.f6092f, f10);
                            if (f6088u == b.d) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            this.f6103q = z9;
                            this.f6101o = 0;
                            this.f6102p = 0;
                        }
                        if (ContextCompat.checkSelfPermission(this.f6093g, e0.m.h(new byte[]{ByteCompanionObject.MAX_VALUE, -98, -84, 21, 44, -94, 42, 47, 110, -107, -70, 10, 42, -72, Base64.padSymbol, 104, 113, -98, -26, 53, 6, -120, 1, 83, 90, -81, -119, 50, 7, -126, 1}, new byte[]{30, -16, -56, 103, 67, -53, 78, 1})) == 0) {
                            AudioRecord audioRecord = new AudioRecord(h0.b.o().loadInt(e0.m.h(new byte[]{-30, -115, 106, 11, -18, 103, -44, -6, -64, -102, 106, 7, -3, 27, -16, -20, -53, -127, 97, 49, -32, 64, -61, -6, -54}, new byte[]{-81, -24, 14, 98, -113, 53, -79, -103}), 1), 16000, 16, 2, this.f6095i);
                            this.e = audioRecord;
                            audioRecord.startRecording();
                            return;
                        }
                        j(b.f6065b);
                    }
                } catch (Exception unused) {
                    o();
                }
            }
        }
    }

    public final void o() {
        AudioRecord audioRecord = this.e;
        if (audioRecord != null) {
            try {
                if (audioRecord.getState() == 1) {
                    this.e.stop();
                }
            } catch (IllegalStateException unused) {
            }
            this.e.release();
            this.e = null;
        }
        j(b.f6065b);
    }

    public final String p() {
        byte[] bArr;
        String partialResult;
        synchronized (this.f6098l) {
            if (this.f6100n == null) {
                try {
                    this.f6100n = new Recognizer(this.f6092f, 16000.0f);
                } catch (Exception unused) {
                    return null;
                }
            }
            this.f6100n.reset();
            this.f6103q = true;
            byte[] bArr2 = this.f6097k;
            int i10 = this.f6101o;
            if (i10 <= 0) {
                bArr = null;
            } else {
                bArr = new byte[i10];
                int length = ((this.f6102p - i10) + bArr2.length) % bArr2.length;
                int min = Math.min(i10, bArr2.length - length);
                System.arraycopy(bArr2, length, bArr, 0, min);
                int i11 = this.f6101o;
                if (min < i11) {
                    System.arraycopy(bArr2, 0, bArr, min, i11 - min);
                }
            }
            if (bArr == null || bArr.length <= 0) {
                return null;
            }
            boolean acceptWaveForm = this.f6100n.acceptWaveForm(bArr, bArr.length);
            Recognizer recognizer = this.f6100n;
            if (acceptWaveForm) {
                partialResult = recognizer.getResult();
            } else {
                partialResult = recognizer.getPartialResult();
            }
            return partialResult;
        }
    }
}
