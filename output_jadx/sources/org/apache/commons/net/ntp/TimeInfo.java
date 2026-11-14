package org.apache.commons.net.ntp;

import j1.i;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class TimeInfo {
    private List<String> comments;
    private Long delayMillis;
    private boolean detailsComputed;
    private final NtpV3Packet message;
    private Long offsetMillis;
    private final long returnTimeMillis;

    public TimeInfo(NtpV3Packet ntpV3Packet, long j10, List<String> list, boolean z9) {
        if (ntpV3Packet != null) {
            this.returnTimeMillis = j10;
            this.message = ntpV3Packet;
            this.comments = list;
            if (z9) {
                computeDetails();
                return;
            }
            return;
        }
        i.k("message cannot be null");
        throw null;
    }

    public void addComment(String str) {
        if (this.comments == null) {
            this.comments = new ArrayList();
        }
        this.comments.add(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void computeDetails() {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.ntp.TimeInfo.computeDetails():void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TimeInfo timeInfo = (TimeInfo) obj;
            if (this.returnTimeMillis == timeInfo.returnTimeMillis && this.message.equals(timeInfo.message)) {
                return true;
            }
        }
        return false;
    }

    public InetAddress getAddress() {
        DatagramPacket datagramPacket = this.message.getDatagramPacket();
        if (datagramPacket == null) {
            return null;
        }
        return datagramPacket.getAddress();
    }

    public List<String> getComments() {
        return this.comments;
    }

    public Long getDelay() {
        return this.delayMillis;
    }

    public NtpV3Packet getMessage() {
        return this.message;
    }

    public Long getOffset() {
        return this.offsetMillis;
    }

    public long getReturnTime() {
        return this.returnTimeMillis;
    }

    public int hashCode() {
        return this.message.hashCode() + (((int) this.returnTimeMillis) * 31);
    }

    public TimeInfo(NtpV3Packet ntpV3Packet, long j10, boolean z9) {
        this(ntpV3Packet, j10, null, z9);
    }

    public TimeInfo(NtpV3Packet ntpV3Packet, long j10, List<String> list) {
        this(ntpV3Packet, j10, list, true);
    }

    public TimeInfo(NtpV3Packet ntpV3Packet, long j10) {
        this(ntpV3Packet, j10, null, true);
    }
}
