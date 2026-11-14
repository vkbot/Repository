package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import a2.b;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import androidx.annotation.RequiresApi;
import d2.j;
import d2.s;
import e0.j2;
import j2.d;
import j2.i;
import n2.a;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@RequiresApi(api = 21)
/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f1131b = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        byte[] bArr;
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i10 = jobParameters.getExtras().getInt("priority");
        int i11 = jobParameters.getExtras().getInt("attemptNumber");
        s.b(getApplicationContext());
        if (string != null) {
            b b10 = a.b(i10);
            if (string2 != null) {
                bArr = Base64.decode(string2, 0);
            } else {
                bArr = null;
            }
            i iVar = s.a().f1758a;
            iVar.e.execute(new d(iVar, new j(string, bArr, b10), i11, new j2(11, this, jobParameters), 0));
            return true;
        }
        n0.b.n("Null backendName");
        return false;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
