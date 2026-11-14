package com.hoho.android.usbserial.driver;

import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbInterface;
import android.util.Log;
import com.hoho.android.usbserial.driver.UsbSerialPort;
import j1.i;
import java.util.Collections;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.UByte;
import n0.b;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class Ch34xSerialDriver implements UsbSerialDriver {
    private static final int GCL_CD = 8;
    private static final int GCL_CTS = 1;
    private static final int GCL_DSR = 2;
    private static final int GCL_RI = 4;
    private static final int LCR_CS5 = 0;
    private static final int LCR_CS6 = 1;
    private static final int LCR_CS7 = 2;
    private static final int LCR_CS8 = 3;
    private static final int LCR_ENABLE_PAR = 8;
    private static final int LCR_ENABLE_RX = 128;
    private static final int LCR_ENABLE_TX = 64;
    private static final int LCR_MARK_SPACE = 32;
    private static final int LCR_PAR_EVEN = 16;
    private static final int LCR_STOP_BITS_2 = 4;
    private static final int SCL_DTR = 32;
    private static final int SCL_RTS = 64;
    private static final String TAG = "Ch34xSerialDriver";
    private final UsbDevice mDevice;
    private final UsbSerialPort mPort;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public class Ch340SerialPort extends CommonUsbSerialPort {
        private static final int USB_TIMEOUT_MILLIS = 5000;
        private final int DEFAULT_BAUD_RATE;
        private boolean dtr;
        private boolean rts;

        public Ch340SerialPort(UsbDevice usbDevice, int i10) {
            super(usbDevice, i10);
            this.DEFAULT_BAUD_RATE = 9600;
            this.dtr = false;
            this.rts = false;
        }

        private void checkState(String str, int i10, int i11, int[] iArr) {
            int i12;
            byte[] bArr = new byte[iArr.length];
            int controlIn = controlIn(i10, i11, 0, bArr);
            if (controlIn >= 0) {
                if (controlIn == iArr.length) {
                    for (int i13 = 0; i13 < iArr.length; i13++) {
                        int i14 = iArr[i13];
                        if (i14 != -1 && i14 != (i12 = bArr[i13] & UByte.MAX_VALUE)) {
                            StringBuilder sb = new StringBuilder("Expected 0x");
                            sb.append(Integer.toHexString(iArr[i13]));
                            sb.append(" byte, but get 0x");
                            sb.append(Integer.toHexString(i12));
                            sb.append(" [");
                            b.A(ai.onnxruntime.a.p(sb, str, "]"));
                            return;
                        }
                    }
                    return;
                }
                StringBuilder sb2 = new StringBuilder("Expected ");
                sb2.append(iArr.length);
                sb2.append(" bytes, but get ");
                sb2.append(controlIn);
                sb2.append(" [");
                b.A(ai.onnxruntime.a.p(sb2, str, "]"));
                return;
            }
            b.A(ai.onnxruntime.a.m("Failed send cmd [", str, "]"));
        }

        private int controlIn(int i10, int i11, int i12, byte[] bArr) {
            return this.mConnection.controlTransfer(192, i10, i11, i12, bArr, bArr.length, 5000);
        }

        private int controlOut(int i10, int i11, int i12) {
            return this.mConnection.controlTransfer(64, i10, i11, i12, null, 0, 5000);
        }

        private byte getStatus() {
            byte[] bArr = new byte[2];
            if (controlIn(149, 1798, 0, bArr) >= 0) {
                return bArr[0];
            }
            b.A("Error getting control lines");
            return (byte) 0;
        }

        private void initialize() {
            checkState("init #1", 95, 0, new int[]{-1, 0});
            if (controlOut(161, 0, 0) >= 0) {
                setBaudRate(9600);
                checkState("init #4", 149, 9496, new int[]{-1, 0});
                if (controlOut(154, 9496, 195) >= 0) {
                    checkState("init #6", 149, 1798, new int[]{-1, -1});
                    if (controlOut(161, 20511, 55562) >= 0) {
                        setBaudRate(9600);
                        setControlLines();
                        checkState("init #10", 149, 1798, new int[]{-1, -1});
                        return;
                    }
                    b.A("Init failed: #7");
                    return;
                }
                b.A("Init failed: #5");
                return;
            }
            b.A("Init failed: #2");
        }

        private void setBaudRate(int i10) {
            long j10;
            long j11;
            if (i10 == 921600) {
                j11 = 7;
                j10 = 62208;
            } else {
                long j12 = 1532620800 / i10;
                long j13 = 3;
                while (j12 > 65520 && j13 > 0) {
                    j12 >>= 3;
                    j13--;
                }
                if (j12 <= 65520) {
                    long j14 = j13;
                    j10 = 65536 - j12;
                    j11 = j14;
                } else {
                    androidx.navigation.b.g(ai.onnxruntime.a.e(i10, "Unsupported baud rate: "));
                    return;
                }
            }
            int i11 = (int) (j11 | 128 | (65280 & j10));
            int i12 = (int) (j10 & 255);
            Log.d(Ch34xSerialDriver.TAG, String.format("baud rate=%d, 0x1312=0x%04x, 0x0f2c=0x%04x", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)));
            if (controlOut(154, 4882, i11) >= 0) {
                if (controlOut(154, 3884, i12) >= 0) {
                    return;
                }
                b.A("Error setting baud rate: #2");
                return;
            }
            b.A("Error setting baud rate: #1)");
        }

        private void setControlLines() {
            int i10;
            int i11;
            if (this.dtr) {
                i10 = 32;
            } else {
                i10 = 0;
            }
            if (this.rts) {
                i11 = 64;
            } else {
                i11 = 0;
            }
            if (controlOut(164, ~(i10 | i11), 0) >= 0) {
                return;
            }
            b.A("Failed to set control lines");
        }

        @Override // com.hoho.android.usbserial.driver.CommonUsbSerialPort
        public void closeInt() {
            for (int i10 = 0; i10 < this.mDevice.getInterfaceCount(); i10++) {
                try {
                    this.mConnection.releaseInterface(this.mDevice.getInterface(i10));
                } catch (Exception unused) {
                    return;
                }
            }
        }

        @Override // com.hoho.android.usbserial.driver.CommonUsbSerialPort, com.hoho.android.usbserial.driver.UsbSerialPort
        public boolean getCD() {
            if ((getStatus() & 8) == 0) {
                return true;
            }
            return false;
        }

        @Override // com.hoho.android.usbserial.driver.CommonUsbSerialPort, com.hoho.android.usbserial.driver.UsbSerialPort
        public boolean getCTS() {
            if ((getStatus() & 1) == 0) {
                return true;
            }
            return false;
        }

        @Override // com.hoho.android.usbserial.driver.CommonUsbSerialPort, com.hoho.android.usbserial.driver.UsbSerialPort
        public EnumSet<UsbSerialPort.ControlLine> getControlLines() {
            byte status = getStatus();
            EnumSet<UsbSerialPort.ControlLine> noneOf = EnumSet.noneOf(UsbSerialPort.ControlLine.class);
            if (this.rts) {
                noneOf.add(UsbSerialPort.ControlLine.RTS);
            }
            if ((status & 1) == 0) {
                noneOf.add(UsbSerialPort.ControlLine.CTS);
            }
            if (this.dtr) {
                noneOf.add(UsbSerialPort.ControlLine.DTR);
            }
            if ((status & 2) == 0) {
                noneOf.add(UsbSerialPort.ControlLine.DSR);
            }
            if ((status & 8) == 0) {
                noneOf.add(UsbSerialPort.ControlLine.CD);
            }
            if ((status & 4) == 0) {
                noneOf.add(UsbSerialPort.ControlLine.RI);
            }
            return noneOf;
        }

        @Override // com.hoho.android.usbserial.driver.CommonUsbSerialPort, com.hoho.android.usbserial.driver.UsbSerialPort
        public boolean getDSR() {
            if ((getStatus() & 2) == 0) {
                return true;
            }
            return false;
        }

        @Override // com.hoho.android.usbserial.driver.CommonUsbSerialPort, com.hoho.android.usbserial.driver.UsbSerialPort
        public boolean getDTR() {
            return this.dtr;
        }

        @Override // com.hoho.android.usbserial.driver.UsbSerialPort
        public UsbSerialDriver getDriver() {
            return Ch34xSerialDriver.this;
        }

        @Override // com.hoho.android.usbserial.driver.CommonUsbSerialPort, com.hoho.android.usbserial.driver.UsbSerialPort
        public boolean getRI() {
            if ((getStatus() & 4) == 0) {
                return true;
            }
            return false;
        }

        @Override // com.hoho.android.usbserial.driver.CommonUsbSerialPort, com.hoho.android.usbserial.driver.UsbSerialPort
        public boolean getRTS() {
            return this.rts;
        }

        @Override // com.hoho.android.usbserial.driver.CommonUsbSerialPort, com.hoho.android.usbserial.driver.UsbSerialPort
        public EnumSet<UsbSerialPort.ControlLine> getSupportedControlLines() {
            return EnumSet.allOf(UsbSerialPort.ControlLine.class);
        }

        @Override // com.hoho.android.usbserial.driver.CommonUsbSerialPort
        public void openInt() {
            int i10 = 0;
            while (true) {
                int interfaceCount = this.mDevice.getInterfaceCount();
                UsbDevice usbDevice = this.mDevice;
                if (i10 < interfaceCount) {
                    if (this.mConnection.claimInterface(usbDevice.getInterface(i10), true)) {
                        i10++;
                    } else {
                        b.A("Could not claim data interface");
                        return;
                    }
                } else {
                    UsbInterface usbInterface = usbDevice.getInterface(usbDevice.getInterfaceCount() - 1);
                    for (int i11 = 0; i11 < usbInterface.getEndpointCount(); i11++) {
                        UsbEndpoint endpoint = usbInterface.getEndpoint(i11);
                        if (endpoint.getType() == 2) {
                            if (endpoint.getDirection() == 128) {
                                this.mReadEndpoint = endpoint;
                            } else {
                                this.mWriteEndpoint = endpoint;
                            }
                        }
                    }
                    initialize();
                    setBaudRate(9600);
                    return;
                }
            }
        }

        @Override // com.hoho.android.usbserial.driver.CommonUsbSerialPort, com.hoho.android.usbserial.driver.UsbSerialPort
        public void setBreak(boolean z9) {
            byte[] bArr = new byte[2];
            if (controlIn(149, 6149, 0, bArr) >= 0) {
                if (z9) {
                    bArr[0] = (byte) (bArr[0] & (-2));
                    bArr[1] = (byte) (bArr[1] & (-65));
                } else {
                    bArr[0] = (byte) (bArr[0] | 1);
                    bArr[1] = (byte) (bArr[1] | 64);
                }
                if (controlOut(154, 6149, ((bArr[1] & UByte.MAX_VALUE) << 8) | (bArr[0] & UByte.MAX_VALUE)) >= 0) {
                    return;
                }
                b.A("Error setting BREAK condition");
                return;
            }
            b.A("Error getting BREAK condition");
        }

        @Override // com.hoho.android.usbserial.driver.CommonUsbSerialPort, com.hoho.android.usbserial.driver.UsbSerialPort
        public void setDTR(boolean z9) {
            this.dtr = z9;
            setControlLines();
        }

        @Override // com.hoho.android.usbserial.driver.CommonUsbSerialPort, com.hoho.android.usbserial.driver.UsbSerialPort
        public void setParameters(int i10, int i11, int i12, int i13) {
            int i14;
            if (i10 > 0) {
                setBaudRate(i10);
                if (i11 != 5) {
                    if (i11 != 6) {
                        if (i11 != 7) {
                            if (i11 == 8) {
                                i14 = 195;
                            } else {
                                i.k(ai.onnxruntime.a.e(i11, "Invalid data bits: "));
                                return;
                            }
                        } else {
                            i14 = 194;
                        }
                    } else {
                        i14 = 193;
                    }
                } else {
                    i14 = 192;
                }
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            if (i13 != 3) {
                                if (i13 == 4) {
                                    i14 |= 56;
                                } else {
                                    i.k(ai.onnxruntime.a.e(i13, "Invalid parity: "));
                                    return;
                                }
                            } else {
                                i14 |= 40;
                            }
                        } else {
                            i14 |= 24;
                        }
                    } else {
                        i14 |= 8;
                    }
                }
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            i.k(ai.onnxruntime.a.e(i12, "Invalid stop bits: "));
                            return;
                        } else {
                            androidx.navigation.b.g("Unsupported stop bits: 1.5");
                            return;
                        }
                    }
                    i14 |= 4;
                }
                if (controlOut(154, 9496, i14) >= 0) {
                    return;
                }
                b.A("Error setting control byte");
                return;
            }
            i.k(ai.onnxruntime.a.e(i10, "Invalid baud rate: "));
        }

        @Override // com.hoho.android.usbserial.driver.CommonUsbSerialPort, com.hoho.android.usbserial.driver.UsbSerialPort
        public void setRTS(boolean z9) {
            this.rts = z9;
            setControlLines();
        }
    }

    public Ch34xSerialDriver(UsbDevice usbDevice) {
        this.mDevice = usbDevice;
        this.mPort = new Ch340SerialPort(usbDevice, 0);
    }

    public static Map<Integer, int[]> getSupportedDevices() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Integer.valueOf(UsbId.VENDOR_QINHENG), new int[]{UsbId.QINHENG_CH340, UsbId.QINHENG_CH341A});
        return linkedHashMap;
    }

    @Override // com.hoho.android.usbserial.driver.UsbSerialDriver
    public UsbDevice getDevice() {
        return this.mDevice;
    }

    @Override // com.hoho.android.usbserial.driver.UsbSerialDriver
    public List<UsbSerialPort> getPorts() {
        return Collections.singletonList(this.mPort);
    }
}
