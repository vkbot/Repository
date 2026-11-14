package t1;

import android.graphics.Bitmap;
import android.util.Log;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.navistart.R;
import com.google.protobuf.q;
import e0.p3;
import e0.x1;
import ru.transfer.MessageData;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public TextView f5759b;
    public TextView c;
    public ImageButton d;
    public ImageButton e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5760f;

    /* renamed from: g, reason: collision with root package name */
    public EditText f5761g;

    /* renamed from: h, reason: collision with root package name */
    public LinearLayout f5762h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f5763i;

    /* renamed from: j, reason: collision with root package name */
    public ImageView f5764j;

    /* renamed from: k, reason: collision with root package name */
    public g f5765k;

    public void setMessage(MessageData messageData) {
        Boolean bool;
        StringBuilder sb = new StringBuilder();
        u0.a o5 = h0.b.o();
        byte[] bArr = e0.m.f1973j;
        String[] strArr = p3.f2001a;
        q.s(bArr, o5, "", sb);
        q.r(new byte[]{108, 105, 99, 116, 95, 114, 105, 117, 101}, sb);
        String g10 = q.g(sb, x1.f2066q);
        u0.a o9 = h0.b.o();
        byte[] bArr2 = e0.m.f1969f;
        if (q.w(bArr2, o9, "", g10)) {
            boolean z9 = true;
            if (q.d(Long.MAX_VALUE, h0.b.a().j()) >= Long.parseLong(new String(q.x(new byte[]{-36}, new byte[]{-20, 72, 83, -52, 55, 54, 62, -120}, h0.b.o(), q.h(e0.m.f1970g, h0.b.o(), new String(bArr2)), 0)))) {
                z9 = false;
            }
            bool = Boolean.valueOf(z9);
        } else {
            bool = Boolean.FALSE;
        }
        if (bool.booleanValue()) {
            Bitmap iconBitmap = messageData.getIconBitmap();
            String sender = messageData.getSender();
            String message = messageData.getMessage();
            ImageView imageView = this.f5764j;
            if (iconBitmap != null) {
                imageView.setImageBitmap(iconBitmap);
            } else {
                imageView.setImageResource(R.drawable.icon_voice_message_6376305);
            }
            this.c.setText(sender);
            this.f5759b.setText(message);
            if (messageData.gethasReply()) {
                this.f5762h.setVisibility(0);
                this.f5763i.setVisibility(0);
                this.d.setOnClickListener(new androidx.navigation.ui.a(22, this, messageData));
            }
        }
    }

    public void setMessageDataViewListener(g gVar) {
        this.f5765k = gVar;
    }

    public void seteditTextMessadge(String str) {
        if (this.f5760f) {
            String str2 = this.f5761g.getText().toString() + " " + str;
            Log.d(e0.m.h(new byte[]{-28, -7, 76, -25, 81, 60, 80, 39, -14, -28, 76, -49, 80, 38, 87, 18, -13, -5, 93}, new byte[]{-105, -100, 56, -126, 53, 85, 36, 115}), str2);
            this.f5761g.setText(str2);
        }
    }
}
