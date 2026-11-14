package f6;

import j1.i;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import t4.h;
import t4.p;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public String f2346a;

    /* renamed from: b, reason: collision with root package name */
    public int f2347b;
    public int c;
    public final Object d;
    public final Serializable e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2348f;

    /* renamed from: g, reason: collision with root package name */
    public Object f2349g;

    public d(Class cls, Class[] clsArr) {
        this.f2346a = null;
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.e = new HashSet();
        this.f2347b = 0;
        this.c = 0;
        this.f2349g = new HashSet();
        hashSet.add(p.a(cls));
        for (Class cls2 : clsArr) {
            e3.d.c(cls2, "Null interface");
            ((HashSet) this.d).add(p.a(cls2));
        }
    }

    public void a(h hVar) {
        if (!((HashSet) this.d).contains(hVar.f5809a)) {
            ((HashSet) this.e).add(hVar);
        } else {
            i.k("Components are not allowed to depend on interfaces they themselves provide.");
        }
    }

    public t4.a b() {
        boolean z9;
        if (((t4.c) this.f2348f) != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            return new t4.a(this.f2346a, new HashSet((HashSet) this.d), new HashSet((HashSet) this.e), this.f2347b, this.c, (t4.c) this.f2348f, (HashSet) this.f2349g);
        }
        i.l("Missing required property: factory.");
        return null;
    }

    public d(byte[] bArr, String str, List list, String str2, int i10, int i11) {
        this.d = bArr;
        this.f2346a = str;
        this.f2348f = list;
        this.e = str2;
        this.f2347b = i11;
        this.c = i10;
    }

    public d(byte[] bArr, String str, ArrayList arrayList, String str2) {
        this(bArr, str, arrayList, str2, -1, -1);
    }

    public d(p pVar, p[] pVarArr) {
        this.f2346a = null;
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.e = new HashSet();
        this.f2347b = 0;
        this.c = 0;
        this.f2349g = new HashSet();
        hashSet.add(pVar);
        for (p pVar2 : pVarArr) {
            e3.d.c(pVar2, "Null interface");
        }
        Collections.addAll((HashSet) this.d, pVarArr);
    }
}
