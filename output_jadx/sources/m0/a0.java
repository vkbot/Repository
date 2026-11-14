package m0;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import com.example.navistart.BlackActivity;
import com.example.navistart.W;
import com.woha.appmanag.FilePickerActivity;
import java.io.File;
import java.util.ArrayList;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class a0 extends l0.b {

    /* renamed from: h, reason: collision with root package name */
    public static final String f3597h = e0.m.h(new byte[]{-75, 122, -18, -51, 63, -25, 90, -99, -110, 102, -38, -36, 31, -37, 73, -111, -109}, new byte[]{-8, 3, -71, -88, 93, -73, 40, -14});

    /* renamed from: i, reason: collision with root package name */
    public static final String f3598i = e0.m.h(new byte[]{7, -6, -84, -95, 100, 67, 100, -48, 32, -26, -104, -80, 68, ByteCompanionObject.MAX_VALUE, 119, -36, 33, -36, -88, -95, 114, 103, ByteCompanionObject.MAX_VALUE, -47, 45, -16, -92, -113, 99, 106}, new byte[]{74, -125, -5, -60, 6, 19, 22, -65});

    /* renamed from: j, reason: collision with root package name */
    public static final String f3599j = e0.m.h(new byte[]{75, 99, 50, 101, -43, 124, -80, 31, 88, 99, 54, 91, -62, 124, -91, 35, 68}, new byte[]{47, 6, 84, 4, -96, 16, -60, 64});

    /* renamed from: b, reason: collision with root package name */
    public BlackActivity f3600b;
    public Spinner d;
    public ImageButton e;

    /* renamed from: g, reason: collision with root package name */
    public b1.m f3602g;
    public final ArrayList c = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final String f3601f = e0.m.h(new byte[]{-92, 48, 58, 73, -118, 72, -85, 48, -73, 48, 62, 119, -99, 72, -66, 12, -85, 123, 38, 65, -113}, new byte[]{-64, 85, 92, 40, -1, 36, -33, 111});

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        String stringExtra;
        super.onActivityResult(i10, i11, intent);
        if (i10 == 101544 && i11 == -1 && intent != null && (stringExtra = intent.getStringExtra(e0.m.h(new byte[]{95, 33, -25, 102, -67, -52, Base64.padSymbol, 100, 115, 34, -30, 111, -69}, new byte[]{44, 68, -117, 3, -34, -72, 88, 0}))) != null) {
            u(new File(stringExtra));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof BlackActivity) {
            this.f3600b = (BlackActivity) context;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [android.widget.LinearLayout, android.view.View, com.example.navistart.mainview.DownloadButton] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f3602g = new b1.m(requireContext(), this.f3601f, new File(requireContext().getFilesDir(), f3597h), f3599j);
        String[] strArr = new String[f0.b.values().length];
        final int i10 = 0;
        for (int i11 = 0; i11 < f0.b.values().length; i11++) {
            strArr[i11] = getString(f0.b.values()[i11].f2240b);
        }
        LinearLayout linearLayout = new LinearLayout(requireContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(40, 30, 40, 10);
        ListView listView = new ListView(requireContext());
        listView.setAdapter((ListAdapter) new ArrayAdapter(requireContext(), R.layout.simple_list_item_1, strArr));
        SeekBar seekBar = new SeekBar(requireContext());
        seekBar.setMax(100);
        seekBar.setProgress(h0.b.o().loadInt(e0.m.h(new byte[]{-65, -51, 32, -64, 12, -2, 105, -62, -100, -53, 45, -45, 63, -17, 98, -20, -118, -55, 36, -47, 8, -15, ByteCompanionObject.MAX_VALUE, -16, -124}, new byte[]{-16, -69, 69, -78, 96, -97, 16, -125}), 100));
        TextView textView = new TextView(requireContext());
        textView.setText(getString(com.example.navistart.R.string.zatemneie_clock) + " " + seekBar.getProgress() + e0.m.h(new byte[]{-123}, new byte[]{-96, 54, -92, 84, 54, -9, -61, -107}));
        seekBar.setOnSeekBarChangeListener(new i7.u(this, textView));
        LinearLayout linearLayout2 = new LinearLayout(requireContext());
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setPadding(t(12), t(12), t(12), t(12));
        this.d = new Spinner(requireContext(), 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, t(56), 1.0f);
        layoutParams.setMarginEnd(t(12));
        this.d.setLayoutParams(layoutParams);
        ImageButton imageButton = new ImageButton(requireContext());
        int t = t(56);
        imageButton.setLayoutParams(new LinearLayout.LayoutParams(t, t));
        imageButton.setImageResource(com.example.navistart.R.drawable.ic_download_loading);
        imageButton.setBackgroundResource(com.example.navistart.R.drawable.modern_button_primary);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        imageButton.setScaleType(scaleType);
        imageButton.setPadding(t(12), t(12), t(12), t(12));
        imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: m0.z
            public final /* synthetic */ a0 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int selectedItemPosition;
                int i12 = i10;
                a0 a0Var = this.c;
                switch (i12) {
                    case 0:
                        String str = a0.f3597h;
                        Intent intent = new Intent(a0Var.requireContext(), (Class<?>) FilePickerActivity.class);
                        intent.putExtra(e0.m.h(new byte[]{-7, 99, -29, 116, -13, 83, 49, 83, -6, 100, -4, 120, -61, 88}, new byte[]{-97, 10, -113, 17, -84, 54, 73, 39}), e0.m.h(new byte[]{39, 90, -90, 3}, new byte[]{9, 32, -49, 115, ByteCompanionObject.MIN_VALUE, 56, 108, -54}));
                        intent.putExtra(e0.m.h(new byte[]{116, 74, -36, -20, -99, 90, 28, -39, 119, 77, -61, -32, -83, 81, 59, -64, 125, 71, -43, -42, -79, 90, 10, -55}, new byte[]{18, 35, -80, -119, -62, 63, 100, -83}), 1);
                        a0Var.startActivityForResult(intent, 101544);
                        return;
                    case 1:
                        ArrayList arrayList = a0Var.c;
                        Spinner spinner = a0Var.d;
                        if (spinner != null && (selectedItemPosition = spinner.getSelectedItemPosition()) >= 0 && selectedItemPosition < arrayList.size()) {
                            String str2 = (String) arrayList.get(selectedItemPosition);
                            if (!a0.f3599j.equals(str2)) {
                                new AlertDialog.Builder(a0Var.requireContext()).setTitle(com.example.navistart.R.string.delete_custom_widget_title).setMessage(a0Var.getString(com.example.navistart.R.string.delete_custom_widget_message, str2)).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(com.example.navistart.R.string.delete_custom_widget, new e0.e0(3, a0Var, str2)).show();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        String str3 = a0.f3597h;
                        W.u(a0Var.requireContext(), i1.class, i1.x(e0.m.h(new byte[]{4, 25, -104, 74, 21}, new byte[]{102, 117, -7, 41, 126, -79, 16, -119})));
                        return;
                }
            }
        });
        this.e = new ImageButton(requireContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(t, t);
        layoutParams2.setMarginEnd(t(12));
        this.e.setLayoutParams(layoutParams2);
        this.e.setImageResource(com.example.navistart.R.drawable.ic_delete);
        this.e.setBackgroundResource(com.example.navistart.R.drawable.modern_button_primary);
        this.e.setScaleType(scaleType);
        this.e.setPadding(t(12), t(12), t(12), t(12));
        this.e.setContentDescription(getString(com.example.navistart.R.string.delete_custom_widget));
        final int i12 = 1;
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: m0.z
            public final /* synthetic */ a0 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int selectedItemPosition;
                int i122 = i12;
                a0 a0Var = this.c;
                switch (i122) {
                    case 0:
                        String str = a0.f3597h;
                        Intent intent = new Intent(a0Var.requireContext(), (Class<?>) FilePickerActivity.class);
                        intent.putExtra(e0.m.h(new byte[]{-7, 99, -29, 116, -13, 83, 49, 83, -6, 100, -4, 120, -61, 88}, new byte[]{-97, 10, -113, 17, -84, 54, 73, 39}), e0.m.h(new byte[]{39, 90, -90, 3}, new byte[]{9, 32, -49, 115, ByteCompanionObject.MIN_VALUE, 56, 108, -54}));
                        intent.putExtra(e0.m.h(new byte[]{116, 74, -36, -20, -99, 90, 28, -39, 119, 77, -61, -32, -83, 81, 59, -64, 125, 71, -43, -42, -79, 90, 10, -55}, new byte[]{18, 35, -80, -119, -62, 63, 100, -83}), 1);
                        a0Var.startActivityForResult(intent, 101544);
                        return;
                    case 1:
                        ArrayList arrayList = a0Var.c;
                        Spinner spinner = a0Var.d;
                        if (spinner != null && (selectedItemPosition = spinner.getSelectedItemPosition()) >= 0 && selectedItemPosition < arrayList.size()) {
                            String str2 = (String) arrayList.get(selectedItemPosition);
                            if (!a0.f3599j.equals(str2)) {
                                new AlertDialog.Builder(a0Var.requireContext()).setTitle(com.example.navistart.R.string.delete_custom_widget_title).setMessage(a0Var.getString(com.example.navistart.R.string.delete_custom_widget_message, str2)).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(com.example.navistart.R.string.delete_custom_widget, new e0.e0(3, a0Var, str2)).show();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        String str3 = a0.f3597h;
                        W.u(a0Var.requireContext(), i1.class, i1.x(e0.m.h(new byte[]{4, 25, -104, 74, 21}, new byte[]{102, 117, -7, 41, 126, -79, 16, -119})));
                        return;
                }
            }
        });
        Context requireContext = requireContext();
        ?? linearLayout3 = new LinearLayout(requireContext);
        linearLayout3.a(requireContext);
        final int i13 = 2;
        linearLayout3.setOnClickListener(new View.OnClickListener(this) { // from class: m0.z
            public final /* synthetic */ a0 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int selectedItemPosition;
                int i122 = i13;
                a0 a0Var = this.c;
                switch (i122) {
                    case 0:
                        String str = a0.f3597h;
                        Intent intent = new Intent(a0Var.requireContext(), (Class<?>) FilePickerActivity.class);
                        intent.putExtra(e0.m.h(new byte[]{-7, 99, -29, 116, -13, 83, 49, 83, -6, 100, -4, 120, -61, 88}, new byte[]{-97, 10, -113, 17, -84, 54, 73, 39}), e0.m.h(new byte[]{39, 90, -90, 3}, new byte[]{9, 32, -49, 115, ByteCompanionObject.MIN_VALUE, 56, 108, -54}));
                        intent.putExtra(e0.m.h(new byte[]{116, 74, -36, -20, -99, 90, 28, -39, 119, 77, -61, -32, -83, 81, 59, -64, 125, 71, -43, -42, -79, 90, 10, -55}, new byte[]{18, 35, -80, -119, -62, 63, 100, -83}), 1);
                        a0Var.startActivityForResult(intent, 101544);
                        return;
                    case 1:
                        ArrayList arrayList = a0Var.c;
                        Spinner spinner = a0Var.d;
                        if (spinner != null && (selectedItemPosition = spinner.getSelectedItemPosition()) >= 0 && selectedItemPosition < arrayList.size()) {
                            String str2 = (String) arrayList.get(selectedItemPosition);
                            if (!a0.f3599j.equals(str2)) {
                                new AlertDialog.Builder(a0Var.requireContext()).setTitle(com.example.navistart.R.string.delete_custom_widget_title).setMessage(a0Var.getString(com.example.navistart.R.string.delete_custom_widget_message, str2)).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(com.example.navistart.R.string.delete_custom_widget, new e0.e0(3, a0Var, str2)).show();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        String str3 = a0.f3597h;
                        W.u(a0Var.requireContext(), i1.class, i1.x(e0.m.h(new byte[]{4, 25, -104, 74, 21}, new byte[]{102, 117, -7, 41, 126, -79, 16, -119})));
                        return;
                }
            }
        });
        linearLayout2.addView(this.d);
        linearLayout2.addView(this.e);
        linearLayout2.addView(imageButton);
        linearLayout2.addView(linearLayout3);
        linearLayout.addView(listView);
        linearLayout.addView(linearLayout2);
        linearLayout.addView(textView);
        linearLayout.addView(seekBar);
        listView.setOnItemClickListener(new h7.b(i13, this));
        return linearLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.d != null && this.f3602g != null) {
            v();
        }
    }

    public final int t(int i10) {
        return (int) (i10 * getResources().getDisplayMetrics().density);
    }

    public final void u(File file) {
        try {
            String r = b1.u.r(file, (File) this.f3602g.f305f, false);
            h0.b.o().saveString(f3598i, r);
            v();
            int indexOf = this.c.indexOf(r);
            if (indexOf >= 0) {
                this.d.setSelection(indexOf);
            }
            y5.k.x(requireContext().getApplicationContext(), e0.m.h(new byte[]{5, 54, -104, -126, -34, 105, -8, -14, 5, 17, -103, -72, 46, 12, -85, -107, 84, 117, -54, -22, -66, 13, -107, -108, 107, 116, -6, -22, -75, 13, -99, -108, 104}, new byte[]{-43, -92, 72, 58, 14, -35, 40, 68}));
        } catch (Exception e) {
            y5.k.x(requireContext().getApplicationContext(), e0.m.h(new byte[]{39, -11, -106, 115, -33, -68, 46, -74, 39, -47, -105, 75, 47, 94, -73, 87, -51, 75}, new byte[]{-9, 107, 71, -5, 15, 4, -2, 7}) + e.getMessage());
        }
    }

    public final void v() {
        this.d.setOnItemSelectedListener(null);
        ArrayList arrayList = this.c;
        arrayList.clear();
        String str = f3599j;
        arrayList.add(str);
        arrayList.addAll(this.f3602g.h());
        ArrayAdapter arrayAdapter = new ArrayAdapter(requireContext(), R.layout.simple_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        this.d.setAdapter((SpinnerAdapter) arrayAdapter);
        h0.b.a();
        int indexOf = arrayList.indexOf(h0.b.o().loadString(f3598i, str));
        if (indexOf >= 0) {
            this.d.setSelection(indexOf);
        }
        this.d.setOnItemSelectedListener(new e0.e1(2, this));
        w();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w() {
        /*
            r3 = this;
            android.widget.ImageButton r0 = r3.e
            if (r0 == 0) goto L38
            android.widget.Spinner r0 = r3.d
            if (r0 != 0) goto L9
            goto L38
        L9:
            int r0 = r0.getSelectedItemPosition()
            if (r0 < 0) goto L25
            java.util.ArrayList r1 = r3.c
            int r2 = r1.size()
            if (r0 >= r2) goto L25
            java.lang.String r2 = m0.a0.f3599j
            java.lang.Object r0 = r1.get(r0)
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L25
            r0 = 1
            goto L26
        L25:
            r0 = 0
        L26:
            android.widget.ImageButton r1 = r3.e
            r1.setEnabled(r0)
            android.widget.ImageButton r1 = r3.e
            if (r0 == 0) goto L32
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L35
        L32:
            r0 = 1051931443(0x3eb33333, float:0.35)
        L35:
            r1.setAlpha(r0)
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.a0.w():void");
    }
}
