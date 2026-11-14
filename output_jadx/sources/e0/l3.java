package e0;

import android.app.Notification;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RemoteViews;
import android.widget.TextView;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class l3 {

    /* renamed from: a, reason: collision with root package name */
    public Context f1965a;

    /* renamed from: b, reason: collision with root package name */
    public String f1966b;
    public Context c;

    static {
        m.h(new byte[]{-112, 105, 64, -126, -3, -6, -89, -112, -74, 76, 74, -110, -35, -19, -70}, new byte[]{-58, 0, 37, -11, -70, -120, -56, -27});
    }

    public final String a(Notification notification, String str) {
        Context context;
        int identifier;
        String str2 = this.f1966b;
        String h2 = m.h(new byte[]{62, -5}, new byte[]{19, -42, -4, 82, 106, 57, -87, 75});
        RemoteViews remoteViews = notification.bigContentView;
        if (remoteViews == null) {
            remoteViews = notification.contentView;
        }
        ViewGroup viewGroup = null;
        if (remoteViews == null) {
            remoteViews = null;
        }
        if (remoteViews != null) {
            try {
                this.c = this.f1965a.createPackageContext(str2, 2);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            viewGroup = (ViewGroup) ((LayoutInflater) this.c.getSystemService(m.h(new byte[]{80, 54, 78, 95, -101, 109, ByteCompanionObject.MIN_VALUE, -53, 82, 49, 91, 81, -102, 124, -83}, new byte[]{60, 87, 55, 48, -18, 25, -33, -94}))).inflate(remoteViews.getLayoutId(), (ViewGroup) null);
            remoteViews.reapply(this.c, viewGroup);
        }
        if (viewGroup != null && (context = this.c) != null && (identifier = context.getResources().getIdentifier(str, m.h(new byte[]{89, 104}, new byte[]{48, 12, 1, 114, -113, -78, 46, 67}), str2)) != 0) {
            View findViewById = viewGroup.findViewById(identifier);
            if (findViewById instanceof TextView) {
                return ((TextView) findViewById).getText().toString();
            }
        }
        return h2;
    }
}
