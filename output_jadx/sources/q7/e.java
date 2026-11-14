package q7;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final e f5314a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f5315b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static List a(X509Certificate x509Certificate, int i10) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.EMPTY_LIST;
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i10 && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x01b7, code lost:
    
        j1.i.l("Unexpected end of DN: ".concat(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01be, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00da, code lost:
    
        r17 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f2, code lost:
    
        r4 = r5.d;
        r8 = new java.lang.String(r10, r4, r5.e - r4);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(java.lang.String r18, java.security.cert.X509Certificate r19) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.e.b(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    public static boolean c(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str.concat(".");
            }
            if (!str2.endsWith(".")) {
                str2 = str2.concat(".");
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains("*")) {
                return str.equals(lowerCase);
            }
            if (lowerCase.startsWith("*.") && lowerCase.indexOf(42, 1) == -1 && str.length() >= lowerCase.length() && !"*.".equals(lowerCase)) {
                String substring = lowerCase.substring(1);
                if (str.endsWith(substring)) {
                    int length = str.length() - substring.length();
                    if (length <= 0 || str.lastIndexOf(46, length - 1) == -1) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return b(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
