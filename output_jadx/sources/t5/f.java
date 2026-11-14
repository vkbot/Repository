package t5;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f extends b {

    /* renamed from: b, reason: collision with root package name */
    public final Serializable f5824b;

    public f(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f5824b = bool;
    }

    public static boolean i(f fVar) {
        Serializable serializable = fVar.f5824b;
        if (serializable instanceof Number) {
            Number number = (Number) serializable;
            if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // t5.b
    public final double a() {
        if (this.f5824b instanceof Number) {
            return h().doubleValue();
        }
        return Double.parseDouble(g());
    }

    @Override // t5.b
    public final int d() {
        if (this.f5824b instanceof Number) {
            return h().intValue();
        }
        return Integer.parseInt(g());
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && f.class == obj.getClass()) {
                f fVar = (f) obj;
                Serializable serializable = fVar.f5824b;
                Serializable serializable2 = this.f5824b;
                if (serializable2 == null) {
                    if (serializable == null) {
                        return true;
                    }
                    return false;
                }
                if (i(this) && i(fVar)) {
                    if (h().longValue() == fVar.h().longValue()) {
                        return true;
                    }
                    return false;
                }
                if ((serializable2 instanceof Number) && (serializable instanceof Number)) {
                    double doubleValue = h().doubleValue();
                    double doubleValue2 = fVar.h().doubleValue();
                    if (doubleValue != doubleValue2) {
                        if (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2)) {
                            return true;
                        }
                        return false;
                    }
                    return true;
                }
                return serializable2.equals(serializable);
            }
            return false;
        }
        return true;
    }

    @Override // t5.b
    public final String g() {
        Serializable serializable = this.f5824b;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return h().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final Number h() {
        Serializable serializable = this.f5824b;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new u5.a((String) serializable);
        }
        androidx.navigation.b.g("Primitive is neither a number nor a string");
        return null;
    }

    public final int hashCode() {
        long doubleToLongBits;
        Serializable serializable = this.f5824b;
        if (serializable == null) {
            return 31;
        }
        if (i(this)) {
            doubleToLongBits = h().longValue();
        } else if (serializable instanceof Number) {
            doubleToLongBits = Double.doubleToLongBits(h().doubleValue());
        } else {
            return serializable.hashCode();
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public f(Number number) {
        Objects.requireNonNull(number);
        this.f5824b = number;
    }

    public f(String str) {
        Objects.requireNonNull(str);
        this.f5824b = str;
    }
}
