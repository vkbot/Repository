package c5;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.core.content.ContextCompat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import t4.p;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements k5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f528a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f529b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(o4.f fVar, Context context) {
        this.f528a = 1;
        this.c = fVar;
        this.f529b = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, p5.a] */
    /* JADX WARN: Type inference failed for: r3v3, types: [d2.h, java.lang.Object] */
    @Override // k5.b
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        boolean z9;
        switch (this.f528a) {
            case 0:
                return new i((Context) this.f529b, (String) this.c);
            case 1:
                o4.f fVar = (o4.f) this.c;
                Context context = (Context) this.f529b;
                String c = fVar.c();
                ?? obj = new Object();
                Context createDeviceProtectedStorageContext = ContextCompat.createDeviceProtectedStorageContext(context);
                SharedPreferences sharedPreferences = createDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:".concat(c), 0);
                boolean z10 = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z10 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = createDeviceProtectedStorageContext.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(createDeviceProtectedStorageContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z10 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                obj.f5004a = z10;
                return obj;
            default:
                t4.e eVar = (t4.e) this.f529b;
                t4.a aVar = (t4.a) this.c;
                t4.c cVar = aVar.f5797f;
                ?? obj2 = new Object();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                Set<t4.h> set = aVar.c;
                Set set2 = aVar.f5798g;
                for (t4.h hVar : set) {
                    int i10 = hVar.c;
                    int i11 = hVar.f5810b;
                    if (i10 == 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    p pVar = hVar.f5809a;
                    if (z9) {
                        if (i11 == 2) {
                            hashSet4.add(pVar);
                        } else {
                            hashSet.add(pVar);
                        }
                    } else if (i10 == 2) {
                        hashSet3.add(pVar);
                    } else if (i11 == 2) {
                        hashSet5.add(pVar);
                    } else {
                        hashSet2.add(pVar);
                    }
                }
                if (!set2.isEmpty()) {
                    hashSet.add(p.a(b5.a.class));
                }
                obj2.f1739a = Collections.unmodifiableSet(hashSet);
                obj2.f1740b = Collections.unmodifiableSet(hashSet2);
                obj2.c = Collections.unmodifiableSet(hashSet3);
                obj2.d = Collections.unmodifiableSet(hashSet4);
                obj2.e = Collections.unmodifiableSet(hashSet5);
                obj2.f1741f = eVar;
                return cVar.a(obj2);
        }
    }

    public /* synthetic */ b(int i10, Object obj, Object obj2) {
        this.f528a = i10;
        this.f529b = obj;
        this.c = obj2;
    }
}
