package n;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class l implements com.bumptech.glide.load.data.e {
    public static final String[] e = {"_data"};

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4025b;
    public final Object c;
    public Object d;

    public /* synthetic */ l(int i10, Object obj, Object obj2) {
        this.f4025b = i10;
        this.c = obj;
        this.d = obj2;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        switch (this.f4025b) {
            case 0:
                return File.class;
            case 1:
                return ((c0) this.d).b();
            default:
                return InputStream.class;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        switch (this.f4025b) {
            case 0:
            case 1:
                return;
            default:
                try {
                    ((ByteArrayInputStream) this.d).close();
                    return;
                } catch (IOException unused) {
                    return;
                }
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final int c() {
        switch (this.f4025b) {
            case 0:
                return 1;
            case 1:
                return 1;
            default:
                return 1;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        int i10 = this.f4025b;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.h hVar, com.bumptech.glide.load.data.d dVar) {
        Object wrap;
        switch (this.f4025b) {
            case 0:
                Cursor query = ((Context) this.c).getContentResolver().query((Uri) this.d, e, null, null, null);
                String str = null;
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            str = query.getString(query.getColumnIndexOrThrow("_data"));
                        }
                        query.close();
                    } catch (Throwable th) {
                        query.close();
                        throw th;
                    }
                }
                if (TextUtils.isEmpty(str)) {
                    dVar.d(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.d)));
                    return;
                }
                dVar.f(new File(str));
                return;
            case 1:
                c0 c0Var = (c0) this.d;
                byte[] bArr = (byte[]) this.c;
                switch (c0Var.f4006b) {
                    case 1:
                        wrap = ByteBuffer.wrap(bArr);
                        break;
                    default:
                        wrap = new ByteArrayInputStream(bArr);
                        break;
                }
                dVar.f(wrap);
                return;
            default:
                try {
                    ByteArrayInputStream a10 = c0.a((String) this.c);
                    this.d = a10;
                    dVar.f(a10);
                    return;
                } catch (IllegalArgumentException e6) {
                    dVar.d(e6);
                    return;
                }
        }
    }

    public l(String str, c0 c0Var) {
        this.f4025b = 2;
        this.c = str;
    }

    private final void d() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }

    private final void i() {
    }
}
