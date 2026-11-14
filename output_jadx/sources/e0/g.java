package e0;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.example.navistart.DialogUni.Fragmenti.ExlantixTelemetryFragment;
import com.example.navistart.MainActivity;
import com.example.navistart.W;
import com.example.navistart.cores.ProxyFactory;
import java.util.List;
import java.util.Locale;
import kotlin.io.encoding.Base64;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements ProxyFactory.ProxyFactoryCreatContext, OnApplyWindowInsetsListener, e4.b0, b8.c, b8.b, b8.d, b8.a, x7.c, j1.u {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1915b;

    @Override // b8.b
    public void accept(Object obj) {
        switch (this.f1915b) {
            case 12:
                e3.d.m("Event Triggered: " + ((String) obj));
                return;
            case 13:
            case 15:
            case 16:
            case 19:
            case 21:
            case 23:
            default:
                Log.w("FIAM.Headless", "Impressions store read fail: " + ((Throwable) obj).getMessage());
                return;
            case 14:
                e3.d.n("App foreground rate limited ? : " + ((Boolean) obj));
                return;
            case 17:
                Locale locale = Locale.US;
                e3.d.n("Successfully fetched " + ((y5.i) obj).q().size() + " messages from backend");
                return;
            case 18:
                Log.w("FIAM.Headless", "Service fetch error: " + ((Throwable) obj).getMessage());
                return;
            case 20:
                Log.w("FIAM.Headless", "Cache write error: " + ((Throwable) obj).getMessage());
                return;
            case 22:
                Log.w("FIAM.Headless", "Impression store read fail: " + ((Throwable) obj).getMessage());
                return;
            case 24:
                e3.d.m("Fetched from cache");
                return;
            case 25:
                Log.w("FIAM.Headless", "Cache read error: " + ((Throwable) obj).getMessage());
                return;
        }
    }

    @Override // b8.c
    public Object apply(Object obj) {
        switch (this.f1915b) {
            case 9:
                return ((y5.c) obj).o();
            case 10:
                List list = (List) obj;
                d8.b.a(list, "source is null");
                return new i8.u(1, list);
            case 11:
                return ((y5.a) obj).n();
            case 21:
                return g8.a.f2488b;
            default:
                x5.c cVar = (x5.c) obj;
                int c = com.bumptech.glide.g.c(cVar.n().r());
                if (c != 0 && c != 1 && c != 2 && c != 3) {
                    e3.d.m("Filtering non-displayable message");
                    return i8.d.f2846b;
                }
                return x7.e.a(cVar);
        }
    }

    @Override // j1.u
    public void c(Context context) {
        if (m.h(new byte[]{-119, -101, -109, -10, 124, 53, -75, -54, -119, -105}, new byte[]{-52, -61, -33, -73, 50, 97, -4, -110}).equals(h0.b.o().loadString(m.h(new byte[]{112, 25, -51, -9, 48, -25, -9, -8, 95, Base64.padSymbol}, new byte[]{51, 88, -97, -89, 66, -120, -111, -111}), ""))) {
            W.u(context, ExlantixTelemetryFragment.class, null);
        }
    }

    @Override // com.example.navistart.cores.ProxyFactory.ProxyFactoryCreatContext
    public Object create(Context context) {
        switch (this.f1915b) {
            case 0:
                return new t1.e(context);
            case 1:
                return new t1.m(context);
            case 2:
                return new s1.n(context);
            default:
                return new s1.u0(context);
        }
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        String str = MainActivity.f750e1;
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return windowInsetsCompat;
    }

    @Override // b8.a
    public void run() {
        e3.d.m("Wrote to cache");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // b8.d
    public boolean test(Object obj) {
        boolean booleanValue;
        switch (this.f1915b) {
            case 15:
                booleanValue = ((Boolean) obj).booleanValue();
                return !booleanValue;
            case 16:
                f5.d dVar = (f5.d) obj;
                if (!TextUtils.isEmpty(dVar.f2277a) && !TextUtils.isEmpty(dVar.f2278b.f3522a)) {
                    return true;
                }
                return false;
            default:
                booleanValue = ((Boolean) obj).booleanValue();
                return !booleanValue;
        }
    }

    public /* synthetic */ g(int i10) {
        this.f1915b = i10;
    }

    @Override // x7.c
    public void d() {
    }
}
