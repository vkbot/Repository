package com.google.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class y extends a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, y> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected j1 unknownFields;

    public y() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = j1.f1583f;
    }

    public static y f(Class cls) {
        y yVar = defaultInstanceMap.get(cls);
        if (yVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                yVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (yVar == null) {
            y yVar2 = (y) ((y) s1.b(cls)).e(6);
            if (yVar2 != null) {
                defaultInstanceMap.put(cls, yVar2);
                return yVar2;
            }
            throw new IllegalStateException();
        }
        return yVar;
    }

    public static Object g(Method method, y yVar, Object... objArr) {
        try {
            return method.invoke(yVar, objArr);
        } catch (IllegalAccessException e) {
            ai.onnxruntime.b.o("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e6) {
            Throwable cause = e6.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (!(cause instanceof Error)) {
                    ai.onnxruntime.b.o("Unexpected exception thrown by generated accessor method.", cause);
                    return null;
                }
                throw ((Error) cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static final boolean h(y yVar, boolean z9) {
        byte byteValue = ((Byte) yVar.e(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        y0 y0Var = y0.c;
        y0Var.getClass();
        boolean d = y0Var.a(yVar.getClass()).d(yVar);
        if (z9) {
            yVar.e(2);
        }
        return d;
    }

    public static void l(Class cls, y yVar) {
        yVar.j();
        defaultInstanceMap.put(cls, yVar);
    }

    @Override // com.google.protobuf.a
    public final int a(b1 b1Var) {
        int f8;
        int f10;
        if (i()) {
            if (b1Var == null) {
                y0 y0Var = y0.c;
                y0Var.getClass();
                f10 = y0Var.a(getClass()).f(this);
            } else {
                f10 = b1Var.f(this);
            }
            if (f10 >= 0) {
                return f10;
            }
            j1.i.l(ai.onnxruntime.a.e(f10, "serialized size must be non-negative, was "));
            return 0;
        }
        int i10 = this.memoizedSerializedSize;
        if ((i10 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i10 & Integer.MAX_VALUE;
        }
        if (b1Var == null) {
            y0 y0Var2 = y0.c;
            y0Var2.getClass();
            f8 = y0Var2.a(getClass()).f(this);
        } else {
            f8 = b1Var.f(this);
        }
        m(f8);
        return f8;
    }

    @Override // com.google.protobuf.a
    public final void c(n nVar) {
        y0 y0Var = y0.c;
        y0Var.getClass();
        b1 a10 = y0Var.a(getClass());
        l0 l0Var = nVar.f1597a;
        if (l0Var == null) {
            l0Var = new l0(nVar);
        }
        a10.a(this, l0Var);
    }

    public final w d() {
        return (w) e(5);
    }

    public abstract Object e(int i10);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        y0 y0Var = y0.c;
        y0Var.getClass();
        return y0Var.a(getClass()).g(this, (y) obj);
    }

    public final int hashCode() {
        if (i()) {
            y0 y0Var = y0.c;
            y0Var.getClass();
            return y0Var.a(getClass()).e(this);
        }
        if (this.memoizedHashCode == 0) {
            y0 y0Var2 = y0.c;
            y0Var2.getClass();
            this.memoizedHashCode = y0Var2.a(getClass()).e(this);
        }
        return this.memoizedHashCode;
    }

    public final boolean i() {
        if ((this.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    public final void j() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final y k() {
        return (y) e(4);
    }

    public final void m(int i10) {
        if (i10 >= 0) {
            this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        } else {
            j1.i.l(ai.onnxruntime.a.e(i10, "serialized size must be non-negative, was "));
        }
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = s0.f1611a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        s0.c(this, sb, 0);
        return sb.toString();
    }
}
