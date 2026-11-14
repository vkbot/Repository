package v7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import n7.f0;
import n7.h0;
import o7.g3;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class w extends h0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5994a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f5995b;
    public final int c;

    public w(ArrayList arrayList, AtomicInteger atomicInteger) {
        o4.b.d("empty list", !arrayList.isEmpty());
        this.f5994a = arrayList;
        o4.b.i(atomicInteger, "index");
        this.f5995b = atomicInteger;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            i10 += ((h0) obj).hashCode();
        }
        this.c = i10;
    }

    @Override // n7.h0
    public final f0 a(g3 g3Var) {
        int andIncrement = this.f5995b.getAndIncrement() & Integer.MAX_VALUE;
        ArrayList arrayList = this.f5994a;
        return ((h0) arrayList.get(andIncrement % arrayList.size())).a(g3Var);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            ArrayList arrayList = wVar.f5994a;
            if (wVar != this) {
                if (this.c == wVar.c && this.f5995b == wVar.f5995b) {
                    ArrayList arrayList2 = this.f5994a;
                    if (arrayList2.size() == arrayList.size() && new HashSet(arrayList2).containsAll(arrayList)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        com.bumptech.glide.manager.s sVar = new com.bumptech.glide.manager.s(w.class.getSimpleName());
        sVar.c(this.f5994a, "subchannelPickers");
        return sVar.toString();
    }
}
