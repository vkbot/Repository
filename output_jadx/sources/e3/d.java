package e3;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.provider.Settings;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.ViewCompat;
import com.example.navistart.MainActivity;
import e0.m;
import java.io.File;
import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.net.URLEncoder;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static ClassLoader f2109b;
    public static Thread c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2110a;

    public static long a(AtomicLong atomicLong, long j10) {
        long j11;
        do {
            j11 = atomicLong.get();
            if (j11 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j11, b(j11, j10)));
        return j11;
    }

    public static long b(long j10, long j11) {
        long j12 = j10 + j11;
        if (j12 < 0) {
            return Long.MAX_VALUE;
        }
        return j12;
    }

    public static void c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        n0.b.n(str);
    }

    public static void d(Object obj, String str, String str2) {
        String j10 = j(str);
        if (Log.isLoggable(j10, 3)) {
            Log.d(j10, String.format(str2, obj));
        }
    }

    public static int e(Context context, float f8) {
        return Math.round(f8 * context.getResources().getDisplayMetrics().density);
    }

    public static void f(String str, String str2, Exception exc) {
        String j10 = j(str);
        if (Log.isLoggable(j10, 6)) {
            Log.e(j10, str2, exc);
        }
    }

    public static String g(File file) {
        byte[] bArr;
        StringBuilder sb = new StringBuilder();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr2 = new byte[3072];
                while (true) {
                    int read = fileInputStream.read(bArr2);
                    if (read != -1) {
                        if (read != 3072) {
                            bArr = new byte[read];
                            System.arraycopy(bArr2, 0, bArr, 0, read);
                        } else {
                            bArr = bArr2;
                        }
                        sb.append(Base64.encodeToString(bArr, 2));
                    } else {
                        String sb2 = sb.toString();
                        fileInputStream.close();
                        return sb2;
                    }
                }
            } finally {
            }
        } catch (Throwable th) {
            Log.e(m.h(new byte[]{122, -64, 79, -22, 7, 70, -37, -45, 106, -45, 83, -3}, new byte[]{56, -127, 28, -81, 49, 114, -124, -106}), Log.getStackTraceString(th));
            return m.h(new byte[]{-106, -56, -41, -91, -42, 43, -101}, new byte[]{-45, -102, -123, -22, -124, 17, -69, -89}) + th;
        }
    }

    public static Bitmap h(int i10, String str) {
        int i11;
        if (str != null) {
            try {
                f6.b d = com.bumptech.glide.d.d(i10, i10, str);
                Bitmap createBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.RGB_565);
                for (int i12 = 0; i12 < i10; i12++) {
                    for (int i13 = 0; i13 < i10; i13++) {
                        if (d.b(i12, i13)) {
                            i11 = ViewCompat.MEASURED_STATE_MASK;
                        } else {
                            i11 = -1;
                        }
                        createBitmap.setPixel(i12, i13, i11);
                    }
                }
                return createBitmap;
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    public static Bitmap i(MainActivity mainActivity) {
        String str;
        String string = Settings.Secure.getString(mainActivity.getContentResolver(), m.h(new byte[]{-34, 32, -79, -102, 53, -78, -98, 39, -42, 42}, new byte[]{-65, 78, -43, -24, 90, -37, -6, 120}));
        try {
            str = m.h(new byte[]{-89, 2, -21, 36, 44, -55, -35, -96, -91, 21, -2, 38, 43, -100, -99, -29, -68, 88, -19, 33, 112, -125, -109, -10, -32, 73, -6, 57, 62, -102, -98, -78}, new byte[]{-49, 118, -97, 84, 95, -13, -14, -113}) + URLEncoder.encode(h0.b.o().loadString(string, ""), m.h(new byte[]{16, 77, -39, 100, 12}, new byte[]{69, 25, -97, 73, 52, 119, 43, 114})) + m.h(new byte[]{-2, -22, -33, -123, -109, -125, -112, 94, -79, -22, -121}, new byte[]{-40, -114, -70, -13, -6, -32, -11, 1}) + URLEncoder.encode(string, m.h(new byte[]{124, -5, -28, -103, 16}, new byte[]{41, -81, -94, -76, 40, -45, -48, -120}));
        } catch (UnsupportedEncodingException unused) {
            str = null;
        }
        return h(500, str);
    }

    public static String j(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            String concat = "TRuntime.".concat(str);
            if (concat.length() > 23) {
                return concat.substring(0, 23);
            }
            return concat;
        }
        return "TRuntime.".concat(str);
    }

    public static String l(String str, Object... objArr) {
        int indexOf;
        String sb;
        String valueOf = String.valueOf(str);
        int i10 = 0;
        for (int i11 = 0; i11 < objArr.length; i11++) {
            Object obj = objArr[i11];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("e3.d").log(Level.WARNING, "Exception during lenientFormat for ".concat(str2), (Throwable) e);
                    StringBuilder x9 = ai.onnxruntime.a.x("<", str2, " threw ");
                    x9.append(e.getClass().getName());
                    x9.append(">");
                    sb = x9.toString();
                }
            }
            objArr[i11] = sb;
        }
        StringBuilder sb2 = new StringBuilder((objArr.length * 16) + valueOf.length());
        int i12 = 0;
        while (i10 < objArr.length && (indexOf = valueOf.indexOf("%s", i12)) != -1) {
            sb2.append((CharSequence) valueOf, i12, indexOf);
            sb2.append(objArr[i10]);
            i12 = indexOf + 2;
            i10++;
        }
        sb2.append((CharSequence) valueOf, i12, valueOf.length());
        if (i10 < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb2.append(", ");
                sb2.append(objArr[i13]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static void m(String str) {
        if (Log.isLoggable("FIAM.Headless", 3)) {
            Log.d("FIAM.Headless", str);
        }
    }

    public static void n(String str) {
        if (Log.isLoggable("FIAM.Headless", 4)) {
            Log.i("FIAM.Headless", str);
        }
    }

    public static void o(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + cls.getDeclaredConstructor(null).newInstance(null));
            } catch (IllegalAccessException e) {
                q(cls, e);
                throw null;
            } catch (InstantiationException e6) {
                q(cls, e6);
                throw null;
            } catch (NoSuchMethodException e10) {
                q(cls, e10);
                throw null;
            } catch (InvocationTargetException e11) {
                q(cls, e11);
                throw null;
            }
        } catch (ClassNotFoundException e12) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e12);
        }
    }

    public static void p(AtomicLong atomicLong, long j10) {
        long j11;
        long j12;
        do {
            j11 = atomicLong.get();
            if (j11 != Long.MAX_VALUE) {
                j12 = j11 - j10;
                if (j12 < 0) {
                    a.a.s(new IllegalStateException(ai.onnxruntime.a.h(j12, "More produced than requested: ")));
                    j12 = 0;
                }
            } else {
                return;
            }
        } while (!atomicLong.compareAndSet(j11, j12));
    }

    public static void q(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException(ai.onnxruntime.a.j(cls, "Unable to instantiate GlideModule implementation for "), reflectiveOperationException);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a4, code lost:
    
        if (r1 == null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.lang.ClassLoader r() {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.d.r():java.lang.ClassLoader");
    }

    public final ViewPropertyAnimator k(int i10, View view) {
        switch (this.f2110a) {
            case 0:
                return view.animate().translationY(i10);
            case 1:
                return view.animate().translationX(-i10);
            default:
                return view.animate().translationX(i10);
        }
    }
}
