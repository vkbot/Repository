package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f650a;

    public /* synthetic */ h(int i10) {
        this.f650a = i10;
    }

    @Override // com.bumptech.glide.load.data.f
    public final Class a() {
        switch (this.f650a) {
            case 0:
                throw new UnsupportedOperationException("Not implemented");
            case 1:
                return ParcelFileDescriptor.class;
            default:
                return ByteBuffer.class;
        }
    }

    @Override // com.bumptech.glide.load.data.f
    public final g b(Object obj) {
        switch (this.f650a) {
            case 0:
                return new i(obj);
            case 1:
                return new i((ParcelFileDescriptor) obj);
            default:
                return new q.k((ByteBuffer) obj, 3);
        }
    }
}
