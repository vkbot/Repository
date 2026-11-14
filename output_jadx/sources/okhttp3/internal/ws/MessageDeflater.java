package okhttp3.internal.ws;

import androidx.constraintlayout.widget.ConstraintLayout;
import j1.i;
import java.io.Closeable;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import l9.b;
import l9.j;
import l9.l;
import l9.o;
import l9.p;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/ws/MessageDeflater;", "Ljava/io/Closeable;", "", "noContextTakeover", "<init>", "(Z)V", "Ll9/l;", "Ll9/o;", "suffix", "endsWith", "(Ll9/l;Ll9/o;)Z", "buffer", "", "deflate", "(Ll9/l;)V", "close", "()V", "Z", "deflatedBytes", "Ll9/l;", "Ljava/util/zip/Deflater;", "deflater", "Ljava/util/zip/Deflater;", "Ll9/p;", "deflaterSink", "Ll9/p;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class MessageDeflater implements Closeable {
    private final l deflatedBytes;
    private final Deflater deflater;
    private final p deflaterSink;
    private final boolean noContextTakeover;

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, l9.l] */
    public MessageDeflater(boolean z9) {
        this.noContextTakeover = z9;
        ?? obj = new Object();
        this.deflatedBytes = obj;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new p(obj, deflater);
    }

    private final boolean endsWith(l lVar, o oVar) {
        return lVar.Q(lVar.c - oVar.c(), oVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.deflaterSink.close();
    }

    public final void deflate(l buffer) {
        o oVar;
        buffer.getClass();
        if (this.deflatedBytes.c == 0) {
            if (this.noContextTakeover) {
                this.deflater.reset();
            }
            this.deflaterSink.write(buffer, buffer.c);
            this.deflaterSink.flush();
            l lVar = this.deflatedBytes;
            oVar = MessageDeflaterKt.EMPTY_DEFLATE_BLOCK;
            boolean endsWith = endsWith(lVar, oVar);
            l lVar2 = this.deflatedBytes;
            if (endsWith) {
                long j10 = lVar2.c - 4;
                j e02 = lVar2.e0(b.f3559a);
                try {
                    e02.b(j10);
                    CloseableKt.closeFinally(e02, null);
                } finally {
                }
            } else {
                lVar2.m0(0);
            }
            l lVar3 = this.deflatedBytes;
            buffer.write(lVar3, lVar3.c);
            return;
        }
        i.k("Failed requirement.");
    }
}
