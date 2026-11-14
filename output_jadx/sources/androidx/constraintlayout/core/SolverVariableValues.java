package androidx.constraintlayout.core;

import ai.onnxruntime.a;
import androidx.constraintlayout.core.ArrayRow;
import java.util.Arrays;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class SolverVariableValues implements ArrayRow.ArrayRowVariables {
    private static final boolean DEBUG = false;
    private static final boolean HASH = true;
    private static float sEpsilon = 0.001f;
    protected final Cache mCache;
    private final ArrayRow mRow;
    private final int mNone = -1;
    private int mSize = 16;
    private int mHashSize = 16;
    int[] mKeys = new int[16];
    int[] mNextKeys = new int[16];
    int[] mVariables = new int[16];
    float[] mValues = new float[16];
    int[] mPrevious = new int[16];
    int[] mNext = new int[16];
    int mCount = 0;
    int mHead = -1;

    public SolverVariableValues(ArrayRow arrayRow, Cache cache) {
        this.mRow = arrayRow;
        this.mCache = cache;
        clear();
    }

    private void addToHashMap(SolverVariable solverVariable, int i10) {
        int[] iArr;
        int i11 = solverVariable.id % this.mHashSize;
        int[] iArr2 = this.mKeys;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            iArr2[i11] = i10;
        } else {
            while (true) {
                iArr = this.mNextKeys;
                int i13 = iArr[i12];
                if (i13 == -1) {
                    break;
                } else {
                    i12 = i13;
                }
            }
            iArr[i12] = i10;
        }
        this.mNextKeys[i10] = -1;
    }

    private void addVariable(int i10, SolverVariable solverVariable, float f8) {
        this.mVariables[i10] = solverVariable.id;
        this.mValues[i10] = f8;
        this.mPrevious[i10] = -1;
        this.mNext[i10] = -1;
        solverVariable.addToRow(this.mRow);
        solverVariable.usageInRowCount++;
        this.mCount++;
    }

    private void displayHash() {
        for (int i10 = 0; i10 < this.mHashSize; i10++) {
            if (this.mKeys[i10] != -1) {
                String str = hashCode() + " hash [" + i10 + "] => ";
                int i11 = this.mKeys[i10];
                boolean z9 = false;
                while (!z9) {
                    StringBuilder w = a.w(str, " ");
                    w.append(this.mVariables[i11]);
                    str = w.toString();
                    int i12 = this.mNextKeys[i11];
                    if (i12 != -1) {
                        i11 = i12;
                    } else {
                        z9 = true;
                    }
                }
                System.out.println(str);
            }
        }
    }

    private int findEmptySlot() {
        for (int i10 = 0; i10 < this.mSize; i10++) {
            if (this.mVariables[i10] == -1) {
                return i10;
            }
        }
        return -1;
    }

    private void increaseSize() {
        int i10 = this.mSize * 2;
        this.mVariables = Arrays.copyOf(this.mVariables, i10);
        this.mValues = Arrays.copyOf(this.mValues, i10);
        this.mPrevious = Arrays.copyOf(this.mPrevious, i10);
        this.mNext = Arrays.copyOf(this.mNext, i10);
        this.mNextKeys = Arrays.copyOf(this.mNextKeys, i10);
        for (int i11 = this.mSize; i11 < i10; i11++) {
            this.mVariables[i11] = -1;
            this.mNextKeys[i11] = -1;
        }
        this.mSize = i10;
    }

    private void insertVariable(int i10, SolverVariable solverVariable, float f8) {
        int findEmptySlot = findEmptySlot();
        addVariable(findEmptySlot, solverVariable, f8);
        int[] iArr = this.mPrevious;
        if (i10 != -1) {
            iArr[findEmptySlot] = i10;
            int[] iArr2 = this.mNext;
            iArr2[findEmptySlot] = iArr2[i10];
            iArr2[i10] = findEmptySlot;
        } else {
            iArr[findEmptySlot] = -1;
            int i11 = this.mCount;
            int[] iArr3 = this.mNext;
            if (i11 > 0) {
                iArr3[findEmptySlot] = this.mHead;
                this.mHead = findEmptySlot;
            } else {
                iArr3[findEmptySlot] = -1;
            }
        }
        int i12 = this.mNext[findEmptySlot];
        if (i12 != -1) {
            this.mPrevious[i12] = findEmptySlot;
        }
        addToHashMap(solverVariable, findEmptySlot);
    }

    private void removeFromHashMap(SolverVariable solverVariable) {
        int[] iArr;
        int i10;
        int i11 = solverVariable.id;
        int i12 = i11 % this.mHashSize;
        int[] iArr2 = this.mKeys;
        int i13 = iArr2[i12];
        if (i13 != -1) {
            if (this.mVariables[i13] == i11) {
                int[] iArr3 = this.mNextKeys;
                iArr2[i12] = iArr3[i13];
                iArr3[i13] = -1;
                return;
            }
            while (true) {
                iArr = this.mNextKeys;
                i10 = iArr[i13];
                if (i10 == -1 || this.mVariables[i10] == i11) {
                    break;
                } else {
                    i13 = i10;
                }
            }
            if (i10 != -1 && this.mVariables[i10] == i11) {
                iArr[i13] = iArr[i10];
                iArr[i10] = -1;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void add(SolverVariable solverVariable, float f8, boolean z9) {
        float f10 = sEpsilon;
        if (f8 <= (-f10) || f8 >= f10) {
            int indexOf = indexOf(solverVariable);
            if (indexOf == -1) {
                put(solverVariable, f8);
                return;
            }
            float[] fArr = this.mValues;
            float f11 = fArr[indexOf] + f8;
            fArr[indexOf] = f11;
            float f12 = sEpsilon;
            if (f11 > (-f12) && f11 < f12) {
                fArr[indexOf] = 0.0f;
                remove(solverVariable, z9);
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void clear() {
        int i10 = this.mCount;
        for (int i11 = 0; i11 < i10; i11++) {
            SolverVariable variable = getVariable(i11);
            if (variable != null) {
                variable.removeFromRow(this.mRow);
            }
        }
        for (int i12 = 0; i12 < this.mSize; i12++) {
            this.mVariables[i12] = -1;
            this.mNextKeys[i12] = -1;
        }
        for (int i13 = 0; i13 < this.mHashSize; i13++) {
            this.mKeys[i13] = -1;
        }
        this.mCount = 0;
        this.mHead = -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public boolean contains(SolverVariable solverVariable) {
        if (indexOf(solverVariable) != -1) {
            return true;
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void display() {
        int i10 = this.mCount;
        System.out.print("{ ");
        for (int i11 = 0; i11 < i10; i11++) {
            SolverVariable variable = getVariable(i11);
            if (variable != null) {
                System.out.print(variable + " = " + getVariableValue(i11) + " ");
            }
        }
        System.out.println(" }");
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void divideByAmount(float f8) {
        int i10 = this.mCount;
        int i11 = this.mHead;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.mValues;
            fArr[i11] = fArr[i11] / f8;
            i11 = this.mNext[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float get(SolverVariable solverVariable) {
        int indexOf = indexOf(solverVariable);
        if (indexOf != -1) {
            return this.mValues[indexOf];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int getCurrentSize() {
        return this.mCount;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public SolverVariable getVariable(int i10) {
        int i11 = this.mCount;
        if (i11 == 0) {
            return null;
        }
        int i12 = this.mHead;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10 && i12 != -1) {
                return this.mCache.mIndexedVariables[this.mVariables[i12]];
            }
            i12 = this.mNext[i12];
            if (i12 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float getVariableValue(int i10) {
        int i11 = this.mCount;
        int i12 = this.mHead;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10) {
                return this.mValues[i12];
            }
            i12 = this.mNext[i12];
            if (i12 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int indexOf(SolverVariable solverVariable) {
        if (this.mCount != 0 && solverVariable != null) {
            int i10 = solverVariable.id;
            int i11 = this.mKeys[i10 % this.mHashSize];
            if (i11 == -1) {
                return -1;
            }
            if (this.mVariables[i11] == i10) {
                return i11;
            }
            do {
                i11 = this.mNextKeys[i11];
                if (i11 == -1) {
                    break;
                }
            } while (this.mVariables[i11] != i10);
            if (i11 != -1 && this.mVariables[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void invert() {
        int i10 = this.mCount;
        int i11 = this.mHead;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.mValues;
            fArr[i11] = fArr[i11] * (-1.0f);
            i11 = this.mNext[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void put(SolverVariable solverVariable, float f8) {
        float f10 = sEpsilon;
        if (f8 > (-f10) && f8 < f10) {
            remove(solverVariable, true);
            return;
        }
        if (this.mCount == 0) {
            addVariable(0, solverVariable, f8);
            addToHashMap(solverVariable, 0);
            this.mHead = 0;
            return;
        }
        int indexOf = indexOf(solverVariable);
        if (indexOf != -1) {
            this.mValues[indexOf] = f8;
            return;
        }
        if (this.mCount + 1 >= this.mSize) {
            increaseSize();
        }
        int i10 = this.mCount;
        int i11 = this.mHead;
        int i12 = -1;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = this.mVariables[i11];
            int i15 = solverVariable.id;
            if (i14 == i15) {
                this.mValues[i11] = f8;
                return;
            }
            if (i14 < i15) {
                i12 = i11;
            }
            i11 = this.mNext[i11];
            if (i11 == -1) {
                break;
            }
        }
        insertVariable(i12, solverVariable, f8);
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float remove(SolverVariable solverVariable, boolean z9) {
        int indexOf = indexOf(solverVariable);
        if (indexOf == -1) {
            return 0.0f;
        }
        removeFromHashMap(solverVariable);
        float f8 = this.mValues[indexOf];
        if (this.mHead == indexOf) {
            this.mHead = this.mNext[indexOf];
        }
        this.mVariables[indexOf] = -1;
        int[] iArr = this.mPrevious;
        int i10 = iArr[indexOf];
        if (i10 != -1) {
            int[] iArr2 = this.mNext;
            iArr2[i10] = iArr2[indexOf];
        }
        int i11 = this.mNext[indexOf];
        if (i11 != -1) {
            iArr[i11] = iArr[indexOf];
        }
        this.mCount--;
        solverVariable.usageInRowCount--;
        if (z9) {
            solverVariable.removeFromRow(this.mRow);
        }
        return f8;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int sizeInBytes() {
        return 0;
    }

    public String toString() {
        String concat;
        String concat2;
        String str = hashCode() + " { ";
        int i10 = this.mCount;
        for (int i11 = 0; i11 < i10; i11++) {
            SolverVariable variable = getVariable(i11);
            if (variable != null) {
                String str2 = str + variable + " = " + getVariableValue(i11) + " ";
                int indexOf = indexOf(variable);
                String concat3 = str2.concat("[p: ");
                if (this.mPrevious[indexOf] != -1) {
                    StringBuilder u8 = a.u(concat3);
                    u8.append(this.mCache.mIndexedVariables[this.mVariables[this.mPrevious[indexOf]]]);
                    concat = u8.toString();
                } else {
                    concat = concat3.concat("none");
                }
                String concat4 = concat.concat(", n: ");
                if (this.mNext[indexOf] != -1) {
                    StringBuilder u9 = a.u(concat4);
                    u9.append(this.mCache.mIndexedVariables[this.mVariables[this.mNext[indexOf]]]);
                    concat2 = u9.toString();
                } else {
                    concat2 = concat4.concat("none");
                }
                str = concat2.concat("]");
            }
        }
        return a.C(str, " }");
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float use(ArrayRow arrayRow, boolean z9) {
        float f8 = get(arrayRow.mVariable);
        remove(arrayRow.mVariable, z9);
        SolverVariableValues solverVariableValues = (SolverVariableValues) arrayRow.variables;
        int currentSize = solverVariableValues.getCurrentSize();
        int i10 = 0;
        int i11 = 0;
        while (i10 < currentSize) {
            int i12 = solverVariableValues.mVariables[i11];
            if (i12 != -1) {
                add(this.mCache.mIndexedVariables[i12], solverVariableValues.mValues[i11] * f8, z9);
                i10++;
            }
            i11++;
        }
        return f8;
    }
}
