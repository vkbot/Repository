package com.example.navistart;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import e0.q;
import h0.b;
import v1.d;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class MyApplication extends Application implements ViewModelStoreOwner {
    public static Context c;

    /* renamed from: b, reason: collision with root package name */
    public ViewModelStore f838b;

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        c = context;
        b.o();
        synchronized (b.class) {
            b.s(false);
        }
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        return this.f838b;
    }

    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        p0.b.g(this, false);
        this.f838b = new ViewModelStore();
        Thread.setDefaultUncaughtExceptionHandler(new q(this));
        if (d.f5927b == null) {
            d.f5927b = new d(getApplicationContext(), this);
        }
    }
}
