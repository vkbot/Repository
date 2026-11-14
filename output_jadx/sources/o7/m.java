package o7;

import java.text.MessageFormat;
import java.util.logging.Level;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class m extends n7.e {

    /* renamed from: b, reason: collision with root package name */
    public final o f4613b;
    public final u2 c;

    public m(o oVar, u2 u2Var) {
        this.f4613b = oVar;
        o4.b.i(u2Var, "time");
        this.c = u2Var;
    }

    public static Level F(int i10) {
        int c = com.bumptech.glide.g.c(i10);
        if (c != 1) {
            if (c != 2 && c != 3) {
                return Level.FINEST;
            }
            return Level.FINE;
        }
        return Level.FINER;
    }

    public final boolean E(int i10) {
        if (i10 != 1) {
            synchronized (this.f4613b.f4627a) {
            }
            return false;
        }
        return false;
    }

    @Override // n7.e
    public final void m(int i10, String str) {
        n7.v vVar;
        o oVar = this.f4613b;
        n7.a0 a0Var = oVar.f4628b;
        Level F = F(i10);
        if (o.c.isLoggable(F)) {
            o.a(a0Var, F, str);
        }
        if (E(i10) && i10 != 1) {
            int c = com.bumptech.glide.g.c(i10);
            if (c != 2) {
                if (c != 3) {
                    vVar = n7.v.f4247b;
                } else {
                    vVar = n7.v.d;
                }
            } else {
                vVar = n7.v.c;
            }
            n7.v vVar2 = vVar;
            long q8 = this.c.q();
            o4.b.i(str, "description");
            new n7.w(str, vVar2, q8, null);
            synchronized (oVar.f4627a) {
            }
        }
    }

    @Override // n7.e
    public final void n(int i10, String str, Object... objArr) {
        String format;
        Level F = F(i10);
        if (!E(i10) && !o.c.isLoggable(F)) {
            format = null;
        } else {
            format = MessageFormat.format(str, objArr);
        }
        m(i10, format);
    }
}
