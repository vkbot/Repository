package n;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class z {
    public static final y e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static final d0 f4044f = new d0(2);
    public final d0.d d;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4045a = new ArrayList();
    public final HashSet c = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final y f4046b = e;

    public z(d0.d dVar) {
        this.d = dVar;
    }

    public final synchronized ArrayList a(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            ArrayList arrayList2 = this.f4045a;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                x xVar = (x) obj;
                if (!this.c.contains(xVar) && xVar.f4042a.isAssignableFrom(cls)) {
                    this.c.add(xVar);
                    arrayList.add(xVar.c.j(this));
                    this.c.remove(xVar);
                }
            }
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
        return arrayList;
    }

    public final synchronized r b(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = this.f4045a;
            int size = arrayList2.size();
            boolean z9 = false;
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                x xVar = (x) obj;
                if (this.c.contains(xVar)) {
                    z9 = true;
                } else if (xVar.f4042a.isAssignableFrom(cls) && xVar.f4043b.isAssignableFrom(cls2)) {
                    this.c.add(xVar);
                    arrayList.add(xVar.c.j(this));
                    this.c.remove(xVar);
                }
            }
            if (arrayList.size() > 1) {
                y yVar = this.f4046b;
                d0.d dVar = this.d;
                yVar.getClass();
                return new w(arrayList, dVar);
            }
            if (arrayList.size() == 1) {
                return (r) arrayList.get(0);
            }
            if (z9) {
                return f4044f;
            }
            throw new RuntimeException("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
    }

    public final synchronized ArrayList c(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        ArrayList arrayList2 = this.f4045a;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            x xVar = (x) obj;
            if (!arrayList.contains(xVar.f4043b) && xVar.f4042a.isAssignableFrom(cls)) {
                arrayList.add(xVar.f4043b);
            }
        }
        return arrayList;
    }
}
