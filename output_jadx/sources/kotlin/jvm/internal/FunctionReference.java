package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class FunctionReference extends CallableReference implements FunctionBase, KFunction {
    private final int arity;

    @SinceKotlin(version = "1.4")
    private final int flags;

    /* JADX WARN: Illegal instructions before constructor call */
    @kotlin.SinceKotlin(version = "1.4")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FunctionReference(int r9, java.lang.Object r10, java.lang.Class r11, java.lang.String r12, java.lang.String r13, int r14) {
        /*
            r8 = this;
            r0 = r14 & 1
            r1 = 1
            if (r0 != r1) goto Lc
            r7 = r1
        L6:
            r2 = r8
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            goto Lf
        Lc:
            r0 = 0
            r7 = r0
            goto L6
        Lf:
            r2.<init>(r3, r4, r5, r6, r7)
            r2.arity = r9
            int r9 = r14 >> 1
            r2.flags = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.FunctionReference.<init>(int, java.lang.Object, java.lang.Class, java.lang.String, java.lang.String, int):void");
    }

    @Override // kotlin.jvm.internal.CallableReference
    @SinceKotlin(version = "1.1")
    public KCallable computeReflected() {
        return Reflection.function(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            if (getName().equals(functionReference.getName()) && getSignature().equals(functionReference.getSignature()) && this.flags == functionReference.flags && this.arity == functionReference.arity && Intrinsics.areEqual(getBoundReceiver(), functionReference.getBoundReceiver()) && Intrinsics.areEqual(getOwner(), functionReference.getOwner())) {
                return true;
            }
            return false;
        }
        if (!(obj instanceof KFunction)) {
            return false;
        }
        return obj.equals(compute());
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.jvm.internal.CallableReference
    @SinceKotlin(version = "1.1")
    public KFunction getReflected() {
        return (KFunction) super.getReflected();
    }

    public int hashCode() {
        int hashCode;
        if (getOwner() == null) {
            hashCode = 0;
        } else {
            hashCode = getOwner().hashCode() * 31;
        }
        return getSignature().hashCode() + ((getName().hashCode() + hashCode) * 31);
    }

    @Override // kotlin.reflect.KFunction
    @SinceKotlin(version = "1.1")
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // kotlin.reflect.KFunction
    @SinceKotlin(version = "1.1")
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // kotlin.reflect.KFunction
    @SinceKotlin(version = "1.1")
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // kotlin.reflect.KFunction
    @SinceKotlin(version = "1.1")
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    @SinceKotlin(version = "1.1")
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        KCallable compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @SinceKotlin(version = "1.1")
    public FunctionReference(int i10, Object obj) {
        this(i10, obj, null, null, null, 0);
    }

    public FunctionReference(int i10) {
        this(i10, CallableReference.NO_RECEIVER, null, null, null, 0);
    }
}
