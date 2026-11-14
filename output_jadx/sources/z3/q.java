package z3;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final y[] f6804a = new y[4];

    /* renamed from: b, reason: collision with root package name */
    public final Matrix[] f6805b = new Matrix[4];
    public final Matrix[] c = new Matrix[4];
    public final PointF d = new PointF();
    public final Path e = new Path();

    /* renamed from: f, reason: collision with root package name */
    public final Path f6806f = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final y f6807g = new y();

    /* renamed from: h, reason: collision with root package name */
    public final float[] f6808h = new float[2];

    /* renamed from: i, reason: collision with root package name */
    public final float[] f6809i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    public final Path f6810j = new Path();

    /* renamed from: k, reason: collision with root package name */
    public final Path f6811k = new Path();

    /* renamed from: l, reason: collision with root package name */
    public final boolean f6812l = true;

    public q() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f6804a[i10] = new y();
            this.f6805b[i10] = new Matrix();
            this.c[i10] = new Matrix();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public final void a(o oVar, float[] fArr, float f8, RectF rectF, g gVar, Path path) {
        Matrix[] matrixArr;
        float[] fArr2;
        int i10;
        y[] yVarArr;
        Matrix[] matrixArr2;
        boolean z9;
        float f10;
        f fVar;
        boolean z10;
        d cVar;
        a.a aVar;
        int i11;
        path.rewind();
        Path path2 = this.e;
        path2.rewind();
        Path path3 = this.f6806f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i12 = 0;
        while (true) {
            matrixArr = this.c;
            fArr2 = this.f6808h;
            yVarArr = this.f6804a;
            matrixArr2 = this.f6805b;
            z9 = 0;
            if (i12 >= 4) {
                break;
            }
            if (fArr == null) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            cVar = oVar.f6796f;
                        } else {
                            cVar = oVar.e;
                        }
                    } else {
                        cVar = oVar.f6798h;
                    }
                } else {
                    cVar = oVar.f6797g;
                }
            } else {
                cVar = new c(fArr[i12]);
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        aVar = oVar.f6795b;
                    } else {
                        aVar = oVar.f6794a;
                    }
                } else {
                    aVar = oVar.d;
                }
            } else {
                aVar = oVar.c;
            }
            y yVar = yVarArr[i12];
            aVar.getClass();
            aVar.k(yVar, f8, cVar.a(rectF));
            int i13 = i12 + 1;
            float f11 = (i13 % 4) * 90;
            matrixArr2[i12].reset();
            PointF pointF = this.d;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        i11 = i12;
                        pointF.set(rectF.right, rectF.top);
                    } else {
                        i11 = i12;
                        pointF.set(rectF.left, rectF.top);
                    }
                } else {
                    i11 = i12;
                    pointF.set(rectF.left, rectF.bottom);
                }
            } else {
                i11 = i12;
                pointF.set(rectF.right, rectF.bottom);
            }
            matrixArr2[i11].setTranslate(pointF.x, pointF.y);
            matrixArr2[i11].preRotate(f11);
            y yVar2 = yVarArr[i11];
            fArr2[0] = yVar2.f6822b;
            fArr2[1] = yVar2.c;
            matrixArr2[i11].mapPoints(fArr2);
            matrixArr[i11].reset();
            matrixArr[i11].setTranslate(fArr2[0], fArr2[1]);
            matrixArr[i11].preRotate(f11);
            i12 = i13;
        }
        int i14 = 0;
        for (i10 = 4; i14 < i10; i10 = 4) {
            y yVar3 = yVarArr[i14];
            yVar3.getClass();
            fArr2[z9] = 0.0f;
            fArr2[1] = yVar3.f6821a;
            matrixArr2[i14].mapPoints(fArr2);
            if (i14 == 0) {
                path.moveTo(fArr2[z9], fArr2[1]);
            } else {
                path.lineTo(fArr2[z9], fArr2[1]);
            }
            yVarArr[i14].b(matrixArr2[i14], path);
            if (gVar != null) {
                y yVar4 = yVarArr[i14];
                Matrix matrix = matrixArr2[i14];
                k kVar = gVar.f6748a;
                f10 = 0.0f;
                BitSet bitSet = kVar.f6765f;
                yVar4.getClass();
                bitSet.set(i14, z9);
                x[] xVarArr = kVar.d;
                yVar4.a(yVar4.e);
                xVarArr[i14] = new r(new ArrayList(yVar4.f6824g), new Matrix(matrix));
            } else {
                f10 = 0.0f;
            }
            int i15 = i14 + 1;
            int i16 = i15 % 4;
            y yVar5 = yVarArr[i14];
            fArr2[0] = yVar5.f6822b;
            fArr2[1] = yVar5.c;
            matrixArr2[i14].mapPoints(fArr2);
            y yVar6 = yVarArr[i16];
            yVar6.getClass();
            float[] fArr3 = this.f6809i;
            fArr3[0] = f10;
            fArr3[1] = yVar6.f6821a;
            matrixArr2[i16].mapPoints(fArr3);
            Matrix[] matrixArr3 = matrixArr;
            y[] yVarArr2 = yVarArr;
            float max = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, f10);
            y yVar7 = yVarArr2[i14];
            fArr2[0] = yVar7.f6822b;
            fArr2[1] = yVar7.c;
            matrixArr2[i14].mapPoints(fArr2);
            if (i14 != 1 && i14 != 3) {
                Math.abs(rectF.centerY() - fArr2[1]);
            } else {
                Math.abs(rectF.centerX() - fArr2[0]);
            }
            y yVar8 = this.f6807g;
            yVar8.d(0.0f, 270.0f, 0.0f);
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 != 3) {
                        fVar = oVar.f6800j;
                    } else {
                        fVar = oVar.f6799i;
                    }
                } else {
                    fVar = oVar.f6802l;
                }
            } else {
                fVar = oVar.f6801k;
            }
            fVar.getClass();
            yVar8.c(max, 0.0f);
            Path path4 = this.f6810j;
            path4.reset();
            yVar8.b(matrixArr3[i14], path4);
            if (this.f6812l && (b(path4, i14) || b(path4, i16))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr2[0] = 0.0f;
                fArr2[1] = yVar8.f6821a;
                matrixArr3[i14].mapPoints(fArr2);
                path2.moveTo(fArr2[0], fArr2[1]);
                yVar8.b(matrixArr3[i14], path2);
            } else {
                yVar8.b(matrixArr3[i14], path);
            }
            if (gVar != null) {
                Matrix matrix2 = matrixArr3[i14];
                k kVar2 = gVar.f6748a;
                z10 = false;
                kVar2.f6765f.set(i14 + 4, false);
                x[] xVarArr2 = kVar2.e;
                yVar8.a(yVar8.e);
                xVarArr2[i14] = new r(new ArrayList(yVar8.f6824g), new Matrix(matrix2));
            } else {
                z10 = false;
            }
            matrixArr = matrixArr3;
            i14 = i15;
            z9 = z10;
            yVarArr = yVarArr2;
        }
        path.close();
        path2.close();
        if (!path2.isEmpty()) {
            path.op(path2, Path.Op.UNION);
        }
    }

    public final boolean b(Path path, int i10) {
        Path path2 = this.f6811k;
        path2.reset();
        this.f6804a[i10].b(this.f6805b[i10], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f)) {
            return true;
        }
        return false;
    }
}
