package com.sun.jna;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
abstract class VarArgsChecker {

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static final class NoVarArgsChecker extends VarArgsChecker {
        private NoVarArgsChecker() {
            super();
        }

        @Override // com.sun.jna.VarArgsChecker
        public int fixedArgs(Method method) {
            return 0;
        }

        @Override // com.sun.jna.VarArgsChecker
        public boolean isVarArgs(Method method) {
            return false;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static final class RealVarArgsChecker extends VarArgsChecker {
        private RealVarArgsChecker() {
            super();
        }

        @Override // com.sun.jna.VarArgsChecker
        public int fixedArgs(Method method) {
            if (method.isVarArgs()) {
                return method.getParameterTypes().length - 1;
            }
            return 0;
        }

        @Override // com.sun.jna.VarArgsChecker
        public boolean isVarArgs(Method method) {
            return method.isVarArgs();
        }
    }

    public static VarArgsChecker create() {
        try {
            if (Method.class.getMethod("isVarArgs", null) != null) {
                return new RealVarArgsChecker();
            }
            return new NoVarArgsChecker();
        } catch (NoSuchMethodException unused) {
            return new NoVarArgsChecker();
        } catch (SecurityException unused2) {
            return new NoVarArgsChecker();
        }
    }

    public abstract int fixedArgs(Method method);

    public abstract boolean isVarArgs(Method method);

    private VarArgsChecker() {
    }
}
