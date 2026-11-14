package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import s3.a;
import s3.b;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {
    public static final int[] e = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    public boolean f1374b;
    public boolean c;
    public boolean d;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, androidx.appcompat.R.attr.imageButtonStyle);
        this.c = true;
        this.d = true;
        ViewCompat.setAccessibilityDelegate(this, new a(0, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f1374b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        if (this.f1374b) {
            return View.mergeDrawableStates(super.onCreateDrawableState(i10 + 1), e);
        }
        return super.onCreateDrawableState(i10);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setChecked(bVar.f5655b);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [s3.b, android.os.Parcelable, androidx.customview.view.AbsSavedState] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? absSavedState = new AbsSavedState(super.onSaveInstanceState());
        absSavedState.f5655b = this.f1374b;
        return absSavedState;
    }

    public void setCheckable(boolean z9) {
        if (this.c != z9) {
            this.c = z9;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z9) {
        if (this.c && this.f1374b != z9) {
            this.f1374b = z9;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z9) {
        this.d = z9;
    }

    @Override // android.view.View
    public void setPressed(boolean z9) {
        if (this.d) {
            super.setPressed(z9);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f1374b);
    }
}
