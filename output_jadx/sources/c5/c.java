package c5;

import android.util.Base64OutputStream;
import androidx.exifinterface.media.ExifInterface;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f530b;
    public final /* synthetic */ d c;

    public /* synthetic */ c(d dVar, int i10) {
        this.f530b = i10;
        this.c = dVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String byteArrayOutputStream;
        Set unmodifiableSet;
        Set unmodifiableSet2;
        switch (this.f530b) {
            case 0:
                d dVar = this.c;
                synchronized (dVar) {
                    try {
                        i iVar = (i) dVar.f531a.get();
                        ArrayList c = iVar.c();
                        iVar.b();
                        JSONArray jSONArray = new JSONArray();
                        for (int i10 = 0; i10 < c.size(); i10++) {
                            a aVar = (a) c.get(i10);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", aVar.f526a);
                            jSONObject.put("dates", new JSONArray((Collection) aVar.f527b));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", ExifInterface.GPS_MEASUREMENT_2D);
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                            } finally {
                            }
                        } catch (Throwable th) {
                            try {
                                base64OutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } finally {
                    }
                }
                return byteArrayOutputStream;
            default:
                d dVar2 = this.c;
                synchronized (dVar2) {
                    i iVar2 = (i) dVar2.f531a.get();
                    long currentTimeMillis = System.currentTimeMillis();
                    r5.b bVar = (r5.b) dVar2.c.get();
                    r5.c cVar = bVar.f5398b;
                    synchronized (((HashSet) cVar.c)) {
                        unmodifiableSet = Collections.unmodifiableSet((HashSet) cVar.c);
                    }
                    boolean isEmpty = unmodifiableSet.isEmpty();
                    String str = bVar.f5397a;
                    if (!isEmpty) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(' ');
                        synchronized (((HashSet) cVar.c)) {
                            unmodifiableSet2 = Collections.unmodifiableSet((HashSet) cVar.c);
                        }
                        sb.append(r5.b.a(unmodifiableSet2));
                        str = sb.toString();
                    }
                    iVar2.g(currentTimeMillis, str);
                }
                return null;
        }
    }
}
