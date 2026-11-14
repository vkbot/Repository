package n7;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class q {
    public static final a9.w c = new a9.w(String.valueOf(','));
    public static final q d = new q(h.c, false, new q(new h(2), true, new q()));

    /* renamed from: a, reason: collision with root package name */
    public final Map f4237a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f4238b;

    public q(h hVar, boolean z9, q qVar) {
        CharSequence obj;
        CharSequence obj2;
        String a10 = hVar.a();
        o4.b.d("Comma is currently not allowed in message encoding", !a10.contains(","));
        int size = qVar.f4237a.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(qVar.f4237a.containsKey(hVar.a()) ? size : size + 1);
        for (p pVar : qVar.f4237a.values()) {
            String a11 = pVar.f4233a.a();
            if (!a11.equals(a10)) {
                linkedHashMap.put(a11, new p(pVar.f4233a, pVar.f4234b));
            }
        }
        linkedHashMap.put(a10, new p(hVar, z9));
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        this.f4237a = unmodifiableMap;
        HashSet hashSet = new HashSet(unmodifiableMap.size());
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            if (((p) entry.getValue()).f4234b) {
                hashSet.add((String) entry.getKey());
            }
        }
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        a9.w wVar = c;
        wVar.getClass();
        Iterator it = unmodifiableSet.iterator();
        StringBuilder sb = new StringBuilder();
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                if (next instanceof CharSequence) {
                    obj = (CharSequence) next;
                } else {
                    obj = next.toString();
                }
                sb.append(obj);
                while (it.hasNext()) {
                    sb.append((CharSequence) wVar.c);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    if (next2 instanceof CharSequence) {
                        obj2 = (CharSequence) next2;
                    } else {
                        obj2 = next2.toString();
                    }
                    sb.append(obj2);
                }
            }
            this.f4238b = sb.toString().getBytes(Charset.forName("US-ASCII"));
        } catch (IOException e) {
            j1.i.e(e);
            throw null;
        }
    }

    public q() {
        this.f4237a = new LinkedHashMap(0);
        this.f4238b = new byte[0];
    }
}
