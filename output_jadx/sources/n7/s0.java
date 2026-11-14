package n7;

import java.util.BitSet;
import java.util.Locale;
import java.util.logging.Level;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class s0 {
    public static final BitSet d;

    /* renamed from: a, reason: collision with root package name */
    public final String f4241a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f4242b;
    public final Object c;

    static {
        BitSet bitSet = new BitSet(127);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        for (char c = '0'; c <= '9'; c = (char) (c + 1)) {
            bitSet.set(c);
        }
        for (char c10 = 'a'; c10 <= 'z'; c10 = (char) (c10 + 1)) {
            bitSet.set(c10);
        }
        d = bitSet;
    }

    public s0(String str, boolean z9, Object obj) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        o4.b.i(lowerCase, "name");
        o4.b.d("token must have at least 1 tchar", !lowerCase.isEmpty());
        if (lowerCase.equals("connection")) {
            v0.c.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
        }
        for (int i10 = 0; i10 < lowerCase.length(); i10++) {
            char charAt = lowerCase.charAt(i10);
            if ((!z9 || charAt != ':' || i10 != 0) && !d.get(charAt)) {
                j1.i.k(e3.d.l("Invalid character '%s' in key name '%s'", Character.valueOf(charAt), lowerCase));
                throw null;
            }
        }
        this.f4241a = lowerCase;
        this.f4242b = lowerCase.getBytes(i4.b.f2770a);
        this.c = obj;
    }

    public abstract Object a(byte[] bArr);

    public abstract byte[] b(Object obj);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f4241a.equals(((s0) obj).f4241a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4241a.hashCode();
    }

    public final String toString() {
        return ai.onnxruntime.a.p(new StringBuilder("Key{name='"), this.f4241a, "'}");
    }
}
