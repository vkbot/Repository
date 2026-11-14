package m0;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.navistart.R;
import com.woha.appmanag.ManageAppsActivity;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import kotlin.jvm.internal.ByteCompanionObject;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class v extends l0.b {

    /* renamed from: h, reason: collision with root package name */
    public static final String f3873h = e0.m.h(new byte[]{11, -48, -105, 25, 86, -104, -23, 7, 2, -62, -116, 22}, new byte[]{104, -79, -29, 120, 58, -9, -114, 88});

    /* renamed from: i, reason: collision with root package name */
    public static final String f3874i = e0.m.h(new byte[]{57, 114, ByteCompanionObject.MIN_VALUE, -75, 81, 0, -45, 65, 62, 112, -111, -127, 72, 10, -49, 80, 39, 65, -111, -110, 68, 3, -50, 67, 59, 99, -109, -114, 64}, new byte[]{120, 2, -16, -26, 37, 111, -95, 36});

    /* renamed from: j, reason: collision with root package name */
    public static final String f3875j = e0.m.h(new byte[]{36, -112, 125}, new byte[]{82, -95, 71, 89, -17, 37, 16, 45});

    /* renamed from: k, reason: collision with root package name */
    public static final byte[] f3876k = {74, 67, 84, 95, 65, 80, 80, 95, 83, 84, 79, 82, 69};

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3877b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public RecyclerView d;
    public t e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f3878f;

    /* renamed from: g, reason: collision with root package name */
    public TextView f3879g;

    public static String A(String str) {
        if (str == null) {
            return "";
        }
        return str.trim().toLowerCase(Locale.ROOT);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [m0.u, java.lang.Object] */
    public static ArrayList B(String str) {
        JSONArray jSONArray;
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            try {
                Object nextValue = new JSONTokener(str).nextValue();
                if (nextValue instanceof JSONArray) {
                    jSONArray = (JSONArray) nextValue;
                } else if (nextValue instanceof JSONObject) {
                    jSONArray = ((JSONObject) nextValue).optJSONArray(e0.m.h(new byte[]{103, -40, 119, 73}, new byte[]{6, -88, 7, 58, 64, -17, -97, -70}));
                } else {
                    jSONArray = null;
                }
                if (jSONArray != null) {
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                        if (optJSONObject != null) {
                            ?? obj = new Object();
                            obj.f3862a = optJSONObject.optString(e0.m.h(new byte[]{-9, 10, -67, -31}, new byte[]{-103, 107, -48, -124, 39, 106, 38, 98}));
                            obj.f3863b = optJSONObject.optString(e0.m.h(new byte[]{-53, -117, -112, 47, 88, -98, 113, 77, -38, -121, -106}, new byte[]{-69, -22, -13, 68, 57, -7, 20, 3}));
                            obj.c = optJSONObject.optString(e0.m.h(new byte[]{-34, -63, 92, -31, 65, -66}, new byte[]{-65, -79, 55, -76, 51, -46, -103, -12}));
                            obj.d = optJSONObject.optString(e0.m.h(new byte[]{8, -111, 64, -35, 27, -22}, new byte[]{123, -2, 53, -81, 120, -113, -6, 10}));
                            obj.e = optJSONObject.optString(e0.m.h(new byte[]{-127, 82, -110, 34, -77, 75, -100}, new byte[]{-9, 55, -32, 81, -38, 36, -14, 18}));
                            if (!TextUtils.isEmpty(obj.f3862a) && !TextUtils.isEmpty(obj.c)) {
                                arrayList.add(obj);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    public static void t(v vVar, u uVar) {
        Intent launchIntentForPackage;
        if (!TextUtils.isEmpty(uVar.f3863b) && (launchIntentForPackage = vVar.requireContext().getPackageManager().getLaunchIntentForPackage(uVar.f3863b)) != null) {
            y5.k.u(vVar.requireContext(), launchIntentForPackage, null);
        }
    }

    public static String w(String str) {
        if (!TextUtils.isEmpty(str)) {
            String str2 = f3875j;
            if (str.startsWith(str2)) {
                try {
                    byte[] decode = Base64.decode(str.substring(str2.length()), 2);
                    byte[] bArr = f3876k;
                    for (int i10 = 0; i10 < decode.length; i10++) {
                        decode[i10] = (byte) (decode[i10] ^ bArr[i10 % bArr.length]);
                    }
                    return new String(decode, StandardCharsets.UTF_8);
                } catch (Exception unused) {
                    return "";
                }
            }
            return "";
        }
        return "";
    }

    public static String x(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        for (int i10 = 0; i10 < bytes.length; i10++) {
            byte b10 = bytes[i10];
            byte[] bArr = f3876k;
            bytes[i10] = (byte) (b10 ^ bArr[i10 % bArr.length]);
        }
        return f3875j + Base64.encodeToString(bytes, 2);
    }

    public static String z() {
        String str;
        String loadString;
        String w;
        try {
            u0.a o5 = h0.b.o();
            str = f3874i;
            loadString = o5.loadString(str, "");
            w = w(loadString);
        } catch (Exception unused) {
        }
        if (!TextUtils.isEmpty(w)) {
            return w;
        }
        if (!B(loadString).isEmpty()) {
            if (!TextUtils.isEmpty(loadString)) {
                try {
                    h0.b.o().saveString(str, x(loadString));
                } catch (Exception unused2) {
                }
            }
            return loadString;
        }
        return "";
    }

    public final void C() {
        String obj;
        PackageManager packageManager = requireContext().getPackageManager();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f3877b;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            u uVar = (u) obj2;
            if (uVar.f3867i) {
                y(uVar, packageManager);
                arrayList.add(uVar);
            }
        }
        u(arrayList, packageManager);
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        EditText editText = this.f3878f;
        if (editText == null) {
            obj = "";
        } else {
            obj = editText.getText().toString();
        }
        v(obj);
    }

    public final void D(ArrayList arrayList) {
        String obj;
        PackageManager packageManager = requireContext().getPackageManager();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            u uVar = (u) obj2;
            uVar.f3867i = true;
            y(uVar, packageManager);
            arrayList2.add(uVar);
        }
        u(arrayList2, packageManager);
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f3877b;
        if (isEmpty) {
            arrayList3.clear();
            this.c.clear();
            this.e.notifyDataSetChanged();
            this.d.setVisibility(8);
            TextView textView = this.f3879g;
            if (textView != null) {
                textView.setVisibility(0);
            }
            y5.k.x(requireContext(), getString(R.string.app_store_catalog_unavailable));
            return;
        }
        this.d.setVisibility(0);
        TextView textView2 = this.f3879g;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        EditText editText = this.f3878f;
        if (editText == null) {
            obj = "";
        } else {
            obj = editText.getText().toString();
        }
        v(obj);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        final int i10 = 0;
        View inflate = layoutInflater.cloneInContext(new ContextThemeWrapper(e0.m.x(requireContext()), R.style.Theme_JCarTools_Modern)).inflate(R.layout.fragment_app_store, viewGroup, false);
        Button button = (Button) inflate.findViewById(R.id.storeBackButton);
        this.f3878f = (EditText) inflate.findViewById(R.id.storeSearchInput);
        this.d = (RecyclerView) inflate.findViewById(R.id.recyclerView);
        this.f3879g = (TextView) inflate.findViewById(R.id.storeCatalogStatus);
        final int i11 = 1;
        this.d.setLayoutManager(new GridLayoutManager(requireContext(), 1));
        t tVar = new t(this);
        this.e = tVar;
        this.d.setAdapter(tVar);
        button.setOnClickListener(new View.OnClickListener(this) { // from class: m0.p
            public final /* synthetic */ v c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = i10;
                v vVar = this.c;
                switch (i12) {
                    case 0:
                        String str2 = v.f3873h;
                        Fragment parentFragment = vVar.getParentFragment();
                        if (parentFragment instanceof l0.a) {
                            ((l0.a) parentFragment).dismiss();
                            return;
                        }
                        FragmentActivity activity = vVar.getActivity();
                        if (activity != null) {
                            activity.finish();
                            return;
                        }
                        return;
                    default:
                        String str3 = v.f3873h;
                        y5.k.u(vVar.requireActivity(), new Intent(vVar.requireActivity(), (Class<?>) ManageAppsActivity.class), null);
                        return;
                }
            }
        });
        inflate.findViewById(R.id.storeManageAppsButton).setOnClickListener(new View.OnClickListener(this) { // from class: m0.p
            public final /* synthetic */ v c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = i11;
                v vVar = this.c;
                switch (i12) {
                    case 0:
                        String str2 = v.f3873h;
                        Fragment parentFragment = vVar.getParentFragment();
                        if (parentFragment instanceof l0.a) {
                            ((l0.a) parentFragment).dismiss();
                            return;
                        }
                        FragmentActivity activity = vVar.getActivity();
                        if (activity != null) {
                            activity.finish();
                            return;
                        }
                        return;
                    default:
                        String str3 = v.f3873h;
                        y5.k.u(vVar.requireActivity(), new Intent(vVar.requireActivity(), (Class<?>) ManageAppsActivity.class), null);
                        return;
                }
            }
        });
        this.f3878f.addTextChangedListener(new e0.a1(i11, this));
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString(f3873h);
        } else {
            str = null;
        }
        ArrayList B = B(str);
        if (B.isEmpty()) {
            e0.w.c(-1, e0.m.h(new byte[]{-64, 14, -88, -41, -17, -57, -91, -70, -57, 12, -71, -29, -10, -51, -71, -85}, new byte[]{-127, 126, -40, -124, -101, -88, -41, -33})).execute(new q(this, i10));
            return inflate;
        }
        D(B);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.e != null && !this.f3877b.isEmpty()) {
            C();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ((WindowManager) requireContext().getSystemService(e0.m.h(new byte[]{-110, -65, 54, 20, -122, 65}, new byte[]{-27, -42, 88, 112, -23, 54, 114, 39}))).getDefaultDisplay().getRealSize(new Point());
        int i10 = (int) (r1.x * 0.47d);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = (int) (r1.y * 0.75d);
        layoutParams.gravity = 1;
        this.d.setLayoutParams(layoutParams);
        this.d.post(new i7.f(this, this.d.getContext().getResources().getDisplayMetrics().density, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v9, types: [m0.u, java.lang.Object] */
    public final void u(ArrayList arrayList, PackageManager packageManager) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            u uVar = (u) obj;
            String A = A(uVar.f3863b);
            String A2 = A(uVar.f3862a);
            if (!A.isEmpty()) {
                hashSet.add(A);
            }
            if (!A2.isEmpty()) {
                hashSet2.add(A2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Intent intent = new Intent(e0.m.h(new byte[]{124, -32, -67, 111, -40, 35, 50, -69, 116, -32, -83, 120, -39, 62, 120, -12, 126, -6, -80, 114, -39, 100, 27, -44, 84, -64}, new byte[]{29, -114, -39, 29, -73, 74, 86, -107}), (Uri) null);
        intent.addCategory(e0.m.h(new byte[]{119, -20, -76, 102, -95, -74, 49, -24, ByteCompanionObject.MAX_VALUE, -20, -92, 113, -96, -85, 123, -91, 119, -10, -75, 115, -95, -83, 44, -24, 90, -61, -123, 90, -115, -105, 16, -108}, new byte[]{22, -126, -48, 20, -50, -33, 85, -58}));
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 0)) {
            ApplicationInfo applicationInfo = resolveInfo.activityInfo.applicationInfo;
            String str = applicationInfo.packageName;
            String A3 = A(str);
            String charSequence = resolveInfo.loadLabel(packageManager).toString();
            String A4 = A(charSequence);
            if (!requireContext().getPackageName().equals(str) && (applicationInfo.flags & 1) == 0 && !hashSet.contains(A3) && !hashSet2.contains(A4)) {
                hashSet.add(A3);
                hashSet2.add(A4);
                ?? obj2 = new Object();
                obj2.f3862a = charSequence;
                obj2.f3863b = str;
                obj2.f3867i = false;
                y(obj2, packageManager);
                arrayList2.add(obj2);
            }
        }
        arrayList2.sort(new androidx.constraintlayout.core.utils.a(8));
        arrayList.addAll(arrayList2);
    }

    public final void v(String str) {
        String lowerCase;
        String lowerCase2;
        String lowerCase3;
        if (str == null) {
            lowerCase = "";
        } else {
            lowerCase = str.trim().toLowerCase(Locale.ROOT);
        }
        ArrayList arrayList = this.c;
        arrayList.clear();
        boolean isEmpty = lowerCase.isEmpty();
        ArrayList arrayList2 = this.f3877b;
        if (isEmpty) {
            arrayList.addAll(arrayList2);
        } else {
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                u uVar = (u) obj;
                String str2 = uVar.f3862a;
                if (str2 == null) {
                    lowerCase2 = "";
                } else {
                    lowerCase2 = str2.toLowerCase(Locale.ROOT);
                }
                String str3 = uVar.f3863b;
                if (str3 == null) {
                    lowerCase3 = "";
                } else {
                    lowerCase3 = str3.toLowerCase(Locale.ROOT);
                }
                if (lowerCase2.contains(lowerCase) || lowerCase3.contains(lowerCase)) {
                    arrayList.add(uVar);
                }
            }
        }
        this.e.notifyDataSetChanged();
    }

    public final void y(u uVar, PackageManager packageManager) {
        uVar.f3864f = false;
        String str = "";
        uVar.f3865g = "";
        uVar.f3866h = ContextCompat.getDrawable(requireContext(), R.drawable.ic_download);
        if (!TextUtils.isEmpty(uVar.f3863b)) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(uVar.f3863b, 0);
                uVar.f3864f = true;
                String str2 = packageInfo.versionName;
                if (str2 != null) {
                    str = str2;
                }
                uVar.f3865g = str;
                uVar.f3866h = packageManager.getApplicationIcon(packageInfo.applicationInfo);
            } catch (Exception unused) {
            }
        }
    }
}
