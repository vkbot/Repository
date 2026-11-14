package androidx.emoji2.text.flatbuffer;

import androidx.emoji2.text.flatbuffer.Utf8Old;
import java.util.function.Supplier;
import org.apache.commons.io.input.ReadAheadInputStream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class b extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f213a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Supplier f214b;

    public /* synthetic */ b(Supplier supplier, int i10) {
        this.f213a = i10;
        this.f214b = supplier;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        Utf8Old.Cache lambda$static$0;
        byte[] lambda$static$02;
        switch (this.f213a) {
            case 0:
                ((a) this.f214b).getClass();
                lambda$static$0 = Utf8Old.lambda$static$0();
                return lambda$static$0;
            default:
                ((a) this.f214b).getClass();
                lambda$static$02 = ReadAheadInputStream.lambda$static$0();
                return lambda$static$02;
        }
    }
}
