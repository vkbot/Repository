package m0;

import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.text.format.Formatter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.navistart.R;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import kotlin.UByte;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class c3 extends l0.b {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3624b = new ArrayList();
    public final HashMap c = new HashMap();
    public final HashSet d = new HashSet();
    public x2 e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f3625f;

    /* renamed from: g, reason: collision with root package name */
    public ProgressBar f3626g;

    /* renamed from: h, reason: collision with root package name */
    public TextView f3627h;

    /* renamed from: i, reason: collision with root package name */
    public TextView f3628i;

    /* renamed from: j, reason: collision with root package name */
    public TextView f3629j;

    /* renamed from: k, reason: collision with root package name */
    public LinearLayout f3630k;

    /* renamed from: l, reason: collision with root package name */
    public Button f3631l;

    /* renamed from: m, reason: collision with root package name */
    public Button f3632m;

    /* renamed from: n, reason: collision with root package name */
    public Button f3633n;

    /* renamed from: o, reason: collision with root package name */
    public Button f3634o;

    /* renamed from: p, reason: collision with root package name */
    public Button f3635p;

    /* renamed from: q, reason: collision with root package name */
    public Button f3636q;
    public h7.k r;

    /* renamed from: s, reason: collision with root package name */
    public File f3637s;
    public File t;

    /* renamed from: u, reason: collision with root package name */
    public File f3638u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3639v;
    public int w;

    public static String A(File file) {
        String str;
        int i10;
        String mimeTypeFromExtension;
        if (B(file)) {
            return e0.m.h(new byte[]{121, -53, -92, -45, -105, -78, 88, -7, 113, -44, -70, -112, -120, -65, 93, -93, 121, -43, -80, -51, -111, -72, 93, -93, 104, -38, -73, -44, -97, -74, 92, -96, 121, -55, -73, -41, -105, -89, 92}, new byte[]{24, -69, -44, -65, -2, -47, 57, -115});
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(file).toString());
        if (fileExtensionFromUrl == null || fileExtensionFromUrl.length() == 0) {
            String name = file.getName();
            int lastIndexOf = name.lastIndexOf(46);
            if (lastIndexOf >= 0 && (i10 = lastIndexOf + 1) < name.length()) {
                str = name.substring(i10);
            } else {
                str = "";
            }
            fileExtensionFromUrl = str;
        }
        if (fileExtensionFromUrl.length() == 0) {
            mimeTypeFromExtension = null;
        } else {
            mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl.toLowerCase(Locale.ROOT));
        }
        if (mimeTypeFromExtension == null) {
            return e0.m.h(new byte[]{-77, -92, 104}, new byte[]{-103, -117, 66, -11, -17, 110, 84, 102});
        }
        return mimeTypeFromExtension;
    }

    public static boolean B(File file) {
        if (file.getName().toLowerCase(Locale.ROOT).endsWith(e0.m.h(new byte[]{-31, -125, -82, 113}, new byte[]{-49, -30, -34, 26, 9, -79, -42, 19}))) {
            return true;
        }
        return false;
    }

    public static boolean C(String str) {
        if (!str.startsWith(e0.m.h(new byte[]{31, -50, 0, 54, 6, 94, -44, 9, 31}, new byte[]{48, -67, 116, 89, 116, 63, -77, 108})) && !str.startsWith(e0.m.h(new byte[]{5, 34, -60, -82, 115, -75, 123, 125, 67, 46, -11, -88, 43, -9}, new byte[]{42, 79, -86, -38, 92, -40, 30, 25})) && !str.startsWith(e0.m.h(new byte[]{-66, -41, 101, 14, -45, 114, -107, 52, -27, -45, 102, 31, -45}, new byte[]{-111, -70, 11, 122, -4, 0, -32, 90})) && !str.startsWith(e0.m.h(new byte[]{-124, 77, -7, ByteCompanionObject.MAX_VALUE, -92, -8, -56, -20}, new byte[]{-85, 32, -105, 11, -117, -115, -69, -114})) && !str.startsWith(e0.m.h(new byte[]{-9, -6, 112, 60, 124, 115, -118, -20, -9, -4, 119, 49}, new byte[]{-40, -119, 4, 83, 14, 18, -19, -119})) && !str.startsWith(e0.m.h(new byte[]{31, 6, 51, 73, -48, 5, -109, -23, 67, 0}, new byte[]{48, 107, 93, Base64.padSymbol, -1, 112, -9, ByteCompanionObject.MIN_VALUE})) && !str.startsWith(e0.m.h(new byte[]{114, 52, -40, -2, -124, 27, 68, -13, 114, 50, -56, -8, -123, 17}, new byte[]{93, 71, -84, -111, -10, 122, 35, -106})) && !str.startsWith(e0.m.h(new byte[]{-52, -57, 25, 65, 64, -79, 55, 88, -52, -47, 21, 90}, new byte[]{-29, -76, 109, 46, 50, -48, 80, Base64.padSymbol})) && !str.startsWith(e0.m.h(new byte[]{4, 22, 95, -121, -51, 81, 28, -64}, new byte[]{43, 123, 49, -13, -30, 52, 100, -76})) && !str.startsWith(e0.m.h(new byte[]{8, 2, -56, 119, -30, 92, 17, -3, 8, 2, -40, 123, -15, 79, 18}, new byte[]{39, 113, -68, 24, -112, Base64.padSymbol, 118, -104}))) {
            return false;
        }
        return true;
    }

    public static b3 E(File file) {
        boolean z9;
        String str;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        int i10 = 524288;
        while (true) {
            z9 = false;
            if (i10 <= 0) {
                break;
            }
            try {
                int read = bufferedInputStream.read(bArr, 0, Math.min(8192, i10));
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
                i10 -= read;
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        bufferedInputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray.length >= 3 && (byteArray[0] & UByte.MAX_VALUE) == 239 && (byteArray[1] & UByte.MAX_VALUE) == 187 && (byteArray[2] & UByte.MAX_VALUE) == 191) {
            str = new String(byteArray, 3, byteArray.length - 3, StandardCharsets.UTF_8);
        } else if (byteArray.length >= 2 && (byteArray[0] & UByte.MAX_VALUE) == 255 && (byteArray[1] & UByte.MAX_VALUE) == 254) {
            str = new String(byteArray, 2, byteArray.length - 2, StandardCharsets.UTF_16LE);
        } else if (byteArray.length >= 2 && (byteArray[0] & UByte.MAX_VALUE) == 254 && (byteArray[1] & UByte.MAX_VALUE) == 255) {
            str = new String(byteArray, 2, byteArray.length - 2, StandardCharsets.UTF_16BE);
        } else {
            CharsetDecoder newDecoder = StandardCharsets.UTF_8.newDecoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
            try {
                str = newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(byteArray)).toString();
            } catch (Exception unused) {
                str = new String(byteArray, Charset.forName(e0.m.h(new byte[]{3, 16, 103, 1, -122, -122, 8, 94, 69, 75, 60, 84}, new byte[]{116, 121, 9, 101, -23, -15, 123, 115})));
            }
        }
        if (file.length() > 524288) {
            z9 = true;
        }
        return new b3(str, z9);
    }

    public static String G(File file) {
        if (file == null) {
            return "";
        }
        try {
            return file.getCanonicalPath();
        } catch (IOException unused) {
            return file.getAbsolutePath();
        }
    }

    public static void t(ArrayList arrayList, HashSet hashSet, File file) {
        if (file != null) {
            try {
                String absolutePath = file.getAbsolutePath();
                if (file.isDirectory() && !absolutePath.contains(e0.m.h(new byte[]{-110, -5, 30, 50, ByteCompanionObject.MAX_VALUE, 108, -97, 36}, new byte[]{-9, -106, 107, 94, 30, 24, -6, 64})) && !absolutePath.contains(e0.m.h(new byte[]{36, -29, -19, 27}, new byte[]{87, -122, -127, 125, -113, 56, 15, 8})) && C(absolutePath)) {
                    if (file.listFiles() != null && hashSet.add(G(file))) {
                        arrayList.add(file);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public static File u(File file, String str) {
        String str2;
        File file2;
        File file3 = new File(file, str);
        if (!file3.exists()) {
            return file3;
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf > 0) {
            String substring = str.substring(0, lastIndexOf);
            str2 = str.substring(lastIndexOf);
            str = substring;
        } else {
            str2 = "";
        }
        int i10 = 1;
        do {
            file2 = new File(file, String.format(Locale.ROOT, e0.m.h(new byte[]{51, -2, -50, -61, -81, 13, -31, -74, 51, -23, -76, -45}, new byte[]{22, -115, -111, -96, -64, 125, -104, -23}), str, Integer.valueOf(i10), str2));
            i10++;
        } while (file2.exists());
        return file2;
    }

    public static void w(File file, y2 y2Var, boolean z9) {
        File[] fileArr;
        if (file != null && file.exists() && !y2Var.d && !y2Var.e) {
            if (!y2Var.f3902a.add(G(file))) {
                y2Var.d = true;
                return;
            }
            try {
                fileArr = file.listFiles();
            } catch (Exception unused) {
                fileArr = null;
            }
            if (fileArr == null) {
                if (z9 && y2Var.c == 0) {
                    y2Var.e = true;
                    return;
                } else {
                    y2Var.d = true;
                    return;
                }
            }
            for (File file2 : fileArr) {
                int i10 = y2Var.c;
                if (i10 >= 50000) {
                    y2Var.d = true;
                    return;
                }
                y2Var.c = i10 + 1;
                if (file2.isDirectory()) {
                    w(file2, y2Var, false);
                } else {
                    long length = file2.length();
                    if (length > 0) {
                        long j10 = y2Var.f3903b;
                        if (Long.MAX_VALUE - j10 < length) {
                            y2Var.f3903b = Long.MAX_VALUE;
                            y2Var.d = true;
                        } else {
                            y2Var.f3903b = j10 + length;
                        }
                    }
                }
                if (y2Var.d || y2Var.e) {
                    return;
                }
            }
        }
    }

    public static void x(File file, File file2) {
        if (file.isDirectory()) {
            if (!file2.exists() && !file2.mkdirs()) {
                n0.b.A(file2.getAbsolutePath());
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file3 : listFiles) {
                    x(file3, new File(file2, file3.getName()));
                }
            } else {
                n0.b.A(file.getAbsolutePath());
                return;
            }
        } else {
            File parentFile = file2.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                n0.b.A(parentFile.getAbsolutePath());
                return;
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                try {
                    byte[] bArr = new byte[65536];
                    while (true) {
                        int read = bufferedInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        } else {
                            bufferedOutputStream.write(bArr, 0, read);
                        }
                    }
                    bufferedOutputStream.close();
                    bufferedInputStream.close();
                } catch (Throwable th) {
                    try {
                        bufferedOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        long lastModified = file.lastModified();
        if (lastModified > 0) {
            file2.setLastModified(lastModified);
        }
    }

    public static void y(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        y(file2);
                    }
                } else {
                    n0.b.A(file.getAbsolutePath());
                    return;
                }
            }
            if (file.delete()) {
                return;
            }
            n0.b.A(file.getAbsolutePath());
        }
    }

    public final void D(File file) {
        File absoluteFile;
        File[] fileArr;
        String string;
        int i10;
        if (file == null) {
            return;
        }
        try {
            absoluteFile = file.getCanonicalFile();
        } catch (IOException unused) {
            absoluteFile = file.getAbsoluteFile();
        }
        if (absoluteFile.exists() && absoluteFile.isDirectory()) {
            try {
                fileArr = absoluteFile.listFiles();
            } catch (Exception unused2) {
                fileArr = null;
            }
            this.t = absoluteFile;
            if (this.f3626g != null && this.f3625f != null) {
                try {
                    StatFs statFs = new StatFs(G(absoluteFile));
                    long totalBytes = statFs.getTotalBytes();
                    long availableBytes = statFs.getAvailableBytes();
                    long max = Math.max(0L, totalBytes - availableBytes);
                    if (totalBytes > 0) {
                        i10 = (int) Math.min(1000L, (max * 1000) / totalBytes);
                    } else {
                        i10 = 0;
                    }
                    this.f3626g.setMax(1000);
                    this.f3626g.setProgress(i10);
                    this.f3625f.setText(getString(R.string.user_file_manager_storage_format, Formatter.formatShortFileSize(requireContext(), max), Formatter.formatShortFileSize(requireContext(), totalBytes), Formatter.formatShortFileSize(requireContext(), availableBytes)));
                } catch (Exception unused3) {
                    this.f3626g.setMax(1000);
                    this.f3626g.setProgress(0);
                    this.f3625f.setText(R.string.user_file_manager_storage_unknown);
                }
            }
            this.f3627h.setText(getString(R.string.user_file_manager_path_format, G(this.f3637s), G(this.t)));
            ArrayList arrayList = this.f3624b;
            arrayList.clear();
            if (fileArr != null) {
                Collections.addAll(arrayList, fileArr);
                Collections.sort(arrayList, new androidx.constraintlayout.core.utils.a(9));
                if (arrayList.isEmpty()) {
                    string = getString(R.string.user_file_manager_empty);
                } else {
                    string = getString(R.string.user_file_manager_swipe_hint);
                }
                I(string);
            } else {
                I(getString(R.string.user_file_manager_no_access, G(this.t)));
            }
            this.e.notifyDataSetChanged();
            J();
            return;
        }
        I(getString(R.string.user_file_manager_open_root_error));
    }

    public final void F(Runnable runnable) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new e0.j2(21, this, runnable));
    }

    public final void H(String str, boolean z9) {
        this.f3639v = z9;
        if (str != null) {
            I(str);
        }
        J();
        x2 x2Var = this.e;
        if (x2Var != null) {
            x2Var.notifyDataSetChanged();
        }
    }

    public final void I(String str) {
        TextView textView = this.f3629j;
        if (textView != null) {
            if (str == null) {
                str = "";
            }
            textView.setText(str);
        }
    }

    public final void J() {
        boolean z9;
        boolean z10 = this.f3639v;
        boolean z11 = !z10;
        Button button = this.f3636q;
        if (button != null) {
            button.setEnabled(z11);
        }
        Button button2 = this.f3633n;
        if (button2 != null) {
            button2.setEnabled(z11);
        }
        Button button3 = this.f3634o;
        if (button3 != null) {
            button3.setEnabled(z11);
        }
        Button button4 = this.f3635p;
        if (button4 != null) {
            button4.setEnabled(z11);
        }
        Button button5 = this.f3631l;
        boolean z12 = false;
        if (button5 != null) {
            if (!z10 && this.f3638u != null && this.t != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            button5.setEnabled(z9);
        }
        Button button6 = this.f3632m;
        if (button6 != null) {
            if (!z10 && this.f3638u != null) {
                z12 = true;
            }
            button6.setEnabled(z12);
        }
    }

    public final void K() {
        boolean z9;
        int i10 = 0;
        if (this.f3638u != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        LinearLayout linearLayout = this.f3630k;
        if (linearLayout != null) {
            if (!z9) {
                i10 = 8;
            }
            linearLayout.setVisibility(i10);
        }
        TextView textView = this.f3628i;
        if (textView != null && z9) {
            textView.setText(getString(R.string.user_file_manager_buffer_format, G(this.f3638u)));
        }
        J();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final int i10 = 0;
        View inflate = layoutInflater.inflate(R.layout.fragment_user_file_manager, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        View inflate2 = layoutInflater.inflate(R.layout.user_file_manager_header, (ViewGroup) recyclerView, false);
        this.f3629j = (TextView) layoutInflater.inflate(R.layout.user_file_manager_footer, (ViewGroup) recyclerView, false);
        Button button = (Button) inflate2.findViewById(R.id.userFileManagerBackButton);
        this.f3636q = (Button) inflate2.findViewById(R.id.userFileManagerUsbButton);
        this.f3633n = (Button) inflate2.findViewById(R.id.userFileManagerHomeButton);
        this.f3634o = (Button) inflate2.findViewById(R.id.userFileManagerUpButton);
        this.f3635p = (Button) inflate2.findViewById(R.id.userFileManagerRefreshButton);
        this.f3631l = (Button) inflate2.findViewById(R.id.userFileManagerPasteButton);
        this.f3632m = (Button) inflate2.findViewById(R.id.userFileManagerCancelCopyButton);
        this.f3625f = (TextView) inflate2.findViewById(R.id.userFileManagerStorageInfo);
        this.f3626g = (ProgressBar) inflate2.findViewById(R.id.userFileManagerStorageProgress);
        this.f3627h = (TextView) inflate2.findViewById(R.id.userFileManagerCurrentPath);
        this.f3630k = (LinearLayout) inflate2.findViewById(R.id.userFileManagerClipboardPanel);
        this.f3628i = (TextView) inflate2.findViewById(R.id.userFileManagerClipboard);
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        this.f3637s = externalStorageDirectory;
        this.t = externalStorageDirectory;
        this.r = h7.k.f2618o;
        this.e = new x2(this);
        final int i11 = 3;
        final int i12 = 1;
        final int i13 = 2;
        recyclerView.setAdapter(new ConcatAdapter((RecyclerView.Adapter<? extends RecyclerView.ViewHolder>[]) new RecyclerView.Adapter[]{new a3(inflate2), this.e, new a3(this.f3629j)}));
        recyclerView.setItemAnimator(null);
        new ItemTouchHelper(new u2(this)).attachToRecyclerView(recyclerView);
        button.setOnClickListener(new View.OnClickListener(this) { // from class: m0.r2
            public final /* synthetic */ c3 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i10;
                c3 c3Var = this.c;
                switch (i14) {
                    case 0:
                        if (c3Var.getParentFragment() instanceof l0.a) {
                            ((l0.a) c3Var.getParentFragment()).dismiss();
                            return;
                        }
                        FragmentActivity activity = c3Var.getActivity();
                        if (activity != null) {
                            activity.finish();
                            return;
                        }
                        return;
                    case 1:
                        h7.k kVar = c3Var.r;
                        if (kVar != null) {
                            kVar.o(c3Var.requireContext());
                        }
                        ArrayList arrayList = new ArrayList();
                        HashSet hashSet = new HashSet();
                        try {
                            h7.k kVar2 = c3Var.r;
                            if (kVar2 != null) {
                                ArrayList e = kVar2.e();
                                int size = e.size();
                                int i15 = 0;
                                while (i15 < size) {
                                    Object obj = e.get(i15);
                                    i15++;
                                    c3.t(arrayList, hashSet, (File) obj);
                                }
                            }
                        } catch (Exception unused) {
                        }
                        try {
                            for (File file : ContextCompat.getExternalFilesDirs(c3Var.requireContext(), null)) {
                                if (file != null) {
                                    String absolutePath = file.getAbsolutePath();
                                    int indexOf = absolutePath.indexOf(e0.m.h(new byte[]{-41, -87, -84, -122, -86, 16, -123, -31}, new byte[]{-8, -24, -62, -30, -40, ByteCompanionObject.MAX_VALUE, -20, -123}));
                                    if (absolutePath.contains(e0.m.h(new byte[]{11, -77, -33, 9, -72, 64, -22, 0, 11}, new byte[]{36, -64, -85, 102, -54, 33, -115, 101})) && indexOf > 0) {
                                        c3.t(arrayList, hashSet, new File(absolutePath.substring(0, indexOf)));
                                    }
                                }
                            }
                        } catch (Exception unused2) {
                        }
                        try {
                            File[] listFiles = new File(e0.m.h(new byte[]{-69, -24, 124, -73, 105, -88, -80, 123, -69}, new byte[]{-108, -101, 8, -40, 27, -55, -41, 30})).listFiles();
                            if (listFiles != null) {
                                for (File file2 : listFiles) {
                                    c3.t(arrayList, hashSet, file2);
                                }
                            }
                        } catch (Exception unused3) {
                        }
                        if (arrayList.isEmpty()) {
                            c3Var.I(c3Var.getString(R.string.usb_not));
                            return;
                        }
                        String[] strArr = new String[arrayList.size()];
                        for (int i16 = 0; i16 < arrayList.size(); i16++) {
                            strArr[i16] = ((File) arrayList.get(i16)).getAbsolutePath();
                        }
                        new AlertDialog.Builder(c3Var.requireContext(), R.style.ThemeOverlay_JCarTools_ModernAlert).setTitle(c3Var.getString(R.string.usb_chos)).setItems(strArr, new e0.e0(7, c3Var, arrayList)).show();
                        return;
                    case 2:
                        c3Var.D(c3Var.f3637s);
                        return;
                    case 3:
                        File file3 = c3Var.t;
                        if (file3 != null && file3.getParentFile() != null) {
                            c3Var.D(c3Var.t.getParentFile());
                            return;
                        } else {
                            c3Var.I(c3Var.getString(R.string.uje_tut));
                            return;
                        }
                    case 4:
                        h7.k kVar3 = c3Var.r;
                        if (kVar3 != null) {
                            kVar3.o(c3Var.requireContext());
                        }
                        c3Var.v();
                        c3Var.D(c3Var.t);
                        return;
                    case 5:
                        File file4 = c3Var.f3638u;
                        File file5 = c3Var.t;
                        if (!c3Var.f3639v && file4 != null && file5 != null) {
                            if (!file4.exists()) {
                                c3Var.f3638u = null;
                                c3Var.K();
                                c3Var.I(c3Var.getString(R.string.user_file_manager_open_root_error));
                                return;
                            } else {
                                c3Var.H(c3Var.getString(R.string.user_file_manager_copying), true);
                                e0.w.c(-1, e0.m.h(new byte[]{-31, 52, -69, 9, 85, 3, 13, 20, -7, 38, -80, 26, 116, 15, 19, 55, -58, 38, -71, 22, 118, 4, 21}, new byte[]{-76, 71, -34, 123, 19, 106, 97, 113})).execute(new b1.n(c3Var, file5, file4, 10));
                                return;
                            }
                        }
                        return;
                    default:
                        c3Var.f3638u = null;
                        c3Var.I(c3Var.getString(R.string.user_file_manager_copy_cancelled));
                        c3Var.K();
                        return;
                }
            }
        });
        this.f3636q.setOnClickListener(new View.OnClickListener(this) { // from class: m0.r2
            public final /* synthetic */ c3 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i12;
                c3 c3Var = this.c;
                switch (i14) {
                    case 0:
                        if (c3Var.getParentFragment() instanceof l0.a) {
                            ((l0.a) c3Var.getParentFragment()).dismiss();
                            return;
                        }
                        FragmentActivity activity = c3Var.getActivity();
                        if (activity != null) {
                            activity.finish();
                            return;
                        }
                        return;
                    case 1:
                        h7.k kVar = c3Var.r;
                        if (kVar != null) {
                            kVar.o(c3Var.requireContext());
                        }
                        ArrayList arrayList = new ArrayList();
                        HashSet hashSet = new HashSet();
                        try {
                            h7.k kVar2 = c3Var.r;
                            if (kVar2 != null) {
                                ArrayList e = kVar2.e();
                                int size = e.size();
                                int i15 = 0;
                                while (i15 < size) {
                                    Object obj = e.get(i15);
                                    i15++;
                                    c3.t(arrayList, hashSet, (File) obj);
                                }
                            }
                        } catch (Exception unused) {
                        }
                        try {
                            for (File file : ContextCompat.getExternalFilesDirs(c3Var.requireContext(), null)) {
                                if (file != null) {
                                    String absolutePath = file.getAbsolutePath();
                                    int indexOf = absolutePath.indexOf(e0.m.h(new byte[]{-41, -87, -84, -122, -86, 16, -123, -31}, new byte[]{-8, -24, -62, -30, -40, ByteCompanionObject.MAX_VALUE, -20, -123}));
                                    if (absolutePath.contains(e0.m.h(new byte[]{11, -77, -33, 9, -72, 64, -22, 0, 11}, new byte[]{36, -64, -85, 102, -54, 33, -115, 101})) && indexOf > 0) {
                                        c3.t(arrayList, hashSet, new File(absolutePath.substring(0, indexOf)));
                                    }
                                }
                            }
                        } catch (Exception unused2) {
                        }
                        try {
                            File[] listFiles = new File(e0.m.h(new byte[]{-69, -24, 124, -73, 105, -88, -80, 123, -69}, new byte[]{-108, -101, 8, -40, 27, -55, -41, 30})).listFiles();
                            if (listFiles != null) {
                                for (File file2 : listFiles) {
                                    c3.t(arrayList, hashSet, file2);
                                }
                            }
                        } catch (Exception unused3) {
                        }
                        if (arrayList.isEmpty()) {
                            c3Var.I(c3Var.getString(R.string.usb_not));
                            return;
                        }
                        String[] strArr = new String[arrayList.size()];
                        for (int i16 = 0; i16 < arrayList.size(); i16++) {
                            strArr[i16] = ((File) arrayList.get(i16)).getAbsolutePath();
                        }
                        new AlertDialog.Builder(c3Var.requireContext(), R.style.ThemeOverlay_JCarTools_ModernAlert).setTitle(c3Var.getString(R.string.usb_chos)).setItems(strArr, new e0.e0(7, c3Var, arrayList)).show();
                        return;
                    case 2:
                        c3Var.D(c3Var.f3637s);
                        return;
                    case 3:
                        File file3 = c3Var.t;
                        if (file3 != null && file3.getParentFile() != null) {
                            c3Var.D(c3Var.t.getParentFile());
                            return;
                        } else {
                            c3Var.I(c3Var.getString(R.string.uje_tut));
                            return;
                        }
                    case 4:
                        h7.k kVar3 = c3Var.r;
                        if (kVar3 != null) {
                            kVar3.o(c3Var.requireContext());
                        }
                        c3Var.v();
                        c3Var.D(c3Var.t);
                        return;
                    case 5:
                        File file4 = c3Var.f3638u;
                        File file5 = c3Var.t;
                        if (!c3Var.f3639v && file4 != null && file5 != null) {
                            if (!file4.exists()) {
                                c3Var.f3638u = null;
                                c3Var.K();
                                c3Var.I(c3Var.getString(R.string.user_file_manager_open_root_error));
                                return;
                            } else {
                                c3Var.H(c3Var.getString(R.string.user_file_manager_copying), true);
                                e0.w.c(-1, e0.m.h(new byte[]{-31, 52, -69, 9, 85, 3, 13, 20, -7, 38, -80, 26, 116, 15, 19, 55, -58, 38, -71, 22, 118, 4, 21}, new byte[]{-76, 71, -34, 123, 19, 106, 97, 113})).execute(new b1.n(c3Var, file5, file4, 10));
                                return;
                            }
                        }
                        return;
                    default:
                        c3Var.f3638u = null;
                        c3Var.I(c3Var.getString(R.string.user_file_manager_copy_cancelled));
                        c3Var.K();
                        return;
                }
            }
        });
        this.f3633n.setOnClickListener(new View.OnClickListener(this) { // from class: m0.r2
            public final /* synthetic */ c3 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i13;
                c3 c3Var = this.c;
                switch (i14) {
                    case 0:
                        if (c3Var.getParentFragment() instanceof l0.a) {
                            ((l0.a) c3Var.getParentFragment()).dismiss();
                            return;
                        }
                        FragmentActivity activity = c3Var.getActivity();
                        if (activity != null) {
                            activity.finish();
                            return;
                        }
                        return;
                    case 1:
                        h7.k kVar = c3Var.r;
                        if (kVar != null) {
                            kVar.o(c3Var.requireContext());
                        }
                        ArrayList arrayList = new ArrayList();
                        HashSet hashSet = new HashSet();
                        try {
                            h7.k kVar2 = c3Var.r;
                            if (kVar2 != null) {
                                ArrayList e = kVar2.e();
                                int size = e.size();
                                int i15 = 0;
                                while (i15 < size) {
                                    Object obj = e.get(i15);
                                    i15++;
                                    c3.t(arrayList, hashSet, (File) obj);
                                }
                            }
                        } catch (Exception unused) {
                        }
                        try {
                            for (File file : ContextCompat.getExternalFilesDirs(c3Var.requireContext(), null)) {
                                if (file != null) {
                                    String absolutePath = file.getAbsolutePath();
                                    int indexOf = absolutePath.indexOf(e0.m.h(new byte[]{-41, -87, -84, -122, -86, 16, -123, -31}, new byte[]{-8, -24, -62, -30, -40, ByteCompanionObject.MAX_VALUE, -20, -123}));
                                    if (absolutePath.contains(e0.m.h(new byte[]{11, -77, -33, 9, -72, 64, -22, 0, 11}, new byte[]{36, -64, -85, 102, -54, 33, -115, 101})) && indexOf > 0) {
                                        c3.t(arrayList, hashSet, new File(absolutePath.substring(0, indexOf)));
                                    }
                                }
                            }
                        } catch (Exception unused2) {
                        }
                        try {
                            File[] listFiles = new File(e0.m.h(new byte[]{-69, -24, 124, -73, 105, -88, -80, 123, -69}, new byte[]{-108, -101, 8, -40, 27, -55, -41, 30})).listFiles();
                            if (listFiles != null) {
                                for (File file2 : listFiles) {
                                    c3.t(arrayList, hashSet, file2);
                                }
                            }
                        } catch (Exception unused3) {
                        }
                        if (arrayList.isEmpty()) {
                            c3Var.I(c3Var.getString(R.string.usb_not));
                            return;
                        }
                        String[] strArr = new String[arrayList.size()];
                        for (int i16 = 0; i16 < arrayList.size(); i16++) {
                            strArr[i16] = ((File) arrayList.get(i16)).getAbsolutePath();
                        }
                        new AlertDialog.Builder(c3Var.requireContext(), R.style.ThemeOverlay_JCarTools_ModernAlert).setTitle(c3Var.getString(R.string.usb_chos)).setItems(strArr, new e0.e0(7, c3Var, arrayList)).show();
                        return;
                    case 2:
                        c3Var.D(c3Var.f3637s);
                        return;
                    case 3:
                        File file3 = c3Var.t;
                        if (file3 != null && file3.getParentFile() != null) {
                            c3Var.D(c3Var.t.getParentFile());
                            return;
                        } else {
                            c3Var.I(c3Var.getString(R.string.uje_tut));
                            return;
                        }
                    case 4:
                        h7.k kVar3 = c3Var.r;
                        if (kVar3 != null) {
                            kVar3.o(c3Var.requireContext());
                        }
                        c3Var.v();
                        c3Var.D(c3Var.t);
                        return;
                    case 5:
                        File file4 = c3Var.f3638u;
                        File file5 = c3Var.t;
                        if (!c3Var.f3639v && file4 != null && file5 != null) {
                            if (!file4.exists()) {
                                c3Var.f3638u = null;
                                c3Var.K();
                                c3Var.I(c3Var.getString(R.string.user_file_manager_open_root_error));
                                return;
                            } else {
                                c3Var.H(c3Var.getString(R.string.user_file_manager_copying), true);
                                e0.w.c(-1, e0.m.h(new byte[]{-31, 52, -69, 9, 85, 3, 13, 20, -7, 38, -80, 26, 116, 15, 19, 55, -58, 38, -71, 22, 118, 4, 21}, new byte[]{-76, 71, -34, 123, 19, 106, 97, 113})).execute(new b1.n(c3Var, file5, file4, 10));
                                return;
                            }
                        }
                        return;
                    default:
                        c3Var.f3638u = null;
                        c3Var.I(c3Var.getString(R.string.user_file_manager_copy_cancelled));
                        c3Var.K();
                        return;
                }
            }
        });
        this.f3634o.setOnClickListener(new View.OnClickListener(this) { // from class: m0.r2
            public final /* synthetic */ c3 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i11;
                c3 c3Var = this.c;
                switch (i14) {
                    case 0:
                        if (c3Var.getParentFragment() instanceof l0.a) {
                            ((l0.a) c3Var.getParentFragment()).dismiss();
                            return;
                        }
                        FragmentActivity activity = c3Var.getActivity();
                        if (activity != null) {
                            activity.finish();
                            return;
                        }
                        return;
                    case 1:
                        h7.k kVar = c3Var.r;
                        if (kVar != null) {
                            kVar.o(c3Var.requireContext());
                        }
                        ArrayList arrayList = new ArrayList();
                        HashSet hashSet = new HashSet();
                        try {
                            h7.k kVar2 = c3Var.r;
                            if (kVar2 != null) {
                                ArrayList e = kVar2.e();
                                int size = e.size();
                                int i15 = 0;
                                while (i15 < size) {
                                    Object obj = e.get(i15);
                                    i15++;
                                    c3.t(arrayList, hashSet, (File) obj);
                                }
                            }
                        } catch (Exception unused) {
                        }
                        try {
                            for (File file : ContextCompat.getExternalFilesDirs(c3Var.requireContext(), null)) {
                                if (file != null) {
                                    String absolutePath = file.getAbsolutePath();
                                    int indexOf = absolutePath.indexOf(e0.m.h(new byte[]{-41, -87, -84, -122, -86, 16, -123, -31}, new byte[]{-8, -24, -62, -30, -40, ByteCompanionObject.MAX_VALUE, -20, -123}));
                                    if (absolutePath.contains(e0.m.h(new byte[]{11, -77, -33, 9, -72, 64, -22, 0, 11}, new byte[]{36, -64, -85, 102, -54, 33, -115, 101})) && indexOf > 0) {
                                        c3.t(arrayList, hashSet, new File(absolutePath.substring(0, indexOf)));
                                    }
                                }
                            }
                        } catch (Exception unused2) {
                        }
                        try {
                            File[] listFiles = new File(e0.m.h(new byte[]{-69, -24, 124, -73, 105, -88, -80, 123, -69}, new byte[]{-108, -101, 8, -40, 27, -55, -41, 30})).listFiles();
                            if (listFiles != null) {
                                for (File file2 : listFiles) {
                                    c3.t(arrayList, hashSet, file2);
                                }
                            }
                        } catch (Exception unused3) {
                        }
                        if (arrayList.isEmpty()) {
                            c3Var.I(c3Var.getString(R.string.usb_not));
                            return;
                        }
                        String[] strArr = new String[arrayList.size()];
                        for (int i16 = 0; i16 < arrayList.size(); i16++) {
                            strArr[i16] = ((File) arrayList.get(i16)).getAbsolutePath();
                        }
                        new AlertDialog.Builder(c3Var.requireContext(), R.style.ThemeOverlay_JCarTools_ModernAlert).setTitle(c3Var.getString(R.string.usb_chos)).setItems(strArr, new e0.e0(7, c3Var, arrayList)).show();
                        return;
                    case 2:
                        c3Var.D(c3Var.f3637s);
                        return;
                    case 3:
                        File file3 = c3Var.t;
                        if (file3 != null && file3.getParentFile() != null) {
                            c3Var.D(c3Var.t.getParentFile());
                            return;
                        } else {
                            c3Var.I(c3Var.getString(R.string.uje_tut));
                            return;
                        }
                    case 4:
                        h7.k kVar3 = c3Var.r;
                        if (kVar3 != null) {
                            kVar3.o(c3Var.requireContext());
                        }
                        c3Var.v();
                        c3Var.D(c3Var.t);
                        return;
                    case 5:
                        File file4 = c3Var.f3638u;
                        File file5 = c3Var.t;
                        if (!c3Var.f3639v && file4 != null && file5 != null) {
                            if (!file4.exists()) {
                                c3Var.f3638u = null;
                                c3Var.K();
                                c3Var.I(c3Var.getString(R.string.user_file_manager_open_root_error));
                                return;
                            } else {
                                c3Var.H(c3Var.getString(R.string.user_file_manager_copying), true);
                                e0.w.c(-1, e0.m.h(new byte[]{-31, 52, -69, 9, 85, 3, 13, 20, -7, 38, -80, 26, 116, 15, 19, 55, -58, 38, -71, 22, 118, 4, 21}, new byte[]{-76, 71, -34, 123, 19, 106, 97, 113})).execute(new b1.n(c3Var, file5, file4, 10));
                                return;
                            }
                        }
                        return;
                    default:
                        c3Var.f3638u = null;
                        c3Var.I(c3Var.getString(R.string.user_file_manager_copy_cancelled));
                        c3Var.K();
                        return;
                }
            }
        });
        final int i14 = 4;
        this.f3635p.setOnClickListener(new View.OnClickListener(this) { // from class: m0.r2
            public final /* synthetic */ c3 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142 = i14;
                c3 c3Var = this.c;
                switch (i142) {
                    case 0:
                        if (c3Var.getParentFragment() instanceof l0.a) {
                            ((l0.a) c3Var.getParentFragment()).dismiss();
                            return;
                        }
                        FragmentActivity activity = c3Var.getActivity();
                        if (activity != null) {
                            activity.finish();
                            return;
                        }
                        return;
                    case 1:
                        h7.k kVar = c3Var.r;
                        if (kVar != null) {
                            kVar.o(c3Var.requireContext());
                        }
                        ArrayList arrayList = new ArrayList();
                        HashSet hashSet = new HashSet();
                        try {
                            h7.k kVar2 = c3Var.r;
                            if (kVar2 != null) {
                                ArrayList e = kVar2.e();
                                int size = e.size();
                                int i15 = 0;
                                while (i15 < size) {
                                    Object obj = e.get(i15);
                                    i15++;
                                    c3.t(arrayList, hashSet, (File) obj);
                                }
                            }
                        } catch (Exception unused) {
                        }
                        try {
                            for (File file : ContextCompat.getExternalFilesDirs(c3Var.requireContext(), null)) {
                                if (file != null) {
                                    String absolutePath = file.getAbsolutePath();
                                    int indexOf = absolutePath.indexOf(e0.m.h(new byte[]{-41, -87, -84, -122, -86, 16, -123, -31}, new byte[]{-8, -24, -62, -30, -40, ByteCompanionObject.MAX_VALUE, -20, -123}));
                                    if (absolutePath.contains(e0.m.h(new byte[]{11, -77, -33, 9, -72, 64, -22, 0, 11}, new byte[]{36, -64, -85, 102, -54, 33, -115, 101})) && indexOf > 0) {
                                        c3.t(arrayList, hashSet, new File(absolutePath.substring(0, indexOf)));
                                    }
                                }
                            }
                        } catch (Exception unused2) {
                        }
                        try {
                            File[] listFiles = new File(e0.m.h(new byte[]{-69, -24, 124, -73, 105, -88, -80, 123, -69}, new byte[]{-108, -101, 8, -40, 27, -55, -41, 30})).listFiles();
                            if (listFiles != null) {
                                for (File file2 : listFiles) {
                                    c3.t(arrayList, hashSet, file2);
                                }
                            }
                        } catch (Exception unused3) {
                        }
                        if (arrayList.isEmpty()) {
                            c3Var.I(c3Var.getString(R.string.usb_not));
                            return;
                        }
                        String[] strArr = new String[arrayList.size()];
                        for (int i16 = 0; i16 < arrayList.size(); i16++) {
                            strArr[i16] = ((File) arrayList.get(i16)).getAbsolutePath();
                        }
                        new AlertDialog.Builder(c3Var.requireContext(), R.style.ThemeOverlay_JCarTools_ModernAlert).setTitle(c3Var.getString(R.string.usb_chos)).setItems(strArr, new e0.e0(7, c3Var, arrayList)).show();
                        return;
                    case 2:
                        c3Var.D(c3Var.f3637s);
                        return;
                    case 3:
                        File file3 = c3Var.t;
                        if (file3 != null && file3.getParentFile() != null) {
                            c3Var.D(c3Var.t.getParentFile());
                            return;
                        } else {
                            c3Var.I(c3Var.getString(R.string.uje_tut));
                            return;
                        }
                    case 4:
                        h7.k kVar3 = c3Var.r;
                        if (kVar3 != null) {
                            kVar3.o(c3Var.requireContext());
                        }
                        c3Var.v();
                        c3Var.D(c3Var.t);
                        return;
                    case 5:
                        File file4 = c3Var.f3638u;
                        File file5 = c3Var.t;
                        if (!c3Var.f3639v && file4 != null && file5 != null) {
                            if (!file4.exists()) {
                                c3Var.f3638u = null;
                                c3Var.K();
                                c3Var.I(c3Var.getString(R.string.user_file_manager_open_root_error));
                                return;
                            } else {
                                c3Var.H(c3Var.getString(R.string.user_file_manager_copying), true);
                                e0.w.c(-1, e0.m.h(new byte[]{-31, 52, -69, 9, 85, 3, 13, 20, -7, 38, -80, 26, 116, 15, 19, 55, -58, 38, -71, 22, 118, 4, 21}, new byte[]{-76, 71, -34, 123, 19, 106, 97, 113})).execute(new b1.n(c3Var, file5, file4, 10));
                                return;
                            }
                        }
                        return;
                    default:
                        c3Var.f3638u = null;
                        c3Var.I(c3Var.getString(R.string.user_file_manager_copy_cancelled));
                        c3Var.K();
                        return;
                }
            }
        });
        final int i15 = 5;
        this.f3631l.setOnClickListener(new View.OnClickListener(this) { // from class: m0.r2
            public final /* synthetic */ c3 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142 = i15;
                c3 c3Var = this.c;
                switch (i142) {
                    case 0:
                        if (c3Var.getParentFragment() instanceof l0.a) {
                            ((l0.a) c3Var.getParentFragment()).dismiss();
                            return;
                        }
                        FragmentActivity activity = c3Var.getActivity();
                        if (activity != null) {
                            activity.finish();
                            return;
                        }
                        return;
                    case 1:
                        h7.k kVar = c3Var.r;
                        if (kVar != null) {
                            kVar.o(c3Var.requireContext());
                        }
                        ArrayList arrayList = new ArrayList();
                        HashSet hashSet = new HashSet();
                        try {
                            h7.k kVar2 = c3Var.r;
                            if (kVar2 != null) {
                                ArrayList e = kVar2.e();
                                int size = e.size();
                                int i152 = 0;
                                while (i152 < size) {
                                    Object obj = e.get(i152);
                                    i152++;
                                    c3.t(arrayList, hashSet, (File) obj);
                                }
                            }
                        } catch (Exception unused) {
                        }
                        try {
                            for (File file : ContextCompat.getExternalFilesDirs(c3Var.requireContext(), null)) {
                                if (file != null) {
                                    String absolutePath = file.getAbsolutePath();
                                    int indexOf = absolutePath.indexOf(e0.m.h(new byte[]{-41, -87, -84, -122, -86, 16, -123, -31}, new byte[]{-8, -24, -62, -30, -40, ByteCompanionObject.MAX_VALUE, -20, -123}));
                                    if (absolutePath.contains(e0.m.h(new byte[]{11, -77, -33, 9, -72, 64, -22, 0, 11}, new byte[]{36, -64, -85, 102, -54, 33, -115, 101})) && indexOf > 0) {
                                        c3.t(arrayList, hashSet, new File(absolutePath.substring(0, indexOf)));
                                    }
                                }
                            }
                        } catch (Exception unused2) {
                        }
                        try {
                            File[] listFiles = new File(e0.m.h(new byte[]{-69, -24, 124, -73, 105, -88, -80, 123, -69}, new byte[]{-108, -101, 8, -40, 27, -55, -41, 30})).listFiles();
                            if (listFiles != null) {
                                for (File file2 : listFiles) {
                                    c3.t(arrayList, hashSet, file2);
                                }
                            }
                        } catch (Exception unused3) {
                        }
                        if (arrayList.isEmpty()) {
                            c3Var.I(c3Var.getString(R.string.usb_not));
                            return;
                        }
                        String[] strArr = new String[arrayList.size()];
                        for (int i16 = 0; i16 < arrayList.size(); i16++) {
                            strArr[i16] = ((File) arrayList.get(i16)).getAbsolutePath();
                        }
                        new AlertDialog.Builder(c3Var.requireContext(), R.style.ThemeOverlay_JCarTools_ModernAlert).setTitle(c3Var.getString(R.string.usb_chos)).setItems(strArr, new e0.e0(7, c3Var, arrayList)).show();
                        return;
                    case 2:
                        c3Var.D(c3Var.f3637s);
                        return;
                    case 3:
                        File file3 = c3Var.t;
                        if (file3 != null && file3.getParentFile() != null) {
                            c3Var.D(c3Var.t.getParentFile());
                            return;
                        } else {
                            c3Var.I(c3Var.getString(R.string.uje_tut));
                            return;
                        }
                    case 4:
                        h7.k kVar3 = c3Var.r;
                        if (kVar3 != null) {
                            kVar3.o(c3Var.requireContext());
                        }
                        c3Var.v();
                        c3Var.D(c3Var.t);
                        return;
                    case 5:
                        File file4 = c3Var.f3638u;
                        File file5 = c3Var.t;
                        if (!c3Var.f3639v && file4 != null && file5 != null) {
                            if (!file4.exists()) {
                                c3Var.f3638u = null;
                                c3Var.K();
                                c3Var.I(c3Var.getString(R.string.user_file_manager_open_root_error));
                                return;
                            } else {
                                c3Var.H(c3Var.getString(R.string.user_file_manager_copying), true);
                                e0.w.c(-1, e0.m.h(new byte[]{-31, 52, -69, 9, 85, 3, 13, 20, -7, 38, -80, 26, 116, 15, 19, 55, -58, 38, -71, 22, 118, 4, 21}, new byte[]{-76, 71, -34, 123, 19, 106, 97, 113})).execute(new b1.n(c3Var, file5, file4, 10));
                                return;
                            }
                        }
                        return;
                    default:
                        c3Var.f3638u = null;
                        c3Var.I(c3Var.getString(R.string.user_file_manager_copy_cancelled));
                        c3Var.K();
                        return;
                }
            }
        });
        final int i16 = 6;
        this.f3632m.setOnClickListener(new View.OnClickListener(this) { // from class: m0.r2
            public final /* synthetic */ c3 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142 = i16;
                c3 c3Var = this.c;
                switch (i142) {
                    case 0:
                        if (c3Var.getParentFragment() instanceof l0.a) {
                            ((l0.a) c3Var.getParentFragment()).dismiss();
                            return;
                        }
                        FragmentActivity activity = c3Var.getActivity();
                        if (activity != null) {
                            activity.finish();
                            return;
                        }
                        return;
                    case 1:
                        h7.k kVar = c3Var.r;
                        if (kVar != null) {
                            kVar.o(c3Var.requireContext());
                        }
                        ArrayList arrayList = new ArrayList();
                        HashSet hashSet = new HashSet();
                        try {
                            h7.k kVar2 = c3Var.r;
                            if (kVar2 != null) {
                                ArrayList e = kVar2.e();
                                int size = e.size();
                                int i152 = 0;
                                while (i152 < size) {
                                    Object obj = e.get(i152);
                                    i152++;
                                    c3.t(arrayList, hashSet, (File) obj);
                                }
                            }
                        } catch (Exception unused) {
                        }
                        try {
                            for (File file : ContextCompat.getExternalFilesDirs(c3Var.requireContext(), null)) {
                                if (file != null) {
                                    String absolutePath = file.getAbsolutePath();
                                    int indexOf = absolutePath.indexOf(e0.m.h(new byte[]{-41, -87, -84, -122, -86, 16, -123, -31}, new byte[]{-8, -24, -62, -30, -40, ByteCompanionObject.MAX_VALUE, -20, -123}));
                                    if (absolutePath.contains(e0.m.h(new byte[]{11, -77, -33, 9, -72, 64, -22, 0, 11}, new byte[]{36, -64, -85, 102, -54, 33, -115, 101})) && indexOf > 0) {
                                        c3.t(arrayList, hashSet, new File(absolutePath.substring(0, indexOf)));
                                    }
                                }
                            }
                        } catch (Exception unused2) {
                        }
                        try {
                            File[] listFiles = new File(e0.m.h(new byte[]{-69, -24, 124, -73, 105, -88, -80, 123, -69}, new byte[]{-108, -101, 8, -40, 27, -55, -41, 30})).listFiles();
                            if (listFiles != null) {
                                for (File file2 : listFiles) {
                                    c3.t(arrayList, hashSet, file2);
                                }
                            }
                        } catch (Exception unused3) {
                        }
                        if (arrayList.isEmpty()) {
                            c3Var.I(c3Var.getString(R.string.usb_not));
                            return;
                        }
                        String[] strArr = new String[arrayList.size()];
                        for (int i162 = 0; i162 < arrayList.size(); i162++) {
                            strArr[i162] = ((File) arrayList.get(i162)).getAbsolutePath();
                        }
                        new AlertDialog.Builder(c3Var.requireContext(), R.style.ThemeOverlay_JCarTools_ModernAlert).setTitle(c3Var.getString(R.string.usb_chos)).setItems(strArr, new e0.e0(7, c3Var, arrayList)).show();
                        return;
                    case 2:
                        c3Var.D(c3Var.f3637s);
                        return;
                    case 3:
                        File file3 = c3Var.t;
                        if (file3 != null && file3.getParentFile() != null) {
                            c3Var.D(c3Var.t.getParentFile());
                            return;
                        } else {
                            c3Var.I(c3Var.getString(R.string.uje_tut));
                            return;
                        }
                    case 4:
                        h7.k kVar3 = c3Var.r;
                        if (kVar3 != null) {
                            kVar3.o(c3Var.requireContext());
                        }
                        c3Var.v();
                        c3Var.D(c3Var.t);
                        return;
                    case 5:
                        File file4 = c3Var.f3638u;
                        File file5 = c3Var.t;
                        if (!c3Var.f3639v && file4 != null && file5 != null) {
                            if (!file4.exists()) {
                                c3Var.f3638u = null;
                                c3Var.K();
                                c3Var.I(c3Var.getString(R.string.user_file_manager_open_root_error));
                                return;
                            } else {
                                c3Var.H(c3Var.getString(R.string.user_file_manager_copying), true);
                                e0.w.c(-1, e0.m.h(new byte[]{-31, 52, -69, 9, 85, 3, 13, 20, -7, 38, -80, 26, 116, 15, 19, 55, -58, 38, -71, 22, 118, 4, 21}, new byte[]{-76, 71, -34, 123, 19, 106, 97, 113})).execute(new b1.n(c3Var, file5, file4, 10));
                                return;
                            }
                        }
                        return;
                    default:
                        c3Var.f3638u = null;
                        c3Var.I(c3Var.getString(R.string.user_file_manager_copy_cancelled));
                        c3Var.K();
                        return;
                }
            }
        });
        K();
        D(this.t);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        h7.k kVar = this.r;
        if (kVar != null) {
            kVar.v(requireContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        h7.k kVar = this.r;
        if (kVar != null) {
            requireContext();
            kVar.w();
        }
        super.onStop();
    }

    public final void v() {
        this.w++;
        this.c.clear();
        this.d.clear();
    }

    public final int z(int i10) {
        return Math.round(i10 * requireContext().getResources().getDisplayMetrics().density);
    }
}
