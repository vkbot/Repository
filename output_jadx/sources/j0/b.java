package j0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.example.navistart.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b extends ArrayAdapter {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3089b = 0;

    public b(Context context, List list) {
        super(context, R.layout.spinner_text, list);
        setDropDownViewResource(R.layout.simple_spinner_dropdown);
    }

    public static int a(int i10, Context context) {
        return Math.round(i10 * context.getResources().getDisplayMetrics().density);
    }

    public static int b(int i10, Context context) {
        return Math.round(i10 * context.getResources().getDisplayMetrics().density);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0164 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.widget.LinearLayout c(int r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.b.c(int, boolean):android.widget.LinearLayout");
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        switch (this.f3089b) {
            case 0:
                return c(i10, true);
            default:
                return c(i10, true);
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        switch (this.f3089b) {
            case 0:
                return c(i10, false);
            default:
                return c(i10, false);
        }
    }

    public b(Context context, ArrayList arrayList) {
        super(context, R.layout.spinner_text, arrayList);
        setDropDownViewResource(R.layout.simple_spinner_dropdown);
    }
}
