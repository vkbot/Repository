package androidx.constraintlayout.core.parser;

import java.util.ArrayList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class CLArray extends CLContainer {
    public CLArray(char[] cArr) {
        super(cArr);
    }

    public static CLElement allocate(char[] cArr) {
        return new CLArray(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int i10, int i11) {
        StringBuilder sb = new StringBuilder();
        String json = toJSON();
        if (i11 <= 0 && json.length() + i10 < CLElement.sMaxLine) {
            sb.append(json);
        } else {
            sb.append("[\n");
            ArrayList<CLElement> arrayList = this.mElements;
            int size = arrayList.size();
            int i12 = 0;
            boolean z9 = true;
            while (i12 < size) {
                CLElement cLElement = arrayList.get(i12);
                i12++;
                CLElement cLElement2 = cLElement;
                if (!z9) {
                    sb.append(",\n");
                } else {
                    z9 = false;
                }
                addIndent(sb, CLElement.sBaseIndent + i10);
                sb.append(cLElement2.toFormattedJSON(CLElement.sBaseIndent + i10, i11 - 1));
            }
            sb.append("\n");
            addIndent(sb, i10);
            sb.append("]");
        }
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        StringBuilder sb = new StringBuilder(getDebugName() + "[");
        boolean z9 = true;
        for (int i10 = 0; i10 < this.mElements.size(); i10++) {
            if (!z9) {
                sb.append(", ");
            } else {
                z9 = false;
            }
            sb.append(this.mElements.get(i10).toJSON());
        }
        return ((Object) sb) + "]";
    }
}
