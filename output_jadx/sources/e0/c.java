package e0;

import android.view.View;
import android.view.WindowManager;
import com.example.navistart.AllWidgetServices;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1892b;
    public final /* synthetic */ AllWidgetServices c;

    public /* synthetic */ c(AllWidgetServices allWidgetServices, int i10) {
        this.f1892b = i10;
        this.c = allWidgetServices;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1892b) {
            case 0:
                AllWidgetServices allWidgetServices = this.c;
                Iterator it = allWidgetServices.e.entrySet().iterator();
                while (it.hasNext()) {
                    View view = (View) ((Map.Entry) it.next()).getValue();
                    if (view instanceof x0.c) {
                        WindowManager windowManager = (WindowManager) allWidgetServices.f697f.remove(view);
                        if (windowManager != null) {
                            a.a.v(windowManager, view);
                        }
                        it.remove();
                    }
                }
                allWidgetServices.a();
                return;
            case 1:
                AllWidgetServices allWidgetServices2 = this.c;
                AllWidgetServices allWidgetServices3 = AllWidgetServices.f693g;
                for (h hVar : h.values()) {
                    String concat = m.h(new byte[]{112, -35, 105, 125, 123, 75, 56, -96, 69, -30, 96, 88, 100, 70, 60, -96, 66, -18}, new byte[]{49, -79, 5, 42, 18, 47, 95, -59}).concat(hVar.f1931b);
                    if (hVar == h.f1928h) {
                        allWidgetServices2.e(hVar, AllWidgetServices.f694h);
                    } else {
                        allWidgetServices2.b((View) allWidgetServices2.e.get(concat), concat);
                    }
                }
                for (Map.Entry entry : allWidgetServices2.e.entrySet()) {
                    if (entry.getValue() instanceof x0.c) {
                        allWidgetServices2.b((View) entry.getValue(), (String) entry.getKey());
                    }
                }
                return;
            default:
                View view2 = (View) this.c.e.get(m.h(new byte[]{56, -35, -19, 56, 71, 24, 97, 46, 13, -30, -28, 29, 88, 21, 101, 46, 10, -18, -57, 26, 75, 16, 84, 46, 20, -48, -24, 1, 71, 18, 97, 29, 16, -44, -10}, new byte[]{121, -79, -127, 111, 46, 124, 6, 75}));
                if (view2 instanceof t1.e) {
                    ((t1.e) view2).b();
                    return;
                }
                return;
        }
    }
}
