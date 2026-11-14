package c7;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.view.SurfaceHolder;
import b7.p;
import b7.u;
import com.example.navistart.R;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f549b;
    public final /* synthetic */ g c;

    public /* synthetic */ f(g gVar, int i10) {
        this.f549b = i10;
        this.c = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z9 = false;
        Camera camera = null;
        u uVar = null;
        switch (this.f549b) {
            case 0:
                g gVar = this.c;
                try {
                    Log.d("g", "Opening camera");
                    i iVar = gVar.c;
                    int h2 = b1.u.h(iVar.f566g.f572a);
                    if (h2 != -1) {
                        camera = Camera.open(h2);
                    }
                    iVar.f563a = camera;
                    if (camera != null) {
                        int h10 = b1.u.h(iVar.f566g.f572a);
                        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                        iVar.f564b = cameraInfo;
                        Camera.getCameraInfo(h10, cameraInfo);
                        return;
                    }
                    ai.onnxruntime.b.h("Failed to open camera");
                    return;
                } catch (Exception e) {
                    Handler handler = gVar.d;
                    if (handler != null) {
                        handler.obtainMessage(R.id.zxing_camera_error, e).sendToTarget();
                    }
                    Log.e("g", "Failed to open camera", e);
                    return;
                }
            case 1:
                g gVar2 = this.c;
                i iVar2 = gVar2.c;
                try {
                    Log.d("g", "Configuring camera");
                    iVar2.b();
                    Handler handler2 = gVar2.d;
                    if (handler2 != null) {
                        u uVar2 = iVar2.f569j;
                        if (uVar2 != null) {
                            int i10 = iVar2.f570k;
                            if (i10 != -1) {
                                if (i10 % 180 != 0) {
                                    z9 = true;
                                }
                                if (z9) {
                                    uVar = new u(uVar2.c, uVar2.f424b);
                                } else {
                                    uVar = uVar2;
                                }
                            } else {
                                throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
                            }
                        }
                        handler2.obtainMessage(R.id.zxing_prewiew_size_ready, uVar).sendToTarget();
                        return;
                    }
                    return;
                } catch (Exception e6) {
                    Handler handler3 = gVar2.d;
                    if (handler3 != null) {
                        handler3.obtainMessage(R.id.zxing_camera_error, e6).sendToTarget();
                    }
                    Log.e("g", "Failed to configure camera", e6);
                    return;
                }
            case 2:
                g gVar3 = this.c;
                i iVar3 = gVar3.c;
                try {
                    Log.d("g", "Starting preview");
                    android.support.v4.media.h hVar = gVar3.f552b;
                    Camera camera2 = iVar3.f563a;
                    SurfaceHolder surfaceHolder = (SurfaceHolder) hVar.c;
                    if (surfaceHolder != null) {
                        camera2.setPreviewDisplay(surfaceHolder);
                    } else {
                        camera2.setPreviewTexture((SurfaceTexture) hVar.d);
                    }
                    iVar3.e();
                    return;
                } catch (Exception e10) {
                    Handler handler4 = gVar3.d;
                    if (handler4 != null) {
                        handler4.obtainMessage(R.id.zxing_camera_error, e10).sendToTarget();
                    }
                    Log.e("g", "Failed to start preview", e10);
                    return;
                }
            default:
                try {
                    Log.d("g", "Closing camera");
                    i iVar4 = this.c.c;
                    b bVar = iVar4.c;
                    if (bVar != null) {
                        bVar.c();
                        iVar4.c = null;
                    }
                    if (iVar4.d != null) {
                        iVar4.d = null;
                    }
                    Camera camera3 = iVar4.f563a;
                    if (camera3 != null && iVar4.e) {
                        camera3.stopPreview();
                        iVar4.f571l.f560a = null;
                        iVar4.e = false;
                    }
                    i iVar5 = this.c.c;
                    Camera camera4 = iVar5.f563a;
                    if (camera4 != null) {
                        camera4.release();
                        iVar5.f563a = null;
                    }
                } catch (Exception e11) {
                    Log.e("g", "Failed to close camera", e11);
                }
                g gVar4 = this.c;
                gVar4.f554g = true;
                gVar4.d.sendEmptyMessage(R.id.zxing_camera_closed);
                p pVar = this.c.f551a;
                synchronized (pVar.e) {
                    int i11 = pVar.f420b - 1;
                    pVar.f420b = i11;
                    if (i11 == 0) {
                        synchronized (pVar.e) {
                            ((HandlerThread) pVar.d).quit();
                            pVar.d = null;
                            pVar.c = null;
                        }
                    }
                }
                return;
        }
    }
}
