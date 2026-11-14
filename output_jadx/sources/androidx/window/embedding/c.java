package androidx.window.embedding;

import android.util.Pair;
import java.util.Set;
import java.util.function.Predicate;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f257a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EmbeddingAdapter f258b;
    public final /* synthetic */ Set c;

    public /* synthetic */ c(EmbeddingAdapter embeddingAdapter, Set set, int i10) {
        this.f257a = i10;
        this.f258b = embeddingAdapter;
        this.c = set;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean m84translateActivityPairPredicates$lambda1;
        boolean m83translateActivityIntentPredicates$lambda3;
        switch (this.f257a) {
            case 0:
                m84translateActivityPairPredicates$lambda1 = EmbeddingAdapter.m84translateActivityPairPredicates$lambda1(this.f258b, this.c, (Pair) obj);
                return m84translateActivityPairPredicates$lambda1;
            default:
                m83translateActivityIntentPredicates$lambda3 = EmbeddingAdapter.m83translateActivityIntentPredicates$lambda3(this.f258b, this.c, (Pair) obj);
                return m83translateActivityIntentPredicates$lambda3;
        }
    }
}
