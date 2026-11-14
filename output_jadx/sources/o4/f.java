package o4;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.core.os.UserManagerCompat;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import j1.i;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import t4.l;
import u4.j;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f4357j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static final ArrayMap f4358k = new ArrayMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f4359a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4360b;
    public final h c;
    public final t4.e d;

    /* renamed from: g, reason: collision with root package name */
    public final l f4362g;

    /* renamed from: h, reason: collision with root package name */
    public final k5.b f4363h;
    public final AtomicBoolean e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f4361f = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f4364i = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
    public f(Context context, String str, h hVar) {
        ?? arrayList;
        new CopyOnWriteArrayList();
        this.f4359a = context;
        Bundle bundle = null;
        if (!TextUtils.isEmpty(str)) {
            this.f4360b = str;
            this.c = hVar;
            a aVar = FirebaseInitProvider.f1528b;
            Trace.beginSection("Firebase");
            Trace.beginSection("ComponentDiscovery");
            ArrayList arrayList2 = new ArrayList();
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                } else {
                    ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                    if (serviceInfo == null) {
                        Log.w("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                    } else {
                        bundle = serviceInfo.metaData;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
            }
            if (bundle == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                arrayList = Collections.EMPTY_LIST;
            } else {
                arrayList = new ArrayList();
                for (String str2 : bundle.keySet()) {
                    if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                        arrayList.add(str2.substring(31));
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new l5.b(1, (String) it.next()));
            }
            Trace.endSection();
            Trace.beginSection("Runtime");
            j jVar = j.f5883b;
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            arrayList3.addAll(arrayList2);
            int i10 = 2;
            arrayList3.add(new l5.b(i10, new FirebaseCommonRegistrar()));
            arrayList3.add(new l5.b(i10, new ExecutorsRegistrar()));
            arrayList4.add(t4.a.c(context, Context.class, new Class[0]));
            arrayList4.add(t4.a.c(this, f.class, new Class[0]));
            arrayList4.add(t4.a.c(hVar, h.class, new Class[0]));
            w7.c cVar = new w7.c(17);
            if (UserManagerCompat.isUserUnlocked(context) && FirebaseInitProvider.c.get()) {
                arrayList4.add(t4.a.c(aVar, a.class, new Class[0]));
            }
            t4.e eVar = new t4.e(arrayList3, arrayList4, cVar);
            this.d = eVar;
            Trace.endSection();
            this.f4362g = new l(new c5.b(this, context));
            this.f4363h = eVar.c(c5.d.class);
            c cVar2 = new c(this);
            a();
            if (this.e.get()) {
                q2.a.f5280f.f5281b.get();
            }
            this.f4364i.add(cVar2);
            Trace.endSection();
            return;
        }
        i.k("Given String is empty or null");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f b() {
        f fVar;
        synchronized (f4357j) {
            try {
                fVar = (f) f4358k.get("[DEFAULT]");
                if (fVar != null) {
                    ((c5.d) fVar.f4363h.get()).b();
                } else {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + s2.a.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    public static f e(Context context) {
        synchronized (f4357j) {
            try {
                if (f4358k.containsKey("[DEFAULT]")) {
                    return b();
                }
                h a10 = h.a(context);
                if (a10 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return f(context, a10);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static f f(Context context, h hVar) {
        f fVar;
        AtomicReference atomicReference = d.f4354a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = d.f4354a;
            if (atomicReference2.get() == null) {
                Object obj = new Object();
                while (true) {
                    if (atomicReference2.compareAndSet(null, obj)) {
                        q2.a aVar = q2.a.f5280f;
                        synchronized (aVar) {
                            try {
                                if (!aVar.e) {
                                    application.registerActivityLifecycleCallbacks(aVar);
                                    application.registerComponentCallbacks(aVar);
                                    aVar.e = true;
                                }
                            } finally {
                            }
                        }
                        synchronized (aVar) {
                            aVar.d.add(obj);
                        }
                    } else if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f4357j) {
            ArrayMap arrayMap = f4358k;
            String str = "FirebaseApp name [DEFAULT] already exists!";
            if (!arrayMap.containsKey("[DEFAULT]")) {
                r2.a.c(context, "Application context cannot be null.");
                fVar = new f(context, "[DEFAULT]", hVar);
                arrayMap.put("[DEFAULT]", fVar);
            } else {
                throw new IllegalStateException(str);
            }
        }
        fVar.d();
        return fVar;
    }

    public final void a() {
        if (!this.f4361f.get()) {
            return;
        }
        i.l("FirebaseApp was deleted");
    }

    public final String c() {
        String encodeToString;
        StringBuilder sb = new StringBuilder();
        a();
        byte[] bytes = this.f4360b.getBytes(Charset.defaultCharset());
        String str = null;
        if (bytes == null) {
            encodeToString = null;
        } else {
            encodeToString = Base64.encodeToString(bytes, 11);
        }
        sb.append(encodeToString);
        sb.append("+");
        a();
        byte[] bytes2 = this.c.f4368b.getBytes(Charset.defaultCharset());
        if (bytes2 != null) {
            str = Base64.encodeToString(bytes2, 11);
        }
        sb.append(str);
        return sb.toString();
    }

    public final void d() {
        HashMap hashMap;
        if (!UserManagerCompat.isUserUnlocked(this.f4359a)) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(this.f4360b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.f4359a;
            AtomicReference atomicReference = e.f4355b;
            if (atomicReference.get() == null) {
                e eVar = new e(context);
                while (!atomicReference.compareAndSet(null, eVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(this.f4360b);
        Log.i("FirebaseApp", sb2.toString());
        t4.e eVar2 = this.d;
        a();
        boolean equals = "[DEFAULT]".equals(this.f4360b);
        AtomicReference atomicReference2 = eVar2.f5803f;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (atomicReference2.compareAndSet(null, valueOf)) {
                synchronized (eVar2) {
                    hashMap = new HashMap(eVar2.f5801a);
                }
                eVar2.i(hashMap, equals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((c5.d) this.f4363h.get()).b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        fVar.a();
        return this.f4360b.equals(fVar.f4360b);
    }

    public final int hashCode() {
        return this.f4360b.hashCode();
    }

    public final String toString() {
        l.d dVar = new l.d((Object) this);
        dVar.f(this.f4360b, "name");
        dVar.f(this.c, "options");
        return dVar.toString();
    }
}
