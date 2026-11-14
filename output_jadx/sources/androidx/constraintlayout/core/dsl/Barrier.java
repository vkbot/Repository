package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.dsl.Constraint;
import androidx.constraintlayout.core.dsl.Helper;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class Barrier extends Helper {
    private Constraint.Side mDirection;
    private int mMargin;
    private ArrayList<Ref> references;

    public Barrier(String str, String str2) {
        super(str, new Helper.HelperType(Helper.typeMap.get(Helper.Type.BARRIER)), str2);
        this.mDirection = null;
        this.mMargin = Integer.MIN_VALUE;
        this.references = new ArrayList<>();
        Map<String, String> convertConfigToMap = convertConfigToMap();
        this.configMap = convertConfigToMap;
        if (convertConfigToMap.containsKey("contains")) {
            Ref.addStringToReferences(this.configMap.get("contains"), this.references);
        }
    }

    public Barrier addReference(Ref ref) {
        this.references.add(ref);
        this.configMap.put("contains", referencesToString());
        return this;
    }

    public Constraint.Side getDirection() {
        return this.mDirection;
    }

    public int getMargin() {
        return this.mMargin;
    }

    public String referencesToString() {
        if (this.references.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder("[");
        ArrayList<Ref> arrayList = this.references;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Ref ref = arrayList.get(i10);
            i10++;
            sb.append(ref.toString());
        }
        sb.append("]");
        return sb.toString();
    }

    public void setDirection(Constraint.Side side) {
        this.mDirection = side;
        this.configMap.put("direction", Helper.sideMap.get(side));
    }

    public void setMargin(int i10) {
        this.mMargin = i10;
        this.configMap.put("margin", String.valueOf(i10));
    }

    public Barrier addReference(String str) {
        return addReference(Ref.parseStringToRef(str));
    }

    public Barrier(String str) {
        super(str, new Helper.HelperType(Helper.typeMap.get(Helper.Type.BARRIER)));
        this.mDirection = null;
        this.mMargin = Integer.MIN_VALUE;
        this.references = new ArrayList<>();
    }
}
