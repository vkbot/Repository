package okhttp3.internal.http1;

import ai.onnxruntime.a;
import ai.onnxruntime.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import j1.i;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import l9.e0;
import l9.g0;
import l9.j0;
import l9.l;
import l9.m;
import l9.n;
import l9.s;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import org.apache.commons.net.SocketClient;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 R2\u00020\u0001:\u0007STURVWXB)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\"\u0010\u0015J\u000f\u0010#\u001a\u00020\u0013H\u0016¢\u0006\u0004\b#\u0010\u0015J\u001d\u0010'\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0019\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0010H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0010H\u0002¢\u0006\u0004\b2\u00101J\u0017\u00104\u001a\u00020\u001c2\u0006\u00103\u001a\u00020\u000eH\u0002¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\u001c2\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u001cH\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010>\u001a\u00020\u00132\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b>\u0010?R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010@R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010A\u001a\u0004\bB\u0010CR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010DR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010ER\u0016\u0010G\u001a\u00020F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010LR\u0011\u0010M\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0018\u0010O\u001a\u00020)*\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0018\u0010O\u001a\u00020)*\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010Q¨\u0006Y"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec;", "Lokhttp3/internal/http/ExchangeCodec;", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/internal/connection/RealConnection;", "connection", "Ll9/n;", "source", "Ll9/m;", "sink", "<init>", "(Lokhttp3/OkHttpClient;Lokhttp3/internal/connection/RealConnection;Ll9/n;Ll9/m;)V", "Lokhttp3/Request;", "request", "", "contentLength", "Ll9/e0;", "createRequestBody", "(Lokhttp3/Request;J)Ll9/e0;", "", "cancel", "()V", "writeRequestHeaders", "(Lokhttp3/Request;)V", "Lokhttp3/Response;", "response", "reportedContentLength", "(Lokhttp3/Response;)J", "Ll9/g0;", "openResponseBodySource", "(Lokhttp3/Response;)Ll9/g0;", "Lokhttp3/Headers;", "trailers", "()Lokhttp3/Headers;", "flushRequest", "finishRequest", "headers", "", "requestLine", "writeRequest", "(Lokhttp3/Headers;Ljava/lang/String;)V", "", "expectContinue", "Lokhttp3/Response$Builder;", "readResponseHeaders", "(Z)Lokhttp3/Response$Builder;", "skipConnectBody", "(Lokhttp3/Response;)V", "newChunkedSink", "()Ll9/e0;", "newKnownLengthSink", "length", "newFixedLengthSource", "(J)Ll9/g0;", "Lokhttp3/HttpUrl;", "url", "newChunkedSource", "(Lokhttp3/HttpUrl;)Ll9/g0;", "newUnknownLengthSource", "()Ll9/g0;", "Ll9/s;", "timeout", "detachTimeout", "(Ll9/s;)V", "Lokhttp3/OkHttpClient;", "Lokhttp3/internal/connection/RealConnection;", "getConnection", "()Lokhttp3/internal/connection/RealConnection;", "Ll9/n;", "Ll9/m;", "", "state", "I", "Lokhttp3/internal/http1/HeadersReader;", "headersReader", "Lokhttp3/internal/http1/HeadersReader;", "Lokhttp3/Headers;", "isClosed", "()Z", "isChunked", "(Lokhttp3/Response;)Z", "(Lokhttp3/Request;)Z", "Companion", "AbstractSource", "ChunkedSink", "ChunkedSource", "FixedLengthSource", "KnownLengthSink", "UnknownLengthSource", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
/* loaded from: classes2.dex */
public final class Http1ExchangeCodec implements ExchangeCodec {
    private static final long NO_CHUNK_YET = -1;
    private static final int STATE_CLOSED = 6;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 1;
    private static final int STATE_OPEN_RESPONSE_BODY = 4;
    private static final int STATE_READING_RESPONSE_BODY = 5;
    private static final int STATE_READ_RESPONSE_HEADERS = 3;
    private static final int STATE_WRITING_REQUEST_BODY = 2;
    private final OkHttpClient client;
    private final RealConnection connection;
    private final HeadersReader headersReader;
    private final m sink;
    private final n source;
    private int state;
    private Headers trailers;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b¢\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00108\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Ll9/g0;", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "Ll9/j0;", "timeout", "()Ll9/j0;", "Ll9/l;", "sink", "", "byteCount", "read", "(Ll9/l;J)J", "", "responseBodyComplete", "()V", "Ll9/s;", "Ll9/s;", "getTimeout", "()Ll9/s;", "", "closed", "Z", "getClosed", "()Z", "setClosed", "(Z)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes2.dex */
    public abstract class AbstractSource implements g0 {
        private boolean closed;
        private final s timeout;

        public AbstractSource() {
            this.timeout = new s(Http1ExchangeCodec.this.source.getTimeout());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public abstract /* synthetic */ void close();

        public final boolean getClosed() {
            return this.closed;
        }

        public final s getTimeout() {
            return this.timeout;
        }

        @Override // l9.g0
        public long read(l sink, long byteCount) {
            sink.getClass();
            try {
                return Http1ExchangeCodec.this.source.read(sink, byteCount);
            } catch (IOException e) {
                Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
                throw e;
            }
        }

        public final void responseBodyComplete() {
            if (Http1ExchangeCodec.this.state != 6) {
                int i10 = Http1ExchangeCodec.this.state;
                Http1ExchangeCodec http1ExchangeCodec = Http1ExchangeCodec.this;
                if (i10 == 5) {
                    http1ExchangeCodec.detachTimeout(this.timeout);
                    Http1ExchangeCodec.this.state = 6;
                } else {
                    b.b(http1ExchangeCodec.state, "state: ");
                }
            }
        }

        public final void setClosed(boolean z9) {
            this.closed = z9;
        }

        @Override // l9.g0
        /* renamed from: timeout */
        public j0 getTimeout() {
            return this.timeout;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink;", "Ll9/e0;", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "Ll9/j0;", "timeout", "()Ll9/j0;", "Ll9/l;", "source", "", "byteCount", "", "write", "(Ll9/l;J)V", "flush", "()V", "close", "Ll9/s;", "Ll9/s;", "", "closed", "Z", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    /* loaded from: classes2.dex */
    public final class ChunkedSink implements e0 {
        private boolean closed;
        private final s timeout;

        public ChunkedSink() {
            this.timeout = new s(Http1ExchangeCodec.this.sink.timeout());
        }

        @Override // l9.e0, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Http1ExchangeCodec.this.sink.A("0\r\n\r\n");
            Http1ExchangeCodec.this.detachTimeout(this.timeout);
            Http1ExchangeCodec.this.state = 3;
        }

        @Override // l9.e0, java.io.Flushable
        public synchronized void flush() {
            if (this.closed) {
                return;
            }
            Http1ExchangeCodec.this.sink.flush();
        }

        @Override // l9.e0
        public j0 timeout() {
            return this.timeout;
        }

        @Override // l9.e0
        public void write(l source, long byteCount) {
            source.getClass();
            if (!this.closed) {
                if (byteCount == 0) {
                    return;
                }
                Http1ExchangeCodec.this.sink.H(byteCount);
                Http1ExchangeCodec.this.sink.A(SocketClient.NETASCII_EOL);
                Http1ExchangeCodec.this.sink.write(source, byteCount);
                Http1ExchangeCodec.this.sink.A(SocketClient.NETASCII_EOL);
                return;
            }
            i.l("closed");
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\tR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "Lokhttp3/HttpUrl;", "url", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;Lokhttp3/HttpUrl;)V", "", "readChunkSize", "()V", "Ll9/l;", "sink", "", "byteCount", "read", "(Ll9/l;J)J", "close", "Lokhttp3/HttpUrl;", "bytesRemainingInChunk", "J", "", "hasMoreChunks", "Z", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    /* loaded from: classes2.dex */
    public final class ChunkedSource extends AbstractSource {
        private long bytesRemainingInChunk;
        private boolean hasMoreChunks;
        final /* synthetic */ Http1ExchangeCodec this$0;
        private final HttpUrl url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChunkedSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl) {
            super();
            httpUrl.getClass();
            this.this$0 = http1ExchangeCodec;
            this.url = httpUrl;
            this.bytesRemainingInChunk = -1L;
            this.hasMoreChunks = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0045, code lost:
        
            if (r2 != false) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void readChunkSize() {
            /*
                r6 = this;
                java.lang.String r0 = "expected chunk size and optional extensions but was \""
                long r1 = r6.bytesRemainingInChunk
                r3 = -1
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 == 0) goto L13
                okhttp3.internal.http1.Http1ExchangeCodec r1 = r6.this$0
                l9.n r1 = okhttp3.internal.http1.Http1ExchangeCodec.access$getSource$p(r1)
                r1.L()
            L13:
                okhttp3.internal.http1.Http1ExchangeCodec r1 = r6.this$0     // Catch: java.lang.NumberFormatException -> L48
                l9.n r1 = okhttp3.internal.http1.Http1ExchangeCodec.access$getSource$p(r1)     // Catch: java.lang.NumberFormatException -> L48
                long r1 = r1.a0()     // Catch: java.lang.NumberFormatException -> L48
                r6.bytesRemainingInChunk = r1     // Catch: java.lang.NumberFormatException -> L48
                okhttp3.internal.http1.Http1ExchangeCodec r1 = r6.this$0     // Catch: java.lang.NumberFormatException -> L48
                l9.n r1 = okhttp3.internal.http1.Http1ExchangeCodec.access$getSource$p(r1)     // Catch: java.lang.NumberFormatException -> L48
                java.lang.String r1 = r1.L()     // Catch: java.lang.NumberFormatException -> L48
                java.lang.CharSequence r1 = kotlin.text.StringsKt.R(r1)     // Catch: java.lang.NumberFormatException -> L48
                java.lang.String r1 = r1.toString()     // Catch: java.lang.NumberFormatException -> L48
                long r2 = r6.bytesRemainingInChunk     // Catch: java.lang.NumberFormatException -> L48
                r4 = 0
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 < 0) goto L7f
                int r2 = r1.length()     // Catch: java.lang.NumberFormatException -> L48
                if (r2 <= 0) goto L4a
                java.lang.String r2 = ";"
                boolean r2 = kotlin.text.StringsKt.M(r1, r2)     // Catch: java.lang.NumberFormatException -> L48
                if (r2 == 0) goto L7f
                goto L4a
            L48:
                r0 = move-exception
                goto L9b
            L4a:
                long r0 = r6.bytesRemainingInChunk
                int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r0 != 0) goto L7e
                r0 = 0
                r6.hasMoreChunks = r0
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r6.this$0
                okhttp3.internal.http1.HeadersReader r1 = okhttp3.internal.http1.Http1ExchangeCodec.access$getHeadersReader$p(r0)
                okhttp3.Headers r1 = r1.readHeaders()
                okhttp3.internal.http1.Http1ExchangeCodec.access$setTrailers$p(r0, r1)
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r6.this$0
                okhttp3.OkHttpClient r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$getClient$p(r0)
                r0.getClass()
                okhttp3.CookieJar r0 = r0.cookieJar()
                okhttp3.HttpUrl r1 = r6.url
                okhttp3.internal.http1.Http1ExchangeCodec r2 = r6.this$0
                okhttp3.Headers r2 = okhttp3.internal.http1.Http1ExchangeCodec.access$getTrailers$p(r2)
                r2.getClass()
                okhttp3.internal.http.HttpHeaders.receiveHeaders(r0, r1, r2)
                r6.responseBodyComplete()
            L7e:
                return
            L7f:
                java.net.ProtocolException r2 = new java.net.ProtocolException     // Catch: java.lang.NumberFormatException -> L48
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L48
                r3.<init>(r0)     // Catch: java.lang.NumberFormatException -> L48
                long r4 = r6.bytesRemainingInChunk     // Catch: java.lang.NumberFormatException -> L48
                r3.append(r4)     // Catch: java.lang.NumberFormatException -> L48
                r3.append(r1)     // Catch: java.lang.NumberFormatException -> L48
                r0 = 34
                r3.append(r0)     // Catch: java.lang.NumberFormatException -> L48
                java.lang.String r0 = r3.toString()     // Catch: java.lang.NumberFormatException -> L48
                r2.<init>(r0)     // Catch: java.lang.NumberFormatException -> L48
                throw r2     // Catch: java.lang.NumberFormatException -> L48
            L9b:
                java.net.ProtocolException r1 = new java.net.ProtocolException
                java.lang.String r0 = r0.getMessage()
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http1.Http1ExchangeCodec.ChunkedSource.readChunkSize():void");
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.hasMoreChunks && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                this.this$0.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, l9.g0
        public long read(l sink, long byteCount) {
            sink.getClass();
            if (byteCount >= 0) {
                if (!getClosed()) {
                    if (!this.hasMoreChunks) {
                        return -1L;
                    }
                    long j10 = this.bytesRemainingInChunk;
                    if (j10 == 0 || j10 == -1) {
                        readChunkSize();
                        if (!this.hasMoreChunks) {
                            return -1L;
                        }
                    }
                    long read = super.read(sink, Math.min(byteCount, this.bytesRemainingInChunk));
                    if (read != -1) {
                        this.bytesRemainingInChunk -= read;
                        return read;
                    }
                    this.this$0.getConnection().noNewExchanges$okhttp();
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    responseBodyComplete();
                    throw protocolException;
                }
                i.l("closed");
                return 0L;
            }
            l9.i.d(a.h(byteCount, "byteCount < 0: "));
            return 0L;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u000f¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$FixedLengthSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "", "bytesRemaining", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;J)V", "Ll9/l;", "sink", "byteCount", "read", "(Ll9/l;J)J", "", "close", "()V", "J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$FixedLengthSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    /* loaded from: classes2.dex */
    public final class FixedLengthSource extends AbstractSource {
        private long bytesRemaining;

        public FixedLengthSource(long j10) {
            super();
            this.bytesRemaining = j10;
            if (j10 == 0) {
                responseBodyComplete();
            }
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.bytesRemaining != 0 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, l9.g0
        public long read(l sink, long byteCount) {
            sink.getClass();
            if (byteCount >= 0) {
                if (!getClosed()) {
                    long j10 = this.bytesRemaining;
                    if (j10 == 0) {
                        return -1L;
                    }
                    long read = super.read(sink, Math.min(j10, byteCount));
                    if (read != -1) {
                        long j11 = this.bytesRemaining - read;
                        this.bytesRemaining = j11;
                        if (j11 == 0) {
                            responseBodyComplete();
                        }
                        return read;
                    }
                    Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    responseBodyComplete();
                    throw protocolException;
                }
                i.l("closed");
                return 0L;
            }
            l9.i.d(a.h(byteCount, "byteCount < 0: "));
            return 0L;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink;", "Ll9/e0;", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "Ll9/j0;", "timeout", "()Ll9/j0;", "Ll9/l;", "source", "", "byteCount", "", "write", "(Ll9/l;J)V", "flush", "()V", "close", "Ll9/s;", "Ll9/s;", "", "closed", "Z", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    /* loaded from: classes2.dex */
    public final class KnownLengthSink implements e0 {
        private boolean closed;
        private final s timeout;

        public KnownLengthSink() {
            this.timeout = new s(Http1ExchangeCodec.this.sink.timeout());
        }

        @Override // l9.e0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Http1ExchangeCodec.this.detachTimeout(this.timeout);
            Http1ExchangeCodec.this.state = 3;
        }

        @Override // l9.e0, java.io.Flushable
        public void flush() {
            if (this.closed) {
                return;
            }
            Http1ExchangeCodec.this.sink.flush();
        }

        @Override // l9.e0
        public j0 timeout() {
            return this.timeout;
        }

        @Override // l9.e0
        public void write(l source, long byteCount) {
            source.getClass();
            if (!this.closed) {
                Util.checkOffsetAndCount(source.c, 0L, byteCount);
                Http1ExchangeCodec.this.sink.write(source, byteCount);
            } else {
                i.l("closed");
            }
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$UnknownLengthSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "Ll9/l;", "sink", "", "byteCount", "read", "(Ll9/l;J)J", "", "close", "()V", "", "inputExhausted", "Z", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$UnknownLengthSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    /* loaded from: classes2.dex */
    public final class UnknownLengthSource extends AbstractSource {
        private boolean inputExhausted;

        public UnknownLengthSource() {
            super();
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (!this.inputExhausted) {
                responseBodyComplete();
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, l9.g0
        public long read(l sink, long byteCount) {
            sink.getClass();
            if (byteCount >= 0) {
                if (!getClosed()) {
                    if (this.inputExhausted) {
                        return -1L;
                    }
                    long read = super.read(sink, byteCount);
                    if (read == -1) {
                        this.inputExhausted = true;
                        responseBodyComplete();
                        return -1L;
                    }
                    return read;
                }
                i.l("closed");
                return 0L;
            }
            l9.i.d(a.h(byteCount, "byteCount < 0: "));
            return 0L;
        }
    }

    public Http1ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection, n nVar, m mVar) {
        realConnection.getClass();
        nVar.getClass();
        mVar.getClass();
        this.client = okHttpClient;
        this.connection = realConnection;
        this.source = nVar;
        this.sink = mVar;
        this.headersReader = new HeadersReader(nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void detachTimeout(s timeout) {
        j0 j0Var = timeout.f3580a;
        j0 j0Var2 = j0.NONE;
        j0Var2.getClass();
        timeout.f3580a = j0Var2;
        j0Var.clearDeadline();
        j0Var.clearTimeout();
    }

    private final boolean isChunked(Response response) {
        boolean equals;
        equals = StringsKt__StringsJVMKt.equals("chunked", Response.header$default(response, "Transfer-Encoding", null, 2, null), true);
        return equals;
    }

    private final e0 newChunkedSink() {
        if (this.state == 1) {
            this.state = 2;
            return new ChunkedSink();
        }
        n0.b.e(this.state, "state: ");
        return null;
    }

    private final g0 newChunkedSource(HttpUrl url) {
        if (this.state == 4) {
            this.state = 5;
            return new ChunkedSource(this, url);
        }
        n0.b.e(this.state, "state: ");
        return null;
    }

    private final g0 newFixedLengthSource(long length) {
        if (this.state == 4) {
            this.state = 5;
            return new FixedLengthSource(length);
        }
        n0.b.e(this.state, "state: ");
        return null;
    }

    private final e0 newKnownLengthSink() {
        if (this.state == 1) {
            this.state = 2;
            return new KnownLengthSink();
        }
        n0.b.e(this.state, "state: ");
        return null;
    }

    private final g0 newUnknownLengthSource() {
        if (this.state == 4) {
            this.state = 5;
            getConnection().noNewExchanges$okhttp();
            return new UnknownLengthSource();
        }
        n0.b.e(this.state, "state: ");
        return null;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        getConnection().cancel();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public e0 createRequestBody(Request request, long contentLength) {
        request.getClass();
        if (request.body() != null && request.body().isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (isChunked(request)) {
            return newChunkedSink();
        }
        if (contentLength != -1) {
            return newKnownLengthSink();
        }
        i.l("Cannot stream a request body without chunked encoding or a known content length!");
        return null;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void finishRequest() {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void flushRequest() {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public RealConnection getConnection() {
        return this.connection;
    }

    public final boolean isClosed() {
        if (this.state == 6) {
            return true;
        }
        return false;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public g0 openResponseBodySource(Response response) {
        response.getClass();
        if (!HttpHeaders.promisesBody(response)) {
            return newFixedLengthSource(0L);
        }
        if (isChunked(response)) {
            return newChunkedSource(response.request().url());
        }
        long headersContentLength = Util.headersContentLength(response);
        if (headersContentLength != -1) {
            return newFixedLengthSource(headersContentLength);
        }
        return newUnknownLengthSource();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Response.Builder readResponseHeaders(boolean expectContinue) {
        int i10 = this.state;
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            n0.b.e(this.state, "state: ");
            return null;
        }
        try {
            StatusLine parse = StatusLine.INSTANCE.parse(this.headersReader.readLine());
            Response.Builder headers = new Response.Builder().protocol(parse.protocol).code(parse.code).message(parse.message).headers(this.headersReader.readHeaders());
            if (expectContinue && parse.code == 100) {
                return null;
            }
            int i11 = parse.code;
            if (i11 == 100) {
                this.state = 3;
                return headers;
            }
            if (102 <= i11 && i11 < 200) {
                this.state = 3;
                return headers;
            }
            this.state = 4;
            return headers;
        } catch (EOFException e) {
            throw new IOException(a.l("unexpected end of stream on ", getConnection().getRoute().address().url().redact()), e);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public long reportedContentLength(Response response) {
        response.getClass();
        if (!HttpHeaders.promisesBody(response)) {
            return 0L;
        }
        if (isChunked(response)) {
            return -1L;
        }
        return Util.headersContentLength(response);
    }

    public final void skipConnectBody(Response response) {
        response.getClass();
        long headersContentLength = Util.headersContentLength(response);
        if (headersContentLength == -1) {
            return;
        }
        g0 newFixedLengthSource = newFixedLengthSource(headersContentLength);
        Util.skipAll(newFixedLengthSource, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        newFixedLengthSource.close();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Headers trailers() {
        if (this.state == 6) {
            Headers headers = this.trailers;
            if (headers == null) {
                return Util.EMPTY_HEADERS;
            }
            return headers;
        }
        i.l("too early; can't read the trailers yet");
        return null;
    }

    public final void writeRequest(Headers headers, String requestLine) {
        headers.getClass();
        requestLine.getClass();
        if (this.state == 0) {
            this.sink.A(requestLine).A(SocketClient.NETASCII_EOL);
            int size = headers.size();
            int i10 = 0;
            while (true) {
                m mVar = this.sink;
                if (i10 < size) {
                    mVar.A(headers.name(i10)).A(": ").A(headers.value(i10)).A(SocketClient.NETASCII_EOL);
                    i10++;
                } else {
                    mVar.A(SocketClient.NETASCII_EOL);
                    this.state = 1;
                    return;
                }
            }
        } else {
            n0.b.e(this.state, "state: ");
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(Request request) {
        request.getClass();
        RequestLine requestLine = RequestLine.INSTANCE;
        Proxy.Type type = getConnection().getRoute().proxy().type();
        type.getClass();
        writeRequest(request.headers(), requestLine.get(request, type));
    }

    private final boolean isChunked(Request request) {
        boolean equals;
        equals = StringsKt__StringsJVMKt.equals("chunked", request.header("Transfer-Encoding"), true);
        return equals;
    }
}
