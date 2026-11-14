package j;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f0 implements h.e {

    /* renamed from: j, reason: collision with root package name */
    public static final c0.l f2991j = new c0.l(50);

    /* renamed from: b, reason: collision with root package name */
    public final k.g f2992b;
    public final h.e c;
    public final h.e d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2993f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f2994g;

    /* renamed from: h, reason: collision with root package name */
    public final h.h f2995h;

    /* renamed from: i, reason: collision with root package name */
    public final h.l f2996i;

    public f0(k.g gVar, h.e eVar, h.e eVar2, int i10, int i11, h.l lVar, Class cls, h.h hVar) {
        this.f2992b = gVar;
        this.c = eVar;
        this.d = eVar2;
        this.e = i10;
        this.f2993f = i11;
        this.f2996i = lVar;
        this.f2994g = cls;
        this.f2995h = hVar;
    }

    @Override // h.e
    public final void b(MessageDigest messageDigest) {
        Object e;
        k.g gVar = this.f2992b;
        synchronized (gVar) {
            k.f fVar = gVar.f3360b;
            k.i iVar = (k.i) ((ArrayDeque) fVar.f3353b).poll();
            if (iVar == null) {
                iVar = fVar.e();
            }
            k.e eVar = (k.e) iVar;
            eVar.f3358b = 8;
            eVar.c = byte[].class;
            e = gVar.e(eVar, byte[].class);
        }
        byte[] bArr = (byte[]) e;
        ByteBuffer.wrap(bArr).putInt(this.e).putInt(this.f2993f).array();
        this.d.b(messageDigest);
        this.c.b(messageDigest);
        messageDigest.update(bArr);
        h.l lVar = this.f2996i;
        if (lVar != null) {
            lVar.b(messageDigest);
        }
        this.f2995h.b(messageDigest);
        c0.l lVar2 = f2991j;
        Class cls = this.f2994g;
        byte[] bArr2 = (byte[]) lVar2.a(cls);
        if (bArr2 == null) {
            bArr2 = cls.getName().getBytes(h.e.f2522a);
            lVar2.d(cls, bArr2);
        }
        messageDigest.update(bArr2);
        this.f2992b.g(bArr);
    }

    @Override // h.e
    public final boolean equals(Object obj) {
        if (obj instanceof f0) {
            f0 f0Var = (f0) obj;
            if (this.f2993f == f0Var.f2993f && this.e == f0Var.e && c0.p.b(this.f2996i, f0Var.f2996i) && this.f2994g.equals(f0Var.f2994g) && this.c.equals(f0Var.c) && this.d.equals(f0Var.d) && this.f2995h.equals(f0Var.f2995h)) {
                return true;
            }
        }
        return false;
    }

    @Override // h.e
    public final int hashCode() {
        int hashCode = ((((this.d.hashCode() + (this.c.hashCode() * 31)) * 31) + this.e) * 31) + this.f2993f;
        h.l lVar = this.f2996i;
        if (lVar != null) {
            hashCode = (hashCode * 31) + lVar.hashCode();
        }
        return this.f2995h.f2525b.hashCode() + ((this.f2994g.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.c + ", signature=" + this.d + ", width=" + this.e + ", height=" + this.f2993f + ", decodedResourceClass=" + this.f2994g + ", transformation='" + this.f2996i + "', options=" + this.f2995h + '}';
    }
}
