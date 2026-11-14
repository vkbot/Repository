package b3;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;
import l9.i;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final SimpleArrayMap f344a = new SimpleArrayMap();

    /* renamed from: b, reason: collision with root package name */
    public final SimpleArrayMap f345b = new SimpleArrayMap();

    public static e a(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0) {
            return b(resourceId, context);
        }
        return null;
    }

    public static e b(int i10, Context context) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i10);
            if (loadAnimator instanceof AnimatorSet) {
                return c(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return c(arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i10), e);
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [b3.f, java.lang.Object] */
    public static e c(ArrayList arrayList) {
        e eVar = new e();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Animator animator = (Animator) arrayList.get(i10);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                eVar.f345b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                ?? obj = new Object();
                obj.d = 0;
                obj.e = 1;
                obj.f346a = startDelay;
                obj.f347b = duration;
                obj.c = interpolator;
                obj.d = objectAnimator.getRepeatCount();
                obj.e = objectAnimator.getRepeatMode();
                eVar.f344a.put(propertyName, obj);
            } else {
                androidx.navigation.b.t(animator, "Animator must be an ObjectAnimator: ");
                return null;
            }
        }
        return eVar;
    }

    public final f d(String str) {
        SimpleArrayMap simpleArrayMap = this.f344a;
        if (simpleArrayMap.get(str) != null) {
            return (f) simpleArrayMap.get(str);
        }
        i.a();
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        return this.f344a.equals(((e) obj).f344a);
    }

    public final int hashCode() {
        return this.f344a.hashCode();
    }

    public final String toString() {
        return "\n" + e.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f344a + "}\n";
    }
}
