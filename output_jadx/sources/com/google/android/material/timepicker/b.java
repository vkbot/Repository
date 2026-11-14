package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f1514b;

    public b(ClockFaceView clockFaceView) {
        this.f1514b = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f1514b;
        ClockHandView clockHandView = clockFaceView.e;
        if (clockFaceView.isShown()) {
            clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
            int height = ((clockFaceView.getHeight() / 2) - clockHandView.e) - clockFaceView.f1495m;
            if (height != clockFaceView.c) {
                clockFaceView.c = height;
                clockFaceView.a();
                clockHandView.f1510m = clockFaceView.c;
                clockHandView.invalidate();
            }
        }
        return true;
    }
}
