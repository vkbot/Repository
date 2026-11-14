package c7;

import android.hardware.Camera;
import android.os.Handler;
import android.util.Log;
import java.util.ArrayList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: g, reason: collision with root package name */
    public static final ArrayList f542g;

    /* renamed from: a, reason: collision with root package name */
    public boolean f543a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f544b;
    public final boolean c;
    public final Camera d;
    public final Handler e;

    /* renamed from: f, reason: collision with root package name */
    public final a f545f;

    static {
        ArrayList arrayList = new ArrayList(2);
        f542g = arrayList;
        arrayList.add("auto");
        arrayList.add("macro");
    }

    public b(Camera camera, j jVar) {
        b4.k kVar = new b4.k(2, this);
        this.f545f = new a(this);
        this.e = new Handler(kVar);
        this.d = camera;
        String focusMode = camera.getParameters().getFocusMode();
        jVar.getClass();
        boolean contains = f542g.contains(focusMode);
        this.c = contains;
        Log.i("b", "Current focus mode '" + focusMode + "'; use auto focus? " + contains);
        this.f543a = false;
        b();
    }

    public final synchronized void a() {
        if (!this.f543a && !this.e.hasMessages(1)) {
            Handler handler = this.e;
            handler.sendMessageDelayed(handler.obtainMessage(1), 2000L);
        }
    }

    public final void b() {
        if (this.c && !this.f543a && !this.f544b) {
            try {
                this.d.autoFocus(this.f545f);
                this.f544b = true;
            } catch (RuntimeException e) {
                Log.w("b", "Unexpected exception while focusing", e);
                a();
            }
        }
    }

    public final void c() {
        this.f543a = true;
        this.f544b = false;
        this.e.removeMessages(1);
        if (this.c) {
            try {
                this.d.cancelAutoFocus();
            } catch (RuntimeException e) {
                Log.w("b", "Unexpected exception while cancelling focusing", e);
            }
        }
    }
}
