package kotlin.time.jdk8;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;
import kotlin.time.ExperimentalTime;
import kotlin.time.Instant;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0007¨\u0006\u0004"}, d2 = {"toJavaInstant", "Ljava/time/Instant;", "Lkotlin/time/Instant;", "toKotlinInstant", "kotlin-stdlib-jdk8"}, k = 2, mv = {2, 2, 0}, pn = "kotlin.time", xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmName(name = "InstantConversionsJDK8Kt")
/* loaded from: classes2.dex */
public final class InstantConversionsJDK8Kt {
    @SinceKotlin(version = "2.1")
    @ExperimentalTime
    public static final Instant toJavaInstant(kotlin.time.Instant instant) {
        Instant ofEpochSecond;
        instant.getClass();
        ofEpochSecond = Instant.ofEpochSecond(instant.getEpochSeconds(), instant.getNanosecondsOfSecond());
        ofEpochSecond.getClass();
        return ofEpochSecond;
    }

    @SinceKotlin(version = "2.1")
    @ExperimentalTime
    public static final kotlin.time.Instant toKotlinInstant(Instant instant) {
        long epochSecond;
        int nano;
        instant.getClass();
        Instant.Companion companion = kotlin.time.Instant.INSTANCE;
        epochSecond = instant.getEpochSecond();
        nano = instant.getNano();
        return companion.fromEpochSeconds(epochSecond, nano);
    }
}
