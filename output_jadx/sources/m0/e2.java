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
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.example.navistart.R;
import com.example.navistart.W;
import com.example.navistart.mainview.DownloadButton;
import com.woha.appmanag.FilePickerActivity;
import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class e2 extends l0.b {

    /* renamed from: j, reason: collision with root package name */
    public static final String f3676j = e0.m.h(new byte[]{-5, -38, -41, 3, -125, -72, -104, -80, -36, -58, -29, 18, -87, -67, -82}, new byte[]{-74, -93, ByteCompanionObject.MIN_VALUE, 102, -31, -24, -22, -33});

    /* renamed from: k, reason: collision with root package name */
    public static final String f3677k = e0.m.h(new byte[]{-124, -15, 69, -75, -66, -49, 34, 54, -93, -19, 113, -92, -108, -54, 20, 6, -102, -19, 102, -92, -75, -15, 55, 42, -106, -61, 119, -87}, new byte[]{-55, -120, 18, -48, -36, -97, 80, 89});

    /* renamed from: l, reason: collision with root package name */
    public static final String f3678l = e0.m.h(new byte[]{-74, 73, -53, 0, 9, 22, -100, 118, -70, 89, -55}, new byte[]{-46, 44, -83, 97, 124, 122, -24, 41});

    /* renamed from: m, reason: collision with root package name */
    public static final String f3679m = e0.m.h(new byte[]{119, -89, -15, -10, -119, -55, -44, -62, 123, -73, -13, -71, -122, -52, -48}, new byte[]{19, -62, -105, -105, -4, -91, -96, -99});

    /* renamed from: b, reason: collision with root package name */
    public Spinner f3680b;
    public Button c;
    public ImageButton d;
    public Button e;

    /* renamed from: f, reason: collision with root package name */
    public File f3681f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f3682g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public ArrayAdapter f3683h;

    /* renamed from: i, reason: collision with root package name */
    public b1.m f3684i;

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        String stringExtra;
        super.onActivityResult(i10, i11, intent);
        if (i10 == 101 && i11 == -1 && intent != null && (stringExtra = intent.getStringExtra(e0.m.h(new byte[]{-110, -116, -17, -82, -70, -28, 85, -43, -66, -113, -22, -89, -68}, new byte[]{-31, -23, -125, -53, -39, -112, 48, -79}))) != null) {
            v(new File(stringExtra));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fra_speedhudactset, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f3680b != null && this.f3684i != null) {
            w();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f3680b = (Spinner) view.findViewById(R.id.spinnerWidgets);
        this.c = (Button) view.findViewById(R.id.btnUploadZip);
        this.d = (ImageButton) view.findViewById(R.id.btnDeleteWidget);
        this.e = (Button) view.findViewById(R.id.btnWidgetSettings);
        e0.v0 v0Var = new e0.v0(22);
        e0.v0 v0Var2 = new e0.v0(23);
        e0.v0 v0Var3 = new e0.v0(24);
        e0.v0 v0Var4 = new e0.v0(25);
        Button button = (Button) view.findViewById(R.id.btnHUDCheck);
        button.setOnClickListener(new androidx.navigation.ui.a(13, v0Var, v0Var3));
        Button button2 = (Button) view.findViewById(R.id.btnHUDstop);
        button2.setOnClickListener(new androidx.navigation.ui.a(14, v0Var2, v0Var4));
        DownloadButton downloadButton = (DownloadButton) view.findViewById(R.id.btnUploadStore);
        t(this.c);
        t(downloadButton);
        t(button);
        t(button2);
        this.f3681f = new File(requireContext().getFilesDir(), f3676j);
        this.f3684i = new b1.m(requireContext(), f3679m, this.f3681f, f3678l);
        final int i10 = 0;
        this.c.setOnClickListener(new View.OnClickListener(this) { // from class: m0.d2
            public final /* synthetic */ e2 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int selectedItemPosition;
                int i11 = i10;
                e2 e2Var = this.c;
                switch (i11) {
                    case 0:
                        String str = e2.f3676j;
                        Intent intent = new Intent(e2Var.requireContext(), (Class<?>) FilePickerActivity.class);
                        intent.putExtra(e0.m.h(new byte[]{-42, -11, -18, 4, -55, -80, 101, 12, -43, -14, -15, 8, -7, -69}, new byte[]{-80, -100, -126, 97, -106, -43, 29, 120}), e0.m.h(new byte[]{-101, -55, -104, -116}, new byte[]{-75, -77, -15, -4, -90, -80, -93, 16}));
                        intent.putExtra(e0.m.h(new byte[]{0, 103, 60, -75, -28, -41, -92, -47, 3, 96, 35, -71, -44, -36, -125, -56, 9, 106, 53, -113, -56, -41, -78, -63}, new byte[]{102, 14, 80, -48, -69, -78, -36, -91}), 1);
                        e2Var.startActivityForResult(intent, TypedValues.TYPE_TARGET);
                        return;
                    case 1:
                        ArrayList arrayList = e2Var.f3682g;
                        Spinner spinner = e2Var.f3680b;
                        if (spinner != null && (selectedItemPosition = spinner.getSelectedItemPosition()) >= 0 && selectedItemPosition < arrayList.size()) {
                            String str2 = (String) arrayList.get(selectedItemPosition);
                            if (!e2.f3678l.equals(str2)) {
                                new AlertDialog.Builder(e2Var.requireContext()).setTitle(R.string.delete_custom_widget_title).setMessage(e2Var.getString(R.string.delete_custom_widget_message, str2)).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.delete_custom_widget, new e0.e0(5, e2Var, str2)).show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        ArrayList arrayList2 = e2Var.f3682g;
                        int selectedItemPosition2 = e2Var.f3680b.getSelectedItemPosition();
                        if (selectedItemPosition2 >= 0 && selectedItemPosition2 < arrayList2.size()) {
                            String str3 = (String) arrayList2.get(selectedItemPosition2);
                            if (e2Var.u(str3) != null) {
                                Context requireContext = e2Var.requireContext();
                                String str4 = o0.c;
                                String h2 = e0.m.h(new byte[]{62, 19, 111, 36, 58, 75, -124, -95, 25, 15, 91, 53, 16, 78, -78}, new byte[]{115, 106, 56, 65, 88, 27, -10, -50});
                                Bundle bundle2 = new Bundle();
                                bundle2.putString(o0.c, str3);
                                bundle2.putString(o0.d, h2);
                                W.t(requireContext, o0.class, bundle2);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        String str5 = e2.f3676j;
                        W.u(e2Var.requireContext(), i1.class, i1.x(e0.m.h(new byte[]{-29, -47, 97}, new byte[]{-117, -92, 5, -88, 93, -63, 56, -9})));
                        return;
                }
            }
        });
        final int i11 = 1;
        this.d.setOnClickListener(new View.OnClickListener(this) { // from class: m0.d2
            public final /* synthetic */ e2 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int selectedItemPosition;
                int i112 = i11;
                e2 e2Var = this.c;
                switch (i112) {
                    case 0:
                        String str = e2.f3676j;
                        Intent intent = new Intent(e2Var.requireContext(), (Class<?>) FilePickerActivity.class);
                        intent.putExtra(e0.m.h(new byte[]{-42, -11, -18, 4, -55, -80, 101, 12, -43, -14, -15, 8, -7, -69}, new byte[]{-80, -100, -126, 97, -106, -43, 29, 120}), e0.m.h(new byte[]{-101, -55, -104, -116}, new byte[]{-75, -77, -15, -4, -90, -80, -93, 16}));
                        intent.putExtra(e0.m.h(new byte[]{0, 103, 60, -75, -28, -41, -92, -47, 3, 96, 35, -71, -44, -36, -125, -56, 9, 106, 53, -113, -56, -41, -78, -63}, new byte[]{102, 14, 80, -48, -69, -78, -36, -91}), 1);
                        e2Var.startActivityForResult(intent, TypedValues.TYPE_TARGET);
                        return;
                    case 1:
                        ArrayList arrayList = e2Var.f3682g;
                        Spinner spinner = e2Var.f3680b;
                        if (spinner != null && (selectedItemPosition = spinner.getSelectedItemPosition()) >= 0 && selectedItemPosition < arrayList.size()) {
                            String str2 = (String) arrayList.get(selectedItemPosition);
                            if (!e2.f3678l.equals(str2)) {
                                new AlertDialog.Builder(e2Var.requireContext()).setTitle(R.string.delete_custom_widget_title).setMessage(e2Var.getString(R.string.delete_custom_widget_message, str2)).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.delete_custom_widget, new e0.e0(5, e2Var, str2)).show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        ArrayList arrayList2 = e2Var.f3682g;
                        int selectedItemPosition2 = e2Var.f3680b.getSelectedItemPosition();
                        if (selectedItemPosition2 >= 0 && selectedItemPosition2 < arrayList2.size()) {
                            String str3 = (String) arrayList2.get(selectedItemPosition2);
                            if (e2Var.u(str3) != null) {
                                Context requireContext = e2Var.requireContext();
                                String str4 = o0.c;
                                String h2 = e0.m.h(new byte[]{62, 19, 111, 36, 58, 75, -124, -95, 25, 15, 91, 53, 16, 78, -78}, new byte[]{115, 106, 56, 65, 88, 27, -10, -50});
                                Bundle bundle2 = new Bundle();
                                bundle2.putString(o0.c, str3);
                                bundle2.putString(o0.d, h2);
                                W.t(requireContext, o0.class, bundle2);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        String str5 = e2.f3676j;
                        W.u(e2Var.requireContext(), i1.class, i1.x(e0.m.h(new byte[]{-29, -47, 97}, new byte[]{-117, -92, 5, -88, 93, -63, 56, -9})));
                        return;
                }
            }
        });
        final int i12 = 2;
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: m0.d2
            public final /* synthetic */ e2 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int selectedItemPosition;
                int i112 = i12;
                e2 e2Var = this.c;
                switch (i112) {
                    case 0:
                        String str = e2.f3676j;
                        Intent intent = new Intent(e2Var.requireContext(), (Class<?>) FilePickerActivity.class);
                        intent.putExtra(e0.m.h(new byte[]{-42, -11, -18, 4, -55, -80, 101, 12, -43, -14, -15, 8, -7, -69}, new byte[]{-80, -100, -126, 97, -106, -43, 29, 120}), e0.m.h(new byte[]{-101, -55, -104, -116}, new byte[]{-75, -77, -15, -4, -90, -80, -93, 16}));
                        intent.putExtra(e0.m.h(new byte[]{0, 103, 60, -75, -28, -41, -92, -47, 3, 96, 35, -71, -44, -36, -125, -56, 9, 106, 53, -113, -56, -41, -78, -63}, new byte[]{102, 14, 80, -48, -69, -78, -36, -91}), 1);
                        e2Var.startActivityForResult(intent, TypedValues.TYPE_TARGET);
                        return;
                    case 1:
                        ArrayList arrayList = e2Var.f3682g;
                        Spinner spinner = e2Var.f3680b;
                        if (spinner != null && (selectedItemPosition = spinner.getSelectedItemPosition()) >= 0 && selectedItemPosition < arrayList.size()) {
                            String str2 = (String) arrayList.get(selectedItemPosition);
                            if (!e2.f3678l.equals(str2)) {
                                new AlertDialog.Builder(e2Var.requireContext()).setTitle(R.string.delete_custom_widget_title).setMessage(e2Var.getString(R.string.delete_custom_widget_message, str2)).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.delete_custom_widget, new e0.e0(5, e2Var, str2)).show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        ArrayList arrayList2 = e2Var.f3682g;
                        int selectedItemPosition2 = e2Var.f3680b.getSelectedItemPosition();
                        if (selectedItemPosition2 >= 0 && selectedItemPosition2 < arrayList2.size()) {
                            String str3 = (String) arrayList2.get(selectedItemPosition2);
                            if (e2Var.u(str3) != null) {
                                Context requireContext = e2Var.requireContext();
                                String str4 = o0.c;
                                String h2 = e0.m.h(new byte[]{62, 19, 111, 36, 58, 75, -124, -95, 25, 15, 91, 53, 16, 78, -78}, new byte[]{115, 106, 56, 65, 88, 27, -10, -50});
                                Bundle bundle2 = new Bundle();
                                bundle2.putString(o0.c, str3);
                                bundle2.putString(o0.d, h2);
                                W.t(requireContext, o0.class, bundle2);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        String str5 = e2.f3676j;
                        W.u(e2Var.requireContext(), i1.class, i1.x(e0.m.h(new byte[]{-29, -47, 97}, new byte[]{-117, -92, 5, -88, 93, -63, 56, -9})));
                        return;
                }
            }
        });
        final int i13 = 3;
        downloadButton.setOnClickListener(new View.OnClickListener(this) { // from class: m0.d2
            public final /* synthetic */ e2 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int selectedItemPosition;
                int i112 = i13;
                e2 e2Var = this.c;
                switch (i112) {
                    case 0:
                        String str = e2.f3676j;
                        Intent intent = new Intent(e2Var.requireContext(), (Class<?>) FilePickerActivity.class);
                        intent.putExtra(e0.m.h(new byte[]{-42, -11, -18, 4, -55, -80, 101, 12, -43, -14, -15, 8, -7, -69}, new byte[]{-80, -100, -126, 97, -106, -43, 29, 120}), e0.m.h(new byte[]{-101, -55, -104, -116}, new byte[]{-75, -77, -15, -4, -90, -80, -93, 16}));
                        intent.putExtra(e0.m.h(new byte[]{0, 103, 60, -75, -28, -41, -92, -47, 3, 96, 35, -71, -44, -36, -125, -56, 9, 106, 53, -113, -56, -41, -78, -63}, new byte[]{102, 14, 80, -48, -69, -78, -36, -91}), 1);
                        e2Var.startActivityForResult(intent, TypedValues.TYPE_TARGET);
                        return;
                    case 1:
                        ArrayList arrayList = e2Var.f3682g;
                        Spinner spinner = e2Var.f3680b;
                        if (spinner != null && (selectedItemPosition = spinner.getSelectedItemPosition()) >= 0 && selectedItemPosition < arrayList.size()) {
                            String str2 = (String) arrayList.get(selectedItemPosition);
                            if (!e2.f3678l.equals(str2)) {
                                new AlertDialog.Builder(e2Var.requireContext()).setTitle(R.string.delete_custom_widget_title).setMessage(e2Var.getString(R.string.delete_custom_widget_message, str2)).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.delete_custom_widget, new e0.e0(5, e2Var, str2)).show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        ArrayList arrayList2 = e2Var.f3682g;
                        int selectedItemPosition2 = e2Var.f3680b.getSelectedItemPosition();
                        if (selectedItemPosition2 >= 0 && selectedItemPosition2 < arrayList2.size()) {
                            String str3 = (String) arrayList2.get(selectedItemPosition2);
                            if (e2Var.u(str3) != null) {
                                Context requireContext = e2Var.requireContext();
                                String str4 = o0.c;
                                String h2 = e0.m.h(new byte[]{62, 19, 111, 36, 58, 75, -124, -95, 25, 15, 91, 53, 16, 78, -78}, new byte[]{115, 106, 56, 65, 88, 27, -10, -50});
                                Bundle bundle2 = new Bundle();
                                bundle2.putString(o0.c, str3);
                                bundle2.putString(o0.d, h2);
                                W.t(requireContext, o0.class, bundle2);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        String str5 = e2.f3676j;
                        W.u(e2Var.requireContext(), i1.class, i1.x(e0.m.h(new byte[]{-29, -47, 97}, new byte[]{-117, -92, 5, -88, 93, -63, 56, -9})));
                        return;
                }
            }
        });
    }

    public final void t(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LinearLayout.LayoutParams)) {
            return;
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.width = 0;
        layoutParams2.height = -2;
        layoutParams2.weight = 1.0f;
        view.setLayoutParams(layoutParams2);
        view.setMinimumWidth(0);
        view.setMinimumHeight(Math.round(48 * getResources().getDisplayMetrics().density));
    }

    public final File u(String str) {
        if (this.f3681f != null && str != null && !str.trim().isEmpty() && !str.contains(e0.m.h(new byte[]{63}, new byte[]{16, 94, -93, -100, -112, 29, 9, 14})) && !str.contains(e0.m.h(new byte[]{-114}, new byte[]{-46, -77, 71, -41, -106, -115, -122, 1}))) {
            File file = new File(new File(this.f3681f, str), e0.m.h(new byte[]{34, 24, 39, -34, -112, 78, 71, 70, ByteCompanionObject.MAX_VALUE, 21, 39, -57, -107}, new byte[]{81, 125, 83, -86, -7, 32, 32, 53}));
            try {
                File canonicalFile = this.f3681f.getCanonicalFile();
                File canonicalFile2 = file.getCanonicalFile();
                if (canonicalFile2.getPath().startsWith(canonicalFile.getPath() + File.separator)) {
                    if (canonicalFile2.isFile()) {
                        return canonicalFile2;
                    }
                    return null;
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    public final void v(File file) {
        try {
            String r = b1.u.r(file, (File) this.f3684i.f305f, false);
            h0.b.o().saveString(f3677k, r);
            w();
            int indexOf = this.f3682g.indexOf(r);
            if (indexOf >= 0) {
                this.f3680b.setSelection(indexOf);
            }
            x();
            y();
            y5.k.x(requireContext().getApplicationContext(), e0.m.h(new byte[]{-41, -8, -3, -40, -86, -28, 126, -37, -41, -33, -4, -30, 90, -127, 45, -68, -122, -69, -81, -80, -54, ByteCompanionObject.MIN_VALUE, 19, -67, -71, -70, -97, -80, -63, ByteCompanionObject.MIN_VALUE, 27, -67, -70}, new byte[]{7, 106, 45, 96, 122, 80, -82, 109}));
        } catch (Exception e) {
            y5.k.x(requireContext().getApplicationContext(), e0.m.h(new byte[]{-86, -68, -61, 27, 75, -105, -127, 5, -86, -104, -62, 35, -69, 117, 24, -28, 64, 2}, new byte[]{122, 34, 18, -109, -101, 47, 81, -76}) + e.getMessage());
        }
    }

    public final void w() {
        this.f3680b.setOnItemSelectedListener(null);
        ArrayList arrayList = this.f3682g;
        arrayList.clear();
        String str = f3678l;
        arrayList.add(str);
        arrayList.addAll(this.f3684i.h());
        ArrayAdapter arrayAdapter = new ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, arrayList);
        this.f3683h = arrayAdapter;
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.f3680b.setAdapter((SpinnerAdapter) this.f3683h);
        h0.b.a();
        int indexOf = arrayList.indexOf(h0.b.o().loadString(f3677k, str));
        if (indexOf >= 0) {
            this.f3680b.setSelection(indexOf);
        }
        this.f3680b.setOnItemSelectedListener(new e0.e1(4, this));
        x();
        y();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x() {
        /*
            r3 = this;
            android.widget.ImageButton r0 = r3.d
            if (r0 == 0) goto L38
            android.widget.Spinner r0 = r3.f3680b
            if (r0 != 0) goto L9
            goto L38
        L9:
            int r0 = r0.getSelectedItemPosition()
            if (r0 < 0) goto L25
            java.util.ArrayList r1 = r3.f3682g
            int r2 = r1.size()
            if (r0 >= r2) goto L25
            java.lang.String r2 = m0.e2.f3678l
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
        throw new UnsupportedOperationException("Method not decompiled: m0.e2.x():void");
    }

    public final void y() {
        int i10;
        int selectedItemPosition;
        Button button = this.e;
        if (button == null) {
            return;
        }
        Spinner spinner = this.f3680b;
        File file = null;
        if (spinner != null && (selectedItemPosition = spinner.getSelectedItemPosition()) >= 0) {
            ArrayList arrayList = this.f3682g;
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
