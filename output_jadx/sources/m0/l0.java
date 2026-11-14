package m0;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.navistart.R;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class l0 extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f3772a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f3773b;
    public final CheckBox c;
    public final Button d;

    public l0(View view) {
        super(view);
        this.f3772a = (ImageView) view.findViewById(R.id.fullscreenIcon);
        this.f3773b = (TextView) view.findViewById(R.id.fullscreenAppName);
        this.c = (CheckBox) view.findViewById(R.id.fullscreenCheck);
        this.d = (Button) view.findViewById(R.id.fullscreenLaunch);
    }
}
