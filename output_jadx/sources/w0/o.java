package w0;

import ai.onnxruntime.OnnxTensor;
import ai.onnxruntime.OrtEnvironment;
import ai.onnxruntime.OrtSession;
import android.content.Context;
import android.content.res.Configuration;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.os.Build;
import android.os.Process;
import android.util.JsonReader;
import android.util.Log;
import androidx.core.content.ContextCompat;
import com.example.navistart.cores.ColorText;
import com.sun.jna.Native;
import e0.p3;
import e0.x1;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.nio.LongBuffer;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
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
public final class o implements y {
    public static b T;
    public static b U;
    public static f V;
    public static final String W = e0.m.h(new byte[]{122, 62, ByteCompanionObject.MAX_VALUE, -44, -107, -120, -22, -117, 122, Base64.padSymbol, 126, -26}, new byte[]{-86, ByteCompanionObject.MIN_VALUE, -82, 86, 69, 52, 58, 62});
    public volatile long C;
    public volatile boolean D;
    public volatile int E;
    public volatile int G;
    public volatile int N;
    public volatile int O;
    public volatile long P;
    public volatile boolean Q;

    /* renamed from: g, reason: collision with root package name */
    public ScheduledFuture f6199g;

    /* renamed from: h, reason: collision with root package name */
    public ScheduledFuture f6200h;

    /* renamed from: i, reason: collision with root package name */
    public final AudioManager f6201i;

    /* renamed from: j, reason: collision with root package name */
    public AudioFocusRequest f6202j;

    /* renamed from: k, reason: collision with root package name */
    public AudioRecord f6203k;

    /* renamed from: l, reason: collision with root package name */
    public final Model f6204l;

    /* renamed from: m, reason: collision with root package name */
    public final Context f6205m;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f6207o;

    /* renamed from: p, reason: collision with root package name */
    public m f6208p;

    /* renamed from: q, reason: collision with root package name */
    public OrtEnvironment f6209q;
    public OrtSession r;

    /* renamed from: x, reason: collision with root package name */
    public Recognizer f6213x;

    /* renamed from: y, reason: collision with root package name */
    public Recognizer f6214y;

    /* renamed from: a, reason: collision with root package name */
    public final String f6196a = e0.m.h(new byte[]{-83, -64, ByteCompanionObject.MAX_VALUE, -69, 51, -99, 121, -2, -105, -34, 115, -20}, new byte[]{-2, -80, 22, -40, 91, -40, 23, -103});

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f6197b = e0.w.c(-1, e0.m.h(new byte[]{19, -87, 86, 93, 35, -121, -56, -87, 41, -73, 90, 10}, new byte[]{64, -39, 63, 62, 75, -62, -90, -50}));
    public final ExecutorService c = Executors.newSingleThreadExecutor();
    public final ExecutorService d = Executors.newSingleThreadExecutor();
    public final ExecutorService e = Executors.newSingleThreadExecutor();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayBlockingQueue f6198f = new ArrayBlockingQueue(128);

    /* renamed from: n, reason: collision with root package name */
    public volatile List f6206n = Collections.EMPTY_LIST;

    /* renamed from: s, reason: collision with root package name */
    public boolean f6210s = false;
    public final int t = AudioRecord.getMinBufferSize(16000, 16, 2);

    /* renamed from: u, reason: collision with root package name */
    public final byte[] f6211u = new byte[4096];

    /* renamed from: v, reason: collision with root package name */
    public final byte[] f6212v = new byte[160000];
    public final Object w = new Object();

    /* renamed from: z, reason: collision with root package name */
    public int f6215z = 0;
    public int A = 0;
    public volatile boolean B = false;
    public volatile String F = "";
    public volatile String H = "";
    public String I = "";
    public String J = "";
    public String K = "";
    public String L = "";
    public String M = "";
    public String R = "";
    public long S = 0;

    static {
        b bVar = b.f6065b;
        T = bVar;
        U = bVar;
    }

    public o(Context context) {
        this.f6205m = context;
        System.setProperty(e0.m.h(new byte[]{60, 36, -90, 103, 115, -2, 103, -16, 37}, new byte[]{86, 74, -57, 73, 29, -111, 20, -119}), e0.m.h(new byte[]{45, 96, 21, 57}, new byte[]{89, 18, 96, 92, -127, -24, -108, 27}));
        Native.setProtected(true);
        System.setProperty(e0.m.h(new byte[]{70, 13, 69, -81, 81, 95, -121, 29, 2, 15, 77, -29, 65, 81, -102, 16, 2, 19, 69, -11, 91}, new byte[]{44, 99, 36, -127, 51, 48, -24, 105}), context.getApplicationInfo().nativeLibraryDir);
        System.loadLibrary(e0.m.h(new byte[]{-55, -105, ByteCompanionObject.MIN_VALUE, -54, -4, 11, 92, 21, -41, -102, -127}, new byte[]{-93, -7, -23, -82, -107, 120, 44, 116}));
        System.loadLibrary(e0.m.h(new byte[]{-98, 48, -50, 89}, new byte[]{-24, 95, -67, 50, -33, -90, -50, -58}));
        try {
            String str = l1.f6174a;
            File filesDir = context.getFilesDir();
            String str2 = l1.f6174a;
            if (l1.e(new File(filesDir, str2)) == null) {
                l1.f(context, k1.e, null);
            }
            File e = l1.e(new File(context.getFilesDir(), str2));
            if (e != null) {
                this.f6204l = new Model(e.getAbsolutePath());
                if (this.f6201i == null) {
                    this.f6201i = (AudioManager) context.getSystemService(e0.m.h(new byte[]{-118, 68, 12, -52, 79}, new byte[]{-21, 49, 104, -91, 32, -10, 14, -4}));
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    f fVar = V;
                    if (fVar != null) {
                        this.f6201i.removeOnModeChangedListener(fVar);
                    }
                    V = new f(this, 1);
                    this.f6201i.addOnModeChangedListener(Executors.newSingleThreadExecutor(), V);
                    return;
                }
                return;
            }
            throw new IOException(e0.m.h(new byte[]{-44, -113, 88, -9, -90, -18, -121, 3, -25, -116, 11, -11, -11, -93, -122, 8, -10, -64, 66, -14, -11, -9, -119, 11, -18, -123, 79}, new byte[]{-126, -32, 43, -100, -122, -125, -24, 103}));
        } catch (Exception unused) {
        }
    }

    public static float A(String str, String str2) {
        String[] w = w(str);
        StringBuilder sb = new StringBuilder();
        if (w.length > 0) {
            sb.append((CharSequence) w[0]);
            for (int i10 = 1; i10 < w.length; i10++) {
                sb.append((CharSequence) " ");
                sb.append((CharSequence) w[i10]);
            }
        }
        String sb2 = sb.toString();
        String[] w9 = w(str2);
        StringBuilder sb3 = new StringBuilder();
        if (w9.length > 0) {
            sb3.append((CharSequence) w9[0]);
            for (int i11 = 1; i11 < w9.length; i11++) {
                sb3.append((CharSequence) " ");
                sb3.append((CharSequence) w9[i11]);
            }
        }
        return B(sb2, sb3.toString());
    }

    public static float B(String str, String str2) {
        float f8;
        float f10;
        float f11;
        float f12;
        String o5 = o(str);
        String o9 = o(str2);
        float f13 = 0.0f;
        if (!o5.isEmpty() && !o9.isEmpty()) {
            if (o5.equals(o9)) {
                f12 = 0.12f;
            } else {
                f12 = -0.35f;
            }
            f13 = 0.0f + f12;
        }
        boolean m10 = m(str, e0.m.h(new byte[]{56, 121, -33, -56, 116, 109, -94, 102, 57, 69}, new byte[]{-23, -8, 15, 112, -92, -39, 114, -45}), e0.m.h(new byte[]{-31, -50, -45, -116}, new byte[]{-110, -85, -78, -8, 29, -12, -16, 49}));
        boolean m11 = m(str2, e0.m.h(new byte[]{-113, 41, 20, 34, 9, 119, 86, 12, -114, 21}, new byte[]{94, -88, -60, -102, -39, -61, -122, -71}), e0.m.h(new byte[]{-100, 85, -54, -63}, new byte[]{-17, 48, -85, -75, 43, 114, 111, 117}));
        boolean m12 = m(str, e0.m.h(new byte[]{-97, -72, 83, -34, 84, 98}, new byte[]{78, 56, -126, 93, -124, -39, -120, 21}), e0.m.h(new byte[]{30, -92, 5, -23, 92}, new byte[]{105, -52, 96, -116, 48, 36, -93, 18}));
        boolean m13 = m(str2, e0.m.h(new byte[]{-64, 107, 81, -122, -46, -22}, new byte[]{17, -21, ByteCompanionObject.MIN_VALUE, 5, 2, 81, 115, -96}), e0.m.h(new byte[]{121, -75, 85, 20, 51}, new byte[]{14, -35, 48, 113, 95, 14, -98, -111}));
        float f14 = -0.16f;
        float f15 = 0.08f;
        if (m10) {
            if (m11) {
                f11 = 0.08f;
            } else {
                f11 = -0.16f;
            }
            f13 += f11;
        }
        if (m12) {
            if (m13) {
                f10 = 0.08f;
            } else {
                f10 = -0.16f;
            }
            f13 += f10;
        }
        boolean m14 = m(str, e0.m.h(new byte[]{-57, -86, -76, -24, -8, -61, -38, -115, -58, -102, -76, -29, -8, -52}, new byte[]{23, 24, 100, 86, 40, 119, 10, 53}), e0.m.h(new byte[]{-46, 75, -120, -76, 56, ByteCompanionObject.MIN_VALUE}, new byte[]{-74, 57, -31, -62, 93, -14, -100, -73}));
        boolean m15 = m(str2, e0.m.h(new byte[]{-13, -101, -30, 52, 109, -44, 116, 25, -14, -85, -30, 63, 109, -37}, new byte[]{35, 41, 50, -118, -67, 96, -92, -95}), e0.m.h(new byte[]{50, 39, -53, -11, 30, -118}, new byte[]{86, 85, -94, -125, 123, -8, -4, 85}));
        boolean m16 = m(str, e0.m.h(new byte[]{58, 14, 73, -96, -11, 77, -36, 20, 58, 1, 73, -90, -12, 116, -36, 21}, new byte[]{-22, -79, -103, 16, 36, -52, 13, -107}), e0.m.h(new byte[]{102, 111, 82, 98, -16, 126, -125, -61, 100}, new byte[]{22, 14, 33, 17, -107, 16, -28, -90}));
        boolean m17 = m(str2, e0.m.h(new byte[]{-26, 6, -54, -109, 36, -122, 48, -99, -26, 9, -54, -107, 37, -65, 48, -100}, new byte[]{54, -71, 26, 35, -11, 7, -31, 28}), e0.m.h(new byte[]{105, -21, 100, -7, Base64.padSymbol, -64, -72, 56, 107}, new byte[]{25, -118, 23, -118, 88, -82, -33, 93}));
        if (m14) {
            if (m15) {
                f8 = 0.08f;
            } else {
                f8 = -0.16f;
            }
            f13 += f8;
        }
        if (m16) {
            if (m17) {
                f14 = 0.08f;
            }
            f13 += f14;
        }
        String q8 = q(str);
        String q9 = q(str2);
        if (!q8.isEmpty() && !q9.isEmpty()) {
            if (!q8.equals(q9)) {
                f15 = -0.1f;
            }
            return f13 + f15;
        }
        return f13;
    }

    public static String D(String str) {
        String G = G(str);
        if (G.isEmpty()) {
            return G;
        }
        String trim = Normalizer.normalize(G, Normalizer.Form.NFKC).toLowerCase(Locale.ROOT).replaceAll(e0.m.h(new byte[]{-40, -74, -49, -38, -126, -52, -105, 40, -13, -109, -35, -41, -92, -85}, new byte[]{-125, -24, -109, -86, -7, ByteCompanionObject.MIN_VALUE, -22, 116}), " ").trim();
        if (!trim.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (String str2 : trim.split(e0.m.h(new byte[]{-120, 27, 59}, new byte[]{-44, 104, 16, 38, 35, -95, -127, -118}))) {
                if (!str2.equals(e0.m.h(new byte[]{-18, 103, 20, -38, 44, -118, -85, 52, -18, 99, 21, -25, 44, -123, -86, 5, -17, 90, 20, -44}, new byte[]{62, -40, -60, 100, -4, 60, 123, -124})) && !str2.equals(e0.m.h(new byte[]{-24, -126, -94, -42, -119, 6, -78, -61, -24, -122, -93, -21, -119, 9}, new byte[]{56, Base64.padSymbol, 114, 104, 89, -80, 98, 115})) && !str2.equals(e0.m.h(new byte[]{57, -55, 17, -60}, new byte[]{-23, 116, -63, 116, -49, -25, 114, 111})) && !str2.equals(e0.m.h(new byte[]{95, -93}, new byte[]{-113, 17, 79, -117, -86, -39, 40, -39})) && !str2.equals(e0.m.h(new byte[]{-30, -127, -90, 115}, new byte[]{50, 62, 118, -51, 19, 30, 46, -76})) && !str2.equals(e0.m.h(new byte[]{115, 74, 63, -65, 48, 88, -8, -1, 114, 126, 62, -115}, new byte[]{-93, -10, -17, 1, -32, -18, 40, 74})) && !str2.equals(e0.m.h(new byte[]{38, 52, -48, -23, -36, 37, -94, Base64.padSymbol, 38, 54}, new byte[]{-10, -120, 0, 87, 12, -109, 114, ByteCompanionObject.MIN_VALUE})) && !str2.equals(e0.m.h(new byte[]{60, -53, -43, -69, -60, -42, -117, 85, 60, -58}, new byte[]{-20, ByteCompanionObject.MAX_VALUE, 5, 11, 20, 100, 91, -27})) && !str2.startsWith(e0.m.h(new byte[]{116, -22, -76, -49, -63, 79, 21, 125, 117, -36, -75, -3}, new byte[]{-92, 93, 100, ByteCompanionObject.MAX_VALUE, 17, -16, -60, -2})) && !str2.startsWith(e0.m.h(new byte[]{-99, ByteCompanionObject.MIN_VALUE, -102, -43, 15, -41, 103, 0, -99, -119, -101, -29}, new byte[]{77, 50, 75, 94, -33, 104, -73, -66})) && !str2.startsWith(e0.m.h(new byte[]{36, 45, -34, 45, 110, -103, 67, 2, 37, 28}, new byte[]{-11, -84, 14, -103, -66, 44, -109, -71})) && !str2.equals(e0.m.h(new byte[]{-108, -71, -119, 43, -9, 58}, new byte[]{-28, -43, -20, 74, -124, 95, 54, -65})) && !str2.equals(e0.m.h(new byte[]{17, 83, -126, 9, 101}, new byte[]{114, 60, -9, 101, 1, -120, 122, 95})) && !str2.equals(e0.m.h(new byte[]{111, -119, -56, -44, 86}, new byte[]{24, -26, -67, -72, 50, 59, -57, 73})) && !str2.equals(e0.m.h(new byte[]{-55, -30, 45}, new byte[]{-86, -125, 67, -108, 78, -119, -7, -100})) && !str2.equals(e0.m.h(new byte[]{-36, -84, -30}, new byte[]{-91, -61, -105, 35, -70, 36, -93, -30})) && !str2.equals(e0.m.h(new byte[]{76, 102, -55, -50, 6}, new byte[]{63, 18, -88, -68, 114, 95, 58, 44})) && !str2.equals(e0.m.h(new byte[]{103, -115, -2, 78, 17, 59}, new byte[]{11, -20, -117, 32, 114, 83, 18, -9})) && !str2.equals(e0.m.h(new byte[]{86, 12, 90}, new byte[]{36, 121, 52, -1, -80, 114, -91, 100}))) {
                    arrayList.add(str2);
                }
            }
            if (arrayList.isEmpty()) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb.append((CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append((CharSequence) " ");
                }
            }
            return sb.toString();
        }
        return "";
    }

    public static String G(String str) {
        if (str != null) {
            h0.b.a();
            h0.b.f().getClass();
            String f8 = j0.c.f();
            String trim = str.trim();
            if (f8 != null && !f8.trim().isEmpty()) {
                Locale locale = Locale.ROOT;
                String lowerCase = trim.toLowerCase(locale);
                String lowerCase2 = f8.trim().toLowerCase(locale);
                if (lowerCase2.startsWith(lowerCase)) {
                    return "";
                }
                int lastIndexOf = lowerCase.lastIndexOf(lowerCase2);
                if (lastIndexOf >= 0) {
                    return trim.substring(Math.min(trim.length(), f8.trim().length() + lastIndexOf)).trim();
                }
                return trim;
            }
            return trim;
        }
        return "";
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
            if (com.google.protobuf.q.d(Long.MAX_VALUE, h0.b.a().j()) >= Long.parseLong(new String(com.google.protobuf.q.x(new byte[]{68}, new byte[]{116, 2, -16, 11, -25, 124, 107, 101}, h0.b.o(), com.google.protobuf.q.h(e0.m.f1970g, h0.b.o(), new String(bArr2)), 0)))) {
                z9 = false;
            }
            return Boolean.valueOf(z9);
        }
        return Boolean.FALSE;
    }

    public static void g(LinkedHashMap linkedHashMap, String str, j0.e eVar, String str2) {
        if (str != null && eVar != null) {
            String replaceAll = str.trim().replaceAll(e0.m.h(new byte[]{123, 66, -48}, new byte[]{39, 49, -5, 85, -2, 109, -122, 105}), " ");
            if (!replaceAll.isEmpty()) {
                String str3 = replaceAll.toLowerCase(Locale.ROOT) + (char) 0 + j0.f.g(eVar);
                if (!linkedHashMap.containsKey(str3)) {
                    l lVar = new l(replaceAll, eVar, str2);
                    String[] w = w(D(replaceAll));
                    lVar.f6158f = w;
                    StringBuilder sb = new StringBuilder();
                    if (w.length > 0) {
                        sb.append((CharSequence) w[0]);
                        for (int i10 = 1; i10 < w.length; i10++) {
                            sb.append((CharSequence) " ");
                            sb.append((CharSequence) w[i10]);
                        }
                    }
                    lVar.f6159g = sb.toString();
                    linkedHashMap.put(str3, lVar);
                }
            }
        }
    }

    public static float[] h(float[][] fArr, long[] jArr, int i10, int i11) {
        int length = fArr[0].length;
        float[] fArr2 = new float[length];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            if (jArr[i10 + i13] != 0) {
                i12++;
                for (int i14 = 0; i14 < length; i14++) {
                    fArr2[i14] = fArr2[i14] + fArr[i13][i14];
                }
            }
        }
        double d = 0.0d;
        for (int i15 = 0; i15 < length; i15++) {
            fArr2[i15] = fArr2[i15] / Math.max(1, i12);
            d += r12 * r12;
        }
        float max = (float) Math.max(1.0E-12d, Math.sqrt(d));
        for (int i16 = 0; i16 < length; i16++) {
            fArr2[i16] = fArr2[i16] / max;
        }
        return fArr2;
    }

    public static boolean m(String str, String... strArr) {
        for (String str2 : strArr) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public static String o(String str) {
        for (String str2 : str.split(e0.m.h(new byte[]{54, -56, -45}, new byte[]{106, -69, -8, -127, 58, 51, 18, -53}))) {
            if (str2.equals(e0.m.h(new byte[]{-33, -85, -18, 67, -40, -105, 38, -35}, new byte[]{-80, -37, -117, 45, -82, -14, 84, -65})) || str2.equals(e0.m.h(new byte[]{-35, 80, -91, 116, 97, 108, -68, -114, -35, 84, -71, 118, 109, ByteCompanionObject.MAX_VALUE, -78}, new byte[]{-83, 49, -41, 0, 8, 13, -48, -31})) || str2.equals(e0.m.h(new byte[]{13, -43, 102, 75, 28, 102, -70, 85, 12}, new byte[]{110, -71, 9, 56, 121, 16, -33, 39})) || str2.equals(e0.m.h(new byte[]{118, 12, -19, 70, 42, 20}, new byte[]{25, 98, -101, 35, 88, 118, -113, 44})) || str2.equals(e0.m.h(new byte[]{14, 38, -54, 43, 14, 102, -8}, new byte[]{97, 64, -84, 93, 107, 20, -102, -33})) || str2.equals(e0.m.h(new byte[]{126, 10, 120, -17, -26, -108, 94, -2, 97, 1, 105, -1}, new byte[]{23, 100, 27, -99, -125, -11, 45, -101})) || str2.equals(e0.m.h(new byte[]{-106, -59, 76, -108, 117, 2, 3, 36, -124, -59, 93, -124}, new byte[]{-14, -96, 47, -26, 16, 99, 112, 65}))) {
                return str2;
            }
        }
        return "";
    }

    public static String q(String str) {
        for (String str2 : str.split(e0.m.h(new byte[]{-59, 31, -29}, new byte[]{-103, 108, -56, 91, 77, -1, 24, 79}))) {
            if (str2.equals(e0.m.h(new byte[]{-90}, new byte[]{-106, -42, -108, -63, -21, 80, -61, -94})) || str2.equals(e0.m.h(new byte[]{76}, new byte[]{125, 89, 17, -90, -34, 107, -29, -50})) || str2.equals(e0.m.h(new byte[]{9}, new byte[]{59, 109, 8, ByteCompanionObject.MAX_VALUE, -33, 104, -38, -16})) || str2.equals(e0.m.h(new byte[]{49}, new byte[]{2, 63, 45, -78, 15, 17, -19, -127}))) {
                return str2;
            }
        }
        return "";
    }

    public static boolean t(String str) {
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty() && !trim.equals(e0.m.h(new byte[]{-32, 114}, new byte[]{-69, 47, 81, -89, 80, 115, 106, -27})) && !trim.equals(e0.m.h(new byte[]{108, -48}, new byte[]{23, -83, -72, 88, -110, 92, -118, 69})) && trim.length() >= 5 && trim.startsWith(e0.m.h(new byte[]{-40}, new byte[]{-125, 30, 35, 36, 74, -60, 108, 115})) && trim.endsWith(e0.m.h(new byte[]{114}, new byte[]{47, 120, -124, -51, 58, 68, 62, 63}))) {
                char[] charArray = trim.toCharArray();
                int length = charArray.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        char c = charArray[i10];
                        if (!Character.isLetterOrDigit(c) && e0.m.h(new byte[]{-124, -76, -87, 86, -78}, new byte[]{-90, -17, -12, 122, -110, -13, -85, 83}).indexOf(c) == -1) {
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

    public static String u(String str, String str2) {
        String trim;
        String str3 = "";
        if (str == null) {
            trim = "";
        } else {
            trim = str.trim();
        }
        if (str2 != null) {
            str3 = str2.trim();
        }
        if (trim.isEmpty()) {
            return str3;
        }
        if (str3.isEmpty()) {
            return trim;
        }
        if (str3.startsWith(trim)) {
            return str3;
        }
        return ai.onnxruntime.a.D(trim, " ", str3);
    }

    public static float v(String[] strArr, String[] strArr2) {
        float f8;
        int i10;
        float f10;
        float f11;
        int i11;
        String[] strArr3 = strArr;
        if (strArr3.length == 0 || strArr2.length == 0) {
            return 0.0f;
        }
        int length = strArr2.length;
        int i12 = 0;
        float f12 = 0.0f;
        while (i12 < length) {
            String str = strArr2[i12];
            int length2 = strArr3.length;
            int i13 = 0;
            float f13 = 0.0f;
            while (i13 < length2) {
                String str2 = strArr3[i13];
                if (str.equals(str2)) {
                    i10 = length;
                    f10 = 1.0f;
                } else {
                    int max = Math.max(str.length(), str2.length());
                    if (max < 4) {
                        i10 = length;
                        f10 = 0.0f;
                    } else {
                        int i14 = 0;
                        while (i14 < Math.min(str.length(), str2.length()) && str.charAt(i14) == str2.charAt(i14)) {
                            i14++;
                        }
                        int min = Math.min(str.length(), str2.length());
                        if (i14 >= 4) {
                            f8 = 1.0f;
                            if (i14 >= Math.ceil(min * 0.6f)) {
                                f10 = 0.88f;
                                i10 = length;
                                f13 = Math.max(f13, f10);
                                i13++;
                                strArr3 = strArr;
                                length = i10;
                            }
                        } else {
                            f8 = 1.0f;
                        }
                        int[] iArr = new int[str2.length() + 1];
                        int[] iArr2 = new int[str2.length() + 1];
                        for (int i15 = 0; i15 <= str2.length(); i15++) {
                            iArr[i15] = i15;
                        }
                        int i16 = 1;
                        while (i16 <= str.length()) {
                            iArr2[0] = i16;
                            int i17 = 1;
                            while (i17 <= str2.length()) {
                                int i18 = i17 - 1;
                                int i19 = iArr[i18];
                                int i20 = length;
                                int[] iArr3 = iArr;
                                if (str.charAt(i16 - 1) == str2.charAt(i18)) {
                                    i11 = 0;
                                } else {
                                    i11 = 1;
                                }
                                iArr2[i17] = Math.min(Math.min(iArr3[i17] + 1, iArr2[i18] + 1), i19 + i11);
                                i17++;
                                length = i20;
                                iArr = iArr3;
                            }
                            int[] iArr4 = iArr;
                            i16++;
                            iArr = iArr2;
                            iArr2 = iArr4;
                        }
                        i10 = length;
                        float f14 = max;
                        f10 = f8 - (iArr[str2.length()] / f14);
                        if (f10 < 0.72f) {
                            if (min >= 5 && min / f14 >= 0.65f) {
                                if (str.length() >= 2 && str2.length() >= 2) {
                                    ArrayList arrayList = new ArrayList();
                                    ArrayList arrayList2 = new ArrayList();
                                    for (int i21 = 0; i21 <= str.length() - 2; i21++) {
                                        arrayList.add(str.substring(i21, i21 + 2));
                                    }
                                    for (int i22 = 0; i22 <= str2.length() - 2; i22++) {
                                        arrayList2.add(str2.substring(i22, i22 + 2));
                                    }
                                    boolean[] zArr = new boolean[arrayList2.size()];
                                    int size = arrayList.size();
                                    int i23 = 0;
                                    int i24 = 0;
                                    while (i24 < size) {
                                        Object obj = arrayList.get(i24);
                                        i24++;
                                        String str3 = (String) obj;
                                        int i25 = 0;
                                        while (true) {
                                            if (i25 >= arrayList2.size()) {
                                                break;
                                            }
                                            if (!zArr[i25] && str3.equals(arrayList2.get(i25))) {
                                                zArr[i25] = true;
                                                i23++;
                                                break;
                                            }
                                            i25++;
                                        }
                                    }
                                    f11 = (i23 * 2.0f) / (arrayList2.size() + arrayList.size());
                                } else {
                                    f11 = 0.0f;
                                }
                                if (f11 >= 0.62f) {
                                    f10 = ai.onnxruntime.a.b(f11, 0.62f, 0.4f, 0.75f);
                                }
                            }
                            f10 = 0.0f;
                        }
                        f13 = Math.max(f13, f10);
                        i13++;
                        strArr3 = strArr;
                        length = i10;
                    }
                }
                f13 = Math.max(f13, f10);
                i13++;
                strArr3 = strArr;
                length = i10;
            }
            f12 += f13;
            i12++;
            strArr3 = strArr;
        }
        return f12 / strArr2.length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x03b3, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{1, 62, -73, 103}, new byte[]{123, 91, -59, 8, 56, 2, 48, -33})) != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x03c9, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{113, -86, -46, 6, -127, -34}, new byte[]{-96, 40, 3, -122, 81, 102, 46, -126})) != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x03df, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{107, 78, -74, -37, -56, 76}, new byte[]{-69, -6, 102, 105, 24, -7, 88, 66})) != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x03f4, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{68, 15, -48, 110, -105, -98}, new byte[]{-108, -69, 0, -36, 71, 46, 17, 36})) != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x040a, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{103, -76, 86}, new byte[]{19, -61, 57, -2, 98, 96, 106, -5})) != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0420, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{-34, -42, 108}, new byte[]{-79, -72, 9, -12, 94, 123, -49, 117})) != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0445, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{-26, -86, 62, 62, 116, 118}, new byte[]{-107, -49, 93, 81, 26, 18, 60, -42})) != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x046c, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{-60, -82, 98, 109, -69, -3, -10, -14, -60, -95, 99, 80, -69, -1}, new byte[]{20, 19, -77, -18, 107, 70, 38, 71})) != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0490, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{-86, -103, -117, 46, -32, kotlin.io.encoding.Base64.padSymbol, -93, -19, -86, -104, -117, 46, -32, 56, -94, -33, -85, -88}, new byte[]{122, 38, 90, -82, 48, -123, 115, 92})) != false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x04a5, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{-115, 122, -78, 55, 50, 50, -120, 118, -115, 123, -78, 55, 50, 55, -120, 121, -115, 124}, new byte[]{93, -59, 99, -73, -30, -118, 88, -57})) != false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x04ba, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{113, 121, 125, 64, 34, -39, 118, -72, 113, 120, 125, 64, 34, -36, 118, -71, 112, 73}, new byte[]{-95, -58, -84, -64, -14, 97, -90, 9})) != false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x04de, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{55, -34, -12, -105, 94, -28, 35, -110, 55, -48, -12, -104}, new byte[]{-26, 92, 37, 23, -114, 81, -14, 16})) != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x04f3, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{111, -118, 43, -81, 118, 49, -122, 24, 110, -80, 42, -106}, new byte[]{-66, 8, -6, 47, -90, -124, 87, -102})) != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0291, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{33, -62, 104, -7, -5, -127, -80, 116, 32, -10, 104, -11}, new byte[]{-15, 125, -72, 76, 42, 1, 96, -58})) != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0422, code lost:
    
        r4 = e0.m.h(new byte[]{45}, new byte[]{28, -40, -101, 103, -51, -113, -64, -122});
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x02a7, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{-88, -63, 75, -21, 120, 15, 15, -3, -88, -50, 74, -47}, new byte[]{120, 126, -101, 94, -87, -113, -33, 79})) != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02bd, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{-104, -36, 49, -96, -108, -41, -106, 20, -104, -48, 48, -101}, new byte[]{72, 110, -32, 34, 68, 105, 71, -108})) != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0447, code lost:
    
        r4 = e0.m.h(new byte[]{-55}, new byte[]{-5, 7, -32, 37, 92, 114, -121, 12});
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02d3, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{-52, 120, -17, 40, 8, -21, 18, -78, -52, 122, -17, 37}, new byte[]{28, -54, 62, -86, -40, 85, -61, 50})) != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02e9, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{97, -34, -109, -98, 124, -94, 20, -39, 97, -33, -109, -98, 124, -96, 21, -21}, new byte[]{-79, 97, 66, 30, -84, 26, -60, 104})) != false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x04bc, code lost:
    
        r4 = e0.m.h(new byte[]{-61, 125, -40, 25, -13, -6, 1, 125, -61, 124, -40, 25}, new byte[]{19, -62, 9, -103, 35, 66, -47, -52});
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02ff, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{-42, 0, 83, 40, -35, -127, -83, 99, -42, 1, 83, 40, -35, -125, -83, 106}, new byte[]{6, -65, -126, -88, 13, 57, 125, -46})) != false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0315, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{98, 81, -72, 118, -103, 99, 98, -21, 98, 80, -72, 118, -103, 97, 98, -17}, new byte[]{-78, -18, 105, -10, 73, -37, -78, 90})) != false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x032c, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{109, -126, 88, 19, 88}, new byte[]{25, -22, 42, 118, kotlin.io.encoding.Base64.padSymbol, -82, -127, -25})) != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x04f5, code lost:
    
        r4 = e0.m.h(new byte[]{-109}, new byte[]{-96, -119, -55, -10, -44, -67, 115, 57});
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0343, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{30, 108, 97, 96, -37}, new byte[]{106, 4, 8, 18, -65, 42, 49, 120})) != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x035a, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{-59, -14, 79, -111, -120}, new byte[]{-93, -101, kotlin.io.encoding.Base64.padSymbol, -30, -4, -87, -70, 9})) != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0370, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{17, -89, -55, -29, 67, -48, 103, 37}, new byte[]{-63, 25, 25, 87, -109, 109, -73, -107})) != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0386, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{21, -123, 39, 68, 44, 12, 105, 69}, new byte[]{-59, 59, -9, -16, -4, -76, -71, -8})) != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x039c, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{-95, -103, 46, 57, -108, -69, 71, 65}, new byte[]{113, 36, -2, -121, 68, 0, -106, -51})) != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x046e, code lost:
    
        r4 = e0.m.h(new byte[]{-8}, new byte[]{-56, -65, 17, -75, -49, 21, -5, -95});
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:68:0x027a. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String[] w(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 2560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.o.w(java.lang.String):java.lang.String[]");
    }

    /* JADX WARN: Finally extract failed */
    public final void C(ArrayList arrayList) {
        int readInt;
        String str = a.f6059a;
        File d = a.d(new File(this.f6205m.getFilesDir(), a.f6060b));
        if (d != null) {
            File file = new File(d, e0.m.h(new byte[]{101, -109, -77, 52, -105, 122, -18, -37, 99, -46, -78, 34, -106, 125}, new byte[]{17, -4, -40, 81, -7, 19, -108, -66}));
            File file2 = new File(d, e0.m.h(new byte[]{119, -14, 100, -110, -89, 33, -53, 99, 125, -14, 105, -118, -29, 40, -105, 32, 105, -22, 105, -118, -94, 96, -53, 99, 110, -65, 38, -119, -96, 35, -38}, new byte[]{26, -121, 8, -26, -50, 77, -94, 13}));
            File file3 = new File(d, e0.m.h(new byte[]{-7, -118, 89, 36, 90, 51, 78, -10, -89, -116, 85, 43, 80, 46, 67, -12, -2, -118, 71, 107, 87, 38, 68, -3, -17}, new byte[]{-118, -17, 52, 69, 52, 71, 39, -107}));
            if (this.f6208p == null) {
                HashMap hashMap = new HashMap(300000);
                JsonReader jsonReader = new JsonReader(new InputStreamReader(new FileInputStream(file), e0.m.h(new byte[]{-103, -41, 88, -4, 68}, new byte[]{-52, -125, 30, -47, 124, -112, 37, 4})));
                try {
                    jsonReader.beginObject();
                    int i10 = 1;
                    while (jsonReader.hasNext()) {
                        if (!e0.m.h(new byte[]{-82, -87, 111, -31, -98}, new byte[]{-61, -58, 11, -124, -14, 27, 80, -46}).equals(jsonReader.nextName())) {
                            jsonReader.skipValue();
                        } else {
                            jsonReader.beginObject();
                            while (jsonReader.hasNext()) {
                                if (!e0.m.h(new byte[]{-77, 65, -124, -108, 77}, new byte[]{-59, 46, -25, -11, 47, -80, 41, -53}).equals(jsonReader.nextName())) {
                                    jsonReader.skipValue();
                                } else {
                                    jsonReader.beginArray();
                                    int i11 = 0;
                                    while (jsonReader.hasNext()) {
                                        jsonReader.beginArray();
                                        String nextString = jsonReader.nextString();
                                        float nextDouble = (float) jsonReader.nextDouble();
                                        while (jsonReader.hasNext()) {
                                            jsonReader.skipValue();
                                        }
                                        jsonReader.endArray();
                                        hashMap.put(nextString, new n(i11, nextDouble));
                                        i10 = Math.max(i10, nextString.length());
                                        i11++;
                                    }
                                    jsonReader.endArray();
                                }
                            }
                            jsonReader.endObject();
                        }
                    }
                    jsonReader.endObject();
                    jsonReader.close();
                    this.f6208p = new m(hashMap, i10, 0);
                } finally {
                    try {
                        jsonReader.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            }
            if (this.f6209q == null) {
                this.f6209q = OrtEnvironment.getEnvironment();
            }
            if (this.r == null) {
                OrtSession.SessionOptions sessionOptions = new OrtSession.SessionOptions();
                sessionOptions.setIntraOpNumThreads(1);
                sessionOptions.setInterOpNumThreads(1);
                sessionOptions.setCPUArenaAllocator(false);
                sessionOptions.setMemoryPatternOptimization(false);
                this.r = this.f6209q.createSession(file2.getAbsolutePath(), sessionOptions);
            }
            boolean isFile = file3.isFile();
            String str2 = this.f6196a;
            if (isFile) {
                try {
                    DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(file3)));
                    try {
                        if (dataInputStream.readInt() == 1245926449 && dataInputStream.readInt() == arrayList.size()) {
                            int size = arrayList.size();
                            int i12 = 0;
                            while (i12 < size) {
                                Object obj = arrayList.get(i12);
                                i12++;
                                l lVar = (l) obj;
                                String readUTF = dataInputStream.readUTF();
                                String readUTF2 = dataInputStream.readUTF();
                                if (lVar.f6156a.equals(readUTF) && j0.f.g(lVar.f6157b).equals(readUTF2) && (readInt = dataInputStream.readInt()) >= 0 && readInt <= 64) {
                                    lVar.d = new int[readInt];
                                    for (int i13 = 0; i13 < readInt; i13++) {
                                        lVar.d[i13] = dataInputStream.readInt();
                                    }
                                    int readInt2 = dataInputStream.readInt();
                                    if (readInt2 == 384) {
                                        lVar.e = new float[readInt2];
                                        for (int i14 = 0; i14 < readInt2; i14++) {
                                            lVar.e[i14] = dataInputStream.readFloat();
                                        }
                                    }
                                }
                            }
                            dataInputStream.close();
                            Log.i(str2, e0.m.h(new byte[]{84, 50, 105, -43, 11, -25, -116, -107, 39, 52, 101, -38, 1, -6, -127, -105, 115, 50, 119, -108, 9, -4, -124, -110, 98, 51, 36, -46, 23, -4, -120, -42, 100, 54, 103, -36, 0, -87, -59}, new byte[]{7, 87, 4, -76, 101, -109, -27, -10}) + arrayList.size());
                            return;
                        }
                        dataInputStream.close();
                    } catch (Throwable th2) {
                        try {
                            dataInputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Exception e) {
                    Log.w(str2, e0.m.h(new byte[]{49, -74, 2, 125, 39, 26, -49, -110, 66, -80, 14, ByteCompanionObject.MAX_VALUE, 33, 11, -122, -104, 17, -13, 1, 115, Base64.padSymbol, 78, -45, -126, 3, -79, 3, 121}, new byte[]{98, -45, 111, 28, 73, 110, -90, -15}), e);
                }
            }
            int size2 = arrayList.size();
            int i15 = 0;
            while (i15 < size2) {
                Object obj2 = arrayList.get(i15);
                i15++;
                l lVar2 = (l) obj2;
                lVar2.d = this.f6208p.a(e0.m.h(new byte[]{78, -105, 41, 66, -69, 22, 92, -49, 30}, new byte[]{62, -10, 90, 49, -38, 113, 57, -11}) + lVar2.f6156a);
            }
            for (int i16 = 0; i16 < arrayList.size(); i16 += 8) {
                I(arrayList, i16, Math.min(8, arrayList.size() - i16));
            }
            File parentFile = file3.getParentFile();
            StringBuilder sb = new StringBuilder();
            sb.append(file3.getName());
            File file4 = new File(parentFile, com.google.protobuf.q.i(new byte[]{-91, -53, -43, -87}, new byte[]{-117, -91, -80, -34, -46, 122, 102, 55}, sb));
            try {
                DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file4)));
                try {
                    dataOutputStream.writeInt(1245926449);
                    dataOutputStream.writeInt(arrayList.size());
                    int size3 = arrayList.size();
                    int i17 = 0;
                    while (i17 < size3) {
                        Object obj3 = arrayList.get(i17);
                        i17++;
                        l lVar3 = (l) obj3;
                        dataOutputStream.writeUTF(lVar3.f6156a);
                        dataOutputStream.writeUTF(j0.f.g(lVar3.f6157b));
                        dataOutputStream.writeInt(lVar3.d.length);
                        for (int i18 : lVar3.d) {
                            dataOutputStream.writeInt(i18);
                        }
                        dataOutputStream.writeInt(lVar3.e.length);
                        for (float f8 : lVar3.e) {
                            dataOutputStream.writeFloat(f8);
                        }
                    }
                    dataOutputStream.close();
                    if (file3.exists() && !file3.delete()) {
                        file4.delete();
                        return;
                    } else {
                        if (!file4.renameTo(file3)) {
                            file4.delete();
                            return;
                        }
                        return;
                    }
                } catch (Throwable th4) {
                    try {
                        dataOutputStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            } catch (Exception e6) {
                Log.w(str2, e0.m.h(new byte[]{-107, 100, 60, 34, -80, 31, -119, 78, -94, 43, 62, 60, -67, 75, -126, 1, -91, 110, 36, 47, -70, 75, -114, 66, -10, 104, 40, 45, -68, 90}, new byte[]{-42, 11, 73, 78, -44, 63, -25, 33}), e6);
                file4.delete();
                return;
            }
        }
        n0.b.A(e0.m.h(new byte[]{44, -97, 57, -38, 78, -81, -10, 104, 95, -105, 59, -33, 69, -73, -65, 98, 12, -38, 58, -44, 84, -5, -10, 101, 12, -114, 53, -41, 76, -66, -5}, new byte[]{ByteCompanionObject.MAX_VALUE, -6, 84, -69, 32, -37, -97, 11}));
    }

    public final String E(int i10, byte[] bArr) {
        Recognizer recognizer;
        String partialResult;
        synchronized (this.w) {
            try {
                if (this.B) {
                    recognizer = this.f6214y;
                } else {
                    recognizer = this.f6213x;
                }
                if (recognizer == null) {
                    return null;
                }
                if (recognizer.acceptWaveForm(bArr, i10)) {
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

    public final synchronized void F(int i10, byte[] bArr) {
        if (bArr != null && i10 > 0) {
            int min = Math.min(i10, bArr.length);
            int max = Math.max(0, min - this.f6212v.length);
            int i11 = min - max;
            while (i11 > 0) {
                int min2 = Math.min(i11, this.f6212v.length - this.A);
                System.arraycopy(bArr, max, this.f6212v, this.A, min2);
                int i12 = this.A + min2;
                byte[] bArr2 = this.f6212v;
                this.A = i12 % bArr2.length;
                this.f6215z = Math.min(this.f6215z + min2, bArr2.length);
                max += min2;
                i11 -= min2;
            }
        }
    }

    public final void H(String str) {
        String trim;
        l p9;
        String trim2;
        if (str != null && !str.trim().isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                boolean z9 = this.B;
                boolean has = jSONObject.has(e0.m.h(new byte[]{-112, 14, 115, -52}, new byte[]{-28, 107, 11, -72, -58, 75, 78, -36}));
                if (has) {
                    trim = jSONObject.optString(e0.m.h(new byte[]{-58, 48, -100, -87}, new byte[]{-78, 85, -28, -35, 58, 106, 27, 108}), "").trim();
                } else {
                    trim = jSONObject.optString(e0.m.h(new byte[]{104, 91, -12, -102, 78, 95, 79}, new byte[]{24, 58, -122, -18, 39, 62, 35, -58}), "").trim();
                }
                if (z9) {
                    if (has) {
                        if (trim != null && !trim.trim().isEmpty()) {
                            this.I = u(this.I, trim.trim());
                        }
                        this.J = "";
                    } else {
                        if (trim == null) {
                            trim2 = "";
                        } else {
                            trim2 = trim.trim();
                        }
                        this.J = trim2;
                    }
                    trim = u(this.I, this.J);
                }
                if (!"".equals(trim)) {
                    if (!z9) {
                        h0.b.a();
                        h0.b.f().getClass();
                        String f8 = j0.c.f();
                        if (f8 != null && !f8.trim().isEmpty() && trim != null && trim.toLowerCase().contains(f8.trim().toLowerCase()) && has) {
                            String N = N();
                            this.R = "";
                            y(trim);
                            H(N);
                            return;
                        }
                        return;
                    }
                    if (!trim.equals(this.M)) {
                        this.M = trim;
                        Log.d(this.f6196a, e0.m.h(new byte[]{-59, -117, -106, 36, 42, 60, -106, -6, -20, -103, -108, 33, 126, 39, -100, -9, -93, -99, -107, 37, 104, 39, -99, -4, -25, -61, -35}, new byte[]{-125, -2, -6, 72, 10, 78, -13, -103}) + trim + e0.m.h(new byte[]{8}, new byte[]{47, -13, -117, 51, 85, 92, -95, 53}));
                        y(trim);
                    }
                    String G = G(trim);
                    if (!G.isEmpty()) {
                        if (W.equals(Normalizer.normalize(G, Normalizer.Form.NFKC).toLowerCase(Locale.ROOT).replaceAll(e0.m.h(new byte[]{114, -9, -103, 83, -43, ByteCompanionObject.MIN_VALUE, -92, -56, 89, -46, -117, 94, -13, -25}, new byte[]{41, -87, -59, 35, -82, -52, -39, -108}), " ").trim())) {
                            Log.i(this.f6196a, e0.m.h(new byte[]{-106, -121, -19, -54, 51, 92, 95, -112, -65, -107, -17, -49, 103, 71, 85, -99, -16, -111, -32, -56, 112, 75, 86, -97, -75, -106, -95, -60, 106, 14, 76, -100, -71, -111, -28, -122, 112, 65, 87, -98, -79, -100, -27}, new byte[]{-48, -14, -127, -90, 19, 46, 58, -13}));
                            a();
                            return;
                        }
                        h0.b.a();
                        j0.e d = h0.b.f().d(G);
                        if (j0.f.d(d)) {
                            n(d);
                            return;
                        }
                        String D = D(G);
                        if (!D.isEmpty()) {
                            if (has || !D.equals(this.K)) {
                                this.K = D;
                                h0.b.a();
                                j0.e d10 = h0.b.f().d(D);
                                if (j0.f.d(d10)) {
                                    n(d10);
                                    return;
                                }
                                if (has && (p9 = p(G)) != null) {
                                    Log.i(this.f6196a, e0.m.h(new byte[]{-9, 1, -123, -92, -16, -92, -115, 29, -41, 9, -63, -69, -21, -92, -127, 22, -106, 21, -119, -65, -27, -66, -121, 83, -37, 4, -107, -82, -20, -88, -122, 73, -106}, new byte[]{-74, 101, -31, -51, -124, -51, -30, 115}) + p9.f6156a + e0.m.h(new byte[]{99, 73, 97, -18}, new byte[]{67, 100, 95, -50, 83, 22, -65, -94}) + j0.f.g(p9.f6157b));
                                    n(p9.f6157b);
                                    return;
                                }
                                if (!this.f6206n.isEmpty() && !D.equals(this.L)) {
                                    this.L = D;
                                    int i10 = this.N + 1;
                                    this.N = i10;
                                    this.f6197b.schedule(new h(this, i10, D, 3), 350L, TimeUnit.MILLISECONDS);
                                }
                                if (has) {
                                    O(D);
                                }
                            }
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }

    public final void I(ArrayList arrayList, int i10, int i11) {
        int i12 = 1;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 = Math.max(i12, ((l) arrayList.get(i10 + i13)).d.length);
        }
        int i14 = i11 * i12;
        long[] jArr = new long[i14];
        long[] jArr2 = new long[i14];
        long[] jArr3 = new long[i14];
        long j10 = 1;
        Arrays.fill(jArr, 1L);
        for (int i15 = 0; i15 < i11; i15++) {
            int[] iArr = ((l) arrayList.get(i10 + i15)).d;
            int i16 = 0;
            while (i16 < iArr.length) {
                int i17 = (i15 * i12) + i16;
                long j11 = j10;
                jArr[i17] = iArr[i16];
                jArr2[i17] = j11;
                i16++;
                j10 = j11;
            }
        }
        long[] jArr4 = {i11, i12};
        OnnxTensor createTensor = OnnxTensor.createTensor(this.f6209q, LongBuffer.wrap(jArr), jArr4);
        try {
            OnnxTensor createTensor2 = OnnxTensor.createTensor(this.f6209q, LongBuffer.wrap(jArr2), jArr4);
            try {
                createTensor2 = OnnxTensor.createTensor(this.f6209q, LongBuffer.wrap(jArr3), jArr4);
                try {
                    HashMap hashMap = new HashMap();
                    hashMap.put(e0.m.h(new byte[]{104, -56, -86, -102, 54, 66, -5, -32, 114}, new byte[]{1, -90, -38, -17, 66, 29, -110, -124}), createTensor);
                    hashMap.put(e0.m.h(new byte[]{-127, 97, 97, -45, 69, -85, ByteCompanionObject.MAX_VALUE, 104, -114, 74, 120, -41, 88, -76}, new byte[]{-32, 21, 21, -74, 43, -33, 22, 7}), createTensor2);
                    hashMap.put(e0.m.h(new byte[]{-54, 71, 75, 113, -15, -28, -123, 35, -50, 77, ByteCompanionObject.MAX_VALUE, 125, -5, -56}, new byte[]{-66, 40, 32, 20, -97, -69, -15, 90}), createTensor2);
                    OrtSession.Result run = this.r.run(hashMap);
                    try {
                        float[][][] fArr = (float[][][]) run.get(0).getValue();
                        for (int i18 = 0; i18 < i11; i18++) {
                            ((l) arrayList.get(i10 + i18)).e = h(fArr[i18], jArr2, i18 * i12, i12);
                        }
                        run.close();
                        if (createTensor2 != null) {
                            createTensor2.close();
                        }
                        if (createTensor2 != null) {
                            createTensor2.close();
                        }
                        if (createTensor != null) {
                            createTensor.close();
                        }
                    } finally {
                    }
                } finally {
                    if (createTensor2 != null) {
                        try {
                            createTensor2.close();
                            throw th;
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                if (createTensor2 != null) {
                    try {
                        createTensor2.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
        } catch (Throwable th4) {
            if (createTensor != null) {
                try {
                    createTensor.close();
                    throw th4;
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                    throw th4;
                }
            }
            throw th4;
        }
    }

    public final void J() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.S >= 1000) {
            this.S = currentTimeMillis;
            if (j()) {
                L();
                try {
                    String jSONArray = new JSONArray((Collection) i()).toString();
                    if (t(jSONArray)) {
                        synchronized (this.w) {
                            Recognizer recognizer = this.f6213x;
                            if (recognizer != null) {
                                recognizer.close();
                                this.f6213x = null;
                            }
                            Recognizer recognizer2 = this.f6214y;
                            if (recognizer2 != null) {
                                recognizer2.close();
                                this.f6214y = null;
                            }
                            float f8 = 16000;
                            this.f6213x = new Recognizer(this.f6204l, f8, jSONArray);
                            this.f6214y = new Recognizer(this.f6204l, f8);
                            this.B = false;
                            synchronized (this) {
                                this.f6215z = 0;
                                this.A = 0;
                            }
                        }
                        if (ContextCompat.checkSelfPermission(this.f6205m, e0.m.h(new byte[]{-29, -99, 104, 69, -19, 74, -40, 33, -14, -106, 126, 90, -21, 80, -49, 102, -19, -99, 34, 101, -57, 96, -13, 93, -58, -84, 77, 98, -58, 106, -13}, new byte[]{-126, -13, 12, 55, -126, 35, -68, 15})) == 0) {
                            AudioRecord audioRecord = new AudioRecord(h0.b.o().loadInt(e0.m.h(new byte[]{-111, -104, -106, 8, -92, 13, -39, 7, -77, -113, -106, 4, -73, 113, -3, 17, -72, -108, -99, 50, -86, 42, -50, 7, -71}, new byte[]{-36, -3, -14, 97, -59, 95, -68, 100}), 1), 16000, 16, 2, this.t);
                            this.f6203k = audioRecord;
                            audioRecord.startRecording();
                            return;
                        }
                        z(b.f6065b);
                    }
                } catch (Exception e) {
                    Log.e(this.f6196a, e0.m.h(new byte[]{-21, 110, 47, 107, -55, -29, 32, 114, -34, 110, 52, 108, -59, -83, 53, 55, -44, 111, 47, 124, -59, -94, 62, 126, -57, 96, 50, 97, -61, -83, 114, 113, -36, 104, 42, 109, -56}, new byte[]{-67, 1, 70, 8, -84, -61, 82, 23}), e);
                    L();
                }
            }
        }
    }

    public final void K(int i10, String str) {
        if (i10 == this.E && this.B && !this.D) {
            if (i10 == this.G) {
                this.F = "";
            }
            this.D = true;
            this.c.execute(new h(this, str, i10, 0));
        }
    }

    public final void L() {
        AudioRecord audioRecord = this.f6203k;
        if (audioRecord != null) {
            try {
                if (audioRecord.getState() == 1) {
                    this.f6203k.stop();
                }
            } catch (IllegalStateException unused) {
            }
            this.f6203k.release();
            this.f6203k = null;
        }
        z(b.f6065b);
    }

    public final void M() {
        synchronized (this.w) {
            try {
                this.B = false;
                this.f6198f.clear();
                this.E++;
                this.F = "";
                this.C = 0L;
                this.H = "";
                this.I = "";
                this.J = "";
                this.K = "";
                this.L = "";
                this.M = "";
                this.N++;
                Recognizer recognizer = this.f6213x;
                if (recognizer != null) {
                    recognizer.reset();
                }
                Recognizer recognizer2 = this.f6214y;
                if (recognizer2 != null) {
                    recognizer2.reset();
                }
                synchronized (this) {
                    this.f6215z = 0;
                    this.A = 0;
                }
                this.R = "";
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String N() {
        String partialResult;
        synchronized (this.w) {
            if (this.f6214y == null) {
                try {
                    this.f6214y = new Recognizer(this.f6204l, 16000.0f);
                } catch (Exception unused) {
                    return null;
                }
            }
            this.f6214y.reset();
            this.B = true;
            this.E++;
            this.F = "";
            this.C = System.currentTimeMillis() + 10000;
            this.H = "";
            this.I = "";
            this.J = "";
            this.K = "";
            this.L = "";
            this.M = "";
            this.N++;
            byte[] s5 = s();
            if (s5 == null || s5.length <= 0) {
                return null;
            }
            this.f6198f.clear();
            boolean acceptWaveForm = this.f6214y.acceptWaveForm(s5, s5.length);
            Recognizer recognizer = this.f6214y;
            if (acceptWaveForm) {
                partialResult = recognizer.getResult();
            } else {
                partialResult = recognizer.getPartialResult();
            }
            return partialResult;
        }
    }

    public final void O(String str) {
        String D = D(str);
        if (D.length() >= 2 && !this.f6206n.isEmpty() && !D.equalsIgnoreCase(this.H)) {
            this.H = D;
            System.currentTimeMillis();
            int i10 = this.E + 1;
            this.E = i10;
            this.F = D;
            this.G = i10;
            this.f6197b.schedule(new h(this, D, i10, 4), 550L, TimeUnit.MILLISECONDS);
        }
    }

    @Override // w0.y
    public final void a() {
        AudioFocusRequest audioFocusRequest;
        AudioManager audioManager = this.f6201i;
        if (audioManager != null && (audioFocusRequest = this.f6202j) != null && Build.VERSION.SDK_INT >= 26) {
            audioManager.abandonAudioFocusRequest(audioFocusRequest);
        }
        M();
        z(U);
    }

    @Override // w0.y
    public final void b() {
        h0.b.w(e0.m.h(new byte[]{53, -25, -37, -91, -105, -16, -33, 108}, new byte[]{70, -109, -76, -43, -63, -97, -84, 7}), ColorText.RED);
        this.O++;
        this.f6198f.clear();
        ScheduledFuture scheduledFuture = this.f6199g;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.f6199g.cancel(true);
            this.f6199g = null;
        }
        L();
        synchronized (this.w) {
            Recognizer recognizer = this.f6213x;
            if (recognizer != null) {
                recognizer.close();
                this.f6213x = null;
            }
            Recognizer recognizer2 = this.f6214y;
            if (recognizer2 != null) {
                recognizer2.close();
                this.f6214y = null;
            }
            this.B = false;
        }
        z(b.f6065b);
    }

    @Override // w0.y
    public final void c() {
        h0.b.w(e0.m.h(new byte[]{-122, -5, 122, 101, -70, 11, 60, -39, -98}, new byte[]{-11, -113, 27, 23, -50, 93, 83, -86}), ColorText.RED);
        b();
        final int i10 = 0;
        final int i11 = 1;
        if (!this.f6207o && this.f6206n.isEmpty()) {
            this.f6207o = true;
            this.c.execute(new Runnable(this) { // from class: w0.j
                public final /* synthetic */ o c;

                {
                    this.c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean z9;
                    boolean z10;
                    switch (i10) {
                        case 0:
                            o oVar = this.c;
                            try {
                                try {
                                    Process.setThreadPriority(10);
                                    ArrayList l10 = oVar.l();
                                    oVar.C(l10);
                                    oVar.f6206n = Collections.unmodifiableList(l10);
                                    Log.i(oVar.f6196a, e0.m.h(new byte[]{-78, 27, -30, 54, 59, -2, 1, -31, -63, 29, -18, 57, 49, -29, 12, -29, -107, 27, -4, 119, 37, -8, 13, -14, ByteCompanionObject.MIN_VALUE, 12, -22, 51, 111, -86}, new byte[]{-31, 126, -113, 87, 85, -118, 104, -126}) + l10.size());
                                } finally {
                                    oVar.f6207o = false;
                                }
                            } catch (Exception e) {
                                Log.e(oVar.f6196a, e0.m.h(new byte[]{19, 76, -58, -103, -45, 27, 67, -20, 36, 3, -61, -121, -46, 75, 76, -15, 53, 3, -64, -112, -38, 90, 67, -9, 57, 64, -109, -106, -42, 85, 73, -22, 52, 66, -57, -112, -60}, new byte[]{80, 35, -77, -11, -73, 59, 45, -125}), e);
                                oVar.f6206n = Collections.EMPTY_LIST;
                            }
                            return;
                        default:
                            o oVar2 = this.c;
                            try {
                                try {
                                    h0.b.a();
                                    if (h0.b.q() != oVar2) {
                                        synchronized (oVar2) {
                                            try {
                                                ScheduledFuture scheduledFuture = oVar2.f6200h;
                                                if (scheduledFuture != null) {
                                                    scheduledFuture.cancel(false);
                                                }
                                                oVar2.f6200h = null;
                                            } finally {
                                            }
                                        }
                                    } else if (!h0.b.o().loadBoolean(e0.m.h(new byte[]{-114, 117, 122, 14, 100, 49, 52, -112, -117, 100, 103, 52, 90, 41, 55, -90, -82, 82}, new byte[]{-3, 5, 19, 81, 5, 90, 64, -7}), false) && oVar2.f6204l != null && oVar2.j() && System.currentTimeMillis() - oVar2.P >= 5000) {
                                        ScheduledFuture scheduledFuture2 = oVar2.f6199g;
                                        if (scheduledFuture2 != null && !scheduledFuture2.isCancelled() && !oVar2.f6199g.isDone()) {
                                            z9 = true;
                                        } else {
                                            z9 = false;
                                        }
                                        AudioRecord audioRecord = oVar2.f6203k;
                                        if (audioRecord != null && audioRecord.getState() == 1 && oVar2.f6203k.getRecordingState() == 3) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        if ((!z9 || !z10) && !oVar2.Q) {
                                            oVar2.Q = true;
                                            Log.w(oVar2.f6196a, e0.m.h(new byte[]{-66, -111, 62, 24, -66, 111, -83, 126, -117, -44, 42, 22, -72, 104, -84, 116, -125, -109, 125, 5, -87, 120, -80, 113, -98, ByteCompanionObject.MIN_VALUE, 103, 87, -72, 106, -73, 123, -83, -104, 52, 1, -87, 54}, new byte[]{-20, -12, 93, 119, -52, 11, -60, 16}) + z9 + e0.m.h(new byte[]{-7, -127, 115, -114, 6, 39, 85, -70, -80, -45, 64, -121, 12, 62, 66, -29}, new byte[]{-43, -95, 1, -21, 101, 72, 39, -34}) + z10);
                                            oVar2.c();
                                        }
                                    }
                                } catch (Exception e6) {
                                    Log.e(oVar2.f6196a, e0.m.h(new byte[]{54, 92, 66, ByteCompanionObject.MAX_VALUE, 36, 108, -95, 40, 3, 25, 86, 113, 34, 107, -96, 34, 11, 94, 1, 118, 55, 97, -92, 35, 0}, new byte[]{100, 57, 33, 16, 86, 8, -56, 70}), e6);
                                }
                                return;
                            } finally {
                                oVar2.Q = false;
                            }
                    }
                }
            });
        }
        this.P = System.currentTimeMillis();
        final int i12 = this.O + 1;
        this.O = i12;
        this.f6198f.clear();
        this.e.execute(new Runnable(this) { // from class: w0.i
            public final /* synthetic */ o c;

            {
                this.c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        o oVar = this.c;
                        int i13 = i12;
                        Process.setThreadPriority(-16);
                        while (i13 == oVar.O && !Thread.currentThread().isInterrupted()) {
                            try {
                                k kVar = (k) oVar.f6198f.poll(250L, TimeUnit.MILLISECONDS);
                                if (kVar == null) {
                                    oVar.x();
                                    oVar.k();
                                } else {
                                    oVar.H(oVar.E(kVar.f6135b, kVar.f6134a));
                                    oVar.x();
                                    oVar.k();
                                }
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                return;
                            } catch (Exception e) {
                                Log.e(oVar.f6196a, e0.m.h(new byte[]{-16, 86, 78, -17, -64, 20, -18, -79, -53, 92, 67, -96, -41, 8, -24, -90, -57, 64, 94, -23, -55, 29, -89, -93, -61, 90, 65, -27, -61}, new byte[]{-94, 51, 45, ByteCompanionObject.MIN_VALUE, -89, 122, -121, -59}), e);
                                if (i13 == oVar.O) {
                                    oVar.J();
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    default:
                        o oVar2 = this.c;
                        int i14 = i12;
                        if (i14 == oVar2.O) {
                            try {
                                AudioRecord audioRecord = oVar2.f6203k;
                                if (audioRecord != null && audioRecord.getRecordingState() == 3) {
                                    AudioRecord audioRecord2 = oVar2.f6203k;
                                    byte[] bArr = oVar2.f6211u;
                                    int read = audioRecord2.read(bArr, 0, bArr.length, 0);
                                    if (read > 0) {
                                        if (o.T != b.d) {
                                            oVar2.z(b.c);
                                        }
                                        oVar2.F(read, oVar2.f6211u);
                                        k kVar2 = new k(Arrays.copyOf(oVar2.f6211u, read), read);
                                        if (!oVar2.f6198f.offer(kVar2)) {
                                            oVar2.f6198f.poll();
                                            oVar2.f6198f.offer(kVar2);
                                            Log.w(oVar2.f6196a, e0.m.h(new byte[]{123, -44, -120, 62, -108, 24, -22, -8, 64, -34, -123, 113, -126, 3, -26, -7, 76, -111, -124, 39, -106, 4, -27, -32, 70, -58, -48, 113, -100, 26, -25, -23, 90, -59, -53, 48, -122, 18, -22, -29, 9, -43, -103, 62, -125, 6, -26, -24}, new byte[]{41, -79, -21, 81, -13, 118, -125, -116}));
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                if (i14 == oVar2.O) {
                                    oVar2.J();
                                    return;
                                }
                                return;
                            } catch (Exception e6) {
                                Log.e(oVar2.f6196a, e0.m.h(new byte[]{87, -15, 59, -67, 18, -100, 122, -72, 121, -25, 58, -89, 14, -43, 100, -83, 54, -30, 62, -67, 17, -39, 110}, new byte[]{22, -124, 95, -44, 125, -68, 10, -54}), e6);
                                if (i14 == oVar2.O) {
                                    oVar2.J();
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                }
            }
        });
        this.f6199g = this.f6197b.scheduleWithFixedDelay(new Runnable(this) { // from class: w0.i
            public final /* synthetic */ o c;

            {
                this.c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        o oVar = this.c;
                        int i13 = i12;
                        Process.setThreadPriority(-16);
                        while (i13 == oVar.O && !Thread.currentThread().isInterrupted()) {
                            try {
                                k kVar = (k) oVar.f6198f.poll(250L, TimeUnit.MILLISECONDS);
                                if (kVar == null) {
                                    oVar.x();
                                    oVar.k();
                                } else {
                                    oVar.H(oVar.E(kVar.f6135b, kVar.f6134a));
                                    oVar.x();
                                    oVar.k();
                                }
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                return;
                            } catch (Exception e) {
                                Log.e(oVar.f6196a, e0.m.h(new byte[]{-16, 86, 78, -17, -64, 20, -18, -79, -53, 92, 67, -96, -41, 8, -24, -90, -57, 64, 94, -23, -55, 29, -89, -93, -61, 90, 65, -27, -61}, new byte[]{-94, 51, 45, ByteCompanionObject.MIN_VALUE, -89, 122, -121, -59}), e);
                                if (i13 == oVar.O) {
                                    oVar.J();
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    default:
                        o oVar2 = this.c;
                        int i14 = i12;
                        if (i14 == oVar2.O) {
                            try {
                                AudioRecord audioRecord = oVar2.f6203k;
                                if (audioRecord != null && audioRecord.getRecordingState() == 3) {
                                    AudioRecord audioRecord2 = oVar2.f6203k;
                                    byte[] bArr = oVar2.f6211u;
                                    int read = audioRecord2.read(bArr, 0, bArr.length, 0);
                                    if (read > 0) {
                                        if (o.T != b.d) {
                                            oVar2.z(b.c);
                                        }
                                        oVar2.F(read, oVar2.f6211u);
                                        k kVar2 = new k(Arrays.copyOf(oVar2.f6211u, read), read);
                                        if (!oVar2.f6198f.offer(kVar2)) {
                                            oVar2.f6198f.poll();
                                            oVar2.f6198f.offer(kVar2);
                                            Log.w(oVar2.f6196a, e0.m.h(new byte[]{123, -44, -120, 62, -108, 24, -22, -8, 64, -34, -123, 113, -126, 3, -26, -7, 76, -111, -124, 39, -106, 4, -27, -32, 70, -58, -48, 113, -100, 26, -25, -23, 90, -59, -53, 48, -122, 18, -22, -29, 9, -43, -103, 62, -125, 6, -26, -24}, new byte[]{41, -79, -21, 81, -13, 118, -125, -116}));
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                if (i14 == oVar2.O) {
                                    oVar2.J();
                                    return;
                                }
                                return;
                            } catch (Exception e6) {
                                Log.e(oVar2.f6196a, e0.m.h(new byte[]{87, -15, 59, -67, 18, -100, 122, -72, 121, -25, 58, -89, 14, -43, 100, -83, 54, -30, 62, -67, 17, -39, 110}, new byte[]{22, -124, 95, -44, 125, -68, 10, -54}), e6);
                                if (i14 == oVar2.O) {
                                    oVar2.J();
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                }
            }
        }, 0L, 30L, TimeUnit.MILLISECONDS);
        synchronized (this) {
            ScheduledFuture scheduledFuture = this.f6200h;
            if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
                return;
            }
            this.f6200h = this.f6197b.scheduleWithFixedDelay(new Runnable(this) { // from class: w0.j
                public final /* synthetic */ o c;

                {
                    this.c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean z9;
                    boolean z10;
                    switch (i11) {
                        case 0:
                            o oVar = this.c;
                            try {
                                try {
                                    Process.setThreadPriority(10);
                                    ArrayList l10 = oVar.l();
                                    oVar.C(l10);
                                    oVar.f6206n = Collections.unmodifiableList(l10);
                                    Log.i(oVar.f6196a, e0.m.h(new byte[]{-78, 27, -30, 54, 59, -2, 1, -31, -63, 29, -18, 57, 49, -29, 12, -29, -107, 27, -4, 119, 37, -8, 13, -14, ByteCompanionObject.MIN_VALUE, 12, -22, 51, 111, -86}, new byte[]{-31, 126, -113, 87, 85, -118, 104, -126}) + l10.size());
                                } finally {
                                    oVar.f6207o = false;
                                }
                            } catch (Exception e) {
                                Log.e(oVar.f6196a, e0.m.h(new byte[]{19, 76, -58, -103, -45, 27, 67, -20, 36, 3, -61, -121, -46, 75, 76, -15, 53, 3, -64, -112, -38, 90, 67, -9, 57, 64, -109, -106, -42, 85, 73, -22, 52, 66, -57, -112, -60}, new byte[]{80, 35, -77, -11, -73, 59, 45, -125}), e);
                                oVar.f6206n = Collections.EMPTY_LIST;
                            }
                            return;
                        default:
                            o oVar2 = this.c;
                            try {
                                try {
                                    h0.b.a();
                                    if (h0.b.q() != oVar2) {
                                        synchronized (oVar2) {
                                            try {
                                                ScheduledFuture scheduledFuture2 = oVar2.f6200h;
                                                if (scheduledFuture2 != null) {
                                                    scheduledFuture2.cancel(false);
                                                }
                                                oVar2.f6200h = null;
                                            } finally {
                                            }
                                        }
                                    } else if (!h0.b.o().loadBoolean(e0.m.h(new byte[]{-114, 117, 122, 14, 100, 49, 52, -112, -117, 100, 103, 52, 90, 41, 55, -90, -82, 82}, new byte[]{-3, 5, 19, 81, 5, 90, 64, -7}), false) && oVar2.f6204l != null && oVar2.j() && System.currentTimeMillis() - oVar2.P >= 5000) {
                                        ScheduledFuture scheduledFuture22 = oVar2.f6199g;
                                        if (scheduledFuture22 != null && !scheduledFuture22.isCancelled() && !oVar2.f6199g.isDone()) {
                                            z9 = true;
                                        } else {
                                            z9 = false;
                                        }
                                        AudioRecord audioRecord = oVar2.f6203k;
                                        if (audioRecord != null && audioRecord.getState() == 1 && oVar2.f6203k.getRecordingState() == 3) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        if ((!z9 || !z10) && !oVar2.Q) {
                                            oVar2.Q = true;
                                            Log.w(oVar2.f6196a, e0.m.h(new byte[]{-66, -111, 62, 24, -66, 111, -83, 126, -117, -44, 42, 22, -72, 104, -84, 116, -125, -109, 125, 5, -87, 120, -80, 113, -98, ByteCompanionObject.MIN_VALUE, 103, 87, -72, 106, -73, 123, -83, -104, 52, 1, -87, 54}, new byte[]{-20, -12, 93, 119, -52, 11, -60, 16}) + z9 + e0.m.h(new byte[]{-7, -127, 115, -114, 6, 39, 85, -70, -80, -45, 64, -121, 12, 62, 66, -29}, new byte[]{-43, -95, 1, -21, 101, 72, 39, -34}) + z10);
                                            oVar2.c();
                                        }
                                    }
                                } catch (Exception e6) {
                                    Log.e(oVar2.f6196a, e0.m.h(new byte[]{54, 92, 66, ByteCompanionObject.MAX_VALUE, 36, 108, -95, 40, 3, 25, 86, 113, 34, 107, -96, 34, 11, 94, 1, 118, 55, 97, -92, 35, 0}, new byte[]{100, 57, 33, 16, 86, 8, -56, 70}), e6);
                                }
                                return;
                            } finally {
                                oVar2.Q = false;
                            }
                    }
                }
            }, 3L, 3L, TimeUnit.SECONDS);
        }
    }

    @Override // w0.y
    public final void d() {
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest build;
        U = T;
        if (this.f6202j == null && Build.VERSION.SDK_INT >= 26) {
            onAudioFocusChangeListener = d.d().setOnAudioFocusChangeListener(new e(this, 1));
            audioAttributes = onAudioFocusChangeListener.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build());
            build = audioAttributes.build();
            this.f6202j = build;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.f6201i.requestAudioFocus(this.f6202j);
        }
        if (!this.B) {
            N();
        }
        z(b.d);
    }

    @Override // w0.y
    public final b e() {
        return T;
    }

    public final List i() {
        ArrayList arrayList = new ArrayList();
        h0.b.a();
        h0.b.f().getClass();
        String f8 = j0.c.f();
        if (f8 != null && !f8.trim().isEmpty()) {
            for (String str : f8.trim().toLowerCase(Locale.ROOT).split(e0.m.h(new byte[]{24, 24, -99}, new byte[]{68, 107, -74, 4, -71, -92, 124, 26}))) {
                if (!str.isEmpty() && !arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
            arrayList.add(e0.m.h(new byte[]{-35, Base64.padSymbol, 125, -2, 5}, new byte[]{-122, 72, 19, -107, 88, 123, -79, -55}));
        }
        return arrayList;
    }

    public final boolean j() {
        AudioManager audioManager = (AudioManager) this.f6205m.getSystemService(e0.m.h(new byte[]{7, -26, -59, -114, -16}, new byte[]{102, -109, -95, -25, -97, 11, 56, -71}));
        if (audioManager.getMode() == 0 && !audioManager.isMicrophoneMute()) {
            return true;
        }
        return false;
    }

    public final void k() {
        if (this.B && this.C > 0 && System.currentTimeMillis() >= this.C) {
            if (!this.f6198f.isEmpty()) {
                this.C = System.currentTimeMillis() + 1000;
                return;
            }
            if (!this.D && (this.F.isEmpty() || this.G != this.E)) {
                Log.i(this.f6196a, e0.m.h(new byte[]{118, -11, 105, 33, 23, -47, 89, 54, 95, -25, 107, 36, 67, -54, 83, 59, 16, -12, 108, 32, 82, -52, 73, 33}, new byte[]{48, ByteCompanionObject.MIN_VALUE, 5, 77, 55, -93, 60, 85}));
                M();
                z(b.c);
                return;
            }
            this.C = System.currentTimeMillis() + 1000;
        }
    }

    public final ArrayList l() {
        n0.d dVar;
        int i10;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        h0.b.a();
        ArrayList e = h0.b.f().e();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(Locale.getDefault().toLanguageTag(), Locale.getDefault());
        Context context = this.f6205m;
        int i11 = 0;
        for (String str : context.getAssets().getLocales()) {
            if (str != null && !str.trim().isEmpty()) {
                Locale forLanguageTag = Locale.forLanguageTag(str.replace('_', '-'));
                if (!forLanguageTag.getLanguage().isEmpty()) {
                    linkedHashMap2.put(forLanguageTag.toLanguageTag(), forLanguageTag);
                }
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap2.values());
        int size = e.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = e.get(i12);
            i12++;
            j0.e eVar = (j0.e) obj;
            if (j0.f.d(eVar)) {
                if (eVar.f3094a == j0.d.f3092b && (dVar = eVar.f3095b) != null) {
                    try {
                        Field declaredField = n0.d.class.getDeclaredField(e0.m.h(new byte[]{-91, 86, 33, 110, -62, -92, -30, 0, -96, 82, 55}, new byte[]{-63, 63, 82, 30, -82, -59, -101, 78}));
                        declaredField.setAccessible(true);
                        i10 = declaredField.getInt(dVar);
                    } catch (Exception unused) {
                        i10 = 0;
                    }
                    if (i10 != 0) {
                        int size2 = arrayList.size();
                        int i13 = 0;
                        while (i13 < size2) {
                            Object obj2 = arrayList.get(i13);
                            i13++;
                            Configuration configuration = new Configuration(context.getResources().getConfiguration());
                            configuration.setLocale((Locale) obj2);
                            g(linkedHashMap, context.createConfigurationContext(configuration).getString(i10), eVar, "");
                        }
                    }
                }
                g(linkedHashMap, eVar.f3099i, eVar, "");
            }
        }
        h0.b.a();
        ArrayList i14 = h0.b.f().i(j0.c.e);
        int size3 = i14.size();
        while (i11 < size3) {
            Object obj3 = i14.get(i11);
            i11++;
            o0 o0Var = (o0) obj3;
            if (o0Var.c && j0.f.d(o0Var.f6217b)) {
                g(linkedHashMap, o0Var.f6216a, o0Var.f6217b, "");
            }
        }
        String str2 = this.f6196a;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (l lVar : linkedHashMap.values()) {
            String g10 = j0.f.g(lVar.f6157b);
            ((List) linkedHashMap3.computeIfAbsent(g10, new ai.onnxruntime.d(7))).add(lVar.f6156a);
            linkedHashMap4.put(g10, lVar.f6157b);
        }
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(context.getAssets().open(e0.m.h(new byte[]{104, Base64.padSymbol, 71, -107, 41, -64, -113, -65, 106, 59, 65, -104, 19, -2, -126, -75, ByteCompanionObject.MAX_VALUE, 33, 75, -123, 98, -11, -99, -77, 112}, new byte[]{30, 82, 46, -10, 76, -97, -18, -36})), e0.m.h(new byte[]{-63, -125, -47, 108, -108}, new byte[]{-108, -41, -105, 65, -84, -77, 21, -40}));
            try {
                List<c0> b10 = d0.c(inputStreamReader).b(linkedHashMap3);
                int size4 = linkedHashMap.size();
                for (c0 c0Var : b10) {
                    g(linkedHashMap, c0Var.f6071b, (j0.e) linkedHashMap4.get(c0Var.f6070a), c0Var.c);
                }
                Log.i(str2, e0.m.h(new byte[]{86, 35, -7, 78, 2, -65, 25, -36, 118, 43, -67, 81, 25, -65, 21, -41, 55, 55, -11, 85, 23, -91, 19, -63, 55, 43, -14, 70, 18, -77, 18, -120, 55}, new byte[]{23, 71, -99, 39, 118, -42, 118, -78}) + (linkedHashMap.size() - size4));
                inputStreamReader.close();
            } finally {
            }
        } catch (Exception e6) {
            Log.w(str2, e0.m.h(new byte[]{70, -61, 110, 49, -86, -81, -124, 23, 102, -53, 42, 46, -79, -81, -120, 28, 39, -41, 98, 42, -65, -75, -114, 89, 100, -58, 126, 57, -78, -87, -116, 89, 114, -55, 107, 46, -65, -81, -121, 24, 101, -53, 111, 99, -2, -77, -104, 16, 105, -64, 42, 55, -84, -81, -116, 16, 105, -58, 102, 120, -82, -82, -103, 24, 116, -62, 121}, new byte[]{7, -89, 10, 88, -34, -58, -21, 121}), e6);
        }
        return new ArrayList(linkedHashMap.values());
    }

    public final void n(j0.e eVar) {
        a();
        h0.b.a();
        h0.b.f().j(eVar, null);
    }

    public final l p(String str) {
        String d = d0.d(str);
        l lVar = null;
        for (l lVar2 : this.f6206n) {
            if (!lVar2.c.isEmpty() && lVar2.c.equals(d)) {
                if (lVar != null && !j0.f.g(lVar.f6157b).equals(j0.f.g(lVar2.f6157b))) {
                    return null;
                }
                lVar = lVar2;
            }
        }
        return lVar;
    }

    public final l r(String str) {
        String g10;
        l lVar;
        l lVar2 = null;
        String str2 = "";
        l lVar3 = new l(str, null, "");
        lVar3.d = this.f6208p.a(e0.m.h(new byte[]{116, 5, -109, 36, 28, -89, -34}, new byte[]{5, 112, -10, 86, 101, -99, -2, -94}) + str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(lVar3);
        int i10 = 0;
        I(arrayList, 0, 1);
        l lVar4 = null;
        float f8 = -1.0f;
        for (l lVar5 : this.f6206n) {
            if (!lVar5.c.isEmpty()) {
                lVar = lVar2;
            } else {
                float[] fArr = lVar5.e;
                int length = fArr.length;
                lVar = lVar2;
                float[] fArr2 = lVar3.e;
                if (length == fArr2.length) {
                    float f10 = 0.0f;
                    for (int i11 = 0; i11 < fArr2.length; i11++) {
                        f10 += fArr2[i11] * fArr[i11];
                    }
                    float A = A(str, lVar5.f6156a) + (v(w(str), w(lVar5.f6156a)) * 0.08f) + f10;
                    if (A > f8) {
                        f8 = A;
                        lVar4 = lVar5;
                    }
                }
            }
            lVar2 = lVar;
        }
        l lVar6 = lVar2;
        if (lVar4 == null) {
            g10 = "";
        } else {
            g10 = j0.f.g(lVar4.f6157b);
        }
        float f11 = -1.0f;
        for (l lVar7 : this.f6206n) {
            if (lVar7.c.isEmpty() && lVar7.e.length == lVar3.e.length && !g10.equals(j0.f.g(lVar7.f6157b))) {
                float[] fArr3 = lVar3.e;
                float[] fArr4 = lVar7.e;
                float f12 = 0.0f;
                while (i10 < fArr3.length) {
                    f12 = (fArr3[i10] * fArr4[i10]) + f12;
                    i10++;
                }
                f11 = Math.max(f11, A(str, lVar7.f6156a) + (v(w(str), w(lVar7.f6156a)) * 0.08f) + f12);
            }
            i10 = 0;
        }
        float f13 = f8 - f11;
        String str3 = this.f6196a;
        StringBuilder sb = new StringBuilder();
        com.google.protobuf.q.u(new byte[]{ByteCompanionObject.MIN_VALUE, 83, -53, -61, 99, -16, -35, -68, -13, 71, -45, -57, ByteCompanionObject.MAX_VALUE, -3, -119, -8}, new byte[]{-45, 54, -90, -94, 13, -124, -76, -33}, sb, str);
        sb.append(e0.m.h(new byte[]{-110, -76, 105, 37, -77, 38, -83, 25, -110}, new byte[]{-75, -104, 73, 71, -42, 85, -39, 36}));
        if (lVar4 != null) {
            str2 = lVar4.f6156a;
        }
        sb.append(str2);
        sb.append(e0.m.h(new byte[]{-49, -44, 88, -36, -104, 59, -10, 63, -43}, new byte[]{-24, -8, 120, -81, -5, 84, -124, 90}));
        sb.append(f8);
        sb.append(e0.m.h(new byte[]{74, -38, 78, 92, -57, 38, 97, -69, 5, -114, 72, 71, -63, 14, 114, -120, 1, -109, 79, 21}, new byte[]{102, -6, 33, 40, -81, 67, 19, -6}));
        sb.append(f13);
        Log.d(str3, sb.toString());
        if (f8 >= 0.82f && f13 >= 0.016f) {
            return lVar4;
        }
        return lVar6;
    }

    public final synchronized byte[] s() {
        int i10 = this.f6215z;
        if (i10 <= 0) {
            return null;
        }
        byte[] bArr = new byte[i10];
        int i11 = this.A - i10;
        byte[] bArr2 = this.f6212v;
        int length = (i11 + bArr2.length) % bArr2.length;
        int min = Math.min(i10, bArr2.length - length);
        System.arraycopy(this.f6212v, length, bArr, 0, min);
        int i12 = this.f6215z;
        if (min < i12) {
            System.arraycopy(this.f6212v, 0, bArr, min, i12 - min);
        }
        return bArr;
    }

    public final void x() {
        String str = this.R;
        if (str != null && !str.trim().isEmpty() && System.currentTimeMillis() >= 0) {
            String str2 = this.R;
            this.R = "";
            y(str2);
        }
    }

    public final synchronized void y(String str) {
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

    public final void z(b bVar) {
        if (f().booleanValue()) {
            T = bVar;
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
}
