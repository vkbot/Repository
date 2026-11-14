package p0;

import android.util.Log;
import android.view.WindowManager;
import android.widget.TextView;
import com.google.protobuf.q;
import e0.m;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4972b;
    public final /* synthetic */ j c;
    public final /* synthetic */ int d;

    public /* synthetic */ h(j jVar, int i10, int i11) {
        this.f4972b = i11;
        this.c = jVar;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z9;
        TextView textView;
        int i10 = this.f4972b;
        int i11 = this.d;
        j jVar = this.c;
        switch (i10) {
            case 0:
                String str = j.f4976l;
                if (j.f4977m == jVar) {
                    TextView textView2 = jVar.f4983i;
                    if (textView2 != null && textView2.isAttachedToWindow()) {
                        Log.i(str, m.h(new byte[]{40, 115, 45, -4, 71, 53, -112, 15, 38, 113, 60, -17, 72, 60, -116, 75, 103, 100, 60, -6, 78, 57, -103, 91, 122}, new byte[]{71, 5, 72, -114, 43, 84, -23, 47}) + i11);
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    q.t(new byte[]{-106, -75, 26, 56, 59, 113, 45, -34, -105, -84, 11, 106, 54, 100, 32, -97, -102, -85, 26, 46, 119, 113, 32, -118, -100, -82, 15, 62, 106}, new byte[]{-7, -61, ByteCompanionObject.MAX_VALUE, 74, 87, 16, 84, -2}, sb, i11);
                    sb.append(m.h(new byte[]{86, -45, 79, 95}, new byte[]{118, -92, 34, 98, -101, -30, 106, -127}));
                    if (jVar.f4981g != null) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    sb.append(z9);
                    Log.w(str, sb.toString());
                    WindowManager windowManager = jVar.f4981g;
                    if (windowManager != null && (textView = jVar.f4983i) != null) {
                        a.a.v(windowManager, textView);
                    }
                    jVar.f4983i = null;
                    jVar.f4982h = null;
                    jVar.f4981g = null;
                    jVar.f4979b.getClass();
                    if (e.e() && i11 < 6) {
                        jVar.h(i11 + 1);
                        return;
                    } else {
                        jVar.d(m.h(new byte[]{87, 103, -30, -124, -23, 21, -107, -113, 86, 126, -13, -42, -28, 0, -104, -50, 91, 121, -30, -110}, new byte[]{56, 17, -121, -10, -123, 116, -20, -81}));
                        return;
                    }
                }
                return;
            default:
                jVar.f(i11 + 1);
                return;
        }
    }
}
