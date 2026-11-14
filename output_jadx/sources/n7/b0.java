package n7;

import java.nio.charset.Charset;
import java.util.BitSet;
import o7.u2;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f4159a = Charset.forName("US-ASCII");

    /* renamed from: b, reason: collision with root package name */
    public static final k4.c f4160b = v0.e;

    public static t0 a(String str, u2 u2Var) {
        boolean z9 = false;
        if (!str.isEmpty() && str.charAt(0) == ':') {
            z9 = true;
        }
        BitSet bitSet = s0.d;
        return new t0(str, z9, u2Var);
    }
}
