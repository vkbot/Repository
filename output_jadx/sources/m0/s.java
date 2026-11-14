package m0;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.navistart.R;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class s extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f3850a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f3851b;
    public final TextView c;
    public final Button d;
    public final Button e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageButton f3852f;

    public s(View view) {
        super(view);
        this.f3850a = (ImageView) view.findViewById(R.id.storeAppIcon);
        this.f3851b = (TextView) view.findViewById(R.id.storeAppName);
        this.c = (TextView) view.findViewById(R.id.storeAppMeta);
        this.d = (Button) view.findViewById(R.id.storePrimaryAction);
        this.e = (Button) view.findViewById(R.id.storeOpenAction);
        this.f3852f = (ImageButton) view.findViewById(R.id.storeDeleteAction);
    }
}
