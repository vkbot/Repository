package u0;

import android.content.Context;
import android.content.SharedPreferences;
import com.example.navistart.cores.SettingsdProxy;
import e0.m;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a implements SettingsdProxy {
    public static final String c = m.h(new byte[]{5, 97, 124}, new byte[]{117, 10, 27, -12, 67, 108, -58, 110});

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f5865a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f5866b = new ConcurrentHashMap();

    public a(Context context) {
        this.f5865a = context.getSharedPreferences(c, 0);
    }

    public final void a(Object obj, String str) {
        if (obj != null) {
            this.f5866b.put(str, obj);
        }
    }

    @Override // com.example.navistart.cores.SettingsdProxy
    public final boolean loadBoolean(String str, boolean z9) {
        ConcurrentHashMap concurrentHashMap = this.f5866b;
        if (concurrentHashMap.containsKey(str)) {
            return ((Boolean) concurrentHashMap.get(str)).booleanValue();
        }
        boolean z10 = this.f5865a.getBoolean(str, z9);
        a(Boolean.valueOf(z10), str);
        return z10;
    }

    @Override // com.example.navistart.cores.SettingsdProxy
    public final int loadInt(String str, int i10) {
        ConcurrentHashMap concurrentHashMap = this.f5866b;
        if (concurrentHashMap.containsKey(str)) {
            return ((Integer) concurrentHashMap.get(str)).intValue();
        }
        int i11 = this.f5865a.getInt(str, i10);
        a(Integer.valueOf(i11), str);
        return i11;
    }

    @Override // com.example.navistart.cores.SettingsdProxy
    public final long loadLong(String str, long j10) {
        ConcurrentHashMap concurrentHashMap = this.f5866b;
        if (concurrentHashMap.containsKey(str)) {
            return ((Long) concurrentHashMap.get(str)).longValue();
        }
        long j11 = this.f5865a.getLong(str, j10);
        a(Long.valueOf(j11), str);
        return j11;
    }

    @Override // com.example.navistart.cores.SettingsdProxy
    public final String loadString(String str, String str2) {
        ConcurrentHashMap concurrentHashMap = this.f5866b;
        if (concurrentHashMap.containsKey(str)) {
            return (String) concurrentHashMap.get(str);
        }
        String string = this.f5865a.getString(str, str2);
        a(string, str);
        return string;
    }

    @Override // com.example.navistart.cores.SettingsdProxy
    public final void saveBoolean(String str, boolean z9) {
        a(Boolean.valueOf(z9), str);
        this.f5865a.edit().putBoolean(str, z9).apply();
    }

    @Override // com.example.navistart.cores.SettingsdProxy
    public final void saveInt(String str, int i10) {
        a(Integer.valueOf(i10), str);
        this.f5865a.edit().putInt(str, i10).apply();
    }

    @Override // com.example.navistart.cores.SettingsdProxy
    public final void saveLong(String str, long j10) {
        a(Long.valueOf(j10), str);
        this.f5865a.edit().putLong(str, j10).apply();
    }

    @Override // com.example.navistart.cores.SettingsdProxy
    public final void saveString(String str, String str2) {
        a(str2, str);
        this.f5865a.edit().putString(str, str2).apply();
    }
}
