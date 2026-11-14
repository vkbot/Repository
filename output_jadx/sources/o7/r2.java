package o7;

import java.io.OutputStream;
import java.util.ArrayList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class r2 extends OutputStream {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4689b = new ArrayList();
    public p7.u c;
    public final /* synthetic */ t2 d;

    public r2(t2 t2Var) {
        this.d = t2Var;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        c5.e eVar = this.d.f4720g;
        p7.u uVar = this.c;
        ArrayList arrayList = this.f4689b;
        if (uVar == null) {
            eVar.getClass();
            p7.u o5 = c5.e.o(i11);
            this.c = o5;
            arrayList.add(o5);
        }
        while (i11 > 0) {
            int min = Math.min(i11, this.c.f5108b);
            p7.u uVar2 = this.c;
            if (min == 0) {
                int max = Math.max(i11, uVar2.c * 2);
                eVar.getClass();
                p7.u o9 = c5.e.o(max);
                this.c = o9;
                arrayList.add(o9);
            } else {
                uVar2.a(bArr, i10, min);
                i10 += min;
                i11 -= min;
            }
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i10) {
        p7.u uVar = this.c;
        if (uVar != null && uVar.f5108b > 0) {
            uVar.f5107a.m0((byte) i10);
            uVar.f5108b--;
            uVar.c++;
            return;
        }
        write(new byte[]{(byte) i10}, 0, 1);
    }
}
