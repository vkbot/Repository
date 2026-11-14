package v1;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.ViewModelProvider;
import com.example.navistart.MyApplication;
import e0.m;
import i7.s;
import j1.i;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static d f5927b;

    /* renamed from: a, reason: collision with root package name */
    public final ViewModelProvider f5928a;

    public d(Context context, MyApplication myApplication) {
        this.f5928a = new ViewModelProvider(myApplication, ViewModelProvider.AndroidViewModelFactory.getInstance((Application) context));
    }

    public static d a() {
        d dVar = f5927b;
        if (dVar != null) {
            return dVar;
        }
        i.l(m.h(new byte[]{93, -76, 87, -47, 107, -18, -1, -69, 103, -103, 91, -43, 86, -32, -17, -67, 99, -72, 64, -122, 79, -14, -69, -80, 100, -87, 18, -49, 72, -24, -17, -73, 106, -79, 91, -36, 67, -27}, new byte[]{11, -35, 50, -90, 38, -127, -101, -34}));
        return null;
    }

    public final a b() {
        return (a) this.f5928a.get(a.class);
    }

    public final s c() {
        return (s) this.f5928a.get(s.class);
    }

    public final c d() {
        return (c) this.f5928a.get(c.class);
    }
}
