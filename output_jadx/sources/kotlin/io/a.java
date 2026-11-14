package kotlin.io;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3443b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ a(ArrayList arrayList, int i10) {
        this.f3443b = i10;
        this.c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f3443b) {
            case 0:
                return FilesKt__FileReadWriteKt.a((String) obj, this.c);
            default:
                return TextStreamsKt.a((String) obj, this.c);
        }
    }
}
