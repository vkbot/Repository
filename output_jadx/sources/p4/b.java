package p4;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f4997g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h, reason: collision with root package name */
    public static final SimpleDateFormat f4998h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a, reason: collision with root package name */
    public final String f4999a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5000b;
    public final String c;
    public final Date d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5001f;

    public b(String str, String str2, String str3, Date date, long j10, long j11) {
        this.f4999a = str;
        this.f5000b = str2;
        this.c = str3;
        this.d = date;
        this.e = j10;
        this.f5001f = j11;
    }

    public static void b(HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 5; i10++) {
            String str = f4997g[i10];
            if (!hashMap.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new Exception(String.format("The following keys are missing from the experiment info map: %s", arrayList));
        }
    }

    public final HashMap a() {
        HashMap hashMap = new HashMap();
        hashMap.put("experimentId", this.f4999a);
        hashMap.put("variantId", this.f5000b);
        hashMap.put("triggerEvent", this.c);
        hashMap.put("experimentStartTime", f4998h.format(this.d));
        hashMap.put("triggerTimeoutMillis", Long.toString(this.e));
        hashMap.put("timeToLiveMillis", Long.toString(this.f5001f));
        return hashMap;
    }
}
