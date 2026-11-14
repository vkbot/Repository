package com.hoho.android.usbserial.driver;

import a7.b;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbRequest;
import android.os.Build;
import com.hoho.android.usbserial.driver.UsbSerialPort;
import j1.i;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class CommonUsbSerialPort implements UsbSerialPort {
    public static boolean DEBUG = false;
    private static final int MAX_READ_SIZE = 16384;
    private static final String TAG = "CommonUsbSerialPort";
    protected UsbDeviceConnection mConnection;
    protected final UsbDevice mDevice;
    protected final int mPortNumber;
    protected UsbEndpoint mReadEndpoint;
    private int mReadQueueBufferCount;
    private int mReadQueueBufferSize;
    protected LinkedList<UsbRequest> mReadQueueRequests;
    protected UsbRequest mReadRequest;
    protected byte[] mWriteBuffer;
    protected UsbEndpoint mWriteEndpoint;
    protected UsbSerialPort.FlowControl mFlowControl = UsbSerialPort.FlowControl.NONE;
    protected b mUsbRequestSupplier = new androidx.navigation.b(7);
    protected final Object mWriteBufferLock = new Object();

    public CommonUsbSerialPort(UsbDevice usbDevice, int i10) {
        this.mDevice = usbDevice;
        this.mPortNumber = i10;
    }

    private boolean useReadQueue() {
        if (this.mReadQueueBufferCount != 0) {
            return true;
        }
        return false;
    }

    @Override // com.hoho.android.usbserial.driver.UsbSerialPort, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.mConnection != null) {
            UsbRequest usbRequest = this.mReadRequest;
            this.mReadRequest = null;
            try {
                usbRequest.cancel();
            } catch (Exception unused) {
            }
            LinkedList<UsbRequest> linkedList = this.mReadQueueRequests;
            if (linkedList != null) {
                Iterator<UsbRequest> it = linkedList.iterator();
                while (it.hasNext()) {
                    try {
                        it.next().cancel();
                    } catch (Exception unused2) {
                    }
                }
                this.mReadQueueRequests = null;
            }
            try {
                closeInt();
            } catch (Exception unused3) {
            }
            try {
                this.mConnection.close();
            } catch (Exception unused4) {
            }
            this.mConnection = null;
            return;
        }
        n0.b.A("Already closed");
    }

    public abstract void closeInt();

    @Override // com.hoho.android.usbserial.driver.UsbSerialPort
    public boolean getCD() {
        throw new UnsupportedOperationException();
    }

    @Override // com.hoho.android.usbserial.driver.UsbSerialPort
    public boolean getCTS() {
        throw new UnsupportedOperationException();
    }

    @Override // com.hoho.android.usbserial.driver.UsbSerialPort
    public EnumSet<UsbSerialPort.ControlLine> getControlLines() {
        throw new UnsupportedOperationException();
    }

    @Override // com.hoho.android.usbserial.driver.UsbSerialPort
    public boolean getDSR() {
        throw new UnsupportedOperationException();
    }

    @Override // com.hoho.android.usbserial.driver.UsbSerialPort
    public boolean getDTR() {
        throw new UnsupportedOperationException();
    }

    @Override // com.hoho.android.usbserial.driver.UsbSerialPort
    public UsbDevice getDevice() {
        return this.mDevice;
    }

    @Override // com.hoho.android.usbserial.driver.UsbSerialPort
    public UsbSerialPort.FlowControl getFlowControl() {
        return this.mFlowControl;
    }

    @Override // com.hoho.android.usbserial.driver.UsbSerialPort
    public int getPortNumber() {
        return this.mPortNumber;
    }

    @Override // com.hoho.android.usbserial.driver.UsbSerialPort
    public boolean getRI() {
        throw new UnsupportedOperationException();
    }

    @Override // com.hoho.android.usbserial.driver.UsbSerialPort
    public boolean getRTS() {
        throw new UnsupportedOperationException();
    }

    @Override // com.hoho.android.usbserial.driver.UsbSerialPort
    public UsbEndpoint getReadEndpoint() {
        return this.mReadEndpoint;
    }

    @Override // com.hoho.android.usbserial.driver.UsbSerialPort
    public int getReadQueueBufferCount() {
        return this.mReadQueueBufferCount;
    }

    @Override // com.hoho.android.usbserial.driver.UsbSerialPort
    public int getReadQueueBufferSize() {
        return this.mReadQueueBufferSize;
    }

    @Override // com.hoho.android.usbserial.driver.UsbSerialPort
    public String getSerial() {
        return this.mConnection.getSerial();
    }

    @Override // com.hoho.android.usbserial.driver.UsbSerialPort
    public EnumSet<UsbSerialPort.ControlLine> getSupportedControlLines() {
        return EnumSet.noneOf(UsbSerialPort.ControlLine.class);
    }

    @Override // com.hoho.android.usbserial.driver.UsbSerialPort
    public EnumSet<UsbSerialPort.FlowControl> getSupportedFlowControl() {
        return EnumSet.of(UsbSerialPort.FlowControl.NONE);
    }

    @Override // com.hoho.android.usbserial.driver.UsbSerialPort
    public UsbEndpoint getWriteEndpoint() {
        return this.mWriteEndpoint;
    }

    @Override // com.hoho.android.usbserial.driver.UsbSerialPort
    public boolean getXON() {
        throw new UnsupportedOperationException();
    }

    @Override // com.hoho.android.usbserial.driver.UsbSerialPort
    public boolean isOpen() {
        if (this.mReadRequest != null) {
            return true;
        }
        return false;
    }

    @Override // com.hoho.android.usbserial.driver.UsbSerialPort
    public void open(UsbDeviceConnection usbDeviceConnection) {
        if (this.mConnection == null) {
            if (usbDeviceConnection != null) {
                this.mConnection = usbDeviceConnection;
                try {
                    openInt();
                    if (this.mReadEndpoint != null && this.mWriteEndpoint != null) {
                        ((androidx.navigation.b) this.mUsbRequestSupplier).getClass();
                        UsbRequest usbRequest = new UsbRequest();
                        this.mReadRequest = usbRequest;
                        usbRequest.initialize(this.mConnection, this.mReadEndpoint);
                        setReadQueue(this.mReadQueueBufferCount, this.mReadQueueBufferSize);
                        return;
                    }
                    throw new IOException("Could not get read & write endpoints");
                } catch (Throwable th) {
                    try {
                        close();
                    } catch (Exception unused) {
                    }
                    throw th;
                }
            }
            i.k("Connection is null");
            return;
        }
        n0.b.A("Already open");
    }

    public abstract void openInt();

    @Override // com.hoho.android.usbserial.driver.UsbSerialPort
    public void purgeHwBuffers(boolean z9, boolean z10) {
        throw new UnsupportedOperationException();
    }

    public int read(byte[] bArr, int i10, int i11, boolean z9) {
        ByteBuffer byteBuffer;
        int position;
        long j10;
        testConnection(false);
        if (i10 > 0) {
            int min = Math.min(i10, bArr.length);
            boolean z10 = true;
            if (i11 != 0) {
                if (!useReadQueue()) {
                    if (z9) {
                        j10 = a7.a.a() + i11;
                    } else {
                        j10 = 0;
                    }
                    if (Build.VERSION.SDK_INT < 28) {
                        min = Math.min(min, 16384);
                    }
                    position = this.mConnection.bulkTransfer(this.mReadEndpoint, bArr, min, i11);
                    if (position == -1 && z9) {
                        if (a7.a.a() >= j10) {
                            z10 = false;
                        }
                        testConnection(z10);
                    }
                } else {
                    i.l("Cannot use timeout!=0 if readQueue is enabled");
                    return 0;
                }
            } else {
                if (useReadQueue()) {
                    if (min == this.mReadQueueBufferSize) {
                        byteBuffer = null;
                    } else {
                        i.l("Cannot use different length if readQueue is enabled");
                        return 0;
                    }
                } else {
                    ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, min);
                    if (this.mReadRequest.queue(wrap, min)) {
                        byteBuffer = wrap;
                    } else {
                        n0.b.A("Queueing USB request failed");
                        return 0;
                    }
                }
                UsbRequest requestWait = this.mConnection.requestWait();
                if (requestWait != null) {
                    if (useReadQueue()) {
                        byteBuffer = (ByteBuffer) requestWait.getClientData();
                        System.arraycopy(byteBuffer.array(), 0, bArr, 0, byteBuffer.position());
                        if (this.mReadRequest != null && !requestWait.queue(byteBuffer, byteBuffer.capacity())) {
                            n0.b.A("Queueing USB request failed");
                            return 0;
                        }
                    }
                    Objects.requireNonNull(byteBuffer);
                    position = byteBuffer.position();
                    if (position == 0) {
                        testConnection(true);
                    }
                } else {
                    n0.b.A("Waiting for USB request failed");
                    return 0;
                }
            }
            return Math.max(position, 0);
        }
        i.k("Read length too small");
        return 0;
    }

    @Override // com.hoho.android.usbserial.driver.UsbSerialPort
    public void setBreak(boolean z9) {
        throw new UnsupportedOperationException();
    }

    @Override // com.hoho.android.usbserial.driver.UsbSerialPort
    public void setDTR(boolean z9) {
        throw new UnsupportedOperationException();
    }

    @Override // com.hoho.android.usbserial.driver.UsbSerialPort
    public void setFlowControl(UsbSerialPort.FlowControl flowControl) {
        if (flowControl == UsbSerialPort.FlowControl.NONE) {
            return;
        }
        androidx.navigation.b.a();
    }

    @Override // com.hoho.android.usbserial.driver.UsbSerialPort
    public abstract void setParameters(int i10, int i11, int i12, int i13);

    @Override // com.hoho.android.usbserial.driver.UsbSerialPort
    public void setRTS(boolean z9) {
        throw new UnsupportedOperationException();
    }

    @Override // com.hoho.android.usbserial.driver.UsbSerialPort
    public void setReadQueue(int i10, int i11) {
        if (i10 >= 0) {
            if (i11 >= 0) {
                if (isOpen()) {
                    if (i10 >= this.mReadQueueBufferCount) {
                        if (i11 == 0) {
                            i11 = this.mReadEndpoint.getMaxPacketSize();
                        }
                        if (this.mReadQueueBufferSize == 0) {
                            this.mReadQueueBufferSize = this.mReadEndpoint.getMaxPacketSize();
                        }
                        if (this.mReadQueueBufferCount != 0 && i11 != this.mReadQueueBufferSize) {
                            i.l("Cannot change bufferSize when port is open");
                            return;
                        }
                        if (i10 > 0) {
                            if (this.mReadQueueRequests == null) {
                                this.mReadQueueRequests = new LinkedList<>();
                            }
                            for (int size = this.mReadQueueRequests.size(); size < i10; size++) {
                                ByteBuffer allocate = ByteBuffer.allocate(i11);
                                ((androidx.navigation.b) this.mUsbRequestSupplier).getClass();
                                UsbRequest usbRequest = new UsbRequest();
                                usbRequest.initialize(this.mConnection, this.mReadEndpoint);
                                usbRequest.setClientData(allocate);
                                usbRequest.queue(allocate, i11);
                                this.mReadQueueRequests.add(usbRequest);
                            }
                        }
                    } else {
                        i.l("Cannot reduce bufferCount when port is open");
                        return;
                    }
                }
                this.mReadQueueBufferCount = i10;
                this.mReadQueueBufferSize = i11;
                return;
            }
            i.k("Invalid bufferSize");
            return;
        }
        i.k("Invalid bufferCount");
    }

    public final void setWriteBufferSize(int i10) {
        synchronized (this.mWriteBufferLock) {
            if (i10 <= 0) {
                try {
                    UsbEndpoint usbEndpoint = this.mWriteEndpoint;
                    if (usbEndpoint != null) {
                        i10 = usbEndpoint.getMaxPacketSize();
                    } else {
                        this.mWriteBuffer = null;
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            byte[] bArr = this.mWriteBuffer;
            if (bArr != null && i10 == bArr.length) {
                return;
            }
            this.mWriteBuffer = new byte[i10];
        }
    }

    public void testConnection(boolean z9, String str) {
        if (this.mReadRequest != null) {
            if (z9) {
                if (this.mConnection.controlTransfer(128, 0, 0, 0, new byte[2], 2, 200) >= 0) {
                    return;
                }
                n0.b.A(str);
                return;
            }
            return;
        }
        n0.b.A("Connection closed");
    }

    public String toString() {
        return "<" + getClass().getSimpleName() + " device_name=" + this.mDevice.getDeviceName() + " device_id=" + this.mDevice.getDeviceId() + " port_number=" + this.mPortNumber + ">";
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0057 A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:6:0x001b, B:8:0x001f, B:9:0x002d, B:15:0x0046, B:20:0x005f, B:38:0x0057, B:40:0x003a), top: B:5:0x001b }] */
    @Override // com.hoho.android.usbserial.driver.UsbSerialPort
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void write(byte[] r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hoho.android.usbserial.driver.CommonUsbSerialPort.write(byte[], int, int):void");
    }

    public void testConnection(boolean z9) {
        testConnection(z9, "USB get_status request failed");
    }

    @Override // com.hoho.android.usbserial.driver.UsbSerialPort
    public int read(byte[] bArr, int i10, int i11) {
        return read(bArr, i10, i11, true);
    }

    @Override // com.hoho.android.usbserial.driver.UsbSerialPort
    public int read(byte[] bArr, int i10) {
        if (bArr.length != 0) {
            return read(bArr, bArr.length, i10);
        }
        i.k("Read buffer too small");
        return 0;
    }

    @Override // com.hoho.android.usbserial.driver.UsbSerialPort
    public void write(byte[] bArr, int i10) {
        write(bArr, bArr.length, i10);
    }
}
