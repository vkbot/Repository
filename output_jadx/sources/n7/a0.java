package n7;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a0 {
    public static final AtomicLong d = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    public final String f4155a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4156b;
    public final long c;

    public a0(long j10, String str, String str2) {
        o4.b.d("empty type", !str.isEmpty());
        this.f4155a = str;
        this.f4156b = str2;
        this.c = j10;
    }

    public static a0 a(Class cls, String str) {
        String simpleName = cls.getSimpleName();
        if (simpleName.isEmpty()) {
            simpleName = cls.getName().substring(cls.getPackage().getName().length() + 1);
        }
        return new a0(d.incrementAndGet(), simpleName, str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4155a + "<" + this.c + ">");
        String str = this.f4156b;
        if (str != null) {
            sb.append(": (");
            sb.append(str);
            sb.append(')');
        }
        return sb.toString();
    }
}
