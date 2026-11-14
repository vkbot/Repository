package q7;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f5337a = new String[0];

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f5338b = Charset.forName("UTF-8");

    public static Object[] a(Object[] objArr, Object[] objArr2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            int length = objArr2.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    Object obj2 = objArr2[i10];
                    if (obj.equals(obj2)) {
                        arrayList.add(obj2);
                        break;
                    }
                    i10++;
                }
            }
        }
        return arrayList.toArray((Object[]) Array.newInstance((Class<?>) String.class, arrayList.size()));
    }
}
