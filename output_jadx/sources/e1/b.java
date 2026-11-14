package e1;

import com.example.navistart.cores.HUDMassageObj;
import com.google.protobuf.q;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b {
    public static HUDMassageObj a(a6.a aVar) {
        int i10 = aVar.f52b;
        int i11 = aVar.c;
        String str = " ";
        int i12 = 0;
        if (aVar.f51a && i10 > 0) {
            HUDMassageObj hUDMassageObj = new HUDMassageObj();
            hUDMassageObj.AradarOn = Boolean.TRUE;
            hUDMassageObj.hudSenderType = HUDMassageObj.HudSenderType.ARAD;
            hUDMassageObj.aradarSenderType = HUDMassageObj.AradarSenderType.HUDSPEED;
            hUDMassageObj.v_mTurnType = 14;
            hUDMassageObj.v_mRemainDis = i10;
            if (i11 > 0) {
                i12 = i11 * 1000;
            }
            hUDMassageObj.v_mTurnDis = i12;
            String str2 = (String) aVar.e;
            String str3 = (String) aVar.d;
            if (i11 > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(i11);
                str = q.i(new byte[]{-71, -23, 34, 57}, new byte[]{-46, -124, 13, 81, 70, -121, -25, 79}, sb);
            } else if (!str3.isEmpty()) {
                str = str3;
            } else if (!str2.isEmpty()) {
                str = str2;
            }
            hUDMassageObj.v_mNextRoad = str;
            hUDMassageObj.setspeedlimit(i11);
            return hUDMassageObj;
        }
        HUDMassageObj hUDMassageObj2 = new HUDMassageObj();
        hUDMassageObj2.AradarOn = Boolean.FALSE;
        hUDMassageObj2.hudSenderType = HUDMassageObj.HudSenderType.ARAD;
        hUDMassageObj2.aradarSenderType = HUDMassageObj.AradarSenderType.HUDSPEED;
        hUDMassageObj2.v_mTurnType = -1;
        hUDMassageObj2.v_mTurnDis = 0;
        hUDMassageObj2.v_mRemainDis = 0;
        hUDMassageObj2.v_mNextRoad = " ";
        hUDMassageObj2.setspeedlimit(0);
        return hUDMassageObj2;
    }
}
