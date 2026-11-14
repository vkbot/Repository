package m0;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import androidx.recyclerview.widget.GridLayoutManager;
import com.example.navistart.DialogUni.Fragmenti.MaxHeightRecyclerView;
import com.example.navistart.R;
import e0.p3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.io.encoding.Base64;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class o extends l0.b {

    /* renamed from: g, reason: collision with root package name */
    public static final String f3819g = e0.m.h(new byte[]{-127, -121, -15, 4, -97, -127, 79, -98, -122, -123, -32, 48, -122, -123, 83, -98, -97, -124, -23, 56, -100, -77, 68, -103, -76, -110, -20, 22, -101, -112, 78}, new byte[]{-64, -9, -127, 87, -21, -32, Base64.padSymbol, -22});

    /* renamed from: h, reason: collision with root package name */
    public static final String f3820h = e0.m.h(new byte[]{93, -98, 89, -83, -63, -60, 21, -113, 90, -100, 72, -103, -40, -64, 9, -113, 67, -67, 72, -120, -48, -29, 8, -119, 121, -104, 76, -116, -12, -43, 23}, new byte[]{28, -18, 41, -2, -75, -91, 103, -5});

    /* renamed from: b, reason: collision with root package name */
    public MaxHeightRecyclerView f3821b;
    public n c;
    public final ArrayList d = new ArrayList();
    public int e = 0;

    /* renamed from: f, reason: collision with root package name */
    public Display[] f3822f;

    public static void t(o oVar, String str) {
        u0.a o5 = h0.b.o();
        String str2 = f3820h;
        String loadString = o5.loadString(str2, "");
        ArrayList arrayList = new ArrayList();
        if (!loadString.isEmpty()) {
            arrayList.addAll(Arrays.asList(loadString.split(e0.m.h(new byte[]{-42}, new byte[]{-19, 106, -96, 24, 46, 4, -29, 124}))));
        }
        arrayList.remove(str);
        arrayList.add(0, str);
        int size = arrayList.size();
        Collection collection = arrayList;
        if (size > 8) {
            collection = arrayList.subList(0, 8);
        }
        String h2 = e0.m.h(new byte[]{14}, new byte[]{53, 80, 70, 47, 102, -32, 105, -13});
        StringBuilder sb = new StringBuilder();
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                } else {
                    sb.append((CharSequence) h2);
                }
            }
        }
        h0.b.o().saveString(str2, sb.toString());
    }

    public static boolean w() {
        return h0.b.o().loadBoolean(e0.m.h(new byte[]{-74, 123, -80, 93, 41, -6, -45, -69, -79, 121, -95, 105, 48, -2, -49, -69, -88, 103, -81, 111, 57, -35, -50, -67, -110, 125, -91, 124, 28, -21, -47}, new byte[]{-9, 11, -64, 14, 93, -101, -95, -49}), true);
    }

    public static ArrayList x() {
        String loadString = h0.b.o().loadString(f3820h, "");
        ArrayList arrayList = new ArrayList();
        if (!loadString.isEmpty()) {
            for (String str : loadString.split(e0.m.h(new byte[]{-84}, new byte[]{-105, 86, 16, 24, -8, -126, 60, 10}))) {
                if (!str.isEmpty() && !arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final int i10 = 0;
        View inflate = layoutInflater.inflate(R.layout.fragment_apps, viewGroup, false);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.e = arguments.getInt(e0.m.h(new byte[]{42, 41, -76}, new byte[]{78, 64, -57, -72, -55, -15, 45, -52}), 0);
        }
        this.f3821b = (MaxHeightRecyclerView) inflate.findViewById(R.id.recyclerView);
        Switch r42 = (Switch) inflate.findViewById(R.id.switch24);
        r42.setChecked(w());
        r42.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: m0.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f3757b;

            {
                this.f3757b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
                int i11 = i10;
                o oVar = this.f3757b;
                switch (i11) {
                    case 0:
                        String str = o.f3819g;
                        h0.b.o().saveBoolean(e0.m.h(new byte[]{-83, -52, 123, -31, 51, 28, 55, -60, -86, -50, 106, -43, 42, 24, 43, -60, -77, -48, 100, -45, 35, 59, 42, -62, -119, -54, 110, -64, 6, 13, 53}, new byte[]{-20, -68, 11, -78, 71, 125, 69, -80}), z9);
                        oVar.v();
                        return;
                    default:
                        String str2 = o.f3819g;
                        h0.b.o().saveBoolean(o.f3819g, z9);
                        oVar.v();
                        return;
                }
            }
        });
        Switch r43 = (Switch) inflate.findViewById(R.id.showSystemApps);
        r43.setChecked(h0.b.o().loadBoolean(f3819g, false));
        final int i11 = 1;
        r43.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: m0.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f3757b;

            {
                this.f3757b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
                int i112 = i11;
                o oVar = this.f3757b;
                switch (i112) {
                    case 0:
                        String str = o.f3819g;
                        h0.b.o().saveBoolean(e0.m.h(new byte[]{-83, -52, 123, -31, 51, 28, 55, -60, -86, -50, 106, -43, 42, 24, 43, -60, -77, -48, 100, -45, 35, 59, 42, -62, -119, -54, 110, -64, 6, 13, 53}, new byte[]{-20, -68, 11, -78, 71, 125, 69, -80}), z9);
                        oVar.v();
                        return;
                    default:
                        String str2 = o.f3819g;
                        h0.b.o().saveBoolean(o.f3819g, z9);
                        oVar.v();
                        return;
                }
            }
        });
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        l0.a aVar;
        super.onPause();
        if (isAdded() && (aVar = (l0.a) getParentFragment()) != null) {
            aVar.dismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int i10;
        super.onStart();
        Display[] displays = ((DisplayManager) requireContext().getSystemService(e0.m.h(new byte[]{19, -102, 93, -55, 6, -116, 88}, new byte[]{119, -13, 46, -71, 106, -19, 33, 36}))).getDisplays();
        this.f3822f = displays;
        if (displays != null && (i10 = this.e) >= 0 && i10 < displays.length) {
            ((WindowManager) requireContext().createDisplayContext(this.f3822f[this.e]).getSystemService(e0.m.h(new byte[]{-24, -75, -73, 70, -63, -71}, new byte[]{-97, -36, -39, 34, -82, -50, -123, 123}))).getDefaultDisplay().getRealSize(new Point());
            int i11 = (int) (r1.x * 0.6d);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f3821b.getLayoutParams();
            layoutParams.width = i11;
            layoutParams.height = -2;
            Context requireContext = requireContext();
            float f8 = requireContext.getResources().getDisplayMetrics().density;
            this.f3821b.setLayoutManager(new GridLayoutManager(requireContext, 3));
            this.f3821b.setLayoutParams(layoutParams);
            this.f3821b.setMaxHeight((int) (r1.y * 0.7d));
            n nVar = new n(this);
            this.c = nVar;
            this.f3821b.setAdapter(nVar);
            v();
            this.f3821b.post(new j(this, f8, requireContext, 0));
        }
    }

    public final Boolean u() {
        StringBuilder sb = new StringBuilder();
        u0.a o5 = h0.b.o();
        byte[] bArr = e0.m.f1973j;
        String[] strArr = p3.f2001a;
        com.google.protobuf.q.s(bArr, o5, "", sb);
        com.google.protobuf.q.r(new byte[]{108, 105, 99, 116, 95, 114, 105, 117, 101}, sb);
        String g10 = com.google.protobuf.q.g(sb, e0.x1.f2066q);
        u0.a o9 = h0.b.o();
        byte[] bArr2 = e0.m.f1969f;
        if (com.google.protobuf.q.w(bArr2, o9, "", g10)) {
            h0.b.a();
            boolean z9 = true;
            if (com.google.protobuf.q.d(Long.MAX_VALUE, h0.b.a().j()) >= Long.parseLong(new String(com.google.protobuf.q.x(new byte[]{26}, new byte[]{42, 110, 42, -81, -89, -95, -127, -104}, h0.b.o(), com.google.protobuf.q.h(e0.m.f1970g, h0.b.o(), new String(bArr2)), 0)))) {
                z9 = false;
            }
            return Boolean.valueOf(z9);
        }
        return Boolean.FALSE;
    }

    public final void v() {
        boolean z9;
        PackageInfo packageInfo;
        boolean z10;
        PackageManager packageManager = requireContext().getPackageManager();
        List<ApplicationInfo> installedApplications = packageManager.getInstalledApplications(128);
        boolean loadBoolean = h0.b.o().loadBoolean(f3819g, false);
        ArrayList arrayList = this.d;
        arrayList.clear();
        if (w()) {
            ArrayList x9 = x();
            int size = x9.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = x9.get(i10);
                i10++;
                try {
                    packageInfo = requireContext().getPackageManager().getPackageInfo((String) obj, 0);
                } catch (PackageManager.NameNotFoundException unused) {
                    packageInfo = null;
                }
                if (packageInfo != null) {
                    if ((packageInfo.applicationInfo.flags & 1) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (loadBoolean || !z10) {
                        PackageManager packageManager2 = requireContext().getPackageManager();
                        arrayList.add(new l(packageManager2.getApplicationLabel(packageInfo.applicationInfo).toString(), packageInfo.packageName, packageManager2.getApplicationIcon(packageInfo.applicationInfo)));
                    }
                }
            }
        }
        for (ApplicationInfo applicationInfo : installedApplications) {
            if ((applicationInfo.flags & 1) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (loadBoolean || !z9) {
                if (packageManager.getLaunchIntentForPackage(applicationInfo.packageName) != null) {
                    arrayList.add(new l(packageManager.getApplicationLabel(applicationInfo).toString(), applicationInfo.packageName, packageManager.getApplicationIcon(applicationInfo)));
                }
            }
        }
        this.c.notifyDataSetChanged();
    }
}
