package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.dsl.Helper;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
class HGuideline extends Guideline {
    public HGuideline(String str, String str2) {
        super(str);
        this.config = str2;
        this.type = new Helper.HelperType(Helper.typeMap.get(Helper.Type.HORIZONTAL_GUIDELINE));
        this.configMap = convertConfigToMap();
    }

    public HGuideline(String str) {
        super(str);
        this.type = new Helper.HelperType(Helper.typeMap.get(Helper.Type.HORIZONTAL_GUIDELINE));
    }
}
