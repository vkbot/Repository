package f6;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2358a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f2359b;

    static {
        boolean z9;
        String name = Charset.defaultCharset().name();
        f2358a = name;
        if (!"SJIS".equalsIgnoreCase(name) && !"EUC_JP".equalsIgnoreCase(name)) {
            z9 = false;
        } else {
            z9 = true;
        }
        f2359b = z9;
    }
}
