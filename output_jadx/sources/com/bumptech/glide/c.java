package com.bumptech.glide;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import com.bumptech.glide.manager.s;
import i9.d1;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.ArraysKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import m0.b3;
import n.a0;
import n.c0;
import n.e0;
import org.json.JSONObject;
import q.b0;
import q.f0;
import q.q;
import ru.transfer.MessageData;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f615a = true;

    public static final g9.f a(String str, g9.e[] eVarArr, Function1 function1) {
        if (!StringsKt.isBlank(str)) {
            g9.a aVar = new g9.a(str);
            function1.invoke(aVar);
            return new g9.f(str, g9.j.d, aVar.c.size(), ArraysKt.toList(eVarArr), aVar);
        }
        j1.i.k("Blank serial names are prohibited");
        return null;
    }

    public static final g9.f b(String str, d dVar, g9.e[] eVarArr, Function1 function1) {
        function1.getClass();
        if (!StringsKt.isBlank(str)) {
            if (!Intrinsics.areEqual(dVar, g9.j.d)) {
                g9.a aVar = new g9.a(str);
                function1.invoke(aVar);
                return new g9.f(str, dVar, aVar.c.size(), ArraysKt.toList(eVarArr), aVar);
            }
            j1.i.k("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        j1.i.k("Blank serial names are prohibited");
        return null;
    }

    public static j f(b bVar, ArrayList arrayList) {
        Class cls;
        h.j gVar;
        h.j aVar;
        k.b bVar2;
        int i10;
        String str;
        Class cls2;
        k.b bVar3 = bVar.f611b;
        k.g gVar2 = bVar.e;
        e eVar = bVar.d;
        Context applicationContext = eVar.getApplicationContext();
        r5.c cVar = eVar.f623h;
        j jVar = new j();
        Object obj = new Object();
        i7.i iVar = jVar.f633g;
        synchronized (iVar) {
            iVar.f2803b.add(obj);
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 27) {
            cls = AssetFileDescriptor.class;
        } else {
            Object obj2 = new Object();
            i7.i iVar2 = jVar.f633g;
            synchronized (iVar2) {
                cls = AssetFileDescriptor.class;
                iVar2.f2803b.add(obj2);
            }
        }
        Resources resources = applicationContext.getResources();
        ArrayList e = jVar.e();
        u.a aVar2 = new u.a(applicationContext, e, bVar3, gVar2);
        f0 f0Var = new f0(bVar3, new p2.e(17));
        q qVar = new q(jVar.e(), resources.getDisplayMetrics(), bVar3, gVar2);
        if (i11 >= 28 && ((Map) cVar.c).containsKey(c.class)) {
            aVar = new q.h(1);
            gVar = new q.h(0);
        } else {
            gVar = new q.g(qVar, 0);
            aVar = new q.a(2, qVar, gVar2);
        }
        if (i11 >= 28) {
            i10 = i11;
            bVar2 = bVar3;
            jVar.d("Animation", InputStream.class, Drawable.class, new s.a(new l.d(12, e, gVar2), 1));
            jVar.d("Animation", ByteBuffer.class, Drawable.class, new s.a(new l.d(12, e, gVar2), 0));
        } else {
            bVar2 = bVar3;
            i10 = i11;
        }
        s.c cVar2 = new s.c(applicationContext);
        q.b bVar4 = new q.b(gVar2);
        j.i iVar3 = new j.i(5);
        v.c cVar3 = new v.c(1);
        ContentResolver contentResolver = applicationContext.getContentResolver();
        jVar.a(ByteBuffer.class, new c0(5));
        jVar.a(InputStream.class, new n.p(1, gVar2));
        jVar.d("Bitmap", ByteBuffer.class, Bitmap.class, gVar);
        jVar.d("Bitmap", InputStream.class, Bitmap.class, aVar);
        String str2 = Build.FINGERPRINT;
        if (!"robolectric".equals(str2)) {
            str = str2;
            q.g gVar3 = new q.g(qVar, 1);
            cls2 = ParcelFileDescriptor.class;
            jVar.d("Bitmap", cls2, Bitmap.class, gVar3);
        } else {
            str = str2;
            cls2 = ParcelFileDescriptor.class;
        }
        k.b bVar5 = bVar2;
        jVar.d("Bitmap", cls, Bitmap.class, new f0(bVar5, new w7.c(16)));
        jVar.d("Bitmap", cls2, Bitmap.class, f0Var);
        c0 c0Var = c0.c;
        jVar.c(Bitmap.class, Bitmap.class, c0Var);
        jVar.d("Bitmap", Bitmap.class, Bitmap.class, new b0(0));
        jVar.b(Bitmap.class, bVar4);
        jVar.d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new q.a(resources, gVar));
        jVar.d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new q.a(resources, aVar));
        jVar.d("BitmapDrawable", cls2, BitmapDrawable.class, new q.a(resources, f0Var));
        jVar.b(BitmapDrawable.class, new l.d(7, bVar5, bVar4));
        jVar.d("Animation", InputStream.class, u.b.class, new u.h(e, aVar2, gVar2));
        jVar.d("Animation", ByteBuffer.class, u.b.class, aVar2);
        jVar.b(u.b.class, new c5.e(18));
        jVar.c(g.d.class, g.d.class, c0Var);
        jVar.d("Bitmap", g.d.class, Bitmap.class, new q.d(bVar5));
        jVar.d("legacy_append", Uri.class, Drawable.class, cVar2);
        jVar.d("legacy_append", Uri.class, Bitmap.class, new q.a(1, cVar2, bVar5));
        jVar.h(new com.bumptech.glide.load.data.h(2));
        jVar.c(File.class, ByteBuffer.class, new c0(6));
        jVar.c(File.class, InputStream.class, new k.a(new c0(9)));
        jVar.d("legacy_append", File.class, File.class, new b0(2));
        jVar.c(File.class, cls2, new k.a(new c0(8)));
        jVar.c(File.class, File.class, c0Var);
        jVar.h(new com.bumptech.glide.load.data.m(gVar2));
        if (!"robolectric".equals(str)) {
            jVar.h(new com.bumptech.glide.load.data.h(1));
        }
        com.bumptech.glide.manager.o oVar = new com.bumptech.glide.manager.o(applicationContext, 5);
        com.bumptech.glide.manager.o oVar2 = new com.bumptech.glide.manager.o(applicationContext, 3);
        com.bumptech.glide.manager.o oVar3 = new com.bumptech.glide.manager.o(applicationContext, 4);
        Class cls3 = Integer.TYPE;
        jVar.c(cls3, InputStream.class, oVar);
        jVar.c(Integer.class, InputStream.class, oVar);
        Class cls4 = cls;
        jVar.c(cls3, cls4, oVar2);
        jVar.c(Integer.class, cls4, oVar2);
        jVar.c(cls3, Drawable.class, oVar3);
        jVar.c(Integer.class, Drawable.class, oVar3);
        jVar.c(Uri.class, InputStream.class, new com.bumptech.glide.manager.o(applicationContext, 8));
        jVar.c(Uri.class, cls4, new com.bumptech.glide.manager.o(applicationContext, 7));
        a0 a0Var = new a0(resources, 2);
        a0 a0Var2 = new a0(resources, 0);
        a0 a0Var3 = new a0(resources, 1);
        jVar.c(Integer.class, Uri.class, a0Var);
        jVar.c(cls3, Uri.class, a0Var);
        jVar.c(Integer.class, cls4, a0Var2);
        jVar.c(cls3, cls4, a0Var2);
        jVar.c(Integer.class, InputStream.class, a0Var3);
        jVar.c(cls3, InputStream.class, a0Var3);
        jVar.c(String.class, InputStream.class, new r5.c(29));
        jVar.c(Uri.class, InputStream.class, new r5.c(29));
        jVar.c(String.class, InputStream.class, new c0(12));
        jVar.c(String.class, cls2, new c0(11));
        jVar.c(String.class, cls4, new c0(10));
        jVar.c(Uri.class, InputStream.class, new n.a(applicationContext.getAssets(), 1));
        jVar.c(Uri.class, cls4, new n.a(applicationContext.getAssets(), 0));
        jVar.c(Uri.class, InputStream.class, new com.bumptech.glide.manager.o(applicationContext, 9));
        jVar.c(Uri.class, InputStream.class, new com.bumptech.glide.manager.o(applicationContext, 10));
        if (i10 >= 29) {
            jVar.c(Uri.class, InputStream.class, new o.b(applicationContext, InputStream.class));
            jVar.c(Uri.class, cls2, new o.b(applicationContext, cls2));
        }
        jVar.c(Uri.class, InputStream.class, new e0(contentResolver, 2));
        jVar.c(Uri.class, cls2, new e0(contentResolver, 1));
        jVar.c(Uri.class, cls4, new e0(contentResolver, 0));
        jVar.c(Uri.class, InputStream.class, new c0(13));
        jVar.c(URL.class, InputStream.class, new p2.e(15));
        jVar.c(Uri.class, File.class, new com.bumptech.glide.manager.o(applicationContext, 6));
        jVar.c(n.g.class, InputStream.class, new n.p(2));
        jVar.c(byte[].class, ByteBuffer.class, new c0(2));
        jVar.c(byte[].class, InputStream.class, new c0(4));
        jVar.c(Uri.class, Uri.class, c0Var);
        jVar.c(Drawable.class, Drawable.class, c0Var);
        jVar.d("legacy_append", Drawable.class, Drawable.class, new b0(1));
        jVar.i(Bitmap.class, BitmapDrawable.class, new a0(resources, 3));
        jVar.i(Bitmap.class, byte[].class, iVar3);
        jVar.i(Drawable.class, byte[].class, new a5.h(bVar5, iVar3, cVar3, 26));
        jVar.i(u.b.class, byte[].class, cVar3);
        f0 f0Var2 = new f0(bVar5, new z3.f(16));
        jVar.d("legacy_append", ByteBuffer.class, Bitmap.class, f0Var2);
        jVar.d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new q.a(resources, f0Var2));
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return jVar;
        }
        throw g.b(it);
    }

    public static MessageData g(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString(e0.m.h(new byte[]{116, 25, -22}, new byte[]{31, 124, -109, 21, -4, -25, 73, -66}));
        boolean optBoolean = jSONObject.optBoolean(e0.m.h(new byte[]{78, 117, -110, 59, 58, 87, 31, 74}, new byte[]{38, 20, -31, 105, 95, 39, 115, 51}), false);
        String optString = jSONObject.optString(e0.m.h(new byte[]{-90, Base64.padSymbol, 97, 15, 4, 88, 113, -65, -73, 49, 103}, new byte[]{-42, 92, 2, 100, 101, 63, 20, -15}), "");
        String optString2 = jSONObject.optString(e0.m.h(new byte[]{-32, -60, -77, 28, 9, 78}, new byte[]{-109, -95, -35, 120, 108, 60, -123, -26}), "");
        String optString3 = jSONObject.optString(e0.m.h(new byte[]{-51, 58, -34, -15, -89, -102, 87}, new byte[]{-96, 95, -83, -126, -58, -3, 50, -98}), "");
        String str2 = null;
        if (!jSONObject.isNull(e0.m.h(new byte[]{-10, 57, -21, -117}, new byte[]{-97, 90, -124, -27, 52, 108, 70, -83}))) {
            str2 = jSONObject.optString(e0.m.h(new byte[]{-100, -9, -20, -86}, new byte[]{-11, -108, -125, -60, 82, 24, 98, 73}), null);
        }
        return MessageData.fromEncodedIcon(string, optBoolean, optString, optString2, optString3, str2);
    }

    public static b3 h(String str) {
        JSONObject jSONObject = new JSONObject(str);
        return new b3(jSONObject.getString(e0.m.h(new byte[]{76, -56, -70}, new byte[]{39, -83, -61, 116, 97, -9, -69, -97})), jSONObject.optBoolean(e0.m.h(new byte[]{-119, -90, 15, 46, -47, 104, 25}, new byte[]{-6, -45, 108, 77, -76, 27, 106, ByteCompanionObject.MIN_VALUE}), false));
    }

    public static String i(MessageData messageData) {
        String message;
        JSONObject put = new JSONObject().put(e0.m.h(new byte[]{-34, -80, -63}, new byte[]{-75, -43, -72, -27, 21, 85, 6, -124}), messageData.getKey());
        String h2 = e0.m.h(new byte[]{-57, -13, 0, 67, -53, -66, -29}, new byte[]{-86, -106, 115, 48, -86, -39, -122, 125});
        if (messageData.getMessage() == null) {
            message = "";
        } else {
            message = messageData.getMessage();
        }
        return put.put(h2, message).toString();
    }

    public static final e9.a j(i9.b bVar, h9.c cVar, String str) {
        e9.a aVar;
        Function1 function1;
        j9.b serializersModule = cVar.getSerializersModule();
        KClass kClass = ((e9.e) bVar).f2212a;
        j9.a aVar2 = (j9.a) serializersModule;
        aVar2.getClass();
        kClass.getClass();
        Map map = (Map) aVar2.d.get(kClass);
        if (map != null) {
            aVar = (e9.b) map.get(str);
        } else {
            aVar = null;
        }
        if (aVar == null) {
            aVar = null;
        }
        if (aVar == null) {
            Object obj = aVar2.e.get(kClass);
            if (TypeIntrinsics.isFunctionOfArity(obj, 1)) {
                function1 = (Function1) obj;
            } else {
                function1 = null;
            }
            if (function1 != null) {
                aVar = (e9.a) function1.invoke(str);
            } else {
                aVar = null;
            }
        }
        if (aVar != null) {
            return aVar;
        }
        d1.i(str, kClass);
        throw null;
    }

    public static Drawable m(Context context, Context context2, int i10, Resources.Theme theme) {
        try {
            if (f615a) {
                return n(context2, i10, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return ContextCompat.getDrawable(context2, i10);
            }
            throw e;
        } catch (NoClassDefFoundError unused2) {
            f615a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return ResourcesCompat.getDrawable(context2.getResources(), i10, theme);
    }

    public static Drawable n(Context context, int i10, Resources.Theme theme) {
        if (theme != null) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, theme);
            contextThemeWrapper.applyOverrideConfiguration(theme.getResources().getConfiguration());
            context = contextThemeWrapper;
        }
        return AppCompatResources.getDrawable(context, i10);
    }

    public static t5.b o(w5.a aVar) {
        boolean z9;
        try {
            try {
                aVar.p0();
                z9 = false;
                try {
                    return (t5.b) v5.a.f5940a.B(aVar);
                } catch (EOFException e) {
                    e = e;
                    if (z9) {
                        return t5.d.f5822b;
                    }
                    throw new a8.a(5, e);
                }
            } catch (EOFException e6) {
                e = e6;
                z9 = true;
            }
        } catch (w5.c e10) {
            throw new a8.a(5, e10);
        } catch (IOException e11) {
            throw new a8.a(5, e11);
        } catch (NumberFormatException e12) {
            throw new a8.a(5, e12);
        }
    }

    public static int s(int i10) {
        return (int) (Integer.rotateLeft((int) (i10 * (-862048943)), 15) * 461845907);
    }

    public static s t(Object obj) {
        return new s(obj.getClass().getSimpleName());
    }

    public abstract boolean c(m4.m mVar, m4.d dVar, m4.d dVar2);

    public abstract boolean d(m4.m mVar, Object obj, Object obj2);

    public abstract boolean e(m4.m mVar, m4.l lVar, m4.l lVar2);

    public abstract m4.d k(m4.m mVar);

    public abstract m4.l l(m4.m mVar);

    public abstract void p(String str);

    public abstract void q(m4.l lVar, m4.l lVar2);

    public abstract void r(m4.l lVar, Thread thread);
}
