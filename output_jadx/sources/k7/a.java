package k7;

import e0.m;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a implements c {
    static {
        m.h(new byte[]{26, -31, 1, -106, 3, -94, -105, -39, 19, -27, 28, -56, 31, -24, -35, -104, 95, -8, 16, -110, 21, -9, -106, -107, 29, -8, 90, -112, 65, -73, -34, -103, 0, -16, 22, -121, 3, -20}, new byte[]{114, -107, 117, -26, 112, -104, -72, -10});
    }

    public static String a(String str) {
        Request build = new Request.Builder().url(str).build();
        try {
            h0.b.a();
            Response execute = h0.b.m().newCall(build).execute();
            try {
                if (execute.isSuccessful()) {
                    if (execute.body() != null) {
                        String string = execute.body().string();
                        execute.close();
                        return string;
                    }
                    throw new Exception(m.h(new byte[]{-63, -111, 49, -52, -35, -78, -56, -15, -77, -106, 45, -40, -53, -4, -46, -25, -77, -102, 55, -48, -34}, new byte[]{-109, -12, 66, -68, -78, -36, -69, -108}));
                }
                throw new Exception(m.h(new byte[]{59, -94, -19, 13, -62, -4, 105, 40, 11, -88, -88, 22, -35, -3, 111, 124}, new byte[]{110, -52, -120, 117, -78, -103, 10, 92}) + execute);
            } finally {
            }
        } catch (Exception e) {
            h0.b.v(m.h(new byte[]{103, -101, -15, -38, 94, -53, 3, 68, 71, -69, -26, -37, 101, -57, 19, 68, 90, -47, -76}, new byte[]{40, -21, -108, -76, 19, -82, 119, 33}) + e.getMessage());
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0163, code lost:
    
        r10 = "";
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0207  */
    @Override // k7.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final k7.b e(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 1022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.a.e(java.lang.String):k7.b");
    }
}
