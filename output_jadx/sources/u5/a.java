package u5;

import java.math.BigDecimal;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a extends Number {

    /* renamed from: b, reason: collision with root package name */
    public final String f5884b;

    public a(String str) {
        this.f5884b = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f5884b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        Object obj2 = ((a) obj).f5884b;
        String str = this.f5884b;
        if (str == obj2 || str.equals(obj2)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f5884b);
    }

    public final int hashCode() {
        return this.f5884b.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f5884b;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f5884b;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    public final String toString() {
        return this.f5884b;
    }
}
