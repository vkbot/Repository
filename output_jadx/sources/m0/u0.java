package m0;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.navistart.R;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class u0 extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f3868a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f3869b;

    public u0(View view) {
        super(view);
        this.f3868a = (TextView) view.findViewById(R.id.logKeycodeEventValue);
        this.f3869b = (TextView) view.findViewById(R.id.logKeycodeEventAction);
    }
}
