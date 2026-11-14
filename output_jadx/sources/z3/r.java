package z3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class r extends x {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Matrix d;

    public r(ArrayList arrayList, Matrix matrix) {
        this.c = arrayList;
        this.d = matrix;
    }

    @Override // z3.x
    public final void a(Matrix matrix, y3.a aVar, int i10, Canvas canvas) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((x) obj).a(this.d, aVar, i10, canvas);
        }
    }
}
