package m0;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.navistart.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class g1 extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.fragment.app.h f3701a;

    /* renamed from: b, reason: collision with root package name */
    public final List f3702b;
    public final /* synthetic */ i1 c;

    public g1(i1 i1Var, ArrayList arrayList, androidx.fragment.app.h hVar) {
        this.c = i1Var;
        this.f3702b = arrayList;
        this.f3701a = hVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f3702b.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, q.i] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        String str;
        String str2;
        String trim;
        String string;
        f1 f1Var = (f1) viewHolder;
        h1 h1Var = (h1) this.f3702b.get(i10);
        TextView textView = f1Var.f3692b;
        Button button = f1Var.d;
        String str3 = h1Var.f3712b;
        if (str3 != null && !str3.trim().isEmpty()) {
            str = h1Var.f3712b;
        } else {
            str = h1Var.c;
        }
        textView.setText(str);
        TextView textView2 = f1Var.c;
        String h2 = e0.m.h(new byte[]{62, 65, -67, -91, -42, 123, -4, -59}, new byte[]{82, 32, -56, -53, -75, 19, -103, -73});
        i1 i1Var = this.c;
        if (h2.equals(i1Var.f3743g)) {
            str2 = h1Var.e + e0.m.h(new byte[]{11, -93}, new byte[]{39, -125, 29, -12, -56, 6, 110, -20}) + h1Var.f3713f;
        } else {
            str2 = h1Var.d + e0.m.h(new byte[]{118, -50}, new byte[]{90, -18, -96, 56, 22, -107, -106, -79}) + h1Var.e + e0.m.h(new byte[]{62, -46}, new byte[]{18, -14, 85, -11, -127, 89, -21, -94}) + h1Var.f3713f;
        }
        textView2.setText(str2);
        com.bumptech.glide.p c = com.bumptech.glide.b.c(i1Var);
        String str4 = h1Var.f3714g;
        if (str4 == null) {
            trim = null;
        } else {
            trim = str4.trim();
        }
        c.getClass();
        com.bumptech.glide.l z9 = new com.bumptech.glide.l(c.f683b, c, Drawable.class, c.c).z(trim);
        z9.getClass();
        q.o oVar = q.o.f5139b;
        ((com.bumptech.glide.l) ((com.bumptech.glide.l) ((com.bumptech.glide.l) z9.r(new Object())).j(R.drawable.ic_launcher_foreground)).e(R.drawable.ic_launcher_foreground)).x(f1Var.f3691a);
        if (h1Var.f3716i) {
            button.setEnabled(false);
            button.setText(h1Var.f3717j);
        } else {
            button.setEnabled(true);
            if (e0.m.h(new byte[]{-67, -65, -35, 1, 46, 13, 15, 91}, new byte[]{-47, -34, -88, 111, 77, 101, 106, 41}).equals(i1Var.f3743g)) {
                string = e0.m.h(new byte[]{110, -68, ByteCompanionObject.MIN_VALUE, -120, 87, -11, -115, 76, 110, -94, -127, -73, 86, -59, -115, 68, 111, -99, ByteCompanionObject.MIN_VALUE, -123}, new byte[]{-66, 31, 81, 9, -122, 119, 93, -4});
            } else {
                string = i1Var.getString(R.string.download);
            }
            button.setText(string);
        }
        button.setOnClickListener(new androidx.navigation.ui.a(11, this, f1Var));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new f1(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_project, viewGroup, false));
    }
}
