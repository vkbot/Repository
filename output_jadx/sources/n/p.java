package n;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.example.navistart.R;
import com.example.navistart.cores.BTProxy;
import com.example.navistart.home.WebLauncherActivity;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.ByteCompanionObject;
import m0.k2;
import m0.w1;
import n7.v0;
import o7.f2;
import o7.m2;
import org.json.JSONObject;
import s1.x0;
import w0.g1;
import w0.h0;
import w0.m0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class p implements h.b, s, m2, y8.f, z2.b, z2.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4030b;
    public Object c;

    public p(int i10) {
        this.f4030b = i10;
        switch (i10) {
            case 2:
                this.c = new p(0);
                return;
            case 11:
                this.c = t6.a.e;
                return;
            case 17:
                this.c = new o7.a();
                return;
            case 18:
                this.c = new CountDownLatch(1);
                return;
            case 19:
                return;
            default:
                this.c = new c0.l(500L);
                return;
        }
    }

    @Override // z2.a
    public void a(Exception exc) {
        ((CountDownLatch) this.c).countDown();
    }

    @Override // z2.b
    public void c(Object obj) {
        ((CountDownLatch) this.c).countDown();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    @Override // y8.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(y8.g r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            int r0 = r5.f4030b
            switch(r0) {
                case 15: goto L6e;
                default: goto L5;
            }
        L5:
            boolean r0 = r7 instanceof y8.a
            if (r0 == 0) goto L18
            r0 = r7
            y8.a r0 = (y8.a) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.e = r1
            goto L1d
        L18:
            y8.a r0 = new y8.a
            r0.<init>(r5, r7)
        L1d:
            java.lang.Object r7 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L32
            z8.i r6 = r0.f6646b
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L30
            goto L5e
        L30:
            r7 = move-exception
            goto L6a
        L32:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            j1.i.l(r6)
            r1 = 0
            goto L63
        L39:
            kotlin.ResultKt.throwOnFailure(r7)
            z8.i r7 = new z8.i
            kotlin.coroutines.CoroutineContext r2 = r0.get$context()
            r7.<init>(r6, r2)
            r0.f6646b = r7     // Catch: java.lang.Throwable -> L68
            r0.e = r3     // Catch: java.lang.Throwable -> L68
            java.lang.Object r6 = r5.c     // Catch: java.lang.Throwable -> L68
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6     // Catch: java.lang.Throwable -> L68
            java.lang.Object r6 = r6.invoke(r7, r0)     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Throwable -> L68
            if (r6 != r0) goto L58
            goto L5a
        L58:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L68
        L5a:
            if (r6 != r1) goto L5d
            goto L63
        L5d:
            r6 = r7
        L5e:
            r6.releaseIntercepted()
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L63:
            return r1
        L64:
            r4 = r7
            r7 = r6
            r6 = r4
            goto L6a
        L68:
            r6 = move-exception
            goto L64
        L6a:
            r6.releaseIntercepted()
            throw r7
        L6e:
            java.lang.Object r0 = r5.c
            y8.q r0 = (y8.q) r0
            java.lang.Object r6 = y8.q.h(r0, r6, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n.p.collect(y8.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void d(BTProxy bTProxy, String str, h0 h0Var) {
        boolean z9;
        long i10 = ((w0.x) this.c).r().i();
        synchronized (((w0.x) this.c).O) {
            if (((w0.x) this.c).T && !((w0.x) this.c).f6284o && h0Var.getAsBoolean()) {
                ((w0.x) this.c).c0(e0.m.h(new byte[]{91, 104, 115, 28, 10}, new byte[]{43, 0, 28, 114, 111, -78, -100, -9}), e0.m.h(new byte[]{51, 13, -36, 66}, new byte[]{80, 108, -80, 46, -83, -127, -107, -29}), "", e0.m.h(new byte[]{-73, 42, 126, 14, 30, 62, 106, -15, -80, 26, 115, 7, 25, 56, 102, -9, -96}, new byte[]{-44, 69, 16, 104, 119, 76, 7, -108}));
                ((w0.x) this.c).C(e0.m.h(new byte[]{16, 95, 113, -118, 39, 13, -24, -60, 12, 91}, new byte[]{96, 55, 30, -28, 66, 82, -117, -91}));
                try {
                    z9 = bTProxy.call(str);
                } catch (Exception unused) {
                    z9 = false;
                }
                ((w0.x) this.c).r().e(e0.m.h(new byte[]{3, 2, -97, 57, -20, 30, -119, -27, 0, 31, -100, 35}, new byte[]{115, 106, -16, 87, -119, 65, -5, ByteCompanionObject.MIN_VALUE}), e0.m.h(new byte[]{28, -2, 104, 22, -21, -19, -15, 50, 28, -30, 116, 11, -26}, new byte[]{111, -111, 29, 100, -120, -120, -94, 87}), Long.valueOf(i10), e0.m.h(new byte[]{80, -83, -68, 35}, new byte[]{35, -56, -46, 87, -15, -1, 121, 88}), Boolean.valueOf(z9));
                if (!z9) {
                    new Handler(Looper.getMainLooper()).post(new f5.j(21, this));
                }
            }
        }
    }

    public void f(b1.m mVar) {
        String string;
        int i10;
        w0.x xVar = (w0.x) this.c;
        g1 r = xVar.r();
        String h2 = e0.m.h(new byte[]{100, 119, -101, 12, -97, -63, -54, -45, 117, 107, -111}, new byte[]{20, 31, -12, 98, -6, -98, -71, -89});
        String h10 = e0.m.h(new byte[]{-126, -105, 118, -50, 54}, new byte[]{-15, -29, 23, -70, 83, -43, 17, 116});
        m0 m0Var = (m0) mVar.c;
        r.e(h2, h10, m0Var.name());
        Context context = xVar.f6282m;
        String str = (String) mVar.d;
        List list = (List) mVar.f305f;
        switch (m0Var.ordinal()) {
            case 2:
            case 3:
                string = context.getString(R.string.voice_call_loading);
                break;
            case 4:
                string = context.getString(R.string.voice_call_not_found);
                break;
            case 5:
                string = context.getString(R.string.voice_call_no_contacts);
                break;
            case 6:
            case 8:
                if (m0Var == m0.f6181h) {
                    i10 = R.string.voice_call_choose_contact;
                } else {
                    i10 = R.string.voice_call_choose_number;
                }
                StringBuilder sb = new StringBuilder(context.getString(i10));
                int i11 = 0;
                while (i11 < list.size()) {
                    sb.append('\n');
                    int i12 = i11 + 1;
                    sb.append(i12);
                    sb.append(e0.m.h(new byte[]{-49, 69}, new byte[]{-31, 101, 75, 106, -97, -14, 114, -9}));
                    sb.append((String) list.get(i11));
                    i11 = i12;
                }
                string = sb.toString();
                break;
            case 7:
                string = context.getString(R.string.voice_call_too_many);
                break;
            case 9:
                string = context.getString(R.string.voice_call_no_number, str);
                break;
            case 10:
                string = context.getString(R.string.voice_call_confirm, str, (String) mVar.e);
                break;
            default:
                string = context.getString(R.string.voice_call_ask_name);
                break;
        }
        w0.x.f(xVar, string);
    }

    public boolean g(long j10, String str, String str2) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.c;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        int i10 = 0;
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            try {
                if (new JSONObject(String.valueOf(entry.getValue())).getLong(e0.m.h(new byte[]{-120, -124, -99, 58, -114}, new byte[]{-3, -22, -23, 83, -30, -51, 44, 15})) <= j10) {
                    edit.remove(entry.getKey());
                } else {
                    i10++;
                }
            } catch (Exception unused) {
                edit.remove(entry.getKey());
            }
        }
        if (i10 >= 100 || !edit.putString(str, str2).commit()) {
            return false;
        }
        return true;
    }

    @Override // h.b
    public boolean h(Object obj, File file, h.h hVar) {
        InputStream inputStream = (InputStream) obj;
        k.g gVar = (k.g) this.c;
        byte[] bArr = (byte[]) gVar.c(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, read);
                    } catch (IOException e) {
                        e = e;
                        fileOutputStream = fileOutputStream2;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        gVar.g(bArr);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        gVar.g(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                gVar.g(bArr);
                return true;
            } catch (IOException e6) {
                e = e6;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void i(j0.e eVar) {
        WebLauncherActivity webLauncherActivity = (WebLauncherActivity) this.c;
        String str = WebLauncherActivity.f972l;
        if (eVar.f3094a == j0.d.f3092b && eVar.f3095b != null) {
            h0.b.a();
            int guDisplayID = h0.b.n().getGuDisplayID();
            Bundle bundle = new Bundle();
            bundle.putInt(e0.m.h(new byte[]{16, 35, -31}, new byte[]{116, 74, -110, -95, 31, -2, 74, -38}), guDisplayID);
            n0.d dVar = eVar.f3095b;
            if (dVar == n0.d.f4087l) {
                webLauncherActivity.G(m0.o.class, bundle);
                return;
            } else if (dVar == n0.d.f4080h0) {
                webLauncherActivity.G(k2.class, bundle);
                return;
            } else if (dVar == n0.d.A0) {
                bundle.putBoolean(e0.m.h(new byte[]{22, 68, 72, -78, 79, 92, 101, 59, 43, 70, 64, -84, 65, 91, 84, 55, 29, 65, 74, -82}, new byte[]{116, 37, 47, -64, 46, 41, 11, 95}), true);
                webLauncherActivity.G(w1.class, bundle);
                return;
            }
        }
        new Thread(new x0(0, webLauncherActivity, eVar), e0.m.h(new byte[]{-1, 113, 79, 53, 30, 85, 37, 100, -60, 126, 88, 52, 13, 66, 40, 102, -59, 121, 84, 50}, new byte[]{-79, 16, 59, 92, 104, 48, 105, 5})).start();
    }

    @Override // n.s
    public r j(z zVar) {
        return new o.a((p) this.c);
    }

    public void k(boolean z9) {
        f2 f2Var = (f2) this.c;
        f2Var.Y.d(f2Var.E, z9);
    }

    public void l(v0 v0Var, byte[] bArr) {
        w7.b.c();
        try {
            String str = "/" + ((p7.k) this.c).f5062i.f4256b;
            if (bArr != null) {
                ((p7.k) this.c).f5069p = true;
                str = str + "?" + k4.e.d.c(bArr);
            }
            synchronized (((p7.k) this.c).f5066m.w) {
                p7.j.j(((p7.k) this.c).f5066m, v0Var, str);
            }
            w7.b.f6413a.getClass();
        } catch (Throwable th) {
            try {
                w7.b.f6413a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public String toString() {
        String str;
        switch (this.f4030b) {
            case 7:
                StringBuilder sb = new StringBuilder();
                String[] strArr = (String[]) this.c;
                int length = strArr.length / 2;
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = i10 * 2;
                    String str2 = null;
                    if (i11 >= 0 && i11 < strArr.length) {
                        str = strArr[i11];
                    } else {
                        str = null;
                    }
                    sb.append(str);
                    sb.append(": ");
                    int i12 = i11 + 1;
                    if (i12 >= 0 && i12 < strArr.length) {
                        str2 = strArr[i12];
                    }
                    sb.append(str2);
                    sb.append("\n");
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ p(int i10, Object obj) {
        this.f4030b = i10;
        this.c = obj;
    }

    public p(i7.i iVar) {
        this.f4030b = 7;
        ArrayList arrayList = iVar.f2803b;
        this.c = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
