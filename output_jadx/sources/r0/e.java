package r0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import e0.m;
import j0.f;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e {
    public static final String c = m.h(new byte[]{-122, -101, 5, 21, 79, 69, -86, 70, -114, -79, 12, 8, 65, 114, -85, 106, -119, -101, 29, 21, 73, 116, -84}, new byte[]{-21, -18, 105, 97, 38, 26, -33, 53});
    public static final String d = m.h(new byte[]{-30, 124, ByteCompanionObject.MIN_VALUE, -31, -16, -11, 60, -13, -5, 96, -125, -5, -58}, new byte[]{-113, 9, -20, -107, -103, -86, 93, -112});

    /* renamed from: a, reason: collision with root package name */
    public final Context f5346a;

    /* renamed from: b, reason: collision with root package name */
    public final d6.d f5347b;

    /* JADX WARN: Type inference failed for: r0v0, types: [d6.d, java.lang.Object] */
    public e(Context context) {
        this.f5346a = context;
        ?? obj = new Object();
        obj.f1842a = true;
        obj.f1843b = new j0.e[8];
        for (int i10 = 0; i10 < 8; i10++) {
            ((j0.e[]) obj.f1843b)[i10] = j0.e.c(n0.d.e, context);
        }
        this.f5347b = obj;
    }

    public static Drawable[] a(Context context) {
        Drawable drawable;
        Drawable[] drawableArr = new Drawable[8];
        for (int i10 = 0; i10 < 8; i10++) {
            j0.e e = f.e(context, d + i10);
            if (f.d(e)) {
                drawable = e.f3100j;
            } else {
                drawable = null;
            }
            drawableArr[i10] = drawable;
        }
        return drawableArr;
    }
}
