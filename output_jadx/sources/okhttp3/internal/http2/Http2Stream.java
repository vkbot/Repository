package okhttp3.internal.http2;

import androidx.constraintlayout.widget.ConstraintLayout;
import j1.i;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import l9.e0;
import l9.g;
import l9.g0;
import l9.j0;
import l9.l;
import l9.n;
import n0.b;
import okhttp3.Headers;
import okhttp3.internal.Util;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 u2\u00020\u0001:\u0004uvwxB3\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000eJ+\u0010\u0015\u001a\u00020\u00142\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001bJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020\u00142\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020\u00142\u0006\u0010)\u001a\u00020#¢\u0006\u0004\b*\u0010+J\u001d\u0010/\u001a\u00020\u00142\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u0002¢\u0006\u0004\b/\u00100J\u001d\u00101\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\u00020\u00142\u0006\u0010)\u001a\u00020#¢\u0006\u0004\b3\u0010+J\u000f\u00106\u001a\u00020\u0014H\u0000¢\u0006\u0004\b4\u00105J\u0015\u00109\u001a\u00020\u00142\u0006\u00108\u001a\u000207¢\u0006\u0004\b9\u0010:J\u000f\u0010<\u001a\u00020\u0014H\u0000¢\u0006\u0004\b;\u00105J\u000f\u0010>\u001a\u00020\u0014H\u0000¢\u0006\u0004\b=\u00105J!\u0010?\u001a\u00020\u00062\u0006\u0010)\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b?\u0010@R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010D\u001a\u0004\bE\u0010FR*\u0010H\u001a\u0002072\u0006\u0010G\u001a\u0002078\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010:R*\u0010M\u001a\u0002072\u0006\u0010G\u001a\u0002078\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010I\u001a\u0004\bN\u0010K\"\u0004\bO\u0010:R*\u0010P\u001a\u0002072\u0006\u0010G\u001a\u0002078\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010I\u001a\u0004\bQ\u0010K\"\u0004\bR\u0010:R*\u0010S\u001a\u0002072\u0006\u0010G\u001a\u0002078\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010I\u001a\u0004\bT\u0010K\"\u0004\bU\u0010:R\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020\t0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010Y\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u001e\u0010-\u001a\u00060[R\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010\\\u001a\u0004\b]\u0010^R\u001e\u0010`\u001a\u00060_R\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u001e\u0010\u001a\u001a\u00060dR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010e\u001a\u0004\bf\u0010gR\u001e\u0010\u001c\u001a\u00060dR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010e\u001a\u0004\bh\u0010gR$\u0010)\u001a\u0004\u0018\u00010#8@@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010+R$\u0010&\u001a\u0004\u0018\u00010%8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u0011\u0010r\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\br\u0010sR\u0011\u0010t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bt\u0010s¨\u0006y"}, d2 = {"Lokhttp3/internal/http2/Http2Stream;", "", "", "id", "Lokhttp3/internal/http2/Http2Connection;", "connection", "", "outFinished", "inFinished", "Lokhttp3/Headers;", "headers", "<init>", "(ILokhttp3/internal/http2/Http2Connection;ZZLokhttp3/Headers;)V", "takeHeaders", "()Lokhttp3/Headers;", "trailers", "", "Lokhttp3/internal/http2/Header;", "responseHeaders", "flushHeaders", "", "writeHeaders", "(Ljava/util/List;ZZ)V", "enqueueTrailers", "(Lokhttp3/Headers;)V", "Ll9/j0;", "readTimeout", "()Ll9/j0;", "writeTimeout", "Ll9/g0;", "getSource", "()Ll9/g0;", "Ll9/e0;", "getSink", "()Ll9/e0;", "Lokhttp3/internal/http2/ErrorCode;", "rstStatusCode", "Ljava/io/IOException;", "errorException", "close", "(Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)V", "errorCode", "closeLater", "(Lokhttp3/internal/http2/ErrorCode;)V", "Ll9/n;", "source", "length", "receiveData", "(Ll9/n;I)V", "receiveHeaders", "(Lokhttp3/Headers;Z)V", "receiveRstStream", "cancelStreamIfNecessary$okhttp", "()V", "cancelStreamIfNecessary", "", "delta", "addBytesToWriteWindow", "(J)V", "checkOutNotClosed$okhttp", "checkOutNotClosed", "waitForIo$okhttp", "waitForIo", "closeInternal", "(Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)Z", "I", "getId", "()I", "Lokhttp3/internal/http2/Http2Connection;", "getConnection", "()Lokhttp3/internal/http2/Http2Connection;", "<set-?>", "readBytesTotal", "J", "getReadBytesTotal", "()J", "setReadBytesTotal$okhttp", "readBytesAcknowledged", "getReadBytesAcknowledged", "setReadBytesAcknowledged$okhttp", "writeBytesTotal", "getWriteBytesTotal", "setWriteBytesTotal$okhttp", "writeBytesMaximum", "getWriteBytesMaximum", "setWriteBytesMaximum$okhttp", "Ljava/util/ArrayDeque;", "headersQueue", "Ljava/util/ArrayDeque;", "hasResponseHeaders", "Z", "Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lokhttp3/internal/http2/Http2Stream$FramingSource;", "getSource$okhttp", "()Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lokhttp3/internal/http2/Http2Stream$FramingSink;", "sink", "Lokhttp3/internal/http2/Http2Stream$FramingSink;", "getSink$okhttp", "()Lokhttp3/internal/http2/Http2Stream$FramingSink;", "Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "getReadTimeout$okhttp", "()Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "getWriteTimeout$okhttp", "Lokhttp3/internal/http2/ErrorCode;", "getErrorCode$okhttp", "()Lokhttp3/internal/http2/ErrorCode;", "setErrorCode$okhttp", "Ljava/io/IOException;", "getErrorException$okhttp", "()Ljava/io/IOException;", "setErrorException$okhttp", "(Ljava/io/IOException;)V", "isOpen", "()Z", "isLocallyInitiated", "Companion", "FramingSink", "FramingSource", "StreamTimeout", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nHttp2Stream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n*L\n1#1,688:1\n1#2:689\n615#3,4:690\n615#3,4:694\n563#3:698\n615#3,4:699\n615#3,4:703\n563#3:707\n563#3:708\n615#3,4:709\n563#3:713\n557#3:714\n*S KotlinDebug\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream\n*L\n176#1:690,4\n255#1:694,4\n263#1:698\n274#1:699,4\n281#1:703,4\n295#1:707\n305#1:708\n491#1:709,4\n637#1:713\n657#1:714\n*E\n"})
/* loaded from: classes2.dex */
public final class Http2Stream {
    public static final long EMIT_BUFFER_SIZE = 16384;
    private final Http2Connection connection;
    private ErrorCode errorCode;
    private IOException errorException;
    private boolean hasResponseHeaders;
    private final ArrayDeque<Headers> headersQueue;
    private final int id;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final StreamTimeout readTimeout;
    private final FramingSink sink;
    private final FramingSource source;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final StreamTimeout writeTimeout;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0017\u0010 \u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010$\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R$\u0010'\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010-\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010\u001b\u001a\u0004\b.\u0010\u001d\"\u0004\b/\u0010\u001f¨\u00060"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Ll9/g0;", "", "maxByteCount", "", "finished", "<init>", "(Lokhttp3/internal/http2/Http2Stream;JZ)V", "read", "", "updateConnectionFlowControl", "(J)V", "Ll9/l;", "sink", "byteCount", "(Ll9/l;J)J", "Ll9/n;", "source", "receive$okhttp", "(Ll9/n;J)V", "receive", "Ll9/j0;", "timeout", "()Ll9/j0;", "close", "()V", "J", "Z", "getFinished$okhttp", "()Z", "setFinished$okhttp", "(Z)V", "receiveBuffer", "Ll9/l;", "getReceiveBuffer", "()Ll9/l;", "readBuffer", "getReadBuffer", "Lokhttp3/Headers;", "trailers", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "setTrailers", "(Lokhttp3/Headers;)V", "closed", "getClosed$okhttp", "setClosed$okhttp", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nHttp2Stream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n*L\n1#1,688:1\n1#2:689\n615#3,4:690\n615#3,4:694\n563#3:698\n563#3:699\n*S KotlinDebug\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSource\n*L\n407#1:690,4\n418#1:694,4\n458#1:698\n480#1:699\n*E\n"})
    /* loaded from: classes2.dex */
    public final class FramingSource implements g0 {
        private boolean closed;
        private boolean finished;
        private final long maxByteCount;
        private Headers trailers;
        private final l receiveBuffer = new Object();
        private final l readBuffer = new Object();

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, l9.l] */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, l9.l] */
        public FramingSource(long j10, boolean z9) {
            this.maxByteCount = j10;
            this.finished = z9;
        }

        private final void updateConnectionFlowControl(long read) {
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                b.B("Thread ", Thread.currentThread().getName(), " MUST NOT hold lock on ", http2Stream);
            } else {
                Http2Stream.this.getConnection().updateConnectionFlowControl$okhttp(read);
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long j10;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                this.closed = true;
                l lVar = this.readBuffer;
                j10 = lVar.c;
                lVar.b();
                http2Stream.getClass();
                http2Stream.notifyAll();
                Unit unit = Unit.INSTANCE;
            }
            if (j10 > 0) {
                updateConnectionFlowControl(j10);
            }
            Http2Stream.this.cancelStreamIfNecessary$okhttp();
        }

        /* renamed from: getClosed$okhttp, reason: from getter */
        public final boolean getClosed() {
            return this.closed;
        }

        /* renamed from: getFinished$okhttp, reason: from getter */
        public final boolean getFinished() {
            return this.finished;
        }

        public final l getReadBuffer() {
            return this.readBuffer;
        }

        public final l getReceiveBuffer() {
            return this.receiveBuffer;
        }

        public final Headers getTrailers() {
            return this.trailers;
        }

        /* JADX WARN: Code restructure failed: missing block: B:45:0x00c1, code lost:
        
            throw new java.io.IOException("stream closed");
         */
        /* JADX WARN: Finally extract failed */
        @Override // l9.g0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long read(l9.l r19, long r20) {
            /*
                r18 = this;
                r1 = r18
                r2 = r20
                r19.getClass()
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 < 0) goto Lcc
            Ld:
                okhttp3.internal.http2.Http2Stream r6 = okhttp3.internal.http2.Http2Stream.this
                monitor-enter(r6)
                okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r6.getReadTimeout()     // Catch: java.lang.Throwable -> Lb8
                r0.enter()     // Catch: java.lang.Throwable -> Lb8
                okhttp3.internal.http2.ErrorCode r0 = r6.getErrorCode$okhttp()     // Catch: java.lang.Throwable -> L34
                if (r0 == 0) goto L37
                boolean r0 = r1.finished     // Catch: java.lang.Throwable -> L34
                if (r0 != 0) goto L37
                java.io.IOException r0 = r6.getErrorException()     // Catch: java.lang.Throwable -> L34
                if (r0 != 0) goto L38
                okhttp3.internal.http2.StreamResetException r0 = new okhttp3.internal.http2.StreamResetException     // Catch: java.lang.Throwable -> L34
                okhttp3.internal.http2.ErrorCode r7 = r6.getErrorCode$okhttp()     // Catch: java.lang.Throwable -> L34
                r7.getClass()     // Catch: java.lang.Throwable -> L34
                r0.<init>(r7)     // Catch: java.lang.Throwable -> L34
                goto L38
            L34:
                r0 = move-exception
                goto Lc2
            L37:
                r0 = 0
            L38:
                boolean r7 = r1.closed     // Catch: java.lang.Throwable -> L34
                if (r7 != 0) goto Lba
                l9.l r7 = r1.readBuffer     // Catch: java.lang.Throwable -> L34
                long r8 = r7.c     // Catch: java.lang.Throwable -> L34
                int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                r11 = -1
                r13 = 0
                if (r10 <= 0) goto L90
                long r8 = java.lang.Math.min(r2, r8)     // Catch: java.lang.Throwable -> L34
                r10 = r19
                long r7 = r7.read(r10, r8)     // Catch: java.lang.Throwable -> L34
                long r14 = r6.getReadBytesTotal()     // Catch: java.lang.Throwable -> L34
                long r14 = r14 + r7
                r6.setReadBytesTotal$okhttp(r14)     // Catch: java.lang.Throwable -> L34
                long r14 = r6.getReadBytesTotal()     // Catch: java.lang.Throwable -> L34
                long r16 = r6.getReadBytesAcknowledged()     // Catch: java.lang.Throwable -> L34
                long r14 = r14 - r16
                if (r0 != 0) goto L8d
                okhttp3.internal.http2.Http2Connection r9 = r6.getConnection()     // Catch: java.lang.Throwable -> L34
                okhttp3.internal.http2.Settings r9 = r9.getOkHttpSettings()     // Catch: java.lang.Throwable -> L34
                int r9 = r9.getInitialWindowSize()     // Catch: java.lang.Throwable -> L34
                int r9 = r9 / 2
                r16 = r4
                long r4 = (long) r9     // Catch: java.lang.Throwable -> L34
                int r4 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
                if (r4 < 0) goto L9f
                okhttp3.internal.http2.Http2Connection r4 = r6.getConnection()     // Catch: java.lang.Throwable -> L34
                int r5 = r6.getId()     // Catch: java.lang.Throwable -> L34
                r4.writeWindowUpdateLater$okhttp(r5, r14)     // Catch: java.lang.Throwable -> L34
                long r4 = r6.getReadBytesTotal()     // Catch: java.lang.Throwable -> L34
                r6.setReadBytesAcknowledged$okhttp(r4)     // Catch: java.lang.Throwable -> L34
                goto L9f
            L8d:
                r16 = r4
                goto L9f
            L90:
                r10 = r19
                r16 = r4
                boolean r4 = r1.finished     // Catch: java.lang.Throwable -> L34
                if (r4 != 0) goto L9e
                if (r0 != 0) goto L9e
                r6.waitForIo$okhttp()     // Catch: java.lang.Throwable -> L34
                r13 = 1
            L9e:
                r7 = r11
            L9f:
                okhttp3.internal.http2.Http2Stream$StreamTimeout r4 = r6.getReadTimeout()     // Catch: java.lang.Throwable -> Lb8
                r4.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> Lb8
                kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lb8
                monitor-exit(r6)
                if (r13 == 0) goto Laf
                r4 = r16
                goto Ld
            Laf:
                int r2 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
                if (r2 == 0) goto Lb4
                return r7
            Lb4:
                if (r0 != 0) goto Lb7
                return r11
            Lb7:
                throw r0
            Lb8:
                r0 = move-exception
                goto Lca
            Lba:
                java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L34
                java.lang.String r2 = "stream closed"
                r0.<init>(r2)     // Catch: java.lang.Throwable -> L34
                throw r0     // Catch: java.lang.Throwable -> L34
            Lc2:
                okhttp3.internal.http2.Http2Stream$StreamTimeout r2 = r6.getReadTimeout()     // Catch: java.lang.Throwable -> Lb8
                r2.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> Lb8
                throw r0     // Catch: java.lang.Throwable -> Lb8
            Lca:
                monitor-exit(r6)
                throw r0
            Lcc:
                r16 = r4
                java.lang.String r0 = "byteCount < 0: "
                java.lang.String r0 = ai.onnxruntime.a.h(r2, r0)
                l9.i.d(r0)
                return r16
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.FramingSource.read(l9.l, long):long");
        }

        public final void receive$okhttp(n source, long byteCount) {
            boolean z9;
            boolean z10;
            boolean z11;
            source.getClass();
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                b.B("Thread ", Thread.currentThread().getName(), " MUST NOT hold lock on ", http2Stream);
                return;
            }
            long j10 = byteCount;
            while (j10 > 0) {
                synchronized (Http2Stream.this) {
                    z9 = this.finished;
                    z10 = false;
                    if (this.readBuffer.c + j10 > this.maxByteCount) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    Unit unit = Unit.INSTANCE;
                }
                if (z11) {
                    source.skip(j10);
                    Http2Stream.this.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z9) {
                    source.skip(j10);
                    return;
                }
                long read = source.read(this.receiveBuffer, j10);
                if (read != -1) {
                    j10 -= read;
                    Http2Stream http2Stream2 = Http2Stream.this;
                    synchronized (http2Stream2) {
                        try {
                            if (this.closed) {
                                this.receiveBuffer.b();
                            } else {
                                l lVar = this.readBuffer;
                                if (lVar.c == 0) {
                                    z10 = true;
                                }
                                lVar.G(this.receiveBuffer);
                                if (z10) {
                                    http2Stream2.getClass();
                                    http2Stream2.notifyAll();
                                }
                            }
                        } finally {
                        }
                    }
                } else {
                    throw new EOFException();
                }
            }
            updateConnectionFlowControl(byteCount);
        }

        public final void setClosed$okhttp(boolean z9) {
            this.closed = z9;
        }

        public final void setFinished$okhttp(boolean z9) {
            this.finished = z9;
        }

        public final void setTrailers(Headers headers) {
            this.trailers = headers;
        }

        @Override // l9.g0
        /* renamed from: timeout */
        public j0 getTimeout() {
            return Http2Stream.this.getReadTimeout();
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "Ll9/g;", "<init>", "(Lokhttp3/internal/http2/Http2Stream;)V", "", "timedOut", "()V", "Ljava/io/IOException;", "cause", "newTimeoutException", "(Ljava/io/IOException;)Ljava/io/IOException;", "exitAndThrowIfTimedOut", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes2.dex */
    public final class StreamTimeout extends g {
        public StreamTimeout() {
        }

        public final void exitAndThrowIfTimedOut() {
            if (!exit()) {
            } else {
                throw newTimeoutException(null);
            }
        }

        @Override // l9.g
        public IOException newTimeoutException(IOException cause) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (cause != null) {
                socketTimeoutException.initCause(cause);
            }
            return socketTimeoutException;
        }

        @Override // l9.g
        public void timedOut() {
            Http2Stream.this.closeLater(ErrorCode.CANCEL);
            Http2Stream.this.getConnection().sendDegradedPingLater$okhttp();
        }
    }

    public Http2Stream(int i10, Http2Connection http2Connection, boolean z9, boolean z10, Headers headers) {
        http2Connection.getClass();
        this.id = i10;
        this.connection = http2Connection;
        this.writeBytesMaximum = http2Connection.getPeerSettings().getInitialWindowSize();
        ArrayDeque<Headers> arrayDeque = new ArrayDeque<>();
        this.headersQueue = arrayDeque;
        this.source = new FramingSource(http2Connection.getOkHttpSettings().getInitialWindowSize(), z10);
        this.sink = new FramingSink(z9);
        this.readTimeout = new StreamTimeout();
        this.writeTimeout = new StreamTimeout();
        if (headers != null) {
            if (!isLocallyInitiated()) {
                arrayDeque.add(headers);
                return;
            } else {
                i.l("locally-initiated streams shouldn't have headers yet");
                throw null;
            }
        }
        if (isLocallyInitiated()) {
            return;
        }
        i.l("remotely-initiated streams should have headers");
        throw null;
    }

    private final boolean closeInternal(ErrorCode errorCode, IOException errorException) {
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            b.B("Thread ", Thread.currentThread().getName(), " MUST NOT hold lock on ", this);
            return false;
        }
        synchronized (this) {
            if (this.errorCode != null) {
                return false;
            }
            this.errorCode = errorCode;
            this.errorException = errorException;
            notifyAll();
            if (this.source.getFinished() && this.sink.getFinished()) {
                return false;
            }
            Unit unit = Unit.INSTANCE;
            this.connection.removeStream$okhttp(this.id);
            return true;
        }
    }

    public final void addBytesToWriteWindow(long delta) {
        this.writeBytesMaximum += delta;
        if (delta > 0) {
            notifyAll();
        }
    }

    public final void cancelStreamIfNecessary$okhttp() {
        boolean z9;
        boolean isOpen;
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            b.B("Thread ", Thread.currentThread().getName(), " MUST NOT hold lock on ", this);
            return;
        }
        synchronized (this) {
            try {
                if (this.source.getFinished() || !this.source.getClosed() || (!this.sink.getFinished() && !this.sink.getClosed())) {
                    z9 = false;
                    isOpen = isOpen();
                    Unit unit = Unit.INSTANCE;
                }
                z9 = true;
                isOpen = isOpen();
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z9) {
            close(ErrorCode.CANCEL, null);
        } else if (!isOpen) {
            this.connection.removeStream$okhttp(this.id);
        }
    }

    public final void checkOutNotClosed$okhttp() {
        if (!this.sink.getClosed()) {
            if (!this.sink.getFinished()) {
                ErrorCode errorCode = this.errorCode;
                if (errorCode != null) {
                    IOException iOException = this.errorException;
                    if (iOException == null) {
                        errorCode.getClass();
                        throw new StreamResetException(errorCode);
                    }
                    throw iOException;
                }
                return;
            }
            b.A("stream finished");
            return;
        }
        b.A("stream closed");
    }

    public final void close(ErrorCode rstStatusCode, IOException errorException) {
        rstStatusCode.getClass();
        if (!closeInternal(rstStatusCode, errorException)) {
            return;
        }
        this.connection.writeSynReset$okhttp(this.id, rstStatusCode);
    }

    public final void closeLater(ErrorCode errorCode) {
        errorCode.getClass();
        if (!closeInternal(errorCode, null)) {
            return;
        }
        this.connection.writeSynResetLater$okhttp(this.id, errorCode);
    }

    public final void enqueueTrailers(Headers trailers) {
        trailers.getClass();
        synchronized (this) {
            if (!this.sink.getFinished()) {
                if (trailers.size() != 0) {
                    this.sink.setTrailers(trailers);
                    Unit unit = Unit.INSTANCE;
                } else {
                    throw new IllegalArgumentException("trailers.size() == 0");
                }
            } else {
                throw new IllegalStateException("already finished");
            }
        }
    }

    public final Http2Connection getConnection() {
        return this.connection;
    }

    public final synchronized ErrorCode getErrorCode$okhttp() {
        return this.errorCode;
    }

    /* renamed from: getErrorException$okhttp, reason: from getter */
    public final IOException getErrorException() {
        return this.errorException;
    }

    public final int getId() {
        return this.id;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    /* renamed from: getReadTimeout$okhttp, reason: from getter */
    public final StreamTimeout getReadTimeout() {
        return this.readTimeout;
    }

    public final e0 getSink() {
        synchronized (this) {
            try {
                if (!this.hasResponseHeaders && !isLocallyInitiated()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.sink;
    }

    /* renamed from: getSink$okhttp, reason: from getter */
    public final FramingSink getSink() {
        return this.sink;
    }

    public final g0 getSource() {
        return this.source;
    }

    /* renamed from: getSource$okhttp, reason: from getter */
    public final FramingSource getSource() {
        return this.source;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    /* renamed from: getWriteTimeout$okhttp, reason: from getter */
    public final StreamTimeout getWriteTimeout() {
        return this.writeTimeout;
    }

    public final boolean isLocallyInitiated() {
        boolean z9;
        if ((this.id & 1) == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.connection.getClient() == z9) {
            return true;
        }
        return false;
    }

    public final synchronized boolean isOpen() {
        try {
            if (this.errorCode != null) {
                return false;
            }
            if (!this.source.getFinished()) {
                if (this.source.getClosed()) {
                }
                return true;
            }
            if (this.sink.getFinished() || this.sink.getClosed()) {
                if (this.hasResponseHeaders) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final j0 readTimeout() {
        return this.readTimeout;
    }

    public final void receiveData(n source, int length) {
        source.getClass();
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            b.B("Thread ", Thread.currentThread().getName(), " MUST NOT hold lock on ", this);
        } else {
            this.source.receive$okhttp(source, length);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038 A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:10:0x001f, B:14:0x0027, B:16:0x0038, B:17:0x003d, B:24:0x002f), top: B:9:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void receiveHeaders(okhttp3.Headers r3, boolean r4) {
        /*
            r2 = this;
            r3.getClass()
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L1e
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto Le
            goto L1e
        Le:
            java.lang.String r3 = "Thread "
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.String r4 = r4.getName()
            java.lang.String r0 = " MUST NOT hold lock on "
            n0.b.B(r3, r4, r0, r2)
            return
        L1e:
            monitor-enter(r2)
            boolean r0 = r2.hasResponseHeaders     // Catch: java.lang.Throwable -> L2d
            r1 = 1
            if (r0 == 0) goto L2f
            if (r4 != 0) goto L27
            goto L2f
        L27:
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L2d
            r0.setTrailers(r3)     // Catch: java.lang.Throwable -> L2d
            goto L36
        L2d:
            r3 = move-exception
            goto L51
        L2f:
            r2.hasResponseHeaders = r1     // Catch: java.lang.Throwable -> L2d
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.headersQueue     // Catch: java.lang.Throwable -> L2d
            r0.add(r3)     // Catch: java.lang.Throwable -> L2d
        L36:
            if (r4 == 0) goto L3d
            okhttp3.internal.http2.Http2Stream$FramingSource r3 = r2.source     // Catch: java.lang.Throwable -> L2d
            r3.setFinished$okhttp(r1)     // Catch: java.lang.Throwable -> L2d
        L3d:
            boolean r3 = r2.isOpen()     // Catch: java.lang.Throwable -> L2d
            r2.notifyAll()     // Catch: java.lang.Throwable -> L2d
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r2)
            if (r3 != 0) goto L50
            okhttp3.internal.http2.Http2Connection r3 = r2.connection
            int r4 = r2.id
            r3.removeStream$okhttp(r4)
        L50:
            return
        L51:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.receiveHeaders(okhttp3.Headers, boolean):void");
    }

    public final synchronized void receiveRstStream(ErrorCode errorCode) {
        errorCode.getClass();
        if (this.errorCode == null) {
            this.errorCode = errorCode;
            notifyAll();
        }
    }

    public final void setErrorCode$okhttp(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public final void setErrorException$okhttp(IOException iOException) {
        this.errorException = iOException;
    }

    public final void setReadBytesAcknowledged$okhttp(long j10) {
        this.readBytesAcknowledged = j10;
    }

    public final void setReadBytesTotal$okhttp(long j10) {
        this.readBytesTotal = j10;
    }

    public final void setWriteBytesMaximum$okhttp(long j10) {
        this.writeBytesMaximum = j10;
    }

    public final void setWriteBytesTotal$okhttp(long j10) {
        this.writeBytesTotal = j10;
    }

    public final synchronized Headers takeHeaders() {
        Headers removeFirst;
        this.readTimeout.enter();
        while (this.headersQueue.isEmpty() && this.errorCode == null) {
            try {
                waitForIo$okhttp();
            } catch (Throwable th) {
                this.readTimeout.exitAndThrowIfTimedOut();
                throw th;
            }
        }
        this.readTimeout.exitAndThrowIfTimedOut();
        if (!this.headersQueue.isEmpty()) {
            removeFirst = this.headersQueue.removeFirst();
            removeFirst.getClass();
        } else {
            IOException iOException = this.errorException;
            if (iOException == null) {
                ErrorCode errorCode = this.errorCode;
                errorCode.getClass();
                throw new StreamResetException(errorCode);
            }
            throw iOException;
        }
        return removeFirst;
    }

    public final synchronized Headers trailers() {
        Headers trailers;
        if (this.source.getFinished() && this.source.getReceiveBuffer().k() && this.source.getReadBuffer().k()) {
            trailers = this.source.getTrailers();
            if (trailers == null) {
                trailers = Util.EMPTY_HEADERS;
            }
        } else {
            ErrorCode errorCode = this.errorCode;
            if (errorCode != null) {
                IOException iOException = this.errorException;
                if (iOException == null) {
                    errorCode.getClass();
                    throw new StreamResetException(errorCode);
                }
                throw iOException;
            }
            throw new IllegalStateException("too early; can't read the trailers yet");
        }
        return trailers;
    }

    public final void waitForIo$okhttp() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final void writeHeaders(List<Header> responseHeaders, boolean outFinished, boolean flushHeaders) {
        boolean z9;
        responseHeaders.getClass();
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            b.B("Thread ", Thread.currentThread().getName(), " MUST NOT hold lock on ", this);
            return;
        }
        synchronized (this) {
            z9 = true;
            try {
                this.hasResponseHeaders = true;
                if (outFinished) {
                    this.sink.setFinished(true);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!flushHeaders) {
            synchronized (this.connection) {
                if (this.connection.getWriteBytesTotal() < this.connection.getWriteBytesMaximum()) {
                    z9 = false;
                }
            }
            flushHeaders = z9;
        }
        this.connection.writeHeaders$okhttp(this.id, outFinished, responseHeaders);
        if (flushHeaders) {
            this.connection.flush();
        }
    }

    public final j0 writeTimeout() {
        return this.writeTimeout;
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\tR\u0014\u0010\u001a\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010#\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010\u0018\"\u0004\b%\u0010\t¨\u0006&"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSink;", "Ll9/e0;", "", "finished", "<init>", "(Lokhttp3/internal/http2/Http2Stream;Z)V", "outFinishedOnLastFrame", "", "emitFrame", "(Z)V", "Ll9/l;", "source", "", "byteCount", "write", "(Ll9/l;J)V", "flush", "()V", "Ll9/j0;", "timeout", "()Ll9/j0;", "close", "Z", "getFinished", "()Z", "setFinished", "sendBuffer", "Ll9/l;", "Lokhttp3/Headers;", "trailers", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "setTrailers", "(Lokhttp3/Headers;)V", "closed", "getClosed", "setClosed", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nHttp2Stream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSink\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,688:1\n615#2,4:689\n615#2,4:693\n615#2,4:697\n*S KotlinDebug\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSink\n*L\n528#1:689,4\n573#1:693,4\n589#1:697,4\n*E\n"})
    /* loaded from: classes2.dex */
    public final class FramingSink implements e0 {
        private boolean closed;
        private boolean finished;
        private final l sendBuffer;
        private Headers trailers;

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, l9.l] */
        public FramingSink(boolean z9) {
            this.finished = z9;
            this.sendBuffer = new Object();
        }

        /* JADX WARN: Finally extract failed */
        private final void emitFrame(boolean outFinishedOnLastFrame) {
            long min;
            boolean z9;
            boolean z10;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                try {
                    http2Stream.getWriteTimeout().enter();
                    while (http2Stream.getWriteBytesTotal() >= http2Stream.getWriteBytesMaximum() && !this.finished && !this.closed && http2Stream.getErrorCode$okhttp() == null) {
                        try {
                            http2Stream.waitForIo$okhttp();
                        } catch (Throwable th) {
                            http2Stream.getWriteTimeout().exitAndThrowIfTimedOut();
                            throw th;
                        }
                    }
                    http2Stream.getWriteTimeout().exitAndThrowIfTimedOut();
                    http2Stream.checkOutNotClosed$okhttp();
                    min = Math.min(http2Stream.getWriteBytesMaximum() - http2Stream.getWriteBytesTotal(), this.sendBuffer.c);
                    http2Stream.setWriteBytesTotal$okhttp(http2Stream.getWriteBytesTotal() + min);
                    if (outFinishedOnLastFrame && min == this.sendBuffer.c) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z10 = z9;
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Http2Stream.this.getWriteTimeout().enter();
            try {
                Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), z10, this.sendBuffer, min);
            } finally {
                Http2Stream.this.getWriteTimeout().exitAndThrowIfTimedOut();
            }
        }

        @Override // l9.e0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            boolean z9;
            boolean z10;
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                b.B("Thread ", Thread.currentThread().getName(), " MUST NOT hold lock on ", http2Stream);
                return;
            }
            Http2Stream http2Stream2 = Http2Stream.this;
            synchronized (http2Stream2) {
                if (this.closed) {
                    return;
                }
                if (http2Stream2.getErrorCode$okhttp() == null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                Unit unit = Unit.INSTANCE;
                if (!Http2Stream.this.getSink().finished) {
                    if (this.sendBuffer.c > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.trailers != null) {
                        while (this.sendBuffer.c > 0) {
                            emitFrame(false);
                        }
                        Http2Connection connection = Http2Stream.this.getConnection();
                        int id = Http2Stream.this.getId();
                        Headers headers = this.trailers;
                        headers.getClass();
                        connection.writeHeaders$okhttp(id, z9, Util.toHeaderList(headers));
                    } else if (z10) {
                        while (this.sendBuffer.c > 0) {
                            emitFrame(true);
                        }
                    } else if (z9) {
                        Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), true, null, 0L);
                    }
                }
                synchronized (Http2Stream.this) {
                    this.closed = true;
                    Unit unit2 = Unit.INSTANCE;
                }
                Http2Stream.this.getConnection().flush();
                Http2Stream.this.cancelStreamIfNecessary$okhttp();
            }
        }

        @Override // l9.e0, java.io.Flushable
        public void flush() {
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                b.B("Thread ", Thread.currentThread().getName(), " MUST NOT hold lock on ", http2Stream);
                return;
            }
            Http2Stream http2Stream2 = Http2Stream.this;
            synchronized (http2Stream2) {
                http2Stream2.checkOutNotClosed$okhttp();
                Unit unit = Unit.INSTANCE;
            }
            while (this.sendBuffer.c > 0) {
                emitFrame(false);
                Http2Stream.this.getConnection().flush();
            }
        }

        public final boolean getClosed() {
            return this.closed;
        }

        public final boolean getFinished() {
            return this.finished;
        }

        public final Headers getTrailers() {
            return this.trailers;
        }

        public final void setClosed(boolean z9) {
            this.closed = z9;
        }

        public final void setFinished(boolean z9) {
            this.finished = z9;
        }

        public final void setTrailers(Headers headers) {
            this.trailers = headers;
        }

        @Override // l9.e0
        public j0 timeout() {
            return Http2Stream.this.getWriteTimeout();
        }

        @Override // l9.e0
        public void write(l source, long byteCount) {
            source.getClass();
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                b.B("Thread ", Thread.currentThread().getName(), " MUST NOT hold lock on ", http2Stream);
                return;
            }
            this.sendBuffer.write(source, byteCount);
            while (this.sendBuffer.c >= Http2Stream.EMIT_BUFFER_SIZE) {
                emitFrame(false);
            }
        }

        public /* synthetic */ FramingSink(Http2Stream http2Stream, boolean z9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z9);
        }
    }
}
