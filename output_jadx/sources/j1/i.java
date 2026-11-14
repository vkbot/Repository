package j1;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Base64;
import com.example.navistart.W;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.io.InvalidObjectException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import org.apache.commons.io.FilenameUtils;
import org.json.JSONObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements u, k2.f, t4.c {

    /* renamed from: b */
    public final /* synthetic */ int f3168b;

    public /* synthetic */ i(int i10) {
        this.f3168b = i10;
    }

    public static /* synthetic */ void b(int i10, String str) {
        throw new InvalidObjectException(str + i10 + FilenameUtils.EXTENSION_SEPARATOR);
    }

    public static /* synthetic */ void d(int i10, String str, Object obj, Object obj2) {
        throw new IllegalArgumentException((str + obj + obj2 + i10).toString());
    }

    public static /* synthetic */ void e(Object obj) {
        throw new AssertionError(obj);
    }

    public static /* synthetic */ void f(Object obj, String str) {
        throw new IllegalArgumentException(str + obj + FilenameUtils.EXTENSION_SEPARATOR);
    }

    public static /* synthetic */ void g(String str) {
        throw new NoSuchElementException(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void h(String str, int i10, int i11, int i12, Object obj) {
        throw new IllegalArgumentException(str + i10 + obj + i11 + ((char) i12));
    }

    public static /* synthetic */ void i(StringBuilder sb, int i10) {
        sb.append(i10);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void j(StringBuilder sb, Object obj) {
        sb.append(" is less than minimum ");
        sb.append(obj);
        sb.append(FilenameUtils.EXTENSION_SEPARATOR);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void k(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void l(String str) {
        throw new IllegalStateException(str);
    }

    @Override // t4.c
    public Object a(d2.h hVar) {
        l5.e lambda$getComponents$0;
        lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(hVar);
        return lambda$getComponents$0;
    }

    @Override // k2.f
    public Object apply(Object obj) {
        byte[] decode;
        Cursor cursor = (Cursor) obj;
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            String string = cursor.getString(1);
            if (string != null) {
                a2.b b10 = n2.a.b(cursor.getInt(2));
                String string2 = cursor.getString(3);
                if (string2 == null) {
                    decode = null;
                } else {
                    decode = Base64.decode(string2, 0);
                }
                arrayList.add(new d2.j(string, decode, b10));
            } else {
                n0.b.n("Null backendName");
                return null;
            }
        }
        return arrayList;
    }

    @Override // j1.u
    public void c(Context context) {
        String h2;
        switch (this.f3168b) {
            case 0:
                k.i(1, 0);
                return;
            case 1:
                k.i(1, 10);
                return;
            case 2:
                k.i(2, 100);
                return;
            case 3:
                k.i(2, 0);
                return;
            case 4:
                k.i(2, 10);
                return;
            case 5:
                k.i(3, 100);
                return;
            case 6:
                k.i(3, 0);
                return;
            case 7:
                k.i(3, 10);
                return;
            case 8:
                k.i(4, 100);
                return;
            case 9:
                k.i(4, 0);
                return;
            case 10:
                k.i(4, 10);
                return;
            case 11:
                k.i(0, 100);
                return;
            case 12:
                k.i(0, 0);
                return;
            case 13:
                k.i(0, 10);
                return;
            case 14:
                Bundle bundle = new Bundle();
                String h10 = e0.m.h(new byte[]{51, -92, 20}, new byte[]{87, -51, 103, -108, -92, 6, -92, -109});
                h0.b.a();
                bundle.putInt(h10, h0.b.n().getGuDisplayID());
                W.t(context, f1.e.class, bundle);
                return;
            case 15:
                u0.a o5 = h0.b.o();
                String str = o.e;
                boolean loadBoolean = o5.loadBoolean(str, false);
                boolean z9 = !loadBoolean;
                try {
                    JSONObject jSONObject = new JSONObject();
                    String h11 = e0.m.h(new byte[]{40, 48, -85}, new byte[]{75, 93, -49, 21, -90, -83, -74, -81});
                    if (!loadBoolean) {
                        h2 = e0.m.h(new byte[]{-9, 37, -122, kotlin.io.encoding.Base64.padSymbol, 36, 47, 95, 46, -30, 34, -115, 3, 48, 42, 93, 31, -10, 56, -127, 57}, new byte[]{-109, 76, -11, 92, 70, 67, 58, 113});
                    } else {
                        h2 = e0.m.h(new byte[]{-78, 122, 37, 68, -26, 83, -109, -51, -71, 108, 27, 80, -29, 81, -94, -39, -93, 96, 33}, new byte[]{-41, 20, 68, 38, -118, 54, -52, -68});
                    }
                    jSONObject.put(h11, h2);
                    h0.b.a();
                    JSONObject c = h0.b.d().c(jSONObject);
                    if (c != null && c.optBoolean(e0.m.h(new byte[]{100, 91, 77, -4, -61, 102, 72}, new byte[]{23, 46, 46, -97, -90, 21, 59, -51}), false)) {
                        h0.b.o().saveBoolean(str, z9);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 16:
                if (q.n()) {
                    W.t(context, f1.e.class, null);
                    return;
                }
                return;
            default:
                if (s.l()) {
                    W.t(context, f1.e.class, null);
                    return;
                }
                return;
        }
    }
}
