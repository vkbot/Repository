package h7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import e0.m;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2609a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f2610b;

    public /* synthetic */ h(k kVar, int i10) {
        this.f2609a = i10;
        this.f2610b = kVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i10 = this.f2609a;
        k kVar = this.f2610b;
        switch (i10) {
            case 0:
                Log.d(m.h(new byte[]{-7, 48, -117, -48, 112, 122, -89, 21, -64, 48, -116, -33, 99, 122, -114, 41, -38, 54, -118, -47, 118}, new byte[]{-76, 95, -2, -66, 4, 31, -61, 70}), m.h(new byte[]{-38, -110, 92, -33, 86, 7, -109, -112, -53, -108, 92, -52, 83, 3, -105, -61, -35, -36, 19}, new byte[]{-87, -26, 51, -83, 55, 96, -10, -80}) + intent.getAction() + " " + intent.getDataString());
                kVar.f(context, intent);
                return;
            default:
                Log.d(m.h(new byte[]{99, 15, 92, -113, 68, 41, -88, -86, 90, 15, 91, ByteCompanionObject.MIN_VALUE, 87, 41, -127, -106, 64, 9, 93, -114, 66}, new byte[]{46, 96, 41, -31, 48, 76, -52, -7}), m.h(new byte[]{123, 42, 12, -45, 44, 88, -2, -103, 106, 58, 15, ByteCompanionObject.MIN_VALUE, 58, 16, -79}, new byte[]{14, 89, 110, -13, 78, 42, -111, -8}) + intent.getAction());
                kVar.f(context, intent);
                return;
        }
    }
}
