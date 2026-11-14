package n;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e implements com.bumptech.glide.load.data.e {

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f4010b;
    public final Resources c;
    public final com.bumptech.glide.manager.o d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public Object f4011f;

    public e(Resources.Theme theme, Resources resources, com.bumptech.glide.manager.o oVar, int i10) {
        this.f4010b = theme;
        this.c = resources;
        this.d = oVar;
        this.e = i10;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        switch (this.d.f669b) {
            case 3:
                return AssetFileDescriptor.class;
            case 4:
                return Drawable.class;
            default:
                return InputStream.class;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        Object obj = this.f4011f;
        if (obj != null) {
            try {
                switch (this.d.f669b) {
                    case 3:
                        ((AssetFileDescriptor) obj).close();
                        break;
                    case 4:
                        break;
                    default:
                        ((InputStream) obj).close();
                        break;
                }
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final int c() {
        return 1;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.h hVar, com.bumptech.glide.load.data.d dVar) {
        Object openRawResourceFd;
        try {
            com.bumptech.glide.manager.o oVar = this.d;
            Resources.Theme theme = this.f4010b;
            Resources resources = this.c;
            int i10 = this.e;
            switch (oVar.f669b) {
                case 3:
                    openRawResourceFd = resources.openRawResourceFd(i10);
                    break;
                case 4:
                    Context context = oVar.c;
                    openRawResourceFd = com.bumptech.glide.c.m(context, context, i10, theme);
                    break;
                default:
                    openRawResourceFd = resources.openRawResource(i10);
                    break;
            }
            this.f4011f = openRawResourceFd;
            dVar.f(openRawResourceFd);
        } catch (Resources.NotFoundException e) {
            dVar.d(e);
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
    }
}
