package androidx.graphics.shapes;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.collection.FloatFloatPair;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.graphics.shapes.RoundedPolygon;
import j1.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.ranges.RangesKt___RangesKt;
import org.apache.commons.net.telnet.TelnetCommand;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u001aH\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0002\u001a0\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0002\u001a4\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\b\b\u0003\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005H\u0007\u001a>\u0010\u0012\u001a\u00020\u000f*\u00020\u00102\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005H\u0007\u001a\u0084\u0001\u0010\u0014\u001a\u00020\u000f*\u00020\u00102\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001a2\b\b\u0003\u0010\b\u001a\u00020\u00052\b\b\u0003\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005H\u0007\u001aN\u0010\u001b\u001a\u00020\u000f*\u00020\u00102\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001a2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u001ad\u0010\u001c\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001a2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005H\u0007¨\u0006\u001d"}, d2 = {"pillStarVerticesFromNumVerts", "", "numVerticesPerRadius", "", "width", "", "height", "innerRadius", "vertexSpacing", "startLocation", "centerX", "centerY", "starVerticesFromNumVerts", "radius", "circle", "Landroidx/graphics/shapes/RoundedPolygon;", "Landroidx/graphics/shapes/RoundedPolygon$Companion;", "numVertices", "pill", "smoothing", "pillStar", "innerRadiusRatio", "rounding", "Landroidx/graphics/shapes/CornerRounding;", "innerRounding", "perVertexRounding", "", "rectangle", "star", "graphics-shapes_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nShapes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Shapes.kt\nandroidx/graphics/shapes/ShapesKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,459:1\n1360#2:460\n1446#2,5:461\n1360#2:466\n1446#2,5:467\n*S KotlinDebug\n*F\n+ 1 Shapes.kt\nandroidx/graphics/shapes/ShapesKt\n*L\n155#1:460\n155#1:461,5\n294#1:466\n294#1:467,5\n*E\n"})
/* loaded from: classes.dex */
public final class ShapesKt {
    @JvmOverloads
    public static final RoundedPolygon circle(RoundedPolygon.Companion companion, @IntRange(from = 3) int i10, float f8, float f10, float f11) {
        companion.getClass();
        if (i10 >= 3) {
            return RoundedPolygonKt.RoundedPolygon$default(i10, f8 / ((float) Math.cos(Utils.getFloatPi() / i10)), f10, f11, new CornerRounding(f8, 0.0f, 2, null), null, 32, null);
        }
        i.k("Circle must have at least three vertices");
        return null;
    }

    public static /* synthetic */ RoundedPolygon circle$default(RoundedPolygon.Companion companion, int i10, float f8, float f10, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 8;
        }
        if ((i11 & 2) != 0) {
            f8 = 1.0f;
        }
        if ((i11 & 4) != 0) {
            f10 = 0.0f;
        }
        if ((i11 & 8) != 0) {
            f11 = 0.0f;
        }
        return circle(companion, i10, f8, f10, f11);
    }

    @JvmOverloads
    public static final RoundedPolygon pill(RoundedPolygon.Companion companion, float f8, float f10, float f11, float f12, float f13) {
        companion.getClass();
        if (f8 > 0.0f && f10 > 0.0f) {
            float f14 = 2;
            float f15 = f8 / f14;
            float f16 = f10 / f14;
            float f17 = f15 + f12;
            float f18 = f16 + f13;
            float f19 = (-f15) + f12;
            float f20 = (-f16) + f13;
            return RoundedPolygonKt.RoundedPolygon$default(new float[]{f17, f18, f19, f18, f19, f20, f17, f20}, new CornerRounding(Math.min(f15, f16), f11), null, f12, f13, 4, null);
        }
        i.k("Pill shapes must have positive width and height");
        return null;
    }

    public static /* synthetic */ RoundedPolygon pill$default(RoundedPolygon.Companion companion, float f8, float f10, float f11, float f12, float f13, int i10, Object obj) {
        float f14;
        float f15;
        float f16;
        float f17;
        RoundedPolygon.Companion companion2;
        float f18;
        if ((i10 & 1) != 0) {
            f8 = 2.0f;
        }
        if ((i10 & 2) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 4) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 8) != 0) {
            f12 = 0.0f;
        }
        if ((i10 & 16) != 0) {
            f14 = 0.0f;
            f17 = f11;
            f15 = f12;
            f18 = f8;
            f16 = f10;
            companion2 = companion;
        } else {
            f14 = f13;
            f15 = f12;
            f16 = f10;
            f17 = f11;
            companion2 = companion;
            f18 = f8;
        }
        return pill(companion2, f18, f16, f17, f15, f14);
    }

    @JvmOverloads
    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion, float f8, float f10, int i10, @FloatRange(from = 0.0d, fromInclusive = false, to = 1.0d, toInclusive = false) float f11, CornerRounding cornerRounding, CornerRounding cornerRounding2, List<CornerRounding> list, @FloatRange(from = 0.0d, to = 1.0d) float f12, @FloatRange(from = 0.0d, to = 1.0d) float f13, float f14, float f15) {
        List<CornerRounding> list2;
        companion.getClass();
        cornerRounding.getClass();
        if (f8 <= 0.0f || f10 <= 0.0f) {
            i.k("Pill shapes must have positive width and height");
            return null;
        }
        if (f11 > 0.0f && f11 <= 1.0f) {
            if (list != null || cornerRounding2 == null) {
                list2 = list;
            } else {
                kotlin.ranges.IntRange until = RangesKt.until(0, i10);
                list2 = new ArrayList<>();
                Iterator<Integer> it = until.iterator();
                while (it.hasNext()) {
                    ((IntIterator) it).nextInt();
                    CollectionsKt__MutableCollectionsKt.addAll(list2, CollectionsKt.listOf((Object[]) new CornerRounding[]{cornerRounding, cornerRounding2}));
                }
            }
            return RoundedPolygonKt.RoundedPolygon(pillStarVerticesFromNumVerts(i10, f8, f10, f11, f12, f13, f14, f15), cornerRounding, list2, f14, f15);
        }
        i.k("innerRadius must be between 0 and 1");
        return null;
    }

    public static /* synthetic */ RoundedPolygon pillStar$default(RoundedPolygon.Companion companion, float f8, float f10, int i10, float f11, CornerRounding cornerRounding, CornerRounding cornerRounding2, List list, float f12, float f13, float f14, float f15, int i11, Object obj) {
        float f16;
        float f17;
        float f18;
        float f19;
        CornerRounding cornerRounding3;
        List list2;
        float f20;
        CornerRounding cornerRounding4;
        float f21;
        int i12;
        RoundedPolygon.Companion companion2;
        float f22;
        if ((i11 & 1) != 0) {
            f8 = 2.0f;
        }
        if ((i11 & 2) != 0) {
            f10 = 1.0f;
        }
        if ((i11 & 4) != 0) {
            i10 = 8;
        }
        if ((i11 & 8) != 0) {
            f11 = 0.5f;
        }
        if ((i11 & 16) != 0) {
            cornerRounding = CornerRounding.Unrounded;
        }
        if ((i11 & 32) != 0) {
            cornerRounding2 = null;
        }
        if ((i11 & 64) != 0) {
            list = null;
        }
        if ((i11 & 128) != 0) {
            f12 = 0.5f;
        }
        if ((i11 & 256) != 0) {
            f13 = 0.0f;
        }
        if ((i11 & 512) != 0) {
            f14 = 0.0f;
        }
        if ((i11 & 1024) != 0) {
            f16 = 0.0f;
            f19 = f13;
            f17 = f14;
            list2 = list;
            f18 = f12;
            cornerRounding4 = cornerRounding;
            cornerRounding3 = cornerRounding2;
            i12 = i10;
            f20 = f11;
            f22 = f8;
            f21 = f10;
            companion2 = companion;
        } else {
            f16 = f15;
            f17 = f14;
            f18 = f12;
            f19 = f13;
            cornerRounding3 = cornerRounding2;
            list2 = list;
            f20 = f11;
            cornerRounding4 = cornerRounding;
            f21 = f10;
            i12 = i10;
            companion2 = companion;
            f22 = f8;
        }
        return pillStar(companion2, f22, f21, i12, f20, cornerRounding4, cornerRounding3, list2, f18, f19, f17, f16);
    }

    private static final float[] pillStarVerticesFromNumVerts(int i10, float f8, float f10, float f11, float f12, float f13, float f14, float f15) {
        float coerceAtLeast;
        float coerceAtLeast2;
        int i11;
        float f16;
        float f17;
        float[] fArr;
        long m3constructorimpl;
        float min = Math.min(f8, f10);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(f10 - f8, 0.0f);
        coerceAtLeast2 = RangesKt___RangesKt.coerceAtLeast(f8 - f10, 0.0f);
        float f18 = 2;
        float f19 = coerceAtLeast / f18;
        float f20 = coerceAtLeast2 / f18;
        float interpolate = Utils.interpolate(f11, 1.0f, f12) * Utils.getTwoPi() * min;
        float f21 = (f18 * coerceAtLeast) + (f18 * coerceAtLeast2) + interpolate;
        float f22 = interpolate / 4;
        float f23 = f19 + f22;
        float f24 = f23 + coerceAtLeast2;
        float f25 = f24 + f22;
        float f26 = f25 + coerceAtLeast;
        float f27 = f26 + f22;
        float f28 = f27 + coerceAtLeast2;
        float f29 = f28 + f22;
        float f30 = 0.0f;
        float[] fArr2 = {0.0f, f19, f23, f24, f25, f26, f27, f28, f29, f29 + f19, f21};
        int i12 = i10 * 2;
        float f31 = f21 / i12;
        float f32 = f13 * f21;
        float[] fArr3 = new float[i10 * 4];
        long m3constructorimpl2 = FloatFloatPair.m3constructorimpl(f20, f19);
        float f33 = -f20;
        long m3constructorimpl3 = FloatFloatPair.m3constructorimpl(f33, f19);
        float f34 = -f19;
        long m3constructorimpl4 = FloatFloatPair.m3constructorimpl(f33, f34);
        long m3constructorimpl5 = FloatFloatPair.m3constructorimpl(f20, f34);
        int i13 = 0;
        boolean z9 = false;
        int i14 = 0;
        int i15 = 0;
        float f35 = f19;
        while (i13 < i12) {
            float f36 = f32 % f21;
            if (f36 < f30) {
                i14 = 0;
            }
            while (true) {
                int i16 = (i14 + 1) % 11;
                float f37 = fArr2[i16];
                if (f36 >= f37) {
                    f35 = fArr2[(i16 + 1) % 11];
                    i14 = i16;
                    f30 = f37;
                } else {
                    float f38 = (f36 - f30) / (f35 - f30);
                    if (z9) {
                        i11 = i13;
                        f16 = min * f11;
                    } else {
                        i11 = i13;
                        f16 = min;
                    }
                    switch (i14) {
                        case 0:
                            f17 = f20;
                            float f39 = f16;
                            fArr = fArr2;
                            m3constructorimpl = FloatFloatPair.m3constructorimpl(f39, f38 * f19);
                            break;
                        case 1:
                            f17 = f20;
                            float f40 = f16;
                            fArr = fArr2;
                            m3constructorimpl = PointKt.m54plusybeJwSQ(Utils.m70radialToCartesianL6JJ3z0$default(f40, (Utils.getFloatPi() * f38) / f18, 0L, 4, null), m3constructorimpl2);
                            break;
                        case 2:
                            f17 = f20;
                            float f41 = f16;
                            fArr = fArr2;
                            m3constructorimpl = FloatFloatPair.m3constructorimpl(f17 - (f38 * coerceAtLeast2), f41);
                            break;
                        case 3:
                            f17 = f20;
                            float f42 = f16;
                            fArr = fArr2;
                            m3constructorimpl = PointKt.m54plusybeJwSQ(Utils.m70radialToCartesianL6JJ3z0$default(f42, ((Utils.getFloatPi() * f38) / f18) + (Utils.getFloatPi() / f18), 0L, 4, null), m3constructorimpl3);
                            break;
                        case 4:
                            f17 = f20;
                            float f43 = f16;
                            fArr = fArr2;
                            m3constructorimpl = FloatFloatPair.m3constructorimpl(-f43, f19 - (f38 * coerceAtLeast));
                            break;
                        case 5:
                            f17 = f20;
                            float f44 = f16;
                            fArr = fArr2;
                            m3constructorimpl = PointKt.m54plusybeJwSQ(Utils.m70radialToCartesianL6JJ3z0$default(f44, ((Utils.getFloatPi() * f38) / f18) + Utils.getFloatPi(), 0L, 4, null), m3constructorimpl4);
                            break;
                        case 6:
                            f17 = f20;
                            float f45 = f16;
                            fArr = fArr2;
                            m3constructorimpl = FloatFloatPair.m3constructorimpl((f38 * coerceAtLeast2) + f33, -f45);
                            break;
                        case 7:
                            f17 = f20;
                            float f46 = f16;
                            fArr = fArr2;
                            m3constructorimpl = PointKt.m54plusybeJwSQ(Utils.m70radialToCartesianL6JJ3z0$default(f46, ((Utils.getFloatPi() * f38) / f18) + (Utils.getFloatPi() * 1.5f), 0L, 4, null), m3constructorimpl5);
                            break;
                        default:
                            f17 = f20;
                            m3constructorimpl = FloatFloatPair.m3constructorimpl(f16, (f38 * f19) + f34);
                            fArr = fArr2;
                            break;
                    }
                    int i17 = i15 + 1;
                    fArr3[i15] = PointKt.m50getXDnnuFBc(m3constructorimpl) + f14;
                    i15 += 2;
                    fArr3[i17] = PointKt.m51getYDnnuFBc(m3constructorimpl) + f15;
                    f32 += f31;
                    z9 = !z9;
                    fArr2 = fArr;
                    i13 = i11 + 1;
                    f20 = f17;
                }
            }
        }
        return fArr3;
    }

    public static final RoundedPolygon rectangle(RoundedPolygon.Companion companion, float f8, float f10, CornerRounding cornerRounding, List<CornerRounding> list, float f11, float f12) {
        companion.getClass();
        cornerRounding.getClass();
        float f13 = 2;
        float f14 = f8 / f13;
        float f15 = f11 - f14;
        float f16 = f10 / f13;
        float f17 = f12 - f16;
        float f18 = f14 + f11;
        float f19 = f16 + f12;
        return RoundedPolygonKt.RoundedPolygon(new float[]{f18, f19, f15, f19, f15, f17, f18, f17}, cornerRounding, list, f11, f12);
    }

    public static /* synthetic */ RoundedPolygon rectangle$default(RoundedPolygon.Companion companion, float f8, float f10, CornerRounding cornerRounding, List list, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f8 = 2.0f;
        }
        if ((i10 & 2) != 0) {
            f10 = 2.0f;
        }
        if ((i10 & 4) != 0) {
            cornerRounding = CornerRounding.Unrounded;
        }
        if ((i10 & 8) != 0) {
            list = null;
        }
        if ((i10 & 16) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 32) != 0) {
            f12 = 0.0f;
        }
        return rectangle(companion, f8, f10, cornerRounding, list, f11, f12);
    }

    @JvmOverloads
    public static final RoundedPolygon star(RoundedPolygon.Companion companion, int i10, float f8, float f10, CornerRounding cornerRounding, CornerRounding cornerRounding2, List<CornerRounding> list, float f11, float f12) {
        companion.getClass();
        cornerRounding.getClass();
        if (f8 > 0.0f && f10 > 0.0f) {
            if (f10 < f8) {
                if (list == null && cornerRounding2 != null) {
                    kotlin.ranges.IntRange until = RangesKt.until(0, i10);
                    list = new ArrayList<>();
                    Iterator<Integer> it = until.iterator();
                    while (it.hasNext()) {
                        ((IntIterator) it).nextInt();
                        CollectionsKt__MutableCollectionsKt.addAll(list, CollectionsKt.listOf((Object[]) new CornerRounding[]{cornerRounding, cornerRounding2}));
                    }
                }
                return RoundedPolygonKt.RoundedPolygon(starVerticesFromNumVerts(i10, f8, f10, f11, f12), cornerRounding, list, f11, f12);
            }
            i.k("innerRadius must be less than radius");
            return null;
        }
        i.k("Star radii must both be greater than 0");
        return null;
    }

    public static /* synthetic */ RoundedPolygon star$default(RoundedPolygon.Companion companion, int i10, float f8, float f10, CornerRounding cornerRounding, CornerRounding cornerRounding2, List list, float f11, float f12, int i11, Object obj) {
        float f13;
        float f14;
        CornerRounding cornerRounding3;
        CornerRounding cornerRounding4;
        float f15;
        float f16;
        if ((i11 & 2) != 0) {
            f13 = 1.0f;
        } else {
            f13 = f8;
        }
        if ((i11 & 4) != 0) {
            f14 = 0.5f;
        } else {
            f14 = f10;
        }
        if ((i11 & 8) != 0) {
            cornerRounding3 = CornerRounding.Unrounded;
        } else {
            cornerRounding3 = cornerRounding;
        }
        List list2 = null;
        if ((i11 & 16) != 0) {
            cornerRounding4 = null;
        } else {
            cornerRounding4 = cornerRounding2;
        }
        if ((i11 & 32) == 0) {
            list2 = list;
        }
        if ((i11 & 64) != 0) {
            f15 = 0.0f;
        } else {
            f15 = f11;
        }
        if ((i11 & 128) != 0) {
            f16 = 0.0f;
        } else {
            f16 = f12;
        }
        return star(companion, i10, f13, f14, cornerRounding3, cornerRounding4, list2, f15, f16);
    }

    private static final float[] starVerticesFromNumVerts(int i10, float f8, float f10, float f11, float f12) {
        float[] fArr = new float[i10 * 4];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            float f13 = i10;
            long m70radialToCartesianL6JJ3z0$default = Utils.m70radialToCartesianL6JJ3z0$default(f8, (Utils.getFloatPi() / f13) * 2 * i12, 0L, 4, null);
            fArr[i11] = PointKt.m50getXDnnuFBc(m70radialToCartesianL6JJ3z0$default) + f11;
            fArr[i11 + 1] = PointKt.m51getYDnnuFBc(m70radialToCartesianL6JJ3z0$default) + f12;
            long m70radialToCartesianL6JJ3z0$default2 = Utils.m70radialToCartesianL6JJ3z0$default(f10, (Utils.getFloatPi() / f13) * ((i12 * 2) + 1), 0L, 4, null);
            int i13 = i11 + 3;
            fArr[i11 + 2] = PointKt.m50getXDnnuFBc(m70radialToCartesianL6JJ3z0$default2) + f11;
            i11 += 4;
            fArr[i13] = PointKt.m51getYDnnuFBc(m70radialToCartesianL6JJ3z0$default2) + f12;
        }
        return fArr;
    }

    @JvmOverloads
    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion, float f8) {
        companion.getClass();
        return pillStar$default(companion, f8, 0.0f, 0, 0.0f, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 2046, null);
    }

    @JvmOverloads
    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion, float f8, float f10) {
        companion.getClass();
        return pillStar$default(companion, f8, f10, 0, 0.0f, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 2044, null);
    }

    @JvmOverloads
    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion, float f8, float f10, int i10) {
        companion.getClass();
        return pillStar$default(companion, f8, f10, i10, 0.0f, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 2040, null);
    }

    @JvmOverloads
    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion, float f8, float f10, int i10, @FloatRange(from = 0.0d, fromInclusive = false, to = 1.0d, toInclusive = false) float f11) {
        companion.getClass();
        return pillStar$default(companion, f8, f10, i10, f11, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 2032, null);
    }

    @JvmOverloads
    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion, float f8, float f10, int i10, @FloatRange(from = 0.0d, fromInclusive = false, to = 1.0d, toInclusive = false) float f11, CornerRounding cornerRounding) {
        companion.getClass();
        cornerRounding.getClass();
        return pillStar$default(companion, f8, f10, i10, f11, cornerRounding, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 2016, null);
    }

    @JvmOverloads
    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion, float f8, float f10, int i10, @FloatRange(from = 0.0d, fromInclusive = false, to = 1.0d, toInclusive = false) float f11, CornerRounding cornerRounding, CornerRounding cornerRounding2) {
        companion.getClass();
        cornerRounding.getClass();
        return pillStar$default(companion, f8, f10, i10, f11, cornerRounding, cornerRounding2, null, 0.0f, 0.0f, 0.0f, 0.0f, 1984, null);
    }

    @JvmOverloads
    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion, float f8, float f10, int i10, @FloatRange(from = 0.0d, fromInclusive = false, to = 1.0d, toInclusive = false) float f11, CornerRounding cornerRounding, CornerRounding cornerRounding2, List<CornerRounding> list) {
        companion.getClass();
        cornerRounding.getClass();
        return pillStar$default(companion, f8, f10, i10, f11, cornerRounding, cornerRounding2, list, 0.0f, 0.0f, 0.0f, 0.0f, 1920, null);
    }

    @JvmOverloads
    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion, float f8, float f10, int i10, @FloatRange(from = 0.0d, fromInclusive = false, to = 1.0d, toInclusive = false) float f11, CornerRounding cornerRounding, CornerRounding cornerRounding2, List<CornerRounding> list, @FloatRange(from = 0.0d, to = 1.0d) float f12) {
        companion.getClass();
        cornerRounding.getClass();
        return pillStar$default(companion, f8, f10, i10, f11, cornerRounding, cornerRounding2, list, f12, 0.0f, 0.0f, 0.0f, 1792, null);
    }

    @JvmOverloads
    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion, float f8, float f10, int i10, @FloatRange(from = 0.0d, fromInclusive = false, to = 1.0d, toInclusive = false) float f11, CornerRounding cornerRounding, CornerRounding cornerRounding2, List<CornerRounding> list, @FloatRange(from = 0.0d, to = 1.0d) float f12, @FloatRange(from = 0.0d, to = 1.0d) float f13) {
        companion.getClass();
        cornerRounding.getClass();
        return pillStar$default(companion, f8, f10, i10, f11, cornerRounding, cornerRounding2, list, f12, f13, 0.0f, 0.0f, 1536, null);
    }

    @JvmOverloads
    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion, float f8, float f10, int i10, @FloatRange(from = 0.0d, fromInclusive = false, to = 1.0d, toInclusive = false) float f11, CornerRounding cornerRounding, CornerRounding cornerRounding2, List<CornerRounding> list, @FloatRange(from = 0.0d, to = 1.0d) float f12, @FloatRange(from = 0.0d, to = 1.0d) float f13, float f14) {
        companion.getClass();
        cornerRounding.getClass();
        return pillStar$default(companion, f8, f10, i10, f11, cornerRounding, cornerRounding2, list, f12, f13, f14, 0.0f, 1024, null);
    }

    @JvmOverloads
    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion) {
        companion.getClass();
        return pillStar$default(companion, 0.0f, 0.0f, 0, 0.0f, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 2047, null);
    }

    @JvmOverloads
    public static final RoundedPolygon circle(RoundedPolygon.Companion companion, @IntRange(from = 3) int i10) {
        companion.getClass();
        return circle$default(companion, i10, 0.0f, 0.0f, 0.0f, 14, null);
    }

    @JvmOverloads
    public static final RoundedPolygon circle(RoundedPolygon.Companion companion, @IntRange(from = 3) int i10, float f8) {
        companion.getClass();
        return circle$default(companion, i10, f8, 0.0f, 0.0f, 12, null);
    }

    @JvmOverloads
    public static final RoundedPolygon circle(RoundedPolygon.Companion companion, @IntRange(from = 3) int i10, float f8, float f10) {
        companion.getClass();
        return circle$default(companion, i10, f8, f10, 0.0f, 8, null);
    }

    @JvmOverloads
    public static final RoundedPolygon circle(RoundedPolygon.Companion companion) {
        companion.getClass();
        return circle$default(companion, 0, 0.0f, 0.0f, 0.0f, 15, null);
    }

    @JvmOverloads
    public static final RoundedPolygon star(RoundedPolygon.Companion companion, int i10, float f8) {
        companion.getClass();
        return star$default(companion, i10, f8, 0.0f, null, null, null, 0.0f, 0.0f, TelnetCommand.WONT, null);
    }

    @JvmOverloads
    public static final RoundedPolygon pill(RoundedPolygon.Companion companion, float f8) {
        companion.getClass();
        return pill$default(companion, f8, 0.0f, 0.0f, 0.0f, 0.0f, 30, null);
    }

    @JvmOverloads
    public static final RoundedPolygon star(RoundedPolygon.Companion companion, int i10, float f8, float f10) {
        companion.getClass();
        return star$default(companion, i10, f8, f10, null, null, null, 0.0f, 0.0f, TelnetCommand.EL, null);
    }

    @JvmOverloads
    public static final RoundedPolygon pill(RoundedPolygon.Companion companion, float f8, float f10) {
        companion.getClass();
        return pill$default(companion, f8, f10, 0.0f, 0.0f, 0.0f, 28, null);
    }

    @JvmOverloads
    public static final RoundedPolygon star(RoundedPolygon.Companion companion, int i10, float f8, float f10, CornerRounding cornerRounding) {
        companion.getClass();
        cornerRounding.getClass();
        return star$default(companion, i10, f8, f10, cornerRounding, null, null, 0.0f, 0.0f, 240, null);
    }

    @JvmOverloads
    public static final RoundedPolygon pill(RoundedPolygon.Companion companion, float f8, float f10, float f11) {
        companion.getClass();
        return pill$default(companion, f8, f10, f11, 0.0f, 0.0f, 24, null);
    }

    @JvmOverloads
    public static final RoundedPolygon star(RoundedPolygon.Companion companion, int i10, float f8, float f10, CornerRounding cornerRounding, CornerRounding cornerRounding2) {
        companion.getClass();
        cornerRounding.getClass();
        return star$default(companion, i10, f8, f10, cornerRounding, cornerRounding2, null, 0.0f, 0.0f, 224, null);
    }

    @JvmOverloads
    public static final RoundedPolygon pill(RoundedPolygon.Companion companion, float f8, float f10, float f11, float f12) {
        companion.getClass();
        return pill$default(companion, f8, f10, f11, f12, 0.0f, 16, null);
    }

    @JvmOverloads
    public static final RoundedPolygon star(RoundedPolygon.Companion companion, int i10, float f8, float f10, CornerRounding cornerRounding, CornerRounding cornerRounding2, List<CornerRounding> list) {
        companion.getClass();
        cornerRounding.getClass();
        return star$default(companion, i10, f8, f10, cornerRounding, cornerRounding2, list, 0.0f, 0.0f, 192, null);
    }

    @JvmOverloads
    public static final RoundedPolygon pill(RoundedPolygon.Companion companion) {
        companion.getClass();
        return pill$default(companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31, null);
    }

    @JvmOverloads
    public static final RoundedPolygon star(RoundedPolygon.Companion companion, int i10, float f8, float f10, CornerRounding cornerRounding, CornerRounding cornerRounding2, List<CornerRounding> list, float f11) {
        companion.getClass();
        cornerRounding.getClass();
        return star$default(companion, i10, f8, f10, cornerRounding, cornerRounding2, list, f11, 0.0f, 128, null);
    }

    @JvmOverloads
    public static final RoundedPolygon star(RoundedPolygon.Companion companion, int i10) {
        companion.getClass();
        return star$default(companion, i10, 0.0f, 0.0f, null, null, null, 0.0f, 0.0f, TelnetCommand.DONT, null);
    }
}
