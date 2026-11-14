package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a.\u0010\u0002\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u0002H\u0004H\u0080\b¢\u0006\u0002\u0010\t\u001a\u0019\u0010\n\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u0080\b\u001a!\u0010\u000b\u001a\u00020\f\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0080\b\u001a&\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\b\u001a\u0002H\u0004H\u0080\b¢\u0006\u0002\u0010\u000e\u001a'\u0010\u000f\u001a\u0004\u0018\u0001H\u0004\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\u0010\u0010\u001a-\u0010\u000f\u001a\u0002H\u0004\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u0002H\u0004H\u0000¢\u0006\u0002\u0010\u0012\u001a!\u0010\u0013\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0080\b\u001a&\u0010\u0014\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\b\u001a\u0002H\u0004H\u0080\b¢\u0006\u0002\u0010\u0015\u001a\u0019\u0010\u0016\u001a\u00020\f\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u0080\b\u001a!\u0010\u0017\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0018\u001a\u00020\u0007H\u0080\b\u001a.\u0010\u0019\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u0002H\u0004H\u0080\b¢\u0006\u0002\u0010\t\u001a)\u0010\u001a\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u000e\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00040\u0005H\u0080\b\u001a0\u0010\u001c\u001a\u0004\u0018\u0001H\u0004\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u0002H\u0004H\u0080\b¢\u0006\u0002\u0010\u0012\u001a \u0010\u001d\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a+\u0010\u001d\u001a\u00020\f\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0080\b\u001a!\u0010\u001e\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0018\u001a\u00020\u0007H\u0080\b\u001a)\u0010\u001f\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0080\b\u001a0\u0010!\u001a\u0004\u0018\u0001H\u0004\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u0002H\u0004H\u0080\b¢\u0006\u0002\u0010\u0012\u001a6\u0010!\u001a\u00020\f\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\"\u001a\u0002H\u00042\u0006\u0010#\u001a\u0002H\u0004H\u0080\b¢\u0006\u0002\u0010$\u001a.\u0010%\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\b\u001a\u0002H\u0004H\u0080\b¢\u0006\u0002\u0010\t\u001a\u0019\u0010&\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u0080\b\u001a\u0019\u0010'\u001a\u00020(\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u0080\b\u001a&\u0010)\u001a\u0002H\u0004\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0018\u001a\u00020\u0007H\u0080\b¢\u0006\u0002\u0010\u0010\u001a\u0018\u0010*\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u0002\u001a:\u0010+\u001a\u0002H,\"\u0004\b\u0000\u0010\u0004\"\n\b\u0001\u0010,*\u0004\u0018\u0001H\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u0002H,H\u0082\b¢\u0006\u0002\u0010\u0012\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"DELETED", "", "commonAppend", "", ExifInterface.LONGITUDE_EAST, "Landroidx/collection/SparseArrayCompat;", "key", "", "value", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;)V", "commonClear", "commonContainsKey", "", "commonContainsValue", "(Landroidx/collection/SparseArrayCompat;Ljava/lang/Object;)Z", "commonGet", "(Landroidx/collection/SparseArrayCompat;I)Ljava/lang/Object;", "defaultValue", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;)Ljava/lang/Object;", "commonIndexOfKey", "commonIndexOfValue", "(Landroidx/collection/SparseArrayCompat;Ljava/lang/Object;)I", "commonIsEmpty", "commonKeyAt", "index", "commonPut", "commonPutAll", "other", "commonPutIfAbsent", "commonRemove", "commonRemoveAt", "commonRemoveAtRange", "size", "commonReplace", "oldValue", "newValue", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;Ljava/lang/Object;)Z", "commonSetValueAt", "commonSize", "commonToString", "", "commonValueAt", "gc", "internalGet", ExifInterface.GPS_DIRECTION_TRUE, "collection"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSparseArrayCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n*L\n1#1,535:1\n244#1,6:536\n244#1,6:542\n353#1,40:548\n353#1,40:588\n459#1,9:628\n*S KotlinDebug\n*F\n+ 1 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n*L\n255#1:536,6\n260#1:542,6\n397#1:548,40\n405#1:588,40\n477#1:628,9\n*E\n"})
/* loaded from: classes.dex */
public final class SparseArrayCompatKt {
    private static final Object DELETED = new Object();

    public static final <E> void commonAppend(SparseArrayCompat<E> sparseArrayCompat, int i10, E e) {
        sparseArrayCompat.getClass();
        int i11 = sparseArrayCompat.size;
        if (i11 != 0 && i10 <= sparseArrayCompat.keys[i11 - 1]) {
            sparseArrayCompat.put(i10, e);
            return;
        }
        if (sparseArrayCompat.garbage && i11 >= sparseArrayCompat.keys.length) {
            gc(sparseArrayCompat);
        }
        int i12 = sparseArrayCompat.size;
        if (i12 >= sparseArrayCompat.keys.length) {
            int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i12 + 1);
            sparseArrayCompat.keys = Arrays.copyOf(sparseArrayCompat.keys, idealIntArraySize);
            sparseArrayCompat.values = Arrays.copyOf(sparseArrayCompat.values, idealIntArraySize);
        }
        sparseArrayCompat.keys[i12] = i10;
        sparseArrayCompat.values[i12] = e;
        sparseArrayCompat.size = i12 + 1;
    }

    public static final <E> void commonClear(SparseArrayCompat<E> sparseArrayCompat) {
        sparseArrayCompat.getClass();
        int i10 = sparseArrayCompat.size;
        Object[] objArr = sparseArrayCompat.values;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        sparseArrayCompat.size = 0;
        sparseArrayCompat.garbage = false;
    }

    public static final <E> boolean commonContainsKey(SparseArrayCompat<E> sparseArrayCompat, int i10) {
        sparseArrayCompat.getClass();
        if (sparseArrayCompat.indexOfKey(i10) >= 0) {
            return true;
        }
        return false;
    }

    public static final <E> boolean commonContainsValue(SparseArrayCompat<E> sparseArrayCompat, E e) {
        sparseArrayCompat.getClass();
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        int i10 = sparseArrayCompat.size;
        int i11 = 0;
        while (true) {
            if (i11 < i10) {
                if (sparseArrayCompat.values[i11] == e) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 < 0) {
            return false;
        }
        return true;
    }

    public static final <E> E commonGet(SparseArrayCompat<E> sparseArrayCompat, int i10) {
        E e;
        sparseArrayCompat.getClass();
        int binarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i10);
        if (binarySearch >= 0 && (e = (E) sparseArrayCompat.values[binarySearch]) != DELETED) {
            return e;
        }
        return null;
    }

    public static final <E> int commonIndexOfKey(SparseArrayCompat<E> sparseArrayCompat, int i10) {
        sparseArrayCompat.getClass();
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        return ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i10);
    }

    public static final <E> int commonIndexOfValue(SparseArrayCompat<E> sparseArrayCompat, E e) {
        sparseArrayCompat.getClass();
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        int i10 = sparseArrayCompat.size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (sparseArrayCompat.values[i11] == e) {
                return i11;
            }
        }
        return -1;
    }

    public static final <E> boolean commonIsEmpty(SparseArrayCompat<E> sparseArrayCompat) {
        sparseArrayCompat.getClass();
        if (sparseArrayCompat.size() == 0) {
            return true;
        }
        return false;
    }

    public static final <E> int commonKeyAt(SparseArrayCompat<E> sparseArrayCompat, int i10) {
        sparseArrayCompat.getClass();
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        return sparseArrayCompat.keys[i10];
    }

    public static final <E> void commonPut(SparseArrayCompat<E> sparseArrayCompat, int i10, E e) {
        sparseArrayCompat.getClass();
        int binarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i10);
        if (binarySearch >= 0) {
            sparseArrayCompat.values[binarySearch] = e;
            return;
        }
        int i11 = ~binarySearch;
        if (i11 < sparseArrayCompat.size && sparseArrayCompat.values[i11] == DELETED) {
            sparseArrayCompat.keys[i11] = i10;
            sparseArrayCompat.values[i11] = e;
            return;
        }
        if (sparseArrayCompat.garbage && sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
            gc(sparseArrayCompat);
            i11 = ~ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i10);
        }
        int i12 = sparseArrayCompat.size;
        if (i12 >= sparseArrayCompat.keys.length) {
            int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i12 + 1);
            sparseArrayCompat.keys = Arrays.copyOf(sparseArrayCompat.keys, idealIntArraySize);
            sparseArrayCompat.values = Arrays.copyOf(sparseArrayCompat.values, idealIntArraySize);
        }
        int i13 = sparseArrayCompat.size;
        if (i13 - i11 != 0) {
            int[] iArr = sparseArrayCompat.keys;
            int i14 = i11 + 1;
            ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, i14, i11, i13);
            Object[] objArr = sparseArrayCompat.values;
            ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i14, i11, sparseArrayCompat.size);
        }
        sparseArrayCompat.keys[i11] = i10;
        sparseArrayCompat.values[i11] = e;
        sparseArrayCompat.size++;
    }

    public static final <E> void commonPutAll(SparseArrayCompat<E> sparseArrayCompat, SparseArrayCompat<? extends E> sparseArrayCompat2) {
        sparseArrayCompat.getClass();
        sparseArrayCompat2.getClass();
        int size = sparseArrayCompat2.size();
        for (int i10 = 0; i10 < size; i10++) {
            int keyAt = sparseArrayCompat2.keyAt(i10);
            E valueAt = sparseArrayCompat2.valueAt(i10);
            int binarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, keyAt);
            if (binarySearch >= 0) {
                sparseArrayCompat.values[binarySearch] = valueAt;
            } else {
                int i11 = ~binarySearch;
                if (i11 < sparseArrayCompat.size && sparseArrayCompat.values[i11] == DELETED) {
                    sparseArrayCompat.keys[i11] = keyAt;
                    sparseArrayCompat.values[i11] = valueAt;
                } else {
                    if (sparseArrayCompat.garbage && sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
                        gc(sparseArrayCompat);
                        i11 = ~ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, keyAt);
                    }
                    int i12 = sparseArrayCompat.size;
                    if (i12 >= sparseArrayCompat.keys.length) {
                        int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i12 + 1);
                        sparseArrayCompat.keys = Arrays.copyOf(sparseArrayCompat.keys, idealIntArraySize);
                        sparseArrayCompat.values = Arrays.copyOf(sparseArrayCompat.values, idealIntArraySize);
                    }
                    int i13 = sparseArrayCompat.size;
                    if (i13 - i11 != 0) {
                        int[] iArr = sparseArrayCompat.keys;
                        int i14 = i11 + 1;
                        ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, i14, i11, i13);
                        Object[] objArr = sparseArrayCompat.values;
                        ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i14, i11, sparseArrayCompat.size);
                    }
                    sparseArrayCompat.keys[i11] = keyAt;
                    sparseArrayCompat.values[i11] = valueAt;
                    sparseArrayCompat.size++;
                }
            }
        }
    }

    public static final <E> E commonPutIfAbsent(SparseArrayCompat<E> sparseArrayCompat, int i10, E e) {
        sparseArrayCompat.getClass();
        E e6 = (E) commonGet(sparseArrayCompat, i10);
        if (e6 == null) {
            int binarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i10);
            if (binarySearch >= 0) {
                sparseArrayCompat.values[binarySearch] = e;
                return e6;
            }
            int i11 = ~binarySearch;
            if (i11 < sparseArrayCompat.size && sparseArrayCompat.values[i11] == DELETED) {
                sparseArrayCompat.keys[i11] = i10;
                sparseArrayCompat.values[i11] = e;
                return e6;
            }
            if (sparseArrayCompat.garbage && sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
                gc(sparseArrayCompat);
                i11 = ~ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i10);
            }
            int i12 = sparseArrayCompat.size;
            if (i12 >= sparseArrayCompat.keys.length) {
                int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i12 + 1);
                sparseArrayCompat.keys = Arrays.copyOf(sparseArrayCompat.keys, idealIntArraySize);
                sparseArrayCompat.values = Arrays.copyOf(sparseArrayCompat.values, idealIntArraySize);
            }
            int i13 = sparseArrayCompat.size;
            if (i13 - i11 != 0) {
                int[] iArr = sparseArrayCompat.keys;
                int i14 = i11 + 1;
                ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, i14, i11, i13);
                Object[] objArr = sparseArrayCompat.values;
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i14, i11, sparseArrayCompat.size);
            }
            sparseArrayCompat.keys[i11] = i10;
            sparseArrayCompat.values[i11] = e;
            sparseArrayCompat.size++;
        }
        return e6;
    }

    public static final <E> void commonRemove(SparseArrayCompat<E> sparseArrayCompat, int i10) {
        sparseArrayCompat.getClass();
        int binarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i10);
        if (binarySearch >= 0) {
            Object[] objArr = sparseArrayCompat.values;
            Object obj = objArr[binarySearch];
            Object obj2 = DELETED;
            if (obj != obj2) {
                objArr[binarySearch] = obj2;
                sparseArrayCompat.garbage = true;
            }
        }
    }

    public static final <E> void commonRemoveAt(SparseArrayCompat<E> sparseArrayCompat, int i10) {
        sparseArrayCompat.getClass();
        if (sparseArrayCompat.values[i10] != DELETED) {
            sparseArrayCompat.values[i10] = DELETED;
            sparseArrayCompat.garbage = true;
        }
    }

    public static final <E> void commonRemoveAtRange(SparseArrayCompat<E> sparseArrayCompat, int i10, int i11) {
        sparseArrayCompat.getClass();
        int min = Math.min(i11, i10 + i11);
        while (i10 < min) {
            sparseArrayCompat.removeAt(i10);
            i10++;
        }
    }

    public static final <E> boolean commonReplace(SparseArrayCompat<E> sparseArrayCompat, int i10, E e, E e6) {
        sparseArrayCompat.getClass();
        int indexOfKey = sparseArrayCompat.indexOfKey(i10);
        if (indexOfKey >= 0 && Intrinsics.areEqual(sparseArrayCompat.values[indexOfKey], e)) {
            sparseArrayCompat.values[indexOfKey] = e6;
            return true;
        }
        return false;
    }

    public static final <E> void commonSetValueAt(SparseArrayCompat<E> sparseArrayCompat, int i10, E e) {
        sparseArrayCompat.getClass();
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        sparseArrayCompat.values[i10] = e;
    }

    public static final <E> int commonSize(SparseArrayCompat<E> sparseArrayCompat) {
        sparseArrayCompat.getClass();
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        return sparseArrayCompat.size;
    }

    public static final <E> String commonToString(SparseArrayCompat<E> sparseArrayCompat) {
        sparseArrayCompat.getClass();
        if (sparseArrayCompat.size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(sparseArrayCompat.size * 28);
        sb.append('{');
        int i10 = sparseArrayCompat.size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            sb.append(sparseArrayCompat.keyAt(i11));
            sb.append('=');
            E valueAt = sparseArrayCompat.valueAt(i11);
            if (valueAt != sparseArrayCompat) {
                sb.append(valueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public static final <E> E commonValueAt(SparseArrayCompat<E> sparseArrayCompat, int i10) {
        sparseArrayCompat.getClass();
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        return (E) sparseArrayCompat.values[i10];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> void gc(SparseArrayCompat<E> sparseArrayCompat) {
        int i10 = sparseArrayCompat.size;
        int[] iArr = sparseArrayCompat.keys;
        Object[] objArr = sparseArrayCompat.values;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != DELETED) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        sparseArrayCompat.garbage = false;
        sparseArrayCompat.size = i11;
    }

    private static final <E, T extends E> T internalGet(SparseArrayCompat<E> sparseArrayCompat, int i10, T t) {
        T t3;
        int binarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i10);
        if (binarySearch >= 0 && (t3 = (T) sparseArrayCompat.values[binarySearch]) != DELETED) {
            return t3;
        }
        return t;
    }

    public static final <E> E commonGet(SparseArrayCompat<E> sparseArrayCompat, int i10, E e) {
        E e6;
        sparseArrayCompat.getClass();
        int binarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i10);
        return (binarySearch < 0 || (e6 = (E) sparseArrayCompat.values[binarySearch]) == DELETED) ? e : e6;
    }

    public static final <E> boolean commonRemove(SparseArrayCompat<E> sparseArrayCompat, int i10, Object obj) {
        sparseArrayCompat.getClass();
        int indexOfKey = sparseArrayCompat.indexOfKey(i10);
        if (indexOfKey < 0 || !Intrinsics.areEqual(obj, sparseArrayCompat.valueAt(indexOfKey))) {
            return false;
        }
        sparseArrayCompat.removeAt(indexOfKey);
        return true;
    }

    public static final <E> E commonReplace(SparseArrayCompat<E> sparseArrayCompat, int i10, E e) {
        sparseArrayCompat.getClass();
        int indexOfKey = sparseArrayCompat.indexOfKey(i10);
        if (indexOfKey < 0) {
            return null;
        }
        Object[] objArr = sparseArrayCompat.values;
        E e6 = (E) objArr[indexOfKey];
        objArr[indexOfKey] = e;
        return e6;
    }
}
