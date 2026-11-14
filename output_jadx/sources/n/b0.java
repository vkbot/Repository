package n;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b0 implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4002a;

    /* renamed from: b, reason: collision with root package name */
    public final r f4003b;

    public /* synthetic */ b0(r rVar, int i10) {
        this.f4002a = i10;
        this.f4003b = rVar;
    }

    @Override // n.r
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        switch (this.f4002a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override // n.r
    public final q b(Object obj, int i10, int i11, h.h hVar) {
        Uri uri;
        switch (this.f4002a) {
            case 0:
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    uri = null;
                } else if (str.charAt(0) == '/') {
                    uri = Uri.fromFile(new File(str));
                } else {
                    Uri parse = Uri.parse(str);
                    if (parse.getScheme() == null) {
                        uri = Uri.fromFile(new File(str));
                    } else {
                        uri = parse;
                    }
                }
                if (uri == null) {
                    return null;
                }
                r rVar = this.f4003b;
                if (!rVar.a(uri)) {
                    return null;
                }
                return rVar.b(uri, i10, i11, hVar);
            default:
                return this.f4003b.b(new g((URL) obj), i10, i11, hVar);
        }
    }
}
