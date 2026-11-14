package m0;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.navistart.R;
import e0.p3;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class n3 extends l0.b {
    public ExecutorService e;

    /* renamed from: f, reason: collision with root package name */
    public Future f3805f;

    /* renamed from: g, reason: collision with root package name */
    public int f3806g;

    /* renamed from: h, reason: collision with root package name */
    public RecyclerView f3807h;

    /* renamed from: i, reason: collision with root package name */
    public TextView f3808i;

    /* renamed from: j, reason: collision with root package name */
    public TextView f3809j;

    /* renamed from: k, reason: collision with root package name */
    public l3 f3810k;

    /* renamed from: m, reason: collision with root package name */
    public File f3812m;

    /* renamed from: n, reason: collision with root package name */
    public com.bumptech.glide.manager.t f3813n;

    /* renamed from: o, reason: collision with root package name */
    public ExecutorService f3814o;

    /* renamed from: p, reason: collision with root package name */
    public AlertDialog f3815p;

    /* renamed from: q, reason: collision with root package name */
    public AlertDialog f3816q;
    public File r;

    /* renamed from: s, reason: collision with root package name */
    public int f3817s;
    public boolean t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3818u;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3804b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final Handler d = new Handler(Looper.getMainLooper());

    /* renamed from: l, reason: collision with root package name */
    public String f3811l = "";

    public static Boolean t() {
        StringBuilder sb = new StringBuilder();
        u0.a o5 = h0.b.o();
        byte[] bArr = e0.m.f1973j;
        String[] strArr = p3.f2001a;
        com.google.protobuf.q.s(bArr, o5, "", sb);
        com.google.protobuf.q.r(new byte[]{108, 105, 99, 116, 95, 114, 105, 117, 101}, sb);
        String g10 = com.google.protobuf.q.g(sb, e0.x1.f2066q);
        u0.a o9 = h0.b.o();
        byte[] bArr2 = e0.m.f1969f;
        if (com.google.protobuf.q.w(bArr2, o9, "", g10)) {
            boolean z9 = true;
            if (com.google.protobuf.q.d(Long.MAX_VALUE, h0.b.a().j()) >= Long.parseLong(new String(com.google.protobuf.q.x(new byte[]{37}, new byte[]{21, 17, -9, 78, -87, 101, -29, 40}, h0.b.o(), com.google.protobuf.q.h(e0.m.f1970g, h0.b.o(), new String(bArr2)), 0)))) {
                z9 = false;
            }
            return Boolean.valueOf(z9);
        }
        return Boolean.FALSE;
    }

    public static boolean x(com.bumptech.glide.manager.t tVar, ArrayList arrayList, ArrayList arrayList2) {
        String absolutePath;
        ArrayDeque arrayDeque = new ArrayDeque(arrayList);
        HashSet hashSet = new HashSet();
        boolean z9 = false;
        while (!arrayDeque.isEmpty() && !Thread.currentThread().isInterrupted()) {
            File file = (File) arrayDeque.removeFirst();
            tVar.getClass();
            String str = "";
            if (file == null) {
                absolutePath = "";
            } else {
                try {
                    absolutePath = file.getCanonicalPath();
                } catch (IOException unused) {
                    absolutePath = file.getAbsolutePath();
                }
            }
            if (hashSet.add(absolutePath)) {
                if (file.isDirectory()) {
                    ArrayList h2 = com.bumptech.glide.manager.t.h(file);
                    if (h2 == null) {
                        z9 = true;
                    } else {
                        int size = h2.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = h2.get(i10);
                            i10++;
                            arrayDeque.addLast((File) obj);
                        }
                    }
                } else {
                    String name = file.getName();
                    if (name != null) {
                        int lastIndexOf = name.lastIndexOf(46);
                        if (lastIndexOf >= 0) {
                            str = name.substring(lastIndexOf + 1).toLowerCase(Locale.ROOT);
                        }
                        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
                        if ((mimeTypeFromExtension != null && mimeTypeFromExtension.startsWith(e0.m.h(new byte[]{37, -46, 125, -48, 34, 101}, new byte[]{83, -69, 25, -75, 77, 74, -112, 91}))) || str.matches(e0.m.h(new byte[]{97, -55, -38, 82, 124, 88, 82, 11, 97, -51, -38, 82, 112, 94, 15, 11, 97, -106, -38, 82, 106, 75, 89, 26, 112, -60, -64, 88, 97, 89, 86, 1, 112, -49, -36, 73, 97, 67, 75, 18, 107, -34, -40, 93, 97, 67, 79, 4, 112, -49, -98, 90, 110, 82, 77, 24, 110, -34, -97, 73, 109, 82, 84, 16, 122}, new byte[]{12, -94, -84, 46, 29, 46, 59, 119}))) {
                            arrayList2.add(new k3(file.getName(), file.getParent(), file.length(), file.lastModified(), file));
                        }
                    }
                    if (!file.exists()) {
                        z9 = true;
                    }
                }
            }
        }
        return z9;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        File file;
        final int i10 = 0;
        View inflate = layoutInflater.inflate(R.layout.fragment_video_library, viewGroup, false);
        this.e = Executors.newSingleThreadExecutor();
        this.f3814o = Executors.newSingleThreadExecutor();
        final int i11 = 3;
        this.f3813n = new com.bumptech.glide.manager.t(requireContext(), 3);
        if (bundle != null) {
            String string = bundle.getString(e0.m.h(new byte[]{65, 53, -32, -86}, new byte[]{51, 90, -113, -34, -104, 28, 103, -21}));
            if (string == null) {
                file = null;
            } else {
                file = new File(string);
            }
            this.f3812m = file;
        }
        this.f3807h = (RecyclerView) inflate.findViewById(R.id.videoGrid);
        this.f3808i = (TextView) inflate.findViewById(R.id.videoStatus);
        this.f3809j = (TextView) inflate.findViewById(R.id.videoSourceLabel);
        final int i12 = 1;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), 1);
        this.f3807h.setLayoutManager(gridLayoutManager);
        final int i13 = 2;
        this.f3807h.addOnLayoutChangeListener(new e0.q1(2, gridLayoutManager));
        l3 l3Var = new l3(this);
        this.f3810k = l3Var;
        this.f3807h.setAdapter(l3Var);
        inflate.findViewById(R.id.videoBack).setOnClickListener(new View.OnClickListener(this) { // from class: m0.i3
            public final /* synthetic */ n3 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        n3 n3Var = this.c;
                        if (n3Var.getParentFragment() instanceof l0.a) {
                            ((l0.a) n3Var.getParentFragment()).dismiss();
                            return;
                        } else {
                            n3Var.requireActivity().finish();
                            return;
                        }
                    case 1:
                        this.c.w();
                        return;
                    case 2:
                        n3 n3Var2 = this.c;
                        n3Var2.f3814o.execute(new androidx.activity.f(n3Var2, n3Var2.f3813n, n3Var2.f3806g, 8));
                        return;
                    default:
                        final n3 n3Var3 = this.c;
                        AlertDialog alertDialog = n3Var3.f3815p;
                        if (alertDialog != null) {
                            alertDialog.dismiss();
                        }
                        AlertDialog.Builder builder = new AlertDialog.Builder(n3Var3.requireContext(), R.style.ThemeOverlay_JCarTools_VideoAlert);
                        View inflate2 = LayoutInflater.from(builder.getContext()).inflate(R.layout.video_folder_picker, (ViewGroup) null);
                        final TextView textView = (TextView) inflate2.findViewById(R.id.videoFolderPath);
                        final ListView listView = (ListView) inflate2.findViewById(R.id.videoFolderList);
                        final AlertDialog create = builder.setTitle(R.string.video_choose_folder).setView(inflate2).setPositiveButton(R.string.video_use_folder, new b7.h(3, n3Var3)).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setNeutralButton(R.string.up, (DialogInterface.OnClickListener) null).create();
                        n3Var3.f3815p = create;
                        create.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: m0.d3
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                n3 n3Var4 = n3.this;
                                n3Var4.f3817s++;
                                if (n3Var4.f3815p == create) {
                                    n3Var4.f3815p = null;
                                }
                            }
                        });
                        create.show();
                        final int i14 = 0;
                        create.getButton(-3).setOnClickListener(new View.OnClickListener() { // from class: m0.e3
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i14) {
                                    case 0:
                                        n3 n3Var4 = n3Var3;
                                        File file2 = n3Var4.r;
                                        if (file2 != null && file2.getParentFile() != null) {
                                            n3Var4.v(n3Var4.r.getParentFile(), create, textView, listView);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        n3 n3Var5 = n3Var3;
                                        n3Var5.f3813n.getClass();
                                        n3Var5.v(Environment.getExternalStorageDirectory(), create, textView, listView);
                                        return;
                                    default:
                                        n3 n3Var6 = n3Var3;
                                        n3Var6.f3814o.execute(new f3(n3Var6, n3Var6.f3813n, create, n3Var6.f3817s, textView, listView));
                                        return;
                                }
                            }
                        });
                        final int i15 = 1;
                        inflate2.findViewById(R.id.videoFolderDevice).setOnClickListener(new View.OnClickListener() { // from class: m0.e3
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i15) {
                                    case 0:
                                        n3 n3Var4 = n3Var3;
                                        File file2 = n3Var4.r;
                                        if (file2 != null && file2.getParentFile() != null) {
                                            n3Var4.v(n3Var4.r.getParentFile(), create, textView, listView);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        n3 n3Var5 = n3Var3;
                                        n3Var5.f3813n.getClass();
                                        n3Var5.v(Environment.getExternalStorageDirectory(), create, textView, listView);
                                        return;
                                    default:
                                        n3 n3Var6 = n3Var3;
                                        n3Var6.f3814o.execute(new f3(n3Var6, n3Var6.f3813n, create, n3Var6.f3817s, textView, listView));
                                        return;
                                }
                            }
                        });
                        final int i16 = 2;
                        inflate2.findViewById(R.id.videoFolderUsb).setOnClickListener(new View.OnClickListener() { // from class: m0.e3
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i16) {
                                    case 0:
                                        n3 n3Var4 = n3Var3;
                                        File file2 = n3Var4.r;
                                        if (file2 != null && file2.getParentFile() != null) {
                                            n3Var4.v(n3Var4.r.getParentFile(), create, textView, listView);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        n3 n3Var5 = n3Var3;
                                        n3Var5.f3813n.getClass();
                                        n3Var5.v(Environment.getExternalStorageDirectory(), create, textView, listView);
                                        return;
                                    default:
                                        n3 n3Var6 = n3Var3;
                                        n3Var6.f3814o.execute(new f3(n3Var6, n3Var6.f3813n, create, n3Var6.f3817s, textView, listView));
                                        return;
                                }
                            }
                        });
                        File file2 = n3Var3.f3812m;
                        if (file2 == null) {
                            n3Var3.f3813n.getClass();
                            file2 = Environment.getExternalStorageDirectory();
                        }
                        n3Var3.v(file2, create, textView, listView);
                        return;
                }
            }
        });
        inflate.findViewById(R.id.videoRefresh).setOnClickListener(new View.OnClickListener(this) { // from class: m0.i3
            public final /* synthetic */ n3 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        n3 n3Var = this.c;
                        if (n3Var.getParentFragment() instanceof l0.a) {
                            ((l0.a) n3Var.getParentFragment()).dismiss();
                            return;
                        } else {
                            n3Var.requireActivity().finish();
                            return;
                        }
                    case 1:
                        this.c.w();
                        return;
                    case 2:
                        n3 n3Var2 = this.c;
                        n3Var2.f3814o.execute(new androidx.activity.f(n3Var2, n3Var2.f3813n, n3Var2.f3806g, 8));
                        return;
                    default:
                        final n3 n3Var3 = this.c;
                        AlertDialog alertDialog = n3Var3.f3815p;
                        if (alertDialog != null) {
                            alertDialog.dismiss();
                        }
                        AlertDialog.Builder builder = new AlertDialog.Builder(n3Var3.requireContext(), R.style.ThemeOverlay_JCarTools_VideoAlert);
                        View inflate2 = LayoutInflater.from(builder.getContext()).inflate(R.layout.video_folder_picker, (ViewGroup) null);
                        final TextView textView = (TextView) inflate2.findViewById(R.id.videoFolderPath);
                        final ListView listView = (ListView) inflate2.findViewById(R.id.videoFolderList);
                        final AlertDialog create = builder.setTitle(R.string.video_choose_folder).setView(inflate2).setPositiveButton(R.string.video_use_folder, new b7.h(3, n3Var3)).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setNeutralButton(R.string.up, (DialogInterface.OnClickListener) null).create();
                        n3Var3.f3815p = create;
                        create.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: m0.d3
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                n3 n3Var4 = n3.this;
                                n3Var4.f3817s++;
                                if (n3Var4.f3815p == create) {
                                    n3Var4.f3815p = null;
                                }
                            }
                        });
                        create.show();
                        final int i14 = 0;
                        create.getButton(-3).setOnClickListener(new View.OnClickListener() { // from class: m0.e3
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i14) {
                                    case 0:
                                        n3 n3Var4 = n3Var3;
                                        File file2 = n3Var4.r;
                                        if (file2 != null && file2.getParentFile() != null) {
                                            n3Var4.v(n3Var4.r.getParentFile(), create, textView, listView);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        n3 n3Var5 = n3Var3;
                                        n3Var5.f3813n.getClass();
                                        n3Var5.v(Environment.getExternalStorageDirectory(), create, textView, listView);
                                        return;
                                    default:
                                        n3 n3Var6 = n3Var3;
                                        n3Var6.f3814o.execute(new f3(n3Var6, n3Var6.f3813n, create, n3Var6.f3817s, textView, listView));
                                        return;
                                }
                            }
                        });
                        final int i15 = 1;
                        inflate2.findViewById(R.id.videoFolderDevice).setOnClickListener(new View.OnClickListener() { // from class: m0.e3
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i15) {
                                    case 0:
                                        n3 n3Var4 = n3Var3;
                                        File file2 = n3Var4.r;
                                        if (file2 != null && file2.getParentFile() != null) {
                                            n3Var4.v(n3Var4.r.getParentFile(), create, textView, listView);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        n3 n3Var5 = n3Var3;
                                        n3Var5.f3813n.getClass();
                                        n3Var5.v(Environment.getExternalStorageDirectory(), create, textView, listView);
                                        return;
                                    default:
                                        n3 n3Var6 = n3Var3;
                                        n3Var6.f3814o.execute(new f3(n3Var6, n3Var6.f3813n, create, n3Var6.f3817s, textView, listView));
                                        return;
                                }
                            }
                        });
                        final int i16 = 2;
                        inflate2.findViewById(R.id.videoFolderUsb).setOnClickListener(new View.OnClickListener() { // from class: m0.e3
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i16) {
                                    case 0:
                                        n3 n3Var4 = n3Var3;
                                        File file2 = n3Var4.r;
                                        if (file2 != null && file2.getParentFile() != null) {
                                            n3Var4.v(n3Var4.r.getParentFile(), create, textView, listView);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        n3 n3Var5 = n3Var3;
                                        n3Var5.f3813n.getClass();
                                        n3Var5.v(Environment.getExternalStorageDirectory(), create, textView, listView);
                                        return;
                                    default:
                                        n3 n3Var6 = n3Var3;
                                        n3Var6.f3814o.execute(new f3(n3Var6, n3Var6.f3813n, create, n3Var6.f3817s, textView, listView));
                                        return;
                                }
                            }
                        });
                        File file2 = n3Var3.f3812m;
                        if (file2 == null) {
                            n3Var3.f3813n.getClass();
                            file2 = Environment.getExternalStorageDirectory();
                        }
                        n3Var3.v(file2, create, textView, listView);
                        return;
                }
            }
        });
        inflate.findViewById(R.id.videoSource).setOnClickListener(new View.OnClickListener(this) { // from class: m0.i3
            public final /* synthetic */ n3 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        n3 n3Var = this.c;
                        if (n3Var.getParentFragment() instanceof l0.a) {
                            ((l0.a) n3Var.getParentFragment()).dismiss();
                            return;
                        } else {
                            n3Var.requireActivity().finish();
                            return;
                        }
                    case 1:
                        this.c.w();
                        return;
                    case 2:
                        n3 n3Var2 = this.c;
                        n3Var2.f3814o.execute(new androidx.activity.f(n3Var2, n3Var2.f3813n, n3Var2.f3806g, 8));
                        return;
                    default:
                        final n3 n3Var3 = this.c;
                        AlertDialog alertDialog = n3Var3.f3815p;
                        if (alertDialog != null) {
                            alertDialog.dismiss();
                        }
                        AlertDialog.Builder builder = new AlertDialog.Builder(n3Var3.requireContext(), R.style.ThemeOverlay_JCarTools_VideoAlert);
                        View inflate2 = LayoutInflater.from(builder.getContext()).inflate(R.layout.video_folder_picker, (ViewGroup) null);
                        final TextView textView = (TextView) inflate2.findViewById(R.id.videoFolderPath);
                        final ListView listView = (ListView) inflate2.findViewById(R.id.videoFolderList);
                        final AlertDialog create = builder.setTitle(R.string.video_choose_folder).setView(inflate2).setPositiveButton(R.string.video_use_folder, new b7.h(3, n3Var3)).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setNeutralButton(R.string.up, (DialogInterface.OnClickListener) null).create();
                        n3Var3.f3815p = create;
                        create.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: m0.d3
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                n3 n3Var4 = n3.this;
                                n3Var4.f3817s++;
                                if (n3Var4.f3815p == create) {
                                    n3Var4.f3815p = null;
                                }
                            }
                        });
                        create.show();
                        final int i14 = 0;
                        create.getButton(-3).setOnClickListener(new View.OnClickListener() { // from class: m0.e3
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i14) {
                                    case 0:
                                        n3 n3Var4 = n3Var3;
                                        File file2 = n3Var4.r;
                                        if (file2 != null && file2.getParentFile() != null) {
                                            n3Var4.v(n3Var4.r.getParentFile(), create, textView, listView);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        n3 n3Var5 = n3Var3;
                                        n3Var5.f3813n.getClass();
                                        n3Var5.v(Environment.getExternalStorageDirectory(), create, textView, listView);
                                        return;
                                    default:
                                        n3 n3Var6 = n3Var3;
                                        n3Var6.f3814o.execute(new f3(n3Var6, n3Var6.f3813n, create, n3Var6.f3817s, textView, listView));
                                        return;
                                }
                            }
                        });
                        final int i15 = 1;
                        inflate2.findViewById(R.id.videoFolderDevice).setOnClickListener(new View.OnClickListener() { // from class: m0.e3
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i15) {
                                    case 0:
                                        n3 n3Var4 = n3Var3;
                                        File file2 = n3Var4.r;
                                        if (file2 != null && file2.getParentFile() != null) {
                                            n3Var4.v(n3Var4.r.getParentFile(), create, textView, listView);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        n3 n3Var5 = n3Var3;
                                        n3Var5.f3813n.getClass();
                                        n3Var5.v(Environment.getExternalStorageDirectory(), create, textView, listView);
                                        return;
                                    default:
                                        n3 n3Var6 = n3Var3;
                                        n3Var6.f3814o.execute(new f3(n3Var6, n3Var6.f3813n, create, n3Var6.f3817s, textView, listView));
                                        return;
                                }
                            }
                        });
                        final int i16 = 2;
                        inflate2.findViewById(R.id.videoFolderUsb).setOnClickListener(new View.OnClickListener() { // from class: m0.e3
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i16) {
                                    case 0:
                                        n3 n3Var4 = n3Var3;
                                        File file2 = n3Var4.r;
                                        if (file2 != null && file2.getParentFile() != null) {
                                            n3Var4.v(n3Var4.r.getParentFile(), create, textView, listView);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        n3 n3Var5 = n3Var3;
                                        n3Var5.f3813n.getClass();
                                        n3Var5.v(Environment.getExternalStorageDirectory(), create, textView, listView);
                                        return;
                                    default:
                                        n3 n3Var6 = n3Var3;
                                        n3Var6.f3814o.execute(new f3(n3Var6, n3Var6.f3813n, create, n3Var6.f3817s, textView, listView));
                                        return;
                                }
                            }
                        });
                        File file2 = n3Var3.f3812m;
                        if (file2 == null) {
                            n3Var3.f3813n.getClass();
                            file2 = Environment.getExternalStorageDirectory();
                        }
                        n3Var3.v(file2, create, textView, listView);
                        return;
                }
            }
        });
        inflate.findViewById(R.id.videoFolder).setOnClickListener(new View.OnClickListener(this) { // from class: m0.i3
            public final /* synthetic */ n3 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        n3 n3Var = this.c;
                        if (n3Var.getParentFragment() instanceof l0.a) {
                            ((l0.a) n3Var.getParentFragment()).dismiss();
                            return;
                        } else {
                            n3Var.requireActivity().finish();
                            return;
                        }
                    case 1:
                        this.c.w();
                        return;
                    case 2:
                        n3 n3Var2 = this.c;
                        n3Var2.f3814o.execute(new androidx.activity.f(n3Var2, n3Var2.f3813n, n3Var2.f3806g, 8));
                        return;
                    default:
                        final n3 n3Var3 = this.c;
                        AlertDialog alertDialog = n3Var3.f3815p;
                        if (alertDialog != null) {
                            alertDialog.dismiss();
                        }
                        AlertDialog.Builder builder = new AlertDialog.Builder(n3Var3.requireContext(), R.style.ThemeOverlay_JCarTools_VideoAlert);
                        View inflate2 = LayoutInflater.from(builder.getContext()).inflate(R.layout.video_folder_picker, (ViewGroup) null);
                        final TextView textView = (TextView) inflate2.findViewById(R.id.videoFolderPath);
                        final ListView listView = (ListView) inflate2.findViewById(R.id.videoFolderList);
                        final AlertDialog create = builder.setTitle(R.string.video_choose_folder).setView(inflate2).setPositiveButton(R.string.video_use_folder, new b7.h(3, n3Var3)).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setNeutralButton(R.string.up, (DialogInterface.OnClickListener) null).create();
                        n3Var3.f3815p = create;
                        create.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: m0.d3
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                n3 n3Var4 = n3.this;
                                n3Var4.f3817s++;
                                if (n3Var4.f3815p == create) {
                                    n3Var4.f3815p = null;
                                }
                            }
                        });
                        create.show();
                        final int i14 = 0;
                        create.getButton(-3).setOnClickListener(new View.OnClickListener() { // from class: m0.e3
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i14) {
                                    case 0:
                                        n3 n3Var4 = n3Var3;
                                        File file2 = n3Var4.r;
                                        if (file2 != null && file2.getParentFile() != null) {
                                            n3Var4.v(n3Var4.r.getParentFile(), create, textView, listView);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        n3 n3Var5 = n3Var3;
                                        n3Var5.f3813n.getClass();
                                        n3Var5.v(Environment.getExternalStorageDirectory(), create, textView, listView);
                                        return;
                                    default:
                                        n3 n3Var6 = n3Var3;
                                        n3Var6.f3814o.execute(new f3(n3Var6, n3Var6.f3813n, create, n3Var6.f3817s, textView, listView));
                                        return;
                                }
                            }
                        });
                        final int i15 = 1;
                        inflate2.findViewById(R.id.videoFolderDevice).setOnClickListener(new View.OnClickListener() { // from class: m0.e3
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i15) {
                                    case 0:
                                        n3 n3Var4 = n3Var3;
                                        File file2 = n3Var4.r;
                                        if (file2 != null && file2.getParentFile() != null) {
                                            n3Var4.v(n3Var4.r.getParentFile(), create, textView, listView);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        n3 n3Var5 = n3Var3;
                                        n3Var5.f3813n.getClass();
                                        n3Var5.v(Environment.getExternalStorageDirectory(), create, textView, listView);
                                        return;
                                    default:
                                        n3 n3Var6 = n3Var3;
                                        n3Var6.f3814o.execute(new f3(n3Var6, n3Var6.f3813n, create, n3Var6.f3817s, textView, listView));
                                        return;
                                }
                            }
                        });
                        final int i16 = 2;
                        inflate2.findViewById(R.id.videoFolderUsb).setOnClickListener(new View.OnClickListener() { // from class: m0.e3
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i16) {
                                    case 0:
                                        n3 n3Var4 = n3Var3;
                                        File file2 = n3Var4.r;
                                        if (file2 != null && file2.getParentFile() != null) {
                                            n3Var4.v(n3Var4.r.getParentFile(), create, textView, listView);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        n3 n3Var5 = n3Var3;
                                        n3Var5.f3813n.getClass();
                                        n3Var5.v(Environment.getExternalStorageDirectory(), create, textView, listView);
                                        return;
                                    default:
                                        n3 n3Var6 = n3Var3;
                                        n3Var6.f3814o.execute(new f3(n3Var6, n3Var6.f3813n, create, n3Var6.f3817s, textView, listView));
                                        return;
                                }
                            }
                        });
                        File file2 = n3Var3.f3812m;
                        if (file2 == null) {
                            n3Var3.f3813n.getClass();
                            file2 = Environment.getExternalStorageDirectory();
                        }
                        n3Var3.v(file2, create, textView, listView);
                        return;
                }
            }
        });
        ((TextView) inflate.findViewById(R.id.videoSearch)).addTextChangedListener(new e0.a1(i13, this));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f3806g++;
        this.f3817s++;
        AlertDialog alertDialog = this.f3815p;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        AlertDialog alertDialog2 = this.f3816q;
        if (alertDialog2 != null) {
            alertDialog2.dismiss();
        }
        this.f3816q = null;
        ExecutorService executorService = this.f3814o;
        if (executorService != null) {
            executorService.shutdownNow();
        }
        Future future = this.f3805f;
        if (future != null) {
            future.cancel(true);
        }
        ExecutorService executorService2 = this.e;
        if (executorService2 != null) {
            executorService2.shutdownNow();
        }
        this.d.removeCallbacksAndMessages(null);
        this.f3807h.setAdapter(null);
        this.f3807h = null;
        this.f3810k = null;
        this.f3808i = null;
        this.f3809j = null;
        this.f3804b.clear();
        this.c.clear();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f3812m != null) {
            bundle.putString(e0.m.h(new byte[]{-21, -21, 40, 68}, new byte[]{-103, -124, 71, 48, -86, -23, -19, 107}), this.f3812m.getAbsolutePath());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        com.bumptech.glide.manager.t tVar = this.f3813n;
        if (!tVar.c) {
            tVar.c = true;
            ((h7.k) tVar.e).v((Context) tVar.d);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        com.bumptech.glide.manager.t tVar = this.f3813n;
        if (tVar.c) {
            tVar.c = false;
            ((h7.k) tVar.e).w();
        }
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        w();
    }

    public final void u() {
        String string;
        if (this.f3810k == null) {
            return;
        }
        ArrayList arrayList = this.c;
        arrayList.clear();
        ArrayList arrayList2 = this.f3804b;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            k3 k3Var = (k3) obj;
            if (k3Var.f3768a.toLowerCase(Locale.ROOT).contains(this.f3811l)) {
                arrayList.add(k3Var);
            }
        }
        this.f3810k.notifyDataSetChanged();
        TextView textView = this.f3808i;
        if (this.t) {
            string = getString(R.string.video_loading);
        } else if (this.f3818u) {
            string = getString(R.string.video_partial, Integer.valueOf(arrayList.size()));
        } else if (arrayList2.isEmpty()) {
            string = getString(R.string.video_empty);
        } else if (arrayList.isEmpty()) {
            string = getString(R.string.video_no_matches);
        } else {
            string = getString(R.string.video_count, Integer.valueOf(arrayList.size()));
        }
        textView.setText(string);
    }

    public final void v(File file, final AlertDialog alertDialog, final TextView textView, final ListView listView) {
        File absoluteFile;
        String absolutePath;
        if (this.f3815p != alertDialog) {
            return;
        }
        boolean z9 = true;
        final int i10 = this.f3817s + 1;
        this.f3817s = i10;
        final com.bumptech.glide.manager.t tVar = this.f3813n;
        tVar.getClass();
        try {
            absoluteFile = file.getCanonicalFile();
        } catch (IOException unused) {
            absoluteFile = file.getAbsoluteFile();
        }
        final File file2 = absoluteFile;
        this.r = file2;
        if (file2 == null) {
            absolutePath = "";
        } else {
            try {
                absolutePath = file2.getCanonicalPath();
            } catch (IOException unused2) {
                absolutePath = file2.getAbsolutePath();
            }
        }
        textView.setText(absolutePath);
        listView.setAdapter((ListAdapter) null);
        alertDialog.getButton(-1).setEnabled(false);
        Button button = alertDialog.getButton(-3);
        if (file2.getParentFile() == null) {
            z9 = false;
        }
        button.setEnabled(z9);
        this.f3814o.execute(new Runnable() { // from class: m0.g3
            @Override // java.lang.Runnable
            public final void run() {
                final com.bumptech.glide.manager.t tVar2 = tVar;
                tVar2.getClass();
                final File file3 = file2;
                final ArrayList h2 = com.bumptech.glide.manager.t.h(file3);
                final ArrayList arrayList = new ArrayList();
                if (h2 != null) {
                    int size = h2.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = h2.get(i11);
                        i11++;
                        File file4 = (File) obj;
                        if (file4.isDirectory()) {
                            arrayList.add(file4);
                        }
                    }
                }
                final n3 n3Var = n3.this;
                Handler handler = n3Var.d;
                final int i12 = i10;
                final AlertDialog alertDialog2 = alertDialog;
                final TextView textView2 = textView;
                final ListView listView2 = listView;
                handler.post(new Runnable() { // from class: m0.h3
                    @Override // java.lang.Runnable
                    public final void run() {
                        String absolutePath2;
                        File file5 = file3;
                        n3 n3Var2 = n3.this;
                        if (n3Var2.getView() != null && i12 == n3Var2.f3817s) {
                            AlertDialog alertDialog3 = n3Var2.f3815p;
                            AlertDialog alertDialog4 = alertDialog2;
                            if (alertDialog3 == alertDialog4) {
                                List list = h2;
                                TextView textView3 = textView2;
                                if (list == null) {
                                    tVar2.getClass();
                                    try {
                                        absolutePath2 = file5.getCanonicalPath();
                                    } catch (IOException unused3) {
                                        absolutePath2 = file5.getAbsolutePath();
                                    }
                                    textView3.setText(n3Var2.getString(R.string.user_file_manager_no_access, absolutePath2));
                                    return;
                                }
                                alertDialog4.getButton(-1).setEnabled(true);
                                ArrayList arrayList2 = new ArrayList();
                                ArrayList arrayList3 = arrayList;
                                int size2 = arrayList3.size();
                                int i13 = 0;
                                while (i13 < size2) {
                                    Object obj2 = arrayList3.get(i13);
                                    i13++;
                                    arrayList2.add(e0.m.h(new byte[]{95}, new byte[]{4, -67, 110, 74, 125, 35, -40, 110}) + n3Var2.getString(R.string.folder) + e0.m.h(new byte[]{109, -43}, new byte[]{48, -11, 41, -49, 16, -89, -69, -21}) + ((File) obj2).getName());
                                }
                                ArrayAdapter arrayAdapter = new ArrayAdapter(alertDialog4.getContext(), R.layout.video_browser_item, arrayList2);
                                ListView listView3 = listView2;
                                listView3.setAdapter((ListAdapter) arrayAdapter);
                                listView3.setOnItemClickListener(new j3(n3Var2, arrayList3, alertDialog4, textView3, listView3, 0));
                            }
                        }
                    }
                });
            }
        });
    }

    public final void w() {
        String string;
        if (this.f3807h == null) {
            return;
        }
        Future future = this.f3805f;
        if (future != null) {
            future.cancel(true);
        }
        int i10 = this.f3806g + 1;
        this.f3806g = i10;
        this.t = true;
        this.f3804b.clear();
        u();
        TextView textView = this.f3809j;
        File file = this.f3812m;
        if (file != null) {
            string = file.getAbsolutePath();
        } else {
            string = getString(R.string.video_all_sources);
        }
        textView.setText(string);
        com.bumptech.glide.manager.t tVar = this.f3813n;
        this.f3805f = this.e.submit(new j2.d(this, this.f3812m, tVar, i10));
    }
}
