package u;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import h.j;
import j.d0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h implements j {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5863a;

    /* renamed from: b, reason: collision with root package name */
    public final a f5864b;
    public final k.g c;

    public h(ArrayList arrayList, a aVar, k.g gVar) {
        this.f5863a = arrayList;
        this.f5864b = aVar;
        this.c = gVar;
    }

    @Override // h.j
    public final d0 a(Object obj, int i10, int i11, h.h hVar) {
        byte[] bArr;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.f5864b.a(ByteBuffer.wrap(bArr), i10, i11, hVar);
    }

    @Override // h.j
    public final boolean b(Object obj, h.h hVar) {
        InputStream inputStream = (InputStream) obj;
        if (!((Boolean) hVar.c(g.f5862b)).booleanValue() && o4.b.v(this.f5863a, inputStream, this.c) == ImageHeaderParser$ImageType.GIF) {
            return true;
        }
        return false;
    }
}
