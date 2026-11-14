package org.apache.commons.net.tftp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class TFTPClient extends TFTP {
    public static final int DEFAULT_MAX_TIMEOUTS = 5;
    private int maxTimeouts = 5;
    private long totalBytesReceived;
    private long totalBytesSent;

    public int getMaxTimeouts() {
        return this.maxTimeouts;
    }

    public long getTotalBytesReceived() {
        return this.totalBytesReceived;
    }

    public long getTotalBytesSent() {
        return this.totalBytesSent;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:8|9|10|(5:(4:13|14|(3:93|94|95)(1:16)|17)(7:101|102|103|104|105|106|108)|98|35|(3:47|48|49)|(1:39)(1:38))(1:112)|18|19|(6:79|80|81|82|83|84)(4:22|23|24|(3:26|27|(2:29|30)(2:32|33))(4:50|51|(5:63|64|65|(1:67)|68)(4:53|54|(1:56)|57)|60))|59|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x018e, code lost:
    
        r6.setBlockNumber(r12);
        r11 = r11 + r13;
        r18.totalBytesReceived += r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x019a, code lost:
    
        if (r13 == 512) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x019c, code lost:
    
        bufferedSend(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01a2, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0144, code lost:
    
        if (r12 == r0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0163, code lost:
    
        r16 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a9 A[LOOP:1: B:8:0x0034->B:38:0x01a9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x018e A[EDGE_INSN: B:39:0x018e->B:40:0x018e BREAK  A[LOOP:1: B:8:0x0034->B:38:0x01a9], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ae A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r18v0, types: [org.apache.commons.net.tftp.TFTPClient, org.apache.commons.net.tftp.TFTP] */
    /* JADX WARN: Type inference failed for: r6v1, types: [org.apache.commons.net.tftp.TFTPPacket, org.apache.commons.net.tftp.TFTPAckPacket] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int receiveFile(java.lang.String r19, int r20, java.io.OutputStream r21, java.net.InetAddress r22, int r23) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.tftp.TFTPClient.receiveFile(java.lang.String, int, java.io.OutputStream, java.net.InetAddress, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0114, code lost:
    
        if (r11 == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x011a, code lost:
    
        r4 = 512;
        r3 = 4;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x011f, code lost:
    
        if (r4 <= 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0121, code lost:
    
        r12 = r9.read(r17.sendBuffer, r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0127, code lost:
    
        if (r12 <= 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0129, code lost:
    
        r3 = r3 + r12;
        r4 = r4 - r12;
        r10 = r10 + r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x012d, code lost:
    
        if (r10 >= 512) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x012f, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0119, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0144 A[LOOP:1: B:8:0x0039->B:24:0x0144, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0114 A[EDGE_INSN: B:25:0x0114->B:26:0x0114 BREAK  A[LOOP:1: B:8:0x0039->B:24:0x0144], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0148 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void sendFile(java.lang.String r18, int r19, java.io.InputStream r20, java.net.InetAddress r21, int r22) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.tftp.TFTPClient.sendFile(java.lang.String, int, java.io.InputStream, java.net.InetAddress, int):void");
    }

    public void setMaxTimeouts(int i10) {
        this.maxTimeouts = Math.max(i10, 1);
    }

    public void sendFile(String str, int i10, InputStream inputStream, InetAddress inetAddress) {
        sendFile(str, i10, inputStream, inetAddress, 69);
    }

    public void sendFile(String str, int i10, InputStream inputStream, String str2) {
        sendFile(str, i10, inputStream, InetAddress.getByName(str2), 69);
    }

    public void sendFile(String str, int i10, InputStream inputStream, String str2, int i11) {
        sendFile(str, i10, inputStream, InetAddress.getByName(str2), i11);
    }

    public int receiveFile(String str, int i10, OutputStream outputStream, InetAddress inetAddress) {
        return receiveFile(str, i10, outputStream, inetAddress, 69);
    }

    public int receiveFile(String str, int i10, OutputStream outputStream, String str2) {
        return receiveFile(str, i10, outputStream, InetAddress.getByName(str2), 69);
    }

    public int receiveFile(String str, int i10, OutputStream outputStream, String str2, int i11) {
        return receiveFile(str, i10, outputStream, InetAddress.getByName(str2), i11);
    }
}
