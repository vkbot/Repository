package androidx.core.view.inputmethod;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.inputmethod.InputConnectionCompat;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements InputConnectionCompat.OnCommitContentListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f197a;

    public /* synthetic */ a(View view) {
        this.f197a = view;
    }

    @Override // androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener
    public boolean onCommitContent(InputContentInfoCompat inputContentInfoCompat, int i10, Bundle bundle) {
        return InputConnectionCompat.a(this.f197a, inputContentInfoCompat, i10, bundle);
    }
}
