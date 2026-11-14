package m0;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import androidx.recyclerview.widget.RecyclerView;
import com.example.navistart.R;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class p1 extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    public final Button f3829a;

    /* renamed from: b, reason: collision with root package name */
    public final Spinner f3830b;
    public final CheckBox c;
    public final Button d;

    public p1(View view) {
        super(view);
        this.f3829a = (Button) view.findViewById(R.id.buttonPhysicalButtonValue);
        this.f3830b = (Spinner) view.findViewById(R.id.spinnerPhysicalButtonAction);
        this.c = (CheckBox) view.findViewById(R.id.checkPhysicalButtonEnabled);
        this.d = (Button) view.findViewById(R.id.btnDeletePhysicalButtonCommand);
    }
}
