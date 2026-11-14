package z5;

import java.util.EnumMap;
import java.util.Map;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f6865a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f6866b;
    public o[] c;
    public final a d;
    public Map e;

    public m(String str, byte[] bArr, o[] oVarArr, a aVar, int i10) {
        this.f6865a = str;
        this.f6866b = bArr;
        this.c = oVarArr;
        this.d = aVar;
        this.e = null;
    }

    public final void a(Map map) {
        if (map != null) {
            Map map2 = this.e;
            if (map2 == null) {
                this.e = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    public final void b(n nVar, Object obj) {
        if (this.e == null) {
            this.e = new EnumMap(n.class);
        }
        this.e.put(nVar, obj);
    }

    public final String toString() {
        return this.f6865a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(String str, byte[] bArr, o[] oVarArr, a aVar) {
        this(str, bArr, oVarArr, aVar, 0);
        System.currentTimeMillis();
    }
}
