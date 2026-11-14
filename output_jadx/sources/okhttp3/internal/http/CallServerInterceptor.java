package okhttp3.internal.http;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import okhttp3.Interceptor;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lokhttp3/internal/http/CallServerInterceptor;", "Lokhttp3/Interceptor;", "forWebSocket", "", "(Z)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "shouldIgnoreAndWaitForRealResponse", "code", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class CallServerInterceptor implements Interceptor {
    private final boolean forWebSocket;

    public CallServerInterceptor(boolean z9) {
        this.forWebSocket = z9;
    }

    private final boolean shouldIgnoreAndWaitForRealResponse(int code) {
        if (code == 100) {
            return true;
        }
        if (102 <= code && code < 200) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0155, code lost:
    
        if (r0 != false) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e4 A[Catch: IOException -> 0x00b7, TryCatch #1 {IOException -> 0x00b7, blocks: (B:65:0x00a9, B:67:0x00b2, B:23:0x00ba, B:25:0x00e4, B:27:0x00ed, B:28:0x00f0, B:29:0x0114, B:33:0x011f, B:34:0x013e, B:36:0x014c, B:44:0x0162, B:46:0x0168, B:49:0x0175, B:51:0x018a, B:52:0x0192, B:53:0x019c, B:62:0x0157, B:63:0x012e), top: B:64:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x014c A[Catch: IOException -> 0x00b7, TryCatch #1 {IOException -> 0x00b7, blocks: (B:65:0x00a9, B:67:0x00b2, B:23:0x00ba, B:25:0x00e4, B:27:0x00ed, B:28:0x00f0, B:29:0x0114, B:33:0x011f, B:34:0x013e, B:36:0x014c, B:44:0x0162, B:46:0x0168, B:49:0x0175, B:51:0x018a, B:52:0x0192, B:53:0x019c, B:62:0x0157, B:63:0x012e), top: B:64:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0168 A[Catch: IOException -> 0x00b7, TryCatch #1 {IOException -> 0x00b7, blocks: (B:65:0x00a9, B:67:0x00b2, B:23:0x00ba, B:25:0x00e4, B:27:0x00ed, B:28:0x00f0, B:29:0x0114, B:33:0x011f, B:34:0x013e, B:36:0x014c, B:44:0x0162, B:46:0x0168, B:49:0x0175, B:51:0x018a, B:52:0x0192, B:53:0x019c, B:62:0x0157, B:63:0x012e), top: B:64:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0175 A[Catch: IOException -> 0x00b7, TryCatch #1 {IOException -> 0x00b7, blocks: (B:65:0x00a9, B:67:0x00b2, B:23:0x00ba, B:25:0x00e4, B:27:0x00ed, B:28:0x00f0, B:29:0x0114, B:33:0x011f, B:34:0x013e, B:36:0x014c, B:44:0x0162, B:46:0x0168, B:49:0x0175, B:51:0x018a, B:52:0x0192, B:53:0x019c, B:62:0x0157, B:63:0x012e), top: B:64:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a6  */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r14) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.CallServerInterceptor.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }
}
