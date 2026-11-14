package com.journeyapps.barcodescanner;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import b7.j;
import c7.g;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class CaptureActivity extends Activity {

    /* renamed from: b, reason: collision with root package name */
    public j f1649b;
    public DecoratedBarcodeView c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018d  */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, z5.h] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.journeyapps.barcodescanner.CaptureActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        j jVar = this.f1649b;
        jVar.f401g = true;
        jVar.f402h.a();
        jVar.f404j.removeCallbacksAndMessages(null);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!this.c.onKeyDown(i10, keyEvent) && !super.onKeyDown(i10, keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        j jVar = this.f1649b;
        jVar.f402h.a();
        BarcodeView barcodeView = jVar.f399b.f1650b;
        g cameraInstance = barcodeView.getCameraInstance();
        barcodeView.g();
        long nanoTime = System.nanoTime();
        while (cameraInstance != null && !cameraInstance.f554g && System.nanoTime() - nanoTime <= 2000000000) {
            try {
                Thread.sleep(1L);
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        j jVar = this.f1649b;
        jVar.getClass();
        if (i10 == 250) {
            if (iArr.length > 0 && iArr[0] == 0) {
                jVar.f399b.f1650b.c();
                return;
            }
            Intent intent = new Intent("com.google.zxing.client.android.SCAN");
            intent.putExtra("MISSING_CAMERA_PERMISSION", true);
            jVar.f398a.setResult(0, intent);
            if (jVar.e) {
                jVar.b(jVar.f400f);
            } else {
                jVar.a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        j jVar = this.f1649b;
        CaptureActivity captureActivity = jVar.f398a;
        if (ContextCompat.checkSelfPermission(captureActivity, "android.permission.CAMERA") == 0) {
            jVar.f399b.f1650b.c();
        } else if (!jVar.f407m) {
            ActivityCompat.requestPermissions(captureActivity, new String[]{"android.permission.CAMERA"}, 250);
            jVar.f407m = true;
        }
        d6.g gVar = jVar.f402h;
        if (!gVar.c) {
            gVar.f1847a.registerReceiver(gVar.f1848b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            gVar.c = true;
        }
        Handler handler = gVar.d;
        handler.removeCallbacksAndMessages(null);
        if (gVar.f1849f) {
            handler.postDelayed(gVar.e, 300000L);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("SAVED_ORIENTATION_LOCK", this.f1649b.c);
    }
}
