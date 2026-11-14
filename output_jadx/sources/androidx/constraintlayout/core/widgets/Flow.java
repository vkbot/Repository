package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class Flow extends VirtualLayout {
    public static final int HORIZONTAL_ALIGN_CENTER = 2;
    public static final int HORIZONTAL_ALIGN_END = 1;
    public static final int HORIZONTAL_ALIGN_START = 0;
    public static final int VERTICAL_ALIGN_BASELINE = 3;
    public static final int VERTICAL_ALIGN_BOTTOM = 1;
    public static final int VERTICAL_ALIGN_CENTER = 2;
    public static final int VERTICAL_ALIGN_TOP = 0;
    public static final int WRAP_ALIGNED = 2;
    public static final int WRAP_CHAIN = 1;
    public static final int WRAP_CHAIN_NEW = 3;
    public static final int WRAP_NONE = 0;
    private ConstraintWidget[] mDisplayedWidgets;
    private int mHorizontalStyle = -1;
    private int mVerticalStyle = -1;
    private int mFirstHorizontalStyle = -1;
    private int mFirstVerticalStyle = -1;
    private int mLastHorizontalStyle = -1;
    private int mLastVerticalStyle = -1;
    private float mHorizontalBias = 0.5f;
    private float mVerticalBias = 0.5f;
    private float mFirstHorizontalBias = 0.5f;
    private float mFirstVerticalBias = 0.5f;
    private float mLastHorizontalBias = 0.5f;
    private float mLastVerticalBias = 0.5f;
    private int mHorizontalGap = 0;
    private int mVerticalGap = 0;
    private int mHorizontalAlign = 2;
    private int mVerticalAlign = 2;
    private int mWrapMode = 0;
    private int mMaxElementsWrap = -1;
    private int mOrientation = 0;
    private ArrayList<WidgetsList> mChainList = new ArrayList<>();
    private ConstraintWidget[] mAlignedBiggestElementsInRows = null;
    private ConstraintWidget[] mAlignedBiggestElementsInCols = null;
    private int[] mAlignedDimensions = null;
    private int mDisplayedWidgetsCount = 0;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public class WidgetsList {
        private ConstraintAnchor mBottom;
        private ConstraintAnchor mLeft;
        private int mMax;
        private int mOrientation;
        private int mPaddingBottom;
        private int mPaddingLeft;
        private int mPaddingRight;
        private int mPaddingTop;
        private ConstraintAnchor mRight;
        private ConstraintAnchor mTop;
        private ConstraintWidget mBiggest = null;
        int mBiggestDimension = 0;
        private int mWidth = 0;
        private int mHeight = 0;
        private int mStartIndex = 0;
        private int mCount = 0;
        private int mNbMatchConstraintsWidgets = 0;

        public WidgetsList(int i10, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i11) {
            this.mPaddingLeft = 0;
            this.mPaddingTop = 0;
            this.mPaddingRight = 0;
            this.mPaddingBottom = 0;
            this.mMax = 0;
            this.mOrientation = i10;
            this.mLeft = constraintAnchor;
            this.mTop = constraintAnchor2;
            this.mRight = constraintAnchor3;
            this.mBottom = constraintAnchor4;
            this.mPaddingLeft = Flow.this.getPaddingLeft();
            this.mPaddingTop = Flow.this.getPaddingTop();
            this.mPaddingRight = Flow.this.getPaddingRight();
            this.mPaddingBottom = Flow.this.getPaddingBottom();
            this.mMax = i11;
        }

        private void recomputeDimensions() {
            this.mWidth = 0;
            this.mHeight = 0;
            this.mBiggest = null;
            this.mBiggestDimension = 0;
            int i10 = this.mCount;
            for (int i11 = 0; i11 < i10 && this.mStartIndex + i11 < Flow.this.mDisplayedWidgetsCount; i11++) {
                ConstraintWidget constraintWidget = Flow.this.mDisplayedWidgets[this.mStartIndex + i11];
                if (this.mOrientation != 0) {
                    int widgetWidth = Flow.this.getWidgetWidth(constraintWidget, this.mMax);
                    int widgetHeight = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                    int i12 = Flow.this.mVerticalGap;
                    if (constraintWidget.getVisibility() == 8) {
                        i12 = 0;
                    }
                    this.mHeight = widgetHeight + i12 + this.mHeight;
                    if (this.mBiggest == null || this.mBiggestDimension < widgetWidth) {
                        this.mBiggest = constraintWidget;
                        this.mBiggestDimension = widgetWidth;
                        this.mWidth = widgetWidth;
                    }
                } else {
                    int width = constraintWidget.getWidth();
                    int i13 = Flow.this.mHorizontalGap;
                    if (constraintWidget.getVisibility() == 8) {
                        i13 = 0;
                    }
                    this.mWidth = width + i13 + this.mWidth;
                    int widgetHeight2 = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                    if (this.mBiggest == null || this.mBiggestDimension < widgetHeight2) {
                        this.mBiggest = constraintWidget;
                        this.mBiggestDimension = widgetHeight2;
                        this.mHeight = widgetHeight2;
                    }
                }
            }
        }

        public void add(ConstraintWidget constraintWidget) {
            int i10 = this.mOrientation;
            Flow flow = Flow.this;
            int i11 = 0;
            if (i10 == 0) {
                int widgetWidth = flow.getWidgetWidth(constraintWidget, this.mMax);
                if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.mNbMatchConstraintsWidgets++;
                    widgetWidth = 0;
                }
                int i12 = Flow.this.mHorizontalGap;
                if (constraintWidget.getVisibility() != 8) {
                    i11 = i12;
                }
                this.mWidth = widgetWidth + i11 + this.mWidth;
                int widgetHeight = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                if (this.mBiggest == null || this.mBiggestDimension < widgetHeight) {
                    this.mBiggest = constraintWidget;
                    this.mBiggestDimension = widgetHeight;
                    this.mHeight = widgetHeight;
                }
            } else {
                int widgetWidth2 = flow.getWidgetWidth(constraintWidget, this.mMax);
                int widgetHeight2 = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                if (constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.mNbMatchConstraintsWidgets++;
                    widgetHeight2 = 0;
                }
                int i13 = Flow.this.mVerticalGap;
                if (constraintWidget.getVisibility() != 8) {
                    i11 = i13;
                }
                this.mHeight = widgetHeight2 + i11 + this.mHeight;
                if (this.mBiggest == null || this.mBiggestDimension < widgetWidth2) {
                    this.mBiggest = constraintWidget;
                    this.mBiggestDimension = widgetWidth2;
                    this.mWidth = widgetWidth2;
                }
            }
            this.mCount++;
        }

        public void clear() {
            this.mBiggestDimension = 0;
            this.mBiggest = null;
            this.mWidth = 0;
            this.mHeight = 0;
            this.mStartIndex = 0;
            this.mCount = 0;
            this.mNbMatchConstraintsWidgets = 0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:82:0x0142, code lost:
        
            if (r18 != false) goto L86;
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x0144, code lost:
        
            r11 = 1.0f - r11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x015d, code lost:
        
            if (r18 != false) goto L86;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void createConstraints(boolean r18, int r19, boolean r20) {
            /*
                Method dump skipped, instructions count: 884
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.Flow.WidgetsList.createConstraints(boolean, int, boolean):void");
        }

        public int getHeight() {
            int i10 = this.mOrientation;
            int i11 = this.mHeight;
            if (i10 == 1) {
                return i11 - Flow.this.mVerticalGap;
            }
            return i11;
        }

        public int getWidth() {
            int i10 = this.mOrientation;
            int i11 = this.mWidth;
            if (i10 == 0) {
                return i11 - Flow.this.mHorizontalGap;
            }
            return i11;
        }

        public void measureMatchConstraints(int i10) {
            int i11 = this.mNbMatchConstraintsWidgets;
            if (i11 == 0) {
                return;
            }
            int i12 = this.mCount;
            int i13 = i10 / i11;
            for (int i14 = 0; i14 < i12 && this.mStartIndex + i14 < Flow.this.mDisplayedWidgetsCount; i14++) {
                ConstraintWidget constraintWidget = Flow.this.mDisplayedWidgets[this.mStartIndex + i14];
                if (this.mOrientation == 0) {
                    if (constraintWidget != null && constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultWidth == 0) {
                        Flow.this.measure(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i13, constraintWidget.getVerticalDimensionBehaviour(), constraintWidget.getHeight());
                    }
                } else if (constraintWidget != null && constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultHeight == 0) {
                    int i15 = i13;
                    Flow.this.measure(constraintWidget, constraintWidget.getHorizontalDimensionBehaviour(), constraintWidget.getWidth(), ConstraintWidget.DimensionBehaviour.FIXED, i15);
                    i13 = i15;
                }
            }
            recomputeDimensions();
        }

        public void setStartIndex(int i10) {
            this.mStartIndex = i10;
        }

        public void setup(int i10, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i11, int i12, int i13, int i14, int i15) {
            this.mOrientation = i10;
            this.mLeft = constraintAnchor;
            this.mTop = constraintAnchor2;
            this.mRight = constraintAnchor3;
            this.mBottom = constraintAnchor4;
            this.mPaddingLeft = i11;
            this.mPaddingTop = i12;
            this.mPaddingRight = i13;
            this.mPaddingBottom = i14;
            this.mMax = i15;
        }
    }

    private void createAlignedConstraints(boolean z9) {
        ConstraintWidget constraintWidget;
        float f8;
        int i10;
        if (this.mAlignedDimensions != null && this.mAlignedBiggestElementsInCols != null && this.mAlignedBiggestElementsInRows != null) {
            for (int i11 = 0; i11 < this.mDisplayedWidgetsCount; i11++) {
                this.mDisplayedWidgets[i11].resetAnchors();
            }
            int[] iArr = this.mAlignedDimensions;
            int i12 = iArr[0];
            int i13 = iArr[1];
            float f10 = this.mHorizontalBias;
            ConstraintWidget constraintWidget2 = null;
            int i14 = 0;
            while (i14 < i12) {
                if (z9) {
                    i10 = (i12 - i14) - 1;
                    f8 = 1.0f - this.mHorizontalBias;
                } else {
                    f8 = f10;
                    i10 = i14;
                }
                ConstraintWidget constraintWidget3 = this.mAlignedBiggestElementsInCols[i10];
                if (constraintWidget3 != null && constraintWidget3.getVisibility() != 8) {
                    if (i14 == 0) {
                        constraintWidget3.connect(constraintWidget3.mLeft, this.mLeft, getPaddingLeft());
                        constraintWidget3.setHorizontalChainStyle(this.mHorizontalStyle);
                        constraintWidget3.setHorizontalBiasPercent(f8);
                    }
                    if (i14 == i12 - 1) {
                        constraintWidget3.connect(constraintWidget3.mRight, this.mRight, getPaddingRight());
                    }
                    if (i14 > 0 && constraintWidget2 != null) {
                        constraintWidget3.connect(constraintWidget3.mLeft, constraintWidget2.mRight, this.mHorizontalGap);
                        constraintWidget2.connect(constraintWidget2.mRight, constraintWidget3.mLeft, 0);
                    }
                    constraintWidget2 = constraintWidget3;
                }
                i14++;
                f10 = f8;
            }
            for (int i15 = 0; i15 < i13; i15++) {
                ConstraintWidget constraintWidget4 = this.mAlignedBiggestElementsInRows[i15];
                if (constraintWidget4 != null && constraintWidget4.getVisibility() != 8) {
                    if (i15 == 0) {
                        constraintWidget4.connect(constraintWidget4.mTop, this.mTop, getPaddingTop());
                        constraintWidget4.setVerticalChainStyle(this.mVerticalStyle);
                        constraintWidget4.setVerticalBiasPercent(this.mVerticalBias);
                    }
                    if (i15 == i13 - 1) {
                        constraintWidget4.connect(constraintWidget4.mBottom, this.mBottom, getPaddingBottom());
                    }
                    if (i15 > 0 && constraintWidget2 != null) {
                        constraintWidget4.connect(constraintWidget4.mTop, constraintWidget2.mBottom, this.mVerticalGap);
                        constraintWidget2.connect(constraintWidget2.mBottom, constraintWidget4.mTop, 0);
                    }
                    constraintWidget2 = constraintWidget4;
                }
            }
            for (int i16 = 0; i16 < i12; i16++) {
                for (int i17 = 0; i17 < i13; i17++) {
                    int i18 = (i17 * i12) + i16;
                    if (this.mOrientation == 1) {
                        i18 = (i16 * i13) + i17;
                    }
                    ConstraintWidget[] constraintWidgetArr = this.mDisplayedWidgets;
                    if (i18 < constraintWidgetArr.length && (constraintWidget = constraintWidgetArr[i18]) != null && constraintWidget.getVisibility() != 8) {
                        ConstraintWidget constraintWidget5 = this.mAlignedBiggestElementsInCols[i16];
                        ConstraintWidget constraintWidget6 = this.mAlignedBiggestElementsInRows[i17];
                        if (constraintWidget != constraintWidget5) {
                            constraintWidget.connect(constraintWidget.mLeft, constraintWidget5.mLeft, 0);
                            constraintWidget.connect(constraintWidget.mRight, constraintWidget5.mRight, 0);
                        }
                        if (constraintWidget != constraintWidget6) {
                            constraintWidget.connect(constraintWidget.mTop, constraintWidget6.mTop, 0);
                            constraintWidget.connect(constraintWidget.mBottom, constraintWidget6.mBottom, 0);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getWidgetHeight(ConstraintWidget constraintWidget, int i10) {
        ConstraintWidget constraintWidget2;
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i11 = constraintWidget.mMatchConstraintDefaultHeight;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (constraintWidget.mMatchConstraintPercentHeight * i10);
                if (i12 != constraintWidget.getHeight()) {
                    constraintWidget.setMeasureRequested(true);
                    measure(constraintWidget, constraintWidget.getHorizontalDimensionBehaviour(), constraintWidget.getWidth(), ConstraintWidget.DimensionBehaviour.FIXED, i12);
                }
                return i12;
            }
            constraintWidget2 = constraintWidget;
            if (i11 == 1) {
                return constraintWidget2.getHeight();
            }
            if (i11 == 3) {
                return (int) ((constraintWidget2.getWidth() * constraintWidget2.mDimensionRatio) + 0.5f);
            }
        } else {
            constraintWidget2 = constraintWidget;
        }
        return constraintWidget2.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getWidgetWidth(ConstraintWidget constraintWidget, int i10) {
        ConstraintWidget constraintWidget2;
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i11 = constraintWidget.mMatchConstraintDefaultWidth;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (constraintWidget.mMatchConstraintPercentWidth * i10);
                if (i12 != constraintWidget.getWidth()) {
                    constraintWidget.setMeasureRequested(true);
                    measure(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i12, constraintWidget.getVerticalDimensionBehaviour(), constraintWidget.getHeight());
                }
                return i12;
            }
            constraintWidget2 = constraintWidget;
            if (i11 == 1) {
                return constraintWidget2.getWidth();
            }
            if (i11 == 3) {
                return (int) ((constraintWidget2.getHeight() * constraintWidget2.mDimensionRatio) + 0.5f);
            }
        } else {
            constraintWidget2 = constraintWidget;
        }
        return constraintWidget2.getWidth();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x010b -> B:21:0x0057). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x010d -> B:21:0x0057). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0113 -> B:21:0x0057). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0115 -> B:21:0x0057). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void measureAligned(androidx.constraintlayout.core.widgets.ConstraintWidget[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.Flow.measureAligned(androidx.constraintlayout.core.widgets.ConstraintWidget[], int, int, int, int[]):void");
    }

    private void measureChainWrap(ConstraintWidget[] constraintWidgetArr, int i10, int i11, int i12, int[] iArr) {
        int i13;
        boolean z9;
        Flow flow;
        int i14;
        boolean z10;
        ConstraintAnchor constraintAnchor;
        boolean z11;
        int i15;
        Flow flow2 = this;
        if (i10 == 0) {
            return;
        }
        flow2.mChainList.clear();
        int i16 = i12;
        WidgetsList widgetsList = new WidgetsList(i11, flow2.mLeft, flow2.mTop, flow2.mRight, flow2.mBottom, i16);
        flow2.mChainList.add(widgetsList);
        if (i11 == 0) {
            i13 = 0;
            int i17 = 0;
            int i18 = 0;
            while (i18 < i10) {
                ConstraintWidget constraintWidget = constraintWidgetArr[i18];
                int widgetWidth = flow2.getWidgetWidth(constraintWidget, i16);
                if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i19 = i13;
                if ((i17 == i16 || flow2.mHorizontalGap + i17 + widgetWidth > i16) && widgetsList.mBiggest != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11 && i18 > 0 && (i15 = flow2.mMaxElementsWrap) > 0 && i18 % i15 == 0) {
                    z11 = true;
                }
                if (z11) {
                    widgetsList = new WidgetsList(i11, flow2.mLeft, flow2.mTop, flow2.mRight, flow2.mBottom, i16);
                    widgetsList.setStartIndex(i18);
                    flow2.mChainList.add(widgetsList);
                } else if (i18 > 0) {
                    i17 = flow2.mHorizontalGap + widgetWidth + i17;
                    widgetsList.add(constraintWidget);
                    i18++;
                    i13 = i19;
                }
                i17 = widgetWidth;
                widgetsList.add(constraintWidget);
                i18++;
                i13 = i19;
            }
        } else {
            i13 = 0;
            int i20 = 0;
            int i21 = 0;
            while (i21 < i10) {
                ConstraintWidget constraintWidget2 = constraintWidgetArr[i21];
                int widgetHeight = flow2.getWidgetHeight(constraintWidget2, i16);
                if (constraintWidget2.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i22 = i13;
                if ((i20 == i16 || flow2.mVerticalGap + i20 + widgetHeight > i16) && widgetsList.mBiggest != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!z9 && i21 > 0 && (i14 = flow2.mMaxElementsWrap) > 0 && i21 % i14 == 0) {
                    z9 = true;
                }
                if (z9) {
                    widgetsList = new WidgetsList(i11, flow2.mLeft, flow2.mTop, flow2.mRight, flow2.mBottom, i16);
                    flow = flow2;
                    widgetsList.setStartIndex(i21);
                    flow.mChainList.add(widgetsList);
                } else {
                    flow = flow2;
                    if (i21 > 0) {
                        i20 = flow.mVerticalGap + widgetHeight + i20;
                        widgetsList.add(constraintWidget2);
                        i21++;
                        i16 = i12;
                        i13 = i22;
                        flow2 = flow;
                    }
                }
                i20 = widgetHeight;
                widgetsList.add(constraintWidget2);
                i21++;
                i16 = i12;
                i13 = i22;
                flow2 = flow;
            }
        }
        Flow flow3 = flow2;
        int size = flow3.mChainList.size();
        ConstraintAnchor constraintAnchor2 = flow3.mLeft;
        ConstraintAnchor constraintAnchor3 = flow3.mTop;
        ConstraintAnchor constraintAnchor4 = flow3.mRight;
        ConstraintAnchor constraintAnchor5 = flow3.mBottom;
        int paddingLeft = flow3.getPaddingLeft();
        int paddingTop = flow3.getPaddingTop();
        int paddingRight = flow3.getPaddingRight();
        int paddingBottom = flow3.getPaddingBottom();
        ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = flow3.getHorizontalDimensionBehaviour();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (horizontalDimensionBehaviour != dimensionBehaviour && flow3.getVerticalDimensionBehaviour() != dimensionBehaviour) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (i13 > 0 && z10) {
            for (int i23 = 0; i23 < size; i23++) {
                WidgetsList widgetsList2 = flow3.mChainList.get(i23);
                if (i11 == 0) {
                    widgetsList2.measureMatchConstraints(i12 - widgetsList2.getWidth());
                } else {
                    widgetsList2.measureMatchConstraints(i12 - widgetsList2.getHeight());
                }
            }
        }
        ConstraintAnchor constraintAnchor6 = constraintAnchor2;
        int i24 = paddingBottom;
        int i25 = 0;
        int i26 = paddingRight;
        int i27 = paddingTop;
        int i28 = paddingLeft;
        ConstraintAnchor constraintAnchor7 = constraintAnchor5;
        ConstraintAnchor constraintAnchor8 = constraintAnchor4;
        ConstraintAnchor constraintAnchor9 = constraintAnchor3;
        int i29 = 0;
        for (int i30 = 0; i30 < size; i30++) {
            WidgetsList widgetsList3 = flow3.mChainList.get(i30);
            if (i11 == 0) {
                if (i30 < size - 1) {
                    constraintAnchor7 = flow3.mChainList.get(i30 + 1).mBiggest.mTop;
                    i24 = 0;
                } else {
                    constraintAnchor7 = flow3.mBottom;
                    i24 = flow3.getPaddingBottom();
                }
                ConstraintAnchor constraintAnchor10 = widgetsList3.mBiggest.mBottom;
                int i31 = i29;
                widgetsList3.setup(i11, constraintAnchor6, constraintAnchor9, constraintAnchor8, constraintAnchor7, i28, i27, i26, i24, i12);
                int max = Math.max(i25, widgetsList3.getWidth());
                int height = widgetsList3.getHeight() + i31;
                if (i30 > 0) {
                    height += flow3.mVerticalGap;
                }
                i29 = height;
                i25 = max;
                constraintAnchor9 = constraintAnchor10;
                i27 = 0;
            } else {
                int i32 = i25;
                int i33 = i29;
                if (i30 < size - 1) {
                    constraintAnchor = flow3.mChainList.get(i30 + 1).mBiggest.mLeft;
                    i26 = 0;
                } else {
                    constraintAnchor = flow3.mRight;
                    i26 = flow3.getPaddingRight();
                }
                constraintAnchor8 = constraintAnchor;
                ConstraintAnchor constraintAnchor11 = widgetsList3.mBiggest.mRight;
                widgetsList3.setup(i11, constraintAnchor6, constraintAnchor9, constraintAnchor8, constraintAnchor7, i28, i27, i26, i24, i12);
                int width = widgetsList3.getWidth() + i32;
                int max2 = Math.max(i33, widgetsList3.getHeight());
                if (i30 > 0) {
                    width += flow3.mHorizontalGap;
                }
                int i34 = width;
                i29 = max2;
                i25 = i34;
                i28 = 0;
                constraintAnchor6 = constraintAnchor11;
            }
        }
        iArr[0] = i25;
        iArr[1] = i29;
    }

    private void measureChainWrap_new(ConstraintWidget[] constraintWidgetArr, int i10, int i11, int i12, int[] iArr) {
        int i13;
        boolean z9;
        Flow flow;
        int i14;
        boolean z10;
        boolean z11;
        ConstraintAnchor constraintAnchor;
        boolean z12;
        int i15;
        Flow flow2 = this;
        if (i10 == 0) {
            return;
        }
        flow2.mChainList.clear();
        int i16 = i12;
        WidgetsList widgetsList = new WidgetsList(i11, flow2.mLeft, flow2.mTop, flow2.mRight, flow2.mBottom, i16);
        flow2.mChainList.add(widgetsList);
        boolean z13 = true;
        if (i11 == 0) {
            int i17 = 0;
            i13 = 0;
            int i18 = 0;
            int i19 = 0;
            while (i19 < i10) {
                i17++;
                ConstraintWidget constraintWidget = constraintWidgetArr[i19];
                int widgetWidth = flow2.getWidgetWidth(constraintWidget, i16);
                if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i20 = i13;
                if ((i18 == i16 || flow2.mHorizontalGap + i18 + widgetWidth > i16) && widgetsList.mBiggest != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12 && i19 > 0 && (i15 = flow2.mMaxElementsWrap) > 0 && i17 > i15) {
                    z12 = true;
                }
                if (z12) {
                    widgetsList = new WidgetsList(i11, flow2.mLeft, flow2.mTop, flow2.mRight, flow2.mBottom, i16);
                    widgetsList.setStartIndex(i19);
                    flow2.mChainList.add(widgetsList);
                    i17 = 1;
                } else if (i19 > 0) {
                    i18 = flow2.mHorizontalGap + widgetWidth + i18;
                    widgetsList.add(constraintWidget);
                    i19++;
                    i13 = i20;
                }
                i18 = widgetWidth;
                widgetsList.add(constraintWidget);
                i19++;
                i13 = i20;
            }
        } else {
            int i21 = 0;
            i13 = 0;
            int i22 = 0;
            int i23 = 0;
            while (i23 < i10) {
                i21++;
                ConstraintWidget constraintWidget2 = constraintWidgetArr[i23];
                int widgetHeight = flow2.getWidgetHeight(constraintWidget2, i16);
                if (constraintWidget2.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i24 = i13;
                if ((i22 == i16 || flow2.mVerticalGap + i22 + widgetHeight > i16) && widgetsList.mBiggest != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!z9 && i23 > 0 && (i14 = flow2.mMaxElementsWrap) > 0 && i21 > i14) {
                    z9 = true;
                }
                if (z9) {
                    widgetsList = new WidgetsList(i11, flow2.mLeft, flow2.mTop, flow2.mRight, flow2.mBottom, i16);
                    flow = flow2;
                    widgetsList.setStartIndex(i23);
                    flow.mChainList.add(widgetsList);
                    i21 = 1;
                } else {
                    flow = flow2;
                    if (i23 > 0) {
                        i22 = flow.mVerticalGap + widgetHeight + i22;
                        widgetsList.add(constraintWidget2);
                        i23++;
                        i16 = i12;
                        i13 = i24;
                        flow2 = flow;
                    }
                }
                i22 = widgetHeight;
                widgetsList.add(constraintWidget2);
                i23++;
                i16 = i12;
                i13 = i24;
                flow2 = flow;
            }
        }
        Flow flow3 = flow2;
        int size = flow3.mChainList.size();
        ConstraintAnchor constraintAnchor2 = flow3.mLeft;
        ConstraintAnchor constraintAnchor3 = flow3.mTop;
        ConstraintAnchor constraintAnchor4 = flow3.mRight;
        ConstraintAnchor constraintAnchor5 = flow3.mBottom;
        int paddingLeft = flow3.getPaddingLeft();
        int paddingTop = flow3.getPaddingTop();
        int paddingRight = flow3.getPaddingRight();
        int paddingBottom = flow3.getPaddingBottom();
        ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = flow3.getHorizontalDimensionBehaviour();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (horizontalDimensionBehaviour != dimensionBehaviour && flow3.getVerticalDimensionBehaviour() != dimensionBehaviour) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (i13 > 0 && z10) {
            for (int i25 = 0; i25 < size; i25++) {
                WidgetsList widgetsList2 = flow3.mChainList.get(i25);
                if (i11 == 0) {
                    widgetsList2.measureMatchConstraints(i12 - widgetsList2.getWidth());
                } else {
                    widgetsList2.measureMatchConstraints(i12 - widgetsList2.getHeight());
                }
            }
        }
        ConstraintAnchor constraintAnchor6 = constraintAnchor3;
        int i26 = paddingBottom;
        int i27 = 0;
        int i28 = 0;
        int i29 = paddingRight;
        int i30 = paddingTop;
        int i31 = paddingLeft;
        ConstraintAnchor constraintAnchor7 = constraintAnchor5;
        ConstraintAnchor constraintAnchor8 = constraintAnchor4;
        ConstraintAnchor constraintAnchor9 = constraintAnchor2;
        int i32 = 0;
        while (i28 < size) {
            WidgetsList widgetsList3 = flow3.mChainList.get(i28);
            if (i11 == 0) {
                if (i28 < size - 1) {
                    constraintAnchor7 = flow3.mChainList.get(i28 + 1).mBiggest.mTop;
                    i26 = 0;
                } else {
                    constraintAnchor7 = flow3.mBottom;
                    i26 = flow3.getPaddingBottom();
                }
                ConstraintAnchor constraintAnchor10 = widgetsList3.mBiggest.mBottom;
                z11 = z13;
                int i33 = i27;
                widgetsList3.setup(i11, constraintAnchor9, constraintAnchor6, constraintAnchor8, constraintAnchor7, i31, i30, i29, i26, i12);
                int max = Math.max(i32, widgetsList3.getWidth());
                int height = widgetsList3.getHeight() + i33;
                if (i28 > 0) {
                    height += flow3.mVerticalGap;
                }
                i27 = height;
                i32 = max;
                constraintAnchor6 = constraintAnchor10;
                i30 = 0;
            } else {
                int i34 = i27;
                z11 = z13;
                int i35 = i32;
                if (i28 < size - 1) {
                    constraintAnchor = flow3.mChainList.get(i28 + 1).mBiggest.mLeft;
                    i29 = 0;
                } else {
                    constraintAnchor = flow3.mRight;
                    i29 = flow3.getPaddingRight();
                }
                constraintAnchor8 = constraintAnchor;
                ConstraintAnchor constraintAnchor11 = widgetsList3.mBiggest.mRight;
                widgetsList3.setup(i11, constraintAnchor9, constraintAnchor6, constraintAnchor8, constraintAnchor7, i31, i30, i29, i26, i12);
                int width = widgetsList3.getWidth() + i35;
                int max2 = Math.max(i34, widgetsList3.getHeight());
                if (i28 > 0) {
                    width += flow3.mHorizontalGap;
                }
                int i36 = width;
                i27 = max2;
                i32 = i36;
                i31 = 0;
                constraintAnchor9 = constraintAnchor11;
            }
            i28++;
            z13 = z11;
        }
        iArr[0] = i32;
        iArr[z13 ? 1 : 0] = i27;
    }

    private void measureNoWrap(ConstraintWidget[] constraintWidgetArr, int i10, int i11, int i12, int[] iArr) {
        WidgetsList widgetsList;
        if (i10 == 0) {
            return;
        }
        if (this.mChainList.size() == 0) {
            widgetsList = new WidgetsList(i11, this.mLeft, this.mTop, this.mRight, this.mBottom, i12);
            this.mChainList.add(widgetsList);
        } else {
            WidgetsList widgetsList2 = this.mChainList.get(0);
            widgetsList2.clear();
            widgetsList2.setup(i11, this.mLeft, this.mTop, this.mRight, this.mBottom, getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom(), i12);
            widgetsList = widgetsList2;
        }
        for (int i13 = 0; i13 < i10; i13++) {
            widgetsList.add(constraintWidgetArr[i13]);
        }
        iArr[0] = widgetsList.getWidth();
        iArr[1] = widgetsList.getHeight();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(LinearSystem linearSystem, boolean z9) {
        boolean z10;
        boolean z11;
        boolean z12;
        super.addToSolver(linearSystem, z9);
        if (getParent() != null && ((ConstraintWidgetContainer) getParent()).isRtl()) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = this.mWrapMode;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        int size = this.mChainList.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            WidgetsList widgetsList = this.mChainList.get(i11);
                            if (i11 == size - 1) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            widgetsList.createConstraints(z10, i11, z12);
                        }
                    }
                } else {
                    createAlignedConstraints(z10);
                }
            } else {
                int size2 = this.mChainList.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    WidgetsList widgetsList2 = this.mChainList.get(i12);
                    if (i12 == size2 - 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    widgetsList2.createConstraints(z10, i12, z11);
                }
            }
        } else if (this.mChainList.size() > 0) {
            this.mChainList.get(0).createConstraints(z10, 0, true);
        }
        needsCallbackFromSolver(false);
    }

    @Override // androidx.constraintlayout.core.widgets.HelperWidget, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.copy(constraintWidget, hashMap);
        Flow flow = (Flow) constraintWidget;
        this.mHorizontalStyle = flow.mHorizontalStyle;
        this.mVerticalStyle = flow.mVerticalStyle;
        this.mFirstHorizontalStyle = flow.mFirstHorizontalStyle;
        this.mFirstVerticalStyle = flow.mFirstVerticalStyle;
        this.mLastHorizontalStyle = flow.mLastHorizontalStyle;
        this.mLastVerticalStyle = flow.mLastVerticalStyle;
        this.mHorizontalBias = flow.mHorizontalBias;
        this.mVerticalBias = flow.mVerticalBias;
        this.mFirstHorizontalBias = flow.mFirstHorizontalBias;
        this.mFirstVerticalBias = flow.mFirstVerticalBias;
        this.mLastHorizontalBias = flow.mLastHorizontalBias;
        this.mLastVerticalBias = flow.mLastVerticalBias;
        this.mHorizontalGap = flow.mHorizontalGap;
        this.mVerticalGap = flow.mVerticalGap;
        this.mHorizontalAlign = flow.mHorizontalAlign;
        this.mVerticalAlign = flow.mVerticalAlign;
        this.mWrapMode = flow.mWrapMode;
        this.mMaxElementsWrap = flow.mMaxElementsWrap;
        this.mOrientation = flow.mOrientation;
    }

    public float getMaxElementsWrap() {
        return this.mMaxElementsWrap;
    }

    @Override // androidx.constraintlayout.core.widgets.VirtualLayout
    public void measure(int i10, int i11, int i12, int i13) {
        int i14;
        boolean z9;
        if (this.mWidgetsCount > 0 && !measureChildren()) {
            setMeasure(0, 0);
            needsCallbackFromSolver(false);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int[] iArr = new int[2];
        int i15 = (i11 - paddingLeft) - paddingRight;
        int i16 = this.mOrientation;
        if (i16 == 1) {
            i15 = (i13 - paddingTop) - paddingBottom;
        }
        int i17 = i15;
        int i18 = this.mHorizontalStyle;
        if (i16 == 0) {
            if (i18 == -1) {
                this.mHorizontalStyle = 0;
            }
            if (this.mVerticalStyle == -1) {
                this.mVerticalStyle = 0;
            }
        } else {
            if (i18 == -1) {
                this.mHorizontalStyle = 0;
            }
            if (this.mVerticalStyle == -1) {
                this.mVerticalStyle = 0;
            }
        }
        ConstraintWidget[] constraintWidgetArr = this.mWidgets;
        int i19 = 0;
        int i20 = 0;
        while (true) {
            i14 = this.mWidgetsCount;
            if (i19 >= i14) {
                break;
            }
            if (this.mWidgets[i19].getVisibility() == 8) {
                i20++;
            }
            i19++;
        }
        if (i20 > 0) {
            constraintWidgetArr = new ConstraintWidget[i14 - i20];
            int i21 = 0;
            i14 = 0;
            while (i21 < this.mWidgetsCount) {
                ConstraintWidget constraintWidget = this.mWidgets[i21];
                ConstraintWidget[] constraintWidgetArr2 = constraintWidgetArr;
                if (constraintWidget.getVisibility() != 8) {
                    constraintWidgetArr2[i14] = constraintWidget;
                    i14++;
                }
                i21++;
                constraintWidgetArr = constraintWidgetArr2;
            }
        }
        int i22 = i14;
        this.mDisplayedWidgets = constraintWidgetArr;
        this.mDisplayedWidgetsCount = i22;
        int i23 = this.mWrapMode;
        if (i23 != 0) {
            if (i23 != 1) {
                if (i23 != 2) {
                    if (i23 == 3) {
                        measureChainWrap_new(constraintWidgetArr, i22, this.mOrientation, i17, iArr);
                    }
                } else {
                    measureAligned(constraintWidgetArr, i22, this.mOrientation, i17, iArr);
                }
            } else {
                measureChainWrap(constraintWidgetArr, i22, this.mOrientation, i17, iArr);
            }
        } else {
            measureNoWrap(constraintWidgetArr, i22, this.mOrientation, i17, iArr);
        }
        int i24 = iArr[0] + paddingLeft + paddingRight;
        int i25 = iArr[1] + paddingTop + paddingBottom;
        if (i10 == 1073741824) {
            i24 = i11;
        } else if (i10 == Integer.MIN_VALUE) {
            i24 = Math.min(i24, i11);
        } else if (i10 != 0) {
            i24 = 0;
        }
        if (i12 == 1073741824) {
            i25 = i13;
        } else if (i12 == Integer.MIN_VALUE) {
            i25 = Math.min(i25, i13);
        } else if (i12 != 0) {
            i25 = 0;
        }
        setMeasure(i24, i25);
        setWidth(i24);
        setHeight(i25);
        if (this.mWidgetsCount > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        needsCallbackFromSolver(z9);
    }

    public void setFirstHorizontalBias(float f8) {
        this.mFirstHorizontalBias = f8;
    }

    public void setFirstHorizontalStyle(int i10) {
        this.mFirstHorizontalStyle = i10;
    }

    public void setFirstVerticalBias(float f8) {
        this.mFirstVerticalBias = f8;
    }

    public void setFirstVerticalStyle(int i10) {
        this.mFirstVerticalStyle = i10;
    }

    public void setHorizontalAlign(int i10) {
        this.mHorizontalAlign = i10;
    }

    public void setHorizontalBias(float f8) {
        this.mHorizontalBias = f8;
    }

    public void setHorizontalGap(int i10) {
        this.mHorizontalGap = i10;
    }

    public void setHorizontalStyle(int i10) {
        this.mHorizontalStyle = i10;
    }

    public void setLastHorizontalBias(float f8) {
        this.mLastHorizontalBias = f8;
    }

    public void setLastHorizontalStyle(int i10) {
        this.mLastHorizontalStyle = i10;
    }

    public void setLastVerticalBias(float f8) {
        this.mLastVerticalBias = f8;
    }

    public void setLastVerticalStyle(int i10) {
        this.mLastVerticalStyle = i10;
    }

    public void setMaxElementsWrap(int i10) {
        this.mMaxElementsWrap = i10;
    }

    public void setOrientation(int i10) {
        this.mOrientation = i10;
    }

    public void setVerticalAlign(int i10) {
        this.mVerticalAlign = i10;
    }

    public void setVerticalBias(float f8) {
        this.mVerticalBias = f8;
    }

    public void setVerticalGap(int i10) {
        this.mVerticalGap = i10;
    }

    public void setVerticalStyle(int i10) {
        this.mVerticalStyle = i10;
    }

    public void setWrapMode(int i10) {
        this.mWrapMode = i10;
    }
}
