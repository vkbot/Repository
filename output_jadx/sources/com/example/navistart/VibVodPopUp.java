package com.example.navistart;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RelativeLayout;
import e0.j3;
import e0.k3;
import h0.b;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class VibVodPopUp extends Service {

    /* renamed from: b, reason: collision with root package name */
    public static WindowManager f950b;
    public static RelativeLayout c;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        b.a();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(750, 300, b.g().b().m(), 8, -3);
        layoutParams.gravity = 17;
        layoutParams.x = 0;
        layoutParams.y = 0;
        c = (RelativeLayout) LayoutInflater.from(this).inflate(R.layout.vodvib, (ViewGroup) null);
        b.a();
        f950b = b.g().b().f(c, layoutParams);
        Button button = (Button) c.findViewById(R.id.button7);
        button.setOnClickListener(new j3(0));
        Button button2 = (Button) c.findViewById(R.id.button8);
        button2.setOnClickListener(new j3(1));
        Button button3 = (Button) c.findViewById(R.id.button9);
        button3.setOnClickListener(new j3(2));
        ((Button) c.findViewById(R.id.button12)).setOnClickListener(new j3(3));
        button.setOnLongClickListener(new k3(0));
        button2.setOnLongClickListener(new k3(1));
        button3.setOnLongClickListener(new k3(2));
    }
}
