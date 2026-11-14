package com.hoho.android.usbserial.driver;

import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbInterface;
import com.hoho.android.usbserial.driver.UsbSerialPort;
import j1.i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.ByteCompanionObject;
import n0.b;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class Cp21xxSerialDriver implements UsbSerialDriver {
    private static final String TAG = "Cp21xxSerialDriver";
    private final UsbDevice mDevice;
    private final List<UsbSerialPort> mPorts = new ArrayList();

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public class Cp21xxSerialPort extends CommonUsbSerialPort {
        private static final int DTR_DISABLE = 256;
        private static final int DTR_ENABLE = 257;
        private static final int FLUSH_READ_CODE = 10;
        private static final int FLUSH_WRITE_CODE = 5;
        private static final int REQTYPE_DEVICE_TO_HOST = 193;
        private static final int REQTYPE_HOST_TO_DEVICE = 65;
        private static final int RTS_DISABLE = 512;
        private static final int RTS_ENABLE = 514;
        private static final int SILABSER_FLUSH_REQUEST_CODE = 18;
        private static final int SILABSER_GET_COMM_STATUS_REQUEST_CODE = 16;
        private static final int SILABSER_GET_MDMSTS_REQUEST_CODE = 8;
        private static final int SILABSER_IFC_ENABLE_REQUEST_CODE = 0;
        private static final int SILABSER_SET_BAUDRATE_REQUEST_CODE = 30;
        private static final int SILABSER_SET_BREAK_REQUEST_CODE = 5;
        private static final int SILABSER_SET_CHARS_REQUEST_CODE = 25;
        private static final int SILABSER_SET_FLOW_REQUEST_CODE = 19;
        private static final int SILABSER_SET_LINE_CTL_REQUEST_CODE = 3;
        private static final int SILABSER_SET_MHS_REQUEST_CODE = 7;
        private static final int SILABSER_SET_XOFF_REQUEST_CODE = 10;
        private static final int SILABSER_SET_XON_REQUEST_CODE = 9;
        private static final int STATUS_CD = 128;
        private static final int STATUS_CTS = 16;
        private static final int STATUS_DSR = 32;
        private static final int STATUS_DTR = 1;
        private static final int STATUS_RI = 64;
        private static final int STATUS_RTS = 2;
        private static final int UART_DISABLE = 0;
        private static final int UART_ENABLE = 1;
        private static final int USB_WRITE_TIMEOUT_MILLIS = 5000;
        private boolean dtr;
        private boolean mIsRestrictedPort;
        private boolean rts;

        public Cp21xxSerialPort(UsbDevice usbDevice, int i10) {
            super(usbDevice, i10);
            this.dtr = false;
            this.rts = false;
        }

        private byte getStatus() {
            byte[] bArr = new byte[1];
            int controlTransfer = this.mConnection.controlTransfer(REQTYPE_DEVICE_TO_HOST, 8, 0, this.mPortNumber, bArr, 1, 5000);
            if (controlTransfer == 1) {
                return bArr[0];
            }
            b.A(ai.onnxruntime.a.e(controlTransfer, "Control transfer failed: 8 / 0 -> "));
            return (byte) 0;
        }

        private void setBaudRate(int i10) {
            if (this.mConnection.controlTransfer(65, 30, 0, this.mPortNumber, new byte[]{(byte) (i10 & 255), (byte) ((i10 >> 8) & 255), (byte) ((i10 >> 16) & 255), (byte) ((i10 >> 24) & 255)}, 4, 5000) >= 0) {
                return;
            }
            b.A("Error setting baud rate");
        }

        private void setConfigSingle(int i10, int i11) {
            int controlTransfer = this.mConnection.controlTransfer(65, i10, i11, this.mPortNumber, null, 0, 5000);
            if (controlTransfer == 0) {
                return;
            }
            StringBuilder v9 = ai.onnxruntime.a.v("Control transfer failed: ", i10, i11, " / ", " -> ");
            v9.append(controlTransfer);
            throw new IOException(v9.toString());
        }

        @Override // com.hoho.android.usbserial.driver.CommonUsbSerialPort
        public void closeInt() {
            try {
                setConfigSingle(0, 0);
            } catch (Exception unused) {
            }
            try {
                this.mConnection.releaseInterface(this.mDevice.getInterface(this.mPortNumber));
            } catch (Exception unused2) {
            }
        }

        @Override // com.hoho.android.usbserial.driver.CommonUsbSerialPort, com.hoho.android.usbserial.driver.UsbSerialPort
        public boolean getCD() {
            if ((getStatus() & ByteCompanionObject.MIN_VALUE) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.hoho.android.usbserial.driver.CommonUsbSerialPort, com.hoho.android.usbserial.driver.UsbSerialPort
        public boolean getCTS() {
            if ((getStatus() & 16) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.hoho.android.usbserial.driver.CommonUsbSerialPort, com.hoho.android.usbserial.driver.UsbSerialPort
        public EnumSet<UsbSerialPort.ControlLine> getControlLines() {
            byte status = getStatus();
            EnumSet<UsbSerialPort.ControlLine> noneOf = EnumSet.noneOf(UsbSerialPort.ControlLine.class);
            if ((status & 2) != 0) {
                noneOf.add(UsbSerialPort.ControlLine.RTS);
            }
            if ((status & 16) != 0) {
                noneOf.add(UsbSerialPort.ControlLine.CTS);
            }
            if ((status & 1) != 0) {
                noneOf.add(UsbSerialPort.ControlLine.DTR);
            }
            if ((status & 32) != 0) {
                noneOf.add(UsbSerialPort.ControlLine.DSR);
            }
            if ((status & ByteCompanionObject.MIN_VALUE) != 0) {
                noneOf.add(UsbSerialPort.ControlLine.CD);
            }
            if ((status & 64) != 0) {
                noneOf.add(UsbSerialPort.ControlLine.RI);
            }
            return noneOf;
        }

        @Override // com.hoho.android.usbserial.driver.CommonUsbSerialPort, com.hoho.android.usbserial.driver.UsbSerialPort
        public boolean getDSR() {
            if ((getStatus() & 32) != 0) {
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
            return Cp21xxSerialDriver.this;
        }

        @Override // com.hoho.android.usbserial.driver.CommonUsbSerialPort, com.hoho.android.usbserial.driver.UsbSerialPort
        public boolean getRI() {
            if ((getStatus() & 64) != 0) {
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

        @Override // com.hoho.android.usbserial.driver.CommonUsbSerialPort, com.hoho.android.usbserial.driver.UsbSerialPort
        public EnumSet<UsbSerialPort.FlowControl> getSupportedFlowControl() {
            return EnumSet.of(UsbSerialPort.FlowControl.NONE, UsbSerialPort.FlowControl.RTS_CTS, UsbSerialPort.FlowControl.DTR_DSR, UsbSerialPort.FlowControl.XON_XOFF);
        }

        @Override // com.hoho.android.usbserial.driver.CommonUsbSerialPort, com.hoho.android.usbserial.driver.UsbSerialPort
        public boolean getXON() {
            byte[] bArr = new byte[19];
            int controlTransfer = this.mConnection.controlTransfer(REQTYPE_DEVICE_TO_HOST, 16, 0, this.mPortNumber, bArr, 19, 5000);
            if (controlTransfer == 19) {
                if ((bArr[4] & 8) == 0) {
                    return true;
                }
                return false;
            }
            b.A(ai.onnxruntime.a.e(controlTransfer, "Control transfer failed: 16 -> "));
            return false;
        }

        @Override // com.hoho.android.usbserial.driver.CommonUsbSerialPort
        public void openInt() {
            boolean z9;
            int i10;
            int i11;
            if (this.mDevice.getInterfaceCount() == 2 && this.mPortNumber == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.mIsRestrictedPort = z9;
            if (this.mPortNumber < this.mDevice.getInterfaceCount()) {
                UsbInterface usbInterface = this.mDevice.getInterface(this.mPortNumber);
                if (this.mConnection.claimInterface(usbInterface, true)) {
                    for (int i12 = 0; i12 < usbInterface.getEndpointCount(); i12++) {
                        UsbEndpoint endpoint = usbInterface.getEndpoint(i12);
                        if (endpoint.getType() == 2) {
                            if (endpoint.getDirection() == 128) {
                                this.mReadEndpoint = endpoint;
                            } else {
                                this.mWriteEndpoint = endpoint;
                            }
                        }
                    }
                    setConfigSingle(0, 1);
                    if (this.dtr) {
                        i10 = 257;
                    } else {
                        i10 = 256;
                    }
                    if (this.rts) {
                        i11 = 514;
                    } else {
                        i11 = 512;
                    }
                    setConfigSingle(7, i10 | i11);
                    setFlowControl(this.mFlowControl);
                    return;
                }
                b.y(this.mPortNumber, "Could not claim interface ");
                return;
            }
            b.A("Unknown port number");
        }

        @Override // com.hoho.android.usbserial.driver.CommonUsbSerialPort, com.hoho.android.usbserial.driver.UsbSerialPort
        public void purgeHwBuffers(boolean z9, boolean z10) {
            int i10;
            int i11 = 0;
            if (z10) {
                i10 = 10;
            } else {
                i10 = 0;
            }
            if (z9) {
                i11 = 5;
            }
            int i12 = i10 | i11;
            if (i12 != 0) {
                setConfigSingle(18, i12);
            }
        }

        @Override // com.hoho.android.usbserial.driver.CommonUsbSerialPort, com.hoho.android.usbserial.driver.UsbSerialPort
        public void setBreak(boolean z9) {
            setConfigSingle(5, z9 ? 1 : 0);
        }

        @Override // com.hoho.android.usbserial.driver.CommonUsbSerialPort, com.hoho.android.usbserial.driver.UsbSerialPort
        public void setDTR(boolean z9) {
            int i10;
            this.dtr = z9;
            if (z9) {
                i10 = 257;
            } else {
                i10 = 256;
            }
            setConfigSingle(7, i10);
        }

        @Override // com.hoho.android.usbserial.driver.CommonUsbSerialPort, com.hoho.android.usbserial.driver.UsbSerialPort
        public void setFlowControl(UsbSerialPort.FlowControl flowControl) {
            byte[] bArr = new byte[16];
            if (flowControl == UsbSerialPort.FlowControl.RTS_CTS) {
                bArr[4] = (byte) (bArr[4] | ByteCompanionObject.MIN_VALUE);
                bArr[0] = (byte) (bArr[0] | 8);
            } else if (this.rts) {
                bArr[4] = (byte) (bArr[4] | 64);
            }
            if (flowControl == UsbSerialPort.FlowControl.DTR_DSR) {
                byte b10 = (byte) (bArr[0] | 2);
                bArr[0] = b10;
                bArr[0] = (byte) (b10 | 16);
            } else if (this.dtr) {
                bArr[0] = (byte) (bArr[0] | 1);
            }
            UsbSerialPort.FlowControl flowControl2 = UsbSerialPort.FlowControl.XON_XOFF;
            if (flowControl == flowControl2) {
                if (this.mConnection.controlTransfer(65, 25, 0, this.mPortNumber, new byte[]{0, 0, 0, 0, 17, 19}, 6, 5000) == 6) {
                    bArr[4] = (byte) (bArr[4] | 3);
                    bArr[7] = (byte) (bArr[7] | ByteCompanionObject.MIN_VALUE);
                    bArr[8] = ByteCompanionObject.MIN_VALUE;
                    bArr[12] = ByteCompanionObject.MIN_VALUE;
                } else {
                    b.A("Error setting XON/XOFF chars");
                    return;
                }
            }
            if (flowControl != UsbSerialPort.FlowControl.XON_XOFF_INLINE) {
                if (this.mConnection.controlTransfer(65, 19, 0, this.mPortNumber, bArr, 16, 5000) == 16) {
                    if (flowControl == flowControl2) {
                        setXON(true);
                    }
                    this.mFlowControl = flowControl;
                    return;
                }
                b.A("Error setting flow control");
                return;
            }
            androidx.navigation.b.a();
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
                                i14 = 2048;
                            } else {
                                i.k(ai.onnxruntime.a.e(i11, "Invalid data bits: "));
                                return;
                            }
                        } else if (!this.mIsRestrictedPort) {
                            i14 = 1792;
                        } else {
                            androidx.navigation.b.g(ai.onnxruntime.a.e(i11, "Unsupported data bits: "));
                            return;
                        }
                    } else if (!this.mIsRestrictedPort) {
                        i14 = 1536;
                    } else {
                        androidx.navigation.b.g(ai.onnxruntime.a.e(i11, "Unsupported data bits: "));
                        return;
                    }
                } else if (!this.mIsRestrictedPort) {
                    i14 = 1280;
                } else {
                    androidx.navigation.b.g(ai.onnxruntime.a.e(i11, "Unsupported data bits: "));
                    return;
                }
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            if (i13 != 3) {
                                if (i13 == 4) {
                                    if (!this.mIsRestrictedPort) {
                                        i14 |= 64;
                                    } else {
                                        androidx.navigation.b.g("Unsupported parity: space");
                                        return;
                                    }
                                } else {
                                    i.k(ai.onnxruntime.a.e(i13, "Invalid parity: "));
                                    return;
                                }
                            } else if (!this.mIsRestrictedPort) {
                                i14 |= 48;
                            } else {
                                androidx.navigation.b.g("Unsupported parity: mark");
                                return;
                            }
                        } else {
                            i14 |= 32;
                        }
                    } else {
                        i14 |= 16;
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
                    if (!this.mIsRestrictedPort) {
                        i14 |= 2;
                    } else {
                        androidx.navigation.b.g("Unsupported stop bits: 2");
                        return;
                    }
                }
                setConfigSingle(3, i14);
                return;
            }
            i.k(ai.onnxruntime.a.e(i10, "Invalid baud rate: "));
        }

        @Override // com.hoho.android.usbserial.driver.CommonUsbSerialPort, com.hoho.android.usbserial.driver.UsbSerialPort
        public void setRTS(boolean z9) {
            int i10;
            this.rts = z9;
            if (z9) {
                i10 = 514;
            } else {
                i10 = 512;
            }
            setConfigSingle(7, i10);
        }

        public void setXON(boolean z9) {
            int i10;
            if (z9) {
                i10 = 9;
            } else {
                i10 = 10;
            }
            setConfigSingle(i10, 0);
        }
    }

    public Cp21xxSerialDriver(UsbDevice usbDevice) {
        this.mDevice = usbDevice;
        for (int i10 = 0; i10 < usbDevice.getInterfaceCount(); i10++) {
            this.mPorts.add(new Cp21xxSerialPort(this.mDevice, i10));
        }
    }

    public static Map<Integer, int[]> getSupportedDevices() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Integer.valueOf(UsbId.VENDOR_SILABS), new int[]{UsbId.SILABS_CP2102, UsbId.SILABS_CP2105, UsbId.SILABS_CP2108});
        return linkedHashMap;
    }

    @Override // com.hoho.android.usbserial.driver.UsbSerialDriver
    public UsbDevice getDevice() {
        return this.mDevice;
    }

    @Override // com.hoho.android.usbserial.driver.UsbSerialDriver
    public List<UsbSerialPort> getPorts() {
        return this.mPorts;
    }
}
