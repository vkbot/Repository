package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Looper;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.manager.t;
import j.r;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b implements ComponentCallbacks2 {

    /* renamed from: i, reason: collision with root package name */
    public static volatile b f609i;

    /* renamed from: j, reason: collision with root package name */
    public static volatile boolean f610j;

    /* renamed from: b, reason: collision with root package name */
    public final k.b f611b;
    public final l.f c;
    public final e d;
    public final k.g e;

    /* renamed from: f, reason: collision with root package name */
    public final com.bumptech.glide.manager.m f612f;

    /* renamed from: g, reason: collision with root package name */
    public final c5.e f613g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f614h = new ArrayList();

    public b(Context context, r rVar, l.f fVar, k.b bVar, k.g gVar, com.bumptech.glide.manager.m mVar, c5.e eVar, p2.e eVar2, ArrayMap arrayMap, List list, ArrayList arrayList, o4.b bVar2, r5.c cVar) {
        this.f611b = bVar;
        this.e = gVar;
        this.c = fVar;
        this.f612f = mVar;
        this.f613g = eVar;
        this.d = new e(context, gVar, new t(this, arrayList, bVar2), new w7.c(19), eVar2, arrayMap, list, rVar, cVar);
    }

    public static b a(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (f609i == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
            } catch (InstantiationException e6) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e6);
            } catch (NoSuchMethodException e10) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e11);
            }
            synchronized (b.class) {
                if (f609i == null) {
                    if (!f610j) {
                        f610j = true;
                        try {
                            b(context, generatedAppGlideModule);
                            f610j = false;
                        } catch (Throwable th) {
                            f610j = false;
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                }
            }
        }
        return f609i;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0318  */
    /* JADX WARN: Type inference failed for: r0v9, types: [m.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v4, types: [l.f, c0.l] */
    /* JADX WARN: Type inference failed for: r3v4, types: [m.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [m.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [l.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [m.b, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(android.content.Context r27, com.bumptech.glide.GeneratedAppGlideModule r28) {
        /*
            Method dump skipped, instructions count: 797
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.b.b(android.content.Context, com.bumptech.glide.GeneratedAppGlideModule):void");
    }

    public static p c(Fragment fragment) {
        boolean z9;
        Context context = fragment.getContext();
        c0.g.c(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        com.bumptech.glide.manager.m mVar = a(context).f612f;
        mVar.getClass();
        c0.g.c(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        char[] cArr = c0.p.f446a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            return mVar.b(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            mVar.c.b(fragment.getActivity());
        }
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Context context2 = fragment.getContext();
        return mVar.d.a(context2, a(context2.getApplicationContext()), fragment.getLifecycle(), childFragmentManager, fragment.isVisible());
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        c0.p.a();
        this.c.e(0L);
        this.f611b.n();
        k.g gVar = this.e;
        synchronized (gVar) {
            gVar.b(0);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        long j10;
        c0.p.a();
        synchronized (this.f614h) {
            try {
                ArrayList arrayList = this.f614h;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((p) obj).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        l.f fVar = this.c;
        fVar.getClass();
        if (i10 >= 40) {
            fVar.e(0L);
        } else if (i10 >= 20 || i10 == 15) {
            synchronized (fVar) {
                j10 = fVar.f441b;
            }
            fVar.e(j10 / 2);
        }
        this.f611b.l(i10);
        k.g gVar = this.e;
        synchronized (gVar) {
            if (i10 >= 40) {
                synchronized (gVar) {
                    gVar.b(0);
                }
            } else if (i10 >= 20 || i10 == 15) {
                gVar.b(gVar.e / 2);
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
