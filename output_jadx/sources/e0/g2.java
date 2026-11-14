package e0;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import com.example.navistart.R;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class g2 extends DialogFragment {

    /* renamed from: b, reason: collision with root package name */
    public TextView f1920b;
    public ProgressBar c;
    public ProgressBar d;
    public AppCompatActivity e;

    /* renamed from: f, reason: collision with root package name */
    public Button f1921f;

    /* renamed from: g, reason: collision with root package name */
    public a4.g f1922g;

    /* renamed from: h, reason: collision with root package name */
    public String f1923h;

    /* renamed from: i, reason: collision with root package name */
    public g2 f1924i;

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(), R.style.ThemeOverlay_JCarTools_ModernAlert);
        View inflate = LayoutInflater.from(builder.getContext()).inflate(R.layout.pd, (ViewGroup) null);
        builder.setView(inflate);
        this.f1920b = (TextView) inflate.findViewById(R.id.progress_bar_message);
        this.c = (ProgressBar) inflate.findViewById(R.id.progressBar);
        this.d = (ProgressBar) inflate.findViewById(R.id.indeterminateBar);
        this.f1921f = (Button) inflate.findViewById(R.id.button14);
        this.f1924i = this;
        this.f1921f.setOnClickListener(new androidx.navigation.c(6, this));
        this.f1920b.setText(this.f1923h);
        return builder.create();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f1922g.run();
        this.f1924i = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.f1924i.dismiss();
    }
}
