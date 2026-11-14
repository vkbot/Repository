package m0;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.navistart.R;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f1 extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f3691a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f3692b;
    public final TextView c;
    public final Button d;

    public f1(View view) {
        super(view);
        this.f3691a = (ImageView) view.findViewById(R.id.imgPreview);
        this.f3692b = (TextView) view.findViewById(R.id.txtName);
        this.c = (TextView) view.findViewById(R.id.txtType);
        this.d = (Button) view.findViewById(R.id.down);
    }
}
