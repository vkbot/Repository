package org.apache.commons.net.ntp;

import java.net.DatagramPacket;
import java.net.InetAddress;
import n0.b;
import org.apache.commons.net.DatagramSocketClient;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class NTPUDPClient extends DatagramSocketClient {
    public static final int DEFAULT_PORT = 123;
    private int version = 3;

    public TimeInfo getTime(InetAddress inetAddress, int i10) {
        if (!isOpen()) {
            open();
        }
        NtpV3Impl ntpV3Impl = new NtpV3Impl();
        ntpV3Impl.setMode(3);
        ntpV3Impl.setVersion(this.version);
        DatagramPacket datagramPacket = ntpV3Impl.getDatagramPacket();
        datagramPacket.setAddress(inetAddress);
        datagramPacket.setPort(i10);
        NtpV3Impl ntpV3Impl2 = new NtpV3Impl();
        DatagramPacket datagramPacket2 = ntpV3Impl2.getDatagramPacket();
        TimeStamp currentTime = TimeStamp.getCurrentTime();
        ntpV3Impl.setTransmitTime(currentTime);
        checkOpen().send(datagramPacket);
        checkOpen().receive(datagramPacket2);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTime.equals(ntpV3Impl2.getOriginateTimeStamp())) {
            return new TimeInfo((NtpV3Packet) ntpV3Impl2, currentTimeMillis, false);
        }
        b.A("Originate time does not match the request");
        return null;
    }

    public int getVersion() {
        return this.version;
    }

    public void setVersion(int i10) {
        this.version = i10;
    }

    public TimeInfo getTime(InetAddress inetAddress) {
        return getTime(inetAddress, 123);
    }
}
