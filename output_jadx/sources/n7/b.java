package n7;

import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Map;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f4157b = new b(new IdentityHashMap());

    /* renamed from: a, reason: collision with root package name */
    public final IdentityHashMap f4158a;

    public b(IdentityHashMap identityHashMap) {
        this.f4158a = identityHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        IdentityHashMap identityHashMap = ((b) obj).f4158a;
        IdentityHashMap identityHashMap2 = this.f4158a;
        if (identityHashMap2.size() != identityHashMap.size()) {
            return false;
        }
        for (Map.Entry entry : identityHashMap2.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey()) || !com.bumptech.glide.d.f(entry.getValue(), identityHashMap.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i10 = 0;
        for (Map.Entry entry : this.f4158a.entrySet()) {
            i10 += Arrays.hashCode(new Object[]{entry.getKey(), entry.getValue()});
        }
        return i10;
    }

    public final String toString() {
        return this.f4158a.toString();
    }
}
