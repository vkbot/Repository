package f;

import j1.i;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d extends ByteArrayOutputStream {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f2234b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, int i10) {
        super(i10);
        this.f2234b = eVar;
    }

    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        int i10 = ((ByteArrayOutputStream) this).count;
        if (i10 > 0) {
            int i11 = i10 - 1;
            if (((ByteArrayOutputStream) this).buf[i11] == 13) {
                i10 = i11;
            }
        }
        try {
            return new String(((ByteArrayOutputStream) this).buf, 0, i10, this.f2234b.c.name());
        } catch (UnsupportedEncodingException e) {
            i.e(e);
            return null;
        }
    }
}
