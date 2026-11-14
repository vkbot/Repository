package androidx.emoji2.text;

import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
class EmojiExclusions {

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @RequiresApi(34)
    /* loaded from: classes.dex */
    public static class EmojiExclusions_Api34 {
        private EmojiExclusions_Api34() {
        }

        @NonNull
        @DoNotInline
        public static Set<int[]> getExclusions() {
            return EmojiExclusions_Reflections.getExclusions();
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class EmojiExclusions_Reflections {
        private EmojiExclusions_Reflections() {
        }

        @NonNull
        public static Set<int[]> getExclusions() {
            try {
                Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
                if (invoke == null) {
                    return Collections.EMPTY_SET;
                }
                Set<int[]> set = (Set) invoke;
                Iterator<int[]> it = set.iterator();
                while (it.hasNext()) {
                    if (!(it.next() instanceof int[])) {
                        return Collections.EMPTY_SET;
                    }
                }
                return set;
            } catch (Throwable unused) {
                return Collections.EMPTY_SET;
            }
        }
    }

    private EmojiExclusions() {
    }

    @NonNull
    public static Set<int[]> getEmojiExclusions() {
        if (Build.VERSION.SDK_INT >= 34) {
            return EmojiExclusions_Api34.getExclusions();
        }
        return EmojiExclusions_Reflections.getExclusions();
    }
}
