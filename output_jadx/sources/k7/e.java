package k7;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.protobuf.q;
import e0.m;
import java.util.HashMap;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public TextView f3428b;
    public TextView c;
    public ImageView d;
    public LinearLayout e;

    /* renamed from: f, reason: collision with root package name */
    public ProgressBar f3429f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f3430g;

    public Boolean getWeatherget() {
        return this.f3430g;
    }

    public void setLoad(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        TextView textView = this.f3428b;
        if (booleanValue) {
            textView.setVisibility(8);
            this.e.setVisibility(8);
            this.f3429f.setVisibility(0);
        } else {
            textView.setVisibility(0);
            this.e.setVisibility(0);
            this.f3429f.setVisibility(8);
        }
    }

    public void setUpdateView(b bVar) {
        String trim;
        TextView textView = this.f3428b;
        String str = bVar.f3425a;
        String str2 = "";
        if (str == null) {
            trim = "";
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put(m.h(new byte[]{68, 56, -17, -73, -52, 98, -107, 93, 68, 56, -17, -72, -52, 103, -108, 100}, new byte[]{-107, -71, 63, 2, 28, -39, 68, -47}), m.h(new byte[]{-4, -57, -89, -81, -2, -63, -19}, new byte[]{45, 70, 119, 26, 46, 122, -61, -73}));
            hashMap.put(m.h(new byte[]{-24, 117, 38, -94, 122, -84, -21, -57, -24, 114, 39, -99, 123, -106, -21, -57, -24, 115}, new byte[]{56, -58, -10, 28, -85, 44, 59, 121}), m.h(new byte[]{-125, 98, 48}, new byte[]{83, -47, 30, 109, -90, 69, 20, -95}));
            hashMap.put(m.h(new byte[]{98, -68, -52, -36, -120, 62, -24, 13, 98, -72, -52, -41, -119, 2, -24, 0, 98, -74}, new byte[]{-78, 3, 28, 98, 89, -65, 56, -72}), m.h(new byte[]{106, 89, -80, -39, -38, 97, -4}, new byte[]{-70, -26, 96, 103, 11, -32, -46, -27}));
            hashMap.put(m.h(new byte[]{-98, 85, 78, -54, 66, 51, -39, 119, -97, 104}, new byte[]{79, -43, -98, 122, -110, -118, 9, -55}), m.h(new byte[]{-110, 12, 97, 36, 114}, new byte[]{67, -116, 76, -12, -49, -44, 100, 34}));
            hashMap.put(m.h(new byte[]{-76, -58, 15, 11, -28, -91, -14, 22, -75, -7, 14, 56, -27, -110}, new byte[]{100, 120, -33, -70, 52, 30, 34, -90}), m.h(new byte[]{-90, -27, 83, 103, -70, -117, 37}, new byte[]{118, 91, -125, -42, 106, 48, 11, 48}));
            hashMap.put(m.h(new byte[]{-18, 82, 72, -121, -22, 85, 53, 97, -18, 86, 72, -126, -22, 90, 52, 88, -17, 107, 73, -71, -22, 88, -59, 4, -127, 6, 34, -29, -70, 48, 102, 4, -116}, new byte[]{63, -42, -104, 50, 58, -31, -27, -44}), m.h(new byte[]{7, 77, 67, -54}, new byte[]{-41, -23, -109, 84, 21, 69, -2, 113}));
            String[] split = str.split(m.h(new byte[]{50, -50, 109}, new byte[]{110, -67, 70, -87, -60, -68, 44, -114}));
            StringBuilder sb = new StringBuilder();
            for (String str3 : split) {
                sb.append((String) hashMap.getOrDefault(str3.toLowerCase(), str3));
                sb.append(" ");
            }
            trim = sb.toString().trim();
        }
        if (trim != null) {
            if (trim.length() <= 20) {
                str2 = trim;
            } else {
                str2 = trim.substring(0, 17).concat(m.h(new byte[]{106}, new byte[]{68, 105, -44, 116, 94, -41, -79, -40}));
            }
        }
        textView.setText(str2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(bVar.f3426b);
        this.c.setText(q.i(new byte[]{80, 45}, new byte[]{-110, -99, -31, -40, 71, -59, -91, 36}, sb2));
        int i10 = bVar.d;
        v1.d.a().d().c.postValue(bVar);
        ImageView imageView = this.d;
        if (i10 == -1) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            this.d.setImageResource(i10);
        }
        this.f3430g = Boolean.TRUE;
    }

    public static void setWeatherData(b bVar) {
    }
}
