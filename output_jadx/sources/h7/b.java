package h7;

import android.app.PendingIntent;
import android.app.admin.DevicePolicyManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.FileProvider;
import com.example.navistart.BlackActivity;
import com.example.navistart.R;
import com.google.protobuf.q;
import com.woha.appmanag.FilePickerActivity;
import com.woha.appmanag.ManageAppsActivity;
import e0.m;
import e0.w;
import java.io.File;
import java.util.concurrent.TimeUnit;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import m0.a0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2602b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(int i10, Object obj) {
        this.f2602b = i10;
        this.c = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        int i11 = this.f2602b;
        Object obj = this.c;
        switch (i11) {
            case 0:
                FilePickerActivity filePickerActivity = (FilePickerActivity) obj;
                int headerViewsCount = i10 - filePickerActivity.f1664b.getHeaderViewsCount();
                if (headerViewsCount >= 0 && headerViewsCount < filePickerActivity.f1665f.size()) {
                    File file = (File) filePickerActivity.f1665f.get(headerViewsCount);
                    if (file.isDirectory()) {
                        filePickerActivity.v(file);
                        return;
                    }
                    if (filePickerActivity.f1668i == 1) {
                        Intent intent = new Intent();
                        intent.putExtra(FilePickerActivity.f1663j, file.getAbsolutePath());
                        filePickerActivity.setResult(-1, intent);
                        filePickerActivity.finish();
                        return;
                    }
                    Uri uriForFile = FileProvider.getUriForFile(filePickerActivity, m.h(new byte[]{63, -16, -123, 6, 106, -116, -88, 49, 44, -13, -115, 6, 97, -107, -65, 53, 47, -21, -119, 90, 123, -38, -71, 46, 51, -23, -127, 76, 106, -122}, new byte[]{92, -97, -24, 40, 15, -12, -55, 92}), file);
                    Intent intent2 = new Intent();
                    intent2.setData(uriForFile);
                    intent2.addFlags(1);
                    filePickerActivity.setResult(-1, intent2);
                    filePickerActivity.finish();
                    return;
                }
                return;
            case 1:
                final ManageAppsActivity manageAppsActivity = (ManageAppsActivity) obj;
                final g gVar = (g) manageAppsActivity.f1669b.get(i10);
                DevicePolicyManager devicePolicyManager = (DevicePolicyManager) manageAppsActivity.getSystemService(m.h(new byte[]{-90, 92, 121, -47, 69, -39, 53, -106, -83, 85, 102, -37, 95}, new byte[]{-62, 57, 15, -72, 38, -68, 106, -26}));
                if (devicePolicyManager != null && devicePolicyManager.isDeviceOwnerApp(manageAppsActivity.getPackageName())) {
                    final int i12 = 0;
                    new AlertDialog.Builder(manageAppsActivity).setTitle(manageAppsActivity.getString(R.string.delapp)).setMessage(manageAppsActivity.getString(R.string.delapp2) + m.h(new byte[]{55, -68}, new byte[]{23, -98, -61, -6, 24, 6, 100, 87}) + gVar.f2607a + m.h(new byte[]{20, -124, 2}, new byte[]{54, -92, Base64.padSymbol, -12, 82, -40, -83, -107})).setPositiveButton(manageAppsActivity.getString(R.string.ok), new DialogInterface.OnClickListener() { // from class: h7.d
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i13) {
                            int i14 = i12;
                            g gVar2 = gVar;
                            ManageAppsActivity manageAppsActivity2 = manageAppsActivity;
                            switch (i14) {
                                case 0:
                                    String str = ManageAppsActivity.e;
                                    String str2 = gVar2.f2608b;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(manageAppsActivity2.getPackageName());
                                    Intent intent3 = new Intent(q.i(new byte[]{-16, 79, 19, -51, ByteCompanionObject.MAX_VALUE, -18, 25, 100, -110, 86, 2, -42, 116, -18, 24, 105, -118}, new byte[]{-34, 26, 93, -124, 49, -67, 77, 37}, sb));
                                    intent3.setPackage(manageAppsActivity2.getPackageName());
                                    intent3.putExtra(m.h(new byte[]{-45, -108, -82, 110, 91, 44, -32, 62, -62, -104, -88}, new byte[]{-93, -11, -51, 5, 58, 75, -123, 112}), str2);
                                    manageAppsActivity2.getPackageManager().getPackageInstaller().uninstall(str2, PendingIntent.getBroadcast(manageAppsActivity2, str2.hashCode(), intent3, 167772160).getIntentSender());
                                    w.c(-1, null).schedule(new e(manageAppsActivity2, 0), 2000L, TimeUnit.MILLISECONDS);
                                    return;
                                default:
                                    String str3 = ManageAppsActivity.e;
                                    manageAppsActivity2.t(gVar2.f2608b);
                                    return;
                            }
                        }
                    }).setNegativeButton(manageAppsActivity.getString(R.string.cancel), (DialogInterface.OnClickListener) null).show();
                    return;
                }
                h0.b.a();
                h0.b.a();
                if (h0.b.g().h()) {
                    final int i13 = 1;
                    new AlertDialog.Builder(manageAppsActivity).setTitle(manageAppsActivity.getString(R.string.delapp)).setMessage(manageAppsActivity.getString(R.string.delapp2) + m.h(new byte[]{3, -2}, new byte[]{35, -36, -85, 23, 94, -61, -36, -44}) + gVar.f2607a + m.h(new byte[]{-22, -87, 55}, new byte[]{-56, -119, 8, 52, 34, 73, -30, 82})).setPositiveButton(manageAppsActivity.getString(R.string.ok), new DialogInterface.OnClickListener() { // from class: h7.d
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i132) {
                            int i14 = i13;
                            g gVar2 = gVar;
                            ManageAppsActivity manageAppsActivity2 = manageAppsActivity;
                            switch (i14) {
                                case 0:
                                    String str = ManageAppsActivity.e;
                                    String str2 = gVar2.f2608b;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(manageAppsActivity2.getPackageName());
                                    Intent intent3 = new Intent(q.i(new byte[]{-16, 79, 19, -51, ByteCompanionObject.MAX_VALUE, -18, 25, 100, -110, 86, 2, -42, 116, -18, 24, 105, -118}, new byte[]{-34, 26, 93, -124, 49, -67, 77, 37}, sb));
                                    intent3.setPackage(manageAppsActivity2.getPackageName());
                                    intent3.putExtra(m.h(new byte[]{-45, -108, -82, 110, 91, 44, -32, 62, -62, -104, -88}, new byte[]{-93, -11, -51, 5, 58, 75, -123, 112}), str2);
                                    manageAppsActivity2.getPackageManager().getPackageInstaller().uninstall(str2, PendingIntent.getBroadcast(manageAppsActivity2, str2.hashCode(), intent3, 167772160).getIntentSender());
                                    w.c(-1, null).schedule(new e(manageAppsActivity2, 0), 2000L, TimeUnit.MILLISECONDS);
                                    return;
                                default:
                                    String str3 = ManageAppsActivity.e;
                                    manageAppsActivity2.t(gVar2.f2608b);
                                    return;
                            }
                        }
                    }).setNegativeButton(manageAppsActivity.getString(R.string.cancel), (DialogInterface.OnClickListener) null).show();
                    return;
                }
                manageAppsActivity.t(gVar.f2608b);
                return;
            default:
                a0 a0Var = (a0) obj;
                String str = a0.f3597h;
                f0.b bVar = f0.b.values()[i10];
                if (bVar == f0.b.d) {
                    u0.a o5 = h0.b.o();
                    String str2 = a0.f3598i;
                    String str3 = a0.f3599j;
                    if (str3.equals(o5.loadString(str2, str3)) && !new File(a0Var.requireContext().getFilesDir(), m.h(new byte[]{-32, -8, -61, -121, -5, 71, -22, -13, -57, -28, -9, -106, -37, 123, -7, -1, -58, -82, -16, -121, -1, 118, -19, -16, -39, -34, -29, -121, -5, 72, -6, -16, -52, -30, -1, -51, -16, 121, -4, -7, -43, -81, -4, -106, -12, 123}, new byte[]{-83, -127, -108, -30, -103, 23, -104, -100})).isFile()) {
                        File file2 = new File(a0Var.requireContext().getCacheDir(), a0Var.f3601f);
                        if (a0Var.f3602g.c(file2)) {
                            a0Var.u(file2);
                        }
                    }
                }
                h0.b.o().saveString(m.h(new byte[]{48, 84, 94, 114, -23, 43, -90, -7, 49, 84, 80, 114, -23, 44, -73, -20, 21, 85, 90, ByteCompanionObject.MAX_VALUE, -10}, new byte[]{114, 56, 63, 17, -126, 106, -59, -115}), bVar.name());
                BlackActivity blackActivity = a0Var.f3600b;
                if (blackActivity != null) {
                    blackActivity.u(bVar);
                }
                l0.a aVar = (l0.a) a0Var.getParentFragment();
                if (aVar != null) {
                    aVar.dismiss();
                    return;
                }
                return;
        }
    }
}
