package com.bumptech.glide;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a implements Cloneable {

    /* renamed from: b, reason: collision with root package name */
    public a0.a f608b;

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a clone() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException e) {
            n0.b.w(e);
            return null;
        }
    }

    public final boolean b(Object obj) {
        if (obj instanceof a) {
            return c0.p.b(this.f608b, ((a) obj).f608b);
        }
        return false;
    }

    public final int c() {
        a0.a aVar = this.f608b;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof a) && b(obj)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return c();
    }
}
