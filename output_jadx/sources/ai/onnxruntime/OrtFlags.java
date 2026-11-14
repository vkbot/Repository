package ai.onnxruntime;

import java.util.EnumSet;
import java.util.Iterator;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public interface OrtFlags {
    static <E extends Enum<E> & OrtFlags> int aggregateToInt(EnumSet<E> enumSet) {
        Iterator<E> it = enumSet.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 |= ((OrtFlags) it.next()).getValue();
        }
        return i10;
    }

    int getValue();
}
