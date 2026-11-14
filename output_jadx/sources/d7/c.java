package d7;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f1854a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1855b;
    public final long c;

    public c(long j10, long j11, long j12) {
        this.f1854a = j10;
        this.f1855b = j11;
        this.c = j12;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f1854a == cVar.f1854a && this.f1855b == cVar.f1855b && this.c == cVar.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((Long.hashCode(this.f1855b) + (Long.hashCode(this.f1854a) * 31)) * 31);
    }

    public final String toString() {
        String[] split;
        Object[] objArr = {Long.valueOf(this.f1854a), Long.valueOf(this.f1855b), Long.valueOf(this.c)};
        if ("a;b;c".length() == 0) {
            split = new String[0];
        } else {
            split = "a;b;c".split(";");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c.class.getSimpleName());
        sb.append("[");
        for (int i10 = 0; i10 < split.length; i10++) {
            sb.append(split[i10]);
            sb.append("=");
            sb.append(objArr[i10]);
            if (i10 != split.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
