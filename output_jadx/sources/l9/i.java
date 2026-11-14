package l9;

import android.content.Context;
import androidx.core.util.Supplier;
import com.example.navistart.cores.ProxyFactory;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements ProxyFactory.ProxyFactoryCreatContext, ProxyFactory.ProxyFactoryCreat, Supplier {

    /* renamed from: b */
    public final /* synthetic */ int f3571b;

    public /* synthetic */ i(int i10) {
        this.f3571b = i10;
    }

    public static /* synthetic */ void a() {
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void b(int i10, int i11, String str) {
        throw new IllegalArgumentException((str + i10 + ((char) i11)).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void c(int i10, String str) {
        throw new IllegalArgumentException(str + ((char) i10));
    }

    public static /* synthetic */ void d(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void e(Object obj, String str) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    @Override // com.example.navistart.cores.ProxyFactory.ProxyFactoryCreat
    public Object create() {
        int i10 = 4;
        int i11 = 2;
        int i12 = 3;
        int i13 = 0;
        int i14 = 1;
        int i15 = 5;
        switch (this.f3571b) {
            case 6:
                return new k1.a(6);
            case 7:
            case 11:
            case 19:
            case 22:
            case 23:
            case 24:
            case 26:
            case 27:
            default:
                return new h1.a(2);
            case 8:
                return new h1.a(0);
            case 9:
                h1.a aVar = new h1.a(3);
                aVar.f2550b = e0.m.h(new byte[]{5, 77, -81, 104, -75, 53, 39, 30, 27, 75, -81, 102, -75, 48, 48, 5, 0, 71, -71, 117, -76, 53, 53, 20, 5, 75, -81, 120, -87, 49, 50, 1}, new byte[]{68, 24, -5, 39, -5, 116, 113, 87});
                return aVar;
            case 10:
                return new k1.a(i11);
            case 12:
                return new g1.a(3);
            case 13:
                return new k1.a(i12);
            case 14:
                return new g1.a(4);
            case 15:
                return new k1.a(i10);
            case 16:
                return new k1.a(i13);
            case 17:
                return new k1.a(i14);
            case 18:
                return new g1.a(1);
            case 20:
                return new g1.a(5);
            case 21:
                return new k1.a(i15);
            case 25:
                return new g1.a(0);
            case 28:
                return new h1.a(1);
        }
    }

    @Override // androidx.core.util.Supplier
    public Object get() {
        switch (this.f3571b) {
            case 7:
                return new Object();
            case 11:
                return new j1.a(0);
            case 19:
                return new j1.a(1);
            case 22:
                return new Object();
            case 23:
                return new Object();
            case 24:
                return new j1.r(1);
            case 26:
                return new Object();
            default:
                return new Object();
        }
    }

    @Override // com.example.navistart.cores.ProxyFactory.ProxyFactoryCreatContext
    public Object create(Context context) {
        return new Object();
    }
}
