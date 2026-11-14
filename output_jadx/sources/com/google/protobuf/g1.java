package com.google.protobuf;

import java.util.Map;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class g1 implements Map.Entry, Comparable {

    /* renamed from: b, reason: collision with root package name */
    public final Comparable f1566b;
    public Object c;
    public final /* synthetic */ d1 d;

    public g1(d1 d1Var, Comparable comparable, Object obj) {
        this.d = d1Var;
        this.f1566b = comparable;
        this.c = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f1566b.compareTo(((g1) obj).f1566b);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f1566b;
                if (comparable == null) {
                    if (key == null) {
                        equals = true;
                    } else {
                        equals = false;
                    }
                } else {
                    equals = comparable.equals(key);
                }
                if (equals) {
                    Object obj2 = this.c;
                    Object value = entry.getValue();
                    if (obj2 == null) {
                        if (value == null) {
                            equals2 = true;
                        } else {
                            equals2 = false;
                        }
                    } else {
                        equals2 = obj2.equals(value);
                    }
                    if (equals2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f1566b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Comparable comparable = this.f1566b;
        if (comparable == null) {
            hashCode = 0;
        } else {
            hashCode = comparable.hashCode();
        }
        Object obj = this.c;
        if (obj != null) {
            i10 = obj.hashCode();
        }
        return i10 ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.d.b();
        Object obj2 = this.c;
        this.c = obj;
        return obj2;
    }

    public final String toString() {
        return this.f1566b + "=" + this.c;
    }
}
