package a1;

import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.navistart.APInAct;
import com.example.navistart.MyA11yService;
import com.example.navistart.MyCarReceiver;
import com.example.navistart.NLService;
import com.example.navistart.Notik;
import com.example.navistart.R;
import com.example.navistart.cores.ColorText;
import com.example.navistart.cores.HUDMassageObj;
import com.google.protobuf.q;
import e0.m;
import e0.n3;
import e0.p3;
import e0.u1;
import e0.v;
import e0.v0;
import e0.x1;
import f5.j;
import h0.b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import n0.g;
import ru.transfer.MessageData;
import v1.d;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(MyA11yService myA11yService, List list, String str) {
        this.f4b = 24;
        this.c = list;
        this.d = str;
    }

    private final void a() {
        APInAct aPInAct = (APInAct) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        String str = APInAct.f690f;
        d.a().b().a(aPInAct.getResources().getString(R.string.install_podgotovka));
        d.a().b().f5920b.postValue(Boolean.FALSE);
        if (arrayList != null && (!arrayList.isEmpty() || aPInAct.s().booleanValue())) {
            try {
                if (aPInAct.s().booleanValue()) {
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    int i10 = 0;
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        arrayList2.add(aPInAct.t((Uri) obj));
                    }
                    Log.d(APInAct.f690f, arrayList2.toString());
                    u0.a o5 = b.o();
                    String h2 = m.h(new byte[]{40, -81, 49, -23, -10, 34, 121, -92, 40, -81, 49, -9, -18, 34, 122, -119, 15, -117, 34, -12, -6, 4}, new byte[]{91, -37, 80, -101, -126, 125, 48, -54});
                    b.a();
                    if (o5.loadBoolean(h2, b.g().c())) {
                        new Handler(Looper.getMainLooper()).post(new e0.b(aPInAct, i10));
                        b.a().j().ip(arrayList2);
                        return;
                    } else {
                        aPInAct.u(arrayList2);
                        return;
                    }
                }
                d.a().b().a(aPInAct.getResources().getString(R.string.install_error_intent));
                return;
            } catch (Exception unused) {
                d.a().b().a(aPInAct.getResources().getString(R.string.install_error_copy));
                return;
            }
        }
        d.a().b().a(aPInAct.getResources().getString(R.string.install_error_intent));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:103|(1:105)(4:124|(1:126)(1:147)|127|(9:(1:130)(10:131|(4:133|(1:135)(1:145)|136|(2:138|(8:143|108|109|110|(1:112)|113|(2:117|118)|119)))(1:146)|144|108|109|110|(0)|113|(1:121)(3:115|117|118)|119)|107|108|109|110|(0)|113|(0)(0)|119))|106|107|108|109|110|(0)|113|(0)(0)|119) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x061d A[Catch: Exception -> 0x0661, TryCatch #2 {Exception -> 0x0661, blocks: (B:110:0x060e, B:112:0x061d, B:113:0x0620, B:115:0x0644, B:117:0x064e), top: B:109:0x060e }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0644 A[Catch: Exception -> 0x0661, TryCatch #2 {Exception -> 0x0661, blocks: (B:110:0x060e, B:112:0x061d, B:113:0x0620, B:115:0x0644, B:117:0x064e), top: B:109:0x060e }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0661 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x042a A[LOOP:3: B:210:0x02a8->B:221:0x042a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0446 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v77, types: [i7.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v3, types: [i7.x, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, i7.n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void b() {
        /*
            Method dump skipped, instructions count: 2346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.a.b():void");
    }

    private final void c() {
        u1 u1Var = (u1) this.c;
        ObjectAnimator objectAnimator = (ObjectAnimator) this.d;
        if (u1Var.f2043j == objectAnimator) {
            objectAnimator.start();
        }
    }

    private final void d() {
        Bitmap bitmap;
        x1 x1Var = (x1) this.c;
        MediaMetadata mediaMetadata = (MediaMetadata) this.d;
        if (mediaMetadata != null) {
            bitmap = mediaMetadata.getBitmap(m.h(new byte[]{103, 76, -23, -69, 126, -89, -87, 117, 107, 71, -23, -96, 112, -32, -96, 62, 114, 67, -23, -88, 101, -81, -29, 26, 74, 96, -40, -124, 78, -113, -97, 15}, new byte[]{6, 34, -115, -55, 17, -50, -51, 91}));
            if (bitmap == null) {
                bitmap = mediaMetadata.getBitmap(m.h(new byte[]{24, 19, -75, -93, -41, -17, 88, 26, 20, 24, -75, -72, -39, -88, 81, 81, 13, 28, -75, -80, -52, -25, 18, 117, 43, 41}, new byte[]{121, 125, -47, -47, -72, -122, 60, 52}));
            }
            if (bitmap == null) {
                bitmap = mediaMetadata.getBitmap(m.h(new byte[]{57, 109, 111, 56, -103, 94, -104, -52, 53, 102, 111, 35, -105, 25, -111, -121, 44, 98, 111, 43, -126, 86, -46, -90, 17, 80, 91, 6, -73, 110, -93, -85, 27, 76, 69}, new byte[]{88, 3, 11, 74, -10, 55, -4, -30}));
            }
        } else {
            bitmap = null;
        }
        if (bitmap != null) {
            x1Var.e = bitmap;
        }
    }

    private final void e() {
        x1 x1Var = (x1) this.c;
        MediaController mediaController = (MediaController) this.d;
        if (x1Var.f2078o) {
            x1Var.f2078o = false;
            try {
                mediaController.unregisterCallback(x1Var);
            } catch (Exception unused) {
            }
            x1.d(null);
            x1Var.f2078o = true;
        }
    }

    private final void f() {
        Boolean bool;
        Bitmap bitmap;
        String str;
        String str2;
        boolean z9;
        x1 x1Var = (x1) this.c;
        PlaybackState playbackState = (PlaybackState) this.d;
        v vVar = x1Var.f2075l;
        b.a();
        if (playbackState != null) {
            int state = playbackState.getState();
            if (state != 2) {
                if (state == 3) {
                    x1Var.f2067a = g.f4118b;
                    x1Var.f2069f = Long.valueOf(playbackState.getPosition());
                    int i10 = 1;
                    if (x1Var.f2071h.isMusicActive()) {
                        StringBuilder sb = new StringBuilder();
                        u0.a o5 = b.o();
                        byte[] bArr = m.f1973j;
                        String[] strArr = p3.f2001a;
                        String str3 = "";
                        q.s(bArr, o5, "", sb);
                        q.r(new byte[]{108, 105, 99, 116, 95, 114, 105, 117, 101}, sb);
                        String g10 = q.g(sb, x1.f2066q);
                        u0.a o9 = b.o();
                        byte[] bArr2 = m.f1969f;
                        if (q.w(bArr2, o9, "", g10)) {
                            b.a();
                            if (q.d(Long.MAX_VALUE, b.a().j()) < Long.parseLong(new String(q.x(new byte[]{-123}, new byte[]{-75, -62, 91, -46, -10, -83, -3, -3}, b.o(), q.h(m.f1970g, b.o(), new String(bArr2)), 0)))) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            bool = Boolean.valueOf(z9);
                        } else {
                            bool = Boolean.FALSE;
                        }
                        if (bool.booleanValue()) {
                            try {
                                MediaController a10 = x1Var.a();
                                if (a10 != null) {
                                    MediaMetadata metadata = a10.getMetadata();
                                    if (metadata != null) {
                                        String[] split = String.valueOf(metadata.getDescription()).split(m.h(new byte[]{-120, 71}, new byte[]{-92, 103, -106, 69, -103, -125, 106, -41}));
                                        str = "";
                                        str2 = str;
                                        for (int i11 = 0; i11 < split.length - 1; i11++) {
                                            if (i11 == 0 && !m.h(new byte[]{-84, -59, 97, -85}, new byte[]{-62, -80, 13, -57, 116, -125, 94, 7}).equals(split[0])) {
                                                str3 = split[0];
                                            }
                                            if (i11 == 1 && !m.h(new byte[]{80, 77, 14, 73}, new byte[]{62, 56, 98, 37, 87, -88, -42, -98}).equals(split[1])) {
                                                str = split[1];
                                            }
                                            if (i11 == 2 && !m.h(new byte[]{-15, -14, 67, -67}, new byte[]{-97, -121, 47, -47, 79, -69, -57, -115}).equals(split[2])) {
                                                str2 = split[2];
                                            }
                                        }
                                        bitmap = metadata.getBitmap(m.h(new byte[]{-50, -62, 34, -61, 49, -32, -65, 107, -62, -55, 34, -40, 63, -89, -74, 32, -37, -51, 34, -48, 42, -24, -11, 4, -29, -18, 19, -4, 1, -56, -119, 17}, new byte[]{-81, -84, 70, -79, 94, -119, -37, 69}));
                                        if (bitmap == null) {
                                            bitmap = metadata.getBitmap(m.h(new byte[]{83, 114, -9, -120, 4, -36, -41, -123, 95, 121, -9, -109, 10, -101, -34, -50, 70, 125, -9, -101, 31, -44, -99, -22, 96, 72}, new byte[]{50, 28, -109, -6, 107, -75, -77, -85}));
                                        }
                                        if (bitmap == null) {
                                            bitmap = metadata.getBitmap(m.h(new byte[]{-118, 83, ByteCompanionObject.MAX_VALUE, 30, 76, -15, 60, 44, -122, 88, ByteCompanionObject.MAX_VALUE, 5, 66, -74, 53, 103, -97, 92, ByteCompanionObject.MAX_VALUE, 13, 87, -7, 118, 70, -94, 110, 75, 32, 98, -63, 7, 75, -88, 114, 85}, new byte[]{-21, Base64.padSymbol, 27, 108, 35, -104, 88, 2}));
                                        }
                                        x1Var.f2070g = Long.valueOf(metadata.getLong(m.h(new byte[]{-71, 10, -19, -118, 17, 118, 35, 50, -75, 1, -19, -111, 31, 49, 42, 121, -84, 5, -19, -103, 10, 126, 105, 88, -115, 54, -56, -84, 55, 80, 9}, new byte[]{-40, 100, -119, -8, 126, 31, 71, 28})));
                                    } else {
                                        bitmap = null;
                                        str = "";
                                        str2 = str;
                                    }
                                    x1Var.f2068b = str3;
                                    x1Var.c = str;
                                    x1Var.d = str2;
                                    x1Var.e = bitmap;
                                    x1.b(str3, str, str2, bitmap);
                                    d.a().d().f5925f.postValue(new s0.a(x1Var.f2067a, x1Var.f2068b, x1Var.c, x1Var.d, x1Var.e, x1Var.f2069f, x1Var.f2070g));
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                    final int max = (int) Math.max(-2147483648L, Math.min(2147483647L, x1Var.f2069f.longValue()));
                    final int max2 = (int) Math.max(-2147483648L, Math.min(2147483647L, x1Var.f2070g.longValue()));
                    vVar.execute(new Runnable() { // from class: e0.w1
                        @Override // java.lang.Runnable
                        public final void run() {
                            h0.b.a();
                            h0.b.a();
                            h0.b.n().setMusicPlayTime(max, max2);
                        }
                    });
                    vVar.execute(new v0(i10));
                }
            } else {
                x1Var.f2067a = g.c;
            }
        }
        d.a().d().f5925f.postValue(new s0.a(x1Var.f2067a, x1Var.f2068b, x1Var.c, x1Var.d, x1Var.e, x1Var.f2069f, x1Var.f2070g));
    }

    private final void g() {
        List list = (List) this.c;
        String str = (String) this.d;
        MyA11yService myA11yService = MyA11yService.c;
        MyA11yService.c((AccessibilityNodeInfo) list.get(0), str.concat(m.h(new byte[]{-104, 126, -65, 70, 120, 69, -23, -74, -45}, new byte[]{-72, 23, -37, 25, 27, 41, ByteCompanionObject.MIN_VALUE, -43})));
    }

    private final void h() {
        Runnable runnable = (Runnable) this.c;
        String str = (String) this.d;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = MyCarReceiver.c;
        runnable.run();
        MyCarReceiver.d(str.concat(m.h(new byte[]{-8, 74, 89, -9, 6, -23}, new byte[]{-89, 30, 16, -70, 67, -69, -75, -17})), Boolean.FALSE);
        b.w(str.concat(m.h(new byte[]{-56, 39, 99, -25, -67, -62, 4, -52, -47}, new byte[]{-105, 83, 10, -118, -40, -99, 75, -118})), ColorText.RED);
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x0427, code lost:
    
        if (r5.contains(e0.m.h(new byte[]{-38, -68, 108, -56, 36, 83, 103, 113, 42, -51, 39, -70, 108, 29, 42}, new byte[]{10, 29, -68, 106, -12, -51, -73, -18})) == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x036b, code lost:
    
        if (r5.contains(e0.m.h(new byte[]{-35, -46, -69, 79, 97, 32, 45, 36, -35, -34}, new byte[]{13, 118, 107, -41, -79, -67, -3, -68})) != false) goto L99;
     */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object, e0.l3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void i() {
        /*
            Method dump skipped, instructions count: 2234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.a.i():void");
    }

    private final void j() {
        NLService nLService = (NLService) this.c;
        String str = (String) this.d;
        if (str.equals(nLService.c)) {
            nLService.c = null;
            String str2 = n3.d;
            HUDMassageObj hUDMassageObj = new HUDMassageObj();
            hUDMassageObj.AradarOn = Boolean.FALSE;
            hUDMassageObj.hudSenderType = HUDMassageObj.HudSenderType.ARAD;
            hUDMassageObj.aradarSenderType = HUDMassageObj.AradarSenderType.STRELKA;
            hUDMassageObj.v_mTurnType = -1;
            hUDMassageObj.v_mTurnDis = 0;
            hUDMassageObj.v_mNextRoad = " ";
            try {
                b.a();
                b.i().e(hUDMassageObj);
            } catch (Exception unused) {
            }
        }
        if (!str.equals(m.h(new byte[]{-56, -95, 122, -34, -41, 63, -113, -18, -62, -6, 45, -58, -40, 53, -114, -13, -41, -75, 36, -44}, new byte[]{-70, -44, 84, -89, -74, 81, -21, -117}))) {
            str.equals(m.h(new byte[]{-71, -68, -95, 63, 91, 24, -6, -29, -77, -25, -10, 39, 84, 18, -5, -2, -91, -88, -7, 47}, new byte[]{-53, -55, -113, 70, 58, 118, -98, -122}));
        }
        try {
            b.a();
            b.k().getClass();
            if (str.equals(null)) {
                b.a();
                b.k().getClass();
                b.a();
                b.k().getClass();
            }
        } catch (Exception unused2) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.widget.LinearLayout, android.view.View, java.lang.Object, android.view.ViewGroup, g0.e] */
    private final void k() {
        Boolean bool;
        boolean z9;
        Notik notik = (Notik) this.c;
        MessageData messageData = (MessageData) this.d;
        b1.m mVar = notik.c;
        LinearLayout linearLayout = (LinearLayout) mVar.d;
        StringBuilder sb = new StringBuilder();
        u0.a o5 = b.o();
        byte[] bArr = m.f1973j;
        String[] strArr = p3.f2001a;
        q.s(bArr, o5, "", sb);
        q.r(new byte[]{108, 105, 99, 116, 95, 114, 105, 117, 101}, sb);
        String g10 = q.g(sb, x1.f2066q);
        u0.a o9 = b.o();
        byte[] bArr2 = m.f1969f;
        boolean w = q.w(bArr2, o9, "", g10);
        int i10 = 1;
        int i11 = 0;
        if (w) {
            if (q.d(Long.MAX_VALUE, b.a().j()) < Long.parseLong(new String(q.x(new byte[]{23}, new byte[]{39, -81, 69, 10, 121, 75, -122, 79}, b.o(), q.h(m.f1970g, b.o(), new String(bArr2)), 0)))) {
                z9 = true;
            } else {
                z9 = false;
            }
            bool = Boolean.valueOf(z9);
        } else {
            bool = Boolean.FALSE;
        }
        if (bool.booleanValue()) {
            b.a();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, b.g().b().m(), 552, -3);
            layoutParams.gravity = 49;
            layoutParams.y = 50;
            b.a();
            b.g().b().f(linearLayout, layoutParams);
        }
        Notik notik2 = (Notik) mVar.c;
        ?? linearLayout2 = new LinearLayout(notik2);
        linearLayout2.f2422h = linearLayout2.animate();
        View.inflate(notik2, R.layout.message_view, linearLayout2);
        linearLayout2.f2419b = (TextView) linearLayout2.findViewById(R.id.messageText);
        linearLayout2.c = (TextView) linearLayout2.findViewById(R.id.titleText);
        linearLayout2.d = (ImageView) linearLayout2.findViewById(R.id.appIco);
        linearLayout2.f2420f = (LinearLayout) linearLayout2.findViewById(R.id.LinearLayout_send_messadge);
        linearLayout2.e = (Button) linearLayout2.findViewById(R.id.otvetit_button);
        TextView textView = linearLayout2.f2419b;
        if (textView != null && textView.getContext() != null) {
            textView.setMaxWidth((int) (0.8f * textView.getContext().getResources().getDisplayMetrics().widthPixels));
        }
        linearLayout2.setMessageBubbleViewListener(mVar);
        linearLayout2.f2421g = messageData;
        Bitmap iconBitmap = messageData.getIconBitmap();
        ImageView imageView = linearLayout2.d;
        if (iconBitmap != null) {
            imageView.setImageBitmap(iconBitmap);
        } else {
            imageView.setImageResource(R.drawable.icon_voice_message_6376305);
        }
        linearLayout2.c.setText(messageData.getSender());
        linearLayout2.f2419b.setText(messageData.getMessage());
        if (messageData.gethasReply()) {
            linearLayout2.f2420f.setVisibility(0);
            linearLayout2.e.setVisibility(0);
            linearLayout2.e.setOnClickListener(new androidx.navigation.ui.a(6, linearLayout2, messageData));
        }
        linearLayout2.setOnClickListener(new androidx.navigation.ui.a(5, mVar, linearLayout2));
        linearLayout2.setVisibility(4);
        linearLayout.addView(linearLayout2);
        linearLayout2.post(new j(i10, linearLayout2));
        ((Handler) mVar.f305f).postDelayed(new g0.b(mVar, linearLayout2, i11), 10000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x03fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0235  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 2146
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.a.run():void");
    }

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.f4b = i10;
        this.c = obj;
        this.d = obj2;
    }
}
