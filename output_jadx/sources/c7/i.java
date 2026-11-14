package c7;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import b7.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f562m = 0;

    /* renamed from: a, reason: collision with root package name */
    public Camera f563a;

    /* renamed from: b, reason: collision with root package name */
    public Camera.CameraInfo f564b;
    public b c;
    public d6.a d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public String f565f;

    /* renamed from: h, reason: collision with root package name */
    public l f567h;

    /* renamed from: i, reason: collision with root package name */
    public u f568i;

    /* renamed from: j, reason: collision with root package name */
    public u f569j;

    /* renamed from: g, reason: collision with root package name */
    public j f566g = new j();

    /* renamed from: k, reason: collision with root package name */
    public int f570k = -1;

    /* renamed from: l, reason: collision with root package name */
    public final h f571l = new h(this);

    public i(Context context) {
    }

    public final int a() {
        int i10;
        int i11 = this.f567h.f575b;
        int i12 = 0;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        i12 = 270;
                    }
                } else {
                    i12 = 180;
                }
            } else {
                i12 = 90;
            }
        }
        Camera.CameraInfo cameraInfo = this.f564b;
        if (cameraInfo.facing == 1) {
            i10 = (360 - ((cameraInfo.orientation + i12) % 360)) % 360;
        } else {
            i10 = ((cameraInfo.orientation - i12) + 360) % 360;
        }
        Log.i("i", "Camera Display Orientation: " + i10);
        return i10;
    }

    public final void b() {
        if (this.f563a != null) {
            try {
                int a10 = a();
                this.f570k = a10;
                this.f563a.setDisplayOrientation(a10);
            } catch (Exception unused) {
                Log.w("i", "Failed to set rotation.");
            }
            try {
                c(false);
            } catch (Exception unused2) {
                try {
                    c(true);
                } catch (Exception unused3) {
                    Log.w("i", "Camera rejected even safe-mode parameters! No configuration");
                }
            }
            Camera.Size previewSize = this.f563a.getParameters().getPreviewSize();
            if (previewSize == null) {
                this.f569j = this.f568i;
            } else {
                this.f569j = new u(previewSize.width, previewSize.height);
            }
            this.f571l.f561b = this.f569j;
            return;
        }
        ai.onnxruntime.b.h("Camera not open");
    }

    public final void c(boolean z9) {
        boolean z10;
        String str;
        Camera.Parameters parameters = this.f563a.getParameters();
        String str2 = this.f565f;
        if (str2 == null) {
            this.f565f = parameters.flatten();
        } else {
            parameters.unflatten(str2);
        }
        if (parameters == null) {
            Log.w("i", "Device error: no camera parameters are available. Proceeding without configuration.");
            return;
        }
        Log.i("i", "Initial camera parameters: " + parameters.flatten());
        if (z9) {
            Log.w("i", "In camera config safe mode -- most settings will not be honored");
        }
        this.f566g.getClass();
        int i10 = c.f546a;
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        String a10 = c.a("focus mode", supportedFocusModes, "auto");
        if (!z9 && a10 == null) {
            a10 = c.a("focus mode", supportedFocusModes, "macro", "edof");
        }
        if (a10 != null) {
            if (a10.equals(parameters.getFocusMode())) {
                Log.i("CameraConfiguration", "Focus mode already set to ".concat(a10));
            } else {
                parameters.setFocusMode(a10);
            }
        }
        if (!z9) {
            c.b(parameters, false);
            this.f566g.getClass();
            this.f566g.getClass();
            this.f566g.getClass();
        }
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        ArrayList arrayList = new ArrayList();
        if (supportedPreviewSizes == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                arrayList.add(new u(previewSize.width, previewSize.height));
            }
        } else {
            for (Camera.Size size : supportedPreviewSizes) {
                arrayList.add(new u(size.width, size.height));
            }
        }
        int[] iArr = null;
        if (arrayList.size() == 0) {
            this.f568i = null;
        } else {
            l lVar = this.f567h;
            int i11 = this.f570k;
            if (i11 != -1) {
                if (i11 % 180 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u uVar = (u) lVar.c;
                if (uVar == null) {
                    uVar = null;
                } else if (z10) {
                    uVar = new u(uVar.c, uVar.f424b);
                }
                n nVar = (n) lVar.d;
                nVar.getClass();
                if (uVar != null) {
                    Collections.sort(arrayList, new m(nVar, uVar));
                }
                Log.i("n", "Viewfinder size: " + uVar);
                Log.i("n", "Preview in order of preference: " + arrayList);
                u uVar2 = (u) arrayList.get(0);
                this.f568i = uVar2;
                parameters.setPreviewSize(uVar2.f424b, uVar2.c);
            } else {
                j1.i.l("Rotation not calculated yet. Call configure() first.");
                return;
            }
        }
        if (Build.DEVICE.equals("glass-1")) {
            List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
            StringBuilder sb = new StringBuilder("Supported FPS ranges: ");
            if (supportedPreviewFpsRange != null && !supportedPreviewFpsRange.isEmpty()) {
                StringBuilder sb2 = new StringBuilder("[");
                Iterator<int[]> it = supportedPreviewFpsRange.iterator();
                while (it.hasNext()) {
                    sb2.append(Arrays.toString(it.next()));
                    if (it.hasNext()) {
                        sb2.append(", ");
                    }
                }
                sb2.append(']');
                str = sb2.toString();
            } else {
                str = HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
            }
            sb.append(str);
            Log.i("CameraConfiguration", sb.toString());
            if (supportedPreviewFpsRange != null && !supportedPreviewFpsRange.isEmpty()) {
                Iterator<int[]> it2 = supportedPreviewFpsRange.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    int[] next = it2.next();
                    int i12 = next[0];
                    int i13 = next[1];
                    if (i12 >= 10000 && i13 <= 20000) {
                        iArr = next;
                        break;
                    }
                }
                if (iArr == null) {
                    Log.i("CameraConfiguration", "No suitable FPS range?");
                } else {
                    int[] iArr2 = new int[2];
                    parameters.getPreviewFpsRange(iArr2);
                    if (Arrays.equals(iArr2, iArr)) {
                        Log.i("CameraConfiguration", "FPS range already set to " + Arrays.toString(iArr));
                    } else {
                        Log.i("CameraConfiguration", "Setting FPS range to " + Arrays.toString(iArr));
                        parameters.setPreviewFpsRange(iArr[0], iArr[1]);
                    }
                }
            }
        }
        Log.i("i", "Final camera parameters: " + parameters.flatten());
        this.f563a.setParameters(parameters);
    }

    public final void d(boolean z9) {
        boolean z10;
        String flashMode;
        Camera camera = this.f563a;
        if (camera != null) {
            try {
                Camera.Parameters parameters = camera.getParameters();
                if (parameters != null && (flashMode = parameters.getFlashMode()) != null && ("on".equals(flashMode) || "torch".equals(flashMode))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z9 != z10) {
                    b bVar = this.c;
                    if (bVar != null) {
                        bVar.c();
                    }
                    Camera.Parameters parameters2 = this.f563a.getParameters();
                    c.b(parameters2, z9);
                    this.f566g.getClass();
                    this.f563a.setParameters(parameters2);
                    b bVar2 = this.c;
                    if (bVar2 != null) {
                        bVar2.f543a = false;
                        bVar2.b();
                    }
                }
            } catch (RuntimeException e) {
                Log.e("i", "Failed to set torch", e);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, d6.a] */
    public final void e() {
        Camera camera = this.f563a;
        if (camera != null && !this.e) {
            camera.startPreview();
            this.e = true;
            this.c = new b(this.f563a, this.f566g);
            j jVar = this.f566g;
            ?? obj = new Object();
            obj.f1839a = this;
            obj.f1840b = new Handler();
            this.d = obj;
            jVar.getClass();
        }
    }
}
