package m0;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.navistart.R;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import okhttp3.Request;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class i1 extends l0.b {

    /* renamed from: i, reason: collision with root package name */
    public static final String f3734i = e0.m.h(new byte[]{37, -122, -126, -107, -48, -122, -119, 92, 23, -109, -107, -116, -45, -68, -100, 65, 36, -109, -119, -114}, new byte[]{72, -25, -20, -4, -74, -29, -6, 40});

    /* renamed from: j, reason: collision with root package name */
    public static final String f3735j = e0.m.h(new byte[]{95, 113, 1, -96, 70, -54, -21, 38, 109, 100, 22, -71, 69, -36, -57, 52, 91, 124, 27, -84, 82}, new byte[]{50, 16, 111, -55, 32, -81, -104, 82});

    /* renamed from: k, reason: collision with root package name */
    public static final String f3736k = e0.m.h(new byte[]{-52, 18, -36, 119, 89, 99, 116, 73, -2, 26, -36, 109, 75, 103, 107, 81, -2, 7, -45, 108, 88, 99, 115}, new byte[]{-95, 115, -78, 30, 63, 6, 7, Base64.padSymbol});

    /* renamed from: l, reason: collision with root package name */
    public static final String f3737l = e0.m.h(new byte[]{-105, -122, 22, 123, 57}, new byte[]{-11, -22, 119, 24, 82, -18, 15, -80});

    /* renamed from: m, reason: collision with root package name */
    public static final String f3738m = e0.m.h(new byte[]{91, -72, 84, 88, -33}, new byte[]{57, -41, 53, 42, -69, -79, 74, -48});

    /* renamed from: n, reason: collision with root package name */
    public static final String f3739n = e0.m.h(new byte[]{30, -8, -95}, new byte[]{118, -115, -59, -115, 26, 102, -10, -118});

    /* renamed from: o, reason: collision with root package name */
    public static final String f3740o = e0.m.h(new byte[]{26, -88, -45, 104, 65, -61, 54, -8}, new byte[]{118, -55, -90, 6, 34, -85, 83, -118});

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f3741b;
    public TextView d;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final ArrayList e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f3742f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public String f3743g = "";

    /* renamed from: h, reason: collision with root package name */
    public final String f3744h = e0.m.h(new byte[]{124, 67, 64, -10, -88, -53, -94, -48, 102, 86, 67, -88, -68, -104, -7, -105, 97, 85, 65, -11, -66, -125, -18, -112, 122, 67, 81, -24, -81, -33, -18, -112, 121, 24, 126, -59, -70, -125, -39, -112, 123, 91, 71, -87, -72, -98, -1, -102, 75, 90, 85, -24, -78, -105, -24, -116, 96, 24, 70, -29, -67, -126, -94, -105, 113, 86, 80, -11, -12, -100, -20, -116, 96, 82, 70, -87, -74, -112, -29, -106, 114, 82, 71, -14, -11, -101, -2, -112, 122}, new byte[]{20, 55, 52, -122, -37, -15, -115, -1});

    public static boolean t(i1 i1Var, Context context, String str, String str2, File file) {
        b1.m mVar;
        String str3 = f3740o;
        if (str3.equals(str)) {
            mVar = new b1.m(context, e0.m.h(new byte[]{-124, 35, -49, 39, 106, 0, 60, 26, -93, 63, -5, 54, 68, 49, 59, 27, -86, 50, -3, 48}, new byte[]{-55, 90, -104, 66, 8, 80, 78, 117}), e0.m.h(new byte[]{22, 126, -50, 38, 70, -118, -36, 5, 5, 126, -54, 24, 95, -121, -35, 52, 17, 115, -51, 53}, new byte[]{114, 27, -88, 71, 51, -26, -88, 90}));
        } else {
            int hashCode = str2.hashCode();
            if (hashCode != 103671) {
                if (hashCode != 93818879) {
                    if (hashCode == 93908710 && str2.equals(f3738m)) {
                        mVar = new b1.m(context, e0.m.h(new byte[]{93, -105, -57, -101, 25, ByteCompanionObject.MIN_VALUE, -94, -55, 122, -117, -13, -118, 57, -65, -79, -44, 116}, new byte[]{16, -18, -112, -2, 123, -48, -48, -90}), e0.m.h(new byte[]{-119, -90, -85, 67, -125, -118, 81, 0, -101, -73, -106, 111, -111, -113, 80, 4, -118, -90, -83}, new byte[]{-2, -61, -55, 28, -12, -29, 53, 103}));
                    }
                    mVar = null;
                } else {
                    if (str2.equals(f3737l)) {
                        mVar = new b1.m(context, e0.m.h(new byte[]{96, 43, 50, 80, -124, 0, 2, 35, 71, 55, 6, 65, -92, 60, 17, 47, 70}, new byte[]{45, 82, 101, 53, -26, 80, 112, 76}), e0.m.h(new byte[]{6, 83, 105, 107, 13, -22, 73, -114, 33, 79, 93, 122, 45, -42, 90, -126, 32, 117, 109, 107, 27, -50, 82, -113, 44, 89, 97, 69, 10, -61}, new byte[]{75, 42, 62, 14, 111, -70, 59, -31}));
                    }
                    mVar = null;
                }
            } else {
                if (str2.equals(f3739n)) {
                    mVar = new b1.m(context, e0.m.h(new byte[]{108, -13, -53, 109, -9, 126, -84, 76, 75, -17, -1, 124, -35, 123, -102}, new byte[]{33, -118, -100, 8, -107, 46, -34, 35}), e0.m.h(new byte[]{126, -62, 29, -92, -39, -121, 30, 5, 89, -34, 41, -75, -13, -126, 40, 53, 96, -34, 62, -75, -46, -71, 11, 25, 108, -16, 47, -72}, new byte[]{51, -69, 74, -63, -69, -41, 108, 106}));
                }
                mVar = null;
            }
        }
        if (mVar != null) {
            try {
                String r = b1.u.r(file, (File) mVar.f305f, true);
                if (str3.equals(str)) {
                    h0.b.o().saveString(e0.m.h(new byte[]{-1, -114, -45, -114, -48, 85, 118, 108, -40, -110, -25, -97, -2, 100, 113, 109, -47, -97, -31, -103, -19, 86, 97, 119, -58, -98, -22, -116, -63, 90, 79, 102, -53}, new byte[]{-78, -9, -124, -21, -78, 5, 4, 3}), r);
                }
                return true;
            } catch (IOException unused) {
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r7v9, types: [m0.h1, java.lang.Object] */
    public static void u(i1 i1Var, String str, RecyclerView recyclerView) {
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray(e0.m.h(new byte[]{-112, 20, 81, -120, ByteCompanionObject.MIN_VALUE, 35, 28, -92}, new byte[]{-32, 102, 62, -30, -27, 64, 104, -41}));
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                if (jSONObject.optBoolean(e0.m.h(new byte[]{-37, 108, -73, 72, 11, -86}, new byte[]{-70, 15, -61, 33, 125, -49, 26, -103}), true)) {
                    ArrayList arrayList2 = new ArrayList();
                    JSONArray optJSONArray = jSONObject.optJSONArray(e0.m.h(new byte[]{-36, -83, -114, -6, 22}, new byte[]{-88, -44, -2, -97, 101, -122, 2, -94}));
                    if (optJSONArray != null) {
                        for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                            String optString = optJSONArray.optString(i11);
                            if (optString != null && !optString.trim().isEmpty()) {
                                arrayList2.add(optString.trim());
                            }
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        arrayList2.add(e0.m.h(new byte[]{-23, -109, -101, -75, 15, Base64.padSymbol, 26}, new byte[]{-100, -3, -16, -37, 96, 74, 116, 49}));
                    }
                    if (i1Var.f3742f.isEmpty() || i1Var.y(arrayList2) != null) {
                        ?? obj = new Object();
                        obj.f3712b = jSONObject.optString(e0.m.h(new byte[]{-111, 104, -42, -9, -64, 66, 11, -118, -100, 98, -53}, new byte[]{-11, 13, -91, -108, -78, 43, 123, -2}));
                        obj.f3711a = jSONObject.optBoolean(e0.m.h(new byte[]{28, 96, 2, 44, 21, -13}, new byte[]{125, 3, 118, 69, 99, -106, -19, -8}));
                        obj.e = jSONObject.optString(e0.m.h(new byte[]{54, -39, -36, -30, 20, 95}, new byte[]{87, -84, -88, -118, 123, 45, 19, -28}));
                        obj.f3713f = jSONObject.optString(e0.m.h(new byte[]{76, 25, 56, -33, -36, -80, -105}, new byte[]{58, 124, 74, -84, -75, -33, -7, -30}));
                        obj.f3715h = jSONObject.optString(e0.m.h(new byte[]{-73, -121, -93}, new byte[]{-51, -18, -45, 35, 13, -108, 96, 76}));
                        obj.c = jSONObject.optString(e0.m.h(new byte[]{66, 73, 39, -85}, new byte[]{44, 40, 74, -50, 123, 42, 75, -71}));
                        obj.f3714g = jSONObject.optString(e0.m.h(new byte[]{-67, -53, -21, 113, 63, -119, -92}, new byte[]{-51, -71, -114, 7, 86, -20, -45, -42}));
                        String y9 = i1Var.y(arrayList2);
                        obj.d = y9;
                        if (y9 == null) {
                            obj.d = (String) arrayList2.get(0);
                        }
                        if (obj.f3711a) {
                            arrayList.add(obj);
                        }
                    }
                }
            }
            i1Var.z(recyclerView, new e0.j2(18, i1Var, arrayList));
        } catch (Exception e) {
            Log.e(e0.m.h(new byte[]{-115, 94, 100, 74, 62, 75, -61, 55}, new byte[]{-64, 63, 10, 35, 88, 46, -80, 67}), e0.m.h(new byte[]{-1, 32, -49, -95, 45, 71, -116, -7, Base64.padSymbol, -93, 56, 63, -68, 71, -120, -8, 5}, new byte[]{-75, 115, ByteCompanionObject.MIN_VALUE, -17, 13, -105, 50, 40}), e);
        }
    }

    public static void v(i1 i1Var, int i10) {
        RecyclerView recyclerView = i1Var.f3741b;
        if (recyclerView != null && recyclerView.getAdapter() != null && i10 >= 0 && i10 < i1Var.f3741b.getAdapter().getItemCount()) {
            i1Var.f3741b.getAdapter().notifyItemChanged(i10);
        }
    }

    public static Bundle x(String... strArr) {
        Bundle bundle = new Bundle();
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : strArr) {
            if (str != null && !str.trim().isEmpty()) {
                arrayList.add(str.trim());
            }
        }
        if (!arrayList.isEmpty()) {
            bundle.putStringArrayList(f3735j, arrayList);
        }
        return bundle;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String h2;
        int i10 = 0;
        View inflate = layoutInflater.inflate(R.layout.fragment_manifest, viewGroup, false);
        this.f3741b = (RecyclerView) inflate.findViewById(R.id.recyclerView);
        this.d = (TextView) inflate.findViewById(R.id.manifestTitle);
        this.f3741b.setLayoutManager(new LinearLayoutManager(requireContext()));
        this.f3742f.clear();
        String str = "";
        this.f3743g = "";
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString(f3736k);
            if (string != null) {
                str = string.trim().toLowerCase(Locale.US);
            }
            this.f3743g = str;
            w(arguments.getString(f3734i));
            Object obj = arguments.get(f3735j);
            if (obj instanceof String[]) {
                String[] strArr = (String[]) obj;
                int length = strArr.length;
                while (i10 < length) {
                    w(strArr[i10]);
                    i10++;
                }
            } else if (obj instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    if (obj2 instanceof String) {
                        w((String) obj2);
                    }
                }
            } else if (obj instanceof String) {
                w((String) obj);
            }
        }
        TextView textView = this.d;
        if (f3740o.equals(this.f3743g)) {
            h2 = e0.m.h(new byte[]{51, 52, -69, 114, -50, -122, -16, 58, 51, 21, -69, 124, -49, -73, 0, 91, 97, 126, -34, 18, -93, 36, -16, 49, 51, 30, -70, 65, -49, -71, -15, 13, 51, 27, -70, 66, -49, -76}, new byte[]{-29, -82, 107, -62, 31, 4, 32, -118});
        } else {
            h2 = e0.m.h(new byte[]{84, -38, 96, -102, -121, -61, 94, -96, 84, -5, 96, -108, -122, -14, -82, -64, 58, -111, 52, -6, -24, -112, 14, -64, 56, -112, 11, -6, -29, -111, 51, -64, 60, -111, 63}, new byte[]{-124, 64, -80, 42, 86, 65, -114, 16});
        }
        textView.setText(h2);
        RecyclerView recyclerView = this.f3741b;
        Context applicationContext = requireContext().getApplicationContext();
        String string2 = getString(R.string.wifi_error);
        Request build = new Request.Builder().url(this.f3744h).build();
        h0.b.a();
        h0.b.m().newCall(build).enqueue(new b1.m(this, recyclerView, applicationContext, string2));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f3741b = null;
        this.d = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ((WindowManager) requireContext().getSystemService(e0.m.h(new byte[]{110, -63, 54, -121, ByteCompanionObject.MIN_VALUE, 67}, new byte[]{25, -88, 88, -29, -17, 52, 111, 41}))).getDefaultDisplay().getRealSize(new Point());
        int i10 = (int) (r1.x * 0.6d);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f3741b.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = -2;
        final Context requireContext = requireContext();
        final float f8 = requireContext.getResources().getDisplayMetrics().density;
        this.f3741b.setLayoutManager(new GridLayoutManager(requireContext, 3));
        this.f3741b.setLayoutParams(layoutParams);
        final RecyclerView recyclerView = this.f3741b;
        recyclerView.post(new Runnable() { // from class: m0.a1
            @Override // java.lang.Runnable
            public final void run() {
                i1 i1Var = i1.this;
                RecyclerView recyclerView2 = i1Var.f3741b;
                RecyclerView recyclerView3 = recyclerView;
                if (recyclerView2 == recyclerView3 && i1Var.isAdded()) {
                    recyclerView3.setLayoutManager(new GridLayoutManager(requireContext, Math.max(1, recyclerView3.getWidth() / ((int) (f8 * 220.0f)))));
                }
            }
        });
    }

    public final void w(String str) {
        String lowerCase;
        if (str == null) {
            lowerCase = "";
        } else {
            lowerCase = str.trim().toLowerCase(Locale.US);
        }
        if (!lowerCase.isEmpty()) {
            this.f3742f.add(lowerCase);
        }
    }

    public final String y(ArrayList arrayList) {
        String lowerCase;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            String str = (String) obj;
            if (str == null) {
                lowerCase = "";
            } else {
                lowerCase = str.trim().toLowerCase(Locale.US);
            }
            if (this.f3742f.contains(lowerCase)) {
                return str;
            }
        }
        return null;
    }

    public final void z(RecyclerView recyclerView, Runnable runnable) {
        this.c.post(new b1.n(this, recyclerView, runnable, 8));
    }
}
