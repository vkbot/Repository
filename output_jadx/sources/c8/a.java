package c8;

import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a implements z7.a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f577b;
    public static final /* synthetic */ a[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, c8.a] */
    static {
        ?? r02 = new Enum("DISPOSED", 0);
        f577b = r02;
        c = new a[]{r02};
    }

    public static void a(AtomicReference atomicReference) {
        z7.a aVar;
        z7.a aVar2 = (z7.a) atomicReference.get();
        a aVar3 = f577b;
        if (aVar2 != aVar3 && (aVar = (z7.a) atomicReference.getAndSet(aVar3)) != aVar3 && aVar != null) {
            aVar.dispose();
        }
    }

    public static boolean b(z7.a aVar) {
        if (aVar == f577b) {
            return true;
        }
        return false;
    }

    public static void c(AtomicReference atomicReference, z7.a aVar) {
        while (true) {
            z7.a aVar2 = (z7.a) atomicReference.get();
            if (aVar2 == f577b) {
                if (aVar != null) {
                    aVar.dispose();
                    return;
                }
                return;
            }
            while (!atomicReference.compareAndSet(aVar2, aVar)) {
                if (atomicReference.get() != aVar2) {
                    break;
                }
            }
            return;
        }
    }

    public static boolean d(AtomicReference atomicReference, z7.a aVar) {
        d8.b.a(aVar, "d is null");
        while (!atomicReference.compareAndSet(null, aVar)) {
            if (atomicReference.get() != null) {
                aVar.dispose();
                if (atomicReference.get() != f577b) {
                    a.a.s(new IllegalStateException("Disposable already set!"));
                    return false;
                }
                return false;
            }
        }
        return true;
    }

    public static boolean e(z7.a aVar, z7.a aVar2) {
        if (aVar2 == null) {
            a.a.s(new NullPointerException("next is null"));
            return false;
        }
        if (aVar != null) {
            aVar2.dispose();
            a.a.s(new IllegalStateException("Disposable already set!"));
            return false;
        }
        return true;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) c.clone();
    }

    @Override // z7.a
    public final void dispose() {
    }
}
