package j5;

import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Map;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e extends h {
    public final l c;
    public final l d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final a f3297f;

    /* renamed from: g, reason: collision with root package name */
    public final a f3298g;

    /* renamed from: h, reason: collision with root package name */
    public final f f3299h;

    /* renamed from: i, reason: collision with root package name */
    public final f f3300i;

    public e(l lVar, l lVar2, f fVar, f fVar2, String str, a aVar, a aVar2, Map map) {
        super(MessageType.CARD, map);
        this.c = lVar;
        this.d = lVar2;
        this.f3299h = fVar;
        this.f3300i = fVar2;
        this.e = str;
        this.f3297f = aVar;
        this.f3298g = aVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        f fVar = eVar.f3300i;
        f fVar2 = eVar.f3299h;
        a aVar = eVar.f3298g;
        l lVar = eVar.d;
        if (hashCode() != eVar.hashCode()) {
            return false;
        }
        l lVar2 = this.d;
        if ((lVar2 == null && lVar != null) || (lVar2 != null && !lVar2.equals(lVar))) {
            return false;
        }
        a aVar2 = this.f3298g;
        if ((aVar2 == null && aVar != null) || (aVar2 != null && !aVar2.equals(aVar))) {
            return false;
        }
        f fVar3 = this.f3299h;
        if ((fVar3 == null && fVar2 != null) || (fVar3 != null && !fVar3.equals(fVar2))) {
            return false;
        }
        f fVar4 = this.f3300i;
        if ((fVar4 != null || fVar == null) && ((fVar4 == null || fVar4.equals(fVar)) && this.c.equals(eVar.c) && this.f3297f.equals(eVar.f3297f) && this.e.equals(eVar.e))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        l lVar = this.d;
        if (lVar != null) {
            i10 = lVar.hashCode();
        } else {
            i10 = 0;
        }
        a aVar = this.f3298g;
        if (aVar != null) {
            i11 = aVar.hashCode();
        } else {
            i11 = 0;
        }
        f fVar = this.f3299h;
        if (fVar != null) {
            i12 = fVar.f3301a.hashCode();
        } else {
            i12 = 0;
        }
        f fVar2 = this.f3300i;
        if (fVar2 != null) {
            i13 = fVar2.f3301a.hashCode();
        }
        return this.f3297f.hashCode() + this.e.hashCode() + this.c.hashCode() + i10 + i11 + i12 + i13;
    }
}
