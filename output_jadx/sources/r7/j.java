package r7;

import java.io.IOException;
import java.util.Locale;
import java.util.logging.Logger;
import kotlin.UByte;
import l9.a0;
import l9.o;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f5437a = Logger.getLogger(g.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final o f5438b;

    static {
        o oVar = o.e;
        f5438b = w7.c.k("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    }

    public static int a(a0 a0Var) {
        return (a0Var.readByte() & UByte.MAX_VALUE) | ((a0Var.readByte() & UByte.MAX_VALUE) << 16) | ((a0Var.readByte() & UByte.MAX_VALUE) << 8);
    }

    public static int b(int i10, byte b10, short s5) {
        if ((b10 & 8) != 0) {
            i10--;
        }
        if (s5 <= i10) {
            return (short) (i10 - s5);
        }
        c("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s5), Integer.valueOf(i10));
        throw null;
    }

    public static void c(String str, Object... objArr) {
        throw new IOException(String.format(Locale.US, str, objArr));
    }
}
