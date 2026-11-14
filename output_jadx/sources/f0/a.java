package f0;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import b1.g;
import com.example.navistart.AnalogClockView;
import com.example.navistart.BlackActivity;
import com.example.navistart.R;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class a extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public c f2238b;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof BlackActivity) {
            this.f2238b = (c) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.analogclockfragment, viewGroup, false);
        AnalogClockView analogClockView = (AnalogClockView) inflate.findViewById(R.id.AnalogClockView1);
        analogClockView.setOnClickListener(new androidx.navigation.c(10, this));
        analogClockView.setOnLongClickListener(new g(this, 1));
        return inflate;
    }
}
