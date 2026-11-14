package com.hoho.android.usbserial.driver;

import android.hardware.usb.UsbDevice;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public interface UsbSerialDriver {
    UsbDevice getDevice();

    List<UsbSerialPort> getPorts();
}
