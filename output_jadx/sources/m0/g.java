package m0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.navistart.R;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class g extends ArrayAdapter {

    /* renamed from: b, reason: collision with root package name */
    public final LayoutInflater f3698b;
    public final PackageManager c;

    public g(i iVar, Context context) {
        super(context, R.layout.item_permission_grant_app, iVar.f3727f);
        this.f3698b = LayoutInflater.from(context);
        this.c = context.getPackageManager();
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        return getView(i10, view, viewGroup);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        PackageManager packageManager = this.c;
        if (view == null) {
            view = this.f3698b.inflate(R.layout.item_permission_grant_app, viewGroup, false);
        }
        h hVar = (h) getItem(i10);
        ImageView imageView = (ImageView) view.findViewById(R.id.permissionAppIcon);
        TextView textView = (TextView) view.findViewById(R.id.permissionAppName);
        TextView textView2 = (TextView) view.findViewById(R.id.permissionAppPackage);
        if (hVar != null) {
            String str = hVar.f3709b;
            if (hVar.c == null) {
                try {
                    hVar.c = packageManager.getApplicationIcon(str);
                } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
                    hVar.c = packageManager.getDefaultActivityIcon();
                }
            }
            imageView.setImageDrawable(hVar.c);
            textView.setText(hVar.f3708a);
            textView2.setText(str);
            return view;
        }
        imageView.setImageDrawable(null);
        textView.setText("");
        textView2.setText("");
        return view;
    }
}
