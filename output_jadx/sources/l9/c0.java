package l9;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f3564a = new b0(new byte[0], 0, 0, false, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f3565b;
    public static final AtomicReference[] c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f3565b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i10 = 0; i10 < highestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(b0 b0Var) {
        int i10;
        b0Var.getClass();
        if (b0Var.f3562f == null && b0Var.f3563g == null) {
            if (!b0Var.d) {
                AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (f3565b - 1))];
                b0 b0Var2 = f3564a;
                b0 b0Var3 = (b0) atomicReference.getAndSet(b0Var2);
                if (b0Var3 == b0Var2) {
                    return;
                }
                if (b0Var3 != null) {
                    i10 = b0Var3.c;
                } else {
                    i10 = 0;
                }
                if (i10 >= 65536) {
                    atomicReference.set(b0Var3);
                    return;
                }
                b0Var.f3562f = b0Var3;
                b0Var.f3561b = 0;
                b0Var.c = i10 + 8192;
                atomicReference.set(b0Var);
                return;
            }
            return;
        }
        j1.i.k("Failed requirement.");
    }

    public static final b0 b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (f3565b - 1))];
        b0 b0Var = f3564a;
        b0 b0Var2 = (b0) atomicReference.getAndSet(b0Var);
        if (b0Var2 == b0Var) {
            return new b0();
        }
        if (b0Var2 == null) {
            atomicReference.set(null);
            return new b0();
        }
        atomicReference.set(b0Var2.f3562f);
        b0Var2.f3562f = null;
        b0Var2.c = 0;
        return b0Var2;
    }
}
