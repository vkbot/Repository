package e2;

import android.content.Context;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2100a;

    /* renamed from: b, reason: collision with root package name */
    public final m2.a f2101b;
    public final m2.a c;
    public final String d;

    public b(Context context, m2.a aVar, m2.a aVar2, String str) {
        if (context != null) {
            this.f2100a = context;
            if (aVar != null) {
                this.f2101b = aVar;
                if (aVar2 != null) {
                    this.c = aVar2;
                    if (str != null) {
                        this.d = str;
                        return;
                    } else {
                        n0.b.n("Null backendName");
                        throw null;
                    }
                }
                n0.b.n("Null monotonicClock");
                throw null;
            }
            n0.b.n("Null wallClock");
            throw null;
        }
        n0.b.n("Null applicationContext");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            b bVar = (b) ((c) obj);
            if (this.f2100a.equals(bVar.f2100a) && this.f2101b.equals(bVar.f2101b) && this.c.equals(bVar.c) && this.d.equals(bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f2100a.hashCode() ^ 1000003) * 1000003) ^ this.f2101b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f2100a);
        sb.append(", wallClock=");
        sb.append(this.f2101b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return ai.onnxruntime.a.p(sb, this.d, "}");
    }
}
