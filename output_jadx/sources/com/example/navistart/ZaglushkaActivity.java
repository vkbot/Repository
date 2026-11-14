package com.example.navistart;

import a4.g;
import android.app.Activity;
import android.os.Bundle;
import e0.m;
import e0.w;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class ZaglushkaActivity extends Activity {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f952b = 0;

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        BlackActivity.t(this);
        setContentView(R.layout.activity_zaglushka);
        int i10 = 0;
        if (getIntent() != null && (extras = getIntent().getExtras()) != null) {
            i10 = extras.getInt(m.h(new byte[]{-10, 32, -113, 87, -28, -106, -56, 77}, new byte[]{-126, 73, -30, 51, -127, -6, -83, 52}), 0);
        }
        w.c(-1, m.h(new byte[]{-36, -108, -74, 109, -63, -83, 65, -15, -25, -76, -78, 117, -35, -88, 64, -18, -1}, new byte[]{-122, -11, -47, 1, -76, -34, 41, -102})).schedule(new g(23, this), i10, TimeUnit.MILLISECONDS);
    }
}
