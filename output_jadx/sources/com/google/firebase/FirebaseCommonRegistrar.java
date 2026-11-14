package com.google.firebase;

import android.content.Context;
import android.os.Build;
import b1.u;
import c5.e;
import c5.f;
import c5.g;
import com.google.firebase.components.ComponentRegistrar;
import f6.d;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.KotlinVersion;
import org.apache.commons.io.IOUtils;
import r5.b;
import t4.a;
import t4.h;
import t4.p;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace(IOUtils.DIR_SEPARATOR_UNIX, '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        d a10 = a.a(b.class);
        a10.a(new h(2, 0, r5.a.class));
        a10.f2348f = new org.apache.commons.net.ftp.a(5);
        arrayList.add(a10.b());
        p pVar = new p(s4.a.class, Executor.class);
        d dVar = new d(c5.d.class, new Class[]{f.class, g.class});
        dVar.a(h.a(Context.class));
        dVar.a(h.a(o4.f.class));
        dVar.a(new h(2, 0, e.class));
        dVar.a(new h(1, 1, b.class));
        dVar.a(new h(pVar, 1, 0));
        dVar.f2348f = new androidx.fragment.app.h(4, pVar);
        arrayList.add(dVar.b());
        arrayList.add(u.d("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(u.d("fire-core", "21.0.0"));
        arrayList.add(u.d("device-name", a(Build.PRODUCT)));
        arrayList.add(u.d("device-model", a(Build.DEVICE)));
        arrayList.add(u.d("device-brand", a(Build.BRAND)));
        arrayList.add(u.f("android-target-sdk", new n0.b(8)));
        arrayList.add(u.f("android-min-sdk", new n0.b(9)));
        arrayList.add(u.f("android-platform", new n0.b(10)));
        arrayList.add(u.f("android-installer", new n0.b(11)));
        try {
            str = KotlinVersion.CURRENT.toString();
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(u.d("kotlin", str));
        }
        return arrayList;
    }
}
