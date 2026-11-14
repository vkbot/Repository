package m0;

import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import java.io.File;
import java.util.ArrayList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class j3 implements AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3753b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3754f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f3755g;

    public /* synthetic */ j3(Object obj, ArrayList arrayList, Object obj2, Object obj3, KeyEvent.Callback callback, int i10) {
        this.f3753b = i10;
        this.d = obj;
        this.c = arrayList;
        this.e = obj2;
        this.f3754f = obj3;
        this.f3755g = callback;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        String str;
        int i11 = this.f3753b;
        KeyEvent.Callback callback = this.f3755g;
        Object obj = this.f3754f;
        Object obj2 = this.e;
        ArrayList arrayList = this.c;
        Object obj3 = this.d;
        switch (i11) {
            case 0:
                ((n3) obj3).v((File) arrayList.get(i10), (AlertDialog) obj2, (TextView) obj, (ListView) callback);
                return;
            default:
                s1.q0 q0Var = (s1.q0) obj3;
                android.app.AlertDialog alertDialog = (android.app.AlertDialog) callback;
                ActivityInfo activityInfo = ((ResolveInfo) ((ArrayList) obj).get(arrayList.indexOf((j0.e) ((s1.i0) obj2).c.get(i10)))).activityInfo;
                ArrayList arrayList2 = q0Var.f5594q;
                int size = arrayList2.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj4 = arrayList2.get(i12);
                    i12++;
                    s1.j0 j0Var = (s1.j0) obj4;
                    if (j0Var.f5512b == s1.m0.f5553h && (str = j0Var.f5514g) != null) {
                        if (str.startsWith(activityInfo.packageName + e0.m.h(new byte[]{-20}, new byte[]{-61, -27, 119, 66, 69, -76, 95, -89}))) {
                            y5.k.x(q0Var.getContext(), e0.m.h(new byte[]{-72, 25, -64, -54, 116, 72, 66, 38, -41, 101, -111, -104, 28, 38, -39, 38, -42, 100, -89, -104, 17, 38, -33, 38, -48, 100, -92, 104, 117, 117, -78, 64, -72, 1, 49, -104, 16, 38, -36, 38, -39, 100, -95, -104, 22, 38, -39, 38, -35, 100, -84, -104, 26, -42, -78, 68, 72, 100, -81, -104, 30, 38, -33, 38, -42}, new byte[]{104, -76, 17, 72, -92, -10, 98, -10}));
                            return;
                        }
                    }
                }
                s1.m0 m0Var = s1.m0.f5553h;
                float[] i13 = s1.q0.i(m0Var);
                float[] n10 = q0Var.n(i13[0], i13[1]);
                s1.j0 j0Var2 = new s1.j0(m0Var, n10[0], n10[1], i13[0], i13[1], new ComponentName(activityInfo.packageName, activityInfo.name).flattenToString());
                arrayList2.add(j0Var2);
                q0Var.f5597v = j0Var2.f5511a;
                q0Var.y();
                q0Var.A();
                alertDialog.dismiss();
                return;
        }
    }
}
