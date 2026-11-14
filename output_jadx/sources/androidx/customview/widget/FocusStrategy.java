package androidx.customview.widget;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import j1.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
class FocusStrategy {

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public interface BoundsAdapter<T> {
        void obtainBounds(T t, Rect rect);
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public interface CollectionAdapter<T, V> {
        V get(T t, int i10);

        int size(T t);
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class SequentialComparator<T> implements Comparator<T> {
        private final BoundsAdapter<T> mAdapter;
        private final boolean mIsLayoutRtl;
        private final Rect mTemp1 = new Rect();
        private final Rect mTemp2 = new Rect();

        public SequentialComparator(boolean z9, BoundsAdapter<T> boundsAdapter) {
            this.mIsLayoutRtl = z9;
            this.mAdapter = boundsAdapter;
        }

        @Override // java.util.Comparator
        public int compare(T t, T t3) {
            Rect rect = this.mTemp1;
            Rect rect2 = this.mTemp2;
            this.mAdapter.obtainBounds(t, rect);
            this.mAdapter.obtainBounds(t3, rect2);
            int i10 = rect.top;
            int i11 = rect2.top;
            if (i10 < i11) {
                return -1;
            }
            if (i10 > i11) {
                return 1;
            }
            int i12 = rect.left;
            int i13 = rect2.left;
            if (i12 < i13) {
                if (!this.mIsLayoutRtl) {
                    return -1;
                }
                return 1;
            }
            if (i12 > i13) {
                if (this.mIsLayoutRtl) {
                    return -1;
                }
                return 1;
            }
            int i14 = rect.bottom;
            int i15 = rect2.bottom;
            if (i14 < i15) {
                return -1;
            }
            if (i14 > i15) {
                return 1;
            }
            int i16 = rect.right;
            int i17 = rect2.right;
            if (i16 < i17) {
                if (!this.mIsLayoutRtl) {
                    return -1;
                }
                return 1;
            }
            if (i16 > i17) {
                if (this.mIsLayoutRtl) {
                    return -1;
                }
                return 1;
            }
            return 0;
        }
    }

    private FocusStrategy() {
    }

    private static boolean beamBeats(int i10, @NonNull Rect rect, @NonNull Rect rect2, @NonNull Rect rect3) {
        boolean beamsOverlap = beamsOverlap(i10, rect, rect2);
        if (beamsOverlap(i10, rect, rect3) || !beamsOverlap) {
            return false;
        }
        if (isToDirectionOf(i10, rect, rect3) && i10 != 17 && i10 != 66 && majorAxisDistance(i10, rect, rect2) >= majorAxisDistanceToFarEdge(i10, rect, rect3)) {
            return false;
        }
        return true;
    }

    private static boolean beamsOverlap(int i10, @NonNull Rect rect, @NonNull Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        i.k("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                }
            }
            if (rect2.right < rect.left || rect2.left > rect.right) {
                return false;
            }
            return true;
        }
        if (rect2.bottom < rect.top || rect2.top > rect.bottom) {
            return false;
        }
        return true;
    }

    public static <L, T> T findNextFocusInAbsoluteDirection(@NonNull L l10, @NonNull CollectionAdapter<L, T> collectionAdapter, @NonNull BoundsAdapter<T> boundsAdapter, @Nullable T t, @NonNull Rect rect, int i10) {
        Rect rect2 = new Rect(rect);
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 == 130) {
                        rect2.offset(0, -(rect.height() + 1));
                    } else {
                        i.k("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return null;
                    }
                } else {
                    rect2.offset(-(rect.width() + 1), 0);
                }
            } else {
                rect2.offset(0, rect.height() + 1);
            }
        } else {
            rect2.offset(rect.width() + 1, 0);
        }
        int size = collectionAdapter.size(l10);
        Rect rect3 = new Rect();
        T t3 = null;
        for (int i11 = 0; i11 < size; i11++) {
            T t9 = collectionAdapter.get(l10, i11);
            if (t9 != t) {
                boundsAdapter.obtainBounds(t9, rect3);
                if (isBetterCandidate(i10, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t3 = t9;
                }
            }
        }
        return t3;
    }

    public static <L, T> T findNextFocusInRelativeDirection(@NonNull L l10, @NonNull CollectionAdapter<L, T> collectionAdapter, @NonNull BoundsAdapter<T> boundsAdapter, @Nullable T t, int i10, boolean z9, boolean z10) {
        int size = collectionAdapter.size(l10);
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(collectionAdapter.get(l10, i11));
        }
        Collections.sort(arrayList, new SequentialComparator(z9, boundsAdapter));
        if (i10 != 1) {
            if (i10 == 2) {
                return (T) getNextFocusable(t, arrayList, z10);
            }
            i.k("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
            return null;
        }
        return (T) getPreviousFocusable(t, arrayList, z10);
    }

    private static <T> T getNextFocusable(T t, ArrayList<T> arrayList, boolean z9) {
        int lastIndexOf;
        int size = arrayList.size();
        if (t == null) {
            lastIndexOf = -1;
        } else {
            lastIndexOf = arrayList.lastIndexOf(t);
        }
        int i10 = lastIndexOf + 1;
        if (i10 < size) {
            return arrayList.get(i10);
        }
        if (z9 && size > 0) {
            return arrayList.get(0);
        }
        return null;
    }

    private static <T> T getPreviousFocusable(T t, ArrayList<T> arrayList, boolean z9) {
        int indexOf;
        int size = arrayList.size();
        if (t == null) {
            indexOf = size;
        } else {
            indexOf = arrayList.indexOf(t);
        }
        int i10 = indexOf - 1;
        if (i10 >= 0) {
            return arrayList.get(i10);
        }
        if (z9 && size > 0) {
            return arrayList.get(size - 1);
        }
        return null;
    }

    private static int getWeightedDistanceFor(int i10, int i11) {
        return (i11 * i11) + (i10 * 13 * i10);
    }

    private static boolean isBetterCandidate(int i10, @NonNull Rect rect, @NonNull Rect rect2, @NonNull Rect rect3) {
        if (!isCandidate(rect, rect2, i10)) {
            return false;
        }
        if (!isCandidate(rect, rect3, i10) || beamBeats(i10, rect, rect2, rect3)) {
            return true;
        }
        if (beamBeats(i10, rect, rect3, rect2) || getWeightedDistanceFor(majorAxisDistance(i10, rect, rect2), minorAxisDistance(i10, rect, rect2)) >= getWeightedDistanceFor(majorAxisDistance(i10, rect, rect3), minorAxisDistance(i10, rect, rect3))) {
            return false;
        }
        return true;
    }

    private static boolean isCandidate(@NonNull Rect rect, @NonNull Rect rect2, int i10) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 == 130) {
                        int i11 = rect.top;
                        int i12 = rect2.top;
                        if ((i11 >= i12 && rect.bottom > i12) || rect.bottom >= rect2.bottom) {
                            return false;
                        }
                        return true;
                    }
                    i.k("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    return false;
                }
                int i13 = rect.left;
                int i14 = rect2.left;
                if ((i13 >= i14 && rect.right > i14) || rect.right >= rect2.right) {
                    return false;
                }
                return true;
            }
            int i15 = rect.bottom;
            int i16 = rect2.bottom;
            if ((i15 <= i16 && rect.top < i16) || rect.top <= rect2.top) {
                return false;
            }
            return true;
        }
        int i17 = rect.right;
        int i18 = rect2.right;
        if ((i17 <= i18 && rect.left < i18) || rect.left <= rect2.left) {
            return false;
        }
        return true;
    }

    private static boolean isToDirectionOf(int i10, @NonNull Rect rect, @NonNull Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 == 130) {
                        if (rect.bottom > rect2.top) {
                            return false;
                        }
                        return true;
                    }
                    i.k("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    return false;
                }
                if (rect.right > rect2.left) {
                    return false;
                }
                return true;
            }
            if (rect.top < rect2.bottom) {
                return false;
            }
            return true;
        }
        if (rect.left < rect2.right) {
            return false;
        }
        return true;
    }

    private static int majorAxisDistance(int i10, @NonNull Rect rect, @NonNull Rect rect2) {
        return Math.max(0, majorAxisDistanceRaw(i10, rect, rect2));
    }

    private static int majorAxisDistanceRaw(int i10, @NonNull Rect rect, @NonNull Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 == 130) {
                        return rect2.top - rect.bottom;
                    }
                    i.k("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    return 0;
                }
                return rect2.left - rect.right;
            }
            return rect.top - rect2.bottom;
        }
        return rect.left - rect2.right;
    }

    private static int majorAxisDistanceToFarEdge(int i10, @NonNull Rect rect, @NonNull Rect rect2) {
        return Math.max(1, majorAxisDistanceToFarEdgeRaw(i10, rect, rect2));
    }

    private static int majorAxisDistanceToFarEdgeRaw(int i10, @NonNull Rect rect, @NonNull Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 == 130) {
                        return rect2.bottom - rect.bottom;
                    }
                    i.k("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    return 0;
                }
                return rect2.right - rect.right;
            }
            return rect.top - rect2.top;
        }
        return rect.left - rect2.left;
    }

    private static int minorAxisDistance(int i10, @NonNull Rect rect, @NonNull Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        i.k("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return 0;
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }
}
