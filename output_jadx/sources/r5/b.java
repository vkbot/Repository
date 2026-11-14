package r5;

import java.util.Iterator;
import java.util.Set;
import org.apache.commons.io.IOUtils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f5397a;

    /* renamed from: b, reason: collision with root package name */
    public final c f5398b;

    public b(Set set, c cVar) {
        this.f5397a = a(set);
        this.f5398b = cVar;
    }

    public static String a(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb.append(aVar.f5395a);
            sb.append(IOUtils.DIR_SEPARATOR_UNIX);
            sb.append(aVar.f5396b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}
