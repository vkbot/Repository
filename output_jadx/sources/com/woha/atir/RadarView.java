package com.woha.atir;

import a.a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.internal.view.SupportMenu;
import com.google.protobuf.q;
import e0.m;
import i7.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class RadarView extends View {

    /* renamed from: b, reason: collision with root package name */
    public final Paint f1676b;
    public final Paint c;
    public final Paint d;
    public final Paint e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f1677f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f1678g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f1679h;

    /* renamed from: i, reason: collision with root package name */
    public List f1680i;

    /* renamed from: j, reason: collision with root package name */
    public double f1681j;

    /* renamed from: k, reason: collision with root package name */
    public double f1682k;

    /* renamed from: l, reason: collision with root package name */
    public float f1683l;

    /* renamed from: m, reason: collision with root package name */
    public double f1684m;

    public RadarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.f1676b = paint;
        paint.setColor(-16776961);
        Paint paint2 = this.f1676b;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        Paint paint3 = new Paint(1);
        this.c = paint3;
        paint3.setColor(SupportMenu.CATEGORY_MASK);
        this.c.setStyle(style);
        Paint paint4 = new Paint(1);
        this.e = paint4;
        paint4.setColor(-16711936);
        Paint paint5 = this.e;
        Paint.Style style2 = Paint.Style.STROKE;
        paint5.setStyle(style2);
        this.e.setStrokeWidth(2.0f);
        Paint paint6 = new Paint();
        this.f1677f = paint6;
        paint6.setStyle(style);
        this.f1677f.setColor(Color.argb(50, 255, 0, 0));
        Paint paint7 = new Paint();
        this.f1678g = paint7;
        paint7.setColor(SupportMenu.CATEGORY_MASK);
        this.f1678g.setStyle(style2);
        this.f1678g.setStrokeWidth(4.0f);
        Paint paint8 = new Paint();
        this.f1679h = paint8;
        paint8.setColor(SupportMenu.CATEGORY_MASK);
        this.f1679h.setStyle(style);
        Paint paint9 = new Paint();
        this.f1677f = paint9;
        paint9.setColor(SupportMenu.CATEGORY_MASK);
        this.f1677f.setStyle(style);
        this.f1677f.setAlpha(100);
        Paint paint10 = new Paint();
        this.d = paint10;
        paint10.setColor(-1);
        this.d.setTextSize(30.0f);
        this.d.setAntiAlias(true);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        List list;
        int i10;
        ArrayList arrayList;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        int width = getWidth() / 2;
        int height = getHeight();
        int i11 = height - 100;
        float width2 = (float) (getWidth() / (this.f1684m * 2.0d));
        for (int i12 = 1; i12 <= 5; i12++) {
            canvas2.drawCircle(width, i11, i12 * 100 * width2, this.e);
        }
        Path path = new Path();
        path.moveTo(width, height - 140);
        float f8 = height - 80;
        path.lineTo(width - 20, f8);
        path.lineTo(width + 20, f8);
        path.close();
        canvas2.drawPath(path, this.f1676b);
        List list2 = this.f1680i;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList();
            int i13 = 0;
            int i14 = 0;
            while (i14 < list2.size()) {
                x xVar = (x) list2.get(i14);
                int size = arrayList2.size();
                int i15 = i13;
                while (true) {
                    if (i15 < size) {
                        Object obj = arrayList2.get(i15);
                        i15++;
                        List list3 = (List) obj;
                        x xVar2 = (x) list3.get(i13);
                        ArrayList arrayList3 = arrayList2;
                        list = list2;
                        i10 = i14;
                        if (a.b(xVar.f2838b, xVar.c, xVar2.f2838b, xVar2.c) <= 50.0d) {
                            list3.add(xVar);
                            arrayList = arrayList3;
                            break;
                        } else {
                            arrayList2 = arrayList3;
                            list2 = list;
                            i14 = i10;
                            i13 = 0;
                        }
                    } else {
                        list = list2;
                        i10 = i14;
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add(xVar);
                        arrayList = arrayList2;
                        arrayList.add(arrayList4);
                        break;
                    }
                }
                i14 = i10 + 1;
                arrayList2 = arrayList;
                list2 = list;
                i13 = 0;
            }
            ArrayList arrayList5 = arrayList2;
            int size2 = arrayList5.size();
            int i16 = 0;
            while (i16 < size2) {
                int i17 = i16 + 1;
                List list4 = (List) arrayList5.get(i16);
                x xVar3 = (x) list4.get(0);
                double d = this.f1681j;
                double d10 = this.f1682k;
                double d11 = xVar3.f2838b;
                int i18 = xVar3.f2840g;
                double b10 = a.b(d, d10, d11, xVar3.c);
                double d12 = this.f1681j;
                double d13 = this.f1682k;
                double d14 = xVar3.f2838b;
                double d15 = xVar3.c;
                double radians = Math.toRadians(d12);
                double radians2 = Math.toRadians(d14);
                double radians3 = Math.toRadians(d15 - d13);
                double degrees = ((Math.toDegrees(Math.atan2(Math.cos(radians2) * Math.sin(radians3), (Math.sin(radians2) * Math.cos(radians)) - (Math.cos(radians3) * (Math.cos(radians2) * Math.sin(radians))))) + 360.0d) % 360.0d) - this.f1683l;
                double d16 = width2 * b10;
                float sin = (float) (width + (Math.sin(Math.toRadians(degrees)) * d16));
                float cos = (float) (i11 - (Math.cos(Math.toRadians(degrees)) * d16));
                Paint.Style style = Paint.Style.FILL;
                Paint paint = this.c;
                paint.setStyle(style);
                canvas2.drawCircle(sin, cos, 7.0f, paint);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(3.0f);
                canvas2.drawCircle(sin, cos, 10.0f, paint);
                StringBuilder sb = new StringBuilder();
                sb.append(m.h(new byte[]{-126, -50, -90, 4, -14, -119, 18}, new byte[]{-47, -66, -61, 97, -106, -77, 50, -94}));
                sb.append(xVar3.e);
                canvas2.drawText(q.i(new byte[]{-122, 101, 5, 53, 103}, new byte[]{-90, 14, 104, 26, 15, -32, -7, -116}, sb), 30.0f + sin, cos, this.d);
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    float f10 = r14.f2841h * width2;
                    int i19 = ((x) it.next()).f2842i;
                    Iterator it2 = it;
                    float f11 = ((r14.f2840g - this.f1683l) + 360.0f) % 360.0f;
                    Path path2 = new Path();
                    path2.moveTo(sin, cos);
                    float f12 = i19 / 2.0f;
                    float f13 = f11 - f12;
                    float f14 = f11 + f12;
                    float f15 = f13;
                    while (f15 <= f14) {
                        int i20 = width;
                        double d17 = f10;
                        double d18 = f15;
                        path2.lineTo((float) ((Math.sin(Math.toRadians(d18)) * d17) + sin), (float) (cos - (Math.cos(Math.toRadians(d18)) * d17)));
                        f15 += 1.0f;
                        width = i20;
                        i11 = i11;
                        width2 = width2;
                    }
                    path2.close();
                    canvas2.drawPath(path2, this.f1677f);
                    it = it2;
                    width = width;
                }
                int i21 = width;
                int i22 = i11;
                float f16 = width2;
                if (xVar3.f2839f != 0) {
                    double d19 = i18;
                    canvas2.drawLine(sin, cos, (float) ((Math.sin(Math.toRadians(d19)) * 100.0d) + sin), (float) (cos - (Math.cos(Math.toRadians(d19)) * 100.0d)), this.f1677f);
                }
                canvas2 = canvas;
                i16 = i17;
                width = i21;
                i11 = i22;
                width2 = f16;
            }
        }
    }

    public void setCameras(List<x> list) {
        this.f1680i = list;
        invalidate();
    }

    public void setCarDirection(float f8) {
        this.f1683l = f8;
        invalidate();
    }

    public void setRadarRadius(double d) {
        this.f1684m = d;
        invalidate();
    }
}
