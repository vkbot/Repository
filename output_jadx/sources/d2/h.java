package d2;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.WindowManager;
import com.example.navistart.MyA11yService;
import com.example.navistart.R;
import com.example.navistart.TestSpaceActivity;
import com.example.navistart.VJCT;
import com.example.navistart.cores.ColorText;
import com.wireguard.android.backend.GoBackend;
import d2.h;
import e0.g;
import e0.m;
import e0.w;
import f5.b0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h implements t4.b {

    /* renamed from: a, reason: collision with root package name */
    public Object f1739a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1740b = new AtomicBoolean(true);
    public Object c = new SimpleDateFormat(e0.m.h(new byte[]{-23, 57, 38, -88, 116, 16, -126, 71}, new byte[]{-95, 113, 28, -59, 25, 42, -15, 52}), Locale.getDefault());
    public Object d = new LinkedList();
    public Object e = new SpannableStringBuilder();

    /* renamed from: f, reason: collision with root package name */
    public Object f1741f = w.c(-1, e0.m.h(new byte[]{116, 51, Base64.padSymbol, 86, 54, -123, -85, 27, 71}, new byte[]{53, 67, 77, 26, 89, -30, -52, 126}));

    @Override // t4.b
    public t4.n a(t4.p pVar) {
        if (((Set) this.c).contains(pVar)) {
            return ((t4.b) this.f1741f).a(pVar);
        }
        org.apache.commons.net.ftp.a.d(pVar, "Attempting to request an undeclared dependency Deferred<", ">.");
        return null;
    }

    @Override // t4.b
    public Object b(Class cls) {
        if (((Set) this.f1739a).contains(t4.p.a(cls))) {
            Object b10 = ((t4.b) this.f1741f).b(cls);
            if (!cls.equals(b5.a.class)) {
                return b10;
            }
            return new Object();
        }
        org.apache.commons.net.ftp.a.d(cls, "Attempting to request an undeclared dependency ", ".");
        return null;
    }

    @Override // t4.b
    public k5.b c(Class cls) {
        return g(t4.p.a(cls));
    }

    @Override // t4.b
    public t4.n d() {
        return a(t4.p.a(b0.class));
    }

    @Override // t4.b
    public Set e(t4.p pVar) {
        if (((Set) this.d).contains(pVar)) {
            return ((t4.b) this.f1741f).e(pVar);
        }
        org.apache.commons.net.ftp.a.d(pVar, "Attempting to request an undeclared dependency Set<", ">.");
        return null;
    }

    @Override // t4.b
    public k5.b f(t4.p pVar) {
        if (((Set) this.e).contains(pVar)) {
            return ((t4.b) this.f1741f).f(pVar);
        }
        org.apache.commons.net.ftp.a.d(pVar, "Attempting to request an undeclared dependency Provider<Set<", ">>.");
        return null;
    }

    @Override // t4.b
    public k5.b g(t4.p pVar) {
        if (((Set) this.f1740b).contains(pVar)) {
            return ((t4.b) this.f1741f).g(pVar);
        }
        org.apache.commons.net.ftp.a.d(pVar, "Attempting to request an undeclared dependency Provider<", ">.");
        return null;
    }

    @Override // t4.b
    public Object h(t4.p pVar) {
        if (((Set) this.f1739a).contains(pVar)) {
            return ((t4.b) this.f1741f).h(pVar);
        }
        org.apache.commons.net.ftp.a.d(pVar, "Attempting to request an undeclared dependency ", ".");
        return null;
    }

    public void i() {
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f1740b;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            ((ScheduledFuture) this.f1740b).cancel(true);
        }
    }

    public void j(String str, String str2) {
        HashMap hashMap = (HashMap) this.f1741f;
        if (hashMap != null) {
            hashMap.put(str, str2);
        } else {
            j1.i.l("Property \"autoMetadata\" has not been set");
        }
    }

    public void k(final o0.f fVar, int i10, int i11, int i12, int i13) {
        WindowManager windowManager = (WindowManager) this.f1740b;
        HashMap hashMap = (HashMap) this.f1741f;
        if (i12 > 0 && i13 > 0) {
            int max = Math.max(0, i10);
            int max2 = Math.max(0, i11);
            if (hashMap.containsKey(fVar)) {
                try {
                    a.a.v(windowManager, (View) hashMap.get(fVar));
                    View view = (View) hashMap.get(fVar);
                    Objects.requireNonNull(view);
                    view.requestLayout();
                    View view2 = (View) hashMap.get(fVar);
                    Objects.requireNonNull(view2);
                    view2.invalidate();
                } catch (Exception unused) {
                }
            }
            final o0.d dVar = new o0.d((Context) ((WeakReference) this.f1739a).get(), fVar);
            dVar.setBackgroundColor(0);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(i12, i13, 2032, 552, -3);
            layoutParams.x = max;
            layoutParams.y = max2;
            layoutParams.gravity = 8388659;
            final float[] fArr = new float[1];
            final float[] fArr2 = new float[1];
            final float[] fArr3 = new float[1];
            final VelocityTracker[] velocityTrackerArr = new VelocityTracker[1];
            dVar.setOnTouchListener(new View.OnTouchListener() { // from class: o0.b
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view3, MotionEvent motionEvent) {
                    int actionMasked = motionEvent.getActionMasked();
                    float[] fArr4 = fArr;
                    float[] fArr5 = fArr2;
                    float[] fArr6 = fArr3;
                    VelocityTracker[] velocityTrackerArr2 = velocityTrackerArr;
                    d dVar2 = dVar;
                    if (actionMasked != 0) {
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                if (actionMasked == 3) {
                                    VelocityTracker velocityTracker = velocityTrackerArr2[0];
                                    if (velocityTracker != null) {
                                        velocityTracker.recycle();
                                        velocityTrackerArr2[0] = null;
                                    }
                                    dVar2.c();
                                    return true;
                                }
                            } else {
                                VelocityTracker velocityTracker2 = velocityTrackerArr2[0];
                                if (velocityTracker2 != null) {
                                    velocityTracker2.addMovement(motionEvent);
                                    float rawX = motionEvent.getRawX() - fArr4[0];
                                    float rawY = motionEvent.getRawY() - fArr5[0];
                                    float sqrt = (float) Math.sqrt((rawY * rawY) + (rawX * rawX));
                                    fArr6[0] = sqrt;
                                    float min = Math.min(sqrt, 500.0f);
                                    fArr6[0] = min;
                                    dVar2.d(motionEvent.getX(), motionEvent.getY(), rawX, rawY, Math.min(1.0f, min / 500.0f));
                                    return true;
                                }
                            }
                        } else {
                            VelocityTracker velocityTracker3 = velocityTrackerArr2[0];
                            if (velocityTracker3 != null) {
                                velocityTracker3.addMovement(motionEvent);
                                velocityTrackerArr2[0].computeCurrentVelocity(1000);
                                float rawX2 = motionEvent.getRawX() - fArr4[0];
                                float rawY2 = motionEvent.getRawY() - fArr5[0];
                                VelocityTracker velocityTracker4 = velocityTrackerArr2[0];
                                if (velocityTracker4 != null) {
                                    velocityTracker4.recycle();
                                    velocityTrackerArr2[0] = null;
                                }
                                if (fArr6[0] > 90.0f) {
                                    if (Math.abs(rawX2) > Math.abs(rawY2)) {
                                        int i14 = (rawX2 > 0.0f ? 1 : (rawX2 == 0.0f ? 0 : -1));
                                        c[] cVarArr = c.f4289b;
                                    } else {
                                        int i15 = (rawY2 > 0.0f ? 1 : (rawY2 == 0.0f ? 0 : -1));
                                        c[] cVarArr2 = c.f4289b;
                                    }
                                    h hVar = h.this;
                                    SharedPreferences sharedPreferences = ((e) hVar.c).f4304a;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(m.h(new byte[]{-12, -40, 19, -46, -95, -116, 107}, new byte[]{-107, -69, 103, -69, -50, -30, 52, -51}));
                                    f fVar2 = fVar;
                                    sb.append(fVar2.name());
                                    sharedPreferences.getInt(sb.toString(), 0);
                                    if (((g) hVar.d) != null) {
                                        MyA11yService myA11yService = MyA11yService.c;
                                        try {
                                            h0.b.a();
                                            h0.b.a();
                                            h0.b.f().k(m.h(new byte[]{97, 56, 30, 103, 35, 46, -92, 46, 73, 51, 8, 94, 55, 50, -96, 19, 67, 47}, new byte[]{38, 93, 109, 19, 86, 92, -63, 116}) + fVar2.name());
                                        } catch (Exception unused2) {
                                        }
                                    }
                                }
                                dVar2.c();
                            }
                        }
                        return true;
                    }
                    fArr4[0] = motionEvent.getRawX();
                    fArr5[0] = motionEvent.getRawY();
                    fArr6[0] = 0.0f;
                    VelocityTracker obtain = VelocityTracker.obtain();
                    velocityTrackerArr2[0] = obtain;
                    obtain.addMovement(motionEvent);
                    dVar2.d(motionEvent.getX(), motionEvent.getY(), 0.0f, 0.0f, 0.0f);
                    return true;
                }
            });
            windowManager.addView(dVar, layoutParams);
            hashMap.put(fVar, dVar);
        }
    }

    public i l() {
        String str;
        if (((String) this.f1739a) == null) {
            str = " transportName";
        } else {
            str = "";
        }
        if (((l) this.c) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.d) == null) {
            str = str.concat(" eventMillis");
        }
        if (((Long) this.e) == null) {
            str = str.concat(" uptimeMillis");
        }
        if (((HashMap) this.f1741f) == null) {
            str = str.concat(" autoMetadata");
        }
        if (str.isEmpty()) {
            return new i((String) this.f1739a, (Integer) this.f1740b, (l) this.c, ((Long) this.d).longValue(), ((Long) this.e).longValue(), (HashMap) this.f1741f);
        }
        j1.i.l("Missing required properties:".concat(str));
        return null;
    }

    public void m() {
        HashMap hashMap = (HashMap) this.f1741f;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            View view = (View) ((Map.Entry) it.next()).getValue();
            if (view != null) {
                a.a.v((WindowManager) this.f1740b, view);
            }
        }
        hashMap.clear();
    }

    public f7.c n() {
        File file = new File(((Context) this.c).getFilesDir(), e0.m.h(new byte[]{-91, -86, 70, 89, -102, -6, -86, -77, -99, -125, ByteCompanionObject.MAX_VALUE}, new byte[]{-14, -19, 25, 15, -54, -76, -124, -48}));
        if (!file.exists()) {
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            if (readLine.startsWith(e0.m.h(new byte[]{126, -57, -66, -46, -73, 65, 101, -37, 27, -108}, new byte[]{59, -87, -38, -94, -40, 40, 11, -81}))) {
                                String[] split = readLine.split(e0.m.h(new byte[]{126}, new byte[]{67, -56, 7, -39, 43, -39, -121, -39}));
                                if (split.length > 1) {
                                    String[] split2 = split[1].trim().split(e0.m.h(new byte[]{-111}, new byte[]{-85, 123, 117, -116, -7, 55, 38, -117}));
                                    if (split2.length == 2) {
                                        String str = split2[0];
                                        Integer.parseInt(split2[1]);
                                    }
                                }
                            }
                        } else {
                            bufferedReader.close();
                            fileInputStream.close();
                            try {
                                FileInputStream fileInputStream2 = new FileInputStream(file);
                                try {
                                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(fileInputStream2));
                                    try {
                                        f7.c a10 = f7.c.a(bufferedReader2);
                                        bufferedReader2.close();
                                        fileInputStream2.close();
                                        return a10;
                                    } finally {
                                    }
                                } finally {
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                                return null;
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    fileInputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Exception e6) {
            e6.printStackTrace();
            return null;
        }
    }

    public void o() {
        if (((TestSpaceActivity) this.f1739a) != null && ((AtomicBoolean) this.f1740b).compareAndSet(true, false)) {
            ((ScheduledThreadPoolExecutor) this.f1741f).schedule(new a4.g(7, this), 300L, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [e0.j, java.lang.Object] */
    public void p(String str, ColorText colorText) {
        String format = ((SimpleDateFormat) this.c).format(new Date());
        StringBuilder sb = new StringBuilder();
        com.google.protobuf.q.u(new byte[]{31}, new byte[]{68, -86, 66, -121, -121, -14, -59, -14}, sb, format);
        String l10 = com.google.protobuf.q.l(new byte[]{88, 99}, new byte[]{5, 67, 110, -17, 126, -99, 12, 101}, sb, str);
        Log.e(e0.m.h(new byte[]{13, 3, 18, -119, -5, 85, -17}, new byte[]{76, 115, 98, -59, -108, 50, -100, 110}), l10);
        synchronized (((LinkedList) this.d)) {
            try {
                LinkedList linkedList = (LinkedList) this.d;
                ?? obj = new Object();
                obj.f1943a = l10;
                obj.f1944b = colorText;
                linkedList.add(obj);
                if (((LinkedList) this.d).size() > 500) {
                    ((LinkedList) this.d).removeFirst();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        o();
    }

    public void q() {
        Context context = (Context) this.c;
        try {
            f7.c n10 = n();
            this.e = n10;
            if (n10 != null) {
                this.d = new GoBackend(context);
                this.f1741f = new r5.c(27, this);
                VJCT.u(context.getResources().getString(R.string.vpn_down_conf_done));
                return;
            }
            VJCT.u(context.getResources().getString(R.string.vpn_down_conf));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
