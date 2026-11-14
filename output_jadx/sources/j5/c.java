package j5;

import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Map;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c extends h {
    public final l c;
    public final l d;
    public final f e;

    /* renamed from: f, reason: collision with root package name */
    public final a f3293f;

    /* renamed from: g, reason: collision with root package name */
    public final String f3294g;

    public c(l lVar, l lVar2, f fVar, a aVar, String str, Map map) {
        super(MessageType.BANNER, map);
        this.c = lVar;
        this.d = lVar2;
        this.e = fVar;
        this.f3293f = aVar;
        this.f3294g = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        a aVar = cVar.f3293f;
        f fVar = cVar.e;
        l lVar = cVar.d;
        if (hashCode() != cVar.hashCode()) {
            return false;
        }
        l lVar2 = this.d;
        if ((lVar2 == null && lVar != null) || (lVar2 != null && !lVar2.equals(lVar))) {
            return false;
        }
        f fVar2 = this.e;
        if ((fVar2 == null && fVar != null) || (fVar2 != null && !fVar2.equals(fVar))) {
            return false;
        }
        a aVar2 = this.f3293f;
        if ((aVar2 != null || aVar == null) && ((aVar2 == null || aVar2.equals(aVar)) && this.c.equals(cVar.c) && this.f3294g.equals(cVar.f3294g))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        l lVar = this.d;
        if (lVar != null) {
            i10 = lVar.hashCode();
        } else {
            i10 = 0;
        }
        f fVar = this.e;
        if (fVar != null) {
            i11 = fVar.f3301a.hashCode();
        } else {
            i11 = 0;
        }
        a aVar = this.f3293f;
        if (aVar != null) {
            i12 = aVar.hashCode();
        }
        return this.f3294g.hashCode() + this.c.hashCode() + i10 + i11 + i12;
    }
}
