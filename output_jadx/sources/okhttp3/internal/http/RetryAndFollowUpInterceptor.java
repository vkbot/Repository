package okhttp3.internal.http;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012H\u0002J(\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0012H\u0002J\u0018\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lokhttp3/internal/http/RetryAndFollowUpInterceptor;", "Lokhttp3/Interceptor;", "client", "Lokhttp3/OkHttpClient;", "(Lokhttp3/OkHttpClient;)V", "buildRedirectRequest", "Lokhttp3/Request;", "userResponse", "Lokhttp3/Response;", "method", "", "followUpRequest", "exchange", "Lokhttp3/internal/connection/Exchange;", "intercept", "chain", "Lokhttp3/Interceptor$Chain;", "isRecoverable", "", "e", "Ljava/io/IOException;", "requestSendStarted", "recover", NotificationCompat.CATEGORY_CALL, "Lokhttp3/internal/connection/RealCall;", "userRequest", "requestIsOneShot", "retryAfter", "", "defaultDelay", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class RetryAndFollowUpInterceptor implements Interceptor {
    private static final int MAX_FOLLOW_UPS = 20;
    private final OkHttpClient client;

    public RetryAndFollowUpInterceptor(OkHttpClient okHttpClient) {
        okHttpClient.getClass();
        this.client = okHttpClient;
    }

    private final Request buildRedirectRequest(Response userResponse, String method) {
        String header$default;
        HttpUrl resolve;
        boolean z9;
        RequestBody requestBody = null;
        if (!this.client.followRedirects() || (header$default = Response.header$default(userResponse, "Location", null, 2, null)) == null || (resolve = userResponse.request().url().resolve(header$default)) == null) {
            return null;
        }
        if (!Intrinsics.areEqual(resolve.scheme(), userResponse.request().url().scheme()) && !this.client.followSslRedirects()) {
            return null;
        }
        Request.Builder newBuilder = userResponse.request().newBuilder();
        if (HttpMethod.permitsRequestBody(method)) {
            int code = userResponse.code();
            HttpMethod httpMethod = HttpMethod.INSTANCE;
            if (!httpMethod.redirectsWithBody(method) && code != 308 && code != 307) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (httpMethod.redirectsToGet(method) && code != 308 && code != 307) {
                newBuilder.method("GET", null);
            } else {
                if (z9) {
                    requestBody = userResponse.request().body();
                }
                newBuilder.method(method, requestBody);
            }
            if (!z9) {
                newBuilder.removeHeader("Transfer-Encoding");
                newBuilder.removeHeader("Content-Length");
                newBuilder.removeHeader("Content-Type");
            }
        }
        if (!Util.canReuseConnectionFor(userResponse.request().url(), resolve)) {
            newBuilder.removeHeader("Authorization");
        }
        return newBuilder.url(resolve).build();
    }

    private final Request followUpRequest(Response userResponse, Exchange exchange) {
        Route route;
        RealConnection connection;
        if (exchange != null && (connection = exchange.getConnection()) != null) {
            route = connection.getRoute();
        } else {
            route = null;
        }
        int code = userResponse.code();
        String method = userResponse.request().method();
        if (code != 307 && code != 308) {
            if (code != 401) {
                if (code != 421) {
                    if (code != 503) {
                        if (code != 407) {
                            if (code != 408) {
                                switch (code) {
                                    case 300:
                                    case 301:
                                    case 302:
                                    case 303:
                                        break;
                                    default:
                                        return null;
                                }
                            } else {
                                if (!this.client.retryOnConnectionFailure()) {
                                    return null;
                                }
                                RequestBody body = userResponse.request().body();
                                if (body != null && body.isOneShot()) {
                                    return null;
                                }
                                Response priorResponse = userResponse.priorResponse();
                                if ((priorResponse != null && priorResponse.code() == 408) || retryAfter(userResponse, 0) > 0) {
                                    return null;
                                }
                                return userResponse.request();
                            }
                        } else {
                            route.getClass();
                            if (route.proxy().type() == Proxy.Type.HTTP) {
                                return this.client.proxyAuthenticator().authenticate(route, userResponse);
                            }
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                    } else {
                        Response priorResponse2 = userResponse.priorResponse();
                        if ((priorResponse2 != null && priorResponse2.code() == 503) || retryAfter(userResponse, Integer.MAX_VALUE) != 0) {
                            return null;
                        }
                        return userResponse.request();
                    }
                } else {
                    RequestBody body2 = userResponse.request().body();
                    if ((body2 != null && body2.isOneShot()) || exchange == null || !exchange.isCoalescedConnection$okhttp()) {
                        return null;
                    }
                    exchange.getConnection().noCoalescedConnections$okhttp();
                    return userResponse.request();
                }
            } else {
                return this.client.authenticator().authenticate(route, userResponse);
            }
        }
        return buildRedirectRequest(userResponse, method);
    }

    private final boolean isRecoverable(IOException e, boolean requestSendStarted) {
        if (e instanceof ProtocolException) {
            return false;
        }
        if (e instanceof InterruptedIOException) {
            if (!(e instanceof SocketTimeoutException) || requestSendStarted) {
                return false;
            }
            return true;
        }
        if (((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) || (e instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return true;
    }

    private final boolean recover(IOException e, RealCall call, Request userRequest, boolean requestSendStarted) {
        if (!this.client.retryOnConnectionFailure()) {
            return false;
        }
        if ((requestSendStarted && requestIsOneShot(e, userRequest)) || !isRecoverable(e, requestSendStarted) || !call.retryAfterFailure()) {
            return false;
        }
        return true;
    }

    private final boolean requestIsOneShot(IOException e, Request userRequest) {
        RequestBody body = userRequest.body();
        if ((body != null && body.isOneShot()) || (e instanceof FileNotFoundException)) {
            return true;
        }
        return false;
    }

    private final int retryAfter(Response userResponse, int defaultDelay) {
        String header$default = Response.header$default(userResponse, "Retry-After", null, 2, null);
        if (header$default == null) {
            return defaultDelay;
        }
        if (new Regex("\\d+").matches(header$default)) {
            Integer valueOf = Integer.valueOf(header$default);
            valueOf.getClass();
            return valueOf.intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if (r7 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        r0 = r0.newBuilder().priorResponse(r7.newBuilder().body(null).build()).build();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        r0 = r1.getInterceptorScopedExchange();
        r6 = followUpRequest(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (r6 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        r0 = r6.body();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        if (r0.isOneShot() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
    
        r1.exitNetworkInterceptorExchange$okhttp(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        r0 = r7.body();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        okhttp3.internal.Util.closeQuietly(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
    
        if (r8 > 20) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0096, code lost:
    
        throw new java.net.ProtocolException("Too many follow-up requests: " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004d, code lost:
    
        if (r0 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0053, code lost:
    
        if (r0.getIsDuplex() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0055, code lost:
    
        r1.timeoutEarlyExit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0058, code lost:
    
        r1.exitNetworkInterceptorExchange$okhttp(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005b, code lost:
    
        return r7;
     */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r11) {
        /*
            r10 = this;
            r11.getClass()
            okhttp3.internal.http.RealInterceptorChain r11 = (okhttp3.internal.http.RealInterceptorChain) r11
            okhttp3.Request r0 = r11.getRequest()
            okhttp3.internal.connection.RealCall r1 = r11.getCall()
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
            r3 = 0
            r4 = 0
            r5 = 1
            r8 = r3
            r7 = r4
        L16:
            r6 = r5
        L17:
            r1.enterNetworkInterceptorExchange(r0, r6)
            boolean r6 = r1.getCanceled()     // Catch: java.lang.Throwable -> L40
            if (r6 != 0) goto Lcd
            okhttp3.Response r0 = r11.proceed(r0)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L97 okhttp3.internal.connection.RouteException -> Lb0
            if (r7 == 0) goto L3e
            okhttp3.Response$Builder r0 = r0.newBuilder()     // Catch: java.lang.Throwable -> L40
            okhttp3.Response$Builder r6 = r7.newBuilder()     // Catch: java.lang.Throwable -> L40
            okhttp3.Response$Builder r6 = r6.body(r4)     // Catch: java.lang.Throwable -> L40
            okhttp3.Response r6 = r6.build()     // Catch: java.lang.Throwable -> L40
            okhttp3.Response$Builder r0 = r0.priorResponse(r6)     // Catch: java.lang.Throwable -> L40
            okhttp3.Response r0 = r0.build()     // Catch: java.lang.Throwable -> L40
        L3e:
            r7 = r0
            goto L43
        L40:
            r11 = move-exception
            goto Ld5
        L43:
            okhttp3.internal.connection.Exchange r0 = r1.getInterceptorScopedExchange()     // Catch: java.lang.Throwable -> L40
            okhttp3.Request r6 = r10.followUpRequest(r7, r0)     // Catch: java.lang.Throwable -> L40
            if (r6 != 0) goto L5c
            if (r0 == 0) goto L58
            boolean r11 = r0.getIsDuplex()     // Catch: java.lang.Throwable -> L40
            if (r11 == 0) goto L58
            r1.timeoutEarlyExit()     // Catch: java.lang.Throwable -> L40
        L58:
            r1.exitNetworkInterceptorExchange$okhttp(r3)
            return r7
        L5c:
            okhttp3.RequestBody r0 = r6.body()     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L6c
            boolean r0 = r0.isOneShot()     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L6c
            r1.exitNetworkInterceptorExchange$okhttp(r3)
            return r7
        L6c:
            okhttp3.ResponseBody r0 = r7.body()     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L75
            okhttp3.internal.Util.closeQuietly(r0)     // Catch: java.lang.Throwable -> L40
        L75:
            int r8 = r8 + 1
            r0 = 20
            if (r8 > r0) goto L80
            r1.exitNetworkInterceptorExchange$okhttp(r5)
            r0 = r6
            goto L16
        L80:
            java.net.ProtocolException r11 = new java.net.ProtocolException     // Catch: java.lang.Throwable -> L40
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            r0.<init>()     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = "Too many follow-up requests: "
            r0.append(r2)     // Catch: java.lang.Throwable -> L40
            r0.append(r8)     // Catch: java.lang.Throwable -> L40
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L40
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L40
            throw r11     // Catch: java.lang.Throwable -> L40
        L97:
            r6 = move-exception
            boolean r9 = r6 instanceof okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L40
            r9 = r9 ^ r5
            boolean r9 = r10.recover(r6, r1, r0, r9)     // Catch: java.lang.Throwable -> L40
            if (r9 == 0) goto Lab
            java.util.List r2 = kotlin.collections.CollectionsKt.plus(r2, r6)     // Catch: java.lang.Throwable -> L40
        La5:
            r1.exitNetworkInterceptorExchange$okhttp(r5)
            r6 = r3
            goto L17
        Lab:
            java.lang.Throwable r11 = okhttp3.internal.Util.withSuppressed(r6, r2)     // Catch: java.lang.Throwable -> L40
            throw r11     // Catch: java.lang.Throwable -> L40
        Lb0:
            r6 = move-exception
            java.io.IOException r9 = r6.getLastConnectException()     // Catch: java.lang.Throwable -> L40
            boolean r9 = r10.recover(r9, r1, r0, r3)     // Catch: java.lang.Throwable -> L40
            if (r9 == 0) goto Lc4
            java.io.IOException r6 = r6.getFirstConnectException()     // Catch: java.lang.Throwable -> L40
            java.util.List r2 = kotlin.collections.CollectionsKt.plus(r2, r6)     // Catch: java.lang.Throwable -> L40
            goto La5
        Lc4:
            java.io.IOException r11 = r6.getFirstConnectException()     // Catch: java.lang.Throwable -> L40
            java.lang.Throwable r11 = okhttp3.internal.Util.withSuppressed(r11, r2)     // Catch: java.lang.Throwable -> L40
            throw r11     // Catch: java.lang.Throwable -> L40
        Lcd:
            java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> L40
            java.lang.String r0 = "Canceled"
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L40
            throw r11     // Catch: java.lang.Throwable -> L40
        Ld5:
            r1.exitNetworkInterceptorExchange$okhttp(r5)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.RetryAndFollowUpInterceptor.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }
}
