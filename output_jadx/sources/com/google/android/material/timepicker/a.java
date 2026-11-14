package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a extends s3.k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChipTextInputComboView f1513b;

    public a(ChipTextInputComboView chipTextInputComboView) {
        this.f1513b = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean isEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f1513b;
        Chip chip = chipTextInputComboView.f1487b;
        if (isEmpty) {
            chip.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
            return;
        }
        String a10 = ChipTextInputComboView.a(chipTextInputComboView, editable);
        if (TextUtils.isEmpty(a10)) {
            a10 = ChipTextInputComboView.a(chipTextInputComboView, "00");
        }
        chip.setText(a10);
    }
}
