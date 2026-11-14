package androidx.collection;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010(\n\u0000\u001a!\u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\u0001H\u0086\n\u001aT\u0010\t\u001a\u00020\n\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000326\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\b\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\n0\fH\u0086\bø\u0001\u0000\u001a.\u0010\u0010\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u0002H\u0002H\u0086\b¢\u0006\u0002\u0010\u0012\u001a7\u0010\u0013\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0014H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001a\u0019\u0010\u0016\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0086\b\u001a\u0016\u0010\u0017\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a-\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0086\u0002\u001a-\u0010\u001b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u0002H\u0002H\u0007¢\u0006\u0002\u0010\u001c\u001a.\u0010\u001d\u001a\u00020\n\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u0002H\u0002H\u0086\n¢\u0006\u0002\u0010\u001e\u001a\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00020 \"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\"\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006!"}, d2 = {"size", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/collection/SparseArrayCompat;", "getSize", "(Landroidx/collection/SparseArrayCompat;)I", "contains", "", "key", "forEach", "", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "getOrDefault", "defaultValue", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;)Ljava/lang/Object;", "getOrElse", "Lkotlin/Function0;", "(Landroidx/collection/SparseArrayCompat;ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isNotEmpty", "keyIterator", "Lkotlin/collections/IntIterator;", "plus", "other", "remove", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;)Z", "set", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;)V", "valueIterator", "", "collection"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class SparseArrayKt {
    public static final <T> boolean contains(SparseArrayCompat<T> sparseArrayCompat, int i10) {
        sparseArrayCompat.getClass();
        return sparseArrayCompat.containsKey(i10);
    }

    public static final <T> void forEach(SparseArrayCompat<T> sparseArrayCompat, Function2<? super Integer, ? super T, Unit> function2) {
        sparseArrayCompat.getClass();
        function2.getClass();
        int size = sparseArrayCompat.size();
        for (int i10 = 0; i10 < size; i10++) {
            function2.invoke(Integer.valueOf(sparseArrayCompat.keyAt(i10)), sparseArrayCompat.valueAt(i10));
        }
    }

    public static final <T> T getOrDefault(SparseArrayCompat<T> sparseArrayCompat, int i10, T t) {
        sparseArrayCompat.getClass();
        return sparseArrayCompat.get(i10, t);
    }

    public static final <T> T getOrElse(SparseArrayCompat<T> sparseArrayCompat, int i10, Function0<? extends T> function0) {
        sparseArrayCompat.getClass();
        function0.getClass();
        T t = sparseArrayCompat.get(i10);
        if (t == null) {
            return function0.invoke();
        }
        return t;
    }

    public static final <T> int getSize(SparseArrayCompat<T> sparseArrayCompat) {
        sparseArrayCompat.getClass();
        return sparseArrayCompat.size();
    }

    public static final <T> boolean isNotEmpty(SparseArrayCompat<T> sparseArrayCompat) {
        sparseArrayCompat.getClass();
        return !sparseArrayCompat.isEmpty();
    }

    public static final <T> IntIterator keyIterator(final SparseArrayCompat<T> sparseArrayCompat) {
        sparseArrayCompat.getClass();
        return new IntIterator() { // from class: androidx.collection.SparseArrayKt$keyIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.index < sparseArrayCompat.size()) {
                    return true;
                }
                return false;
            }

            @Override // kotlin.collections.IntIterator
            public int nextInt() {
                SparseArrayCompat<T> sparseArrayCompat2 = sparseArrayCompat;
                int i10 = this.index;
                this.index = i10 + 1;
                return sparseArrayCompat2.keyAt(i10);
            }

            public final void setIndex(int i10) {
                this.index = i10;
            }
        };
    }

    public static final <T> SparseArrayCompat<T> plus(SparseArrayCompat<T> sparseArrayCompat, SparseArrayCompat<T> sparseArrayCompat2) {
        sparseArrayCompat.getClass();
        sparseArrayCompat2.getClass();
        SparseArrayCompat<T> sparseArrayCompat3 = new SparseArrayCompat<>(sparseArrayCompat2.size() + sparseArrayCompat.size());
        sparseArrayCompat3.putAll(sparseArrayCompat);
        sparseArrayCompat3.putAll(sparseArrayCompat2);
        return sparseArrayCompat3;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replaced with member function. Remove extension import!")
    public static final /* synthetic */ boolean remove(SparseArrayCompat sparseArrayCompat, int i10, Object obj) {
        sparseArrayCompat.getClass();
        return sparseArrayCompat.remove(i10, obj);
    }

    public static final <T> void set(SparseArrayCompat<T> sparseArrayCompat, int i10, T t) {
        sparseArrayCompat.getClass();
        sparseArrayCompat.put(i10, t);
    }

    public static final <T> Iterator<T> valueIterator(SparseArrayCompat<T> sparseArrayCompat) {
        sparseArrayCompat.getClass();
        return new SparseArrayKt$valueIterator$1(sparseArrayCompat);
    }
}
