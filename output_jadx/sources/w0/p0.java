package w0;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.recyclerview.widget.RecyclerView;
import com.example.navistart.R;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class p0 extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f6219a;

    /* renamed from: b, reason: collision with root package name */
    public final Spinner f6220b;
    public final CheckBox c;
    public final Button d;

    public p0(View view) {
        super(view);
        this.f6219a = (EditText) view.findViewById(R.id.editPhrase);
        this.f6220b = (Spinner) view.findViewById(R.id.spinnerAction);
        this.c = (CheckBox) view.findViewById(R.id.checkEnabled);
        this.d = (Button) view.findViewById(R.id.btnDelete);
    }
}
