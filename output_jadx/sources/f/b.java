package f;

import com.bumptech.glide.manager.s;
import java.io.File;
import org.apache.commons.io.FilenameUtils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f2219a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f2220b;
    public final File[] c;
    public final File[] d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public s f2221f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f2222g;

    public b(c cVar, String str) {
        this.f2222g = cVar;
        this.f2219a = str;
        int i10 = cVar.f2226h;
        File file = cVar.f2223b;
        this.f2220b = new long[i10];
        this.c = new File[i10];
        this.d = new File[i10];
        StringBuilder sb = new StringBuilder(str);
        sb.append(FilenameUtils.EXTENSION_SEPARATOR);
        int length = sb.length();
        for (int i11 = 0; i11 < i10; i11++) {
            sb.append(i11);
            this.c[i11] = new File(file, sb.toString());
            sb.append(".tmp");
            this.d[i11] = new File(file, sb.toString());
            sb.setLength(length);
        }
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        for (long j10 : this.f2220b) {
            sb.append(' ');
            sb.append(j10);
        }
        return sb.toString();
    }
}
