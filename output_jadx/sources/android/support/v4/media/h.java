package android.support.v4.media;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import b4.l;
import i8.q;
import i9.c1;
import i9.m0;
import i9.r;
import i9.t;
import i9.v0;
import j.g0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import n.p;
import org.json.JSONObject;
import t4.n;
import x7.m;
import z5.o;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h implements f2.b, m, x7.a, e5.b, x7.f, com.bumptech.glide.load.data.d {
    public static h e;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f114b;
    public Object c;
    public Object d;

    public h(int i10) {
        this.f114b = i10;
        switch (i10) {
            case 3:
                this.c = new Rect();
                this.d = new Rect();
                return;
            case 5:
                LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(1);
                this.c = linkedBlockingQueue;
                this.d = new FutureTask(new d7.b(0, linkedBlockingQueue));
                return;
            case 9:
                this.c = new ArrayList();
                return;
            case 25:
                this.c = new k.d(null);
                this.d = new HashMap();
                return;
            default:
                this.c = new Object();
                this.d = new Handler(Looper.getMainLooper(), new b4.k(0, this));
                return;
        }
    }

    public static h j() {
        if (e == null) {
            e = new h(1);
        }
        return e;
    }

    public static o n(o oVar, float f8, float f10) {
        float f11;
        float f12;
        float f13 = oVar.f6875a;
        float f14 = oVar.f6876b;
        if (f13 < f8) {
            f11 = f13 - 1.0f;
        } else {
            f11 = f13 + 1.0f;
        }
        if (f14 < f10) {
            f12 = f14 - 1.0f;
        } else {
            f12 = f14 + 1.0f;
        }
        return new o(f11, f12);
    }

    public static String r(j7.b bVar, String str) {
        return new JSONObject().put(e0.m.h(new byte[]{69, 122, -87, 48, -121}, new byte[]{48, 20, -35, 89, -21, -63, 37, 94}), bVar.c).put(e0.m.h(new byte[]{51, 115, 89, -22, -53, -99}, new byte[]{64, 7, 56, -98, -66, -18, 55, -111}), str).toString();
    }

    public static o v(o oVar, o oVar2, int i10) {
        float f8 = oVar2.f6875a;
        float f10 = oVar.f6875a;
        float f11 = i10 + 1;
        float f12 = oVar2.f6876b;
        float f13 = oVar.f6876b;
        return new o(f10 + ((f8 - f10) / f11), f13 + ((f12 - f13) / f11));
    }

    @Override // x7.a, x7.f
    public void a() {
        switch (this.f114b) {
            case 12:
                ((x7.a) this.c).a();
                return;
            case 16:
                ((x7.f) this.c).a();
                return;
            default:
                ((x7.f) this.c).a();
                return;
        }
    }

    @Override // x7.m, x7.a, x7.f
    public void b(z7.a aVar) {
        switch (this.f114b) {
            case 10:
                c8.a.c((i8.h) this.c, aVar);
                return;
            case 12:
                ((c8.d) this.d).d(aVar);
                return;
            case 16:
                c8.a.d((q) this.d, aVar);
                return;
            case 17:
                c8.a.d((i8.h) this.d, aVar);
                return;
            case 28:
                ((m) this.c).b(aVar);
                return;
            default:
                ((m) this.c).b(aVar);
                return;
        }
    }

    @Override // x7.m, x7.f
    public void c(Object obj) {
        switch (this.f114b) {
            case 10:
                ((m) this.d).c(obj);
                return;
            case 16:
                ((x7.f) this.c).c(obj);
                return;
            case 17:
                ((x7.f) this.c).c(obj);
                return;
            case 28:
                ((m) this.c).c(obj);
                return;
            default:
                m mVar = (m) this.c;
                try {
                    ((b8.b) ((k8.a) this.d).c).accept(obj);
                    mVar.c(obj);
                    return;
                } catch (Throwable th) {
                    com.bumptech.glide.d.v(th);
                    mVar.onError(th);
                    return;
                }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void d(Exception exc) {
        g0 g0Var = (g0) this.d;
        n.q qVar = (n.q) this.c;
        n.q qVar2 = g0Var.f2999g;
        if (qVar2 != null && qVar2 == qVar) {
            g0 g0Var2 = (g0) this.d;
            n.q qVar3 = (n.q) this.c;
            j.k kVar = g0Var2.c;
            j.e eVar = g0Var2.f3000h;
            com.bumptech.glide.load.data.e eVar2 = qVar3.c;
            kVar.b(eVar, exc, eVar2, eVar2.c());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.datatransport.cct.CctBackendFactory e(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.h.e(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    @Override // com.bumptech.glide.load.data.d
    public void f(Object obj) {
        g0 g0Var = (g0) this.d;
        n.q qVar = (n.q) this.c;
        n.q qVar2 = g0Var.f2999g;
        if (qVar2 != null && qVar2 == qVar) {
            g0 g0Var2 = (g0) this.d;
            n.q qVar3 = (n.q) this.c;
            j.m mVar = g0Var2.f2997b.f3013p;
            if (obj != null && mVar.a(qVar3.c.c())) {
                g0Var2.f2998f = obj;
                g0Var2.c.l(2);
            } else {
                j.k kVar = g0Var2.c;
                h.e eVar = qVar3.f4031a;
                com.bumptech.glide.load.data.e eVar2 = qVar3.c;
                kVar.a(eVar, obj, eVar2, eVar2.c(), g0Var2.f3000h);
            }
        }
    }

    public e9.b g(KClass kClass) {
        Object obj;
        Object putIfAbsent;
        switch (this.f114b) {
            case 18:
                obj = ((t) this.d).get(JvmClassMappingKt.getJavaClass(kClass));
                obj.getClass();
                v0 v0Var = (v0) obj;
                Object obj2 = v0Var.f2954a.get();
                if (obj2 == null) {
                    obj2 = v0Var.a(new r(0, this, kClass));
                }
                return ((i9.k) obj2).f2914a;
            default:
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.d;
                Class javaClass = JvmClassMappingKt.getJavaClass(kClass);
                Object obj3 = concurrentHashMap.get(javaClass);
                if (obj3 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(javaClass, (obj3 = new i9.k((e9.b) ((Function1) this.c).invoke(kClass))))) != null) {
                    obj3 = putIfAbsent;
                }
                return ((i9.k) obj3).f2914a;
        }
    }

    @Override // t8.a
    public Object get() {
        switch (this.f114b) {
            case 7:
                return new e2.d((Context) ((e5.c) this.c).c, (a5.h) ((r5.c) this.d).get());
            default:
                n7.d dVar = (n7.d) ((g5.a) this.c).get();
                Iterator it = Arrays.asList(new u7.g((n7.v0) ((r5.c) this.d).get())).iterator();
                while (it.hasNext()) {
                    dVar = new n7.f(dVar, (u7.g) it.next());
                }
                return new y5.j(dVar, n7.c.f4163h.c(u7.e.c, u7.b.f5901b));
        }
    }

    public Object h(k.i iVar) {
        int i10;
        HashMap hashMap = (HashMap) this.d;
        k.d dVar = (k.d) hashMap.get(iVar);
        if (dVar == null) {
            dVar = new k.d(iVar);
            hashMap.put(iVar, dVar);
        } else {
            iVar.a();
        }
        k.d dVar2 = dVar.d;
        dVar2.c = dVar.c;
        dVar.c.d = dVar2;
        k.d dVar3 = (k.d) this.c;
        dVar.d = dVar3;
        k.d dVar4 = dVar3.c;
        dVar.c = dVar4;
        dVar4.d = dVar;
        dVar.d.c = dVar;
        ArrayList arrayList = dVar.f3356b;
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        if (i10 > 0) {
            return dVar.f3356b.remove(i10 - 1);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    public Object i(KClass kClass, ArrayList arrayList) {
        Object obj;
        Object m95constructorimpl;
        Object m95constructorimpl2;
        Object putIfAbsent;
        int i10 = 0;
        switch (this.f114b) {
            case 19:
                obj = ((t) this.d).get(JvmClassMappingKt.getJavaClass(kClass));
                obj.getClass();
                v0 v0Var = (v0) obj;
                Object obj2 = v0Var.f2954a.get();
                if (obj2 == null) {
                    obj2 = v0Var.a(new Lambda(0));
                }
                c1 c1Var = (c1) obj2;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj3 = arrayList.get(i10);
                    i10++;
                    arrayList2.add(new m0((KType) obj3));
                }
                ConcurrentHashMap concurrentHashMap = c1Var.f2877a;
                Object obj4 = concurrentHashMap.get(arrayList2);
                if (obj4 == null) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        m95constructorimpl = Result.m95constructorimpl((e9.b) ((Function2) this.c).invoke(kClass, arrayList));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        m95constructorimpl = Result.m95constructorimpl(ResultKt.createFailure(th));
                    }
                    Result m94boximpl = Result.m94boximpl(m95constructorimpl);
                    Object putIfAbsent2 = concurrentHashMap.putIfAbsent(arrayList2, m94boximpl);
                    if (putIfAbsent2 == null) {
                        obj4 = m94boximpl;
                    } else {
                        obj4 = putIfAbsent2;
                    }
                }
                obj4.getClass();
                return ((Result) obj4).getValue();
            default:
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) this.d;
                Class javaClass = JvmClassMappingKt.getJavaClass(kClass);
                Object obj5 = concurrentHashMap2.get(javaClass);
                if (obj5 == null && (putIfAbsent = concurrentHashMap2.putIfAbsent(javaClass, (obj5 = new c1()))) != null) {
                    obj5 = putIfAbsent;
                }
                c1 c1Var2 = (c1) obj5;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                int size2 = arrayList.size();
                while (i10 < size2) {
                    Object obj6 = arrayList.get(i10);
                    i10++;
                    arrayList3.add(new m0((KType) obj6));
                }
                ConcurrentHashMap concurrentHashMap3 = c1Var2.f2877a;
                Object obj7 = concurrentHashMap3.get(arrayList3);
                if (obj7 == null) {
                    try {
                        Result.Companion companion3 = Result.INSTANCE;
                        m95constructorimpl2 = Result.m95constructorimpl((e9.b) ((Function2) this.c).invoke(kClass, arrayList));
                    } catch (Throwable th2) {
                        Result.Companion companion4 = Result.INSTANCE;
                        m95constructorimpl2 = Result.m95constructorimpl(ResultKt.createFailure(th2));
                    }
                    Result m94boximpl2 = Result.m94boximpl(m95constructorimpl2);
                    Object putIfAbsent3 = concurrentHashMap3.putIfAbsent(arrayList3, m94boximpl2);
                    if (putIfAbsent3 == null) {
                        obj7 = m94boximpl2;
                    } else {
                        obj7 = putIfAbsent3;
                    }
                }
                obj7.getClass();
                return ((Result) obj7).getValue();
        }
    }

    public synchronized String k(long j10, String str) {
        j7.b a10;
        String h2;
        try {
            a10 = j7.b.a(str);
            long j11 = a10.c;
            if (j11 > j10 && j11 <= 150000 + j10) {
                p pVar = (p) this.c;
                String string = ((SharedPreferences) pVar.c).getString(a10.f3321a, null);
                if (string != null) {
                    h2 = new JSONObject(string).getString(e0.m.h(new byte[]{60, 38, 106, -82, 11, 39}, new byte[]{79, 82, 11, -38, 126, 84, -30, 75}));
                } else if (!((p) this.c).g(j10, a10.f3321a, r(a10, e0.m.h(new byte[]{-53, -78, -60, 103, -118, 72, -70}, new byte[]{-66, -36, -81, 9, -27, 63, -44, -109})))) {
                    h2 = e0.m.h(new byte[]{47, 13, -8, -126, -11, 57, 76, 89, 57, 11, -27, -97, -26}, new byte[]{92, 121, -105, -16, -108, 94, 41, 6});
                } else {
                    try {
                        h2 = ((y0.a) this.d).b(a10);
                    } catch (Exception unused) {
                        h2 = e0.m.h(new byte[]{63, -117, 98, -110, 2, -17, -57}, new byte[]{74, -27, 9, -4, 109, -104, -87, -1});
                    }
                    p pVar2 = (p) this.c;
                    ((SharedPreferences) pVar2.c).edit().putString(a10.f3321a, r(a10, h2)).commit();
                }
            }
            h2 = e0.m.h(new byte[]{-99, 39, -54, -85, -18, 4, -115}, new byte[]{-8, 95, -70, -62, -100, 97, -23, 105});
        } catch (Throwable th) {
            throw th;
        }
        return j7.b.b(a10.f3321a, h2);
    }

    public boolean l(b4.d dVar) {
        return false;
    }

    public boolean m(o oVar) {
        float f8 = oVar.f6875a;
        if (f8 >= 0.0f) {
            f6.b bVar = (f6.b) this.c;
            if (f8 < bVar.f2343b) {
                float f10 = oVar.f6876b;
                if (f10 > 0.0f && f10 < bVar.c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0059, code lost:
    
        if (r6.equals("publickey") == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o(java.util.ArrayList r11) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.h.o(java.util.ArrayList):void");
    }

    @Override // x7.m, x7.a, x7.f
    public void onError(Throwable th) {
        switch (this.f114b) {
            case 10:
                ((m) this.d).onError(th);
                return;
            case 12:
                x7.a aVar = (x7.a) this.c;
                try {
                    ((c8.d) this.d).d(c8.b.f578b);
                    aVar.a();
                    return;
                } catch (NullPointerException e6) {
                    throw e6;
                } catch (Throwable th2) {
                    com.bumptech.glide.d.v(th2);
                    a.a.s(th2);
                    NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
                    nullPointerException.initCause(th2);
                    throw nullPointerException;
                }
            case 16:
                ((x7.f) this.c).onError(th);
                return;
            case 17:
                ((x7.f) this.c).onError(th);
                return;
            case 28:
                try {
                    ((e0.g) ((k8.a) this.d).c).accept(th);
                } catch (Throwable th3) {
                    com.bumptech.glide.d.v(th3);
                    th = new a8.c(th, th3);
                }
                ((m) this.c).onError(th);
                return;
            default:
                ((m) this.c).onError(th);
                return;
        }
    }

    public void p(b4.d dVar) {
        synchronized (this.c) {
            try {
                if (l(dVar)) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void q(k.i iVar, Object obj) {
        HashMap hashMap = (HashMap) this.d;
        k.d dVar = (k.d) hashMap.get(iVar);
        if (dVar == null) {
            dVar = new k.d(iVar);
            dVar.d = dVar;
            k.d dVar2 = (k.d) this.c;
            dVar.d = dVar2.d;
            dVar.c = dVar2;
            dVar2.d = dVar;
            dVar.d.c = dVar;
            hashMap.put(iVar, dVar);
        } else {
            iVar.a();
        }
        if (dVar.f3356b == null) {
            dVar.f3356b = new ArrayList();
        }
        dVar.f3356b.add(obj);
    }

    public Object s() {
        int i10;
        k.d dVar = (k.d) this.c;
        k.d dVar2 = dVar.d;
        while (true) {
            boolean equals = dVar2.equals(dVar);
            Object obj = dVar2.f3355a;
            Object obj2 = null;
            if (equals) {
                return null;
            }
            ArrayList arrayList = dVar2.f3356b;
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                obj2 = dVar2.f3356b.remove(i10 - 1);
            }
            if (obj2 != null) {
                return obj2;
            }
            k.d dVar3 = dVar2.d;
            dVar3.c = dVar2.c;
            dVar2.c.d = dVar3;
            ((HashMap) this.d).remove(obj);
            ((k.i) obj).a();
            dVar2 = dVar2.d;
        }
    }

    public void t(b4.d dVar) {
        synchronized (this.c) {
            try {
                if (l(dVar)) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        int i10;
        switch (this.f114b) {
            case 25:
                StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
                k.d dVar = (k.d) this.c;
                k.d dVar2 = dVar.c;
                boolean z9 = false;
                while (!dVar2.equals(dVar)) {
                    sb.append('{');
                    sb.append(dVar2.f3355a);
                    sb.append(':');
                    ArrayList arrayList = dVar2.f3356b;
                    if (arrayList != null) {
                        i10 = arrayList.size();
                    } else {
                        i10 = 0;
                    }
                    sb.append(i10);
                    sb.append("}, ");
                    dVar2 = dVar2.c;
                    z9 = true;
                }
                if (z9) {
                    sb.delete(sb.length() - 2, sb.length());
                }
                sb.append(" )");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u(l lVar) {
        Handler handler = (Handler) this.d;
        lVar.getClass();
        handler.removeCallbacksAndMessages(lVar);
        handler.sendMessageDelayed(Message.obtain(handler, 0, lVar), 2750);
    }

    public int w(o oVar, o oVar2) {
        boolean z9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        f6.b bVar = (f6.b) this.c;
        int i15 = (int) oVar.f6875a;
        int i16 = (int) oVar.f6876b;
        int i17 = (int) oVar2.f6875a;
        int i18 = (int) oVar2.f6876b;
        int i19 = 0;
        int i20 = 1;
        if (Math.abs(i18 - i16) > Math.abs(i17 - i15)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            i15 = i16;
            i16 = i15;
            i17 = i18;
            i18 = i17;
        }
        int abs = Math.abs(i17 - i15);
        int abs2 = Math.abs(i18 - i16);
        int i21 = (-abs) / 2;
        if (i16 < i18) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        if (i15 >= i17) {
            i20 = -1;
        }
        if (z9) {
            i11 = i16;
        } else {
            i11 = i15;
        }
        if (z9) {
            i12 = i15;
        } else {
            i12 = i16;
        }
        boolean b10 = bVar.b(i11, i12);
        while (i15 != i17) {
            if (z9) {
                i13 = i16;
            } else {
                i13 = i15;
            }
            if (z9) {
                i14 = i15;
            } else {
                i14 = i16;
            }
            boolean b11 = bVar.b(i13, i14);
            if (b11 != b10) {
                i19++;
                b10 = b11;
            }
            i21 += abs2;
            if (i21 > 0) {
                if (i16 != i18) {
                    i16 += i10;
                    i21 -= abs;
                } else {
                    return i19;
                }
            }
            i15 += i20;
        }
        return i19;
    }

    public /* synthetic */ h(int i10, boolean z9) {
        this.f114b = i10;
    }

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, int i10) {
        this.f114b = i10;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ h(Object obj, Object obj2, boolean z9, int i10) {
        this.f114b = i10;
        this.c = obj;
        this.d = obj2;
    }

    public h(g7.b bVar) {
        this.f114b = 11;
        this.c = bVar;
        byte[] bArr = new byte[32];
        byte[] bArr2 = bVar.f2487a;
        byte[] copyOf = Arrays.copyOf(bArr2, bArr2.length);
        g7.a aVar = new g7.a();
        int[] iArr = aVar.f2485o;
        int[] iArr2 = aVar.f2486p;
        int[] iArr3 = aVar.f2483m;
        int[] iArr4 = aVar.f2482l;
        try {
            Arrays.fill(iArr4, 0);
            iArr4[0] = 9;
            Arrays.fill(iArr3, 0);
            iArr3[0] = 1;
            Arrays.fill(iArr, 0);
            System.arraycopy(iArr4, 0, aVar.f2484n, 0, iArr4.length);
            Arrays.fill(iArr2, 0);
            iArr2[0] = 1;
            aVar.d(copyOf);
            aVar.f(iArr2, iArr);
            aVar.e(iArr3, iArr3, iArr2);
            for (int i10 = 0; i10 < 32; i10++) {
                int i11 = i10 * 8;
                int i12 = i11 % 26;
                int i13 = i11 / 26;
                if (i12 <= 18) {
                    bArr[i10] = (byte) (iArr3[i13] >> i12);
                } else {
                    bArr[i10] = (byte) ((iArr3[i13 + 1] << (26 - i12)) | (iArr3[i13] >> i12));
                }
            }
            aVar.c();
            this.d = new g7.b(bArr);
        } catch (Throwable th) {
            aVar.c();
            throw th;
        }
    }

    public h(f6.b bVar) {
        this.f114b = 27;
        this.c = bVar;
        this.d = new g6.a(bVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, f5.b0] */
    public h(n nVar, b5.b bVar) {
        this.f114b = 14;
        ?? obj = new Object();
        obj.f2274a = nVar;
        nVar.a(new androidx.fragment.app.h(11, obj));
        this.c = obj;
        this.d = bVar;
    }

    public h(int i10, Function1 function1) {
        this.f114b = i10;
        function1.getClass();
        switch (i10) {
            case 20:
                this.c = function1;
                this.d = new ConcurrentHashMap();
                return;
            default:
                this.c = function1;
                this.d = new t();
                return;
        }
    }

    public /* synthetic */ h(int i10, Object obj, Object obj2) {
        this.f114b = i10;
        this.d = obj;
        this.c = obj2;
    }

    public h(Context context) {
        this.f114b = 6;
        this.d = null;
        this.c = context;
    }

    public h(int i10, Function2 function2) {
        this.f114b = i10;
        function2.getClass();
        switch (i10) {
            case 21:
                this.c = function2;
                this.d = new ConcurrentHashMap();
                return;
            default:
                this.c = function2;
                this.d = new t();
                return;
        }
    }
}
