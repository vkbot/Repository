package n7;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final w0 f4255a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4256b;
    public final String c;
    public final t7.b d;
    public final t7.b e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4257f;

    public x0(String str, t7.b bVar, t7.b bVar2) {
        String substring;
        new AtomicReferenceArray(2);
        this.f4255a = w0.f4252b;
        this.f4256b = str;
        int lastIndexOf = str.lastIndexOf(47);
        if (lastIndexOf == -1) {
            substring = null;
        } else {
            substring = str.substring(0, lastIndexOf);
        }
        this.c = substring;
        this.d = bVar;
        this.e = bVar2;
        this.f4257f = true;
    }

    public static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        o4.b.i(str, "fullServiceName");
        sb.append(str);
        sb.append("/");
        o4.b.i(str2, "methodName");
        sb.append(str2);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0057 A[Catch: IOException -> 0x0047, TryCatch #1 {IOException -> 0x0047, blocks: (B:15:0x0022, B:17:0x0027, B:21:0x0031, B:23:0x003b, B:25:0x0043, B:30:0x0057, B:32:0x0061, B:36:0x0065, B:55:0x006a, B:56:0x008a, B:58:0x004a, B:60:0x008d), top: B:14:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065 A[Catch: IOException -> 0x0047, TryCatch #1 {IOException -> 0x0047, blocks: (B:15:0x0022, B:17:0x0027, B:21:0x0031, B:23:0x003b, B:25:0x0043, B:30:0x0057, B:32:0x0061, B:36:0x0065, B:55:0x006a, B:56:0x008a, B:58:0x004a, B:60:0x008d), top: B:14:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bd A[Catch: d0 -> 0x00d0, TryCatch #0 {d0 -> 0x00d0, blocks: (B:46:0x00ac, B:48:0x00bd, B:50:0x00c1, B:51:0x00cf), top: B:45:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c1 A[Catch: d0 -> 0x00d0, TryCatch #0 {d0 -> 0x00d0, blocks: (B:46:0x00ac, B:48:0x00bd, B:50:0x00c1, B:51:0x00cf), top: B:45:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x006a A[Catch: IOException -> 0x0047, TryCatch #1 {IOException -> 0x0047, blocks: (B:15:0x0022, B:17:0x0027, B:21:0x0031, B:23:0x003b, B:25:0x0043, B:30:0x0057, B:32:0x0061, B:36:0x0065, B:55:0x006a, B:56:0x008a, B:58:0x004a, B:60:0x008d), top: B:14:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.protobuf.a b(java.io.InputStream r8) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.x0.b(java.io.InputStream):com.google.protobuf.a");
    }

    public final String toString() {
        com.bumptech.glide.manager.s t = com.bumptech.glide.c.t(this);
        t.c(this.f4256b, "fullMethodName");
        t.c(this.f4255a, "type");
        t.d("idempotent", false);
        t.d("safe", false);
        t.d("sampledToLocalTracing", this.f4257f);
        t.c(this.d, "requestMarshaller");
        t.c(this.e, "responseMarshaller");
        t.c(null, "schemaDescriptor");
        t.f675b = true;
        return t.toString();
    }
}
