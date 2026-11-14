package n;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d implements com.bumptech.glide.load.data.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4007b;
    public final Object c;

    public /* synthetic */ d(int i10, Object obj) {
        this.f4007b = i10;
        this.c = obj;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        switch (this.f4007b) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.c.getClass();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        int i10 = this.f4007b;
    }

    @Override // com.bumptech.glide.load.data.e
    public final int c() {
        switch (this.f4007b) {
            case 0:
                return 1;
            default:
                return 1;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        int i10 = this.f4007b;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.h hVar, com.bumptech.glide.load.data.d dVar) {
        switch (this.f4007b) {
            case 0:
                try {
                    dVar.f(c0.b.a((File) this.c));
                    return;
                } catch (IOException e) {
                    if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                        Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                    }
                    dVar.d(e);
                    return;
                }
            default:
                dVar.f(this.c);
                return;
        }
    }

    private final void d() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }
}
