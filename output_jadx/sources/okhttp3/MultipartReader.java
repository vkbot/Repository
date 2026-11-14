package okhttp3;

import ai.onnxruntime.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import j1.i;
import java.io.Closeable;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l9.a0;
import l9.b;
import l9.g0;
import l9.i0;
import l9.j0;
import l9.l;
import l9.n;
import l9.o;
import l9.w;
import okhttp3.internal.http1.HeadersReader;
import org.apache.commons.net.SocketClient;
import w7.c;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 &2\u00020\u0001:\u0003&'(B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010!R\u001c\u0010$\u001a\b\u0018\u00010#R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lokhttp3/MultipartReader;", "Ljava/io/Closeable;", "Ll9/n;", "source", "", "boundary", "<init>", "(Ll9/n;Ljava/lang/String;)V", "Lokhttp3/ResponseBody;", "response", "(Lokhttp3/ResponseBody;)V", "", "maxResult", "currentPartBytesRemaining", "(J)J", "Lokhttp3/MultipartReader$Part;", "nextPart", "()Lokhttp3/MultipartReader$Part;", "", "close", "()V", "Ll9/n;", "Ljava/lang/String;", "()Ljava/lang/String;", "Ll9/o;", "dashDashBoundary", "Ll9/o;", "crlfDashDashBoundary", "", "partCount", "I", "", "closed", "Z", "noMoreParts", "Lokhttp3/MultipartReader$PartSource;", "currentPart", "Lokhttp3/MultipartReader$PartSource;", "Companion", "Part", "PartSource", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMultipartReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartReader.kt\nokhttp3/MultipartReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n1#2:211\n*E\n"})
/* loaded from: classes2.dex */
public final class MultipartReader implements Closeable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final w afterBoundaryOptions;
    private final String boundary;
    private boolean closed;
    private final o crlfDashDashBoundary;
    private PartSource currentPart;
    private final o dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;
    private final n source;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\u0003\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lokhttp3/MultipartReader$Part;", "Ljava/io/Closeable;", "Lokhttp3/Headers;", "headers", "Ll9/n;", "body", "<init>", "(Lokhttp3/Headers;Ll9/n;)V", "", "close", "()V", "Lokhttp3/Headers;", "()Lokhttp3/Headers;", "Ll9/n;", "()Ll9/n;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes2.dex */
    public static final class Part implements Closeable {
        private final n body;
        private final Headers headers;

        public Part(Headers headers, n nVar) {
            headers.getClass();
            nVar.getClass();
            this.headers = headers;
            this.body = nVar;
        }

        @JvmName(name = "body")
        /* renamed from: body, reason: from getter */
        public final n getBody() {
            return this.body;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.body.close();
        }

        @JvmName(name = "headers")
        /* renamed from: headers, reason: from getter */
        public final Headers getHeaders() {
            return this.headers;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"Lokhttp3/MultipartReader$PartSource;", "Ll9/g0;", "<init>", "(Lokhttp3/MultipartReader;)V", "", "close", "()V", "Ll9/l;", "sink", "", "byteCount", "read", "(Ll9/l;J)J", "Ll9/j0;", "timeout", "()Ll9/j0;", "Ll9/j0;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nMultipartReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartReader.kt\nokhttp3/MultipartReader$PartSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Timeout.kt\nokio/Timeout\n*L\n1#1,210:1\n1#2:211\n268#3,26:212\n*S KotlinDebug\n*F\n+ 1 MultipartReader.kt\nokhttp3/MultipartReader$PartSource\n*L\n159#1:212,26\n*E\n"})
    /* loaded from: classes2.dex */
    public final class PartSource implements g0 {
        private final j0 timeout = new Object();

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, l9.j0] */
        public PartSource() {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (Intrinsics.areEqual(MultipartReader.this.currentPart, this)) {
                MultipartReader.this.currentPart = null;
            }
        }

        @Override // l9.g0
        public long read(l sink, long byteCount) {
            long read;
            long j10;
            long read2;
            sink.getClass();
            if (byteCount >= 0) {
                if (Intrinsics.areEqual(MultipartReader.this.currentPart, this)) {
                    j0 timeout = MultipartReader.this.source.getTimeout();
                    j0 j0Var = this.timeout;
                    MultipartReader multipartReader = MultipartReader.this;
                    long timeoutNanos = timeout.timeoutNanos();
                    i0 i0Var = j0.Companion;
                    long timeoutNanos2 = j0Var.timeoutNanos();
                    long timeoutNanos3 = timeout.timeoutNanos();
                    i0Var.getClass();
                    if (timeoutNanos2 == 0 || (timeoutNanos3 != 0 && timeoutNanos2 >= timeoutNanos3)) {
                        timeoutNanos2 = timeoutNanos3;
                    }
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    timeout.timeout(timeoutNanos2, timeUnit);
                    if (timeout.hasDeadline()) {
                        long deadlineNanoTime = timeout.deadlineNanoTime();
                        if (j0Var.hasDeadline()) {
                            j10 = deadlineNanoTime;
                            timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), j0Var.deadlineNanoTime()));
                        } else {
                            j10 = deadlineNanoTime;
                        }
                        try {
                            long currentPartBytesRemaining = multipartReader.currentPartBytesRemaining(byteCount);
                            if (currentPartBytesRemaining == 0) {
                                read2 = -1;
                            } else {
                                read2 = multipartReader.source.read(sink, currentPartBytesRemaining);
                            }
                            timeout.timeout(timeoutNanos, timeUnit);
                            if (j0Var.hasDeadline()) {
                                timeout.deadlineNanoTime(j10);
                            }
                            return read2;
                        } catch (Throwable th) {
                            long j11 = j10;
                            timeout.timeout(timeoutNanos, timeUnit);
                            if (j0Var.hasDeadline()) {
                                timeout.deadlineNanoTime(j11);
                            }
                            throw th;
                        }
                    }
                    if (j0Var.hasDeadline()) {
                        timeout.deadlineNanoTime(j0Var.deadlineNanoTime());
                    }
                    try {
                        long currentPartBytesRemaining2 = multipartReader.currentPartBytesRemaining(byteCount);
                        if (currentPartBytesRemaining2 == 0) {
                            read = -1;
                        } else {
                            read = multipartReader.source.read(sink, currentPartBytesRemaining2);
                        }
                        return read;
                    } finally {
                        timeout.timeout(timeoutNanos, timeUnit);
                        if (j0Var.hasDeadline()) {
                            timeout.clearDeadline();
                        }
                    }
                }
                i.l("closed");
                return 0L;
            }
            l9.i.d(a.h(byteCount, "byteCount < 0: "));
            return 0L;
        }

        @Override // l9.g0
        /* renamed from: timeout, reason: from getter */
        public j0 getTimeout() {
            return this.timeout;
        }
    }

    static {
        int i10 = w.d;
        o oVar = o.e;
        afterBoundaryOptions = b.f(c.k(SocketClient.NETASCII_EOL), c.k("--"), c.k(" "), c.k("\t"));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, l9.l] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, l9.l] */
    public MultipartReader(n nVar, String str) {
        nVar.getClass();
        str.getClass();
        this.source = nVar;
        this.boundary = str;
        ?? obj = new Object();
        obj.u0("--");
        obj.u0(str);
        this.dashDashBoundary = obj.f(obj.c);
        ?? obj2 = new Object();
        obj2.u0("\r\n--");
        obj2.u0(str);
        this.crlfDashDashBoundary = obj2.f(obj2.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long currentPartBytesRemaining(long r25) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.MultipartReader.currentPartBytesRemaining(long):long");
    }

    @JvmName(name = "boundary")
    /* renamed from: boundary, reason: from getter */
    public final String getBoundary() {
        return this.boundary;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.currentPart = null;
        this.source.close();
    }

    public final Part nextPart() {
        n nVar;
        if (!this.closed) {
            if (this.noMoreParts) {
                return null;
            }
            if (this.partCount == 0 && this.source.Q(0L, this.dashDashBoundary)) {
                this.source.skip(this.dashDashBoundary.c());
            } else {
                while (true) {
                    long currentPartBytesRemaining = currentPartBytesRemaining(8192L);
                    nVar = this.source;
                    if (currentPartBytesRemaining == 0) {
                        break;
                    }
                    nVar.skip(currentPartBytesRemaining);
                }
                nVar.skip(this.crlfDashDashBoundary.c());
            }
            boolean z9 = false;
            while (true) {
                int P = this.source.P(afterBoundaryOptions);
                if (P != -1) {
                    if (P != 0) {
                        if (P != 1) {
                            if (P == 2 || P == 3) {
                                z9 = true;
                            }
                        } else {
                            if (!z9) {
                                if (this.partCount != 0) {
                                    this.noMoreParts = true;
                                    return null;
                                }
                                throw new ProtocolException("expected at least 1 part");
                            }
                            throw new ProtocolException("unexpected characters after boundary");
                        }
                    } else {
                        this.partCount++;
                        Headers readHeaders = new HeadersReader(this.source).readHeaders();
                        PartSource partSource = new PartSource();
                        this.currentPart = partSource;
                        return new Part(readHeaders, new a0(partSource));
                    }
                } else {
                    throw new ProtocolException("unexpected characters after boundary");
                }
            }
        } else {
            i.l("closed");
            return null;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lokhttp3/MultipartReader$Companion;", "", "<init>", "()V", "Ll9/w;", "afterBoundaryOptions", "Ll9/w;", "getAfterBoundaryOptions", "()Ll9/w;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final w getAfterBoundaryOptions() {
            return MultipartReader.afterBoundaryOptions;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MultipartReader(okhttp3.ResponseBody r3) {
        /*
            r2 = this;
            r3.getClass()
            l9.n r0 = r3.getBodySource()
            okhttp3.MediaType r3 = r3.get$contentType()
            if (r3 == 0) goto L19
            java.lang.String r1 = "boundary"
            java.lang.String r3 = r3.parameter(r1)
            if (r3 == 0) goto L19
            r2.<init>(r0, r3)
            return
        L19:
            java.net.ProtocolException r3 = new java.net.ProtocolException
            java.lang.String r0 = "expected the Content-Type to have a boundary parameter"
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.MultipartReader.<init>(okhttp3.ResponseBody):void");
    }
}
