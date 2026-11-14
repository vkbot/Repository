package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import a2.b;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import d2.j;
import d2.s;
import e0.v0;
import j2.d;
import j2.i;
import n2.a;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1130a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        byte[] bArr;
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i10 = intent.getExtras().getInt("attemptNumber");
        s.b(context);
        if (queryParameter != null) {
            b b10 = a.b(intValue);
            if (queryParameter2 != null) {
                bArr = Base64.decode(queryParameter2, 0);
            } else {
                bArr = null;
            }
            i iVar = s.a().f1758a;
            iVar.e.execute(new d(iVar, new j(queryParameter, bArr, b10), i10, new v0(17), 0));
            return;
        }
        n0.b.n("Null backendName");
    }
}
