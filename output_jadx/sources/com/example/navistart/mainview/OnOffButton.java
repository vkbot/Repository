package com.example.navistart.mainview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.navigation.c;
import com.example.navistart.R;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class OnOffButton extends FrameLayout {

    /* renamed from: g, reason: collision with root package name */
    public static Boolean f1045g = Boolean.FALSE;

    /* renamed from: b, reason: collision with root package name */
    public final Button f1046b;
    public final TextView c;
    public final ImageView d;
    public Runnable e;

    /* renamed from: f, reason: collision with root package name */
    public Runnable f1047f;

    public OnOffButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(context, R.layout.onoffbutton, this);
        this.f1046b = (Button) findViewById(R.id.onoff_button);
        this.c = (TextView) findViewById(R.id.textButton);
        this.d = (ImageView) findViewById(R.id.lampOnOff);
        this.f1046b.setOnClickListener(new c(21, this));
    }

    public Boolean getOnOff() {
        return f1045g;
    }

    public void setEnable(Boolean bool) {
        this.f1046b.setEnabled(bool.booleanValue());
    }

    public void setOnOff(Boolean bool) {
        f1045g = bool;
        boolean booleanValue = bool.booleanValue();
        ImageView imageView = this.d;
        if (booleanValue) {
            imageView.setImageResource(R.drawable.lamp_on);
        } else {
            imageView.setImageResource(R.drawable.lamp_off);
        }
    }

    public void setRunnableOff(Runnable runnable) {
        this.f1047f = runnable;
    }

    public void setRunnableOn(Runnable runnable) {
        this.e = runnable;
    }

    public void setTextButton(String str) {
        this.c.setText(str);
    }
}
