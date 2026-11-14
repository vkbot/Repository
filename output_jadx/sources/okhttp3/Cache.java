package okhttp3;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;
import l9.a0;
import l9.e0;
import l9.g0;
import l9.k;
import l9.m;
import l9.n;
import l9.o;
import l9.q;
import l9.r;
import l9.z;
import n0.b;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import w7.c;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010)\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 C2\u00020\u00012\u00020\u0002:\u0004BCDEB\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0018\u00010\"R\u00020\fH\u0002J\b\u0010#\u001a\u00020 H\u0016J\u0006\u0010$\u001a\u00020 J\r\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\b%J\u0006\u0010&\u001a\u00020 J\b\u0010'\u001a\u00020 H\u0016J\u0017\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020+H\u0000¢\u0006\u0002\b,J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010-\u001a\u00020 J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0015\u001a\u00020\u0011J\u0017\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u00020)H\u0000¢\u0006\u0002\b1J\u0015\u00102\u001a\u00020 2\u0006\u0010*\u001a\u00020+H\u0000¢\u0006\u0002\b3J\u0006\u0010\u0016\u001a\u00020\u0011J\u0006\u00104\u001a\u00020\u0006J\r\u00105\u001a\u00020 H\u0000¢\u0006\u0002\b6J\u0015\u00107\u001a\u00020 2\u0006\u00108\u001a\u000209H\u0000¢\u0006\u0002\b:J\u001d\u0010;\u001a\u00020 2\u0006\u0010<\u001a\u00020)2\u0006\u0010=\u001a\u00020)H\u0000¢\u0006\u0002\b>J\f\u0010?\u001a\b\u0012\u0004\u0012\u00020A0@J\u0006\u0010\u0017\u001a\u00020\u0011J\u0006\u0010\u001c\u001a\u00020\u0011R\u0014\u0010\u000b\u001a\u00020\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0003\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0011X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0011X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001b¨\u0006F"}, d2 = {"Lokhttp3/Cache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "directory", "Ljava/io/File;", "maxSize", "", "(Ljava/io/File;J)V", "fileSystem", "Lokhttp3/internal/io/FileSystem;", "(Ljava/io/File;JLokhttp3/internal/io/FileSystem;)V", "cache", "Lokhttp3/internal/cache/DiskLruCache;", "getCache$okhttp", "()Lokhttp3/internal/cache/DiskLruCache;", "()Ljava/io/File;", "hitCount", "", "isClosed", "", "()Z", "networkCount", "requestCount", "writeAbortCount", "getWriteAbortCount$okhttp", "()I", "setWriteAbortCount$okhttp", "(I)V", "writeSuccessCount", "getWriteSuccessCount$okhttp", "setWriteSuccessCount$okhttp", "abortQuietly", "", "editor", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "close", "delete", "-deprecated_directory", "evictAll", "flush", "get", "Lokhttp3/Response;", "request", "Lokhttp3/Request;", "get$okhttp", "initialize", "put", "Lokhttp3/internal/cache/CacheRequest;", "response", "put$okhttp", "remove", "remove$okhttp", "size", "trackConditionalCacheHit", "trackConditionalCacheHit$okhttp", "trackResponse", "cacheStrategy", "Lokhttp3/internal/cache/CacheStrategy;", "trackResponse$okhttp", "update", "cached", "network", "update$okhttp", "urls", "", "", "CacheResponseBody", "Companion", "Entry", "RealCacheRequest", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class Cache implements Closeable, Flushable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_COUNT = 2;
    private static final int ENTRY_METADATA = 0;
    private static final int VERSION = 201105;
    private final DiskLruCache cache;
    private int hitCount;
    private int networkCount;
    private int requestCount;
    private int writeAbortCount;
    private int writeSuccessCount;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B'\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u0006\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0006\u0010\u000bJ\u000f\u0010\u0007\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0007\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lokhttp3/Cache$CacheResponseBody;", "Lokhttp3/ResponseBody;", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "snapshot", "", "contentType", "contentLength", "<init>", "(Lokhttp3/internal/cache/DiskLruCache$Snapshot;Ljava/lang/String;Ljava/lang/String;)V", "Lokhttp3/MediaType;", "()Lokhttp3/MediaType;", "", "()J", "Ll9/n;", "source", "()Ll9/n;", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "getSnapshot", "()Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Ljava/lang/String;", "bodySource", "Ll9/n;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes2.dex */
    public static final class CacheResponseBody extends ResponseBody {
        private final n bodySource;
        private final String contentLength;
        private final String contentType;
        private final DiskLruCache.Snapshot snapshot;

        public CacheResponseBody(DiskLruCache.Snapshot snapshot, String str, String str2) {
            snapshot.getClass();
            this.snapshot = snapshot;
            this.contentType = str;
            this.contentLength = str2;
            this.bodySource = new a0(new r(snapshot.getSource(1)) { // from class: okhttp3.Cache.CacheResponseBody.1
                @Override // l9.r, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    this.getSnapshot().close();
                    super.close();
                }
            });
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: contentLength */
        public long getContentLength() {
            String str = this.contentLength;
            if (str == null) {
                return -1L;
            }
            return Util.toLongOrDefault(str, -1L);
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: contentType */
        public MediaType get$contentType() {
            String str = this.contentType;
            if (str != null) {
                return MediaType.INSTANCE.parse(str);
            }
            return null;
        }

        public final DiskLruCache.Snapshot getSnapshot() {
            return this.snapshot;
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: source, reason: from getter */
        public n getSource() {
            return this.bodySource;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\rR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lokhttp3/Cache$RealCacheRequest;", "Lokhttp3/internal/cache/CacheRequest;", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "editor", "<init>", "(Lokhttp3/Cache;Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "", "abort", "()V", "Ll9/e0;", "body", "()Ll9/e0;", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "cacheOut", "Ll9/e0;", "", "done", "Z", "getDone", "()Z", "setDone", "(Z)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes2.dex */
    public final class RealCacheRequest implements CacheRequest {
        private final e0 body;
        private final e0 cacheOut;
        private boolean done;
        private final DiskLruCache.Editor editor;
        final /* synthetic */ Cache this$0;

        public RealCacheRequest(final Cache cache, DiskLruCache.Editor editor) {
            editor.getClass();
            this.this$0 = cache;
            this.editor = editor;
            e0 newSink = editor.newSink(1);
            this.cacheOut = newSink;
            this.body = new q(newSink) { // from class: okhttp3.Cache.RealCacheRequest.1
                @Override // l9.q, l9.e0, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    Cache cache2 = Cache.this;
                    RealCacheRequest realCacheRequest = this;
                    synchronized (cache2) {
                        if (realCacheRequest.getDone()) {
                            return;
                        }
                        realCacheRequest.setDone(true);
                        cache2.setWriteSuccessCount$okhttp(cache2.getWriteSuccessCount() + 1);
                        super.close();
                        this.editor.commit();
                    }
                }
            };
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public void abort() {
            Cache cache = this.this$0;
            synchronized (cache) {
                if (this.done) {
                    return;
                }
                this.done = true;
                cache.setWriteAbortCount$okhttp(cache.getWriteAbortCount() + 1);
                Util.closeQuietly(this.cacheOut);
                try {
                    this.editor.abort();
                } catch (IOException unused) {
                }
            }
        }

        @Override // okhttp3.internal.cache.CacheRequest
        /* renamed from: body, reason: from getter */
        public e0 getBody() {
            return this.body;
        }

        public final boolean getDone() {
            return this.done;
        }

        public final void setDone(boolean z9) {
            this.done = z9;
        }
    }

    public Cache(File file, long j10, FileSystem fileSystem) {
        file.getClass();
        fileSystem.getClass();
        this.cache = new DiskLruCache(fileSystem, file, VERSION, 2, j10, TaskRunner.INSTANCE);
    }

    private final void abortQuietly(DiskLruCache.Editor editor) {
        if (editor != null) {
            try {
                editor.abort();
            } catch (IOException unused) {
            }
        }
    }

    @JvmStatic
    public static final String key(HttpUrl httpUrl) {
        return INSTANCE.key(httpUrl);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "directory", imports = {}))
    @JvmName(name = "-deprecated_directory")
    /* renamed from: -deprecated_directory, reason: not valid java name */
    public final File m1573deprecated_directory() {
        return this.cache.getDirectory();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.cache.close();
    }

    public final void delete() {
        this.cache.delete();
    }

    @JvmName(name = "directory")
    public final File directory() {
        return this.cache.getDirectory();
    }

    public final void evictAll() {
        this.cache.evictAll();
    }

    @Override // java.io.Flushable
    public void flush() {
        this.cache.flush();
    }

    public final Response get$okhttp(Request request) {
        request.getClass();
        try {
            DiskLruCache.Snapshot snapshot = this.cache.get(INSTANCE.key(request.url()));
            if (snapshot == null) {
                return null;
            }
            try {
                Entry entry = new Entry(snapshot.getSource(0));
                Response response = entry.response(snapshot);
                if (!entry.matches(request, response)) {
                    ResponseBody body = response.body();
                    if (body != null) {
                        Util.closeQuietly(body);
                    }
                    return null;
                }
                return response;
            } catch (IOException unused) {
                Util.closeQuietly(snapshot);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    /* renamed from: getCache$okhttp, reason: from getter */
    public final DiskLruCache getCache() {
        return this.cache;
    }

    /* renamed from: getWriteAbortCount$okhttp, reason: from getter */
    public final int getWriteAbortCount() {
        return this.writeAbortCount;
    }

    /* renamed from: getWriteSuccessCount$okhttp, reason: from getter */
    public final int getWriteSuccessCount() {
        return this.writeSuccessCount;
    }

    public final synchronized int hitCount() {
        return this.hitCount;
    }

    public final void initialize() {
        this.cache.initialize();
    }

    public final boolean isClosed() {
        return this.cache.isClosed();
    }

    public final long maxSize() {
        return this.cache.getMaxSize();
    }

    public final synchronized int networkCount() {
        return this.networkCount;
    }

    public final CacheRequest put$okhttp(Response response) {
        DiskLruCache.Editor editor;
        response.getClass();
        String method = response.request().method();
        if (HttpMethod.INSTANCE.invalidatesCache(response.request().method())) {
            try {
                remove$okhttp(response.request());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!Intrinsics.areEqual(method, "GET")) {
            return null;
        }
        Companion companion = INSTANCE;
        if (companion.hasVaryAll(response)) {
            return null;
        }
        Entry entry = new Entry(response);
        try {
            editor = DiskLruCache.edit$default(this.cache, companion.key(response.request().url()), 0L, 2, null);
            if (editor == null) {
                return null;
            }
            try {
                entry.writeTo(editor);
                return new RealCacheRequest(this, editor);
            } catch (IOException unused2) {
                abortQuietly(editor);
                return null;
            }
        } catch (IOException unused3) {
            editor = null;
        }
    }

    public final void remove$okhttp(Request request) {
        request.getClass();
        this.cache.remove(INSTANCE.key(request.url()));
    }

    public final synchronized int requestCount() {
        return this.requestCount;
    }

    public final void setWriteAbortCount$okhttp(int i10) {
        this.writeAbortCount = i10;
    }

    public final void setWriteSuccessCount$okhttp(int i10) {
        this.writeSuccessCount = i10;
    }

    public final long size() {
        return this.cache.size();
    }

    public final synchronized void trackConditionalCacheHit$okhttp() {
        this.hitCount++;
    }

    public final synchronized void trackResponse$okhttp(CacheStrategy cacheStrategy) {
        try {
            cacheStrategy.getClass();
            this.requestCount++;
            if (cacheStrategy.getNetworkRequest() != null) {
                this.networkCount++;
            } else if (cacheStrategy.getCacheResponse() != null) {
                this.hitCount++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void update$okhttp(Response cached, Response network) {
        DiskLruCache.Editor editor;
        cached.getClass();
        network.getClass();
        Entry entry = new Entry(network);
        ResponseBody body = cached.body();
        body.getClass();
        try {
            editor = ((CacheResponseBody) body).getSnapshot().edit();
            if (editor == null) {
                return;
            }
            try {
                entry.writeTo(editor);
                editor.commit();
            } catch (IOException unused) {
                abortQuietly(editor);
            }
        } catch (IOException unused2) {
            editor = null;
        }
    }

    public final Iterator<String> urls() {
        return new Cache$urls$1(this);
    }

    public final synchronized int writeAbortCount() {
        return this.writeAbortCount;
    }

    public final synchronized int writeSuccessCount() {
        return this.writeSuccessCount;
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010\u001f\u001a\u00020\u001c*\u00020\u0017¢\u0006\u0004\b\u001f\u0010 J\u0011\u0010\u000b\u001a\u00020\u0004*\u00020\u0017¢\u0006\u0004\b\u000b\u0010!R\u0014\u0010\"\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010%\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010#R\u0014\u0010&\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010#¨\u0006'"}, d2 = {"Lokhttp3/Cache$Companion;", "", "<init>", "()V", "Lokhttp3/Headers;", "", "", "varyFields", "(Lokhttp3/Headers;)Ljava/util/Set;", "requestHeaders", "responseHeaders", "varyHeaders", "(Lokhttp3/Headers;Lokhttp3/Headers;)Lokhttp3/Headers;", "Lokhttp3/HttpUrl;", "url", "key", "(Lokhttp3/HttpUrl;)Ljava/lang/String;", "Ll9/n;", "source", "", "readInt$okhttp", "(Ll9/n;)I", "readInt", "Lokhttp3/Response;", "cachedResponse", "cachedRequest", "Lokhttp3/Request;", "newRequest", "", "varyMatches", "(Lokhttp3/Response;Lokhttp3/Headers;Lokhttp3/Request;)Z", "hasVaryAll", "(Lokhttp3/Response;)Z", "(Lokhttp3/Response;)Lokhttp3/Headers;", "ENTRY_BODY", "I", "ENTRY_COUNT", "ENTRY_METADATA", "VERSION", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cache.kt\nokhttp3/Cache$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,788:1\n2624#2,3:789\n*S KotlinDebug\n*F\n+ 1 Cache.kt\nokhttp3/Cache$Companion\n*L\n729#1:789,3\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Set<String> varyFields(Headers headers) {
            boolean equals;
            List split$default;
            CharSequence trim;
            int size = headers.size();
            TreeSet treeSet = null;
            for (int i10 = 0; i10 < size; i10++) {
                equals = StringsKt__StringsJVMKt.equals("Vary", headers.name(i10), true);
                if (equals) {
                    String value = headers.value(i10);
                    if (treeSet == null) {
                        treeSet = new TreeSet(StringsKt.getCASE_INSENSITIVE_ORDER(StringCompanionObject.INSTANCE));
                    }
                    split$default = StringsKt__StringsKt.split$default((CharSequence) value, new char[]{','}, false, 0, 6, (Object) null);
                    Iterator it = split$default.iterator();
                    while (it.hasNext()) {
                        trim = StringsKt__StringsKt.trim((CharSequence) ((String) it.next()));
                        treeSet.add(trim.toString());
                    }
                }
            }
            if (treeSet == null) {
                return SetsKt.emptySet();
            }
            return treeSet;
        }

        private final Headers varyHeaders(Headers requestHeaders, Headers responseHeaders) {
            Set<String> varyFields = varyFields(responseHeaders);
            if (varyFields.isEmpty()) {
                return Util.EMPTY_HEADERS;
            }
            Headers.Builder builder = new Headers.Builder();
            int size = requestHeaders.size();
            for (int i10 = 0; i10 < size; i10++) {
                String name = requestHeaders.name(i10);
                if (varyFields.contains(name)) {
                    builder.add(name, requestHeaders.value(i10));
                }
            }
            return builder.build();
        }

        public final boolean hasVaryAll(Response response) {
            response.getClass();
            return varyFields(response.headers()).contains("*");
        }

        @JvmStatic
        public final String key(HttpUrl url) {
            url.getClass();
            o oVar = o.e;
            return c.k(url.getUrl()).b("MD5").d();
        }

        public final int readInt$okhttp(n source) {
            source.getClass();
            try {
                long o5 = source.o();
                String L = source.L();
                if (o5 >= 0 && o5 <= 2147483647L && L.length() <= 0) {
                    return (int) o5;
                }
                throw new IOException("expected an int but was \"" + o5 + L + Typography.quote);
            } catch (NumberFormatException e) {
                b.A(e.getMessage());
                return 0;
            }
        }

        public final boolean varyMatches(Response cachedResponse, Headers cachedRequest, Request newRequest) {
            cachedResponse.getClass();
            cachedRequest.getClass();
            newRequest.getClass();
            Set<String> varyFields = varyFields(cachedResponse.headers());
            if (varyFields != null && varyFields.isEmpty()) {
                return true;
            }
            for (String str : varyFields) {
                if (!Intrinsics.areEqual(cachedRequest.values(str), newRequest.headers(str))) {
                    return false;
                }
            }
            return true;
        }

        private Companion() {
        }

        public final Headers varyHeaders(Response response) {
            response.getClass();
            Response networkResponse = response.networkResponse();
            networkResponse.getClass();
            return varyHeaders(networkResponse.request().headers(), response.headers());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Cache(File file, long j10) {
        this(file, j10, FileSystem.SYSTEM);
        file.getClass();
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0002\u0018\u0000 <2\u00020\u0001:\u0001<B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0018\u001a\u00020\u00122\n\u0010\u0017\u001a\u00060\u0015R\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u0007\u001a\u00020\u00062\n\u0010 \u001a\u00060\u001fR\u00020\u0016¢\u0006\u0004\b\u0007\u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010*R\u0014\u00102\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010'R\u0016\u00104\u001a\u0004\u0018\u0001038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108R\u0014\u0010:\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Lokhttp3/Cache$Entry;", "", "Ll9/g0;", "rawSource", "<init>", "(Ll9/g0;)V", "Lokhttp3/Response;", "response", "(Lokhttp3/Response;)V", "Ll9/n;", "source", "", "Ljava/security/cert/Certificate;", "readCertificateList", "(Ll9/n;)Ljava/util/List;", "Ll9/m;", "sink", "certificates", "", "writeCertList", "(Ll9/m;Ljava/util/List;)V", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "editor", "writeTo", "(Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "Lokhttp3/Request;", "request", "", "matches", "(Lokhttp3/Request;Lokhttp3/Response;)Z", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "snapshot", "(Lokhttp3/internal/cache/DiskLruCache$Snapshot;)Lokhttp3/Response;", "Lokhttp3/HttpUrl;", "url", "Lokhttp3/HttpUrl;", "Lokhttp3/Headers;", "varyHeaders", "Lokhttp3/Headers;", "", "requestMethod", "Ljava/lang/String;", "Lokhttp3/Protocol;", "protocol", "Lokhttp3/Protocol;", "", "code", "I", "message", "responseHeaders", "Lokhttp3/Handshake;", "handshake", "Lokhttp3/Handshake;", "", "sentRequestMillis", "J", "receivedResponseMillis", "isHttps", "()Z", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes2.dex */
    public static final class Entry {
        private static final String RECEIVED_MILLIS;
        private static final String SENT_MILLIS;
        private final int code;
        private final Handshake handshake;
        private final String message;
        private final Protocol protocol;
        private final long receivedResponseMillis;
        private final String requestMethod;
        private final Headers responseHeaders;
        private final long sentRequestMillis;
        private final HttpUrl url;
        private final Headers varyHeaders;

        static {
            StringBuilder sb = new StringBuilder();
            Platform.Companion companion = Platform.INSTANCE;
            sb.append(companion.get().getPrefix());
            sb.append("-Sent-Millis");
            SENT_MILLIS = sb.toString();
            RECEIVED_MILLIS = companion.get().getPrefix() + "-Received-Millis";
        }

        public Entry(g0 g0Var) {
            long j10;
            TlsVersion tlsVersion;
            g0Var.getClass();
            try {
                a0 a0Var = new a0(g0Var);
                String p9 = a0Var.p(Long.MAX_VALUE);
                HttpUrl parse = HttpUrl.INSTANCE.parse(p9);
                if (parse != null) {
                    this.url = parse;
                    this.requestMethod = a0Var.p(Long.MAX_VALUE);
                    Headers.Builder builder = new Headers.Builder();
                    int readInt$okhttp = Cache.INSTANCE.readInt$okhttp(a0Var);
                    for (int i10 = 0; i10 < readInt$okhttp; i10++) {
                        builder.addLenient$okhttp(a0Var.p(Long.MAX_VALUE));
                    }
                    this.varyHeaders = builder.build();
                    StatusLine parse2 = StatusLine.INSTANCE.parse(a0Var.p(Long.MAX_VALUE));
                    this.protocol = parse2.protocol;
                    this.code = parse2.code;
                    this.message = parse2.message;
                    Headers.Builder builder2 = new Headers.Builder();
                    int readInt$okhttp2 = Cache.INSTANCE.readInt$okhttp(a0Var);
                    for (int i11 = 0; i11 < readInt$okhttp2; i11++) {
                        builder2.addLenient$okhttp(a0Var.p(Long.MAX_VALUE));
                    }
                    String str = SENT_MILLIS;
                    String str2 = builder2.get(str);
                    String str3 = RECEIVED_MILLIS;
                    String str4 = builder2.get(str3);
                    builder2.removeAll(str);
                    builder2.removeAll(str3);
                    if (str2 != null) {
                        j10 = Long.parseLong(str2);
                    } else {
                        j10 = 0;
                    }
                    this.sentRequestMillis = j10;
                    this.receivedResponseMillis = str4 != null ? Long.parseLong(str4) : 0L;
                    this.responseHeaders = builder2.build();
                    if (isHttps()) {
                        String p10 = a0Var.p(Long.MAX_VALUE);
                        if (p10.length() <= 0) {
                            CipherSuite forJavaName = CipherSuite.INSTANCE.forJavaName(a0Var.p(Long.MAX_VALUE));
                            List<Certificate> readCertificateList = readCertificateList(a0Var);
                            List<Certificate> readCertificateList2 = readCertificateList(a0Var);
                            if (!a0Var.k()) {
                                tlsVersion = TlsVersion.INSTANCE.forJavaName(a0Var.p(Long.MAX_VALUE));
                            } else {
                                tlsVersion = TlsVersion.SSL_3_0;
                            }
                            this.handshake = Handshake.INSTANCE.get(tlsVersion, forJavaName, readCertificateList, readCertificateList2);
                        } else {
                            throw new IOException("expected \"\" but was \"" + p10 + Typography.quote);
                        }
                    } else {
                        this.handshake = null;
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(g0Var, null);
                    return;
                }
                IOException iOException = new IOException("Cache corruption for ".concat(p9));
                Platform.INSTANCE.get().log("cache corruption", 5, iOException);
                throw iOException;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(g0Var, th);
                    throw th2;
                }
            }
        }

        private final boolean isHttps() {
            return Intrinsics.areEqual(this.url.scheme(), "https");
        }

        /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, l9.l, l9.n] */
        private final List<Certificate> readCertificateList(n source) {
            int readInt$okhttp = Cache.INSTANCE.readInt$okhttp(source);
            if (readInt$okhttp == -1) {
                return CollectionsKt.emptyList();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(readInt$okhttp);
                for (int i10 = 0; i10 < readInt$okhttp; i10++) {
                    String L = source.L();
                    ?? obj = new Object();
                    o oVar = o.e;
                    o i11 = c.i(L);
                    if (i11 != null) {
                        obj.l0(i11);
                        arrayList.add(certificateFactory.generateCertificate(new k(obj, 0)));
                    } else {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                }
                return arrayList;
            } catch (CertificateException e) {
                b.A(e.getMessage());
                return null;
            }
        }

        private final void writeCertList(m sink, List<? extends Certificate> certificates) {
            try {
                sink.Z(certificates.size()).writeByte(10);
                Iterator<? extends Certificate> it = certificates.iterator();
                while (it.hasNext()) {
                    byte[] encoded = it.next().getEncoded();
                    o oVar = o.e;
                    encoded.getClass();
                    sink.A(c.l(encoded).a()).writeByte(10);
                }
            } catch (CertificateEncodingException e) {
                b.A(e.getMessage());
            }
        }

        public final boolean matches(Request request, Response response) {
            request.getClass();
            response.getClass();
            if (Intrinsics.areEqual(this.url, request.url()) && Intrinsics.areEqual(this.requestMethod, request.method()) && Cache.INSTANCE.varyMatches(response, this.varyHeaders, request)) {
                return true;
            }
            return false;
        }

        public final Response response(DiskLruCache.Snapshot snapshot) {
            snapshot.getClass();
            String str = this.responseHeaders.get("Content-Type");
            String str2 = this.responseHeaders.get("Content-Length");
            return new Response.Builder().request(new Request.Builder().url(this.url).method(this.requestMethod, null).headers(this.varyHeaders).build()).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new CacheResponseBody(snapshot, str, str2)).handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis).build();
        }

        public final void writeTo(DiskLruCache.Editor editor) {
            editor.getClass();
            z a10 = l9.b.a(editor.newSink(0));
            try {
                a10.A(this.url.getUrl());
                a10.writeByte(10);
                a10.A(this.requestMethod);
                a10.writeByte(10);
                a10.Z(this.varyHeaders.size());
                a10.writeByte(10);
                int size = this.varyHeaders.size();
                for (int i10 = 0; i10 < size; i10++) {
                    a10.A(this.varyHeaders.name(i10));
                    a10.A(": ");
                    a10.A(this.varyHeaders.value(i10));
                    a10.writeByte(10);
                }
                a10.A(new StatusLine(this.protocol, this.code, this.message).toString());
                a10.writeByte(10);
                a10.Z(this.responseHeaders.size() + 2);
                a10.writeByte(10);
                int size2 = this.responseHeaders.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    a10.A(this.responseHeaders.name(i11));
                    a10.A(": ");
                    a10.A(this.responseHeaders.value(i11));
                    a10.writeByte(10);
                }
                a10.A(SENT_MILLIS);
                a10.A(": ");
                a10.Z(this.sentRequestMillis);
                a10.writeByte(10);
                a10.A(RECEIVED_MILLIS);
                a10.A(": ");
                a10.Z(this.receivedResponseMillis);
                a10.writeByte(10);
                if (isHttps()) {
                    a10.writeByte(10);
                    Handshake handshake = this.handshake;
                    handshake.getClass();
                    a10.A(handshake.cipherSuite().javaName());
                    a10.writeByte(10);
                    writeCertList(a10, this.handshake.peerCertificates());
                    writeCertList(a10, this.handshake.localCertificates());
                    a10.A(this.handshake.tlsVersion().javaName());
                    a10.writeByte(10);
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(a10, null);
            } finally {
            }
        }

        public Entry(Response response) {
            response.getClass();
            this.url = response.request().url();
            this.varyHeaders = Cache.INSTANCE.varyHeaders(response);
            this.requestMethod = response.request().method();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.responseHeaders = response.headers();
            this.handshake = response.handshake();
            this.sentRequestMillis = response.sentRequestAtMillis();
            this.receivedResponseMillis = response.receivedResponseAtMillis();
        }
    }
}
