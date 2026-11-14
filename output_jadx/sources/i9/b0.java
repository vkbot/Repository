package i9;

import androidx.navigation.serialization.RouteDecoder;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.ArraysKt;
import kotlin.text.Typography;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class b0 implements e9.b {

    /* renamed from: a, reason: collision with root package name */
    public final Enum[] f2868a;

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f2869b;

    public b0(String str, Enum[] enumArr) {
        str.getClass();
        enumArr.getClass();
        this.f2868a = enumArr;
        this.f2869b = LazyKt.lazy(new r(1, this, str));
    }

    @Override // e9.h, e9.a
    public final g9.e a() {
        return (g9.e) this.f2869b.getValue();
    }

    @Override // e9.h
    public final void b(h9.b bVar, Object obj) {
        Enum r52 = (Enum) obj;
        r52.getClass();
        Enum[] enumArr = this.f2868a;
        int indexOf = ArraysKt.indexOf(enumArr, r52);
        if (indexOf != -1) {
            bVar.encodeEnum(a(), indexOf);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r52);
        String a10 = a().a();
        String arrays = Arrays.toString(enumArr);
        arrays.getClass();
        sb.append(" is not a valid enum ");
        sb.append(a10);
        sb.append(", must be one of ");
        sb.append(arrays);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // e9.a
    public final Object c(RouteDecoder routeDecoder) {
        int decodeEnum = routeDecoder.decodeEnum(a());
        Enum[] enumArr = this.f2868a;
        if (decodeEnum >= 0 && decodeEnum < enumArr.length) {
            return enumArr[decodeEnum];
        }
        throw new IllegalArgumentException(decodeEnum + " is not among valid " + a().a() + " enum values, values size is " + enumArr.length);
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + a().a() + Typography.greater;
    }
}
