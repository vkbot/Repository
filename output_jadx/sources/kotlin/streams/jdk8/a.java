package kotlin.streams.jdk8;

import java.util.function.Supplier;
import kotlin.sequences.Sequence;
import org.apache.commons.io.input.CharSequenceInputStream;
import org.apache.commons.io.input.ReaderInputStream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Supplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3466a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3467b;

    public /* synthetic */ a(int i10, Object obj) {
        this.f3466a = i10;
        this.f3467b = obj;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f3466a) {
            case 0:
                return StreamsKt.a((Sequence) this.f3467b);
            case 1:
                return CharSequenceInputStream.Builder.c((CharSequenceInputStream.Builder) this.f3467b);
            default:
                return ReaderInputStream.Builder.b((ReaderInputStream.Builder) this.f3467b);
        }
    }
}
