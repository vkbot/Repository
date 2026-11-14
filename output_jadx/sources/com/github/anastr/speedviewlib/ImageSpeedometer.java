package com.github.anastr.speedviewlib;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import com.bumptech.glide.g;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import w1.f;
import w1.i;
import y1.b;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\u000bJ\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\b\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/github/anastr/speedviewlib/ImageSpeedometer;", "Lw1/i;", "Landroid/graphics/drawable/Drawable;", "getImageSpeedometer", "()Landroid/graphics/drawable/Drawable;", "", "imageResource", "", "setImageSpeedometer", "(I)V", "imageSpeedometer", "(Landroid/graphics/drawable/Drawable;)V", "Landroid/graphics/Bitmap;", "bitmapImage", "(Landroid/graphics/Bitmap;)V", "speedviewlib_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public class ImageSpeedometer extends i {

    /* renamed from: s0, reason: collision with root package name */
    public Drawable f1080s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ImageSpeedometer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        if (attributeSet == null) {
            return;
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, f.f6328b, 0, 0);
        obtainStyledAttributes.getClass();
        this.f1080s0 = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: getImageSpeedometer, reason: from getter */
    public final Drawable getF1080s0() {
        return this.f1080s0;
    }

    @Override // w1.e
    public final void m() {
        Canvas canvas;
        CharSequence charSequence;
        if (getSize() == 0) {
            canvas = new Canvas();
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(getSize(), getSize(), Bitmap.Config.ARGB_8888);
            createBitmap.getClass();
            setBackgroundBitmap(createBitmap);
            canvas = new Canvas(getBackgroundBitmap());
            canvas.drawCircle(getSize() * 0.5f, getSize() * 0.5f, (getSize() * 0.5f) - getPadding(), this.V);
            canvas.clipRect(0, 0, getSize(), getSize());
        }
        Drawable drawable = this.f1080s0;
        if (drawable != null) {
            drawable.getClass();
            drawable.setBounds(getPadding() + ((int) getViewLeft()), getPadding() + ((int) getViewTop()), ((int) getViewRight()) - getPadding(), ((int) getViewBottom()) - getPadding());
            Drawable drawable2 = this.f1080s0;
            drawable2.getClass();
            drawable2.draw(canvas);
        }
        Path path = this.f6340b0;
        path.reset();
        path.moveTo(getSize() * 0.5f, this.f6342d0 + getPadding());
        path.lineTo(getSize() * 0.5f, this.f6342d0 + this.f6343e0 + getPadding());
        canvas.save();
        canvas.rotate(getStartDegree() + 90.0f, getSize() * 0.5f, getSize() * 0.5f);
        float endDegree = getEndDegree() - getStartDegree();
        int i10 = this.f6341c0;
        float f8 = endDegree / (i10 + 1.0f);
        if (1 <= i10) {
            int i11 = 1;
            while (true) {
                canvas.rotate(f8, getSize() * 0.5f, getSize() * 0.5f);
                canvas.drawPath(path, this.f6339a0);
                if (i11 == i10) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        canvas.restore();
        if (!this.f6351m0.isEmpty()) {
            getTextPaint().setTextAlign(Paint.Align.LEFT);
            int i12 = this.f6346h0 - this.f6345g0;
            int i13 = 0;
            for (Object obj : this.f6351m0) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                float floatValue = (i12 * ((Number) obj).floatValue()) + this.f6345g0;
                canvas.save();
                float f10 = floatValue + 90.0f;
                canvas.rotate(f10, getSize() * 0.5f, getSize() * 0.5f);
                if (!this.f6352n0) {
                    canvas.rotate(-f10, getSize() * 0.5f, getTextPaint().getTextSize() + this.f6353o0 + getPadding() + this.f6354p0);
                }
                Function2 function2 = this.f6355q0;
                if (function2 != null) {
                    charSequence = (CharSequence) function2.invoke(Integer.valueOf(i13), Float.valueOf(q(floatValue)));
                } else {
                    charSequence = null;
                }
                if (charSequence == null) {
                    charSequence = String.format(getLocale(), "%.0f", Arrays.copyOf(new Object[]{Float.valueOf(q(floatValue))}, 1));
                }
                canvas.translate(0.0f, this.f6353o0 + getPadding() + this.f6354p0);
                StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), getTextPaint(), getSize()).setAlignment(Layout.Alignment.ALIGN_CENTER).build().draw(canvas);
                canvas.restore();
                i13 = i14;
            }
        }
    }

    @Override // w1.i, w1.e, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f8;
        float d;
        canvas.getClass();
        super.onDraw(canvas);
        h(canvas);
        canvas.save();
        canvas.translate((getFulcrumX() - 0.5f) * getSize(), (getFulcrumY() - 0.5f) * getSize());
        canvas.rotate(this.f6347i0 + 90.0f, getSize() * 0.5f, getSize() * 0.5f);
        if (this.T) {
            float abs = Math.abs(getPercentSpeed() - this.f6356r0) * 30.0f;
            this.f6356r0 = getPercentSpeed();
            if (abs > 30.0f) {
                f8 = 30.0f;
            } else {
                f8 = abs;
            }
            SweepGradient sweepGradient = new SweepGradient(getSize() * 0.5f, getSize() * 0.5f, new int[]{this.U, ViewCompat.MEASURED_SIZE_MASK}, new float[]{0.0f, f8 / 360.0f});
            Paint paint = this.W;
            paint.setShader(sweepGradient);
            b bVar = this.R;
            if (bVar.d() > bVar.b()) {
                d = bVar.b();
            } else {
                d = bVar.d();
            }
            paint.setStrokeWidth(d - this.R.e());
            float strokeWidth = (paint.getStrokeWidth() * 0.5f) + this.R.e();
            RectF rectF = new RectF(strokeWidth, strokeWidth, getSize() - strokeWidth, getSize() - strokeWidth);
            canvas.save();
            canvas.rotate(-90.0f, getSize() * 0.5f, getSize() * 0.5f);
            if (this.f6316m) {
                canvas.scale(1.0f, -1.0f, getSize() * 0.5f, getSize() * 0.5f);
            }
            canvas2 = canvas;
            canvas2.drawArc(rectF, 0.0f, f8, false, paint);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        this.R.a(canvas2);
        canvas2.restore();
        Iterator it = this.f6348j0.iterator();
        if (!it.hasNext()) {
        } else {
            throw g.b(it);
        }
    }

    @Override // w1.i, w1.e, android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        m();
    }

    public final void setImageSpeedometer(Bitmap bitmapImage) {
        bitmapImage.getClass();
        setImageSpeedometer(new BitmapDrawable(getContext().getResources(), bitmapImage));
    }

    public final void setImageSpeedometer(Drawable imageSpeedometer) {
        this.f1080s0 = imageSpeedometer;
        m();
    }

    public final void setImageSpeedometer(int imageResource) {
        setImageSpeedometer(getContext().getDrawable(imageResource));
    }
}
