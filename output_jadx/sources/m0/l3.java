package m0;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.format.Formatter;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.navistart.R;
import kotlin.io.encoding.Base64;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class l3 extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.p f3776a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n3 f3777b;

    public l3(n3 n3Var) {
        this.f3777b = n3Var;
        this.f3776a = com.bumptech.glide.b.c(n3Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f3777b.c.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, q.i] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        m3 m3Var = (m3) viewHolder;
        k3 k3Var = (k3) this.f3777b.c.get(i10);
        m3Var.f3793b.setText(k3Var.f3768a);
        TextView textView = m3Var.c;
        StringBuilder sb = new StringBuilder();
        Context context = m3Var.itemView.getContext();
        long j10 = k3Var.c;
        sb.append(Formatter.formatShortFileSize(context, j10));
        sb.append(e0.m.h(new byte[]{90, 3, 118, 89}, new byte[]{122, -63, -63, 121, -113, Base64.padSymbol, 125, -36}));
        sb.append(k3Var.f3769b);
        textView.setText(sb.toString());
        com.bumptech.glide.p pVar = this.f3776a;
        pVar.getClass();
        com.bumptech.glide.l lVar = (com.bumptech.glide.l) new com.bumptech.glide.l(pVar.f683b, pVar, Bitmap.class, pVar.c).a(com.bumptech.glide.p.f682l).z(k3Var.e).n(new b0.b(k3Var.d + e0.m.h(new byte[]{-124}, new byte[]{-66, -64, 116, -71, 38, 37, -123, -63}) + j10));
        lVar.getClass();
        com.bumptech.glide.l lVar2 = (com.bumptech.glide.l) lVar.m(q.f0.d, 1000000L);
        lVar2.getClass();
        q.o oVar = q.o.f5139b;
        ((com.bumptech.glide.l) ((com.bumptech.glide.l) ((com.bumptech.glide.l) lVar2.r(new Object())).j(R.drawable.video_preview_placeholder)).e(R.drawable.video_preview_placeholder)).x(m3Var.f3792a);
        m3Var.itemView.setOnClickListener(new androidx.navigation.ui.a(16, this, k3Var));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new m3(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_video, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        m3 m3Var = (m3) viewHolder;
        ImageView imageView = m3Var.f3792a;
        com.bumptech.glide.p pVar = this.f3776a;
        pVar.getClass();
        pVar.k(new com.bumptech.glide.n(imageView));
        m3Var.itemView.setOnClickListener(null);
    }
}
