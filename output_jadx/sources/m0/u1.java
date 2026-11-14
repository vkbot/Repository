package m0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.navistart.R;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class u1 extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f3870a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f3871b;
    public float c;
    public float d;
    public final /* synthetic */ v1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(v1 v1Var, View view) {
        super(view);
        this.e = v1Var;
        this.f3870a = (ImageView) view.findViewById(R.id.appIcon);
        this.f3871b = (TextView) view.findViewById(R.id.appLabel);
    }

    public static void a(View view) {
        view.animate().translationY(0.0f).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
    }
}
