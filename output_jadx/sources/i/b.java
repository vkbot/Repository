package i;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.e;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import n.c0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b implements e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2743b;
    public final Comparable c;
    public final Object d;
    public Object e;

    public /* synthetic */ b(int i10, Comparable comparable, Object obj) {
        this.f2743b = i10;
        this.c = comparable;
        this.d = obj;
    }

    public static b d(Context context, Uri uri, a aVar) {
        return new b(0, uri, new c(com.bumptech.glide.b.a(context).d.a().e(), aVar, com.bumptech.glide.b.a(context).e, context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        switch (this.f2743b) {
            case 0:
                return InputStream.class;
            default:
                return ((c0) this.d).b();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        switch (this.f2743b) {
            case 0:
                InputStream inputStream = (InputStream) this.e;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
                return;
            default:
                Object obj = this.e;
                if (obj != null) {
                    try {
                        switch (((c0) this.d).f4006b) {
                            case 8:
                                ((ParcelFileDescriptor) obj).close();
                                break;
                            default:
                                ((InputStream) obj).close();
                                break;
                        }
                        return;
                    } catch (IOException unused2) {
                        return;
                    }
                }
                return;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final int c() {
        switch (this.f2743b) {
            case 0:
                return 1;
            default:
                return 1;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        int i10 = this.f2743b;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(h hVar, d dVar) {
        Object open;
        switch (this.f2743b) {
            case 0:
                try {
                    InputStream h2 = h();
                    this.e = h2;
                    dVar.f(h2);
                    return;
                } catch (FileNotFoundException e) {
                    if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                        Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e);
                    }
                    dVar.d(e);
                    return;
                }
            default:
                try {
                    c0 c0Var = (c0) this.d;
                    File file = (File) this.c;
                    switch (c0Var.f4006b) {
                        case 8:
                            open = ParcelFileDescriptor.open(file, 268435456);
                            break;
                        default:
                            open = new FileInputStream(file);
                            break;
                    }
                    this.e = open;
                    dVar.f(open);
                    return;
                } catch (FileNotFoundException e6) {
                    if (Log.isLoggable("FileLoader", 3)) {
                        Log.d("FileLoader", "Failed to open file", e6);
                    }
                    dVar.d(e6);
                    return;
                }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x002d, code lost:
    
        if (r7 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x004e, code lost:
    
        if (r7 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002f, code lost:
    
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0028: MOVE (r6 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]) (LINE:41), block:B:68:0x0028 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e3  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Throwable, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.InputStream h() {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b.h():java.io.InputStream");
    }

    private final void f() {
    }

    private final void g() {
    }
}
