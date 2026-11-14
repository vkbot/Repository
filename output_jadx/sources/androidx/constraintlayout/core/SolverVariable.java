package androidx.constraintlayout.core;

import ai.onnxruntime.a;
import androidx.exifinterface.media.ExifInterface;
import j1.i;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class SolverVariable implements Comparable<SolverVariable> {
    private static final boolean DO_NOT_USE = false;
    private static final boolean INTERNAL_DEBUG = false;
    static final int MAX_STRENGTH = 9;
    public static final int STRENGTH_BARRIER = 6;
    public static final int STRENGTH_CENTERING = 7;
    public static final int STRENGTH_EQUALITY = 5;
    public static final int STRENGTH_FIXED = 8;
    public static final int STRENGTH_HIGH = 3;
    public static final int STRENGTH_HIGHEST = 4;
    public static final int STRENGTH_LOW = 1;
    public static final int STRENGTH_MEDIUM = 2;
    public static final int STRENGTH_NONE = 0;
    private static final boolean VAR_USE_HASH = false;
    private static int sUniqueConstantId = 1;
    private static int sUniqueErrorId = 1;
    private static int sUniqueId = 1;
    private static int sUniqueSlackId = 1;
    private static int sUniqueUnrestrictedId = 1;
    public float computedValue;
    public int id;
    public boolean inGoal;
    public boolean isFinalValue;
    ArrayRow[] mClientEquations;
    int mClientEquationsCount;
    int mDefinitionId;
    float[] mGoalStrengthVector;
    HashSet<ArrayRow> mInRows;
    boolean mIsSynonym;
    private String mName;
    float[] mStrengthVector;
    int mSynonym;
    float mSynonymDelta;
    Type mType;
    public int strength;
    public int usageInRowCount;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public SolverVariable(String str, Type type) {
        this.id = -1;
        this.mDefinitionId = -1;
        this.strength = 0;
        this.isFinalValue = false;
        this.mStrengthVector = new float[9];
        this.mGoalStrengthVector = new float[9];
        this.mClientEquations = new ArrayRow[16];
        this.mClientEquationsCount = 0;
        this.usageInRowCount = 0;
        this.mIsSynonym = false;
        this.mSynonym = -1;
        this.mSynonymDelta = 0.0f;
        this.mInRows = null;
        this.mName = str;
        this.mType = type;
    }

    private static String getUniqueName(Type type, String str) {
        if (str != null) {
            StringBuilder u8 = a.u(str);
            u8.append(sUniqueErrorId);
            return u8.toString();
        }
        int ordinal = type.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            StringBuilder sb = new StringBuilder(ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
                            int i10 = sUniqueId + 1;
                            sUniqueId = i10;
                            sb.append(i10);
                            return sb.toString();
                        }
                        i.e(type.name());
                        return null;
                    }
                    StringBuilder sb2 = new StringBuilder("e");
                    int i11 = sUniqueErrorId + 1;
                    sUniqueErrorId = i11;
                    sb2.append(i11);
                    return sb2.toString();
                }
                StringBuilder sb3 = new StringBuilder(ExifInterface.LATITUDE_SOUTH);
                int i12 = sUniqueSlackId + 1;
                sUniqueSlackId = i12;
                sb3.append(i12);
                return sb3.toString();
            }
            StringBuilder sb4 = new StringBuilder("C");
            int i13 = sUniqueConstantId + 1;
            sUniqueConstantId = i13;
            sb4.append(i13);
            return sb4.toString();
        }
        StringBuilder sb5 = new StringBuilder("U");
        int i14 = sUniqueUnrestrictedId + 1;
        sUniqueUnrestrictedId = i14;
        sb5.append(i14);
        return sb5.toString();
    }

    public static void increaseErrorId() {
        sUniqueErrorId++;
    }

    public final void addToRow(ArrayRow arrayRow) {
        int i10 = 0;
        while (true) {
            int i11 = this.mClientEquationsCount;
            ArrayRow[] arrayRowArr = this.mClientEquations;
            if (i10 < i11) {
                if (arrayRowArr[i10] == arrayRow) {
                    return;
                } else {
                    i10++;
                }
            } else {
                if (i11 >= arrayRowArr.length) {
                    this.mClientEquations = (ArrayRow[]) Arrays.copyOf(arrayRowArr, arrayRowArr.length * 2);
                }
                ArrayRow[] arrayRowArr2 = this.mClientEquations;
                int i12 = this.mClientEquationsCount;
                arrayRowArr2[i12] = arrayRow;
                this.mClientEquationsCount = i12 + 1;
                return;
            }
        }
    }

    public void clearStrengths() {
        for (int i10 = 0; i10 < 9; i10++) {
            this.mStrengthVector[i10] = 0.0f;
        }
    }

    public String getName() {
        return this.mName;
    }

    public final void removeFromRow(ArrayRow arrayRow) {
        int i10 = this.mClientEquationsCount;
        int i11 = 0;
        while (i11 < i10) {
            if (this.mClientEquations[i11] == arrayRow) {
                while (i11 < i10 - 1) {
                    ArrayRow[] arrayRowArr = this.mClientEquations;
                    int i12 = i11 + 1;
                    arrayRowArr[i11] = arrayRowArr[i12];
                    i11 = i12;
                }
                this.mClientEquationsCount--;
                return;
            }
            i11++;
        }
    }

    public void reset() {
        this.mName = null;
        this.mType = Type.UNKNOWN;
        this.strength = 0;
        this.id = -1;
        this.mDefinitionId = -1;
        this.computedValue = 0.0f;
        this.isFinalValue = false;
        this.mIsSynonym = false;
        this.mSynonym = -1;
        this.mSynonymDelta = 0.0f;
        int i10 = this.mClientEquationsCount;
        for (int i11 = 0; i11 < i10; i11++) {
            this.mClientEquations[i11] = null;
        }
        this.mClientEquationsCount = 0;
        this.usageInRowCount = 0;
        this.inGoal = false;
        Arrays.fill(this.mGoalStrengthVector, 0.0f);
    }

    public void setFinalValue(LinearSystem linearSystem, float f8) {
        this.computedValue = f8;
        this.isFinalValue = true;
        this.mIsSynonym = false;
        this.mSynonym = -1;
        this.mSynonymDelta = 0.0f;
        int i10 = this.mClientEquationsCount;
        this.mDefinitionId = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.mClientEquations[i11].updateFromFinalVariable(linearSystem, this, false);
        }
        this.mClientEquationsCount = 0;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setSynonym(LinearSystem linearSystem, SolverVariable solverVariable, float f8) {
        this.mIsSynonym = true;
        this.mSynonym = solverVariable.id;
        this.mSynonymDelta = f8;
        int i10 = this.mClientEquationsCount;
        this.mDefinitionId = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.mClientEquations[i11].updateFromSynonymVariable(linearSystem, this, false);
        }
        this.mClientEquationsCount = 0;
        linearSystem.displayReadableRows();
    }

    public void setType(Type type, String str) {
        this.mType = type;
    }

    public String strengthsToString() {
        String str = this + "[";
        boolean z9 = false;
        boolean z10 = true;
        for (int i10 = 0; i10 < this.mStrengthVector.length; i10++) {
            StringBuilder u8 = a.u(str);
            u8.append(this.mStrengthVector[i10]);
            String sb = u8.toString();
            float[] fArr = this.mStrengthVector;
            float f8 = fArr[i10];
            if (f8 > 0.0f) {
                z9 = false;
            } else if (f8 < 0.0f) {
                z9 = true;
            }
            if (f8 != 0.0f) {
                z10 = false;
            }
            if (i10 < fArr.length - 1) {
                str = sb.concat(", ");
            } else {
                str = sb.concat("] ");
            }
        }
        if (z9) {
            str = str.concat(" (-)");
        }
        if (z10) {
            return str.concat(" (*)");
        }
        return str;
    }

    public String toString() {
        if (this.mName != null) {
            return "" + this.mName;
        }
        return "" + this.id;
    }

    public final void updateReferencesWithNewDefinition(LinearSystem linearSystem, ArrayRow arrayRow) {
        int i10 = this.mClientEquationsCount;
        for (int i11 = 0; i11 < i10; i11++) {
            this.mClientEquations[i11].updateFromRow(linearSystem, arrayRow, false);
        }
        this.mClientEquationsCount = 0;
    }

    @Override // java.lang.Comparable
    public int compareTo(SolverVariable solverVariable) {
        return this.id - solverVariable.id;
    }

    public SolverVariable(Type type, String str) {
        this.id = -1;
        this.mDefinitionId = -1;
        this.strength = 0;
        this.isFinalValue = false;
        this.mStrengthVector = new float[9];
        this.mGoalStrengthVector = new float[9];
        this.mClientEquations = new ArrayRow[16];
        this.mClientEquationsCount = 0;
        this.usageInRowCount = 0;
        this.mIsSynonym = false;
        this.mSynonym = -1;
        this.mSynonymDelta = 0.0f;
        this.mInRows = null;
        this.mType = type;
    }
}
