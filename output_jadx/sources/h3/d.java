package h3;

import android.content.pm.ResolveInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.text.Collator;
import java.util.Comparator;
import m0.k0;
import m0.n0;
import s1.q0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2552b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d(int i10, Object obj) {
        this.f2552b = i10;
        this.c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10 = this.f2552b;
        Object obj3 = this.c;
        switch (i10) {
            case 0:
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj3;
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int compareTo = Boolean.valueOf(materialButton.f1255m).compareTo(Boolean.valueOf(materialButton2.f1255m));
                if (compareTo == 0) {
                    int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                    if (compareTo2 == 0) {
                        return Integer.compare(materialButtonToggleGroup.indexOfChild(materialButton), materialButtonToggleGroup.indexOfChild(materialButton2));
                    }
                    return compareTo2;
                }
                return compareTo;
            case 1:
                String str = n0.f3795k;
                return ((Collator) obj3).compare(((k0) obj).f3759b, ((k0) obj2).f3759b);
            default:
                q0 q0Var = (q0) obj3;
                return ((ResolveInfo) obj).loadLabel(q0Var.getContext().getPackageManager()).toString().compareToIgnoreCase(((ResolveInfo) obj2).loadLabel(q0Var.getContext().getPackageManager()).toString());
        }
    }
}
