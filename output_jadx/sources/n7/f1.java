package n7;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f1 {
    public static final List d;
    public static final f1 e;

    /* renamed from: f, reason: collision with root package name */
    public static final f1 f4194f;

    /* renamed from: g, reason: collision with root package name */
    public static final f1 f4195g;

    /* renamed from: h, reason: collision with root package name */
    public static final f1 f4196h;

    /* renamed from: i, reason: collision with root package name */
    public static final f1 f4197i;

    /* renamed from: j, reason: collision with root package name */
    public static final f1 f4198j;

    /* renamed from: k, reason: collision with root package name */
    public static final f1 f4199k;

    /* renamed from: l, reason: collision with root package name */
    public static final f1 f4200l;

    /* renamed from: m, reason: collision with root package name */
    public static final f1 f4201m;

    /* renamed from: n, reason: collision with root package name */
    public static final t0 f4202n;

    /* renamed from: o, reason: collision with root package name */
    public static final t0 f4203o;

    /* renamed from: a, reason: collision with root package name */
    public final e1 f4204a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4205b;
    public final Throwable c;

    static {
        TreeMap treeMap = new TreeMap();
        for (e1 e1Var : e1.values()) {
            f1 f1Var = (f1) treeMap.put(Integer.valueOf(e1Var.f4189b), new f1(e1Var, null, null));
            if (f1Var != null) {
                n0.b.t("Code value duplication between ", f1Var.f4204a.name(), " & ", e1Var.name());
                return;
            }
        }
        d = Collections.unmodifiableList(new ArrayList(treeMap.values()));
        e = e1.OK.a();
        f4194f = e1.CANCELLED.a();
        f4195g = e1.UNKNOWN.a();
        e1.INVALID_ARGUMENT.a();
        f4196h = e1.DEADLINE_EXCEEDED.a();
        e1.NOT_FOUND.a();
        e1.ALREADY_EXISTS.a();
        f4197i = e1.PERMISSION_DENIED.a();
        e1.UNAUTHENTICATED.a();
        f4198j = e1.RESOURCE_EXHAUSTED.a();
        f4199k = e1.FAILED_PRECONDITION.a();
        e1.ABORTED.a();
        e1.OUT_OF_RANGE.a();
        e1.UNIMPLEMENTED.a();
        f4200l = e1.INTERNAL.a();
        f4201m = e1.UNAVAILABLE.a();
        e1.DATA_LOSS.a();
        f4202n = new t0("grpc-status", false, new h(10));
        f4203o = new t0("grpc-message", false, new h(1));
    }

    public f1(e1 e1Var, String str, Throwable th) {
        o4.b.i(e1Var, "code");
        this.f4204a = e1Var;
        this.f4205b = str;
        this.c = th;
    }

    public static String c(f1 f1Var) {
        String str = f1Var.f4205b;
        e1 e1Var = f1Var.f4204a;
        if (str == null) {
            return e1Var.toString();
        }
        return e1Var + ": " + f1Var.f4205b;
    }

    public static f1 d(int i10) {
        if (i10 >= 0) {
            List list = d;
            if (i10 < list.size()) {
                return (f1) list.get(i10);
            }
        }
        return f4195g.h("Unknown code " + i10);
    }

    public static f1 e(Throwable th) {
        o4.b.i(th, "t");
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof g1) {
                return ((g1) th2).f4208b;
            }
            if (th2 instanceof h1) {
                return ((h1) th2).f4210b;
            }
        }
        return f4195g.g(th);
    }

    public final h1 a() {
        return new h1(this, null);
    }

    public final f1 b(String str) {
        Throwable th = this.c;
        String str2 = this.f4205b;
        e1 e1Var = this.f4204a;
        if (str2 == null) {
            return new f1(e1Var, str, th);
        }
        return new f1(e1Var, ai.onnxruntime.a.D(str2, "\n", str), th);
    }

    public final boolean f() {
        if (e1.OK == this.f4204a) {
            return true;
        }
        return false;
    }

    public final f1 g(Throwable th) {
        if (com.bumptech.glide.d.f(this.c, th)) {
            return this;
        }
        return new f1(this.f4204a, this.f4205b, th);
    }

    public final f1 h(String str) {
        if (com.bumptech.glide.d.f(this.f4205b, str)) {
            return this;
        }
        return new f1(this.f4204a, str, this.c);
    }

    public final String toString() {
        com.bumptech.glide.manager.s t = com.bumptech.glide.c.t(this);
        t.c(this.f4204a.name(), "code");
        t.c(this.f4205b, "description");
        Throwable th = this.c;
        Object obj = th;
        if (th != null) {
            Object obj2 = i4.g.f2776a;
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            obj = stringWriter.toString();
        }
        t.c(obj, "cause");
        return t.toString();
    }
}
