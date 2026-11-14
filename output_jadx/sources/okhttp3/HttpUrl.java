package okhttp3;

import ai.onnxruntime.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import j1.i;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.UByte;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;
import l9.l;
import n0.b;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.apache.commons.io.IOUtils;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.telnet.TelnetCommand;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 J2\u00020\u0001:\u0002IJBa\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b!J\r\u0010\u0011\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\"J\r\u0010\u0012\u001a\u00020\u0003H\u0007¢\u0006\u0002\b#J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0007¢\u0006\u0002\b$J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b%J\r\u0010\u0016\u001a\u00020\u0003H\u0007¢\u0006\u0002\b&J\u0013\u0010'\u001a\u00020\u00182\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u000f\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b)J\b\u0010*\u001a\u00020\bH\u0016J\r\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0002\b+J\u0006\u0010,\u001a\u00020-J\u0010\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020\u0003J\r\u0010\u0005\u001a\u00020\u0003H\u0007¢\u0006\u0002\b/J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0007¢\u0006\u0002\b0J\r\u0010\u001a\u001a\u00020\bH\u0007¢\u0006\u0002\b1J\r\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\b2J\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b3J\u0010\u00104\u001a\u0004\u0018\u00010\u00032\u0006\u00105\u001a\u00020\u0003J\u000e\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u00020\bJ\u0013\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001eH\u0007¢\u0006\u0002\b8J\u0010\u00109\u001a\u0004\u0018\u00010\u00032\u0006\u00107\u001a\u00020\bJ\u0016\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n2\u0006\u00105\u001a\u00020\u0003J\r\u0010 \u001a\u00020\bH\u0007¢\u0006\u0002\b;J\u0006\u0010<\u001a\u00020\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u00002\u0006\u0010.\u001a\u00020\u0003J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b>J\b\u0010?\u001a\u00020\u0003H\u0016J\r\u0010@\u001a\u00020AH\u0007¢\u0006\u0002\bBJ\r\u0010C\u001a\u00020DH\u0007¢\u0006\u0002\b\rJ\b\u0010E\u001a\u0004\u0018\u00010\u0003J\r\u0010B\u001a\u00020AH\u0007¢\u0006\u0002\bFJ\r\u0010\r\u001a\u00020DH\u0007¢\u0006\u0002\bGJ\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\bHR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\n8G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u0016\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u0015\u0010\f\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0010R\u0013\u0010\u0006\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0019R\u0013\u0010\u0005\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0010R\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014R\u0011\u0010\u001a\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0007\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u001bR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010R\u0018\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001fR\u0011\u0010 \u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b \u0010\u001bR\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0010R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010¨\u0006K"}, d2 = {"Lokhttp3/HttpUrl;", "", "scheme", "", "username", "password", "host", "port", "", "pathSegments", "", "queryNamesAndValues", "fragment", "url", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "encodedFragment", "()Ljava/lang/String;", "encodedPassword", "encodedPath", "encodedPathSegments", "()Ljava/util/List;", "encodedQuery", "encodedUsername", "isHttps", "", "()Z", "pathSize", "()I", "query", "queryParameterNames", "", "()Ljava/util/Set;", "querySize", "-deprecated_encodedFragment", "-deprecated_encodedPassword", "-deprecated_encodedPath", "-deprecated_encodedPathSegments", "-deprecated_encodedQuery", "-deprecated_encodedUsername", "equals", "other", "-deprecated_fragment", "hashCode", "-deprecated_host", "newBuilder", "Lokhttp3/HttpUrl$Builder;", "link", "-deprecated_password", "-deprecated_pathSegments", "-deprecated_pathSize", "-deprecated_port", "-deprecated_query", "queryParameter", "name", "queryParameterName", "index", "-deprecated_queryParameterNames", "queryParameterValue", "queryParameterValues", "-deprecated_querySize", "redact", "resolve", "-deprecated_scheme", "toString", "toUri", "Ljava/net/URI;", "uri", "toUrl", "Ljava/net/URL;", "topPrivateDomain", "-deprecated_uri", "-deprecated_url", "-deprecated_username", "Builder", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class HttpUrl {
    public static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    public static final String FRAGMENT_ENCODE_SET = "";
    public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    public static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";
    public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
    public static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";
    public static final String QUERY_ENCODE_SET = " \"'<>#";
    public static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    private final String fragment;
    private final String host;
    private final boolean isHttps;
    private final String password;
    private final List<String> pathSegments;
    private final int port;
    private final List<String> queryNamesAndValues;
    private final String scheme;
    private final String url;
    private final String username;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public HttpUrl(String str, String str2, String str3, String str4, int i10, List<String> list, List<String> list2, String str5, String str6) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list.getClass();
        str6.getClass();
        this.scheme = str;
        this.username = str2;
        this.password = str3;
        this.host = str4;
        this.port = i10;
        this.pathSegments = list;
        this.queryNamesAndValues = list2;
        this.fragment = str5;
        this.url = str6;
        this.isHttps = Intrinsics.areEqual(str, "https");
    }

    @JvmStatic
    public static final int defaultPort(String str) {
        return INSTANCE.defaultPort(str);
    }

    @JvmStatic
    @JvmName(name = "get")
    public static final HttpUrl get(String str) {
        return INSTANCE.get(str);
    }

    @JvmStatic
    @JvmName(name = "parse")
    public static final HttpUrl parse(String str) {
        return INSTANCE.parse(str);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedFragment", imports = {}))
    @JvmName(name = "-deprecated_encodedFragment")
    /* renamed from: -deprecated_encodedFragment, reason: not valid java name */
    public final String m1613deprecated_encodedFragment() {
        return encodedFragment();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedPassword", imports = {}))
    @JvmName(name = "-deprecated_encodedPassword")
    /* renamed from: -deprecated_encodedPassword, reason: not valid java name */
    public final String m1614deprecated_encodedPassword() {
        return encodedPassword();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedPath", imports = {}))
    @JvmName(name = "-deprecated_encodedPath")
    /* renamed from: -deprecated_encodedPath, reason: not valid java name */
    public final String m1615deprecated_encodedPath() {
        return encodedPath();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedPathSegments", imports = {}))
    @JvmName(name = "-deprecated_encodedPathSegments")
    /* renamed from: -deprecated_encodedPathSegments, reason: not valid java name */
    public final List<String> m1616deprecated_encodedPathSegments() {
        return encodedPathSegments();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedQuery", imports = {}))
    @JvmName(name = "-deprecated_encodedQuery")
    /* renamed from: -deprecated_encodedQuery, reason: not valid java name */
    public final String m1617deprecated_encodedQuery() {
        return encodedQuery();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedUsername", imports = {}))
    @JvmName(name = "-deprecated_encodedUsername")
    /* renamed from: -deprecated_encodedUsername, reason: not valid java name */
    public final String m1618deprecated_encodedUsername() {
        return encodedUsername();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "fragment", imports = {}))
    @JvmName(name = "-deprecated_fragment")
    /* renamed from: -deprecated_fragment, reason: not valid java name and from getter */
    public final String getFragment() {
        return this.fragment;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "host", imports = {}))
    @JvmName(name = "-deprecated_host")
    /* renamed from: -deprecated_host, reason: not valid java name and from getter */
    public final String getHost() {
        return this.host;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "password", imports = {}))
    @JvmName(name = "-deprecated_password")
    /* renamed from: -deprecated_password, reason: not valid java name and from getter */
    public final String getPassword() {
        return this.password;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "pathSegments", imports = {}))
    @JvmName(name = "-deprecated_pathSegments")
    /* renamed from: -deprecated_pathSegments, reason: not valid java name */
    public final List<String> m1622deprecated_pathSegments() {
        return this.pathSegments;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "pathSize", imports = {}))
    @JvmName(name = "-deprecated_pathSize")
    /* renamed from: -deprecated_pathSize, reason: not valid java name */
    public final int m1623deprecated_pathSize() {
        return pathSize();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "port", imports = {}))
    @JvmName(name = "-deprecated_port")
    /* renamed from: -deprecated_port, reason: not valid java name and from getter */
    public final int getPort() {
        return this.port;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "query", imports = {}))
    @JvmName(name = "-deprecated_query")
    /* renamed from: -deprecated_query, reason: not valid java name */
    public final String m1625deprecated_query() {
        return query();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "queryParameterNames", imports = {}))
    @JvmName(name = "-deprecated_queryParameterNames")
    /* renamed from: -deprecated_queryParameterNames, reason: not valid java name */
    public final Set<String> m1626deprecated_queryParameterNames() {
        return queryParameterNames();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "querySize", imports = {}))
    @JvmName(name = "-deprecated_querySize")
    /* renamed from: -deprecated_querySize, reason: not valid java name */
    public final int m1627deprecated_querySize() {
        return querySize();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "scheme", imports = {}))
    @JvmName(name = "-deprecated_scheme")
    /* renamed from: -deprecated_scheme, reason: not valid java name and from getter */
    public final String getScheme() {
        return this.scheme;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to toUri()", replaceWith = @ReplaceWith(expression = "toUri()", imports = {}))
    @JvmName(name = "-deprecated_uri")
    /* renamed from: -deprecated_uri, reason: not valid java name */
    public final URI m1629deprecated_uri() {
        return uri();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to toUrl()", replaceWith = @ReplaceWith(expression = "toUrl()", imports = {}))
    @JvmName(name = "-deprecated_url")
    /* renamed from: -deprecated_url, reason: not valid java name */
    public final URL m1630deprecated_url() {
        return url();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "username", imports = {}))
    @JvmName(name = "-deprecated_username")
    /* renamed from: -deprecated_username, reason: not valid java name and from getter */
    public final String getUsername() {
        return this.username;
    }

    @JvmName(name = "encodedFragment")
    public final String encodedFragment() {
        int indexOf$default;
        if (this.fragment == null) {
            return null;
        }
        indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) this.url, '#', 0, false, 6, (Object) null);
        return this.url.substring(indexOf$default + 1);
    }

    @JvmName(name = "encodedPassword")
    public final String encodedPassword() {
        int indexOf$default;
        int indexOf$default2;
        if (this.password.length() != 0) {
            indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) this.url, ':', this.scheme.length() + 3, false, 4, (Object) null);
            indexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) this.url, '@', 0, false, 6, (Object) null);
            return this.url.substring(indexOf$default + 1, indexOf$default2);
        }
        return "";
    }

    @JvmName(name = "encodedPath")
    public final String encodedPath() {
        int indexOf$default;
        indexOf$default = StringsKt__StringsKt.indexOf$default(this.url, IOUtils.DIR_SEPARATOR_UNIX, this.scheme.length() + 3, false, 4, (Object) null);
        String str = this.url;
        return this.url.substring(indexOf$default, Util.delimiterOffset(str, "?#", indexOf$default, str.length()));
    }

    @JvmName(name = "encodedPathSegments")
    public final List<String> encodedPathSegments() {
        int indexOf$default;
        indexOf$default = StringsKt__StringsKt.indexOf$default(this.url, IOUtils.DIR_SEPARATOR_UNIX, this.scheme.length() + 3, false, 4, (Object) null);
        String str = this.url;
        int delimiterOffset = Util.delimiterOffset(str, "?#", indexOf$default, str.length());
        ArrayList arrayList = new ArrayList();
        while (indexOf$default < delimiterOffset) {
            int i10 = indexOf$default + 1;
            int delimiterOffset2 = Util.delimiterOffset(this.url, IOUtils.DIR_SEPARATOR_UNIX, i10, delimiterOffset);
            arrayList.add(this.url.substring(i10, delimiterOffset2));
            indexOf$default = delimiterOffset2;
        }
        return arrayList;
    }

    @JvmName(name = "encodedQuery")
    public final String encodedQuery() {
        int indexOf$default;
        if (this.queryNamesAndValues == null) {
            return null;
        }
        indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) this.url, '?', 0, false, 6, (Object) null);
        int i10 = indexOf$default + 1;
        String str = this.url;
        return this.url.substring(i10, Util.delimiterOffset(str, '#', i10, str.length()));
    }

    @JvmName(name = "encodedUsername")
    public final String encodedUsername() {
        if (this.username.length() == 0) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        return this.url.substring(length, Util.delimiterOffset(str, ":@", length, str.length()));
    }

    public boolean equals(Object other) {
        if ((other instanceof HttpUrl) && Intrinsics.areEqual(((HttpUrl) other).url, this.url)) {
            return true;
        }
        return false;
    }

    @JvmName(name = "fragment")
    public final String fragment() {
        return this.fragment;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    @JvmName(name = "host")
    public final String host() {
        return this.host;
    }

    /* renamed from: isHttps, reason: from getter */
    public final boolean getIsHttps() {
        return this.isHttps;
    }

    public final Builder newBuilder() {
        int i10;
        Builder builder = new Builder();
        builder.setScheme$okhttp(this.scheme);
        builder.setEncodedUsername$okhttp(encodedUsername());
        builder.setEncodedPassword$okhttp(encodedPassword());
        builder.setHost$okhttp(this.host);
        if (this.port != INSTANCE.defaultPort(this.scheme)) {
            i10 = this.port;
        } else {
            i10 = -1;
        }
        builder.setPort$okhttp(i10);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.setEncodedFragment$okhttp(encodedFragment());
        return builder;
    }

    @JvmName(name = "password")
    public final String password() {
        return this.password;
    }

    @JvmName(name = "pathSegments")
    public final List<String> pathSegments() {
        return this.pathSegments;
    }

    @JvmName(name = "pathSize")
    public final int pathSize() {
        return this.pathSegments.size();
    }

    @JvmName(name = "port")
    public final int port() {
        return this.port;
    }

    @JvmName(name = "query")
    public final String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        INSTANCE.toQueryString$okhttp(this.queryNamesAndValues, sb);
        return sb.toString();
    }

    public final String queryParameter(String name) {
        name.getClass();
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            IntProgression d = RangesKt.d(RangesKt.until(0, list.size()), 2);
            int first = d.getFirst();
            int last = d.getLast();
            int step = d.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (!Intrinsics.areEqual(name, this.queryNamesAndValues.get(first))) {
                    if (first != last) {
                        first += step;
                    } else {
                        return null;
                    }
                }
                return this.queryNamesAndValues.get(first + 1);
            }
            return null;
        }
        return null;
    }

    public final String queryParameterName(int index) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            String str = list.get(index * 2);
            str.getClass();
            return str;
        }
        throw new IndexOutOfBoundsException();
    }

    @JvmName(name = "queryParameterNames")
    public final Set<String> queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return SetsKt.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        IntProgression d = RangesKt.d(RangesKt.until(0, this.queryNamesAndValues.size()), 2);
        int first = d.getFirst();
        int last = d.getLast();
        int step = d.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                String str = this.queryNamesAndValues.get(first);
                str.getClass();
                linkedHashSet.add(str);
                if (first == last) {
                    break;
                }
                first += step;
            }
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        unmodifiableSet.getClass();
        return unmodifiableSet;
    }

    public final String queryParameterValue(int index) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get((index * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List<String> queryParameterValues(String name) {
        name.getClass();
        if (this.queryNamesAndValues == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        IntProgression d = RangesKt.d(RangesKt.until(0, this.queryNamesAndValues.size()), 2);
        int first = d.getFirst();
        int last = d.getLast();
        int step = d.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                if (Intrinsics.areEqual(name, this.queryNamesAndValues.get(first))) {
                    arrayList.add(this.queryNamesAndValues.get(first + 1));
                }
                if (first == last) {
                    break;
                }
                first += step;
            }
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        unmodifiableList.getClass();
        return unmodifiableList;
    }

    @JvmName(name = "querySize")
    public final int querySize() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public final String redact() {
        Builder newBuilder = newBuilder("/...");
        newBuilder.getClass();
        return newBuilder.username("").password("").build().getUrl();
    }

    public final HttpUrl resolve(String link) {
        link.getClass();
        Builder newBuilder = newBuilder(link);
        if (newBuilder != null) {
            return newBuilder.build();
        }
        return null;
    }

    @JvmName(name = "scheme")
    public final String scheme() {
        return this.scheme;
    }

    /* renamed from: toString, reason: from getter */
    public String getUrl() {
        return this.url;
    }

    public final String topPrivateDomain() {
        if (Util.canParseAsIpAddress(this.host)) {
            return null;
        }
        return PublicSuffixDatabase.INSTANCE.get().getEffectiveTldPlusOne(this.host);
    }

    @JvmName(name = "uri")
    public final URI uri() {
        String builder = newBuilder().reencodeForUri$okhttp().toString();
        try {
            return new URI(builder);
        } catch (URISyntaxException e) {
            try {
                URI create = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(builder, ""));
                create.getClass();
                return create;
            } catch (Exception unused) {
                b.w(e);
                return null;
            }
        }
    }

    @JvmName(name = "url")
    public final URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e) {
            b.w(e);
            return null;
        }
    }

    @JvmName(name = "username")
    public final String username() {
        return this.username;
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0017\u0018\u0000 V2\u00020\u0001:\u0001VB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0004J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0004J\u0018\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010\u0004J\u000e\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0004J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0004J\u0018\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.H\u0002J\u0018\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u00042\b\u00101\u001a\u0004\u0018\u00010\u0004J\u0006\u00102\u001a\u000203J\b\u00104\u001a\u00020\u001bH\u0002J\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0004J\u000e\u00105\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u0004J\u0010\u00106\u001a\u00020\u00002\b\u00106\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0004J\u0010\u00107\u001a\u00020\u00002\b\u00107\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0004J\u0010\u00108\u001a\u00020.2\u0006\u00109\u001a\u00020\u0004H\u0002J\u0010\u0010:\u001a\u00020.2\u0006\u00109\u001a\u00020\u0004H\u0002J\u001f\u0010;\u001a\u00020\u00002\b\u0010<\u001a\u0004\u0018\u0001032\u0006\u00109\u001a\u00020\u0004H\u0000¢\u0006\u0002\b=J\u000e\u0010>\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u0004J\b\u0010?\u001a\u00020@H\u0002J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001bJ0\u0010A\u001a\u00020@2\u0006\u00109\u001a\u00020\u00042\u0006\u0010B\u001a\u00020\u001b2\u0006\u0010C\u001a\u00020\u001b2\u0006\u0010D\u001a\u00020.2\u0006\u0010-\u001a\u00020.H\u0002J\u0010\u0010E\u001a\u00020\u00002\b\u0010E\u001a\u0004\u0018\u00010\u0004J\r\u0010F\u001a\u00020\u0000H\u0000¢\u0006\u0002\bGJ\u0010\u0010H\u001a\u00020@2\u0006\u0010I\u001a\u00020\u0004H\u0002J\u000e\u0010J\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0004J\u000e\u0010K\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u0004J\u000e\u0010L\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u001bJ \u0010N\u001a\u00020@2\u0006\u00109\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u001b2\u0006\u0010C\u001a\u00020\u001bH\u0002J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0004J\u0016\u0010P\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u0004J\u0018\u0010Q\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010\u0004J\u0016\u0010R\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u0004J\u0018\u0010S\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u00042\b\u00101\u001a\u0004\u0018\u00010\u0004J\b\u0010T\u001a\u00020\u0004H\u0016J\u000e\u0010U\u001a\u00020\u00002\u0006\u0010U\u001a\u00020\u0004R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000f\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\bR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bR\u001a\u0010\u001a\u001a\u00020\u001bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\b¨\u0006W"}, d2 = {"Lokhttp3/HttpUrl$Builder;", "", "()V", "encodedFragment", "", "getEncodedFragment$okhttp", "()Ljava/lang/String;", "setEncodedFragment$okhttp", "(Ljava/lang/String;)V", "encodedPassword", "getEncodedPassword$okhttp", "setEncodedPassword$okhttp", "encodedPathSegments", "", "getEncodedPathSegments$okhttp", "()Ljava/util/List;", "encodedQueryNamesAndValues", "getEncodedQueryNamesAndValues$okhttp", "setEncodedQueryNamesAndValues$okhttp", "(Ljava/util/List;)V", "encodedUsername", "getEncodedUsername$okhttp", "setEncodedUsername$okhttp", "host", "getHost$okhttp", "setHost$okhttp", "port", "", "getPort$okhttp", "()I", "setPort$okhttp", "(I)V", "scheme", "getScheme$okhttp", "setScheme$okhttp", "addEncodedPathSegment", "encodedPathSegment", "addEncodedPathSegments", "addEncodedQueryParameter", "encodedName", "encodedValue", "addPathSegment", "pathSegment", "addPathSegments", "pathSegments", "alreadyEncoded", "", "addQueryParameter", "name", "value", "build", "Lokhttp3/HttpUrl;", "effectivePort", "encodedPath", "encodedQuery", "fragment", "isDot", "input", "isDotDot", "parse", "base", "parse$okhttp", "password", "pop", "", "push", "pos", "limit", "addTrailingSlash", "query", "reencodeForUri", "reencodeForUri$okhttp", "removeAllCanonicalQueryParameters", "canonicalName", "removeAllEncodedQueryParameters", "removeAllQueryParameters", "removePathSegment", "index", "resolvePath", "startPos", "setEncodedPathSegment", "setEncodedQueryParameter", "setPathSegment", "setQueryParameter", "toString", "username", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nHttpUrl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpUrl.kt\nokhttp3/HttpUrl$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1869:1\n1#2:1870\n1549#3:1871\n1620#3,3:1872\n1549#3:1875\n1620#3,3:1876\n*S KotlinDebug\n*F\n+ 1 HttpUrl.kt\nokhttp3/HttpUrl$Builder\n*L\n1180#1:1871\n1180#1:1872,3\n1181#1:1875\n1181#1:1876,3\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class Builder {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final String INVALID_HOST = "Invalid URL host";
        private String encodedFragment;
        private final List<String> encodedPathSegments;
        private List<String> encodedQueryNamesAndValues;
        private String host;
        private String scheme;
        private String encodedUsername = "";
        private String encodedPassword = "";
        private int port = -1;

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add("");
        }

        private final Builder addPathSegments(String pathSegments, boolean alreadyEncoded) {
            boolean z9;
            Builder builder;
            String str;
            boolean z10;
            int i10 = 0;
            while (true) {
                int delimiterOffset = Util.delimiterOffset(pathSegments, "/\\", i10, pathSegments.length());
                if (delimiterOffset < pathSegments.length()) {
                    z9 = true;
                    str = pathSegments;
                    z10 = alreadyEncoded;
                    builder = this;
                } else {
                    z9 = false;
                    builder = this;
                    str = pathSegments;
                    z10 = alreadyEncoded;
                }
                builder.push(str, i10, delimiterOffset, z9, z10);
                i10 = delimiterOffset + 1;
                if (i10 > str.length()) {
                    return builder;
                }
                pathSegments = str;
                alreadyEncoded = z10;
            }
        }

        private final int effectivePort() {
            int i10 = this.port;
            if (i10 != -1) {
                return i10;
            }
            Companion companion = HttpUrl.INSTANCE;
            String str = this.scheme;
            str.getClass();
            return companion.defaultPort(str);
        }

        private final boolean isDot(String input) {
            boolean equals;
            if (!Intrinsics.areEqual(input, ".")) {
                equals = StringsKt__StringsJVMKt.equals(input, "%2e", true);
                if (!equals) {
                    return false;
                }
                return true;
            }
            return true;
        }

        private final boolean isDotDot(String input) {
            boolean equals;
            boolean equals2;
            boolean equals3;
            if (!Intrinsics.areEqual(input, "..")) {
                equals = StringsKt__StringsJVMKt.equals(input, "%2e.", true);
                if (!equals) {
                    equals2 = StringsKt__StringsJVMKt.equals(input, ".%2e", true);
                    if (!equals2) {
                        equals3 = StringsKt__StringsJVMKt.equals(input, "%2e%2e", true);
                        if (!equals3) {
                            return false;
                        }
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }

        private final void pop() {
            if (this.encodedPathSegments.remove(r0.size() - 1).length() == 0 && !this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.set(r0.size() - 1, "");
            } else {
                this.encodedPathSegments.add("");
            }
        }

        private final void push(String input, int pos, int limit, boolean addTrailingSlash, boolean alreadyEncoded) {
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, input, pos, limit, HttpUrl.PATH_SEGMENT_ENCODE_SET, alreadyEncoded, false, false, false, null, 240, null);
            if (!isDot(canonicalize$okhttp$default)) {
                if (isDotDot(canonicalize$okhttp$default)) {
                    pop();
                    return;
                }
                int length = this.encodedPathSegments.get(r14.size() - 1).length();
                List<String> list = this.encodedPathSegments;
                if (length == 0) {
                    list.set(list.size() - 1, canonicalize$okhttp$default);
                } else {
                    list.add(canonicalize$okhttp$default);
                }
                if (addTrailingSlash) {
                    this.encodedPathSegments.add("");
                }
            }
        }

        private final void removeAllCanonicalQueryParameters(String canonicalName) {
            List<String> list = this.encodedQueryNamesAndValues;
            list.getClass();
            int size = list.size() - 2;
            int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(size, 0, -2);
            if (progressionLastElement > size) {
                return;
            }
            while (true) {
                List<String> list2 = this.encodedQueryNamesAndValues;
                list2.getClass();
                if (Intrinsics.areEqual(canonicalName, list2.get(size))) {
                    List<String> list3 = this.encodedQueryNamesAndValues;
                    list3.getClass();
                    list3.remove(size + 1);
                    List<String> list4 = this.encodedQueryNamesAndValues;
                    list4.getClass();
                    list4.remove(size);
                    List<String> list5 = this.encodedQueryNamesAndValues;
                    list5.getClass();
                    if (list5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (size != progressionLastElement) {
                    size -= 2;
                } else {
                    return;
                }
            }
        }

        private final void resolvePath(String input, int startPos, int limit) {
            boolean z9;
            if (startPos != limit) {
                char charAt = input.charAt(startPos);
                if (charAt != '/' && charAt != '\\') {
                    List<String> list = this.encodedPathSegments;
                    list.set(list.size() - 1, "");
                } else {
                    this.encodedPathSegments.clear();
                    this.encodedPathSegments.add("");
                    startPos++;
                }
                int i10 = startPos;
                while (i10 < limit) {
                    int delimiterOffset = Util.delimiterOffset(input, "/\\", i10, limit);
                    if (delimiterOffset < limit) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    String str = input;
                    push(str, i10, delimiterOffset, z9, true);
                    if (z9) {
                        i10 = delimiterOffset + 1;
                        input = str;
                    } else {
                        input = str;
                        i10 = delimiterOffset;
                    }
                }
            }
        }

        public final Builder addEncodedPathSegment(String encodedPathSegment) {
            encodedPathSegment.getClass();
            push(encodedPathSegment, 0, encodedPathSegment.length(), false, true);
            return this;
        }

        public final Builder addEncodedPathSegments(String encodedPathSegments) {
            encodedPathSegments.getClass();
            return addPathSegments(encodedPathSegments, true);
        }

        public final Builder addEncodedQueryParameter(String encodedName, String encodedValue) {
            String str;
            encodedName.getClass();
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            list.getClass();
            Companion companion = HttpUrl.INSTANCE;
            list.add(Companion.canonicalize$okhttp$default(companion, encodedName, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            list2.getClass();
            if (encodedValue != null) {
                str = Companion.canonicalize$okhttp$default(companion, encodedValue, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null);
            } else {
                str = null;
            }
            list2.add(str);
            return this;
        }

        public final Builder addPathSegment(String pathSegment) {
            pathSegment.getClass();
            push(pathSegment, 0, pathSegment.length(), false, false);
            return this;
        }

        public final Builder addQueryParameter(String name, String value) {
            String str;
            name.getClass();
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            list.getClass();
            Companion companion = HttpUrl.INSTANCE;
            list.add(Companion.canonicalize$okhttp$default(companion, name, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            list2.getClass();
            if (value != null) {
                str = Companion.canonicalize$okhttp$default(companion, value, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null);
            } else {
                str = null;
            }
            list2.add(str);
            return this;
        }

        public final HttpUrl build() {
            ArrayList arrayList;
            String str;
            String str2 = this.scheme;
            if (str2 != null) {
                Companion companion = HttpUrl.INSTANCE;
                String percentDecode$okhttp$default = Companion.percentDecode$okhttp$default(companion, this.encodedUsername, 0, 0, false, 7, null);
                String percentDecode$okhttp$default2 = Companion.percentDecode$okhttp$default(companion, this.encodedPassword, 0, 0, false, 7, null);
                String str3 = this.host;
                if (str3 != null) {
                    int effectivePort = effectivePort();
                    List<String> list = this.encodedPathSegments;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, (String) it.next(), 0, 0, false, 7, null));
                    }
                    List<String> list2 = this.encodedQueryNamesAndValues;
                    String str4 = null;
                    if (list2 != null) {
                        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                        for (String str5 : list2) {
                            if (str5 != null) {
                                str = Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, str5, 0, 0, true, 3, null);
                            } else {
                                str = null;
                            }
                            arrayList3.add(str);
                        }
                        arrayList = arrayList3;
                    } else {
                        arrayList = null;
                    }
                    String str6 = this.encodedFragment;
                    if (str6 != null) {
                        str4 = Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, str6, 0, 0, false, 7, null);
                    }
                    return new HttpUrl(str2, percentDecode$okhttp$default, percentDecode$okhttp$default2, str3, effectivePort, arrayList2, arrayList, str4, toString());
                }
                i.l("host == null");
                return null;
            }
            i.l("scheme == null");
            return null;
        }

        public final Builder encodedFragment(String encodedFragment) {
            String str;
            if (encodedFragment != null) {
                str = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, encodedFragment, 0, 0, "", true, false, false, true, null, 179, null);
            } else {
                str = null;
            }
            this.encodedFragment = str;
            return this;
        }

        public final Builder encodedPassword(String encodedPassword) {
            encodedPassword.getClass();
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, encodedPassword, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, TelnetCommand.BREAK, null);
            return this;
        }

        public final Builder encodedPath(String encodedPath) {
            boolean startsWith$default;
            encodedPath.getClass();
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(encodedPath, "/", false, 2, null);
            if (startsWith$default) {
                resolvePath(encodedPath, 0, encodedPath.length());
                return this;
            }
            l9.i.d("unexpected encodedPath: ".concat(encodedPath));
            return null;
        }

        public final Builder encodedQuery(String encodedQuery) {
            List<String> list;
            Companion companion;
            String canonicalize$okhttp$default;
            if (encodedQuery != null && (canonicalize$okhttp$default = Companion.canonicalize$okhttp$default((companion = HttpUrl.INSTANCE), encodedQuery, 0, 0, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 211, null)) != null) {
                list = companion.toQueryNamesAndValues$okhttp(canonicalize$okhttp$default);
            } else {
                list = null;
            }
            this.encodedQueryNamesAndValues = list;
            return this;
        }

        public final Builder encodedUsername(String encodedUsername) {
            encodedUsername.getClass();
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, encodedUsername, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, TelnetCommand.BREAK, null);
            return this;
        }

        public final Builder fragment(String fragment) {
            String str;
            if (fragment != null) {
                str = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, fragment, 0, 0, "", false, false, false, true, null, 187, null);
            } else {
                str = null;
            }
            this.encodedFragment = str;
            return this;
        }

        /* renamed from: getEncodedFragment$okhttp, reason: from getter */
        public final String getEncodedFragment() {
            return this.encodedFragment;
        }

        /* renamed from: getEncodedPassword$okhttp, reason: from getter */
        public final String getEncodedPassword() {
            return this.encodedPassword;
        }

        public final List<String> getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        public final List<String> getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        /* renamed from: getEncodedUsername$okhttp, reason: from getter */
        public final String getEncodedUsername() {
            return this.encodedUsername;
        }

        /* renamed from: getHost$okhttp, reason: from getter */
        public final String getHost() {
            return this.host;
        }

        /* renamed from: getPort$okhttp, reason: from getter */
        public final int getPort() {
            return this.port;
        }

        /* renamed from: getScheme$okhttp, reason: from getter */
        public final String getScheme() {
            return this.scheme;
        }

        public final Builder host(String host) {
            host.getClass();
            String canonicalHost = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, host, 0, 0, false, 7, null));
            if (canonicalHost != null) {
                this.host = canonicalHost;
                return this;
            }
            i.k(a.l("unexpected host: ", host));
            return null;
        }

        public final Builder parse$okhttp(HttpUrl base, String input) {
            String str;
            int delimiterOffset;
            char c;
            int i10;
            int i11;
            char c10;
            int i12;
            boolean startsWith;
            boolean startsWith2;
            String str2 = input;
            str2.getClass();
            int indexOfFirstNonAsciiWhitespace$default = Util.indexOfFirstNonAsciiWhitespace$default(str2, 0, 0, 3, null);
            int indexOfLastNonAsciiWhitespace$default = Util.indexOfLastNonAsciiWhitespace$default(str2, indexOfFirstNonAsciiWhitespace$default, 0, 2, null);
            Companion companion = INSTANCE;
            int schemeDelimiterOffset = companion.schemeDelimiterOffset(str2, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            char c11 = 65535;
            if (schemeDelimiterOffset != -1) {
                startsWith = StringsKt__StringsJVMKt.startsWith(str2, "https:", indexOfFirstNonAsciiWhitespace$default, true);
                if (!startsWith) {
                    startsWith2 = StringsKt__StringsJVMKt.startsWith(str2, "http:", indexOfFirstNonAsciiWhitespace$default, true);
                    if (startsWith2) {
                        this.scheme = "http";
                        indexOfFirstNonAsciiWhitespace$default += 5;
                    } else {
                        throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str2.substring(0, schemeDelimiterOffset) + '\'');
                    }
                } else {
                    this.scheme = "https";
                    indexOfFirstNonAsciiWhitespace$default += 6;
                }
            } else if (base != null) {
                this.scheme = base.scheme();
            } else {
                if (str2.length() > 6) {
                    str = StringsKt.take(str2, 6) + "...";
                } else {
                    str = str2;
                }
                i.k("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(str));
                return null;
            }
            int slashCount = companion.slashCount(str2, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            char c12 = '?';
            char c13 = '#';
            if (slashCount < 2 && base != null && Intrinsics.areEqual(base.scheme(), this.scheme)) {
                this.encodedUsername = base.encodedUsername();
                this.encodedPassword = base.encodedPassword();
                this.host = base.host();
                this.port = base.port();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(base.encodedPathSegments());
                if (indexOfFirstNonAsciiWhitespace$default == indexOfLastNonAsciiWhitespace$default || str2.charAt(indexOfFirstNonAsciiWhitespace$default) == '#') {
                    encodedQuery(base.encodedQuery());
                }
            } else {
                int i13 = indexOfFirstNonAsciiWhitespace$default + slashCount;
                boolean z9 = false;
                boolean z10 = false;
                while (true) {
                    delimiterOffset = Util.delimiterOffset(str2, "@/\\?#", i13, indexOfLastNonAsciiWhitespace$default);
                    if (delimiterOffset != indexOfLastNonAsciiWhitespace$default) {
                        c = str2.charAt(delimiterOffset);
                    } else {
                        c = c11;
                    }
                    if (c == c11 || c == c13 || c == '/' || c == '\\' || c == c12) {
                        break;
                    }
                    if (c == '@') {
                        if (!z9) {
                            int delimiterOffset2 = Util.delimiterOffset(str2, ':', i13, delimiterOffset);
                            Companion companion2 = HttpUrl.INSTANCE;
                            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion2, str2, i13, delimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z10) {
                                canonicalize$okhttp$default = this.encodedUsername + "%40" + canonicalize$okhttp$default;
                            }
                            this.encodedUsername = canonicalize$okhttp$default;
                            if (delimiterOffset2 != delimiterOffset) {
                                i11 = delimiterOffset;
                                this.encodedPassword = Companion.canonicalize$okhttp$default(companion2, input, delimiterOffset2 + 1, i11, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z9 = true;
                            } else {
                                i11 = delimiterOffset;
                            }
                            str2 = input;
                            i10 = i11;
                            z10 = true;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append(this.encodedPassword);
                            sb.append("%40");
                            str2 = input;
                            i10 = delimiterOffset;
                            sb.append(Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, str2, i13, delimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.encodedPassword = sb.toString();
                        }
                        i13 = i10 + 1;
                        c13 = '#';
                        c11 = 65535;
                        c12 = '?';
                    }
                }
                Companion companion3 = INSTANCE;
                int portColonOffset = companion3.portColonOffset(str2, i13, delimiterOffset);
                int i14 = portColonOffset + 1;
                if (i14 < delimiterOffset) {
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, str2, i13, portColonOffset, false, 4, null));
                    int parsePort = companion3.parsePort(str2, i14, delimiterOffset);
                    this.port = parsePort;
                    if (parsePort == -1) {
                        b.g(str2.substring(i14, delimiterOffset), "Invalid URL port: \"");
                        return null;
                    }
                } else {
                    Companion companion4 = HttpUrl.INSTANCE;
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(companion4, str2, i13, portColonOffset, false, 4, null));
                    String str3 = this.scheme;
                    str3.getClass();
                    this.port = companion4.defaultPort(str3);
                }
                if (this.host != null) {
                    indexOfFirstNonAsciiWhitespace$default = delimiterOffset;
                } else {
                    b.g(str2.substring(i13, portColonOffset), "Invalid URL host: \"");
                    return null;
                }
            }
            int delimiterOffset3 = Util.delimiterOffset(str2, "?#", indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            resolvePath(str2, indexOfFirstNonAsciiWhitespace$default, delimiterOffset3);
            if (delimiterOffset3 < indexOfLastNonAsciiWhitespace$default && str2.charAt(delimiterOffset3) == '?') {
                c10 = '#';
                int delimiterOffset4 = Util.delimiterOffset(str2, '#', delimiterOffset3, indexOfLastNonAsciiWhitespace$default);
                Companion companion5 = HttpUrl.INSTANCE;
                this.encodedQueryNamesAndValues = companion5.toQueryNamesAndValues$okhttp(Companion.canonicalize$okhttp$default(companion5, str2, delimiterOffset3 + 1, delimiterOffset4, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 208, null));
                i12 = delimiterOffset4;
            } else {
                c10 = '#';
                i12 = delimiterOffset3;
            }
            if (i12 < indexOfLastNonAsciiWhitespace$default && str2.charAt(i12) == c10) {
                this.encodedFragment = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, str2, i12 + 1, indexOfLastNonAsciiWhitespace$default, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        public final Builder password(String password) {
            password.getClass();
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        public final Builder port(int port) {
            if (1 <= port && port < 65536) {
                this.port = port;
                return this;
            }
            l9.i.d(a.e(port, "unexpected port: "));
            return null;
        }

        public final Builder query(String query) {
            List<String> list;
            Companion companion;
            String canonicalize$okhttp$default;
            if (query != null && (canonicalize$okhttp$default = Companion.canonicalize$okhttp$default((companion = HttpUrl.INSTANCE), query, 0, 0, HttpUrl.QUERY_ENCODE_SET, false, false, true, false, null, 219, null)) != null) {
                list = companion.toQueryNamesAndValues$okhttp(canonicalize$okhttp$default);
            } else {
                list = null;
            }
            this.encodedQueryNamesAndValues = list;
            return this;
        }

        public final Builder reencodeForUri$okhttp() {
            String str;
            String str2;
            String str3 = this.host;
            String str4 = null;
            if (str3 != null) {
                str = new Regex("[\"<>^`{|}]").replace(str3, "");
            } else {
                str = null;
            }
            this.host = str;
            int size = this.encodedPathSegments.size();
            for (int i10 = 0; i10 < size; i10++) {
                List<String> list = this.encodedPathSegments;
                list.set(i10, Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, list.get(i10), 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, null, FTPReply.ENTERING_PASSIVE_MODE, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    String str5 = list2.get(i11);
                    if (str5 != null) {
                        str2 = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, str5, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, null, 195, null);
                    } else {
                        str2 = null;
                    }
                    list2.set(i11, str2);
                }
            }
            String str6 = this.encodedFragment;
            if (str6 != null) {
                str4 = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, str6, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, true, null, 163, null);
            }
            this.encodedFragment = str4;
            return this;
        }

        public final Builder removeAllEncodedQueryParameters(String encodedName) {
            encodedName.getClass();
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, encodedName, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            return this;
        }

        public final Builder removeAllQueryParameters(String name) {
            name.getClass();
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, name, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            return this;
        }

        public final Builder removePathSegment(int index) {
            this.encodedPathSegments.remove(index);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            }
            return this;
        }

        public final Builder scheme(String scheme) {
            boolean equals;
            boolean equals2;
            scheme.getClass();
            equals = StringsKt__StringsJVMKt.equals(scheme, "http", true);
            if (!equals) {
                equals2 = StringsKt__StringsJVMKt.equals(scheme, "https", true);
                if (equals2) {
                    this.scheme = "https";
                    return this;
                }
                i.k("unexpected scheme: ".concat(scheme));
                return null;
            }
            this.scheme = "http";
            return this;
        }

        public final void setEncodedFragment$okhttp(String str) {
            this.encodedFragment = str;
        }

        public final void setEncodedPassword$okhttp(String str) {
            str.getClass();
            this.encodedPassword = str;
        }

        public final Builder setEncodedPathSegment(int index, String encodedPathSegment) {
            encodedPathSegment.getClass();
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, encodedPathSegment, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, true, false, false, false, null, TelnetCommand.BREAK, null);
            this.encodedPathSegments.set(index, canonicalize$okhttp$default);
            if (!isDot(canonicalize$okhttp$default) && !isDotDot(canonicalize$okhttp$default)) {
                return this;
            }
            l9.i.d(a.l("unexpected path segment: ", encodedPathSegment));
            return null;
        }

        public final void setEncodedQueryNamesAndValues$okhttp(List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        public final Builder setEncodedQueryParameter(String encodedName, String encodedValue) {
            encodedName.getClass();
            removeAllEncodedQueryParameters(encodedName);
            addEncodedQueryParameter(encodedName, encodedValue);
            return this;
        }

        public final void setEncodedUsername$okhttp(String str) {
            str.getClass();
            this.encodedUsername = str;
        }

        public final void setHost$okhttp(String str) {
            this.host = str;
        }

        public final Builder setPathSegment(int index, String pathSegment) {
            pathSegment.getClass();
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, pathSegment, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, false, false, false, false, null, 251, null);
            if (!isDot(canonicalize$okhttp$default) && !isDotDot(canonicalize$okhttp$default)) {
                this.encodedPathSegments.set(index, canonicalize$okhttp$default);
                return this;
            }
            l9.i.d(a.l("unexpected path segment: ", pathSegment));
            return null;
        }

        public final void setPort$okhttp(int i10) {
            this.port = i10;
        }

        public final Builder setQueryParameter(String name, String value) {
            name.getClass();
            removeAllQueryParameters(name);
            addQueryParameter(name, value);
            return this;
        }

        public final void setScheme$okhttp(String str) {
            this.scheme = str;
        }

        public String toString() {
            boolean contains$default;
            StringBuilder sb = new StringBuilder();
            String str = this.scheme;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (this.encodedUsername.length() > 0 || this.encodedPassword.length() > 0) {
                sb.append(this.encodedUsername);
                if (this.encodedPassword.length() > 0) {
                    sb.append(':');
                    sb.append(this.encodedPassword);
                }
                sb.append('@');
            }
            String str2 = this.host;
            if (str2 != null) {
                contains$default = StringsKt__StringsKt.contains$default((CharSequence) str2, ':', false, 2, (Object) null);
                if (contains$default) {
                    sb.append('[');
                    sb.append(this.host);
                    sb.append(']');
                } else {
                    sb.append(this.host);
                }
            }
            if (this.port != -1 || this.scheme != null) {
                int effectivePort = effectivePort();
                String str3 = this.scheme;
                if (str3 == null || effectivePort != HttpUrl.INSTANCE.defaultPort(str3)) {
                    sb.append(':');
                    sb.append(effectivePort);
                }
            }
            Companion companion = HttpUrl.INSTANCE;
            companion.toPathString$okhttp(this.encodedPathSegments, sb);
            if (this.encodedQueryNamesAndValues != null) {
                sb.append('?');
                List<String> list = this.encodedQueryNamesAndValues;
                list.getClass();
                companion.toQueryString$okhttp(list, sb);
            }
            if (this.encodedFragment != null) {
                sb.append('#');
                sb.append(this.encodedFragment);
            }
            return sb.toString();
        }

        public final Builder username(String username) {
            username.getClass();
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J \u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J \u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J\u001c\u0010\f\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lokhttp3/HttpUrl$Builder$Companion;", "", "()V", "INVALID_HOST", "", "parsePort", "", "input", "pos", "limit", "portColonOffset", "schemeDelimiterOffset", "slashCount", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        /* loaded from: classes2.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int parsePort(String input, int pos, int limit) {
                int parseInt;
                try {
                    parseInt = Integer.parseInt(Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, input, pos, limit, "", false, false, false, false, null, TelnetCommand.EL, null));
                } catch (NumberFormatException unused) {
                }
                if (1 > parseInt || parseInt >= 65536) {
                    return -1;
                }
                return parseInt;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int portColonOffset(String input, int pos, int limit) {
                while (pos < limit) {
                    char charAt = input.charAt(pos);
                    if (charAt != '[') {
                        if (charAt == ':') {
                            return pos;
                        }
                        pos++;
                    }
                    do {
                        pos++;
                        if (pos < limit) {
                        }
                        pos++;
                    } while (input.charAt(pos) != ']');
                    pos++;
                }
                return limit;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int schemeDelimiterOffset(String input, int pos, int limit) {
                if (limit - pos < 2) {
                    return -1;
                }
                char charAt = input.charAt(pos);
                if ((Intrinsics.compare((int) charAt, 97) >= 0 && Intrinsics.compare((int) charAt, 122) <= 0) || (Intrinsics.compare((int) charAt, 65) >= 0 && Intrinsics.compare((int) charAt, 90) <= 0)) {
                    while (true) {
                        pos++;
                        if (pos >= limit) {
                            break;
                        }
                        char charAt2 = input.charAt(pos);
                        if ('a' > charAt2 || charAt2 >= '{') {
                            if ('A' > charAt2 || charAt2 >= '[') {
                                if ('0' > charAt2 || charAt2 >= ':') {
                                    if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                        if (charAt2 == ':') {
                                            return pos;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return -1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int slashCount(String str, int i10, int i11) {
                int i12 = 0;
                while (i10 < i11) {
                    char charAt = str.charAt(i10);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i12++;
                    i10++;
                }
                return i12;
            }

            private Companion() {
            }
        }

        public final Builder addPathSegments(String pathSegments) {
            pathSegments.getClass();
            return addPathSegments(pathSegments, false);
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0019\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\r\u001a\u00020\f*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\n*\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J]\u0010\u0018\u001a\u00020\f*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010#\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00050\u001d2\n\u0010 \u001a\u00060\u001ej\u0002`\u001fH\u0000¢\u0006\u0004\b!\u0010\"J'\u0010%\u001a\u00020\f*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u001d2\n\u0010 \u001a\u00060\u001ej\u0002`\u001fH\u0000¢\u0006\u0004\b$\u0010\"J\u001b\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050&*\u00020\u0005H\u0000¢\u0006\u0004\b'\u0010(J\u0013\u0010-\u001a\u00020**\u00020\u0005H\u0007¢\u0006\u0004\b+\u0010,J\u0015\u0010/\u001a\u0004\u0018\u00010**\u00020\u0005H\u0007¢\u0006\u0004\b.\u0010,J\u0015\u0010/\u001a\u0004\u0018\u00010**\u000200H\u0007¢\u0006\u0004\b+\u00101J\u0015\u0010/\u001a\u0004\u0018\u00010**\u000202H\u0007¢\u0006\u0004\b+\u00103J\u0017\u0010+\u001a\u00020*2\u0006\u00104\u001a\u00020\u0005H\u0007¢\u0006\u0004\b5\u0010,J\u0019\u0010.\u001a\u0004\u0018\u00010*2\u0006\u00104\u001a\u00020\u0005H\u0007¢\u0006\u0004\b6\u0010,J\u0019\u0010+\u001a\u0004\u0018\u00010*2\u0006\u00104\u001a\u000200H\u0007¢\u0006\u0004\b5\u00101J\u0019\u0010+\u001a\u0004\u0018\u00010*2\u0006\u00107\u001a\u000202H\u0007¢\u0006\u0004\b5\u00103J1\u0010:\u001a\u00020\u0005*\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b8\u00109Jc\u0010=\u001a\u00020\u0005*\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b@\u0010?R\u0014\u0010A\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\bA\u0010?R\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010E\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\bE\u0010?R\u0014\u0010F\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\bF\u0010?R\u0014\u0010G\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\bG\u0010?R\u0014\u0010H\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\bH\u0010?R\u0014\u0010I\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\bI\u0010?R\u0014\u0010J\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\bJ\u0010?R\u0014\u0010K\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\bK\u0010?R\u0014\u0010L\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\bL\u0010?¨\u0006M"}, d2 = {"Lokhttp3/HttpUrl$Companion;", "", "<init>", "()V", "Ll9/l;", "", "encoded", "", "pos", "limit", "", "plusIsSpace", "", "writePercentDecoded", "(Ll9/l;Ljava/lang/String;IIZ)V", "isPercentEncoded", "(Ljava/lang/String;II)Z", "input", "encodeSet", "alreadyEncoded", "strict", "unicodeAllowed", "Ljava/nio/charset/Charset;", "charset", "writeCanonicalized", "(Ll9/l;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)V", "scheme", "defaultPort", "(Ljava/lang/String;)I", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "out", "toPathString$okhttp", "(Ljava/util/List;Ljava/lang/StringBuilder;)V", "toPathString", "toQueryString$okhttp", "toQueryString", "", "toQueryNamesAndValues$okhttp", "(Ljava/lang/String;)Ljava/util/List;", "toQueryNamesAndValues", "Lokhttp3/HttpUrl;", "get", "(Ljava/lang/String;)Lokhttp3/HttpUrl;", "toHttpUrl", "parse", "toHttpUrlOrNull", "Ljava/net/URL;", "(Ljava/net/URL;)Lokhttp3/HttpUrl;", "Ljava/net/URI;", "(Ljava/net/URI;)Lokhttp3/HttpUrl;", "url", "-deprecated_get", "-deprecated_parse", "uri", "percentDecode$okhttp", "(Ljava/lang/String;IIZ)Ljava/lang/String;", "percentDecode", "canonicalize$okhttp", "(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;", "canonicalize", "FORM_ENCODE_SET", "Ljava/lang/String;", "FRAGMENT_ENCODE_SET", "FRAGMENT_ENCODE_SET_URI", "", "HEX_DIGITS", "[C", "PASSWORD_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET_URI", "QUERY_COMPONENT_ENCODE_SET", "QUERY_COMPONENT_ENCODE_SET_URI", "QUERY_COMPONENT_REENCODE_SET", "QUERY_ENCODE_SET", "USERNAME_ENCODE_SET", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ String canonicalize$okhttp$default(Companion companion, String str, int i10, int i11, String str2, boolean z9, boolean z10, boolean z11, boolean z12, Charset charset, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 8) != 0) {
                z9 = false;
            }
            if ((i12 & 16) != 0) {
                z10 = false;
            }
            if ((i12 & 32) != 0) {
                z11 = false;
            }
            if ((i12 & 64) != 0) {
                z12 = false;
            }
            if ((i12 & 128) != 0) {
                charset = null;
            }
            return companion.canonicalize$okhttp(str, i10, i11, str2, z9, z10, z11, z12, charset);
        }

        private final boolean isPercentEncoded(String str, int i10, int i11) {
            int i12 = i10 + 2;
            if (i12 < i11 && str.charAt(i10) == '%' && Util.parseHexDigit(str.charAt(i10 + 1)) != -1 && Util.parseHexDigit(str.charAt(i12)) != -1) {
                return true;
            }
            return false;
        }

        public static /* synthetic */ String percentDecode$okhttp$default(Companion companion, String str, int i10, int i11, boolean z9, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 4) != 0) {
                z9 = false;
            }
            return companion.percentDecode$okhttp(str, i10, i11, z9);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2, types: [l9.l] */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v5 */
        private final void writeCanonicalized(l lVar, String str, int i10, int i11, String str2, boolean z9, boolean z10, boolean z11, boolean z12, Charset charset) {
            boolean contains$default;
            ?? r1 = 0;
            while (i10 < i11) {
                int codePointAt = str.codePointAt(i10);
                if (!z9 || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                    if (codePointAt == 43 && z11) {
                        lVar.u0(z9 ? "+" : "%2B");
                    } else {
                        if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || z12)) {
                            contains$default = StringsKt__StringsKt.contains$default(str2, (char) codePointAt, false, 2, (Object) null);
                            if (!contains$default && (codePointAt != 37 || (z9 && (!z10 || isPercentEncoded(str, i10, i11))))) {
                                lVar.v0(codePointAt);
                            }
                        }
                        if (r1 == 0) {
                            r1 = new Object();
                        }
                        if (charset != null && !Intrinsics.areEqual(charset, StandardCharsets.UTF_8)) {
                            r1.s0(str, i10, Character.charCount(codePointAt) + i10, charset);
                        } else {
                            r1.v0(codePointAt);
                        }
                        while (!r1.k()) {
                            byte readByte = r1.readByte();
                            int i12 = readByte & UByte.MAX_VALUE;
                            lVar.m0(37);
                            lVar.m0(HttpUrl.HEX_DIGITS[(i12 >> 4) & 15]);
                            lVar.m0(HttpUrl.HEX_DIGITS[readByte & 15]);
                        }
                    }
                }
                i10 += Character.charCount(codePointAt);
                r1 = r1;
            }
        }

        private final void writePercentDecoded(l lVar, String str, int i10, int i11, boolean z9) {
            int i12;
            while (i10 < i11) {
                int codePointAt = str.codePointAt(i10);
                if (codePointAt == 37 && (i12 = i10 + 2) < i11) {
                    int parseHexDigit = Util.parseHexDigit(str.charAt(i10 + 1));
                    int parseHexDigit2 = Util.parseHexDigit(str.charAt(i12));
                    if (parseHexDigit != -1 && parseHexDigit2 != -1) {
                        lVar.m0((parseHexDigit << 4) + parseHexDigit2);
                        i10 = Character.charCount(codePointAt) + i12;
                    }
                    lVar.v0(codePointAt);
                    i10 += Character.charCount(codePointAt);
                } else {
                    if (codePointAt == 43 && z9) {
                        lVar.m0(32);
                        i10++;
                    }
                    lVar.v0(codePointAt);
                    i10 += Character.charCount(codePointAt);
                }
            }
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "url.toHttpUrl()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrl"}))
        @JvmName(name = "-deprecated_get")
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m1632deprecated_get(String url) {
            url.getClass();
            return get(url);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @JvmName(name = "-deprecated_parse")
        /* renamed from: -deprecated_parse, reason: not valid java name */
        public final HttpUrl m1635deprecated_parse(String url) {
            url.getClass();
            return parse(url);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, l9.l] */
        public final String canonicalize$okhttp(String str, int i10, int i11, String str2, boolean z9, boolean z10, boolean z11, boolean z12, Charset charset) {
            boolean contains$default;
            str.getClass();
            str2.getClass();
            int i12 = i10;
            while (i12 < i11) {
                int codePointAt = str.codePointAt(i12);
                if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || z12)) {
                    contains$default = StringsKt__StringsKt.contains$default(str2, (char) codePointAt, false, 2, (Object) null);
                    if (!contains$default && ((codePointAt != 37 || (z9 && (!z10 || isPercentEncoded(str, i12, i11)))) && (codePointAt != 43 || !z11))) {
                        i12 += Character.charCount(codePointAt);
                    }
                }
                ?? obj = new Object();
                obj.t0(i10, i12, str);
                writeCanonicalized(obj, str, i12, i11, str2, z9, z10, z11, z12, charset);
                return obj.h0();
            }
            return str.substring(i10, i11);
        }

        @JvmStatic
        public final int defaultPort(String scheme) {
            scheme.getClass();
            if (Intrinsics.areEqual(scheme, "http")) {
                return 80;
            }
            if (Intrinsics.areEqual(scheme, "https")) {
                return 443;
            }
            return -1;
        }

        @JvmStatic
        @JvmName(name = "get")
        public final HttpUrl get(String str) {
            str.getClass();
            return new Builder().parse$okhttp(null, str).build();
        }

        @JvmStatic
        @JvmName(name = "parse")
        public final HttpUrl parse(String str) {
            str.getClass();
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, l9.l] */
        public final String percentDecode$okhttp(String str, int i10, int i11, boolean z9) {
            str.getClass();
            for (int i12 = i10; i12 < i11; i12++) {
                char charAt = str.charAt(i12);
                if (charAt == '%' || (charAt == '+' && z9)) {
                    ?? obj = new Object();
                    obj.t0(i10, i12, str);
                    writePercentDecoded(obj, str, i12, i11, z9);
                    return obj.h0();
                }
            }
            return str.substring(i10, i11);
        }

        public final void toPathString$okhttp(List<String> list, StringBuilder sb) {
            list.getClass();
            sb.getClass();
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb.append(IOUtils.DIR_SEPARATOR_UNIX);
                sb.append(list.get(i10));
            }
        }

        public final List<String> toQueryNamesAndValues$okhttp(String str) {
            int indexOf$default;
            int indexOf$default2;
            str.getClass();
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= str.length()) {
                indexOf$default = StringsKt__StringsKt.indexOf$default(str, Typography.amp, i10, false, 4, (Object) null);
                if (indexOf$default == -1) {
                    indexOf$default = str.length();
                }
                indexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) str, '=', i10, false, 4, (Object) null);
                if (indexOf$default2 != -1 && indexOf$default2 <= indexOf$default) {
                    arrayList.add(str.substring(i10, indexOf$default2));
                    arrayList.add(str.substring(indexOf$default2 + 1, indexOf$default));
                } else {
                    arrayList.add(str.substring(i10, indexOf$default));
                    arrayList.add(null);
                }
                i10 = indexOf$default + 1;
            }
            return arrayList;
        }

        public final void toQueryString$okhttp(List<String> list, StringBuilder sb) {
            list.getClass();
            sb.getClass();
            IntProgression d = RangesKt.d(RangesKt.until(0, list.size()), 2);
            int first = d.getFirst();
            int last = d.getLast();
            int step = d.getStep();
            if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
                return;
            }
            while (true) {
                String str = list.get(first);
                String str2 = list.get(first + 1);
                if (first > 0) {
                    sb.append(Typography.amp);
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (first != last) {
                    first += step;
                } else {
                    return;
                }
            }
        }

        private Companion() {
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @JvmName(name = "-deprecated_get")
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m1634deprecated_get(URL url) {
            url.getClass();
            return get(url);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "uri.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @JvmName(name = "-deprecated_get")
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m1633deprecated_get(URI uri) {
            uri.getClass();
            return get(uri);
        }

        @JvmStatic
        @JvmName(name = "get")
        public final HttpUrl get(URL url) {
            url.getClass();
            String url2 = url.toString();
            url2.getClass();
            return parse(url2);
        }

        @JvmStatic
        @JvmName(name = "get")
        public final HttpUrl get(URI uri) {
            uri.getClass();
            String uri2 = uri.toString();
            uri2.getClass();
            return parse(uri2);
        }
    }

    @JvmStatic
    @JvmName(name = "get")
    public static final HttpUrl get(URI uri) {
        return INSTANCE.get(uri);
    }

    @JvmStatic
    @JvmName(name = "get")
    public static final HttpUrl get(URL url) {
        return INSTANCE.get(url);
    }

    public final Builder newBuilder(String link) {
        link.getClass();
        try {
            return new Builder().parse$okhttp(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
