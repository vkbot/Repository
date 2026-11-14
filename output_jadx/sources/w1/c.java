package w1;

import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6306b;
    public final /* synthetic */ i c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(i iVar, int i10) {
        super(1);
        this.f6306b = i10;
        this.c = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f6306b) {
            case 0:
                return String.format(this.c.getLocale(), "%.0f", Arrays.copyOf(new Object[]{Float.valueOf(((Number) obj).floatValue())}, 1));
            case 1:
                return String.format(this.c.getLocale(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(((Number) obj).floatValue())}, 1));
            default:
                return String.format(this.c.getLocale(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(((Number) obj).floatValue())}, 1));
        }
    }
}
