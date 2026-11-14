package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B5\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0006\u001a\u00060\u0003j\u0002`\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0010\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u0011H\u0002Jf\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00112\n\u0010-\u001a\u00060\u0003j\u0002`\u00042\n\u0010.\u001a\u00060\u0003j\u0002`\u00042\n\u0010/\u001a\u00060\u0003j\u0002`\u00042\n\u00100\u001a\u00060\u0003j\u0002`\u00042\n\u00101\u001a\u00060\u0003j\u0002`\u00042\u0006\u00102\u001a\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b3\u00104J \u00105\u001a\b\u0012\u0004\u0012\u00020*062\u0006\u00107\u001a\u00020\u00112\b\b\u0002\u00108\u001a\u00020\u0011H\u0007JJ\u00109\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\n\u0010:\u001a\u00060\u0003j\u0002`\u00042\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\n\u0010\u0016\u001a\u00060\u0003j\u0002`\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b;\u0010<R&\u0010\n\u001a\u00060\u0003j\u0002`\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u001d\u0010\u0016\u001a\u00060\u0003j\u0002`\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0017\u0010\fR\u001d\u0010\u0018\u001a\u00060\u0003j\u0002`\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0019\u0010\fR\u0011\u0010\u001a\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\u001c\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u001d\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u001e\u0010\fR\u001d\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u001f\u0010\fR\u001d\u0010\u0006\u001a\u00060\u0003j\u0002`\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b \u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0013R\u0011\u0010%\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006="}, d2 = {"Landroidx/graphics/shapes/RoundedCorner;", "", "p0", "Landroidx/collection/FloatFloatPair;", "Landroidx/graphics/shapes/Point;", "p1", "p2", "rounding", "Landroidx/graphics/shapes/CornerRounding;", "(JJJLandroidx/graphics/shapes/CornerRounding;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "center", "getCenter-1ufDz9w", "()J", "setCenter-DnnuFBc", "(J)V", "J", "cornerRadius", "", "getCornerRadius", "()F", "cosAngle", "getCosAngle", "d1", "getD1-1ufDz9w", "d2", "getD2-1ufDz9w", "expectedCut", "getExpectedCut", "expectedRoundCut", "getExpectedRoundCut", "getP0-1ufDz9w", "getP1-1ufDz9w", "getP2-1ufDz9w", "getRounding", "()Landroidx/graphics/shapes/CornerRounding;", "sinAngle", "getSinAngle", "smoothing", "getSmoothing", "calculateActualSmoothingValue", "allowedCut", "computeFlankingCurve", "Landroidx/graphics/shapes/Cubic;", "actualRoundCut", "actualSmoothingValues", "corner", "sideStart", "circleSegmentIntersection", "otherCircleSegmentIntersection", "circleCenter", "actualR", "computeFlankingCurve-oAJzIJU", "(FFJJJJJF)Landroidx/graphics/shapes/Cubic;", "getCubics", "", "allowedCut0", "allowedCut1", "lineIntersection", "d0", "lineIntersection-CBFvKDc", "(JJJJ)Landroidx/collection/FloatFloatPair;", "graphics-shapes_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class RoundedCorner {
    private long center;
    private final float cornerRadius;
    private final float cosAngle;
    private final long d1;
    private final long d2;
    private final float expectedRoundCut;
    private final long p0;
    private final long p1;
    private final long p2;
    private final CornerRounding rounding;
    private final float sinAngle;
    private final float smoothing;

    private RoundedCorner(long j10, long j11, long j12, CornerRounding cornerRounding) {
        float f8;
        float f10;
        float f11;
        this.p0 = j10;
        this.p1 = j11;
        this.p2 = j12;
        this.rounding = cornerRounding;
        long m47getDirectionDnnuFBc = PointKt.m47getDirectionDnnuFBc(PointKt.m53minusybeJwSQ(j10, j11));
        this.d1 = m47getDirectionDnnuFBc;
        long m47getDirectionDnnuFBc2 = PointKt.m47getDirectionDnnuFBc(PointKt.m53minusybeJwSQ(j12, j11));
        this.d2 = m47getDirectionDnnuFBc2;
        if (cornerRounding != null) {
            f8 = cornerRounding.getRadius();
        } else {
            f8 = 0.0f;
        }
        this.cornerRadius = f8;
        if (cornerRounding != null) {
            f10 = cornerRounding.getSmoothing();
        } else {
            f10 = 0.0f;
        }
        this.smoothing = f10;
        float m46dotProductybeJwSQ = PointKt.m46dotProductybeJwSQ(m47getDirectionDnnuFBc, m47getDirectionDnnuFBc2);
        this.cosAngle = m46dotProductybeJwSQ;
        float f12 = 1;
        float sqrt = (float) Math.sqrt(f12 - Utils.square(m46dotProductybeJwSQ));
        this.sinAngle = sqrt;
        if (sqrt > 0.001d) {
            f11 = ((m46dotProductybeJwSQ + f12) * f8) / sqrt;
        } else {
            f11 = 0.0f;
        }
        this.expectedRoundCut = f11;
        this.center = FloatFloatPair.m3constructorimpl(0.0f, 0.0f);
    }

    private final float calculateActualSmoothingValue(float allowedCut) {
        if (allowedCut > getExpectedCut()) {
            return this.smoothing;
        }
        float f8 = this.expectedRoundCut;
        if (allowedCut > f8) {
            return ((allowedCut - f8) * this.smoothing) / (getExpectedCut() - this.expectedRoundCut);
        }
        return 0.0f;
    }

    /* renamed from: computeFlankingCurve-oAJzIJU, reason: not valid java name */
    private final Cubic m60computeFlankingCurveoAJzIJU(float actualRoundCut, float actualSmoothingValues, long corner, long sideStart, long circleSegmentIntersection, long otherCircleSegmentIntersection, long circleCenter, float actualR) {
        long m47getDirectionDnnuFBc = PointKt.m47getDirectionDnnuFBc(PointKt.m53minusybeJwSQ(sideStart, corner));
        long m54plusybeJwSQ = PointKt.m54plusybeJwSQ(corner, PointKt.m56timesso9K2fw(PointKt.m56timesso9K2fw(m47getDirectionDnnuFBc, actualRoundCut), 1 + actualSmoothingValues));
        long j10 = circleSegmentIntersection;
        long m52interpolatedLqxh1s = PointKt.m52interpolatedLqxh1s(j10, PointKt.m44divso9K2fw(PointKt.m54plusybeJwSQ(circleSegmentIntersection, otherCircleSegmentIntersection), 2.0f), actualSmoothingValues);
        long m54plusybeJwSQ2 = PointKt.m54plusybeJwSQ(circleCenter, PointKt.m56timesso9K2fw(Utils.directionVector(PointKt.m50getXDnnuFBc(m52interpolatedLqxh1s) - PointKt.m50getXDnnuFBc(circleCenter), PointKt.m51getYDnnuFBc(m52interpolatedLqxh1s) - PointKt.m51getYDnnuFBc(circleCenter)), actualR));
        FloatFloatPair m61lineIntersectionCBFvKDc = m61lineIntersectionCBFvKDc(sideStart, m47getDirectionDnnuFBc, m54plusybeJwSQ2, Utils.m71rotate90DnnuFBc(PointKt.m53minusybeJwSQ(m54plusybeJwSQ2, circleCenter)));
        if (m61lineIntersectionCBFvKDc != null) {
            j10 = m61lineIntersectionCBFvKDc.getPackedValue();
        }
        return new Cubic(m54plusybeJwSQ, PointKt.m44divso9K2fw(PointKt.m54plusybeJwSQ(m54plusybeJwSQ, PointKt.m56timesso9K2fw(j10, 2.0f)), 3.0f), j10, m54plusybeJwSQ2, null);
    }

    public static /* synthetic */ List getCubics$default(RoundedCorner roundedCorner, float f8, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = f8;
        }
        return roundedCorner.getCubics(f8, f10);
    }

    /* renamed from: lineIntersection-CBFvKDc, reason: not valid java name */
    private final FloatFloatPair m61lineIntersectionCBFvKDc(long p02, long d02, long p1, long d12) {
        long m71rotate90DnnuFBc = Utils.m71rotate90DnnuFBc(d12);
        float m46dotProductybeJwSQ = PointKt.m46dotProductybeJwSQ(d02, m71rotate90DnnuFBc);
        if (Math.abs(m46dotProductybeJwSQ) < 1.0E-4f) {
            return null;
        }
        float m46dotProductybeJwSQ2 = PointKt.m46dotProductybeJwSQ(PointKt.m53minusybeJwSQ(p1, p02), m71rotate90DnnuFBc);
        if (Math.abs(m46dotProductybeJwSQ) < Math.abs(m46dotProductybeJwSQ2) * 1.0E-4f) {
            return null;
        }
        return FloatFloatPair.m0boximpl(PointKt.m54plusybeJwSQ(p02, PointKt.m56timesso9K2fw(d02, m46dotProductybeJwSQ2 / m46dotProductybeJwSQ)));
    }

    /* renamed from: getCenter-1ufDz9w, reason: not valid java name and from getter */
    public final long getCenter() {
        return this.center;
    }

    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    public final float getCosAngle() {
        return this.cosAngle;
    }

    @JvmOverloads
    public final List<Cubic> getCubics(float allowedCut0, float allowedCut1) {
        float min = Math.min(allowedCut0, allowedCut1);
        float f8 = this.expectedRoundCut;
        if (f8 >= 1.0E-4f && min >= 1.0E-4f && this.cornerRadius >= 1.0E-4f) {
            float min2 = Math.min(min, f8);
            float calculateActualSmoothingValue = calculateActualSmoothingValue(allowedCut0);
            float calculateActualSmoothingValue2 = calculateActualSmoothingValue(allowedCut1);
            float f10 = (this.cornerRadius * min2) / this.expectedRoundCut;
            this.center = PointKt.m54plusybeJwSQ(this.p1, PointKt.m56timesso9K2fw(PointKt.m47getDirectionDnnuFBc(PointKt.m44divso9K2fw(PointKt.m54plusybeJwSQ(this.d1, this.d2), 2.0f)), (float) Math.sqrt(Utils.square(min2) + Utils.square(f10))));
            long m54plusybeJwSQ = PointKt.m54plusybeJwSQ(this.p1, PointKt.m56timesso9K2fw(this.d1, min2));
            long m54plusybeJwSQ2 = PointKt.m54plusybeJwSQ(this.p1, PointKt.m56timesso9K2fw(this.d2, min2));
            Cubic m60computeFlankingCurveoAJzIJU = m60computeFlankingCurveoAJzIJU(min2, calculateActualSmoothingValue, this.p1, this.p0, m54plusybeJwSQ, m54plusybeJwSQ2, this.center, f10);
            Cubic reverse = m60computeFlankingCurveoAJzIJU(min2, calculateActualSmoothingValue2, this.p1, this.p2, m54plusybeJwSQ2, m54plusybeJwSQ, this.center, f10).reverse();
            return CollectionsKt.listOf((Object[]) new Cubic[]{m60computeFlankingCurveoAJzIJU, Cubic.INSTANCE.circularArc(PointKt.m50getXDnnuFBc(this.center), PointKt.m51getYDnnuFBc(this.center), m60computeFlankingCurveoAJzIJU.getAnchor1X(), m60computeFlankingCurveoAJzIJU.getAnchor1Y(), reverse.getAnchor0X(), reverse.getAnchor0Y()), reverse});
        }
        long j10 = this.p1;
        this.center = j10;
        return CollectionsKt.listOf(Cubic.INSTANCE.straightLine(PointKt.m50getXDnnuFBc(j10), PointKt.m51getYDnnuFBc(this.p1), PointKt.m50getXDnnuFBc(this.p1), PointKt.m51getYDnnuFBc(this.p1)));
    }

    /* renamed from: getD1-1ufDz9w, reason: not valid java name and from getter */
    public final long getD1() {
        return this.d1;
    }

    /* renamed from: getD2-1ufDz9w, reason: not valid java name and from getter */
    public final long getD2() {
        return this.d2;
    }

    public final float getExpectedCut() {
        return (1 + this.smoothing) * this.expectedRoundCut;
    }

    public final float getExpectedRoundCut() {
        return this.expectedRoundCut;
    }

    /* renamed from: getP0-1ufDz9w, reason: not valid java name and from getter */
    public final long getP0() {
        return this.p0;
    }

    /* renamed from: getP1-1ufDz9w, reason: not valid java name and from getter */
    public final long getP1() {
        return this.p1;
    }

    /* renamed from: getP2-1ufDz9w, reason: not valid java name and from getter */
    public final long getP2() {
        return this.p2;
    }

    public final CornerRounding getRounding() {
        return this.rounding;
    }

    public final float getSinAngle() {
        return this.sinAngle;
    }

    public final float getSmoothing() {
        return this.smoothing;
    }

    /* renamed from: setCenter-DnnuFBc, reason: not valid java name */
    public final void m68setCenterDnnuFBc(long j10) {
        this.center = j10;
    }

    public /* synthetic */ RoundedCorner(long j10, long j11, long j12, CornerRounding cornerRounding, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, cornerRounding);
    }

    public /* synthetic */ RoundedCorner(long j10, long j11, long j12, CornerRounding cornerRounding, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, (i10 & 8) != 0 ? null : cornerRounding, null);
    }

    @JvmOverloads
    public final List<Cubic> getCubics(float f8) {
        return getCubics$default(this, f8, 0.0f, 2, null);
    }
}
