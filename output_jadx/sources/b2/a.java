package b2;

import j1.i;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import y5.k;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a {
    public static final String c;
    public static final Set d;
    public static final a e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f331f;

    /* renamed from: a, reason: collision with root package name */
    public final String f332a;

    /* renamed from: b, reason: collision with root package name */
    public final String f333b;

    static {
        String l10 = k.l("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        c = l10;
        String l11 = k.l("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String l12 = k.l("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new a2.a("proto"), new a2.a("json"))));
        e = new a(l10, null);
        f331f = new a(l11, l12);
    }

    public a(String str, String str2) {
        this.f332a = str;
        this.f333b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new a(str2, str3);
                }
                i.k("Missing endpoint in CCTDestination extras");
                return null;
            }
            i.k("Extra is not a valid encoded LegacyFlgDestination");
            return null;
        }
        i.k("Version marker missing from extras");
        return null;
    }
}
