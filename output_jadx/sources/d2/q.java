package d2;

import android.util.Base64;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class q {
    public final String toString() {
        String encodeToString;
        j jVar = (j) this;
        byte[] bArr = jVar.f1746b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(jVar.f1745a);
        sb.append(", ");
        sb.append(jVar.c);
        sb.append(", ");
        return ai.onnxruntime.a.p(sb, encodeToString, ")");
    }
}
