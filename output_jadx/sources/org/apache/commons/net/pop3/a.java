package org.apache.commons.net.pop3;

import java.util.ListIterator;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements IntFunction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4938a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ListIterator f4939b;

    public /* synthetic */ a(ListIterator listIterator, int i10) {
        this.f4938a = i10;
        this.f4939b = listIterator;
    }

    @Override // java.util.function.IntFunction
    public final Object apply(int i10) {
        switch (this.f4938a) {
            case 0:
                return POP3Client.a(this.f4939b, i10);
            default:
                return POP3Client.b(this.f4939b, i10);
        }
    }
}
