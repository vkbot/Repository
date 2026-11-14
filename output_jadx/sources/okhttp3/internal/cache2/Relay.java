package okhttp3.internal.cache2;

import androidx.constraintlayout.widget.ConstraintLayout;
import j1.i;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l9.g0;
import l9.j0;
import l9.l;
import l9.o;
import n0.b;
import okhttp3.internal.Util;
import w7.c;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 E2\u00020\u0001:\u0002EFB5\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0016J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010!R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b'\u0010$R$\u0010)\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0017\u00100\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\"\u00105\u001a\u0002048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0017\u0010;\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b;\u00101\u001a\u0004\b<\u00103R\"\u0010>\u001a\u00020=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0011\u0010D\u001a\u0002048F¢\u0006\u0006\u001a\u0004\bD\u00108¨\u0006G"}, d2 = {"Lokhttp3/internal/cache2/Relay;", "", "Ljava/io/RandomAccessFile;", "file", "Ll9/g0;", "upstream", "", "upstreamPos", "Ll9/o;", "metadata", "bufferMaxSize", "<init>", "(Ljava/io/RandomAccessFile;Ll9/g0;JLl9/o;J)V", "prefix", "upstreamSize", "metadataSize", "", "writeHeader", "(Ll9/o;JJ)V", "writeMetadata", "(J)V", "commit", "()Ll9/o;", "newSource", "()Ll9/g0;", "Ljava/io/RandomAccessFile;", "getFile", "()Ljava/io/RandomAccessFile;", "setFile", "(Ljava/io/RandomAccessFile;)V", "Ll9/g0;", "getUpstream", "setUpstream", "(Ll9/g0;)V", "J", "getUpstreamPos", "()J", "setUpstreamPos", "Ll9/o;", "getBufferMaxSize", "Ljava/lang/Thread;", "upstreamReader", "Ljava/lang/Thread;", "getUpstreamReader", "()Ljava/lang/Thread;", "setUpstreamReader", "(Ljava/lang/Thread;)V", "Ll9/l;", "upstreamBuffer", "Ll9/l;", "getUpstreamBuffer", "()Ll9/l;", "", "complete", "Z", "getComplete", "()Z", "setComplete", "(Z)V", "buffer", "getBuffer", "", "sourceCount", "I", "getSourceCount", "()I", "setSourceCount", "(I)V", "isClosed", "Companion", "RelaySource", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class Relay {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long FILE_HEADER_SIZE = 32;

    @JvmField
    public static final o PREFIX_CLEAN;

    @JvmField
    public static final o PREFIX_DIRTY;
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    private final l buffer;
    private final long bufferMaxSize;
    private boolean complete;
    private RandomAccessFile file;
    private final o metadata;
    private int sourceCount;
    private g0 upstream;
    private final l upstreamBuffer;
    private long upstreamPos;
    private Thread upstreamReader;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/cache2/Relay$RelaySource;", "Ll9/g0;", "<init>", "(Lokhttp3/internal/cache2/Relay;)V", "Ll9/l;", "sink", "", "byteCount", "read", "(Ll9/l;J)J", "Ll9/j0;", "timeout", "()Ll9/j0;", "", "close", "()V", "Ll9/j0;", "Lokhttp3/internal/cache2/FileOperator;", "fileOperator", "Lokhttp3/internal/cache2/FileOperator;", "sourcePos", "J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nRelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Relay.kt\nokhttp3/internal/cache2/Relay$RelaySource\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,356:1\n563#2:357\n*S KotlinDebug\n*F\n+ 1 Relay.kt\nokhttp3/internal/cache2/Relay$RelaySource\n*L\n267#1:357\n*E\n"})
    /* loaded from: classes2.dex */
    public final class RelaySource implements g0 {
        private FileOperator fileOperator;
        private long sourcePos;
        private final j0 timeout = new Object();

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l9.j0] */
        public RelaySource() {
            RandomAccessFile file = Relay.this.getFile();
            file.getClass();
            FileChannel channel = file.getChannel();
            channel.getClass();
            this.fileOperator = new FileOperator(channel);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.fileOperator != null) {
                RandomAccessFile randomAccessFile = null;
                this.fileOperator = null;
                Relay relay = Relay.this;
                synchronized (relay) {
                    try {
                        relay.setSourceCount(relay.getSourceCount() - 1);
                        if (relay.getSourceCount() == 0) {
                            RandomAccessFile file = relay.getFile();
                            relay.setFile(null);
                            randomAccessFile = file;
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (randomAccessFile != null) {
                    Util.closeQuietly(randomAccessFile);
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
        
            r4 = r22.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
        
            if (r0 != 2) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
        
            r14 = java.lang.Math.min(r24, r4.getUpstreamPos() - r22.sourcePos);
            r10 = r22.fileOperator;
            r10.getClass();
            r10.read(r22.sourcePos + okhttp3.internal.cache2.Relay.FILE_HEADER_SIZE, r23, r14);
            r22.sourcePos += r14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
        
            return r14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
        
            r0 = r4.getUpstream();
            r0.getClass();
            r10 = r0.read(r22.this$0.getUpstreamBuffer(), r22.this$0.getBufferMaxSize());
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x008d, code lost:
        
            if (r10 != (-1)) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x008f, code lost:
        
            r0 = r22.this$0;
            r0.commit(r0.getUpstreamPos());
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0098, code lost:
        
            r2 = r22.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:
        
            r2.setUpstreamReader(null);
            r2.notifyAll();
            r0 = kotlin.Unit.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00a3, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00a4, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00ab, code lost:
        
            r20 = java.lang.Math.min(r10, r24);
            r22.this$0.getUpstreamBuffer().S(0, r23, r20);
            r22.sourcePos += r20;
            r12 = r22.fileOperator;
            r12.getClass();
            r12.write(r22.this$0.getUpstreamPos() + okhttp3.internal.cache2.Relay.FILE_HEADER_SIZE, r22.this$0.getUpstreamBuffer().clone(), r10);
            r4 = r22.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00e2, code lost:
        
            monitor-enter(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00e3, code lost:
        
            r4.getBuffer().write(r4.getUpstreamBuffer(), r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00fa, code lost:
        
            if (r4.getBuffer().c <= r4.getBufferMaxSize()) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00fc, code lost:
        
            r4.getBuffer().skip(r4.getBuffer().c - r4.getBufferMaxSize());
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0111, code lost:
        
            r4.setUpstreamPos(r4.getUpstreamPos() + r10);
            r0 = kotlin.Unit.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x011b, code lost:
        
            monitor-exit(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x011c, code lost:
        
            r2 = r22.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x011e, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x011f, code lost:
        
            r2.setUpstreamReader(null);
            r2.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0125, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0126, code lost:
        
            return r20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x010f, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x012b, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00a8, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x012c, code lost:
        
            r2 = r22.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x012e, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x012f, code lost:
        
            r2.setUpstreamReader(null);
            r2.notifyAll();
            r3 = kotlin.Unit.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x0138, code lost:
        
            throw r0;
         */
        @Override // l9.g0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long read(l9.l r23, long r24) {
            /*
                Method dump skipped, instructions count: 357
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache2.Relay.RelaySource.read(l9.l, long):long");
        }

        @Override // l9.g0
        /* renamed from: timeout, reason: from getter */
        public j0 getTimeout() {
            return this.timeout;
        }
    }

    static {
        o oVar = o.e;
        PREFIX_CLEAN = c.k("OkHttp cache v1\n");
        PREFIX_DIRTY = c.k("OkHttp DIRTY :(\n");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, l9.l] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, l9.l] */
    private Relay(RandomAccessFile randomAccessFile, g0 g0Var, long j10, o oVar, long j11) {
        boolean z9;
        this.file = randomAccessFile;
        this.upstream = g0Var;
        this.upstreamPos = j10;
        this.metadata = oVar;
        this.bufferMaxSize = j11;
        this.upstreamBuffer = new Object();
        if (g0Var == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.complete = z9;
        this.buffer = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, l9.l] */
    public final void writeHeader(o prefix, long upstreamSize, long metadataSize) {
        ?? obj = new Object();
        obj.l0(prefix);
        obj.q0(upstreamSize);
        obj.q0(metadataSize);
        if (obj.c == FILE_HEADER_SIZE) {
            RandomAccessFile randomAccessFile = this.file;
            randomAccessFile.getClass();
            FileChannel channel = randomAccessFile.getChannel();
            channel.getClass();
            new FileOperator(channel).write(0L, obj, FILE_HEADER_SIZE);
            return;
        }
        i.k("Failed requirement.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, l9.l] */
    private final void writeMetadata(long upstreamSize) {
        ?? obj = new Object();
        obj.l0(this.metadata);
        RandomAccessFile randomAccessFile = this.file;
        randomAccessFile.getClass();
        FileChannel channel = randomAccessFile.getChannel();
        channel.getClass();
        new FileOperator(channel).write(FILE_HEADER_SIZE + upstreamSize, obj, this.metadata.c());
    }

    public final void commit(long upstreamSize) {
        writeMetadata(upstreamSize);
        RandomAccessFile randomAccessFile = this.file;
        randomAccessFile.getClass();
        randomAccessFile.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, upstreamSize, this.metadata.c());
        RandomAccessFile randomAccessFile2 = this.file;
        randomAccessFile2.getClass();
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
            Unit unit = Unit.INSTANCE;
        }
        g0 g0Var = this.upstream;
        if (g0Var != null) {
            Util.closeQuietly(g0Var);
        }
        this.upstream = null;
    }

    public final l getBuffer() {
        return this.buffer;
    }

    public final long getBufferMaxSize() {
        return this.bufferMaxSize;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final RandomAccessFile getFile() {
        return this.file;
    }

    public final int getSourceCount() {
        return this.sourceCount;
    }

    public final g0 getUpstream() {
        return this.upstream;
    }

    public final l getUpstreamBuffer() {
        return this.upstreamBuffer;
    }

    public final long getUpstreamPos() {
        return this.upstreamPos;
    }

    public final Thread getUpstreamReader() {
        return this.upstreamReader;
    }

    public final boolean isClosed() {
        if (this.file == null) {
            return true;
        }
        return false;
    }

    /* renamed from: metadata, reason: from getter */
    public final o getMetadata() {
        return this.metadata;
    }

    public final g0 newSource() {
        synchronized (this) {
            if (this.file == null) {
                return null;
            }
            this.sourceCount++;
            return new RelaySource();
        }
    }

    public final void setComplete(boolean z9) {
        this.complete = z9;
    }

    public final void setFile(RandomAccessFile randomAccessFile) {
        this.file = randomAccessFile;
    }

    public final void setSourceCount(int i10) {
        this.sourceCount = i10;
    }

    public final void setUpstream(g0 g0Var) {
        this.upstream = g0Var;
    }

    public final void setUpstreamPos(long j10) {
        this.upstreamPos = j10;
    }

    public final void setUpstreamReader(Thread thread) {
        this.upstreamReader = thread;
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/cache2/Relay$Companion;", "", "<init>", "()V", "Ljava/io/File;", "file", "Ll9/g0;", "upstream", "Ll9/o;", "metadata", "", "bufferMaxSize", "Lokhttp3/internal/cache2/Relay;", "edit", "(Ljava/io/File;Ll9/g0;Ll9/o;J)Lokhttp3/internal/cache2/Relay;", "read", "(Ljava/io/File;)Lokhttp3/internal/cache2/Relay;", "FILE_HEADER_SIZE", "J", "PREFIX_CLEAN", "Ll9/o;", "PREFIX_DIRTY", "", "SOURCE_FILE", "I", "SOURCE_UPSTREAM", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Relay edit(File file, g0 upstream, o metadata, long bufferMaxSize) {
            file.getClass();
            upstream.getClass();
            metadata.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            Relay relay = new Relay(randomAccessFile, upstream, 0L, metadata, bufferMaxSize, null);
            randomAccessFile.setLength(0L);
            relay.writeHeader(Relay.PREFIX_DIRTY, -1L, -1L);
            return relay;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, l9.l] */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, l9.l] */
        public final Relay read(File file) {
            file.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            FileChannel channel = randomAccessFile.getChannel();
            channel.getClass();
            FileOperator fileOperator = new FileOperator(channel);
            ?? obj = new Object();
            fileOperator.read(0L, obj, Relay.FILE_HEADER_SIZE);
            if (Intrinsics.areEqual(obj.f(r11.c()), Relay.PREFIX_CLEAN)) {
                long readLong = obj.readLong();
                long readLong2 = obj.readLong();
                ?? obj2 = new Object();
                fileOperator.read(Relay.FILE_HEADER_SIZE + readLong, obj2, readLong2);
                return new Relay(randomAccessFile, null, readLong, obj2.f(obj2.c), 0L, null);
            }
            b.A("unreadable cache file");
            return null;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Relay(RandomAccessFile randomAccessFile, g0 g0Var, long j10, o oVar, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(randomAccessFile, g0Var, j10, oVar, j11);
    }
}
