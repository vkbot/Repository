package a5;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class i implements x4.g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f49a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f50b = false;
    public x4.c c;
    public final f d;

    public i(f fVar) {
        this.d = fVar;
    }

    @Override // x4.g
    public final x4.g b(String str) {
        if (!this.f49a) {
            this.f49a = true;
            this.d.e(this.c, str, this.f50b);
            return this;
        }
        throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
    }

    @Override // x4.g
    public final x4.g c(boolean z9) {
        if (!this.f49a) {
            this.f49a = true;
            this.d.b(this.c, z9 ? 1 : 0, this.f50b);
            return this;
        }
        throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
    }
}
