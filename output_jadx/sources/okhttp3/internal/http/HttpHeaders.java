package okhttp3.internal.http;

import androidx.constraintlayout.widget.ConstraintLayout;
import j1.i;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import l9.l;
import l9.o;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import w7.c;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u000b\u001a\u00020\n*\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0012\u001a\u00020\r*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0015\u001a!\u0010\u001b\u001a\u00020\n*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0011\u0010\u001e\u001a\u00020\r*\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0017\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001dH\u0007¢\u0006\u0004\b!\u0010\u001f\"\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$\"\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$¨\u0006&"}, d2 = {"Lokhttp3/Headers;", "", "headerName", "", "Lokhttp3/Challenge;", "parseChallenges", "(Lokhttp3/Headers;Ljava/lang/String;)Ljava/util/List;", "Ll9/l;", "", "result", "", "readChallengeHeader", "(Ll9/l;Ljava/util/List;)V", "", "skipCommasAndWhitespace", "(Ll9/l;)Z", "", "prefix", "startsWith", "(Ll9/l;B)Z", "readQuotedString", "(Ll9/l;)Ljava/lang/String;", "readToken", "Lokhttp3/CookieJar;", "Lokhttp3/HttpUrl;", "url", "headers", "receiveHeaders", "(Lokhttp3/CookieJar;Lokhttp3/HttpUrl;Lokhttp3/Headers;)V", "Lokhttp3/Response;", "promisesBody", "(Lokhttp3/Response;)Z", "response", "hasBody", "Ll9/o;", "QUOTED_STRING_DELIMITERS", "Ll9/o;", "TOKEN_DELIMITERS", "okhttp"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmName(name = "HttpHeaders")
/* loaded from: classes2.dex */
public final class HttpHeaders {
    private static final o QUOTED_STRING_DELIMITERS;
    private static final o TOKEN_DELIMITERS;

    static {
        o oVar = o.e;
        QUOTED_STRING_DELIMITERS = c.k("\"\\");
        TOKEN_DELIMITERS = c.k("\t ,=");
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "No longer supported", replaceWith = @ReplaceWith(expression = "response.promisesBody()", imports = {}))
    public static final boolean hasBody(Response response) {
        response.getClass();
        return promisesBody(response);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, l9.l] */
    public static final List<Challenge> parseChallenges(Headers headers, String str) {
        boolean equals;
        headers.getClass();
        str.getClass();
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            equals = StringsKt__StringsJVMKt.equals(str, headers.name(i10), true);
            if (equals) {
                ?? obj = new Object();
                obj.u0(headers.value(i10));
                try {
                    readChallengeHeader(obj, arrayList);
                } catch (EOFException e) {
                    Platform.INSTANCE.get().log("Unable to parse challenge", 5, e);
                }
            }
        }
        return arrayList;
    }

    public static final boolean promisesBody(Response response) {
        boolean equals;
        response.getClass();
        if (!Intrinsics.areEqual(response.request().method(), "HEAD")) {
            int code = response.code();
            if (((code >= 100 && code < 200) || code == 204 || code == 304) && Util.headersContentLength(response) == -1) {
                equals = StringsKt__StringsJVMKt.equals("chunked", Response.header$default(response, "Transfer-Encoding", null, 2, null), true);
                if (!equals) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b7, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b7, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void readChallengeHeader(l9.l r7, java.util.List<okhttp3.Challenge> r8) {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Lf
            skipCommasAndWhitespace(r7)
            java.lang.String r1 = readToken(r7)
            if (r1 != 0) goto Lf
            goto Lb4
        Lf:
            boolean r2 = skipCommasAndWhitespace(r7)
            java.lang.String r3 = readToken(r7)
            if (r3 != 0) goto L2e
            boolean r7 = r7.k()
            if (r7 != 0) goto L21
            goto Lb4
        L21:
            okhttp3.Challenge r7 = new okhttp3.Challenge
            java.util.Map r0 = kotlin.collections.MapsKt.emptyMap()
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2e:
            r4 = 61
            int r5 = okhttp3.internal.Util.skipAll(r7, r4)
            boolean r6 = skipCommasAndWhitespace(r7)
            if (r2 != 0) goto L63
            if (r6 != 0) goto L42
            boolean r2 = r7.k()
            if (r2 == 0) goto L63
        L42:
            okhttp3.Challenge r2 = new okhttp3.Challenge
            java.lang.StringBuilder r3 = ai.onnxruntime.a.u(r3)
            java.lang.String r4 = "="
            java.lang.String r4 = kotlin.text.StringsKt.E(r5, r4)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            r3.getClass()
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L63:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = okhttp3.internal.Util.skipAll(r7, r4)
            int r6 = r6 + r5
        L6d:
            if (r3 != 0) goto L7e
            java.lang.String r3 = readToken(r7)
            boolean r5 = skipCommasAndWhitespace(r7)
            if (r5 != 0) goto Lb7
            int r5 = okhttp3.internal.Util.skipAll(r7, r4)
            r6 = r5
        L7e:
            if (r6 == 0) goto Lb7
            r5 = 1
            if (r6 <= r5) goto L84
            goto Lb4
        L84:
            boolean r5 = skipCommasAndWhitespace(r7)
            if (r5 == 0) goto L8b
            goto Lb4
        L8b:
            r5 = 34
            boolean r5 = startsWith(r7, r5)
            if (r5 == 0) goto L98
            java.lang.String r5 = readQuotedString(r7)
            goto L9c
        L98:
            java.lang.String r5 = readToken(r7)
        L9c:
            if (r5 != 0) goto L9f
            goto Lb4
        L9f:
            java.lang.Object r3 = r2.put(r3, r5)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto La8
            goto Lb4
        La8:
            boolean r3 = skipCommasAndWhitespace(r7)
            if (r3 != 0) goto Lb5
            boolean r3 = r7.k()
            if (r3 != 0) goto Lb5
        Lb4:
            return
        Lb5:
            r3 = r0
            goto L6d
        Lb7:
            okhttp3.Challenge r4 = new okhttp3.Challenge
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.HttpHeaders.readChallengeHeader(l9.l, java.util.List):void");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, l9.l] */
    private static final String readQuotedString(l lVar) {
        if (lVar.readByte() == 34) {
            ?? obj = new Object();
            while (true) {
                long d02 = lVar.d0(QUOTED_STRING_DELIMITERS);
                if (d02 == -1) {
                    return null;
                }
                if (lVar.V(d02) == 34) {
                    obj.write(lVar, d02);
                    lVar.readByte();
                    return obj.h0();
                }
                if (lVar.c == d02 + 1) {
                    return null;
                }
                obj.write(lVar, d02);
                lVar.readByte();
                obj.write(lVar, 1L);
            }
        } else {
            i.k("Failed requirement.");
            return null;
        }
    }

    private static final String readToken(l lVar) {
        long d02 = lVar.d0(TOKEN_DELIMITERS);
        if (d02 == -1) {
            d02 = lVar.c;
        }
        if (d02 != 0) {
            return lVar.g0(d02, Charsets.UTF_8);
        }
        return null;
    }

    public static final void receiveHeaders(CookieJar cookieJar, HttpUrl httpUrl, Headers headers) {
        cookieJar.getClass();
        httpUrl.getClass();
        headers.getClass();
        if (cookieJar != CookieJar.NO_COOKIES) {
            List<Cookie> parseAll = Cookie.INSTANCE.parseAll(httpUrl, headers);
            if (parseAll.isEmpty()) {
                return;
            }
            cookieJar.saveFromResponse(httpUrl, parseAll);
        }
    }

    private static final boolean skipCommasAndWhitespace(l lVar) {
        boolean z9 = false;
        while (!lVar.k()) {
            byte V = lVar.V(0L);
            if (V == 44) {
                lVar.readByte();
                z9 = true;
            } else {
                if (V != 32 && V != 9) {
                    break;
                }
                lVar.readByte();
            }
        }
        return z9;
    }

    private static final boolean startsWith(l lVar, byte b10) {
        if (!lVar.k() && lVar.V(0L) == b10) {
            return true;
        }
        return false;
    }
}
