package androidx.fragment.app;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.os.CancellationSignal;
import androidx.fragment.app.SpecialEffectsController;
import b1.m;
import c2.n;
import com.example.navistart.TestSpaceActivity;
import com.example.navistart.cores.LCRI;
import com.example.navistart.cores.PFInter;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingRegistrar;
import d2.q;
import f5.b0;
import f5.l0;
import f5.m0;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.functions.Function2;
import m0.j1;
import m0.k1;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.internal.Util;
import org.apache.commons.io.filefilter.MagicNumberFileFilter;
import org.apache.commons.io.function.IOFunction;
import org.apache.commons.io.function.IOSupplier;
import org.apache.commons.io.function.IOTriConsumer;
import org.apache.commons.io.input.SequenceReader;
import org.apache.commons.io.input.UncheckedBufferedReader;
import org.apache.commons.io.input.UncheckedFilterInputStream;
import org.apache.commons.io.input.UncheckedFilterReader;
import org.apache.commons.io.output.UncheckedFilterOutputStream;
import org.apache.commons.net.nntp.NNTPReply;
import t4.p;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements FragmentResultListener, CancellationSignal.OnCancelListener, t4.c, LCRI, b8.b, k5.a, z3.i, l2.b, EventListener.Factory, PFInter, IOFunction, IOSupplier, IOTriConsumer, p0.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f223b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h(int i10, Object obj) {
        this.f223b = i10;
        this.c = obj;
    }

    @Override // t4.c
    public Object a(d2.h hVar) {
        switch (this.f223b) {
            case 4:
                return new c5.d((Context) hVar.b(Context.class), ((o4.f) hVar.b(o4.f.class)).c(), hVar.e(p.a(c5.e.class)), hVar.c(r5.b.class), (Executor) hVar.h((p) this.c));
            default:
                return FirebaseInAppMessagingRegistrar.a((FirebaseInAppMessagingRegistrar) this.c, hVar);
        }
    }

    @Override // b8.b
    public void accept(Object obj) {
        switch (this.f223b) {
            case 9:
                f5.b bVar = (f5.b) this.c;
                bVar.getClass();
                HashSet hashSet = new HashSet();
                Iterator it = ((y5.i) obj).q().iterator();
                while (it.hasNext()) {
                    for (d5.f fVar : ((x5.c) it.next()).t()) {
                        if (!TextUtils.isEmpty(fVar.n().o())) {
                            hashSet.add(fVar.n().o());
                        }
                    }
                }
                if (hashSet.size() > 50) {
                    e3.d.n("Too many contextual triggers defined - limiting to 50");
                }
                e3.d.m("Updating contextual triggers for the following analytics events: " + hashSet);
                bVar.c.a(hashSet);
                return;
            default:
                m0 m0Var = (m0) this.c;
                y5.i iVar = (y5.i) obj;
                l0 l0Var = m0Var.f2303a;
                if (!m0Var.f2304b) {
                    if (m0Var.c) {
                        int i10 = m0Var.d + 1;
                        m0Var.d = i10;
                        if (i10 >= 5) {
                            m0Var.c = false;
                            l0Var.a("fresh_install", false);
                        }
                    }
                    Iterator it2 = iVar.q().iterator();
                    while (it2.hasNext()) {
                        if (((x5.c) it2.next()).q()) {
                            m0Var.f2304b = true;
                            l0Var.a("test_device", true);
                            e3.d.n("Setting this device as a test device");
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override // org.apache.commons.io.function.IOFunction
    public Object apply(Object obj) {
        return MagicNumberFileFilter.a((MagicNumberFileFilter) this.c, (RandomAccessFile) obj);
    }

    @Override // p0.d
    public void b(int i10, int i11) {
        p0.j jVar = (p0.j) this.c;
        jVar.d.post(new p0.f(jVar, i10, i11, 0));
    }

    @Override // okhttp3.EventListener.Factory
    public EventListener create(Call call) {
        EventListener asFactory$lambda$8;
        asFactory$lambda$8 = Util.asFactory$lambda$8((EventListener) this.c, call);
        return asFactory$lambda$8;
    }

    @Override // k5.a
    public void e(k5.b bVar) {
        ((b0) this.c).f2274a = bVar.get();
    }

    @Override // l2.b
    public Object execute() {
        SQLiteDatabase b10;
        int i10 = this.f223b;
        Object obj = this.c;
        switch (i10) {
            case 13:
                k2.h hVar = (k2.h) ((k2.c) obj);
                hVar.getClass();
                int i11 = g2.a.e;
                m mVar = new m(4);
                mVar.c = null;
                mVar.e = new ArrayList();
                mVar.f305f = null;
                mVar.d = "";
                HashMap hashMap = new HashMap();
                b10 = hVar.b();
                b10.beginTransaction();
                try {
                    g2.a aVar = (g2.a) k2.h.e0(b10.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new androidx.transition.a(hVar, hashMap, mVar, 3));
                    b10.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            case 14:
                k2.h hVar2 = (k2.h) ((k2.d) obj);
                long d = hVar2.c.d() - hVar2.e.d;
                b10 = hVar2.b();
                b10.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(d)};
                    Cursor rawQuery = b10.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        try {
                            hVar2.V(rawQuery.getInt(0), g2.c.MESSAGE_TOO_OLD, rawQuery.getString(1));
                        } catch (Throwable th) {
                            rawQuery.close();
                            throw th;
                        }
                    }
                    rawQuery.close();
                    int delete = b10.delete("events", "timestamp_ms < ?", strArr);
                    b10.setTransactionSuccessful();
                    b10.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
            case 15:
                k2.h hVar3 = (k2.h) ((j2.i) obj).f3258i;
                b10 = hVar3.b();
                b10.beginTransaction();
                try {
                    b10.compileStatement("DELETE FROM log_event_dropped").execute();
                    b10.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + hVar3.c.d()).execute();
                    b10.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                m mVar2 = (m) obj;
                b10 = ((k2.h) ((k2.d) mVar2.d)).b();
                b10.beginTransaction();
                try {
                    List list = (List) k2.h.e0(b10.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new j1.i(18));
                    b10.setTransactionSuccessful();
                    b10.endTransaction();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((a5.h) mVar2.e).v((q) it.next(), 1, false);
                    }
                    return null;
                } finally {
                }
        }
    }

    public b2.b f(a5.h hVar) {
        InputStream inputStream;
        b2.c cVar = (b2.c) this.c;
        URL url = (URL) hVar.c;
        String j10 = e3.d.j("CctTransportBackend");
        if (Log.isLoggable(j10, 4)) {
            Log.i(j10, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(cVar.f339g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) hVar.e;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    n.p pVar = cVar.f336a;
                    c2.i iVar = (c2.i) hVar.d;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    z4.c cVar2 = (z4.c) pVar.c;
                    z4.d dVar = new z4.d(bufferedWriter, cVar2.f6830a, cVar2.f6831b, cVar2.c, cVar2.d);
                    dVar.e(iVar);
                    dVar.g();
                    dVar.f6833b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    String j11 = e3.d.j("CctTransportBackend");
                    if (Log.isLoggable(j11, 4)) {
                        Log.i(j11, String.format("Status Code: %d", valueOf));
                    }
                    e3.d.d(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                    e3.d.d(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                    if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                        if (responseCode != 200) {
                            return new b2.b(responseCode, null, 0L);
                        }
                        InputStream inputStream2 = httpURLConnection.getInputStream();
                        try {
                            if ("gzip".equals(httpURLConnection.getHeaderField("Content-Encoding"))) {
                                inputStream = new GZIPInputStream(inputStream2);
                            } else {
                                inputStream = inputStream2;
                            }
                            try {
                                b2.b bVar = new b2.b(responseCode, null, n.a(new BufferedReader(new InputStreamReader(inputStream))).f501a);
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (inputStream2 != null) {
                                    inputStream2.close();
                                }
                                return bVar;
                            } finally {
                            }
                        } finally {
                        }
                    } else {
                        return new b2.b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                } finally {
                }
            } finally {
            }
        } catch (ConnectException e) {
            e = e;
            e3.d.f("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b2.b(500, null, 0L);
        } catch (UnknownHostException e6) {
            e = e6;
            e3.d.f("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b2.b(500, null, 0L);
        } catch (IOException e10) {
            e = e10;
            e3.d.f("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b2.b(NNTPReply.SERVICE_DISCONTINUED, null, 0L);
        } catch (x4.b e11) {
            e = e11;
            e3.d.f("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b2.b(NNTPReply.SERVICE_DISCONTINUED, null, 0L);
        }
    }

    @Override // org.apache.commons.io.function.IOSupplier
    public Object get() {
        UncheckedBufferedReader lambda$get$0;
        UncheckedFilterInputStream lambda$get$02;
        UncheckedFilterReader lambda$get$03;
        switch (this.f223b) {
            case 24:
                return SequenceReader.b((SequenceReader) this.c);
            case 25:
                lambda$get$0 = ((UncheckedBufferedReader.Builder) this.c).lambda$get$0();
                return lambda$get$0;
            case 26:
                lambda$get$02 = ((UncheckedFilterInputStream.Builder) this.c).lambda$get$0();
                return lambda$get$02;
            default:
                lambda$get$03 = ((UncheckedFilterReader.Builder) this.c).lambda$get$0();
                return lambda$get$03;
        }
    }

    @Override // com.example.navistart.cores.LCRI
    public void ls(String str) {
        String obj = ((TestSpaceActivity) this.c).f911f.getText().toString();
        if (!obj.isEmpty() && !str.toLowerCase().contains(obj.toLowerCase())) {
            return;
        }
        h0.b.v(str);
    }

    @Override // androidx.core.os.CancellationSignal.OnCancelListener
    public void onCancel() {
        SpecialEffectsController.Operation._init_$lambda$0((SpecialEffectsController.Operation) this.c);
    }

    @Override // androidx.fragment.app.FragmentResultListener
    public void onFragmentResult(String str, Bundle bundle) {
        FragmentKt.a((Function2) this.c, str, bundle);
    }

    @Override // com.example.navistart.cores.PFInter
    public void s(String str) {
        k1 k1Var = (k1) this.c;
        k1Var.f3760a.requireActivity().runOnUiThread(new j1(k1Var, str, 3));
    }

    @Override // org.apache.commons.io.function.IOTriConsumer
    public void accept(Object obj, Object obj2, Object obj3) {
        ((UncheckedFilterOutputStream) this.c).lambda$write$3((byte[]) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
    }
}
