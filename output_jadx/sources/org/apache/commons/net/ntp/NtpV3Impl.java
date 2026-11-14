package org.apache.commons.net.ntp;

import java.net.DatagramPacket;
import java.util.Arrays;
import kotlin.UByte;
import l9.i;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class NtpV3Impl implements NtpV3Packet {
    private static final int LI_INDEX = 0;
    private static final int LI_SHIFT = 6;
    private static final int MODE_INDEX = 0;
    private static final int MODE_SHIFT = 0;
    private static final int ORIGINATE_TIMESTAMP_INDEX = 24;
    private static final int POLL_INDEX = 2;
    private static final int PRECISION_INDEX = 3;
    private static final int RECEIVE_TIMESTAMP_INDEX = 32;
    private static final int REFERENCE_ID_INDEX = 12;
    private static final int REFERENCE_TIMESTAMP_INDEX = 16;
    private static final int ROOT_DELAY_INDEX = 4;
    private static final int ROOT_DISPERSION_INDEX = 8;
    private static final int STRATUM_INDEX = 1;
    private static final int TRANSMIT_TIMESTAMP_INDEX = 40;
    private static final int VERSION_INDEX = 0;
    private static final int VERSION_SHIFT = 3;
    private final byte[] buf = new byte[48];
    private volatile DatagramPacket dp;

    private int getInt(int i10) {
        return ui(this.buf[i10 + 3]) | (ui(this.buf[i10]) << 24) | (ui(this.buf[i10 + 1]) << 16) | (ui(this.buf[i10 + 2]) << 8);
    }

    private long getLong(int i10) {
        return (ul(this.buf[i10]) << 56) | (ul(this.buf[i10 + 1]) << 48) | (ul(this.buf[i10 + 2]) << 40) | (ul(this.buf[i10 + 3]) << 32) | (ul(this.buf[i10 + 4]) << 24) | (ul(this.buf[i10 + 5]) << 16) | (ul(this.buf[i10 + 6]) << 8) | ul(this.buf[i10 + 7]);
    }

    private TimeStamp getTimestamp(int i10) {
        return new TimeStamp(getLong(i10));
    }

    private String idAsHex() {
        return Integer.toHexString(getReferenceId());
    }

    private String idAsIPAddress() {
        return ui(this.buf[12]) + "." + ui(this.buf[13]) + "." + ui(this.buf[14]) + "." + ui(this.buf[15]);
    }

    private String idAsString() {
        char c;
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 <= 3 && (c = (char) this.buf[i10 + 12]) != 0; i10++) {
            sb.append(c);
        }
        return sb.toString();
    }

    private void setInt(int i10, int i11) {
        for (int i12 = 3; i12 >= 0; i12--) {
            this.buf[i10 + i12] = (byte) (i11 & 255);
            i11 >>>= 8;
        }
    }

    private void setTimestamp(int i10, TimeStamp timeStamp) {
        long ntpValue;
        if (timeStamp == null) {
            ntpValue = 0;
        } else {
            ntpValue = timeStamp.ntpValue();
        }
        for (int i11 = 7; i11 >= 0; i11--) {
            this.buf[i10 + i11] = (byte) (255 & ntpValue);
            ntpValue >>>= 8;
        }
    }

    public static final int ui(byte b10) {
        return b10 & UByte.MAX_VALUE;
    }

    public static final long ul(byte b10) {
        return b10 & UByte.MAX_VALUE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return Arrays.equals(this.buf, ((NtpV3Impl) obj).buf);
        }
        return false;
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public synchronized DatagramPacket getDatagramPacket() {
        try {
            if (this.dp == null) {
                byte[] bArr = this.buf;
                this.dp = new DatagramPacket(bArr, bArr.length);
                this.dp.setPort(123);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.dp;
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public int getLeapIndicator() {
        return (ui(this.buf[0]) >> 6) & 3;
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public int getMode() {
        return ui(this.buf[0]) & 7;
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public String getModeName() {
        return NtpUtils.getModeName(getMode());
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public TimeStamp getOriginateTimeStamp() {
        return getTimestamp(24);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public int getPoll() {
        return this.buf[2];
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public int getPrecision() {
        return this.buf[3];
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public TimeStamp getReceiveTimeStamp() {
        return getTimestamp(32);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public int getReferenceId() {
        return getInt(12);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public String getReferenceIdString() {
        int version = getVersion();
        int stratum = getStratum();
        if (version == 3 || version == 4) {
            if (stratum != 0 && stratum != 1) {
                if (version == 4) {
                    return idAsHex();
                }
            } else {
                return idAsString();
            }
        }
        if (stratum >= 2) {
            return idAsIPAddress();
        }
        return idAsHex();
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public TimeStamp getReferenceTimeStamp() {
        return getTimestamp(16);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public int getRootDelay() {
        return getInt(4);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public double getRootDelayInMillisDouble() {
        return getRootDelay() / 65.536d;
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public int getRootDispersion() {
        return getInt(8);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public long getRootDispersionInMillis() {
        return (getRootDispersion() * 1000) / 65536;
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public double getRootDispersionInMillisDouble() {
        return getRootDispersion() / 65.536d;
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public int getStratum() {
        return ui(this.buf[1]);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public TimeStamp getTransmitTimeStamp() {
        return getTimestamp(40);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public String getType() {
        return NtpV3Packet.TYPE_NTP;
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public int getVersion() {
        return (ui(this.buf[0]) >> 3) & 7;
    }

    public int hashCode() {
        return Arrays.hashCode(this.buf);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public void setDatagramPacket(DatagramPacket datagramPacket) {
        if (datagramPacket != null && datagramPacket.getLength() >= this.buf.length) {
            byte[] data = datagramPacket.getData();
            int length = datagramPacket.getLength();
            byte[] bArr = this.buf;
            if (length > bArr.length) {
                length = bArr.length;
            }
            System.arraycopy(data, 0, bArr, 0, length);
            DatagramPacket datagramPacket2 = getDatagramPacket();
            datagramPacket2.setAddress(datagramPacket.getAddress());
            int port = datagramPacket.getPort();
            if (port <= 0) {
                port = 123;
            }
            datagramPacket2.setPort(port);
            datagramPacket2.setData(this.buf);
            return;
        }
        i.a();
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public void setLeapIndicator(int i10) {
        byte[] bArr = this.buf;
        bArr[0] = (byte) (((i10 & 3) << 6) | (bArr[0] & 63));
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public void setMode(int i10) {
        byte[] bArr = this.buf;
        bArr[0] = (byte) ((i10 & 7) | (bArr[0] & 248));
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public void setOriginateTimeStamp(TimeStamp timeStamp) {
        setTimestamp(24, timeStamp);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public void setPoll(int i10) {
        this.buf[2] = (byte) (i10 & 255);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public void setPrecision(int i10) {
        this.buf[3] = (byte) (i10 & 255);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public void setReceiveTimeStamp(TimeStamp timeStamp) {
        setTimestamp(32, timeStamp);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public void setReferenceId(int i10) {
        setInt(12, i10);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public void setReferenceTime(TimeStamp timeStamp) {
        setTimestamp(16, timeStamp);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public void setRootDelay(int i10) {
        setInt(4, i10);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public void setRootDispersion(int i10) {
        setInt(8, i10);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public void setStratum(int i10) {
        this.buf[1] = (byte) (i10 & 255);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public void setTransmitTime(TimeStamp timeStamp) {
        setTimestamp(40, timeStamp);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public void setVersion(int i10) {
        byte[] bArr = this.buf;
        bArr[0] = (byte) (((i10 & 7) << 3) | (bArr[0] & 199));
    }

    public String toString() {
        return "[version:" + getVersion() + ", mode:" + getMode() + ", poll:" + getPoll() + ", precision:" + getPrecision() + ", delay:" + getRootDelay() + ", dispersion(ms):" + getRootDispersionInMillisDouble() + ", id:" + getReferenceIdString() + ", xmitTime:" + getTransmitTimeStamp().toDateString() + " ]";
    }
}
