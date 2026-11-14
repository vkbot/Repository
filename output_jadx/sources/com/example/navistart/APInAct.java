package com.example.navistart;

import a1.a;
import android.app.PendingIntent;
import android.app.admin.DevicePolicyManager;
import android.content.Intent;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.lifecycle.Observer;
import b1.c;
import com.example.navistart.APInAct;
import com.google.protobuf.q;
import e0.b;
import e0.m;
import e0.p3;
import e0.w;
import e0.x1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import v1.d;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class APInAct extends AppCompatActivity {

    /* renamed from: f, reason: collision with root package name */
    public static final String f690f = m.h(new byte[]{-111, -112, -78, 98, -46, -97, 29}, new byte[]{-48, -64, -5, 12, -109, -4, 105, -61});

    /* renamed from: g, reason: collision with root package name */
    public static final String f691g;

    /* renamed from: b, reason: collision with root package name */
    public TextView f692b;
    public Button c;
    public ProgressBar d;
    public final c e = new c(2, this);

    static {
        m.h(new byte[]{59, 52, -17, 7, -107, 113, -21, 67, 118, 58, -14, 89, -117, 96, -29, 80, Base64.padSymbol}, new byte[]{88, 91, -126, 41, -8, 20, -116, 34});
        f691g = m.h(new byte[]{-82, -67, -115, -124, 111, -61, 12, -118, -29, -77, -112, -38, 113, -46, 4, -103, -88, -4, -95, -23, 86, -17, 36, -91, -110, -101, -82, -7, 86, -25, 39, -89, -110, ByteCompanionObject.MIN_VALUE, -91, -7, 87, -22, 63}, new byte[]{-51, -46, -32, -86, 2, -90, 107, -21});
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final int i10 = 1;
        AppCompatDelegate.setDefaultNightMode(1);
        setContentView(R.layout.activity_apinact);
        this.f692b = (TextView) findViewById(R.id.textView44);
        Button button = (Button) findViewById(R.id.button21);
        this.c = button;
        button.setOnClickListener(new androidx.navigation.c(3, this));
        this.d = (ProgressBar) findViewById(R.id.progressBar3);
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra(m.h(new byte[]{2, 8, -35, 106, 123, 83, -44, -62, 10, 8, -51, 125, 122, 78, -98, -119, 27, 18, -53, 121, 58, 105, -28, -66, 38, 39, -12}, new byte[]{99, 102, -71, 24, 20, 58, -80, -20}));
        final int i11 = 0;
        d.a().b().f5919a.observe(this, new Observer(this) { // from class: e0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ APInAct f1875b;

            {
                this.f1875b = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i12 = i11;
                APInAct aPInAct = this.f1875b;
                switch (i12) {
                    case 0:
                        String str = APInAct.f690f;
                        new Handler(Looper.getMainLooper()).post(new a1.a(14, aPInAct, (String) obj));
                        return;
                    default:
                        String str2 = APInAct.f690f;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        Button button2 = aPInAct.c;
                        if (booleanValue) {
                            if (button2 != null) {
                                button2.setVisibility(0);
                            }
                            ProgressBar progressBar = aPInAct.d;
                            if (progressBar != null) {
                                progressBar.setVisibility(8);
                                return;
                            }
                            return;
                        }
                        if (button2 != null) {
                            button2.setVisibility(8);
                        }
                        ProgressBar progressBar2 = aPInAct.d;
                        if (progressBar2 != null) {
                            progressBar2.setVisibility(0);
                            return;
                        }
                        return;
                }
            }
        });
        d.a().b().f5920b.observe(this, new Observer(this) { // from class: e0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ APInAct f1875b;

            {
                this.f1875b = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i12 = i10;
                APInAct aPInAct = this.f1875b;
                switch (i12) {
                    case 0:
                        String str = APInAct.f690f;
                        new Handler(Looper.getMainLooper()).post(new a1.a(14, aPInAct, (String) obj));
                        return;
                    default:
                        String str2 = APInAct.f690f;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        Button button2 = aPInAct.c;
                        if (booleanValue) {
                            if (button2 != null) {
                                button2.setVisibility(0);
                            }
                            ProgressBar progressBar = aPInAct.d;
                            if (progressBar != null) {
                                progressBar.setVisibility(8);
                                return;
                            }
                            return;
                        }
                        if (button2 != null) {
                            button2.setVisibility(8);
                        }
                        ProgressBar progressBar2 = aPInAct.d;
                        if (progressBar2 != null) {
                            progressBar2.setVisibility(0);
                            return;
                        }
                        return;
                }
            }
        });
        w.c(-1, f690f).execute(new a(13, this, parcelableArrayListExtra));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        try {
            unregisterReceiver(this.e);
        } catch (Exception unused) {
        }
        d.a().b().a(getResources().getString(R.string.install_podgotovka));
        w.c(-1, f690f).execute(new b(this, 1));
    }

    public final Boolean s() {
        StringBuilder sb = new StringBuilder();
        u0.a o5 = h0.b.o();
        byte[] bArr = m.f1973j;
        String[] strArr = p3.f2001a;
        q.s(bArr, o5, "", sb);
        q.r(new byte[]{108, 105, 99, 116, 95, 114, 105, 117, 101}, sb);
        String g10 = q.g(sb, x1.f2066q);
        u0.a o9 = h0.b.o();
        byte[] bArr2 = m.f1969f;
        if (q.w(bArr2, o9, "", g10)) {
            boolean z9 = true;
            if (q.d(Long.MAX_VALUE, h0.b.a().j()) >= Long.parseLong(new String(q.x(new byte[]{77}, new byte[]{125, -118, 15, 44, 71, -41, 101, -26}, h0.b.o(), q.h(m.f1970g, h0.b.o(), new String(bArr2)), 0)))) {
                z9 = false;
            }
            return Boolean.valueOf(z9);
        }
        return Boolean.FALSE;
    }

    public final File t(Uri uri) {
        Uri uri2;
        String path;
        int lastIndexOf;
        int i10;
        int columnIndex;
        File file = new File(getFilesDir(), m.h(new byte[]{-51, -113, 87, 3, 116, -105, 38, 84, -5, ByteCompanionObject.MIN_VALUE, 68, 7, 106}, new byte[]{-92, -31, 52, 108, 25, -2, 72, 51}));
        if (!file.exists()) {
            file.mkdirs();
        }
        String str = null;
        if (uri.getScheme().equals(m.h(new byte[]{-91, 16, -59, -45, 101, -25, -56}, new byte[]{-58, ByteCompanionObject.MAX_VALUE, -85, -89, 0, -119, -68, 33}))) {
            uri2 = uri;
            Cursor query = getContentResolver().query(uri2, null, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst() && (columnIndex = query.getColumnIndex(m.h(new byte[]{-106, 21, -26, 88, -69, -4, -43, -64, -106, 31, -18, 70, -82}, new byte[]{-55, 113, -113, 43, -53, -112, -76, -71}))) != -1) {
                        str = query.getString(columnIndex);
                    }
                } finally {
                }
            }
            if (query != null) {
                query.close();
            }
        } else {
            uri2 = uri;
        }
        if (str == null && (path = uri2.getPath()) != null && (lastIndexOf = path.lastIndexOf(47)) != -1 && (i10 = lastIndexOf + 1) < path.length()) {
            str = path.substring(i10);
        }
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(m.h(new byte[]{-36, -40, -43, 19}, new byte[]{-67, -88, -66, 76, -79, 113, -34, -105}));
            sb.append(System.currentTimeMillis());
            str = q.i(new byte[]{54, 22, 20, -90}, new byte[]{24, 119, 100, -51, -47, 94, 103, 115}, sb);
        }
        File file2 = new File(file, str);
        InputStream openInputStream = getContentResolver().openInputStream(uri2);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = openInputStream.read(bArr);
                    if (read > 0) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.close();
                        openInputStream.close();
                        return file2;
                    }
                }
            } finally {
            }
        } finally {
        }
    }

    public final void u(ArrayList arrayList) {
        OutputStream openWrite;
        int i10;
        PackageInstaller packageInstaller = getPackageManager().getPackageInstaller();
        PackageInstaller.SessionParams sessionParams = new PackageInstaller.SessionParams(1);
        int i11 = 8;
        int i12 = 4;
        if (((DevicePolicyManager) getSystemService(m.h(new byte[]{-74, 71, 62, -34, -113, 67, 111, 76, -67, 78, 33, -44, -107}, new byte[]{-46, 34, 72, -73, -20, 38, 48, 60}))).isDeviceOwnerApp(getPackageName())) {
            d.a().b().a(getResources().getString(R.string.install_go));
            PackageManager packageManager = getPackageManager();
            if (!arrayList.isEmpty() && packageManager != null) {
                int size = arrayList.size();
                int i13 = 0;
                long j10 = 0;
                while (i13 < size) {
                    Object obj = arrayList.get(i13);
                    i13++;
                    File file = (File) obj;
                    if (file != null && file.exists()) {
                        j10 += file.length();
                    } else {
                        Log.e(m.h(new byte[]{-29, 9, -126, 73, -126, -39, -62, 122, -99, 15, -82, 121, -98, -35, -63, 111, -60, 15}, new byte[]{-80, 95, -61, 58, -15, -80, -79, 14}), m.h(new byte[]{-126, ByteCompanionObject.MAX_VALUE, -95, -28, 88, 29, 36, -121, -29, 66, -125, -73, 77, 29, 38, -123, -7, 15}, new byte[]{-61, 47, -22, -60, 62, 116, 72, -30}) + file);
                        break;
                    }
                }
                packageManager.getPackageArchiveInfo(((File) arrayList.get(0)).getAbsolutePath(), 1);
                PackageInstaller packageInstaller2 = packageManager.getPackageInstaller();
                PackageInstaller.SessionParams sessionParams2 = new PackageInstaller.SessionParams(1);
                sessionParams2.setSize(j10);
                int i14 = -1;
                try {
                    i10 = packageInstaller2.createSession(sessionParams2);
                } catch (IOException e) {
                    e.printStackTrace();
                    i10 = -1;
                }
                if (i10 != -1) {
                    try {
                        PackageInstaller.Session openSession = packageInstaller2.openSession(i10);
                        try {
                            long[] jArr = {0};
                            int size2 = arrayList.size();
                            int i15 = 0;
                            while (true) {
                                if (i15 < size2) {
                                    Object obj2 = arrayList.get(i15);
                                    i15++;
                                    File file2 = (File) obj2;
                                    byte[] bArr = new byte[i12];
                                    // fill-array-data instruction
                                    bArr[0] = -70;
                                    bArr[1] = 8;
                                    bArr[2] = -24;
                                    bArr[3] = -108;
                                    byte[] bArr2 = new byte[i11];
                                    // fill-array-data instruction
                                    bArr2[0] = -108;
                                    bArr2[1] = 105;
                                    bArr2[2] = -104;
                                    bArr2[3] = -1;
                                    bArr2[4] = 7;
                                    bArr2[5] = -37;
                                    bArr2[6] = -61;
                                    bArr2[7] = -33;
                                    if (file2.getName().endsWith(m.h(bArr, bArr2))) {
                                        FileInputStream fileInputStream = new FileInputStream(file2);
                                        try {
                                            openWrite = openSession.openWrite(file2.getName(), 0L, file2.length());
                                            try {
                                                byte[] bArr3 = new byte[1048576];
                                                while (true) {
                                                    int read = fileInputStream.read(bArr3);
                                                    if (read == i14) {
                                                        break;
                                                    }
                                                    openWrite.write(bArr3, 0, read);
                                                    jArr[0] = jArr[0] + read;
                                                    i14 = -1;
                                                }
                                                openSession.fsync(openWrite);
                                                if (openWrite != null) {
                                                    openWrite.close();
                                                }
                                                fileInputStream.close();
                                            } catch (Throwable th) {
                                                if (openWrite != null) {
                                                    try {
                                                        openWrite.close();
                                                        throw th;
                                                    } catch (Throwable th2) {
                                                        th.addSuppressed(th2);
                                                        throw th;
                                                    }
                                                }
                                            }
                                        } finally {
                                        }
                                    } else if (file2.getName().endsWith(m.h(new byte[]{-49, 83, -29, -44}, new byte[]{-31, 41, -118, -92, 51, -65, 114, 4})) && !m.y(openSession, file2, jArr, j10)) {
                                        if (openSession != null) {
                                            openSession.close();
                                        }
                                    }
                                    i14 = -1;
                                    i11 = 8;
                                    i12 = 4;
                                } else {
                                    if (openSession != null) {
                                        openSession.close();
                                    }
                                    if (m.g(this, packageInstaller2, i10)) {
                                        Log.e(m.h(new byte[]{34, -68, 81, -31, 37, 114, 124, 43, 92, -70, 125, -47, 57, 118, ByteCompanionObject.MAX_VALUE, 62, 5, -70}, new byte[]{113, -22, 16, -110, 86, 27, 15, 95}), m.h(new byte[]{77, -126, -57, 42, 21, 83, 100, 75, 109, -122, -54, 47, 13, 18, 121, 76, 113, -100, -117, 39, 14, 29, 104}, new byte[]{30, -14, -85, 67, 97, 115, 13, 37}));
                                    }
                                }
                            }
                        } finally {
                        }
                    } catch (Exception e6) {
                        Log.e(m.h(new byte[]{-46, -86, 12, -87, -94, -77, -19, -13, -84, -84, 32, -103, -66, -73, -18, -26, -11, -84}, new byte[]{-127, -4, 77, -38, -47, -38, -98, -121}), m.h(new byte[]{-113, -64, 45, 79, 48, 50, 30, -90, -85, -63, 45, 84, 59, 50, 11, -94, -79, -34, 33, 95}, new byte[]{-40, -78, 68, 59, 85, 18, 109, -61}), e6);
                    }
                }
            }
            d.a().b().a(getResources().getString(R.string.install_done));
            d.a().b().f5920b.postValue(Boolean.TRUE);
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            sessionParams.setRequireUserAction(1);
        }
        int createSession = packageInstaller.createSession(sessionParams);
        PackageInstaller.Session openSession2 = packageInstaller.openSession(createSession);
        byte[] bArr4 = new byte[65536];
        int size3 = arrayList.size();
        int i16 = 0;
        while (i16 < size3) {
            int i17 = i16 + 1;
            File file3 = (File) arrayList.get(i16);
            String name = file3.getName();
            Locale locale = Locale.ROOT;
            if (name.toLowerCase(locale).endsWith(m.h(new byte[]{-84, -43, -117, 43}, new byte[]{-126, -76, -5, 64, 22, -17, 31, -126}))) {
                openWrite = openSession2.openWrite(file3.getName(), 0L, file3.length());
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(file3);
                    while (true) {
                        try {
                            int read2 = fileInputStream2.read(bArr4);
                            if (read2 < 0) {
                                break;
                            } else {
                                openWrite.write(bArr4, 0, read2);
                            }
                        } catch (Throwable th3) {
                            try {
                                fileInputStream2.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    }
                    openSession2.fsync(openWrite);
                    fileInputStream2.close();
                    if (openWrite != null) {
                        openWrite.close();
                    }
                } finally {
                    if (openWrite != null) {
                        try {
                            openWrite.close();
                            throw th;
                        } catch (Throwable th5) {
                            th.addSuppressed(th5);
                        }
                    }
                    throw th;
                }
            } else if (file3.getName().toLowerCase(locale).endsWith(m.h(new byte[]{23, 21, -101, 8}, new byte[]{57, 111, -14, 120, 67, -14, 56, 22}))) {
                ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(file3));
                while (true) {
                    try {
                        ZipEntry nextEntry = zipInputStream.getNextEntry();
                        if (nextEntry == null) {
                            break;
                        }
                        if (nextEntry.getName().toLowerCase(Locale.ROOT).endsWith(m.h(new byte[]{-81, -68, -120, -85}, new byte[]{-127, -35, -8, -64, 112, 40, 54, -42}))) {
                            OutputStream openWrite2 = openSession2.openWrite(nextEntry.getName(), 0L, nextEntry.getSize());
                            while (true) {
                                try {
                                    int read3 = zipInputStream.read(bArr4);
                                    if (read3 < 0) {
                                        break;
                                    } else {
                                        openWrite2.write(bArr4, 0, read3);
                                    }
                                } catch (Throwable th6) {
                                    if (openWrite2 != null) {
                                        try {
                                            openWrite2.close();
                                            throw th6;
                                        } catch (Throwable th7) {
                                            th6.addSuppressed(th7);
                                            throw th6;
                                        }
                                    }
                                    throw th6;
                                }
                            }
                            openSession2.fsync(openWrite2);
                            if (openWrite2 != null) {
                                openWrite2.close();
                            }
                        }
                    } finally {
                    }
                }
                zipInputStream.close();
            } else {
                throw new IllegalArgumentException(m.h(new byte[]{121, 90, -116, -14, -108, 30, -82, 105, 88, 81, -101, -89, -126, 7, -83, 126, 12, 64, -122, -9, -127, 84, -31}, new byte[]{44, 52, -1, -121, -28, 110, -63, 27}) + file3.getName());
            }
            i16 = i17;
        }
        openSession2.commit(PendingIntent.getBroadcast(getApplicationContext(), createSession, new Intent(getApplicationContext(), (Class<?>) InstallResultReceiver.class), 167772160).getIntentSender());
        openSession2.close();
    }
}
