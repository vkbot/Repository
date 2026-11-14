package alfusos.rpc;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class RpcManager {

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class Holder {
        static RpcManager mInstance = new RpcManager();

        private Holder() {
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public interface OnRpcListener {
        void onCallback(int i10, byte[] bArr);
    }

    public static RpcManager getInstance() {
        return Holder.mInstance;
    }

    public byte[] getMessage(int i10, byte[] bArr) {
        return new byte[0];
    }

    public boolean sendMessage(int i10, byte[] bArr) {
        return false;
    }

    public void registerListener(int i10, byte b10, OnRpcListener onRpcListener) {
    }
}
