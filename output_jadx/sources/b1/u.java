package b1;

import android.app.AppOpsManager;
import android.content.Context;
import android.hardware.Camera;
import android.os.Process;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import i9.m1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import v8.a0;
import v8.u0;
import v8.v0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static int f330a;

    public static void c(int i10, String str) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i10);
    }

    public static t4.a d(String str, String str2) {
        r5.a aVar = new r5.a(str, str2);
        f6.d a10 = t4.a.a(r5.a.class);
        a10.c = 1;
        a10.f2348f = new q0.f(4, aVar);
        return a10.b();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [a.a, java.lang.Object] */
    public static a.a e(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return new Object();
            }
            return new Object();
        }
        return new Object();
    }

    public static t4.a f(String str, n0.b bVar) {
        f6.d a10 = t4.a.a(r5.a.class);
        a10.c = 1;
        a10.a(t4.h.a(Context.class));
        a10.f2348f = new f5.f(24, str, bVar);
        return a10.b();
    }

    public static String g(String str) {
        StringBuilder sb = new StringBuilder();
        int i10 = 0;
        while (i10 < str.length()) {
            int i11 = i10 + 2;
            sb.append((char) Integer.parseInt(str.substring(i10, i11), 16));
            i10 = i11;
        }
        return sb.toString();
    }

    public static int h(int i10) {
        boolean z9;
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            Log.w("b1.u", "No cameras!");
            return -1;
        }
        if (i10 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            i10 = 0;
            while (i10 < numberOfCameras) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i10, cameraInfo);
                if (cameraInfo.facing == 0) {
                    break;
                }
                i10++;
            }
        }
        if (i10 < numberOfCameras) {
            return i10;
        }
        if (z9) {
            return -1;
        }
        return 0;
    }

    public static final KClass i(g9.e eVar) {
        eVar.getClass();
        if (eVar instanceof g9.b) {
            return ((g9.b) eVar).f2497b;
        }
        if (eVar instanceof m1) {
            return i(((m1) eVar).f2921a);
        }
        return null;
    }

    public static boolean q(Context context) {
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(e0.m.h(new byte[]{22, 115, -88, -76, 82, -11}, new byte[]{119, 3, -40, -37, 34, -122, 14, -30}));
        if (appOpsManager != null && appOpsManager.checkOpNoThrow(e0.m.h(new byte[]{43, 44, 108, -72, 115, 35, -10, -47, 45, 39, 124, -107, 105, 57, -13, -116, 47, 29, 123, -66, 125, 62, -31}, new byte[]{74, 66, 8, -54, 28, 74, -110, -21}), Process.myUid(), context.getPackageName()) == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Finally extract failed */
    public static synchronized String r(File file, File file2, boolean z9) {
        String replaceFirst;
        File file3;
        File[] listFiles;
        synchronized (u.class) {
            try {
                replaceFirst = file.getName().replaceFirst(e0.m.h(new byte[]{121, -122, -74, -68, -71, -20, 13, 7, 33, -99}, new byte[]{81, -71, -33, -107, -27, -62, 119, 110}), "");
                if (!replaceFirst.isEmpty()) {
                    boolean z10 = true;
                    if (!replaceFirst.startsWith(e0.m.h(new byte[]{-54}, new byte[]{-28, 56, 25, 98, -120, 96, -107, -31})) && !replaceFirst.contains(e0.m.h(new byte[]{57}, new byte[]{101, 116, 112, 60, -19, -78, -56, ByteCompanionObject.MIN_VALUE})) && !replaceFirst.contains(e0.m.h(new byte[]{-90}, new byte[]{-119, 77, -57, 24, ByteCompanionObject.MAX_VALUE, 58, 16, 75}))) {
                        File canonicalFile = file2.getCanonicalFile();
                        if (!canonicalFile.isDirectory() && !canonicalFile.mkdirs()) {
                            throw new IOException(e0.m.h(new byte[]{-125, 98, -108, 100, -38, 1, -98, -19, -78, 102, -101, 126, -48, 85, -55, -25, -92, 100, -97, 126, -107, 17, -41, -4, -91, 96, -114, 101, -57, 12}, new byte[]{-64, 3, -6, 10, -75, 117, -66, -114}));
                        }
                        File canonicalFile2 = new File(canonicalFile, replaceFirst).getCanonicalFile();
                        if (canonicalFile.equals(canonicalFile2.getParentFile())) {
                            file3 = new File(canonicalFile, e0.m.h(new byte[]{49, 58, 86, -65, 99, 6, 21, -5, 50}, new byte[]{31, 83, 56, -52, 23, 103, 121, -105}) + UUID.randomUUID());
                            File file4 = new File(canonicalFile, e0.m.h(new byte[]{-61, -87, -118, -55, -5, 87, -91, 115}, new byte[]{-19, -53, -21, -86, -112, 34, -43, 94}) + UUID.randomUUID());
                            if (file3.mkdir()) {
                                ZipFile zipFile = new ZipFile(file);
                                try {
                                    Enumeration<? extends ZipEntry> entries = zipFile.entries();
                                    int i10 = 0;
                                    while (entries.hasMoreElements()) {
                                        ZipEntry nextElement = entries.nextElement();
                                        File canonicalFile3 = new File(file3, nextElement.getName()).getCanonicalFile();
                                        if (canonicalFile3.getPath().startsWith(file3.getCanonicalPath() + File.separator)) {
                                            if (nextElement.isDirectory()) {
                                                if (!canonicalFile3.isDirectory() && !canonicalFile3.mkdirs()) {
                                                    throw new IOException(e0.m.h(new byte[]{-85, -85, -58, 4, -78, -18, -26, -119, -102, -81, -55, 30, -72, -70, -94, -125, -102, -81, -53, 30, -78, -24, -65}, new byte[]{-24, -54, -88, 106, -35, -102, -58, -22}));
                                                }
                                            } else {
                                                File parentFile = canonicalFile3.getParentFile();
                                                if (!parentFile.isDirectory() && !parentFile.mkdirs()) {
                                                    throw new IOException(e0.m.h(new byte[]{52, 83, -102, -115, 104, -97, 125, 57, 5, 87, -107, -105, 98, -53, 57, 51, 5, 87, -105, -105, 104, -103, 36}, new byte[]{119, 50, -12, -29, 7, -21, 93, 90}));
                                                }
                                                InputStream inputStream = zipFile.getInputStream(nextElement);
                                                try {
                                                    FileOutputStream fileOutputStream = new FileOutputStream(canonicalFile3);
                                                    try {
                                                        byte[] bArr = new byte[8192];
                                                        while (true) {
                                                            int read = inputStream.read(bArr);
                                                            if (read == -1) {
                                                                break;
                                                            }
                                                            fileOutputStream.write(bArr, 0, read);
                                                        }
                                                        fileOutputStream.close();
                                                        inputStream.close();
                                                        i10++;
                                                    } catch (Throwable th) {
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th;
                                                        } catch (Throwable th2) {
                                                            th.addSuppressed(th2);
                                                            throw th;
                                                        }
                                                    }
                                                } finally {
                                                }
                                            }
                                        } else {
                                            throw new IOException(e0.m.h(new byte[]{-102, 66, -37, -2, 93, -6, 121, -106, -66, 94, -52, -28, 77, -84, 115, -61, -81, 67, -47, -14, 81, -84, 107, -33, -65, 87, -35, -30, 20, -24, 117, -60, -66, 83, -52, -7, 70, -11}, new byte[]{-37, 48, -72, -106, 52, -116, 28, -74}));
                                        }
                                    }
                                    zipFile.close();
                                    if (i10 != 0) {
                                        if (z9 && (listFiles = file3.listFiles()) != null && listFiles.length == 1 && listFiles[0].isDirectory()) {
                                            File file5 = listFiles[0];
                                            File[] listFiles2 = file5.listFiles();
                                            if (listFiles2 != null) {
                                                for (File file6 : listFiles2) {
                                                    if (!file6.renameTo(new File(file3, file6.getName()))) {
                                                        throw new IOException(e0.m.h(new byte[]{60, -97, -1, -52, 123, 14, -110, 116, 16, -120, -12, -126, 99, 19, -42, 126, 26, -118, -79, -60, 125, 22, -41}, new byte[]{ByteCompanionObject.MAX_VALUE, -2, -111, -94, 20, 122, -78, 25}));
                                                    }
                                                }
                                                if (!file5.delete()) {
                                                    throw new IOException(e0.m.h(new byte[]{-12, -94, -57, 2, -53, 85, -105, 33, -46, -82, -58, 26, -63, 1, -64, 33, -42, -77, -39, 9, -42, 1, -45, 58, -59, -90, -54, 24, -53, 83, -50}, new byte[]{-73, -61, -87, 108, -92, 33, -73, 83}));
                                                }
                                            } else {
                                                throw new IOException(e0.m.h(new byte[]{-82, 103, -50, 86, 110, -13, 56, -94, -120, 103, -60, 24, 118, -18, 124, -73, -120, 114, ByteCompanionObject.MIN_VALUE, 92, 104, -11, 125, -77, -103, 105, -46, 65}, new byte[]{-19, 6, -96, 56, 1, -121, 24, -48}));
                                            }
                                        }
                                        if (canonicalFile2.exists()) {
                                            if (!canonicalFile2.renameTo(file4)) {
                                                throw new IOException(e0.m.h(new byte[]{87, -116, 48, -124, 76, 7, -57, -8, 117, -114, 53, -54, 86, 3, -57, -13, 122, -98, 42, -117, 79, 31, -126, -2, 52, -102, 55, -114, 68, 22, -109}, new byte[]{20, -19, 94, -22, 35, 115, -25, -102}));
                                            }
                                        } else {
                                            z10 = false;
                                        }
                                        if (!file3.renameTo(canonicalFile2)) {
                                            if (z10 && !file4.renameTo(canonicalFile2)) {
                                                throw new IOException(e0.m.h(new byte[]{-124, 77, -112, -90, -27, -83, -87, 34, -85, 66, -118, -66, -31, -91, -2, 34, -94, 81, -118, -75, -19, -81, -92, 110, -19, 83, -111, -73, -9, -92, -73, 116, -88, 71, -61, -77, -16, -31}, new byte[]{-51, 35, -29, -46, -124, -63, -59, 2}) + file4);
                                            }
                                            throw new IOException(e0.m.h(new byte[]{37, -104, -124, -121, -37, -73, 113, 69, 8, -118, -98, -120, -40, -81, 113, 91, 15, -99, -115, -116, -64}, new byte[]{102, -7, -22, -23, -76, -61, 81, 44}));
                                        }
                                        v(file4);
                                        v(file3);
                                    } else {
                                        throw new IOException(e0.m.h(new byte[]{4, 4, 19, -50, -61, -7, -48, -17, 37, 14, 6, -50, -102, -72, -43, -27, 41, 0, 21, -33}, new byte[]{65, 105, 99, -70, -70, -39, -89, -122}));
                                    }
                                } catch (Throwable th3) {
                                    try {
                                        zipFile.close();
                                        throw th3;
                                    } catch (Throwable th4) {
                                        th3.addSuppressed(th4);
                                        throw th3;
                                    }
                                }
                            } else {
                                throw new IOException(e0.m.h(new byte[]{77, 93, 28, -82, -75, -30, 42, -48, 124, 89, 19, -76, -65, -74, 121, -57, 111, 91, 27, -82, -67, -74, 110, -38, 124, 89, 17, -76, -75, -28, 115}, new byte[]{14, 60, 114, -64, -38, -106, 10, -77}));
                            }
                        } else {
                            throw new IOException(e0.m.h(new byte[]{-104, -51, 20, 74, 49, -14, 94, 41, -90, -54, 6, 76, 56, -17, 26, 121, -80, -41, 10}, new byte[]{-47, -93, 98, 43, 93, -101, 58, 9}));
                        }
                    }
                }
                throw new IOException(e0.m.h(new byte[]{8, -79, 52, 72, 42, 62, -94, -48, 54, -74, 38, 78, 35, 35, -26, -98, 32, -78, 39}, new byte[]{65, -33, 66, 41, 70, 87, -58, -16}));
            } catch (Throwable th5) {
                v(file3);
                throw th5;
            } finally {
            }
        }
        return replaceFirst;
    }

    public static void v(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                v(file2);
            }
        }
        file.delete();
    }

    public static void w(View view, z3.k kVar) {
        p3.a aVar = kVar.c.c;
        if (aVar != null && aVar.f4995a) {
            float f8 = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                f8 += ((View) parent).getElevation();
            }
            z3.h hVar = kVar.c;
            if (hVar.f6758m != f8) {
                hVar.f6758m = f8;
                kVar.x();
            }
        }
    }

    public static final Object y(a9.t tVar, a9.t tVar2, Function2 function2) {
        Object kVar;
        v0 v0Var;
        u0 u0Var;
        try {
            kVar = ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(tVar2, tVar);
        } catch (Throwable th) {
            kVar = new v8.k(false, th);
        }
        if (kVar == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        Object B = tVar.B(kVar);
        if (B == a0.d) {
            return IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        if (!(B instanceof v8.k)) {
            if (B instanceof v0) {
                v0Var = (v0) B;
            } else {
                v0Var = null;
            }
            if (v0Var != null && (u0Var = v0Var.f6054a) != null) {
                return u0Var;
            }
            return B;
        }
        throw ((v8.k) B).f6037a;
    }

    public void A(x7.a aVar) {
        try {
            B(aVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            com.bumptech.glide.d.v(th);
            a.a.s(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void B(x7.a aVar);

    public abstract void C(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11);

    public abstract int a(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float b(int i10);

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n(View view);

    public abstract int o(CoordinatorLayout coordinatorLayout);

    public abstract int p();

    public abstract boolean s(float f8);

    public abstract boolean t(View view);

    public abstract boolean u(float f8, float f10);

    public abstract boolean x(View view, float f8);

    public void z() {
        A(new c8.d(1));
    }
}
