package i9;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class l1 extends u {

    /* renamed from: b, reason: collision with root package name */
    public final KClass f2918b;
    public final c c;

    public l1(KClass kClass, e9.b bVar) {
        super(bVar);
        this.f2918b = kClass;
        g9.e a10 = bVar.a();
        a10.getClass();
        this.c = new c(a10, 0);
    }

    @Override // e9.h, e9.a
    public final g9.e a() {
        return this.c;
    }

    @Override // i9.a
    public final Object d() {
        return new ArrayList();
    }

    @Override // i9.a
    public final int e(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList.size();
    }

    @Override // i9.a
    public final void f(int i10, Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        arrayList.ensureCapacity(i10);
    }

    @Override // i9.a
    public final Iterator g(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return ArrayIteratorKt.iterator(objArr);
    }

    @Override // i9.a
    public final int h(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return objArr.length;
    }

    @Override // i9.a
    public final Object l(Object obj) {
        throw null;
    }

    @Override // i9.a
    public final Object m(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        Object newInstance = Array.newInstance((Class<?>) JvmClassMappingKt.getJavaClass(this.f2918b), arrayList.size());
        newInstance.getClass();
        Object[] array = arrayList.toArray((Object[]) newInstance);
        array.getClass();
        return array;
    }

    @Override // i9.u
    public final void n(int i10, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        arrayList.add(i10, obj2);
    }
}
