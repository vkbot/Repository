package m0;

import android.content.DialogInterface;
import android.net.wifi.ScanResult;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.example.navistart.R;
import com.woha.wifim.MainWifiManadger;
import java.io.File;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class v2 implements View.OnLongClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3883b;
    public final /* synthetic */ RecyclerView.Adapter c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v2(RecyclerView.Adapter adapter, Object obj, int i10) {
        this.f3883b = i10;
        this.c = adapter;
        this.d = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i10 = this.f3883b;
        Object obj = this.d;
        RecyclerView.Adapter adapter = this.c;
        int i11 = 8;
        int i12 = 1;
        switch (i10) {
            case 0:
                File file = (File) obj;
                c3 c3Var = ((x2) adapter).f3897a;
                boolean z9 = c3Var.f3639v;
                if (!z9 && !z9 && file.exists()) {
                    if (file.getParentFile() == null) {
                        c3Var.I(c3Var.getString(R.string.user_file_manager_rename_error, file.getName()));
                    } else {
                        EditText editText = new EditText(c3Var.requireContext());
                        editText.setBackgroundResource(R.drawable.modern_field);
                        editText.setTextColor(ContextCompat.getColor(c3Var.requireContext(), R.color.modern_text));
                        editText.setTextSize(18.0f);
                        editText.setSingleLine(true);
                        editText.setText(file.getName());
                        editText.setSelectAllOnFocus(true);
                        int z10 = c3Var.z(20);
                        editText.setPadding(z10, c3Var.z(8), z10, c3Var.z(8));
                        new AlertDialog.Builder(c3Var.requireContext(), R.style.ThemeOverlay_JCarTools_ModernAlert).setTitle(R.string.user_file_manager_rename_title).setView(editText).setPositiveButton(R.string.user_file_manager_rename_action, new y0(c3Var, editText, file, i12)).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).show();
                        editText.requestFocus();
                    }
                }
                return true;
            default:
                m7.b bVar = ((m7.f) adapter).e;
                String str = ((ScanResult) obj).SSID;
                MainWifiManadger mainWifiManadger = bVar.f3948a;
                String str2 = MainWifiManadger.f1694v;
                new AlertDialog.Builder(mainWifiManadger).setTitle(mainWifiManadger.getResources().getString(R.string.wifi_zab_wifi)).setMessage(mainWifiManadger.getResources().getString(R.string.wifi_zab_wifi_vopros) + str + e0.m.h(new byte[]{-112}, new byte[]{-81, -33, -58, 3, 46, 9, -93, 87})).setPositiveButton(mainWifiManadger.getResources().getString(R.string.yes), new e0.e0(i11, mainWifiManadger, str)).setNegativeButton(mainWifiManadger.getResources().getString(R.string.no), new e0.d3(2)).show();
                return true;
        }
    }
}
