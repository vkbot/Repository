package j4;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class g extends a implements Set {
    public static final /* synthetic */ int d = 0;
    public transient e c;

    public static int i(int i10) {
        int max = Math.max(i10, 2);
        boolean z9 = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z9 = false;
        }
        o4.b.d("collection too large", z9);
        return BasicMeasure.EXACTLY;
    }

    public static g j(int i10, Object... objArr) {
        if (i10 != 0) {
            if (i10 != 1) {
                int i11 = i(i10);
                Object[] objArr2 = new Object[i11];
                int i12 = i11 - 1;
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < i10; i15++) {
                    Object obj = objArr[i15];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int s5 = com.bumptech.glide.c.s(hashCode);
                        while (true) {
                            int i16 = s5 & i12;
                            Object obj2 = objArr2[i16];
                            if (obj2 == null) {
                                objArr[i14] = obj;
                                objArr2[i16] = obj;
                                i13 += hashCode;
                                i14++;
                                break;
                            }
                            if (obj2.equals(obj)) {
                                break;
                            }
                            s5++;
                        }
                    } else {
                        n0.b.n(ai.onnxruntime.a.e(i15, "at index "));
                        return null;
                    }
                }
                Arrays.fill(objArr, i14, i10, (Object) null);
                if (i14 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new p(obj3);
                }
                if (i(i14) < i11 / 2) {
                    return j(i14, objArr);
                }
                int length = objArr.length;
                if (i14 < (length >> 1) + (length >> 2)) {
                    objArr = Arrays.copyOf(objArr, i14);
                }
                return new o(objArr, objArr2, i13, i12, i14);
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new p(obj4);
        }
        return o.f3284k;
    }

    @Override // j4.a
    public e a() {
        e eVar = this.c;
        if (eVar == null) {
            e k6 = k();
            this.c = k6;
            return k6;
        }
        return eVar;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof g) && (this instanceof o) && (((g) obj) instanceof o) && hashCode() != obj.hashCode()) {
            return false;
        }
        if (this != obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (size() == set.size()) {
                        if (containsAll(set)) {
                        }
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int i10;
        int i11 = 0;
        for (Object obj : this) {
            if (obj != null) {
                i10 = obj.hashCode();
            } else {
                i10 = 0;
            }
            i11 = ~(~(i11 + i10));
        }
        return i11;
    }

    public e k() {
        Object[] array = toArray(a.f3266b);
        c cVar = e.c;
        return e.i(array.length, array);
    }
}
