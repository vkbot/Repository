package e0;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.example.navistart.MainActivity;
import com.example.navistart.ModernMainActivity;
import com.example.navistart.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class i1 extends ArrayAdapter {

    /* renamed from: b, reason: collision with root package name */
    public final LayoutInflater f1940b;
    public final boolean c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.content.Context] */
    public i1(MainActivity mainActivity, ArrayList arrayList) {
        super(mainActivity, R.layout.spinner_app_item, arrayList);
        boolean z9;
        ?? baseContext;
        this.f1940b = LayoutInflater.from(mainActivity);
        while (true) {
            z9 = false;
            if (mainActivity != null) {
                if (mainActivity instanceof ModernMainActivity) {
                    z9 = true;
                    break;
                } else if (!(mainActivity instanceof ContextWrapper) || (baseContext = mainActivity.getBaseContext()) == mainActivity) {
                    break;
                } else {
                    mainActivity = baseContext;
                }
            } else {
                break;
            }
        }
        this.c = z9;
    }

    public static int a(int i10, Context context) {
        return Math.round(i10 * context.getResources().getDisplayMetrics().density);
    }

    public final View b(int i10, View view, ViewGroup viewGroup, boolean z9) {
        g1 g1Var;
        int i11;
        int i12;
        int i13;
        if (view == null) {
            view = this.f1940b.inflate(R.layout.spinner_app_item, viewGroup, false);
            g1Var = new g1((ImageView) view.findViewById(R.id.spinner_app_icon), (TextView) view.findViewById(R.id.spinner_app_name));
            view.setTag(g1Var);
        } else {
            g1Var = (g1) view.getTag();
        }
        j1 j1Var = (j1) getItem(i10);
        if (j1Var != null) {
            g1Var.f1918a.setImageDrawable(j1Var.c);
            g1Var.f1919b.setText(j1Var.f1947b);
        }
        if (this.c) {
            LinearLayout linearLayout = (LinearLayout) view;
            Context context = getContext();
            int i14 = 48;
            if (z9) {
                i11 = 64;
            } else {
                i11 = 48;
            }
            linearLayout.setMinimumHeight(a(i11, context));
            Context context2 = getContext();
            if (z9) {
                i12 = 8;
            } else {
                i12 = 2;
            }
            int a10 = a(i12, context2);
            Context context3 = getContext();
            if (z9) {
                i13 = 12;
            } else {
                i13 = 4;
            }
            linearLayout.setPadding(a(i13, context3), a10, a(48, getContext()), a10);
            if (z9) {
                view.setBackgroundResource(R.drawable.modern_action_row);
            } else {
                view.setBackgroundColor(0);
            }
            TextView textView = g1Var.f1919b;
            ImageView imageView = g1Var.f1918a;
            textView.setTextColor(ContextCompat.getColor(getContext(), R.color.modern_text));
            g1Var.f1919b.setTextSize(17.0f);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(Color.rgb(105, 132, 146));
            gradientDrawable.setCornerRadius(a(11, getContext()));
            gradientDrawable.setStroke(a(1, getContext()), Color.rgb(157, 176, 193));
            imageView.setBackground(gradientDrawable);
            int a11 = a(6, getContext());
            imageView.setPadding(a11, a11, a11, a11);
            Context context4 = getContext();
            if (!z9) {
                i14 = 40;
            }
            int a12 = a(i14, context4);
            imageView.setLayoutParams(new LinearLayout.LayoutParams(a12, a12));
        }
        return view;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        return b(i10, view, viewGroup, true);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        return b(i10, view, viewGroup, false);
    }
}
