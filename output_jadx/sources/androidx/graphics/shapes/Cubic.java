package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.b;
import j1.i;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 ?2\u00020\u0001:\u0001?B7\b\u0010\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0006\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0007\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\bB\u0011\b\u0000\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ!\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\n2\b\b\u0002\u0010#\u001a\u00020$H\u0000¢\u0006\u0002\b%J\u0011\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\rH\u0086\u0002J\u0011\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(H\u0086\u0002J\u0013\u0010)\u001a\u00020$2\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010+\u001a\u00020(H\u0016J\u0011\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u0000H\u0086\u0002J!\u0010.\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010/\u001a\u00020\rH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101J\u0006\u00102\u001a\u00020\u0000J\u001a\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000042\u0006\u0010/\u001a\u00020\rJ\u0011\u00105\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\rH\u0086\u0002J\u0011\u00105\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(H\u0086\u0002J\b\u00106\u001a\u000207H\u0016J\u000e\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020:J\u0010\u0010;\u001a\u00020$2\u0006\u0010<\u001a\u00020\rH\u0002J\r\u0010=\u001a\u00020$H\u0000¢\u0006\u0002\b>R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0016\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\u0018\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000fR\u0011\u0010\u001a\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000fR\u0011\u0010\u001c\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000fR\u0014\u0010\t\u001a\u00020\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006@"}, d2 = {"Landroidx/graphics/shapes/Cubic;", "", "anchor0", "Landroidx/collection/FloatFloatPair;", "Landroidx/graphics/shapes/Point;", "control0", "control1", "anchor1", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "points", "", "([F)V", "anchor0X", "", "getAnchor0X", "()F", "anchor0Y", "getAnchor0Y", "anchor1X", "getAnchor1X", "anchor1Y", "getAnchor1Y", "control0X", "getControl0X", "control0Y", "getControl0Y", "control1X", "getControl1X", "control1Y", "getControl1Y", "getPoints$graphics_shapes_release", "()[F", "calculateBounds", "", "bounds", "approximate", "", "calculateBounds$graphics_shapes_release", "div", "x", "", "equals", "other", "hashCode", "plus", "o", "pointOnCurve", "t", "pointOnCurve-OOQOV4g$graphics_shapes_release", "(F)J", "reverse", "split", "Lkotlin/Pair;", "times", "toString", "", "transformed", "f", "Landroidx/graphics/shapes/PointTransformer;", "zeroIsh", "value", "zeroLength", "zeroLength$graphics_shapes_release", "Companion", "graphics-shapes_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nCubic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cubic.kt\nandroidx/graphics/shapes/Cubic\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,448:1\n1#2:449\n*E\n"})
/* loaded from: classes.dex */
public class Cubic {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final float[] points;

    private Cubic(long j10, long j11, long j12, long j13) {
        this(new float[]{PointKt.m50getXDnnuFBc(j10), PointKt.m51getYDnnuFBc(j10), PointKt.m50getXDnnuFBc(j11), PointKt.m51getYDnnuFBc(j11), PointKt.m50getXDnnuFBc(j12), PointKt.m51getYDnnuFBc(j12), PointKt.m50getXDnnuFBc(j13), PointKt.m51getYDnnuFBc(j13)});
    }

    public static /* synthetic */ void calculateBounds$graphics_shapes_release$default(Cubic cubic, float[] fArr, boolean z9, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                fArr = new float[4];
            }
            if ((i10 & 2) != 0) {
                z9 = false;
            }
            cubic.calculateBounds$graphics_shapes_release(fArr, z9);
            return;
        }
        b.g("Super calls with default arguments not supported in this target, function: calculateBounds");
    }

    @JvmStatic
    public static final Cubic circularArc(float f8, float f10, float f11, float f12, float f13, float f14) {
        return INSTANCE.circularArc(f8, f10, f11, f12, f13, f14);
    }

    @JvmStatic
    public static final Cubic straightLine(float f8, float f10, float f11, float f12) {
        return INSTANCE.straightLine(f8, f10, f11, f12);
    }

    private final boolean zeroIsh(float value) {
        if (Math.abs(value) < 1.0E-4f) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x01c0, code lost:
    
        if (r2 > r8) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01c2, code lost:
    
        r8 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0211, code lost:
    
        if (r2 > r8) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void calculateBounds$graphics_shapes_release(float[] r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.graphics.shapes.Cubic.calculateBounds$graphics_shapes_release(float[], boolean):void");
    }

    public final Cubic div(float x9) {
        return times(1.0f / x9);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Cubic)) {
            return false;
        }
        return Arrays.equals(this.points, ((Cubic) other).points);
    }

    public final float getAnchor0X() {
        return this.points[0];
    }

    public final float getAnchor0Y() {
        return this.points[1];
    }

    public final float getAnchor1X() {
        return this.points[6];
    }

    public final float getAnchor1Y() {
        return this.points[7];
    }

    public final float getControl0X() {
        return this.points[2];
    }

    public final float getControl0Y() {
        return this.points[3];
    }

    public final float getControl1X() {
        return this.points[4];
    }

    public final float getControl1Y() {
        return this.points[5];
    }

    /* renamed from: getPoints$graphics_shapes_release, reason: from getter */
    public final float[] getPoints() {
        return this.points;
    }

    public int hashCode() {
        return Arrays.hashCode(this.points);
    }

    public final Cubic plus(Cubic o5) {
        o5.getClass();
        float[] fArr = new float[8];
        for (int i10 = 0; i10 < 8; i10++) {
            fArr[i10] = this.points[i10] + o5.points[i10];
        }
        return new Cubic(fArr);
    }

    /* renamed from: pointOnCurve-OOQOV4g$graphics_shapes_release, reason: not valid java name */
    public final long m38pointOnCurveOOQOV4g$graphics_shapes_release(float t) {
        float f8 = 1 - t;
        float f10 = f8 * f8 * f8;
        float f11 = 3 * t;
        float f12 = f11 * f8 * f8;
        float f13 = f11 * t * f8;
        float f14 = t * t * t;
        return FloatFloatPair.m3constructorimpl((getAnchor1X() * f14) + (getControl1X() * f13) + (getControl0X() * f12) + (getAnchor0X() * f10), (getAnchor1Y() * f14) + (getControl1Y() * f13) + (getControl0Y() * f12) + (getAnchor0Y() * f10));
    }

    public final Cubic reverse() {
        return CubicKt.Cubic(getAnchor1X(), getAnchor1Y(), getControl1X(), getControl1Y(), getControl0X(), getControl0Y(), getAnchor0X(), getAnchor0Y());
    }

    public final Pair<Cubic, Cubic> split(float t) {
        float f8 = 1 - t;
        long m38pointOnCurveOOQOV4g$graphics_shapes_release = m38pointOnCurveOOQOV4g$graphics_shapes_release(t);
        float f10 = f8 * f8;
        float f11 = 2 * f8 * t;
        float f12 = t * t;
        return TuplesKt.to(CubicKt.Cubic(getAnchor0X(), getAnchor0Y(), (getAnchor0X() * f8) + (getControl0X() * t), (getAnchor0Y() * f8) + (getControl0Y() * t), (getControl1X() * f12) + (getControl0X() * f11) + (getAnchor0X() * f10), (getControl1Y() * f12) + (getControl0Y() * f11) + (getAnchor0Y() * f10), PointKt.m50getXDnnuFBc(m38pointOnCurveOOQOV4g$graphics_shapes_release), PointKt.m51getYDnnuFBc(m38pointOnCurveOOQOV4g$graphics_shapes_release)), CubicKt.Cubic(PointKt.m50getXDnnuFBc(m38pointOnCurveOOQOV4g$graphics_shapes_release), PointKt.m51getYDnnuFBc(m38pointOnCurveOOQOV4g$graphics_shapes_release), (getAnchor1X() * f12) + (getControl1X() * f11) + (getControl0X() * f10), (getAnchor1Y() * f12) + (getControl1Y() * f11) + (getControl0Y() * f10), (getAnchor1X() * t) + (getControl1X() * f8), (getAnchor1Y() * t) + (getControl1Y() * f8), getAnchor1X(), getAnchor1Y()));
    }

    public final Cubic times(float x9) {
        float[] fArr = new float[8];
        for (int i10 = 0; i10 < 8; i10++) {
            fArr[i10] = this.points[i10] * x9;
        }
        return new Cubic(fArr);
    }

    public String toString() {
        return "anchor0: (" + getAnchor0X() + ", " + getAnchor0Y() + ") control0: (" + getControl0X() + ", " + getControl0Y() + "), control1: (" + getControl1X() + ", " + getControl1Y() + "), anchor1: (" + getAnchor1X() + ", " + getAnchor1Y() + ')';
    }

    public final Cubic transformed(PointTransformer f8) {
        f8.getClass();
        MutableCubic mutableCubic = new MutableCubic();
        ArraysKt___ArraysJvmKt.copyInto$default(this.points, mutableCubic.getPoints(), 0, 0, 0, 14, (Object) null);
        mutableCubic.transform(f8);
        return mutableCubic;
    }

    public final boolean zeroLength$graphics_shapes_release() {
        if (Math.abs(getAnchor0X() - getAnchor1X()) < 1.0E-4f && Math.abs(getAnchor0Y() - getAnchor1Y()) < 1.0E-4f) {
            return true;
        }
        return false;
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0007J(\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0007¨\u0006\r"}, d2 = {"Landroidx/graphics/shapes/Cubic$Companion;", "", "()V", "circularArc", "Landroidx/graphics/shapes/Cubic;", "centerX", "", "centerY", "x0", "y0", "x1", "y1", "straightLine", "graphics-shapes_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final Cubic circularArc(float centerX, float centerY, float x02, float y02, float x12, float y12) {
            boolean z9;
            float f8;
            float f10 = x02 - centerX;
            float f11 = y02 - centerY;
            long directionVector = Utils.directionVector(f10, f11);
            float f12 = x12 - centerX;
            float f13 = y12 - centerY;
            long directionVector2 = Utils.directionVector(f12, f13);
            long m71rotate90DnnuFBc = Utils.m71rotate90DnnuFBc(directionVector);
            long m71rotate90DnnuFBc2 = Utils.m71rotate90DnnuFBc(directionVector2);
            if (PointKt.m45dotProduct5P9i7ZU(m71rotate90DnnuFBc, f12, f13) >= 0.0f) {
                z9 = true;
            } else {
                z9 = false;
            }
            float m46dotProductybeJwSQ = PointKt.m46dotProductybeJwSQ(directionVector, directionVector2);
            if (m46dotProductybeJwSQ > 0.999f) {
                return straightLine(x02, y02, x12, y12);
            }
            float sqrt = ((((float) Math.sqrt(2 * r9)) - ((float) Math.sqrt(r5 - (m46dotProductybeJwSQ * m46dotProductybeJwSQ)))) * ((Utils.distance(f10, f11) * 4.0f) / 3.0f)) / (1 - m46dotProductybeJwSQ);
            if (z9) {
                f8 = 1.0f;
            } else {
                f8 = -1.0f;
            }
            float f14 = sqrt * f8;
            return CubicKt.Cubic(x02, y02, (PointKt.m50getXDnnuFBc(m71rotate90DnnuFBc) * f14) + x02, (PointKt.m51getYDnnuFBc(m71rotate90DnnuFBc) * f14) + y02, x12 - (PointKt.m50getXDnnuFBc(m71rotate90DnnuFBc2) * f14), y12 - (PointKt.m51getYDnnuFBc(m71rotate90DnnuFBc2) * f14), x12, y12);
        }

        @JvmStatic
        public final Cubic straightLine(float x02, float y02, float x12, float y12) {
            return CubicKt.Cubic(x02, y02, Utils.interpolate(x02, x12, 0.33333334f), Utils.interpolate(y02, y12, 0.33333334f), Utils.interpolate(x02, x12, 0.6666667f), Utils.interpolate(y02, y12, 0.6666667f), x12, y12);
        }

        private Companion() {
        }
    }

    public final Cubic div(int x9) {
        return div(x9);
    }

    public final Cubic times(int x9) {
        return times(x9);
    }

    public /* synthetic */ Cubic(long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13);
    }

    public Cubic(float[] fArr) {
        fArr.getClass();
        this.points = fArr;
        if (fArr.length == 8) {
            return;
        }
        i.k("Points array size should be 8");
        throw null;
    }

    public /* synthetic */ Cubic(float[] fArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new float[8] : fArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Cubic() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
