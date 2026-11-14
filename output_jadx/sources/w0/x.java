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
import android.os.Debug;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import org.apache.commons.net.tftp.TFTP;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.vosk.Model;
import org.vosk.Recognizer;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class x implements y {

    /* renamed from: l0, reason: collision with root package name */
    public static b f6259l0;

    /* renamed from: m0, reason: collision with root package name */
    public static b f6260m0;

    /* renamed from: n0, reason: collision with root package name */
    public static final String f6261n0 = e0.m.h(new byte[]{-16, 80, 110, 60, -64, 110, 12, -41, -16, 83, 111, 14}, new byte[]{32, -18, -65, -66, 16, -46, -36, 98});
    public volatile v A;
    public volatile l0 B;
    public volatile boolean C;
    public final b1 D;
    public volatile g1 E;
    public volatile long G;
    public volatile String I;
    public Recognizer P;
    public Recognizer Q;
    public volatile long U;
    public volatile boolean V;
    public volatile int W;
    public volatile int Y;

    /* renamed from: f0, reason: collision with root package name */
    public volatile int f6270f0;

    /* renamed from: g, reason: collision with root package name */
    public ScheduledFuture f6271g;

    /* renamed from: g0, reason: collision with root package name */
    public volatile int f6272g0;

    /* renamed from: h, reason: collision with root package name */
    public ScheduledFuture f6273h;

    /* renamed from: h0, reason: collision with root package name */
    public volatile long f6274h0;

    /* renamed from: i, reason: collision with root package name */
    public final AudioManager f6275i;

    /* renamed from: i0, reason: collision with root package name */
    public volatile boolean f6276i0;

    /* renamed from: j, reason: collision with root package name */
    public AudioFocusRequest f6277j;

    /* renamed from: k, reason: collision with root package name */
    public AudioRecord f6279k;

    /* renamed from: l, reason: collision with root package name */
    public Model f6281l;

    /* renamed from: m, reason: collision with root package name */
    public final Context f6282m;

    /* renamed from: n, reason: collision with root package name */
    public f f6283n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f6284o;

    /* renamed from: q, reason: collision with root package name */
    public volatile boolean f6286q;
    public volatile int r;

    /* renamed from: s, reason: collision with root package name */
    public m f6287s;
    public OrtEnvironment t;

    /* renamed from: u, reason: collision with root package name */
    public OrtSession f6288u;

    /* renamed from: v, reason: collision with root package name */
    public final d1 f6289v;

    /* renamed from: a, reason: collision with root package name */
    public final String f6262a = e0.m.h(new byte[]{-11, 119, 99, 101, 91, 63, 121, 101, -49, 105, 111, 51}, new byte[]{-90, 7, 10, 6, 51, 122, 23, 2});

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f6264b = e0.w.c(-1, e0.m.h(new byte[]{77, 74, -115, 71, 101, -98, -49, -46, 119, 84, -127, 17}, new byte[]{30, 58, -28, 36, 13, -37, -95, -75}));
    public final ExecutorService c = Executors.newSingleThreadExecutor();
    public final ExecutorService d = Executors.newSingleThreadExecutor();
    public final ExecutorService e = Executors.newSingleThreadExecutor();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayBlockingQueue f6269f = new ArrayBlockingQueue(128);

    /* renamed from: p, reason: collision with root package name */
    public volatile List f6285p = Collections.EMPTY_LIST;
    public x0 w = new x0();

    /* renamed from: x, reason: collision with root package name */
    public volatile String f6290x = "";

    /* renamed from: y, reason: collision with root package name */
    public volatile String f6291y = e0.m.h(new byte[]{-57, 43, -26, 69, -103, -71, -92, 2, -47, 42, -32, 70, -105, -96, -82}, new byte[]{-78, 69, -115, 43, -10, -50, -54, 93});

    /* renamed from: z, reason: collision with root package name */
    public volatile String f6292z = "";
    public volatile String F = e0.m.h(new byte[]{47, -82, 103, -41, -94, 20, Base64.padSymbol, 47, 37, -92, 101, -47, -76, 47}, new byte[]{73, -63, 4, -94, -47, 75, 79, 74});
    public volatile String H = "";
    public volatile int J = 1;
    public boolean K = false;
    public final int L = AudioRecord.getMinBufferSize(16000, 16, 2);
    public final byte[] M = new byte[4096];
    public final byte[] N = new byte[160000];
    public final Object O = new Object();
    public int R = 0;
    public int S = 0;
    public volatile boolean T = false;
    public volatile String X = "";
    public volatile String Z = "";

    /* renamed from: a0, reason: collision with root package name */
    public String f6263a0 = "";

    /* renamed from: b0, reason: collision with root package name */
    public String f6265b0 = "";

    /* renamed from: c0, reason: collision with root package name */
    public String f6266c0 = "";

    /* renamed from: d0, reason: collision with root package name */
    public String f6267d0 = "";

    /* renamed from: e0, reason: collision with root package name */
    public String f6268e0 = "";

    /* renamed from: j0, reason: collision with root package name */
    public String f6278j0 = "";

    /* renamed from: k0, reason: collision with root package name */
    public long f6280k0 = 0;

    static {
        b bVar = b.f6065b;
        f6259l0 = bVar;
        f6260m0 = bVar;
    }

    public x(Context context) {
        File e;
        this.f6289v = d1.d;
        this.I = "";
        this.f6282m = context;
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(context.getAssets().open(e0.m.h(new byte[]{81, -122, -80, -82, 58, -91, 17, -124, 74, -124, -72, -93, 59, -91, 30, -118, 73, -114, -84, -84, 56, -97, 92, -127, 84, -122, -73}, new byte[]{39, -23, -39, -51, 95, -6, 114, -21})), e0.m.h(new byte[]{11, 110, Base64.padSymbol, 73, 101}, new byte[]{94, 58, 123, 100, 93, -106, 28, -91}));
            try {
                this.f6289v = d1.d(inputStreamReader);
                inputStreamReader.close();
            } finally {
            }
        } catch (Exception e6) {
            Log.w(e0.m.h(new byte[]{-101, 103, 84, 12, -53, -21, -73, 63, -95, 121, 88, 90}, new byte[]{-56, 23, Base64.padSymbol, 111, -93, -82, -39, 88}), e0.m.h(new byte[]{16, 46, -109, 0, 4, 108, 116, 79, ByteCompanionObject.MAX_VALUE, 40, -120, 0, 8, 103, 53, 85, 48, Base64.padSymbol, -122, 11, 30, 110, 116, 81, 38, 126, -110, 7, 10, 116, 116, 74, 51, 63, -123, 5, 14, 57, 53, 81, 58, 42, -122, 0, 5, 107, 123, 68, ByteCompanionObject.MAX_VALUE, 59, -97, 8, 8, 118, 53, 83, 55, 44, -122, 26, 14, 113}, new byte[]{95, 94, -25, 105, 107, 2, 21, 35}), e6);
        }
        System.setProperty(e0.m.h(new byte[]{-84, 80, 107, 68, -7, -107, Base64.padSymbol, -1, -75}, new byte[]{-58, 62, 10, 106, -105, -6, 78, -122}), e0.m.h(new byte[]{-73, 109, 63, 43}, new byte[]{-61, 31, 74, 78, 93, -19, 39, 25}));
        Native.setProtected(true);
        System.setProperty(e0.m.h(new byte[]{-126, 52, -44, -19, -56, -112, 51, 51, -58, 54, -36, -95, -40, -98, 46, 62, -58, 42, -44, -73, -62}, new byte[]{-24, 90, -75, -61, -86, -1, 92, 71}), this.f6282m.getApplicationInfo().nativeLibraryDir);
        System.loadLibrary(e0.m.h(new byte[]{17, 37, 37, 101, 110, 29, 105, 119, 15, 40, 36}, new byte[]{123, 75, 76, 1, 7, 110, 25, 22}));
        System.loadLibrary(e0.m.h(new byte[]{73, 101, 110, -72}, new byte[]{63, 10, 29, -45, 57, -93, -66, -49}));
        try {
            Context context2 = this.f6282m;
            String str = l1.f6174a;
            File filesDir = context2.getFilesDir();
            String str2 = l1.f6174a;
            if (l1.e(new File(filesDir, str2)) == null) {
                l1.f(context2, k1.e, null);
            }
            e = l1.e(new File(this.f6282m.getFilesDir(), str2));
        } catch (Exception e10) {
            r().e(e0.m.h(new byte[]{-93, -81, 69, 44, -112}, new byte[]{-58, -35, 55, 67, -30, 110, 10, 58}), e0.m.h(new byte[]{-42, -23, 123, 41, 96}, new byte[]{-91, -99, 26, 78, 5, -28, 126, 90}), e0.m.h(new byte[]{-47, 37, -99, -82, -87, -115, -38, 74, -43, 62}, new byte[]{-68, 74, -7, -53, -59, -46, -77, 36}), e0.m.h(new byte[]{-122, -89, -18, 43}, new byte[]{-14, -34, -98, 78, 90, -104, -39, 36}), e10.getClass().getSimpleName(), e0.m.h(new byte[]{63, 71, -100, -83, 109, -118, -101}, new byte[]{82, 34, -17, -34, 12, -19, -2, 59}), e10.getMessage());
        }
        if (e != null) {
            this.f6281l = new Model(e.getAbsolutePath());
            this.I = e.getName();
            r().e(e0.m.h(new byte[]{-80, 13, -56, -62, -100, 64, 50, -123, -68, 6, -43}, new byte[]{-35, 98, -84, -89, -16, 31, 64, -32}), e0.m.h(new byte[]{11, 31, 60, 126, 38}, new byte[]{102, 112, 88, 27, 74, -123, 67, 51}), e.getName(), e0.m.h(new byte[]{83, 34, -43, -36, 23, -65, 57, 7, 84, 38}, new byte[]{32, 67, -72, -84, 123, -38, 107, 102}), 16000, e0.m.h(new byte[]{22, 108, -115, -100, -104, -92, 59, 109, 23}, new byte[]{100, 9, -20, -8, -38, -35, 79, 8}), Integer.valueOf(this.M.length), e0.m.h(new byte[]{38, -13, 10, -87, 82, 96, -48, 30, 36, -52, 28}, new byte[]{86, -127, 111, -53, 39, 6, -74, 123}), Integer.valueOf(TFTP.DEFAULT_TIMEOUT), e0.m.h(new byte[]{117, 97, 95, 77, 41, 107, 82, -111, 126, 117, 65}, new byte[]{19, 20, 51, 33, 110, 25, 51, -4}), Boolean.FALSE, e0.m.h(new byte[]{6, -78, -91, ByteCompanionObject.MAX_VALUE, -125, 50, -90, 114, 8, -65, -105, ByteCompanionObject.MAX_VALUE, -101, 50, -66}, new byte[]{103, -47, -47, 22, -11, 83, -46, 27}), Boolean.TRUE);
            if (this.f6275i == null) {
                this.f6275i = (AudioManager) this.f6282m.getSystemService(e0.m.h(new byte[]{-9, 106, -60, 83, 70}, new byte[]{-106, 31, -96, 58, 41, -93, 123, -20}));
            }
            if (Build.VERSION.SDK_INT >= 31) {
                f fVar = this.f6283n;
                if (fVar != null) {
                    this.f6275i.removeOnModeChangedListener(fVar);
                }
                f fVar2 = new f(this, 2);
                this.f6283n = fVar2;
                this.f6275i.addOnModeChangedListener(this.f6264b, fVar2);
            }
            this.D = new b1(context, e0(), this.f6264b);
            return;
        }
        throw new IOException(e0.m.h(new byte[]{108, 48, 86, -1, 89, 78, 71, 113, 95, 51, 5, -3, 10, 3, 70, 122, 78, ByteCompanionObject.MAX_VALUE, 76, -6, 10, 87, 73, 121, 86, 58, 65}, new byte[]{58, 95, 37, -108, 121, 35, 40, 21}));
    }

    public static boolean G(String str) {
        String b10 = d1.b(str);
        h0.b.a();
        ArrayList i10 = h0.b.f().i(j0.c.e);
        int size = i10.size();
        String str2 = null;
        int i11 = 0;
        while (i11 < size) {
            Object obj = i10.get(i11);
            i11++;
            o0 o0Var = (o0) obj;
            if (o0Var.c && j0.f.d(o0Var.f6217b) && b10.equals(d1.b(o0Var.f6216a))) {
                String g10 = j0.f.g(o0Var.f6217b);
                if (str2 != null && !str2.equals(g10)) {
                    return true;
                }
                str2 = g10;
            }
        }
        return false;
    }

    public static boolean H(String str) {
        if (str != null) {
            String c = d1.c(str);
            if (!f6261n0.equals(c) && !c.equals(e0.m.h(new byte[]{64, 8, -13, -11, 102, Base64.padSymbol}, new byte[]{35, 105, -99, -106, 3, 81, -39, 74}))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean I(String str) {
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty() && !trim.equals(e0.m.h(new byte[]{66, 104}, new byte[]{25, 53, -56, 120, -44, -27, -41, -116})) && !trim.equals(e0.m.h(new byte[]{Base64.padSymbol, 86}, new byte[]{70, 43, -60, -48, 4, -73, -39, 125})) && trim.length() >= 5 && trim.startsWith(e0.m.h(new byte[]{37}, new byte[]{126, 103, 68, -103, -28, 98, 97, -125})) && trim.endsWith(e0.m.h(new byte[]{80}, new byte[]{13, 107, 47, 120, -90, -21, -117, 22}))) {
                char[] charArray = trim.toCharArray();
                int length = charArray.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        char c = charArray[i10];
                        if (!Character.isLetterOrDigit(c) && e0.m.h(new byte[]{-21, 17, -102, 118, -98}, new byte[]{-55, 74, -57, 90, -66, 13, -14, -121}).indexOf(c) == -1) {
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

    public static String J(String str, String str2) {
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

    public static float K(String str, String str2) {
        float f8;
        String[] strArr;
        int i10;
        float f10;
        float f11;
        int i11;
        String[] L = L(str);
        String[] L2 = L(str2);
        if (L.length == 0 || L2.length == 0) {
            return 0.0f;
        }
        int length = L2.length;
        float f12 = 0.0f;
        for (int i12 = 0; i12 < length; i12++) {
            String str3 = L2[i12];
            int length2 = L.length;
            int i13 = 0;
            float f13 = 0.0f;
            while (i13 < length2) {
                String str4 = L[i13];
                if (str3.equals(str4)) {
                    strArr = L;
                    i10 = length;
                    f10 = 1.0f;
                } else {
                    int max = Math.max(str3.length(), str4.length());
                    if (max < 4) {
                        strArr = L;
                        i10 = length;
                        f10 = 0.0f;
                    } else {
                        int i14 = 0;
                        while (i14 < Math.min(str3.length(), str4.length()) && str3.charAt(i14) == str4.charAt(i14)) {
                            i14++;
                        }
                        int min = Math.min(str3.length(), str4.length());
                        if (i14 >= 4) {
                            f8 = 1.0f;
                            if (i14 >= Math.ceil(min * 0.6f)) {
                                f10 = 0.88f;
                                strArr = L;
                                i10 = length;
                            }
                        } else {
                            f8 = 1.0f;
                        }
                        int[] iArr = new int[str4.length() + 1];
                        int[] iArr2 = new int[str4.length() + 1];
                        for (int i15 = 0; i15 <= str4.length(); i15++) {
                            iArr[i15] = i15;
                        }
                        int i16 = 1;
                        while (i16 <= str3.length()) {
                            iArr2[0] = i16;
                            String[] strArr2 = L;
                            int i17 = 1;
                            while (i17 <= str4.length()) {
                                int i18 = i17 - 1;
                                int i19 = iArr[i18];
                                int i20 = length;
                                int[] iArr3 = iArr;
                                if (str3.charAt(i16 - 1) == str4.charAt(i18)) {
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
                            L = strArr2;
                            iArr2 = iArr4;
                        }
                        strArr = L;
                        i10 = length;
                        float f14 = max;
                        f10 = f8 - (iArr[str4.length()] / f14);
                        if (f10 < 0.72f) {
                            if (min >= 5 && min / f14 >= 0.65f) {
                                if (str3.length() >= 2 && str4.length() >= 2) {
                                    ArrayList arrayList = new ArrayList();
                                    ArrayList arrayList2 = new ArrayList();
                                    for (int i21 = 0; i21 <= str3.length() - 2; i21++) {
                                        arrayList.add(str3.substring(i21, i21 + 2));
                                    }
                                    for (int i22 = 0; i22 <= str4.length() - 2; i22++) {
                                        arrayList2.add(str4.substring(i22, i22 + 2));
                                    }
                                    boolean[] zArr = new boolean[arrayList2.size()];
                                    int size = arrayList.size();
                                    int i23 = 0;
                                    int i24 = 0;
                                    while (i24 < size) {
                                        Object obj = arrayList.get(i24);
                                        i24++;
                                        String str5 = (String) obj;
                                        int i25 = 0;
                                        while (true) {
                                            if (i25 >= arrayList2.size()) {
                                                break;
                                            }
                                            if (!zArr[i25] && str5.equals(arrayList2.get(i25))) {
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
                    }
                }
                f13 = Math.max(f13, f10);
                i13++;
                L = strArr;
                length = i10;
            }
            f12 += f13;
        }
        return f12 / L2.length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x03a7, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{52, -43, 11, -36}, new byte[]{78, -80, 121, -77, -48, -51, -22, 26})) != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x03bd, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{-57, -85, -114, -100, kotlin.jvm.internal.ByteCompanionObject.MIN_VALUE, -106}, new byte[]{22, 41, 95, 28, 80, 46, -113, -118})) != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x03d3, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{-62, 84, -12, -35, 83, -41}, new byte[]{18, -32, 36, 111, -125, 98, 101, -91})) != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x03e8, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{-94, -36, -57, 44, 26, 126}, new byte[]{114, 104, 23, -98, -54, -50, 73, -4})) != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x03fe, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{-13, 58, -107}, new byte[]{-121, 77, -6, -101, 100, -30, 111, 98})) != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0414, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{-29, 37, -25}, new byte[]{-116, 75, -126, 34, -7, -32, -93, -109})) != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x043b, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{-89, -25, 15, 122, -8, 23}, new byte[]{-44, -126, 108, 21, -106, 115, -94, -113})) != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0464, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{-1, -53, 52, -74, -11, 109, -79, -53, -1, -60, 53, -117, -11, 111}, new byte[]{47, 118, -27, 53, 37, -42, 97, 126})) != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x048b, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{125, 121, 73, -117, -46, -106, 12, -126, 125, 120, 73, -117, -46, -109, 13, -80, 124, 72}, new byte[]{-83, -58, -104, 11, 2, 46, -36, 51})) != false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x04a0, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{-122, 78, -41, -19, -29, -62, 9, -27, -122, 79, -41, -19, -29, -57, 9, -22, -122, 72}, new byte[]{86, -15, 6, 109, 51, 122, -39, 84})) != false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x04b5, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{-58, 36, -82, 32, -66, -112, -105, 94, -58, 37, -82, 32, -66, -107, -105, 95, -57, 20}, new byte[]{22, -101, kotlin.jvm.internal.ByteCompanionObject.MAX_VALUE, -96, 110, 40, 71, -17})) != false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x04d9, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{-41, -106, -20, -8, -111, -56, -107, 81, -41, -104, -20, -9}, new byte[]{6, 20, kotlin.io.encoding.Base64.padSymbol, 120, 65, 125, 68, -45})) != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x04ee, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{-32, -40, -43, -75, 10, -30, -11, 83, -31, -30, -44, -116}, new byte[]{49, 90, 4, 53, -38, 87, 36, -47})) != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0288, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{29, 83, 65, 47, 124, -39, -112, 78, 28, 103, 65, 35}, new byte[]{-51, -20, -111, -102, -83, 89, 64, -4})) != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0416, code lost:
    
        r4 = e0.m.h(new byte[]{-115}, new byte[]{-68, -99, 29, 119, 44, 90, 74, 88});
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x029e, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{-117, 76, 96, -51, 72, -16, -87, -117, -117, 67, 97, -9}, new byte[]{91, -13, -80, 120, -103, 112, 121, 57})) != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02b4, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{-21, 89, -64, 126, -96, -105, 62, 15, -21, 85, -63, 69}, new byte[]{59, -21, 17, -4, 112, 41, -17, -113})) != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x043d, code lost:
    
        r4 = e0.m.h(new byte[]{-23}, new byte[]{-37, 122, 16, 4, -53, -64, -55, -12});
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02ca, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{68, 83, 31, 72, -5, 116, 47, 75, 68, 81, 31, 69}, new byte[]{-108, -31, -50, -54, 43, -54, -2, -53})) != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02e0, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{79, 16, 27, 43, 60, -18, -127, 97, 79, 17, 27, 43, 60, -20, kotlin.jvm.internal.ByteCompanionObject.MIN_VALUE, 83}, new byte[]{-97, -81, -54, -85, -20, 86, 81, -48})) != false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x04b7, code lost:
    
        r4 = e0.m.h(new byte[]{-92, -48, 123, 54, 81, 30, -83, 88, -92, -47, 123, 54}, new byte[]{116, 111, -86, -74, -127, -90, 125, -23});
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02f6, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{-65, -7, -63, 15, -83, 73, 60, 86, -65, -8, -63, 15, -83, 75, 60, 95}, new byte[]{111, 70, 16, -113, 125, -15, -20, -25})) != false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x030c, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{-90, 95, 124, 50, -71, 38, 107, 1, -90, 94, 124, 50, -71, 36, 107, 5}, new byte[]{118, -32, -83, -78, 105, -98, -69, -80})) != false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0322, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{45, -85, 119, -118, 68}, new byte[]{89, -61, 5, -17, 33, -86, -115, 9})) != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x04f0, code lost:
    
        r4 = e0.m.h(new byte[]{-53}, new byte[]{-8, -51, -30, -10, 112, 102, -104, 82});
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0338, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{44, -28, 57, 33, -76}, new byte[]{88, -116, 80, 83, -48, 122, 74, -30})) != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x034e, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{23, 51, -71, -15, 105}, new byte[]{113, 90, -53, -126, 29, 104, -31, 112})) != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0364, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{-53, 103, -5, 71, -19, 123, -4, -96}, new byte[]{27, -39, 43, -13, kotlin.io.encoding.Base64.padSymbol, -58, 44, 16})) != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x037a, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{100, 96, 110, 63, -4, -4, -122, 96}, new byte[]{-76, -34, -66, -117, 44, 68, 86, -35})) != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0390, code lost:
    
        if (r4.equals(e0.m.h(new byte[]{-83, -27, 26, 80, 73, 52, 6, -101}, new byte[]{125, 88, -54, -18, -103, -113, -41, 23})) != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0466, code lost:
    
        r4 = e0.m.h(new byte[]{11}, new byte[]{59, 19, kotlin.jvm.internal.ByteCompanionObject.MIN_VALUE, 72, -89, -91, -105, 29});
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:68:0x0271. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String[] L(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 2558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.x.L(java.lang.String):java.lang.String[]");
    }

    public static float P(String str, String str2) {
        float f8;
        float f10;
        float f11;
        float f12;
        String[] L = L(str);
        StringBuilder sb = new StringBuilder();
        if (L.length > 0) {
            sb.append((CharSequence) L[0]);
            for (int i10 = 1; i10 < L.length; i10++) {
                sb.append((CharSequence) " ");
                sb.append((CharSequence) L[i10]);
            }
        }
        String sb2 = sb.toString();
        String[] L2 = L(str2);
        StringBuilder sb3 = new StringBuilder();
        if (L2.length > 0) {
            sb3.append((CharSequence) L2[0]);
            for (int i11 = 1; i11 < L2.length; i11++) {
                sb3.append((CharSequence) " ");
                sb3.append((CharSequence) L2[i11]);
            }
        }
        String sb4 = sb3.toString();
        String w = w(sb2);
        String w9 = w(sb4);
        float f13 = 0.0f;
        if (!w.isEmpty() && !w9.isEmpty()) {
            if (w.equals(w9)) {
                f12 = 0.12f;
            } else {
                f12 = -0.35f;
            }
            f13 = 0.0f + f12;
        }
        boolean q8 = q(sb2, e0.m.h(new byte[]{107, -116, 120, -81, -113, -101, -91, 112, 106, -80}, new byte[]{-70, 13, -88, 23, 95, 47, 117, -59}), e0.m.h(new byte[]{-44, -62, -74, 122}, new byte[]{-89, -89, -41, 14, -74, -79, -89, 50}));
        boolean q9 = q(sb4, e0.m.h(new byte[]{121, -103, -26, -41, ByteCompanionObject.MIN_VALUE, 22, 53, -15, 120, -91}, new byte[]{-88, 24, 54, 111, 80, -94, -27, 68}), e0.m.h(new byte[]{85, 87, -71, -37}, new byte[]{38, 50, -40, -81, -63, 94, 70, -2}));
        boolean q10 = q(sb2, e0.m.h(new byte[]{56, 68, -89, -90, -40, -117}, new byte[]{-23, -60, 118, 37, 8, 48, 6, 120}), e0.m.h(new byte[]{62, -97, -112, 54, -28}, new byte[]{73, -9, -11, 83, -120, -78, 57, 51}));
        boolean q11 = q(sb4, e0.m.h(new byte[]{111, 3, 87, -18, 87, -7}, new byte[]{-66, -125, -122, 109, -121, 66, -56, 109}), e0.m.h(new byte[]{-107, 43, 25, -119, -55}, new byte[]{-30, 67, 124, -20, -91, 95, 124, 89}));
        float f14 = -0.16f;
        float f15 = 0.08f;
        if (q8) {
            if (q9) {
                f11 = 0.08f;
            } else {
                f11 = -0.16f;
            }
            f13 += f11;
        }
        if (q10) {
            if (q11) {
                f10 = 0.08f;
            } else {
                f10 = -0.16f;
            }
            f13 += f10;
        }
        boolean q12 = q(sb2, e0.m.h(new byte[]{16, 90, 62, -111, 21, -106, -104, -13, 17, 106, 62, -102, 21, -103}, new byte[]{-64, -24, -18, 47, -59, 34, 72, 75}), e0.m.h(new byte[]{-67, 28, -78, 105, -86, 16}, new byte[]{-39, 110, -37, 31, -49, 98, 87, 113}));
        boolean q13 = q(sb4, e0.m.h(new byte[]{91, 28, -75, -127, 86, -108, 82, -31, 90, 44, -75, -118, 86, -101}, new byte[]{-117, -82, 101, 63, -122, 32, -126, 89}), e0.m.h(new byte[]{44, -74, -32, 57, 110, -124}, new byte[]{72, -60, -119, 79, 11, -10, -98, -54}));
        boolean q14 = q(sb2, e0.m.h(new byte[]{12, -73, -22, -36, -22, -108, 110, 94, 12, -72, -22, -38, -21, -83, 110, 95}, new byte[]{-36, 8, 58, 108, 59, 21, -65, -33}), e0.m.h(new byte[]{97, -59, -106, 113, 98, 63, -95, 79, 99}, new byte[]{17, -92, -27, 2, 7, 81, -58, 42}));
        boolean q15 = q(sb4, e0.m.h(new byte[]{-122, -84, 42, 123, 96, 101, 59, 111, -122, -93, 42, 125, 97, 92, 59, 110}, new byte[]{86, 19, -6, -53, -79, -28, -22, -18}), e0.m.h(new byte[]{28, -22, -35, -101, 77, 7, -105, 70, 30}, new byte[]{108, -117, -82, -24, 40, 105, -16, 35}));
        if (q12) {
            if (q13) {
                f8 = 0.08f;
            } else {
                f8 = -0.16f;
            }
            f13 += f8;
        }
        if (q14) {
            if (q15) {
                f14 = 0.08f;
            }
            f13 += f14;
        }
        String z9 = z(sb2);
        String z10 = z(sb4);
        if (!z9.isEmpty() && !z10.isEmpty()) {
            if (!z9.equals(z10)) {
                f15 = -0.1f;
            }
            return f13 + f15;
        }
        return f13;
    }

    public static void f(x xVar, String str) {
        if (xVar.T && !xVar.f6284o) {
            xVar.s().b(System.currentTimeMillis(), "", e0.m.h(new byte[]{-92, -8, -98, -54, 82}, new byte[]{-44, -112, -15, -92, 55, 95, 32, -55}));
            xVar.U = xVar.s().e();
            if (str == null) {
                str = "";
            }
            xVar.f6290x = str;
            xVar.r().e(e0.m.h(new byte[]{96, 89, 15, -20, 22, -64, -77, 124, 98, 65, 7, -15, 17}, new byte[]{3, 53, 110, -98, ByteCompanionObject.MAX_VALUE, -90, -38, 31}), e0.m.h(new byte[]{111, -103, -97, 26, 79}, new byte[]{29, -10, -22, 110, 42, 113, 31, -54}), e0.m.h(new byte[]{-92, -25, -59, 54, 31}, new byte[]{-44, -113, -86, 88, 122, -25, -106, 108}), e0.m.h(new byte[]{99, -97, 77, 96, -123, -48}, new byte[]{19, -19, 34, 13, -11, -92, 11, 40}), xVar.f6290x, e0.m.h(new byte[]{3, -107, 2, 74, 81, -39, -127, -2, 12, -97, 30, 74, 121, -40}, new byte[]{98, -5, 113, Base64.padSymbol, 52, -85, -42, -105}), Long.valueOf(Math.max(0L, xVar.U - System.currentTimeMillis())));
            xVar.N(xVar.f6290x);
        }
    }

    public static Boolean g() {
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
            if (com.google.protobuf.q.d(Long.MAX_VALUE, h0.b.a().j()) >= Long.parseLong(new String(com.google.protobuf.q.x(new byte[]{-22}, new byte[]{-38, -62, -74, -68, -60, -108, 18, 112}, h0.b.o(), com.google.protobuf.q.h(e0.m.f1970g, h0.b.o(), new String(bArr2)), 0)))) {
                z9 = false;
            }
            return Boolean.valueOf(z9);
        }
        return Boolean.FALSE;
    }

    public static float[] j(float[][] fArr, long[] jArr, int i10, int i11) {
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

    public static boolean q(String str, String... strArr) {
        for (String str2 : strArr) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public static double u(long j10) {
        if (j10 == 0) {
            return 0.0d;
        }
        return Math.max(0L, System.nanoTime() - j10) / 1000000.0d;
    }

    public static String w(String str) {
        for (String str2 : str.split(e0.m.h(new byte[]{-87, 67, 112}, new byte[]{-11, 48, 91, 76, 70, -21, 62, -82}))) {
            if (str2.equals(e0.m.h(new byte[]{16, 89, 58, -40, 80, -97, 91, 39}, new byte[]{ByteCompanionObject.MAX_VALUE, 41, 95, -74, 38, -6, 41, 69})) || str2.equals(e0.m.h(new byte[]{-95, -77, 62, 36, 56, -104, 78, 89, -95, -73, 34, 38, 52, -117, 64}, new byte[]{-47, -46, 76, 80, 81, -7, 34, 54})) || str2.equals(e0.m.h(new byte[]{123, -65, 14, 3, -122, 92, -105, 124, 122}, new byte[]{24, -45, 97, 112, -29, 42, -14, 14})) || str2.equals(e0.m.h(new byte[]{95, 8, 27, 101, -26, 76}, new byte[]{48, 102, 109, 0, -108, 46, 31, 88})) || str2.equals(e0.m.h(new byte[]{28, 60, -12, -2, 54, 13, 21}, new byte[]{115, 90, -110, -120, 83, ByteCompanionObject.MAX_VALUE, 119, -47})) || str2.equals(e0.m.h(new byte[]{64, -126, 75, 5, 11, 117, -78, -116, 95, -119, 90, 21}, new byte[]{41, -20, 40, 119, 110, 20, -63, -23})) || str2.equals(e0.m.h(new byte[]{-35, 48, 124, -91, -45, -69, 44, -122, -49, 48, 109, -75}, new byte[]{-71, 85, 31, -41, -74, -38, 95, -29}))) {
                return str2;
            }
        }
        return "";
    }

    public static String z(String str) {
        for (String str2 : str.split(e0.m.h(new byte[]{105, -77, 22}, new byte[]{53, -64, Base64.padSymbol, -17, -21, 94, 29, 7}))) {
            if (str2.equals(e0.m.h(new byte[]{38}, new byte[]{22, 8, -105, -94, -64, 45, -18, 5})) || str2.equals(e0.m.h(new byte[]{-82}, new byte[]{-97, 126, -108, -12, -12, 114, 35, -54})) || str2.equals(e0.m.h(new byte[]{70}, new byte[]{116, -9, -46, -71, -20, -11, 8, -70})) || str2.equals(e0.m.h(new byte[]{16}, new byte[]{35, 14, 95, -45, 106, Base64.padSymbol, 99, 62}))) {
                return str2;
            }
        }
        return "";
    }

    public final j0.e A(String str, boolean z9) {
        String b10 = d1.b(str);
        h0.b.a();
        ArrayList i10 = h0.b.f().i(j0.c.e);
        int size = i10.size();
        String str2 = "";
        int i11 = -1;
        j0.e eVar = null;
        boolean z10 = false;
        int i12 = 0;
        while (i12 < size) {
            Object obj = i10.get(i12);
            i12++;
            o0 o0Var = (o0) obj;
            if (o0Var.c && j0.f.d(o0Var.f6217b)) {
                String b11 = d1.b(o0Var.f6216a);
                if (!b11.isEmpty()) {
                    boolean equals = b10.equals(b11);
                    if (!equals) {
                        if (!z9 && !o0Var.d) {
                            if (!ai.onnxruntime.a.m(" ", b10, " ").contains(" " + b11 + " ")) {
                            }
                        }
                    }
                    if (!equals) {
                        if (a.a.f(j0.f.g(o0Var.f6217b)) == null) {
                            if (this.f6289v.f6076b.containsKey(j0.f.g(o0Var.f6217b))) {
                            }
                        }
                    }
                    String g10 = j0.f.g(o0Var.f6217b);
                    if (b11.length() > i11) {
                        j0.e eVar2 = o0Var.f6217b;
                        i11 = b11.length();
                        eVar = eVar2;
                        z10 = false;
                        str2 = g10;
                    } else if (b11.length() == i11 && !g10.equals(str2)) {
                        z10 = true;
                    }
                }
            }
        }
        if (z10) {
            return null;
        }
        return eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x055d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x055e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0446  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final w0.u B(int r38, java.lang.String r39, long r40) {
        /*
            Method dump skipped, instructions count: 2612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.x.B(int, java.lang.String, long):w0.u");
    }

    public final void C(String str) {
        this.F = str;
        a();
    }

    public final synchronized byte[] D() {
        int i10 = this.R;
        if (i10 <= 0) {
            return null;
        }
        byte[] bArr = new byte[i10];
        int i11 = this.S - i10;
        byte[] bArr2 = this.N;
        int length = (i11 + bArr2.length) % bArr2.length;
        int min = Math.min(i10, bArr2.length - length);
        System.arraycopy(this.N, length, bArr, 0, min);
        int i12 = this.R;
        if (min < i12) {
            System.arraycopy(this.N, 0, bArr, min, i12 - min);
        }
        return bArr;
    }

    public final boolean E(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        h0.b.a();
        ArrayList e = h0.b.f().e();
        int size = e.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = e.get(i10);
            i10++;
            j0.e eVar = (j0.e) obj;
            if (j0.f.d(eVar)) {
                linkedHashMap.put(j0.f.g(eVar), eVar);
            }
        }
        Pattern pattern = j1.f6130a;
        a5.h p9 = a.a.p(d1.a(str), linkedHashMap.keySet(), this.f6289v.f6076b);
        r().e(e0.m.h(new byte[]{93, -24, 92, -72, 49, -11, -64, 41, 90, -25, 68, -92, 44, -24, -20}, new byte[]{52, -122, 40, -35, 95, -127, -97, 72}), e0.m.h(new byte[]{-13, -4, 66}, new byte[]{-127, -99, 53, 116, -35, 103, -43, 85}), str, e0.m.h(new byte[]{50, 10, 120, 77, 30}, new byte[]{67, ByteCompanionObject.MAX_VALUE, 29, 63, 103, -36, 83, 76}), d1.a(str), e0.m.h(new byte[]{32, 122, -42, 115, -46, 79}, new byte[]{83, 14, -73, 7, -89, 60, 123, -117}), ((z0) p9.c).name(), e0.m.h(new byte[]{91, 124, -12, -107, 39, -98}, new byte[]{41, 25, -107, -26, 72, -16, -107, -117}), (String) p9.e, e0.m.h(new byte[]{-79, -112, -92}, new byte[]{-38, -11, -35, 58, -114, -27, -121, ByteCompanionObject.MAX_VALUE}), (String) p9.d, e0.m.h(new byte[]{-88, -115, -21, 11, 5, 120, -36, 89, -84, -70, -23, 22, 0, 118, -48, 70}, new byte[]{-55, -5, -118, 98, 105, 25, -66, 53}), Integer.valueOf(linkedHashMap.size()), e0.m.h(new byte[]{-48, -114, -108, -17, ByteCompanionObject.MAX_VALUE, 47, -13, -28}, new byte[]{-72, -17, -26, -117, 41, 74, -121, -117}), Boolean.valueOf(p9.i()));
        if (((String) p9.e).equals(e0.m.h(new byte[]{48, 9, -71, 52, 68, 29, 26, 114, 50, 16, -81, 53, 76, 7, 20, 66, 51}, new byte[]{93, 96, -54, 71, 45, 115, 125, 45})) || ((String) p9.e).matches(e0.m.h(new byte[]{-115, -38, -1, -6, 95, -21, 102, -73, -46, -103, -95, -30, 89, -9, 126, -84, -41, -112, -85, -26, 74, -30, 110, -73, -45, ByteCompanionObject.MIN_VALUE, -89, -30, 78, -84, 56, -10, -113}, new byte[]{-91, -27, -59, -115, 54, -123, 2, -40}))) {
            HashSet hashSet = new HashSet();
            for (String str2 : d1.a(str).split(e0.m.h(new byte[]{125, 85, 49}, new byte[]{33, 38, 26, -16, 21, -44, 84, -70}))) {
                if (j1.f6133g.matcher(str2).matches() || j1.g(str2)) {
                    hashSet.add(str2);
                }
            }
            if (hashSet.size() > 1) {
                i(str, e0.m.h(new byte[]{-77, -99, -44, 82, 6, 95, -30, 112, -71, -100, -35, 107, 5, 70, -28, 118, -79, -122, -45, 91, 4}, new byte[]{-48, -14, -70, 52, 106, 54, -127, 4}));
                return true;
            }
        }
        if (!p9.i()) {
            if (G(str)) {
                Log.w(this.f6262a, e0.m.h(new byte[]{22, -30, -108, 6, 18, -126, 105, 121, 60, -29, -99, 64, 27, -109, 107, 110, 33, -83, -113, 19, 27, -103, 42, 125, Base64.padSymbol, -1, -101, 19, 27, -104, 49, 45, 39, -24, -100, 21, 13, -126, 100, 106, 117, -7, -107, 64, 25, -98, 111, 126, 38}, new byte[]{85, -115, -6, 96, 126, -21, 10, 13}));
                i(str, e0.m.h(new byte[]{106, 81, -65, -117, -42, -123, -43, -60, 104, 94, -73, -110, -34, -118, -2}, new byte[]{7, 48, -47, -2, -73, -23, -118, -89}));
                return true;
            }
            j0.e A = A(str, true);
            if (A != null) {
                c0(e0.m.h(new byte[]{47, -25, -115, -118, 113, -124, -21, -35, 58, -25, ByteCompanionObject.MIN_VALUE, -117}, new byte[]{66, -122, -29, -1, 16, -24, -76, -72}), j0.f.g(A), "", e0.m.h(new byte[]{-2, 116, 89, -34, 63, -61, 4, 46, -17, 110, 82, -53}, new byte[]{-117, 7, 60, -84, 96, -95, 109, 64}));
                Log.i(this.f6262a, e0.m.h(new byte[]{11, -62, -28, -9, 79, -69, -88, -3, 32, -49, -28, -8, 27, -8, -86, -15, 35, -37, -21, -16, 27, -10, -92, -24, 45, -46, -32, -16, 1, -69}, new byte[]{78, -70, -123, -108, 59, -101, -59, -100}) + j0.f.g(A));
                v(A, -1);
                return true;
            }
            u y9 = y(str);
            if (y9 != null) {
                c0(e0.m.h(new byte[]{81, -78, 91, 24, 88, 9, -121, 94, 87, -85, 78, 26, 64}, new byte[]{50, -45, 47, 121, 52, 102, -32, 1}), j0.f.g(y9.f6234b), y9.f6233a, e0.m.h(new byte[]{114, 103, 114, 126, 63, 112, -108, 87, 97, 110, 116, 126, 32, 122}, new byte[]{17, 6, 6, 31, 83, 31, -13, 8}));
                Log.i(this.f6262a, e0.m.h(new byte[]{42, -27, 10, 50, -12, 16, 90, -63, 25, -20, 12, 50, -21, 26, 29, -116, 8, -16, 29, 59, -3, 27, 7, -63}, new byte[]{105, -124, 126, 83, -104, ByteCompanionObject.MAX_VALUE, Base64.padSymbol, -31}) + y9.f6233a);
                v(y9.f6234b, -1);
                return true;
            }
            u x9 = x(str);
            if (x9 != null) {
                c0(e0.m.h(new byte[]{104, -38, 38, -81, -39, 99, -73, -57, 104, -43, 59}, new byte[]{9, -74, 79, -50, -86, 60, -46, -65}), j0.f.g(x9.f6234b), x9.f6233a, e0.m.h(new byte[]{40, 57, -83, -101, 92, 24, 5, -39, 59, 36, -83, -101, 91, 24}, new byte[]{75, 76, -33, -6, 40, 125, 97, -122}));
                Log.i(this.f6262a, e0.m.h(new byte[]{98, 58, 62, -44, 76, 119, 19, -55, 67, 43, 43, -34, 87, 57, 19, -63, 7, 50, 55, -59, 89, 36, 23, -115, 74, 35, 43, -44, 80, 50, 22, -105, 7}, new byte[]{39, 66, 95, -73, 56, 87, 114, -83}) + x9.f6233a);
                v(x9.f6234b, -1);
                return true;
            }
        }
        z0 z0Var = (z0) p9.c;
        z0 z0Var2 = z0.c;
        if (z0Var == z0Var2) {
            return false;
        }
        if (z0Var != z0Var2 && (z0Var != z0.d || !((String) p9.e).equals(e0.m.h(new byte[]{-57, 70, -126, 30, 76, 39, -109, -30, -59, 95, -108, 31, 68, Base64.padSymbol, -99, -46, -60}, new byte[]{-86, 47, -15, 109, 37, 73, -12, -67})))) {
            if (((z0) p9.c) == z0.f6298b) {
                c0(e0.m.h(new byte[]{56, -63, 65, 14, 55, 100}, new byte[]{81, -81, 53, 107, 89, 16, 99, -27}), (String) p9.d, "", (String) p9.e);
                j0.e eVar2 = (j0.e) linkedHashMap.get((String) p9.d);
                String str3 = this.f6262a;
                StringBuilder sb = new StringBuilder();
                com.google.protobuf.q.u(new byte[]{1, -117, 37, -1, -2, 116, -79, 110, Base64.padSymbol, ByteCompanionObject.MIN_VALUE, 35, -29, -83, 39}, new byte[]{72, -27, 81, -102, -112, 0, -111, 31}, sb, str);
                sb.append(e0.m.h(new byte[]{-84, 122, -110, 8, 8, 110, -41, -69, -18, 50, -113}, new byte[]{-117, 86, -78, 101, 105, 26, -76, -45}));
                sb.append((String) p9.d);
                sb.append(e0.m.h(new byte[]{-26, -10, 40, 60, 87, 38, -9, -78}, new byte[]{-54, -42, 91, 80, 56, 82, -124, -113}));
                sb.append((String) p9.e);
                Log.i(str3, sb.toString());
                if (eVar2 != null) {
                    v(eVar2, -1);
                }
                return true;
            }
            String str4 = this.f6262a;
            StringBuilder sb2 = new StringBuilder();
            com.google.protobuf.q.u(new byte[]{106, 87, -99, 109, -115, 70, 37, 41, 70, 83, -116, 107, -105, 87, 97, 123, 82, 76, -116, 122, -102, 15, 34}, new byte[]{35, 57, -23, 8, -29, 50, 5, 91}, sb2, str);
            sb2.append(e0.m.h(new byte[]{-122, -35, -28, 95, -90, 98, 88, -102, -49, -52}, new byte[]{-95, -15, -60, 45, -61, 3, 43, -11}));
            sb2.append((String) p9.e);
            Log.i(str4, sb2.toString());
            i(str, (String) p9.e);
            return true;
        }
        r().e(e0.m.h(new byte[]{12, 18, -83, 32, 65, 47, -13, -41, 32, 17, -95, 45, 67, 57, -5, -41, 20}, new byte[]{ByteCompanionObject.MAX_VALUE, 119, -64, 65, 47, 91, -102, -76}), e0.m.h(new byte[]{ByteCompanionObject.MIN_VALUE, 78, -70, 49, 73}, new byte[]{-15, 59, -33, 67, 48, -85, -10, -42}), d1.a(str), e0.m.h(new byte[]{25, 114, 50, 92, 63, -17}, new byte[]{107, 23, 83, 47, 80, -127, 92, -40}), (String) p9.e, e0.m.h(new byte[]{-68, -108, 70, 108, 17, -29, 13, 91}, new byte[]{-44, -11, 52, 8, 71, -122, 121, 52}), Boolean.FALSE);
        this.f6291y = (String) p9.e;
        Log.d(this.f6262a, e0.m.h(new byte[]{-39, 53, -5, -11, 27, -51, -71, -53, -2, 56, -32, -3, 5, -43, -4, -42, -11, 96, -81, -13, 29, -36, -6, -55, -7, 53, -24, -80, 6, -36, -12, -61, -2, 47, -26, -13, 85, -38, -8, -52, -12, 50, -21, -15, 1, -36, -22, -126, -14, 62, -23, -1, 7, -36, -71, -63, -4, 58, -3, -7, 19, -48, -6, -61, -28, 50, -32, -2, 79, -103}, new byte[]{-112, 91, -113, -112, 117, -71, -103, -94}).concat((String) p9.e));
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7 A[Catch: all -> 0x0088, TryCatch #0 {all -> 0x0088, blocks: (B:14:0x006e, B:16:0x0073, B:19:0x0079, B:21:0x007f, B:27:0x0090, B:29:0x00a7, B:32:0x00b5, B:37:0x00bd, B:39:0x00c3, B:46:0x00d4, B:47:0x00d8, B:49:0x00dc, B:50:0x00e1, B:52:0x00f5, B:54:0x0101, B:60:0x011c, B:63:0x0152, B:64:0x01fb, B:66:0x01fd, B:67:0x0242, B:77:0x0110, B:78:0x02a9, B:80:0x02ad, B:81:0x02bb, B:85:0x02bd), top: B:13:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d4 A[Catch: all -> 0x0088, TryCatch #0 {all -> 0x0088, blocks: (B:14:0x006e, B:16:0x0073, B:19:0x0079, B:21:0x007f, B:27:0x0090, B:29:0x00a7, B:32:0x00b5, B:37:0x00bd, B:39:0x00c3, B:46:0x00d4, B:47:0x00d8, B:49:0x00dc, B:50:0x00e1, B:52:0x00f5, B:54:0x0101, B:60:0x011c, B:63:0x0152, B:64:0x01fb, B:66:0x01fd, B:67:0x0242, B:77:0x0110, B:78:0x02a9, B:80:0x02ad, B:81:0x02bb, B:85:0x02bd), top: B:13:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00dc A[Catch: all -> 0x0088, TryCatch #0 {all -> 0x0088, blocks: (B:14:0x006e, B:16:0x0073, B:19:0x0079, B:21:0x007f, B:27:0x0090, B:29:0x00a7, B:32:0x00b5, B:37:0x00bd, B:39:0x00c3, B:46:0x00d4, B:47:0x00d8, B:49:0x00dc, B:50:0x00e1, B:52:0x00f5, B:54:0x0101, B:60:0x011c, B:63:0x0152, B:64:0x01fb, B:66:0x01fd, B:67:0x0242, B:77:0x0110, B:78:0x02a9, B:80:0x02ad, B:81:0x02bb, B:85:0x02bd), top: B:13:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f5 A[Catch: all -> 0x0088, TryCatch #0 {all -> 0x0088, blocks: (B:14:0x006e, B:16:0x0073, B:19:0x0079, B:21:0x007f, B:27:0x0090, B:29:0x00a7, B:32:0x00b5, B:37:0x00bd, B:39:0x00c3, B:46:0x00d4, B:47:0x00d8, B:49:0x00dc, B:50:0x00e1, B:52:0x00f5, B:54:0x0101, B:60:0x011c, B:63:0x0152, B:64:0x01fb, B:66:0x01fd, B:67:0x0242, B:77:0x0110, B:78:0x02a9, B:80:0x02ad, B:81:0x02bb, B:85:0x02bd), top: B:13:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011c A[Catch: all -> 0x0088, TryCatch #0 {all -> 0x0088, blocks: (B:14:0x006e, B:16:0x0073, B:19:0x0079, B:21:0x007f, B:27:0x0090, B:29:0x00a7, B:32:0x00b5, B:37:0x00bd, B:39:0x00c3, B:46:0x00d4, B:47:0x00d8, B:49:0x00dc, B:50:0x00e1, B:52:0x00f5, B:54:0x0101, B:60:0x011c, B:63:0x0152, B:64:0x01fb, B:66:0x01fd, B:67:0x0242, B:77:0x0110, B:78:0x02a9, B:80:0x02ad, B:81:0x02bb, B:85:0x02bd), top: B:13:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01fd A[Catch: all -> 0x0088, TryCatch #0 {all -> 0x0088, blocks: (B:14:0x006e, B:16:0x0073, B:19:0x0079, B:21:0x007f, B:27:0x0090, B:29:0x00a7, B:32:0x00b5, B:37:0x00bd, B:39:0x00c3, B:46:0x00d4, B:47:0x00d8, B:49:0x00dc, B:50:0x00e1, B:52:0x00f5, B:54:0x0101, B:60:0x011c, B:63:0x0152, B:64:0x01fb, B:66:0x01fd, B:67:0x0242, B:77:0x0110, B:78:0x02a9, B:80:0x02ad, B:81:0x02bb, B:85:0x02bd), top: B:13:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0110 A[Catch: all -> 0x0088, TryCatch #0 {all -> 0x0088, blocks: (B:14:0x006e, B:16:0x0073, B:19:0x0079, B:21:0x007f, B:27:0x0090, B:29:0x00a7, B:32:0x00b5, B:37:0x00bd, B:39:0x00c3, B:46:0x00d4, B:47:0x00d8, B:49:0x00dc, B:50:0x00e1, B:52:0x00f5, B:54:0x0101, B:60:0x011c, B:63:0x0152, B:64:0x01fb, B:66:0x01fd, B:67:0x0242, B:77:0x0110, B:78:0x02a9, B:80:0x02ad, B:81:0x02bb, B:85:0x02bd), top: B:13:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02ad A[Catch: all -> 0x0088, TryCatch #0 {all -> 0x0088, blocks: (B:14:0x006e, B:16:0x0073, B:19:0x0079, B:21:0x007f, B:27:0x0090, B:29:0x00a7, B:32:0x00b5, B:37:0x00bd, B:39:0x00c3, B:46:0x00d4, B:47:0x00d8, B:49:0x00dc, B:50:0x00e1, B:52:0x00f5, B:54:0x0101, B:60:0x011c, B:63:0x0152, B:64:0x01fb, B:66:0x01fd, B:67:0x0242, B:77:0x0110, B:78:0x02a9, B:80:0x02ad, B:81:0x02bb, B:85:0x02bd), top: B:13:0x006e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean F(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 1008
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.x.F(java.lang.String):boolean");
    }

    public final void M() {
        String str = this.f6278j0;
        if (str != null && !str.trim().isEmpty() && System.currentTimeMillis() >= 0) {
            String str2 = this.f6278j0;
            this.f6278j0 = "";
            N(str2);
        }
    }

    public final synchronized void N(String str) {
        if (g().booleanValue()) {
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

    public final void O(b bVar) {
        if (g().booleanValue()) {
            f6259l0 = bVar;
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

    /* JADX WARN: Finally extract failed */
    public final void Q(ArrayList arrayList) {
        int readInt;
        String str = a.f6059a;
        File d = a.d(new File(this.f6282m.getFilesDir(), a.f6060b));
        if (d != null) {
            File file = new File(d, e0.m.h(new byte[]{49, 52, 88, -64, 54, 30, 41, 74, 55, 117, 89, -42, 55, 25}, new byte[]{69, 91, 51, -91, 88, 119, 83, 47}));
            File file2 = new File(d, e0.m.h(new byte[]{-91, -123, -78, -112, 3, -100, -49, -87, -81, -123, -65, -120, 71, -107, -109, -22, -69, -99, -65, -120, 6, -35, -49, -87, -68, -56, -16, -117, 4, -98, -34}, new byte[]{-56, -16, -34, -28, 106, -16, -90, -57}));
            File file3 = new File(d, e0.m.h(new byte[]{-80, 25, 118, 70, 24, -83, 53, -103, -18, 31, 122, 73, 18, -80, 56, -101, -73, 25, 104, 10, 67, -9, 63, -101, -96, 20, 126}, new byte[]{-61, 124, 27, 39, 118, -39, 92, -6}));
            if (this.f6287s == null) {
                HashMap hashMap = new HashMap(300000);
                JsonReader jsonReader = new JsonReader(new InputStreamReader(new FileInputStream(file), e0.m.h(new byte[]{-74, -14, -15, -104, 13}, new byte[]{-29, -90, -73, -75, 53, -39, 66, -115})));
                try {
                    jsonReader.beginObject();
                    int i10 = 1;
                    while (jsonReader.hasNext()) {
                        if (!e0.m.h(new byte[]{-115, -11, 7, -121, -23}, new byte[]{-32, -102, 99, -30, -123, -70, 85, 13}).equals(jsonReader.nextName())) {
                            jsonReader.skipValue();
                        } else {
                            jsonReader.beginObject();
                            while (jsonReader.hasNext()) {
                                if (!e0.m.h(new byte[]{-78, 17, -97, -53, 123}, new byte[]{-60, 126, -4, -86, 25, -99, -89, -67}).equals(jsonReader.nextName())) {
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
                                        hashMap.put(nextString, new w(i11, nextDouble));
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
                    this.f6287s = new m(hashMap, i10, 1);
                } finally {
                    try {
                        jsonReader.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            }
            if (this.t == null) {
                this.t = OrtEnvironment.getEnvironment();
            }
            if (this.f6288u == null) {
                OrtSession.SessionOptions sessionOptions = new OrtSession.SessionOptions();
                sessionOptions.setIntraOpNumThreads(1);
                sessionOptions.setInterOpNumThreads(1);
                sessionOptions.setCPUArenaAllocator(false);
                sessionOptions.setMemoryPatternOptimization(false);
                this.f6288u = this.t.createSession(file2.getAbsolutePath(), sessionOptions);
            }
            boolean isFile = file3.isFile();
            String str2 = this.f6262a;
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
                                u uVar = (u) obj;
                                String readUTF = dataInputStream.readUTF();
                                String readUTF2 = dataInputStream.readUTF();
                                if (uVar.f6233a.equals(readUTF) && j0.f.g(uVar.f6234b).equals(readUTF2) && (readInt = dataInputStream.readInt()) >= 0 && readInt <= 64) {
                                    uVar.f6235f = new int[readInt];
                                    for (int i13 = 0; i13 < readInt; i13++) {
                                        uVar.f6235f[i13] = dataInputStream.readInt();
                                    }
                                    int readInt2 = dataInputStream.readInt();
                                    if (readInt2 == 384) {
                                        uVar.f6236g = new float[readInt2];
                                        for (int i14 = 0; i14 < readInt2; i14++) {
                                            uVar.f6236g[i14] = dataInputStream.readFloat();
                                        }
                                    }
                                }
                            }
                            dataInputStream.close();
                            Log.i(str2, e0.m.h(new byte[]{-101, 115, -31, -32, -2, 100, -80, 104, -24, 117, -19, -17, -12, 121, -67, 106, -68, 115, -1, -95, -4, ByteCompanionObject.MAX_VALUE, -72, 111, -83, 114, -84, -25, -30, ByteCompanionObject.MAX_VALUE, -76, 43, -85, 119, -17, -23, -11, 42, -7}, new byte[]{-56, 22, -116, -127, -112, 16, -39, 11}) + arrayList.size());
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
                    Log.w(str2, e0.m.h(new byte[]{30, -53, 46, -13, 2, 69, -46, -57, 109, -51, 34, -15, 4, 84, -101, -51, 62, -114, 45, -3, 24, 17, -50, -41, 44, -52, 47, -9}, new byte[]{77, -82, 67, -110, 108, 49, -69, -92}), e);
                }
            }
            int size2 = arrayList.size();
            int i15 = 0;
            while (i15 < size2) {
                Object obj2 = arrayList.get(i15);
                i15++;
                u uVar2 = (u) obj2;
                uVar2.f6235f = this.f6287s.a(e0.m.h(new byte[]{79, -115, -64, -31, 43, 103, 125, 5, 31}, new byte[]{63, -20, -77, -110, 74, 0, 24, 63}) + uVar2.f6233a);
            }
            for (int i16 = 0; i16 < arrayList.size(); i16 += 8) {
                W(arrayList, i16, Math.min(8, arrayList.size() - i16));
            }
            File parentFile = file3.getParentFile();
            StringBuilder sb = new StringBuilder();
            sb.append(file3.getName());
            File file4 = new File(parentFile, com.google.protobuf.q.i(new byte[]{-62, 26, -126, -99}, new byte[]{-20, 116, -25, -22, 57, -75, -69, -115}, sb));
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
                        u uVar3 = (u) obj3;
                        dataOutputStream.writeUTF(uVar3.f6233a);
                        dataOutputStream.writeUTF(j0.f.g(uVar3.f6234b));
                        dataOutputStream.writeInt(uVar3.f6235f.length);
                        for (int i18 : uVar3.f6235f) {
                            dataOutputStream.writeInt(i18);
                        }
                        dataOutputStream.writeInt(uVar3.f6236g.length);
                        for (float f8 : uVar3.f6236g) {
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
                Log.w(str2, e0.m.h(new byte[]{-59, 93, 107, -112, -20, -56, 65, -60, -14, 18, 105, -114, -31, -100, 74, -117, -11, 87, 115, -99, -26, -100, 70, -56, -90, 81, ByteCompanionObject.MAX_VALUE, -97, -32, -115}, new byte[]{-122, 50, 30, -4, -120, -24, 47, -85}), e6);
                file4.delete();
                return;
            }
        }
        n0.b.A(e0.m.h(new byte[]{11, 94, -32, 5, 20, 0, 111, 90, 120, 86, -30, 0, 31, 24, 38, 80, 43, 27, -29, 11, 14, 84, 111, 87, 43, 79, -20, 8, 22, 17, 98}, new byte[]{88, 59, -115, 100, 122, 116, 6, 57}));
    }

    public final void R(String str) {
        boolean z9;
        String str2;
        boolean z10;
        String str3 = str;
        if (!this.T || this.f6284o || str3 == null || str3.trim().isEmpty()) {
            return;
        }
        this.G = System.nanoTime();
        this.f6268e0 = str3;
        this.H = "";
        int i10 = 13;
        r().e(e0.m.h(new byte[]{-15, -99, -13, 96, 120, 27, -127, 48, -12, -101, -16, 108, 117}, new byte[]{-110, -14, -98, 13, 25, 117, -27, 111}), e0.m.h(new byte[]{95, 66, 43}, new byte[]{45, 35, 92, 88, -49, -89, 99, 97}), str3, e0.m.h(new byte[]{46, -72, 9, 39, -120, -7, 15, -126, 37, -77}, new byte[]{64, -41, 123, 74, -23, -107, 102, -8}), d1.b(str3), e0.m.h(new byte[]{58, 114, -75, 14, -63, 39, -30, -87, 26, 107, -89, 16, -48, 60}, new byte[]{91, 5, -44, 103, -75, 78, -116, -50}), Boolean.valueOf(s().c()));
        if (H(str3)) {
            r().e(e0.m.h(new byte[]{-89, ByteCompanionObject.MIN_VALUE, -115, -114, -97, 14}, new byte[]{-60, -31, -29, -19, -6, 98, 60, -48}), e0.m.h(new byte[]{111, -7, 85, 122}, new byte[]{27, -100, 45, 14, 31, -104, 84, 86}), str3);
            C(e0.m.h(new byte[]{-29, 104, -26, -44, 41, 14}, new byte[]{ByteCompanionObject.MIN_VALUE, 9, -120, -73, 76, 98, -18, -108}));
            return;
        }
        if (F(str)) {
            return;
        }
        boolean z11 = true;
        boolean z12 = this.B != null && this.B.f6164i;
        if (z12 || n0.i(str3)) {
            if (A(str3, true) == null && !G(str3)) {
                l0 e02 = e0();
                synchronized (e02) {
                    try {
                        boolean i11 = n0.i(str3);
                        if (!e02.f6165j && (i11 || e02.f6164i)) {
                            if (i11 || !n0.d(str3)) {
                                e02.f6164i = true;
                                e02.d.execute(new androidx.activity.f(e02, str3, e02.f6162g.get(), i10));
                                r().e(e0.m.h(new byte[]{-106, 81, -70, 101, -104, -98, -53, -7, -121, 81, -94, 124, -100, -108}, new byte[]{-11, 62, -41, 8, -7, -16, -81, -90}), e0.m.h(new byte[]{8, 124, -50, -61, -53}, new byte[]{122, 19, -69, -73, -82, 126, -78, -17}), e0.m.h(new byte[]{60, 122, 30, 9, -87}, new byte[]{76, 18, 113, 103, -52, -26, -13, -35}), e0.m.h(new byte[]{64, -29, 7}, new byte[]{50, -126, 112, -119, -108, 29, -87, 47}), str3);
                                this.f6270f0++;
                                this.W++;
                                this.X = "";
                                return;
                            }
                            e02.i0();
                        }
                    } finally {
                    }
                }
            }
            if (z12) {
                this.B.i0();
            }
        }
        if (s().c()) {
            ArrayList arrayList = new ArrayList();
            h0.b.a();
            ArrayList e = h0.b.f().e();
            int size = e.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = e.get(i12);
                i12++;
                j0.e eVar = (j0.e) obj;
                if (j0.f.d(eVar)) {
                    z10 = z11;
                    arrayList.add(j0.f.g(eVar));
                } else {
                    z10 = z11;
                }
                z11 = z10;
            }
            boolean z13 = z11;
            z9 = m(str3, arrayList);
            x0 s5 = s();
            synchronized (s5) {
                try {
                    if (s5.d.equals(e0.m.h(new byte[]{53, -55, 80, -101, 114, -26, 10, -32, 35, -56, 86, -104, 124, -1, 0}, new byte[]{64, -89, 59, -11, 29, -111, 100, -65}))) {
                        str2 = s5.c + " " + str3;
                    } else {
                        str2 = "";
                    }
                } finally {
                }
            }
            if (!z9 && !str2.isEmpty() && m(str2, arrayList)) {
                str3 = str2;
                z9 = z13;
            }
        } else {
            z9 = false;
        }
        String a10 = s().a(str3, z9);
        this.f6290x = "";
        this.f6270f0++;
        this.W++;
        this.X = "";
        this.Z = "";
        this.f6268e0 = a10;
        g1 r = r();
        String h2 = e0.m.h(new byte[]{105, 37, -24, -34, -38, 96, -106, 46, 122, 56, -32, -61, -38, 124, -105, 21}, new byte[]{10, 74, -123, -77, -69, 14, -14, 113});
        String h10 = e0.m.h(new byte[]{79, -29, 115}, new byte[]{Base64.padSymbol, -126, 4, -58, 103, -100, 91, 40});
        String h11 = e0.m.h(new byte[]{-23, 7, 17, -118, 47, 59, -34, -69, -39, 11, 8, -110}, new byte[]{-115, 110, 112, -26, 64, 92, -85, -34});
        String h12 = e0.m.h(new byte[]{5, 84, 74, 110, 65}, new byte[]{116, 33, 47, 28, 56, 13, -103, -41});
        Pattern pattern = j1.f6130a;
        r.e(h2, h10, str3, h11, a10, h12, d1.a(a10), e0.m.h(new byte[]{109, 23, 22, 4, Base64.padSymbol, -51, 73, -38, 97, 23, 6}, new byte[]{4, 121, 114, 97, 77, -88, 39, -66}), Boolean.valueOf(z9));
        this.f6291y = e0.m.h(new byte[]{Base64.padSymbol, -52, 112, -53, -125, 74, 9, 101, 43, -51, 118, -56, -115, 83, 3}, new byte[]{72, -94, 27, -91, -20, Base64.padSymbol, 103, 58});
        if (E(a10)) {
            return;
        }
        j0.e A = A(a10, false);
        if (A != null) {
            c0(e0.m.h(new byte[]{33, 41, 23, -91, 24, 114, 15, 97, 35, 38, 13, -79, 16, 112, 35}, new byte[]{76, 72, 121, -48, 121, 30, 80, 2}), j0.f.g(A), "", e0.m.h(new byte[]{-78, 52, -70, 124, -69, -114, 111, 21, -93, 46, -79, 105}, new byte[]{-57, 71, -33, 14, -28, -20, 6, 123}));
            v(A, -1);
            return;
        }
        u x9 = x(a10);
        if (x9 != null) {
            c0(e0.m.h(new byte[]{112, 57, -57, -65, 118}, new byte[]{17, 85, -82, -34, 5, 47, -113, -46}), j0.f.g(x9.f6234b), x9.f6233a, e0.m.h(new byte[]{-8, 93, -95, -81, -69, -101, 116, -37, -60, 66, -92, -83, -74, -115, 101}, new byte[]{-101, 50, -52, -33, -41, -2, 0, -66}));
            v(x9.f6234b, -1);
            return;
        }
        String a11 = d1.a(a10);
        v Y = Y(a11);
        Iterator it = Y.f6241b.iterator();
        while (it.hasNext()) {
            if (Y.a((u) it.next())) {
                Pattern pattern2 = j1.f6130a;
                String a12 = d1.a(a11);
                if (a12.length() >= 2 && !this.f6285p.isEmpty()) {
                    if (a12.equalsIgnoreCase(this.Z)) {
                        return;
                    }
                    this.Z = a12;
                    System.currentTimeMillis();
                    int i13 = this.W + 1;
                    this.W = i13;
                    this.X = a12;
                    this.Y = i13;
                    r().e(e0.m.h(new byte[]{38, -100, -89, -9, -109, -63, -21, 24, 10, -118, -87, -2, -104, -47, -9, 23, 48, -99}, new byte[]{85, -7, -54, -106, -3, -75, -126, 123}), e0.m.h(new byte[]{-17, 124, -5, -14, 70}, new byte[]{-98, 9, -98, ByteCompanionObject.MIN_VALUE, 63, -54, 107, -75}), a12, e0.m.h(new byte[]{3, -95, 13, -119, -106, 74, -62, -116, 11, -86}, new byte[]{100, -60, 99, -20, -28, 43, -74, -27}), Integer.valueOf(i13), e0.m.h(new byte[]{-124, 46, -24, -21, -11, -36, 3, -101, -83, 56}, new byte[]{-32, 75, -118, -124, ByteCompanionObject.MIN_VALUE, -78, 96, -2}), 100L);
                    this.f6264b.schedule(new r(this, a12, i13, 0), 100L, TimeUnit.MILLISECONDS);
                    return;
                }
                r().e(e0.m.h(new byte[]{-28, -55, -36, 6, -80, -99, 0, -92, -56, -33, -38, 14, -82, -103, 12, -93}, new byte[]{-105, -84, -79, 103, -34, -23, 105, -57}), e0.m.h(new byte[]{-107, -117, -61, 3, -102}, new byte[]{-28, -2, -90, 113, -29, -124, -80, -65}), a12, e0.m.h(new byte[]{58, -1, -59, 23, -105, -6}, new byte[]{72, -102, -92, 100, -8, -108, 114, 29}), a12.length() < 2 ? e0.m.h(new byte[]{121, 52, 106, 36, -17, -87, 75, 58, 111, 46, 124}, new byte[]{10, 92, 5, 86, -101, -10, 58, 79}) : e0.m.h(new byte[]{5, -100, 99, -7, 26, -33, -101, 71, 20, -112, ByteCompanionObject.MAX_VALUE, -30, 4}, new byte[]{96, -15, 19, -115, 99, ByteCompanionObject.MIN_VALUE, -8, 38}), e0.m.h(new byte[]{-28, 112, -21, -12, 87, 70, -21, -12, -13}, new byte[]{-108, 2, -114, -124, 54, 52, -126, -102}), Boolean.valueOf(this.f6286q));
                return;
            }
        }
        v Y2 = Y(a11);
        if (Y2.f6243g && ((String) Y2.f6242f.d).equals(e0.m.h(new byte[]{28, -106, 17, -2, -28, 60, -108, 70, 3, -125, 2, -8, -31}, new byte[]{111, -26, 116, -99, -115, 90, -19, 25}))) {
            this.f6291y = e0.m.h(new byte[]{-14, -28, -82, 25, 83, 44, 62, -50, -19, -15, -67, 31, 86}, new byte[]{-127, -108, -53, 122, 58, 74, 71, -111});
        }
        Log.d(this.f6262a, e0.m.h(new byte[]{49, -44, -109, 48, 48, -119, 112, 122, 66, -63, -116, 52, Base64.padSymbol, -107, 124, 122, 9, -111, -116, 52, 52, -104, 122, 109, 7, -43, -60, 113, 59, -117, 112, 125, 7, -33, -99, 52, 99}, new byte[]{98, -79, -2, 81, 94, -3, 25, 25}) + ((String) Y2.e.e) + e0.m.h(new byte[]{-126, 23, 80, -31, 43, 62, 65, 39}, new byte[]{-82, 55, 35, -115, 68, 74, 50, 26}) + ((String) Y2.f6242f.d) + e0.m.h(new byte[]{32, -44, 25, -50, -10, -118, -109, 27, 120, -55}, new byte[]{12, -12, 107, -85, -121, -1, -10, 104}) + Y2.f6244h);
        r().e(e0.m.h(new byte[]{-84, 37, 85, 3, -15, 97, 3, -121, ByteCompanionObject.MIN_VALUE, 48, 74, 7, -4, 125, 15, -121, -76}, new byte[]{-33, 64, 56, 98, -97, 21, 106, -28}), e0.m.h(new byte[]{113, 3, -109, 63, -67}, new byte[]{0, 118, -10, 77, -60, -108, -125, -88}), a11, e0.m.h(new byte[]{18, -13, 23, 78, 107, -25, 100, -42}, new byte[]{115, -112, 116, 43, 27, -109, 1, -78}), Boolean.FALSE, e0.m.h(new byte[]{105, -62, 101, 19, -46, ByteCompanionObject.MIN_VALUE, 28, -71}, new byte[]{12, -76, 12, 119, -73, -18, ByteCompanionObject.MAX_VALUE, -36}), (String) Y2.e.e, e0.m.h(new byte[]{103, 81, 79, -36, -59}, new byte[]{20, Base64.padSymbol, 32, -88, -74, -21, 94, -83}), (String) Y2.f6242f.d, e0.m.h(new byte[]{115, 59, -43, -50, -30, -112, ByteCompanionObject.MIN_VALUE, 8, 83, 59, -57, -44, -15, -122, -122}, new byte[]{1, 94, -74, -95, -108, -11, -14, 113}), Boolean.valueOf(Y2.f6244h), e0.m.h(new byte[]{3, -123, -85, 59, -16, -46, 124, 90, 5, -105}, new byte[]{96, -28, -59, 95, -103, -74, 29, 46}), Integer.valueOf(this.f6285p.size()), e0.m.h(new byte[]{-107, 7, 108, 78, 121, 107, 10, 104, -126}, new byte[]{-27, 117, 9, 62, 24, 25, 99, 6}), Boolean.valueOf(this.f6286q));
        i(a10, this.f6291y);
    }

    public final String S(int i10, byte[] bArr) {
        Recognizer recognizer;
        String partialResult;
        synchronized (this.O) {
            try {
                if (this.T) {
                    recognizer = this.Q;
                } else {
                    recognizer = this.P;
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

    public final synchronized void T(int i10, byte[] bArr) {
        if (bArr != null && i10 > 0) {
            int min = Math.min(i10, bArr.length);
            int max = Math.max(0, min - this.N.length);
            int i11 = min - max;
            while (i11 > 0) {
                int min2 = Math.min(i11, this.N.length - this.S);
                System.arraycopy(bArr, max, this.N, this.S, min2);
                int i12 = this.S + min2;
                byte[] bArr2 = this.N;
                this.S = i12 % bArr2.length;
                this.R = Math.min(this.R + min2, bArr2.length);
                max += min2;
                i11 -= min2;
            }
        }
    }

    public final String U(String str) {
        boolean z9;
        if (str != null) {
            h0.b.a();
            h0.b.f().getClass();
            String f8 = j0.c.f();
            String trim = str.trim();
            if (f8 != null && !f8.trim().isEmpty()) {
                Locale locale = Locale.ROOT;
                String lowerCase = trim.toLowerCase(locale);
                String lowerCase2 = f8.trim().toLowerCase(locale);
                Pattern pattern = a1.f6063a;
                if (pattern.matcher(trim).find()) {
                    return trim;
                }
                if (lowerCase.startsWith(lowerCase2) && (trim.length() == lowerCase2.length() || Character.isWhitespace(trim.charAt(lowerCase2.length())))) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!this.C || z9) {
                    if (z9) {
                        String trim2 = trim.substring(f8.trim().length()).trim();
                        if (this.C || (trim2 != null && pattern.matcher(trim2).find())) {
                            return trim2;
                        }
                    }
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
            return trim;
        }
        return "";
    }

    public final void V(String str) {
        String trim;
        String str2;
        String str3;
        String h2;
        String trim2;
        if (str != null && !str.trim().isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                boolean z9 = this.T;
                boolean has = jSONObject.has(e0.m.h(new byte[]{28, 103, 22, 33}, new byte[]{104, 2, 110, 85, 59, 42, 97, -38}));
                if (has) {
                    trim = jSONObject.optString(e0.m.h(new byte[]{62, 68, -97, -39}, new byte[]{74, 33, -25, -83, -12, -13, 90, -42}), "").trim();
                } else {
                    trim = jSONObject.optString(e0.m.h(new byte[]{118, 43, -77, 57, -79, -45, -11}, new byte[]{6, 74, -63, 77, -40, -78, -103, -83}), "").trim();
                }
                if (z9) {
                    String str4 = this.f6263a0;
                    str2 = "";
                    if (str4 == null) {
                        trim2 = "";
                    } else {
                        trim2 = str4.trim();
                    }
                    if (trim != null) {
                        str2 = trim.trim();
                    }
                    if (!trim2.isEmpty() && str2.startsWith(trim2.concat(" "))) {
                        str2 = str2.substring(trim2.length()).trim();
                    }
                } else {
                    str2 = trim;
                }
                if (z9) {
                    String str5 = "";
                    if (has) {
                        if (trim != null && !trim.trim().isEmpty()) {
                            this.f6263a0 = J(this.f6263a0, trim.trim());
                        }
                        this.f6265b0 = "";
                    } else {
                        if (trim != null) {
                            str5 = trim.trim();
                        }
                        this.f6265b0 = str5;
                    }
                    trim = J(this.f6263a0, this.f6265b0);
                    g1 r = r();
                    if (has) {
                        h2 = e0.m.h(new byte[]{42, 109, 4, 108, 100}, new byte[]{76, 4, 106, 13, 8, 126, 26, 64});
                    } else {
                        h2 = e0.m.h(new byte[]{-80, -107, -65, -6, -63, -71, -65}, new byte[]{-64, -12, -51, -114, -88, -40, -45, -97});
                    }
                    r.j(h2, str2, trim);
                }
                if (!"".equals(trim)) {
                    boolean z10 = true;
                    if (!z9) {
                        h0.b.a();
                        h0.b.f().getClass();
                        String f8 = j0.c.f();
                        if (f8 == null || f8.trim().isEmpty() || trim == null || !trim.toLowerCase().contains(f8.trim().toLowerCase())) {
                            z10 = false;
                        }
                        if (z10 && has) {
                            k(e0.m.h(new byte[]{-9, 33, -65, 23}, new byte[]{ByteCompanionObject.MIN_VALUE, 64, -44, 114, -31, 104, 17, 65}));
                            r().e(e0.m.h(new byte[]{65, 28, 55, 54, ByteCompanionObject.MIN_VALUE, 12, 36, 43, 79, 17}, new byte[]{32, ByteCompanionObject.MAX_VALUE, 67, 95, -10, 109, 80, 66}), e0.m.h(new byte[]{21, 110, -102, 43}, new byte[]{97, 11, -30, 95, 70, -67, 13, -28}), trim, e0.m.h(new byte[]{-8, 16, Base64.padSymbol, 88, 39}, new byte[]{-98, 121, 83, 57, 75, 21, 63, 81}), Boolean.valueOf(has));
                            String b02 = b0();
                            if (!this.T) {
                                r().d(e0.m.h(new byte[]{-90, 28, 115, 33, -10, -113, -83, -4, -88, 17, 88, 46, -31, -121, -75, -16, -93}, new byte[]{-57, ByteCompanionObject.MAX_VALUE, 7, 72, ByteCompanionObject.MIN_VALUE, -18, -39, -107}));
                                return;
                            }
                            d();
                            this.f6278j0 = "";
                            N(trim);
                            V(b02);
                            return;
                        }
                        return;
                    }
                    if (!trim.equals(this.f6266c0)) {
                        this.f6266c0 = trim;
                        Log.d(this.f6262a, e0.m.h(new byte[]{64, -1, 43, 124, -54, -28, -49, -43, 105, -19, 41, 121, -98, -1, -59, -40, 38, -23, 40, 125, -120, -1, -60, -45, 98, -73, 96}, new byte[]{6, -118, 71, 16, -22, -106, -86, -74}) + trim + e0.m.h(new byte[]{-10}, new byte[]{-47, -7, -34, 60, -39, 102, -122, 31}));
                        if (this.f6290x.isEmpty()) {
                            str3 = "";
                        } else {
                            str3 = "\n" + this.f6290x;
                        }
                        N(trim.concat(str3));
                        x0 s5 = s();
                        long currentTimeMillis = System.currentTimeMillis();
                        synchronized (s5) {
                            long j10 = s5.f6294b;
                            if (j10 != 0) {
                                s5.f6293a = Math.min(j10, Math.max(s5.f6293a, currentTimeMillis + 5000));
                            }
                        }
                        this.U = s().e();
                    }
                    String U = U(trim);
                    if (!U.isEmpty()) {
                        synchronized (this.O) {
                            try {
                                if (!U.equals(this.f6267d0)) {
                                    this.f6267d0 = U;
                                    this.f6268e0 = "";
                                    this.f6270f0++;
                                    this.W++;
                                    this.X = "";
                                    this.Z = "";
                                }
                            } finally {
                            }
                        }
                        if (H(U(str2))) {
                            Log.i(this.f6262a, e0.m.h(new byte[]{28, 107, -76, 28, 121, -5, 24, 58, 53, 121, -74, 25, 45, -32, 18, 55, 122, 125, -71, 30, 58, -20, 17, 53, 63, 122, -8, 18, 32, -87, 11, 54, 51, 125, -67, 80, 58, -26, 16, 52, 59, 112, -68}, new byte[]{90, 30, -40, 112, 89, -119, 125, 89}));
                            r().e(e0.m.h(new byte[]{-71, 108, 46, 69, -89, 20}, new byte[]{-38, 13, 64, 38, -62, 120, 74, -56}), e0.m.h(new byte[]{75, -28, 38, 96}, new byte[]{63, -127, 94, 20, 52, 35, 79, 31}), str2);
                            C(e0.m.h(new byte[]{-89, 116, 47, 44, 101, -104}, new byte[]{-60, 21, 65, 79, 0, -12, -69, -49}));
                        } else {
                            if (has && !str2.isEmpty()) {
                                R(U(str2));
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                r().e(e0.m.h(new byte[]{34, 67, -113, 17, 27}, new byte[]{71, 49, -3, 126, 105, 8, -71, -87}), e0.m.h(new byte[]{57, -25, -97, -76, 38}, new byte[]{74, -109, -2, -45, 67, 21, -123, 57}), e0.m.h(new byte[]{-55, -73, 50, -58, 75, -50, -63, -77, -46, -67, 63, -10, 70, -45, -57, -87}, new byte[]{-69, -46, 81, -87, 44, -96, -88, -57}), e0.m.h(new byte[]{96, 58, 101, -71}, new byte[]{20, 67, 21, -36, 97, -115, 105, 30}), e.getClass().getSimpleName(), e0.m.h(new byte[]{67, 37, 33, -117, -6, 119, 7}, new byte[]{46, 64, 82, -8, -101, 16, 98, 106}), e.getMessage());
            }
        }
    }

    public final void W(ArrayList arrayList, int i10, int i11) {
        int i12 = 1;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 = Math.max(i12, ((u) arrayList.get(i10 + i13)).f6235f.length);
        }
        int i14 = i11 * i12;
        long[] jArr = new long[i14];
        long[] jArr2 = new long[i14];
        long[] jArr3 = new long[i14];
        long j10 = 1;
        Arrays.fill(jArr, 1L);
        for (int i15 = 0; i15 < i11; i15++) {
            int[] iArr = ((u) arrayList.get(i10 + i15)).f6235f;
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
        OnnxTensor createTensor = OnnxTensor.createTensor(this.t, LongBuffer.wrap(jArr), jArr4);
        try {
            OnnxTensor createTensor2 = OnnxTensor.createTensor(this.t, LongBuffer.wrap(jArr2), jArr4);
            try {
                createTensor2 = OnnxTensor.createTensor(this.t, LongBuffer.wrap(jArr3), jArr4);
                try {
                    HashMap hashMap = new HashMap();
                    hashMap.put(e0.m.h(new byte[]{-37, -99, -28, -122, -37, 106, 76, -32, -63}, new byte[]{-78, -13, -108, -13, -81, 53, 37, -124}), createTensor);
                    hashMap.put(e0.m.h(new byte[]{-123, -120, -119, 56, -116, 30, -64, 42, -118, -93, -112, 60, -111, 1}, new byte[]{-28, -4, -3, 93, -30, 106, -87, 69}), createTensor2);
                    hashMap.put(e0.m.h(new byte[]{-127, -73, -52, 91, -106, -32, -73, -48, -123, -67, -8, 87, -100, -52}, new byte[]{-11, -40, -89, 62, -8, -65, -61, -87}), createTensor2);
                    OrtSession.Result run = this.f6288u.run(hashMap);
                    try {
                        float[][][] fArr = (float[][][]) run.get(0).getValue();
                        for (int i18 = 0; i18 < i11; i18++) {
                            ((u) arrayList.get(i10 + i18)).f6236g = j(fArr[i18], jArr2, i18 * i12, i12);
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

    public final void X() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f6280k0 >= 1000) {
            this.f6280k0 = currentTimeMillis;
            if (n()) {
                a0();
                try {
                    String jSONArray = new JSONArray((Collection) l()).toString();
                    if (I(jSONArray)) {
                        synchronized (this.O) {
                            Recognizer recognizer = this.P;
                            if (recognizer != null) {
                                recognizer.close();
                                this.P = null;
                            }
                            Recognizer recognizer2 = this.Q;
                            if (recognizer2 != null) {
                                recognizer2.close();
                                this.Q = null;
                            }
                            float f8 = 16000;
                            this.P = new Recognizer(this.f6281l, f8, jSONArray);
                            this.Q = new Recognizer(this.f6281l, f8);
                            this.T = false;
                            synchronized (this) {
                                this.R = 0;
                                this.S = 0;
                            }
                        }
                        if (ContextCompat.checkSelfPermission(this.f6282m, e0.m.h(new byte[]{-17, -50, 0, 13, 24, 41, 111, 40, -2, -59, 22, 18, 30, 51, 120, 111, -31, -50, 74, 45, 50, 3, 68, 84, -54, -1, 37, 42, 51, 9, 68}, new byte[]{-114, -96, 100, ByteCompanionObject.MAX_VALUE, 119, 64, 11, 6})) == 0) {
                            this.J = h0.b.o().loadInt(e0.m.h(new byte[]{-56, 96, 90, -97, 70, 27, -102, 47, -22, 119, 90, -109, 85, 103, -66, 57, -31, 108, 81, -91, 72, 60, -115, 47, -32}, new byte[]{-123, 5, 62, -10, 39, 73, -1, 76}), 1);
                            AudioRecord audioRecord = new AudioRecord(this.J, 16000, 16, 2, this.L);
                            this.f6279k = audioRecord;
                            audioRecord.startRecording();
                            r().e(e0.m.h(new byte[]{-96, -108, -90, -68, -93, -7, ByteCompanionObject.MIN_VALUE, -7, -75, -82, -74, -89, -80, -17, -99, -14, -74}, new byte[]{-46, -15, -59, -45, -47, -99, -23, -105}), e0.m.h(new byte[]{95, -20, -108, -104, -23, 1, -6, 39, 76, -6, -107}, new byte[]{62, -103, -16, -15, -122, 82, -107, 82}), Integer.valueOf(this.J), e0.m.h(new byte[]{51, -56, 101, 24, 54, 57, Base64.padSymbol, 19, 52, -52}, new byte[]{64, -87, 8, 104, 90, 92, 111, 114}), 16000, e0.m.h(new byte[]{-76, -76, -58, 49, -60, -83, -9, -105, -75}, new byte[]{-58, -47, -89, 85, -122, -44, -125, -14}), Integer.valueOf(this.M.length), e0.m.h(new byte[]{37, 31, 14, 13, 47, 19, -38, 52, 51, 15, 27}, new byte[]{71, 106, 104, 107, 74, 97, -104, 77}), Integer.valueOf(this.L));
                            return;
                        }
                        O(b.f6065b);
                    }
                } catch (Exception e) {
                    r().e(e0.m.h(new byte[]{81, 101, -17, 120, 37}, new byte[]{52, 23, -99, 23, 87, -24, -43, 34}), e0.m.h(new byte[]{111, 3, -95, 9, 98}, new byte[]{28, 119, -64, 110, 7, 12, 125, 22}), e0.m.h(new byte[]{-121, -93, 56, -113, 35, -35, 4, 56, -110, -103, 50, -114, 56, -51}, new byte[]{-11, -58, 91, -32, 81, -71, 109, 86}), e0.m.h(new byte[]{-72, -10, -78, 29}, new byte[]{-52, -113, -62, 120, 14, 92, -63, -39}), e.getClass().getSimpleName(), e0.m.h(new byte[]{-122, -71, 11, -24, 39, -4, -97}, new byte[]{-21, -36, 120, -101, 70, -101, -6, 119}), e.getMessage());
                    Log.e(this.f6262a, e0.m.h(new byte[]{10, 97, 71, 94, 34, 121, 119, -50, 63, 97, 92, 89, 46, 55, 98, -117, 53, 96, 71, 73, 46, 56, 105, -62, 38, 111, 90, 84, 40, 55, 37, -51, Base64.padSymbol, 103, 66, 88, 35}, new byte[]{92, 14, 46, Base64.padSymbol, 71, 89, 5, -85}), e);
                    a0();
                }
            }
        }
    }

    public final v Y(String str) {
        List list = this.f6285p;
        d1 d1Var = this.f6289v;
        v vVar = this.A;
        if (vVar != null && vVar.f6240a.equals(str) && vVar.f6241b == list && vVar.c == d1Var) {
            return vVar;
        }
        v vVar2 = new v(str, list, d1Var);
        this.A = vVar2;
        return vVar2;
    }

    public final void Z(final int i10, final String str) {
        if (i10 == this.W && this.T && !this.V) {
            if (i10 == this.Y) {
                this.X = "";
            }
            this.V = true;
            final long i11 = r().i();
            final String str2 = this.f6268e0;
            final long j10 = this.G;
            this.c.execute(new Runnable() { // from class: w0.s
                /* JADX WARN: Can't wrap try/catch for region: R(55:1|(2:2|3)|(9:(3:234|235|(57:237|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|(1:53)(1:208)|54|55|56|57|58|59|60|(2:178|(3:184|290|191))(2:66|1c0)|100|(1:107)(3:106|82|83)))|58|59|60|(1:62)|178|(4:180|182|184|290)|100|(2:102|108)(1:109))|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|(0)(0)|54|55|56|57|(1:(0))) */
                /* JADX WARN: Can't wrap try/catch for region: R(56:1|2|3|(9:(3:234|235|(57:237|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|(1:53)(1:208)|54|55|56|57|58|59|60|(2:178|(3:184|290|191))(2:66|1c0)|100|(1:107)(3:106|82|83)))|58|59|60|(1:62)|178|(4:180|182|184|290)|100|(2:102|108)(1:109))|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|(0)(0)|54|55|56|57|(1:(0))) */
                /* JADX WARN: Code restructure failed: missing block: B:123:0x03be, code lost:
                
                    if (r2.T != false) goto L170;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:126:0x03c4, code lost:
                
                    r2.i(r2.f6268e0, r2.f6291y);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:128:0x03cf, code lost:
                
                    r2.V = r1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:129:0x03d3, code lost:
                
                    if (r2.T == false) goto L247;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:134:0x03e3, code lost:
                
                    r2.f6264b.schedule(new w0.r(r2, r2.X, r2.Y, 1), r7, java.util.concurrent.TimeUnit.MILLISECONDS);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:135:0x03f3, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:136:?, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:140:0x03cc, code lost:
                
                    r0 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:143:0x03f5, code lost:
                
                    throw r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:209:0x017a, code lost:
                
                    r0 = e;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:210:0x009e, code lost:
                
                    r1 = false;
                    r7 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:211:0x00a1, code lost:
                
                    r15 = 5;
                    r7 = r7;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:213:0x02cd, code lost:
                
                    r0 = th;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:214:0x02ce, code lost:
                
                    r1 = false;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:216:0x02d3, code lost:
                
                    r0 = e;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:217:0x02d4, code lost:
                
                    r1 = false;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:218:0x02d0, code lost:
                
                    r0 = th;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:219:0x02d1, code lost:
                
                    r1 = false;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:223:0x02e1, code lost:
                
                    r0 = e;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:224:0x02e2, code lost:
                
                    r15 = 5;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:225:0x02dd, code lost:
                
                    r32 = r7;
                    r1 = false;
                    r15 = r15;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:226:0x02e4, code lost:
                
                    r0 = e;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:227:0x02e5, code lost:
                
                    r15 = 5;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:228:0x02dc, code lost:
                
                    r0 = e;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:229:0x02d7, code lost:
                
                    r0 = e;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:230:0x02d8, code lost:
                
                    r32 = r7;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:232:0x02c8, code lost:
                
                    r0 = th;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:233:0x02c9, code lost:
                
                    r1 = false;
                    r7 = 0;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:121:0x03bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:147:0x0400  */
                /* JADX WARN: Removed duplicated region for block: B:186:0x0291 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:208:0x017d A[Catch: Exception -> 0x017a, all -> 0x02c5, TRY_ENTER, TRY_LEAVE, TryCatch #17 {all -> 0x02c5, blocks: (B:3:0x0083, B:6:0x00a6, B:10:0x00b6, B:13:0x00c6, B:16:0x00cc, B:19:0x00e0, B:25:0x00fa, B:33:0x0109, B:36:0x0123, B:41:0x0140, B:51:0x016d, B:56:0x0192, B:208:0x017d), top: B:2:0x0083 }] */
                /* JADX WARN: Removed duplicated region for block: B:53:0x0173  */
                /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r14v7 */
                /* JADX WARN: Type inference failed for: r14v8 */
                /* JADX WARN: Type inference failed for: r15v23, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r2v0, types: [w0.x] */
                /* JADX WARN: Type inference failed for: r3v11, types: [java.util.concurrent.ScheduledExecutorService, java.util.concurrent.ScheduledThreadPoolExecutor] */
                /* JADX WARN: Type inference failed for: r4v1, types: [java.util.concurrent.ScheduledExecutorService, java.util.concurrent.ScheduledThreadPoolExecutor] */
                /* JADX WARN: Type inference failed for: r7v0, types: [long] */
                /* JADX WARN: Type inference failed for: r7v10 */
                /* JADX WARN: Type inference failed for: r7v11 */
                /* JADX WARN: Type inference failed for: r7v17 */
                /* JADX WARN: Type inference failed for: r7v24 */
                /* JADX WARN: Type inference failed for: r7v3 */
                /* JADX WARN: Type inference failed for: r7v30 */
                /* JADX WARN: Type inference failed for: r7v31 */
                /* JADX WARN: Type inference failed for: r7v4 */
                /* JADX WARN: Type inference failed for: r7v5 */
                /* JADX WARN: Type inference failed for: r7v6, types: [long] */
                /* JADX WARN: Type inference failed for: r7v7, types: [long] */
                /* JADX WARN: Type inference failed for: r7v8 */
                /* JADX WARN: Type inference failed for: r7v9 */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 1504
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: w0.s.run():void");
                }
            });
        }
    }

    @Override // w0.y
    public final void a() {
        int i10;
        String str;
        AudioFocusRequest audioFocusRequest;
        long nanoTime = System.nanoTime();
        AudioManager audioManager = this.f6275i;
        if (audioManager != null && (audioFocusRequest = this.f6277j) != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                i10 = audioManager.abandonAudioFocusRequest(audioFocusRequest);
            } else {
                i10 = 0;
            }
        } else {
            i10 = -1;
        }
        if (r().i() != 0) {
            r().e(e0.m.h(new byte[]{-27, 119, 11, -22, 5, 81, -34, -83, -17, 125, 9, -20, 19}, new byte[]{-125, 24, 104, -97, 118, 14, -84, -56}), e0.m.h(new byte[]{87, 97, -21, 40, -101, -84}, new byte[]{37, 4, -104, 93, -9, -40, 64, 23}), Integer.valueOf(i10), e0.m.h(new byte[]{-106, -32, -32, 27, -94, 66, 2, -24, -65, -26}, new byte[]{-14, -107, -110, 122, -42, 43, 109, -122}), Double.valueOf(u(nanoTime)));
        }
        synchronized (this.O) {
            try {
                g1 r = r();
                if (this.F == null) {
                    str = e0.m.h(new byte[]{59, -40, -89, 76, 65, -19, -111, 90, 49, -46, -91, 74, 87, -42}, new byte[]{93, -73, -60, 57, 50, -78, -29, 63});
                } else {
                    str = this.F;
                }
                r.d(str);
                this.F = e0.m.h(new byte[]{53, 21, -38, -28, 11, -28, 84, 16, 63, 31, -40, -30, 29, -33}, new byte[]{83, 122, -71, -111, 120, -69, 38, 117});
                this.T = false;
                this.f6269f.clear();
                this.W++;
                this.X = "";
                this.U = 0L;
                x0 s5 = s();
                synchronized (s5) {
                    s5.f6294b = 0L;
                    s5.f6293a = 0L;
                    s5.d = "";
                    s5.c = "";
                }
                this.C = false;
                if (this.B != null) {
                    this.B.i0();
                }
                this.f6290x = "";
                this.Z = "";
                this.f6263a0 = "";
                this.f6265b0 = "";
                this.f6266c0 = "";
                this.f6267d0 = "";
                this.f6268e0 = "";
                this.f6270f0++;
                Recognizer recognizer = this.P;
                if (recognizer != null) {
                    recognizer.reset();
                }
                Recognizer recognizer2 = this.Q;
                if (recognizer2 != null) {
                    recognizer2.reset();
                }
                synchronized (this) {
                    this.R = 0;
                    this.S = 0;
                }
                this.f6278j0 = "";
            } catch (Throwable th) {
                throw th;
            }
        }
        O(f6260m0);
    }

    public final void a0() {
        AudioRecord audioRecord = this.f6279k;
        if (audioRecord != null) {
            try {
                if (audioRecord.getState() == 1) {
                    this.f6279k.stop();
                }
            } catch (IllegalStateException unused) {
            }
            this.f6279k.release();
            this.f6279k = null;
        }
        O(b.f6065b);
    }

    @Override // w0.y
    public final void b() {
        String h2;
        g1 r = r();
        if (this.f6284o) {
            h2 = e0.m.h(new byte[]{-47, -60, -45, 23, -75, 121, -46, -112}, new byte[]{-75, -83, -96, 103, -38, 10, -73, -12});
        } else {
            h2 = e0.m.h(new byte[]{120, 113, 24, 39, 42, 35, -25, -21, 109, 75, 8, 60, 55, 55, -2, -32, 110}, new byte[]{10, 20, 123, 72, 88, 71, -114, -123});
        }
        r.d(h2);
        if (this.B != null) {
            this.B.i0();
        }
        h0.b.w(e0.m.h(new byte[]{-45, -1, -98, 27, -111, -53, -60, 100}, new byte[]{-96, -117, -15, 107, -57, -92, -73, 15}), ColorText.RED);
        this.f6272g0++;
        this.f6269f.clear();
        ScheduledFuture scheduledFuture = this.f6271g;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.f6271g.cancel(true);
            this.f6271g = null;
        }
        a0();
        synchronized (this.O) {
            Recognizer recognizer = this.P;
            if (recognizer != null) {
                recognizer.close();
                this.P = null;
            }
            Recognizer recognizer2 = this.Q;
            if (recognizer2 != null) {
                recognizer2.close();
                this.Q = null;
            }
            this.T = false;
            this.C = false;
        }
        O(b.f6065b);
    }

    public final String b0() {
        String partialResult;
        synchronized (this.O) {
            if (this.Q == null) {
                try {
                    this.Q = new Recognizer(this.f6281l, 16000.0f);
                } catch (Exception unused) {
                    return null;
                }
            }
            this.Q.reset();
            this.T = true;
            if (r().i() == 0) {
                k(e0.m.h(new byte[]{-89, -45, -59, -24, -122, -30}, new byte[]{-54, -78, -85, -99, -25, -114, -43, -35}));
            }
            this.F = e0.m.h(new byte[]{49, 90, Base64.padSymbol, 17, -75, -40, -10, -44, 59, 80, 63, 23, -93, -29}, new byte[]{87, 53, 94, 100, -58, -121, -124, -79});
            this.W++;
            this.X = "";
            s().d(System.currentTimeMillis());
            this.C = false;
            this.f6290x = "";
            this.U = s().e();
            this.Z = "";
            this.f6263a0 = "";
            this.f6265b0 = "";
            this.f6266c0 = "";
            this.f6267d0 = "";
            this.f6268e0 = "";
            this.f6270f0++;
            byte[] D = D();
            if (D == null || D.length <= 0) {
                return null;
            }
            this.f6269f.clear();
            long nanoTime = System.nanoTime();
            long threadCpuTimeNanos = Debug.threadCpuTimeNanos();
            boolean acceptWaveForm = this.Q.acceptWaveForm(D, D.length);
            Recognizer recognizer = this.Q;
            if (acceptWaveForm) {
                partialResult = recognizer.getResult();
            } else {
                partialResult = recognizer.getPartialResult();
            }
            r().e(e0.m.h(new byte[]{69, -18, -104, -57, 78, -50, -119, -65, 71, -61, -113, -64, 75, -60, -114, -93}, new byte[]{53, -100, -3, -91, 59, -88, -17, -38}), e0.m.h(new byte[]{-27, 78, 120, 37, -90}, new byte[]{-121, 55, 12, 64, -43, -87, -111, -14}), Integer.valueOf(D.length), e0.m.h(new byte[]{110, -63, 36, 17, 111, -21, -123}, new byte[]{15, -76, 64, 120, 0, -90, -10, -76}), Long.valueOf((D.length * 1000) / 32000), e0.m.h(new byte[]{-24, -100, -49, -77, 54, 4, 56, -86}, new byte[]{-116, -7, -84, -36, 82, 97, 117, -39}), Double.valueOf(u(nanoTime)), e0.m.h(new byte[]{-71, -86, -35, 33, -66}, new byte[]{-38, -38, -88, 108, -51, 19, 9, -11}), Double.valueOf(Math.max(0L, Debug.threadCpuTimeNanos() - threadCpuTimeNanos) / 1000000.0d));
            return partialResult;
        }
    }

    @Override // w0.y
    public final void c() {
        int i10;
        if (this.f6284o) {
            return;
        }
        h0.b.w(e0.m.h(new byte[]{-87, 4, -106, 99, -20, -55, 94, -53, -79}, new byte[]{-38, 112, -9, 17, -104, -97, 49, -72}), ColorText.RED);
        b();
        synchronized (this) {
            i10 = 0;
            if (!this.f6284o) {
                int i11 = this.r + 1;
                this.r = i11;
                this.f6285p = Collections.EMPTY_LIST;
                this.f6286q = true;
                this.c.execute(new q(this, i11, i10));
            }
        }
        this.f6274h0 = System.currentTimeMillis();
        int i12 = this.f6272g0 + 1;
        this.f6272g0 = i12;
        this.f6269f.clear();
        this.e.execute(new q(this, i12, 2));
        this.f6271g = this.f6264b.scheduleWithFixedDelay(new q(this, i12, 3), 0L, 30L, TimeUnit.MILLISECONDS);
        synchronized (this) {
            ScheduledFuture scheduledFuture = this.f6273h;
            if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
                return;
            }
            this.f6273h = this.f6264b.scheduleWithFixedDelay(new p(this, i10), 3L, 3L, TimeUnit.SECONDS);
        }
    }

    public final void c0(String str, String str2, String str3, String str4) {
        d0(str, str2, str3, str4, r().i(), this.f6268e0, this.G);
    }

    @Override // w0.y
    public final void d() {
        int i10;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest build;
        f6260m0 = f6259l0;
        if (!this.T && r().i() == 0) {
            k(e0.m.h(new byte[]{7, 94, -68, 25, -84, -3}, new byte[]{106, 63, -46, 108, -51, -111, -16, 77}));
        }
        long nanoTime = System.nanoTime();
        if (this.f6277j == null && Build.VERSION.SDK_INT >= 26) {
            onAudioFocusChangeListener = d.d().setOnAudioFocusChangeListener(new e(this, 2));
            audioAttributes = onAudioFocusChangeListener.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build());
            build = audioAttributes.build();
            this.f6277j = build;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            i10 = this.f6275i.requestAudioFocus(this.f6277j);
        } else {
            i10 = 0;
        }
        if (!this.T) {
            b0();
        }
        r().e(e0.m.h(new byte[]{-31, -72, 50, -54, -1, 90, 119, 26, -10, -94, 52, -52, -8}, new byte[]{-121, -41, 81, -65, -116, 5, 5, ByteCompanionObject.MAX_VALUE}), e0.m.h(new byte[]{44, 105, -86, -14, 69, -23}, new byte[]{94, 12, -39, -121, 41, -99, -29, -61}), Integer.valueOf(i10), e0.m.h(new byte[]{-15, 105, 9, -7, 72, 97, -92, -30, -40, 111}, new byte[]{-107, 28, 123, -104, 60, 8, -53, -116}), Double.valueOf(u(nanoTime)), e0.m.h(new byte[]{-46, 110, -20, -71, -45, 119, 12, 116}, new byte[]{-76, 27, ByteCompanionObject.MIN_VALUE, -43, -98, 24, 104, 17}), Boolean.valueOf(this.T));
        O(b.d);
    }

    public final void d0(String str, String str2, String str3, String str4, long j10, String str5, long j11) {
        this.H = str;
        r().e(e0.m.h(new byte[]{73, -68, 37, ByteCompanionObject.MAX_VALUE, -121, 115, 113, 15}, new byte[]{45, -39, 70, 22, -12, 26, 30, 97}), e0.m.h(new byte[]{ByteCompanionObject.MAX_VALUE, -68, -20, -57, 23, -117, 68, 122, ByteCompanionObject.MAX_VALUE, -96, -16, -38, 26}, new byte[]{12, -45, -103, -75, 116, -18, 23, 31}), Long.valueOf(j10), e0.m.h(new byte[]{-10, 46, -16}, new byte[]{-124, 79, -121, -9, 74, -41, 47, 115}), str5, e0.m.h(new byte[]{9, 83, -105, 27, Base64.padSymbol}, new byte[]{123, 60, -30, 111, 88, 4, 45, -32}), str, e0.m.h(new byte[]{2, -125, 58}, new byte[]{105, -26, 67, -92, -122, 29, -40, -58}), str2, e0.m.h(new byte[]{42, -94, -98, -113, 23, 103}, new byte[]{90, -54, -20, -18, 100, 2, 95, -124}), str3, e0.m.h(new byte[]{ByteCompanionObject.MAX_VALUE, 28, -123, -50, -83, -48}, new byte[]{13, 121, -28, -67, -62, -66, 78, -33}), str4, e0.m.h(new byte[]{-86, ByteCompanionObject.MAX_VALUE, -7, -53, 59, -72, 73, 72, -118, 109}, new byte[]{-57, 30, -115, -88, 83, -47, 39, 47}), Double.valueOf(u(j11)));
    }

    @Override // w0.y
    public final b e() {
        return f6259l0;
    }

    public final synchronized l0 e0() {
        try {
            if (this.B == null) {
                this.B = new l0(new z3.f(18), new n.p(13, this), Executors.newSingleThreadScheduledExecutor());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(java.util.LinkedHashMap r17, java.lang.String r18, j0.e r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 1128
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.x.h(java.util.LinkedHashMap, java.lang.String, j0.e, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x033a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.String r29, java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 1536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.x.i(java.lang.String, java.lang.String):void");
    }

    public final void k(String str) {
        int size;
        boolean z9;
        g1 r = r();
        synchronized (r) {
            try {
                if (r.e != 0) {
                    r.d(e0.m.h(new byte[]{-43, -53, -31, -113, 120, 47, -25, 68, -61}, new byte[]{-89, -82, -110, -5, 25, 93, -109, 33}));
                }
                r.e = g1.f6106k.incrementAndGet();
                r.f6108b.getClass();
                r.f6109f = System.nanoTime();
                r.f6111h = false;
                r.f6113j = null;
                r.f6112i = null;
                t5.e b10 = r.b(r.f6109f, e0.m.h(new byte[]{-10, -56, 53, -30, 92, -73, 38, 105, -10, -39, 39, -29, 65}, new byte[]{-123, -83, 70, -111, 53, -40, 72, 54}));
                g1.g(b10, e0.m.h(new byte[]{75, 116, -99, 11, 105, 78}, new byte[]{56, 27, -24, 121, 10, 43, 21, -51}), str);
                r.c.a(b10, e0.m.h(new byte[]{29, 51, -9, 12}, new byte[]{106, 82, -100, 105, -18, -90, 54, -8}));
                r.c.b();
                r.d.b();
                r.c(b10);
            } catch (Throwable th) {
                throw th;
            }
        }
        String str2 = "";
        try {
            str2 = h0.b.o().loadString(e0.m.h(new byte[]{94, -4, 111, 58, 93, 100, 49, -123, 113, -40}, new byte[]{29, -67, Base64.padSymbol, 106, 47, 11, 87, -20}), "");
        } catch (Exception unused) {
        }
        String str3 = str2;
        g1 r9 = r();
        String h2 = e0.m.h(new byte[]{55, 43, -59, -81, -115, -124, 45, 119, 53, 48, -62, -90, -118}, new byte[]{84, 68, -85, -55, -28, -29, 88, 5});
        String h10 = e0.m.h(new byte[]{35, -108, -50, 105, 107, 50, -101}, new byte[]{83, -26, -95, 15, 2, 94, -2, 112});
        String h11 = e0.m.h(new byte[]{-45, 12, -80, -127, 111}, new byte[]{-66, 99, -44, -28, 3, 88, 8, -102});
        String str4 = this.I;
        String h12 = e0.m.h(new byte[]{41, 13, 63, -94, -126, -43, -57, 52, 58, 27, 62}, new byte[]{72, 120, 91, -53, -19, -122, -88, 65});
        Integer valueOf = Integer.valueOf(this.J);
        String h13 = e0.m.h(new byte[]{-110, 29, -83, -110, 2, 116, -74, 58, -107, 25}, new byte[]{-31, 124, -64, -30, 110, 17, -28, 91});
        String h14 = e0.m.h(new byte[]{25, 39, -58, 54, 110, -92, -12, -34, 24}, new byte[]{107, 66, -89, 82, 44, -35, ByteCompanionObject.MIN_VALUE, -69});
        String h15 = e0.m.h(new byte[]{123, -67, -80, -105, 40, 86, -78, 122, 121, -126, -90}, new byte[]{11, -49, -43, -11, 93, 48, -44, 31});
        Integer valueOf2 = Integer.valueOf(TFTP.DEFAULT_TIMEOUT);
        String h16 = e0.m.h(new byte[]{-40, -127, -12, 103, -124, -61, 81, 26, -34, -109}, new byte[]{-69, -32, -102, 3, -19, -89, 48, 110});
        if (this.f6285p == null) {
            size = 0;
        } else {
            size = this.f6285p.size();
        }
        Integer valueOf3 = Integer.valueOf(size);
        String h17 = e0.m.h(new byte[]{-47, -114, 58, 50, 4, -73, 75, 51, -41, -100, 4, 36, 8, -93, 75, 53, -37, -127, 51}, new byte[]{-78, -17, 84, 86, 109, -45, 42, 71});
        Boolean valueOf4 = Boolean.valueOf(this.f6286q);
        String h18 = e0.m.h(new byte[]{-52, 53, 13, 102, 58, -57, -122, -39, -19, 53, 1, 99, 45}, new byte[]{-65, 80, 96, 7, 84, -77, -17, -70});
        if (this.f6288u != null && this.f6287s != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        r9.e(h2, h10, str3, h11, str4, h12, valueOf, h13, 16000, h14, 4096, h15, valueOf2, h16, valueOf3, h17, valueOf4, h18, Boolean.valueOf(z9), e0.m.h(new byte[]{28, 1, 2, 123, 38, 25, 46, 108, 10, 17, 5, 102, 47, 41}, new byte[]{111, 98, 109, 9, 67, 77, 70, 30}), Float.valueOf(0.88f), e0.m.h(new byte[]{-97, -45, -27, -32, 111, -65, -100, -36, ByteCompanionObject.MIN_VALUE, -41, -28, -17, 105, -67, -84}, new byte[]{-14, -78, -105, -121, 6, -47, -56, -76}), Float.valueOf(0.035f));
    }

    public final List l() {
        ArrayList arrayList = new ArrayList();
        h0.b.a();
        h0.b.f().getClass();
        String f8 = j0.c.f();
        if (f8 != null && !f8.trim().isEmpty()) {
            for (String str : f8.trim().toLowerCase(Locale.ROOT).split(e0.m.h(new byte[]{-61, -17, 31}, new byte[]{-97, -100, 52, 56, -106, ByteCompanionObject.MAX_VALUE, -24, 51}))) {
                if (!str.isEmpty() && !arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
            arrayList.add(e0.m.h(new byte[]{-120, -84, -85, -74, 126}, new byte[]{-45, -39, -59, -35, 35, 40, ByteCompanionObject.MAX_VALUE, -114}));
        }
        return arrayList;
    }

    public final boolean m(String str, ArrayList arrayList) {
        Pattern pattern = j1.f6130a;
        a5.h p9 = a.a.p(d1.a(str), arrayList, this.f6289v.f6076b);
        if (!p9.i()) {
            if (((z0) p9.c) == z0.f6298b || y(str) != null || A(str, true) != null || x(str) != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean n() {
        AudioManager audioManager = (AudioManager) this.f6282m.getSystemService(e0.m.h(new byte[]{-86, 98, -62, -44, -118}, new byte[]{-53, 23, -90, -67, -27, -54, 82, -35}));
        if (audioManager.getMode() == 0 && !audioManager.isMicrophoneMute()) {
            return true;
        }
        return false;
    }

    public final void o() {
        long j10;
        boolean z9;
        long j11;
        if (this.T && this.U > 0 && System.currentTimeMillis() >= this.U) {
            x0 s5 = s();
            synchronized (s5) {
                j10 = s5.f6294b;
            }
            if (j10 > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                x0 s9 = s();
                synchronized (s9) {
                    j11 = s9.f6294b;
                }
                if (currentTimeMillis >= j11) {
                    z9 = true;
                    if (z9 && !this.f6269f.isEmpty()) {
                        this.U = System.currentTimeMillis() + 1000;
                        return;
                    }
                    if (z9 && (this.V || (!this.X.isEmpty() && this.Y == this.W))) {
                        this.U = System.currentTimeMillis() + 1000;
                        return;
                    }
                    Log.i(this.f6262a, e0.m.h(new byte[]{-26, 2, 93, 93, 57, -9, -87, 119, -49, 16, 95, 88, 109, -20, -93, 122, ByteCompanionObject.MIN_VALUE, 3, 88, 92, 124, -22, -71, 96}, new byte[]{-96, 119, 49, 49, 25, -123, -52, 20}));
                    r().e(e0.m.h(new byte[]{-68, -69, 82, 57, 50, -7, -127}, new byte[]{-56, -46, 63, 92, 93, -116, -11, -116}), e0.m.h(new byte[]{-39, -121, 68, 118}, new byte[]{-79, -26, 54, 18, -3, 125, ByteCompanionObject.MAX_VALUE, 87}), Boolean.valueOf(z9), e0.m.h(new byte[]{123, 6, -87, 6, 91, 116, 121, 11, 126, 27}, new byte[]{10, 115, -52, 115, 62, 48, 28, 123}), Integer.valueOf(this.f6269f.size()), e0.m.h(new byte[]{65, 94, -58, 31, 3, 16, -21, 103, 96, 78, -59, 16, 4, 10, -27}, new byte[]{50, 59, -85, 126, 109, 100, -126, 4}), Boolean.valueOf(this.V), e0.m.h(new byte[]{-98, -112, -117, 109, -11, 3, -19, -72, -98}, new byte[]{-14, -15, -8, 25, -77, 106, -125, -39}), this.f6268e0, e0.m.h(new byte[]{-59, 58, 47, 45, -108, -16, -31, -16, -37, 45, 57, Base64.padSymbol}, new byte[]{-87, 91, 92, 89, -37, -110, -110, -107}), this.f6267d0, e0.m.h(new byte[]{52, 10, -49, -60, -18, 117, 56, 10, 20, 19, -35, -38, -1, 110}, new byte[]{85, 125, -82, -83, -102, 28, 86, 109}), Boolean.valueOf(s().c()));
                    C(e0.m.h(new byte[]{-1, -2, -74, 20, 53, -98, -8}, new byte[]{-117, -105, -37, 113, 90, -21, -116, -69}));
                    O(b.c);
                }
            }
            z9 = false;
            if (z9) {
            }
            if (z9) {
            }
            Log.i(this.f6262a, e0.m.h(new byte[]{-26, 2, 93, 93, 57, -9, -87, 119, -49, 16, 95, 88, 109, -20, -93, 122, ByteCompanionObject.MIN_VALUE, 3, 88, 92, 124, -22, -71, 96}, new byte[]{-96, 119, 49, 49, 25, -123, -52, 20}));
            r().e(e0.m.h(new byte[]{-68, -69, 82, 57, 50, -7, -127}, new byte[]{-56, -46, 63, 92, 93, -116, -11, -116}), e0.m.h(new byte[]{-39, -121, 68, 118}, new byte[]{-79, -26, 54, 18, -3, 125, ByteCompanionObject.MAX_VALUE, 87}), Boolean.valueOf(z9), e0.m.h(new byte[]{123, 6, -87, 6, 91, 116, 121, 11, 126, 27}, new byte[]{10, 115, -52, 115, 62, 48, 28, 123}), Integer.valueOf(this.f6269f.size()), e0.m.h(new byte[]{65, 94, -58, 31, 3, 16, -21, 103, 96, 78, -59, 16, 4, 10, -27}, new byte[]{50, 59, -85, 126, 109, 100, -126, 4}), Boolean.valueOf(this.V), e0.m.h(new byte[]{-98, -112, -117, 109, -11, 3, -19, -72, -98}, new byte[]{-14, -15, -8, 25, -77, 106, -125, -39}), this.f6268e0, e0.m.h(new byte[]{-59, 58, 47, 45, -108, -16, -31, -16, -37, 45, 57, Base64.padSymbol}, new byte[]{-87, 91, 92, 89, -37, -110, -110, -107}), this.f6267d0, e0.m.h(new byte[]{52, 10, -49, -60, -18, 117, 56, 10, 20, 19, -35, -38, -1, 110}, new byte[]{85, 125, -82, -83, -102, 28, 86, 109}), Boolean.valueOf(s().c()));
            C(e0.m.h(new byte[]{-1, -2, -74, 20, 53, -98, -8}, new byte[]{-117, -105, -37, 113, 90, -21, -116, -69}));
            O(b.c);
        }
    }

    public final ArrayList p() {
        n0.d dVar;
        int i10;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        h0.b.a();
        ArrayList e = h0.b.f().e();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(Locale.getDefault().toLanguageTag(), Locale.getDefault());
        Context context = this.f6282m;
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
                        Field declaredField = n0.d.class.getDeclaredField(e0.m.h(new byte[]{-61, -27, 113, -10, 121, -45, -124, -55, -58, -31, 103}, new byte[]{-89, -116, 2, -122, 21, -78, -3, -121}));
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
                            h(linkedHashMap, context.createConfigurationContext(configuration).getString(i10), eVar, "");
                        }
                    }
                }
                h(linkedHashMap, eVar.f3099i, eVar, "");
            }
        }
        String str2 = this.f6262a;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (u uVar : linkedHashMap.values()) {
            String g10 = j0.f.g(uVar.f6234b);
            ((List) linkedHashMap3.computeIfAbsent(g10, new ai.onnxruntime.d(8))).add(uVar.f6233a);
            linkedHashMap4.put(g10, uVar.f6234b);
        }
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(context.getAssets().open(e0.m.h(new byte[]{-89, -28, 77, -88, 5, 34, 25, 82, -91, -30, 75, -91, 63, 28, 20, 88, -80, -8, 65, -72, 78, 23, 11, 94, -65}, new byte[]{-47, -117, 36, -53, 96, 125, 120, 49})), e0.m.h(new byte[]{-25, -22, -24, 83, -94}, new byte[]{-78, -66, -82, 126, -102, -47, -49, 115}));
            try {
                List<c0> b10 = d0.c(inputStreamReader).b(linkedHashMap3);
                int size3 = linkedHashMap.size();
                for (c0 c0Var : b10) {
                    h(linkedHashMap, c0Var.f6071b, (j0.e) linkedHashMap4.get(c0Var.f6070a), c0Var.c);
                }
                Log.i(str2, e0.m.h(new byte[]{-88, 2, -70, -102, -80, 71, -68, -110, -120, 10, -2, -123, -85, 71, -80, -103, -55, 22, -74, -127, -91, 93, -74, -113, -55, 10, -79, -110, -96, 75, -73, -58, -55}, new byte[]{-23, 102, -34, -13, -60, 46, -45, -4}) + (linkedHashMap.size() - size3));
                inputStreamReader.close();
            } finally {
            }
        } catch (Exception e6) {
            Log.w(str2, e0.m.h(new byte[]{-68, 23, 72, 102, 3, -66, -69, -81, -100, 31, 12, 121, 24, -66, -73, -92, -35, 3, 68, 125, 22, -92, -79, -31, -98, 18, 88, 110, 27, -72, -77, -31, -120, 29, 77, 121, 22, -66, -72, -96, -97, 31, 73, 52, 87, -94, -89, -88, -109, 20, 12, 96, 5, -66, -77, -88, -109, 18, 64, 47, 7, -65, -90, -96, -114, 22, 95}, new byte[]{-3, 115, 44, 15, 119, -41, -44, -63}), e6);
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        int size4 = e.size();
        while (i11 < size4) {
            Object obj3 = e.get(i11);
            i11++;
            j0.e eVar2 = (j0.e) obj3;
            if (j0.f.d(eVar2)) {
                linkedHashMap5.put(j0.f.g(eVar2), eVar2);
            }
        }
        d1 d1Var = this.f6289v;
        for (Map.Entry entry : d1Var.c.entrySet()) {
            j0.e eVar3 = (j0.e) linkedHashMap5.get(entry.getKey());
            if (eVar3 != null) {
                for (String str3 : (List) entry.getValue()) {
                    h(linkedHashMap, str3, eVar3, e0.m.h(new byte[]{103, 96, 47, -8, -112, 78, 75, -94, 49}, new byte[]{11, 1, 65, -97, -27, 47, 44, -57}).concat(d1Var.e(str3)));
                }
            }
        }
        return new ArrayList(linkedHashMap.values());
    }

    public final g1 r() {
        g1 g1Var;
        g1 g1Var2 = this.E;
        if (g1Var2 == null) {
            synchronized (this) {
                try {
                    if (this.E == null) {
                        this.E = new g1(new q0.f(5, this));
                    }
                    g1Var = this.E;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return g1Var;
        }
        return g1Var2;
    }

    public final x0 s() {
        if (this.w == null) {
            this.w = new x0();
        }
        return this.w;
    }

    public final void t() {
        AudioManager audioManager;
        f fVar;
        if (this.f6284o) {
            return;
        }
        this.f6284o = true;
        b1 b1Var = this.D;
        if (b1Var != null) {
            b1Var.close();
        }
        if (this.B != null) {
            this.B.close();
        }
        a();
        b();
        ScheduledFuture scheduledFuture = this.f6273h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        if (Build.VERSION.SDK_INT >= 31 && (audioManager = this.f6275i) != null && (fVar = this.f6283n) != null) {
            audioManager.removeOnModeChangedListener(fVar);
            this.f6283n = null;
        }
        this.d.shutdownNow();
        this.e.shutdownNow();
        this.c.execute(new p(this, 1));
        this.c.shutdown();
        synchronized (this.O) {
            try {
                Model model = this.f6281l;
                if (model != null) {
                    model.close();
                }
                this.f6281l = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void v(j0.e eVar, int i10) {
        j0.e eVar2;
        long i11 = r().i();
        j0.e eVar3 = eVar;
        if (eVar3.f3094a == j0.d.e) {
            String g10 = j0.f.g(eVar3);
            h0.b.a();
            ArrayList e = h0.b.f().e();
            int size = e.size();
            int i12 = 0;
            while (true) {
                if (i12 < size) {
                    Object obj = e.get(i12);
                    i12++;
                    eVar2 = (j0.e) obj;
                    if (g10.equals(j0.f.g(eVar2)) && j0.f.d(eVar2)) {
                        break;
                    }
                } else {
                    eVar2 = null;
                    break;
                }
            }
            if (eVar2 == null) {
                r().e(e0.m.h(new byte[]{-73, 64, 19, -110, -49, 59, 72, 17, -72, 66, 17, -102, -55, 57, 118, 6, -70, 70}, new byte[]{-42, 35, 103, -5, -96, 85, 23, 100}), e0.m.h(new byte[]{-82, 88, 10}, new byte[]{-59, Base64.padSymbol, 115, -70, -110, -33, -112, 59}), g10);
                Log.w(this.f6262a, e0.m.h(new byte[]{-70, 22, 85, 125, -76, 82, 8, -75, -108, 85, 77, 123, -75, 91, 77, -87, -37, 20, 87, 117, -78, 80, 73, -71, -105, 16, 1, 125, -75, 28, 75, -82, -119, 7, 68, 122, -81, 28, 88, -87, -108, 19, 72, 120, -66, 6, 8}, new byte[]{-5, 117, 33, 20, -37, 60, 40, -37}) + g10);
                C(e0.m.h(new byte[]{89, 121, 110, ByteCompanionObject.MIN_VALUE, 31, -108, -75, 2, 86, 123, 108, -120, 25, -106, -117, 21, 84, ByteCompanionObject.MAX_VALUE}, new byte[]{56, 26, 26, -23, 112, -6, -22, 119}));
                return;
            }
            eVar3 = eVar2;
        }
        synchronized (this.O) {
            try {
                if (this.T && (i10 < 0 || i10 == this.W)) {
                    r().e(e0.m.h(new byte[]{-100, -36, 85, 120, 6, 91, -35, 113, -108, -52, 81, 112, 29, 86, -22}, new byte[]{-3, -65, 33, 17, 105, 53, -126, 21}), e0.m.h(new byte[]{-119, 23, -58}, new byte[]{-30, 114, -65, 10, -59, 17, 41, 24}), j0.f.g(eVar3), e0.m.h(new byte[]{-35, -92, -121, 109, -107}, new byte[]{-81, -53, -14, 25, -16, 92, -81, -86}), this.H, e0.m.h(new byte[]{92, 101, -93, -97, -31, -80, 86, -38, 124, 119}, new byte[]{49, 4, -41, -4, -119, -39, 56, -67}), Double.valueOf(u(this.G)));
                    C(e0.m.h(new byte[]{-90, -104, ByteCompanionObject.MIN_VALUE, 70, -85, -92, 37, 124, -74, -110, -127, 78, -87, -66, 36, 71}, new byte[]{-59, -9, -19, 43, -54, -54, 65, 35}));
                    long nanoTime = System.nanoTime();
                    try {
                        h0.b.a();
                        h0.b.f().j(eVar3, null);
                        r().e(e0.m.h(new byte[]{-40, -45, -83, -14, 95, 13, -17, -109, -36, -60, -84, -23, 94, 6, -44}, new byte[]{-71, -80, -39, -101, 48, 99, -80, -31}), e0.m.h(new byte[]{39, -25, -84}, new byte[]{76, -126, -43, -4, -102, 103, -82, -40}), j0.f.g(eVar3), e0.m.h(new byte[]{63, 13, 57, -47, 33, 44, -81, -39, 63, 17, 37, -52, 44}, new byte[]{76, 98, 76, -93, 66, 73, -4, -68}), Long.valueOf(i11), e0.m.h(new byte[]{29, 76, -33, -1, -124, ByteCompanionObject.MIN_VALUE, 33, 7, 52, 74}, new byte[]{121, 57, -83, -98, -16, -23, 78, 105}), Double.valueOf(u(nanoTime)));
                        return;
                    } catch (RuntimeException e6) {
                        r().e(e0.m.h(new byte[]{92, -19, 2, -55, 27}, new byte[]{57, -97, 112, -90, 105, -94, 29, 93}), e0.m.h(new byte[]{-56, 97, -121, 14, 56}, new byte[]{-69, 21, -26, 105, 93, -113, -96, 1}), e0.m.h(new byte[]{22, 60, 9, -22, -118, 47, 103, -59, 30, 44, 13, -30, -111, 34, 80}, new byte[]{119, 95, 125, -125, -27, 65, 56, -95}), e0.m.h(new byte[]{23, 11, -40, 44, -16, 120, 92, 38, 23, 23, -60, 49, -3}, new byte[]{100, 100, -83, 94, -109, 29, 15, 67}), Long.valueOf(i11), e0.m.h(new byte[]{22, -32, -64}, new byte[]{125, -123, -71, -74, 0, 59, 105, -66}), j0.f.g(eVar3), e0.m.h(new byte[]{-24, -57, -91, -39, -111, 70, -52, -101, -63, -63}, new byte[]{-116, -78, -41, -72, -27, 47, -93, -11}), Double.valueOf(u(nanoTime)), e0.m.h(new byte[]{102, -34, -38, -113}, new byte[]{18, -89, -86, -22, -19, -24, 76, -125}), e6.getClass().getSimpleName(), e0.m.h(new byte[]{82, 28, 38, -99, -19, -96, 98}, new byte[]{63, 121, 85, -18, -116, -57, 7, 115}), e6.getMessage());
                        throw e6;
                    }
                }
                r().e(e0.m.h(new byte[]{-70, 7, 20, 3, -121, -44, 50, -18, -68, 10, 15, 24, -115, -34}, new byte[]{-37, 100, 96, 106, -24, -70, 109, -121}), e0.m.h(new byte[]{6, 24, 23, 102, -118, 13, 52, 8, 6, 4, 11, 123, -121}, new byte[]{117, 119, 98, 20, -23, 104, 103, 109}), Long.valueOf(i11), e0.m.h(new byte[]{16, 30, -89}, new byte[]{123, 123, -34, 28, -41, -24, -12, 6}), j0.f.g(eVar3), e0.m.h(new byte[]{-84, 109, -35, -99, -31, 73}, new byte[]{-34, 8, -68, -18, -114, 39, -44, -41}), e0.m.h(new byte[]{-120, 20, 48, -89, -7, 99, 35, -30, -92, 9, 63, -86, -1, 72, 37, -26, -98}, new byte[]{-5, 96, 81, -53, -100, 60, 76, -112}));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final u x(String str) {
        String d = d0.d(d1.b(str));
        u uVar = null;
        for (u uVar2 : this.f6285p) {
            if (!uVar2.c.isEmpty() && uVar2.c.equals(d)) {
                if (uVar != null && !j0.f.g(uVar.f6234b).equals(j0.f.g(uVar2.f6234b))) {
                    return null;
                }
                uVar = uVar2;
            }
        }
        return uVar;
    }

    public final u y(String str) {
        String b10 = d1.b(str);
        String c = d1.c(b10);
        String replaceFirst = c.replaceFirst(e0.m.h(new byte[]{78, -79, -97, -11, 85, -49, 76, -25, -64, 35, 113, 79, 85, -49, 77, -36, 108, 73, 30, 30, 7, -95, 39, -76, -112, 72, 43, 30, 7, -96, 17, 25, -64, 46, 112, ByteCompanionObject.MAX_VALUE, 85, -50, 76, -26, -63, 24, 113, 77, 85, -55, -31, -75, -89, 73, 16, 31, 58, -96, 30, -76, -111, 72, 34, 31, Base64.padSymbol, -96, 31, -76, -100, -27, 112, 112, 85, -49, 77, -33, -64, 41, 112, 121, 85, -55, -31, 10, 96, -4, -50, -77, -23, 16, -24, 11, 115, -15, -36, -68, -15, 16, -17, 17, 57, -59, -45, -28, -83, 78, -89, 77, 47, -93, 112, 112, 84, -15, 77, -35, -64, 34, 112, 113, 85, -57, 77, -48, -64, 36, 112, 119, 85, -60, -31, 4, 96, -23, -119, -109, -10, 90, -76, 90}, new byte[]{16, -103, -96, -49, -123, 113, -99, 101}), "");
        boolean equals = replaceFirst.equals(c);
        String e = this.f6289v.e(b10);
        boolean z9 = false;
        u uVar = null;
        u uVar2 = null;
        boolean z10 = false;
        for (u uVar3 : this.f6285p) {
            String g10 = j0.f.g(uVar3.f6234b);
            if (b10.equals(uVar3.f6237h)) {
                if (uVar != null && !g10.equals(j0.f.g(uVar.f6234b))) {
                    z10 = true;
                }
                uVar = uVar3;
            }
            if (!equals && uVar3.f6234b.f3094a == j0.d.c && replaceFirst.equals(uVar3.f6237h)) {
                if (uVar != null && !g10.equals(j0.f.g(uVar.f6234b))) {
                    z10 = true;
                }
                uVar = uVar3;
            }
            if (!e.isEmpty() && e.equals(uVar3.f6238i)) {
                if (uVar2 != null && !g10.equals(j0.f.g(uVar2.f6234b))) {
                    z9 = true;
                }
                uVar2 = uVar3;
            }
        }
        if (uVar != null) {
            if (!z10) {
                return uVar;
            }
        } else if (!z9) {
            return uVar2;
        }
        return null;
    }
}
