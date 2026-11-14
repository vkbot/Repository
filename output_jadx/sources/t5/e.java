package t5;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e extends b {

    /* renamed from: b, reason: collision with root package name */
    public final u5.e f5823b = new u5.e();

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof e) || !((e) obj).f5823b.equals(this.f5823b)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void h(String str, b bVar) {
        if (bVar == null) {
            bVar = d.f5822b;
        }
        this.f5823b.put(str, bVar);
    }

    public final int hashCode() {
        return this.f5823b.hashCode();
    }

    public final void i(String str, Boolean bool) {
        b fVar;
        if (bool == null) {
            fVar = d.f5822b;
        } else {
            fVar = new f(bool);
        }
        h(str, fVar);
    }

    public final void j(String str, Number number) {
        b fVar;
        if (number == null) {
            fVar = d.f5822b;
        } else {
            fVar = new f(number);
        }
        h(str, fVar);
    }

    public final void k(String str, String str2) {
        h(str, new f(str2));
    }

    public final b l(String str) {
        return (b) this.f5823b.get(str);
    }
}
