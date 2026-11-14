package okhttp3.internal.ws;

import androidx.constraintlayout.widget.ConstraintLayout;
import j1.i;
import java.io.Closeable;
import java.util.zip.Inflater;
import kotlin.Metadata;
import l9.a0;
import l9.l;
import l9.u;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/ws/MessageInflater;", "Ljava/io/Closeable;", "", "noContextTakeover", "<init>", "(Z)V", "Ll9/l;", "buffer", "", "inflate", "(Ll9/l;)V", "close", "()V", "Z", "deflatedBytes", "Ll9/l;", "Ljava/util/zip/Inflater;", "inflater", "Ljava/util/zip/Inflater;", "Ll9/u;", "inflaterSource", "Ll9/u;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class MessageInflater implements Closeable {
    private final l deflatedBytes;
    private final Inflater inflater;
    private final u inflaterSource;
    private final boolean noContextTakeover;

    /* JADX WARN: Type inference failed for: r4v1, types: [l9.g0, java.lang.Object, l9.l] */
    public MessageInflater(boolean z9) {
        this.noContextTakeover = z9;
        ?? obj = new Object();
        this.deflatedBytes = obj;
        Inflater inflater = new Inflater(true);
        this.inflater = inflater;
        this.inflaterSource = new u(new a0(obj), inflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.inflaterSource.close();
    }

    public final void inflate(l buffer) {
        buffer.getClass();
        if (this.deflatedBytes.c == 0) {
            if (this.noContextTakeover) {
                this.inflater.reset();
            }
            this.deflatedBytes.G(buffer);
            this.deflatedBytes.p0(65535);
            long bytesRead = this.inflater.getBytesRead() + this.deflatedBytes.c;
            do {
                this.inflaterSource.b(buffer, Long.MAX_VALUE);
            } while (this.inflater.getBytesRead() < bytesRead);
            return;
        }
        i.k("Failed requirement.");
    }
}
