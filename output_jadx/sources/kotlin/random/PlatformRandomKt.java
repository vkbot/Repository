package kotlin.random;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.internal.PlatformImplementationsKt;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0007\u001a\t\u0010\u0004\u001a\u00020\u0002H\u0081\b\u001a\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0000¨\u0006\n"}, d2 = {"asJavaRandom", "Ljava/util/Random;", "Lkotlin/random/Random;", "asKotlinRandom", "defaultPlatformRandom", "doubleFromParts", "", "hi26", "", "low27", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class PlatformRandomKt {
    @SinceKotlin(version = "1.3")
    public static final java.util.Random asJavaRandom(Random random) {
        AbstractPlatformRandom abstractPlatformRandom;
        java.util.Random impl;
        random.getClass();
        if (random instanceof AbstractPlatformRandom) {
            abstractPlatformRandom = (AbstractPlatformRandom) random;
        } else {
            abstractPlatformRandom = null;
        }
        if (abstractPlatformRandom != null && (impl = abstractPlatformRandom.getImpl()) != null) {
            return impl;
        }
        return new KotlinRandom(random);
    }

    @SinceKotlin(version = "1.3")
    public static final Random asKotlinRandom(java.util.Random random) {
        KotlinRandom kotlinRandom;
        Random impl;
        random.getClass();
        if (random instanceof KotlinRandom) {
            kotlinRandom = (KotlinRandom) random;
        } else {
            kotlinRandom = null;
        }
        if (kotlinRandom != null && (impl = kotlinRandom.getImpl()) != null) {
            return impl;
        }
        return new PlatformRandom(random);
    }

    @InlineOnly
    private static final Random defaultPlatformRandom() {
        return PlatformImplementationsKt.IMPLEMENTATIONS.defaultPlatformRandom();
    }

    public static final double doubleFromParts(int i10, int i11) {
        return ((i10 << 27) + i11) / 9.007199254740992E15d;
    }
}
