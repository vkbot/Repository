package s1;

import android.content.Context;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.hardware.display.VirtualDisplay;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.example.navistart.home.LauncherWindowService;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b extends FrameLayout implements TextureView.SurfaceTextureListener {

    /* renamed from: b, reason: collision with root package name */
    public final String f5464b;
    public final String c;
    public final TextureView d;
    public final TextView e;

    /* renamed from: f, reason: collision with root package name */
    public final x f5465f;

    /* renamed from: g, reason: collision with root package name */
    public LauncherWindowService f5466g;

    /* renamed from: h, reason: collision with root package name */
    public Surface f5467h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5468i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5469j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5470k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5471l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5472m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5473n;

    /* renamed from: o, reason: collision with root package name */
    public int f5474o;

    /* renamed from: p, reason: collision with root package name */
    public long f5475p;

    /* renamed from: q, reason: collision with root package name */
    public final f5.j f5476q;
    public final a r;

    public b(Context context, String str, String str2) {
        super(context);
        this.f5470k = true;
        this.f5472m = true;
        this.f5474o = -1;
        this.f5476q = new f5.j(16, this);
        this.r = new a(this);
        this.f5464b = str;
        this.c = str2;
        this.f5465f = x.a(context);
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setSurfaceTextureListener(this);
        addView(textureView, new FrameLayout.LayoutParams(-1, -1));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextColor(-1);
        textView.setTextSize(14.0f);
        textView.setGravity(17);
        textView.setBackgroundColor(-15260882);
        addView(textView, new FrameLayout.LayoutParams(-1, -1));
        f(e0.m.h(new byte[]{-42, 55, -120, 74, -64, -16, 11, -29, -42, 25, -120, 65, -64, -16, 11, -30, -28, 41, -2}, new byte[]{6, -87, 88, -4, 16, 72, -37, 87}));
        textureView.setOnTouchListener(new e4.i(1, this));
    }

    public final void a() {
        if (!this.f5469j && this.f5470k && this.f5466g != null) {
            TextureView textureView = this.d;
            if (textureView.isAvailable()) {
                try {
                    if (this.f5467h == null) {
                        this.f5467h = new Surface(textureView.getSurfaceTexture());
                    }
                    int max = Math.max(1, textureView.getWidth());
                    int max2 = Math.max(1, textureView.getHeight());
                    textureView.getSurfaceTexture().setDefaultBufferSize(max, max2);
                    int displayId = this.f5466g.a(this.f5464b, max, max2, this.f5467h).getDisplay().getDisplayId();
                    if (displayId != this.f5474o) {
                        this.f5474o = displayId;
                        this.f5472m = true;
                    }
                    d();
                } catch (RuntimeException e) {
                    f(e0.m.h(new byte[]{-74, -61, ByteCompanionObject.MAX_VALUE, -124, 67, -18, -9, 47, 92, 125}, new byte[]{102, 93, -81, 62, -109, 83, 39, -111}).concat(e.getClass().getSimpleName()));
                }
            }
        }
    }

    public final void b() {
        LauncherWindowService launcherWindowService = this.f5466g;
        if (launcherWindowService != null) {
            VirtualDisplay virtualDisplay = (VirtualDisplay) launcherWindowService.f971b.get(this.f5464b);
            if (virtualDisplay != null) {
                virtualDisplay.setSurface(null);
            }
        }
        Surface surface = this.f5467h;
        if (surface != null) {
            surface.release();
            this.f5467h = null;
        }
    }

    public final void c() {
        if (this.f5469j) {
            return;
        }
        this.f5469j = true;
        removeCallbacks(this.f5476q);
        b();
        if (this.f5468i) {
            getContext().unbindService(this.r);
            this.f5468i = false;
        }
        this.f5466g = null;
    }

    public final void d() {
        if (!this.f5469j && !this.f5471l && this.f5470k && this.f5474o > 0 && this.f5472m && !this.f5473n && this.f5465f.f5640f) {
            int i10 = 1;
            this.f5473n = true;
            if (this.e.getVisibility() == 0) {
                f(e0.m.h(new byte[]{-36, 107, -87, 81, -37, -112, -104, 122, -36, 69, -87, 90, -37, -112, -104, 123, -18, 117, -33}, new byte[]{12, -11, 121, -25, 11, 40, 72, -50}));
            }
            x xVar = this.f5465f;
            xVar.d.execute(new b1.n(xVar, e0.m.h(new byte[]{77, 122, 104, 82, -58, -119, 96}, new byte[]{8, 52, 59, 7, -108, -52, 64, 119}) + this.f5474o + " " + this.c, new q0.f(i10, this), 12));
        }
    }

    public final void e(boolean z9) {
        if (!this.f5469j && this.f5470k) {
            if (!z9) {
                f(e0.m.h(new byte[]{2, -34, 55, -70, 7, -95, -51, 78, -14, -112, 88, -48, 105, -52, -89, 32, 98, 96, 55, -67, 7, -87, -51, 68, 2, -2, 54, -127, 6, -98, -52, 115, 2, -1, 55, -67, 7, -94}, new byte[]{-46, 64, -25, 0, -41, 28, 29, -16}));
                return;
            }
            if (!this.f5468i) {
                try {
                    Intent intent = new Intent(getContext(), (Class<?>) LauncherWindowService.class);
                    if (Build.VERSION.SDK_INT >= 26) {
                        getContext().startForegroundService(intent);
                    } else {
                        getContext().startService(intent);
                    }
                    boolean bindService = getContext().bindService(intent, this.r, 1);
                    this.f5468i = bindService;
                    if (!bindService) {
                        f(e0.m.h(new byte[]{-95, -23, -31, 22, 75, -32, -120, -47, -59, -92, -127, 115, -48, -31, -75, -48, -16, -91, -67, -125, -69, -114, -37, -65, -95, -64, -31, 25, -69, -118, -38, -113, -96, -13, -31, 27, -70, -77, -38, -115, -96, -11, -32, 44, 75, -31, -79, 33, -96, -11, -31, 22, -70, -79, -37, -77, -95, -52, -32, 34, -70, -78, 43, -47, -49, -92, -117, 115, -43, -31, -74}, new byte[]{113, 116, 49, -93, 107, 49, 11, 1}));
                        return;
                    }
                    return;
                } catch (RuntimeException e) {
                    f(e0.m.h(new byte[]{42, 85, ByteCompanionObject.MAX_VALUE, 39, -51, -16, -50, -59, 42, 76, 126, 19, 60, -96, -96, -89, 64, 36, 17, 66, -95, 74, 62}, new byte[]{-6, -12, -81, -110, 28, 112, 30, 119}).concat(e.getClass().getSimpleName()));
                    return;
                }
            }
            a();
        }
    }

    public final void f(String str) {
        TextView textView = this.e;
        textView.setText(str);
        textView.setVisibility(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e(this.f5465f.f5640f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        b();
        super.onDetachedFromWindow();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        b();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        f5.j jVar = this.f5476q;
        removeCallbacks(jVar);
        postDelayed(jVar, 100L);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
