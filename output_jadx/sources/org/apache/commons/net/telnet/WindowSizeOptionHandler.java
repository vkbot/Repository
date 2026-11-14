package org.apache.commons.net.telnet;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class WindowSizeOptionHandler extends TelnetOptionHandler {
    protected static final int WINDOW_SIZE = 31;
    private int height;
    private int width;

    public WindowSizeOptionHandler(int i10, int i11) {
        super(31, false, false, false, false);
        this.width = i10;
        this.height = i11;
    }

    @Override // org.apache.commons.net.telnet.TelnetOptionHandler
    public int[] startSubnegotiationLocal() {
        int i10;
        int i11 = this.width;
        int i12 = this.height;
        int i13 = (65536 * i11) + i12;
        if (i11 % 256 == 255) {
            i10 = 6;
        } else {
            i10 = 5;
        }
        if (i11 / 256 == 255) {
            i10++;
        }
        if (i12 % 256 == 255) {
            i10++;
        }
        if (i12 / 256 == 255) {
            i10++;
        }
        int[] iArr = new int[i10];
        iArr[0] = 31;
        int i14 = 24;
        int i15 = 1;
        while (i15 < i10) {
            int i16 = ((255 << i14) & i13) >>> i14;
            iArr[i15] = i16;
            if (i16 == 255) {
                i15++;
                iArr[i15] = 255;
            }
            i15++;
            i14 -= 8;
        }
        return iArr;
    }

    public WindowSizeOptionHandler(int i10, int i11, boolean z9, boolean z10, boolean z11, boolean z12) {
        super(31, z9, z10, z11, z12);
        this.width = i10;
        this.height = i11;
    }
}
