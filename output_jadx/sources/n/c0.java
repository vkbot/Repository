package n;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c0 implements s, h.b {
    public static final c0 c = new c0(0);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4006b;

    public /* synthetic */ c0(int i10) {
        this.f4006b = i10;
    }

    public static ByteArrayInputStream a(String str) {
        if (str.startsWith("data:image")) {
            int indexOf = str.indexOf(44);
            if (indexOf != -1) {
                if (str.substring(0, indexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                }
                j1.i.k("Not a base64 image data URL.");
                return null;
            }
            j1.i.k("Missing comma in data URL.");
            return null;
        }
        j1.i.k("Not a valid image data URL.");
        return null;
    }

    public Class b() {
        switch (this.f4006b) {
            case 1:
                return ByteBuffer.class;
            case 3:
                return InputStream.class;
            case 8:
                return ParcelFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // h.b
    public boolean h(Object obj, File file, h.h hVar) {
        try {
            c0.b.d((ByteBuffer) obj, file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e);
                return false;
            }
            return false;
        }
    }

    @Override // n.s
    public r j(z zVar) {
        switch (this.f4006b) {
            case 0:
                return d0.f4008b;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 9:
            default:
                return new g0(zVar.b(g.class, InputStream.class));
            case 2:
                return new c(0, new c0(1));
            case 4:
                return new c(0, new c0(3));
            case 6:
                return new d0(1);
            case 10:
                return new b0(zVar.b(Uri.class, AssetFileDescriptor.class), 0);
            case 11:
                return new b0(zVar.b(Uri.class, ParcelFileDescriptor.class), 0);
            case 12:
                return new b0(zVar.b(Uri.class, InputStream.class), 0);
        }
    }
}
