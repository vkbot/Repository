package b7;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c implements TextureView.SurfaceTextureListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f371b;

    public c(f fVar) {
        this.f371b = fVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        onSurfaceTextureSizeChanged(surfaceTexture, i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        u uVar = new u(i10, i11);
        f fVar = this.f371b;
        fVar.f387q = uVar;
        fVar.e();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
