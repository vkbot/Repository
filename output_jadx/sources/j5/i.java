package j5;

import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Map;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class i extends h {
    public final l c;
    public final l d;
    public final f e;

    /* renamed from: f, reason: collision with root package name */
    public final a f3304f;

    /* renamed from: g, reason: collision with root package name */
    public final String f3305g;

    public i(l lVar, l lVar2, f fVar, a aVar, String str, Map map) {
        super(MessageType.MODAL, map);
        this.c = lVar;
        this.d = lVar2;
        this.e = fVar;
        this.f3304f = aVar;
        this.f3305g = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        f fVar = iVar.e;
        a aVar = iVar.f3304f;
        l lVar = iVar.d;
        if (hashCode() != iVar.hashCode()) {
            return false;
        }
        l lVar2 = this.d;
        if ((lVar2 == null && lVar != null) || (lVar2 != null && !lVar2.equals(lVar))) {
            return false;
        }
        a aVar2 = this.f3304f;
        if ((aVar2 == null && aVar != null) || (aVar2 != null && !aVar2.equals(aVar))) {
            return false;
        }
        f fVar2 = this.e;
        if ((fVar2 != null || fVar == null) && ((fVar2 == null || fVar2.equals(fVar)) && this.c.equals(iVar.c) && this.f3305g.equals(iVar.f3305g))) {
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
        a aVar = this.f3304f;
        if (aVar != null) {
            i11 = aVar.hashCode();
        } else {
            i11 = 0;
        }
        f fVar = this.e;
        if (fVar != null) {
            i12 = fVar.f3301a.hashCode();
        }
        return this.f3305g.hashCode() + this.c.hashCode() + i10 + i11 + i12;
    }
}
