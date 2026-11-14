package s1;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class i0 extends BaseAdapter {
    public final /* synthetic */ q0 d;
    public final ArrayList c = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f5502b = new ArrayList();

    public i0(q0 q0Var, ArrayList arrayList) {
        this.d = q0Var;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            j0.e eVar = (j0.e) obj;
            if (j0.f.d(eVar)) {
                this.f5502b.add(eVar);
            }
        }
        this.c.addAll(this.f5502b);
    }

    public final void a(String str) {
        String lowerCase = str.trim().toLowerCase(Locale.getDefault());
        ArrayList arrayList = this.c;
        arrayList.clear();
        ArrayList arrayList2 = this.f5502b;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            j0.e eVar = (j0.e) obj;
            String lowerCase2 = q0.b(eVar).toLowerCase(Locale.getDefault());
            if (lowerCase.isEmpty() || lowerCase2.contains(lowerCase)) {
                arrayList.add(eVar);
            }
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.c.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        return this.c.get(i10);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        String h2;
        j0.e eVar = (j0.e) this.c.get(i10);
        q0 q0Var = this.d;
        FrameLayout frameLayout = new FrameLayout(q0Var.getContext());
        frameLayout.setPadding(q0Var.l(2), q0Var.l(4), q0Var.l(2), q0Var.l(4));
        LinearLayout linearLayout = new LinearLayout(q0Var.getContext());
        linearLayout.setGravity(16);
        linearLayout.setPadding(q0Var.l(12), q0Var.l(8), q0Var.l(14), q0Var.l(8));
        linearLayout.setBackground(q0Var.G(-15194575, 16, -13679275));
        FrameLayout frameLayout2 = new FrameLayout(q0Var.getContext());
        frameLayout2.setBackground(q0Var.G(-1511437, 14, -8875873));
        if (eVar.f3100j != null) {
            ImageView imageView = new ImageView(q0Var.getContext());
            imageView.setImageDrawable(eVar.f3100j);
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int l10 = q0Var.l(7);
            imageView.setPadding(l10, l10, l10, l10);
            frameLayout2.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        } else {
            TextView P = q0Var.P(e0.m.h(new byte[]{27, -6, -55}, new byte[]{-7, 102, 111, 42, -41, 37, 85, 74}), 27, -14977641);
            P.setGravity(17);
            frameLayout2.addView(P, new FrameLayout.LayoutParams(-1, -1));
        }
        linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(q0Var.l(58), q0Var.l(58)));
        LinearLayout V = q0Var.V();
        V.setGravity(16);
        V.setPadding(q0Var.l(14), 0, q0Var.l(8), 0);
        TextView P2 = q0Var.P(q0.b(eVar), 17, -1);
        P2.setTypeface(Typeface.DEFAULT_BOLD);
        P2.setMaxLines(1);
        P2.setEllipsize(TextUtils.TruncateAt.END);
        V.addView(P2);
        j0.d dVar = eVar.f3094a;
        if (dVar == j0.d.c) {
            h2 = e0.m.h(new byte[]{110, 69, 100, 16, 119, 67, -91, 57, 110, 100, 101, 38, 119, 78, -91, 63, 110, 98, 101, 37}, new byte[]{-66, -38, -75, -112, -89, -5, 117, -126});
        } else if (dVar == j0.d.d) {
            h2 = e0.m.h(new byte[]{-106, 72, -7, ByteCompanionObject.MAX_VALUE, 117, 77, 97, -1, -106, 106, -7, 124, 117, 65, 96, -56, -106, 106, -8, 78, -123, 32, 49, -98, -10, 2, -98, 17, 17, 33, 4, -98, -3, 2, -100, 17, 24, 33, 9, -97, -55, -14, -8, 76, 117, 75, 96, -50, -106, 98, -7, 124, 117, 65}, new byte[]{70, -46, 41, -63, -91, -15, -79, 78});
        } else if (dVar == j0.d.e) {
            h2 = e0.m.h(new byte[]{6, -13, -115, -59, -91, 4, 58, 17, 6, -37, -115, -59, -91, 13, 59, 45, 7, -18, -115, -50, -91, 4, 58, 17, 7, -19, -115, -63, -91, 15, 58, 18, -10, -68, -25, -85, -53, 111, 87, 77, 102, -68, -32, -85, -63, 111, 91}, new byte[]{-42, 108, 93, 123, 117, -65, -21, -99});
        } else {
            h2 = e0.m.h(new byte[]{-78, -27, 96, 110, -97, -35, -91, -73, -77, -12, 97, 91, -98, -23, 84, -27, -42, -92, 4, 53, -9, -115, -11, -28, -32, -92, 3, 53, -10, -116, -63}, new byte[]{98, 116, -79, -27, 78, 92, 116, 53});
        }
        TextView P3 = q0Var.P(h2, 12, -7099975);
        P3.setMaxLines(1);
        V.addView(P3);
        linearLayout.addView(V, new LinearLayout.LayoutParams(0, -1, 1.0f));
        TextView P4 = q0Var.P(e0.m.h(new byte[]{-30, -19, 66}, new byte[]{13, 81, -55, -54, 78, 112, -79, 43}), 26, -9973004);
        P4.setGravity(17);
        linearLayout.addView(P4, new LinearLayout.LayoutParams(q0Var.l(42), -1));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, q0Var.l(76)));
        return frameLayout;
    }
}
