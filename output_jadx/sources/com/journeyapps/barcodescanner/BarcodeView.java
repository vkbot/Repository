package com.journeyapps.barcodescanner;

import a.a;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.support.v4.media.h;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceView;
import android.view.TextureView;
import b7.b;
import b7.f;
import b7.k;
import b7.l;
import b7.n;
import b7.p;
import b7.t;
import c7.g;
import com.example.navistart.R;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Set;
import z5.d;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class BarcodeView extends f {
    public int B;
    public h C;
    public n D;
    public l E;
    public final Handler F;

    public BarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B = 1;
        this.C = null;
        b bVar = new b(this, 0);
        this.E = new p(0);
        this.F = new Handler(bVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [b7.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, z5.h] */
    /* JADX WARN: Type inference failed for: r2v7, types: [b7.r, b7.k] */
    public final k f() {
        k kVar;
        if (this.E == null) {
            this.E = new p(0);
        }
        ?? obj = new Object();
        HashMap hashMap = new HashMap();
        hashMap.put(d.f6856k, obj);
        p pVar = (p) this.E;
        pVar.getClass();
        EnumMap enumMap = new EnumMap(d.class);
        enumMap.putAll(hashMap);
        EnumMap enumMap2 = (EnumMap) pVar.d;
        if (enumMap2 != null) {
            enumMap.putAll(enumMap2);
        }
        Set set = (Set) pVar.c;
        if (set != null) {
            enumMap.put((EnumMap) d.d, (d) set);
        }
        String str = (String) pVar.e;
        if (str != null) {
            enumMap.put((EnumMap) d.f6851f, (d) str);
        }
        ?? obj2 = new Object();
        obj2.c(enumMap);
        int i10 = pVar.f420b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    kVar = new k(obj2);
                } else {
                    ?? kVar2 = new k(obj2);
                    kVar2.c = true;
                    kVar = kVar2;
                }
            } else {
                kVar = new k(obj2);
            }
        } else {
            kVar = new k(obj2);
        }
        obj.f410a = kVar;
        return kVar;
    }

    public final void g() {
        TextureView textureView;
        SurfaceView surfaceView;
        i();
        a.y();
        Log.d("f", "pause()");
        this.f380j = -1;
        g gVar = this.f375b;
        if (gVar != null) {
            a.y();
            if (gVar.f553f) {
                gVar.f551a.d(gVar.f559l);
            } else {
                gVar.f554g = true;
            }
            gVar.f553f = false;
            this.f375b = null;
            this.f378h = false;
        } else {
            this.d.sendEmptyMessage(R.id.zxing_camera_closed);
        }
        if (this.f387q == null && (surfaceView = this.f376f) != null) {
            surfaceView.getHolder().removeCallback(this.f391x);
        }
        if (this.f387q == null && (textureView = this.f377g) != null) {
            textureView.setSurfaceTextureListener(null);
        }
        this.f384n = null;
        this.f385o = null;
        this.f388s = null;
        p pVar = this.f379i;
        t tVar = (t) pVar.d;
        if (tVar != null) {
            tVar.disable();
        }
        pVar.d = null;
        pVar.c = null;
        pVar.e = null;
        this.f393z.j();
    }

    public l getDecoderFactory() {
        return this.E;
    }

    public final void h() {
        i();
        if (this.B != 1 && this.f378h) {
            n nVar = new n(getCameraInstance(), f(), this.F);
            this.D = nVar;
            nVar.f413f = getPreviewFramingRect();
            n nVar2 = this.D;
            nVar2.getClass();
            a.y();
            HandlerThread handlerThread = new HandlerThread("n");
            nVar2.f412b = handlerThread;
            handlerThread.start();
            nVar2.c = new Handler(nVar2.f412b.getLooper(), nVar2.f416i);
            nVar2.f414g = true;
            g gVar = nVar2.f411a;
            gVar.f555h.post(new c7.d(gVar, nVar2.f417j, 0));
        }
    }

    public final void i() {
        n nVar = this.D;
        if (nVar != null) {
            a.y();
            synchronized (nVar.f415h) {
                nVar.f414g = false;
                nVar.c.removeCallbacksAndMessages(null);
                nVar.f412b.quit();
            }
            this.D = null;
        }
    }

    public void setDecoderFactory(l lVar) {
        a.y();
        this.E = lVar;
        n nVar = this.D;
        if (nVar != null) {
            nVar.d = f();
        }
    }
}
