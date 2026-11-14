package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import com.example.navistart.R;
import h.k;
import j.d0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Formatter;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import l9.l;
import l9.o;
import n7.f1;
import n7.j1;
import org.json.JSONException;
import org.json.JSONObject;
import p7.n;
import q.a0;
import q.p;
import q.x;
import u3.p.c00008;
import v8.y;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class d implements k, p, OnApplyWindowInsetsListener, y8.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3480b;
    public Object c;
    public Object d;

    public d(int i10) {
        this.f3480b = i10;
        switch (i10) {
            case 6:
                Level level = Level.FINE;
                Logger logger = Logger.getLogger(n.class.getName());
                o4.b.i(level, "level");
                this.d = level;
                o4.b.i(logger, "logger");
                this.c = logger;
                return;
            case 15:
                return;
            case 20:
                this.c = new AtomicLong();
                this.d = new AtomicLong();
                return;
            case 21:
                this.c = new AtomicReference();
                this.d = new ArrayMap();
                return;
            case 22:
                this.d = new ArrayList();
                this.c = new HashMap();
                return;
            default:
                this.c = new HashMap();
                this.d = new c(0);
                return;
        }
    }

    public static String Q(l lVar) {
        long j10 = lVar.c;
        if (j10 <= 64) {
            return lVar.i0().d();
        }
        return lVar.j0((int) Math.min(j10, 64L)).d() + "...";
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.d a(android.content.Context r5) {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L2f java.lang.Error -> L33 java.io.IOException -> L35
            java.io.File r5 = r5.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L2f java.lang.Error -> L33 java.io.IOException -> L35
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L2f java.lang.Error -> L33 java.io.IOException -> L35
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L2f java.lang.Error -> L33 java.io.IOException -> L35
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L2f java.lang.Error -> L33 java.io.IOException -> L35
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L2f java.lang.Error -> L33 java.io.IOException -> L35
            java.nio.channels.FileLock r0 = r5.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L28 java.lang.Error -> L2b java.io.IOException -> L2d
            l.d r2 = new l.d     // Catch: java.nio.channels.OverlappingFileLockException -> L22 java.lang.Error -> L24 java.io.IOException -> L26
            r3 = 1
            r2.<init>(r3, r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L22 java.lang.Error -> L24 java.io.IOException -> L26
            return r2
        L22:
            r2 = move-exception
            goto L37
        L24:
            r2 = move-exception
            goto L37
        L26:
            r2 = move-exception
            goto L37
        L28:
            r2 = move-exception
        L29:
            r0 = r1
            goto L37
        L2b:
            r2 = move-exception
            goto L29
        L2d:
            r2 = move-exception
            goto L29
        L2f:
            r2 = move-exception
        L30:
            r5 = r1
            r0 = r5
            goto L37
        L33:
            r2 = move-exception
            goto L30
        L35:
            r2 = move-exception
            goto L30
        L37:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L43
            r0.release()     // Catch: java.io.IOException -> L43
        L43:
            if (r5 == 0) goto L48
            r5.close()     // Catch: java.io.IOException -> L48
        L48:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.d.a(android.content.Context):l.d");
    }

    public static a0 m(ImageDecoder.Source source, int i10, int i11, h.h hVar) {
        Drawable decodeDrawable;
        decodeDrawable = ImageDecoder.decodeDrawable(source, new p.b(i10, i11, hVar));
        if (q.c.l(decodeDrawable)) {
            return new a0(2, q.c.g(decodeDrawable));
        }
        org.apache.commons.io.e.f(decodeDrawable, "Received unexpected drawable type for animated image, failing: ");
        return null;
    }

    public boolean A() {
        if (((int[]) this.d)[0] != 0) {
            return false;
        }
        return true;
    }

    public void B(int i10, int i11, l lVar, int i12, boolean z9) {
        if (z()) {
            ((Logger) this.c).log((Level) this.d, kotlin.collections.unsigned.a.i(i10) + " DATA: streamId=" + i11 + " endStream=" + z9 + " length=" + i12 + " bytes=" + Q(lVar));
        }
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, l9.l] */
    public void C(int i10, int i11, r7.a aVar, o oVar) {
        if (z()) {
            Logger logger = (Logger) this.c;
            Level level = (Level) this.d;
            StringBuilder sb = new StringBuilder();
            sb.append(kotlin.collections.unsigned.a.i(i10));
            sb.append(" GO_AWAY: lastStreamId=");
            sb.append(i11);
            sb.append(" errorCode=");
            sb.append(aVar);
            sb.append(" length=");
            sb.append(oVar.c());
            sb.append(" bytes=");
            ?? obj = new Object();
            obj.l0(oVar);
            sb.append(Q(obj));
            logger.log(level, sb.toString());
        }
    }

    public void D(int i10, long j10) {
        if (z()) {
            ((Logger) this.c).log((Level) this.d, kotlin.collections.unsigned.a.i(i10) + " PING: ack=false bytes=" + j10);
        }
    }

    public void E(int i10, int i11, r7.a aVar) {
        if (z()) {
            ((Logger) this.c).log((Level) this.d, kotlin.collections.unsigned.a.i(i10) + " RST_STREAM: streamId=" + i11 + " errorCode=" + aVar);
        }
    }

    public void F(int i10, j.i iVar) {
        if (z()) {
            Logger logger = (Logger) this.c;
            Level level = (Level) this.d;
            StringBuilder sb = new StringBuilder();
            sb.append(kotlin.collections.unsigned.a.i(i10));
            sb.append(" SETTINGS: ack=false settings=");
            EnumMap enumMap = new EnumMap(p7.o.class);
            for (p7.o oVar : p7.o.values()) {
                if (iVar.b(oVar.f5091b)) {
                    enumMap.put((EnumMap) oVar, (p7.o) Integer.valueOf(((int[]) iVar.c)[oVar.f5091b]));
                }
            }
            sb.append(enumMap.toString());
            logger.log(level, sb.toString());
        }
    }

    public void G(long j10, int i10, int i11) {
        if (z()) {
            ((Logger) this.c).log((Level) this.d, kotlin.collections.unsigned.a.i(i10) + " WINDOW_UPDATE: streamId=" + i11 + " windowSizeIncrement=" + j10);
        }
    }

    public d H(int i10) {
        int[] iArr = (int[]) this.d;
        t6.a aVar = (t6.a) this.c;
        if (i10 == 0) {
            return aVar.c;
        }
        if (i10 == 1) {
            return this;
        }
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr2[i11] = aVar.c(iArr[i11], i10);
        }
        return new d(aVar, iArr2);
    }

    public d I(d dVar) {
        t6.a aVar = (t6.a) this.c;
        if (aVar.equals((t6.a) dVar.c)) {
            if (!A() && !dVar.A()) {
                int[] iArr = (int[]) this.d;
                int length = iArr.length;
                int[] iArr2 = (int[]) dVar.d;
                int length2 = iArr2.length;
                int[] iArr3 = new int[(length + length2) - 1];
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = iArr[i10];
                    for (int i12 = 0; i12 < length2; i12++) {
                        int i13 = i10 + i12;
                        iArr3[i13] = aVar.a(iArr3[i13], aVar.c(i11, iArr2[i12]));
                    }
                }
                return new d(aVar, iArr3);
            }
            return aVar.c;
        }
        j1.i.k("ModulusPolys do not have same ModulusGF field");
        return null;
    }

    public m5.b J() {
        JSONObject jSONObject;
        String str;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(r());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } finally {
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i10 = com.bumptech.glide.g.d(5)[optInt];
        if (i10 != 0) {
            if (i10 == 0) {
                str = " registrationStatus";
            } else {
                str = "";
            }
            if (str.isEmpty()) {
                return new m5.b(optString, i10, optString2, optString3, optLong2, optLong, optString4);
            }
            j1.i.l("Missing required properties:".concat(str));
            return null;
        }
        n0.b.n("Null registrationStatus");
        return null;
    }

    public void K(String str) {
        b bVar;
        synchronized (this) {
            try {
                Object obj = ((HashMap) this.c).get(str);
                c0.g.c(obj, "Argument must not be null");
                bVar = (b) obj;
                int i10 = bVar.f3478b;
                if (i10 >= 1) {
                    int i11 = i10 - 1;
                    bVar.f3478b = i11;
                    if (i11 == 0) {
                        b bVar2 = (b) ((HashMap) this.c).remove(str);
                        if (bVar2.equals(bVar)) {
                            c cVar = (c) this.d;
                            synchronized (cVar.f3479a) {
                                try {
                                    if (cVar.f3479a.size() < 10) {
                                        cVar.f3479a.offer(bVar2);
                                    }
                                } finally {
                                }
                            }
                        } else {
                            throw new IllegalStateException("Removed the wrong lock, expected to remove: " + bVar + ", but actually removed: " + bVar2 + ", safeKey: " + str);
                        }
                    }
                } else {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + bVar.f3478b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        bVar.f3477a.unlock();
    }

    public void L() {
        try {
            ((FileLock) this.d).release();
            ((FileChannel) this.c).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    public void M(n7.a aVar, Object obj) {
        if (((IdentityHashMap) this.d) == null) {
            this.d = new IdentityHashMap(1);
        }
        ((IdentityHashMap) this.d).put(aVar, obj);
    }

    public float N(int i10, int i11, int i12, int i13) {
        boolean z9;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        d dVar;
        int i23;
        int i24 = 1;
        if (Math.abs(i13 - i11) > Math.abs(i12 - i10)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            i15 = i10;
            i14 = i11;
            i17 = i12;
            i16 = i13;
        } else {
            i14 = i10;
            i15 = i11;
            i16 = i12;
            i17 = i13;
        }
        int abs = Math.abs(i16 - i14);
        int abs2 = Math.abs(i17 - i15);
        int i25 = 2;
        int i26 = (-abs) / 2;
        int i27 = -1;
        if (i14 < i16) {
            i18 = 1;
        } else {
            i18 = -1;
        }
        if (i15 < i17) {
            i27 = 1;
        }
        int i28 = i16 + i18;
        int i29 = i14;
        int i30 = i15;
        int i31 = 0;
        while (true) {
            if (i29 != i28) {
                if (z9) {
                    i20 = i30;
                } else {
                    i20 = i29;
                }
                if (z9) {
                    i21 = i29;
                } else {
                    i21 = i30;
                }
                boolean z10 = z9;
                if (i31 == i24) {
                    i22 = i24;
                    i23 = abs;
                    dVar = this;
                } else {
                    i22 = 0;
                    dVar = this;
                    i23 = abs;
                }
                if (i22 == ((f6.b) dVar.c).b(i20, i21)) {
                    if (i31 == 2) {
                        return a.a.h(i29, i30, i14, i15);
                    }
                    i31++;
                }
                i26 += abs2;
                if (i26 > 0) {
                    if (i30 != i17) {
                        i30 += i27;
                        i26 -= i23;
                    } else {
                        i19 = 2;
                        break;
                    }
                }
                i29 += i18;
                abs = i23;
                z9 = z10;
                i24 = 1;
                i25 = 2;
            } else {
                i19 = i25;
                break;
            }
        }
        if (i31 == i19) {
            return a.a.h(i28, i17, i14, i15);
        }
        return Float.NaN;
    }

    public float O(int i10, int i11, int i12, int i13) {
        float f8;
        float f10;
        f6.b bVar = (f6.b) this.c;
        float N = N(i10, i11, i12, i13);
        int i14 = i10 - (i12 - i10);
        int i15 = 0;
        if (i14 < 0) {
            f8 = i10 / (i10 - i14);
            i14 = 0;
        } else {
            int i16 = bVar.f2343b;
            if (i14 >= i16) {
                float f11 = ((i16 - 1) - i10) / (i14 - i10);
                int i17 = i16 - 1;
                f8 = f11;
                i14 = i17;
            } else {
                f8 = 1.0f;
            }
        }
        float f12 = i11;
        int i18 = (int) (f12 - ((i13 - i11) * f8));
        if (i18 < 0) {
            f10 = f12 / (i11 - i18);
        } else {
            int i19 = bVar.c;
            if (i18 >= i19) {
                f10 = ((i19 - 1) - i11) / (i18 - i11);
                i15 = i19 - 1;
            } else {
                i15 = i18;
                f10 = 1.0f;
            }
        }
        return (N(i10, i11, (int) (((i14 - i10) * f10) + i10), i15) + N) - 1.0f;
    }

    public d P(d dVar) {
        if (((t6.a) this.c).equals((t6.a) dVar.c)) {
            if (dVar.A()) {
                return this;
            }
            int[] iArr = (int[]) dVar.d;
            int length = iArr.length;
            int[] iArr2 = new int[length];
            int i10 = 0;
            while (true) {
                t6.a aVar = (t6.a) dVar.c;
                if (i10 < length) {
                    int i11 = iArr[i10];
                    aVar.getClass();
                    iArr2[i10] = (929 - i11) % 929;
                    i10++;
                } else {
                    return c(new d(aVar, iArr2));
                }
            }
        } else {
            j1.i.k("ModulusPolys do not have same ModulusGF field");
            return null;
        }
    }

    public String R() {
        String joinToString$default;
        ArrayList arrayList = new ArrayList(4);
        CoroutineContext coroutineContext = (CoroutineContext) this.c;
        if (coroutineContext != EmptyCoroutineContext.INSTANCE) {
            arrayList.add("context=" + coroutineContext);
        }
        arrayList.add("capacity=-2");
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null);
        sb.append(joinToString$default);
        sb.append(']');
        return sb.toString();
    }

    public d c(d dVar) {
        t6.a aVar = (t6.a) this.c;
        if (aVar.equals((t6.a) dVar.c)) {
            if (A()) {
                return dVar;
            }
            if (dVar.A()) {
                return this;
            }
            int[] iArr = (int[]) this.d;
            int[] iArr2 = (int[]) dVar.d;
            if (iArr.length <= iArr2.length) {
                iArr = iArr2;
                iArr2 = iArr;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i10 = length; i10 < iArr.length; i10++) {
                iArr3[i10] = aVar.a(iArr2[i10 - length], iArr[i10]);
            }
            return new d(aVar, iArr3);
        }
        j1.i.k("ModulusPolys do not have same ModulusGF field");
        return null;
    }

    @Override // y8.f
    public Object collect(y8.g gVar, Continuation continuation) {
        Object a10 = y.a(new z8.d(gVar, this, null), continuation);
        if (a10 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return a10;
        }
        return Unit.INSTANCE;
    }

    @Override // q.p
    public void d() {
        x xVar = (x) this.c;
        synchronized (xVar) {
            xVar.d = xVar.f5160b.length;
        }
    }

    @Override // h.k
    public int e(h.h hVar) {
        return 2;
    }

    public void f(Object obj, String str) {
        ((ArrayList) this.c).add(ai.onnxruntime.a.D(str, "=", String.valueOf(obj)));
    }

    public n7.b g() {
        if (((IdentityHashMap) this.d) != null) {
            for (Map.Entry entry : ((n7.b) this.c).f4158a.entrySet()) {
                if (!((IdentityHashMap) this.d).containsKey(entry.getKey())) {
                    ((IdentityHashMap) this.d).put((n7.a) entry.getKey(), entry.getValue());
                }
            }
            this.c = new n7.b((IdentityHashMap) this.d);
            this.d = null;
        }
        return (n7.b) this.c;
    }

    @Override // h.b
    public boolean h(Object obj, File file, h.h hVar) {
        return ((q.b) this.d).h(new q.e(((BitmapDrawable) ((d0) obj).get()).getBitmap(), (k.b) this.c), file, hVar);
    }

    public float i(x6.c cVar, x6.c cVar2) {
        int i10 = (int) cVar.f6875a;
        int i11 = (int) cVar.f6876b;
        int i12 = (int) cVar2.f6875a;
        int i13 = (int) cVar2.f6876b;
        float O = O(i10, i11, i12, i13);
        float O2 = O((int) cVar2.f6875a, i13, (int) cVar.f6875a, i11);
        if (Float.isNaN(O)) {
            return O2 / 7.0f;
        }
        if (Float.isNaN(O2)) {
            return O / 7.0f;
        }
        return (O + O2) / 14.0f;
    }

    public void j() {
        ((j1) this.c).c = true;
        ((ScheduledFuture) this.d).cancel(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r5v0, types: [x8.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10, types: [x8.q] */
    /* JADX WARN: Type inference failed for: r6v3, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(x8.q r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof y8.b
            if (r0 == 0) goto L13
            r0 = r6
            y8.b r0 = (y8.b) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            y8.b r0 = new y8.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            x8.q r5 = r0.f6647b
            kotlin.ResultKt.throwOnFailure(r6)
            goto L4d
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            j1.i.l(r5)
        L30:
            r5 = 0
            return r5
        L32:
            kotlin.ResultKt.throwOnFailure(r6)
            r0.f6647b = r5
            r0.e = r3
            java.lang.Object r6 = r4.d
            kotlin.coroutines.jvm.internal.SuspendLambda r6 = (kotlin.coroutines.jvm.internal.SuspendLambda) r6
            java.lang.Object r6 = r6.invoke(r5, r0)
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r6 != r0) goto L48
            goto L4a
        L48:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
        L4a:
            if (r6 != r1) goto L4d
            return r1
        L4d:
            x8.g r5 = (x8.g) r5
            x8.b r5 = r5.e
            boolean r5 = r5.r()
            if (r5 == 0) goto L5a
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L5a:
            java.lang.String r5 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            j1.i.l(r5)
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: l.d.k(x8.q, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // q.p
    public void l(Bitmap bitmap, k.b bVar) {
        IOException iOException = ((c0.e) this.d).c;
        if (iOException != null) {
            if (bitmap != null) {
                bVar.c(bitmap);
                throw iOException;
            }
            throw iOException;
        }
    }

    public int n(int i10) {
        t6.a aVar = (t6.a) this.c;
        int[] iArr = (int[]) this.d;
        if (i10 == 0) {
            return q(0);
        }
        if (i10 == 1) {
            int i11 = 0;
            for (int i12 : iArr) {
                i11 = aVar.a(i11, i12);
            }
            return i11;
        }
        int i13 = iArr[0];
        int length = iArr.length;
        for (int i14 = 1; i14 < length; i14++) {
            i13 = aVar.a(aVar.c(i10, i13), iArr[i14]);
        }
        return i13;
    }

    public x6.a o(float f8, float f10, int i10, int i11) {
        int i12;
        x6.a b10;
        x6.a b11;
        int i13 = (int) (f10 * f8);
        int max = Math.max(0, i10 - i13);
        f6.b bVar = (f6.b) this.c;
        int min = Math.min(bVar.f2343b - 1, i10 + i13) - max;
        float f11 = 3.0f * f8;
        if (min >= f11) {
            int max2 = Math.max(0, i11 - i13);
            int min2 = Math.min(bVar.c - 1, i11 + i13) - max2;
            if (min2 >= f11) {
                f6.b bVar2 = (f6.b) this.c;
                x6.b bVar3 = new x6.b(bVar2, max, max2, min, min2, f8, (z5.p) this.d);
                int i14 = bVar3.e;
                int i15 = bVar3.c;
                int i16 = i14 + i15;
                int i17 = bVar3.f6500f;
                int i18 = (i17 / 2) + bVar3.d;
                int[] iArr = new int[3];
                for (int i19 = 0; i19 < i17; i19++) {
                    if ((i19 & 1) == 0) {
                        i12 = (i19 + 1) / 2;
                    } else {
                        i12 = -((i19 + 1) / 2);
                    }
                    int i20 = i12 + i18;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    iArr[2] = 0;
                    int i21 = i15;
                    while (i21 < i16 && !bVar2.b(i21, i20)) {
                        i21++;
                    }
                    int i22 = 0;
                    while (i21 < i16) {
                        if (bVar2.b(i21, i20)) {
                            if (i22 == 1) {
                                iArr[1] = iArr[1] + 1;
                            } else if (i22 == 2) {
                                if (bVar3.a(iArr) && (b11 = bVar3.b(i20, i21, iArr)) != null) {
                                    return b11;
                                }
                                iArr[0] = iArr[2];
                                iArr[1] = 1;
                                iArr[2] = 0;
                                i22 = 1;
                            } else {
                                i22++;
                                iArr[i22] = iArr[i22] + 1;
                            }
                        } else {
                            if (i22 == 1) {
                                i22++;
                            }
                            iArr[i22] = iArr[i22] + 1;
                        }
                        i21++;
                    }
                    if (bVar3.a(iArr) && (b10 = bVar3.b(i20, i16, iArr)) != null) {
                        return b10;
                    }
                }
                ArrayList arrayList = bVar3.f6499b;
                if (!arrayList.isEmpty()) {
                    return (x6.a) arrayList.get(0);
                }
                throw z5.i.d;
            }
            throw z5.i.d;
        }
        throw z5.i.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad A[ADDED_TO_REGION] */
    @Override // androidx.core.view.OnApplyWindowInsetsListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View r18, androidx.core.view.WindowInsetsCompat r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.Object r3 = r0.c
            g3.b r3 = (g3.b) r3
            java.lang.Object r4 = r0.d
            l.h r4 = (l.h) r4
            int r5 = r4.f3485a
            int r6 = r4.f3486b
            int r4 = r4.c
            int r7 = androidx.core.view.WindowInsetsCompat.Type.systemBars()
            androidx.core.graphics.Insets r7 = r2.getInsets(r7)
            int r8 = androidx.core.view.WindowInsetsCompat.Type.mandatorySystemGestures()
            androidx.core.graphics.Insets r8 = r2.getInsets(r8)
            com.google.android.material.bottomsheet.BottomSheetBehavior r9 = r3.f2444b
            int r10 = r7.top
            r9.w = r10
            int r10 = r1.getLayoutDirection()
            r12 = 1
            if (r10 != r12) goto L33
            r10 = r12
            goto L34
        L33:
            r10 = 0
        L34:
            int r13 = r1.getPaddingBottom()
            int r14 = r1.getPaddingLeft()
            int r15 = r1.getPaddingRight()
            boolean r11 = r9.f1238o
            if (r11 == 0) goto L4b
            int r13 = r2.getSystemWindowInsetBottom()
            r9.f1243v = r13
            int r13 = r13 + r4
        L4b:
            boolean r4 = r9.f1239p
            if (r4 == 0) goto L57
            if (r10 == 0) goto L53
            r4 = r6
            goto L54
        L53:
            r4 = r5
        L54:
            int r14 = r7.left
            int r14 = r14 + r4
        L57:
            boolean r4 = r9.f1240q
            if (r4 == 0) goto L63
            if (r10 == 0) goto L5e
            goto L5f
        L5e:
            r5 = r6
        L5f:
            int r4 = r7.right
            int r15 = r5 + r4
        L63:
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            boolean r5 = r9.f1241s
            if (r5 == 0) goto L78
            int r5 = r4.leftMargin
            int r6 = r7.left
            if (r5 == r6) goto L78
            r4.leftMargin = r6
            r16 = r12
            goto L7a
        L78:
            r16 = 0
        L7a:
            boolean r5 = r9.t
            if (r5 == 0) goto L88
            int r5 = r4.rightMargin
            int r6 = r7.right
            if (r5 == r6) goto L88
            r4.rightMargin = r6
            r16 = r12
        L88:
            boolean r5 = r9.f1242u
            if (r5 == 0) goto L95
            int r5 = r4.topMargin
            int r6 = r7.top
            if (r5 == r6) goto L95
            r4.topMargin = r6
            goto L97
        L95:
            r12 = r16
        L97:
            if (r12 == 0) goto L9c
            r1.setLayoutParams(r4)
        L9c:
            int r4 = r1.getPaddingTop()
            r1.setPadding(r14, r4, r15, r13)
            boolean r1 = r3.f2443a
            if (r1 == 0) goto Lab
            int r3 = r8.bottom
            r9.f1236m = r3
        Lab:
            if (r11 != 0) goto Lb1
            if (r1 == 0) goto Lb0
            goto Lb1
        Lb0:
            return r2
        Lb1:
            r9.r()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l.d.onApplyWindowInsets(android.view.View, androidx.core.view.WindowInsetsCompat):androidx.core.view.WindowInsetsCompat");
    }

    public s6.a p(int i10) {
        s6.a aVar;
        s6.a aVar2;
        s6.a[] aVarArr = (s6.a[]) this.d;
        s6.a aVar3 = aVarArr[x(i10)];
        if (aVar3 != null) {
            return aVar3;
        }
        for (int i11 = 1; i11 < 5; i11++) {
            int x9 = x(i10) - i11;
            if (x9 >= 0 && (aVar2 = aVarArr[x9]) != null) {
                return aVar2;
            }
            int x10 = x(i10) + i11;
            if (x10 < aVarArr.length && (aVar = aVarArr[x10]) != null) {
                return aVar;
            }
        }
        return null;
    }

    public int q(int i10) {
        return ((int[]) this.d)[(r0.length - 1) - i10];
    }

    public File r() {
        if (((File) this.c) == null) {
            synchronized (this) {
                try {
                    if (((File) this.c) == null) {
                        o4.f fVar = (o4.f) this.d;
                        fVar.a();
                        this.c = new File(fVar.f4359a.getFilesDir(), "PersistedInstallation." + ((o4.f) this.d).c() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.c;
    }

    public int s() {
        return ((int[]) this.d).length - 1;
    }

    public synchronized List t(String str) {
        List list;
        try {
            if (!((ArrayList) this.d).contains(str)) {
                ((ArrayList) this.d).add(str);
            }
            list = (List) ((HashMap) this.c).get(str);
            if (list == null) {
                list = new ArrayList();
                ((HashMap) this.c).put(str, list);
            }
        } catch (Throwable th) {
            throw th;
        }
        return list;
    }

    public String toString() {
        switch (this.f3480b) {
            case 10:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.d.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.c;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    sb.append((String) arrayList.get(i10));
                    if (i10 < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            case 14:
                Formatter formatter = new Formatter();
                try {
                    int i11 = 0;
                    for (s6.a aVar : (s6.a[]) this.d) {
                        if (aVar == null) {
                            formatter.format("%3d:    |   %n", Integer.valueOf(i11));
                            i11++;
                        } else {
                            formatter.format("%3d: %3d|%3d%n", Integer.valueOf(i11), Integer.valueOf(aVar.f5714f), Integer.valueOf(aVar.e));
                            i11++;
                        }
                    }
                    String formatter2 = formatter.toString();
                    formatter.close();
                    return formatter2;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            formatter.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            case 16:
                return "Request{url=" + ((s7.a) this.c) + '}';
            case 17:
                StringBuilder sb2 = new StringBuilder(s() * 8);
                for (int s5 = s(); s5 >= 0; s5--) {
                    int q8 = q(s5);
                    if (q8 != 0) {
                        if (q8 < 0) {
                            sb2.append(" - ");
                            q8 = -q8;
                        } else if (sb2.length() > 0) {
                            sb2.append(" + ");
                        }
                        if (s5 == 0 || q8 != 1) {
                            sb2.append(q8);
                        }
                        if (s5 != 0) {
                            if (s5 == 1) {
                                sb2.append('x');
                            } else {
                                sb2.append("x^");
                                sb2.append(s5);
                            }
                        }
                    }
                }
                return sb2.toString();
            case 24:
                return "block[" + ((SuspendLambda) this.d) + "] -> " + R();
            default:
                return super.toString();
        }
    }

    public synchronized ArrayList u(Class cls, Class cls2) {
        ArrayList arrayList;
        boolean z9;
        arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) this.d;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            List<x.c> list = (List) ((HashMap) this.c).get((String) obj);
            if (list != null) {
                for (x.c cVar : list) {
                    if (cVar.f6420a.isAssignableFrom(cls) && cls2.isAssignableFrom(cVar.f6421b)) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9 && !arrayList.contains(cVar.f6421b)) {
                        arrayList.add(cVar.f6421b);
                    }
                }
            }
        }
        return arrayList;
    }

    public String v(String str) {
        String str2 = (String) this.d;
        Resources resources = (Resources) this.c;
        int identifier = resources.getIdentifier(str, TypedValues.Custom.S_STRING, str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public void w(String str, String str2) {
        ArrayList arrayList = ((i7.i) this.d).f2803b;
        if (!str.isEmpty()) {
            int length = str.length();
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                char charAt = str.charAt(i11);
                if (charAt <= 31 || charAt >= 127) {
                    j1.i.k(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i11), str));
                    return;
                }
            }
            if (str2 != null) {
                int length2 = str2.length();
                for (int i12 = 0; i12 < length2; i12++) {
                    char charAt2 = str2.charAt(i12);
                    if (charAt2 <= 31 || charAt2 >= 127) {
                        j1.i.k(String.format(Locale.US, "Unexpected char %#04x at %d in header value: %s", Integer.valueOf(charAt2), Integer.valueOf(i12), str2));
                        return;
                    }
                }
                while (i10 < arrayList.size()) {
                    if (str.equalsIgnoreCase((String) arrayList.get(i10))) {
                        arrayList.remove(i10);
                        arrayList.remove(i10);
                        i10 -= 2;
                    }
                    i10 += 2;
                }
                arrayList.add(str);
                arrayList.add(str2.trim());
                return;
            }
            j1.i.k("value == null");
            return;
        }
        j1.i.k("name is empty");
    }

    public int x(int i10) {
        return i10 - ((s6.c) this.c).f5720h;
    }

    public void y(m5.b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.f3939a);
            jSONObject.put("Status", com.bumptech.glide.g.c(bVar.f3940b));
            jSONObject.put("AuthToken", bVar.c);
            jSONObject.put("RefreshToken", bVar.d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f3941f);
            jSONObject.put("ExpiresInSecs", bVar.e);
            jSONObject.put("FisError", bVar.f3942g);
            o4.f fVar = (o4.f) this.d;
            fVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", fVar.f4359a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(r())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public boolean z() {
        return ((Logger) this.c).isLoggable((Level) this.d);
    }

    public /* synthetic */ d(int i10, Object obj, Object obj2) {
        this.f3480b = i10;
        this.c = obj;
        this.d = obj2;
    }

    public /* synthetic */ d(Object obj) {
        this.f3480b = 10;
        this.d = obj;
        this.c = new ArrayList();
    }

    public d(Context context, int i10) {
        this.f3480b = i10;
        switch (i10) {
            case 11:
                r2.a.b(context);
                Resources resources = context.getResources();
                this.c = resources;
                this.d = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
                return;
            default:
                this.c = context;
                this.d = new c00008(context);
                return;
        }
    }

    public /* synthetic */ d(int i10, Object obj) {
        this.f3480b = i10;
        this.c = obj;
    }

    public d(t6.a aVar, int[] iArr) {
        this.f3480b = 17;
        if (iArr.length != 0) {
            this.c = aVar;
            int length = iArr.length;
            int i10 = 1;
            if (length > 1 && iArr[0] == 0) {
                while (i10 < length && iArr[i10] == 0) {
                    i10++;
                }
                if (i10 == length) {
                    this.d = new int[]{0};
                    return;
                }
                int i11 = length - i10;
                int[] iArr2 = new int[i11];
                this.d = iArr2;
                System.arraycopy(iArr, i10, iArr2, 0, i11);
                return;
            }
            this.d = iArr;
            return;
        }
        l9.i.a();
        throw null;
    }

    public d(d dVar) {
        this.f3480b = 16;
        this.c = (s7.a) dVar.c;
        i7.i iVar = (i7.i) dVar.d;
        iVar.getClass();
        this.d = new n.p(iVar);
    }

    public d(s6.c cVar) {
        this.f3480b = 14;
        this.c = new s6.c(cVar);
        this.d = new s6.a[(cVar.f5721i - cVar.f5720h) + 1];
    }

    public d(f1 f1Var, Object obj) {
        this.f3480b = 4;
        o4.b.i(f1Var, NotificationCompat.CATEGORY_STATUS);
        this.c = f1Var;
        this.d = obj;
    }

    public d(o4.f fVar) {
        this.f3480b = 2;
        this.d = fVar;
    }

    public d(j1 j1Var, ScheduledFuture scheduledFuture) {
        this.f3480b = 5;
        this.c = j1Var;
        o4.b.i(scheduledFuture, "future");
        this.d = scheduledFuture;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(Function2 function2) {
        this(24, EmptyCoroutineContext.INSTANCE);
        this.f3480b = 24;
        this.d = (SuspendLambda) function2;
    }
}
