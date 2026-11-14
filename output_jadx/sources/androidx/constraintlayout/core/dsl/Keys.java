package androidx.constraintlayout.core.dsl;

import java.util.Arrays;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class Keys {
    public void append(StringBuilder sb, String str, float f8) {
        if (Float.isNaN(f8)) {
            return;
        }
        sb.append(str);
        sb.append(":");
        sb.append(f8);
        sb.append(",\n");
    }

    public String unpack(String[] strArr) {
        String str;
        StringBuilder sb = new StringBuilder("[");
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (i10 == 0) {
                str = "'";
            } else {
                str = ",'";
            }
            sb.append(str);
            sb.append(strArr[i10]);
            sb.append("'");
        }
        sb.append("]");
        return sb.toString();
    }

    public void append(StringBuilder sb, String str, String str2) {
        if (str2 != null) {
            sb.append(str);
            sb.append(":'");
            sb.append(str2);
            sb.append("',\n");
        }
    }

    public void append(StringBuilder sb, String str, int i10) {
        if (i10 != Integer.MIN_VALUE) {
            sb.append(str);
            sb.append(":'");
            sb.append(i10);
            sb.append("',\n");
        }
    }

    public void append(StringBuilder sb, String str, String[] strArr) {
        if (strArr != null) {
            sb.append(str);
            sb.append(":");
            sb.append(unpack(strArr));
            sb.append(",\n");
        }
    }

    public void append(StringBuilder sb, String str, float[] fArr) {
        if (fArr != null) {
            sb.append(str);
            sb.append("percentWidth:");
            sb.append(Arrays.toString(fArr));
            sb.append(",\n");
        }
    }
}
