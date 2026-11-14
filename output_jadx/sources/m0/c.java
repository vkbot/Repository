package m0;

import android.content.Context;
import android.os.Handler;
import com.example.navistart.R;
import java.util.function.BiConsumer;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f3612a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3613b;
    public final /* synthetic */ Context c;

    public /* synthetic */ c(i iVar, int i10, Context context) {
        this.f3612a = iVar;
        this.f3613b = i10;
        this.c = context;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        final Integer num = (Integer) obj;
        final Integer num2 = (Integer) obj2;
        final i iVar = this.f3612a;
        Handler handler = iVar.f3728g;
        final int i10 = this.f3613b;
        final Context context = this.c;
        handler.post(new Runnable() { // from class: m0.f
            @Override // java.lang.Runnable
            public final void run() {
                i iVar2 = i.this;
                int i11 = i10;
                Context context2 = context;
                Integer num3 = num;
                Integer num4 = num2;
                if (i11 == iVar2.f3731j && iVar2.isAdded()) {
                    iVar2.d.setText(context2.getString(R.string.app_permission_grant_running) + " " + num3 + e0.m.h(new byte[]{-117}, new byte[]{-92, -40, 5, 86, -80, -119, -89, 26}) + num4);
                }
            }
        });
    }
}
