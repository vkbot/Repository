package m0;

import android.content.Context;
import android.util.StateSet;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import kotlin.jvm.internal.ByteCompanionObject;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e1 implements Callback {

    /* renamed from: b, reason: collision with root package name */
    public int f3671b;
    public Object c;
    public Object d;
    public Serializable e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3672f;

    /* renamed from: g, reason: collision with root package name */
    public Object f3673g;

    /* renamed from: h, reason: collision with root package name */
    public Object f3674h;

    /* renamed from: i, reason: collision with root package name */
    public Object f3675i;

    public e1(z3.o oVar) {
        b();
        a(StateSet.WILD_CARD, oVar);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [z3.o[], java.lang.Object, java.io.Serializable] */
    public void a(int[] iArr, z3.o oVar) {
        int i10 = this.f3671b;
        if (i10 == 0 || iArr.length == 0) {
            this.c = oVar;
        }
        int[][] iArr2 = (int[][]) this.d;
        if (i10 >= iArr2.length) {
            int i11 = i10 + 10;
            int[][] iArr3 = new int[i11];
            System.arraycopy(iArr2, 0, iArr3, 0, i10);
            this.d = iArr3;
            ?? r1 = new z3.o[i11];
            System.arraycopy((z3.o[]) this.e, 0, r1, 0, i10);
            this.e = r1;
        }
        int[][] iArr4 = (int[][]) this.d;
        int i12 = this.f3671b;
        iArr4[i12] = iArr;
        ((z3.o[]) this.e)[i12] = oVar;
        this.f3671b = i12 + 1;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [z3.o[], java.io.Serializable] */
    public void b() {
        this.c = new z3.o();
        this.d = new int[10];
        this.e = new z3.o[10];
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException iOException) {
        i1 i1Var = (i1) this.f3675i;
        RecyclerView recyclerView = (RecyclerView) this.c;
        c1 c1Var = new c1(this, (h1) this.d, (String) this.e, this.f3671b, 0);
        String str = i1.f3734i;
        i1Var.z(recyclerView, c1Var);
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        int i10;
        Context context = (Context) this.f3674h;
        String str = (String) this.e;
        int i11 = this.f3671b;
        RecyclerView recyclerView = (RecyclerView) this.c;
        i1 i1Var = (i1) this.f3675i;
        h1 h1Var = (h1) this.d;
        try {
            try {
                if (!response.isSuccessful()) {
                    c1 c1Var = new c1(this, h1Var, str, i11, 1);
                    String str2 = i1.f3734i;
                    i1Var.z(recyclerView, c1Var);
                    response.close();
                    return;
                }
                File file = new File(context.getCacheDir(), e0.m.h(new byte[]{122, -42, 25, -21, 29, -123, ByteCompanionObject.MAX_VALUE}, new byte[]{9, -75, 107, -114, 120, -21, 12, 33}));
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(file, h1Var.c + e0.m.h(new byte[]{106, -83, -30, -34}, new byte[]{68, -41, -117, -82, 47, -27, 86, 95}));
                long contentLength = response.body().getContentLength();
                InputStream byteStream = response.body().byteStream();
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                byte[] bArr = new byte[8192];
                long j10 = 0;
                while (true) {
                    int read = byteStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                    j10 += read;
                    if (contentLength > 0) {
                        i10 = (int) ((100 * j10) / contentLength);
                    } else {
                        i10 = 0;
                    }
                    d1 d1Var = new d1(this, h1Var, i10, i11);
                    String str3 = i1.f3734i;
                    i1Var.z(recyclerView, d1Var);
                }
                fileOutputStream.flush();
                fileOutputStream.close();
                byteStream.close();
                if (i1.t(i1Var, context, (String) this.f3672f, h1Var.d, file2)) {
                    str = (String) this.f3673g;
                }
                try {
                    file2.delete();
                } catch (Exception unused) {
                }
                i1Var.z(recyclerView, new c1(this, h1Var, str, i11, 2));
                response.close();
            } finally {
            }
        } catch (Exception unused2) {
        }
    }
}
