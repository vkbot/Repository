package b3;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class b {
    public static void a(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Animator animator = (Animator) arrayList.get(i10);
            j10 = Math.max(j10, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j10);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }
}
