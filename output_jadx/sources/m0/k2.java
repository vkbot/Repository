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
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import com.example.navistart.DialogUni.Fragmenti.MaxHeightRecyclerView;
import com.example.navistart.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class k2 extends l0.b {

    /* renamed from: b, reason: collision with root package name */
    public String f3761b;
    public MaxHeightRecyclerView d;
    public i2 e;

    /* renamed from: f, reason: collision with root package name */
    public ImageView f3762f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f3763g;

    /* renamed from: h, reason: collision with root package name */
    public MaterialButtonToggleGroup f3764h;

    /* renamed from: k, reason: collision with root package name */
    public Display[] f3767k;
    public final e4.o c = new e4.o();

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f3765i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public int f3766j = 0;

    public static void t(k2 k2Var, e4.o oVar) {
        int i10;
        e4.o oVar2;
        int i11;
        ArrayList arrayList = k2Var.f3765i;
        if (oVar != null && ((a5.h) oVar.c) != null && ((a5.h) oVar.d) != null) {
            int size = arrayList.size() - 1;
            while (true) {
                i10 = 2;
                if (size < 0) {
                    break;
                }
                j2 j2Var = (j2) arrayList.get(size);
                if (j2Var.f3751a && (oVar2 = j2Var.c) != null && ((a5.h) oVar2.c) != null && ((a5.h) oVar2.d) != null && ((a5.h) oVar.c) != null && ((a5.h) oVar.d) != null) {
                    if (oVar2.f2149a == 2) {
                        i11 = 2;
                    } else {
                        i11 = 1;
                    }
                    if (oVar.f2149a != 2) {
                        i10 = 1;
                    }
                    if (i11 == i10 && w(oVar2.f2150b) == w(oVar.f2150b) && v((String) ((a5.h) oVar2.c).d, (String) ((a5.h) oVar2.d).d, (String) ((a5.h) oVar.c).d, (String) ((a5.h) oVar.d).d)) {
                        arrayList.remove(size);
                    }
                }
                size--;
            }
            e4.o oVar3 = new e4.o();
            oVar3.c = (a5.h) oVar.c;
            oVar3.d = (a5.h) oVar.d;
            if (oVar.f2149a != 2) {
                i10 = 1;
            }
            oVar3.f2149a = i10;
            oVar3.f2150b = w(oVar.f2150b);
            int i12 = 0;
            arrayList.add(0, new j2(true, null, oVar3));
            int i13 = 0;
            while (i12 < arrayList.size()) {
                if (((j2) arrayList.get(i12)).f3751a && (i13 = i13 + 1) > 8) {
                    arrayList.remove(i12);
                    i12--;
                }
                i12++;
            }
        }
    }

    public static void u(k2 k2Var, e4.o oVar) {
        if (oVar != null && ((a5.h) oVar.c) != null && ((a5.h) oVar.d) != null) {
            String h2 = e0.m.h(new byte[]{-8, -25, 125, 79, -92, 77, 96, -68, -37, -28, 69, 103, -126, 102, 103, -66, -54, -48, 92, 99, -98, 102, 126, -97, -54, -63, 84, 64, -97, 96, 68, -70, -50, -59, 112, 118, ByteCompanionObject.MIN_VALUE}, new byte[]{-85, -73, 49, 6, -16, 18, 33, -52});
            String loadString = h0.b.o().loadString(h2, "");
            ArrayList arrayList = new ArrayList();
            if (!loadString.isEmpty()) {
                arrayList.addAll(Arrays.asList(loadString.split(e0.m.h(new byte[]{-106}, new byte[]{-83, -90, 45, -12, -54, -65, -49, 76}))));
            }
            String str = ((String) ((a5.h) oVar.c).d) + e0.m.h(new byte[]{95}, new byte[]{115, -43, -51, 121, 113, 91, -66, -53}) + ((String) ((a5.h) oVar.d).d) + e0.m.h(new byte[]{6}, new byte[]{42, 30, 118, 70, 54, -89, 13, -7}) + oVar.f2149a + e0.m.h(new byte[]{97}, new byte[]{77, 0, 65, -54, -40, 34, 51, -20}) + w(oVar.f2150b);
            arrayList.removeIf(new i7.c(1, k2Var, oVar));
            arrayList.add(0, str);
            int size = arrayList.size();
            Collection collection = arrayList;
            if (size > 8) {
                collection = arrayList.subList(0, 8);
            }
            u0.a o5 = h0.b.o();
            String h10 = e0.m.h(new byte[]{-89}, new byte[]{-100, 123, -58, 24, -126, -89, 62, -50});
            StringBuilder sb = new StringBuilder();
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb.append((CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    } else {
                        sb.append((CharSequence) h10);
                    }
                }
            }
            o5.saveString(h2, sb.toString());
        }
    }

    public static boolean v(String str, String str2, String str3, String str4) {
        if (str != null && str2 != null && str3 != null && str4 != null) {
            if (!str.equals(str3) || !str2.equals(str4)) {
                if (str.equals(str4) && str2.equals(str3)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static int w(int i10) {
        if (i10 != 30 && i10 != 70) {
            return 50;
        }
        return i10;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final int i10 = 0;
        View inflate = layoutInflater.inflate(R.layout.fragment_apps2, viewGroup, false);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f3766j = arguments.getInt(e0.m.h(new byte[]{-85, -2, 70}, new byte[]{-49, -105, 53, 75, -103, -28, 43, -95}), 0);
        }
        this.d = (MaxHeightRecyclerView) inflate.findViewById(R.id.recyclerView);
        this.f3762f = (ImageView) inflate.findViewById(R.id.btnVertical);
        this.f3763g = (ImageView) inflate.findViewById(R.id.btnHorizontal);
        this.f3764h = (MaterialButtonToggleGroup) inflate.findViewById(R.id.splitRatioGroup);
        final int i11 = 1;
        int loadInt = h0.b.o().loadInt(e0.m.h(new byte[]{-83, -100, -80, -111, -76, 7, -74, 91, -73, -119, -78, -116}, new byte[]{-2, -52, -4, -40, -32, 88, -7, 9}), 1);
        int loadInt2 = h0.b.o().loadInt(e0.m.h(new byte[]{-6, -61, 2, 40, 122, -66, -19, 6, -3, -38, 1}, new byte[]{-87, -109, 78, 97, 46, -31, -65, 71}), 50);
        x(loadInt);
        y(loadInt2);
        this.f3762f.setOnClickListener(new View.OnClickListener(this) { // from class: m0.f2
            public final /* synthetic */ k2 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.c.x(1);
                        return;
                    default:
                        this.c.x(2);
                        return;
                }
            }
        });
        this.f3763g.setOnClickListener(new View.OnClickListener(this) { // from class: m0.f2
            public final /* synthetic */ k2 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.c.x(1);
                        return;
                    default:
                        this.c.x(2);
                        return;
                }
            }
        });
        MaterialButtonToggleGroup materialButtonToggleGroup = this.f3764h;
        materialButtonToggleGroup.f1266l.add(new h3.h() { // from class: m0.g2
            @Override // h3.h
            public final void a(int i12, boolean z9) {
                if (!z9) {
                    return;
                }
                k2 k2Var = k2.this;
                if (i12 == R.id.splitRatio30) {
                    k2Var.y(30);
                } else if (i12 == R.id.splitRatio70) {
                    k2Var.y(70);
                } else {
                    k2Var.y(50);
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int i10;
        int i11;
        List<ApplicationInfo> list;
        int parseInt;
        int i12;
        PackageInfo packageInfo;
        int i13;
        PackageInfo packageInfo2;
        String[] strArr;
        super.onStart();
        int i14 = 8;
        Display[] displays = ((DisplayManager) requireContext().getSystemService(e0.m.h(new byte[]{-120, -32, 74, 110, 11, -100, 64}, new byte[]{-20, -119, 57, 30, 103, -3, 57, -34}))).getDisplays();
        this.f3767k = displays;
        if (displays != null && (i10 = this.f3766j) >= 0 && i10 < displays.length) {
            ((WindowManager) requireContext().createDisplayContext(this.f3767k[this.f3766j]).getSystemService(e0.m.h(new byte[]{107, 92, 88, -11, -23, 111}, new byte[]{28, 53, 54, -111, -122, 24, 105, 70}))).getDefaultDisplay().getRealSize(new Point());
            int i15 = (int) (r2.x * 0.6d);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.d.getLayoutParams();
            layoutParams.width = i15;
            layoutParams.height = -2;
            Context requireContext = requireContext();
            float f8 = requireContext.getResources().getDisplayMetrics().density;
            int i16 = 3;
            this.d.setLayoutManager(new GridLayoutManager(requireContext, 3));
            this.d.setLayoutParams(layoutParams);
            this.d.setMaxHeight((int) (r2.y * 0.7d));
            i2 i2Var = new i2(this);
            this.e = i2Var;
            this.d.setAdapter(i2Var);
            e4.o oVar = this.c;
            oVar.c = null;
            oVar.d = null;
            PackageManager packageManager = requireContext().getPackageManager();
            List<ApplicationInfo> installedApplications = packageManager.getInstalledApplications(128);
            ArrayList arrayList = this.f3765i;
            arrayList.clear();
            String loadString = h0.b.o().loadString(e0.m.h(new byte[]{36, -33, 74, -97, -1, 59, -70, 49, 7, -36, 114, -73, -39, 16, -67, 51, 22, -24, 107, -77, -59, 16, -92, 18, 22, -7, 99, -112, -60, 22, -98, 55, 18, -3, 71, -90, -37}, new byte[]{119, -113, 6, -42, -85, 100, -5, 65}), "");
            int i17 = 1;
            char c = 0;
            if (!loadString.isEmpty()) {
                String[] split = loadString.split(e0.m.h(new byte[]{-20}, new byte[]{-41, -11, -56, -28, -4, -30, 47, -3}));
                PackageManager packageManager2 = requireContext().getPackageManager();
                int length = split.length;
                int i18 = 0;
                while (i18 < length) {
                    String str = split[i18];
                    byte[] bArr = new byte[i17];
                    bArr[c] = -15;
                    boolean z9 = i17;
                    byte[] bArr2 = new byte[i14];
                    // fill-array-data instruction
                    bArr2[0] = -35;
                    bArr2[1] = -17;
                    bArr2[2] = -47;
                    bArr2[3] = 93;
                    bArr2[4] = 53;
                    bArr2[5] = 71;
                    bArr2[6] = -115;
                    bArr2[7] = 53;
                    String[] split2 = str.split(e0.m.h(bArr, bArr2));
                    if (split2.length >= i16) {
                        String str2 = split2[c];
                        String str3 = split2[z9 ? 1 : 0];
                        try {
                            i11 = i16;
                            try {
                                parseInt = Integer.parseInt(split2[2].trim());
                                if (split2.length >= 4) {
                                    i12 = Integer.parseInt(split2[i11].trim());
                                } else {
                                    i12 = 50;
                                }
                                try {
                                    packageInfo = requireContext().getPackageManager().getPackageInfo(str2, 0);
                                } catch (PackageManager.NameNotFoundException unused) {
                                    packageInfo = null;
                                }
                                i13 = i12;
                                try {
                                    packageInfo2 = requireContext().getPackageManager().getPackageInfo(str3, 0);
                                } catch (PackageManager.NameNotFoundException unused2) {
                                    packageInfo2 = null;
                                }
                            } catch (NumberFormatException unused3) {
                            }
                        } catch (NumberFormatException unused4) {
                        }
                        if (packageInfo != null && packageInfo2 != null) {
                            list = installedApplications;
                            strArr = split;
                            int i19 = 17;
                            a5.h hVar = new a5.h(packageManager2.getApplicationLabel(packageInfo.applicationInfo).toString(), str2, packageManager2.getApplicationIcon(packageInfo.applicationInfo), i19);
                            a5.h hVar2 = new a5.h(packageManager2.getApplicationLabel(packageInfo2.applicationInfo).toString(), str3, packageManager2.getApplicationIcon(packageInfo2.applicationInfo), i19);
                            e4.o oVar2 = new e4.o();
                            oVar2.c = hVar;
                            oVar2.d = hVar2;
                            int i20 = 2;
                            if (parseInt != 2) {
                                i20 = z9 ? 1 : 0;
                            }
                            oVar2.f2149a = i20;
                            oVar2.f2150b = w(i13);
                            arrayList.add(new j2(z9, null, oVar2));
                            i18++;
                            i16 = i11;
                            installedApplications = list;
                            split = strArr;
                            i14 = 8;
                            i17 = 1;
                            c = 0;
                        }
                        list = installedApplications;
                        strArr = split;
                        i18++;
                        i16 = i11;
                        installedApplications = list;
                        split = strArr;
                        i14 = 8;
                        i17 = 1;
                        c = 0;
                    }
                    list = installedApplications;
                    i11 = i16;
                    strArr = split;
                    i18++;
                    i16 = i11;
                    installedApplications = list;
                    split = strArr;
                    i14 = 8;
                    i17 = 1;
                    c = 0;
                }
            }
            for (ApplicationInfo applicationInfo : installedApplications) {
                if ((applicationInfo.flags & 1) == 0 && packageManager.getLaunchIntentForPackage(applicationInfo.packageName) != null) {
                    arrayList.add(new j2(false, new a5.h(packageManager.getApplicationLabel(applicationInfo).toString(), applicationInfo.packageName, packageManager.getApplicationIcon(applicationInfo), 17), null));
                }
            }
            this.e.notifyDataSetChanged();
            this.d.post(new j(this, f8, requireContext, 1));
        }
    }

    public final void x(int i10) {
        int i11;
        int i12;
        this.c.f2149a = i10;
        h0.b.o().saveInt(e0.m.h(new byte[]{81, -43, 7, 116, -111, 3, 25, 78, 75, -64, 5, 105}, new byte[]{2, -123, 75, Base64.padSymbol, -59, 92, 86, 28}), i10);
        ImageView imageView = this.f3762f;
        if (i10 == 1) {
            i11 = R.drawable.ic_split_vertical_selected;
        } else {
            i11 = R.drawable.ic_split_vertical;
        }
        imageView.setImageResource(i11);
        ImageView imageView2 = this.f3763g;
        if (i10 == 2) {
            i12 = R.drawable.ic_split_horizontal_selected;
        } else {
            i12 = R.drawable.ic_split_horizontal;
        }
        imageView2.setImageResource(i12);
    }

    public final void y(int i10) {
        int i11;
        int w = w(i10);
        e4.o oVar = this.c;
        oVar.f2150b = w;
        h0.b.o().saveInt(e0.m.h(new byte[]{-73, -4, 52, -113, -13, -105, -111, -70, -80, -27, 55}, new byte[]{-28, -84, 120, -58, -89, -56, -61, -5}), oVar.f2150b);
        int i12 = oVar.f2150b;
        if (i12 == 30) {
            i11 = R.id.splitRatio30;
        } else if (i12 == 70) {
            i11 = R.id.splitRatio70;
        } else {
            i11 = R.id.splitRatio50;
        }
        if (this.f3764h.getCheckedButtonId() != i11) {
            this.f3764h.f(i11, true);
        }
    }
}
