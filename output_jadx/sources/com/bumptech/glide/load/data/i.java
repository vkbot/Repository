package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.HashMap;
import q.x;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class i implements g {
    public static final h d = new h(0);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f651b;
    public final Object c;

    public i(InputStream inputStream, k.g gVar) {
        this.f651b = 3;
        x xVar = new x(inputStream, gVar);
        this.c = xVar;
        xVar.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.g
    public void b() {
        switch (this.f651b) {
            case 1:
            case 2:
                return;
            default:
                ((x) this.c).c();
                return;
        }
    }

    @Override // com.bumptech.glide.load.data.g
    public Object d() {
        switch (this.f651b) {
            case 1:
                return ((ParcelFileDescriptorRewinder$InternalRewinder) this.c).rewind();
            case 2:
                return this.c;
            default:
                x xVar = (x) this.c;
                xVar.reset();
                return xVar;
        }
    }

    public ParcelFileDescriptor e() {
        return ((ParcelFileDescriptorRewinder$InternalRewinder) this.c).rewind();
    }

    public i() {
        this.f651b = 0;
        this.c = new HashMap();
    }

    private final void a() {
    }

    private final void c() {
    }

    public i(ParcelFileDescriptor parcelFileDescriptor) {
        this.f651b = 1;
        this.c = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    public i(Object obj) {
        this.f651b = 2;
        this.c = obj;
    }
}
