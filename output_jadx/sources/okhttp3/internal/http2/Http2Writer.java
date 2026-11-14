package okhttp3.internal.http2;

import ai.onnxruntime.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import l9.i;
import l9.l;
import l9.m;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0012\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 L2\u00020\u0001:\u0001LB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0019\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u0010J\u001d\u0010\u001e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\b¢\u0006\u0004\b \u0010!J/\u0010%\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b%\u0010&J/\u0010)\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010'\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010#2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u0011¢\u0006\u0004\b+\u0010\u0014J%\u0010/\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020\b¢\u0006\u0004\b/\u00100J%\u00104\u001a\u00020\f2\u0006\u00101\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J\u001d\u00107\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u00106\u001a\u00020\n¢\u0006\u0004\b7\u0010\u000eJ-\u0010:\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u00108\u001a\u00020\b2\u0006\u00109\u001a\u00020\b2\u0006\u0010'\u001a\u00020\b¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\fH\u0016¢\u0006\u0004\b<\u0010\u0010J+\u0010>\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b>\u0010?R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010@R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010AR\u0014\u0010B\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010AR\u0017\u0010H\u001a\u00020G8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K¨\u0006M"}, d2 = {"Lokhttp3/internal/http2/Http2Writer;", "Ljava/io/Closeable;", "Ll9/m;", "sink", "", "client", "<init>", "(Ll9/m;Z)V", "", "streamId", "", "byteCount", "", "writeContinuationFrames", "(IJ)V", "connectionPreface", "()V", "Lokhttp3/internal/http2/Settings;", "peerSettings", "applyAndAckSettings", "(Lokhttp3/internal/http2/Settings;)V", "promisedStreamId", "", "Lokhttp3/internal/http2/Header;", "requestHeaders", "pushPromise", "(IILjava/util/List;)V", "flush", "Lokhttp3/internal/http2/ErrorCode;", "errorCode", "rstStream", "(ILokhttp3/internal/http2/ErrorCode;)V", "maxDataLength", "()I", "outFinished", "Ll9/l;", "source", "data", "(ZILl9/l;I)V", "flags", "buffer", "dataFrame", "(IILl9/l;I)V", "settings", "ack", "payload1", "payload2", "ping", "(ZII)V", "lastGoodStreamId", "", "debugData", "goAway", "(ILokhttp3/internal/http2/ErrorCode;[B)V", "windowSizeIncrement", "windowUpdate", "length", "type", "frameHeader", "(IIII)V", "close", "headerBlock", "headers", "(ZILjava/util/List;)V", "Ll9/m;", "Z", "hpackBuffer", "Ll9/l;", "maxFrameSize", "I", "closed", "Lokhttp3/internal/http2/Hpack$Writer;", "hpackWriter", "Lokhttp3/internal/http2/Hpack$Writer;", "getHpackWriter", "()Lokhttp3/internal/http2/Hpack$Writer;", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nHttp2Writer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Writer.kt\nokhttp3/internal/http2/Http2Writer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,317:1\n1#2:318\n*E\n"})
/* loaded from: classes2.dex */
public final class Http2Writer implements Closeable {
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private boolean closed;
    private final l hpackBuffer;
    private final Hpack.Writer hpackWriter;
    private int maxFrameSize;
    private final m sink;

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, l9.l] */
    public Http2Writer(m mVar, boolean z9) {
        mVar.getClass();
        this.sink = mVar;
        this.client = z9;
        ?? obj = new Object();
        this.hpackBuffer = obj;
        this.maxFrameSize = 16384;
        this.hpackWriter = new Hpack.Writer(0, false, obj, 3, null);
    }

    private final void writeContinuationFrames(int streamId, long byteCount) {
        int i10;
        while (byteCount > 0) {
            long min = Math.min(this.maxFrameSize, byteCount);
            byteCount -= min;
            int i11 = (int) min;
            if (byteCount == 0) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            frameHeader(streamId, i11, 9, i10);
            this.sink.write(this.hpackBuffer, min);
        }
    }

    public final synchronized void applyAndAckSettings(Settings peerSettings) {
        try {
            peerSettings.getClass();
            if (!this.closed) {
                this.maxFrameSize = peerSettings.getMaxFrameSize(this.maxFrameSize);
                if (peerSettings.getHeaderTableSize() != -1) {
                    this.hpackWriter.resizeHeaderTable(peerSettings.getHeaderTableSize());
                }
                frameHeader(0, 0, 4, 1);
                this.sink.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.closed = true;
        this.sink.close();
    }

    public final synchronized void connectionPreface() {
        try {
            if (!this.closed) {
                if (!this.client) {
                    return;
                }
                Logger logger2 = logger;
                if (logger2.isLoggable(Level.FINE)) {
                    logger2.fine(Util.format(">> CONNECTION " + Http2.CONNECTION_PREFACE.d(), new Object[0]));
                }
                this.sink.w(Http2.CONNECTION_PREFACE);
                this.sink.flush();
                return;
            }
            throw new IOException("closed");
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void data(boolean outFinished, int streamId, l source, int byteCount) {
        if (!this.closed) {
            dataFrame(streamId, outFinished ? 1 : 0, source, byteCount);
        } else {
            throw new IOException("closed");
        }
    }

    public final void dataFrame(int streamId, int flags, l buffer, int byteCount) {
        frameHeader(streamId, byteCount, 0, flags);
        if (byteCount > 0) {
            m mVar = this.sink;
            buffer.getClass();
            mVar.write(buffer, byteCount);
        }
    }

    public final synchronized void flush() {
        if (!this.closed) {
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final void frameHeader(int streamId, int length, int type, int flags) {
        int i10;
        int i11;
        int i12;
        int i13;
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            i10 = streamId;
            i11 = length;
            i12 = type;
            i13 = flags;
            logger2.fine(Http2.INSTANCE.frameLog(false, i10, i11, i12, i13));
        } else {
            i10 = streamId;
            i11 = length;
            i12 = type;
            i13 = flags;
        }
        if (i11 <= this.maxFrameSize) {
            if ((Integer.MIN_VALUE & i10) == 0) {
                Util.writeMedium(this.sink, i11);
                this.sink.writeByte(i12 & 255);
                this.sink.writeByte(i13 & 255);
                this.sink.writeInt(Integer.MAX_VALUE & i10);
                return;
            }
            i.d(a.e(i10, "reserved bit set: "));
            return;
        }
        throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.maxFrameSize + ": " + i11).toString());
    }

    public final Hpack.Writer getHpackWriter() {
        return this.hpackWriter;
    }

    public final synchronized void goAway(int lastGoodStreamId, ErrorCode errorCode, byte[] debugData) {
        errorCode.getClass();
        debugData.getClass();
        if (!this.closed) {
            if (errorCode.getHttpCode() != -1) {
                frameHeader(0, debugData.length + 8, 7, 0);
                this.sink.writeInt(lastGoodStreamId);
                this.sink.writeInt(errorCode.getHttpCode());
                if (debugData.length != 0) {
                    this.sink.write(debugData);
                }
                this.sink.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void headers(boolean outFinished, int streamId, List<Header> headerBlock) {
        int i10;
        headerBlock.getClass();
        if (!this.closed) {
            this.hpackWriter.writeHeaders(headerBlock);
            long j10 = this.hpackBuffer.c;
            long min = Math.min(this.maxFrameSize, j10);
            if (j10 == min) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            if (outFinished) {
                i10 |= 1;
            }
            frameHeader(streamId, (int) min, 1, i10);
            this.sink.write(this.hpackBuffer, min);
            if (j10 > min) {
                writeContinuationFrames(streamId, j10 - min);
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: maxDataLength, reason: from getter */
    public final int getMaxFrameSize() {
        return this.maxFrameSize;
    }

    public final synchronized void ping(boolean ack, int payload1, int payload2) {
        if (!this.closed) {
            frameHeader(0, 8, 6, ack ? 1 : 0);
            this.sink.writeInt(payload1);
            this.sink.writeInt(payload2);
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void pushPromise(int streamId, int promisedStreamId, List<Header> requestHeaders) {
        int i10;
        requestHeaders.getClass();
        if (!this.closed) {
            this.hpackWriter.writeHeaders(requestHeaders);
            long j10 = this.hpackBuffer.c;
            int min = (int) Math.min(this.maxFrameSize - 4, j10);
            int i11 = min + 4;
            long j11 = min;
            if (j10 == j11) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            frameHeader(streamId, i11, 5, i10);
            this.sink.writeInt(promisedStreamId & Integer.MAX_VALUE);
            this.sink.write(this.hpackBuffer, j11);
            if (j10 > j11) {
                writeContinuationFrames(streamId, j10 - j11);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void rstStream(int streamId, ErrorCode errorCode) {
        errorCode.getClass();
        if (!this.closed) {
            if (errorCode.getHttpCode() != -1) {
                frameHeader(streamId, 4, 3, 0);
                this.sink.writeInt(errorCode.getHttpCode());
                this.sink.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.");
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void settings(Settings settings) {
        int i10;
        try {
            settings.getClass();
            if (!this.closed) {
                frameHeader(0, settings.size() * 6, 4, 0);
                for (int i11 = 0; i11 < 10; i11++) {
                    if (settings.isSet(i11)) {
                        if (i11 != 4) {
                            if (i11 != 7) {
                                i10 = i11;
                            } else {
                                i10 = 4;
                            }
                        } else {
                            i10 = 3;
                        }
                        this.sink.writeShort(i10);
                        this.sink.writeInt(settings.get(i11));
                    }
                }
                this.sink.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void windowUpdate(int streamId, long windowSizeIncrement) {
        if (!this.closed) {
            if (windowSizeIncrement != 0 && windowSizeIncrement <= 2147483647L) {
                frameHeader(streamId, 4, 8, 0);
                this.sink.writeInt((int) windowSizeIncrement);
                this.sink.flush();
            } else {
                throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + windowSizeIncrement).toString());
            }
        } else {
            throw new IOException("closed");
        }
    }
}
