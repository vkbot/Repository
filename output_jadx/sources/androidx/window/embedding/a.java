package androidx.window.embedding;

import android.app.Activity;
import android.content.Intent;
import java.util.Set;
import java.util.function.Predicate;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f254a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f255b;

    public /* synthetic */ a(Set set, int i10) {
        this.f254a = i10;
        this.f255b = set;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f254a) {
            case 0:
                return EmbeddingAdapter.c(this.f255b, (Intent) obj);
            default:
                return EmbeddingAdapter.b(this.f255b, (Activity) obj);
        }
    }
}
