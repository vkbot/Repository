package m0;

import android.app.admin.DevicePolicyManager;
import android.app.usage.UsageEvents;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.navistart.R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class w1 extends l0.b {

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f3885b;
    public TextView c;
    public TextView d;
    public v1 e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3886f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f3887g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final Handler f3888h = new Handler(Looper.getMainLooper());

    /* renamed from: i, reason: collision with root package name */
    public int f3889i = 0;

    /* renamed from: j, reason: collision with root package name */
    public Display[] f3890j;

    public static boolean t(Context context, String str) {
        if ((context.getPackageManager().getApplicationInfo(str, 0).flags & 129) != 0) {
            return false;
        }
        return true;
    }

    public static DevicePolicyManager u(Context context) {
        return (DevicePolicyManager) context.getSystemService(e0.m.h(new byte[]{65, -79, -85, -64, -26, 8, -34, -91, 74, -72, -76, -54, -4}, new byte[]{37, -44, -35, -87, -123, 109, -127, -43}));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_recent_task_manager, viewGroup, false);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f3889i = arguments.getInt(e0.m.h(new byte[]{-74, -114, 90}, new byte[]{-46, -25, 41, -74, -16, 77, 56, 59}), 0);
        }
        this.f3885b = (RecyclerView) inflate.findViewById(R.id.recyclerRecentTasks);
        this.c = (TextView) inflate.findViewById(R.id.emptyRecentTasks);
        this.d = (TextView) inflate.findViewById(R.id.recentStopRightsHint);
        this.c.setOnClickListener(new androidx.navigation.c(17, this));
        this.f3885b.setLayoutManager(new LinearLayoutManager(requireContext(), 0, false));
        v1 v1Var = new v1(this);
        this.e = v1Var;
        this.f3885b.setAdapter(v1Var);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (getParentFragment() instanceof l0.a) {
            ((l0.a) getParentFragment()).dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int i10;
        super.onStart();
        Display[] displays = ((DisplayManager) requireContext().getSystemService(e0.m.h(new byte[]{-46, -123, 84, 8, 47, 70, 5}, new byte[]{-74, -20, 39, 120, 67, 39, 124, 101}))).getDisplays();
        this.f3890j = displays;
        if (displays != null && (i10 = this.f3889i) >= 0 && i10 < displays.length) {
            ((WindowManager) requireContext().createDisplayContext(this.f3890j[this.f3889i]).getSystemService(e0.m.h(new byte[]{-20, 27, 119, -127, 35, -127}, new byte[]{-101, 114, 25, -27, 76, -10, 77, 118}))).getDefaultDisplay().getRealSize(new Point());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f3885b.getLayoutParams();
            layoutParams.width = (int) (r1.x * 0.92d);
            layoutParams.height = -2;
            this.f3885b.setLayoutParams(layoutParams);
        }
        v();
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, m0.s1] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, java.util.function.ToLongFunction] */
    public final void v() {
        ArrayList arrayList;
        int i10;
        PackageInfo packageInfo;
        boolean z9;
        boolean q8 = b1.u.q(requireContext());
        int i11 = 8;
        int i12 = 0;
        ArrayList arrayList2 = this.f3886f;
        if (!q8) {
            arrayList2.clear();
            this.e.notifyDataSetChanged();
            this.c.setText(R.string.recent_task_manager_usage_access);
            this.c.setVisibility(0);
            this.f3885b.setVisibility(8);
            return;
        }
        PackageManager packageManager = requireContext().getPackageManager();
        Context requireContext = requireContext();
        UsageStatsManager usageStatsManager = (UsageStatsManager) requireContext.getSystemService(e0.m.h(new byte[]{89, 65, 108, 104, 83, 117, 86, -114, 88, 65}, new byte[]{44, 50, 13, 15, 54, 6, 34, -17}));
        HashMap hashMap = new HashMap();
        if (usageStatsManager != null && b1.u.q(requireContext)) {
            long currentTimeMillis = System.currentTimeMillis();
            UsageEvents queryEvents = usageStatsManager.queryEvents(currentTimeMillis - 604800000, currentTimeMillis);
            UsageEvents.Event event = new UsageEvents.Event();
            String packageName = requireContext.getPackageName();
            while (queryEvents.hasNextEvent()) {
                queryEvents.getNextEvent(event);
                int eventType = event.getEventType();
                boolean z10 = true;
                if (eventType == 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    if (!z9 && eventType != 1) {
                        z10 = false;
                    }
                    z9 = z10;
                }
                String packageName2 = event.getPackageName();
                if (z9 && packageName2 != null && !packageName2.equals(packageName)) {
                    hashMap.put(packageName2, Long.valueOf(event.getTimeStamp()));
                }
            }
            ArrayList arrayList3 = new ArrayList(hashMap.entrySet());
            arrayList3.sort(Comparator.comparingLong(new Object()));
            arrayList = new ArrayList();
            for (int max = Math.max(0, arrayList3.size() - Math.max(0, 20)); max < arrayList3.size(); max++) {
                arrayList.add((String) ((Map.Entry) arrayList3.get(max)).getKey());
            }
        } else {
            arrayList = new ArrayList();
        }
        arrayList2.clear();
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            String str = (String) obj;
            if (!this.f3887g.contains(str)) {
                try {
                    packageInfo = requireContext().getPackageManager().getPackageInfo(str, 0);
                } catch (PackageManager.NameNotFoundException unused) {
                    packageInfo = null;
                }
                if (packageInfo != null && packageManager.getLaunchIntentForPackage(str) != null) {
                    String charSequence = packageManager.getApplicationLabel(packageInfo.applicationInfo).toString();
                    Drawable applicationIcon = packageManager.getApplicationIcon(packageInfo.applicationInfo);
                    ?? obj2 = new Object();
                    obj2.f3853a = charSequence;
                    obj2.f3854b = str;
                    obj2.c = applicationIcon;
                    arrayList2.add(obj2);
                }
            }
        }
        this.e.notifyDataSetChanged();
        this.c.setText(R.string.recent_task_manager_empty);
        TextView textView = this.c;
        if (arrayList2.isEmpty()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        textView.setVisibility(i10);
        RecyclerView recyclerView = this.f3885b;
        if (arrayList2.isEmpty()) {
            i12 = 8;
        }
        recyclerView.setVisibility(i12);
        if (!arrayList2.isEmpty()) {
            this.f3885b.post(new f5.j(i11, this));
        }
    }
}
