package f0;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import b1.g;
import com.example.navistart.BlackActivity;
import com.example.navistart.R;
import com.example.navistart.mainview.DClock;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class d extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public c f2241b;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof BlackActivity) {
            this.f2241b = (c) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.dclockfragment, viewGroup, false);
        DClock dClock = (DClock) inflate.findViewById(R.id.DClock);
        dClock.setOnClickListener(new androidx.navigation.c(11, this));
        dClock.setOnLongClickListener(new g(this, 2));
        return inflate;
    }
}
