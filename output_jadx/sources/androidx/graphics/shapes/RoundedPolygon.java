package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import androidx.constraintlayout.widget.ConstraintLayout;
import j1.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 !2\u00020\u0001:\u0001!B%\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u001c\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0012J\u0013\u0010\u0017\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0006\u0010\u001b\u001a\u00020\u0000J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\""}, d2 = {"Landroidx/graphics/shapes/RoundedPolygon;", "", "features", "", "Landroidx/graphics/shapes/Feature;", "centerX", "", "centerY", "(Ljava/util/List;FF)V", "getCenterX", "()F", "getCenterY", "cubics", "Landroidx/graphics/shapes/Cubic;", "getCubics", "()Ljava/util/List;", "getFeatures$graphics_shapes_release", "calculateBounds", "", "bounds", "approximate", "", "calculateMaxBounds", "equals", "other", "hashCode", "", "normalized", "toString", "", "transformed", "f", "Landroidx/graphics/shapes/PointTransformer;", "Companion", "graphics-shapes_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nRoundedPolygon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoundedPolygon.kt\nandroidx/graphics/shapes/RoundedPolygon\n+ 2 Utils.kt\nandroidx/graphics/shapes/Utils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,686:1\n108#2,4:687\n108#2,4:691\n108#2,4:695\n1#3:699\n*S KotlinDebug\n*F\n+ 1 RoundedPolygon.kt\nandroidx/graphics/shapes/RoundedPolygon\n*L\n93#1:687,4\n96#1:691,4\n101#1:695,4\n*E\n"})
/* loaded from: classes.dex */
public final class RoundedPolygon {
    private final float centerX;
    private final float centerY;
    private final List<Cubic> cubics;
    private final List<Feature> features;

    /* JADX WARN: Multi-variable type inference failed */
    public RoundedPolygon(List<? extends Feature> list, float f8, float f10) {
        List<Cubic> list2;
        List<Cubic> list3;
        Cubic cubic;
        List<Cubic> cubics;
        list.getClass();
        this.features = list;
        this.centerX = f8;
        this.centerY = f10;
        List createListBuilder = CollectionsKt.createListBuilder();
        int i10 = 0;
        Cubic cubic2 = null;
        if (list.size() > 0 && ((Feature) list.get(0)).getCubics().size() == 3) {
            Pair<Cubic, Cubic> split = ((Feature) list.get(0)).getCubics().get(1).split(0.5f);
            Cubic component1 = split.component1();
            Cubic component2 = split.component2();
            list3 = CollectionsKt.mutableListOf(((Feature) list.get(0)).getCubics().get(0), component1);
            list2 = CollectionsKt.mutableListOf(component2, ((Feature) list.get(0)).getCubics().get(2));
        } else {
            list2 = null;
            list3 = null;
        }
        int size = list.size();
        if (size >= 0) {
            int i11 = 0;
            Cubic cubic3 = null;
            while (true) {
                if (i11 == 0 && list2 != null) {
                    cubics = list2;
                } else if (i11 == this.features.size()) {
                    if (list3 == null) {
                        break;
                    } else {
                        cubics = list3;
                    }
                } else {
                    cubics = this.features.get(i11).getCubics();
                }
                int size2 = cubics.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    Cubic cubic4 = cubics.get(i12);
                    if (!cubic4.zeroLength$graphics_shapes_release()) {
                        if (cubic3 != null) {
                            createListBuilder.add(cubic3);
                        }
                        if (cubic2 == null) {
                            cubic2 = cubic4;
                            cubic3 = cubic2;
                        } else {
                            cubic3 = cubic4;
                        }
                    } else if (cubic3 != null) {
                        cubic3.getPoints()[6] = cubic4.getAnchor1X();
                        cubic3.getPoints()[7] = cubic4.getAnchor1Y();
                    }
                }
                if (i11 == size) {
                    break;
                } else {
                    i11++;
                }
            }
            cubic = cubic2;
            cubic2 = cubic3;
        } else {
            cubic = null;
        }
        if (cubic2 != null && cubic != null) {
            createListBuilder.add(CubicKt.Cubic(cubic2.getAnchor0X(), cubic2.getAnchor0Y(), cubic2.getControl0X(), cubic2.getControl0Y(), cubic2.getControl1X(), cubic2.getControl1Y(), cubic.getAnchor0X(), cubic.getAnchor0Y()));
        }
        List<Cubic> build = CollectionsKt.build(createListBuilder);
        this.cubics = build;
        Cubic cubic5 = build.get(build.size() - 1);
        int size3 = build.size();
        while (i10 < size3) {
            Cubic cubic6 = this.cubics.get(i10);
            Cubic cubic7 = cubic5;
            if (Math.abs(cubic6.getAnchor0X() - cubic7.getAnchor1X()) <= 1.0E-4f && Math.abs(cubic6.getAnchor0Y() - cubic7.getAnchor1Y()) <= 1.0E-4f) {
                i10++;
                cubic5 = cubic6;
            } else {
                i.k("RoundedPolygon must be contiguous, with the anchor points of all curves matching the anchor points of the preceding and succeeding cubics");
                throw null;
            }
        }
    }

    public static /* synthetic */ float[] calculateBounds$default(RoundedPolygon roundedPolygon, float[] fArr, boolean z9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fArr = new float[4];
        }
        if ((i10 & 2) != 0) {
            z9 = true;
        }
        return roundedPolygon.calculateBounds(fArr, z9);
    }

    public static /* synthetic */ float[] calculateMaxBounds$default(RoundedPolygon roundedPolygon, float[] fArr, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fArr = new float[4];
        }
        return roundedPolygon.calculateMaxBounds(fArr);
    }

    @JvmOverloads
    public final float[] calculateBounds(float[] bounds, boolean approximate) {
        bounds.getClass();
        if (bounds.length >= 4) {
            int size = this.cubics.size();
            float f8 = Float.MIN_VALUE;
            float f10 = Float.MAX_VALUE;
            float f11 = Float.MAX_VALUE;
            float f12 = Float.MIN_VALUE;
            for (int i10 = 0; i10 < size; i10++) {
                this.cubics.get(i10).calculateBounds$graphics_shapes_release(bounds, approximate);
                f10 = Math.min(f10, bounds[0]);
                f11 = Math.min(f11, bounds[1]);
                f8 = Math.max(f8, bounds[2]);
                f12 = Math.max(f12, bounds[3]);
            }
            bounds[0] = f10;
            bounds[1] = f11;
            bounds[2] = f8;
            bounds[3] = f12;
            return bounds;
        }
        i.k("Required bounds size of 4");
        return null;
    }

    public final float[] calculateMaxBounds(float[] bounds) {
        bounds.getClass();
        if (bounds.length >= 4) {
            int size = this.cubics.size();
            float f8 = 0.0f;
            for (int i10 = 0; i10 < size; i10++) {
                Cubic cubic = this.cubics.get(i10);
                float distanceSquared = Utils.distanceSquared(cubic.getAnchor0X() - this.centerX, cubic.getAnchor0Y() - this.centerY);
                long m38pointOnCurveOOQOV4g$graphics_shapes_release = cubic.m38pointOnCurveOOQOV4g$graphics_shapes_release(0.5f);
                f8 = Math.max(f8, Math.max(distanceSquared, Utils.distanceSquared(PointKt.m50getXDnnuFBc(m38pointOnCurveOOQOV4g$graphics_shapes_release) - this.centerX, PointKt.m51getYDnnuFBc(m38pointOnCurveOOQOV4g$graphics_shapes_release) - this.centerY)));
            }
            float sqrt = (float) Math.sqrt(f8);
            float f10 = this.centerX;
            bounds[0] = f10 - sqrt;
            float f11 = this.centerY;
            bounds[1] = f11 - sqrt;
            bounds[2] = f10 + sqrt;
            bounds[3] = f11 + sqrt;
            return bounds;
        }
        i.k("Required bounds size of 4");
        return null;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoundedPolygon)) {
            return false;
        }
        return Intrinsics.areEqual(this.features, ((RoundedPolygon) other).features);
    }

    public final float getCenterX() {
        return this.centerX;
    }

    public final float getCenterY() {
        return this.centerY;
    }

    public final List<Cubic> getCubics() {
        return this.cubics;
    }

    public final List<Feature> getFeatures$graphics_shapes_release() {
        return this.features;
    }

    public int hashCode() {
        return this.features.hashCode();
    }

    public final RoundedPolygon normalized() {
        float[] calculateBounds$default = calculateBounds$default(this, null, false, 3, null);
        float f8 = calculateBounds$default[2] - calculateBounds$default[0];
        float f10 = calculateBounds$default[3] - calculateBounds$default[1];
        final float max = Math.max(f8, f10);
        float f11 = 2;
        final float f12 = ((max - f8) / f11) - calculateBounds$default[0];
        final float f13 = ((max - f10) / f11) - calculateBounds$default[1];
        return transformed(new PointTransformer() { // from class: androidx.graphics.shapes.RoundedPolygon$normalized$1
            @Override // androidx.graphics.shapes.PointTransformer
            /* renamed from: transform-XgqJiTY */
            public final long mo59transformXgqJiTY(float f14, float f15) {
                float f16 = f14 + f12;
                float f17 = max;
                return FloatFloatPair.m3constructorimpl(f16 / f17, (f15 + f13) / f17);
            }
        });
    }

    public String toString() {
        String joinToString$default;
        String joinToString$default2;
        StringBuilder sb = new StringBuilder("[RoundedPolygon. Cubics = ");
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(this.cubics, null, null, null, 0, null, null, 63, null);
        sb.append(joinToString$default);
        sb.append(" || Features = ");
        joinToString$default2 = CollectionsKt___CollectionsKt.joinToString$default(this.features, null, null, null, 0, null, null, 63, null);
        sb.append(joinToString$default2);
        sb.append(" || Center = (");
        sb.append(this.centerX);
        sb.append(", ");
        sb.append(this.centerY);
        sb.append(")]");
        return sb.toString();
    }

    public final RoundedPolygon transformed(PointTransformer f8) {
        f8.getClass();
        long m57transformedso9K2fw = PointKt.m57transformedso9K2fw(FloatFloatPair.m3constructorimpl(this.centerX, this.centerY), f8);
        List createListBuilder = CollectionsKt.createListBuilder();
        int size = this.features.size();
        for (int i10 = 0; i10 < size; i10++) {
            createListBuilder.add(this.features.get(i10).transformed$graphics_shapes_release(f8));
        }
        return new RoundedPolygon(CollectionsKt.build(createListBuilder), PointKt.m50getXDnnuFBc(m57transformedso9K2fw), PointKt.m51getYDnnuFBc(m57transformedso9K2fw));
    }

    @JvmOverloads
    public final float[] calculateBounds(float[] fArr) {
        fArr.getClass();
        return calculateBounds$default(this, fArr, false, 2, null);
    }

    @JvmOverloads
    public final float[] calculateBounds() {
        return calculateBounds$default(this, null, false, 3, null);
    }
}
