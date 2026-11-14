package androidx.core.content;

import android.content.ComponentName;
import android.content.UriMatcher;
import android.net.Uri;
import androidx.core.util.Predicate;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f170a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f171b;

    public /* synthetic */ c(int i10, Object obj) {
        this.f170a = i10;
        this.f171b = obj;
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        boolean lambda$asPredicate$0;
        switch (this.f170a) {
            case 0:
                return ((ComponentName) this.f171b).equals((ComponentName) obj);
            default:
                lambda$asPredicate$0 = UriMatcherCompat.lambda$asPredicate$0((UriMatcher) this.f171b, (Uri) obj);
                return lambda$asPredicate$0;
        }
    }
}
