package i9;

import androidx.navigation.serialization.RouteDecoder;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class b implements e9.b {
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    @Override // e9.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(h9.b r8, java.lang.Object r9) {
        /*
            r7 = this;
            r9.getClass()
            j9.b r0 = r8.getSerializersModule()
            r1 = r7
            e9.e r1 = (e9.e) r1
            j9.a r0 = (j9.a) r0
            r0.getClass()
            kotlin.reflect.KClass r2 = r1.f2212a
            r2.getClass()
            boolean r3 = r2.isInstance(r9)
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L1d
            goto L58
        L1d:
            java.util.Map r3 = r0.f3351b
            java.lang.Object r3 = r3.get(r2)
            java.util.Map r3 = (java.util.Map) r3
            if (r3 == 0) goto L36
            java.lang.Class r6 = r9.getClass()
            kotlin.reflect.KClass r6 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r6)
            java.lang.Object r3 = r3.get(r6)
            e9.b r3 = (e9.b) r3
            goto L37
        L36:
            r3 = r5
        L37:
            if (r3 == 0) goto L3a
            goto L3b
        L3a:
            r3 = r5
        L3b:
            if (r3 == 0) goto L3e
            goto L59
        L3e:
            java.util.Map r0 = r0.c
            java.lang.Object r0 = r0.get(r2)
            boolean r3 = kotlin.jvm.internal.TypeIntrinsics.isFunctionOfArity(r0, r4)
            if (r3 == 0) goto L4d
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            goto L4e
        L4d:
            r0 = r5
        L4e:
            if (r0 == 0) goto L58
            java.lang.Object r0 = r0.invoke(r9)
            r3 = r0
            e9.h r3 = (e9.h) r3
            goto L59
        L58:
            r3 = r5
        L59:
            if (r3 != 0) goto L74
            java.lang.Class r8 = r9.getClass()
            kotlin.reflect.KClass r8 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r8)
            r8.getClass()
            java.lang.String r9 = r8.getSimpleName()
            if (r9 != 0) goto L70
            java.lang.String r9 = java.lang.String.valueOf(r8)
        L70:
            i9.d1.i(r9, r2)
            throw r5
        L74:
            g9.e r0 = r1.a()
            h9.d r8 = r8.beginStructure(r0)
            g9.e r2 = r1.a()
            g9.e r5 = r3.a()
            java.lang.String r5 = r5.a()
            r6 = 0
            r8.encodeStringElement(r2, r6, r5)
            g9.e r1 = r1.a()
            r8.encodeSerializableElement(r1, r4, r3, r9)
            r8.endStructure(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.b.b(h9.b, java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [T, java.lang.String] */
    @Override // e9.a
    public final Object c(RouteDecoder routeDecoder) {
        Object obj;
        e9.e eVar = (e9.e) this;
        g9.e a10 = eVar.a();
        h9.c beginStructure = routeDecoder.beginStructure(a10);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (beginStructure.decodeSequentially()) {
            obj = beginStructure.decodeSerializableElement(eVar.a(), 1, com.bumptech.glide.c.j(this, beginStructure, beginStructure.decodeStringElement(eVar.a(), 0)), null);
        } else {
            Object obj2 = null;
            while (true) {
                int decodeElementIndex = beginStructure.decodeElementIndex(eVar.a());
                if (decodeElementIndex != -1) {
                    if (decodeElementIndex != 0) {
                        T t = objectRef.element;
                        if (decodeElementIndex != 1) {
                            StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                            String str = (String) t;
                            if (str == null) {
                                str = "unknown class";
                            }
                            sb.append(str);
                            sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                            sb.append(decodeElementIndex);
                            throw new IllegalArgumentException(sb.toString());
                        }
                        if (t != 0) {
                            objectRef.element = t;
                            obj2 = beginStructure.decodeSerializableElement(eVar.a(), decodeElementIndex, com.bumptech.glide.c.j(this, beginStructure, (String) t), null);
                        } else {
                            j1.i.k("Cannot read polymorphic value before its type token");
                            return null;
                        }
                    } else {
                        objectRef.element = beginStructure.decodeStringElement(eVar.a(), decodeElementIndex);
                    }
                } else if (obj2 != null) {
                    obj = obj2;
                } else {
                    l9.i.e((String) objectRef.element, "Polymorphic value has not been read for class ");
                    return null;
                }
            }
        }
        beginStructure.endStructure(a10);
        return obj;
    }
}
