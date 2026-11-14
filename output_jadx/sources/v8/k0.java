package v8;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class k0 implements u0 {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6038b;

    public k0(boolean z9) {
        this.f6038b = z9;
    }

    @Override // v8.u0
    public final boolean b() {
        return this.f6038b;
    }

    @Override // v8.u0
    public final j1 c() {
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Empty{");
        if (this.f6038b) {
            str = "Active";
        } else {
            str = "New";
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
