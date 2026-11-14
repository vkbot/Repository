package androidx.navigation;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.example.navistart.cores.ProxyFactory;
import d4.h;
import java.io.IOException;
import t1.n;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements a7.b, z2.b, b8.b, ProxyFactory.ProxyFactoryCreatContext {

    /* renamed from: b */
    public final /* synthetic */ int f235b;

    public static /* synthetic */ void a() {
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ void b(int i10, String str) {
        throw new IllegalArgumentException(str + i10);
    }

    public static /* synthetic */ void d(Object obj, Object obj2, Object obj3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString(), th);
    }

    public static /* synthetic */ void e(Object obj, String str) {
        throw new UnsupportedOperationException(str + obj);
    }

    public static /* synthetic */ void f(Object obj, String str, Object obj2) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void g(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static /* synthetic */ void h(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void i(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IOException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void j(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + obj4 + obj5).toString());
    }

    public static /* synthetic */ void k(String str, Object obj, Object obj2, Object obj3, Throwable th) {
        throw new Error(str + obj + obj2 + obj3, th);
    }

    public static /* synthetic */ void l(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void m(StringBuilder sb, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        sb.append(obj4);
        sb.append(obj5);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void n(Throwable th, Object obj) {
        throw new IllegalArgumentException("Can't create an instance of " + obj + ((Object) ", requires a public no-arg constructor: ") + th, th);
    }

    public static /* synthetic */ void o(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void p(Object obj, String str, Object obj2) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void q(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void r(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void s(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void t(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void u(Object obj, String str, Object obj2) {
        throw new IOException(str + obj + obj2);
    }

    public static /* synthetic */ void v(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void w(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void x(Object obj, String str, Object obj2) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void y(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void z(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + obj4).toString());
    }

    @Override // b8.b
    public void accept(Object obj) {
    }

    @Override // z2.b
    public void c(Object obj) {
        e3.d.n("Starting InAppMessaging runtime with Installation ID " + ((String) obj));
    }

    @Override // com.example.navistart.cores.ProxyFactory.ProxyFactoryCreatContext
    public Object create(Context context) {
        switch (this.f235b) {
            case 28:
                h hVar = new h(context);
                View.inflate(context, com.example.navistart.R.layout.widget_dclock3, hVar);
                hVar.c = (TextView) hVar.findViewById(com.example.navistart.R.id.outTGime);
                hVar.d = (TextView) hVar.findViewById(com.example.navistart.R.id.outData);
                hVar.setWillNotDraw(false);
                return hVar;
            default:
                return new n(context);
        }
    }
}
