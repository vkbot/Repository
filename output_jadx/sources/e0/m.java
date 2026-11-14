package e0;

import android.app.PendingIntent;
import android.app.admin.DevicePolicyManager;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInstaller;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.example.navistart.MainActivity;
import com.example.navistart.UpdateActivity;
import com.example.navistart.cores.BezFunEnum;
import com.example.navistart.mainview.HeatManSetView;
import com.example.navistart.mainview.MainView;
import com.example.navistart.mainview.MainWidjet;
import com.google.android.material.materialswitch.MaterialSwitch;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class m {
    public static String[] c;
    public static ArrayList d;

    /* renamed from: a, reason: collision with root package name */
    public static Boolean f1967a = Boolean.FALSE;

    /* renamed from: b, reason: collision with root package name */
    public static String f1968b = "";
    public static final byte[] e = {107, 117};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f1969f = {109, 105, 114, 117};

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f1970g = {109, 105, 114};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f1971h = {83, 72, 65};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f1972i = {83, 72, 65, 45, 53, 49, 50};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f1973j = {109, 117, 114};

    /* renamed from: k, reason: collision with root package name */
    public static final byte[] f1974k = {113, 102, 76, 55, 47, 67, 101, 120, 48, 56, 75, 119, 75, 66, 101, 111, 115, 48, 107, 100, 97, 89, 78, 65, 51, 101, 103, Base64.padSymbol, 10};

    public static String a(List list) {
        if (list != null && !list.isEmpty()) {
            StringBuilder sb = new StringBuilder(h(new byte[]{-23}, new byte[]{-78, -21, -37, 126, -107, -62, -35, -17}));
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (i10 > 0) {
                    sb.append(h(new byte[]{76, -66}, new byte[]{96, -98, 101, 46, 64, -88, -114, 121}));
                }
                sb.append(((ComponentName) list.get(i10)).flattenToShortString());
            }
            return com.google.protobuf.q.i(new byte[]{-55}, new byte[]{-108, -71, -117, -18, -28, -59, 29, 48}, sb);
        }
        return h(new byte[]{40, 32}, new byte[]{115, 125, 15, -58, 125, -60, 103, 70});
    }

    public static String b(String str, String str2, Exception exc) {
        StringBuilder u8 = ai.onnxruntime.a.u(str2);
        u8.append(h(new byte[]{-29}, new byte[]{-34, -40, 70, 90, 21, -53, 94, -91}));
        u8.append(i(exc));
        String sb = u8.toString();
        if (str == null) {
            return sb;
        }
        return com.google.protobuf.q.l(new byte[]{33, -19}, new byte[]{26, -51, 26, -71, 29, 95, -100, -56}, ai.onnxruntime.a.u(str), sb);
    }

    public static void c() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        d = new ArrayList();
        try {
            Method declaredMethod = BluetoothAdapter.class.getDeclaredMethod(h(new byte[]{82, 122, -26, -113, -49, -115, 2, -25, 86, 107, -5, -93, -50, -80, 24, -29, 65, 122}, new byte[]{53, 31, -110, -52, -96, -29, 108, -126}), null);
            declaredMethod.setAccessible(true);
            ((Integer) declaredMethod.invoke(defaultAdapter, null)).getClass();
            for (BluetoothDevice bluetoothDevice : defaultAdapter.getBondedDevices()) {
                Method declaredMethod2 = BluetoothDevice.class.getDeclaredMethod(h(new byte[]{-38, 109, 58, 71, 103, -71, -6, -1, -57, 123, 29}, new byte[]{-77, 30, 121, 40, 9, -41, -97, -100}), null);
                declaredMethod.setAccessible(true);
                boolean booleanValue = ((Boolean) declaredMethod2.invoke(bluetoothDevice, null)).booleanValue();
                String name = bluetoothDevice.getName();
                ArrayList arrayList = d;
                if (name == null || name.trim().isEmpty()) {
                    name = bluetoothDevice.getAddress();
                }
                arrayList.add(name);
                String[] strArr = new String[d.size()];
                for (int i10 = 0; i10 < d.size(); i10++) {
                    strArr[i10] = (String) d.get(i10);
                }
                c = strArr;
                if (booleanValue && !f1967a.booleanValue()) {
                    f1967a = Boolean.TRUE;
                    f1968b = bluetoothDevice.getName();
                }
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static e0.r d(com.example.navistart.UpdateActivity r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.m.d(com.example.navistart.UpdateActivity, java.lang.String):e0.r");
    }

    public static void e(UpdateActivity updateActivity, DevicePolicyManager devicePolicyManager, ComponentName componentName, String str) {
        String packageName = updateActivity.getPackageName();
        String flattenToShortString = componentName.flattenToShortString();
        try {
            devicePolicyManager.setUninstallBlocked(componentName, packageName, false);
            Log.e(str, h(new byte[]{-30, 68, 1, -9, 30, 122, -13, -122, -27, 64, 25, -50, 50, ByteCompanionObject.MAX_VALUE, -14, -106, -6, 68, 17, -118, 22, 114, -15, -122, -12, 8, 85, -51, 27, 51, -5, -102, -29, 1}, new byte[]{-111, 33, 117, -94, 112, 19, -99, -11}) + packageName + h(new byte[]{-20, 89, 108, 54, -3, 65, 56, -67}, new byte[]{-64, 121, 13, 82, -112, 40, 86, ByteCompanionObject.MIN_VALUE}) + flattenToShortString);
        } catch (Exception e6) {
            Log.e(str, com.google.protobuf.q.l(new byte[]{-52, 66, 109, 28, 71, 23, -21, -74, -53, 70, 117, 37, 107, 18, -22, -90, -44, 66, 125, 97, 79, 31, -23, -74, -38, 14, 57, 47, 72, 23, -23, -96, -37, 11, 57, 40, 77, 19, -20, -85, -126}, new byte[]{-65, 39, 25, 73, 41, 126, -123, -59}, new StringBuilder(), flattenToShortString), e6);
        }
        try {
            devicePolicyManager.clearUserRestriction(componentName, h(new byte[]{103, -108, -93, -2, -2, 16, -36, 24, 125, -102, -112, -25, -49, 24, -62, 27, 122}, new byte[]{9, -5, -4, -117, -112, 121, -78, 107}));
            Log.e(str, h(new byte[]{-26, -60, -92, -57, 83, 86, 17, 77, -9, -6, -92, -43, 85, 113, 11, 75, -15, -63, -82, -56, 9, 71, 43, 123, -60, -28, -115, -23, 118, 92, 55, 102, -52, -26, -110, -14, 96, 79, 46, 119, -60, -8, -111, -11, 8, 35, 13, 67, -87, -120, -96, -62, 76, 106, 12, 21}, new byte[]{-123, -88, -63, -90, 33, 3, 98, 40}) + flattenToShortString);
        } catch (Exception e10) {
            Log.e(str, com.google.protobuf.q.l(new byte[]{54, 104, -119, 73, -26, 65, -117, 14, 39, 86, -119, 91, -32, 102, -111, 8, 33, 109, -125, 70, -68, 80, -79, 56, 20, 72, -96, 103, -61, 75, -83, 37, 28, 74, -65, 124, -43, 88, -76, 52, 20, 84, -68, 123, -67, 52, -98, 10, 60, 104, -119, 76, -72, 52, -103, 15, 56, 109, -126, 21}, new byte[]{85, 4, -20, 40, -108, 20, -8, 107}, new StringBuilder(), flattenToShortString), e10);
        }
        try {
            devicePolicyManager.clearUserRestriction(componentName, h(new byte[]{-110, 107, -25, 89, -23, -66, 53, 66, -109, 104, -25, 91, -10, -96, 50}, new byte[]{-4, 4, -72, 58, -122, -48, 65, 48}));
            Log.e(str, h(new byte[]{-124, 66, -122, -106, 59, -85, 79, 70, -107, 124, -122, -124, Base64.padSymbol, -116, 85, 64, -109, 71, -116, -103, 97, -70, 117, 112, -90, 98, -81, -72, 30, -95, 125, 115, -73, 125, -68, -76, 6, -80, 104, 113, -88, 98, -54, -41, 38, -107, 16, 3, -122, 74, -114, -98, 39, -61}, new byte[]{-25, 46, -29, -9, 73, -2, 60, 35}) + flattenToShortString);
        } catch (Exception e11) {
            Log.e(str, com.google.protobuf.q.l(new byte[]{34, 100, -119, -95, -12, -51, -39, 34, 51, 90, -119, -77, -14, -22, -61, 36, 53, 97, -125, -82, -82, -36, -29, 20, 0, 68, -96, -113, -47, -57, -21, 23, 17, 91, -77, -125, -55, -42, -2, 21, 14, 68, -59, -32, -32, -7, -61, 43, 36, 108, -64, -32, -25, -4, -57, 46, 47, 53}, new byte[]{65, 8, -20, -64, -122, -104, -86, 71}, new StringBuilder(), flattenToShortString), e11);
        }
        try {
            devicePolicyManager.clearPackagePersistentPreferredActivities(componentName, packageName);
            Log.e(str, h(new byte[]{111, -38, -48, -39, -120, 93, -71, -99, 103, -41, -46, -35, -86, 104, -86, -115, 101, -59, -63, -35, -108, 121, -120, -116, 105, -48, -48, -54, -120, 104, -68, -65, 111, -62, -36, -50, -109, 121, -79, -101, ByteCompanionObject.MAX_VALUE, -106, -38, -45, -38, 107, -73, -116, 44}, new byte[]{12, -74, -75, -72, -6, 13, -40, -2}) + packageName + h(new byte[]{41, -85, 20, -99, -76, -36, 9, 84}, new byte[]{5, -117, 117, -7, -39, -75, 103, 105}) + flattenToShortString);
        } catch (Exception e12) {
            Log.e(str, com.google.protobuf.q.l(new byte[]{-107, 49, 32, -41, 78, -56, -109, 49, -99, 60, 34, -45, 108, -3, ByteCompanionObject.MIN_VALUE, 33, -97, 46, 49, -45, 82, -20, -94, 32, -109, 59, 32, -60, 78, -3, -106, 19, -107, 41, 44, -64, 85, -20, -101, 55, -123, 125, 35, -41, 85, -12, -105, 54, -38, 125, 36, -46, 81, -15, -100, 111}, new byte[]{-10, 93, 69, -74, 60, -104, -14, 82}, new StringBuilder(), flattenToShortString), e12);
        }
    }

    public static void f(PackageInstaller.Session session) {
        if (session != null) {
            try {
                session.close();
            } catch (IOException e6) {
                Log.e(h(new byte[]{8, -70, -60, -120, 80, -119, 51, 112, 118, -68, -24, -72, 76, -115, 48, 101, 47, -68}, new byte[]{91, -20, -123, -5, 35, -32, 64, 4}), h(new byte[]{-102, 28, 77, -69, 85, -105, -47, 38, -88, 26, 85, -72, 95, -81, -70, 115, -92, -112, -99, 78}, new byte[]{-63, ByteCompanionObject.MAX_VALUE, 33, -44, 38, -14, ByteCompanionObject.MIN_VALUE, 83}) + e6);
            }
        }
    }

    public static boolean g(Context context, PackageInstaller packageInstaller, int i10) {
        PackageInstaller.Session session = null;
        try {
            try {
                session = packageInstaller.openSession(i10);
                session.commit(PendingIntent.getBroadcast(context, 1, new Intent(), 33554432).getIntentSender());
                return true;
            } catch (IOException e6) {
                e6.printStackTrace();
                f(session);
                return false;
            }
        } finally {
            f(session);
        }
    }

    public static String h(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int length2 = bArr2.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            if (i11 >= length2) {
                i11 = 0;
            }
            bArr[i10] = (byte) (bArr[i10] ^ bArr2[i11]);
            i10++;
            i11++;
        }
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static String i(Exception exc) {
        return exc.getClass().getSimpleName() + h(new byte[]{-17, 124}, new byte[]{-43, 92, -68, -80, 20, 78, -56, 78}) + exc.getMessage();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a7, code lost:
    
        if (r1.isAdminActive(r3) != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static e0.s j(android.content.Context r13) {
        /*
            r0 = 13
            byte[] r1 = new byte[r0]
            r1 = {x00c6: FILL_ARRAY_DATA , data: [108, 111, -90, 11, -75, -115, 102, -79, 103, 102, -71, 1, -81} // fill-array
            r2 = 8
            byte[] r3 = new byte[r2]
            r3 = {x00d2: FILL_ARRAY_DATA , data: [8, 10, -48, 98, -42, -24, 57, -63} // fill-array
            java.lang.String r1 = h(r1, r3)
            java.lang.Object r1 = r13.getSystemService(r1)
            android.app.admin.DevicePolicyManager r1 = (android.app.admin.DevicePolicyManager) r1
            android.content.ComponentName r3 = new android.content.ComponentName
            java.lang.Class<com.example.navistart.DPups> r4 = com.example.navistart.DPups.class
            r3.<init>(r13, r4)
            r4 = 0
            java.lang.String r5 = ""
            if (r1 != 0) goto L3a
            e0.s r13 = new e0.s
            r0 = 27
            byte[] r0 = new byte[r0]
            r0 = {x00da: FILL_ARRAY_DATA , data: [79, 85, -62, -82, -126, 9, 119, -111, 103, 89, -41, -66, -84, 13, 73, -97, 108, 85, -58, -25, -120, 31, 7, -112, 126, 92, -40} // fill-array
            byte[] r1 = new byte[r2]
            r1 = {x00ec: FILL_ARRAY_DATA , data: [11, 48, -76, -57, -31, 108, 39, -2} // fill-array
            java.lang.String r0 = h(r0, r1)
            r13.<init>(r4, r4, r5, r0)
            return r13
        L3a:
            r6 = 0
            java.lang.String r7 = r13.getPackageName()     // Catch: java.lang.Exception -> L44
            boolean r7 = r1.isDeviceOwnerApp(r7)     // Catch: java.lang.Exception -> L44
            goto L5a
        L44:
            r7 = move-exception
            r8 = 16
            byte[] r8 = new byte[r8]
            r8 = {x00f4: FILL_ARRAY_DATA , data: [-56, -55, 40, 125, 56, 75, -91, -126, -18, -51, 2, 125, 60, 99, -74, -105} // fill-array
            byte[] r9 = new byte[r2]
            r9 = {x0100: FILL_ARRAY_DATA , data: [-95, -70, 108, 24, 78, 34, -58, -25} // fill-array
            java.lang.String r8 = h(r8, r9)
            java.lang.String r6 = b(r6, r8, r7)
            r7 = r4
        L5a:
            r8 = 1
            java.util.List r9 = r1.getActiveAdmins()     // Catch: java.lang.Exception -> L88
            java.lang.String r5 = a(r9)     // Catch: java.lang.Exception -> L88
            if (r9 == 0) goto L8b
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Exception -> L88
            r10 = r4
        L6a:
            boolean r11 = r9.hasNext()     // Catch: java.lang.Exception -> L86
            if (r11 == 0) goto La1
            java.lang.Object r11 = r9.next()     // Catch: java.lang.Exception -> L86
            android.content.ComponentName r11 = (android.content.ComponentName) r11     // Catch: java.lang.Exception -> L86
            java.lang.String r12 = r13.getPackageName()     // Catch: java.lang.Exception -> L86
            java.lang.String r11 = r11.getPackageName()     // Catch: java.lang.Exception -> L86
            boolean r11 = r12.equals(r11)     // Catch: java.lang.Exception -> L86
            if (r11 == 0) goto L6a
            r10 = r8
            goto L6a
        L86:
            r13 = move-exception
            goto L8d
        L88:
            r13 = move-exception
            r10 = r4
            goto L8d
        L8b:
            r10 = r4
            goto La1
        L8d:
            r9 = 15
            byte[] r9 = new byte[r9]
            r9 = {x0108: FILL_ARRAY_DATA , data: [86, 26, 10, -66, -67, 101, 2, 44, 84, 62, 26, -110, -73, 127, 24} // fill-array
            byte[] r11 = new byte[r2]
            r11 = {x0114: FILL_ARRAY_DATA , data: [49, 127, 126, -1, -34, 17, 107, 90} // fill-array
            java.lang.String r9 = h(r9, r11)
            java.lang.String r6 = b(r6, r9, r13)
        La1:
            if (r10 != 0) goto Lbe
            boolean r13 = r1.isAdminActive(r3)     // Catch: java.lang.Exception -> Laa
            if (r13 == 0) goto Lbf
            goto Lbe
        Laa:
            r13 = move-exception
            byte[] r0 = new byte[r0]
            r0 = {x011c: FILL_ARRAY_DATA , data: [69, -45, 29, 58, -11, -40, -108, -30, 79, -44, 53, 40, -3} // fill-array
            byte[] r1 = new byte[r2]
            r1 = {x0128: FILL_ARRAY_DATA , data: [44, -96, 92, 94, -104, -79, -6, -93} // fill-array
            java.lang.String r0 = h(r0, r1)
            java.lang.String r6 = b(r6, r0, r13)
            goto Lc0
        Lbe:
            r4 = r8
        Lbf:
            r10 = r4
        Lc0:
            e0.s r13 = new e0.s
            r13.<init>(r7, r10, r5, r6)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.m.j(android.content.Context):e0.s");
    }

    public static void k(UpdateActivity updateActivity, DevicePolicyManager devicePolicyManager, ComponentName componentName, String str) {
        boolean z9 = false;
        Exception exc = null;
        try {
            List<ComponentName> activeAdmins = devicePolicyManager.getActiveAdmins();
            if (activeAdmins != null) {
                for (ComponentName componentName2 : activeAdmins) {
                    if (updateActivity.getPackageName().equals(componentName2.getPackageName())) {
                        z9 = true;
                        try {
                            devicePolicyManager.removeActiveAdmin(componentName2);
                            Log.e(str, h(new byte[]{-107, -56, 39, -43, 67, -19, 51, 2, -109, -60, 60, -33, 116, -20, 31, 8, -119, -115, 37, -47, 15, -88}, new byte[]{-25, -83, 74, -70, 53, -120, 114, 97}) + componentName2.flattenToShortString());
                        } catch (Exception e6) {
                            if (exc == null) {
                                exc = e6;
                            }
                            Log.e(str, h(new byte[]{26, 94, -11, 23, 90, -98, -65, 77, 28, 82, -18, 29, 109, -97, -109, 71, 6, 27, -2, 25, 69, -105, -101, 74, 82, 27}, new byte[]{104, 59, -104, 120, 44, -5, -2, 46}) + componentName2.flattenToShortString(), e6);
                        }
                    }
                }
            }
        } catch (Exception e10) {
            if (exc == null) {
                exc = e10;
            }
            Log.e(str, h(new byte[]{47, -90, 31, 124, -111, -67, 92, -41, 45, -126, 15, 80, -101, -89, 70, -127, 46, -94, 2, 81, -105, -83, 21, -61, 45, -91, 4, 79, -105, -23, 71, -60, 37, -84, 29, 88}, new byte[]{72, -61, 107, Base64.padSymbol, -14, -55, 53, -95}), e10);
        }
        if (!z9) {
            try {
                if (devicePolicyManager.isAdminActive(componentName)) {
                    devicePolicyManager.removeActiveAdmin(componentName);
                    Log.e(str, h(new byte[]{-11, 74, 24, 72, -31, 10, 19, -96, -13, 70, 3, 66, -42, 11, 63, -86, -23, 15, 19, 70, -5, 3, 48, -94, -28, 68, 85, 72, -4, 85, 114}, new byte[]{-121, 47, 117, 39, -105, 111, 82, -61}) + componentName.flattenToShortString());
                }
            } catch (Exception e11) {
                if (exc == null) {
                    exc = e11;
                }
                Log.e(str, h(new byte[]{80, -9, 23, 111, 25, 22, 109, 76, 86, -5, 12, 101, 46, 23, 65, 70, 76, -78, 28, 97, 3, 31, 78, 78, 65, -7, 90, 102, 14, 26, 64, 74, 70}, new byte[]{34, -110, 122, 0, 111, 115, 44, 47}), e11);
            }
        }
        if (exc != null) {
            throw new IllegalStateException(h(new byte[]{-32, -38, 11, -68, -6, -44, -79, 101, -55, -101, 16, -75, -14, -33, -25, 116, -122, -44, 12, -75, -65, -33, -29, 49, -53, -44, 16, -75, -65, -47, -14, 101, -49, -51, 7, -16, -2, -44, -4, 120, -56, -56}, new byte[]{-90, -69, 98, -48, -97, -80, -111, 17}), exc);
        }
    }

    public static void l(MainActivity mainActivity, boolean z9, boolean z10, boolean z11, boolean z12) {
        int i10;
        int i11;
        int i12;
        HeatManSetView heatManSetView = mainActivity.H;
        int i13 = 8;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        heatManSetView.setVisibility(i10);
        HeatManSetView heatManSetView2 = mainActivity.I;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        heatManSetView2.setVisibility(i11);
        HeatManSetView heatManSetView3 = mainActivity.J;
        if (z12) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        heatManSetView3.setVisibility(i12);
        CardView cardView = mainActivity.O;
        if (z9) {
            i13 = 0;
        }
        cardView.setVisibility(i13);
    }

    public static void m(MainActivity mainActivity, BezFunEnum bezFunEnum, boolean z9) {
        int i10;
        MaterialSwitch materialSwitch = (MaterialSwitch) mainActivity.f765d1.get(bezFunEnum);
        if (materialSwitch != null) {
            if (z9) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            materialSwitch.setVisibility(i10);
        }
    }

    public static void n(MainActivity mainActivity, boolean z9) {
        int i10;
        CardView cardView = mainActivity.W0;
        if (z9) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        cardView.setVisibility(i10);
        w(mainActivity);
    }

    public static void o(MainActivity mainActivity, boolean z9) {
        int i10;
        CardView cardView = mainActivity.L;
        if (z9) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        cardView.setVisibility(i10);
    }

    public static void p(MainActivity mainActivity) {
        l(mainActivity, true, true, true, true);
        t(mainActivity, true, true, true, true, false);
        n(mainActivity, true);
        m(mainActivity, BezFunEnum.ID_CAR_SPD_LIMIT_WARN_SET, true);
        m(mainActivity, BezFunEnum.ID_SPD_LIMIT_VALUE_CHANGE, true);
        q(mainActivity, true, true);
        mainActivity.Y0.setVisibility(0);
        o(mainActivity, true);
        mainActivity.M.setVisibility(0);
        mainActivity.N.setVisibility(0);
        v(mainActivity, true, true);
        r(mainActivity, true);
        mainActivity.Q.setVisibility(0);
        mainActivity.f760b0.setVisibility(0);
        w(mainActivity);
        mainActivity.f762c0.setVisibility(0);
        u(mainActivity, true);
        s(mainActivity, true);
    }

    public static void q(MainActivity mainActivity, boolean z9, boolean z10) {
        int i10;
        LinearLayout linearLayout = mainActivity.T;
        int i11 = 8;
        if (z9) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        linearLayout.setVisibility(i10);
        LinearLayout linearLayout2 = mainActivity.U;
        if (z10) {
            i11 = 0;
        }
        linearLayout2.setVisibility(i11);
    }

    public static void r(MainActivity mainActivity, boolean z9) {
        int i10;
        MainWidjet mainWidjet = mainActivity.f758a1;
        if (z9) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        mainWidjet.setVisibility(i10);
    }

    public static void s(MainActivity mainActivity, boolean z9) {
        int i10;
        MainView mainView = mainActivity.f763c1;
        if (z9) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        mainView.setVisibility(i10);
    }

    public static void t(MainActivity mainActivity, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        int i10;
        int i11;
        int i12;
        int i13;
        CardView cardView = mainActivity.R;
        int i14 = 8;
        if (z9) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        cardView.setVisibility(i10);
        LinearLayout linearLayout = mainActivity.X;
        if (z10) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        LinearLayout linearLayout2 = mainActivity.V;
        if (z11) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        linearLayout2.setVisibility(i12);
        LinearLayout linearLayout3 = mainActivity.W;
        if (z12) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        linearLayout3.setVisibility(i13);
        LinearLayout linearLayout4 = mainActivity.Y;
        if (z13) {
            i14 = 0;
        }
        linearLayout4.setVisibility(i14);
        w(mainActivity);
    }

    public static void u(MainActivity mainActivity, boolean z9) {
        int i10;
        MaterialSwitch materialSwitch = mainActivity.f778k0;
        int i11 = 8;
        if (z9) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        materialSwitch.setVisibility(i10);
        MaterialSwitch materialSwitch2 = mainActivity.f780l0;
        if (z9) {
            i11 = 0;
        }
        materialSwitch2.setVisibility(i11);
    }

    public static void v(MainActivity mainActivity, boolean z9, boolean z10) {
        int i10;
        int i11;
        CardView cardView = mainActivity.P;
        int i12 = 8;
        if (z9) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        cardView.setVisibility(i10);
        LinearLayout linearLayout = mainActivity.Z0;
        if (z10) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        Button button = mainActivity.f761b1;
        if (z10) {
            i12 = 0;
        }
        button.setVisibility(i12);
    }

    public static void w(MainActivity mainActivity) {
        boolean z9;
        int i10 = 0;
        if (mainActivity.V.getVisibility() != 0 && mainActivity.W.getVisibility() != 0 && mainActivity.f760b0.getVisibility() != 0 && mainActivity.f764d0.getVisibility() != 0 && mainActivity.W0.getVisibility() != 0) {
            z9 = false;
        } else {
            z9 = true;
        }
        CardView cardView = mainActivity.S;
        if (!z9) {
            i10 = 8;
        }
        cardView.setVisibility(i10);
    }

    public static Context x(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int min = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
        if (min > 0 && min >= 720) {
            float f8 = min;
            float max = Math.max(f8 / 1000.0f, Math.min(displayMetrics.density, f8 / 720.0f));
            if (Math.abs((max / displayMetrics.density) - 1.0f) >= 0.05f) {
                Configuration configuration = new Configuration(context.getResources().getConfiguration());
                configuration.densityDpi = Math.round(max * 160.0f);
                return context.createConfigurationContext(configuration);
            }
        }
        return context;
    }

    public static boolean y(PackageInstaller.Session session, File file, long[] jArr, long j10) {
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(file));
            try {
                byte[] bArr = new byte[1048576];
                while (true) {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry != null) {
                        if (!nextEntry.isDirectory() && nextEntry.getName().endsWith(h(new byte[]{120, -45, -23, 76}, new byte[]{86, -78, -103, 39, -39, -17, 125, -21}))) {
                            PackageInstaller.Session session2 = session;
                            OutputStream openWrite = session2.openWrite(new File(nextEntry.getName()).getName(), 0L, -1L);
                            while (true) {
                                try {
                                    int read = zipInputStream.read(bArr);
                                    if (read == -1) {
                                        break;
                                    }
                                    openWrite.write(bArr, 0, read);
                                    jArr[0] = jArr[0] + read;
                                } catch (Throwable th) {
                                    if (openWrite != null) {
                                        try {
                                            openWrite.close();
                                            throw th;
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                            throw th;
                                        }
                                    }
                                    throw th;
                                }
                            }
                            session2.fsync(openWrite);
                            if (openWrite != null) {
                                openWrite.close();
                            }
                            session = session2;
                        }
                    } else {
                        zipInputStream.close();
                        return true;
                    }
                }
            } finally {
            }
        } catch (Exception e6) {
            Log.e(h(new byte[]{-58, 51, 26, -27, 5, 107, -47}, new byte[]{-113, 125, 73, -79, 68, 39, -99, -16}), h(new byte[]{-28, -93, -61, -125, 99, -97, 18, 124, -37, -54, -11, -62, 125, -127, 30, 108}, new byte[]{-66, -22, -109, -93, 20, -19, 123, 8}), e6);
            return false;
        }
    }
}
