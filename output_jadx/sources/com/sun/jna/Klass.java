package com.sun.jna;

import androidx.navigation.b;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
abstract class Klass {
    private Klass() {
    }

    public static <T> T newInstance(Class<T> cls) {
        try {
            return cls.getDeclaredConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            b.n(e, cls);
            return null;
        } catch (IllegalArgumentException e6) {
            b.n(e6, cls);
            return null;
        } catch (InstantiationException e10) {
            b.n(e10, cls);
            return null;
        } catch (NoSuchMethodException e11) {
            b.n(e11, cls);
            return null;
        } catch (SecurityException e12) {
            b.n(e12, cls);
            return null;
        } catch (InvocationTargetException e13) {
            if (!(e13.getCause() instanceof RuntimeException)) {
                b.n(e13, cls);
                return null;
            }
            throw ((RuntimeException) e13.getCause());
        }
    }
}
