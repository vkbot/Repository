package w1;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import com.github.anastr.speedviewlib.ImageSpeedometer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class e extends View implements Observer {
    public final ArrayList A;
    public x1.b B;
    public float C;
    public boolean D;
    public boolean E;
    public float F;
    public float G;
    public Locale H;
    public float I;
    public float J;
    public b K;
    public float L;
    public float M;
    public boolean N;
    public Bitmap O;
    public Canvas P;
    public Function1 Q;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f6308b;
    public TextPaint c;
    public final TextPaint d;
    public final TextPaint e;

    /* renamed from: f, reason: collision with root package name */
    public String f6309f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6310g;

    /* renamed from: h, reason: collision with root package name */
    public float f6311h;

    /* renamed from: i, reason: collision with root package name */
    public float f6312i;

    /* renamed from: j, reason: collision with root package name */
    public float f6313j;

    /* renamed from: k, reason: collision with root package name */
    public int f6314k;

    /* renamed from: l, reason: collision with root package name */
    public float f6315l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6316m;

    /* renamed from: n, reason: collision with root package name */
    public float f6317n;

    /* renamed from: o, reason: collision with root package name */
    public int f6318o;

    /* renamed from: p, reason: collision with root package name */
    public ValueAnimator f6319p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f6320q;
    public boolean r;

    /* renamed from: s, reason: collision with root package name */
    public Function3 f6321s;
    public Function2 t;

    /* renamed from: u, reason: collision with root package name */
    public final e3.c f6322u;

    /* renamed from: v, reason: collision with root package name */
    public Bitmap f6323v;
    public final Paint w;

    /* renamed from: x, reason: collision with root package name */
    public int f6324x;

    /* renamed from: y, reason: collision with root package name */
    public int f6325y;

    /* renamed from: z, reason: collision with root package name */
    public int f6326z;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f6308b = new Paint(1);
        this.c = new TextPaint(1);
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.e = textPaint2;
        this.f6309f = "Km/h";
        this.f6310g = true;
        this.f6312i = 100.0f;
        this.f6313j = getMinSpeed();
        this.f6315l = getMinSpeed();
        this.f6317n = 4.0f;
        this.f6318o = 1000;
        i iVar = (i) this;
        this.f6322u = new e3.c(6, iVar);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, config);
        createBitmap.getClass();
        this.f6323v = createBitmap;
        this.w = new Paint(1);
        ArrayList arrayList = new ArrayList();
        this.A = arrayList;
        this.C = g(30.0f);
        Locale locale = Locale.getDefault();
        locale.getClass();
        this.H = locale;
        this.I = 0.1f;
        this.J = 0.1f;
        this.K = b.f6301h;
        this.L = g(1.0f);
        this.M = g(20.0f);
        Bitmap createBitmap2 = Bitmap.createBitmap(1, 1, config);
        createBitmap2.getClass();
        this.O = createBitmap2;
        this.Q = new c(iVar, 2);
        this.c.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.c.setTextSize(g(10.0f));
        this.c.setTextAlign(Paint.Align.CENTER);
        textPaint.setColor(ViewCompat.MEASURED_STATE_MASK);
        textPaint.setTextSize(g(18.0f));
        textPaint2.setColor(ViewCompat.MEASURED_STATE_MASK);
        textPaint2.setTextSize(g(15.0f));
        float f8 = 0.6f;
        x1.b bVar = new x1.b(0.0f, f8, getSpeedometerWidth(), -16711936);
        bVar.q(this);
        arrayList.add(bVar);
        float f10 = 0.87f;
        x1.b bVar2 = new x1.b(f8, f10, getSpeedometerWidth(), InputDeviceCompat.SOURCE_ANY);
        bVar2.q(this);
        arrayList.add(bVar2);
        x1.b bVar3 = new x1.b(f10, 1.0f, getSpeedometerWidth(), SupportMenu.CATEGORY_MASK);
        bVar3.q(this);
        arrayList.add(bVar3);
        if (attributeSet == null) {
            return;
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, f.f6327a, 0, 0);
        obtainStyledAttributes.getClass();
        float f11 = obtainStyledAttributes.getFloat(2, getMaxSpeed());
        float f12 = obtainStyledAttributes.getFloat(3, getMinSpeed());
        j(f12, f11);
        this.f6313j = f12;
        setCurrentSpeed(f12);
        setSpeedometerWidth(obtainStyledAttributes.getDimension(10, getSpeedometerWidth()));
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            x1.b bVar4 = (x1.b) obj;
            bVar4.c = getSpeedometerWidth();
            e eVar = bVar4.f6487b;
            if (eVar != null) {
                eVar.i();
            }
        }
        setWithTremble(obtainStyledAttributes.getBoolean(22, this.f6310g));
        TextPaint textPaint3 = this.c;
        textPaint3.setColor(obtainStyledAttributes.getColor(11, textPaint3.getColor()));
        TextPaint textPaint4 = this.c;
        textPaint4.setTextSize(obtainStyledAttributes.getDimension(13, textPaint4.getTextSize()));
        textPaint.setColor(obtainStyledAttributes.getColor(4, textPaint.getColor()));
        textPaint.setTextSize(obtainStyledAttributes.getDimension(8, textPaint.getTextSize()));
        textPaint2.setColor(obtainStyledAttributes.getColor(19, textPaint2.getColor()));
        textPaint2.setTextSize(obtainStyledAttributes.getDimension(20, textPaint2.getTextSize()));
        String string = obtainStyledAttributes.getString(17);
        setUnit(string == null ? this.f6309f : string);
        setTrembleDegree(obtainStyledAttributes.getFloat(15, this.f6317n));
        setTrembleDuration(obtainStyledAttributes.getInt(16, this.f6318o));
        setSpeedometerTextRightToLeft(obtainStyledAttributes.getBoolean(12, this.D));
        setAccelerate(obtainStyledAttributes.getFloat(0, this.I));
        setDecelerate(obtainStyledAttributes.getFloat(1, this.J));
        setUnitUnderSpeedText(obtainStyledAttributes.getBoolean(21, this.N));
        setUnitSpeedInterval(obtainStyledAttributes.getDimension(18, this.L));
        setSpeedTextPadding(obtainStyledAttributes.getDimension(6, this.M));
        String string2 = obtainStyledAttributes.getString(9);
        if (string2 != null && !isInEditMode()) {
            setSpeedTextTypeface(Typeface.createFromAsset(context.getAssets(), string2));
        }
        String string3 = obtainStyledAttributes.getString(14);
        if (string3 != null && !isInEditMode()) {
            setTextTypeface(Typeface.createFromAsset(context.getAssets(), string3));
        }
        int i11 = obtainStyledAttributes.getInt(7, -1);
        if (i11 != -1) {
            setSpeedTextPosition(b.values()[i11]);
        }
        int i12 = obtainStyledAttributes.getInt(5, -1);
        if (i12 != 0) {
            if (i12 == 1) {
                setSpeedTextListener(new c(iVar, 1));
            }
        } else {
            setSpeedTextListener(new c(iVar, 0));
        }
        obtainStyledAttributes.recycle();
        float f13 = this.I;
        if (f13 <= 1.0f && f13 > 0.0f) {
            float f14 = this.J;
            if (f14 <= 1.0f && f14 > 0.0f) {
                f();
                return;
            } else {
                j1.i.k("decelerate must be between (0, 1]");
                throw null;
            }
        }
        j1.i.k("accelerate must be between (0, 1]");
        throw null;
    }

    public static void a(e eVar, ValueAnimator valueAnimator) {
        boolean z9;
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        if (((Float) animatedValue).floatValue() > eVar.f6315l) {
            z9 = true;
        } else {
            z9 = false;
        }
        eVar.f6316m = z9;
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        animatedValue2.getClass();
        eVar.setCurrentSpeed(((Float) animatedValue2).floatValue());
        eVar.postInvalidate();
    }

    public static void b(e eVar, ValueAnimator valueAnimator) {
        eVar.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        eVar.setCurrentSpeed(((Float) animatedValue).floatValue());
        eVar.postInvalidate();
    }

    private final float getSpeedUnitTextHeight() {
        boolean z9 = this.N;
        TextPaint textPaint = this.e;
        TextPaint textPaint2 = this.d;
        if (z9) {
            return textPaint.getTextSize() + textPaint2.getTextSize() + this.L;
        }
        return Math.max(textPaint2.getTextSize(), textPaint.getTextSize());
    }

    private final float getSpeedUnitTextWidth() {
        boolean z9 = this.N;
        TextPaint textPaint = this.e;
        TextPaint textPaint2 = this.d;
        if (z9) {
            return Math.max(textPaint2.measureText(getSpeedText().toString()), textPaint.measureText(this.f6309f));
        }
        return textPaint.measureText(this.f6309f) + textPaint2.measureText(getSpeedText().toString()) + this.L;
    }

    private final void setCurrentSpeed(float f8) {
        boolean z9;
        this.f6315l = f8;
        int i10 = (int) f8;
        if (i10 != this.f6314k && this.f6321s != null) {
            ValueAnimator valueAnimator = this.f6320q;
            boolean z10 = false;
            int i11 = 1;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (i10 > this.f6314k) {
                z10 = true;
            }
            if (!z10) {
                i11 = -1;
            }
            while (true) {
                int i12 = this.f6314k;
                if (i12 == i10) {
                    break;
                }
                this.f6314k = i12 + i11;
                Function3 function3 = this.f6321s;
                function3.getClass();
                function3.invoke(this, Boolean.valueOf(z10), Boolean.valueOf(z9));
            }
        }
        this.f6314k = i10;
        e();
    }

    private final void setSpeedTextPadding(float f8) {
        this.M = f8;
        if (this.E) {
            invalidate();
        }
    }

    private final void setUnitSpeedInterval(float f8) {
        this.L = f8;
        i();
    }

    public final void c() {
        this.r = true;
        ValueAnimator valueAnimator = this.f6319p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.r = false;
        d();
    }

    public final void d() {
        this.r = true;
        ValueAnimator valueAnimator = this.f6320q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.r = false;
        this.f6320q = null;
    }

    public final void e() {
        x1.b bVar;
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                bVar = (x1.b) obj;
                if (getMinSpeed() + ((getMaxSpeed() - getMinSpeed()) * bVar.e) <= this.f6315l) {
                    if (getMinSpeed() + ((getMaxSpeed() - getMinSpeed()) * bVar.f6488f) >= this.f6315l) {
                        break;
                    }
                }
            } else {
                bVar = null;
                break;
            }
        }
        x1.b bVar2 = this.B;
        if (bVar2 != bVar) {
            Function2 function2 = this.t;
            if (function2 != null) {
                function2.invoke(bVar2, bVar);
            }
            this.B = bVar;
        }
    }

    public final void f() {
        if (this.f6317n >= 0.0f) {
            if (this.f6318o >= 0) {
                return;
            }
            j1.i.k("trembleDuration  can't be Negative");
            return;
        }
        j1.i.k("trembleDegree  can't be Negative");
    }

    public final float g(float f8) {
        return f8 * getContext().getResources().getDisplayMetrics().density;
    }

    public final float getAccelerate() {
        return this.I;
    }

    public final Bitmap getBackgroundBitmap() {
        return this.f6323v;
    }

    public final int getCurrentIntSpeed() {
        return this.f6314k;
    }

    public final x1.b getCurrentSection() {
        return this.B;
    }

    public final float getCurrentSpeed() {
        return this.f6315l;
    }

    public final float getDecelerate() {
        return this.J;
    }

    public final int getHeightPa() {
        return this.f6326z;
    }

    public final Locale getLocale() {
        return this.H;
    }

    public final float getMaxSpeed() {
        return this.f6312i;
    }

    public final float getMinSpeed() {
        return this.f6311h;
    }

    public final float getOffsetSpeed() {
        return (this.f6315l - getMinSpeed()) / (getMaxSpeed() - getMinSpeed());
    }

    public final Function2<x1.b, x1.b, Unit> getOnSectionChangeListener() {
        return this.t;
    }

    public final Function3<e, Boolean, Boolean, Unit> getOnSpeedChangeListener() {
        return this.f6321s;
    }

    public final int getPadding() {
        return this.f6324x;
    }

    public final float getPercentSpeed() {
        return ((this.f6315l - getMinSpeed()) * 100.0f) / (getMaxSpeed() - getMinSpeed());
    }

    public final List<x1.b> getSections() {
        return this.A;
    }

    public final float getSpeed() {
        return this.f6313j;
    }

    public final CharSequence getSpeedText() {
        return (CharSequence) this.Q.invoke(Float.valueOf(this.f6315l));
    }

    public final int getSpeedTextColor() {
        return this.d.getColor();
    }

    public final Function1<Float, CharSequence> getSpeedTextListener() {
        return this.Q;
    }

    public final b getSpeedTextPosition() {
        return this.K;
    }

    public final float getSpeedTextSize() {
        return this.d.getTextSize();
    }

    public final Typeface getSpeedTextTypeface() {
        return this.d.getTypeface();
    }

    public final RectF getSpeedUnitTextBounds() {
        float f8 = ((this.f6325y * this.K.f6303b) - this.F) + this.f6324x;
        float speedUnitTextWidth = getSpeedUnitTextWidth();
        b bVar = this.K;
        float f10 = (this.M * bVar.f6304f) + (f8 - (speedUnitTextWidth * bVar.d));
        float speedUnitTextHeight = (this.M * r3.f6305g) + ((((this.f6326z * bVar.c) - this.G) + this.f6324x) - (getSpeedUnitTextHeight() * this.K.e));
        return new RectF(f10, speedUnitTextHeight, getSpeedUnitTextWidth() + f10, getSpeedUnitTextHeight() + speedUnitTextHeight);
    }

    public final boolean getSpeedometerTextRightToLeft() {
        return this.D;
    }

    public float getSpeedometerWidth() {
        return this.C;
    }

    public final int getTextColor() {
        return this.c.getColor();
    }

    public final TextPaint getTextPaint() {
        return this.c;
    }

    public final float getTextSize() {
        return this.c.getTextSize();
    }

    public final Typeface getTextTypeface() {
        return this.c.getTypeface();
    }

    public final float getTranslatedDx() {
        return this.F;
    }

    public final float getTranslatedDy() {
        return this.G;
    }

    public final float getTrembleDegree() {
        return this.f6317n;
    }

    public final int getTrembleDuration() {
        return this.f6318o;
    }

    public final String getUnit() {
        return this.f6309f;
    }

    public final int getUnitTextColor() {
        return this.e.getColor();
    }

    public final float getUnitTextSize() {
        return this.e.getTextSize();
    }

    public final boolean getUnitUnderSpeedText() {
        return this.N;
    }

    public final int getViewSize() {
        return Math.max(getWidth(), getHeight());
    }

    public final int getViewSizePa() {
        return Math.max(this.f6325y, this.f6326z);
    }

    public final int getWidthPa() {
        return this.f6325y;
    }

    public final boolean getWithTremble() {
        return this.f6310g;
    }

    public final void h(Canvas canvas) {
        float width;
        float measureText;
        RectF speedUnitTextBounds = getSpeedUnitTextBounds();
        String obj = getSpeedText().toString();
        this.O.eraseColor(0);
        boolean z9 = this.N;
        TextPaint textPaint = this.d;
        TextPaint textPaint2 = this.e;
        if (z9) {
            Canvas canvas2 = this.P;
            if (canvas2 != null) {
                canvas2.drawText(obj, this.O.getWidth() * 0.5f, (this.O.getHeight() * 0.5f) - (this.L * 0.5f), textPaint);
            }
            Canvas canvas3 = this.P;
            if (canvas3 != null) {
                canvas3.drawText(this.f6309f, this.O.getWidth() * 0.5f, (this.L * 0.5f) + textPaint2.getTextSize() + (this.O.getHeight() * 0.5f), textPaint2);
            }
        } else {
            boolean z10 = this.D;
            Bitmap bitmap = this.O;
            if (z10) {
                measureText = (bitmap.getWidth() * 0.5f) - (getSpeedUnitTextWidth() * 0.5f);
                width = textPaint2.measureText(this.f6309f) + measureText + this.L;
            } else {
                width = (bitmap.getWidth() * 0.5f) - (getSpeedUnitTextWidth() * 0.5f);
                measureText = textPaint.measureText(obj) + width + this.L;
            }
            float speedUnitTextHeight = (getSpeedUnitTextHeight() * 0.5f) + (this.O.getHeight() * 0.5f);
            Canvas canvas4 = this.P;
            if (canvas4 != null) {
                canvas4.drawText(obj, width, speedUnitTextHeight, textPaint);
            }
            Canvas canvas5 = this.P;
            if (canvas5 != null) {
                canvas5.drawText(this.f6309f, measureText, speedUnitTextHeight, textPaint2);
            }
        }
        canvas.drawBitmap(this.O, (speedUnitTextBounds.width() * 0.5f) + (speedUnitTextBounds.left - (r1.getWidth() * 0.5f)), (speedUnitTextBounds.height() * 0.5f) + (speedUnitTextBounds.top - (this.O.getHeight() * 0.5f)), this.f6308b);
    }

    public final void i() {
        if (this.E) {
            m();
            invalidate();
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.E;
    }

    public final void j(float f8, float f10) {
        if (f8 < f10) {
            c();
            this.f6311h = f8;
            this.f6312i = f10;
            e();
            i();
            if (this.E) {
                setSpeedAt(this.f6313j);
                return;
            }
            return;
        }
        j1.i.k("minSpeed must be smaller than maxSpeed !!");
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        ValueAnimator valueAnimator = this.f6320q;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            d();
        }
    }

    public final void k(float f8) {
        boolean z9;
        if (f8 > getMaxSpeed()) {
            f8 = getMaxSpeed();
        } else if (f8 < getMinSpeed()) {
            f8 = getMinSpeed();
        }
        if (f8 == this.f6313j) {
            return;
        }
        this.f6313j = f8;
        if (f8 > this.f6315l) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f6316m = z9;
        c();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f6315l, f8);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.setDuration(1000L);
        ofFloat.addUpdateListener(new a((ImageSpeedometer) this, 1));
        ofFloat.addListener(this.f6322u);
        this.f6319p = ofFloat;
        ofFloat.start();
    }

    public final void l() {
        int i10;
        float minSpeed;
        float f8;
        d();
        if (!this.f6310g) {
            return;
        }
        Random random = new Random();
        float nextFloat = random.nextFloat() * this.f6317n;
        if (random.nextBoolean()) {
            i10 = -1;
        } else {
            i10 = 1;
        }
        float f10 = nextFloat * i10;
        if (this.f6313j + f10 > getMaxSpeed()) {
            minSpeed = getMaxSpeed();
            f8 = this.f6313j;
        } else {
            if (this.f6313j + f10 < getMinSpeed()) {
                minSpeed = getMinSpeed();
                f8 = this.f6313j;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f6315l, this.f6313j + f10);
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ofFloat.setDuration(this.f6318o);
            ofFloat.addUpdateListener(new a(this, 0));
            ofFloat.addListener(this.f6322u);
            this.f6320q = ofFloat;
            ofFloat.start();
        }
        f10 = minSpeed - f8;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f6315l, this.f6313j + f10);
        ofFloat2.setInterpolator(new DecelerateInterpolator());
        ofFloat2.setDuration(this.f6318o);
        ofFloat2.addUpdateListener(new a(this, 0));
        ofFloat2.addListener(this.f6322u);
        this.f6320q = ofFloat2;
        ofFloat2.start();
    }

    public abstract void m();

    public final void n(int i10, int i11, int i12, int i13) {
        this.f6324x = Math.max(Math.max(i10, i12), Math.max(i11, i13));
        this.f6325y = getWidth() - (this.f6324x * 2);
        this.f6326z = getHeight() - (this.f6324x * 2);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.E = true;
        if (!isInEditMode()) {
            m();
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
        this.E = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.getClass();
        canvas.translate(this.F, this.G);
        canvas.drawBitmap(this.f6323v, 0.0f, 0.0f, this.w);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        int i14;
        super.onSizeChanged(i10, i11, i12, i13);
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        int i15 = this.f6325y;
        if (i15 > 0 && (i14 = this.f6326z) > 0) {
            Bitmap createBitmap = Bitmap.createBitmap(i15, i14, Bitmap.Config.ARGB_8888);
            createBitmap.getClass();
            this.O = createBitmap;
        }
        this.P = new Canvas(this.O);
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z9) {
        super.onVisibilityAggregated(z9);
        ValueAnimator valueAnimator = this.f6319p;
        if (valueAnimator != null) {
            valueAnimator.isRunning();
        }
    }

    public final void setAccelerate(float f8) {
        this.I = f8;
        if (f8 <= 1.0f && f8 > 0.0f) {
            return;
        }
        j1.i.k("accelerate must be between (0, 1]");
    }

    public final void setBackgroundBitmap(Bitmap bitmap) {
        bitmap.getClass();
        this.f6323v = bitmap;
    }

    public final void setDecelerate(float f8) {
        this.J = f8;
        if (f8 <= 1.0f && f8 > 0.0f) {
            return;
        }
        j1.i.k("decelerate must be between (0, 1]");
    }

    public final void setLocale(Locale locale) {
        locale.getClass();
        this.H = locale;
        if (this.E) {
            invalidate();
        }
    }

    public final void setMaxSpeed(float f8) {
        j(getMinSpeed(), f8);
    }

    public final void setMinSpeed(float f8) {
        j(f8, getMaxSpeed());
    }

    public final void setOnSectionChangeListener(Function2<? super x1.b, ? super x1.b, Unit> function2) {
        this.t = function2;
    }

    public final void setOnSpeedChangeListener(Function3<? super e, ? super Boolean, ? super Boolean, Unit> function3) {
        this.f6321s = function3;
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        n(i10, i11, i12, i13);
        int i14 = this.f6324x;
        super.setPadding(i14, i14, i14, i14);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i10, int i11, int i12, int i13) {
        n(i10, i11, i12, i13);
        int i14 = this.f6324x;
        super.setPaddingRelative(i14, i14, i14, i14);
    }

    public final void setSpeedAt(float f8) {
        boolean z9;
        if (f8 > getMaxSpeed()) {
            f8 = getMaxSpeed();
        } else if (f8 < getMinSpeed()) {
            f8 = getMinSpeed();
        }
        if (f8 > this.f6315l) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f6316m = z9;
        this.f6313j = f8;
        setCurrentSpeed(f8);
        c();
        invalidate();
        l();
    }

    public final void setSpeedTextColor(int i10) {
        this.d.setColor(i10);
        if (this.E) {
            invalidate();
        }
    }

    public final void setSpeedTextListener(Function1<? super Float, ? extends CharSequence> function1) {
        function1.getClass();
        this.Q = function1;
        i();
    }

    public final void setSpeedTextPosition(b bVar) {
        bVar.getClass();
        this.K = bVar;
        i();
    }

    public final void setSpeedTextSize(float f8) {
        this.d.setTextSize(f8);
        if (this.E) {
            invalidate();
        }
    }

    public final void setSpeedTextTypeface(Typeface typeface) {
        this.d.setTypeface(typeface);
        this.e.setTypeface(typeface);
        i();
    }

    public final void setSpeedometerTextRightToLeft(boolean z9) {
        this.D = z9;
        i();
    }

    public void setSpeedometerWidth(float f8) {
        this.C = f8;
        d dVar = new d(f8);
        ArrayList arrayList = new ArrayList(getSections());
        ArrayList arrayList2 = this.A;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            ((x1.b) obj).f6487b = null;
        }
        arrayList2.clear();
        i();
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
            x1.b bVar = (x1.b) obj2;
            bVar.getClass();
            dVar.invoke(bVar);
        }
        int size3 = arrayList.size();
        while (i10 < size3) {
            Object obj3 = arrayList.get(i10);
            i10++;
            x1.b bVar2 = (x1.b) obj3;
            bVar2.q(this);
            arrayList2.add(bVar2);
            int indexOf = arrayList2.indexOf(bVar2);
            float f10 = bVar2.e;
            float f11 = bVar2.f6488f;
            if (f10 < f11) {
                x1.b bVar3 = (x1.b) CollectionsKt.getOrNull(arrayList2, indexOf - 1);
                if (bVar3 != null) {
                    float f12 = bVar3.f6488f;
                    if (f12 > f10 || f12 >= f11) {
                        l9.i.d(ai.onnxruntime.a.f(indexOf, "Section at index (", ") is conflicted with previous section"));
                        return;
                    }
                }
                x1.b bVar4 = (x1.b) CollectionsKt.getOrNull(arrayList2, indexOf + 1);
                if (bVar4 != null) {
                    float f13 = bVar4.e;
                    if (f13 < f11 || f13 <= f10) {
                        l9.i.d(ai.onnxruntime.a.f(indexOf, "Section at index (", ") is conflicted with next section"));
                        return;
                    }
                }
            } else {
                j1.i.k("endOffset must be bigger than startOffset");
                return;
            }
        }
        i();
        if (this.E) {
            i();
        }
    }

    public final void setTextColor(int i10) {
        this.c.setColor(i10);
        i();
    }

    public final void setTextPaint(TextPaint textPaint) {
        textPaint.getClass();
        this.c = textPaint;
    }

    public final void setTextSize(float f8) {
        this.c.setTextSize(f8);
        if (this.E) {
            invalidate();
        }
    }

    public final void setTextTypeface(Typeface typeface) {
        this.c.setTypeface(typeface);
        i();
    }

    public final void setTranslatedDx(float f8) {
        this.F = f8;
    }

    public final void setTranslatedDy(float f8) {
        this.G = f8;
    }

    public final void setTrembleDegree(float f8) {
        this.f6317n = f8;
        f();
    }

    public final void setTrembleDuration(int i10) {
        this.f6318o = i10;
        f();
    }

    public final void setUnit(String str) {
        str.getClass();
        this.f6309f = str;
        if (this.E) {
            invalidate();
        }
    }

    public final void setUnitTextColor(int i10) {
        this.e.setColor(i10);
        if (this.E) {
            invalidate();
        }
    }

    public final void setUnitTextSize(float f8) {
        this.e.setTextSize(f8);
        i();
    }

    public final void setUnitUnderSpeedText(boolean z9) {
        this.N = z9;
        TextPaint textPaint = this.e;
        TextPaint textPaint2 = this.d;
        if (z9) {
            Paint.Align align = Paint.Align.CENTER;
            textPaint2.setTextAlign(align);
            textPaint.setTextAlign(align);
        } else {
            Paint.Align align2 = Paint.Align.LEFT;
            textPaint2.setTextAlign(align2);
            textPaint.setTextAlign(align2);
        }
        i();
    }

    public final void setWithTremble(boolean z9) {
        this.f6310g = z9;
        l();
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        i();
    }
}
