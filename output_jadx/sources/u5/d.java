package u5;

import java.util.Map;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d implements Map.Entry {

    /* renamed from: b, reason: collision with root package name */
    public d f5888b;
    public d c;
    public d d;
    public d e;

    /* renamed from: f, reason: collision with root package name */
    public d f5889f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f5890g;

    /* renamed from: h, reason: collision with root package name */
    public Object f5891h;

    /* renamed from: i, reason: collision with root package name */
    public int f5892i;

    public d(d dVar, Object obj, d dVar2, d dVar3) {
        this.f5888b = dVar;
        this.f5890g = obj;
        this.f5892i = 1;
        this.e = dVar2;
        this.f5889f = dVar3;
        dVar3.e = this;
        dVar2.f5889f = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f5890g;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f5891h;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f5890g;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f5891h;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f5890g;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f5891h;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i10 ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj != null) {
            Object obj2 = this.f5891h;
            this.f5891h = obj;
            return obj2;
        }
        n0.b.n("value == null");
        return null;
    }

    public final String toString() {
        return this.f5890g + "=" + this.f5891h;
    }

    public d() {
        this.f5890g = null;
        this.f5889f = this;
        this.e = this;
    }
}
