package m0;

import android.app.admin.DevicePolicyManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.navistart.R;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class y extends l0.b {

    /* renamed from: b, reason: collision with root package name */
    public TextView f3898b;
    public LinearLayout c;
    public TextView d;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_car_package_toggle, viewGroup, false);
        Button button = (Button) inflate.findViewById(R.id.carPackageToggleBackButton);
        this.f3898b = (TextView) inflate.findViewById(R.id.carPackageToggleOwnerStatus);
        this.c = (LinearLayout) inflate.findViewById(R.id.carPackageTogglePackageContainer);
        this.d = (TextView) inflate.findViewById(R.id.carPackageToggleResult);
        button.setOnClickListener(new androidx.navigation.c(14, this));
        v();
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        v();
    }

    public final int t(int i10) {
        return Math.round(i10 * requireContext().getResources().getDisplayMetrics().density);
    }

    public final DevicePolicyManager u() {
        return (DevicePolicyManager) requireContext().getSystemService(e0.m.h(new byte[]{-38, 58, 96, 45, 68, 107, 121, 49, -47, 51, ByteCompanionObject.MAX_VALUE, 39, 94}, new byte[]{-66, 95, 22, 68, 39, 14, 38, 65}));
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v() {
        /*
            Method dump skipped, instructions count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.y.v():void");
    }
}
