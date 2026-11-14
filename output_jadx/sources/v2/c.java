package v2;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import c9.i;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c {
    public static Boolean c = null;
    public static String d = null;
    public static boolean e = false;

    /* renamed from: f, reason: collision with root package name */
    public static int f5930f = -1;

    /* renamed from: g, reason: collision with root package name */
    public static Boolean f5931g;

    /* renamed from: k, reason: collision with root package name */
    public static g f5935k;

    /* renamed from: l, reason: collision with root package name */
    public static h f5936l;

    /* renamed from: a, reason: collision with root package name */
    public final Context f5937a;

    /* renamed from: h, reason: collision with root package name */
    public static final ThreadLocal f5932h = new ThreadLocal();

    /* renamed from: i, reason: collision with root package name */
    public static final e f5933i = new ThreadLocal();

    /* renamed from: j, reason: collision with root package name */
    public static final p2.e f5934j = new p2.e(18);

    /* renamed from: b, reason: collision with root package name */
    public static final w7.c f5929b = new w7.c(18);

    public c(Context context) {
        this.f5937a = context;
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [v2.f, java.lang.Object] */
    public static c a(Context context, w7.c cVar) {
        long j10;
        c cVar2;
        Boolean bool;
        u2.a d10;
        c cVar3;
        h hVar;
        u2.a d11;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            ThreadLocal threadLocal = f5932h;
            f fVar = (f) threadLocal.get();
            ?? obj = new Object();
            threadLocal.set(obj);
            e eVar = f5933i;
            Long l10 = (Long) eVar.get();
            long longValue = l10.longValue();
            try {
                eVar.set(Long.valueOf(SystemClock.elapsedRealtime()));
                l.h n10 = cVar.n(context, f5934j);
                j10 = longValue;
                try {
                    Log.i("DynamiteModule", "Considering local module com.google.android.gms.providerinstaller.dynamite:" + n10.f3485a + " and remote module com.google.android.gms.providerinstaller.dynamite:" + n10.f3486b);
                    int i10 = n10.c;
                    if (i10 != 0) {
                        if (i10 == -1) {
                            if (n10.f3485a != 0) {
                                i10 = -1;
                            }
                        }
                        boolean z9 = true;
                        if (i10 != 1 || n10.f3486b != 0) {
                            if (i10 == -1) {
                                Log.i("DynamiteModule", "Selected local version of ".concat("com.google.android.gms.providerinstaller.dynamite"));
                                cVar2 = new c(applicationContext);
                            } else if (i10 == 1) {
                                try {
                                    int i11 = n10.f3486b;
                                    try {
                                        synchronized (c.class) {
                                            if (d(context)) {
                                                bool = c;
                                            } else {
                                                throw new Exception("Remote loading disabled");
                                            }
                                        }
                                        if (bool != null) {
                                            if (bool.booleanValue()) {
                                                Log.i("DynamiteModule", "Selected remote version of com.google.android.gms.providerinstaller.dynamite, version >= " + i11);
                                                synchronized (c.class) {
                                                    hVar = f5936l;
                                                }
                                                if (hVar != null) {
                                                    f fVar2 = (f) threadLocal.get();
                                                    if (fVar2 != null && fVar2.f5938a != null) {
                                                        Context applicationContext2 = context.getApplicationContext();
                                                        Cursor cursor = fVar2.f5938a;
                                                        new u2.b(null);
                                                        synchronized (c.class) {
                                                            if (f5930f < 2) {
                                                                z9 = false;
                                                            }
                                                        }
                                                        if (z9) {
                                                            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                            d11 = hVar.e(new u2.b(applicationContext2), i11, new u2.b(cursor));
                                                        } else {
                                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                            d11 = hVar.d(new u2.b(applicationContext2), i11, new u2.b(cursor));
                                                        }
                                                        Context context2 = (Context) u2.b.d(d11);
                                                        if (context2 != null) {
                                                            cVar3 = new c(context2);
                                                        } else {
                                                            throw new Exception("Failed to get module context");
                                                        }
                                                    } else {
                                                        throw new Exception("No result cursor");
                                                    }
                                                } else {
                                                    throw new Exception("DynamiteLoaderV2 was not cached.");
                                                }
                                            } else {
                                                Log.i("DynamiteModule", "Selected remote version of com.google.android.gms.providerinstaller.dynamite, version >= " + i11);
                                                g e6 = e(context);
                                                if (e6 != null) {
                                                    Parcel b10 = e6.b(e6.c(), 6);
                                                    int readInt = b10.readInt();
                                                    b10.recycle();
                                                    if (readInt >= 3) {
                                                        f fVar3 = (f) threadLocal.get();
                                                        if (fVar3 != null) {
                                                            d10 = e6.e(new u2.b(context), i11, new u2.b(fVar3.f5938a));
                                                        } else {
                                                            throw new Exception("No cached result cursor holder");
                                                        }
                                                    } else if (readInt == 2) {
                                                        Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                        d10 = e6.f(new u2.b(context), i11);
                                                    } else {
                                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                        d10 = e6.d(new u2.b(context), i11);
                                                    }
                                                    Object d12 = u2.b.d(d10);
                                                    if (d12 != null) {
                                                        cVar3 = new c((Context) d12);
                                                    } else {
                                                        throw new Exception("Failed to load remote module.");
                                                    }
                                                } else {
                                                    throw new Exception("Failed to create IDynamiteLoader.");
                                                }
                                            }
                                            cVar2 = cVar3;
                                        } else {
                                            throw new Exception("Failed to determine which loading route to use.");
                                        }
                                    } catch (RemoteException e10) {
                                        throw new Exception("Failed to load remote module.", e10);
                                    } catch (a e11) {
                                        throw e11;
                                    } catch (Throwable th) {
                                        throw new Exception("Failed to load remote module.", th);
                                    }
                                } catch (a e12) {
                                    Log.w("DynamiteModule", "Failed to load remote module: " + e12.getMessage());
                                    int i12 = n10.f3485a;
                                    if (i12 != 0 && cVar.n(context, new i(i12)).c == -1) {
                                        Log.i("DynamiteModule", "Selected local version of ".concat("com.google.android.gms.providerinstaller.dynamite"));
                                        cVar2 = new c(applicationContext);
                                    } else {
                                        throw new Exception("Remote load failed. No local fallback found.", e12);
                                    }
                                }
                            } else {
                                throw new Exception("VersionPolicy returned invalid code:" + i10);
                            }
                            if (j10 == 0) {
                                f5933i.remove();
                            } else {
                                f5933i.set(l10);
                            }
                            Cursor cursor2 = obj.f5938a;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            f5932h.set(fVar);
                            return cVar2;
                        }
                    }
                    throw new Exception("No acceptable module com.google.android.gms.providerinstaller.dynamite found. Local version is " + n10.f3485a + " and remote version is " + n10.f3486b + ".");
                } catch (Throwable th2) {
                    th = th2;
                    if (j10 == 0) {
                        f5933i.remove();
                    } else {
                        f5933i.set(l10);
                    }
                    Cursor cursor3 = obj.f5938a;
                    if (cursor3 != null) {
                        cursor3.close();
                    }
                    f5932h.set(fVar);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                j10 = longValue;
            }
        } else {
            throw new Exception("null application Context");
        }
    }

    public static int b(Context context, boolean z9, boolean z10) {
        Throwable th;
        Exception exc;
        boolean z11;
        Cursor cursor = null;
        try {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                long longValue = ((Long) f5933i.get()).longValue();
                String str = "api_force_staging";
                boolean z12 = true;
                if (true != z9) {
                    str = "api";
                }
                Cursor query = contentResolver.query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(str).appendPath("com.google.android.gms.providerinstaller.dynamite").appendQueryParameter("requestStartTime", String.valueOf(longValue)).build(), null, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            boolean z13 = false;
                            int i10 = query.getInt(0);
                            if (i10 > 0) {
                                synchronized (c.class) {
                                    try {
                                        d = query.getString(2);
                                        int columnIndex = query.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f5930f = query.getInt(columnIndex);
                                        }
                                        int columnIndex2 = query.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            if (query.getInt(columnIndex2) != 0) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            e = z11;
                                        } else {
                                            z11 = false;
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                f fVar = (f) f5932h.get();
                                if (fVar != null && fVar.f5938a == null) {
                                    fVar.f5938a = query;
                                } else {
                                    z12 = false;
                                }
                                if (!z12) {
                                    cursor = query;
                                }
                                z13 = z11;
                            } else {
                                cursor = query;
                            }
                            if (z10 && z13) {
                                throw new Exception("forcing fallback to container DynamiteLoader impl");
                            }
                            if (cursor != null) {
                                cursor.close();
                            }
                            return i10;
                        }
                    } catch (Exception e6) {
                        exc = e6;
                        if (exc instanceof a) {
                            throw exc;
                        }
                        throw new Exception("V2 version check failed: " + exc.getMessage(), exc);
                    } catch (Throwable th3) {
                        cursor = query;
                        th = th3;
                        if (cursor != null) {
                            cursor.close();
                            throw th;
                        }
                        throw th;
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new Exception("Failed to connect to dynamite module ContentResolver.");
            } catch (Exception e10) {
                exc = e10;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [w2.a] */
    public static void c(ClassLoader classLoader) {
        try {
            h hVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof h) {
                    hVar = (h) queryLocalInterface;
                } else {
                    hVar = new w2.a(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
                }
            }
            f5936l = hVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e6) {
            throw new Exception("Failed to instantiate dynamite loader", e6);
        }
    }

    public static boolean d(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f5931g)) {
            return true;
        }
        boolean z9 = false;
        if (f5931g == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            p2.a.f4987b.getClass();
            if (p2.a.a(10000000, context) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z9 = true;
            }
            f5931g = Boolean.valueOf(z9);
            if (z9 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                e = true;
            }
        }
        if (!z9) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static g e(Context context) {
        g gVar;
        synchronized (c.class) {
            g gVar2 = f5935k;
            if (gVar2 != null) {
                return gVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    gVar = 0;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof g) {
                        gVar = (g) queryLocalInterface;
                    } else {
                        gVar = new w2.a(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
                    }
                }
                if (gVar != 0) {
                    f5935k = gVar;
                    return gVar;
                }
            } catch (Exception e6) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e6.getMessage());
            }
            return null;
        }
    }
}
