package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import java.io.PrintStream;
import java.util.Arrays;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class KeyFrameArray {

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class CustomArray {
        private static final int EMPTY = 999;
        int mCount;
        int[] mKeys = new int[TypedValues.TYPE_TARGET];
        CustomAttribute[] mValues = new CustomAttribute[TypedValues.TYPE_TARGET];

        public CustomArray() {
            clear();
        }

        public void append(int i10, CustomAttribute customAttribute) {
            if (this.mValues[i10] != null) {
                remove(i10);
            }
            this.mValues[i10] = customAttribute;
            int[] iArr = this.mKeys;
            int i11 = this.mCount;
            this.mCount = i11 + 1;
            iArr[i11] = i10;
            Arrays.sort(iArr);
        }

        public void clear() {
            Arrays.fill(this.mKeys, EMPTY);
            Arrays.fill(this.mValues, (Object) null);
            this.mCount = 0;
        }

        public void dump() {
            String str;
            System.out.println("V: " + Arrays.toString(Arrays.copyOf(this.mKeys, this.mCount)));
            System.out.print("K: [");
            for (int i10 = 0; i10 < this.mCount; i10++) {
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder();
                if (i10 == 0) {
                    str = "";
                } else {
                    str = ", ";
                }
                sb.append(str);
                sb.append(valueAt(i10));
                printStream.print(sb.toString());
            }
            System.out.println("]");
        }

        public int keyAt(int i10) {
            return this.mKeys[i10];
        }

        public void remove(int i10) {
            this.mValues[i10] = null;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = this.mCount;
                if (i11 < i13) {
                    int[] iArr = this.mKeys;
                    if (i10 == iArr[i11]) {
                        iArr[i11] = EMPTY;
                        i12++;
                    }
                    if (i11 != i12) {
                        iArr[i11] = iArr[i12];
                    }
                    i12++;
                    i11++;
                } else {
                    this.mCount = i13 - 1;
                    return;
                }
            }
        }

        public int size() {
            return this.mCount;
        }

        public CustomAttribute valueAt(int i10) {
            return this.mValues[this.mKeys[i10]];
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class CustomVar {
        private static final int EMPTY = 999;
        int mCount;
        int[] mKeys = new int[TypedValues.TYPE_TARGET];
        CustomVariable[] mValues = new CustomVariable[TypedValues.TYPE_TARGET];

        public CustomVar() {
            clear();
        }

        public void append(int i10, CustomVariable customVariable) {
            if (this.mValues[i10] != null) {
                remove(i10);
            }
            this.mValues[i10] = customVariable;
            int[] iArr = this.mKeys;
            int i11 = this.mCount;
            this.mCount = i11 + 1;
            iArr[i11] = i10;
            Arrays.sort(iArr);
        }

        public void clear() {
            Arrays.fill(this.mKeys, EMPTY);
            Arrays.fill(this.mValues, (Object) null);
            this.mCount = 0;
        }

        public void dump() {
            String str;
            System.out.println("V: " + Arrays.toString(Arrays.copyOf(this.mKeys, this.mCount)));
            System.out.print("K: [");
            for (int i10 = 0; i10 < this.mCount; i10++) {
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder();
                if (i10 == 0) {
                    str = "";
                } else {
                    str = ", ";
                }
                sb.append(str);
                sb.append(valueAt(i10));
                printStream.print(sb.toString());
            }
            System.out.println("]");
        }

        public int keyAt(int i10) {
            return this.mKeys[i10];
        }

        public void remove(int i10) {
            this.mValues[i10] = null;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = this.mCount;
                if (i11 < i13) {
                    int[] iArr = this.mKeys;
                    if (i10 == iArr[i11]) {
                        iArr[i11] = EMPTY;
                        i12++;
                    }
                    if (i11 != i12) {
                        iArr[i11] = iArr[i12];
                    }
                    i12++;
                    i11++;
                } else {
                    this.mCount = i13 - 1;
                    return;
                }
            }
        }

        public int size() {
            return this.mCount;
        }

        public CustomVariable valueAt(int i10) {
            return this.mValues[this.mKeys[i10]];
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class FloatArray {
        private static final int EMPTY = 999;
        int mCount;
        int[] mKeys = new int[TypedValues.TYPE_TARGET];
        float[][] mValues = new float[TypedValues.TYPE_TARGET];

        public FloatArray() {
            clear();
        }

        public void append(int i10, float[] fArr) {
            if (this.mValues[i10] != null) {
                remove(i10);
            }
            this.mValues[i10] = fArr;
            int[] iArr = this.mKeys;
            int i11 = this.mCount;
            this.mCount = i11 + 1;
            iArr[i11] = i10;
            Arrays.sort(iArr);
        }

        public void clear() {
            Arrays.fill(this.mKeys, EMPTY);
            Arrays.fill(this.mValues, (Object) null);
            this.mCount = 0;
        }

        public void dump() {
            String str;
            System.out.println("V: " + Arrays.toString(Arrays.copyOf(this.mKeys, this.mCount)));
            System.out.print("K: [");
            for (int i10 = 0; i10 < this.mCount; i10++) {
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder();
                if (i10 == 0) {
                    str = "";
                } else {
                    str = ", ";
                }
                sb.append(str);
                sb.append(Arrays.toString(valueAt(i10)));
                printStream.print(sb.toString());
            }
            System.out.println("]");
        }

        public int keyAt(int i10) {
            return this.mKeys[i10];
        }

        public void remove(int i10) {
            this.mValues[i10] = null;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = this.mCount;
                if (i11 < i13) {
                    int[] iArr = this.mKeys;
                    if (i10 == iArr[i11]) {
                        iArr[i11] = EMPTY;
                        i12++;
                    }
                    if (i11 != i12) {
                        iArr[i11] = iArr[i12];
                    }
                    i12++;
                    i11++;
                } else {
                    this.mCount = i13 - 1;
                    return;
                }
            }
        }

        public int size() {
            return this.mCount;
        }

        public float[] valueAt(int i10) {
            return this.mValues[this.mKeys[i10]];
        }
    }
}
