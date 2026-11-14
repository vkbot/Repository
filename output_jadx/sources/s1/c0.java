package s1;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import e0.j2;
import java.io.File;
import java.util.ArrayList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5479b;
    public final /* synthetic */ q0 c;

    public /* synthetic */ c0(q0 q0Var, int i10) {
        this.f5479b = i10;
        this.c = q0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        int i10 = 0;
        switch (this.f5479b) {
            case 0:
                this.c.s();
                return;
            case 1:
                q0 q0Var = this.c;
                if (!q0Var.E) {
                    File file = new File(q0Var.getContext().getFilesDir(), q0.L);
                    if (file.isFile() && file.length() != 0) {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        int i11 = 1;
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                        if (options.outWidth > 0 && options.outHeight > 0) {
                            int max = Math.max(1280, q0Var.getResources().getDisplayMetrics().widthPixels);
                            int max2 = Math.max(720, q0Var.getResources().getDisplayMetrics().heightPixels);
                            while (true) {
                                int i12 = i11 * 2;
                                if (options.outWidth / i12 >= max && options.outHeight / i12 >= max2) {
                                    i11 = i12;
                                }
                            }
                            BitmapFactory.Options options2 = new BitmapFactory.Options();
                            options2.inSampleSize = i11;
                            bitmap = BitmapFactory.decodeFile(file.getAbsolutePath(), options2);
                        } else {
                            bitmap = null;
                        }
                        if (bitmap != null) {
                            q0Var.r.post(new j2(29, q0Var, bitmap));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                this.c.B = false;
                return;
            case 3:
                q0 q0Var2 = this.c;
                if (!q0Var2.E) {
                    y5.k.x(q0Var2.getContext(), e0.m.h(new byte[]{82, 27, -77, 18, 98, 37, 49, 109, 54, 86, -45, 119, -7, 36, 12, 108, 3, 87, -17, -121, -109, 117, 98, 3, 83, 3, -78, 39, -110, 68, 98, 0, 82, 62, -78, 37, -109, 120, -110, 109, 63, 86, -35, 119, -16, 37, 57, 109, 59, -90, -78, 35, -110, 74, 98, 0}, new byte[]{-126, -122, 99, -89, 66, -12, -78, -67}));
                    return;
                }
                return;
            case 4:
                q0 q0Var3 = this.c;
                if (!q0Var3.E) {
                    y5.k.x(q0Var3.getContext(), e0.m.h(new byte[]{-5, 74, 47, 125, 2, 81, 118, -81, -86, 7, 74, 25, 81, 3, -18, 94, -55, 87, 107, -24, 3, 109, -121, -1, -6, 85, 47, 120, 3, 97, -122, -59, -5, 98, 47, 117, -13, 2, -41, -82, -107, 6, 122, 25, 83, 3, -26, -82, -106, 6, 110, 24, 110, 3, -21, -81, -96, 7, 70, -24, 2, 87, -122, -64, -5, 106}, new byte[]{43, -41, -1, -56, -45, -45, 86, 126}));
                    return;
                }
                return;
            case 5:
                q0 q0Var4 = this.c;
                if (!q0Var4.E) {
                    q0Var4.B = false;
                    return;
                }
                return;
            default:
                q0 q0Var5 = this.c;
                ArrayList arrayList = new ArrayList(q0Var5.getContext().getPackageManager().queryIntentActivities(new Intent(e0.m.h(new byte[]{-30, -82, 82, 74, -43, 63, 102, 113, -22, -82, 66, 93, -44, 34, 44, 62, -32, -76, 95, 87, -44, 120, 79, 30, -54, -114}, new byte[]{-125, -64, 54, 56, -70, 86, 2, 95})).addCategory(e0.m.h(new byte[]{1, 90, -76, 105, -11, 5, -112, 105, 9, 90, -92, 126, -12, 24, -38, 36, 1, 64, -75, 124, -11, 30, -115, 105, 44, 117, -123, 85, -39, 36, -79, 21}, new byte[]{96, 52, -48, 27, -102, 108, -12, 71})), 0));
                arrayList.removeIf(new i7.c(9, q0Var5));
                arrayList.sort(new h3.d(2, q0Var5));
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    arrayList2.add(j0.e.b((ResolveInfo) obj, q0Var5.getContext().getPackageManager()));
                }
                q0Var5.r.post(new b1.n(q0Var5, arrayList2, arrayList, 13));
                return;
        }
    }
}
