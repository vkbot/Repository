package k;

import android.graphics.Bitmap;
import android.os.Build;
import c0.p;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class l {
    public static final Bitmap.Config[] d;
    public static final Bitmap.Config[] e;

    /* renamed from: f, reason: collision with root package name */
    public static final Bitmap.Config[] f3372f;

    /* renamed from: g, reason: collision with root package name */
    public static final Bitmap.Config[] f3373g;

    /* renamed from: h, reason: collision with root package name */
    public static final Bitmap.Config[] f3374h;

    /* renamed from: a, reason: collision with root package name */
    public final f f3375a = new f(1);

    /* renamed from: b, reason: collision with root package name */
    public final android.support.v4.media.h f3376b = new android.support.v4.media.h(25);
    public final HashMap c = new HashMap();

    static {
        Bitmap.Config config;
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            int length = configArr.length - 1;
            config = Bitmap.Config.RGBA_F16;
            configArr[length] = config;
        }
        d = configArr;
        e = configArr;
        f3372f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f3373g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f3374h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String c(int i10, Bitmap.Config config) {
        return "[" + i10 + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap d10 = d(bitmap.getConfig());
        Integer num2 = (Integer) d10.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                d10.remove(num);
                return;
            } else {
                d10.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        StringBuilder sb = new StringBuilder("Tried to decrement empty size, size: ");
        sb.append(num);
        String c = c(p.c(bitmap), bitmap.getConfig());
        sb.append(", removed: ");
        sb.append(c);
        sb.append(", this: ");
        sb.append(this);
        throw new NullPointerException(sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6 A[EDGE_INSN: B:34:0x00a6->B:20:0x00a6 BREAK  A[LOOP:0: B:10:0x0058->B:32:0x00a3], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap b(int r11, int r12, android.graphics.Bitmap.Config r13) {
        /*
            r10 = this;
            int r0 = r11 * r12
            int r1 = c0.p.d(r13)
            int r1 = r1 * r0
            k.f r0 = r10.f3375a
            java.lang.Object r2 = r0.f3353b
            java.util.ArrayDeque r2 = (java.util.ArrayDeque) r2
            java.lang.Object r2 = r2.poll()
            k.i r2 = (k.i) r2
            if (r2 != 0) goto L19
            k.i r2 = r0.e()
        L19:
            k.k r2 = (k.k) r2
            r2.f3371b = r1
            r2.c = r13
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r3 < r4) goto L32
            android.graphics.Bitmap$Config r3 = c5.h.A()
            boolean r3 = r3.equals(r13)
            if (r3 == 0) goto L32
            android.graphics.Bitmap$Config[] r3 = k.l.e
            goto L56
        L32:
            int[] r3 = k.j.f3369a
            int r4 = r13.ordinal()
            r3 = r3[r4]
            r4 = 1
            if (r3 == r4) goto L54
            r4 = 2
            if (r3 == r4) goto L51
            r4 = 3
            if (r3 == r4) goto L4e
            r4 = 4
            if (r3 == r4) goto L4b
            android.graphics.Bitmap$Config[] r3 = new android.graphics.Bitmap.Config[]{r13}
            goto L56
        L4b:
            android.graphics.Bitmap$Config[] r3 = k.l.f3374h
            goto L56
        L4e:
            android.graphics.Bitmap$Config[] r3 = k.l.f3373g
            goto L56
        L51:
            android.graphics.Bitmap$Config[] r3 = k.l.f3372f
            goto L56
        L54:
            android.graphics.Bitmap$Config[] r3 = k.l.d
        L56:
            int r4 = r3.length
            r5 = 0
        L58:
            if (r5 >= r4) goto La6
            r6 = r3[r5]
            java.util.NavigableMap r7 = r10.d(r6)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            java.lang.Object r7 = r7.ceilingKey(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto La3
            int r8 = r7.intValue()
            int r9 = r1 * 8
            if (r8 > r9) goto La3
            int r3 = r7.intValue()
            if (r3 != r1) goto L85
            if (r6 != 0) goto L7f
            if (r13 == 0) goto La6
            goto L85
        L7f:
            boolean r1 = r6.equals(r13)
            if (r1 != 0) goto La6
        L85:
            r0.c(r2)
            int r1 = r7.intValue()
            java.lang.Object r2 = r0.f3353b
            java.util.ArrayDeque r2 = (java.util.ArrayDeque) r2
            java.lang.Object r2 = r2.poll()
            k.i r2 = (k.i) r2
            if (r2 != 0) goto L9c
            k.i r2 = r0.e()
        L9c:
            k.k r2 = (k.k) r2
            r2.f3371b = r1
            r2.c = r6
            goto La6
        La3:
            int r5 = r5 + 1
            goto L58
        La6:
            android.support.v4.media.h r0 = r10.f3376b
            java.lang.Object r0 = r0.h(r2)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto Lbc
            int r1 = r2.f3371b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10.a(r1, r0)
            r0.reconfigure(r11, r12, r13)
        Lbc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k.l.b(int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }

    public final NavigableMap d(Bitmap.Config config) {
        HashMap hashMap = this.c;
        NavigableMap navigableMap = (NavigableMap) hashMap.get(config);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            hashMap.put(config, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    public final void e(Bitmap bitmap) {
        int c = p.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        f fVar = this.f3375a;
        i iVar = (i) ((ArrayDeque) fVar.f3353b).poll();
        if (iVar == null) {
            iVar = fVar.e();
        }
        k kVar = (k) iVar;
        kVar.f3371b = c;
        kVar.c = config;
        this.f3376b.q(kVar, bitmap);
        NavigableMap d10 = d(bitmap.getConfig());
        Integer num = (Integer) d10.get(Integer.valueOf(kVar.f3371b));
        Integer valueOf = Integer.valueOf(kVar.f3371b);
        int i10 = 1;
        if (num != null) {
            i10 = 1 + num.intValue();
        }
        d10.put(valueOf, Integer.valueOf(i10));
    }

    public final String toString() {
        StringBuilder u8 = ai.onnxruntime.a.u("SizeConfigStrategy{groupedMap=");
        u8.append(this.f3376b);
        u8.append(", sortedSizes=(");
        HashMap hashMap = this.c;
        for (Map.Entry entry : hashMap.entrySet()) {
            u8.append(entry.getKey());
            u8.append('[');
            u8.append(entry.getValue());
            u8.append("], ");
        }
        if (!hashMap.isEmpty()) {
            u8.replace(u8.length() - 2, u8.length(), "");
        }
        u8.append(")}");
        return u8.toString();
    }
}
