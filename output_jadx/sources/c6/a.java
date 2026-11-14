package c6;

import kotlin.text.Typography;
import z5.o;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f535a;

    /* renamed from: b, reason: collision with root package name */
    public int f536b;
    public int c;

    public /* synthetic */ a(int i10, int i11, int i12) {
        this.f535a = i12;
        this.f536b = i10;
        this.c = i11;
    }

    public o a() {
        return new o(this.f536b, this.c);
    }

    public String toString() {
        switch (this.f535a) {
            case 0:
                return "<" + this.f536b + ' ' + this.c + Typography.greater;
            default:
                return super.toString();
        }
    }
}
