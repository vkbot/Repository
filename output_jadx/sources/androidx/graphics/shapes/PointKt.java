package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import androidx.constraintlayout.widget.ConstraintLayout;
import j1.i;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a6\u0010\b\u001a\u00060\u0002j\u0002`\u00032\n\u0010\t\u001a\u00060\u0002j\u0002`\u00032\n\u0010\n\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u000b\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a&\u0010\u000e\u001a\u00020\u000f*\u00060\u0002j\u0002`\u00032\n\u0010\u0010\u001a\u00060\u0002j\u0002`\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a2\u0010\u0013\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0016\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\u0006\u0010\u0017\u001a\u00020\u0001H\u0080\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a&\u0010\u001a\u001a\u00020\u0001*\u00060\u0002j\u0002`\u00032\n\u0010\u0010\u001a\u00060\u0002j\u0002`\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a*\u0010\u001a\u001a\u00020\u0001*\u00060\u0002j\u0002`\u00032\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u001e\u0010!\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a\u001a\u0010$\u001a\u00020\u0001*\u00060\u0002j\u0002`\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b%\u0010\u0005\u001a\u001a\u0010&\u001a\u00020\u0001*\u00060\u0002j\u0002`\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b'\u0010\u0005\u001a+\u0010(\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\n\u0010\u0010\u001a\u00060\u0002j\u0002`\u0003H\u0080\u0002ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a+\u0010+\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\n\u0010\u0010\u001a\u00060\u0002j\u0002`\u0003H\u0080\u0002ø\u0001\u0000¢\u0006\u0004\b,\u0010*\u001a'\u0010-\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\u0006\u0010\u0017\u001a\u00020\u0001H\u0080\u0002ø\u0001\u0000¢\u0006\u0004\b.\u0010\u0019\u001a'\u0010/\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\u0006\u0010\u0017\u001a\u00020\u0001H\u0080\u0002ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0019\u001a&\u00101\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\u0006\u00102\u001a\u000203H\u0000ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a\u001f\u00106\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u0003H\u0080\u0002ø\u0001\u0000¢\u0006\u0004\b7\u0010#\"\u001c\u0010\u0000\u001a\u00020\u0001*\u00060\u0002j\u0002`\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u001c\u0010\u0006\u001a\u00020\u0001*\u00060\u0002j\u0002`\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005*\f\b\u0000\u00108\"\u00020\u00022\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00069"}, d2 = {"x", "", "Landroidx/collection/FloatFloatPair;", "Landroidx/graphics/shapes/Point;", "getX-DnnuFBc", "(J)F", "y", "getY-DnnuFBc", "interpolate", "start", "stop", "fraction", "interpolate-dLqxh1s", "(JJF)J", "clockwise", "", "other", "clockwise-ybeJwSQ", "(JJ)Z", "copy", "copy-5P9i7ZU", "(JFF)J", "div", "operand", "div-so9K2fw", "(JF)J", "dotProduct", "dotProduct-ybeJwSQ", "(JJ)F", "otherX", "otherY", "dotProduct-5P9i7ZU", "(JFF)F", "getDirection", "getDirection-DnnuFBc", "(J)J", "getDistance", "getDistance-DnnuFBc", "getDistanceSquared", "getDistanceSquared-DnnuFBc", "minus", "minus-ybeJwSQ", "(JJ)J", "plus", "plus-ybeJwSQ", "rem", "rem-so9K2fw", "times", "times-so9K2fw", "transformed", "f", "Landroidx/graphics/shapes/PointTransformer;", "transformed-so9K2fw", "(JLandroidx/graphics/shapes/PointTransformer;)J", "unaryMinus", "unaryMinus-DnnuFBc", "Point", "graphics-shapes_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nPoint.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Point.kt\nandroidx/graphics/shapes/PointKt\n+ 2 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n+ 3 PackingHelpers.jvm.kt\nandroidx/collection/internal/PackingHelpers_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n48#2:140\n54#2:142\n48#2:144\n54#2:146\n48#2:148\n54#2:150\n22#3:141\n22#3:143\n22#3:145\n22#3:149\n1#4:147\n*S KotlinDebug\n*F\n+ 1 Point.kt\nandroidx/graphics/shapes/PointKt\n*L\n27#1:140\n30#1:142\n32#1:144\n32#1:146\n137#1:148\n137#1:150\n27#1:141\n30#1:143\n32#1:145\n137#1:149\n*E\n"})
/* loaded from: classes.dex */
public final class PointKt {
    /* renamed from: clockwise-ybeJwSQ, reason: not valid java name */
    public static final boolean m41clockwiseybeJwSQ(long j10, long j11) {
        if ((m51getYDnnuFBc(j11) * m50getXDnnuFBc(j10)) - (m50getXDnnuFBc(j11) * m51getYDnnuFBc(j10)) > 0.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: copy-5P9i7ZU, reason: not valid java name */
    public static final long m42copy5P9i7ZU(long j10, float f8, float f10) {
        return FloatFloatPair.m3constructorimpl(f8, f10);
    }

    /* renamed from: copy-5P9i7ZU$default, reason: not valid java name */
    public static /* synthetic */ long m43copy5P9i7ZU$default(long j10, float f8, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f8 = Float.intBitsToFloat((int) (j10 >> 32));
        }
        if ((i10 & 2) != 0) {
            f10 = Float.intBitsToFloat((int) (4294967295L & j10));
        }
        return m42copy5P9i7ZU(j10, f8, f10);
    }

    /* renamed from: div-so9K2fw, reason: not valid java name */
    public static final long m44divso9K2fw(long j10, float f8) {
        return FloatFloatPair.m3constructorimpl(m50getXDnnuFBc(j10) / f8, m51getYDnnuFBc(j10) / f8);
    }

    /* renamed from: dotProduct-5P9i7ZU, reason: not valid java name */
    public static final float m45dotProduct5P9i7ZU(long j10, float f8, float f10) {
        return (m51getYDnnuFBc(j10) * f10) + (m50getXDnnuFBc(j10) * f8);
    }

    /* renamed from: dotProduct-ybeJwSQ, reason: not valid java name */
    public static final float m46dotProductybeJwSQ(long j10, long j11) {
        return (m51getYDnnuFBc(j11) * m51getYDnnuFBc(j10)) + (m50getXDnnuFBc(j11) * m50getXDnnuFBc(j10));
    }

    /* renamed from: getDirection-DnnuFBc, reason: not valid java name */
    public static final long m47getDirectionDnnuFBc(long j10) {
        float m48getDistanceDnnuFBc = m48getDistanceDnnuFBc(j10);
        if (m48getDistanceDnnuFBc > 0.0f) {
            return m44divso9K2fw(j10, m48getDistanceDnnuFBc);
        }
        i.k("Can't get the direction of a 0-length vector");
        return 0L;
    }

    /* renamed from: getDistance-DnnuFBc, reason: not valid java name */
    public static final float m48getDistanceDnnuFBc(long j10) {
        return (float) Math.sqrt((m51getYDnnuFBc(j10) * m51getYDnnuFBc(j10)) + (m50getXDnnuFBc(j10) * m50getXDnnuFBc(j10)));
    }

    /* renamed from: getDistanceSquared-DnnuFBc, reason: not valid java name */
    public static final float m49getDistanceSquaredDnnuFBc(long j10) {
        return (m51getYDnnuFBc(j10) * m51getYDnnuFBc(j10)) + (m50getXDnnuFBc(j10) * m50getXDnnuFBc(j10));
    }

    /* renamed from: getX-DnnuFBc, reason: not valid java name */
    public static final float m50getXDnnuFBc(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    /* renamed from: getY-DnnuFBc, reason: not valid java name */
    public static final float m51getYDnnuFBc(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* renamed from: interpolate-dLqxh1s, reason: not valid java name */
    public static final long m52interpolatedLqxh1s(long j10, long j11, float f8) {
        return FloatFloatPair.m3constructorimpl(Utils.interpolate(m50getXDnnuFBc(j10), m50getXDnnuFBc(j11), f8), Utils.interpolate(m51getYDnnuFBc(j10), m51getYDnnuFBc(j11), f8));
    }

    /* renamed from: minus-ybeJwSQ, reason: not valid java name */
    public static final long m53minusybeJwSQ(long j10, long j11) {
        return FloatFloatPair.m3constructorimpl(m50getXDnnuFBc(j10) - m50getXDnnuFBc(j11), m51getYDnnuFBc(j10) - m51getYDnnuFBc(j11));
    }

    /* renamed from: plus-ybeJwSQ, reason: not valid java name */
    public static final long m54plusybeJwSQ(long j10, long j11) {
        return FloatFloatPair.m3constructorimpl(m50getXDnnuFBc(j11) + m50getXDnnuFBc(j10), m51getYDnnuFBc(j11) + m51getYDnnuFBc(j10));
    }

    /* renamed from: rem-so9K2fw, reason: not valid java name */
    public static final long m55remso9K2fw(long j10, float f8) {
        return FloatFloatPair.m3constructorimpl(m50getXDnnuFBc(j10) % f8, m51getYDnnuFBc(j10) % f8);
    }

    /* renamed from: times-so9K2fw, reason: not valid java name */
    public static final long m56timesso9K2fw(long j10, float f8) {
        return FloatFloatPair.m3constructorimpl(m50getXDnnuFBc(j10) * f8, m51getYDnnuFBc(j10) * f8);
    }

    /* renamed from: transformed-so9K2fw, reason: not valid java name */
    public static final long m57transformedso9K2fw(long j10, PointTransformer pointTransformer) {
        pointTransformer.getClass();
        long mo59transformXgqJiTY = pointTransformer.mo59transformXgqJiTY(m50getXDnnuFBc(j10), m51getYDnnuFBc(j10));
        return FloatFloatPair.m3constructorimpl(Float.intBitsToFloat((int) (mo59transformXgqJiTY >> 32)), Float.intBitsToFloat((int) (mo59transformXgqJiTY & 4294967295L)));
    }

    /* renamed from: unaryMinus-DnnuFBc, reason: not valid java name */
    public static final long m58unaryMinusDnnuFBc(long j10) {
        return FloatFloatPair.m3constructorimpl(-m50getXDnnuFBc(j10), -m51getYDnnuFBc(j10));
    }
}
