package org.apache.commons.io.build;

import java.util.function.IntUnaryOperator;
import org.apache.commons.net.smtp.AuthenticatingSMTPClient;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements IntUnaryOperator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4813a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4814b;

    public /* synthetic */ b(int i10, Object obj) {
        this.f4813a = i10;
        this.f4814b = obj;
    }

    @Override // java.util.function.IntUnaryOperator
    public final int applyAsInt(int i10) {
        switch (this.f4813a) {
            case 0:
                return AbstractStreamBuilder.a((AbstractStreamBuilder) this.f4814b, i10);
            default:
                return AuthenticatingSMTPClient.a((String[]) this.f4814b, i10);
        }
    }
}
