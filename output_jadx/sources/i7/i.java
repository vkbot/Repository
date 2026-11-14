package i7;

import java.util.ArrayList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2802a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f2803b;

    public i(int i10) {
        this.f2802a = i10;
        switch (i10) {
            case 1:
                this.f2803b = new ArrayList();
                return;
            case 2:
                this.f2803b = new ArrayList(20);
                return;
            case 3:
                this.f2803b = new ArrayList();
                return;
            case 4:
                this.f2803b = new ArrayList();
                return;
            case 5:
                this.f2803b = new ArrayList();
                return;
            case 6:
                this.f2803b = new ArrayList();
                return;
            default:
                return;
        }
    }

    public static double a(double d, double d10) {
        double abs = Math.abs(d - d10) % 360.0d;
        if (abs > 180.0d) {
            return 360.0d - abs;
        }
        return abs;
    }

    public static double c(double d, double d10, double d11, double d12) {
        double radians = Math.toRadians(d12 - d10);
        return (Math.toDegrees(Math.atan2(Math.cos(Math.toRadians(d11)) * Math.sin(radians), (Math.sin(Math.toRadians(d11)) * Math.cos(Math.toRadians(d))) - (Math.cos(radians) * (Math.cos(Math.toRadians(d11)) * Math.sin(Math.toRadians(d)))))) + 360.0d) % 360.0d;
    }

    public void b(Object obj, String str) {
        this.f2803b.add(str + "=" + obj);
    }

    public synchronized h.k d(Class cls) {
        int size = this.f2803b.size();
        for (int i10 = 0; i10 < size; i10++) {
            x.d dVar = (x.d) this.f2803b.get(i10);
            if (dVar.f6422a.isAssignableFrom(cls)) {
                return dVar.f6423b;
            }
        }
        return null;
    }

    public synchronized ArrayList e(Class cls, Class cls2) {
        boolean z9;
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        ArrayList arrayList2 = this.f2803b;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            v.b bVar = (v.b) obj;
            if (bVar.f5907a.isAssignableFrom(cls) && cls2.isAssignableFrom(bVar.f5908b)) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9 && !arrayList.contains(bVar.f5908b)) {
                arrayList.add(bVar.f5908b);
            }
        }
        return arrayList;
    }

    public String toString() {
        switch (this.f2802a) {
            case 1:
                return this.f2803b.toString();
            default:
                return super.toString();
        }
    }
}
