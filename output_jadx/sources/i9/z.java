package i9;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.apache.commons.io.FilenameUtils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class z extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2968b;
    public final /* synthetic */ String c;
    public final /* synthetic */ a0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(int i10, String str, a0 a0Var) {
        super(0);
        this.f2968b = i10;
        this.c = str;
        this.d = a0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i10 = this.f2968b;
        g9.e[] eVarArr = new g9.e[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            eVarArr[i11] = com.bumptech.glide.c.b(this.c + FilenameUtils.EXTENSION_SEPARATOR + this.d.e[i11], g9.j.f2519g, new g9.e[0], g9.i.f2517b);
        }
        return eVarArr;
    }
}
