package m7;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.RecyclerView;
import com.example.navistart.R;
import com.google.protobuf.q;
import e0.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.io.encoding.Base64;
import m0.v2;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    public List f3953a;

    /* renamed from: b, reason: collision with root package name */
    public List f3954b;
    public String c;
    public final b d;
    public final b e;

    public f(ArrayList arrayList, List list, String str, b bVar, b bVar2) {
        this.f3953a = arrayList == null ? new ArrayList() : arrayList;
        this.f3954b = list == null ? new ArrayList() : list;
        this.c = str == null ? "" : str;
        this.d = bVar;
        this.e = bVar2;
    }

    public final void a(List list, List list2, String str) {
        if (list == null) {
            list = new ArrayList();
        }
        this.f3953a = list;
        if (list2 == null) {
            list2 = new ArrayList();
        }
        this.f3954b = list2;
        if (str == null) {
            str = "";
        }
        this.c = str;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List list = this.f3953a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        String str;
        e eVar = (e) viewHolder;
        ScanResult scanResult = (ScanResult) this.f3953a.get(i10);
        eVar.f3951a.setText(scanResult.SSID);
        eVar.c.setText(eVar.itemView.getContext().getString(R.string.wifi_signal_level, Integer.valueOf(WifiManager.calculateSignalLevel(scanResult.level, TypedValues.TYPE_TARGET)), Integer.valueOf(scanResult.level)));
        StringBuilder sb = new StringBuilder();
        int i11 = 1;
        sb.append(m.h(new byte[]{24}, new byte[]{58, -60, -28, 68, Base64.padSymbol, -98, 65, -100}));
        sb.append(scanResult.SSID);
        if (q.i(new byte[]{103}, new byte[]{69, -126, 105, -18, 36, -1, 16, 105}, sb).equals(this.c)) {
            str = m.h(new byte[]{23, 27, -50, 125, 112, -59, -82, 28, 48}, new byte[]{84, 116, -96, 19, 21, -90, -38, 121});
        } else {
            Iterator it = this.f3954b.iterator();
            while (true) {
                if (it.hasNext()) {
                    String str2 = ((WifiConfiguration) it.next()).SSID;
                    if (str2 != null) {
                        if (str2.equals(m.h(new byte[]{-6}, new byte[]{-40, -70, -8, 30, -99, 20, -2, -109}) + scanResult.SSID + m.h(new byte[]{110}, new byte[]{76, -58, -26, -102, 34, 90, -89, 4}))) {
                            str = m.h(new byte[]{8, 49, -118, -112}, new byte[]{91, 80, -4, -11, -23, -82, -92, -54});
                            break;
                        }
                    }
                } else {
                    str = "";
                    break;
                }
            }
        }
        eVar.f3952b.setText(str);
        eVar.itemView.setOnClickListener(new androidx.navigation.ui.a(17, this, scanResult));
        eVar.itemView.setOnLongClickListener(new v2(this, scanResult, i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new e(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_wifi, viewGroup, false));
    }
}
