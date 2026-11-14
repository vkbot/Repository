package e0;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.MarginLayoutParamsCompat;
import com.example.navistart.Transport.TransportService;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class s3 implements e5.b, f2.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2028b;
    public final Object c;
    public Object d;
    public Object e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2029f;

    /* renamed from: g, reason: collision with root package name */
    public Object f2030g;

    public s3() {
        this.f2028b = 1;
        this.c = new LinkedHashSet();
        this.d = Optional.empty();
        this.e = Optional.empty();
        this.f2029f = Optional.empty();
    }

    public static ArrayList f(List list, int i10, int i11) {
        int i12 = (i10 - i11) / 2;
        ArrayList arrayList = new ArrayList();
        o2.c cVar = new o2.c();
        cVar.f4312g = i12;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (i13 == 0) {
                arrayList.add(cVar);
            }
            arrayList.add((o2.c) list.get(i13));
            if (i13 == list.size() - 1) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    public static int[] t(int i10, ArrayList arrayList, SparseIntArray sparseIntArray) {
        Collections.sort(arrayList);
        sparseIntArray.clear();
        int[] iArr = new int[i10];
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            o2.d dVar = (o2.d) obj;
            int i13 = dVar.f4323b;
            iArr[i11] = i13;
            sparseIntArray.append(i13, dVar.c);
            i11++;
        }
        return iArr;
    }

    public void a(List list, o2.c cVar, int i10, int i11) {
        cVar.f4318m = i11;
        ((o2.a) this.c).b(cVar);
        cVar.f4321p = i10;
        list.add(cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x01f9, code lost:
    
        if (r8 < (r9 + r14)) goto L100;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x039a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x039f A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x030a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(j.i r28, int r29, int r30, int r31, int r32, int r33, java.util.List r34) {
        /*
            Method dump skipped, instructions count: 942
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.s3.b(j.i, int, int, int, int, int, java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(int r7, android.view.View r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            o2.b r0 = (o2.b) r0
            int r1 = r8.getMeasuredWidth()
            int r2 = r8.getMeasuredHeight()
            int r3 = r0.c()
            r4 = 1
            if (r1 >= r3) goto L1b
            int r1 = r0.c()
        L19:
            r3 = r4
            goto L27
        L1b:
            int r3 = r0.p()
            if (r1 <= r3) goto L26
            int r1 = r0.p()
            goto L19
        L26:
            r3 = 0
        L27:
            int r5 = r0.m()
            if (r2 >= r5) goto L32
            int r2 = r0.m()
            goto L3e
        L32:
            int r5 = r0.o()
            if (r2 <= r5) goto L3d
            int r2 = r0.o()
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 == 0) goto L57
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r8.measure(r1, r0)
            r6.x(r8, r7, r1, r0)
            java.lang.Object r0 = r6.c
            o2.a r0 = (o2.a) r0
            r0.e(r7, r8)
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.s3.c(int, android.view.View):void");
    }

    public void d(int i10, List list) {
        int i11 = ((int[]) this.e)[i10];
        if (i11 == -1) {
            i11 = 0;
        }
        if (list.size() > i11) {
            list.subList(i11, list.size()).clear();
        }
        int[] iArr = (int[]) this.e;
        int length = iArr.length - 1;
        if (i10 > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i10, length, -1);
        }
        long[] jArr = (long[]) this.f2029f;
        int length2 = jArr.length - 1;
        if (i10 > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i10, length2, 0L);
        }
    }

    public void e() {
        TransportService.b((Closeable) this.d);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, o2.d] */
    public ArrayList g(int i10) {
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            o2.b bVar = (o2.b) ((o2.a) this.c).f(i11).getLayoutParams();
            ?? obj = new Object();
            obj.c = bVar.getOrder();
            obj.f4323b = i11;
            arrayList.add(obj);
        }
        return arrayList;
    }

    @Override // t8.a
    public Object get() {
        switch (this.f2028b) {
            case 2:
                a2.c cVar = (a2.c) ((e5.c) this.c).c;
                ((g5.a) this.d).get();
                ((h5.a) this.e).get();
                ((g5.a) this.f2029f).get();
                Executor executor = (Executor) ((g5.a) this.f2030g).get();
                a2.a aVar = new a2.a("proto");
                Set set = ((d2.r) cVar).f1756a;
                if (set.contains(aVar)) {
                    return new f5.v(executor);
                }
                n0.b.v("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{aVar, set});
                return null;
            default:
                Executor executor2 = (Executor) ((t8.a) this.c).get();
                ((a5.h) this.e).get();
                return new i2.a(executor2);
        }
    }

    public void h(int i10, int i11, int i12) {
        int mode;
        int size;
        o2.a aVar = (o2.a) this.c;
        int flexDirection = aVar.getFlexDirection();
        if (flexDirection != 0 && flexDirection != 1) {
            if (flexDirection != 2 && flexDirection != 3) {
                j1.i.k(ai.onnxruntime.a.e(flexDirection, "Invalid flex direction: "));
                return;
            } else {
                mode = View.MeasureSpec.getMode(i10);
                size = View.MeasureSpec.getSize(i10);
            }
        } else {
            mode = View.MeasureSpec.getMode(i11);
            size = View.MeasureSpec.getSize(i11);
        }
        List<o2.c> flexLinesInternal = aVar.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = aVar.getSumOfCrossSize() + i12;
            int i13 = 0;
            if (flexLinesInternal.size() == 1) {
                ((o2.c) flexLinesInternal.get(0)).f4312g = size - i12;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = aVar.getAlignContent();
                if (alignContent != 1) {
                    if (alignContent != 2) {
                        if (alignContent != 3) {
                            if (alignContent != 4) {
                                if (alignContent == 5 && sumOfCrossSize < size) {
                                    float size2 = (size - sumOfCrossSize) / flexLinesInternal.size();
                                    int size3 = flexLinesInternal.size();
                                    float f8 = 0.0f;
                                    while (i13 < size3) {
                                        o2.c cVar = (o2.c) flexLinesInternal.get(i13);
                                        float f10 = cVar.f4312g + size2;
                                        if (i13 == flexLinesInternal.size() - 1) {
                                            f10 += f8;
                                            f8 = 0.0f;
                                        }
                                        int round = Math.round(f10);
                                        float f11 = (f10 - round) + f8;
                                        if (f11 > 1.0f) {
                                            round++;
                                            f11 -= 1.0f;
                                        } else if (f11 < -1.0f) {
                                            round--;
                                            f11 += 1.0f;
                                        }
                                        f8 = f11;
                                        cVar.f4312g = round;
                                        i13++;
                                    }
                                    return;
                                }
                                return;
                            }
                            if (sumOfCrossSize >= size) {
                                aVar.setFlexLines(f(flexLinesInternal, size, sumOfCrossSize));
                                return;
                            }
                            int size4 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                            ArrayList arrayList = new ArrayList();
                            o2.c cVar2 = new o2.c();
                            cVar2.f4312g = size4;
                            for (o2.c cVar3 : flexLinesInternal) {
                                arrayList.add(cVar2);
                                arrayList.add(cVar3);
                                arrayList.add(cVar2);
                            }
                            aVar.setFlexLines(arrayList);
                            return;
                        }
                        if (sumOfCrossSize < size) {
                            float size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                            ArrayList arrayList2 = new ArrayList();
                            int size6 = flexLinesInternal.size();
                            float f12 = 0.0f;
                            while (i13 < size6) {
                                arrayList2.add((o2.c) flexLinesInternal.get(i13));
                                if (i13 != flexLinesInternal.size() - 1) {
                                    o2.c cVar4 = new o2.c();
                                    if (i13 == flexLinesInternal.size() - 2) {
                                        cVar4.f4312g = Math.round(f12 + size5);
                                        f12 = 0.0f;
                                    } else {
                                        cVar4.f4312g = Math.round(size5);
                                    }
                                    int i14 = cVar4.f4312g;
                                    float f13 = (size5 - i14) + f12;
                                    if (f13 > 1.0f) {
                                        cVar4.f4312g = i14 + 1;
                                        f13 -= 1.0f;
                                    } else if (f13 < -1.0f) {
                                        cVar4.f4312g = i14 - 1;
                                        f13 += 1.0f;
                                    }
                                    f12 = f13;
                                    arrayList2.add(cVar4);
                                }
                                i13++;
                            }
                            aVar.setFlexLines(arrayList2);
                            return;
                        }
                        return;
                    }
                    aVar.setFlexLines(f(flexLinesInternal, size, sumOfCrossSize));
                    return;
                }
                o2.c cVar5 = new o2.c();
                cVar5.f4312g = size - sumOfCrossSize;
                flexLinesInternal.add(0, cVar5);
            }
        }
    }

    public void i(int i10, int i11, int i12) {
        int size;
        int paddingLeft;
        int paddingRight;
        int i13;
        int i14;
        o2.a aVar = (o2.a) this.c;
        int flexItemCount = aVar.getFlexItemCount();
        boolean[] zArr = (boolean[]) this.d;
        int i15 = 0;
        if (zArr == null) {
            this.d = new boolean[Math.max(flexItemCount, 10)];
        } else if (zArr.length < flexItemCount) {
            this.d = new boolean[Math.max(zArr.length * 2, flexItemCount)];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i12 < aVar.getFlexItemCount()) {
            int flexDirection = aVar.getFlexDirection();
            int flexDirection2 = aVar.getFlexDirection();
            if (flexDirection2 != 0 && flexDirection2 != 1) {
                if (flexDirection2 != 2 && flexDirection2 != 3) {
                    j1.i.k(ai.onnxruntime.a.e(flexDirection, "Invalid flex direction: "));
                    return;
                }
                int mode = View.MeasureSpec.getMode(i11);
                size = View.MeasureSpec.getSize(i11);
                if (mode != 1073741824) {
                    size = aVar.getLargestMainSize();
                }
                paddingLeft = aVar.getPaddingTop();
                paddingRight = aVar.getPaddingBottom();
            } else {
                int mode2 = View.MeasureSpec.getMode(i10);
                size = View.MeasureSpec.getSize(i10);
                int largestMainSize = aVar.getLargestMainSize();
                if (mode2 != 1073741824) {
                    size = Math.min(largestMainSize, size);
                }
                paddingLeft = aVar.getPaddingLeft();
                paddingRight = aVar.getPaddingRight();
            }
            int i16 = paddingRight + paddingLeft;
            int i17 = size;
            int[] iArr = (int[]) this.e;
            if (iArr != null) {
                i15 = iArr[i12];
            }
            List flexLinesInternal = aVar.getFlexLinesInternal();
            int size2 = flexLinesInternal.size();
            while (i15 < size2) {
                o2.c cVar = (o2.c) flexLinesInternal.get(i15);
                int i18 = cVar.e;
                if (i18 < i17 && cVar.f4322q) {
                    i13 = i10;
                    i14 = i11;
                    m(i13, i14, cVar, i17, i16, false);
                } else {
                    i13 = i10;
                    i14 = i11;
                    if (i18 > i17 && cVar.r) {
                        s(i13, i14, cVar, i17, i16, false);
                    }
                }
                i15++;
                i10 = i13;
                i11 = i14;
            }
        }
    }

    public void j(int i10) {
        int[] iArr = (int[]) this.e;
        if (iArr == null) {
            this.e = new int[Math.max(i10, 10)];
        } else if (iArr.length < i10) {
            this.e = Arrays.copyOf((int[]) this.e, Math.max(iArr.length * 2, i10));
        }
    }

    public void k(int i10) {
        long[] jArr = (long[]) this.f2029f;
        if (jArr == null) {
            this.f2029f = new long[Math.max(i10, 10)];
        } else if (jArr.length < i10) {
            this.f2029f = Arrays.copyOf((long[]) this.f2029f, Math.max(jArr.length * 2, i10));
        }
    }

    public void l(int i10) {
        long[] jArr = (long[]) this.f2030g;
        if (jArr == null) {
            this.f2030g = new long[Math.max(i10, 10)];
        } else if (jArr.length < i10) {
            this.f2030g = Arrays.copyOf((long[]) this.f2030g, Math.max(jArr.length * 2, i10));
        }
    }

    public void m(int i10, int i11, o2.c cVar, int i12, int i13, boolean z9) {
        int i14;
        float f8;
        float f10;
        int i15;
        double d;
        double d10;
        o2.a aVar = (o2.a) this.c;
        float f11 = cVar.f4315j;
        float f12 = 0.0f;
        if (f11 > 0.0f && i12 >= (i14 = cVar.e)) {
            float f13 = (i12 - i14) / f11;
            cVar.e = i13 + cVar.f4311f;
            if (!z9) {
                cVar.f4312g = Integer.MIN_VALUE;
            }
            int i16 = 0;
            boolean z10 = false;
            int i17 = 0;
            float f14 = 0.0f;
            while (i16 < cVar.f4313h) {
                int i18 = cVar.f4320o + i16;
                View c = aVar.c(i18);
                if (c == null || c.getVisibility() == 8) {
                    f8 = f12;
                    f10 = f13;
                    z10 = z10;
                } else {
                    o2.b bVar = (o2.b) c.getLayoutParams();
                    int flexDirection = aVar.getFlexDirection();
                    f8 = f12;
                    if (flexDirection == 0 || flexDirection == 1) {
                        f10 = f13;
                        boolean z11 = z10;
                        int measuredWidth = c.getMeasuredWidth();
                        long[] jArr = (long[]) this.f2030g;
                        if (jArr != null) {
                            measuredWidth = (int) jArr[i18];
                        }
                        int measuredHeight = c.getMeasuredHeight();
                        long[] jArr2 = (long[]) this.f2030g;
                        if (jArr2 != null) {
                            measuredHeight = (int) (jArr2[i18] >> 32);
                        }
                        if (!((boolean[]) this.d)[i18] && bVar.j() > f8) {
                            float j10 = (bVar.j() * f10) + measuredWidth;
                            if (i16 == cVar.f4313h - 1) {
                                j10 += f14;
                                f14 = f8;
                            }
                            int round = Math.round(j10);
                            if (round > bVar.p()) {
                                round = bVar.p();
                                ((boolean[]) this.d)[i18] = true;
                                cVar.f4315j -= bVar.j();
                                z10 = true;
                            } else {
                                float f15 = (j10 - round) + f14;
                                double d11 = f15;
                                if (d11 > 1.0d) {
                                    round++;
                                    d = d11 - 1.0d;
                                } else {
                                    if (d11 < -1.0d) {
                                        round--;
                                        d = d11 + 1.0d;
                                    }
                                    f14 = f15;
                                    z10 = z11;
                                }
                                f15 = (float) d;
                                f14 = f15;
                                z10 = z11;
                            }
                            int n10 = n(i11, bVar, cVar.f4318m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, BasicMeasure.EXACTLY);
                            c.measure(makeMeasureSpec, n10);
                            int measuredWidth2 = c.getMeasuredWidth();
                            int measuredHeight2 = c.getMeasuredHeight();
                            x(c, i18, makeMeasureSpec, n10);
                            aVar.e(i18, c);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        } else {
                            z10 = z11;
                        }
                        int max = Math.max(i17, aVar.j(c) + bVar.f() + bVar.h() + measuredHeight);
                        cVar.e = bVar.l() + bVar.g() + measuredWidth + cVar.e;
                        i15 = max;
                    } else {
                        int measuredHeight3 = c.getMeasuredHeight();
                        long[] jArr3 = (long[]) this.f2030g;
                        if (jArr3 != null) {
                            measuredHeight3 = (int) (jArr3[i18] >> 32);
                        }
                        int measuredWidth3 = c.getMeasuredWidth();
                        long[] jArr4 = (long[]) this.f2030g;
                        if (jArr4 != null) {
                            measuredWidth3 = (int) jArr4[i18];
                        }
                        if (!((boolean[]) this.d)[i18] && bVar.j() > f8) {
                            float j11 = (bVar.j() * f13) + measuredHeight3;
                            if (i16 == cVar.f4313h - 1) {
                                j11 += f14;
                                f14 = f8;
                            }
                            int round2 = Math.round(j11);
                            if (round2 > bVar.o()) {
                                round2 = bVar.o();
                                ((boolean[]) this.d)[i18] = true;
                                cVar.f4315j -= bVar.j();
                                z10 = true;
                                f10 = f13;
                            } else {
                                float f16 = (j11 - round2) + f14;
                                f10 = f13;
                                boolean z12 = z10;
                                double d12 = f16;
                                if (d12 > 1.0d) {
                                    round2++;
                                    d10 = d12 - 1.0d;
                                } else {
                                    if (d12 < -1.0d) {
                                        round2--;
                                        d10 = d12 + 1.0d;
                                    }
                                    f14 = f16;
                                    z10 = z12;
                                }
                                f16 = (float) d10;
                                f14 = f16;
                                z10 = z12;
                            }
                            int o5 = o(i10, bVar, cVar.f4318m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, BasicMeasure.EXACTLY);
                            c.measure(o5, makeMeasureSpec2);
                            int measuredWidth4 = c.getMeasuredWidth();
                            int measuredHeight4 = c.getMeasuredHeight();
                            x(c, i18, o5, makeMeasureSpec2);
                            aVar.e(i18, c);
                            measuredWidth3 = measuredWidth4;
                            measuredHeight3 = measuredHeight4;
                        } else {
                            f10 = f13;
                            z10 = z10;
                        }
                        i15 = Math.max(i17, aVar.j(c) + bVar.l() + bVar.g() + measuredWidth3);
                        cVar.e = bVar.f() + bVar.h() + measuredHeight3 + cVar.e;
                    }
                    cVar.f4312g = Math.max(cVar.f4312g, i15);
                    i17 = i15;
                }
                i16++;
                f12 = f8;
                f13 = f10;
            }
            if (z10 && i14 != cVar.e) {
                m(i10, i11, cVar, i12, i13, true);
            }
        }
    }

    public int n(int i10, o2.b bVar, int i11) {
        o2.a aVar = (o2.a) this.c;
        int h2 = aVar.h(i10, bVar.f() + bVar.h() + aVar.getPaddingBottom() + aVar.getPaddingTop() + i11, bVar.getHeight());
        int size = View.MeasureSpec.getSize(h2);
        if (size > bVar.o()) {
            return View.MeasureSpec.makeMeasureSpec(bVar.o(), View.MeasureSpec.getMode(h2));
        }
        if (size < bVar.m()) {
            return View.MeasureSpec.makeMeasureSpec(bVar.m(), View.MeasureSpec.getMode(h2));
        }
        return h2;
    }

    public int o(int i10, o2.b bVar, int i11) {
        o2.a aVar = (o2.a) this.c;
        int d = aVar.d(i10, bVar.l() + bVar.g() + aVar.getPaddingRight() + aVar.getPaddingLeft() + i11, bVar.d());
        int size = View.MeasureSpec.getSize(d);
        if (size > bVar.p()) {
            return View.MeasureSpec.makeMeasureSpec(bVar.p(), View.MeasureSpec.getMode(d));
        }
        if (size < bVar.c()) {
            return View.MeasureSpec.makeMeasureSpec(bVar.c(), View.MeasureSpec.getMode(d));
        }
        return d;
    }

    public void p(View view, o2.c cVar, int i10, int i11, int i12, int i13) {
        o2.b bVar = (o2.b) view.getLayoutParams();
        o2.a aVar = (o2.a) this.c;
        int alignItems = aVar.getAlignItems();
        if (bVar.a() != -1) {
            alignItems = bVar.a();
        }
        int i14 = cVar.f4312g;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems != 2) {
                    if (alignItems != 3) {
                        if (alignItems != 4) {
                            return;
                        }
                    } else {
                        int flexWrap = aVar.getFlexWrap();
                        int i15 = cVar.f4317l;
                        if (flexWrap != 2) {
                            int max = Math.max(i15 - view.getBaseline(), bVar.h());
                            view.layout(i10, i11 + max, i12, i13 + max);
                            return;
                        } else {
                            int max2 = Math.max(view.getBaseline() + (i15 - view.getMeasuredHeight()), bVar.f());
                            view.layout(i10, i11 - max2, i12, i13 - max2);
                            return;
                        }
                    }
                } else {
                    int h2 = ((bVar.h() + (i14 - view.getMeasuredHeight())) - bVar.f()) / 2;
                    if (aVar.getFlexWrap() != 2) {
                        int i16 = i11 + h2;
                        view.layout(i10, i16, i12, view.getMeasuredHeight() + i16);
                        return;
                    } else {
                        int i17 = i11 - h2;
                        view.layout(i10, i17, i12, view.getMeasuredHeight() + i17);
                        return;
                    }
                }
            } else {
                if (aVar.getFlexWrap() != 2) {
                    int i18 = i11 + i14;
                    view.layout(i10, (i18 - view.getMeasuredHeight()) - bVar.f(), i12, i18 - bVar.f());
                    return;
                }
                view.layout(i10, bVar.h() + view.getMeasuredHeight() + (i11 - i14), i12, bVar.h() + view.getMeasuredHeight() + (i13 - i14));
                return;
            }
        }
        if (aVar.getFlexWrap() != 2) {
            view.layout(i10, bVar.h() + i11, i12, bVar.h() + i13);
        } else {
            view.layout(i10, i11 - bVar.f(), i12, i13 - bVar.f());
        }
    }

    public void q(View view, o2.c cVar, boolean z9, int i10, int i11, int i12, int i13) {
        o2.b bVar = (o2.b) view.getLayoutParams();
        int alignItems = ((o2.a) this.c).getAlignItems();
        if (bVar.a() != -1) {
            alignItems = bVar.a();
        }
        int i14 = cVar.f4312g;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems != 2) {
                    if (alignItems != 3 && alignItems != 4) {
                        return;
                    }
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int marginStart = ((MarginLayoutParamsCompat.getMarginStart(marginLayoutParams) + (i14 - view.getMeasuredWidth())) - MarginLayoutParamsCompat.getMarginEnd(marginLayoutParams)) / 2;
                    if (!z9) {
                        view.layout(i10 + marginStart, i11, i12 + marginStart, i13);
                        return;
                    } else {
                        view.layout(i10 - marginStart, i11, i12 - marginStart, i13);
                        return;
                    }
                }
            } else {
                if (!z9) {
                    view.layout(((i10 + i14) - view.getMeasuredWidth()) - bVar.l(), i11, ((i12 + i14) - view.getMeasuredWidth()) - bVar.l(), i13);
                    return;
                }
                view.layout(bVar.g() + view.getMeasuredWidth() + (i10 - i14), i11, bVar.g() + view.getMeasuredWidth() + (i12 - i14), i13);
                return;
            }
        }
        if (!z9) {
            view.layout(bVar.g() + i10, i11, bVar.g() + i12, i13);
        } else {
            view.layout(i10 - bVar.l(), i11, i12 - bVar.l(), i13);
        }
    }

    public void r(String str) {
        synchronized (this.f2030g) {
            ((BufferedWriter) this.f2029f).write(str);
            ((BufferedWriter) this.f2029f).newLine();
            ((BufferedWriter) this.f2029f).flush();
        }
    }

    public void s(int i10, int i11, o2.c cVar, int i12, int i13, boolean z9) {
        float f8;
        float f10;
        boolean z10;
        int i14;
        int i15;
        boolean z11;
        int i16;
        float f11;
        o2.a aVar = (o2.a) this.c;
        int i17 = cVar.e;
        float f12 = cVar.f4316k;
        float f13 = 0.0f;
        if (f12 > 0.0f && i12 <= i17) {
            float f14 = (i17 - i12) / f12;
            cVar.e = i13 + cVar.f4311f;
            if (!z9) {
                cVar.f4312g = Integer.MIN_VALUE;
            }
            int i18 = 0;
            boolean z12 = false;
            int i19 = 0;
            float f15 = 0.0f;
            while (i18 < cVar.f4313h) {
                int i20 = cVar.f4320o + i18;
                View c = aVar.c(i20);
                if (c == null || c.getVisibility() == 8) {
                    f8 = f13;
                    f10 = f14;
                    z10 = z12;
                    i14 = i18;
                } else {
                    o2.b bVar = (o2.b) c.getLayoutParams();
                    int flexDirection = aVar.getFlexDirection();
                    f8 = f13;
                    if (flexDirection == 0 || flexDirection == 1) {
                        f10 = f14;
                        z10 = z12;
                        int measuredWidth = c.getMeasuredWidth();
                        long[] jArr = (long[]) this.f2030g;
                        if (jArr != null) {
                            measuredWidth = (int) jArr[i20];
                        }
                        int measuredHeight = c.getMeasuredHeight();
                        long[] jArr2 = (long[]) this.f2030g;
                        if (jArr2 != null) {
                            measuredHeight = (int) (jArr2[i20] >> 32);
                        }
                        if (!((boolean[]) this.d)[i20] && bVar.b() > f8) {
                            float b10 = measuredWidth - (bVar.b() * f10);
                            if (i18 == cVar.f4313h - 1) {
                                b10 += f15;
                                f15 = f8;
                            }
                            int round = Math.round(b10);
                            if (round < bVar.c()) {
                                round = bVar.c();
                                ((boolean[]) this.d)[i20] = true;
                                cVar.f4316k -= bVar.b();
                                z10 = true;
                                i14 = i18;
                            } else {
                                float f16 = (b10 - round) + f15;
                                i14 = i18;
                                double d = f16;
                                if (d > 1.0d) {
                                    round++;
                                    f16 -= 1.0f;
                                } else if (d < -1.0d) {
                                    round--;
                                    f16 += 1.0f;
                                }
                                f15 = f16;
                            }
                            int n10 = n(i11, bVar, cVar.f4318m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, BasicMeasure.EXACTLY);
                            c.measure(makeMeasureSpec, n10);
                            int measuredWidth2 = c.getMeasuredWidth();
                            int measuredHeight2 = c.getMeasuredHeight();
                            x(c, i20, makeMeasureSpec, n10);
                            aVar.e(i20, c);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        } else {
                            i14 = i18;
                        }
                        int max = Math.max(i19, aVar.j(c) + bVar.f() + bVar.h() + measuredHeight);
                        cVar.e = bVar.l() + bVar.g() + measuredWidth + cVar.e;
                        i15 = max;
                    } else {
                        int measuredHeight3 = c.getMeasuredHeight();
                        long[] jArr3 = (long[]) this.f2030g;
                        if (jArr3 != null) {
                            f10 = f14;
                            measuredHeight3 = (int) (jArr3[i20] >> 32);
                        } else {
                            f10 = f14;
                        }
                        int measuredWidth3 = c.getMeasuredWidth();
                        long[] jArr4 = (long[]) this.f2030g;
                        if (jArr4 != null) {
                            measuredWidth3 = (int) jArr4[i20];
                        }
                        if (!((boolean[]) this.d)[i20] && bVar.b() > f8) {
                            float b11 = measuredHeight3 - (bVar.b() * f10);
                            if (i18 == cVar.f4313h - 1) {
                                b11 += f15;
                                f15 = f8;
                            }
                            int round2 = Math.round(b11);
                            if (round2 < bVar.m()) {
                                i16 = bVar.m();
                                ((boolean[]) this.d)[i20] = true;
                                cVar.f4316k -= bVar.b();
                                z11 = true;
                            } else {
                                float f17 = (b11 - round2) + f15;
                                boolean z13 = z12;
                                double d10 = f17;
                                if (d10 > 1.0d) {
                                    i16 = round2 + 1;
                                    f11 = f17 - 1.0f;
                                } else if (d10 < -1.0d) {
                                    i16 = round2 - 1;
                                    f11 = f17 + 1.0f;
                                } else {
                                    i16 = round2;
                                    z11 = z13;
                                    f15 = f17;
                                }
                                f15 = f11;
                                z11 = z13;
                            }
                            int o5 = o(i10, bVar, cVar.f4318m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i16, BasicMeasure.EXACTLY);
                            c.measure(o5, makeMeasureSpec2);
                            int measuredWidth4 = c.getMeasuredWidth();
                            int measuredHeight4 = c.getMeasuredHeight();
                            x(c, i20, o5, makeMeasureSpec2);
                            aVar.e(i20, c);
                            measuredWidth3 = measuredWidth4;
                            measuredHeight3 = measuredHeight4;
                        } else {
                            z11 = z12;
                        }
                        i15 = Math.max(i19, aVar.j(c) + bVar.l() + bVar.g() + measuredWidth3);
                        cVar.e = bVar.f() + bVar.h() + measuredHeight3 + cVar.e;
                        z10 = z11;
                        i14 = i18;
                    }
                    cVar.f4312g = Math.max(cVar.f4312g, i15);
                    i19 = i15;
                }
                i18 = i14 + 1;
                f13 = f8;
                z12 = z10;
                f14 = f10;
            }
            if (z12 && i17 != cVar.e) {
                s(i10, i11, cVar, i12, i13, true);
            }
        }
    }

    public void u(View view, int i10, int i11) {
        int measuredHeight;
        o2.b bVar = (o2.b) view.getLayoutParams();
        int g10 = (i10 - bVar.g()) - bVar.l();
        o2.a aVar = (o2.a) this.c;
        int min = Math.min(Math.max(g10 - aVar.j(view), bVar.c()), bVar.p());
        long[] jArr = (long[]) this.f2030g;
        if (jArr != null) {
            measuredHeight = (int) (jArr[i11] >> 32);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, BasicMeasure.EXACTLY);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, BasicMeasure.EXACTLY);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        x(view, i11, makeMeasureSpec2, makeMeasureSpec);
        aVar.e(i11, view);
    }

    public void v(View view, int i10, int i11) {
        int measuredWidth;
        o2.b bVar = (o2.b) view.getLayoutParams();
        int h2 = (i10 - bVar.h()) - bVar.f();
        o2.a aVar = (o2.a) this.c;
        int min = Math.min(Math.max(h2 - aVar.j(view), bVar.m()), bVar.o());
        long[] jArr = (long[]) this.f2030g;
        if (jArr != null) {
            measuredWidth = (int) jArr[i11];
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, BasicMeasure.EXACTLY);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, BasicMeasure.EXACTLY);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        x(view, i11, makeMeasureSpec, makeMeasureSpec2);
        aVar.e(i11, view);
    }

    public void w(int i10) {
        int i11;
        View c;
        o2.a aVar = (o2.a) this.c;
        if (i10 < aVar.getFlexItemCount()) {
            int flexDirection = aVar.getFlexDirection();
            if (aVar.getAlignItems() == 4) {
                int[] iArr = (int[]) this.e;
                if (iArr != null) {
                    i11 = iArr[i10];
                } else {
                    i11 = 0;
                }
                List flexLinesInternal = aVar.getFlexLinesInternal();
                int size = flexLinesInternal.size();
                while (i11 < size) {
                    o2.c cVar = (o2.c) flexLinesInternal.get(i11);
                    int i12 = cVar.f4313h;
                    for (int i13 = 0; i13 < i12; i13++) {
                        int i14 = cVar.f4320o + i13;
                        if (i13 < aVar.getFlexItemCount() && (c = aVar.c(i14)) != null && c.getVisibility() != 8) {
                            o2.b bVar = (o2.b) c.getLayoutParams();
                            if (bVar.a() == -1 || bVar.a() == 4) {
                                if (flexDirection != 0 && flexDirection != 1) {
                                    if (flexDirection != 2 && flexDirection != 3) {
                                        j1.i.k(ai.onnxruntime.a.e(flexDirection, "Invalid flex direction: "));
                                        return;
                                    }
                                    u(c, cVar.f4312g, i14);
                                } else {
                                    v(c, cVar.f4312g, i14);
                                }
                            }
                        }
                    }
                    i11++;
                }
                return;
            }
            for (o2.c cVar2 : aVar.getFlexLinesInternal()) {
                ArrayList arrayList = cVar2.f4319n;
                int size2 = arrayList.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    Integer num = (Integer) obj;
                    View c10 = aVar.c(num.intValue());
                    if (flexDirection != 0 && flexDirection != 1) {
                        if (flexDirection != 2 && flexDirection != 3) {
                            j1.i.k(ai.onnxruntime.a.e(flexDirection, "Invalid flex direction: "));
                            return;
                        }
                        u(c10, cVar2.f4312g, num.intValue());
                    } else {
                        v(c10, cVar2.f4312g, num.intValue());
                    }
                }
            }
        }
    }

    public void x(View view, int i10, int i11, int i12) {
        long[] jArr = (long[]) this.f2029f;
        if (jArr != null) {
            jArr[i10] = (i11 & 4294967295L) | (i12 << 32);
        }
        long[] jArr2 = (long[]) this.f2030g;
        if (jArr2 != null) {
            jArr2[i10] = (view.getMeasuredWidth() & 4294967295L) | (view.getMeasuredHeight() << 32);
        }
    }

    public s3(h5.a aVar, e5.c cVar, g5.a aVar2, h5.a aVar3, z3.f fVar, g5.a aVar4, g5.a aVar5) {
        this.f2028b = 2;
        this.c = cVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f2029f = aVar4;
        this.f2030g = aVar5;
    }

    public s3(o2.a aVar) {
        this.f2028b = 4;
        this.c = aVar;
    }

    public /* synthetic */ s3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f2028b = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f2029f = obj4;
        this.f2030g = obj5;
    }

    public s3(String str, Closeable closeable, BufferedReader bufferedReader, BufferedWriter bufferedWriter) {
        this.f2028b = 5;
        this.f2030g = new Object();
        this.c = str;
        this.d = closeable;
        this.e = bufferedReader;
        this.f2029f = bufferedWriter;
    }
}
