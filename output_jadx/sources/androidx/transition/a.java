package androidx.transition;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.hardware.display.VirtualDisplay;
import android.view.View;
import android.widget.Button;
import androidx.core.os.CancellationSignal;
import b1.m;
import com.example.navistart.ModernMainActivity;
import com.example.navistart.home.LauncherWindowService;
import com.example.navistart.mainview.YMovLay;
import d2.j;
import d2.l;
import e0.n3;
import g2.e;
import g2.g;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k2.f;
import k2.h;
import m0.b3;
import m0.s0;
import org.apache.commons.io.filefilter.PathVisitorFileFilter;
import org.apache.commons.io.function.IOSupplier;
import s1.w;
import t1.p;
import y5.k;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements CancellationSignal.OnCancelListener, p, f, IOSupplier, w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f251b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Runnable runnable, Transition transition, Runnable runnable2) {
        this.f251b = 0;
        this.c = runnable;
        this.e = transition;
        this.d = runnable2;
    }

    @Override // t1.p
    public void a(int i10, boolean z9) {
        ModernMainActivity modernMainActivity = (ModernMainActivity) this.c;
        String str = (String) this.d;
        YMovLay yMovLay = (YMovLay) this.e;
        String str2 = ModernMainActivity.B1;
        if (!z9) {
            return;
        }
        h0.b.o().saveString(str, String.valueOf(i10));
        yMovLay.setYLayMovX(String.valueOf(i10));
        n3.a(modernMainActivity);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [d2.h, java.lang.Object] */
    @Override // k2.f
    public Object apply(Object obj) {
        int i10;
        a2.a aVar;
        int i11;
        a2.a aVar2;
        int i12 = this.f251b;
        int i13 = 6;
        int i14 = 5;
        int i15 = 4;
        int i16 = 3;
        int i17 = 0;
        int i18 = 1;
        int i19 = 2;
        Object obj2 = this.e;
        Object obj3 = this.d;
        h hVar = (h) this.c;
        switch (i12) {
            case 2:
                ArrayList arrayList = (ArrayList) obj3;
                j jVar = (j) obj2;
                Cursor cursor = (Cursor) obj;
                while (cursor.moveToNext()) {
                    long j10 = cursor.getLong(i17);
                    if (cursor.getInt(7) != 0) {
                        i10 = i18;
                    } else {
                        i10 = i17;
                    }
                    ?? obj4 = new Object();
                    obj4.f1741f = new HashMap();
                    String string = cursor.getString(i18);
                    if (string != null) {
                        obj4.f1739a = string;
                        obj4.d = Long.valueOf(cursor.getLong(i19));
                        obj4.e = Long.valueOf(cursor.getLong(i16));
                        if (i10 != 0) {
                            String string2 = cursor.getString(i15);
                            if (string2 == null) {
                                aVar2 = h.f3390g;
                            } else {
                                aVar2 = new a2.a(string2);
                            }
                            obj4.c = new l(aVar2, cursor.getBlob(5));
                            i11 = i17;
                        } else {
                            String string3 = cursor.getString(i15);
                            if (string3 == null) {
                                aVar = h.f3390g;
                            } else {
                                aVar = new a2.a(string3);
                            }
                            Cursor query = hVar.b().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num");
                            try {
                                ArrayList arrayList2 = new ArrayList();
                                int i20 = i17;
                                while (query.moveToNext()) {
                                    byte[] blob = query.getBlob(i17);
                                    arrayList2.add(blob);
                                    i20 += blob.length;
                                }
                                byte[] bArr = new byte[i20];
                                int i21 = i17;
                                int i22 = i21;
                                while (i21 < arrayList2.size()) {
                                    byte[] bArr2 = (byte[]) arrayList2.get(i21);
                                    ArrayList arrayList3 = arrayList2;
                                    System.arraycopy(bArr2, 0, bArr, i22, bArr2.length);
                                    i22 += bArr2.length;
                                    i21++;
                                    arrayList2 = arrayList3;
                                }
                                i11 = 0;
                                query.close();
                                obj4.c = new l(aVar, bArr);
                            } catch (Throwable th) {
                                query.close();
                                throw th;
                            }
                        }
                        if (!cursor.isNull(6)) {
                            obj4.f1740b = Integer.valueOf(cursor.getInt(6));
                        }
                        arrayList.add(new k2.b(j10, jVar, obj4.l()));
                        i17 = i11;
                        i15 = 4;
                        i16 = 3;
                        i18 = 1;
                        i19 = 2;
                    } else {
                        n0.b.n("Null transportName");
                        return null;
                    }
                }
                return null;
            default:
                HashMap hashMap = (HashMap) obj3;
                m mVar = (m) obj2;
                ArrayList arrayList4 = (ArrayList) mVar.e;
                Cursor cursor2 = (Cursor) obj;
                hVar.getClass();
                while (cursor2.moveToNext()) {
                    String string4 = cursor2.getString(0);
                    int i23 = cursor2.getInt(1);
                    g2.c cVar = g2.c.REASON_UNKNOWN;
                    if (i23 != 0) {
                        if (i23 == 1) {
                            cVar = g2.c.MESSAGE_TOO_OLD;
                        } else if (i23 == 2) {
                            cVar = g2.c.CACHE_FULL;
                        } else if (i23 == 3) {
                            cVar = g2.c.PAYLOAD_TOO_BIG;
                        } else if (i23 == 4) {
                            cVar = g2.c.MAX_RETRIES_REACHED;
                        } else if (i23 == i14) {
                            cVar = g2.c.INVALID_PAYLOD;
                        } else if (i23 == i13) {
                            cVar = g2.c.SERVER_ERROR;
                        } else {
                            e3.d.d(Integer.valueOf(i23), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                        }
                    }
                    long j11 = cursor2.getLong(2);
                    if (!hashMap.containsKey(string4)) {
                        hashMap.put(string4, new ArrayList());
                    }
                    ((List) hashMap.get(string4)).add(new g2.d(j11, cVar));
                    i13 = 6;
                    i14 = 5;
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    int i24 = e.c;
                    new ArrayList();
                    arrayList4.add(new e((String) entry.getKey(), Collections.unmodifiableList((List) entry.getValue())));
                }
                final long d = hVar.c.d();
                mVar.c = (g) hVar.y(new f() { // from class: k2.e
                    @Override // k2.f
                    public final Object apply(Object obj5) {
                        long j12 = d;
                        Cursor rawQuery = ((SQLiteDatabase) obj5).rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                        try {
                            rawQuery.moveToNext();
                            return new g2.g(rawQuery.getLong(0), j12);
                        } finally {
                            rawQuery.close();
                        }
                    }
                });
                mVar.f305f = new g2.b(new g2.f(hVar.b().compileStatement("PRAGMA page_size").simpleQueryForLong() * hVar.b().compileStatement("PRAGMA page_count").simpleQueryForLong(), k2.a.f3382f.f3383a));
                mVar.d = (String) hVar.f3392f.get();
                return new g2.a((g) mVar.c, Collections.unmodifiableList(arrayList4), (g2.b) mVar.f305f, (String) mVar.d);
        }
    }

    @Override // s1.w
    public void b(String str, boolean z9) {
        LauncherWindowService launcherWindowService = (LauncherWindowService) this.c;
        String str2 = (String) this.d;
        VirtualDisplay virtualDisplay = (VirtualDisplay) this.e;
        HashMap hashMap = launcherWindowService.f971b;
        if (z9 && launcherWindowService.c.remove(str2) && hashMap.get(str2) == virtualDisplay) {
            hashMap.remove(str2);
            virtualDisplay.release();
            if (hashMap.isEmpty() && launcherWindowService.d.isEmpty()) {
                launcherWindowService.stopSelf();
            }
        }
    }

    public void c(b3 b3Var) {
        int i10;
        s0 s0Var = (s0) this.c;
        View view = (View) this.d;
        Button button = (Button) this.e;
        if (s0Var.isAdded() && s0Var.getView() == view) {
            button.setEnabled(true);
            button.setText(com.example.navistart.R.string.launcher_shortcuts_cleanup);
            Context requireContext = s0Var.requireContext();
            if (b3Var.f3611b != null) {
                i10 = com.example.navistart.R.string.launcher_shortcuts_reset_error;
            } else {
                i10 = com.example.navistart.R.string.launcher_shortcuts_reset_done;
            }
            k.x(requireContext, s0Var.getString(i10));
        }
    }

    @Override // org.apache.commons.io.function.IOSupplier
    public Object get() {
        return PathVisitorFileFilter.a((PathVisitorFileFilter) this.c, (Path) this.d, (BasicFileAttributes) this.e);
    }

    @Override // androidx.core.os.CancellationSignal.OnCancelListener
    public void onCancel() {
        FragmentTransitionSupport.a((Runnable) this.c, (Transition) this.e, (Runnable) this.d);
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i10) {
        this.f251b = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
