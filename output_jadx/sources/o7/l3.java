package o7;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class l3 implements r1 {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f4610b = Logger.getLogger(l3.class.getName());
    public static final Constructor c;
    public static final Method d;
    public static final RuntimeException e;

    /* renamed from: f, reason: collision with root package name */
    public static final Object[] f4611f;

    /* renamed from: a, reason: collision with root package name */
    public final Object f4612a;

    static {
        Method method;
        Constructor<?> constructor;
        try {
            Class<?> cls = Class.forName("java.util.concurrent.atomic.LongAdder");
            method = cls.getMethod("add", Long.TYPE);
            try {
                cls.getMethod("sum", null);
                Constructor<?>[] constructors = cls.getConstructors();
                int length = constructors.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        constructor = constructors[i10];
                        if (constructor.getParameterTypes().length == 0) {
                            break;
                        } else {
                            i10++;
                        }
                    } else {
                        constructor = null;
                        break;
                    }
                }
                th = null;
            } catch (Throwable th) {
                th = th;
                f4610b.log(Level.FINE, "LongAdder can not be found via reflection, this is normal for JDK7 and below", th);
                constructor = null;
                if (th != null) {
                }
                c = null;
                d = null;
                e = new RuntimeException(th);
                f4611f = new Object[]{1L};
            }
        } catch (Throwable th2) {
            th = th2;
            method = null;
        }
        if (th != null && constructor != null) {
            c = constructor;
            d = method;
            e = null;
        } else {
            c = null;
            d = null;
            e = new RuntimeException(th);
        }
        f4611f = new Object[]{1L};
    }

    public l3() {
        RuntimeException runtimeException = e;
        if (runtimeException == null) {
            try {
                this.f4612a = c.newInstance(null);
                return;
            } catch (IllegalAccessException e6) {
                n0.b.w(e6);
                throw null;
            } catch (InstantiationException e10) {
                n0.b.w(e10);
                throw null;
            } catch (InvocationTargetException e11) {
                n0.b.w(e11);
                throw null;
            }
        }
        throw runtimeException;
    }

    @Override // o7.r1
    public final void a() {
        try {
            d.invoke(this.f4612a, f4611f);
        } catch (IllegalAccessException e6) {
            n0.b.w(e6);
        } catch (InvocationTargetException e10) {
            n0.b.w(e10);
        }
    }
}
