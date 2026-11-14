package c7;

import android.hardware.Camera;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a implements Camera.AutoFocusCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f541a;

    public a(b bVar) {
        this.f541a = bVar;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public final void onAutoFocus(boolean z9, Camera camera) {
        this.f541a.e.post(new a4.g(6, this));
    }
}
