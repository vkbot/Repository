package okhttp3;

import androidx.constraintlayout.widget.ConstraintLayout;
import j1.i;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import l9.o;
import okhttp3.internal.tls.CertificateChainCleaner;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import w7.c;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \"2\u00020\u0001:\u0003!\"#B!\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J)\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011H\u0000¢\u0006\u0002\b\u0014J)\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u0016\"\u00020\u0017H\u0007¢\u0006\u0002\u0010\u0018J\u001c\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0012J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0015\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006$"}, d2 = {"Lokhttp3/CertificatePinner;", "", "pins", "", "Lokhttp3/CertificatePinner$Pin;", "certificateChainCleaner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "(Ljava/util/Set;Lokhttp3/internal/tls/CertificateChainCleaner;)V", "getCertificateChainCleaner$okhttp", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "getPins", "()Ljava/util/Set;", "check", "", "hostname", "", "cleanedPeerCertificatesFn", "Lkotlin/Function0;", "", "Ljava/security/cert/X509Certificate;", "check$okhttp", "peerCertificates", "", "Ljava/security/cert/Certificate;", "(Ljava/lang/String;[Ljava/security/cert/Certificate;)V", "equals", "", "other", "findMatchingPins", "hashCode", "", "withCertificateChainCleaner", "withCertificateChainCleaner$okhttp", "Builder", "Companion", "Pin", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nCertificatePinner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,370:1\n625#2,8:371\n*S KotlinDebug\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner\n*L\n216#1:371,8\n*E\n"})
/* loaded from: classes2.dex */
public final class CertificatePinner {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    public static final CertificatePinner DEFAULT = new Builder().build();
    private final CertificateChainCleaner certificateChainCleaner;
    private final Set<Pin> pins;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J'\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u000b\"\u00020\n¢\u0006\u0002\u0010\fJ\u0006\u0010\r\u001a\u00020\u000eR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lokhttp3/CertificatePinner$Builder;", "", "()V", "pins", "", "Lokhttp3/CertificatePinner$Pin;", "getPins", "()Ljava/util/List;", "add", "pattern", "", "", "(Ljava/lang/String;[Ljava/lang/String;)Lokhttp3/CertificatePinner$Builder;", "build", "Lokhttp3/CertificatePinner;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes2.dex */
    public static final class Builder {
        private final List<Pin> pins = new ArrayList();

        public final Builder add(String pattern, String... pins) {
            pattern.getClass();
            pins.getClass();
            for (String str : pins) {
                this.pins.add(new Pin(pattern, str));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final CertificatePinner build() {
            return new CertificatePinner(CollectionsKt.toSet(this.pins), null, 2, 0 == true ? 1 : 0);
        }

        public final List<Pin> getPins() {
            return this.pins;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lokhttp3/CertificatePinner$Pin;", "", "", "pattern", "pin", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "hostname", "", "matchesHostname", "(Ljava/lang/String;)Z", "Ljava/security/cert/X509Certificate;", "certificate", "matchesCertificate", "(Ljava/security/cert/X509Certificate;)Z", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getPattern", "hashAlgorithm", "getHashAlgorithm", "Ll9/o;", "hash", "Ll9/o;", "getHash", "()Ll9/o;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes2.dex */
    public static final class Pin {
        private final o hash;
        private final String hashAlgorithm;
        private final String pattern;

        /* JADX WARN: Code restructure failed: missing block: B:31:0x002a, code lost:
        
            if (r0 != (-1)) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
        
            if (r0 != (-1)) goto L6;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Pin(java.lang.String r6, java.lang.String r7) {
            /*
                r5 = this;
                r6.getClass()
                r7.getClass()
                r5.<init>()
                java.lang.String r0 = "*."
                boolean r0 = kotlin.text.StringsKt.M(r6, r0)
                r1 = 0
                r2 = 4
                java.lang.String r3 = "*"
                r4 = -1
                if (r0 == 0) goto L1d
                r0 = 1
                int r0 = kotlin.text.StringsKt.u(r0, r6, r3, r2)
                if (r0 == r4) goto L34
            L1d:
                java.lang.String r0 = "**."
                boolean r0 = kotlin.text.StringsKt.M(r6, r0)
                if (r0 == 0) goto L2c
                r0 = 2
                int r0 = kotlin.text.StringsKt.u(r0, r6, r3, r2)
                if (r0 == r4) goto L34
            L2c:
                r0 = 0
                r2 = 6
                int r0 = kotlin.text.StringsKt.u(r0, r6, r3, r2)
                if (r0 != r4) goto L9a
            L34:
                java.lang.String r0 = okhttp3.internal.HostnamesKt.toCanonicalHost(r6)
                if (r0 == 0) goto L90
                r5.pattern = r0
                java.lang.String r6 = "sha1/"
                boolean r6 = kotlin.text.StringsKt.M(r7, r6)
                java.lang.String r0 = "Invalid pin hash: "
                if (r6 == 0) goto L62
                java.lang.String r6 = "sha1"
                r5.hashAlgorithm = r6
                l9.o r6 = l9.o.e
                r6 = 5
                java.lang.String r6 = r7.substring(r6)
                l9.o r6 = w7.c.i(r6)
                if (r6 == 0) goto L5a
                r5.hash = r6
                return
            L5a:
                java.lang.String r6 = r0.concat(r7)
                j1.i.k(r6)
                throw r1
            L62:
                java.lang.String r6 = "sha256/"
                boolean r6 = kotlin.text.StringsKt.M(r7, r6)
                if (r6 == 0) goto L86
                java.lang.String r6 = "sha256"
                r5.hashAlgorithm = r6
                l9.o r6 = l9.o.e
                r6 = 7
                java.lang.String r6 = r7.substring(r6)
                l9.o r6 = w7.c.i(r6)
                if (r6 == 0) goto L7e
                r5.hash = r6
                return
            L7e:
                java.lang.String r6 = r0.concat(r7)
                j1.i.k(r6)
                throw r1
            L86:
                java.lang.String r6 = "pins must start with 'sha256/' or 'sha1/': "
                java.lang.String r6 = r6.concat(r7)
                j1.i.k(r6)
                throw r1
            L90:
                java.lang.String r7 = "Invalid pattern: "
                java.lang.String r6 = r7.concat(r6)
                j1.i.k(r6)
                throw r1
            L9a:
                java.lang.String r7 = "Unexpected pattern: "
                java.lang.String r6 = r7.concat(r6)
                l9.i.d(r6)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.CertificatePinner.Pin.<init>(java.lang.String, java.lang.String):void");
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) other;
            if (Intrinsics.areEqual(this.pattern, pin.pattern) && Intrinsics.areEqual(this.hashAlgorithm, pin.hashAlgorithm) && Intrinsics.areEqual(this.hash, pin.hash)) {
                return true;
            }
            return false;
        }

        public final o getHash() {
            return this.hash;
        }

        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        public final String getPattern() {
            return this.pattern;
        }

        public int hashCode() {
            return this.hash.hashCode() + ((this.hashAlgorithm.hashCode() + (this.pattern.hashCode() * 31)) * 31);
        }

        public final boolean matchesCertificate(X509Certificate certificate) {
            certificate.getClass();
            String str = this.hashAlgorithm;
            if (Intrinsics.areEqual(str, "sha256")) {
                return Intrinsics.areEqual(this.hash, CertificatePinner.INSTANCE.sha256Hash(certificate));
            }
            if (Intrinsics.areEqual(str, "sha1")) {
                return Intrinsics.areEqual(this.hash, CertificatePinner.INSTANCE.sha1Hash(certificate));
            }
            return false;
        }

        public final boolean matchesHostname(String hostname) {
            boolean startsWith$default;
            boolean startsWith$default2;
            boolean regionMatches$default;
            int lastIndexOf$default;
            boolean regionMatches$default2;
            hostname.getClass();
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(this.pattern, "**.", false, 2, null);
            String str = this.pattern;
            if (!startsWith$default) {
                startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(str, "*.", false, 2, null);
                String str2 = this.pattern;
                if (startsWith$default2) {
                    int length = str2.length() - 1;
                    int length2 = hostname.length() - length;
                    regionMatches$default = StringsKt__StringsJVMKt.regionMatches$default(hostname, hostname.length() - length, this.pattern, 1, length, false, 16, (Object) null);
                    if (regionMatches$default) {
                        lastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) hostname, FilenameUtils.EXTENSION_SEPARATOR, length2 - 1, false, 4, (Object) null);
                        if (lastIndexOf$default != -1) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return Intrinsics.areEqual(hostname, str2);
                }
            } else {
                int length3 = str.length() - 3;
                int length4 = hostname.length() - length3;
                regionMatches$default2 = StringsKt__StringsJVMKt.regionMatches$default(hostname, hostname.length() - length3, this.pattern, 3, length3, false, 16, (Object) null);
                if (regionMatches$default2) {
                    if (length4 != 0 && hostname.charAt(length4 - 1) != '.') {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return this.hashAlgorithm + IOUtils.DIR_SEPARATOR_UNIX + this.hash.a();
        }
    }

    public CertificatePinner(Set<Pin> set, CertificateChainCleaner certificateChainCleaner) {
        set.getClass();
        this.pins = set;
        this.certificateChainCleaner = certificateChainCleaner;
    }

    @JvmStatic
    public static final String pin(Certificate certificate) {
        return INSTANCE.pin(certificate);
    }

    @JvmStatic
    public static final o sha1Hash(X509Certificate x509Certificate) {
        return INSTANCE.sha1Hash(x509Certificate);
    }

    @JvmStatic
    public static final o sha256Hash(X509Certificate x509Certificate) {
        return INSTANCE.sha256Hash(x509Certificate);
    }

    public final void check(final String hostname, final List<? extends Certificate> peerCertificates) {
        hostname.getClass();
        peerCertificates.getClass();
        check$okhttp(hostname, new Function0<List<? extends X509Certificate>>() { // from class: okhttp3.CertificatePinner$check$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends X509Certificate> invoke() {
                List<Certificate> list;
                CertificateChainCleaner certificateChainCleaner = CertificatePinner.this.getCertificateChainCleaner();
                if (certificateChainCleaner == null || (list = certificateChainCleaner.clean(peerCertificates, hostname)) == null) {
                    list = peerCertificates;
                }
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (Certificate certificate : list) {
                    certificate.getClass();
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            }
        });
    }

    public final void check$okhttp(String hostname, Function0<? extends List<? extends X509Certificate>> cleanedPeerCertificatesFn) {
        hostname.getClass();
        cleanedPeerCertificatesFn.getClass();
        List<Pin> findMatchingPins = findMatchingPins(hostname);
        if (!findMatchingPins.isEmpty()) {
            List<? extends X509Certificate> invoke = cleanedPeerCertificatesFn.invoke();
            for (X509Certificate x509Certificate : invoke) {
                o oVar = null;
                o oVar2 = null;
                for (Pin pin : findMatchingPins) {
                    String hashAlgorithm = pin.getHashAlgorithm();
                    if (Intrinsics.areEqual(hashAlgorithm, "sha256")) {
                        if (oVar == null) {
                            oVar = INSTANCE.sha256Hash(x509Certificate);
                        }
                        if (Intrinsics.areEqual(pin.getHash(), oVar)) {
                            return;
                        }
                    } else if (Intrinsics.areEqual(hashAlgorithm, "sha1")) {
                        if (oVar2 == null) {
                            oVar2 = INSTANCE.sha1Hash(x509Certificate);
                        }
                        if (Intrinsics.areEqual(pin.getHash(), oVar2)) {
                            return;
                        }
                    } else {
                        throw new AssertionError("unsupported hashAlgorithm: " + pin.getHashAlgorithm());
                    }
                }
            }
            StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
            for (X509Certificate x509Certificate2 : invoke) {
                sb.append("\n    ");
                sb.append(INSTANCE.pin(x509Certificate2));
                sb.append(": ");
                sb.append(x509Certificate2.getSubjectDN().getName());
            }
            sb.append("\n  Pinned certificates for ");
            sb.append(hostname);
            sb.append(":");
            for (Pin pin2 : findMatchingPins) {
                sb.append("\n    ");
                sb.append(pin2);
            }
            throw new SSLPeerUnverifiedException(sb.toString());
        }
    }

    public boolean equals(Object other) {
        if (other instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) other;
            if (Intrinsics.areEqual(certificatePinner.pins, this.pins) && Intrinsics.areEqual(certificatePinner.certificateChainCleaner, this.certificateChainCleaner)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final List<Pin> findMatchingPins(String hostname) {
        hostname.getClass();
        Set<Pin> set = this.pins;
        List<Pin> emptyList = CollectionsKt.emptyList();
        for (Object obj : set) {
            if (((Pin) obj).matchesHostname(hostname)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList<>();
                }
                TypeIntrinsics.asMutableList(emptyList).add(obj);
            }
        }
        return emptyList;
    }

    /* renamed from: getCertificateChainCleaner$okhttp, reason: from getter */
    public final CertificateChainCleaner getCertificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    public final Set<Pin> getPins() {
        return this.pins;
    }

    public int hashCode() {
        int i10;
        int hashCode = (this.pins.hashCode() + 1517) * 41;
        CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
        if (certificateChainCleaner != null) {
            i10 = certificateChainCleaner.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    public final CertificatePinner withCertificateChainCleaner$okhttp(CertificateChainCleaner certificateChainCleaner) {
        certificateChainCleaner.getClass();
        if (Intrinsics.areEqual(this.certificateChainCleaner, certificateChainCleaner)) {
            return this;
        }
        return new CertificatePinner(this.pins, certificateChainCleaner);
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lokhttp3/CertificatePinner$Companion;", "", "<init>", "()V", "Ljava/security/cert/X509Certificate;", "Ll9/o;", "sha1Hash", "(Ljava/security/cert/X509Certificate;)Ll9/o;", "sha256Hash", "Ljava/security/cert/Certificate;", "certificate", "", "pin", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", "Lokhttp3/CertificatePinner;", "DEFAULT", "Lokhttp3/CertificatePinner;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nCertificatePinner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,370:1\n1#2:371\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final String pin(Certificate certificate) {
            certificate.getClass();
            if (certificate instanceof X509Certificate) {
                return "sha256/" + sha256Hash((X509Certificate) certificate).a();
            }
            i.k("Certificate pinning requires X509 certificates");
            return null;
        }

        @JvmStatic
        public final o sha1Hash(X509Certificate x509Certificate) {
            x509Certificate.getClass();
            o oVar = o.e;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            encoded.getClass();
            return c.l(encoded).b("SHA-1");
        }

        @JvmStatic
        public final o sha256Hash(X509Certificate x509Certificate) {
            x509Certificate.getClass();
            o oVar = o.e;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            encoded.getClass();
            return c.l(encoded).b("SHA-256");
        }

        private Companion() {
        }
    }

    public /* synthetic */ CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i10 & 2) != 0 ? null : certificateChainCleaner);
    }

    @Deprecated(message = "replaced with {@link #check(String, List)}.", replaceWith = @ReplaceWith(expression = "check(hostname, peerCertificates.toList())", imports = {}))
    public final void check(String hostname, Certificate... peerCertificates) {
        hostname.getClass();
        peerCertificates.getClass();
        check(hostname, ArraysKt.toList(peerCertificates));
    }
}
