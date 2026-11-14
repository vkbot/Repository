package v8;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class f1 implements u0 {
    public static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(f1.class, "_isCompleting");
    public static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(f1.class, Object.class, "_rootCause");
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(f1.class, Object.class, "_exceptionsHolder");

    @Volatile
    private volatile Object _exceptionsHolder;

    @Volatile
    private volatile int _isCompleting = 0;

    @Volatile
    private volatile Object _rootCause;

    /* renamed from: b, reason: collision with root package name */
    public final j1 f6026b;

    public f1(j1 j1Var, Throwable th) {
        this.f6026b = j1Var;
        this._rootCause = th;
    }

    public final void a(Throwable th) {
        Throwable d10 = d();
        if (d10 == null) {
            d.set(this, th);
            return;
        }
        if (th != d10) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                atomicReferenceFieldUpdater.set(this, th);
                return;
            }
            if (obj instanceof Throwable) {
                if (th == obj) {
                    return;
                }
                ArrayList arrayList = new ArrayList(4);
                arrayList.add(obj);
                arrayList.add(th);
                atomicReferenceFieldUpdater.set(this, arrayList);
                return;
            }
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
            } else {
                org.apache.commons.net.ftp.a.c(obj, "State is ");
            }
        }
    }

    @Override // v8.u0
    public final boolean b() {
        if (d() == null) {
            return true;
        }
        return false;
    }

    @Override // v8.u0
    public final j1 c() {
        return this.f6026b;
    }

    public final Throwable d() {
        return (Throwable) d.get(this);
    }

    public final boolean e() {
        if (d() != null) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (c.get(this) != 0) {
            return true;
        }
        return false;
    }

    public final ArrayList g(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else if (obj instanceof ArrayList) {
            arrayList = (ArrayList) obj;
        } else {
            org.apache.commons.net.ftp.a.c(obj, "State is ");
            return null;
        }
        Throwable d10 = d();
        if (d10 != null) {
            arrayList.add(0, d10);
        }
        if (th != null && !Intrinsics.areEqual(th, d10)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, a0.f6008g);
        return arrayList;
    }

    public final String toString() {
        return "Finishing[cancelling=" + e() + ", completing=" + f() + ", rootCause=" + d() + ", exceptions=" + e.get(this) + ", list=" + this.f6026b + ']';
    }
}
