package l5;

import android.net.TrafficStats;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import n.p;
import org.json.JSONException;
import org.json.JSONObject;
import t4.l;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d implements e {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f3527m = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final o4.f f3528a;

    /* renamed from: b, reason: collision with root package name */
    public final n5.c f3529b;
    public final l.d c;
    public final k d;
    public final l e;

    /* renamed from: f, reason: collision with root package name */
    public final i f3530f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f3531g;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f3532h;

    /* renamed from: i, reason: collision with root package name */
    public final u4.i f3533i;

    /* renamed from: j, reason: collision with root package name */
    public String f3534j;

    /* renamed from: k, reason: collision with root package name */
    public final HashSet f3535k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f3536l;

    static {
        new AtomicInteger(1);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [l5.i, java.lang.Object] */
    public d(o4.f fVar, k5.b bVar, ExecutorService executorService, u4.i iVar) {
        fVar.a();
        n5.c cVar = new n5.c(fVar.f4359a, bVar);
        l.d dVar = new l.d(fVar);
        if (w7.c.c == null) {
            w7.c.c = new w7.c(15);
        }
        w7.c cVar2 = w7.c.c;
        if (k.c == null) {
            k.c = new k(cVar2);
        }
        k kVar = k.c;
        l lVar = new l(new b(0, fVar));
        ?? obj = new Object();
        this.f3531g = new Object();
        this.f3535k = new HashSet();
        this.f3536l = new ArrayList();
        this.f3528a = fVar;
        this.f3529b = cVar;
        this.c = dVar;
        this.d = kVar;
        this.e = lVar;
        this.f3530f = obj;
        this.f3532h = executorService;
        this.f3533i = iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        r3 = e(r2);
        r4 = r6.c;
        r2 = r2.a();
        r2.c = r3;
        r2.f3935b = 3;
        r2 = r2.a();
        r4.y(r2);
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r6 = this;
            java.lang.Object r0 = l5.d.f3527m
            monitor-enter(r0)
            o4.f r1 = r6.f3528a     // Catch: java.lang.Throwable -> L3f
            r1.a()     // Catch: java.lang.Throwable -> L3f
            android.content.Context r1 = r1.f4359a     // Catch: java.lang.Throwable -> L3f
            l.d r1 = l.d.a(r1)     // Catch: java.lang.Throwable -> L3f
            l.d r2 = r6.c     // Catch: java.lang.Throwable -> L37
            m5.b r2 = r2.J()     // Catch: java.lang.Throwable -> L37
            int r3 = r2.f3940b     // Catch: java.lang.Throwable -> L37
            r4 = 2
            r5 = 1
            if (r3 == r4) goto L1e
            if (r3 != r5) goto L1d
            goto L1e
        L1d:
            r5 = 0
        L1e:
            if (r5 == 0) goto L39
            java.lang.String r3 = r6.e(r2)     // Catch: java.lang.Throwable -> L37
            l.d r4 = r6.c     // Catch: java.lang.Throwable -> L37
            m5.a r2 = r2.a()     // Catch: java.lang.Throwable -> L37
            r2.c = r3     // Catch: java.lang.Throwable -> L37
            r3 = 3
            r2.f3935b = r3     // Catch: java.lang.Throwable -> L37
            m5.b r2 = r2.a()     // Catch: java.lang.Throwable -> L37
            r4.y(r2)     // Catch: java.lang.Throwable -> L37
            goto L39
        L37:
            r2 = move-exception
            goto L51
        L39:
            if (r1 == 0) goto L41
            r1.L()     // Catch: java.lang.Throwable -> L3f
            goto L41
        L3f:
            r1 = move-exception
            goto L57
        L41:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            r6.h(r2)
            u4.i r0 = r6.f3533i
            l5.c r1 = new l5.c
            r2 = 1
            r1.<init>(r6, r2)
            r0.execute(r1)
            return
        L51:
            if (r1 == 0) goto L56
            r1.L()     // Catch: java.lang.Throwable -> L3f
        L56:
            throw r2     // Catch: java.lang.Throwable -> L3f
        L57:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.d.a():void");
    }

    public final m5.b b(m5.b bVar) {
        int responseCode;
        boolean z9;
        n5.b f8;
        n5.c cVar = this.f3529b;
        o4.f fVar = this.f3528a;
        fVar.a();
        String str = fVar.c.f4367a;
        String str2 = bVar.f3939a;
        o4.f fVar2 = this.f3528a;
        fVar2.a();
        String str3 = fVar2.c.f4370g;
        String str4 = bVar.d;
        b2.b bVar2 = cVar.c;
        if (bVar2.a()) {
            URL a10 = n5.c.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
            for (int i10 = 0; i10 <= 1; i10++) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection c = cVar.c(a10, str);
                try {
                    try {
                        c.setRequestMethod("POST");
                        c.addRequestProperty("Authorization", "FIS_v2 " + str4);
                        c.setDoOutput(true);
                        n5.c.h(c);
                        responseCode = c.getResponseCode();
                        bVar2.b(responseCode);
                        if (responseCode >= 200 && responseCode < 300) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                    } finally {
                        c.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                } catch (IOException | AssertionError unused) {
                }
                if (z9) {
                    f8 = n5.c.f(c);
                } else {
                    n5.c.b(c, null, str, str3);
                    if (responseCode != 401 && responseCode != 404) {
                        if (responseCode != 429) {
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                c7.l a11 = n5.b.a();
                                a11.f575b = 2;
                                f8 = a11.a();
                            }
                        } else {
                            throw new f("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                    } else {
                        c7.l a12 = n5.b.a();
                        a12.f575b = 3;
                        f8 = a12.a();
                    }
                }
                int c10 = com.bumptech.glide.g.c(f8.c);
                if (c10 != 0) {
                    if (c10 != 1) {
                        if (c10 == 2) {
                            synchronized (this) {
                                this.f3534j = null;
                            }
                            m5.a a13 = bVar.a();
                            a13.f3935b = 2;
                            return a13.a();
                        }
                        throw new f("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    m5.a a14 = bVar.a();
                    a14.f3936f = "BAD CONFIG";
                    a14.f3935b = 5;
                    return a14.a();
                }
                String str5 = f8.f4125a;
                long j10 = f8.f4126b;
                this.d.f3543a.getClass();
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                m5.a a15 = bVar.a();
                a15.d = str5;
                a15.f3937g = Long.valueOf(j10);
                a15.f3938h = Long.valueOf(currentTimeMillis);
                return a15.a();
            }
            throw new f("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new f("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final o7.a c() {
        String str;
        d();
        synchronized (this) {
            str = this.f3534j;
        }
        if (str != null) {
            o7.a aVar = new o7.a();
            aVar.g(str);
            return aVar;
        }
        p pVar = new p(17);
        h hVar = new h(pVar);
        synchronized (this.f3531g) {
            this.f3536l.add(hVar);
        }
        o7.a aVar2 = (o7.a) pVar.c;
        this.f3532h.execute(new c(this, 0));
        return aVar2;
    }

    public final void d() {
        o4.f fVar = this.f3528a;
        fVar.a();
        r2.a.a(fVar.c.f4368b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        fVar.a();
        r2.a.a(fVar.c.f4370g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        fVar.a();
        r2.a.a(fVar.c.f4367a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        fVar.a();
        String str = fVar.c.f4368b;
        Pattern pattern = k.f3542b;
        if (str.contains(":")) {
            fVar.a();
            if (k.f3542b.matcher(fVar.c.f4367a).matches()) {
                return;
            }
            j1.i.k("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
            return;
        }
        j1.i.k("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if ("[DEFAULT]".equals(r0.f4360b) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String e(m5.b r6) {
        /*
            r5 = this;
            o4.f r0 = r5.f3528a
            r0.a()
            java.lang.String r0 = r0.f4360b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            o4.f r0 = r5.f3528a
            java.lang.String r1 = "[DEFAULT]"
            r0.a()
            java.lang.String r0 = r0.f4360b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5c
        L1e:
            int r6 = r6.f3940b
            r0 = 1
            if (r6 != r0) goto L5c
            t4.l r6 = r5.e
            java.lang.Object r6 = r6.get()
            m5.c r6 = (m5.c) r6
            android.content.SharedPreferences r0 = r6.f3943a
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r6.f3943a     // Catch: java.lang.Throwable -> L3f
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L3f
            android.content.SharedPreferences r2 = r6.f3943a     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = "|S|id"
            r4 = 0
            java.lang.String r2 = r2.getString(r3, r4)     // Catch: java.lang.Throwable -> L57
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L41
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            goto L46
        L3f:
            r6 = move-exception
            goto L5a
        L41:
            java.lang.String r2 = r6.a()     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
        L46:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L56
            l5.i r6 = r5.f3530f
            r6.getClass()
            java.lang.String r6 = l5.i.a()
            return r6
        L56:
            return r2
        L57:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L57
            throw r6     // Catch: java.lang.Throwable -> L3f
        L5a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r6
        L5c:
            l5.i r6 = r5.f3530f
            r6.getClass()
            java.lang.String r6 = l5.i.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.d.e(m5.b):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [n5.c] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [n5.a] */
    public final m5.b f(m5.b bVar) {
        int responseCode;
        boolean z9;
        String str = bVar.f3939a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            m5.c cVar = (m5.c) this.e.get();
            synchronized (cVar.f3943a) {
                try {
                    String[] strArr = m5.c.c;
                    int i10 = 0;
                    while (true) {
                        if (i10 < 4) {
                            String str3 = strArr[i10];
                            String string = cVar.f3943a.getString("|T|" + cVar.f3944b + "|" + str3, null);
                            if (string != null && !string.isEmpty()) {
                                if (string.startsWith("{")) {
                                    try {
                                        str2 = new JSONObject(string).getString("token");
                                    } catch (JSONException unused) {
                                    }
                                } else {
                                    str2 = string;
                                }
                            } else {
                                i10++;
                            }
                        }
                    }
                } finally {
                }
            }
        }
        n5.c cVar2 = this.f3529b;
        o4.f fVar = this.f3528a;
        fVar.a();
        String str4 = fVar.c.f4367a;
        String str5 = bVar.f3939a;
        o4.f fVar2 = this.f3528a;
        fVar2.a();
        String str6 = fVar2.c.f4370g;
        o4.f fVar3 = this.f3528a;
        fVar3.a();
        String str7 = fVar3.c.f4368b;
        b2.b bVar2 = cVar2.c;
        if (bVar2.a()) {
            URL a10 = n5.c.a("projects/" + str6 + "/installations");
            int i11 = 0;
            n5.a aVar = cVar2;
            while (i11 <= 1) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection c = aVar.c(a10, str4);
                try {
                    try {
                        c.setRequestMethod("POST");
                        c.setDoOutput(true);
                        if (str2 != null) {
                            c.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                        }
                        n5.c.g(c, str5, str7);
                        responseCode = c.getResponseCode();
                        bVar2.b(responseCode);
                        if (responseCode >= 200 && responseCode < 300) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                    } finally {
                        c.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                } catch (IOException | AssertionError unused2) {
                }
                if (z9) {
                    n5.a e = n5.c.e(c);
                    c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    aVar = e;
                } else {
                    try {
                        n5.c.b(c, str7, str4, str6);
                    } catch (IOException | AssertionError unused3) {
                        c.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i11++;
                        aVar = aVar;
                    }
                    if (responseCode != 429) {
                        if (responseCode >= 500 && responseCode < 600) {
                            c.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i11++;
                            aVar = aVar;
                        } else {
                            Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                            n5.a aVar2 = new n5.a(null, null, null, null, 2);
                            c.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            aVar = aVar2;
                        }
                    } else {
                        throw new f("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        break;
                    }
                }
                int c10 = com.bumptech.glide.g.c(aVar.e);
                if (c10 != 0) {
                    if (c10 == 1) {
                        m5.a a11 = bVar.a();
                        a11.f3936f = "BAD CONFIG";
                        a11.f3935b = 5;
                        return a11.a();
                    }
                    throw new f("Firebase Installations Service is unavailable. Please try again later.");
                }
                String str8 = aVar.f4124b;
                String str9 = aVar.c;
                this.d.f3543a.getClass();
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                n5.b bVar3 = aVar.d;
                String str10 = bVar3.f4125a;
                long j10 = bVar3.f4126b;
                m5.a a12 = bVar.a();
                a12.c = str8;
                a12.f3935b = 4;
                a12.d = str10;
                a12.e = str9;
                a12.f3937g = Long.valueOf(j10);
                a12.f3938h = Long.valueOf(currentTimeMillis);
                return a12.a();
            }
            throw new f("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new f("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void g(Exception exc) {
        synchronized (this.f3531g) {
            try {
                Iterator it = this.f3536l.iterator();
                while (it.hasNext()) {
                    if (((j) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(m5.b bVar) {
        synchronized (this.f3531g) {
            try {
                Iterator it = this.f3536l.iterator();
                while (it.hasNext()) {
                    if (((j) it.next()).a(bVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
