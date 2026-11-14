package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.fragment.app.DialogFragment;
import com.example.navistart.R;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class p<S> extends DialogFragment {

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f1327b;
    public final LinkedHashSet c;
    public int d;
    public w e;

    /* renamed from: f, reason: collision with root package name */
    public b f1328f;

    /* renamed from: g, reason: collision with root package name */
    public n f1329g;

    /* renamed from: h, reason: collision with root package name */
    public int f1330h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f1331i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1332j;

    /* renamed from: k, reason: collision with root package name */
    public int f1333k;

    /* renamed from: l, reason: collision with root package name */
    public int f1334l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f1335m;

    /* renamed from: n, reason: collision with root package name */
    public int f1336n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f1337o;

    /* renamed from: p, reason: collision with root package name */
    public int f1338p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f1339q;
    public int r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f1340s;
    public TextView t;

    /* renamed from: u, reason: collision with root package name */
    public CheckableImageButton f1341u;

    /* renamed from: v, reason: collision with root package name */
    public z3.k f1342v;
    public boolean w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f1343x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f1344y;

    public p() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f1327b = new LinkedHashSet();
        this.c = new LinkedHashSet();
    }

    public static int u(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar b10 = a0.b();
        b10.set(5, 1);
        Calendar a10 = a0.a(b10);
        a10.get(2);
        a10.get(1);
        int maximum = a10.getMaximum(7);
        a10.getActualMaximum(5);
        a10.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean v(int i10, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(w3.b.c(context, n.class.getCanonicalName(), R.attr.materialCalendarStyle).data, new int[]{i10});
        boolean z9 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z9;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f1327b.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.d = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") == null) {
            this.f1328f = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
            if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") == null) {
                this.f1330h = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
                this.f1331i = bundle.getCharSequence("TITLE_TEXT_KEY");
                this.f1333k = bundle.getInt("INPUT_MODE_KEY");
                this.f1334l = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
                this.f1335m = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
                this.f1336n = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
                this.f1337o = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
                this.f1338p = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
                this.f1339q = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
                this.r = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
                this.f1340s = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
                CharSequence charSequence = this.f1331i;
                if (charSequence == null) {
                    charSequence = requireContext().getResources().getText(this.f1330h);
                }
                this.f1343x = charSequence;
                if (charSequence != null) {
                    CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
                    if (split.length > 1) {
                        charSequence = split[0];
                    }
                } else {
                    charSequence = null;
                }
                this.f1344y = charSequence;
                return;
            }
            n0.b.a();
            return;
        }
        n0.b.a();
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Context requireContext = requireContext();
        requireContext();
        int i10 = this.d;
        if (i10 != 0) {
            Dialog dialog = new Dialog(requireContext, i10);
            Context context = dialog.getContext();
            this.f1332j = v(android.R.attr.windowFullscreen, context);
            this.f1342v = new z3.k(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, a3.a.f20q, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
            int color = obtainStyledAttributes.getColor(1, 0);
            obtainStyledAttributes.recycle();
            this.f1342v.m(context);
            this.f1342v.q(ColorStateList.valueOf(color));
            this.f1342v.p(dialog.getWindow().getDecorView().getElevation());
            return dialog;
        }
        t();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        String string;
        if (this.f1332j) {
            i10 = R.layout.mtrl_picker_fullscreen;
        } else {
            i10 = R.layout.mtrl_picker_dialog;
        }
        View inflate = layoutInflater.inflate(i10, viewGroup);
        Context context = inflate.getContext();
        if (this.f1332j) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(u(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(u(context), -1));
        }
        ((TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text)).setAccessibilityLiveRegion(1);
        this.f1341u = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.t = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.f1341u.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f1341u;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, AppCompatResources.getDrawable(context, R.drawable.material_ic_calendar_black_24dp));
        boolean z9 = false;
        stateListDrawable.addState(new int[0], AppCompatResources.getDrawable(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        CheckableImageButton checkableImageButton2 = this.f1341u;
        if (this.f1333k != 0) {
            z9 = true;
        }
        checkableImageButton2.setChecked(z9);
        ViewCompat.setAccessibilityDelegate(this.f1341u, null);
        CheckableImageButton checkableImageButton3 = this.f1341u;
        if (this.f1333k == 1) {
            string = checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            string = checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode);
        }
        this.f1341u.setContentDescription(string);
        this.f1341u.setOnClickListener(new androidx.navigation.c(2, this));
        t();
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.google.android.material.datepicker.a] */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        r rVar;
        r r;
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.d);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        b bVar = this.f1328f;
        ?? obj = new Object();
        int i10 = a.f1294b;
        int i11 = a.f1294b;
        long j10 = bVar.f1297b.f1347g;
        long j11 = bVar.c.f1347g;
        obj.f1295a = Long.valueOf(bVar.e.f1347g);
        int i12 = bVar.f1298f;
        d dVar = bVar.d;
        n nVar = this.f1329g;
        if (nVar == null) {
            rVar = null;
        } else {
            rVar = nVar.e;
        }
        if (rVar != null) {
            obj.f1295a = Long.valueOf(rVar.f1347g);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", dVar);
        r r9 = r.r(j10);
        r r10 = r.r(j11);
        d dVar2 = (d) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l10 = obj.f1295a;
        if (l10 == null) {
            r = null;
        } else {
            r = r.r(l10.longValue());
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new b(r9, r10, dVar2, r, i12));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f1330h);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f1331i);
        bundle.putInt("INPUT_MODE_KEY", this.f1333k);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f1334l);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f1335m);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f1336n);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f1337o);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f1338p);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f1339q);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.r);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f1340s);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        CharSequence charSequence;
        Integer num;
        boolean z9;
        int i10;
        boolean z10;
        boolean z11;
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f1332j) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f1342v);
            if (!this.w) {
                View findViewById = requireView().findViewById(R.id.fullscreen_header);
                ColorStateList d = o3.c.d(findViewById.getBackground());
                if (d != null) {
                    num = Integer.valueOf(d.getDefaultColor());
                } else {
                    num = null;
                }
                boolean z12 = false;
                if (num != null && num.intValue() != 0) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                int b10 = m3.a.b(window.getContext(), android.R.attr.colorBackground, ViewCompat.MEASURED_STATE_MASK);
                if (z9) {
                    num = Integer.valueOf(b10);
                }
                WindowCompat.setDecorFitsSystemWindows(window, false);
                window.getContext();
                Context context = window.getContext();
                if (Build.VERSION.SDK_INT < 27) {
                    i10 = ColorUtils.setAlphaComponent(m3.a.b(context, android.R.attr.navigationBarColor, ViewCompat.MEASURED_STATE_MASK), 128);
                } else {
                    i10 = 0;
                }
                window.setStatusBarColor(0);
                window.setNavigationBarColor(i10);
                int intValue = num.intValue();
                if (intValue != 0 && ColorUtils.calculateLuminance(intValue) > 0.5d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                WindowCompat.getInsetsController(window, window.getDecorView()).setAppearanceLightStatusBars(z10);
                if (b10 != 0 && ColorUtils.calculateLuminance(b10) > 0.5d) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((i10 != 0 && ColorUtils.calculateLuminance(i10) > 0.5d) || (i10 == 0 && z11)) {
                    z12 = true;
                }
                WindowCompat.getInsetsController(window, window.getDecorView()).setAppearanceLightNavigationBars(z12);
                ViewCompat.setOnApplyWindowInsetsListener(findViewById, new o(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight()));
                this.w = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f1342v, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new n3.a(requireDialog(), rect));
        }
        requireContext();
        int i11 = this.d;
        if (i11 != 0) {
            t();
            b bVar = this.f1328f;
            n nVar = new n();
            Bundle bundle = new Bundle();
            bundle.putInt("THEME_RES_ID_KEY", i11);
            bundle.putParcelable("GRID_SELECTOR_KEY", null);
            bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar);
            bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
            bundle.putParcelable("CURRENT_MONTH_KEY", bVar.e);
            nVar.setArguments(bundle);
            this.f1329g = nVar;
            w wVar = nVar;
            if (this.f1333k == 1) {
                t();
                b bVar2 = this.f1328f;
                w qVar = new q();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("THEME_RES_ID_KEY", i11);
                bundle2.putParcelable("DATE_SELECTOR_KEY", null);
                bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar2);
                qVar.setArguments(bundle2);
                wVar = qVar;
            }
            this.e = wVar;
            TextView textView = this.t;
            if (this.f1333k == 1 && getResources().getConfiguration().orientation == 2) {
                charSequence = this.f1344y;
            } else {
                charSequence = this.f1343x;
            }
            textView.setText(charSequence);
            t();
            getContext();
            throw null;
        }
        t();
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        this.e.f1356b.clear();
        super.onStop();
    }

    public final void t() {
        if (getArguments().getParcelable("DATE_SELECTOR_KEY") == null) {
            return;
        }
        n0.b.a();
    }
}
