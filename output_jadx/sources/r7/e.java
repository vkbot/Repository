package r7;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import l9.o;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final o f5427a;

    /* renamed from: b, reason: collision with root package name */
    public static final b[] f5428b;
    public static final Map c;

    static {
        o oVar = o.e;
        f5427a = w7.c.k(":");
        b bVar = new b(b.f5417h, "");
        o oVar2 = b.e;
        b bVar2 = new b(oVar2, "GET");
        b bVar3 = new b(oVar2, "POST");
        o oVar3 = b.f5415f;
        b bVar4 = new b(oVar3, "/");
        b bVar5 = new b(oVar3, "/index.html");
        o oVar4 = b.f5416g;
        b bVar6 = new b(oVar4, "http");
        b bVar7 = new b(oVar4, "https");
        o oVar5 = b.d;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, new b(oVar5, "200"), new b(oVar5, "204"), new b(oVar5, "206"), new b(oVar5, "304"), new b(oVar5, "400"), new b(oVar5, "404"), new b(oVar5, "500"), new b("accept-charset", ""), new b("accept-encoding", "gzip, deflate"), new b("accept-language", ""), new b("accept-ranges", ""), new b("accept", ""), new b("access-control-allow-origin", ""), new b("age", ""), new b("allow", ""), new b("authorization", ""), new b("cache-control", ""), new b("content-disposition", ""), new b("content-encoding", ""), new b("content-language", ""), new b("content-length", ""), new b("content-location", ""), new b("content-range", ""), new b("content-type", ""), new b("cookie", ""), new b("date", ""), new b("etag", ""), new b("expect", ""), new b("expires", ""), new b(TypedValues.TransitionType.S_FROM, ""), new b("host", ""), new b("if-match", ""), new b("if-modified-since", ""), new b("if-none-match", ""), new b("if-range", ""), new b("if-unmodified-since", ""), new b("last-modified", ""), new b("link", ""), new b("location", ""), new b("max-forwards", ""), new b("proxy-authenticate", ""), new b("proxy-authorization", ""), new b("range", ""), new b("referer", ""), new b("refresh", ""), new b("retry-after", ""), new b("server", ""), new b("set-cookie", ""), new b("strict-transport-security", ""), new b("transfer-encoding", ""), new b("user-agent", ""), new b("vary", ""), new b("via", ""), new b("www-authenticate", "")};
        f5428b = bVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i10 = 0; i10 < 61; i10++) {
            if (!linkedHashMap.containsKey(bVarArr[i10].f5418a)) {
                linkedHashMap.put(bVarArr[i10].f5418a, Integer.valueOf(i10));
            }
        }
        c = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void a(o oVar) {
        int c10 = oVar.c();
        for (int i10 = 0; i10 < c10; i10++) {
            byte f8 = oVar.f(i10);
            if (f8 >= 65 && f8 <= 90) {
                n0.b.A("PROTOCOL_ERROR response malformed: mixed case name: ".concat(oVar.l()));
                return;
            }
        }
    }
}
