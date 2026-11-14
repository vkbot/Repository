package n;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class k implements h {

    /* renamed from: b, reason: collision with root package name */
    public final Map f4024b;
    public volatile Map c;

    public k(Map map) {
        this.f4024b = Collections.unmodifiableMap(map);
    }

    @Override // n.h
    public final Map a() {
        if (this.c == null) {
            synchronized (this) {
                try {
                    if (this.c == null) {
                        this.c = Collections.unmodifiableMap(b());
                    }
                } finally {
                }
            }
        }
        return this.c;
    }

    public final HashMap b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f4024b.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                String str = ((j) list.get(i10)).f4023a;
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                    if (i10 != list.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                hashMap.put(entry.getKey(), sb2);
            }
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f4024b.equals(((k) obj).f4024b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4024b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f4024b + '}';
    }
}
