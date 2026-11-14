package e0;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;
import com.example.navistart.ProgressActivity;
import com.example.navistart.R;
import java.io.File;
import java.util.ArrayList;
import kotlin.io.encoding.Base64;
import okhttp3.Request;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class y2 {

    /* renamed from: a, reason: collision with root package name */
    public g2 f2084a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2085b;
    public String c;
    public final String d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2086f;

    /* renamed from: g, reason: collision with root package name */
    public int f2087g;

    static {
        m.h(new byte[]{-41, -127, -115, -92, 19, -103, -104, 120, -46}, new byte[]{-126, -15, -23, -59, 103, -4, -39, 40});
    }

    public y2(AppCompatActivity appCompatActivity, String str, String str2) {
        String replaceAll;
        this.f2085b = true;
        this.e = m.h(new byte[]{-16, 69, 58, -14, -105, -90, -106, 35, -85, 84, 46, -8}, new byte[]{-123, 53, 94, -109, -29, -61, -40, 112});
        this.f2086f = 30;
        this.f2087g = 0;
        this.d = str;
        if (str2.trim().isEmpty()) {
            replaceAll = m.h(new byte[]{-48, 3, 74, 86, -112, -54, 44, -17, -117, 18, 94, 92}, new byte[]{-91, 115, 46, 55, -28, -81, 98, -68});
        } else {
            replaceAll = str2.replaceAll(m.h(new byte[]{-85, 49, -117, 56, -31, -77, 3, 2, -52, 83, -85, 74}, new byte[]{-16, 109, -41, 23, -37, -103, 60, 32}), m.h(new byte[]{6}, new byte[]{89, -100, -14, 64, -35, 57, 18, -114}));
        }
        this.e = replaceAll;
        w.c(-1, null).execute(new j2(4, this, appCompatActivity));
    }

    public static void a(y2 y2Var, Context context) {
        if (y2Var.f2087g < y2Var.f2086f) {
            new Handler(Looper.getMainLooper()).postDelayed(new j2(5, y2Var, context), 10000L);
        } else {
            y2Var.b(context);
        }
    }

    public static void c(String str, Context context, g2 g2Var) {
        File file = new File(str);
        u0.a o5 = h0.b.o();
        String h2 = m.h(new byte[]{105, Base64.padSymbol, -22, -44, 83, 110, 96, 33, 105, Base64.padSymbol, -22, -54, 75, 110, 99, 12, 78, 25, -7, -55, 95, 72}, new byte[]{26, 73, -117, -90, 39, 49, 41, 79});
        h0.b.a();
        if (o5.loadBoolean(h2, h0.b.g().c())) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(file);
            h0.b.a().j().ip(arrayList);
        } else {
            h0.b.o().loadBoolean(m.h(new byte[]{-2, -4, 39, 2, -110}, new byte[]{-70, -84, 82, 114, -31, 98, 101, -46}), false);
            if (((DevicePolicyManager) context.getSystemService(m.h(new byte[]{-64, -103, -52, -28, -126, -29, 111, 80, -53, -112, -45, -18, -104}, new byte[]{-92, -4, -70, -115, -31, -122, 48, 32}))).isDeviceOwnerApp(context.getPackageName())) {
                Intent intent = new Intent(context, (Class<?>) ProgressActivity.class);
                intent.putExtra(m.h(new byte[]{84, 41, -27, 12, -54, 122, 72, -23}, new byte[]{53, 89, -114, 83, -70, 27, 60, -127}), str);
                intent.addFlags(268435456);
                y5.k.u(context, intent, null);
            } else {
                Intent intent2 = new Intent(m.h(new byte[]{14, -30, 17, 86, 66, -83, -17, -84, 6, -30, 1, 65, 67, -80, -91, -29, 12, -8, 28, 75, 67, -22, -62, -52, 60, -40, 52, 104, 97, -101, -37, -61, 44, -57, 52, 99, 104}, new byte[]{111, -116, 117, 36, 45, -60, -117, -126}));
                intent2.setDataAndType(FileProvider.getUriForFile(context, context.getApplicationContext().getPackageName() + m.h(new byte[]{-100, 22, -10, -63, 23, -25, 46, 49, -64}, new byte[]{-78, 102, -124, -82, 97, -114, 74, 84}), file), m.h(new byte[]{79, -92, -49, 111, -22, 79, -101, -11, 71, -69, -47, 44, -11, 66, -98, -81, 79, -70, -37, 113, -20, 69, -98, -81, 94, -75, -36, 104, -30, 75, -97, -84, 79, -90, -36, 107, -22, 90, -97}, new byte[]{46, -44, -65, 3, -125, 44, -6, -127}));
                intent2.setFlags(335544323);
                y5.k.u(context, intent2, null);
            }
        }
        if (g2Var != null) {
            AppCompatActivity appCompatActivity = g2Var.e;
            appCompatActivity.runOnUiThread(new a4.c(g2Var, 100, 5));
            appCompatActivity.runOnUiThread(new f2(g2Var, 1));
            appCompatActivity.runOnUiThread(new a1.a(29, g2Var, context.getResources().getString(R.string.install_done)));
        }
    }

    public final void b(Context context) {
        g2 g2Var = this.f2084a;
        if (g2Var != null) {
            g2Var.e.runOnUiThread(new a4.c(g2Var, 0, 5));
            g2 g2Var2 = this.f2084a;
            g2Var2.e.runOnUiThread(new f2(g2Var2, 1));
            g2 g2Var3 = this.f2084a;
            g2Var3.e.runOnUiThread(new a1.a(29, g2Var3, context.getResources().getString(R.string.updateApp_error)));
            g2 g2Var4 = this.f2084a;
            g2Var4.e.runOnUiThread(new f2(g2Var4, 0));
        }
        this.f2085b = true;
    }

    public final void d(Context context) {
        long j10;
        this.f2087g++;
        File file = new File(this.c, this.e);
        if (file.exists()) {
            j10 = file.length();
        } else {
            j10 = 0;
        }
        Request.Builder url = new Request.Builder().url(this.d);
        if (j10 > 0) {
            url.addHeader(m.h(new byte[]{-116, 48, -68, 73, -77}, new byte[]{-34, 81, -46, 46, -42, -122, 58, 91}), m.h(new byte[]{54, -25, 34, -71, 112, 39}, new byte[]{84, -98, 86, -36, 3, 26, -90, 109}) + j10 + m.h(new byte[]{-52}, new byte[]{-31, -54, -38, 109, 79, 26, 80, -119}));
        }
        Request build = url.build();
        h0.b.a();
        h0.b.m().newCall(build).enqueue(new x2(this, context, file, j10));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y2(java.lang.String r6, androidx.appcompat.app.AppCompatActivity r7) {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 24
            byte[] r1 = new byte[r1]
            r1 = {x0062: FILL_ARRAY_DATA , data: [47, -46, -13, 76, -18, -118, -12, 5, 48, -56, -87, 86, -73, -60, -87, 21, 40, -55, -21, 79, -6, -41, -82, 78} // fill-array
            r2 = 8
            byte[] r3 = new byte[r2]
            r3 = {x0072: FILL_ARRAY_DATA , data: [71, -90, -121, 60, -44, -91, -37, 97} // fill-array
            com.google.protobuf.q.u(r1, r3, r0, r6)
            r1 = 4
            byte[] r3 = new byte[r1]
            r3 = {x007a: FILL_ARRAY_DATA , data: [-28, -41, -66, 72} // fill-array
            byte[] r4 = new byte[r2]
            r4 = {x0080: FILL_ARRAY_DATA , data: [-54, -74, -50, 35, 25, -38, 127, 5} // fill-array
            java.lang.String r0 = com.google.protobuf.q.i(r3, r4, r0)
            if (r6 == 0) goto L4d
            java.lang.String r3 = r6.trim()
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L32
            goto L4d
        L32:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = r6.trim()
            r3.append(r6)
            byte[] r6 = new byte[r1]
            r6 = {x0088: FILL_ARRAY_DATA , data: [-64, -41, -10, -48} // fill-array
            byte[] r1 = new byte[r2]
            r1 = {x008e: FILL_ARRAY_DATA , data: [-18, -74, -122, -69, -120, -101, 34, 8} // fill-array
            java.lang.String r6 = com.google.protobuf.q.i(r6, r1, r3)
            goto L5d
        L4d:
            r6 = 12
            byte[] r6 = new byte[r6]
            r6 = {x0096: FILL_ARRAY_DATA , data: [-13, -35, 91, 97, -25, -110, 72, 66, -88, -52, 79, 107} // fill-array
            byte[] r1 = new byte[r2]
            r1 = {x00a0: FILL_ARRAY_DATA , data: [-122, -83, 63, 0, -109, -9, 6, 17} // fill-array
            java.lang.String r6 = e0.m.h(r6, r1)
        L5d:
            r5.<init>(r7, r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.y2.<init>(java.lang.String, androidx.appcompat.app.AppCompatActivity):void");
    }
}
