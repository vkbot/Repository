package a9;

import kotlin.text.Typography;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class w implements b8.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f88b;
    public final String c;

    public w(String str) {
        this.f88b = 2;
        str.getClass();
        this.c = str;
    }

    @Override // b8.d
    public boolean test(Object obj) {
        String str = this.c;
        if (obj != str) {
            if (obj == null || !obj.equals(str)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public String toString() {
        switch (this.f88b) {
            case 0:
                return "<" + this.c + Typography.greater;
            case 3:
                return this.c;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ w(String str, int i10) {
        this.f88b = i10;
        this.c = str;
    }
}
