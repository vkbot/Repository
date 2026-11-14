package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class KeyCache {
    HashMap<Object, HashMap<String, float[]>> mMap = new HashMap<>();

    public float getFloatValue(Object obj, String str, int i10) {
        HashMap<String, float[]> hashMap;
        float[] fArr;
        if (!this.mMap.containsKey(obj) || (hashMap = this.mMap.get(obj)) == null || !hashMap.containsKey(str) || (fArr = hashMap.get(str)) == null || fArr.length <= i10) {
            return Float.NaN;
        }
        return fArr[i10];
    }

    public void setFloatValue(Object obj, String str, int i10, float f8) {
        if (!this.mMap.containsKey(obj)) {
            HashMap<String, float[]> hashMap = new HashMap<>();
            float[] fArr = new float[i10 + 1];
            fArr[i10] = f8;
            hashMap.put(str, fArr);
            this.mMap.put(obj, hashMap);
            return;
        }
        HashMap<String, float[]> hashMap2 = this.mMap.get(obj);
        if (hashMap2 == null) {
            hashMap2 = new HashMap<>();
        }
        if (!hashMap2.containsKey(str)) {
            float[] fArr2 = new float[i10 + 1];
            fArr2[i10] = f8;
            hashMap2.put(str, fArr2);
            this.mMap.put(obj, hashMap2);
            return;
        }
        float[] fArr3 = hashMap2.get(str);
        if (fArr3 == null) {
            fArr3 = new float[0];
        }
        if (fArr3.length <= i10) {
            fArr3 = Arrays.copyOf(fArr3, i10 + 1);
        }
        fArr3[i10] = f8;
        hashMap2.put(str, fArr3);
    }
}
