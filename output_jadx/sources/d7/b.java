package d7;

import android.bluetooth.BluetoothSocket;
import com.example.navistart.Transport.TransportService;
import f5.g;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1853b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(int i10, Object obj) {
        this.f1853b = i10;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i10 = this.f1853b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                return ((LinkedBlockingQueue) obj).peek();
            case 1:
                return ((g) obj).d;
            default:
                String str = TransportService.f914p;
                ((BluetoothSocket) obj).connect();
                return null;
        }
    }
}
