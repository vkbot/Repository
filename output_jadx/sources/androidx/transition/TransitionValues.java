package androidx.transition;

import android.view.View;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class TransitionValues {
    public View view;
    public final Map<String, Object> values = new HashMap();
    final ArrayList<Transition> mTargetedTransitions = new ArrayList<>();

    public TransitionValues(@NonNull View view) {
        this.view = view;
    }

    public boolean equals(Object obj) {
        if (obj instanceof TransitionValues) {
            TransitionValues transitionValues = (TransitionValues) obj;
            if (this.view == transitionValues.view && this.values.equals(transitionValues.values)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return this.values.hashCode() + (this.view.hashCode() * 31);
    }

    @NonNull
    public String toString() {
        StringBuilder w = ai.onnxruntime.a.w("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        w.append(this.view);
        w.append("\n");
        String concat = w.toString().concat("    values:");
        for (String str : this.values.keySet()) {
            concat = concat + "    " + str + ": " + this.values.get(str) + "\n";
        }
        return concat;
    }

    @Deprecated
    public TransitionValues() {
    }
}
