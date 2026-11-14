package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f647f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(ContentResolver contentResolver, Uri uri, int i10) {
        super(1, uri, contentResolver);
        this.f647f = i10;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        switch (this.f647f) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // com.bumptech.glide.load.data.b
    public final void g(Object obj) {
        switch (this.f647f) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                return;
            default:
                ((ParcelFileDescriptor) obj).close();
                return;
        }
    }

    @Override // com.bumptech.glide.load.data.b
    public final Object i(Uri uri, ContentResolver contentResolver) {
        switch (this.f647f) {
            case 0:
                AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                if (openAssetFileDescriptor == null) {
                    org.apache.commons.io.e.a(uri, "FileDescriptor is null for: ");
                    return null;
                }
                return openAssetFileDescriptor;
            default:
                AssetFileDescriptor openAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(uri, "r");
                if (openAssetFileDescriptor2 != null) {
                    return openAssetFileDescriptor2.getParcelFileDescriptor();
                }
                org.apache.commons.io.e.a(uri, "FileDescriptor is null for: ");
                return null;
        }
    }
}
