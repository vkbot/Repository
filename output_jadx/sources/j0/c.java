package j0;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.view.Display;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.example.navistart.cores.InterC;
import com.example.navistart.cores.Saa;
import com.google.protobuf.q;
import e0.d0;
import e0.d1;
import e0.j2;
import e0.m;
import e0.p3;
import e0.v;
import e0.w;
import e0.x1;
import i7.k;
import j1.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import org.json.JSONArray;
import org.json.JSONObject;
import w0.o0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c {
    public static final String c = m.h(new byte[]{84, 0, -7, -116, -17, -108, -84, -4, 119, 3, -63, -92, -55, -65, -85, -2, 102, 55, -40, -96, -43, -65, -78, -33, 102, 38, -48, -125, -44, -71, -120, -6, 98, 34, -12, -75, -53}, new byte[]{7, 80, -75, -59, -69, -53, -19, -116});
    public static final String d = m.h(new byte[]{-124, 95, 17, -61, -43, -83, 35, -19, -122, 89, 14, -63, -60, -101, 45, -32, -83, 64, 16, -46, -47, -127, 39}, new byte[]{-14, 48, 120, -96, -80, -14, 66, -114});
    public static final String e = m.h(new byte[]{-127, -31, -92, -47, -90, -7, -103, 122, -102, -29, -84, -36, -89, -43}, new byte[]{-9, -114, -51, -78, -61, -90, -6, 21});

    /* renamed from: a, reason: collision with root package name */
    public final Context f3090a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f3091b;

    public c(Context context) {
        w.b(1000L, m.h(new byte[]{-78, -4, 76, 80, 71, -55, 9, 121, -102, -20, 121, 84, 71, -55, 25, 116}, new byte[]{-1, -123, 15, 49, 53, -101, 108, 26}));
        this.f3090a = context;
        this.f3091b = new d0(context);
    }

    public static Boolean b() {
        StringBuilder sb = new StringBuilder();
        u0.a o5 = h0.b.o();
        byte[] bArr = m.f1973j;
        String[] strArr = p3.f2001a;
        q.s(bArr, o5, "", sb);
        q.r(new byte[]{108, 105, 99, 116, 95, 114, 105, 117, 101}, sb);
        String g10 = q.g(sb, x1.f2066q);
        u0.a o9 = h0.b.o();
        byte[] bArr2 = m.f1969f;
        if (q.w(bArr2, o9, "", g10)) {
            h0.b.a();
            boolean z9 = true;
            if (q.d(Long.MAX_VALUE, h0.b.a().j()) >= Long.parseLong(new String(q.x(new byte[]{26}, new byte[]{42, -36, 63, 40, 126, 46, -121, -120}, h0.b.o(), q.h(m.f1970g, h0.b.o(), new String(bArr2)), 0)))) {
                z9 = false;
            }
            return Boolean.valueOf(z9);
        }
        return Boolean.FALSE;
    }

    public static int c(e eVar, ArrayList arrayList) {
        if (eVar != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                e eVar2 = (e) arrayList.get(i10);
                d dVar = eVar2.f3094a;
                if (dVar == eVar.f3094a && ((dVar == d.f3092b && eVar2.f3095b == eVar.f3095b) || ((dVar == d.c && eVar2.c.equals(eVar.c)) || ((eVar2.f3094a == d.d && Objects.equals(eVar2.c, eVar.c) && Objects.equals(eVar2.d, eVar.d) && eVar2.f3097g == eVar.f3097g && eVar2.f3098h == eVar.f3098h) || (eVar2.f3094a == d.e && Objects.equals(eVar2.e, eVar.e)))))) {
                    return i10;
                }
            }
        }
        return 0;
    }

    public static String f() {
        return h0.b.o().loadString(d, "");
    }

    public static void l(String str, ArrayList arrayList) {
        JSONArray jSONArray = new JSONArray();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            o0 o0Var = (o0) obj;
            o0Var.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(m.h(new byte[]{23, -26, -10, 106, 60, -118}, new byte[]{103, -114, -124, 11, 79, -17, 82, -28}), o0Var.f6216a);
                jSONObject.put(m.h(new byte[]{74, 94, -106, 21, 81, -30, 33}, new byte[]{47, 48, -9, 119, Base64.padSymbol, -121, 69, 82}), o0Var.c);
                jSONObject.put(m.h(new byte[]{-89, 40, 104, -35, -31, 84, -101, -67, -90}, new byte[]{-54, 73, 28, -66, -119, 18, -18, -47}), o0Var.d);
                jSONObject.put(m.h(new byte[]{76, 54, -62, 28, -62, 14}, new byte[]{45, 85, -74, 117, -83, 96, 89, -71}), f.g(o0Var.f6217b));
            } catch (Exception e6) {
                e6.printStackTrace();
            }
            jSONArray.put(jSONObject);
        }
        h0.b.o().saveString(str, jSONArray.toString());
    }

    public final void a(String str) {
        ArrayList i10 = i(str);
        v b10 = w.b(h0.b.o().loadInt(m.h(new byte[]{69, 66, 45, -79, 111, -72, -106, -63, 90, 88, 49, -117, 81, -69, -125, -22, 67, 94, 45, -119, 125, -105, -94, -37, 123, 118, 26}, new byte[]{55, 55, 67, -18, 14, -56, -26, -98}), 1) * 1000, m.h(new byte[]{55, -5, 118, -80, 74, -114, -105, 120, 31, -21, 67, -76, 74, -114, -121, 117}, new byte[]{122, -126, 53, -47, 56, -36, -14, 27}));
        int size = i10.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = i10.get(i11);
            i11++;
            e eVar = ((o0) obj).f6217b;
            if (f.d(eVar) && b().booleanValue()) {
                b10.execute(new j2(10, this, eVar));
            }
        }
    }

    public final e d(String str) {
        o0 o0Var;
        e eVar;
        ArrayList i10 = i(e);
        String lowerCase = str.trim().toLowerCase();
        int size = i10.size();
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                Object obj = i10.get(i11);
                i11++;
                o0Var = (o0) obj;
                if (o0Var.c) {
                    String lowerCase2 = o0Var.f6216a.trim().toLowerCase();
                    if (o0Var.d) {
                        if (lowerCase.contains(lowerCase2)) {
                            break;
                        }
                    } else if (lowerCase.contains(lowerCase2)) {
                        break;
                    }
                }
            } else {
                o0Var = null;
                break;
            }
        }
        if (o0Var != null && (eVar = o0Var.f6217b) != null) {
            return eVar;
        }
        return e.c(n0.d.e, this.f3090a);
    }

    public final ArrayList e() {
        Context context;
        ArrayList arrayList = new ArrayList();
        n0.d[] dVarArr = (n0.d[]) ((Enum[]) Arrays.stream((Enum[]) n0.d.class.getEnumConstants()).filter(new k(1)).toArray(new a(0)));
        int length = dVarArr.length;
        int i10 = 0;
        while (true) {
            context = this.f3090a;
            if (i10 >= length) {
                break;
            }
            arrayList.add(e.c(dVarArr[i10], context));
            i10++;
        }
        arrayList.addAll(g());
        arrayList.addAll(h());
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(m.h(new byte[]{54, -32, -58, 91, ByteCompanionObject.MAX_VALUE, 0, 115, -77, 62, -32, -42, 76, 126, 29, 57, -4, 52, -6, -53, 70, 126, 71, 90, -36, 30, -64}, new byte[]{87, -114, -94, 41, 16, 105, 23, -99}), (Uri) null);
        intent.addCategory(m.h(new byte[]{68, 95, 70, -18, -55, -98, 59, -55, 76, 95, 86, -7, -56, -125, 113, -124, 68, 69, 71, -5, -55, -123, 38, -55, 105, 112, 119, -46, -27, -65, 26, -75}, new byte[]{37, 49, 34, -100, -90, -9, 95, -25}));
        Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 0).iterator();
        while (it.hasNext()) {
            arrayList.add(e.b(it.next(), packageManager));
        }
        return arrayList;
    }

    public final ArrayList g() {
        ArrayList arrayList = new ArrayList();
        try {
            h0.b.a();
            for (t tVar : h0.b.g().e()) {
                e d10 = e.d(tVar, this.f3090a);
                if (d10 != null) {
                    arrayList.add(d10);
                }
            }
            return arrayList;
        } catch (Exception e6) {
            e6.printStackTrace();
            return arrayList;
        }
    }

    public final ArrayList h() {
        ArrayList arrayList = new ArrayList();
        String loadString = h0.b.o().loadString(c, "");
        if (!loadString.isEmpty()) {
            for (String str : loadString.split(m.h(new byte[]{6}, new byte[]{Base64.padSymbol, -97, -94, 91, 20, 119, 53, -56}))) {
                e c10 = f.c(this.f3090a, str);
                if (c10.f3094a == d.d) {
                    arrayList.add(c10);
                }
            }
        }
        return arrayList;
    }

    public final ArrayList i(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(h0.b.o().loadString(str, m.h(new byte[]{-127, 85}, new byte[]{-38, 8, -58, 58, 34, -37, 76, 17})));
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                arrayList.add(o0.a(jSONArray.getJSONObject(i10), this.f3090a));
            }
            return arrayList;
        } catch (Exception e6) {
            e6.printStackTrace();
            return arrayList;
        }
    }

    public final void j(e eVar, Integer num) {
        int intValue;
        ActivityOptions activityOptions;
        if (eVar != null && eVar.f3094a != null && b().booleanValue()) {
            if (eVar.f3094a.equals(d.f3092b)) {
                n0.d dVar = eVar.f3095b;
                if (dVar != null) {
                    int i10 = dVar.d;
                    if (dVar != n0.d.e) {
                        d0 d0Var = this.f3091b;
                        if (num == null) {
                            d0Var.getClass();
                            h0.b.a();
                            d0Var.g(i10, h0.b.n().getGuDisplayID());
                            return;
                        }
                        d0Var.g(i10, num.intValue());
                        return;
                    }
                    return;
                }
                return;
            }
            boolean equals = eVar.f3094a.equals(d.c);
            Context context = this.f3090a;
            if (equals) {
                String str = eVar.c;
                if (num == null) {
                    h0.b.a();
                    intValue = h0.b.n().getGuDisplayID();
                } else {
                    intValue = num.intValue();
                }
                try {
                    Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
                    if (launchIntentForPackage != null) {
                        Display[] displays = ((DisplayManager) context.getApplicationContext().getSystemService(m.h(new byte[]{56, 102, 25, 33, -84, -39, -85}, new byte[]{92, 15, 106, 81, -64, -72, -46, ByteCompanionObject.MAX_VALUE}))).getDisplays();
                        if (intValue >= 0 && displays.length > intValue) {
                            if (Build.VERSION.SDK_INT >= 26) {
                                activityOptions = ActivityOptions.makeBasic().setLaunchDisplayId(displays[intValue].getDisplayId());
                            } else {
                                activityOptions = null;
                            }
                            launchIntentForPackage.addFlags(268435456);
                            Objects.requireNonNull(activityOptions, m.h(new byte[]{58, 3, 39, 57, -6, -109, 66, -101, 22, 18, Base64.padSymbol, 62, -6, -119, 17, -39, 16, 83, Base64.padSymbol, 37, -7, -111}, new byte[]{117, 115, 83, 80, -107, -3, 49, -69}));
                            y5.k.u(context, launchIntentForPackage, activityOptions.toBundle());
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Exception e6) {
                    e6.printStackTrace();
                    return;
                }
            }
            if (eVar.f3094a.equals(d.d)) {
                String str2 = eVar.c;
                String str3 = eVar.d;
                int i11 = eVar.f3097g;
                int i12 = eVar.f3098h;
                if (str2 != null && str3 != null) {
                    InterC j10 = h0.b.a().j();
                    int i13 = 2;
                    if (i11 != 2) {
                        i13 = 1;
                    }
                    j10.ssa(new Saa(str2, str3, i13, i12));
                    return;
                }
                return;
            }
            if (eVar.f3094a.equals(d.e)) {
                t tVar = eVar.f3096f;
                if (tVar == null && eVar.e != null) {
                    h0.b.a();
                    tVar = h0.b.g().g(eVar.e);
                }
                if (tVar != null && tVar.a() && tVar.a()) {
                    tVar.e.c(context);
                }
            }
        }
    }

    public final void k(String str) {
        j(f.b(this.f3090a, h0.b.o().loadString(str, m.h(new byte[]{12, 92, 79, -29, 86, -43, 95, -76, 54, 68, 91, -30, 25, -2}, new byte[]{105, 50, 58, -114, 108, -101, 48, -64}))), null);
    }

    public final void m(Spinner spinner, String str) {
        ArrayList e6 = e();
        spinner.setAdapter((SpinnerAdapter) new b(spinner.getContext(), e6));
        spinner.setSelection(c(f.e(this.f3090a, str), e6));
        spinner.setOnItemSelectedListener(new d1(1, this, str));
    }

    public final void n(Spinner spinner, e eVar) {
        ArrayList e6 = e();
        spinner.setAdapter((SpinnerAdapter) new b(spinner.getContext(), e6));
        spinner.setSelection(c(eVar, e6));
    }
}
