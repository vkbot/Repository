package z8;

import java.util.Arrays;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: b, reason: collision with root package name */
    public c[] f6878b;
    public int c;
    public int d;

    public final c a() {
        c cVar;
        synchronized (this) {
            try {
                c[] cVarArr = this.f6878b;
                if (cVarArr == null) {
                    cVarArr = d();
                    this.f6878b = cVarArr;
                } else if (this.c >= cVarArr.length) {
                    Object[] copyOf = Arrays.copyOf(cVarArr, cVarArr.length * 2);
                    this.f6878b = (c[]) copyOf;
                    cVarArr = (c[]) copyOf;
                }
                int i10 = this.d;
                do {
                    cVar = cVarArr[i10];
                    if (cVar == null) {
                        cVar = c();
                        cVarArr[i10] = cVar;
                    }
                    i10++;
                    if (i10 >= cVarArr.length) {
                        i10 = 0;
                    }
                } while (!cVar.a(this));
                this.d = i10;
                this.c++;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    public abstract c c();

    public abstract c[] d();

    public final void e(c cVar) {
        int i10;
        Continuation[] b10;
        synchronized (this) {
            try {
                int i11 = this.c - 1;
                this.c = i11;
                if (i11 == 0) {
                    this.d = 0;
                }
                cVar.getClass();
                b10 = cVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation continuation : b10) {
            if (continuation != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m95constructorimpl(Unit.INSTANCE));
            }
        }
    }
}
