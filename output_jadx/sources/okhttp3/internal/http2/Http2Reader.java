package okhttp3.internal.http2;

import ai.onnxruntime.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l9.g0;
import l9.j0;
import l9.l;
import l9.n;
import l9.o;
import n0.b;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 .2\u00020\u0001:\u0003./0B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0010J/\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0010J\u001f\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u0010J/\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u0010J/\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u0010J/\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u0010J/\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u0010J/\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\u0010J\u0015\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000eH\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00061"}, d2 = {"Lokhttp3/internal/http2/Http2Reader;", "Ljava/io/Closeable;", "Ll9/n;", "source", "", "client", "<init>", "(Ll9/n;Z)V", "Lokhttp3/internal/http2/Http2Reader$Handler;", "handler", "", "length", "flags", "streamId", "", "readHeaders", "(Lokhttp3/internal/http2/Http2Reader$Handler;III)V", "padding", "", "Lokhttp3/internal/http2/Header;", "readHeaderBlock", "(IIII)Ljava/util/List;", "readData", "readPriority", "(Lokhttp3/internal/http2/Http2Reader$Handler;I)V", "readRstStream", "readSettings", "readPushPromise", "readPing", "readGoAway", "readWindowUpdate", "readConnectionPreface", "(Lokhttp3/internal/http2/Http2Reader$Handler;)V", "requireSettings", "nextFrame", "(ZLokhttp3/internal/http2/Http2Reader$Handler;)Z", "close", "()V", "Ll9/n;", "Z", "Lokhttp3/internal/http2/Http2Reader$ContinuationSource;", "continuation", "Lokhttp3/internal/http2/Http2Reader$ContinuationSource;", "Lokhttp3/internal/http2/Hpack$Reader;", "hpackReader", "Lokhttp3/internal/http2/Hpack$Reader;", "Companion", "ContinuationSource", "Handler", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class Http2Reader implements Closeable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Logger logger;
    private final boolean client;
    private final ContinuationSource continuation;
    private final Hpack.Reader hpackReader;
    private final n source;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH&¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H&¢\u0006\u0004\b\u001f\u0010 J'\u0010$\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"H&¢\u0006\u0004\b$\u0010%J\u001f\u0010(\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&H&¢\u0006\u0004\b(\u0010)J/\u0010-\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u0002H&¢\u0006\u0004\b-\u0010.J-\u00101\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00042\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b1\u00102J?\u00109\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\"2\u0006\u00106\u001a\u0002032\u0006\u00107\u001a\u00020\u00042\u0006\u00108\u001a\u00020&H&¢\u0006\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$Handler;", "", "", "inFinished", "", "streamId", "Ll9/n;", "source", "length", "", "data", "(ZILl9/n;I)V", "associatedStreamId", "", "Lokhttp3/internal/http2/Header;", "headerBlock", "headers", "(ZIILjava/util/List;)V", "Lokhttp3/internal/http2/ErrorCode;", "errorCode", "rstStream", "(ILokhttp3/internal/http2/ErrorCode;)V", "clearPrevious", "Lokhttp3/internal/http2/Settings;", "settings", "(ZLokhttp3/internal/http2/Settings;)V", "ackSettings", "()V", "ack", "payload1", "payload2", "ping", "(ZII)V", "lastGoodStreamId", "Ll9/o;", "debugData", "goAway", "(ILokhttp3/internal/http2/ErrorCode;Ll9/o;)V", "", "windowSizeIncrement", "windowUpdate", "(IJ)V", "streamDependency", "weight", "exclusive", "priority", "(IIIZ)V", "promisedStreamId", "requestHeaders", "pushPromise", "(IILjava/util/List;)V", "", "origin", "protocol", "host", "port", "maxAge", "alternateService", "(ILjava/lang/String;Ll9/o;Ljava/lang/String;IJ)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes2.dex */
    public interface Handler {
        void ackSettings();

        void alternateService(int streamId, String origin, o protocol, String host, int port, long maxAge);

        void data(boolean inFinished, int streamId, n source, int length);

        void goAway(int lastGoodStreamId, ErrorCode errorCode, o debugData);

        void headers(boolean inFinished, int streamId, int associatedStreamId, List<Header> headerBlock);

        void ping(boolean ack, int payload1, int payload2);

        void priority(int streamId, int streamDependency, int weight, boolean exclusive);

        void pushPromise(int streamId, int promisedStreamId, List<Header> requestHeaders);

        void rstStream(int streamId, ErrorCode errorCode);

        void settings(boolean clearPrevious, Settings settings);

        void windowUpdate(int streamId, long windowSizeIncrement);
    }

    static {
        Logger logger2 = Logger.getLogger(Http2.class.getName());
        logger2.getClass();
        logger = logger2;
    }

    public Http2Reader(n nVar, boolean z9) {
        nVar.getClass();
        this.source = nVar;
        this.client = z9;
        ContinuationSource continuationSource = new ContinuationSource(nVar);
        this.continuation = continuationSource;
        this.hpackReader = new Hpack.Reader(continuationSource, 4096, 0, 4, null);
    }

    private final void readData(Handler handler, int length, int flags, int streamId) {
        boolean z9;
        if (streamId != 0) {
            int i10 = 0;
            if ((flags & 1) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if ((flags & 32) == 0) {
                if ((flags & 8) != 0) {
                    i10 = Util.and(this.source.readByte(), 255);
                }
                handler.data(z9, streamId, this.source, INSTANCE.lengthWithoutPadding(length, flags, i10));
                this.source.skip(i10);
                return;
            }
            b.A("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
            return;
        }
        b.A("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
    }

    private final void readGoAway(Handler handler, int length, int flags, int streamId) {
        if (length >= 8) {
            if (streamId == 0) {
                int readInt = this.source.readInt();
                int readInt2 = this.source.readInt();
                int i10 = length - 8;
                ErrorCode fromHttp2 = ErrorCode.INSTANCE.fromHttp2(readInt2);
                if (fromHttp2 != null) {
                    o oVar = o.e;
                    if (i10 > 0) {
                        oVar = this.source.f(i10);
                    }
                    handler.goAway(readInt, fromHttp2, oVar);
                    return;
                }
                b.A(a.e(readInt2, "TYPE_GOAWAY unexpected error code: "));
                return;
            }
            b.A("TYPE_GOAWAY streamId != 0");
            return;
        }
        b.A(a.e(length, "TYPE_GOAWAY length < 8: "));
    }

    private final List<Header> readHeaderBlock(int length, int padding, int flags, int streamId) {
        this.continuation.setLeft(length);
        ContinuationSource continuationSource = this.continuation;
        continuationSource.setLength(continuationSource.getLeft());
        this.continuation.setPadding(padding);
        this.continuation.setFlags(flags);
        this.continuation.setStreamId(streamId);
        this.hpackReader.readHeaders();
        return this.hpackReader.getAndResetHeaderList();
    }

    private final void readHeaders(Handler handler, int length, int flags, int streamId) {
        boolean z9;
        if (streamId != 0) {
            int i10 = 0;
            if ((flags & 1) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if ((flags & 8) != 0) {
                i10 = Util.and(this.source.readByte(), 255);
            }
            if ((flags & 32) != 0) {
                readPriority(handler, streamId);
                length -= 5;
            }
            handler.headers(z9, streamId, -1, readHeaderBlock(INSTANCE.lengthWithoutPadding(length, flags, i10), i10, flags, streamId));
            return;
        }
        b.A("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }

    private final void readPing(Handler handler, int length, int flags, int streamId) {
        if (length == 8) {
            if (streamId == 0) {
                int readInt = this.source.readInt();
                int readInt2 = this.source.readInt();
                boolean z9 = true;
                if ((flags & 1) == 0) {
                    z9 = false;
                }
                handler.ping(z9, readInt, readInt2);
                return;
            }
            b.A("TYPE_PING streamId != 0");
            return;
        }
        b.A(a.e(length, "TYPE_PING length != 8: "));
    }

    private final void readPriority(Handler handler, int streamId) {
        boolean z9;
        int readInt = this.source.readInt();
        if ((Integer.MIN_VALUE & readInt) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        handler.priority(streamId, readInt & Integer.MAX_VALUE, Util.and(this.source.readByte(), 255) + 1, z9);
    }

    private final void readPushPromise(Handler handler, int length, int flags, int streamId) {
        int i10;
        if (streamId != 0) {
            if ((flags & 8) != 0) {
                i10 = Util.and(this.source.readByte(), 255);
            } else {
                i10 = 0;
            }
            handler.pushPromise(streamId, this.source.readInt() & Integer.MAX_VALUE, readHeaderBlock(INSTANCE.lengthWithoutPadding(length - 4, flags, i10), i10, flags, streamId));
            return;
        }
        b.A("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }

    private final void readRstStream(Handler handler, int length, int flags, int streamId) {
        if (length == 4) {
            if (streamId != 0) {
                int readInt = this.source.readInt();
                ErrorCode fromHttp2 = ErrorCode.INSTANCE.fromHttp2(readInt);
                if (fromHttp2 != null) {
                    handler.rstStream(streamId, fromHttp2);
                    return;
                } else {
                    b.A(a.e(readInt, "TYPE_RST_STREAM unexpected error code: "));
                    return;
                }
            }
            b.A("TYPE_RST_STREAM streamId == 0");
            return;
        }
        b.A(a.f(length, "TYPE_RST_STREAM length: ", " != 4"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        n0.b.A(ai.onnxruntime.a.e(r4, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void readSettings(okhttp3.internal.http2.Http2Reader.Handler r8, int r9, int r10, int r11) {
        /*
            r7 = this;
            if (r11 != 0) goto L99
            r11 = 1
            r10 = r10 & r11
            if (r10 == 0) goto L12
            if (r9 != 0) goto Lc
            r8.ackSettings()
            return
        Lc:
            java.lang.String r8 = "FRAME_SIZE_ERROR ack frame should be empty!"
            n0.b.A(r8)
            return
        L12:
            int r10 = r9 % 6
            if (r10 != 0) goto L8f
            okhttp3.internal.http2.Settings r10 = new okhttp3.internal.http2.Settings
            r10.<init>()
            r0 = 0
            kotlin.ranges.IntRange r9 = kotlin.ranges.RangesKt.until(r0, r9)
            r1 = 6
            kotlin.ranges.IntProgression r9 = kotlin.ranges.RangesKt.d(r9, r1)
            int r1 = r9.getFirst()
            int r2 = r9.getLast()
            int r9 = r9.getStep()
            if (r9 <= 0) goto L35
            if (r1 <= r2) goto L39
        L35:
            if (r9 >= 0) goto L8b
            if (r2 > r1) goto L8b
        L39:
            l9.n r3 = r7.source
            short r3 = r3.readShort()
            r4 = 65535(0xffff, float:9.1834E-41)
            int r3 = okhttp3.internal.Util.and(r3, r4)
            l9.n r4 = r7.source
            int r4 = r4.readInt()
            r5 = 2
            if (r3 == r5) goto L79
            r5 = 3
            r6 = 4
            if (r3 == r5) goto L77
            if (r3 == r6) goto L6d
            r5 = 5
            if (r3 == r5) goto L59
            goto L84
        L59:
            r5 = 16384(0x4000, float:2.2959E-41)
            if (r4 < r5) goto L63
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            if (r4 > r5) goto L63
            goto L84
        L63:
            java.lang.String r8 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "
            java.lang.String r8 = ai.onnxruntime.a.e(r4, r8)
            n0.b.A(r8)
            return
        L6d:
            if (r4 < 0) goto L71
            r3 = 7
            goto L84
        L71:
            java.lang.String r8 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            n0.b.A(r8)
            return
        L77:
            r3 = r6
            goto L84
        L79:
            if (r4 == 0) goto L84
            if (r4 != r11) goto L7e
            goto L84
        L7e:
            java.lang.String r8 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            n0.b.A(r8)
            return
        L84:
            r10.set(r3, r4)
            if (r1 == r2) goto L8b
            int r1 = r1 + r9
            goto L39
        L8b:
            r8.settings(r0, r10)
            return
        L8f:
            java.lang.String r8 = "TYPE_SETTINGS length % 6 != 0: "
            java.lang.String r8 = ai.onnxruntime.a.e(r9, r8)
            n0.b.A(r8)
            return
        L99:
            java.lang.String r8 = "TYPE_SETTINGS streamId != 0"
            n0.b.A(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Reader.readSettings(okhttp3.internal.http2.Http2Reader$Handler, int, int, int):void");
    }

    private final void readWindowUpdate(Handler handler, int length, int flags, int streamId) {
        if (length == 4) {
            long and = Util.and(this.source.readInt(), 2147483647L);
            if (and != 0) {
                handler.windowUpdate(streamId, and);
                return;
            } else {
                b.A("windowSizeIncrement was 0");
                return;
            }
        }
        b.A(a.e(length, "TYPE_WINDOW_UPDATE length !=4: "));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.source.close();
    }

    public final boolean nextFrame(boolean requireSettings, Handler handler) {
        handler.getClass();
        try {
            this.source.Y(9L);
            int readMedium = Util.readMedium(this.source);
            if (readMedium <= 16384) {
                int and = Util.and(this.source.readByte(), 255);
                int and2 = Util.and(this.source.readByte(), 255);
                int readInt = this.source.readInt() & Integer.MAX_VALUE;
                Logger logger2 = logger;
                if (logger2.isLoggable(Level.FINE)) {
                    logger2.fine(Http2.INSTANCE.frameLog(true, readInt, readMedium, and, and2));
                }
                if (requireSettings && and != 4) {
                    ai.onnxruntime.b.w(Http2.INSTANCE.formattedType$okhttp(and), "Expected a SETTINGS frame but was ");
                    return false;
                }
                switch (and) {
                    case 0:
                        readData(handler, readMedium, and2, readInt);
                        return true;
                    case 1:
                        readHeaders(handler, readMedium, and2, readInt);
                        return true;
                    case 2:
                        readPriority(handler, readMedium, and2, readInt);
                        return true;
                    case 3:
                        readRstStream(handler, readMedium, and2, readInt);
                        return true;
                    case 4:
                        readSettings(handler, readMedium, and2, readInt);
                        return true;
                    case 5:
                        readPushPromise(handler, readMedium, and2, readInt);
                        return true;
                    case 6:
                        readPing(handler, readMedium, and2, readInt);
                        return true;
                    case 7:
                        readGoAway(handler, readMedium, and2, readInt);
                        return true;
                    case 8:
                        readWindowUpdate(handler, readMedium, and2, readInt);
                        return true;
                    default:
                        this.source.skip(readMedium);
                        return true;
                }
            }
            b.A(a.e(readMedium, "FRAME_SIZE_ERROR: "));
            return false;
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void readConnectionPreface(Handler handler) {
        handler.getClass();
        if (this.client) {
            if (!nextFrame(true, handler)) {
                b.A("Required SETTINGS preface not received");
                return;
            }
            return;
        }
        n nVar = this.source;
        o oVar = Http2.CONNECTION_PREFACE;
        o f8 = nVar.f(oVar.c());
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(Util.format("<< CONNECTION " + f8.d(), new Object[0]));
        }
        if (Intrinsics.areEqual(oVar, f8)) {
            return;
        }
        b.A("Expected a connection header but was ".concat(f8.l()));
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$Companion;", "", "()V", "logger", "Ljava/util/logging/Logger;", "getLogger", "()Ljava/util/logging/Logger;", "lengthWithoutPadding", "", "length", "flags", "padding", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Logger getLogger() {
            return Http2Reader.logger;
        }

        public final int lengthWithoutPadding(int length, int flags, int padding) {
            if ((flags & 8) != 0) {
                length--;
            }
            if (padding <= length) {
                return length - padding;
            }
            b.A(a.g(padding, "PROTOCOL_ERROR padding ", " > remaining length ", length));
            return 0;
        }

        private Companion() {
        }
    }

    private final void readPriority(Handler handler, int length, int flags, int streamId) {
        if (length != 5) {
            b.A(a.f(length, "TYPE_PRIORITY length: ", " != 5"));
        } else if (streamId != 0) {
            readPriority(handler, streamId);
        } else {
            b.A("TYPE_PRIORITY streamId == 0");
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\"\u0010\u001e\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\"\u0010!\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aR\"\u0010$\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0016\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001a¨\u0006'"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$ContinuationSource;", "Ll9/g0;", "Ll9/n;", "source", "<init>", "(Ll9/n;)V", "", "readContinuationHeader", "()V", "Ll9/l;", "sink", "", "byteCount", "read", "(Ll9/l;J)J", "Ll9/j0;", "timeout", "()Ll9/j0;", "close", "Ll9/n;", "", "length", "I", "getLength", "()I", "setLength", "(I)V", "flags", "getFlags", "setFlags", "streamId", "getStreamId", "setStreamId", "left", "getLeft", "setLeft", "padding", "getPadding", "setPadding", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes2.dex */
    public static final class ContinuationSource implements g0 {
        private int flags;
        private int left;
        private int length;
        private int padding;
        private final n source;
        private int streamId;

        public ContinuationSource(n nVar) {
            nVar.getClass();
            this.source = nVar;
        }

        private final void readContinuationHeader() {
            int i10 = this.streamId;
            int readMedium = Util.readMedium(this.source);
            this.left = readMedium;
            this.length = readMedium;
            int and = Util.and(this.source.readByte(), 255);
            this.flags = Util.and(this.source.readByte(), 255);
            Companion companion = Http2Reader.INSTANCE;
            if (companion.getLogger().isLoggable(Level.FINE)) {
                companion.getLogger().fine(Http2.INSTANCE.frameLog(true, this.streamId, this.length, and, this.flags));
            }
            int readInt = this.source.readInt() & Integer.MAX_VALUE;
            this.streamId = readInt;
            if (and == 9) {
                if (readInt == i10) {
                    return;
                }
                b.A("TYPE_CONTINUATION streamId changed");
            } else {
                throw new IOException(and + " != TYPE_CONTINUATION");
            }
        }

        public final int getFlags() {
            return this.flags;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getLength() {
            return this.length;
        }

        public final int getPadding() {
            return this.padding;
        }

        public final int getStreamId() {
            return this.streamId;
        }

        @Override // l9.g0
        public long read(l sink, long byteCount) {
            sink.getClass();
            while (true) {
                int i10 = this.left;
                n nVar = this.source;
                if (i10 == 0) {
                    nVar.skip(this.padding);
                    this.padding = 0;
                    if ((this.flags & 4) != 0) {
                        return -1L;
                    }
                    readContinuationHeader();
                } else {
                    long read = nVar.read(sink, Math.min(byteCount, i10));
                    if (read == -1) {
                        return -1L;
                    }
                    this.left -= (int) read;
                    return read;
                }
            }
        }

        public final void setFlags(int i10) {
            this.flags = i10;
        }

        public final void setLeft(int i10) {
            this.left = i10;
        }

        public final void setLength(int i10) {
            this.length = i10;
        }

        public final void setPadding(int i10) {
            this.padding = i10;
        }

        public final void setStreamId(int i10) {
            this.streamId = i10;
        }

        @Override // l9.g0
        /* renamed from: timeout */
        public j0 getTimeout() {
            return this.source.getTimeout();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
