package s3;

import android.view.View;
import java.util.Comparator;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class m implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5708b;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f5708b) {
            case 0:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            default:
                return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }
}
