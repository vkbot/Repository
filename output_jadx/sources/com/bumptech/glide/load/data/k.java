package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.InputStream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class k extends b {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f653f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(AssetManager assetManager, String str, int i10) {
        super(0, str, assetManager);
        this.f653f = i10;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        switch (this.f653f) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // com.bumptech.glide.load.data.b
    public final void g(Object obj) {
        switch (this.f653f) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                return;
            default:
                ((InputStream) obj).close();
                return;
        }
    }

    @Override // com.bumptech.glide.load.data.b
    public final Object h(AssetManager assetManager, String str) {
        switch (this.f653f) {
            case 0:
                return assetManager.openFd(str);
            default:
                return assetManager.open(str);
        }
    }
}
