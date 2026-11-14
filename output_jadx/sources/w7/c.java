package w7;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.support.v4.media.h;
import android.text.TextUtils;
import com.bumptech.glide.manager.n;
import com.google.firebase.components.ComponentRegistrar;
import d0.f;
import d5.p;
import d5.u;
import h.e;
import j1.i;
import j5.d;
import j5.l;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.text.Charsets;
import l9.o;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import q.e0;
import x7.k;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c implements n, f, b8.a, Callback, t8.a, e5.b, l.a, e0 {
    public static c c;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6414b;

    public /* synthetic */ c(int i10) {
        this.f6414b = i10;
    }

    public static h d(d5.n nVar) {
        h hVar = new h(23, false);
        if (!TextUtils.isEmpty(nVar.n())) {
            String n10 = nVar.n();
            if (!TextUtils.isEmpty(n10)) {
                hVar.c = n10;
            }
        }
        return hVar;
    }

    public static j5.a f(d5.n nVar, p pVar) {
        String str;
        String str2;
        h d = d(nVar);
        if (!pVar.equals(p.o())) {
            l lVar = null;
            String str3 = null;
            if (!TextUtils.isEmpty(pVar.n())) {
                str = pVar.n();
            } else {
                str = null;
            }
            if (pVar.q()) {
                u p9 = pVar.p();
                if (!TextUtils.isEmpty(p9.p())) {
                    str2 = p9.p();
                } else {
                    str2 = null;
                }
                if (!TextUtils.isEmpty(p9.o())) {
                    str3 = p9.o();
                }
                if (!TextUtils.isEmpty(str3)) {
                    lVar = new l(str2, str3);
                } else {
                    i.k("Text model must have a color");
                    return null;
                }
            }
            if (!TextUtils.isEmpty(str)) {
                if (lVar != null) {
                    d.d = new d(lVar, str);
                } else {
                    i.k("Button model must have text");
                    return null;
                }
            } else {
                i.k("Button model must have a color");
                return null;
            }
        }
        return new j5.a((String) d.c, (d) d.d);
    }

    public static l g(u uVar) {
        String str;
        String str2 = null;
        if (!TextUtils.isEmpty(uVar.o())) {
            str = uVar.o();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(uVar.p())) {
            str2 = uVar.p();
        }
        if (!TextUtils.isEmpty(str)) {
            return new l(str2, str);
        }
        i.k("Text model must have a color");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x007a, code lost:
    
        r6 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l9.o i(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.c.i(java.lang.String):l9.o");
    }

    public static o j(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) (m9.b.a(str.charAt(i11 + 1)) + (m9.b.a(str.charAt(i11)) << 4));
            }
            return new o(bArr);
        }
        l9.i.d("Unexpected hex string: ".concat(str));
        return null;
    }

    public static o k(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        o oVar = new o(bytes);
        oVar.d = str;
        return oVar;
    }

    public static o l(byte[] bArr) {
        o oVar = o.e;
        bArr.getClass();
        int length = bArr.length;
        l9.b.d(bArr.length, 0, length);
        return new o(ArraysKt.copyOfRange(bArr, 0, length));
    }

    @Override // l.a
    public File c(e eVar) {
        return null;
    }

    @Override // q.e0
    public void e(MediaExtractor mediaExtractor, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    @Override // t8.a
    public Object get() {
        switch (this.f6414b) {
            case 6:
                return new j5.b(1L, 86400000L);
            case 7:
            default:
                return new Object();
            case 8:
                return "firebaseinappmessaging.googleapis.com";
            case 9:
                k kVar = r8.f.f5446a;
                a.a.e(kVar);
                return kVar;
        }
    }

    @Override // q.e0
    public void h(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    public List m(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (t4.a aVar : componentRegistrar.getComponents()) {
            String str = aVar.f5795a;
            if (str != null) {
                aVar = new t4.a(str, aVar.f5796b, aVar.c, aVar.d, aVar.e, new f5.f(25, str, aVar), aVar.f5798g);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.h, java.lang.Object] */
    public l.h n(Context context, v2.b bVar) {
        int c10;
        ?? obj = new Object();
        obj.f3485a = 0;
        obj.f3486b = 0;
        obj.c = 0;
        int a10 = bVar.a(context);
        obj.f3485a = a10;
        int i10 = 1;
        int i11 = 0;
        if (a10 != 0) {
            c10 = bVar.c(context, false);
            obj.f3486b = c10;
        } else {
            c10 = bVar.c(context, true);
            obj.f3486b = c10;
        }
        int i12 = obj.f3485a;
        if (i12 == 0) {
            if (c10 == 0) {
                i10 = 0;
                obj.c = i10;
                return obj;
            }
        } else {
            i11 = i12;
        }
        if (i11 >= c10) {
            i10 = -1;
        }
        obj.c = i10;
        return obj;
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        try {
            try {
                response.body();
                response.close();
            } finally {
            }
        } catch (Exception unused) {
        }
    }

    public String toString() {
        switch (this.f6414b) {
            case 4:
                return "EmptyAction";
            default:
                return super.toString();
        }
    }

    @Override // b8.a
    public void run() {
    }

    @Override // d0.f
    public void a(Object obj) {
    }

    @Override // l.a
    public void b(e eVar, a5.h hVar) {
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException iOException) {
    }
}
