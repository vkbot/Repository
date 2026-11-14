package i9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class g0 extends u0 {
    public final /* synthetic */ int c;
    public final f0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(e9.b bVar, e9.b bVar2, int i10) {
        super(bVar, bVar2);
        this.c = i10;
        bVar.getClass();
        bVar2.getClass();
        switch (i10) {
            case 1:
                super(bVar, bVar2);
                g9.e a10 = bVar.a();
                g9.e a11 = bVar2.a();
                a10.getClass();
                a11.getClass();
                this.d = new f0("kotlin.collections.LinkedHashMap", a10, a11);
                return;
            default:
                g9.e a12 = bVar.a();
                g9.e a13 = bVar2.a();
                a12.getClass();
                a13.getClass();
                this.d = new f0("kotlin.collections.HashMap", a12, a13);
                return;
        }
    }

    @Override // e9.h, e9.a
    public final g9.e a() {
        switch (this.c) {
            case 0:
                return this.d;
            default:
                return this.d;
        }
    }

    @Override // i9.a
    public final Object d() {
        switch (this.c) {
            case 0:
                return new HashMap();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // i9.a
    public final int e(Object obj) {
        int size;
        switch (this.c) {
            case 0:
                HashMap hashMap = (HashMap) obj;
                hashMap.getClass();
                size = hashMap.size();
                break;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                linkedHashMap.getClass();
                size = linkedHashMap.size();
                break;
        }
        return size * 2;
    }

    @Override // i9.a
    public final void f(int i10, Object obj) {
        switch (this.c) {
            case 0:
                ((HashMap) obj).getClass();
                return;
            default:
                ((LinkedHashMap) obj).getClass();
                return;
        }
    }

    @Override // i9.a
    public final Iterator g(Object obj) {
        switch (this.c) {
            case 0:
                Map map = (Map) obj;
                map.getClass();
                return map.entrySet().iterator();
            default:
                Map map2 = (Map) obj;
                map2.getClass();
                return map2.entrySet().iterator();
        }
    }

    @Override // i9.a
    public final int h(Object obj) {
        switch (this.c) {
            case 0:
                Map map = (Map) obj;
                map.getClass();
                return map.size();
            default:
                Map map2 = (Map) obj;
                map2.getClass();
                return map2.size();
        }
    }

    @Override // i9.a
    public final Object l(Object obj) {
        switch (this.c) {
            case 0:
                throw null;
            default:
                throw null;
        }
    }

    @Override // i9.a
    public final Object m(Object obj) {
        switch (this.c) {
            case 0:
                HashMap hashMap = (HashMap) obj;
                hashMap.getClass();
                return hashMap;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                linkedHashMap.getClass();
                return linkedHashMap;
        }
    }
}
