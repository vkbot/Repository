package m0;

import android.view.View;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import com.example.navistart.R;
import com.example.navistart.SuperWidgets.WidgetBuilderFragment;
import com.google.android.material.materialswitch.MaterialSwitch;
import java.io.File;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class s2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3855b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3856f;

    public /* synthetic */ s2(int i10, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f3855b = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f3856f = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object tag;
        s1.q e;
        boolean z9;
        float f8;
        switch (this.f3855b) {
            case 0:
                c3 c3Var = (c3) this.c;
                String str = (String) this.d;
                File file = (File) this.e;
                File file2 = (File) this.f3856f;
                c3Var.H(null, false);
                if (str == null && file != null) {
                    c3Var.v();
                    c3Var.I(c3Var.getString(R.string.user_file_manager_copy_done, file.getName()));
                    c3Var.D(file2);
                    return;
                }
                c3Var.I(c3Var.getString(R.string.user_file_manager_copy_error, str));
                return;
            case 1:
                s1.k kVar = (s1.k) this.c;
                RadioGroup radioGroup = (RadioGroup) this.d;
                TextView textView = (TextView) this.e;
                RadioGroup radioGroup2 = (RadioGroup) this.f3856f;
                View findViewById = radioGroup.findViewById(radioGroup.getCheckedRadioButtonId());
                if (findViewById == null) {
                    tag = null;
                } else {
                    tag = findViewById.getTag();
                }
                if (tag instanceof s1.q) {
                    e = (s1.q) tag;
                } else {
                    e = kVar.f5518b.e();
                }
                if (e == s1.q.c) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                float f10 = 0.42f;
                if (z9) {
                    f8 = 1.0f;
                } else {
                    f8 = 0.42f;
                }
                textView.setAlpha(f8);
                if (z9) {
                    f10 = 1.0f;
                }
                radioGroup2.setAlpha(f10);
                for (int i10 = 0; i10 < radioGroup2.getChildCount(); i10++) {
                    radioGroup2.getChildAt(i10).setEnabled(z9);
                }
                return;
            default:
                ((WidgetBuilderFragment) this.c).lambda$editor$21((MaterialSwitch) this.d, (SeekBar) this.e, (TextView) this.f3856f);
                return;
        }
    }
}
