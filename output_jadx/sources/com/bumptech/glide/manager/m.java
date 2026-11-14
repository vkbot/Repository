package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.collection.ArrayMap;
import androidx.fragment.app.FragmentActivity;
import q.w;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class m implements Handler.Callback {
    public static final c5.e e = new c5.e(3);

    /* renamed from: a, reason: collision with root package name */
    public volatile com.bumptech.glide.p f667a;

    /* renamed from: b, reason: collision with root package name */
    public final c5.e f668b;
    public final g c;
    public final k d;

    public m() {
        g eVar;
        new ArrayMap();
        c5.e eVar2 = e;
        this.f668b = eVar2;
        this.d = new k(eVar2);
        if (w.f5155f && w.e) {
            eVar = new f();
        } else {
            eVar = new p2.e(2);
        }
        this.c = eVar;
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public final com.bumptech.glide.p b(Context context) {
        boolean z9;
        boolean z10;
        if (context != null) {
            char[] cArr = c0.p.f446a;
            if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
                if (context instanceof FragmentActivity) {
                    FragmentActivity fragmentActivity = (FragmentActivity) context;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (!z9) {
                        return b(fragmentActivity.getApplicationContext());
                    }
                    if (!fragmentActivity.isDestroyed()) {
                        this.c.b(fragmentActivity);
                        Activity a10 = a(fragmentActivity);
                        if (a10 != null && a10.isFinishing()) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        return this.d.a(fragmentActivity, com.bumptech.glide.b.a(fragmentActivity.getApplicationContext()), fragmentActivity.getLifecycle(), fragmentActivity.getSupportFragmentManager(), z10);
                    }
                    j1.i.k("You cannot start a load for a destroyed activity");
                    return null;
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return b(contextWrapper.getBaseContext());
                    }
                }
            }
            if (this.f667a == null) {
                synchronized (this) {
                    try {
                        if (this.f667a == null) {
                            com.bumptech.glide.b a11 = com.bumptech.glide.b.a(context.getApplicationContext());
                            c5.e eVar = this.f668b;
                            z3.f fVar = new z3.f(1);
                            w7.c cVar = new w7.c(2);
                            Context applicationContext = context.getApplicationContext();
                            eVar.getClass();
                            this.f667a = new com.bumptech.glide.p(a11, fVar, cVar, applicationContext);
                        }
                    } finally {
                    }
                }
            }
            return this.f667a;
        }
        j1.i.k("You cannot start a load on a null Context");
        return null;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }
}
