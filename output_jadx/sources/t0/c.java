package t0;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import androidx.recyclerview.widget.RecyclerView;
import com.example.navistart.R;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    public final Spinner f5742a;

    /* renamed from: b, reason: collision with root package name */
    public final CheckBox f5743b;
    public final Button c;

    public c(View view) {
        super(view);
        this.f5742a = (Spinner) view.findViewById(R.id.spinnerAction);
        this.f5743b = (CheckBox) view.findViewById(R.id.checkEnabled);
        this.c = (Button) view.findViewById(R.id.btnDelete);
    }
}
