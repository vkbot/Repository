package m0;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Switch;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.example.navistart.R;
import com.example.navistart.W;
import com.example.navistart.mainview.DownloadButton;
import com.woha.appmanag.FilePickerActivity;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class c2 extends l0.b {

    /* renamed from: i, reason: collision with root package name */
    public static final String f3617i = e0.m.h(new byte[]{-44, ByteCompanionObject.MAX_VALUE, 69, -82, 0, 95, -56, 20, -58, 110, 120, -126, 18, 90, -55, 16, -41, ByteCompanionObject.MAX_VALUE, 67}, new byte[]{-93, 26, 39, -15, 119, 54, -84, 115});

    /* renamed from: j, reason: collision with root package name */
    public static final String f3618j = e0.m.h(new byte[]{-123, -66, 29, -19, -106, 53, -50, 98, -94, -94, 41, -4, -74, 10, -35, ByteCompanionObject.MAX_VALUE, -84}, new byte[]{-56, -57, 74, -120, -12, 101, -68, 13});

    /* renamed from: k, reason: collision with root package name */
    public static final String f3619k = e0.m.h(new byte[]{37, 9, 66, 107, 5, 111, -39}, new byte[]{65, 108, 36, 10, 112, 3, -83, -41});

    /* renamed from: b, reason: collision with root package name */
    public Spinner f3620b;
    public Button c;
    public ImageButton d;
    public Button e;

    /* renamed from: f, reason: collision with root package name */
    public File f3621f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f3622g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public ArrayAdapter f3623h;

    public static void t(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                t(file2);
            }
        }
        file.delete();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        String stringExtra;
        super.onActivityResult(i10, i11, intent);
        if (i10 == 101 && i11 == -1 && intent != null && (stringExtra = intent.getStringExtra(e0.m.h(new byte[]{96, -117, 19, 55, 63, -19, -108, -52, 76, -120, 22, 62, 57}, new byte[]{19, -18, ByteCompanionObject.MAX_VALUE, 82, 92, -103, -15, -88}))) != null) {
            try {
                String r = b1.u.r(new File(stringExtra), this.f3621f, false);
                h0.b.o().saveString(f3617i, r);
                v();
                int indexOf = this.f3622g.indexOf(r);
                if (indexOf >= 0) {
                    this.f3620b.setSelection(indexOf);
                }
                y5.k.x(requireContext().getApplicationContext(), e0.m.h(new byte[]{-110, 5, 117, 26, -116, -33, 51, -58, -110, 34, 116, 32, 124, -70, 96, -95, -61, 70, 39, 114, -20, -69, 94, -96, -4, 71, 23, 114, -25, -69, 86, -96, -1}, new byte[]{66, -105, -91, -94, 92, 107, -29, 112}));
            } catch (Exception e) {
                y5.k.x(requireContext().getApplicationContext(), e0.m.h(new byte[]{-103, -109, 11, -28, 45, -115, -64, 16, -103, -73, 10, -36, -35, 111, 89, -15, 115, 45}, new byte[]{73, 13, -38, 108, -3, 53, 16, -95}) + e.getMessage());
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ScrollView scrollView = new ScrollView(requireContext());
        scrollView.setFillViewport(true);
        scrollView.addView(layoutInflater.inflate(R.layout.fra_speedboardactset, (ViewGroup) scrollView, false));
        return scrollView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f3620b != null && this.f3621f != null) {
            v();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Switch r9 = (Switch) view.findViewById(R.id.switch23);
        final int i10 = 0;
        r9.setChecked(h0.b.o().loadBoolean(e0.m.h(new byte[]{-69, -94, 10, 55, -81, 65, 68, 69, -102, -74, 46, 49, -65, 106, 120, 65, -100, -90, 6, 60, -84, 112, 116, 99, -72, -127}, new byte[]{-24, -46, 111, 82, -53, 3, 43, 36}), false));
        r9.setOnCheckedChangeListener(new z1(0));
        this.f3620b = (Spinner) view.findViewById(R.id.spinnerWidgets);
        this.c = (Button) view.findViewById(R.id.btnUploadZip);
        this.d = (ImageButton) view.findViewById(R.id.btnDeleteWidget);
        Button button = new Button(requireContext());
        button.setText(R.string.custom_widget_settings);
        button.setVisibility(8);
        button.setMinimumHeight(Math.round(getResources().getDisplayMetrics().density * 48.0f));
        final int i11 = 1;
        if (this.c.getParent() instanceof View) {
            View view2 = (View) this.c.getParent();
            if (view2.getParent() instanceof LinearLayout) {
                LinearLayout linearLayout = (LinearLayout) view2.getParent();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.topMargin = Math.round(getResources().getDisplayMetrics().density * 12.0f);
                linearLayout.addView(button, linearLayout.indexOfChild(view2) + 1, layoutParams);
            }
        }
        this.e = button;
        File file = new File(requireContext().getFilesDir(), f3618j);
        this.f3621f = file;
        if (!file.exists()) {
            this.f3621f.mkdirs();
        }
        this.c.setOnClickListener(new View.OnClickListener(this) { // from class: m0.a2
            public final /* synthetic */ c2 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int selectedItemPosition;
                int i12 = i10;
                c2 c2Var = this.c;
                switch (i12) {
                    case 0:
                        String str = c2.f3617i;
                        Intent intent = new Intent(c2Var.requireContext(), (Class<?>) FilePickerActivity.class);
                        intent.putExtra(e0.m.h(new byte[]{-125, -45, -69, -53, 35, 72, -108, -93, ByteCompanionObject.MIN_VALUE, -44, -92, -57, 19, 67}, new byte[]{-27, -70, -41, -82, 124, 45, -20, -41}), e0.m.h(new byte[]{-10, 86, 115, -32}, new byte[]{-40, 44, 26, -112, -25, 113, -117, -63}));
                        intent.putExtra(e0.m.h(new byte[]{-92, -60, 124, -91, 24, -85, 91, -37, -89, -61, 99, -87, 40, -96, 124, -62, -83, -55, 117, -97, 52, -85, 77, -53}, new byte[]{-62, -83, 16, -64, 71, -50, 35, -81}), 1);
                        c2Var.startActivityForResult(intent, TypedValues.TYPE_TARGET);
                        return;
                    case 1:
                        ArrayList arrayList = c2Var.f3622g;
                        Spinner spinner = c2Var.f3620b;
                        if (spinner != null && (selectedItemPosition = spinner.getSelectedItemPosition()) >= 0 && selectedItemPosition < arrayList.size()) {
                            String str2 = (String) arrayList.get(selectedItemPosition);
                            if (!c2.f3619k.equals(str2)) {
                                new AlertDialog.Builder(c2Var.requireContext()).setTitle(R.string.delete_custom_widget_title).setMessage(c2Var.getString(R.string.delete_custom_widget_message, str2)).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.delete_custom_widget, new e0.e0(4, c2Var, str2)).show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        ArrayList arrayList2 = c2Var.f3622g;
                        int selectedItemPosition2 = c2Var.f3620b.getSelectedItemPosition();
                        if (selectedItemPosition2 >= 0 && selectedItemPosition2 < arrayList2.size()) {
                            String str3 = (String) arrayList2.get(selectedItemPosition2);
                            if (c2Var.u(str3) != null) {
                                Context requireContext = c2Var.requireContext();
                                String str4 = c2.f3618j;
                                String str5 = o0.c;
                                Bundle bundle2 = new Bundle();
                                bundle2.putString(o0.c, str3);
                                bundle2.putString(o0.d, str4);
                                W.t(requireContext, o0.class, bundle2);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        String str6 = c2.f3617i;
                        W.u(c2Var.requireContext(), i1.class, i1.x(e0.m.h(new byte[]{99, -60, 96, 72, Base64.padSymbol}, new byte[]{1, -85, 1, 58, 89, -39, 91, 43})));
                        return;
                }
            }
        });
        this.d.setOnClickListener(new View.OnClickListener(this) { // from class: m0.a2
            public final /* synthetic */ c2 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int selectedItemPosition;
                int i12 = i11;
                c2 c2Var = this.c;
                switch (i12) {
                    case 0:
                        String str = c2.f3617i;
                        Intent intent = new Intent(c2Var.requireContext(), (Class<?>) FilePickerActivity.class);
                        intent.putExtra(e0.m.h(new byte[]{-125, -45, -69, -53, 35, 72, -108, -93, ByteCompanionObject.MIN_VALUE, -44, -92, -57, 19, 67}, new byte[]{-27, -70, -41, -82, 124, 45, -20, -41}), e0.m.h(new byte[]{-10, 86, 115, -32}, new byte[]{-40, 44, 26, -112, -25, 113, -117, -63}));
                        intent.putExtra(e0.m.h(new byte[]{-92, -60, 124, -91, 24, -85, 91, -37, -89, -61, 99, -87, 40, -96, 124, -62, -83, -55, 117, -97, 52, -85, 77, -53}, new byte[]{-62, -83, 16, -64, 71, -50, 35, -81}), 1);
                        c2Var.startActivityForResult(intent, TypedValues.TYPE_TARGET);
                        return;
                    case 1:
                        ArrayList arrayList = c2Var.f3622g;
                        Spinner spinner = c2Var.f3620b;
                        if (spinner != null && (selectedItemPosition = spinner.getSelectedItemPosition()) >= 0 && selectedItemPosition < arrayList.size()) {
                            String str2 = (String) arrayList.get(selectedItemPosition);
                            if (!c2.f3619k.equals(str2)) {
                                new AlertDialog.Builder(c2Var.requireContext()).setTitle(R.string.delete_custom_widget_title).setMessage(c2Var.getString(R.string.delete_custom_widget_message, str2)).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.delete_custom_widget, new e0.e0(4, c2Var, str2)).show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        ArrayList arrayList2 = c2Var.f3622g;
                        int selectedItemPosition2 = c2Var.f3620b.getSelectedItemPosition();
                        if (selectedItemPosition2 >= 0 && selectedItemPosition2 < arrayList2.size()) {
                            String str3 = (String) arrayList2.get(selectedItemPosition2);
                            if (c2Var.u(str3) != null) {
                                Context requireContext = c2Var.requireContext();
                                String str4 = c2.f3618j;
                                String str5 = o0.c;
                                Bundle bundle2 = new Bundle();
                                bundle2.putString(o0.c, str3);
                                bundle2.putString(o0.d, str4);
                                W.t(requireContext, o0.class, bundle2);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        String str6 = c2.f3617i;
                        W.u(c2Var.requireContext(), i1.class, i1.x(e0.m.h(new byte[]{99, -60, 96, 72, Base64.padSymbol}, new byte[]{1, -85, 1, 58, 89, -39, 91, 43})));
                        return;
                }
            }
        });
        final int i12 = 2;
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: m0.a2
            public final /* synthetic */ c2 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int selectedItemPosition;
                int i122 = i12;
                c2 c2Var = this.c;
                switch (i122) {
                    case 0:
                        String str = c2.f3617i;
                        Intent intent = new Intent(c2Var.requireContext(), (Class<?>) FilePickerActivity.class);
                        intent.putExtra(e0.m.h(new byte[]{-125, -45, -69, -53, 35, 72, -108, -93, ByteCompanionObject.MIN_VALUE, -44, -92, -57, 19, 67}, new byte[]{-27, -70, -41, -82, 124, 45, -20, -41}), e0.m.h(new byte[]{-10, 86, 115, -32}, new byte[]{-40, 44, 26, -112, -25, 113, -117, -63}));
                        intent.putExtra(e0.m.h(new byte[]{-92, -60, 124, -91, 24, -85, 91, -37, -89, -61, 99, -87, 40, -96, 124, -62, -83, -55, 117, -97, 52, -85, 77, -53}, new byte[]{-62, -83, 16, -64, 71, -50, 35, -81}), 1);
                        c2Var.startActivityForResult(intent, TypedValues.TYPE_TARGET);
                        return;
                    case 1:
                        ArrayList arrayList = c2Var.f3622g;
                        Spinner spinner = c2Var.f3620b;
                        if (spinner != null && (selectedItemPosition = spinner.getSelectedItemPosition()) >= 0 && selectedItemPosition < arrayList.size()) {
                            String str2 = (String) arrayList.get(selectedItemPosition);
                            if (!c2.f3619k.equals(str2)) {
                                new AlertDialog.Builder(c2Var.requireContext()).setTitle(R.string.delete_custom_widget_title).setMessage(c2Var.getString(R.string.delete_custom_widget_message, str2)).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.delete_custom_widget, new e0.e0(4, c2Var, str2)).show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        ArrayList arrayList2 = c2Var.f3622g;
                        int selectedItemPosition2 = c2Var.f3620b.getSelectedItemPosition();
                        if (selectedItemPosition2 >= 0 && selectedItemPosition2 < arrayList2.size()) {
                            String str3 = (String) arrayList2.get(selectedItemPosition2);
                            if (c2Var.u(str3) != null) {
                                Context requireContext = c2Var.requireContext();
                                String str4 = c2.f3618j;
                                String str5 = o0.c;
                                Bundle bundle2 = new Bundle();
                                bundle2.putString(o0.c, str3);
                                bundle2.putString(o0.d, str4);
                                W.t(requireContext, o0.class, bundle2);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        String str6 = c2.f3617i;
                        W.u(c2Var.requireContext(), i1.class, i1.x(e0.m.h(new byte[]{99, -60, 96, 72, Base64.padSymbol}, new byte[]{1, -85, 1, 58, 89, -39, 91, 43})));
                        return;
                }
            }
        });
        final int i13 = 3;
        ((DownloadButton) view.findViewById(R.id.btnUploadStore)).setOnClickListener(new View.OnClickListener(this) { // from class: m0.a2
            public final /* synthetic */ c2 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int selectedItemPosition;
                int i122 = i13;
                c2 c2Var = this.c;
                switch (i122) {
                    case 0:
                        String str = c2.f3617i;
                        Intent intent = new Intent(c2Var.requireContext(), (Class<?>) FilePickerActivity.class);
                        intent.putExtra(e0.m.h(new byte[]{-125, -45, -69, -53, 35, 72, -108, -93, ByteCompanionObject.MIN_VALUE, -44, -92, -57, 19, 67}, new byte[]{-27, -70, -41, -82, 124, 45, -20, -41}), e0.m.h(new byte[]{-10, 86, 115, -32}, new byte[]{-40, 44, 26, -112, -25, 113, -117, -63}));
                        intent.putExtra(e0.m.h(new byte[]{-92, -60, 124, -91, 24, -85, 91, -37, -89, -61, 99, -87, 40, -96, 124, -62, -83, -55, 117, -97, 52, -85, 77, -53}, new byte[]{-62, -83, 16, -64, 71, -50, 35, -81}), 1);
                        c2Var.startActivityForResult(intent, TypedValues.TYPE_TARGET);
                        return;
                    case 1:
                        ArrayList arrayList = c2Var.f3622g;
                        Spinner spinner = c2Var.f3620b;
                        if (spinner != null && (selectedItemPosition = spinner.getSelectedItemPosition()) >= 0 && selectedItemPosition < arrayList.size()) {
                            String str2 = (String) arrayList.get(selectedItemPosition);
                            if (!c2.f3619k.equals(str2)) {
                                new AlertDialog.Builder(c2Var.requireContext()).setTitle(R.string.delete_custom_widget_title).setMessage(c2Var.getString(R.string.delete_custom_widget_message, str2)).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.delete_custom_widget, new e0.e0(4, c2Var, str2)).show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        ArrayList arrayList2 = c2Var.f3622g;
                        int selectedItemPosition2 = c2Var.f3620b.getSelectedItemPosition();
                        if (selectedItemPosition2 >= 0 && selectedItemPosition2 < arrayList2.size()) {
                            String str3 = (String) arrayList2.get(selectedItemPosition2);
                            if (c2Var.u(str3) != null) {
                                Context requireContext = c2Var.requireContext();
                                String str4 = c2.f3618j;
                                String str5 = o0.c;
                                Bundle bundle2 = new Bundle();
                                bundle2.putString(o0.c, str3);
                                bundle2.putString(o0.d, str4);
                                W.t(requireContext, o0.class, bundle2);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        String str6 = c2.f3617i;
                        W.u(c2Var.requireContext(), i1.class, i1.x(e0.m.h(new byte[]{99, -60, 96, 72, Base64.padSymbol}, new byte[]{1, -85, 1, 58, 89, -39, 91, 43})));
                        return;
                }
            }
        });
    }

    public final File u(String str) {
        if (this.f3621f != null && str != null && !str.trim().isEmpty() && !str.contains(e0.m.h(new byte[]{-74}, new byte[]{-103, 65, -28, Base64.padSymbol, -32, -70, -42, -51})) && !str.contains(e0.m.h(new byte[]{54}, new byte[]{106, -115, -17, -42, -113, -3, 80, -91}))) {
            File file = new File(new File(this.f3621f, str), e0.m.h(new byte[]{-66, -64, -20, 38, -104, 81, -83, 83, -29, -51, -20, 63, -99}, new byte[]{-51, -91, -104, 82, -15, 63, -54, 32}));
            try {
                File canonicalFile = this.f3621f.getCanonicalFile();
                File canonicalFile2 = file.getCanonicalFile();
                if (canonicalFile2.getPath().startsWith(canonicalFile.getPath() + File.separator)) {
                    if (canonicalFile2.isFile()) {
                        return canonicalFile2;
                    }
                    return null;
                }
                return null;
            } catch (IOException unused) {
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.io.FileFilter, java.lang.Object] */
    public final void v() {
        this.f3620b.setOnItemSelectedListener(null);
        ArrayList arrayList = this.f3622g;
        arrayList.clear();
        String str = f3619k;
        arrayList.add(str);
        File[] listFiles = this.f3621f.listFiles((FileFilter) new Object());
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!file.getName().equals(str) && !file.getName().startsWith(e0.m.h(new byte[]{21, 1, -112, 67, 114, -44, 79, -36, 22}, new byte[]{59, 104, -2, 48, 6, -75, 35, -80})) && !file.getName().startsWith(e0.m.h(new byte[]{48, -114, -81, 122, 107, 56, 72, 1}, new byte[]{30, -20, -50, 25, 0, 77, 56, 44}))) {
                    arrayList.add(file.getName());
                }
            }
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, arrayList);
        this.f3623h = arrayAdapter;
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.f3620b.setAdapter((SpinnerAdapter) this.f3623h);
        h0.b.a();
        int indexOf = arrayList.indexOf(h0.b.o().loadString(f3617i, str));
        if (indexOf >= 0) {
            this.f3620b.setSelection(indexOf);
        }
        this.f3620b.setOnItemSelectedListener(new e0.e1(3, this));
        w();
        x();
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
            android.widget.ImageButton r0 = r3.d
            if (r0 == 0) goto L38
            android.widget.Spinner r0 = r3.f3620b
            if (r0 != 0) goto L9
            goto L38
        L9:
            int r0 = r0.getSelectedItemPosition()
            if (r0 < 0) goto L25
            java.util.ArrayList r1 = r3.f3622g
            int r2 = r1.size()
            if (r0 >= r2) goto L25
            java.lang.String r2 = m0.c2.f3619k
            java.lang.Object r0 = r1.get(r0)
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L25
            r0 = 1
            goto L26
        L25:
            r0 = 0
        L26:
            android.widget.ImageButton r1 = r3.d
            r1.setEnabled(r0)
            android.widget.ImageButton r1 = r3.d
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
        throw new UnsupportedOperationException("Method not decompiled: m0.c2.w():void");
    }

    public final void x() {
        int i10;
        int selectedItemPosition;
        Button button = this.e;
        if (button == null) {
            return;
        }
        Spinner spinner = this.f3620b;
        File file = null;
        if (spinner != null && (selectedItemPosition = spinner.getSelectedItemPosition()) >= 0) {
            ArrayList arrayList = this.f3622g;
            if (selectedItemPosition < arrayList.size()) {
                file = u((String) arrayList.get(selectedItemPosition));
            }
        }
        if (file == null) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        button.setVisibility(i10);
    }
}
