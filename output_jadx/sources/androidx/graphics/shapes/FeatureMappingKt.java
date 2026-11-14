package androidx.graphics.shapes;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.graphics.shapes.Feature;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import n0.b;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a6\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\u0010\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005H\u0000\u001a\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\nH\u0000\u001a,\u0010\u000b\u001a\u00020\f2\u0010\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\u0010\u0010\u000e\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082D¢\u0006\u0002\n\u0000*\u0018\b\u0000\u0010\u000f\"\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0010"}, d2 = {"LOG_TAG", "", "doMapping", "", "Landroidx/graphics/shapes/ProgressableFeature;", "Landroidx/graphics/shapes/MeasuredFeatures;", "f1", "f2", "featureDistSquared", "", "Landroidx/graphics/shapes/Feature;", "featureMapper", "Landroidx/graphics/shapes/DoubleMapper;", "features1", "features2", "MeasuredFeatures", "graphics-shapes_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nFeatureMapping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeatureMapping.kt\nandroidx/graphics/shapes/FeatureMappingKt\n+ 2 Utils.kt\nandroidx/graphics/shapes/Utils\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n108#2,4:132\n108#2,4:138\n108#2,4:142\n37#3,2:136\n2310#4,14:146\n2310#4,14:161\n1#5:160\n*S KotlinDebug\n*F\n+ 1 FeatureMapping.kt\nandroidx/graphics/shapes/FeatureMappingKt\n*L\n65#1:132,4\n67#1:138,4\n90#1:142,4\n66#1:136,2\n111#1:146,14\n123#1:161,14\n*E\n"})
/* loaded from: classes.dex */
public final class FeatureMappingKt {
    private static final String LOG_TAG = "FeatureMapping";

    public static final List<ProgressableFeature> doMapping(List<ProgressableFeature> list, List<ProgressableFeature> list2) {
        list.getClass();
        list2.getClass();
        Iterator<Integer> it = CollectionsKt.getIndices(list2).iterator();
        if (it.hasNext()) {
            IntIterator intIterator = (IntIterator) it;
            int nextInt = intIterator.nextInt();
            if (it.hasNext()) {
                float featureDistSquared = featureDistSquared(list.get(0).getFeature(), list2.get(nextInt).getFeature());
                do {
                    int nextInt2 = intIterator.nextInt();
                    float featureDistSquared2 = featureDistSquared(list.get(0).getFeature(), list2.get(nextInt2).getFeature());
                    if (Float.compare(featureDistSquared, featureDistSquared2) > 0) {
                        nextInt = nextInt2;
                        featureDistSquared = featureDistSquared2;
                    }
                } while (it.hasNext());
            }
            int size = list.size();
            int size2 = list2.size();
            List<ProgressableFeature> mutableListOf = CollectionsKt.mutableListOf(list2.get(nextInt));
            int i10 = nextInt;
            for (int i11 = 1; i11 < size; i11++) {
                int i12 = nextInt - (size - i11);
                if (i12 <= i10) {
                    i12 += size2;
                }
                Iterator<Integer> it2 = new IntRange(i10 + 1, i12).iterator();
                if (it2.hasNext()) {
                    IntIterator intIterator2 = (IntIterator) it2;
                    int nextInt3 = intIterator2.nextInt();
                    if (it2.hasNext()) {
                        float featureDistSquared3 = featureDistSquared(list.get(i11).getFeature(), list2.get(nextInt3 % size2).getFeature());
                        do {
                            int nextInt4 = intIterator2.nextInt();
                            float featureDistSquared4 = featureDistSquared(list.get(i11).getFeature(), list2.get(nextInt4 % size2).getFeature());
                            if (Float.compare(featureDistSquared3, featureDistSquared4) > 0) {
                                nextInt3 = nextInt4;
                                featureDistSquared3 = featureDistSquared4;
                            }
                        } while (it2.hasNext());
                    }
                    i10 = nextInt3;
                    mutableListOf.add(list2.get(i10 % size2));
                } else {
                    b.x();
                    return null;
                }
            }
            return mutableListOf;
        }
        b.x();
        return null;
    }

    public static final float featureDistSquared(Feature feature, Feature feature2) {
        feature.getClass();
        feature2.getClass();
        if ((feature instanceof Feature.Corner) && (feature2 instanceof Feature.Corner) && ((Feature.Corner) feature).getConvex() != ((Feature.Corner) feature2).getConvex()) {
            return Float.MAX_VALUE;
        }
        float anchor1X = (((Cubic) CollectionsKt.last((List) feature.getCubics())).getAnchor1X() + ((Cubic) CollectionsKt.first((List) feature.getCubics())).getAnchor0X()) / 2.0f;
        float anchor1Y = (((Cubic) CollectionsKt.last((List) feature.getCubics())).getAnchor1Y() + ((Cubic) CollectionsKt.first((List) feature.getCubics())).getAnchor0Y()) / 2.0f;
        float anchor1X2 = (((Cubic) CollectionsKt.last((List) feature2.getCubics())).getAnchor1X() + ((Cubic) CollectionsKt.first((List) feature2.getCubics())).getAnchor0X()) / 2.0f;
        float f8 = anchor1X - anchor1X2;
        float anchor1Y2 = anchor1Y - ((((Cubic) CollectionsKt.last((List) feature2.getCubics())).getAnchor1Y() + ((Cubic) CollectionsKt.first((List) feature2.getCubics())).getAnchor0Y()) / 2.0f);
        return (anchor1Y2 * anchor1Y2) + (f8 * f8);
    }

    public static final DoubleMapper featureMapper(List<ProgressableFeature> list, List<ProgressableFeature> list2) {
        Pair pair;
        list.getClass();
        list2.getClass();
        List createListBuilder = CollectionsKt.createListBuilder();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (list.get(i10).getFeature() instanceof Feature.Corner) {
                createListBuilder.add(list.get(i10));
            }
        }
        List build = CollectionsKt.build(createListBuilder);
        List createListBuilder2 = CollectionsKt.createListBuilder();
        int size2 = list2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            if (list2.get(i11).getFeature() instanceof Feature.Corner) {
                createListBuilder2.add(list2.get(i11));
            }
        }
        List build2 = CollectionsKt.build(createListBuilder2);
        if (build.size() > build2.size()) {
            pair = TuplesKt.to(doMapping(build2, build), build2);
        } else {
            pair = TuplesKt.to(build, doMapping(build, build2));
        }
        List list3 = (List) pair.component1();
        List list4 = (List) pair.component2();
        List createListBuilder3 = CollectionsKt.createListBuilder();
        int size3 = list3.size();
        for (int i12 = 0; i12 < size3 && i12 != list4.size(); i12++) {
            createListBuilder3.add(TuplesKt.to(Float.valueOf(((ProgressableFeature) list3.get(i12)).getProgress()), Float.valueOf(((ProgressableFeature) list4.get(i12)).getProgress())));
        }
        Pair[] pairArr = (Pair[]) CollectionsKt.build(createListBuilder3).toArray(new Pair[0]);
        return new DoubleMapper((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }
}
