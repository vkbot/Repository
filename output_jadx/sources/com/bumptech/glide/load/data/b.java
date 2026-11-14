package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetManager;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class b implements e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f648b;
    public Object c;
    public final Comparable d;
    public final Object e;

    public /* synthetic */ b(int i10, Comparable comparable, Object obj) {
        this.f648b = i10;
        this.e = obj;
        this.d = comparable;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        switch (this.f648b) {
            case 0:
                Object obj = this.c;
                if (obj != null) {
                    try {
                        g(obj);
                    } catch (IOException unused) {
                        return;
                    }
                }
                return;
            default:
                Object obj2 = this.c;
                if (obj2 != null) {
                    try {
                        g(obj2);
                        return;
                    } catch (IOException unused2) {
                        return;
                    }
                }
                return;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final int c() {
        switch (this.f648b) {
            case 0:
                return 1;
            default:
                return 1;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        int i10 = this.f648b;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.h hVar, d dVar) {
        switch (this.f648b) {
            case 0:
                try {
                    Object h2 = h((AssetManager) this.e, (String) this.d);
                    this.c = h2;
                    dVar.f(h2);
                    return;
                } catch (IOException e) {
                    if (Log.isLoggable("AssetPathFetcher", 3)) {
                        Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
                    }
                    dVar.d(e);
                    return;
                }
            default:
                try {
                    Object i10 = i((Uri) this.d, (ContentResolver) this.e);
                    this.c = i10;
                    dVar.f(i10);
                    return;
                } catch (FileNotFoundException e6) {
                    if (Log.isLoggable("LocalUriFetcher", 3)) {
                        Log.d("LocalUriFetcher", "Failed to open Uri", e6);
                    }
                    dVar.d(e6);
                    return;
                }
        }
    }

    public abstract void g(Object obj);

    public abstract Object h(AssetManager assetManager, String str);

    public abstract Object i(Uri uri, ContentResolver contentResolver);

    private final void d() {
    }

    private final void f() {
    }
}
