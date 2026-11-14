package okhttp3.internal.tls;

import ai.onnxruntime.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import j1.i;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import org.apache.commons.io.FilenameUtils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u001c\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\bH\u0002J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\f\u0010\u0017\u001a\u00020\b*\u00020\bH\u0002J\f\u0010\u0018\u001a\u00020\u000e*\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lokhttp3/internal/tls/OkHostnameVerifier;", "Ljavax/net/ssl/HostnameVerifier;", "()V", "ALT_DNS_NAME", "", "ALT_IPA_NAME", "allSubjectAltNames", "", "", "certificate", "Ljava/security/cert/X509Certificate;", "getSubjectAltNames", "type", "verify", "", "host", "session", "Ljavax/net/ssl/SSLSession;", "verifyHostname", "hostname", "pattern", "verifyIpAddress", "ipAddress", "asciiToLowercase", "isAscii", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nOkHostnameVerifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHostnameVerifier.kt\nokhttp3/internal/tls/OkHostnameVerifier\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,208:1\n1747#2,3:209\n1747#2,3:212\n*S KotlinDebug\n*F\n+ 1 OkHostnameVerifier.kt\nokhttp3/internal/tls/OkHostnameVerifier\n*L\n63#1:209,3\n71#1:212,3\n*E\n"})
/* loaded from: classes2.dex */
public final class OkHostnameVerifier implements HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;
    public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    private final String asciiToLowercase(String str) {
        if (isAscii(str)) {
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = str.toLowerCase(locale);
            lowerCase.getClass();
            return lowerCase;
        }
        return str;
    }

    private final List<String> getSubjectAltNames(X509Certificate certificate, int type) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && Intrinsics.areEqual(list.get(0), Integer.valueOf(type)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return CollectionsKt.emptyList();
        }
    }

    private final boolean isAscii(String str) {
        int i10;
        char c;
        int length = str.length();
        int length2 = str.length();
        if (length2 >= 0) {
            if (length2 <= str.length()) {
                long j10 = 0;
                int i11 = 0;
                while (i11 < length2) {
                    char charAt = str.charAt(i11);
                    if (charAt < 128) {
                        j10++;
                    } else {
                        if (charAt < 2048) {
                            i10 = 2;
                        } else if (charAt >= 55296 && charAt <= 57343) {
                            int i12 = i11 + 1;
                            if (i12 < length2) {
                                c = str.charAt(i12);
                            } else {
                                c = 0;
                            }
                            if (charAt <= 56319 && c >= 56320 && c <= 57343) {
                                j10 += 4;
                                i11 += 2;
                            } else {
                                j10++;
                                i11 = i12;
                            }
                        } else {
                            i10 = 3;
                        }
                        j10 += i10;
                    }
                    i11++;
                }
                if (length != ((int) j10)) {
                    return false;
                }
                return true;
            }
            i.i(a.q(length2, "endIndex > string.length: ", " > "), str.length());
            return false;
        }
        l9.i.d(a.g(length2, "endIndex < beginIndex: ", " < ", 0));
        return false;
    }

    private final boolean verifyHostname(String hostname, String pattern) {
        boolean startsWith$default;
        boolean endsWith$default;
        boolean startsWith$default2;
        boolean endsWith$default2;
        boolean endsWith$default3;
        boolean endsWith$default4;
        boolean contains$default;
        boolean startsWith$default3;
        int indexOf$default;
        boolean endsWith$default5;
        int lastIndexOf$default;
        if (hostname != null && hostname.length() != 0) {
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(hostname, ".", false, 2, null);
            if (!startsWith$default) {
                endsWith$default = StringsKt__StringsJVMKt.endsWith$default(hostname, "..", false, 2, null);
                if (!endsWith$default && pattern != null && pattern.length() != 0) {
                    startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(pattern, ".", false, 2, null);
                    if (!startsWith$default2) {
                        endsWith$default2 = StringsKt__StringsJVMKt.endsWith$default(pattern, "..", false, 2, null);
                        if (!endsWith$default2) {
                            endsWith$default3 = StringsKt__StringsJVMKt.endsWith$default(hostname, ".", false, 2, null);
                            if (!endsWith$default3) {
                                hostname = hostname.concat(".");
                            }
                            endsWith$default4 = StringsKt__StringsJVMKt.endsWith$default(pattern, ".", false, 2, null);
                            if (!endsWith$default4) {
                                pattern = pattern.concat(".");
                            }
                            String asciiToLowercase = asciiToLowercase(pattern);
                            contains$default = StringsKt__StringsKt.contains$default(asciiToLowercase, (CharSequence) "*", false, 2, (Object) null);
                            if (contains$default) {
                                startsWith$default3 = StringsKt__StringsJVMKt.startsWith$default(asciiToLowercase, "*.", false, 2, null);
                                if (startsWith$default3) {
                                    indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) asciiToLowercase, '*', 1, false, 4, (Object) null);
                                    if (indexOf$default == -1 && hostname.length() >= asciiToLowercase.length() && !Intrinsics.areEqual("*.", asciiToLowercase)) {
                                        String substring = asciiToLowercase.substring(1);
                                        endsWith$default5 = StringsKt__StringsJVMKt.endsWith$default(hostname, substring, false, 2, null);
                                        if (endsWith$default5) {
                                            int length = hostname.length() - substring.length();
                                            if (length > 0) {
                                                lastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) hostname, FilenameUtils.EXTENSION_SEPARATOR, length - 1, false, 4, (Object) null);
                                                if (lastIndexOf$default != -1) {
                                                    return false;
                                                }
                                            }
                                            return true;
                                        }
                                        return false;
                                    }
                                    return false;
                                }
                                return false;
                            }
                            return Intrinsics.areEqual(hostname, asciiToLowercase);
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    private final boolean verifyIpAddress(String ipAddress, X509Certificate certificate) {
        String canonicalHost = HostnamesKt.toCanonicalHost(ipAddress);
        List<String> subjectAltNames = getSubjectAltNames(certificate, 7);
        if (subjectAltNames != null && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(canonicalHost, HostnamesKt.toCanonicalHost((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    public final List<String> allSubjectAltNames(X509Certificate certificate) {
        certificate.getClass();
        return CollectionsKt.plus((Collection) getSubjectAltNames(certificate, 7), (Iterable) getSubjectAltNames(certificate, 2));
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String host, SSLSession session) {
        host.getClass();
        session.getClass();
        if (!isAscii(host)) {
            return false;
        }
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            certificate.getClass();
            return verify(host, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }

    public final boolean verify(String host, X509Certificate certificate) {
        host.getClass();
        certificate.getClass();
        return Util.canParseAsIpAddress(host) ? verifyIpAddress(host, certificate) : verifyHostname(host, certificate);
    }

    private final boolean verifyHostname(String hostname, X509Certificate certificate) {
        String asciiToLowercase = asciiToLowercase(hostname);
        List<String> subjectAltNames = getSubjectAltNames(certificate, 2);
        if (subjectAltNames != null && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (INSTANCE.verifyHostname(asciiToLowercase, (String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
