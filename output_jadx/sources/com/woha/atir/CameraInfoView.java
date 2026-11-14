package com.woha.atir;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.navistart.R;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class CameraInfoView extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public ImageView f1670b;
    public TextView c;
    public TextView d;
    public ImageView e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f1671f;

    public CameraInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public final void a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.camera_info_view, (ViewGroup) this, true);
        setOrientation(1);
        this.f1670b = (ImageView) findViewById(R.id.cameraImage);
        this.c = (TextView) findViewById(R.id.distanceToCamera);
        this.d = (TextView) findViewById(R.id.typeCamera);
        this.e = (ImageView) findViewById(R.id.speedSignImage);
        this.f1671f = (TextView) findViewById(R.id.speedLimitText);
        setVisibility(8);
    }

    public void setCameraImageResource(int i10) {
        int i11;
        if (i10 != 1) {
            if (i10 != 3) {
                if (i10 != 11) {
                    i11 = 0;
                } else {
                    i11 = R.drawable.camera_na_polosu;
                }
            } else {
                i11 = R.drawable.cam_red1;
            }
        } else {
            i11 = R.drawable.camera_alarm_show;
        }
        this.f1670b.setImageResource(i11);
    }

    public void setDistance(String str) {
        this.c.setText(str);
    }

    public void setSpeedLimit(int i10) {
        this.f1671f.setText(String.valueOf(i10));
    }

    public void setSpeedSignImageResource(int i10) {
        this.e.setImageResource(i10);
    }

    public void setTypeCamera(String str) {
        this.d.setText(str);
    }
}
