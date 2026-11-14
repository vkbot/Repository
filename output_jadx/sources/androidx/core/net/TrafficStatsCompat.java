package androidx.core.net;

import android.net.TrafficStats;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.net.DatagramSocket;
import java.net.Socket;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class TrafficStatsCompat {

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @RequiresApi(24)
    /* loaded from: classes.dex */
    public static class Api24Impl {
        private Api24Impl() {
        }

        @DoNotInline
        public static void tagDatagramSocket(DatagramSocket datagramSocket) {
            TrafficStats.tagDatagramSocket(datagramSocket);
        }

        @DoNotInline
        public static void untagDatagramSocket(DatagramSocket datagramSocket) {
            TrafficStats.untagDatagramSocket(datagramSocket);
        }
    }

    private TrafficStatsCompat() {
    }

    @Deprecated
    public static void clearThreadStatsTag() {
        TrafficStats.clearThreadStatsTag();
    }

    @Deprecated
    public static int getThreadStatsTag() {
        return TrafficStats.getThreadStatsTag();
    }

    @Deprecated
    public static void incrementOperationCount(int i10) {
        TrafficStats.incrementOperationCount(i10);
    }

    @Deprecated
    public static void setThreadStatsTag(int i10) {
        TrafficStats.setThreadStatsTag(i10);
    }

    public static void tagDatagramSocket(@NonNull DatagramSocket datagramSocket) {
        Api24Impl.tagDatagramSocket(datagramSocket);
    }

    @Deprecated
    public static void tagSocket(Socket socket) {
        TrafficStats.tagSocket(socket);
    }

    public static void untagDatagramSocket(@NonNull DatagramSocket datagramSocket) {
        Api24Impl.untagDatagramSocket(datagramSocket);
    }

    @Deprecated
    public static void untagSocket(Socket socket) {
        TrafficStats.untagSocket(socket);
    }

    @Deprecated
    public static void incrementOperationCount(int i10, int i11) {
        TrafficStats.incrementOperationCount(i10, i11);
    }
}
