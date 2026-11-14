package m7;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.navistart.R;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f3951a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f3952b;
    public final TextView c;

    public e(View view) {
        super(view);
        this.f3951a = (TextView) view.findViewById(R.id.ssidText);
        this.f3952b = (TextView) view.findViewById(R.id.statusText);
        this.c = (TextView) view.findViewById(R.id.signalText);
    }
}
