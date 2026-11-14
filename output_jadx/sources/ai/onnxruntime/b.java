package ai.onnxruntime;

import androidx.constraintlayout.core.state.Interpolator;
import androidx.constraintlayout.core.state.Transition;
import androidx.fragment.app.Fragment;
import java.io.IOException;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Interpolator {

    /* renamed from: b */
    public final /* synthetic */ int f92b;

    public /* synthetic */ b(int i10) {
        this.f92b = i10;
    }

    public static /* synthetic */ void a() {
        throw new ConcurrentModificationException();
    }

    public static /* synthetic */ void b(int i10, String str) {
        throw new IllegalStateException(str + i10);
    }

    public static /* synthetic */ void c(int i10, String str, Object obj, Object obj2) {
        throw new IllegalStateException(str + i10 + obj + obj2);
    }

    public static /* synthetic */ void d(Fragment fragment, String str) {
        throw new IllegalStateException(str + ((Object) fragment.toString()) + ((Object) " is already attached to a FragmentManager."));
    }

    public static /* synthetic */ void e(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void f(Object obj, String str) {
        throw new RuntimeException(str + obj);
    }

    public static /* synthetic */ void g(Object obj, String str, Object obj2) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void h(String str) {
        throw new RuntimeException(str);
    }

    public static /* synthetic */ void i(String str, float f8, Object obj) {
        throw new IllegalArgumentException(str + f8 + obj);
    }

    public static /* synthetic */ void j(String str, int i10, Object obj, int i11, Object obj2) {
        throw new IndexOutOfBoundsException(str + i10 + obj + i11 + obj2);
    }

    public static /* synthetic */ void k(String str, int i10, Object obj, long j10) {
        throw new IllegalArgumentException(str + i10 + obj + j10);
    }

    public static /* synthetic */ void l(String str, long j10, Object obj, int i10) {
        throw new IllegalArgumentException(str + j10 + obj + i10);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3) {
        throw new IOException(str + obj + obj2 + obj3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void n(String str, Object obj, Object obj2, Object obj3, int i10) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + ((char) i10));
    }

    public static /* synthetic */ void o(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    public static /* synthetic */ void p(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void q(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void r(Object obj, String str, Object obj2) {
        throw new NoSuchElementException(str + obj + obj2);
    }

    public static /* synthetic */ void s(String str, int i10, Object obj, int i11, Object obj2) {
        throw new IllegalArgumentException(str + i10 + obj + i11 + obj2);
    }

    public static /* synthetic */ void t(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void u(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void v(Object obj, String str, Object obj2) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void w(Object obj, String str) {
        throw new IOException(str + obj);
    }

    @Override // androidx.constraintlayout.core.state.Interpolator
    public float getInterpolation(float f8) {
        float lambda$getInterpolator$1;
        float lambda$getInterpolator$2;
        float lambda$getInterpolator$3;
        float lambda$getInterpolator$4;
        float lambda$getInterpolator$5;
        float lambda$getInterpolator$6;
        float lambda$getInterpolator$7;
        switch (this.f92b) {
            case 16:
                lambda$getInterpolator$1 = Transition.lambda$getInterpolator$1(f8);
                return lambda$getInterpolator$1;
            case 17:
                lambda$getInterpolator$2 = Transition.lambda$getInterpolator$2(f8);
                return lambda$getInterpolator$2;
            case 18:
                lambda$getInterpolator$3 = Transition.lambda$getInterpolator$3(f8);
                return lambda$getInterpolator$3;
            case 19:
                lambda$getInterpolator$4 = Transition.lambda$getInterpolator$4(f8);
                return lambda$getInterpolator$4;
            case 20:
                lambda$getInterpolator$5 = Transition.lambda$getInterpolator$5(f8);
                return lambda$getInterpolator$5;
            case 21:
                lambda$getInterpolator$6 = Transition.lambda$getInterpolator$6(f8);
                return lambda$getInterpolator$6;
            default:
                lambda$getInterpolator$7 = Transition.lambda$getInterpolator$7(f8);
                return lambda$getInterpolator$7;
        }
    }
}
