package com.woha.appmanag;

import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.core.utils.a;
import androidx.core.content.ContextCompat;
import androidx.documentfile.provider.DocumentFile;
import com.example.navistart.R;
import com.woha.appmanag.FilePickerActivity;
import e0.e0;
import e0.m;
import h7.b;
import h7.k;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class FilePickerActivity extends AppCompatActivity {

    /* renamed from: j, reason: collision with root package name */
    public static final String f1663j = m.h(new byte[]{-58, 65, -61, -113, 79, -44, 16, -31, -22, 66, -58, -122, 73}, new byte[]{-75, 36, -81, -22, 44, -96, 117, -123});

    /* renamed from: b, reason: collision with root package name */
    public ListView f1664b;
    public TextView c;
    public Button d;
    public File e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f1665f;

    /* renamed from: g, reason: collision with root package name */
    public k f1666g;

    /* renamed from: h, reason: collision with root package name */
    public String f1667h;

    /* renamed from: i, reason: collision with root package name */
    public int f1668i;

    public static boolean s(ArrayList arrayList, File file) {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((File) obj).getAbsolutePath().equals(file.getAbsolutePath())) {
                return true;
            }
        }
        return false;
    }

    public static boolean t(String str) {
        if (!str.startsWith(m.h(new byte[]{13, 105, -55, 63, 88, -61, Base64.padSymbol, ByteCompanionObject.MIN_VALUE, 13}, new byte[]{34, 26, -67, 80, 42, -94, 90, -27})) && !str.startsWith(m.h(new byte[]{-5, -10, -90, -22, 84, -96, 65, 31, -67, -6, -105, -20, 12, -30}, new byte[]{-44, -101, -56, -98, 123, -51, 36, 123})) && !str.startsWith(m.h(new byte[]{-53, 97, 67, -123, 85, -21, -106, -124, -112, 101, 64, -108, 85}, new byte[]{-28, 12, 45, -15, 122, -103, -29, -22})) && !str.startsWith(m.h(new byte[]{-3, -59, 32, 65, -110, -120, -9, 20}, new byte[]{-46, -88, 78, 53, -67, -3, -124, 118})) && !str.startsWith(m.h(new byte[]{-77, -73, -102, 108, -74, -17, -67, -34, -77, -79, -99, 97}, new byte[]{-100, -60, -18, 3, -60, -114, -38, -69})) && !str.startsWith(m.h(new byte[]{9, -62, -27, 4, -11, 116, -34, -127, 85, -60}, new byte[]{38, -81, -117, 112, -38, 1, -70, -24})) && !str.startsWith(m.h(new byte[]{-54, 83, -55, -26, -78, 126, -35, 51, -54, 85, -39, -32, -77, 116}, new byte[]{-27, 32, -67, -119, -64, 31, -70, 86})) && !str.startsWith(m.h(new byte[]{-120, 31, 113, -29, 58, -72, 110, -47, -120, 9, 125, -8}, new byte[]{-89, 108, 5, -116, 72, -39, 9, -76})) && !str.startsWith(m.h(new byte[]{8, ByteCompanionObject.MIN_VALUE, -121, 125, 5, 106, -39, -7}, new byte[]{39, -19, -23, 9, 42, 15, -95, -115})) && !str.startsWith(m.h(new byte[]{33, 101, -118, -10, -30, -91, -114, 44, 33, 101, -102, -6, -15, -74, -115}, new byte[]{14, 22, -2, -103, -112, -60, -23, 73}))) {
            return false;
        }
        return true;
    }

    public static boolean u(File file) {
        try {
            String absolutePath = file.getAbsolutePath();
            if (file.isDirectory() && !absolutePath.contains(m.h(new byte[]{-84, -127, -46, 81, 37, -7, -57, 77}, new byte[]{-55, -20, -89, Base64.padSymbol, 68, -115, -94, 41})) && !absolutePath.contains(m.h(new byte[]{111, 2, -100, -35}, new byte[]{28, 103, -16, -69, -46, -9, 117, 38})) && t(absolutePath)) {
                file.getName().matches(m.h(new byte[]{-35, -12, -119, -34, -55, 17, -21, -21, -30, -126, -33, -82, -117, 100, -69, ByteCompanionObject.MIN_VALUE, -40, -97, -108, -54, -79, 125, ByteCompanionObject.MIN_VALUE, -52, -82, -55, -28, -120, -60, 45, -30}, new byte[]{-125, -81, -71, -13, -16, 80, -58, -83}));
                if (file.listFiles() != null) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        Uri data;
        super.onActivityResult(i10, i11, intent);
        if ((i10 == 1001 || i10 == 42) && i11 == -1 && (data = intent.getData()) != null) {
            getContentResolver().takePersistableUriPermission(data, 3);
            DocumentFile fromTreeUri = DocumentFile.fromTreeUri(this, data);
            if (fromTreeUri != null && fromTreeUri.isDirectory()) {
                this.f1665f.clear();
                ArrayList arrayList = new ArrayList();
                for (DocumentFile documentFile : fromTreeUri.listFiles()) {
                    if (documentFile.isDirectory() || this.f1667h == null || documentFile.getName().toLowerCase().endsWith(this.f1667h.toLowerCase())) {
                        this.f1665f.add(new File(documentFile.getUri().toString()));
                        if (documentFile.isDirectory()) {
                            arrayList.add(m.h(new byte[]{36}, new byte[]{ByteCompanionObject.MAX_VALUE, -85, 80, -93, -127, -62, 59, -98}) + getString(R.string.folder) + m.h(new byte[]{-88, 63}, new byte[]{-11, 31, -76, 4, 4, 98, -94, -117}) + documentFile.getName());
                        } else {
                            arrayList.add(documentFile.getName());
                        }
                    }
                }
                this.f1664b.setAdapter((ListAdapter) new ArrayAdapter(this, R.layout.file_picker_item, arrayList));
                this.c.setText(m.h(new byte[]{24, -120, 26, 41, -62}, new byte[]{77, -37, 88, 19, -30, 80, 114, -97}) + fromTreeUri.getName());
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final int i10 = 1;
        AppCompatDelegate.setDefaultNightMode(1);
        setContentView(R.layout.activity_file_picker);
        this.f1667h = getIntent().getStringExtra(m.h(new byte[]{-123, 53, 32, 114, 126, 91, -60, -91, -122, 50, 63, 126, 78, 80}, new byte[]{-29, 92, 76, 23, 33, 62, -68, -47}));
        final int i11 = 0;
        this.f1668i = getIntent().getIntExtra(m.h(new byte[]{-22, 36, 24, 40, -119, -9, -28, -63, -23, 35, 7, 36, -71, -4, -61, -40, -29, 41, 17, 18, -91, -9, -14, -47}, new byte[]{-116, 77, 116, 77, -42, -110, -100, -75}), 0);
        this.f1664b = (ListView) findViewById(R.id.listView);
        View inflate = getLayoutInflater().inflate(R.layout.file_picker_header, (ViewGroup) this.f1664b, false);
        this.f1664b.addHeaderView(inflate, null, false);
        this.c = (TextView) inflate.findViewById(R.id.currentPathTextView);
        this.d = (Button) inflate.findViewById(R.id.upButton);
        ((Button) inflate.findViewById(R.id.cancelButton)).setOnClickListener(new View.OnClickListener(this) { // from class: h7.a
            public final /* synthetic */ FilePickerActivity c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = i11;
                FilePickerActivity filePickerActivity = this.c;
                switch (i12) {
                    case 0:
                        String str = FilePickerActivity.f1663j;
                        filePickerActivity.setResult(0);
                        filePickerActivity.finish();
                        return;
                    case 1:
                        if (filePickerActivity.e.getParentFile() != null) {
                            filePickerActivity.v(filePickerActivity.e.getParentFile());
                            return;
                        } else {
                            y5.k.x(filePickerActivity, filePickerActivity.getString(R.string.uje_tut));
                            return;
                        }
                    default:
                        k kVar = filePickerActivity.f1666g;
                        if (kVar != null) {
                            kVar.o(filePickerActivity);
                        }
                        ArrayList arrayList = new ArrayList();
                        try {
                            k kVar2 = filePickerActivity.f1666g;
                            if (kVar2 != null) {
                                ArrayList e = kVar2.e();
                                int size = e.size();
                                int i13 = 0;
                                while (i13 < size) {
                                    Object obj = e.get(i13);
                                    i13++;
                                    File file = (File) obj;
                                    if (FilePickerActivity.u(file) && !FilePickerActivity.s(arrayList, file)) {
                                        arrayList.add(file);
                                    }
                                }
                            }
                        } catch (Exception unused) {
                        }
                        try {
                            for (File file2 : ContextCompat.getExternalFilesDirs(filePickerActivity, null)) {
                                if (file2 != null) {
                                    String absolutePath = file2.getAbsolutePath();
                                    if (absolutePath.contains(m.h(new byte[]{23, 29, 97, 26, 19, -33, 47, -18, 23}, new byte[]{56, 110, 21, 117, 97, -66, 72, -117})) && absolutePath.contains(m.h(new byte[]{-98, 87, -53, -78, 86, 27, 126}, new byte[]{-33, 57, -81, -64, 57, 114, 26, 31}))) {
                                        File file3 = new File(absolutePath.substring(0, absolutePath.indexOf(m.h(new byte[]{90, 83, 18, -127, 6, -96, -58, 113}, new byte[]{117, 18, 124, -27, 116, -49, -81, 21}))));
                                        if (FilePickerActivity.u(file3) && !FilePickerActivity.s(arrayList, file3)) {
                                            arrayList.add(file3);
                                        }
                                    }
                                }
                            }
                        } catch (Exception unused2) {
                        }
                        try {
                            File[] listFiles = new File(m.h(new byte[]{1, 74, -73, -96, 93, -89, -104, 25, 1}, new byte[]{46, 57, -61, -49, 47, -58, -1, 124})).listFiles();
                            if (listFiles != null) {
                                for (File file4 : listFiles) {
                                    if (file4 != null && FilePickerActivity.u(file4) && !FilePickerActivity.s(arrayList, file4)) {
                                        arrayList.add(file4);
                                    }
                                }
                            }
                        } catch (Exception unused3) {
                        }
                        if (arrayList.isEmpty()) {
                            y5.k.x(filePickerActivity, filePickerActivity.getString(R.string.usb_not));
                            return;
                        }
                        String[] strArr = new String[arrayList.size()];
                        for (int i14 = 0; i14 < arrayList.size(); i14++) {
                            strArr[i14] = ((File) arrayList.get(i14)).getAbsolutePath();
                        }
                        new AlertDialog.Builder(filePickerActivity).setTitle(filePickerActivity.getString(R.string.usb_chos)).setItems(strArr, new e0(1, filePickerActivity, arrayList)).show();
                        return;
                }
            }
        });
        this.e = Environment.getExternalStorageDirectory();
        this.f1665f = new ArrayList();
        k kVar = k.f2618o;
        this.f1666g = kVar;
        kVar.v(this);
        this.d.setOnClickListener(new View.OnClickListener(this) { // from class: h7.a
            public final /* synthetic */ FilePickerActivity c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = i10;
                FilePickerActivity filePickerActivity = this.c;
                switch (i12) {
                    case 0:
                        String str = FilePickerActivity.f1663j;
                        filePickerActivity.setResult(0);
                        filePickerActivity.finish();
                        return;
                    case 1:
                        if (filePickerActivity.e.getParentFile() != null) {
                            filePickerActivity.v(filePickerActivity.e.getParentFile());
                            return;
                        } else {
                            y5.k.x(filePickerActivity, filePickerActivity.getString(R.string.uje_tut));
                            return;
                        }
                    default:
                        k kVar2 = filePickerActivity.f1666g;
                        if (kVar2 != null) {
                            kVar2.o(filePickerActivity);
                        }
                        ArrayList arrayList = new ArrayList();
                        try {
                            k kVar22 = filePickerActivity.f1666g;
                            if (kVar22 != null) {
                                ArrayList e = kVar22.e();
                                int size = e.size();
                                int i13 = 0;
                                while (i13 < size) {
                                    Object obj = e.get(i13);
                                    i13++;
                                    File file = (File) obj;
                                    if (FilePickerActivity.u(file) && !FilePickerActivity.s(arrayList, file)) {
                                        arrayList.add(file);
                                    }
                                }
                            }
                        } catch (Exception unused) {
                        }
                        try {
                            for (File file2 : ContextCompat.getExternalFilesDirs(filePickerActivity, null)) {
                                if (file2 != null) {
                                    String absolutePath = file2.getAbsolutePath();
                                    if (absolutePath.contains(m.h(new byte[]{23, 29, 97, 26, 19, -33, 47, -18, 23}, new byte[]{56, 110, 21, 117, 97, -66, 72, -117})) && absolutePath.contains(m.h(new byte[]{-98, 87, -53, -78, 86, 27, 126}, new byte[]{-33, 57, -81, -64, 57, 114, 26, 31}))) {
                                        File file3 = new File(absolutePath.substring(0, absolutePath.indexOf(m.h(new byte[]{90, 83, 18, -127, 6, -96, -58, 113}, new byte[]{117, 18, 124, -27, 116, -49, -81, 21}))));
                                        if (FilePickerActivity.u(file3) && !FilePickerActivity.s(arrayList, file3)) {
                                            arrayList.add(file3);
                                        }
                                    }
                                }
                            }
                        } catch (Exception unused2) {
                        }
                        try {
                            File[] listFiles = new File(m.h(new byte[]{1, 74, -73, -96, 93, -89, -104, 25, 1}, new byte[]{46, 57, -61, -49, 47, -58, -1, 124})).listFiles();
                            if (listFiles != null) {
                                for (File file4 : listFiles) {
                                    if (file4 != null && FilePickerActivity.u(file4) && !FilePickerActivity.s(arrayList, file4)) {
                                        arrayList.add(file4);
                                    }
                                }
                            }
                        } catch (Exception unused3) {
                        }
                        if (arrayList.isEmpty()) {
                            y5.k.x(filePickerActivity, filePickerActivity.getString(R.string.usb_not));
                            return;
                        }
                        String[] strArr = new String[arrayList.size()];
                        for (int i14 = 0; i14 < arrayList.size(); i14++) {
                            strArr[i14] = ((File) arrayList.get(i14)).getAbsolutePath();
                        }
                        new AlertDialog.Builder(filePickerActivity).setTitle(filePickerActivity.getString(R.string.usb_chos)).setItems(strArr, new e0(1, filePickerActivity, arrayList)).show();
                        return;
                }
            }
        });
        this.f1664b.setOnItemClickListener(new b(0, this));
        final int i12 = 2;
        ((Button) inflate.findViewById(R.id.open_usb_button)).setOnClickListener(new View.OnClickListener(this) { // from class: h7.a
            public final /* synthetic */ FilePickerActivity c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i122 = i12;
                FilePickerActivity filePickerActivity = this.c;
                switch (i122) {
                    case 0:
                        String str = FilePickerActivity.f1663j;
                        filePickerActivity.setResult(0);
                        filePickerActivity.finish();
                        return;
                    case 1:
                        if (filePickerActivity.e.getParentFile() != null) {
                            filePickerActivity.v(filePickerActivity.e.getParentFile());
                            return;
                        } else {
                            y5.k.x(filePickerActivity, filePickerActivity.getString(R.string.uje_tut));
                            return;
                        }
                    default:
                        k kVar2 = filePickerActivity.f1666g;
                        if (kVar2 != null) {
                            kVar2.o(filePickerActivity);
                        }
                        ArrayList arrayList = new ArrayList();
                        try {
                            k kVar22 = filePickerActivity.f1666g;
                            if (kVar22 != null) {
                                ArrayList e = kVar22.e();
                                int size = e.size();
                                int i13 = 0;
                                while (i13 < size) {
                                    Object obj = e.get(i13);
                                    i13++;
                                    File file = (File) obj;
                                    if (FilePickerActivity.u(file) && !FilePickerActivity.s(arrayList, file)) {
                                        arrayList.add(file);
                                    }
                                }
                            }
                        } catch (Exception unused) {
                        }
                        try {
                            for (File file2 : ContextCompat.getExternalFilesDirs(filePickerActivity, null)) {
                                if (file2 != null) {
                                    String absolutePath = file2.getAbsolutePath();
                                    if (absolutePath.contains(m.h(new byte[]{23, 29, 97, 26, 19, -33, 47, -18, 23}, new byte[]{56, 110, 21, 117, 97, -66, 72, -117})) && absolutePath.contains(m.h(new byte[]{-98, 87, -53, -78, 86, 27, 126}, new byte[]{-33, 57, -81, -64, 57, 114, 26, 31}))) {
                                        File file3 = new File(absolutePath.substring(0, absolutePath.indexOf(m.h(new byte[]{90, 83, 18, -127, 6, -96, -58, 113}, new byte[]{117, 18, 124, -27, 116, -49, -81, 21}))));
                                        if (FilePickerActivity.u(file3) && !FilePickerActivity.s(arrayList, file3)) {
                                            arrayList.add(file3);
                                        }
                                    }
                                }
                            }
                        } catch (Exception unused2) {
                        }
                        try {
                            File[] listFiles = new File(m.h(new byte[]{1, 74, -73, -96, 93, -89, -104, 25, 1}, new byte[]{46, 57, -61, -49, 47, -58, -1, 124})).listFiles();
                            if (listFiles != null) {
                                for (File file4 : listFiles) {
                                    if (file4 != null && FilePickerActivity.u(file4) && !FilePickerActivity.s(arrayList, file4)) {
                                        arrayList.add(file4);
                                    }
                                }
                            }
                        } catch (Exception unused3) {
                        }
                        if (arrayList.isEmpty()) {
                            y5.k.x(filePickerActivity, filePickerActivity.getString(R.string.usb_not));
                            return;
                        }
                        String[] strArr = new String[arrayList.size()];
                        for (int i14 = 0; i14 < arrayList.size(); i14++) {
                            strArr[i14] = ((File) arrayList.get(i14)).getAbsolutePath();
                        }
                        new AlertDialog.Builder(filePickerActivity).setTitle(filePickerActivity.getString(R.string.usb_chos)).setItems(strArr, new e0(1, filePickerActivity, arrayList)).show();
                        return;
                }
            }
        });
        v(this.e);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        k kVar = this.f1666g;
        if (kVar != null) {
            kVar.w();
        }
        super.onDestroy();
    }

    public final void v(File file) {
        this.e = file;
        this.c.setText(file.getAbsolutePath());
        File[] listFiles = this.e.listFiles();
        if (listFiles != null) {
            this.f1665f.clear();
            for (File file2 : listFiles) {
                if (file2.isDirectory() || this.f1667h == null || file2.getName().toLowerCase().endsWith(this.f1667h.toLowerCase())) {
                    this.f1665f.add(file2);
                }
            }
            Collections.sort(this.f1665f, new a(3));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f1665f;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            File file3 = (File) obj;
            if (file3.isDirectory()) {
                arrayList.add(m.h(new byte[]{-105}, new byte[]{-52, -35, -74, 95, -90, -68, 72, 119}) + getString(R.string.folder) + m.h(new byte[]{6, 13}, new byte[]{91, 45, -22, -124, 52, 56, -8, -70}) + file3.getName());
            } else {
                arrayList.add(file3.getName());
            }
        }
        this.f1664b.setAdapter((ListAdapter) new ArrayAdapter(this, R.layout.file_picker_item, arrayList));
    }
}
