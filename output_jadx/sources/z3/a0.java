package z3;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import com.example.navistart.R;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public int f6733a;

    /* renamed from: b, reason: collision with root package name */
    public d f6734b;
    public int[][] c = new int[10];
    public d[] d = new d[10];

    public static a0 b(d dVar) {
        a0 a0Var = new a0();
        a0Var.a(StateSet.WILD_CARD, dVar);
        return a0Var;
    }

    public final void a(int[] iArr, d dVar) {
        int i10 = this.f6733a;
        if (i10 == 0 || iArr.length == 0) {
            this.f6734b = dVar;
        }
        int[][] iArr2 = this.c;
        if (i10 >= iArr2.length) {
            int i11 = i10 + 10;
            int[][] iArr3 = new int[i11];
            System.arraycopy(iArr2, 0, iArr3, 0, i10);
            this.c = iArr3;
            d[] dVarArr = new d[i11];
            System.arraycopy(this.d, 0, dVarArr, 0, i10);
            this.d = dVarArr;
        }
        int[][] iArr4 = this.c;
        int i12 = this.f6733a;
        iArr4[i12] = iArr;
        this.d[i12] = dVar;
        this.f6733a = i12 + 1;
    }

    public final d c(int[] iArr) {
        int i10;
        int[][] iArr2 = this.c;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = -1;
            if (i12 < this.f6733a) {
                if (StateSet.stateSetMatches(iArr2[i12], iArr)) {
                    break;
                }
                i12++;
            } else {
                i12 = -1;
                break;
            }
        }
        if (i12 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int[][] iArr4 = this.c;
            while (true) {
                if (i11 >= this.f6733a) {
                    break;
                }
                if (StateSet.stateSetMatches(iArr4[i11], iArr3)) {
                    i10 = i11;
                    break;
                }
                i11++;
            }
            i12 = i10;
        }
        if (i12 < 0) {
            return this.f6734b;
        }
        return this.d[i12];
    }

    public final void d(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainStyledAttributes;
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next != 1) {
                int depth2 = xmlResourceParser.getDepth();
                if (depth2 >= depth || next != 3) {
                    if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                        Resources resources = context.getResources();
                        int[] iArr = a3.a.E;
                        if (theme == null) {
                            obtainStyledAttributes = resources.obtainAttributes(attributeSet, iArr);
                        } else {
                            obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                        }
                        d d = o.d(obtainStyledAttributes, 5, new a(0.0f));
                        obtainStyledAttributes.recycle();
                        int attributeCount = attributeSet.getAttributeCount();
                        int[] iArr2 = new int[attributeCount];
                        int i10 = 0;
                        for (int i11 = 0; i11 < attributeCount; i11++) {
                            int attributeNameResource = attributeSet.getAttributeNameResource(i11);
                            if (attributeNameResource != R.attr.cornerSize) {
                                int i12 = i10 + 1;
                                if (!attributeSet.getAttributeBooleanValue(i11, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr2[i10] = attributeNameResource;
                                i10 = i12;
                            }
                        }
                        a(StateSet.trimStateSet(iArr2, i10), d);
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
