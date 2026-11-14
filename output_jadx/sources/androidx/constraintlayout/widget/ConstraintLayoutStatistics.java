package androidx.constraintlayout.widget;

import ai.onnxruntime.a;
import android.util.Log;
import androidx.constraintlayout.core.Metrics;
import java.text.DecimalFormat;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class ConstraintLayoutStatistics {
    public static final int DURATION_OF_CHILD_MEASURES = 5;
    public static final int DURATION_OF_LAYOUT = 7;
    public static final int DURATION_OF_MEASURES = 6;
    private static int MAX_WORD = 25;
    public static final int NUMBER_OF_CHILD_MEASURES = 4;
    public static final int NUMBER_OF_CHILD_VIEWS = 3;
    public static final int NUMBER_OF_EQUATIONS = 9;
    public static final int NUMBER_OF_LAYOUTS = 1;
    public static final int NUMBER_OF_ON_MEASURES = 2;
    public static final int NUMBER_OF_SIMPLE_EQUATIONS = 10;
    public static final int NUMBER_OF_VARIABLES = 8;
    private static final String WORD_PAD = new String(new char[25]).replace((char) 0, ' ');
    ConstraintLayout mConstraintLayout;
    private final Metrics mMetrics;

    public ConstraintLayoutStatistics(ConstraintLayoutStatistics constraintLayoutStatistics) {
        Metrics metrics = new Metrics();
        this.mMetrics = metrics;
        metrics.copy(constraintLayoutStatistics.mMetrics);
    }

    private String compare(DecimalFormat decimalFormat, ConstraintLayoutStatistics constraintLayoutStatistics, int i10) {
        String p9 = a.p(a.w(fmt(decimalFormat, ((float) getValue(i10)) * 1.0E-6f, 7), " -> "), fmt(decimalFormat, ((float) constraintLayoutStatistics.getValue(i10)) * 1.0E-6f, 7), "ms");
        String p10 = a.p(new StringBuilder(), WORD_PAD, geName(i10));
        return a.m("CL Perf: ", p10.substring(p10.length() - MAX_WORD).concat(" = "), p9);
    }

    private String fmt(DecimalFormat decimalFormat, float f8, int i10) {
        StringBuilder u8 = a.u(new String(new char[i10]).replace((char) 0, ' '));
        u8.append(decimalFormat.format(f8));
        String sb = u8.toString();
        return sb.substring(sb.length() - i10);
    }

    private void log(String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[2];
        Log.v(str, "CL Perf: --------  Performance .(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")  ------ ");
        DecimalFormat decimalFormat = new DecimalFormat("###.000");
        Log.v(str, log(decimalFormat, 5));
        Log.v(str, log(decimalFormat, 7));
        Log.v(str, log(decimalFormat, 6));
        Log.v(str, log(1));
        Log.v(str, log(2));
        Log.v(str, log(3));
        Log.v(str, log(4));
        Log.v(str, log(8));
        Log.v(str, log(9));
        Log.v(str, log(10));
    }

    public void attach(ConstraintLayout constraintLayout) {
        constraintLayout.fillMetrics(this.mMetrics);
        this.mConstraintLayout = constraintLayout;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public ConstraintLayoutStatistics m30clone() {
        return new ConstraintLayoutStatistics(this);
    }

    public void detach() {
        ConstraintLayout constraintLayout = this.mConstraintLayout;
        if (constraintLayout != null) {
            constraintLayout.fillMetrics(null);
        }
    }

    public String geName(int i10) {
        switch (i10) {
            case 1:
                return "NumberOfLayouts";
            case 2:
                return "MeasureCalls";
            case 3:
                return "ChildCount";
            case 4:
                return "ChildrenMeasures";
            case 5:
                return "MeasuresWidgetsDuration ";
            case 6:
                return "MeasureDuration";
            case 7:
                return "MeasuresLayoutDuration";
            case 8:
                return "SolverVariables";
            case 9:
                return "SolverEquations";
            case 10:
                return "SimpleEquations";
            default:
                return "";
        }
    }

    public long getValue(int i10) {
        switch (i10) {
            case 1:
                return this.mMetrics.mNumberOfLayouts;
            case 2:
                return this.mMetrics.mMeasureCalls;
            case 3:
                return this.mMetrics.mChildCount;
            case 4:
                return this.mMetrics.mNumberOfMeasures;
            case 5:
                return this.mMetrics.measuresWidgetsDuration;
            case 6:
                return this.mMetrics.mMeasureDuration;
            case 7:
                return this.mMetrics.measuresLayoutDuration;
            case 8:
                return this.mMetrics.mVariables;
            case 9:
                return this.mMetrics.mEquations;
            case 10:
                return this.mMetrics.mSimpleEquations;
            default:
                return 0L;
        }
    }

    public void logSummary(String str, ConstraintLayoutStatistics constraintLayoutStatistics) {
        if (constraintLayoutStatistics == null) {
            log(str);
            return;
        }
        DecimalFormat decimalFormat = new DecimalFormat("###.000");
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        Log.v(str, "CL Perf: -=  Performance .(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")  =- ");
        Log.v(str, compare(decimalFormat, constraintLayoutStatistics, 5));
        Log.v(str, compare(decimalFormat, constraintLayoutStatistics, 7));
        Log.v(str, compare(decimalFormat, constraintLayoutStatistics, 6));
        Log.v(str, compare(constraintLayoutStatistics, 1));
        Log.v(str, compare(constraintLayoutStatistics, 2));
        Log.v(str, compare(constraintLayoutStatistics, 3));
        Log.v(str, compare(constraintLayoutStatistics, 4));
        Log.v(str, compare(constraintLayoutStatistics, 8));
        Log.v(str, compare(constraintLayoutStatistics, 9));
        Log.v(str, compare(constraintLayoutStatistics, 10));
    }

    public void reset() {
        this.mMetrics.reset();
    }

    public ConstraintLayoutStatistics(ConstraintLayout constraintLayout) {
        this.mMetrics = new Metrics();
        attach(constraintLayout);
    }

    private String compare(ConstraintLayoutStatistics constraintLayoutStatistics, int i10) {
        String str = getValue(i10) + " -> " + constraintLayoutStatistics.getValue(i10);
        String p9 = a.p(new StringBuilder(), WORD_PAD, geName(i10));
        return a.m("CL Perf: ", p9.substring(p9.length() - MAX_WORD).concat(" = "), str);
    }

    private String log(DecimalFormat decimalFormat, int i10) {
        String fmt = fmt(decimalFormat, ((float) getValue(i10)) * 1.0E-6f, 7);
        String p9 = a.p(new StringBuilder(), WORD_PAD, geName(i10));
        return a.m("CL Perf: ", p9.substring(p9.length() - MAX_WORD).concat(" = "), fmt);
    }

    public void logSummary(String str) {
        log(str);
    }

    private String log(int i10) {
        String l10 = Long.toString(getValue(i10));
        String p9 = a.p(new StringBuilder(), WORD_PAD, geName(i10));
        return a.m("CL Perf: ", p9.substring(p9.length() - MAX_WORD).concat(" = "), l10);
    }
}
