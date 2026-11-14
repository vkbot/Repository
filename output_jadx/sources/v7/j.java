package v7;

import java.net.SocketAddress;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f5962a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5963b;

    public j(n7.r rVar) {
        o4.b.i(rVar, "eag");
        List list = rVar.f4239a;
        this.f5962a = new String[list.size()];
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            this.f5962a[i10] = ((SocketAddress) it.next()).toString();
            i10++;
        }
        Arrays.sort(this.f5962a);
        this.f5963b = Arrays.hashCode(this.f5962a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (jVar.f5963b == this.f5963b) {
            String[] strArr = jVar.f5962a;
            int length = strArr.length;
            String[] strArr2 = this.f5962a;
            if (length == strArr2.length) {
                return Arrays.equals(strArr, strArr2);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5963b;
    }

    public final String toString() {
        return Arrays.toString(this.f5962a);
    }
}
