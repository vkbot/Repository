package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import b7.l;
import b7.o;
import c7.j;
import com.example.navistart.R;
import d6.h;
import j1.i;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class DecoratedBarcodeView extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public final BarcodeView f1650b;
    public final ViewfinderView c;
    public final TextView d;

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.c);
        int resourceId = obtainStyledAttributes.getResourceId(0, R.layout.zxing_barcode_scanner);
        obtainStyledAttributes.recycle();
        View.inflate(getContext(), resourceId, this);
        BarcodeView barcodeView = (BarcodeView) findViewById(R.id.zxing_barcode_surface);
        this.f1650b = barcodeView;
        if (barcodeView != null) {
            barcodeView.b(attributeSet);
            ViewfinderView viewfinderView = (ViewfinderView) findViewById(R.id.zxing_viewfinder_view);
            this.c = viewfinderView;
            if (viewfinderView != null) {
                viewfinderView.setCameraPreview(this.f1650b);
                this.d = (TextView) findViewById(R.id.zxing_status_view);
                return;
            } else {
                i.k("There is no a com.journeyapps.barcodescanner.ViewfinderView on provided layout with the id \"zxing_viewfinder_view\".");
                throw null;
            }
        }
        i.k("There is no a com.journeyapps.barcodescanner.BarcodeView on provided layout with the id \"zxing_barcode_surface\".");
        throw null;
    }

    public BarcodeView getBarcodeView() {
        return (BarcodeView) findViewById(R.id.zxing_barcode_surface);
    }

    public j getCameraSettings() {
        return this.f1650b.getCameraSettings();
    }

    public l getDecoderFactory() {
        return this.f1650b.getDecoderFactory();
    }

    public TextView getStatusView() {
        return this.d;
    }

    public ViewfinderView getViewFinder() {
        return this.c;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 24) {
            if (i10 != 25) {
                if (i10 == 27 || i10 == 80) {
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            }
            this.f1650b.setTorch(false);
            return true;
        }
        this.f1650b.setTorch(true);
        return true;
    }

    public void setCameraSettings(j jVar) {
        this.f1650b.setCameraSettings(jVar);
    }

    public void setDecoderFactory(l lVar) {
        this.f1650b.setDecoderFactory(lVar);
    }

    public void setStatusText(String str) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTorchListener(o oVar) {
    }
}
