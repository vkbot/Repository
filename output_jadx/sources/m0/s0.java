package m0;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.example.navistart.R;
import com.google.android.material.materialswitch.MaterialSwitch;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class s0 extends l0.b {
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final View inflate = layoutInflater.inflate(R.layout.fragment_launcher_shortcuts_settings, viewGroup, false);
        final p0.b bVar = new p0.b(requireContext());
        final LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.launcherShortcutsList);
        for (p0.a aVar : bVar.f4962b) {
            if (!aVar.e) {
                MaterialSwitch materialSwitch = new MaterialSwitch(requireContext(), null);
                materialSwitch.setText(aVar.c);
                materialSwitch.setTextSize(18.0f);
                materialSwitch.setTextColor(requireContext().getColor(R.color.modern_text));
                materialSwitch.setChecked(p0.b.e(aVar));
                int t = t(12);
                materialSwitch.setPadding(t, t(8), t, t(8));
                linearLayout.addView(materialSwitch, new LinearLayout.LayoutParams(-1, t(56)));
                materialSwitch.setOnCheckedChangeListener(new e0.t0(this, bVar, aVar, 1));
            }
        }
        final Button button = (Button) inflate.findViewById(R.id.launcherShortcutsCleanupButton);
        button.setOnClickListener(new View.OnClickListener() { // from class: m0.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s0 s0Var = s0.this;
                new AlertDialog.Builder(s0Var.requireContext()).setTitle(R.string.launcher_shortcuts_cleanup_title).setMessage(s0Var.getString(R.string.launcher_shortcuts_reset_confirmation, 5L)).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.launcher_shortcuts_cleanup, new q0(s0Var, button, linearLayout, bVar, inflate, 0)).show();
            }
        });
        inflate.post(new r0(0, this, inflate, button, linearLayout));
        inflate.findViewById(R.id.launcherShortcutsBackButton).setOnClickListener(new androidx.navigation.c(16, this));
        return inflate;
    }

    public final int t(int i10) {
        return Math.round(i10 * getResources().getDisplayMetrics().density);
    }
}
