package c5;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f534a;

    public i(Context context, String str) {
        this.f534a = context.getSharedPreferences("FirebaseHeartBeat".concat(str), 0);
    }

    public final synchronized void a() {
        try {
            long j10 = this.f534a.getLong("fire-count", 0L);
            String str = "";
            String str2 = null;
            for (Map.Entry<String, ?> entry : this.f534a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str3 : (Set) entry.getValue()) {
                        if (str2 != null && str2.compareTo(str3) <= 0) {
                        }
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet = new HashSet(this.f534a.getStringSet(str, new HashSet()));
            hashSet.remove(str2);
            this.f534a.edit().putStringSet(str, hashSet).putLong("fire-count", j10 - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            SharedPreferences.Editor edit = this.f534a.edit();
            int i10 = 0;
            for (Map.Entry<String, ?> entry : this.f534a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String d = d(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(d)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(d);
                        i10++;
                        edit.putStringSet(key, hashSet);
                    } else {
                        edit.remove(key);
                    }
                }
            }
            if (i10 == 0) {
                edit.remove("fire-count");
            } else {
                edit.putLong("fire-count", i10);
            }
            edit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized ArrayList c() {
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.f534a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(d(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new a(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.f534a.edit().putLong("fire-global", currentTimeMillis).commit();
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized String d(long j10) {
        Instant instant;
        OffsetDateTime atOffset;
        LocalDateTime localDateTime;
        String format;
        ZoneOffset unused;
        DateTimeFormatter unused2;
        if (Build.VERSION.SDK_INT >= 26) {
            instant = new Date(j10).toInstant();
            unused = ZoneOffset.UTC;
            atOffset = instant.atOffset(ZoneOffset.UTC);
            localDateTime = atOffset.toLocalDateTime();
            unused2 = DateTimeFormatter.ISO_LOCAL_DATE;
            format = localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE);
            return format;
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j10));
    }

    public final synchronized String e(String str) {
        for (Map.Entry<String, ?> entry : this.f534a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    public final synchronized void f(String str) {
        try {
            String e = e(str);
            if (e == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.f534a.getStringSet(e, new HashSet()));
            hashSet.remove(str);
            boolean isEmpty = hashSet.isEmpty();
            SharedPreferences sharedPreferences = this.f534a;
            if (isEmpty) {
                sharedPreferences.edit().remove(e).commit();
            } else {
                sharedPreferences.edit().putStringSet(e, hashSet).commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void g(long j10, String str) {
        String d = d(j10);
        if (this.f534a.getString("last-used-date", "").equals(d)) {
            String e = e(d);
            if (e == null) {
                return;
            }
            if (e.equals(str)) {
                return;
            }
            h(str, d);
            return;
        }
        long j11 = this.f534a.getLong("fire-count", 0L);
        if (j11 + 1 == 30) {
            a();
            j11 = this.f534a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f534a.getStringSet(str, new HashSet()));
        hashSet.add(d);
        this.f534a.edit().putStringSet(str, hashSet).putLong("fire-count", j11 + 1).putString("last-used-date", d).commit();
    }

    public final synchronized void h(String str, String str2) {
        f(str2);
        HashSet hashSet = new HashSet(this.f534a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f534a.edit().putStringSet(str, hashSet).commit();
    }
}
