package n7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4173a = 0;

    /* renamed from: b, reason: collision with root package name */
    public List f4174b;
    public b c;
    public Object[][] d;

    public e0(List list, b bVar, Object[][] objArr) {
        o4.b.i(list, "addresses are not set");
        this.f4174b = list;
        o4.b.i(bVar, "attrs");
        this.c = bVar;
        o4.b.i(objArr, "customOptions");
        this.d = objArr;
    }

    public static e0 d() {
        e0 e0Var = new e0();
        e0Var.c = b.f4157b;
        e0Var.d = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        return e0Var;
    }

    public void a(i0 i0Var) {
        h hVar;
        int i10 = 0;
        while (true) {
            Object[][] objArr = this.d;
            int length = objArr.length;
            hVar = j0.c;
            if (i10 < length) {
                if (hVar.equals(objArr[i10][0])) {
                    break;
                } else {
                    i10++;
                }
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 == -1) {
            Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, this.d.length + 1, 2);
            Object[][] objArr3 = this.d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.d = objArr2;
            i10 = objArr2.length - 1;
        }
        this.d[i10] = new Object[]{hVar, i0Var};
    }

    public e0 b() {
        return new e0(this.f4174b, this.c, this.d);
    }

    public Object c() {
        Object[][] objArr = this.d;
        for (int i10 = 0; i10 < objArr.length; i10++) {
            if (j0.c.equals(objArr[i10][0])) {
                return objArr[i10][1];
            }
        }
        return null;
    }

    public void e(List list) {
        o4.b.d("addrs is empty", !list.isEmpty());
        this.f4174b = Collections.unmodifiableList(new ArrayList(list));
    }

    public String toString() {
        switch (this.f4173a) {
            case 1:
                com.bumptech.glide.manager.s t = com.bumptech.glide.c.t(this);
                t.c(this.f4174b, "addrs");
                t.c(this.c, "attrs");
                t.c(Arrays.deepToString(this.d), "customOptions");
                return t.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ e0() {
    }
}
