package l0;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.example.navistart.R;
import com.example.navistart.W;
import e0.j2;
import e0.m;
import java.util.Objects;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class a extends DialogFragment {
    public static final String d = m.h(new byte[]{45, -25, -4, -80, -29, 121, 26, -109, 20, -10, -15, -74, -3, 111}, new byte[]{75, -107, -99, -41, -114, 28, 116, -25});
    public static final String e = m.h(new byte[]{110, -127, -42, -107, 113, 75, 78, 63, 87, -110, -59, -107, 111}, new byte[]{8, -13, -73, -14, 28, 46, 32, 75});

    /* renamed from: b, reason: collision with root package name */
    public boolean f3490b;
    public LinearLayout c;

    public static a t(Class cls, Bundle bundle) {
        a aVar = new a();
        Bundle bundle2 = new Bundle();
        bundle2.putString(d, cls.getName());
        if (bundle != null) {
            bundle2.putBundle(e, bundle);
        }
        aVar.setArguments(bundle2);
        return aVar;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.Theme_JCarTools_Uni_Dialog);
        AppCompatDelegate.setDefaultNightMode(1);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Window window = onCreateDialog.getWindow();
        Objects.requireNonNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.dialoguni, viewGroup, false);
        this.c = (LinearLayout) inflate.findViewById(R.id.dialoguniLinearLayout);
        return inflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        FragmentActivity activity;
        super.onDismiss(dialogInterface);
        if (this.f3490b && (getActivity() instanceof W) && (activity = getActivity()) != null && !activity.isFinishing() && !activity.isDestroyed()) {
            ((W) activity).finish();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            view.post(new j2(15, this, view));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            String string = requireArguments().getString(d);
            Bundle bundle2 = requireArguments().getBundle(e);
            if (bundle2 != null && bundle2.getBoolean(m.h(new byte[]{63, -43, -54, -106, 23, 1, -2, 5, 2, -41, -62, -120, 25, 6, -49, 9, 52, -48, -56, -118}, new byte[]{93, -76, -83, -28, 118, 116, -112, 97}))) {
                this.c.setBackgroundColor(0);
            }
            try {
                Fragment fragment = (Fragment) Class.forName(string).newInstance();
                if (bundle2 != null) {
                    fragment.setArguments(bundle2);
                }
                getChildFragmentManager().beginTransaction().replace(R.id.dialogContent, fragment).commit();
            } catch (Exception unused) {
            }
        }
        view.setVisibility(4);
    }
}
