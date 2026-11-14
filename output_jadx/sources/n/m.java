package n;

import android.content.Context;
import android.net.Uri;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class m implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4026a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f4027b;

    public m(Context context, int i10) {
        this.f4026a = i10;
        switch (i10) {
            case 1:
                this.f4027b = context.getApplicationContext();
                return;
            case 2:
                this.f4027b = context.getApplicationContext();
                return;
            default:
                this.f4027b = context;
                return;
        }
    }

    @Override // n.r
    public final boolean a(Object obj) {
        switch (this.f4026a) {
            case 0:
                return a.a.n((Uri) obj);
            case 1:
                Uri uri = (Uri) obj;
                if (a.a.n(uri) && !uri.getPathSegments().contains("video")) {
                    return true;
                }
                return false;
            default:
                Uri uri2 = (Uri) obj;
                if (a.a.n(uri2) && uri2.getPathSegments().contains("video")) {
                    return true;
                }
                return false;
        }
    }

    @Override // n.r
    public final q b(Object obj, int i10, int i11, h.h hVar) {
        Long l10;
        switch (this.f4026a) {
            case 0:
                Uri uri = (Uri) obj;
                return new q(new b0.b(uri), new l(0, this.f4027b, uri));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i10 != Integer.MIN_VALUE && i11 != Integer.MIN_VALUE && i10 <= 512 && i11 <= 384) {
                    b0.b bVar = new b0.b(uri2);
                    Context context = this.f4027b;
                    return new q(bVar, i.b.d(context, uri2, new i.a(context.getContentResolver(), 0)));
                }
                return null;
            default:
                Uri uri3 = (Uri) obj;
                if (i10 != Integer.MIN_VALUE && i11 != Integer.MIN_VALUE && i10 <= 512 && i11 <= 384 && (l10 = (Long) hVar.c(q.f0.d)) != null && l10.longValue() == -1) {
                    b0.b bVar2 = new b0.b(uri3);
                    Context context2 = this.f4027b;
                    return new q(bVar2, i.b.d(context2, uri3, new i.a(context2.getContentResolver(), 1)));
                }
                return null;
        }
    }
}
