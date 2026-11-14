package z3;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public float f6821a;

    /* renamed from: b, reason: collision with root package name */
    public float f6822b;
    public float c;
    public float d;
    public float e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f6823f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f6824g = new ArrayList();

    public y() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f8) {
        float f10 = this.d;
        if (f10 != f8) {
            float f11 = ((f8 - f10) + 360.0f) % 360.0f;
            if (f11 > 180.0f) {
                return;
            }
            float f12 = this.f6822b;
            float f13 = this.c;
            u uVar = new u(f12, f13, f12, f13);
            uVar.f6815f = this.d;
            uVar.f6816g = f11;
            this.f6824g.add(new s(uVar));
            this.d = f8;
        }
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f6823f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((w) arrayList.get(i10)).a(matrix, path);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z3.v, z3.w, java.lang.Object] */
    public final void c(float f8, float f10) {
        ?? wVar = new w();
        wVar.f6817b = f8;
        wVar.c = f10;
        this.f6823f.add(wVar);
        t tVar = new t(wVar, this.f6822b, this.c);
        float b10 = tVar.b() + 270.0f;
        float b11 = tVar.b() + 270.0f;
        a(b10);
        this.f6824g.add(tVar);
        this.d = b11;
        this.f6822b = f8;
        this.c = f10;
    }

    public final void d(float f8, float f10, float f11) {
        this.f6821a = f8;
        this.f6822b = 0.0f;
        this.c = f8;
        this.d = f10;
        this.e = (f10 + f11) % 360.0f;
        this.f6823f.clear();
        this.f6824g.clear();
    }
}
