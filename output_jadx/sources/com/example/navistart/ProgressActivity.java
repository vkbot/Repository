package com.example.navistart;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;
import e0.j2;
import e0.m;
import e0.w;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class ProgressActivity extends Activity {
    public static final String e = m.h(new byte[]{-120, -57, 92, -112, -85, 18, -91, -65}, new byte[]{-23, -73, 55, -49, -37, 115, -47, -41});

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f871b = w.c(-1, m.h(new byte[]{7, 11, 21, -6, 82, 59, 105, 99, 22, 26, 14, -12, 86, 55, 110, 105}, new byte[]{87, 121, 122, -99, 32, 94, 26, 16}));
    public ProgressBar c;
    public TextView d;

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_progress);
        this.c = (ProgressBar) findViewById(R.id.progressBar);
        this.d = (TextView) findViewById(R.id.progressText);
        String stringExtra = getIntent().getStringExtra(e);
        if (stringExtra != null) {
            this.f871b.execute(new j2(1, this, stringExtra));
        } else {
            finish();
        }
    }
}
