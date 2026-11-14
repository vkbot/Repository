package o;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import h.h;
import java.io.File;
import java.io.FileNotFoundException;
import n.q;
import n.r;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d implements com.bumptech.glide.load.data.e {

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f4274l = {"_data"};

    /* renamed from: b, reason: collision with root package name */
    public final Context f4275b;
    public final r c;
    public final r d;
    public final Uri e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4276f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4277g;

    /* renamed from: h, reason: collision with root package name */
    public final h f4278h;

    /* renamed from: i, reason: collision with root package name */
    public final Class f4279i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f4280j;

    /* renamed from: k, reason: collision with root package name */
    public volatile com.bumptech.glide.load.data.e f4281k;

    public d(Context context, r rVar, r rVar2, Uri uri, int i10, int i11, h hVar, Class cls) {
        this.f4275b = context.getApplicationContext();
        this.c = rVar;
        this.d = rVar2;
        this.e = uri;
        this.f4276f = i10;
        this.f4277g = i11;
        this.f4278h = hVar;
        this.f4279i = cls;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return this.f4279i;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        com.bumptech.glide.load.data.e eVar = this.f4281k;
        if (eVar != null) {
            eVar.b();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final int c() {
        return 1;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        this.f4280j = true;
        com.bumptech.glide.load.data.e eVar = this.f4281k;
        if (eVar != null) {
            eVar.cancel();
        }
    }

    public final com.bumptech.glide.load.data.e d() {
        boolean isExternalStorageLegacy;
        q b10;
        isExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        Context context = this.f4275b;
        h hVar = this.f4278h;
        int i10 = this.f4277g;
        int i11 = this.f4276f;
        if (isExternalStorageLegacy) {
            Uri uri = this.e;
            try {
                Cursor query = context.getContentResolver().query(uri, f4274l, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            String string = query.getString(query.getColumnIndexOrThrow("_data"));
                            if (!TextUtils.isEmpty(string)) {
                                File file = new File(string);
                                query.close();
                                b10 = this.c.b(file, i11, i10, hVar);
                            } else {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = query;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            Uri uri2 = this.e;
            boolean n10 = a.a.n(uri2);
            r rVar = this.d;
            if (n10 && uri2.getPathSegments().contains("picker")) {
                b10 = rVar.b(uri2, i11, i10, hVar);
            } else {
                if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    uri2 = MediaStore.setRequireOriginal(uri2);
                }
                b10 = rVar.b(uri2, i11, i10, hVar);
            }
        }
        if (b10 == null) {
            return null;
        }
        return b10.c;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.h hVar, com.bumptech.glide.load.data.d dVar) {
        try {
            com.bumptech.glide.load.data.e d = d();
            if (d == null) {
                dVar.d(new IllegalArgumentException("Failed to build fetcher for: " + this.e));
            } else {
                this.f4281k = d;
                if (this.f4280j) {
                    cancel();
                } else {
                    d.e(hVar, dVar);
                }
            }
        } catch (FileNotFoundException e) {
            dVar.d(e);
        }
    }
}
