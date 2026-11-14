package androidx.constraintlayout.core.motion.parse;

import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import java.util.Arrays;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class KeyParser {

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public interface DataType {
        int get(int i10);
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public interface Ids {
        int get(String str);
    }

    public static void main(String[] strArr) {
        parseAttributes("{frame:22,\ntarget:'widget1',\neasing:'easeIn',\ncurveFit:'spline',\nprogress:0.3,\nalpha:0.2,\nelevation:0.7,\nrotationZ:23,\nrotationX:25.0,\nrotationY:27.0,\npivotX:15,\npivotY:17,\npivotTarget:'32',\npathRotate:23,\nscaleX:0.5,\nscaleY:0.7,\ntranslationX:5,\ntranslationY:7,\ntranslationZ:11,\n}");
    }

    private static TypedBundle parse(String str, Ids ids, DataType dataType) {
        TypedBundle typedBundle = new TypedBundle();
        try {
            CLObject parse = CLParser.parse(str);
            int size = parse.size();
            for (int i10 = 0; i10 < size; i10++) {
                CLKey cLKey = (CLKey) parse.get(i10);
                String content = cLKey.content();
                CLElement value = cLKey.getValue();
                int i11 = ids.get(content);
                if (i11 == -1) {
                    System.err.println("unknown type " + content);
                } else {
                    int i12 = dataType.get(i11);
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 4) {
                                if (i12 == 8) {
                                    typedBundle.add(i11, value.content());
                                    System.out.println("parse " + content + " STRING_MASK > " + value.content());
                                }
                            } else {
                                typedBundle.add(i11, value.getFloat());
                                System.out.println("parse " + content + " FLOAT_MASK > " + value.getFloat());
                            }
                        } else {
                            typedBundle.add(i11, value.getInt());
                            System.out.println("parse " + content + " INT_MASK > " + value.getInt());
                        }
                    } else {
                        typedBundle.add(i11, parse.getBoolean(i10));
                    }
                }
            }
            return typedBundle;
        } catch (CLParsingException e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
            return typedBundle;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.constraintlayout.core.motion.parse.KeyParser$Ids, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, androidx.constraintlayout.core.motion.parse.KeyParser$DataType] */
    public static TypedBundle parseAttributes(String str) {
        return parse(str, new Object(), new Object());
    }
}
