package h7;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.navistart.R;
import com.woha.appmanag.ManageAppsActivity;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f extends BaseAdapter {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ManageAppsActivity f2606b;

    public f(ManageAppsActivity manageAppsActivity) {
        this.f2606b = manageAppsActivity;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f2606b.f1669b.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        return this.f2606b.f1669b.get(i10);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        ManageAppsActivity manageAppsActivity = this.f2606b;
        if (view == null) {
            view = manageAppsActivity.getLayoutInflater().inflate(R.layout.package_item, viewGroup, false);
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.packageIcon);
        TextView textView = (TextView) view.findViewById(R.id.packageTitle);
        TextView textView2 = (TextView) view.findViewById(R.id.packageSubtitle);
        g gVar = (g) manageAppsActivity.f1669b.get(i10);
        imageView.setImageDrawable(gVar.c);
        textView.setText(gVar.f2607a);
        textView2.setText(gVar.f2608b);
        return view;
    }
}
