package e0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;
import com.example.navistart.LocServ;
import java.net.URL;
import okhttp3.Request;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h1 extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1933a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Object f1934b;

    public h1(i7.m mVar) {
        this.f1934b = mVar;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        switch (this.f1933a) {
            case 0:
                try {
                    return BitmapFactory.decodeStream(new URL(((String[]) objArr)[0]).openStream());
                } catch (Exception unused) {
                    return null;
                }
            default:
                if (i7.j.f2804f.booleanValue()) {
                    i7.h a10 = i7.h.a();
                    h0.b.v(a10.name());
                    i7.j jVar = ((i7.m) this.f1934b).f2814g;
                    jVar.getClass();
                    String str = a10.c;
                    i7.j.f2804f = Boolean.FALSE;
                    StringBuilder sb = new StringBuilder();
                    LocServ locServ = jVar.f2807b;
                    sb.append(locServ.getFilesDir());
                    String i10 = com.google.protobuf.q.i(new byte[]{29, 124, -13, -56, -105, 94, -87, 5, 66}, new byte[]{50, 24, -110, -68, -10, 112, -45, 108}, sb);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(locServ.getFilesDir());
                    String i11 = com.google.protobuf.q.i(new byte[]{84, 99, 106, 1, -89, -59, 29, -124, 15}, new byte[]{123, 7, 11, 117, -58, -21, 105, -4}, sb2);
                    Request build = new Request.Builder().url(str).build();
                    h0.b.a();
                    h0.b.m().newCall(build).enqueue(new a5.h(jVar, i10, i11, 11, false));
                    i7.s c = v1.d.a().c();
                    c.f2826b.postValue(m.h(new byte[]{-100, 10, -109, 75, -38, 118, 117, -8, 108, 66, -3, 47, -69, 19, 25, -86, -14, 66, -15, 47, -79, 19, 17, -86, -15, 66, -5, 47, -65, -29, 116, -53, -100, 34, -109, 72, -37, 72, -118, 84, 98}, new byte[]{76, -110, 67, -1, 10, -61, -92, 122}));
                }
                return null;
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Object obj) {
        switch (this.f1933a) {
            case 0:
                ((ImageView) this.f1934b).setImageBitmap((Bitmap) obj);
                return;
            default:
                super.onPostExecute(obj);
                return;
        }
    }

    public /* synthetic */ h1() {
    }
}
