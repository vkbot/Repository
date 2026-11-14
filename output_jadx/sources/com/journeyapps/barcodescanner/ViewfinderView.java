package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import b7.e;
import b7.f;
import b7.u;
import com.example.navistart.R;
import d6.h;
import java.util.ArrayList;
import z5.o;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class ViewfinderView extends View {

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f1651m = {0, 64, 128, 192, 255, 192, 128, 64};

    /* renamed from: b, reason: collision with root package name */
    public final Paint f1652b;
    public int c;
    public final int d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1653f;

    /* renamed from: g, reason: collision with root package name */
    public int f1654g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f1655h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f1656i;

    /* renamed from: j, reason: collision with root package name */
    public f f1657j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f1658k;

    /* renamed from: l, reason: collision with root package name */
    public u f1659l;

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1652b = new Paint(1);
        Resources resources = getResources();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.f1851b);
        this.c = obtainStyledAttributes.getColor(4, resources.getColor(R.color.zxing_viewfinder_mask));
        obtainStyledAttributes.getColor(1, resources.getColor(R.color.zxing_result_view));
        this.d = obtainStyledAttributes.getColor(2, resources.getColor(R.color.zxing_viewfinder_laser));
        this.e = obtainStyledAttributes.getColor(0, resources.getColor(R.color.zxing_possible_result_points));
        this.f1653f = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        this.f1654g = 0;
        this.f1655h = new ArrayList(20);
        this.f1656i = new ArrayList(20);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        u uVar;
        f fVar = this.f1657j;
        if (fVar != null) {
            Rect framingRect = fVar.getFramingRect();
            u previewSize = this.f1657j.getPreviewSize();
            if (framingRect != null && previewSize != null) {
                this.f1658k = framingRect;
                this.f1659l = previewSize;
            }
        }
        Rect rect = this.f1658k;
        if (rect != null && (uVar = this.f1659l) != null) {
            int width = getWidth();
            int height = getHeight();
            int i10 = this.c;
            Paint paint = this.f1652b;
            paint.setColor(i10);
            float f8 = width;
            canvas.drawRect(0.0f, 0.0f, f8, rect.top, paint);
            canvas.drawRect(0.0f, rect.top, rect.left, rect.bottom + 1, paint);
            canvas.drawRect(rect.right + 1, rect.top, f8, rect.bottom + 1, paint);
            canvas.drawRect(0.0f, rect.bottom + 1, f8, height, paint);
            if (this.f1653f) {
                paint.setColor(this.d);
                paint.setAlpha(f1651m[this.f1654g]);
                this.f1654g = (this.f1654g + 1) % 8;
                int height2 = (rect.height() / 2) + rect.top;
                canvas.drawRect(rect.left + 2, height2 - 1, rect.right - 1, height2 + 2, paint);
            }
            float width2 = getWidth() / uVar.f424b;
            float height3 = getHeight() / uVar.c;
            boolean isEmpty = this.f1656i.isEmpty();
            int i11 = 0;
            int i12 = this.e;
            if (!isEmpty) {
                paint.setAlpha(80);
                paint.setColor(i12);
                ArrayList arrayList = this.f1656i;
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList.get(i13);
                    i13++;
                    o oVar = (o) obj;
                    canvas.drawCircle((int) (oVar.f6875a * width2), (int) (oVar.f6876b * height3), 3.0f, paint);
                }
                this.f1656i.clear();
            }
            if (!this.f1655h.isEmpty()) {
                paint.setAlpha(160);
                paint.setColor(i12);
                ArrayList arrayList2 = this.f1655h;
                int size2 = arrayList2.size();
                while (i11 < size2) {
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    o oVar2 = (o) obj2;
                    canvas.drawCircle((int) (oVar2.f6875a * width2), (int) (oVar2.f6876b * height3), 6.0f, paint);
                }
                ArrayList arrayList3 = this.f1655h;
                ArrayList arrayList4 = this.f1656i;
                this.f1655h = arrayList4;
                this.f1656i = arrayList3;
                arrayList4.clear();
            }
            postInvalidateDelayed(80L, rect.left - 6, rect.top - 6, rect.right + 6, rect.bottom + 6);
        }
    }

    public void setCameraPreview(f fVar) {
        this.f1657j = fVar;
        fVar.f381k.add(new e(2, this));
    }

    public void setLaserVisibility(boolean z9) {
        this.f1653f = z9;
    }

    public void setMaskColor(int i10) {
        this.c = i10;
    }
}
