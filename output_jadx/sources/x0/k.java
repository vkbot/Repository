package x0;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.example.navistart.SuperWidgets.WidgetBuilderFragment;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class k extends ArrayAdapter {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6457b = 0;
    public final /* synthetic */ WidgetBuilderFragment c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(WidgetBuilderFragment widgetBuilderFragment, Context context, List list) {
        super(context, R.layout.simple_spinner_dropdown_item, list);
        this.c = widgetBuilderFragment;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        int color;
        int color2;
        switch (this.f6457b) {
            case 0:
                TextView textView = (TextView) super.getDropDownView(i10, view, viewGroup);
                WidgetBuilderFragment widgetBuilderFragment = this.c;
                color = widgetBuilderFragment.color(com.example.navistart.R.color.modern_text);
                textView.setTextColor(color);
                color2 = widgetBuilderFragment.color(com.example.navistart.R.color.modern_surface);
                textView.setBackgroundColor(color2);
                textView.setTextSize(15.0f);
                return textView;
            default:
                return super.getDropDownView(i10, view, viewGroup);
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        int color;
        int color2;
        int color3;
        int dp;
        int dp2;
        int dp3;
        int dp4;
        switch (this.f6457b) {
            case 0:
                TextView textView = (TextView) super.getView(i10, view, viewGroup);
                textView.setTextSize(14.0f);
                color = this.c.color(com.example.navistart.R.color.modern_text);
                textView.setTextColor(color);
                return textView;
            default:
                TextView textView2 = (TextView) super.getView(i10, view, viewGroup);
                WidgetBuilderFragment widgetBuilderFragment = this.c;
                color2 = widgetBuilderFragment.color(com.example.navistart.R.color.modern_text);
                textView2.setTextColor(color2);
                color3 = widgetBuilderFragment.color(com.example.navistart.R.color.modern_surface_high);
                textView2.setBackgroundColor(color3);
                textView2.setTextSize(16.0f);
                dp = widgetBuilderFragment.dp(20);
                dp2 = widgetBuilderFragment.dp(14);
                dp3 = widgetBuilderFragment.dp(20);
                dp4 = widgetBuilderFragment.dp(14);
                textView2.setPadding(dp, dp2, dp3, dp4);
                return textView2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(WidgetBuilderFragment widgetBuilderFragment, Context context, String[] strArr) {
        super(context, R.layout.simple_list_item_1, strArr);
        this.c = widgetBuilderFragment;
    }
}
