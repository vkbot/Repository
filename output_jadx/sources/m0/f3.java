package m0;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import com.example.navistart.R;
import java.io.File;
import java.util.ArrayList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class f3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3694b = 1;
    public final /* synthetic */ n3 c;
    public final /* synthetic */ AlertDialog d;
    public final /* synthetic */ int e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TextView f3695f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ListView f3696g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f3697h;

    public /* synthetic */ f3(n3 n3Var, AlertDialog alertDialog, int i10, ArrayList arrayList, TextView textView, ListView listView) {
        this.c = n3Var;
        this.d = alertDialog;
        this.e = i10;
        this.f3697h = arrayList;
        this.f3695f = textView;
        this.f3696g = listView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3694b) {
            case 0:
                com.bumptech.glide.manager.t tVar = (com.bumptech.glide.manager.t) this.f3697h;
                ((h7.k) tVar.e).o((Context) tVar.d);
                ArrayList e = tVar.e();
                n3 n3Var = this.c;
                n3Var.d.post(new f3(n3Var, this.d, this.e, e, this.f3695f, this.f3696g));
                return;
            default:
                ArrayList arrayList = (ArrayList) this.f3697h;
                n3 n3Var2 = this.c;
                if (n3Var2.getView() != null) {
                    AlertDialog alertDialog = n3Var2.f3815p;
                    AlertDialog alertDialog2 = this.d;
                    if (alertDialog == alertDialog2) {
                        if (this.e == n3Var2.f3817s) {
                            if (arrayList.isEmpty()) {
                                Toast.makeText(n3Var2.requireContext(), R.string.usb_not, 1).show();
                                return;
                            }
                            String[] strArr = new String[arrayList.size()];
                            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                strArr[i10] = ((File) arrayList.get(i10)).getAbsolutePath();
                            }
                            AlertDialog alertDialog3 = n3Var2.f3816q;
                            if (alertDialog3 != null) {
                                alertDialog3.dismiss();
                            }
                            AlertDialog.Builder builder = new AlertDialog.Builder(n3Var2.requireContext(), R.style.ThemeOverlay_JCarTools_VideoAlert);
                            n3Var2.f3816q = builder.setTitle(R.string.usb_chos).setAdapter(new ArrayAdapter(builder.getContext(), R.layout.video_browser_item, strArr), new q0(n3Var2, arrayList, alertDialog2, this.f3695f, this.f3696g, 1)).show();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ f3(n3 n3Var, com.bumptech.glide.manager.t tVar, AlertDialog alertDialog, int i10, TextView textView, ListView listView) {
        this.c = n3Var;
        this.f3697h = tVar;
        this.d = alertDialog;
        this.e = i10;
        this.f3695f = textView;
        this.f3696g = listView;
    }
}
