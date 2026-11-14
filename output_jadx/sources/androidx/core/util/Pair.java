package androidx.core.util;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class Pair<F, S> {
    public final F first;
    public final S second;

    public Pair(F f8, S s5) {
        this.first = f8;
        this.second = s5;
    }

    @NonNull
    public static <A, B> Pair<A, B> create(A a10, B b10) {
        return new Pair<>(a10, b10);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        if (!ObjectsCompat.equals(pair.first, this.first) || !ObjectsCompat.equals(pair.second, this.second)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        F f8 = this.first;
        int i10 = 0;
        if (f8 == null) {
            hashCode = 0;
        } else {
            hashCode = f8.hashCode();
        }
        S s5 = this.second;
        if (s5 != null) {
            i10 = s5.hashCode();
        }
        return hashCode ^ i10;
    }

    @NonNull
    public String toString() {
        return "Pair{" + this.first + " " + this.second + "}";
    }
}
