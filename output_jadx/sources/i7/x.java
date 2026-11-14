package i7;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.location.LocationRequestCompat;
import com.example.navistart.R;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public int f2837a;

    /* renamed from: b, reason: collision with root package name */
    public double f2838b;
    public double c;
    public int d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f2839f;

    /* renamed from: g, reason: collision with root package name */
    public int f2840g;

    /* renamed from: h, reason: collision with root package name */
    public int f2841h;

    /* renamed from: i, reason: collision with root package name */
    public int f2842i;

    public final String a() {
        int i10 = this.d;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 11) {
                                switch (i10) {
                                    case 20:
                                        return h0.b.h().getString(R.string.cam_type_20);
                                    case 21:
                                        return h0.b.h().getString(R.string.cam_type_21);
                                    case 22:
                                        return h0.b.h().getString(R.string.cam_type_22);
                                    default:
                                        switch (i10) {
                                            case 100:
                                                return h0.b.h().getString(R.string.cam_type_100);
                                            case TypedValues.TYPE_TARGET /* 101 */:
                                                return h0.b.h().getString(R.string.cam_type_101);
                                            case LocationRequestCompat.QUALITY_BALANCED_POWER_ACCURACY /* 102 */:
                                                return h0.b.h().getString(R.string.cam_type_102);
                                            case 103:
                                                return h0.b.h().getString(R.string.cam_type_103);
                                            case LocationRequestCompat.QUALITY_LOW_POWER /* 104 */:
                                                return h0.b.h().getString(R.string.cam_type_104);
                                            case 105:
                                                return h0.b.h().getString(R.string.cam_type_105);
                                            case 106:
                                                return h0.b.h().getString(R.string.cam_type_106);
                                            case 107:
                                                return h0.b.h().getString(R.string.cam_type_107);
                                            default:
                                                return h0.b.h().getString(R.string.cam_type_non);
                                        }
                                }
                            }
                            return h0.b.h().getString(R.string.cam_type_11);
                        }
                        return h0.b.h().getString(R.string.cam_type_5);
                    }
                    return h0.b.h().getString(R.string.cam_type_4);
                }
                return h0.b.h().getString(R.string.cam_type_3);
            }
            return h0.b.h().getString(R.string.cam_type_2);
        }
        return h0.b.h().getString(R.string.cam_type_1);
    }

    public final String toString() {
        return e0.m.h(new byte[]{0, -16, -52, 53, 109, -59, -79, -10, 54, -24, -56, 48, ByteCompanionObject.MAX_VALUE, -41, -69, -35, 44, -65}, new byte[]{84, -126, -83, 83, 11, -84, -46, -71}) + this.f2837a + e0.m.h(new byte[]{-15, 20, 101, -2, -120, 7, 93, 78, -71, 81, 52}, new byte[]{-35, 52, 9, -97, -4, 110, 41, 59}) + this.f2838b + e0.m.h(new byte[]{-55, -58, -40, -26, 33, 124, -46, 0, -112, -126, -47, -76}, new byte[]{-27, -26, -76, -119, 79, 27, -69, 116}) + this.c + e0.m.h(new byte[]{126, 80, 19, 125, -3, 23, 36}, new byte[]{82, 112, 103, 4, -115, 114, 25, 65}) + this.d + e0.m.h(new byte[]{-114, 108}, new byte[]{-82, 68, 52, -97, -120, 102, -34, 93}) + a() + e0.m.h(new byte[]{118, -108, -35, 113, 60, -34, 52, 25, 98}, new byte[]{95, -72, -3, 2, 76, -69, 81, 125}) + this.e + e0.m.h(new byte[]{103, -98, 33, -6, 78, 122, -125, 105, 46, -125}, new byte[]{75, -66, 69, -109, 60, 46, -6, 25}) + this.f2839f + e0.m.h(new byte[]{62, -105, -50, -77, 45, -58, 91, -9, 123, -40, -60, -25}, new byte[]{18, -73, -86, -38, 95, -93, 56, -125}) + this.f2840g + e0.m.h(new byte[]{91, 115, 51, ByteCompanionObject.MIN_VALUE, 15, -115, 47, -116, 20, 54, 106}, new byte[]{119, 83, 87, -23, 124, -7, 78, -30}) + this.f2841h + e0.m.h(new byte[]{-1, 121, -10, 111, 99, -65, -68, 26}, new byte[]{-45, 89, -105, 1, 4, -45, -39, 39}) + this.f2842i + '}';
    }
}
