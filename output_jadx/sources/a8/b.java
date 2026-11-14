package a8;

import java.io.PrintStream;
import java.io.PrintWriter;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b extends com.bumptech.glide.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f55b;
    public final Object c;

    public /* synthetic */ b(int i10, Object obj) {
        this.f55b = i10;
        this.c = obj;
    }

    @Override // com.bumptech.glide.c
    public final void p(String str) {
        switch (this.f55b) {
            case 0:
                ((PrintStream) this.c).println((Object) str);
                return;
            default:
                ((PrintWriter) this.c).println((Object) str);
                return;
        }
    }
}
