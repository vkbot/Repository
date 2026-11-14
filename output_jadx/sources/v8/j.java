package v8;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6033a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f6034b;
    public final Function1 c;
    public final Object d;
    public final Throwable e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ j(java.lang.Object r9, v8.j0 r10, kotlin.jvm.functions.Function1 r11, java.util.concurrent.CancellationException r12, int r13) {
        /*
            r8 = this;
            r0 = r13 & 2
            r1 = 0
            if (r0 == 0) goto L7
            r4 = r1
            goto L8
        L7:
            r4 = r10
        L8:
            r10 = r13 & 4
            if (r10 == 0) goto Le
            r5 = r1
            goto Lf
        Le:
            r5 = r11
        Lf:
            r10 = r13 & 16
            if (r10 == 0) goto L15
            r7 = r1
            goto L16
        L15:
            r7 = r12
        L16:
            r6 = 0
            r2 = r8
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v8.j.<init>(java.lang.Object, v8.j0, kotlin.jvm.functions.Function1, java.util.concurrent.CancellationException, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static j a(j jVar, j0 j0Var, CancellationException cancellationException, int i10) {
        Object obj = jVar.f6033a;
        if ((i10 & 2) != 0) {
            j0Var = jVar.f6034b;
        }
        j0 j0Var2 = j0Var;
        Function1 function1 = jVar.c;
        Object obj2 = jVar.d;
        CancellationException cancellationException2 = cancellationException;
        if ((i10 & 16) != 0) {
            cancellationException2 = jVar.e;
        }
        return new j(obj, j0Var2, function1, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (Intrinsics.areEqual(this.f6033a, jVar.f6033a) && Intrinsics.areEqual(this.f6034b, jVar.f6034b) && Intrinsics.areEqual(this.c, jVar.c) && Intrinsics.areEqual(this.d, jVar.d) && Intrinsics.areEqual(this.e, jVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i10 = 0;
        Object obj = this.f6033a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = hashCode * 31;
        j0 j0Var = this.f6034b;
        if (j0Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = j0Var.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        Function1 function1 = this.c;
        if (function1 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = function1.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        Object obj2 = this.d;
        if (obj2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = obj2.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        Throwable th = this.e;
        if (th != null) {
            i10 = th.hashCode();
        }
        return i14 + i10;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f6033a + ", cancelHandler=" + this.f6034b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public j(Object obj, j0 j0Var, Function1 function1, Object obj2, Throwable th) {
        this.f6033a = obj;
        this.f6034b = j0Var;
        this.c = function1;
        this.d = obj2;
        this.e = th;
    }
}
