package com.example.navistart.cores;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import okhttp3.OkHttpClient;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public interface InterB {
    void a(Boolean bool, String str, Long l10, Long l11);

    void bind(String str);

    void e(String str, Context context);

    void fuul(Context context);

    CarCmdProxy gcmdp();

    Class<?> getA(String str);

    String getK();

    int getR(String str);

    ScheduledExecutorService getScheduler(String str, int i10);

    ScheduledThreadPoolExecutor getScheduler(String str);

    String getbind();

    long getl();

    byte[] getmir();

    byte[] getmiru();

    byte[] getmur();

    byte[] getp2();

    SettingsdProxy getsettingsd();

    ProBroProxy gprobrop();

    ProLanProxy gprolanp();

    OkHttpClient h();

    void l(String str);

    void lf(Context context, Class<? extends Fragment> cls, Bundle bundle);

    void li(String str);

    void li(String str, ColorText colorText);

    void mb();

    void mn();

    void mpa();

    void pc();

    void setMO(boolean z9);

    void ss();

    default void setMediaVolumePercent(int i10, Context context) {
    }
}
