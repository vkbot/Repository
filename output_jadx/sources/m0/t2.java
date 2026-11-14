package m0;

import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.example.navistart.R;
import java.io.File;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class t2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3861b;
    public final /* synthetic */ c3 c;
    public final /* synthetic */ File d;

    public /* synthetic */ t2(c3 c3Var, File file, int i10) {
        this.f3861b = i10;
        this.c = c3Var;
        this.d = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String message;
        String message2;
        String str;
        boolean z9;
        String str2;
        int i10 = this.f3861b;
        String str3 = null;
        File file = this.d;
        c3 c3Var = this.c;
        switch (i10) {
            case 0:
                try {
                    c3.y(file);
                } catch (Exception e) {
                    if (e.getMessage() == null) {
                        message = e.getClass().getSimpleName();
                    } else {
                        message = e.getMessage();
                    }
                    str3 = message;
                }
                c3Var.F(new b1.n(c3Var, str3, file, 9));
                return;
            case 1:
                try {
                    c3Var.I(c3Var.getString(R.string.user_file_manager_install_started, file.getName()));
                    e0.y2.c(c3.G(file), c3Var.requireActivity(), null);
                    return;
                } catch (Exception unused) {
                    c3Var.I(c3Var.getString(R.string.user_file_manager_install_error, file.getName()));
                    return;
                }
            case 2:
                c3Var.I(c3Var.getString(R.string.user_file_manager_text_preview_loading));
                e0.w.c(-1, e0.m.h(new byte[]{-18, 13, 97, -72, -3, -58, 88, 86, -10, 31, 106, -85, -36, -54, 70, 103, -34, 6, 112, -102, -55, -54, 66, 90, -34, 9}, new byte[]{-69, 126, 4, -54, -69, -81, 52, 51})).execute(new t2(c3Var, file, 4));
                return;
            case 3:
                try {
                    Context requireContext = c3Var.requireContext();
                    Uri uriForFile = FileProvider.getUriForFile(requireContext, requireContext.getPackageName() + e0.m.h(new byte[]{-98, -20, 122, -5, -75, -105, 101, 55, -62}, new byte[]{-80, -100, 8, -108, -61, -2, 1, 82}), file);
                    Intent intent = new Intent(e0.m.h(new byte[]{35, -103, 11, 97, 96, 68, -126, -102, 43, -103, 27, 118, 97, 89, -56, -43, 33, -125, 6, 124, 97, 3, -80, -3, 7, -96}, new byte[]{66, -9, 111, 19, 15, 45, -26, -76}));
                    intent.setDataAndType(uriForFile, c3.A(file));
                    intent.setClipData(ClipData.newUri(requireContext.getContentResolver(), file.getName(), uriForFile));
                    intent.addFlags(1);
                    c3Var.startActivity(Intent.createChooser(intent, c3Var.getString(R.string.user_file_manager_open_external)));
                    return;
                } catch (ActivityNotFoundException unused2) {
                    c3Var.I(c3Var.getString(R.string.user_file_manager_external_open_error, file.getName()));
                    return;
                } catch (Exception unused3) {
                    c3Var.I(c3Var.getString(R.string.user_file_manager_external_open_error, file.getName()));
                    return;
                }
            default:
                File file2 = this.d;
                try {
                    b3 E = c3.E(file2);
                    String str4 = E.f3611b;
                    try {
                        z9 = E.f3610a;
                        str2 = str4;
                        str = null;
                    } catch (Exception e6) {
                        e = e6;
                        str3 = str4;
                        if (e.getMessage() == null) {
                            message2 = e.getClass().getSimpleName();
                        } else {
                            message2 = e.getMessage();
                        }
                        str = message2;
                        z9 = false;
                        str2 = str3;
                        c3 c3Var2 = this.c;
                        c3Var2.F(new b1.j(c3Var2, str, str2, z9, file2));
                        return;
                    }
                } catch (Exception e10) {
                    e = e10;
                }
                c3 c3Var22 = this.c;
                c3Var22.F(new b1.j(c3Var22, str, str2, z9, file2));
                return;
        }
    }
}
