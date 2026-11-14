package b7;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.core.view.ViewCompat;
import com.journeyapps.barcodescanner.BarcodeView;
import java.util.ArrayList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class f extends ViewGroup {
    public static final /* synthetic */ int A = 0;

    /* renamed from: b, reason: collision with root package name */
    public c7.g f375b;
    public final WindowManager c;
    public final Handler d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public SurfaceView f376f;

    /* renamed from: g, reason: collision with root package name */
    public TextureView f377g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f378h;

    /* renamed from: i, reason: collision with root package name */
    public final p f379i;

    /* renamed from: j, reason: collision with root package name */
    public int f380j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f381k;

    /* renamed from: l, reason: collision with root package name */
    public c7.l f382l;

    /* renamed from: m, reason: collision with root package name */
    public c7.j f383m;

    /* renamed from: n, reason: collision with root package name */
    public u f384n;

    /* renamed from: o, reason: collision with root package name */
    public u f385o;

    /* renamed from: p, reason: collision with root package name */
    public Rect f386p;

    /* renamed from: q, reason: collision with root package name */
    public u f387q;
    public Rect r;

    /* renamed from: s, reason: collision with root package name */
    public Rect f388s;
    public u t;

    /* renamed from: u, reason: collision with root package name */
    public double f389u;

    /* renamed from: v, reason: collision with root package name */
    public c7.n f390v;
    public boolean w;

    /* renamed from: x, reason: collision with root package name */
    public final d f391x;

    /* renamed from: y, reason: collision with root package name */
    public final r5.c f392y;

    /* renamed from: z, reason: collision with root package name */
    public final e f393z;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = false;
        this.f378h = false;
        this.f380j = -1;
        this.f381k = new ArrayList();
        this.f383m = new c7.j();
        this.r = null;
        this.f388s = null;
        this.t = null;
        this.f389u = 0.1d;
        this.f390v = null;
        this.w = false;
        BarcodeView barcodeView = (BarcodeView) this;
        this.f391x = new d(barcodeView);
        b bVar = new b(barcodeView, 1);
        this.f392y = new r5.c(1, barcodeView);
        this.f393z = new e(0, barcodeView);
        if (getBackground() == null) {
            setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
        b(attributeSet);
        this.c = (WindowManager) context.getSystemService("window");
        this.d = new Handler(bVar);
        this.f379i = new p(1);
    }

    public static void a(BarcodeView barcodeView) {
        if (barcodeView.f375b != null && barcodeView.getDisplayRotation() != barcodeView.f380j) {
            barcodeView.g();
            barcodeView.c();
        }
    }

    private int getDisplayRotation() {
        return this.c.getDefaultDisplay().getRotation();
    }

    public final void b(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d6.h.f1850a);
        int dimension = (int) obtainStyledAttributes.getDimension(1, -1.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(0, -1.0f);
        if (dimension > 0 && dimension2 > 0) {
            this.t = new u(dimension, dimension2);
        }
        this.e = obtainStyledAttributes.getBoolean(3, true);
        int integer = obtainStyledAttributes.getInteger(2, -1);
        if (integer == 1) {
            this.f390v = new c7.k(0);
        } else if (integer == 2) {
            this.f390v = new c7.k(1);
        } else if (integer == 3) {
            this.f390v = new c7.k(2);
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [c7.g, java.lang.Object] */
    public final void c() {
        a.a.y();
        Log.d("f", "resume()");
        if (this.f375b != null) {
            Log.w("f", "initCamera called twice");
        } else {
            Context context = getContext();
            ?? obj = new Object();
            obj.f553f = false;
            obj.f554g = true;
            obj.f556i = new c7.j();
            c7.f fVar = new c7.f(obj, 0);
            obj.f557j = new c7.f(obj, 1);
            obj.f558k = new c7.f(obj, 2);
            obj.f559l = new c7.f(obj, 3);
            a.a.y();
            if (p.f418f == null) {
                p.f418f = new p();
            }
            p pVar = p.f418f;
            obj.f551a = pVar;
            c7.i iVar = new c7.i(context);
            obj.c = iVar;
            iVar.f566g = obj.f556i;
            obj.f555h = new Handler();
            c7.j jVar = this.f383m;
            if (!obj.f553f) {
                obj.f556i = jVar;
                iVar.f566g = jVar;
            }
            this.f375b = obj;
            obj.d = this.d;
            a.a.y();
            obj.f553f = true;
            obj.f554g = false;
            synchronized (pVar.e) {
                pVar.f420b++;
                pVar.d(fVar);
            }
            this.f380j = getDisplayRotation();
        }
        if (this.f387q != null) {
            e();
        } else {
            SurfaceView surfaceView = this.f376f;
            if (surfaceView != null) {
                surfaceView.getHolder().addCallback(this.f391x);
            } else {
                TextureView textureView = this.f377g;
                if (textureView != null) {
                    if (textureView.isAvailable()) {
                        this.f377g.getSurfaceTexture();
                        this.f387q = new u(this.f377g.getWidth(), this.f377g.getHeight());
                        e();
                    } else {
                        this.f377g.setSurfaceTextureListener(new c(this));
                    }
                }
            }
        }
        requestLayout();
        p pVar2 = this.f379i;
        Context context2 = getContext();
        r5.c cVar = this.f392y;
        t tVar = (t) pVar2.d;
        if (tVar != null) {
            tVar.disable();
        }
        pVar2.d = null;
        pVar2.c = null;
        pVar2.e = null;
        Context applicationContext = context2.getApplicationContext();
        pVar2.e = cVar;
        pVar2.c = (WindowManager) applicationContext.getSystemService("window");
        t tVar2 = new t(pVar2, applicationContext);
        pVar2.d = tVar2;
        tVar2.enable();
        pVar2.f420b = ((WindowManager) pVar2.c).getDefaultDisplay().getRotation();
    }

    public final void d(android.support.v4.media.h hVar) {
        if (!this.f378h && this.f375b != null) {
            Log.i("f", "Starting preview");
            c7.g gVar = this.f375b;
            gVar.f552b = hVar;
            a.a.y();
            if (gVar.f553f) {
                gVar.f551a.d(gVar.f558k);
                this.f378h = true;
                ((BarcodeView) this).h();
                this.f393z.g();
                return;
            }
            j1.i.l("CameraInstance is not open");
        }
    }

    public final void e() {
        Rect rect;
        float f8;
        u uVar = this.f387q;
        if (uVar != null && this.f385o != null && (rect = this.f386p) != null) {
            if (this.f376f != null && uVar.equals(new u(rect.width(), this.f386p.height()))) {
                SurfaceHolder holder = this.f376f.getHolder();
                android.support.v4.media.h hVar = new android.support.v4.media.h(4, false);
                if (holder != null) {
                    hVar.c = holder;
                    d(hVar);
                    return;
                } else {
                    j1.i.k("surfaceHolder may not be null");
                    return;
                }
            }
            TextureView textureView = this.f377g;
            if (textureView != null && textureView.getSurfaceTexture() != null) {
                if (this.f385o != null) {
                    int width = this.f377g.getWidth();
                    int height = this.f377g.getHeight();
                    u uVar2 = this.f385o;
                    float f10 = height;
                    float f11 = width / f10;
                    float f12 = uVar2.f424b / uVar2.c;
                    float f13 = 1.0f;
                    if (f11 < f12) {
                        float f14 = f12 / f11;
                        f8 = 1.0f;
                        f13 = f14;
                    } else {
                        f8 = f11 / f12;
                    }
                    Matrix matrix = new Matrix();
                    matrix.setScale(f13, f8);
                    float f15 = width;
                    matrix.postTranslate((f15 - (f13 * f15)) / 2.0f, (f10 - (f8 * f10)) / 2.0f);
                    this.f377g.setTransform(matrix);
                }
                SurfaceTexture surfaceTexture = this.f377g.getSurfaceTexture();
                android.support.v4.media.h hVar2 = new android.support.v4.media.h(4, false);
                if (surfaceTexture != null) {
                    hVar2.d = surfaceTexture;
                    d(hVar2);
                } else {
                    j1.i.k("surfaceTexture may not be null");
                }
            }
        }
    }

    public c7.g getCameraInstance() {
        return this.f375b;
    }

    public c7.j getCameraSettings() {
        return this.f383m;
    }

    public Rect getFramingRect() {
        return this.r;
    }

    public u getFramingRectSize() {
        return this.t;
    }

    public double getMarginFraction() {
        return this.f389u;
    }

    public Rect getPreviewFramingRect() {
        return this.f388s;
    }

    public c7.n getPreviewScalingStrategy() {
        c7.n nVar = this.f390v;
        if (nVar != null) {
            return nVar;
        }
        if (this.f377g != null) {
            return new c7.k(0);
        }
        return new c7.k(1);
    }

    public u getPreviewSize() {
        return this.f385o;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.e) {
            TextureView textureView = new TextureView(getContext());
            this.f377g = textureView;
            textureView.setSurfaceTextureListener(new c(this));
            addView(this.f377g);
            return;
        }
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.f376f = surfaceView;
        surfaceView.getHolder().addCallback(this.f391x);
        addView(this.f376f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        u uVar = new u(i12 - i10, i13 - i11);
        this.f384n = uVar;
        c7.g gVar = this.f375b;
        if (gVar != null && gVar.e == null) {
            int displayRotation = getDisplayRotation();
            c7.l lVar = new c7.l(0);
            lVar.d = new c7.k(1);
            lVar.f575b = displayRotation;
            lVar.c = uVar;
            this.f382l = lVar;
            lVar.d = getPreviewScalingStrategy();
            c7.g gVar2 = this.f375b;
            c7.l lVar2 = this.f382l;
            gVar2.e = lVar2;
            gVar2.c.f567h = lVar2;
            a.a.y();
            if (gVar2.f553f) {
                gVar2.f551a.d(gVar2.f557j);
                boolean z10 = this.w;
                if (z10) {
                    c7.g gVar3 = this.f375b;
                    gVar3.getClass();
                    a.a.y();
                    if (gVar3.f553f) {
                        gVar3.f551a.d(new c7.e(gVar3, z10, 0));
                    }
                }
            } else {
                j1.i.l("CameraInstance is not open");
                return;
            }
        }
        SurfaceView surfaceView = this.f376f;
        if (surfaceView != null) {
            Rect rect = this.f386p;
            if (rect == null) {
                surfaceView.layout(0, 0, getWidth(), getHeight());
                return;
            } else {
                surfaceView.layout(rect.left, rect.top, rect.right, rect.bottom);
                return;
            }
        }
        TextureView textureView = this.f377g;
        if (textureView != null) {
            textureView.layout(0, 0, getWidth(), getHeight());
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        setTorch(bundle.getBoolean("torch"));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", onSaveInstanceState);
        bundle.putBoolean("torch", this.w);
        return bundle;
    }

    public void setCameraSettings(c7.j jVar) {
        this.f383m = jVar;
    }

    public void setFramingRectSize(u uVar) {
        this.t = uVar;
    }

    public void setMarginFraction(double d) {
        if (d < 0.5d) {
            this.f389u = d;
        } else {
            j1.i.k("The margin fraction must be less than 0.5");
        }
    }

    public void setPreviewScalingStrategy(c7.n nVar) {
        this.f390v = nVar;
    }

    public void setTorch(boolean z9) {
        this.w = z9;
        c7.g gVar = this.f375b;
        if (gVar != null) {
            a.a.y();
            if (gVar.f553f) {
                gVar.f551a.d(new c7.e(gVar, z9, 0));
            }
        }
    }

    public void setUseTextureView(boolean z9) {
        this.e = z9;
    }
}
