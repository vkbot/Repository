package w1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import com.github.anastr.speedviewlib.ImageSpeedometer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class i extends e {
    public y1.b R;
    public final PointF S;
    public boolean T;
    public int U;
    public final Paint V;
    public final Paint W;

    /* renamed from: a0, reason: collision with root package name */
    public final Paint f6339a0;

    /* renamed from: b0, reason: collision with root package name */
    public final Path f6340b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f6341c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f6342d0;

    /* renamed from: e0, reason: collision with root package name */
    public float f6343e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f6344f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f6345g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f6346h0;

    /* renamed from: i0, reason: collision with root package name */
    public float f6347i0;

    /* renamed from: j0, reason: collision with root package name */
    public final ArrayList f6348j0;

    /* renamed from: k0, reason: collision with root package name */
    public g f6349k0;

    /* renamed from: l0, reason: collision with root package name */
    public final int f6350l0;

    /* renamed from: m0, reason: collision with root package name */
    public List f6351m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f6352n0;

    /* renamed from: o0, reason: collision with root package name */
    public float f6353o0;

    /* renamed from: p0, reason: collision with root package name */
    public float f6354p0;

    /* renamed from: q0, reason: collision with root package name */
    public Function2 f6355q0;

    /* renamed from: r0, reason: collision with root package name */
    public float f6356r0;

    public i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.R = new y1.b(context);
        this.S = new PointF(0.5f, 0.5f);
        this.U = -1140893918;
        Paint paint = new Paint(1);
        this.V = paint;
        Paint paint2 = new Paint(1);
        this.W = paint2;
        Paint paint3 = new Paint(1);
        this.f6339a0 = paint3;
        this.f6340b0 = new Path();
        this.f6343e0 = g(9.0f);
        this.f6344f0 = -1;
        this.f6345g0 = 135;
        this.f6346h0 = 405;
        this.f6347i0 = 135;
        this.f6348j0 = new ArrayList();
        this.f6349k0 = g.NORMAL;
        this.f6351m0 = CollectionsKt.emptyList();
        this.f6352n0 = true;
        this.f6354p0 = g(3.0f) + getSpeedometerWidth();
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint3.setStyle(style);
        setMarkColor(-1);
        setMarkWidth(g(3.0f));
        setMarkStyle(x1.c.c);
        ImageSpeedometer imageSpeedometer = (ImageSpeedometer) this;
        imageSpeedometer.setBackgroundCircleColor(0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, f.c, 0, 0);
            obtainStyledAttributes.getClass();
            int i10 = obtainStyledAttributes.getInt(13, -1);
            if (i10 != -1 && i10 != 0) {
                setSpeedometerMode(g.values()[i10]);
            }
            int i11 = obtainStyledAttributes.getInt(3, -1);
            if (i11 != -1) {
                setIndicator(y1.a.values()[i11]);
            }
            setMarksNumber(obtainStyledAttributes.getInt(11, this.f6341c0));
            setMarksPadding(obtainStyledAttributes.getDimension(12, this.f6342d0));
            setMarkHeight(obtainStyledAttributes.getDimension(8, this.f6343e0));
            setMarkWidth(obtainStyledAttributes.getDimension(10, getMarkWidth()));
            setMarkColor(obtainStyledAttributes.getColor(7, getMarkColor()));
            int i12 = obtainStyledAttributes.getInt(9, -1);
            if (i12 != -1) {
                setMarkStyle(x1.c.values()[i12]);
            }
            setBackgroundCircleColor(obtainStyledAttributes.getColor(0, this.f6344f0));
            this.f6345g0 = obtainStyledAttributes.getInt(14, this.f6345g0);
            this.f6346h0 = obtainStyledAttributes.getInt(2, this.f6346h0);
            y1.b bVar = this.R;
            bVar.h(obtainStyledAttributes.getDimension(6, bVar.d));
            this.f6350l0 = (int) obtainStyledAttributes.getDimension(1, this.f6350l0);
            setTickNumber(obtainStyledAttributes.getInteger(15, this.f6351m0.size()));
            this.f6352n0 = obtainStyledAttributes.getBoolean(17, this.f6352n0);
            setTickPadding(obtainStyledAttributes.getDimension(16, this.f6354p0));
            y1.b bVar2 = this.R;
            bVar2.g(obtainStyledAttributes.getColor(4, bVar2.e));
            this.T = obtainStyledAttributes.getBoolean(19, this.T);
            this.U = obtainStyledAttributes.getColor(5, this.U);
            int i13 = obtainStyledAttributes.getInt(18, -1);
            if (i13 != 0) {
                if (i13 == 1) {
                    setOnPrintTickLabel(new h(imageSpeedometer, 1));
                }
            } else {
                setOnPrintTickLabel(new h(imageSpeedometer, 0));
            }
            this.f6347i0 = this.f6345g0;
            obtainStyledAttributes.recycle();
            o();
        }
        paint.setColor(this.f6344f0);
    }

    public final int getBackgroundCircleColor() {
        return this.f6344f0;
    }

    public final float getDegree() {
        return this.f6347i0;
    }

    public final int getEndDegree() {
        return this.f6346h0;
    }

    public final float getFulcrumX() {
        return this.S.x;
    }

    public final float getFulcrumY() {
        return this.S.y;
    }

    public final y1.b getIndicator() {
        return this.R;
    }

    public final int getIndicatorLightColor() {
        return this.U;
    }

    public final float getInitTickPadding() {
        return this.f6353o0;
    }

    public final int getMarkColor() {
        return this.f6339a0.getColor();
    }

    public final float getMarkHeight() {
        return this.f6343e0;
    }

    public final Paint getMarkPaint() {
        return this.f6339a0;
    }

    public final x1.c getMarkStyle() {
        if (this.f6339a0.getStrokeCap() == Paint.Cap.ROUND) {
            return x1.c.f6491b;
        }
        return x1.c.c;
    }

    public final float getMarkWidth() {
        return this.f6339a0.getStrokeWidth();
    }

    public final int getMarksNumber() {
        return this.f6341c0;
    }

    public final float getMarksPadding() {
        return this.f6342d0;
    }

    public final Function2<Integer, Float, CharSequence> getOnPrintTickLabel() {
        return this.f6355q0;
    }

    public final int getSize() {
        g gVar = this.f6349k0;
        if (gVar == g.NORMAL) {
            return getWidth();
        }
        if (gVar.d) {
            return Math.max(getWidth(), getHeight());
        }
        return (Math.max(getWidth(), getHeight()) * 2) - (this.f6350l0 * 2);
    }

    public final int getSizePa() {
        return getSize() - (getPadding() * 2);
    }

    public final g getSpeedometerMode() {
        return this.f6349k0;
    }

    @Override // w1.e
    public float getSpeedometerWidth() {
        return super.getSpeedometerWidth();
    }

    public final int getStartDegree() {
        return this.f6345g0;
    }

    public final int getTickNumber() {
        return this.f6351m0.size();
    }

    public final float getTickPadding() {
        return this.f6354p0;
    }

    public final List<Float> getTicks() {
        return this.f6351m0;
    }

    public final float getViewBottom() {
        return (getHeight() * 0.5f) + getViewCenterY();
    }

    public final float getViewCenterX() {
        int ordinal = this.f6349k0.ordinal();
        if (ordinal != 1) {
            if (ordinal != 3) {
                if (ordinal != 5) {
                    if (ordinal != 6 && ordinal != 7) {
                        if (ordinal != 8) {
                            return getSize() * 0.5f;
                        }
                    }
                }
            }
            return (getWidth() * 0.5f) + (getSize() * 0.5f);
        }
        return (getSize() * 0.5f) - (getWidth() * 0.5f);
    }

    public final float getViewCenterY() {
        switch (this.f6349k0.ordinal()) {
            case 2:
            case 5:
            case 6:
                return (getSize() * 0.5f) - (getHeight() * 0.5f);
            case 3:
            default:
                return getSize() * 0.5f;
            case 4:
            case 7:
            case 8:
                return (getHeight() * 0.5f) + (getSize() * 0.5f);
        }
    }

    public final float getViewLeft() {
        return getViewCenterX() - (getWidth() * 0.5f);
    }

    public final float getViewRight() {
        return (getWidth() * 0.5f) + getViewCenterX();
    }

    public final float getViewTop() {
        return getViewCenterY() - (getHeight() * 0.5f);
    }

    public final void o() {
        int i10 = this.f6345g0;
        if (i10 >= 0) {
            int i11 = this.f6346h0;
            if (i11 >= 0) {
                if (i10 < i11) {
                    if (i11 - i10 <= 360) {
                        g gVar = this.f6349k0;
                        if (i10 >= gVar.f6336b) {
                            if (i11 <= gVar.c) {
                                return;
                            }
                            throw new IllegalArgumentException(("EndDegree must be smaller than " + this.f6349k0.c + " in " + this.f6349k0 + " Mode !").toString());
                        }
                        throw new IllegalArgumentException(("StartDegree must be bigger than " + this.f6349k0.f6336b + " in " + this.f6349k0 + " Mode !").toString());
                    }
                    j1.i.k("(EndDegree - StartDegree) must be smaller than 360 !");
                    return;
                }
                j1.i.k("EndDegree must be bigger than StartDegree !");
                return;
            }
            j1.i.k("EndDegree can't be Negative");
            return;
        }
        j1.i.k("StartDegree can't be Negative");
    }

    @Override // w1.e, android.view.View
    public void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        this.f6347i0 = p(getCurrentSpeed());
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int g10 = (int) g(250.0f);
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode == 1073741824 && mode2 == 1073741824) {
            size = Math.min(size, size2);
        } else if (mode != 1073741824) {
            if (mode2 == 1073741824) {
                size = size2;
            } else if ((mode == 0 && mode2 == 0) || (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE)) {
                size = Math.min(g10, Math.min(size, size2));
            } else if (mode == Integer.MIN_VALUE) {
                size = Math.min(g10, size);
            } else {
                size = Math.min(g10, size2);
            }
        }
        int max = Math.max(size, Math.max(getSuggestedMinimumWidth(), getSuggestedMinimumHeight()));
        g gVar = this.f6349k0;
        int i12 = gVar.e;
        int i13 = max / i12;
        int i14 = max / gVar.f6337f;
        if (gVar.d) {
            int i15 = this.f6350l0;
            if (i12 == 2) {
                i13 += i15;
            } else {
                i14 += i15;
            }
        }
        setMeasuredDimension(i13, i14);
    }

    @Override // w1.e, android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.R.i();
        s();
    }

    public final float p(float f8) {
        return (((f8 - getMinSpeed()) * (this.f6346h0 - this.f6345g0)) / (getMaxSpeed() - getMinSpeed())) + this.f6345g0;
    }

    public final float q(float f8) {
        return getMinSpeed() + (((getMaxSpeed() - getMinSpeed()) * (f8 - this.f6345g0)) / (this.f6346h0 - this.f6345g0));
    }

    public final void r(int i10, int i11) {
        this.f6345g0 = i10;
        this.f6346h0 = i11;
        o();
        c();
        this.f6347i0 = p(getSpeed());
        if (this.E) {
            i();
            l();
        }
    }

    public final void s() {
        float f8;
        g gVar = this.f6349k0;
        gVar.getClass();
        g gVar2 = g.RIGHT;
        float f10 = 0.0f;
        g gVar3 = g.BOTTOM_RIGHT;
        if (gVar != gVar2 && gVar != g.TOP_RIGHT && gVar != gVar3) {
            f8 = 0.0f;
        } else {
            f8 = ((-getSize()) * 0.5f) + this.f6350l0;
        }
        setTranslatedDx(f8);
        g gVar4 = this.f6349k0;
        gVar4.getClass();
        if (gVar4 == g.BOTTOM || gVar4 == g.BOTTOM_LEFT || gVar4 == gVar3) {
            f10 = ((-getSize()) * 0.5f) + this.f6350l0;
        }
        setTranslatedDy(f10);
    }

    public final void setBackgroundCircleColor(int i10) {
        this.f6344f0 = i10;
        this.V.setColor(i10);
        i();
    }

    public final void setEndDegree(int i10) {
        r(this.f6345g0, i10);
    }

    public void setIndicator(y1.a aVar) {
        y1.b bVar;
        aVar.getClass();
        int i10 = y1.b.f6611f;
        Context context = getContext();
        context.getClass();
        switch (aVar.ordinal()) {
            case 0:
                bVar = new y1.b(context);
                break;
            case 1:
                bVar = new y1.c(context, 2);
                break;
            case 2:
                bVar = new y1.c(context, 3);
                break;
            case 3:
                y1.c cVar = new y1.c(context, 4);
                cVar.f6616i = new Path();
                cVar.h(25.0f * cVar.f6613b);
                bVar = cVar;
                break;
            case 4:
                bVar = new y1.f(context);
                break;
            case 5:
                bVar = new y1.c(context, 1.0f);
                break;
            case 6:
                bVar = new y1.c(context, 0.5f);
                break;
            case 7:
                bVar = new y1.c(context, 0.25f);
                break;
            case 8:
                bVar = new y1.c(context, 0);
                break;
            case 9:
                bVar = new y1.d(context);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        bVar.deleteObservers();
        bVar.addObserver(this);
        bVar.c = this;
        bVar.i();
        setIndicator(bVar);
    }

    public final void setIndicatorLightColor(int i10) {
        this.U = i10;
    }

    public final void setInitTickPadding(float f8) {
        this.f6353o0 = f8;
    }

    public final void setMarkColor(int i10) {
        this.f6339a0.setColor(i10);
    }

    public final void setMarkHeight(float f8) {
        this.f6343e0 = f8;
        i();
    }

    public final void setMarkStyle(x1.c cVar) {
        cVar.getClass();
        x1.c cVar2 = x1.c.f6491b;
        Paint paint = this.f6339a0;
        if (cVar == cVar2) {
            paint.setStrokeCap(Paint.Cap.ROUND);
        } else {
            paint.setStrokeCap(Paint.Cap.BUTT);
        }
        i();
    }

    public final void setMarkWidth(float f8) {
        this.f6339a0.setStrokeWidth(f8);
        i();
    }

    public final void setMarksNumber(int i10) {
        this.f6341c0 = i10;
        i();
    }

    public final void setMarksPadding(float f8) {
        this.f6342d0 = f8;
        i();
    }

    public final void setOnPrintTickLabel(Function2<? super Integer, ? super Float, ? extends CharSequence> function2) {
        this.f6355q0 = function2;
        i();
    }

    public final void setSpeedometerMode(g gVar) {
        gVar.getClass();
        this.f6349k0 = gVar;
        if (gVar != g.NORMAL) {
            this.f6345g0 = gVar.f6336b;
            this.f6346h0 = gVar.c;
        }
        s();
        c();
        this.f6347i0 = p(getSpeed());
        this.R.i();
        if (this.E) {
            requestLayout();
            i();
            l();
        }
    }

    @Override // w1.e
    public void setSpeedometerWidth(float f8) {
        super.setSpeedometerWidth(f8);
        if (this.E) {
            this.R.i();
        }
    }

    public final void setStartDegree(int i10) {
        r(i10, this.f6346h0);
    }

    public final void setTickNumber(int i10) {
        float f8;
        if (i10 >= 0) {
            ArrayList arrayList = new ArrayList();
            if (i10 == 1) {
                f8 = 0.0f;
            } else {
                f8 = 1.0f / (i10 - 1);
            }
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(Float.valueOf(i11 * f8));
            }
            setTicks(arrayList);
            return;
        }
        j1.i.k("tickNumber mustn't be negative");
    }

    public final void setTickPadding(float f8) {
        this.f6354p0 = f8;
        i();
    }

    public final void setTickRotation(boolean z9) {
        this.f6352n0 = z9;
        i();
    }

    public final void setTicks(List<Float> list) {
        list.getClass();
        this.f6351m0 = list;
        Iterator<Float> it = list.iterator();
        while (it.hasNext()) {
            float floatValue = it.next().floatValue();
            if (floatValue < 0.0f || floatValue > 1.0f) {
                j1.i.k("ticks must be between [0f, 1f] !!");
                return;
            }
        }
        i();
    }

    public final void setWithIndicatorLight(boolean z9) {
        this.T = z9;
    }

    public final void setIndicator(y1.b bVar) {
        bVar.getClass();
        this.R.deleteObservers();
        bVar.deleteObservers();
        bVar.addObserver(this);
        bVar.c = this;
        bVar.i();
        this.R = bVar;
        if (this.E) {
            bVar.deleteObservers();
            bVar.addObserver(this);
            bVar.c = this;
            bVar.i();
            invalidate();
        }
    }
}
