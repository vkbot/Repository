package q7;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public enum l {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");


    /* renamed from: b, reason: collision with root package name */
    public final String f5332b;

    l(String str) {
        this.f5332b = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f5332b;
    }
}
