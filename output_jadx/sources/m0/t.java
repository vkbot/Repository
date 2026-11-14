package m0;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.example.navistart.R;
import e0.p3;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class t extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f3857a;

    public t(v vVar) {
        this.f3857a = vVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f3857a.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        int i11;
        String string;
        int i12;
        s sVar = (s) viewHolder;
        v vVar = this.f3857a;
        final u uVar = (u) vVar.c.get(i10);
        ImageView imageView = sVar.f3850a;
        ImageButton imageButton = sVar.f3852f;
        Button button = sVar.e;
        Button button2 = sVar.d;
        imageView.setImageDrawable(uVar.f3866h);
        sVar.f3851b.setText(uVar.f3862a);
        TextView textView = sVar.c;
        ArrayList arrayList = new ArrayList();
        if (uVar.f3864f) {
            if (TextUtils.isEmpty(uVar.f3865g)) {
                arrayList.add(vVar.getString(R.string.app_store_installed));
            } else {
                arrayList.add(vVar.getString(R.string.app_store_installed_version, uVar.f3865g));
            }
        } else {
            arrayList.add(vVar.getString(R.string.app_store_not_installed));
        }
        if (!TextUtils.isEmpty(uVar.e)) {
            arrayList.add(uVar.e);
        }
        if (!TextUtils.isEmpty(uVar.d)) {
            arrayList.add(uVar.d);
        }
        int i13 = 8;
        textView.setText(TextUtils.join(e0.m.h(new byte[]{-86, -88, 101, -32, 15}, new byte[]{-118, -120, 25, -64, 47, -77, -120, -93}), arrayList));
        final int i14 = 0;
        if (uVar.f3864f && !uVar.f3867i) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        button2.setVisibility(i11);
        if (uVar.f3864f) {
            string = vVar.getString(R.string.app_store_reinstall);
        } else {
            string = vVar.getString(R.string.download);
        }
        button2.setText(string);
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: m0.r
            public final /* synthetic */ t c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Boolean bool;
                boolean z9;
                int i15 = i14;
                u uVar2 = uVar;
                t tVar = this.c;
                switch (i15) {
                    case 0:
                        v vVar2 = tVar.f3857a;
                        String str = v.f3873h;
                        if ((vVar2.requireActivity() instanceof AppCompatActivity) && !TextUtils.isEmpty(uVar2.c)) {
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
                                if (com.google.protobuf.q.d(Long.MAX_VALUE, h0.b.a().j()) < Long.parseLong(new String(com.google.protobuf.q.x(new byte[]{-7}, new byte[]{-55, -23, 84, 108, 22, -121, -121, -5}, h0.b.o(), com.google.protobuf.q.h(e0.m.f1970g, h0.b.o(), new String(bArr2)), 0)))) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                bool = Boolean.valueOf(z9);
                            } else {
                                bool = Boolean.FALSE;
                            }
                            if (bool.booleanValue()) {
                                AppCompatActivity appCompatActivity = (AppCompatActivity) vVar2.requireActivity();
                                String str2 = uVar2.c;
                                String str3 = uVar2.f3863b;
                                if (TextUtils.isEmpty(str3)) {
                                    str3 = uVar2.f3862a;
                                }
                                if (TextUtils.isEmpty(str3)) {
                                    str3 = e0.m.h(new byte[]{-119, 88, 64, -119, 116, 69, -106, 30, -118}, new byte[]{-6, 44, 47, -5, 17, 26, -9, 110});
                                }
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(str3.toLowerCase(Locale.ROOT).replaceAll(e0.m.h(new byte[]{122, -48, -85, 42, 83, -107, 74, 20, 15, -47, -25, 90}, new byte[]{33, -114, -54, 7, 41, -91, 103, 45}), e0.m.h(new byte[]{32}, new byte[]{ByteCompanionObject.MAX_VALUE, 27, 9, 89, 34, -97, -9, 87})));
                                new e0.y2(appCompatActivity, str2, com.google.protobuf.q.i(new byte[]{33, 82, -98, -41}, new byte[]{15, 51, -18, -68, 4, 118, 119, -39}, sb2));
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        v.t(tVar.f3857a, uVar2);
                        return;
                    case 2:
                        v vVar3 = tVar.f3857a;
                        String str4 = v.f3873h;
                        if (uVar2.f3864f && !TextUtils.isEmpty(uVar2.f3863b)) {
                            new AlertDialog.Builder(vVar3.requireContext(), R.style.ThemeOverlay_JCarTools_ModernAlert).setTitle(vVar3.getString(R.string.delapp)).setMessage(vVar3.getString(R.string.delapp2) + e0.m.h(new byte[]{49, -102}, new byte[]{17, -72, 4, -30, 20, 85, 23, -78}) + uVar2.f3862a + e0.m.h(new byte[]{-39, 28, -36}, new byte[]{-5, 60, -29, 124, 119, -67, -45, -102})).setPositiveButton(vVar3.getString(R.string.ok), new e0.e0(2, vVar3, uVar2)).setNegativeButton(vVar3.getString(R.string.cancel), (DialogInterface.OnClickListener) null).show();
                            return;
                        }
                        return;
                    default:
                        if (uVar2.f3864f) {
                            v.t(tVar.f3857a, uVar2);
                            return;
                        }
                        return;
                }
            }
        });
        if (uVar.f3864f) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        button.setVisibility(i12);
        final int i15 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: m0.r
            public final /* synthetic */ t c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Boolean bool;
                boolean z9;
                int i152 = i15;
                u uVar2 = uVar;
                t tVar = this.c;
                switch (i152) {
                    case 0:
                        v vVar2 = tVar.f3857a;
                        String str = v.f3873h;
                        if ((vVar2.requireActivity() instanceof AppCompatActivity) && !TextUtils.isEmpty(uVar2.c)) {
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
                                if (com.google.protobuf.q.d(Long.MAX_VALUE, h0.b.a().j()) < Long.parseLong(new String(com.google.protobuf.q.x(new byte[]{-7}, new byte[]{-55, -23, 84, 108, 22, -121, -121, -5}, h0.b.o(), com.google.protobuf.q.h(e0.m.f1970g, h0.b.o(), new String(bArr2)), 0)))) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                bool = Boolean.valueOf(z9);
                            } else {
                                bool = Boolean.FALSE;
                            }
                            if (bool.booleanValue()) {
                                AppCompatActivity appCompatActivity = (AppCompatActivity) vVar2.requireActivity();
                                String str2 = uVar2.c;
                                String str3 = uVar2.f3863b;
                                if (TextUtils.isEmpty(str3)) {
                                    str3 = uVar2.f3862a;
                                }
                                if (TextUtils.isEmpty(str3)) {
                                    str3 = e0.m.h(new byte[]{-119, 88, 64, -119, 116, 69, -106, 30, -118}, new byte[]{-6, 44, 47, -5, 17, 26, -9, 110});
                                }
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(str3.toLowerCase(Locale.ROOT).replaceAll(e0.m.h(new byte[]{122, -48, -85, 42, 83, -107, 74, 20, 15, -47, -25, 90}, new byte[]{33, -114, -54, 7, 41, -91, 103, 45}), e0.m.h(new byte[]{32}, new byte[]{ByteCompanionObject.MAX_VALUE, 27, 9, 89, 34, -97, -9, 87})));
                                new e0.y2(appCompatActivity, str2, com.google.protobuf.q.i(new byte[]{33, 82, -98, -41}, new byte[]{15, 51, -18, -68, 4, 118, 119, -39}, sb2));
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        v.t(tVar.f3857a, uVar2);
                        return;
                    case 2:
                        v vVar3 = tVar.f3857a;
                        String str4 = v.f3873h;
                        if (uVar2.f3864f && !TextUtils.isEmpty(uVar2.f3863b)) {
                            new AlertDialog.Builder(vVar3.requireContext(), R.style.ThemeOverlay_JCarTools_ModernAlert).setTitle(vVar3.getString(R.string.delapp)).setMessage(vVar3.getString(R.string.delapp2) + e0.m.h(new byte[]{49, -102}, new byte[]{17, -72, 4, -30, 20, 85, 23, -78}) + uVar2.f3862a + e0.m.h(new byte[]{-39, 28, -36}, new byte[]{-5, 60, -29, 124, 119, -67, -45, -102})).setPositiveButton(vVar3.getString(R.string.ok), new e0.e0(2, vVar3, uVar2)).setNegativeButton(vVar3.getString(R.string.cancel), (DialogInterface.OnClickListener) null).show();
                            return;
                        }
                        return;
                    default:
                        if (uVar2.f3864f) {
                            v.t(tVar.f3857a, uVar2);
                            return;
                        }
                        return;
                }
            }
        });
        if (uVar.f3864f) {
            i13 = 0;
        }
        imageButton.setVisibility(i13);
        final int i16 = 2;
        imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: m0.r
            public final /* synthetic */ t c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Boolean bool;
                boolean z9;
                int i152 = i16;
                u uVar2 = uVar;
                t tVar = this.c;
                switch (i152) {
                    case 0:
                        v vVar2 = tVar.f3857a;
                        String str = v.f3873h;
                        if ((vVar2.requireActivity() instanceof AppCompatActivity) && !TextUtils.isEmpty(uVar2.c)) {
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
                                if (com.google.protobuf.q.d(Long.MAX_VALUE, h0.b.a().j()) < Long.parseLong(new String(com.google.protobuf.q.x(new byte[]{-7}, new byte[]{-55, -23, 84, 108, 22, -121, -121, -5}, h0.b.o(), com.google.protobuf.q.h(e0.m.f1970g, h0.b.o(), new String(bArr2)), 0)))) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                bool = Boolean.valueOf(z9);
                            } else {
                                bool = Boolean.FALSE;
                            }
                            if (bool.booleanValue()) {
                                AppCompatActivity appCompatActivity = (AppCompatActivity) vVar2.requireActivity();
                                String str2 = uVar2.c;
                                String str3 = uVar2.f3863b;
                                if (TextUtils.isEmpty(str3)) {
                                    str3 = uVar2.f3862a;
                                }
                                if (TextUtils.isEmpty(str3)) {
                                    str3 = e0.m.h(new byte[]{-119, 88, 64, -119, 116, 69, -106, 30, -118}, new byte[]{-6, 44, 47, -5, 17, 26, -9, 110});
                                }
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(str3.toLowerCase(Locale.ROOT).replaceAll(e0.m.h(new byte[]{122, -48, -85, 42, 83, -107, 74, 20, 15, -47, -25, 90}, new byte[]{33, -114, -54, 7, 41, -91, 103, 45}), e0.m.h(new byte[]{32}, new byte[]{ByteCompanionObject.MAX_VALUE, 27, 9, 89, 34, -97, -9, 87})));
                                new e0.y2(appCompatActivity, str2, com.google.protobuf.q.i(new byte[]{33, 82, -98, -41}, new byte[]{15, 51, -18, -68, 4, 118, 119, -39}, sb2));
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        v.t(tVar.f3857a, uVar2);
                        return;
                    case 2:
                        v vVar3 = tVar.f3857a;
                        String str4 = v.f3873h;
                        if (uVar2.f3864f && !TextUtils.isEmpty(uVar2.f3863b)) {
                            new AlertDialog.Builder(vVar3.requireContext(), R.style.ThemeOverlay_JCarTools_ModernAlert).setTitle(vVar3.getString(R.string.delapp)).setMessage(vVar3.getString(R.string.delapp2) + e0.m.h(new byte[]{49, -102}, new byte[]{17, -72, 4, -30, 20, 85, 23, -78}) + uVar2.f3862a + e0.m.h(new byte[]{-39, 28, -36}, new byte[]{-5, 60, -29, 124, 119, -67, -45, -102})).setPositiveButton(vVar3.getString(R.string.ok), new e0.e0(2, vVar3, uVar2)).setNegativeButton(vVar3.getString(R.string.cancel), (DialogInterface.OnClickListener) null).show();
                            return;
                        }
                        return;
                    default:
                        if (uVar2.f3864f) {
                            v.t(tVar.f3857a, uVar2);
                            return;
                        }
                        return;
                }
            }
        });
        final int i17 = 3;
        sVar.itemView.setOnClickListener(new View.OnClickListener(this) { // from class: m0.r
            public final /* synthetic */ t c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Boolean bool;
                boolean z9;
                int i152 = i17;
                u uVar2 = uVar;
                t tVar = this.c;
                switch (i152) {
                    case 0:
                        v vVar2 = tVar.f3857a;
                        String str = v.f3873h;
                        if ((vVar2.requireActivity() instanceof AppCompatActivity) && !TextUtils.isEmpty(uVar2.c)) {
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
                                if (com.google.protobuf.q.d(Long.MAX_VALUE, h0.b.a().j()) < Long.parseLong(new String(com.google.protobuf.q.x(new byte[]{-7}, new byte[]{-55, -23, 84, 108, 22, -121, -121, -5}, h0.b.o(), com.google.protobuf.q.h(e0.m.f1970g, h0.b.o(), new String(bArr2)), 0)))) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                bool = Boolean.valueOf(z9);
                            } else {
                                bool = Boolean.FALSE;
                            }
                            if (bool.booleanValue()) {
                                AppCompatActivity appCompatActivity = (AppCompatActivity) vVar2.requireActivity();
                                String str2 = uVar2.c;
                                String str3 = uVar2.f3863b;
                                if (TextUtils.isEmpty(str3)) {
                                    str3 = uVar2.f3862a;
                                }
                                if (TextUtils.isEmpty(str3)) {
                                    str3 = e0.m.h(new byte[]{-119, 88, 64, -119, 116, 69, -106, 30, -118}, new byte[]{-6, 44, 47, -5, 17, 26, -9, 110});
                                }
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(str3.toLowerCase(Locale.ROOT).replaceAll(e0.m.h(new byte[]{122, -48, -85, 42, 83, -107, 74, 20, 15, -47, -25, 90}, new byte[]{33, -114, -54, 7, 41, -91, 103, 45}), e0.m.h(new byte[]{32}, new byte[]{ByteCompanionObject.MAX_VALUE, 27, 9, 89, 34, -97, -9, 87})));
                                new e0.y2(appCompatActivity, str2, com.google.protobuf.q.i(new byte[]{33, 82, -98, -41}, new byte[]{15, 51, -18, -68, 4, 118, 119, -39}, sb2));
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        v.t(tVar.f3857a, uVar2);
                        return;
                    case 2:
                        v vVar3 = tVar.f3857a;
                        String str4 = v.f3873h;
                        if (uVar2.f3864f && !TextUtils.isEmpty(uVar2.f3863b)) {
                            new AlertDialog.Builder(vVar3.requireContext(), R.style.ThemeOverlay_JCarTools_ModernAlert).setTitle(vVar3.getString(R.string.delapp)).setMessage(vVar3.getString(R.string.delapp2) + e0.m.h(new byte[]{49, -102}, new byte[]{17, -72, 4, -30, 20, 85, 23, -78}) + uVar2.f3862a + e0.m.h(new byte[]{-39, 28, -36}, new byte[]{-5, 60, -29, 124, 119, -67, -45, -102})).setPositiveButton(vVar3.getString(R.string.ok), new e0.e0(2, vVar3, uVar2)).setNegativeButton(vVar3.getString(R.string.cancel), (DialogInterface.OnClickListener) null).show();
                            return;
                        }
                        return;
                    default:
                        if (uVar2.f3864f) {
                            v.t(tVar.f3857a, uVar2);
                            return;
                        }
                        return;
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new s(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_store_app, viewGroup, false));
    }
}
