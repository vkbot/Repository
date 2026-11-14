package m0;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.example.navistart.R;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class q2 extends l0.b {

    /* renamed from: b, reason: collision with root package name */
    public p0.e f3839b;
    public p0.j c;
    public TextView d;
    public TextView e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f3840f;

    /* renamed from: g, reason: collision with root package name */
    public ProgressBar f3841g;

    /* renamed from: h, reason: collision with root package name */
    public Button f3842h;

    /* renamed from: i, reason: collision with root package name */
    public final Handler f3843i = new Handler(Looper.getMainLooper());

    /* renamed from: j, reason: collision with root package name */
    public final ExecutorService f3844j = Executors.newSingleThreadExecutor();

    /* renamed from: k, reason: collision with root package name */
    public boolean f3845k;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_user_apps_hide_settings, viewGroup, false);
        this.f3839b = new p0.e(requireContext());
        this.c = new p0.j(requireContext(), this.f3839b, this);
        this.d = (TextView) inflate.findViewById(R.id.userAppsHideOwnerStatus);
        this.e = (TextView) inflate.findViewById(R.id.userAppsHideInfo);
        this.f3840f = (TextView) inflate.findViewById(R.id.userAppsHideResult);
        this.f3841g = (ProgressBar) inflate.findViewById(R.id.userAppsHideProgress);
        this.f3842h = (Button) inflate.findViewById(R.id.userAppsHideActionButton);
        final int i10 = 0;
        inflate.findViewById(R.id.userAppsHideBackButton).setOnClickListener(new View.OnClickListener(this) { // from class: m0.n2
            public final /* synthetic */ q2 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        q2 q2Var = this.c;
                        if (q2Var.getParentFragment() instanceof l0.a) {
                            ((l0.a) q2Var.getParentFragment()).dismiss();
                            return;
                        }
                        FragmentActivity activity = q2Var.getActivity();
                        if (activity != null) {
                            activity.finish();
                            return;
                        }
                        return;
                    default:
                        q2 q2Var2 = this.c;
                        if (!q2Var2.f3845k && q2Var2.f3839b != null) {
                            if (!p0.e.e()) {
                                p0.j jVar = q2Var2.c;
                                if (jVar != null && !jVar.f4985k) {
                                    if (jVar.f4983i == null) {
                                        jVar.h(1);
                                    }
                                    jVar.f(0);
                                }
                                new AlertDialog.Builder(q2Var2.requireContext()).setTitle(R.string.user_apps_hide_confirm_title).setMessage(R.string.user_apps_hide_confirm_message).setPositiveButton(R.string.user_apps_hide_confirm_positive, new b7.h(1, q2Var2)).setNegativeButton(R.string.user_apps_hide_confirm_negative, (DialogInterface.OnClickListener) null).show();
                                return;
                            }
                            q2Var2.t();
                            return;
                        }
                        return;
                }
            }
        });
        final int i11 = 1;
        this.f3842h.setOnClickListener(new View.OnClickListener(this) { // from class: m0.n2
            public final /* synthetic */ q2 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        q2 q2Var = this.c;
                        if (q2Var.getParentFragment() instanceof l0.a) {
                            ((l0.a) q2Var.getParentFragment()).dismiss();
                            return;
                        }
                        FragmentActivity activity = q2Var.getActivity();
                        if (activity != null) {
                            activity.finish();
                            return;
                        }
                        return;
                    default:
                        q2 q2Var2 = this.c;
                        if (!q2Var2.f3845k && q2Var2.f3839b != null) {
                            if (!p0.e.e()) {
                                p0.j jVar = q2Var2.c;
                                if (jVar != null && !jVar.f4985k) {
                                    if (jVar.f4983i == null) {
                                        jVar.h(1);
                                    }
                                    jVar.f(0);
                                }
                                new AlertDialog.Builder(q2Var2.requireContext()).setTitle(R.string.user_apps_hide_confirm_title).setMessage(R.string.user_apps_hide_confirm_message).setPositiveButton(R.string.user_apps_hide_confirm_positive, new b7.h(1, q2Var2)).setNegativeButton(R.string.user_apps_hide_confirm_negative, (DialogInterface.OnClickListener) null).show();
                                return;
                            }
                            q2Var2.t();
                            return;
                        }
                        return;
                }
            }
        });
        v();
        this.c.h(1);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.f3844j.shutdown();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        if (this.c != null) {
            if (this.f3839b != null && p0.e.e()) {
                this.c.c = null;
            } else {
                this.c.a();
            }
            this.c = null;
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        v();
        p0.j jVar = this.c;
        if (jVar != null) {
            jVar.h(1);
        }
    }

    public final void t() {
        int i10;
        if (!this.f3845k && this.f3839b != null) {
            boolean e = p0.e.e();
            Context applicationContext = requireContext().getApplicationContext();
            this.f3845k = true;
            this.f3842h.setEnabled(false);
            this.f3842h.setAlpha(0.55f);
            Button button = this.f3842h;
            if (e) {
                i10 = R.string.user_apps_hide_restore_button_busy;
            } else {
                i10 = R.string.user_apps_hide_hide_button_busy;
            }
            button.setText(i10);
            ProgressBar progressBar = this.f3841g;
            if (progressBar != null) {
                progressBar.setIndeterminate(false);
                this.f3841g.setMax(100);
                this.f3841g.setProgress(0);
                this.f3841g.setVisibility(0);
            }
            u(0, 1, e);
            this.f3844j.execute(new e0.e2(this, e, applicationContext, 2));
        }
    }

    public final void u(int i10, int i11, boolean z9) {
        int min;
        int i12;
        if (i11 <= 0) {
            min = 0;
        } else {
            min = Math.min(100, Math.round((i10 * 100.0f) / i11));
        }
        ProgressBar progressBar = this.f3841g;
        if (progressBar != null) {
            progressBar.setProgress(min);
        }
        TextView textView = this.f3840f;
        if (textView != null) {
            StringBuilder sb = new StringBuilder();
            if (z9) {
                i12 = R.string.user_apps_hide_progress_restoring;
            } else {
                i12 = R.string.user_apps_hide_progress_hiding;
            }
            sb.append(getString(i12));
            sb.append(" ");
            sb.append(min);
            sb.append(e0.m.h(new byte[]{53}, new byte[]{16, 71, ByteCompanionObject.MIN_VALUE, 110, 122, 67, -122, -74}));
            textView.setText(sb.toString());
        }
    }

    public final void v() {
        int i10;
        int i11;
        float f8;
        int i12;
        int i13;
        if (this.f3839b != null && this.f3842h != null) {
            boolean e = p0.e.e();
            p0.e eVar = this.f3839b;
            int size = eVar.f4969b.c(true).size();
            if (eVar.c()) {
                size += eVar.a().size();
            }
            TextView textView = this.d;
            if (this.f3839b.c()) {
                i10 = R.string.user_apps_hide_special_rights_ok;
            } else {
                i10 = R.string.user_apps_hide_special_rights_missing;
            }
            textView.setText(i10);
            TextView textView2 = this.e;
            if (e) {
                i11 = R.string.user_apps_hide_info_hidden;
            } else {
                i11 = R.string.user_apps_hide_info_ready;
            }
            textView2.setText(getString(i11, Integer.valueOf(size)));
            this.f3842h.setEnabled(!this.f3845k);
            Button button = this.f3842h;
            if (this.f3845k) {
                f8 = 0.55f;
            } else {
                f8 = 1.0f;
            }
            button.setAlpha(f8);
            if (!this.f3845k) {
                Button button2 = this.f3842h;
                if (e) {
                    i13 = R.string.user_apps_hide_restore_button;
                } else {
                    i13 = R.string.user_apps_hide_hide_button;
                }
                button2.setText(i13);
            }
            ProgressBar progressBar = this.f3841g;
            if (progressBar != null) {
                if (this.f3845k) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                progressBar.setVisibility(i12);
            }
            if (this.f3840f.length() == 0) {
                this.f3840f.setText(R.string.user_apps_hide_result_ready);
            }
            p0.j jVar = this.c;
            if (jVar != null) {
                jVar.e();
            }
        }
    }
}
