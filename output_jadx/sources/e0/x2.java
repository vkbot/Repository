package e0;

import android.content.Context;
import com.example.navistart.R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class x2 implements Callback {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2080b;
    public final /* synthetic */ File c;
    public final /* synthetic */ long d;
    public final /* synthetic */ y2 e;

    public x2(y2 y2Var, Context context, File file, long j10) {
        this.e = y2Var;
        this.f2080b = context;
        this.c = file;
        this.d = j10;
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException iOException) {
        y2.a(this.e, this.f2080b);
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) {
        boolean z9;
        long j10;
        Context context = this.f2080b;
        y2 y2Var = this.e;
        try {
            try {
                boolean isSuccessful = response.isSuccessful();
                File file = this.c;
                if (isSuccessful && response.body() != null) {
                    long j11 = this.d;
                    int i10 = 0;
                    if (j11 > 0 && response.code() == 206) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (j11 > 0 && !z9) {
                        if (file.exists()) {
                            file.delete();
                        }
                        j11 = 0;
                    }
                    ResponseBody body = response.body();
                    long contentLength = body.getContentLength();
                    if (contentLength > 0) {
                        j10 = contentLength + j11;
                    } else {
                        j10 = -1;
                    }
                    InputStream byteStream = body.byteStream();
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file, z9);
                        try {
                            byte[] bArr = new byte[8192];
                            int i11 = 0;
                            while (true) {
                                int read = byteStream.read(bArr);
                                if (read != -1) {
                                    fileOutputStream.write(bArr, i10, read);
                                    j11 += read;
                                    if (j10 > 0) {
                                        i11 = (int) ((100 * j11) / j10);
                                    }
                                    g2 g2Var = y2Var.f2084a;
                                    g2Var.e.runOnUiThread(new a4.c(g2Var, i11, 5));
                                    if (y2Var.f2085b) {
                                        y2Var.b(context);
                                        fileOutputStream.close();
                                        byteStream.close();
                                        response.close();
                                        return;
                                    }
                                    i10 = 0;
                                } else {
                                    fileOutputStream.flush();
                                    fileOutputStream.close();
                                    byteStream.close();
                                    y2Var.f2085b = true;
                                    g2 g2Var2 = y2Var.f2084a;
                                    g2Var2.e.runOnUiThread(new a1.a(29, g2Var2, context.getResources().getString(R.string.install_go)));
                                    y2.c(file.getAbsolutePath(), context, y2Var.f2084a);
                                    response.close();
                                    return;
                                }
                            }
                        } finally {
                        }
                    } finally {
                    }
                } else {
                    if (response.code() == 416 && file.exists() && file.length() > 0) {
                        y2Var.f2085b = true;
                        g2 g2Var3 = y2Var.f2084a;
                        g2Var3.e.runOnUiThread(new a1.a(29, g2Var3, context.getResources().getString(R.string.install_go)));
                        y2.c(file.getAbsolutePath(), context, y2Var.f2084a);
                        response.close();
                        return;
                    }
                    y2.a(y2Var, context);
                    response.close();
                }
            } catch (Exception unused) {
                y2.a(y2Var, context);
                response.close();
            }
        } catch (Throwable th) {
            response.close();
            throw th;
        }
    }
}
