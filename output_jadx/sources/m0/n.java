package m0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.navistart.R;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class n extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f3794a;

    public n(o oVar) {
        this.f3794a = oVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f3794a.d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        m mVar = (m) viewHolder;
        l lVar = (l) this.f3794a.d.get(i10);
        mVar.f3778a.setImageDrawable(lVar.c);
        mVar.f3779b.setText(lVar.f3770a);
        mVar.itemView.setOnClickListener(new androidx.navigation.ui.a(7, this, lVar));
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [m0.m, androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_app, viewGroup, false);
        ?? viewHolder = new RecyclerView.ViewHolder(inflate);
        viewHolder.f3778a = (ImageView) inflate.findViewById(R.id.appIcon);
        viewHolder.f3779b = (TextView) inflate.findViewById(R.id.appLabel);
        return viewHolder;
    }
}
