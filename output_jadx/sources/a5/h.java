package a5;

import android.app.Application;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.ParcelFileDescriptor;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import b1.m;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import d2.s;
import e0.s3;
import f5.k0;
import f5.l0;
import f5.y;
import j.d0;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.Adler32;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.ByteCompanionObject;
import n7.e1;
import n7.f1;
import n7.o;
import n7.v0;
import n7.w0;
import o7.o2;
import o7.p;
import o7.q;
import o7.r;
import o7.t;
import o7.v;
import o7.w;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import okhttp3.ResponseBody;
import q.x;
import q6.k;
import t4.j;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class h implements f2.b, e5.b, Callback, w, v.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48b;
    public Object c;
    public Object d;
    public Object e;

    public h(f6.b bVar) {
        int i10;
        int i11;
        this.f48b = 16;
        int i12 = bVar.c;
        if (i12 >= 8 && i12 <= 144 && (i10 = i12 & 1) == 0) {
            int i13 = bVar.f2343b;
            j6.d[] dVarArr = j6.d.f3314h;
            if (i10 == 0 && (i13 & 1) == 0) {
                j6.d[] dVarArr2 = j6.d.f3314h;
                for (int i14 = 0; i14 < 30; i14++) {
                    j6.d dVar = dVarArr2[i14];
                    int i15 = dVar.f3316b;
                    if (i15 == i12 && (i11 = dVar.c) == i13) {
                        this.e = dVar;
                        if (i12 == i15) {
                            int i16 = dVar.d;
                            int i17 = dVar.e;
                            int i18 = i15 / i16;
                            int i19 = i11 / i17;
                            f6.b bVar2 = new f6.b(i19 * i17, i18 * i16);
                            for (int i20 = 0; i20 < i18; i20++) {
                                int i21 = i20 * i16;
                                for (int i22 = 0; i22 < i19; i22++) {
                                    int i23 = i22 * i17;
                                    for (int i24 = 0; i24 < i16; i24++) {
                                        int i25 = ((i16 + 2) * i20) + 1 + i24;
                                        int i26 = i21 + i24;
                                        for (int i27 = 0; i27 < i17; i27++) {
                                            if (bVar.b(((i17 + 2) * i22) + 1 + i27, i25)) {
                                                bVar2.f(i23 + i27, i26);
                                            }
                                        }
                                    }
                                }
                            }
                            this.c = bVar2;
                            this.d = new f6.b(bVar2.f2343b, bVar2.c);
                            return;
                        }
                        j1.i.k("Dimension of bitMatrix must match the version size");
                        throw null;
                    }
                }
                throw z5.e.a();
            }
            throw z5.e.a();
        }
        throw z5.e.a();
    }

    public static int h(int i10, int i11, f6.a aVar) {
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            if (aVar.d(i10 + i13)) {
                i12 |= 1 << ((i11 - i13) - 1);
            }
        }
        return i12;
    }

    public static Method o(Class cls, String str, Class[] clsArr) {
        if (cls != null) {
            try {
                if ((cls.getModifiers() & 1) == 0) {
                    return o(cls.getSuperclass(), str, clsArr);
                }
                Method method = cls.getMethod(str, clsArr);
                try {
                    if ((method.getModifiers() & 1) != 0) {
                        return method;
                    }
                } catch (NoSuchMethodException unused) {
                    return method;
                }
            } catch (NoSuchMethodException unused2) {
                return null;
            }
        }
        return null;
    }

    @Override // v.a
    public d0 a(d0 d0Var, h.h hVar) {
        Drawable drawable = (Drawable) d0Var.get();
        if (drawable instanceof BitmapDrawable) {
            return ((j.i) this.d).a(q.e.c(((BitmapDrawable) drawable).getBitmap(), (k.b) this.c), hVar);
        }
        if (drawable instanceof u.b) {
            return ((v.c) this.e).a(d0Var, hVar);
        }
        return null;
    }

    @Override // o7.w
    public void b(f1 f1Var, v vVar, v0 v0Var) {
        w7.b.c();
        try {
            w7.b.a();
            c(f1Var, v0Var);
            w7.b.f6413a.getClass();
        } catch (Throwable th) {
            try {
                w7.b.f6413a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void c(f1 f1Var, v0 v0Var) {
        t tVar = (t) this.e;
        o oVar = tVar.f4706k.f4164a;
        tVar.f4703h.getClass();
        if (oVar == null) {
            oVar = null;
        }
        v0 v0Var2 = v0Var;
        v0Var2 = v0Var;
        if (f1Var.f4204a == e1.CANCELLED && oVar != null) {
            v0Var2 = v0Var;
            if (oVar.a()) {
                i7.i iVar = new i7.i(1);
                tVar.f4707l.e(iVar);
                f1Var = f1.f4196h.b("ClientCall was cancelled at or after deadline. " + iVar);
                v0Var2 = new Object();
            }
        }
        w7.b.b();
        tVar.e.execute(new q(this, f1Var, v0Var2));
    }

    public String d(StringBuilder sb, int i10) {
        String str;
        String str2 = null;
        while (true) {
            q6.h f8 = f(i10, str2);
            String a10 = k.a(f8.f5287b);
            if (a10 != null) {
                sb.append(a10);
            }
            if (f8.d) {
                str = String.valueOf(f8.c);
            } else {
                str = null;
            }
            int i11 = f8.f5289a;
            if (i10 != i11) {
                i10 = i11;
                str2 = str;
            } else {
                return sb.toString();
            }
        }
    }

    public Bitmap e(BitmapFactory.Options options) {
        switch (this.f48b) {
            case 21:
                return BitmapFactory.decodeStream(new c0.a(c0.b.c((ByteBuffer) this.c)), null, options);
            case 22:
                x xVar = (x) ((com.bumptech.glide.load.data.i) this.c).c;
                xVar.reset();
                return BitmapFactory.decodeStream(xVar, null, options);
            default:
                return BitmapFactory.decodeFileDescriptor(((com.bumptech.glide.load.data.i) this.e).e().getFileDescriptor(), null, options);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x0218, code lost:
    
        if (r7 <= r2.c) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x021b, code lost:
    
        if (r6 >= r7) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0221, code lost:
    
        if (r2.d(r6) == false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x023d, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0240, code lost:
    
        r3.f536b += 3;
        r3.c = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x024b, code lost:
    
        r5 = new d6.d(null, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0229, code lost:
    
        if (s(r3.f536b) == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x022b, code lost:
    
        r6 = r3.f536b;
        r7 = r6 + 5;
        r8 = r2.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0231, code lost:
    
        if (r7 >= r8) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0233, code lost:
    
        r3.f536b = r6 + 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x023a, code lost:
    
        r3.c = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0238, code lost:
    
        r3.f536b = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x02d6, code lost:
    
        r5 = r6;
        r6 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0322 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0330  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q6.h f(int r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.h.f(int, java.lang.String):q6.h");
    }

    public void g(g2.a aVar, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.c;
        f fVar = new f(byteArrayOutputStream, hashMap, (HashMap) this.d, (x4.d) this.e);
        x4.d dVar = (x4.d) hashMap.get(g2.a.class);
        if (dVar != null) {
            dVar.a(aVar, fVar);
            return;
        }
        throw new RuntimeException(ai.onnxruntime.a.j(g2.a.class, "No encoder for "));
    }

    @Override // t8.a
    public Object get() {
        boolean z9;
        switch (this.f48b) {
            case 2:
                ((s3) this.c).get();
                return new s((j2.i) ((c2.k) this.d).get(), (m) ((m) this.e).get());
            case 3:
            case 6:
            default:
                return new h((Context) ((t8.a) this.c).get(), (k2.d) ((t8.a) this.d).get(), (j2.a) ((c5.e) this.e).get(), 15);
            case 4:
                return new f5.g((y) ((t8.a) this.c).get(), (Application) ((t8.a) this.d).get(), (i5.a) ((w7.c) this.e).get());
            case 5:
                x7.k kVar = (x7.k) ((t8.a) this.c).get();
                return new k0(kVar, (x7.k) ((t8.a) this.e).get());
            case 7:
                h hVar = (h) this.c;
                l0 l0Var = (l0) ((h5.a) this.d).get();
                b5.b bVar = (b5.b) ((g5.a) this.e).get();
                o4.f fVar = (o4.f) hVar.c;
                android.support.v4.media.h hVar2 = new android.support.v4.media.h(8, false);
                hVar2.c = l0Var;
                fVar.a();
                p5.a aVar = (p5.a) fVar.f4362g.get();
                synchronized (aVar) {
                    z9 = aVar.f5004a;
                }
                hVar2.d = new AtomicBoolean(z9);
                e0.g gVar = new e0.g(8);
                j jVar = (j) bVar;
                u4.j jVar2 = jVar.c;
                synchronized (jVar) {
                    try {
                        jVar2.getClass();
                        if (!jVar.f5811a.containsKey(o4.b.class)) {
                            jVar.f5811a.put(o4.b.class, new ConcurrentHashMap());
                        }
                        ((ConcurrentHashMap) jVar.f5811a.get(o4.b.class)).put(gVar, jVar2);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return hVar2;
        }
    }

    public boolean i() {
        String str = (String) this.e;
        if (!str.equals(e0.m.h(new byte[]{69, 100, 73, -83, 43, 81, -33, 98, 116, 110, 92, -109, 60, 89, -34, 111, 78, 109}, new byte[]{43, 1, 46, -52, 95, 56, -80, 12})) && !str.equals(e0.m.h(new byte[]{-90, -74, 73, 3, -24, 3, -21, 121, -120, -84, 94, 47, -1, 5, -22, 115, -66, -73, 69, 31, -14}, new byte[]{-41, -61, 44, 112, -100, 106, -124, 23})) && !str.equals(e0.m.h(new byte[]{32, -26, -83, -7, 122, 105, -79, 26, 27, -20, -71, -61, 101, 110, -72, 10, 45, -13, -89, -7, 87, 120, -69, 19, 41, -30, -91, -8, 123}, new byte[]{68, -125, -53, -100, 8, 27, -44, 126})) && !str.equals(e0.m.h(new byte[]{8, -92, 112, -31, -78, 39, 89, -90, 58, -78, 115, -8, -74, 54, 91, -89, 22}, new byte[]{101, -47, 28, -107, -37, 87, 53, -61})) && !str.equals(e0.m.h(new byte[]{-94, -37, 57, 10, ByteCompanionObject.MIN_VALUE, 106, 73, 81, -112, -63, 55, 20, -116, 121, 81, 71}, new byte[]{-49, -82, 85, 126, -23, 26, 37, 52})) && !str.equals(e0.m.h(new byte[]{-4, 39, 3, 22, 77, -19, 58, -53, -50, 36, 14, 14, 81, -8, 37}, new byte[]{-111, 82, 111, 98, 36, -99, 86, -82})) && !str.equals(e0.m.h(new byte[]{37, -61, 51, 110, 15, 40, -18, 2, 55, -15, 54, 117, 7, 40, -15}, new byte[]{68, -82, 81, 7, 104, 93, -127, 119})) && !str.equals(e0.m.h(new byte[]{-48, 7, -75, 3, -8, 100, -102, 43, -44, 30, -66, 4, -2, 117, -68, 19, -47, 24, -91, 16}, new byte[]{-93, 119, -48, 96, -111, 2, -29, 116})) && !str.equals(e0.m.h(new byte[]{80, -94, 12, 126, -66, -21, 99, 75, 66, -112, 15, 126, -85, -8, 96, 81, 70, -112, 10, 126, -85, -5, 111, 74, 88, -96, 0}, new byte[]{49, -49, 110, 23, -39, -98, 12, 62})) && !str.equals(e0.m.h(new byte[]{-47, 65, -117, 25, -26, 106, -112, -73, -64, 73, -117, 30, -25, 96, -109, -115, -62, 119, -105, 16, -2, 90, -108, -99, -64, 88, -106, 13, -2, 96, -125}, new byte[]{-80, 40, -7, ByteCompanionObject.MAX_VALUE, -118, 5, -25, -24})) && !str.equals(e0.m.h(new byte[]{83, 124, -55, 113, -33, -114, 45, 6, 82, 119, -34, 91, -56, -116, 45, 1, 86}, new byte[]{38, 18, -70, 4, -81, -2, 66, 116})) && !str.startsWith(e0.m.h(new byte[]{60, ByteCompanionObject.MIN_VALUE, 36, -63, 7, -104, -16, 55, 54, -127, 45, -8}, new byte[]{95, -17, 74, -89, 107, -15, -109, 67})) && !str.equals(e0.m.h(new byte[]{63, -86, 65, 71, -105, 29, 10, 49, 14, -71, 71, 74, -106, 17}, new byte[]{81, -49, 38, 38, -29, 116, 124, 84})) && !str.startsWith(e0.m.h(new byte[]{32, 124, 120, 37, -6, 19, -113}, new byte[]{85, 18, 11, 68, -100, 118, -48, 6})) && !str.equals(e0.m.h(new byte[]{102, 83, -57, 58, -57, -99, 80, 120, 75, 89, -39, 4, -35, -111, 65, 124, 96, 95, -35, 62, -20, -126, 71, 113, 97, 83}, new byte[]{20, 54, -85, 91, -77, -12, 38, 29}))) {
            return false;
        }
        return true;
    }

    @Override // o7.w
    public void j() {
        t tVar = (t) this.e;
        w0 w0Var = tVar.d.f4255a;
        w0Var.getClass();
        if (w0Var != w0.f4252b && w0Var != w0.c) {
            w7.b.c();
            try {
                w7.b.a();
                w7.b.b();
                tVar.e.execute(new r(this));
                w7.b.f6413a.getClass();
            } catch (Throwable th) {
                try {
                    w7.b.f6413a.getClass();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // o7.w
    public void k(o2 o2Var) {
        t tVar = (t) this.e;
        w7.b.c();
        try {
            w7.b.a();
            w7.b.b();
            tVar.e.execute(new p(this, o2Var));
            w7.b.f6413a.getClass();
        } catch (Throwable th) {
            try {
                w7.b.f6413a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // o7.w
    public void l(v0 v0Var) {
        t tVar = (t) this.e;
        w7.b.c();
        try {
            w7.b.a();
            w7.b.b();
            tVar.e.execute(new p(this, v0Var));
            w7.b.f6413a.getClass();
        } catch (Throwable th) {
            try {
                w7.b.f6413a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public ImageHeaderParser$ImageType m() {
        switch (this.f48b) {
            case 21:
                return o4.b.w((List) this.d, c0.b.c((ByteBuffer) this.c));
            case 22:
                List list = (List) this.e;
                x xVar = (x) ((com.bumptech.glide.load.data.i) this.c).c;
                xVar.reset();
                return o4.b.v(list, xVar, (k.g) this.d);
            default:
                List list2 = (List) this.d;
                com.bumptech.glide.load.data.i iVar = (com.bumptech.glide.load.data.i) this.e;
                k.g gVar = (k.g) this.c;
                int size = list2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    h.d dVar = (h.d) list2.get(i10);
                    x xVar2 = null;
                    try {
                        x xVar3 = new x(new FileInputStream(iVar.e().getFileDescriptor()), gVar);
                        try {
                            ImageHeaderParser$ImageType c = dVar.c(xVar3);
                            xVar3.c();
                            iVar.e();
                            if (c != ImageHeaderParser$ImageType.UNKNOWN) {
                                return c;
                            }
                        } catch (Throwable th) {
                            th = th;
                            xVar2 = xVar3;
                            if (xVar2 != null) {
                                xVar2.c();
                            }
                            iVar.e();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public Method n(Class cls) {
        Class cls2;
        Method o5 = o(cls, (String) this.d, (Class[]) this.e);
        if (o5 != null && (cls2 = (Class) this.c) != null && !cls2.isAssignableFrom(o5.getReturnType())) {
            return null;
        }
        return o5;
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException iOException) {
        Log.e(e0.m.h(new byte[]{93, -39, 15, -30, -100, 2, 55, 84, 124, -53, 8, -20, -66}, new byte[]{25, -72, 123, -125, -52, 112, 88, 55}), e0.m.h(new byte[]{99, 116, 103, -85, -114, 111, 77, 73, 99, 80, 102, -109, 126, 7, 42, 40, 3, 58, 5, -14, -34, 6, 30, 40, 4, 58, 12, -13, -26, -9, 77, 64, -109, 58, 8, -13, -17, 6, 29, 40, 3, 58, 7, -13, -32, 6, 31, 40, 9, 58, 14, 3, -114, 99, 77, 72, 99, 87, 102, -98, -113, 92, 76, 125, -119, -54}, new byte[]{-77, -22, -74, 35, 94, -41, -99, -8}) + iOException.getMessage());
        i7.j.f2804f = Boolean.TRUE;
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        String str = (String) this.d;
        i7.j jVar = (i7.j) this.e;
        String str2 = (String) this.c;
        try {
            ResponseBody body = response.body();
            if (body != null) {
                InputStream byteStream = body.byteStream();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(str2);
                    try {
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int read = byteStream.read(bArr);
                            if (read == -1) {
                                break;
                            } else {
                                fileOutputStream.write(bArr, 0, read);
                            }
                        }
                        Log.d(e0.m.h(new byte[]{-82, 88, -77, -109, 66, -116, 91, 67, -113, 74, -76, -99, 96}, new byte[]{-22, 57, -57, -14, 18, -2, 52, 32}), e0.m.h(new byte[]{-65, 43, -61, 115, 67, -91, 36, -105, 53, -37, 67, -24, -78, -16, 117, -9, 95, -78, 35, -126, 21, -15, 68, -9, 88, 88, -77}, new byte[]{-27, 98, -109, 83, -110, 33, -12, 39}) + str2);
                        i7.j.c(jVar, str2, str);
                        i7.j.b(jVar, str);
                        fileOutputStream.close();
                    } finally {
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            i7.j.f2804f = Boolean.TRUE;
        } catch (Exception e6) {
            Log.e(e0.m.h(new byte[]{78, 64, 69, -104, 99, -37, -72, -19, 111, 82, 66, -106, 65}, new byte[]{10, 33, 49, -7, 51, -87, -41, -114}), e0.m.h(new byte[]{47, -92, -2, 90, 8, 32, -119, 3, 47, ByteCompanionObject.MIN_VALUE, -1, 98, -8, 72, -18, 98, 79, -22, -100, 3, 88, 73, -38, 98, 72, -22, -107, 2, 96, -72, -119, 10, -33, -22, -111, 2, 105, 73, -39, 98, 79, -22, -98, 2, 102, 73, -37, 98, 69, -22, -105, -14, 8, 44, -119, 2, 47, -121, -1, 111, 9, 19, -120, 55, -59, 26}, new byte[]{-1, 58, 47, -46, -40, -104, 89, -78}) + e6.getMessage());
            i7.j.f2804f = Boolean.TRUE;
        }
    }

    public Object p(SSLSocket sSLSocket, Object... objArr) {
        Method n10 = n(sSLSocket.getClass());
        if (n10 != null) {
            try {
                return n10.invoke(sSLSocket, objArr);
            } catch (IllegalAccessException e) {
                AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + n10);
                assertionError.initCause(e);
                throw assertionError;
            }
        }
        n0.b.B("Method ", (String) this.d, " not supported for object ", sSLSocket);
        return null;
    }

    public void q(SSLSocket sSLSocket, Object... objArr) {
        try {
            Method n10 = n(sSLSocket.getClass());
            if (n10 == null) {
                return;
            }
            try {
                n10.invoke(sSLSocket, objArr);
            } catch (IllegalAccessException unused) {
            }
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public Object r(SSLSocket sSLSocket, Object... objArr) {
        try {
            return p(sSLSocket, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public boolean s(int i10) {
        int i11;
        int i12 = i10 + 1;
        f6.a aVar = (f6.a) this.c;
        if (i12 > aVar.c) {
            return false;
        }
        for (int i13 = 0; i13 < 5 && (i11 = i13 + i10) < aVar.c; i13++) {
            if (i13 == 2) {
                if (!aVar.d(i10 + 2)) {
                    return false;
                }
            } else if (aVar.d(i11)) {
                return false;
            }
        }
        return true;
    }

    public boolean t(int i10, int i11, int i12, int i13) {
        if (i10 < 0) {
            i10 += i12;
            i11 += 4 - ((i12 + 4) & 7);
        }
        if (i11 < 0) {
            i11 += i13;
            i10 += 4 - ((i13 + 4) & 7);
        }
        ((f6.b) this.d).f(i11, i10);
        return ((f6.b) this.c).b(i11, i10);
    }

    public int u(int i10, int i11, int i12, int i13) {
        int i14 = i10 - 2;
        int i15 = i11 - 2;
        int i16 = (t(i14, i15, i12, i13) ? 1 : 0) << 1;
        int i17 = i11 - 1;
        if (t(i14, i17, i12, i13)) {
            i16 |= 1;
        }
        int i18 = i16 << 1;
        int i19 = i10 - 1;
        if (t(i19, i15, i12, i13)) {
            i18 |= 1;
        }
        int i20 = i18 << 1;
        if (t(i19, i17, i12, i13)) {
            i20 |= 1;
        }
        int i21 = i20 << 1;
        if (t(i19, i11, i12, i13)) {
            i21 |= 1;
        }
        int i22 = i21 << 1;
        if (t(i10, i15, i12, i13)) {
            i22 |= 1;
        }
        int i23 = i22 << 1;
        if (t(i10, i17, i12, i13)) {
            i23 |= 1;
        }
        int i24 = i23 << 1;
        if (t(i10, i11, i12, i13)) {
            return i24 | 1;
        }
        return i24;
    }

    public void v(d2.q qVar, int i10, boolean z9) {
        Long l10;
        j2.a aVar = (j2.a) this.e;
        Context context = (Context) this.c;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        d2.j jVar = (d2.j) qVar;
        adler32.update(jVar.f1745a.getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(n2.a.a(jVar.c)).array());
        byte[] bArr = jVar.f1746b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z9) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i11 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i11 >= i10) {
                        e3.d.d(qVar, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        SQLiteDatabase b10 = ((k2.h) ((k2.d) this.d)).b();
        String str = jVar.f1745a;
        a2.b bVar = jVar.c;
        Cursor rawQuery = b10.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(n2.a.a(bVar))});
        try {
            if (rawQuery.moveToNext()) {
                l10 = Long.valueOf(rawQuery.getLong(0));
            } else {
                l10 = 0L;
            }
            rawQuery.close();
            long longValue = l10.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(aVar.a(bVar, longValue, i10));
            Set set = ((j2.b) aVar.f3242b.get(bVar)).c;
            if (set.contains(j2.c.f3245b)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(j2.c.d)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(j2.c.c)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i10);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", n2.a.a(bVar));
            byte[] bArr2 = jVar.f1746b;
            if (bArr2 != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr2, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {qVar, Integer.valueOf(value), Long.valueOf(aVar.a(bVar, longValue, i10)), l10, Integer.valueOf(i10)};
            String j10 = e3.d.j("JobInfoScheduler");
            if (Log.isLoggable(j10, 3)) {
                Log.d(j10, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    private final void w() {
    }

    private final void x() {
    }

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, int i10) {
        this.f48b = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, int i10, boolean z9) {
        this.f48b = i10;
        this.e = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ h(int i10) {
        this.f48b = i10;
    }

    public h(f6.a aVar) {
        this.f48b = 24;
        c6.a aVar2 = new c6.a();
        aVar2.f536b = 0;
        aVar2.c = 1;
        this.d = aVar2;
        this.e = new StringBuilder();
        this.c = aVar;
    }

    public h(c0.m mVar, ArrayList arrayList, k.g gVar) {
        this.f48b = 22;
        c0.g.c(gVar, "Argument must not be null");
        this.d = gVar;
        c0.g.c(arrayList, "Argument must not be null");
        this.e = arrayList;
        this.c = new com.bumptech.glide.load.data.i(mVar, gVar);
    }

    public h(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, k.g gVar) {
        this.f48b = 23;
        c0.g.c(gVar, "Argument must not be null");
        this.c = gVar;
        c0.g.c(arrayList, "Argument must not be null");
        this.d = arrayList;
        this.e = new com.bumptech.glide.load.data.i(parcelFileDescriptor);
    }

    public h(j.r rVar, y.f fVar, j.v vVar) {
        this.f48b = 14;
        this.e = rVar;
        this.d = fVar;
        this.c = vVar;
    }

    public h(t tVar, n7.e eVar) {
        this.f48b = 18;
        this.e = tVar;
        this.c = eVar;
    }
}
