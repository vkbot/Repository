package com.bumptech.glide.manager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.util.Log;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.tracing.Trace;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledFuture;
import kotlin.io.encoding.Base64;
import n7.f1;
import o7.e0;
import o7.g1;
import o7.i1;
import o7.k1;
import o7.m2;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class t implements c0.i, m2 {

    /* renamed from: f, reason: collision with root package name */
    public static volatile t f676f;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f677b;
    public boolean c;
    public final Object d;
    public Object e;

    public t(Context context, int i10) {
        this.f677b = i10;
        switch (i10) {
            case 3:
                this.d = context.getApplicationContext();
                this.e = h7.k.f2618o;
                return;
            default:
                this.e = new HashSet();
                this.d = new s(new c0.h(new o(context, 0)), new p(this));
                return;
        }
    }

    public static void a(ArrayList arrayList, HashSet hashSet, File file) {
        String absolutePath;
        if (file != null) {
            try {
                String absolutePath2 = file.getAbsolutePath();
                if (file.isDirectory() && !absolutePath2.contains(e0.m.h(new byte[]{-44, -91, 72, -122, -118, 98, -101, -9}, new byte[]{-79, -56, Base64.padSymbol, -22, -21, 22, -2, -109})) && !absolutePath2.contains(e0.m.h(new byte[]{-26, -114, -30, 111}, new byte[]{-107, -21, -114, 9, 18, 57, -29, -117})) && f(absolutePath2)) {
                    if (file.listFiles() != null) {
                        try {
                            absolutePath = file.getCanonicalPath();
                        } catch (IOException unused) {
                            absolutePath = file.getAbsolutePath();
                        }
                        if (hashSet.add(absolutePath)) {
                            arrayList.add(file);
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    public static t c(Context context) {
        if (f676f == null) {
            synchronized (t.class) {
                try {
                    if (f676f == null) {
                        f676f = new t(context.getApplicationContext(), 0);
                    }
                } finally {
                }
            }
        }
        return f676f;
    }

    public static boolean f(String str) {
        if (!str.startsWith(e0.m.h(new byte[]{-72, 95, 76, -116, 10, -108, 123, -26, -72}, new byte[]{-105, 44, 56, -29, 120, -11, 28, -125})) && !str.startsWith(e0.m.h(new byte[]{121, -61, 44, 40, 83, -103, -7, 110, 63, -49, 29, 46, 11, -37}, new byte[]{86, -82, 66, 92, 124, -12, -100, 10})) && !str.startsWith(e0.m.h(new byte[]{113, -21, 123, 29, -40, 71, -34, -49, 42, -17, 120, 12, -40}, new byte[]{94, -122, 21, 105, -9, 53, -85, -95})) && !str.startsWith(e0.m.h(new byte[]{125, -33, -5, 49, 79, 39, 82, -84}, new byte[]{82, -78, -107, 69, 96, 82, 33, -50})) && !str.startsWith(e0.m.h(new byte[]{-45, -98, -119, -19, 112, -16, -63, -37, -45, -104, -114, -32}, new byte[]{-4, -19, -3, -126, 2, -111, -90, -66})) && !str.startsWith(e0.m.h(new byte[]{92, -48, 69, -3, 87, -59, 19, -125, 0, -42}, new byte[]{115, -67, 43, -119, 120, -80, 119, -22})) && !str.startsWith(e0.m.h(new byte[]{76, -71, 12, -69, 56, 4, -29, -80, 76, -65, 28, -67, 57, 14}, new byte[]{99, -54, 120, -44, 74, 101, -124, -43})) && !str.startsWith(e0.m.h(new byte[]{53, 49, 82, 98, -26, -120, -67, -5, 53, 39, 94, 121}, new byte[]{26, 66, 38, 13, -108, -23, -38, -98})) && !str.startsWith(e0.m.h(new byte[]{95, 76, -89, -74, 106, 85, -45, -55}, new byte[]{112, 33, -55, -62, 69, 48, -85, -67})) && !str.startsWith(e0.m.h(new byte[]{47, -45, 67, -25, -25, -14, -81, -72, 47, -45, 83, -21, -12, -31, -84}, new byte[]{0, -96, 55, -120, -107, -109, -56, -35}))) {
            return false;
        }
        return true;
    }

    public static ArrayList h(File file) {
        File absoluteFile;
        File[] fileArr;
        try {
            absoluteFile = file.getCanonicalFile();
        } catch (IOException unused) {
            absoluteFile = file.getAbsoluteFile();
        }
        if (absoluteFile.exists() && absoluteFile.isDirectory()) {
            try {
                fileArr = absoluteFile.listFiles();
            } catch (Exception unused2) {
                fileArr = null;
            }
            if (fileArr != null) {
                ArrayList arrayList = new ArrayList();
                Collections.addAll(arrayList, fileArr);
                Collections.sort(arrayList, new androidx.constraintlayout.core.utils.a(4));
                return arrayList;
            }
        }
        return null;
    }

    public boolean b(y.c cVar) {
        boolean z9 = true;
        if (cVar == null) {
            return true;
        }
        boolean remove = ((Set) this.d).remove(cVar);
        if (!((HashSet) this.e).remove(cVar) && !remove) {
            z9 = false;
        }
        if (z9) {
            cVar.clear();
        }
        return z9;
    }

    public Uri d(File file) {
        Context context = (Context) this.d;
        return FileProvider.getUriForFile(context, context.getPackageName() + e0.m.h(new byte[]{-107, -90, 93, 39, 11, -126, 0, 30, -55}, new byte[]{-69, -42, 47, 72, 125, -21, 100, 123}), file);
    }

    public ArrayList e() {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        try {
            h7.k kVar = (h7.k) this.e;
            if (kVar != null) {
                ArrayList e = kVar.e();
                int size = e.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = e.get(i10);
                    i10++;
                    a(arrayList, hashSet, (File) obj);
                }
            }
        } catch (Exception unused) {
        }
        try {
            for (File file : ContextCompat.getExternalFilesDirs((Context) this.d, null)) {
                if (file != null) {
                    String absolutePath = file.getAbsolutePath();
                    int indexOf = absolutePath.indexOf(e0.m.h(new byte[]{103, 112, 105, -82, -52, 121, -112, -61}, new byte[]{72, 49, 7, -54, -66, 22, -7, -89}));
                    if (absolutePath.contains(e0.m.h(new byte[]{-90, -90, 88, -97, 21, 9, 111, -124, -90}, new byte[]{-119, -43, 44, -16, 103, 104, 8, -31})) && indexOf > 0) {
                        a(arrayList, hashSet, new File(absolutePath.substring(0, indexOf)));
                    }
                }
            }
        } catch (Exception unused2) {
        }
        try {
            File[] listFiles = new File(e0.m.h(new byte[]{77, -105, -121, 113, -124, 11, 66, 97, 77}, new byte[]{98, -28, -13, 30, -10, 106, 37, 4})).listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    a(arrayList, hashSet, file2);
                }
            }
        } catch (Exception unused3) {
        }
        return arrayList;
    }

    public void g() {
        boolean z9;
        if (!this.c && !((HashSet) this.e).isEmpty()) {
            s sVar = (s) this.d;
            c0.h hVar = (c0.h) sVar.d;
            boolean z10 = false;
            if (((ConnectivityManager) hVar.get()).getActiveNetwork() != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            sVar.f675b = z9;
            try {
                ((ConnectivityManager) hVar.get()).registerDefaultNetworkCallback((r) sVar.e);
                z10 = true;
            } catch (RuntimeException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e);
                }
            }
            this.c = z10;
        }
    }

    @Override // c0.i
    public Object get() {
        if (!this.c) {
            Trace.beginSection("Glide registry");
            this.c = true;
            try {
                return com.bumptech.glide.c.f((com.bumptech.glide.b) this.d, (ArrayList) this.e);
            } finally {
                this.c = false;
                Trace.endSection();
            }
        }
        j1.i.l("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        return null;
    }

    public void i(ScheduledFuture scheduledFuture) {
        synchronized (this.d) {
            try {
                if (!this.c) {
                    this.e = scheduledFuture;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j(boolean z9) {
        k1 k1Var = (k1) this.e;
        k1Var.f4584k.execute(new e3.g(k1Var, (g1) this.d, z9, 1));
    }

    public void k(f1 f1Var) {
        k1 k1Var = (k1) this.e;
        k1Var.f4582i.n(2, "{0} SHUTDOWN with {1}", ((g1) this.d).c(), k1.h(f1Var));
        this.c = true;
        k1Var.f4584k.execute(new e0(16, this, f1Var));
    }

    public void l() {
        o4.b.m(this.c, "transportShutdown() must be called before transportTerminated().");
        k1 k1Var = (k1) this.e;
        n7.e eVar = k1Var.f4582i;
        g1 g1Var = (g1) this.d;
        eVar.n(2, "{0} Terminated", g1Var.c());
        n7.k1 k1Var2 = k1Var.f4584k;
        k1Var2.execute(new e3.g(k1Var, g1Var, false, 1));
        Iterator it = k1Var.f4583j.iterator();
        if (!it.hasNext()) {
            k1Var2.execute(new i1(this, 1));
        } else if (it.next() != null) {
            n0.b.a();
        } else {
            g1Var.getAttributes();
            throw null;
        }
    }

    public void m(z2.f fVar) {
        synchronized (this.d) {
            try {
                if (((ArrayDeque) this.e) == null) {
                    this.e = new ArrayDeque();
                }
                ((ArrayDeque) this.e).add(fVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void n(o7.a aVar) {
        z2.f fVar;
        synchronized (this.d) {
            if (((ArrayDeque) this.e) != null && !this.c) {
                this.c = true;
                while (true) {
                    synchronized (this.d) {
                        try {
                            fVar = (z2.f) ((ArrayDeque) this.e).poll();
                            if (fVar == null) {
                                this.c = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    fVar.a(aVar);
                }
            }
        }
    }

    public String toString() {
        switch (this.f677b) {
            case 2:
                return super.toString() + "{numRequests=" + ((Set) this.d).size() + ", isPaused=" + this.c + "}";
            default:
                return super.toString();
        }
    }

    public t(int i10) {
        this.f677b = i10;
        switch (i10) {
            case 6:
                this.d = new Object();
                return;
            default:
                this.d = Collections.newSetFromMap(new WeakHashMap());
                this.e = new HashSet();
                return;
        }
    }

    public t(com.bumptech.glide.b bVar, ArrayList arrayList, o4.b bVar2) {
        this.f677b = 1;
        this.d = bVar;
        this.e = arrayList;
    }

    public t(k1 k1Var, g1 g1Var) {
        this.f677b = 4;
        this.e = k1Var;
        this.c = false;
        this.d = g1Var;
    }

    public t(Object obj) {
        this.f677b = 5;
        this.d = obj;
    }
}
