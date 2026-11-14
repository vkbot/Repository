package androidx.constraintlayout.core.dsl;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class Ref {
    private String mId;
    private float mPostMargin;
    private float mPreMargin;
    private float mWeight;

    public Ref(String str) {
        this.mWeight = Float.NaN;
        this.mPreMargin = Float.NaN;
        this.mPostMargin = Float.NaN;
        this.mId = str;
    }

    public static void addStringToReferences(String str, ArrayList<Ref> arrayList) {
        Object obj;
        if (str != null && str.length() != 0) {
            Object[] objArr = new Object[4];
            StringBuilder sb = new StringBuilder();
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < str.length(); i12++) {
                char charAt = str.charAt(i12);
                if (charAt != ' ' && charAt != '\'') {
                    if (charAt != ',') {
                        if (charAt != '[') {
                            if (charAt != ']') {
                                sb.append(charAt);
                            } else if (i11 > 0) {
                                i11--;
                                objArr[i10] = sb.toString();
                                sb.setLength(0);
                                Object obj2 = objArr[0];
                                if (obj2 != null) {
                                    arrayList.add(new Ref(obj2.toString(), parseFloat(objArr[1]), parseFloat(objArr[2]), parseFloat(objArr[3])));
                                    Arrays.fill(objArr, (Object) null);
                                    i10 = 0;
                                }
                            }
                        } else {
                            i11++;
                        }
                    } else {
                        if (i10 < 3) {
                            objArr[i10] = sb.toString();
                            sb.setLength(0);
                            i10++;
                        }
                        if (i11 == 1 && (obj = objArr[0]) != null) {
                            arrayList.add(new Ref(obj.toString()));
                            objArr[0] = null;
                            i10 = 0;
                        }
                    }
                }
            }
        }
    }

    public static float parseFloat(Object obj) {
        try {
            return Float.parseFloat(obj.toString());
        } catch (Exception unused) {
            return Float.NaN;
        }
    }

    public static Ref parseStringToRef(String str) {
        String[] split = str.replaceAll("[\\[\\]\\']", "").split(",");
        if (split.length == 0) {
            return null;
        }
        Object[] objArr = new Object[4];
        for (int i10 = 0; i10 < split.length && i10 < 4; i10++) {
            objArr[i10] = split[i10];
        }
        return new Ref(objArr[0].toString().replace("'", ""), parseFloat(objArr[1]), parseFloat(objArr[2]), parseFloat(objArr[3]));
    }

    public String getId() {
        return this.mId;
    }

    public float getPostMargin() {
        return this.mPostMargin;
    }

    public float getPreMargin() {
        return this.mPreMargin;
    }

    public float getWeight() {
        return this.mWeight;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public void setPostMargin(float f8) {
        this.mPostMargin = f8;
    }

    public void setPreMargin(float f8) {
        this.mPreMargin = f8;
    }

    public void setWeight(float f8) {
        this.mWeight = f8;
    }

    public String toString() {
        boolean z9;
        float f8;
        String str = this.mId;
        if (str != null && str.length() != 0) {
            StringBuilder sb = new StringBuilder();
            if (Float.isNaN(this.mWeight) && Float.isNaN(this.mPreMargin) && Float.isNaN(this.mPostMargin)) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (z9) {
                sb.append("[");
            }
            sb.append("'");
            sb.append(this.mId);
            sb.append("'");
            float f10 = 0.0f;
            if (!Float.isNaN(this.mPostMargin)) {
                sb.append(",");
                if (!Float.isNaN(this.mWeight)) {
                    f8 = this.mWeight;
                } else {
                    f8 = 0.0f;
                }
                sb.append(f8);
                sb.append(",");
                if (!Float.isNaN(this.mPreMargin)) {
                    f10 = this.mPreMargin;
                }
                sb.append(f10);
                sb.append(",");
                sb.append(this.mPostMargin);
            } else if (!Float.isNaN(this.mPreMargin)) {
                sb.append(",");
                if (!Float.isNaN(this.mWeight)) {
                    f10 = this.mWeight;
                }
                sb.append(f10);
                sb.append(",");
                sb.append(this.mPreMargin);
            } else if (!Float.isNaN(this.mWeight)) {
                sb.append(",");
                sb.append(this.mWeight);
            }
            if (z9) {
                sb.append("]");
            }
            sb.append(",");
            return sb.toString();
        }
        return "";
    }

    public Ref(String str, float f8) {
        this.mPreMargin = Float.NaN;
        this.mPostMargin = Float.NaN;
        this.mId = str;
        this.mWeight = f8;
    }

    public Ref(String str, float f8, float f10) {
        this.mPostMargin = Float.NaN;
        this.mId = str;
        this.mWeight = f8;
        this.mPreMargin = f10;
    }

    public Ref(String str, float f8, float f10, float f11) {
        this.mId = str;
        this.mWeight = f8;
        this.mPreMargin = f10;
        this.mPostMargin = f11;
    }
}
