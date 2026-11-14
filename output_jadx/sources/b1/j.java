package b1;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import com.example.navistart.R;
import java.io.File;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.ByteCompanionObject;
import m0.c3;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f294b = 0;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f295f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f296g;

    public /* synthetic */ j(l lVar, k kVar, boolean z9, String str, String str2) {
        this.f295f = lVar;
        this.f296g = kVar;
        this.e = z9;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z9;
        boolean z10;
        String str;
        boolean z11;
        int i10 = this.f294b;
        Object obj = this.f296g;
        boolean z12 = this.e;
        String str2 = this.d;
        String str3 = this.c;
        Object obj2 = this.f295f;
        switch (i10) {
            case 0:
                l lVar = (l) obj2;
                k kVar = (k) obj;
                Set set = lVar.d;
                String str4 = l.f297f;
                AtomicBoolean atomicBoolean = l.f301j;
                AtomicLong atomicLong = l.f300i;
                try {
                    str = kVar.run();
                    z10 = l.F(str);
                } catch (Exception e) {
                    e = e;
                    String e6 = l.e(e.getMessage());
                    while (e != null) {
                        String name = e.getClass().getName();
                        String message = e.getMessage();
                        if (!name.contains(e0.m.h(new byte[]{53, 126, -18, 87, -110, -26, 77, -19, 18, 111, -54, 75, -66, -31, 87, -4, 24, 116, -31}, new byte[]{113, 27, -113, 51, -35, -124, 39, -120})) && !name.contains(e0.m.h(new byte[]{126, -94, 52, -37, -48, -36, -22, -79, 95, -86, 16, -57, -32, -64, -23, -79, 83, -88, 59}, new byte[]{58, -57, 85, -65, -125, -91, -103, -59})) && !name.contains(e0.m.h(new byte[]{120, 11, -105, -33, -55, -124, -99, -81, 73, 11, -118, -60, -44, -114, -74}, new byte[]{42, 110, -6, -80, -67, -31, -40, -41})) && !l.b(message)) {
                            e = e.getCause();
                        } else {
                            z9 = true;
                            z10 = z9;
                            str = e6;
                        }
                    }
                    z9 = false;
                    z10 = z9;
                    str = e6;
                }
                if (z10) {
                    if (atomicLong.getAndSet(SystemClock.elapsedRealtime() + 2000) == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    atomicBoolean.set(false);
                    if (z11) {
                        Log.w(str4, e0.m.h(new byte[]{-89, 69, 99, 4, -10, -59, -73, 50, -60, 81, ByteCompanionObject.MAX_VALUE, 69, -20, -51, -80, 53, -123, 70, 125, 65, -95, -116, -82, 60, -122, 4, 114, 69, -24, -116, -85, 60, -107, 81, 116, 87, -18, -33, -7, 41, -123, 81, 98, 65, -2}, new byte[]{-28, 36, 17, 36, -102, -84, -39, 89}));
                    }
                } else {
                    atomicLong.set(0L);
                    atomicBoolean.set(false);
                    if (z12) {
                        Log.i(str4, e0.m.h(new byte[]{53, 2, 55, 55, -58, 13, 55, 122, 86, 17, 32, 100, -34, 11, 43, 116, 18, 88, 101, 96, -49, 6, 121, 114, 23, 17, 101, 101, -49, 21, 44, 116, 5, 23, 54, 55, -40, 1, 42, 100, 27, 6, 33}, new byte[]{118, 99, 69, 23, -86, 100, 89, 17}));
                    }
                }
                try {
                    lVar.J(str3, str2, str);
                    return;
                } finally {
                    set.remove(str3);
                }
            default:
                c3 c3Var = (c3) obj2;
                File file = (File) obj;
                if (str3 == null) {
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (z12) {
                        StringBuilder w = ai.onnxruntime.a.w(str2, "\n\n");
                        w.append(c3Var.getString(R.string.user_file_manager_text_preview_truncated));
                        str2 = w.toString();
                    }
                    TextView textView = new TextView(c3Var.requireContext());
                    textView.setText(str2);
                    textView.setTextColor(ContextCompat.getColor(c3Var.requireContext(), R.color.modern_text));
                    textView.setTextIsSelectable(true);
                    textView.setTextSize(13.0f);
                    textView.setTypeface(Typeface.MONOSPACE);
                    textView.setPadding(c3Var.z(12), c3Var.z(10), c3Var.z(12), c3Var.z(10));
                    ScrollView scrollView = new ScrollView(c3Var.requireContext());
                    scrollView.addView(textView, new FrameLayout.LayoutParams(-1, -2));
                    new AlertDialog.Builder(c3Var.requireContext(), R.style.ThemeOverlay_JCarTools_ModernAlert).setTitle(file.getName()).setView(scrollView).setPositiveButton(R.string.ok, (DialogInterface.OnClickListener) null).show();
                    c3Var.I(c3Var.getString(R.string.user_file_manager_file_actions_hint));
                    return;
                }
                c3Var.I(c3Var.getString(R.string.user_file_manager_text_preview_error, str3));
                return;
        }
    }

    public /* synthetic */ j(c3 c3Var, String str, String str2, boolean z9, File file) {
        this.f295f = c3Var;
        this.c = str;
        this.d = str2;
        this.e = z9;
        this.f296g = file;
    }
}
