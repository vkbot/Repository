package com.example.navistart;

import a4.g;
import android.app.UiModeManager;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import b1.h;
import com.example.navistart.SpeedBoardActi;
import com.example.navistart.cores.HUDMassageObj;
import com.google.protobuf.q;
import e0.m;
import e0.p3;
import e0.w;
import e0.x1;
import h0.b;
import h0.c;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import u0.a;
import v0.e;
import v1.d;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class SpeedBoardActi extends AppCompatActivity implements c {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f884f = 0;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f885b = w.c(-1, m.h(new byte[]{-65, -78, 87, 110, 119, -32, 23, -41, -98, -90, 115, 104, 103, -53}, new byte[]{-20, -62, 50, 11, 19, -94, 120, -74}));
    public g c;
    public ScheduledFuture d;
    public Fragment e;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Fragment hVar;
        super.onCreate(bundle);
        BlackActivity.t(this);
        setContentView(R.layout.speedboard3);
        b.a();
        if (m.h(new byte[]{42, 28, 110, -96, -95, -95, 125}, new byte[]{78, 121, 8, -63, -44, -51, 9, 29}).equals(b.o().loadString(m.h(new byte[]{114, -106, -26, -104, ByteCompanionObject.MIN_VALUE, -68, -65, 32, 96, -121, -37, -76, -110, -71, -66, 36, 113, -106, -32}, new byte[]{5, -13, -124, -57, -9, -43, -37, 71}), m.h(new byte[]{-103, 101, 106, 31, -55, -6, 101}, new byte[]{-3, 0, 12, 126, -68, -106, 17, 79})))) {
            hVar = new e();
        } else {
            hVar = new h();
        }
        getSupportFragmentManager().beginTransaction().replace(R.id.speedView, hVar, m.h(new byte[]{41, 6, 81, 29, -13, -98, -72, 48, 59, 4, 80}, new byte[]{122, 86, 20, 88, -73, -63, -6, ByteCompanionObject.MAX_VALUE})).commit();
        this.e = hVar;
        final int i10 = 0;
        d.a().d().f5923a.observe(this, new Observer(this) { // from class: e0.q2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SpeedBoardActi f2009b;

            {
                this.f2009b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [v0.g, androidx.fragment.app.Fragment] */
            /* JADX WARN: Type inference failed for: r0v2, types: [v0.g, androidx.fragment.app.Fragment] */
            /* JADX WARN: Type inference failed for: r0v4, types: [v0.g, androidx.fragment.app.Fragment] */
            /* JADX WARN: Type inference failed for: r0v8, types: [v0.g, androidx.fragment.app.Fragment] */
            /* JADX WARN: Type inference failed for: r0v9, types: [v0.g, androidx.fragment.app.Fragment] */
            /* JADX WARN: Type inference failed for: r1v1, types: [v0.g, androidx.fragment.app.Fragment] */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i11 = i10;
                SpeedBoardActi speedBoardActi = this.f2009b;
                switch (i11) {
                    case 0:
                        Integer num = (Integer) obj;
                        int i12 = SpeedBoardActi.f884f;
                        if (num != null) {
                            int intValue = num.intValue();
                            ?? r02 = speedBoardActi.e;
                            if (r02 != 0) {
                                r02.d(intValue);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        Integer num2 = (Integer) obj;
                        int i13 = SpeedBoardActi.f884f;
                        if (num2 != null) {
                            int intValue2 = num2.intValue();
                            ?? r03 = speedBoardActi.e;
                            if (r03 != 0) {
                                r03.l(intValue2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        k7.b bVar = (k7.b) obj;
                        int i14 = SpeedBoardActi.f884f;
                        if (bVar != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(bVar.f3426b);
                            String i15 = com.google.protobuf.q.i(new byte[]{-12, -10}, new byte[]{54, 70, 44, -35, -62, -39, 70, -73}, sb);
                            int i16 = bVar.d;
                            ?? r1 = speedBoardActi.e;
                            if (r1 != 0) {
                                r1.g(i16, i15);
                                return;
                            }
                            return;
                        }
                        return;
                    case 3:
                        HUDMassageObj hUDMassageObj = (HUDMassageObj) obj;
                        if (hUDMassageObj != null) {
                            ?? r04 = speedBoardActi.e;
                            if (r04 != 0) {
                                r04.o(hUDMassageObj);
                                return;
                            }
                            return;
                        }
                        int i17 = SpeedBoardActi.f884f;
                        return;
                    case 4:
                        String str = (String) obj;
                        if (str != null) {
                            ?? r05 = speedBoardActi.e;
                            if (r05 != 0) {
                                r05.f(str);
                                return;
                            }
                            return;
                        }
                        int i18 = SpeedBoardActi.f884f;
                        return;
                    default:
                        s0.a aVar = (s0.a) obj;
                        if (aVar != null) {
                            ?? r06 = speedBoardActi.e;
                            if (r06 != 0) {
                                r06.k(aVar);
                                return;
                            }
                            return;
                        }
                        int i19 = SpeedBoardActi.f884f;
                        return;
                }
            }
        });
        final int i11 = 1;
        d.a().d().f5924b.observe(this, new Observer(this) { // from class: e0.q2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SpeedBoardActi f2009b;

            {
                this.f2009b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [v0.g, androidx.fragment.app.Fragment] */
            /* JADX WARN: Type inference failed for: r0v2, types: [v0.g, androidx.fragment.app.Fragment] */
            /* JADX WARN: Type inference failed for: r0v4, types: [v0.g, androidx.fragment.app.Fragment] */
            /* JADX WARN: Type inference failed for: r0v8, types: [v0.g, androidx.fragment.app.Fragment] */
            /* JADX WARN: Type inference failed for: r0v9, types: [v0.g, androidx.fragment.app.Fragment] */
            /* JADX WARN: Type inference failed for: r1v1, types: [v0.g, androidx.fragment.app.Fragment] */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i112 = i11;
                SpeedBoardActi speedBoardActi = this.f2009b;
                switch (i112) {
                    case 0:
                        Integer num = (Integer) obj;
                        int i12 = SpeedBoardActi.f884f;
                        if (num != null) {
                            int intValue = num.intValue();
                            ?? r02 = speedBoardActi.e;
                            if (r02 != 0) {
                                r02.d(intValue);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        Integer num2 = (Integer) obj;
                        int i13 = SpeedBoardActi.f884f;
                        if (num2 != null) {
                            int intValue2 = num2.intValue();
                            ?? r03 = speedBoardActi.e;
                            if (r03 != 0) {
                                r03.l(intValue2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        k7.b bVar = (k7.b) obj;
                        int i14 = SpeedBoardActi.f884f;
                        if (bVar != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(bVar.f3426b);
                            String i15 = com.google.protobuf.q.i(new byte[]{-12, -10}, new byte[]{54, 70, 44, -35, -62, -39, 70, -73}, sb);
                            int i16 = bVar.d;
                            ?? r1 = speedBoardActi.e;
                            if (r1 != 0) {
                                r1.g(i16, i15);
                                return;
                            }
                            return;
                        }
                        return;
                    case 3:
                        HUDMassageObj hUDMassageObj = (HUDMassageObj) obj;
                        if (hUDMassageObj != null) {
                            ?? r04 = speedBoardActi.e;
                            if (r04 != 0) {
                                r04.o(hUDMassageObj);
                                return;
                            }
                            return;
                        }
                        int i17 = SpeedBoardActi.f884f;
                        return;
                    case 4:
                        String str = (String) obj;
                        if (str != null) {
                            ?? r05 = speedBoardActi.e;
                            if (r05 != 0) {
                                r05.f(str);
                                return;
                            }
                            return;
                        }
                        int i18 = SpeedBoardActi.f884f;
                        return;
                    default:
                        s0.a aVar = (s0.a) obj;
                        if (aVar != null) {
                            ?? r06 = speedBoardActi.e;
                            if (r06 != 0) {
                                r06.k(aVar);
                                return;
                            }
                            return;
                        }
                        int i19 = SpeedBoardActi.f884f;
                        return;
                }
            }
        });
        final int i12 = 2;
        d.a().d().c.observe(this, new Observer(this) { // from class: e0.q2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SpeedBoardActi f2009b;

            {
                this.f2009b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [v0.g, androidx.fragment.app.Fragment] */
            /* JADX WARN: Type inference failed for: r0v2, types: [v0.g, androidx.fragment.app.Fragment] */
            /* JADX WARN: Type inference failed for: r0v4, types: [v0.g, androidx.fragment.app.Fragment] */
            /* JADX WARN: Type inference failed for: r0v8, types: [v0.g, androidx.fragment.app.Fragment] */
            /* JADX WARN: Type inference failed for: r0v9, types: [v0.g, androidx.fragment.app.Fragment] */
            /* JADX WARN: Type inference failed for: r1v1, types: [v0.g, androidx.fragment.app.Fragment] */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i112 = i12;
                SpeedBoardActi speedBoardActi = this.f2009b;
                switch (i112) {
                    case 0:
                        Integer num = (Integer) obj;
                        int i122 = SpeedBoardActi.f884f;
                        if (num != null) {
                            int intValue = num.intValue();
                            ?? r02 = speedBoardActi.e;
                            if (r02 != 0) {
                                r02.d(intValue);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        Integer num2 = (Integer) obj;
                        int i13 = SpeedBoardActi.f884f;
                        if (num2 != null) {
                            int intValue2 = num2.intValue();
                            ?? r03 = speedBoardActi.e;
                            if (r03 != 0) {
                                r03.l(intValue2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        k7.b bVar = (k7.b) obj;
                        int i14 = SpeedBoardActi.f884f;
                        if (bVar != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(bVar.f3426b);
                            String i15 = com.google.protobuf.q.i(new byte[]{-12, -10}, new byte[]{54, 70, 44, -35, -62, -39, 70, -73}, sb);
                            int i16 = bVar.d;
                            ?? r1 = speedBoardActi.e;
                            if (r1 != 0) {
                                r1.g(i16, i15);
                                return;
                            }
                            return;
                        }
                        return;
                    case 3:
                        HUDMassageObj hUDMassageObj = (HUDMassageObj) obj;
                        if (hUDMassageObj != null) {
                            ?? r04 = speedBoardActi.e;
                            if (r04 != 0) {
                                r04.o(hUDMassageObj);
                                return;
                            }
                            return;
                        }
                        int i17 = SpeedBoardActi.f884f;
                        return;
                    case 4:
                        String str = (String) obj;
                        if (str != null) {
                            ?? r05 = speedBoardActi.e;
                            if (r05 != 0) {
                                r05.f(str);
                                return;
                            }
                            return;
                        }
                        int i18 = SpeedBoardActi.f884f;
                        return;
                    default:
                        s0.a aVar = (s0.a) obj;
                        if (aVar != null) {
                            ?? r06 = speedBoardActi.e;
                            if (r06 != 0) {
                                r06.k(aVar);
                                return;
                            }
                            return;
                        }
                        int i19 = SpeedBoardActi.f884f;
                        return;
                }
            }
        });
        final int i13 = 3;
        d.a().d().d.observe(this, new Observer(this) { // from class: e0.q2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SpeedBoardActi f2009b;

            {
                this.f2009b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [v0.g, androidx.fragment.app.Fragment] */
            /* JADX WARN: Type inference failed for: r0v2, types: [v0.g, androidx.fragment.app.Fragment] */
            /* JADX WARN: Type inference failed for: r0v4, types: [v0.g, androidx.fragment.app.Fragment] */
            /* JADX WARN: Type inference failed for: r0v8, types: [v0.g, androidx.fragment.app.Fragment] */
            /* JADX WARN: Type inference failed for: r0v9, types: [v0.g, androidx.fragment.app.Fragment] */
            /* JADX WARN: Type inference failed for: r1v1, types: [v0.g, androidx.fragment.app.Fragment] */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i112 = i13;
                SpeedBoardActi speedBoardActi = this.f2009b;
                switch (i112) {
                    case 0:
                        Integer num = (Integer) obj;
                        int i122 = SpeedBoardActi.f884f;
                        if (num != null) {
                            int intValue = num.intValue();
                            ?? r02 = speedBoardActi.e;
                            if (r02 != 0) {
                                r02.d(intValue);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        Integer num2 = (Integer) obj;
                        int i132 = SpeedBoardActi.f884f;
                        if (num2 != null) {
                            int intValue2 = num2.intValue();
                            ?? r03 = speedBoardActi.e;
                            if (r03 != 0) {
                                r03.l(intValue2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        k7.b bVar = (k7.b) obj;
                        int i14 = SpeedBoardActi.f884f;
                        if (bVar != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(bVar.f3426b);
                            String i15 = com.google.protobuf.q.i(new byte[]{-12, -10}, new byte[]{54, 70, 44, -35, -62, -39, 70, -73}, sb);
                            int i16 = bVar.d;
                            ?? r1 = speedBoardActi.e;
                            if (r1 != 0) {
                                r1.g(i16, i15);
                                return;
                            }
                            return;
                        }
                        return;
                    case 3:
                        HUDMassageObj hUDMassageObj = (HUDMassageObj) obj;
                        if (hUDMassageObj != null) {
                            ?? r04 = speedBoardActi.e;
                            if (r04 != 0) {
                                r04.o(hUDMassageObj);
                                return;
                            }
                            return;
                        }
                        int i17 = SpeedBoardActi.f884f;
                        return;
                    case 4:
                        String str = (String) obj;
                        if (str != null) {
                            ?? r05 = speedBoardActi.e;
                            if (r05 != 0) {
                                r05.f(str);
                                return;
                            }
                            return;
                        }
                        int i18 = SpeedBoardActi.f884f;
                        return;
                    default:
                        s0.a aVar = (s0.a) obj;
                        if (aVar != null) {
                            ?? r06 = speedBoardActi.e;
                            if (r06 != 0) {
                                r06.k(aVar);
                                return;
                            }
                            return;
                        }
                        int i19 = SpeedBoardActi.f884f;
                        return;
                }
            }
        });
        final int i14 = 4;
        d.a().d().e.observe(this, new Observer(this) { // from class: e0.q2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SpeedBoardActi f2009b;

            {
                this.f2009b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [v0.g, androidx.fragment.app.Fragment] */
            /* JADX WARN: Type inference failed for: r0v2, types: [v0.g, androidx.fragment.app.Fragment] */
            /* JADX WARN: Type inference failed for: r0v4, types: [v0.g, androidx.fragment.app.Fragment] */
            /* JADX WARN: Type inference failed for: r0v8, types: [v0.g, androidx.fragment.app.Fragment] */
            /* JADX WARN: Type inference failed for: r0v9, types: [v0.g, androidx.fragment.app.Fragment] */
            /* JADX WARN: Type inference failed for: r1v1, types: [v0.g, androidx.fragment.app.Fragment] */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i112 = i14;
                SpeedBoardActi speedBoardActi = this.f2009b;
                switch (i112) {
                    case 0:
                        Integer num = (Integer) obj;
                        int i122 = SpeedBoardActi.f884f;
                        if (num != null) {
                            int intValue = num.intValue();
                            ?? r02 = speedBoardActi.e;
                            if (r02 != 0) {
                                r02.d(intValue);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        Integer num2 = (Integer) obj;
                        int i132 = SpeedBoardActi.f884f;
                        if (num2 != null) {
                            int intValue2 = num2.intValue();
                            ?? r03 = speedBoardActi.e;
                            if (r03 != 0) {
                                r03.l(intValue2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        k7.b bVar = (k7.b) obj;
                        int i142 = SpeedBoardActi.f884f;
                        if (bVar != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(bVar.f3426b);
                            String i15 = com.google.protobuf.q.i(new byte[]{-12, -10}, new byte[]{54, 70, 44, -35, -62, -39, 70, -73}, sb);
                            int i16 = bVar.d;
                            ?? r1 = speedBoardActi.e;
                            if (r1 != 0) {
                                r1.g(i16, i15);
                                return;
                            }
                            return;
                        }
                        return;
                    case 3:
                        HUDMassageObj hUDMassageObj = (HUDMassageObj) obj;
                        if (hUDMassageObj != null) {
                            ?? r04 = speedBoardActi.e;
                            if (r04 != 0) {
                                r04.o(hUDMassageObj);
                                return;
                            }
                            return;
                        }
                        int i17 = SpeedBoardActi.f884f;
                        return;
                    case 4:
                        String str = (String) obj;
                        if (str != null) {
                            ?? r05 = speedBoardActi.e;
                            if (r05 != 0) {
                                r05.f(str);
                                return;
                            }
                            return;
                        }
                        int i18 = SpeedBoardActi.f884f;
                        return;
                    default:
                        s0.a aVar = (s0.a) obj;
                        if (aVar != null) {
                            ?? r06 = speedBoardActi.e;
                            if (r06 != 0) {
                                r06.k(aVar);
                                return;
                            }
                            return;
                        }
                        int i19 = SpeedBoardActi.f884f;
                        return;
                }
            }
        });
        final int i15 = 5;
        d.a().d().f5925f.observe(this, new Observer(this) { // from class: e0.q2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SpeedBoardActi f2009b;

            {
                this.f2009b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [v0.g, androidx.fragment.app.Fragment] */
            /* JADX WARN: Type inference failed for: r0v2, types: [v0.g, androidx.fragment.app.Fragment] */
            /* JADX WARN: Type inference failed for: r0v4, types: [v0.g, androidx.fragment.app.Fragment] */
            /* JADX WARN: Type inference failed for: r0v8, types: [v0.g, androidx.fragment.app.Fragment] */
            /* JADX WARN: Type inference failed for: r0v9, types: [v0.g, androidx.fragment.app.Fragment] */
            /* JADX WARN: Type inference failed for: r1v1, types: [v0.g, androidx.fragment.app.Fragment] */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i112 = i15;
                SpeedBoardActi speedBoardActi = this.f2009b;
                switch (i112) {
                    case 0:
                        Integer num = (Integer) obj;
                        int i122 = SpeedBoardActi.f884f;
                        if (num != null) {
                            int intValue = num.intValue();
                            ?? r02 = speedBoardActi.e;
                            if (r02 != 0) {
                                r02.d(intValue);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        Integer num2 = (Integer) obj;
                        int i132 = SpeedBoardActi.f884f;
                        if (num2 != null) {
                            int intValue2 = num2.intValue();
                            ?? r03 = speedBoardActi.e;
                            if (r03 != 0) {
                                r03.l(intValue2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        k7.b bVar = (k7.b) obj;
                        int i142 = SpeedBoardActi.f884f;
                        if (bVar != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(bVar.f3426b);
                            String i152 = com.google.protobuf.q.i(new byte[]{-12, -10}, new byte[]{54, 70, 44, -35, -62, -39, 70, -73}, sb);
                            int i16 = bVar.d;
                            ?? r1 = speedBoardActi.e;
                            if (r1 != 0) {
                                r1.g(i16, i152);
                                return;
                            }
                            return;
                        }
                        return;
                    case 3:
                        HUDMassageObj hUDMassageObj = (HUDMassageObj) obj;
                        if (hUDMassageObj != null) {
                            ?? r04 = speedBoardActi.e;
                            if (r04 != 0) {
                                r04.o(hUDMassageObj);
                                return;
                            }
                            return;
                        }
                        int i17 = SpeedBoardActi.f884f;
                        return;
                    case 4:
                        String str = (String) obj;
                        if (str != null) {
                            ?? r05 = speedBoardActi.e;
                            if (r05 != 0) {
                                r05.f(str);
                                return;
                            }
                            return;
                        }
                        int i18 = SpeedBoardActi.f884f;
                        return;
                    default:
                        s0.a aVar = (s0.a) obj;
                        if (aVar != null) {
                            ?? r06 = speedBoardActi.e;
                            if (r06 != 0) {
                                r06.k(aVar);
                                return;
                            }
                            return;
                        }
                        int i19 = SpeedBoardActi.f884f;
                        return;
                }
            }
        });
        this.c = new g(18, this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        s();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [v0.g, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v10, types: [v0.g, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v14, types: [v0.g, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v18, types: [v0.g, androidx.fragment.app.Fragment] */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.e.q();
        int nightMode = ((UiModeManager) getSystemService(m.h(new byte[]{111, 12, 123, -69, -7, 64}, new byte[]{26, 101, 22, -44, -99, 37, -118, 6}))).getNightMode();
        if (nightMode != 0) {
            if (nightMode != 1) {
                if (nightMode != 2) {
                    b.v(m.h(new byte[]{59, -29, 8, -104, -79, -74, 70, -16, 9, -62, 75, 8, 65, -59, 23, -107, 97, -81, 26, 105, -29, -60, 35, -107, 101, -81, 16, -104, -79, -87, 70, -16, -7, -82, 37, 104, -34, -59, 22, -107, 108, -82, 47, 104, -44, -60, 45, -107, 108, -82, 38, 104, -47}, new byte[]{-39, 126, -101, -72, 97, 20, -106, 69}));
                } else {
                    b.v(m.h(new byte[]{41, -67, -117, -119, -34, 13, 31, -60, 8, -93, -41, -94, 47, 92, 92, 102, 9, -105, -41, -90, 46, 104, -83, 52, 107, -14, -67, -54, 69, 12, 3, 53, 94, -14, -78, -54, 67, 13, Base64.padSymbol, -60, 8, -96, -42, -117, 46, 97, 93, 89, 9, -110, -42, -107, -34, 12, 15, 52, 108, -14, -69, -54, 78}, new byte[]{-39, 34, 7, 26, -2, -35, -115, -28}));
                    ?? r02 = this.e;
                    if (r02 != 0) {
                        r02.r();
                    }
                }
            } else {
                b.v(m.h(new byte[]{107, -115, 120, 120, -52, 113, 57, -6, 74, -109, 36, 94, Base64.padSymbol, 32, 122, 88, 75, -89, 36, 90, 60, 20, -117, 10, 41, -62, 78, 54, 87, 112, 37, 11, 28, -62, 65, 54, 81, 113, 27, -6, 74, -109, 36, 84, 60, 20, 122, 88, 75, -87, 36, 86, Base64.padSymbol, 46, -117, 11, 25, -62, 65, 54, 80, 113, 27}, new byte[]{-101, 18, -12, -26, -20, -95, -85, -38}));
                ?? r03 = this.e;
                if (r03 != 0) {
                    r03.h();
                }
            }
        } else {
            b.v(m.h(new byte[]{-91, -9, -100, -1, -123, 2, -78, -127, -106, -7, -3, 93, -123, 22, -78, -123, -105, -59, -4, 111, -124, 44, 66, -24, -59, -88, -103, 15, -23, 115, -46, 25, -105, -57, -4, 106, -124, 35, -78, -116, -105, -62, -4, 100, -124, 45, -77, -66, -105, -56, -4, 106, -124, 33, -77, -72, -106, -9, 12, 15, -27, 115, -48, -24, -59, -88, -110, 15, -23, 115, -46, -24, -59, -88, -108, 14, -46, 115, -41, -24, -58, -88, -106, 15, -19}, new byte[]{71, 120, 44, -33, 85, -93, 98, 57}));
        }
        this.e.a();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        Boolean bool;
        super.onStart();
        b.f2544q = this;
        StringBuilder sb = new StringBuilder();
        a o5 = b.o();
        byte[] bArr = m.f1973j;
        String[] strArr = p3.f2001a;
        q.s(bArr, o5, "", sb);
        q.r(new byte[]{108, 105, 99, 116, 95, 114, 105, 117, 101}, sb);
        String g10 = q.g(sb, x1.f2066q);
        a o9 = b.o();
        byte[] bArr2 = m.f1969f;
        if (q.w(bArr2, o9, "", g10)) {
            boolean z9 = true;
            if (q.d(Long.MAX_VALUE, b.a().j()) >= Long.parseLong(new String(q.x(new byte[]{-95}, new byte[]{-111, 28, -73, -57, -52, 15, -120, -126}, b.o(), q.h(m.f1970g, b.o(), new String(bArr2)), 0)))) {
                z9 = false;
            }
            bool = Boolean.valueOf(z9);
        } else {
            bool = Boolean.FALSE;
        }
        if (bool.booleanValue()) {
            s();
            this.d = this.f885b.scheduleWithFixedDelay(this.c, 10L, 400L, TimeUnit.MILLISECONDS);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        s();
        b.f2544q = null;
    }

    public final void s() {
        ScheduledFuture scheduledFuture = this.d;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.d.cancel(true);
        }
    }
}
