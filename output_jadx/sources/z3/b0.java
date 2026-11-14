package z3;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import com.example.navistart.R;
import java.io.IOException;
import java.util.Objects;
import m0.e1;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f6737a;

    /* renamed from: b, reason: collision with root package name */
    public final o f6738b;
    public final int[][] c;
    public final o[] d;
    public final a0 e;

    /* renamed from: f, reason: collision with root package name */
    public final a0 f6739f;

    /* renamed from: g, reason: collision with root package name */
    public final a0 f6740g;

    /* renamed from: h, reason: collision with root package name */
    public final a0 f6741h;

    public b0(e1 e1Var) {
        this.f6737a = e1Var.f3671b;
        this.f6738b = (o) e1Var.c;
        this.c = (int[][]) e1Var.d;
        this.d = (o[]) e1Var.e;
        this.e = (a0) e1Var.f3672f;
        this.f6739f = (a0) e1Var.f3673g;
        this.f6740g = (a0) e1Var.f3674h;
        this.f6741h = (a0) e1Var.f3675i;
    }

    public static void a(e1 e1Var, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainStyledAttributes;
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next != 1) {
                int depth2 = xmlResourceParser.getDepth();
                if (depth2 >= depth || next != 3) {
                    if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                        Resources resources = context.getResources();
                        int[] iArr = a3.a.w;
                        if (theme == null) {
                            obtainStyledAttributes = resources.obtainAttributes(attributeSet, iArr);
                        } else {
                            obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                        }
                        o a10 = o.a(context, obtainStyledAttributes.getResourceId(0, 0), obtainStyledAttributes.getResourceId(1, 0)).a();
                        obtainStyledAttributes.recycle();
                        int attributeCount = attributeSet.getAttributeCount();
                        int[] iArr2 = new int[attributeCount];
                        int i10 = 0;
                        for (int i11 = 0; i11 < attributeCount; i11++) {
                            int attributeNameResource = attributeSet.getAttributeNameResource(i11);
                            if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                                int i12 = i10 + 1;
                                if (!attributeSet.getAttributeBooleanValue(i11, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr2[i10] = attributeNameResource;
                                i10 = i12;
                            }
                        }
                        e1Var.a(StateSet.trimStateSet(iArr2, i10), a10);
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [m0.e1, java.lang.Object] */
    public static b0 b(Context context, TypedArray typedArray, int i10) {
        XmlResourceParser xml;
        int next;
        int resourceId = typedArray.getResourceId(i10, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        ?? obj = new Object();
        obj.b();
        try {
            xml = context.getResources().getXml(resourceId);
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            obj.b();
        }
        try {
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                if (xml.getName().equals("selector")) {
                    a(obj, context, xml, asAttributeSet, context.getTheme());
                }
                xml.close();
                if (obj.f3671b == 0) {
                    return null;
                }
                return new b0(obj);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (Throwable th) {
            if (xml != null) {
                try {
                    xml.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final o c() {
        o oVar = this.f6738b;
        a0 a0Var = this.f6741h;
        a0 a0Var2 = this.f6740g;
        a0 a0Var3 = this.f6739f;
        a0 a0Var4 = this.e;
        if (a0Var4 == null && a0Var3 == null && a0Var2 == null && a0Var == null) {
            return oVar;
        }
        n g10 = oVar.g();
        if (a0Var4 != null) {
            g10.e = a0Var4.f6734b;
        }
        if (a0Var3 != null) {
            g10.f6786f = a0Var3.f6734b;
        }
        if (a0Var2 != null) {
            g10.f6788h = a0Var2.f6734b;
        }
        if (a0Var != null) {
            g10.f6787g = a0Var.f6734b;
        }
        return g10.a();
    }

    public final boolean d() {
        a0 a0Var;
        a0 a0Var2;
        a0 a0Var3;
        a0 a0Var4;
        if (this.f6737a > 1 || (((a0Var = this.e) != null && a0Var.f6733a > 1) || (((a0Var2 = this.f6739f) != null && a0Var2.f6733a > 1) || (((a0Var3 = this.f6740g) != null && a0Var3.f6733a > 1) || ((a0Var4 = this.f6741h) != null && a0Var4.f6733a > 1))))) {
            return true;
        }
        return false;
    }
}
