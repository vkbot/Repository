package m0;

import android.content.DialogInterface;
import android.os.Environment;
import android.widget.EditText;
import android.widget.Spinner;
import com.example.navistart.R;
import com.woha.wifim.MainWifiManadger;
import java.io.File;
import java.util.ArrayList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class y0 implements DialogInterface.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3899b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ y0(Object obj, Object obj2, Object obj3, int i10) {
        this.f3899b = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        String trim;
        File file;
        int i11 = this.f3899b;
        int i12 = 0;
        boolean z9 = false;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i11) {
            case 0:
                z0 z0Var = (z0) obj3;
                t0 t0Var = (t0) obj;
                ArrayList arrayList = z0Var.f3907b;
                Object selectedItem = ((Spinner) obj2).getSelectedItem();
                if (selectedItem instanceof j0.e) {
                    j0.e eVar = (j0.e) selectedItem;
                    int indexOf = arrayList.indexOf(t0Var);
                    if (!j0.f.d(eVar)) {
                        if (indexOf >= 0) {
                            arrayList.remove(indexOf);
                            z0Var.c.remove(t0Var.f3858a.toStorageValue());
                            z0Var.f3911i.notifyItemRemoved(indexOf);
                        }
                    } else {
                        t0Var.f3859b = eVar;
                        t0Var.c = true;
                        if (indexOf >= 0) {
                            arrayList.remove(indexOf);
                            z0Var.f3911i.notifyItemRemoved(indexOf);
                        }
                        arrayList.add(0, t0Var);
                        z0Var.f3911i.notifyItemInserted(0);
                        z0Var.f3910h.scrollToPosition(0);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    while (i12 < size) {
                        Object obj4 = arrayList.get(i12);
                        i12++;
                        t0 t0Var2 = (t0) obj4;
                        if (t0Var2.c && j0.f.d(t0Var2.f3859b)) {
                            arrayList2.add(new w0.o0(t0Var2.f3858a.toStorageValue(), t0Var2.f3859b, true, true));
                        }
                    }
                    h0.b.a();
                    j0.c f8 = h0.b.f();
                    String str = z0.f3905m;
                    f8.getClass();
                    j0.c.l(str, arrayList2);
                    z0Var.u();
                    return;
                }
                return;
            case 1:
                c3 c3Var = (c3) obj3;
                EditText editText = (EditText) obj2;
                File file2 = (File) obj;
                if (editText.getText() == null) {
                    trim = "";
                } else {
                    trim = editText.getText().toString().trim();
                }
                if (trim.length() != 0 && !trim.contains(e0.m.h(new byte[]{-72}, new byte[]{-105, -65, -54, 67, 115, 63, -73, 30})) && !trim.contains(e0.m.h(new byte[]{-113}, new byte[]{-45, -122, 45, 90, 5, -75, -113, 118}))) {
                    File parentFile = file2.getParentFile();
                    if (parentFile == null) {
                        c3Var.I(c3Var.getString(R.string.user_file_manager_rename_error, file2.getName()));
                        return;
                    }
                    if (!file2.getName().equals(trim)) {
                        File file3 = new File(parentFile, trim);
                        if (file3.exists()) {
                            c3Var.I(c3Var.getString(R.string.user_file_manager_rename_exists, trim));
                            return;
                        }
                        try {
                            z9 = file2.renameTo(file3);
                        } catch (Exception unused) {
                        }
                        if (z9) {
                            File file4 = c3Var.f3638u;
                            if (file4 != null && c3.G(file4).equals(c3.G(file2))) {
                                c3Var.f3638u = file3;
                                c3Var.K();
                            }
                            c3Var.v();
                            c3Var.I(c3Var.getString(R.string.user_file_manager_rename_done, file3.getName()));
                            c3Var.D(c3Var.t);
                            return;
                        }
                        c3Var.I(c3Var.getString(R.string.user_file_manager_rename_error, file2.getName()));
                        return;
                    }
                    return;
                }
                c3Var.I(c3Var.getString(R.string.user_file_manager_rename_empty));
                return;
            case 2:
                n3 n3Var = (n3) obj3;
                com.bumptech.glide.manager.t tVar = (com.bumptech.glide.manager.t) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                if (i10 == 0) {
                    file = null;
                } else if (i10 == 1) {
                    tVar.getClass();
                    file = Environment.getExternalStorageDirectory();
                } else {
                    file = (File) arrayList3.get(i10 - 2);
                }
                n3Var.f3812m = file;
                n3Var.w();
                return;
            default:
                MainWifiManadger mainWifiManadger = (MainWifiManadger) obj3;
                String str2 = (String) obj;
                String str3 = MainWifiManadger.f1694v;
                String obj5 = ((EditText) obj2).getText().toString();
                if (!obj5.isEmpty()) {
                    mainWifiManadger.t(str2, obj5, mainWifiManadger.f1705o);
                    return;
                } else {
                    y5.k.x(mainWifiManadger.getApplicationContext(), mainWifiManadger.getResources().getString(R.string.wifi_error_pas));
                    return;
                }
        }
    }
}
