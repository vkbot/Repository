package androidx.constraintlayout.core.parser;

import ai.onnxruntime.a;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class CLKey extends CLContainer {
    private static ArrayList<String> sSections;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        sSections = arrayList;
        arrayList.add("ConstraintSets");
        sSections.add("Variables");
        sSections.add("Generate");
        sSections.add(TypedValues.TransitionType.NAME);
        sSections.add("KeyFrames");
        sSections.add(TypedValues.AttributesType.NAME);
        sSections.add("KeyPositions");
        sSections.add("KeyCycles");
    }

    public CLKey(char[] cArr) {
        super(cArr);
    }

    public static CLElement allocate(String str, CLElement cLElement) {
        CLKey cLKey = new CLKey(str.toCharArray());
        cLKey.setStart(0L);
        cLKey.setEnd(str.length() - 1);
        cLKey.set(cLElement);
        return cLKey;
    }

    @Override // androidx.constraintlayout.core.parser.CLContainer, androidx.constraintlayout.core.parser.CLElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof CLKey) && !Objects.equals(getName(), ((CLKey) obj).getName())) {
            return false;
        }
        return super.equals(obj);
    }

    public String getName() {
        return content();
    }

    public CLElement getValue() {
        if (this.mElements.size() > 0) {
            return this.mElements.get(0);
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.parser.CLContainer, androidx.constraintlayout.core.parser.CLElement
    public int hashCode() {
        return super.hashCode();
    }

    public void set(CLElement cLElement) {
        int size = this.mElements.size();
        ArrayList<CLElement> arrayList = this.mElements;
        if (size > 0) {
            arrayList.set(0, cLElement);
        } else {
            arrayList.add(cLElement);
        }
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int i10, int i11) {
        StringBuilder sb = new StringBuilder(getDebugName());
        addIndent(sb, i10);
        String content = content();
        if (this.mElements.size() > 0) {
            sb.append(content);
            sb.append(": ");
            if (sSections.contains(content)) {
                i11 = 3;
            }
            ArrayList<CLElement> arrayList = this.mElements;
            if (i11 > 0) {
                sb.append(arrayList.get(0).toFormattedJSON(i10, i11 - 1));
            } else {
                String json = arrayList.get(0).toJSON();
                if (json.length() + i10 < CLElement.sMaxLine) {
                    sb.append(json);
                } else {
                    sb.append(this.mElements.get(0).toFormattedJSON(i10, i11 - 1));
                }
            }
            return sb.toString();
        }
        return a.C(content, ": <> ");
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        if (this.mElements.size() > 0) {
            return getDebugName() + content() + ": " + this.mElements.get(0).toJSON();
        }
        return getDebugName() + content() + ": <> ";
    }

    public static CLElement allocate(char[] cArr) {
        return new CLKey(cArr);
    }
}
