package com.google.protobuf;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public static volatile p f1603b;
    public static final p c = new p();

    /* renamed from: a, reason: collision with root package name */
    public final Map f1604a = Collections.EMPTY_MAP;

    public static p a() {
        p pVar;
        p pVar2 = f1603b;
        if (pVar2 == null) {
            synchronized (p.class) {
                try {
                    pVar = f1603b;
                    if (pVar == null) {
                        Class cls = o.f1601a;
                        p pVar3 = null;
                        if (cls != null) {
                            try {
                                pVar3 = (p) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (pVar3 != null) {
                            pVar = pVar3;
                        } else {
                            pVar = c;
                        }
                        f1603b = pVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return pVar;
        }
        return pVar2;
    }
}
