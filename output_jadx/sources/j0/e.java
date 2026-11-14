package j0;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import e0.g0;
import e0.m;
import j1.t;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public d f3094a;

    /* renamed from: b, reason: collision with root package name */
    public n0.d f3095b;
    public String c;
    public String d;
    public String e;

    /* renamed from: f, reason: collision with root package name */
    public t f3096f;

    /* renamed from: g, reason: collision with root package name */
    public int f3097g;

    /* renamed from: h, reason: collision with root package name */
    public int f3098h = 50;

    /* renamed from: i, reason: collision with root package name */
    public String f3099i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f3100j;

    public static BitmapDrawable a(Drawable drawable, Drawable drawable2, int i10, int i11, Context context) {
        if (drawable != null && drawable2 != null) {
            Bitmap createBitmap = Bitmap.createBitmap(72, 72, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            if (i11 != 30 && i11 != 70) {
                i11 = 50;
            }
            int i12 = (i11 * 72) / 100;
            if (i10 == 1) {
                drawable.setBounds(0, 0, 72, i12);
                drawable.draw(canvas);
                drawable2.setBounds(0, i12, 72, 72);
                drawable2.draw(canvas);
            } else {
                drawable.setBounds(0, 0, i12, 72);
                drawable.draw(canvas);
                drawable2.setBounds(i12, 0, 72, 72);
                drawable2.draw(canvas);
            }
            return new BitmapDrawable(context.getResources(), createBitmap);
        }
        return null;
    }

    public static e b(ResolveInfo resolveInfo, PackageManager packageManager) {
        e eVar = new e();
        eVar.f3094a = d.c;
        eVar.c = resolveInfo.activityInfo.packageName;
        eVar.f3099i = resolveInfo.loadLabel(packageManager).toString();
        eVar.f3100j = resolveInfo.loadIcon(packageManager);
        return eVar;
    }

    public static e c(n0.d dVar, Context context) {
        e eVar = new e();
        eVar.f3094a = d.f3092b;
        eVar.f3095b = dVar;
        eVar.f3099i = com.bumptech.glide.d.b(dVar.f4114b);
        try {
            eVar.f3100j = context.getDrawable(dVar.c);
            return eVar;
        } catch (Exception unused) {
            eVar.f3100j = null;
            return eVar;
        }
    }

    public static e d(t tVar, Context context) {
        Drawable drawable;
        if (tVar != null) {
            String str = tVar.f3238a;
            if (tVar.a()) {
                Context b10 = g0.b(context);
                e eVar = new e();
                eVar.f3094a = d.e;
                eVar.e = str;
                eVar.f3096f = tVar;
                String str2 = tVar.f3239b;
                if (str2 != null && !str2.trim().isEmpty()) {
                    str = str2;
                } else {
                    int i10 = tVar.c;
                    if (i10 != 0) {
                        str = b10.getString(i10);
                    } else if (str == null) {
                        str = "";
                    }
                }
                eVar.f3099i = str;
                try {
                    int i11 = tVar.d;
                    if (i11 == 0) {
                        drawable = null;
                    } else {
                        drawable = b10.getDrawable(i11);
                    }
                    eVar.f3100j = drawable;
                    return eVar;
                } catch (Exception unused) {
                    eVar.f3100j = null;
                    return eVar;
                }
            }
        }
        return null;
    }

    public static e e(Context context, String str, int i10, int i11, String str2) {
        if (str != null && str2 != null) {
            PackageManager packageManager = context.getPackageManager();
            String trim = str.trim();
            String trim2 = str2.trim();
            if (!trim.isEmpty() && !trim2.isEmpty()) {
                try {
                    ApplicationInfo applicationInfo = packageManager.getApplicationInfo(trim, 0);
                    ApplicationInfo applicationInfo2 = packageManager.getApplicationInfo(trim2, 0);
                    e eVar = new e();
                    eVar.f3094a = d.d;
                    eVar.c = trim;
                    eVar.d = trim2;
                    int i12 = 2;
                    if (i10 != 2) {
                        i12 = 1;
                    }
                    eVar.f3097g = i12;
                    if (i11 != 30 && i11 != 70) {
                        i11 = 50;
                    }
                    eVar.f3098h = i11;
                    eVar.f3099i = packageManager.getApplicationLabel(applicationInfo).toString() + m.h(new byte[]{89}, new byte[]{118, -22, 34, 98, -42, 17, 59, 23}) + packageManager.getApplicationLabel(applicationInfo2).toString() + " " + eVar.f3098h + m.h(new byte[]{79}, new byte[]{96, -88, 12, 111, 84, 109, 19, -108}) + (100 - eVar.f3098h);
                    eVar.f3100j = a(packageManager.getApplicationIcon(applicationInfo), packageManager.getApplicationIcon(applicationInfo2), eVar.f3097g, eVar.f3098h, context);
                    return eVar;
                } catch (Exception unused) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public final String toString() {
        return this.f3099i;
    }
}
