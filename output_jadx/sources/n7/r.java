package n7;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class r {
    public static final a d = new a("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");

    /* renamed from: a, reason: collision with root package name */
    public final List f4239a;

    /* renamed from: b, reason: collision with root package name */
    public final b f4240b;
    public final int c;

    public r(SocketAddress socketAddress) {
        b bVar = b.f4157b;
        List singletonList = Collections.singletonList(socketAddress);
        o4.b.d("addrs is empty", !singletonList.isEmpty());
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(singletonList));
        this.f4239a = unmodifiableList;
        o4.b.i(bVar, "attrs");
        this.f4240b = bVar;
        this.c = unmodifiableList.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        List list = rVar.f4239a;
        List list2 = this.f4239a;
        if (list2.size() != list.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list2.size(); i10++) {
            if (!((SocketAddress) list2.get(i10)).equals(list.get(i10))) {
                return false;
            }
        }
        if (this.f4240b.equals(rVar.f4240b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return "[" + this.f4239a + "/" + this.f4240b + "]";
    }
}
