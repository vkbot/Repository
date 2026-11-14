package o7;

import java.text.MessageFormat;
import java.util.logging.Level;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class j1 extends n7.e {

    /* renamed from: b, reason: collision with root package name */
    public n7.a0 f4558b;

    @Override // n7.e
    public final void m(int i10, String str) {
        n7.a0 a0Var = this.f4558b;
        Level F = m.F(i10);
        if (o.c.isLoggable(F)) {
            o.a(a0Var, F, str);
        }
    }

    @Override // n7.e
    public final void n(int i10, String str, Object... objArr) {
        n7.a0 a0Var = this.f4558b;
        Level F = m.F(i10);
        if (o.c.isLoggable(F)) {
            o.a(a0Var, F, MessageFormat.format(str, objArr));
        }
    }
}
