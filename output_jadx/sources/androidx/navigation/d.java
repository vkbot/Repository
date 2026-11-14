package androidx.navigation;

import android.os.Bundle;
import android.view.View;
import e0.m;
import f1.e;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f237b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d(int i10, Bundle bundle) {
        this.c = i10;
        this.d = bundle;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f237b;
        int i11 = this.c;
        Object obj = this.d;
        switch (i10) {
            case 0:
                Navigation.b(i11, (Bundle) obj, view);
                return;
            default:
                int i12 = e.f2247q;
                ((e) obj).O(Integer.valueOf(i11), m.h(new byte[]{-23, -99, 31, 0, -38, 89, 23, -47, -7, -108, 2, 50, -38, 68, 0, -47, -25, -98, 18, 8}, new byte[]{-118, -15, 118, 109, -69, 45, 114, -114}));
                return;
        }
    }

    public /* synthetic */ d(e eVar, int i10) {
        this.d = eVar;
        this.c = i10;
    }
}
