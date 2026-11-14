package m0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.navistart.R;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class i2 extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k2 f3745a;

    public i2(k2 k2Var) {
        this.f3745a = k2Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f3745a.f3765i.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        int i11;
        h2 h2Var = (h2) viewHolder;
        k2 k2Var = this.f3745a;
        j2 j2Var = (j2) k2Var.f3765i.get(i10);
        ImageView imageView = h2Var.f3718a;
        View view = h2Var.c;
        TextView textView = h2Var.f3719b;
        int measuredWidth = imageView.getMeasuredWidth();
        if (measuredWidth <= 0) {
            measuredWidth = (int) (h2Var.itemView.getResources().getDisplayMetrics().density * 64.0f);
        }
        boolean z9 = j2Var.f3751a;
        a5.h hVar = j2Var.f3752b;
        e4.o oVar = j2Var.c;
        Drawable drawable = null;
        if (!z9) {
            imageView.setImageDrawable((Drawable) hVar.e);
            textView.setText((String) hVar.c);
            if (((String) hVar.d).equals(k2Var.f3761b)) {
                drawable = k2Var.getResources().getDrawable(R.drawable.bg_badge_circle);
            }
            view.setBackground(drawable);
        } else {
            view.setBackground(null);
            Drawable drawable2 = (Drawable) ((a5.h) oVar.c).e;
            Drawable drawable3 = (Drawable) ((a5.h) oVar.d).e;
            int i12 = oVar.f2149a;
            int i13 = oVar.f2150b;
            Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredWidth, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int w = (k2.w(i13) * measuredWidth) / 100;
            if (i12 == 1) {
                drawable2.setBounds(0, 0, measuredWidth, w);
                drawable2.draw(canvas);
                drawable3.setBounds(0, w, measuredWidth, measuredWidth);
                drawable3.draw(canvas);
            } else {
                drawable2.setBounds(0, 0, w, measuredWidth);
                drawable2.draw(canvas);
                drawable3.setBounds(w, 0, measuredWidth, measuredWidth);
                drawable3.draw(canvas);
            }
            imageView.setImageDrawable(new BitmapDrawable(k2Var.getResources(), createBitmap));
            String str = (String) ((a5.h) oVar.c).c;
            String str2 = "";
            if (str == null) {
                str = "";
                i11 = 3;
            } else {
                i11 = 3;
                if (str.length() > 3) {
                    str = str.substring(0, 3);
                }
            }
            String str3 = (String) ((a5.h) oVar.d).c;
            if (str3 != null) {
                if (str3.length() > i11) {
                    str2 = str3.substring(0, i11);
                } else {
                    str2 = str3;
                }
            }
            StringBuilder u8 = ai.onnxruntime.a.u(str);
            u8.append(e0.m.h(new byte[]{97}, new byte[]{78, 88, 16, 79, 54, -126, -126, -76}));
            u8.append(str2);
            u8.append("\n");
            u8.append(oVar.f2150b);
            u8.append(e0.m.h(new byte[]{-92}, new byte[]{-117, -84, -32, -115, 91, -13, -127, 1}));
            u8.append(100 - oVar.f2150b);
            textView.setText(u8.toString());
        }
        h2Var.itemView.setOnClickListener(new e0.n0(this, j2Var, h2Var, 3));
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, m0.h2] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_app, viewGroup, false);
        ?? viewHolder = new RecyclerView.ViewHolder(inflate);
        viewHolder.f3718a = (ImageView) inflate.findViewById(R.id.appIcon);
        viewHolder.f3719b = (TextView) inflate.findViewById(R.id.appLabel);
        viewHolder.c = inflate.findViewById(R.id.selected);
        return viewHolder;
    }
}
