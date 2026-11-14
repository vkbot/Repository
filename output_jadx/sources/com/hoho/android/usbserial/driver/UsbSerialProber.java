package com.hoho.android.usbserial.driver;

import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n0.b;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class UsbSerialProber {
    private final ProbeTable mProbeTable;

    public UsbSerialProber(ProbeTable probeTable) {
        this.mProbeTable = probeTable;
    }

    public static ProbeTable getDefaultProbeTable() {
        ProbeTable probeTable = new ProbeTable();
        probeTable.addDriver(CdcAcmSerialDriver.class);
        probeTable.addDriver(Cp21xxSerialDriver.class);
        probeTable.addDriver(FtdiSerialDriver.class);
        probeTable.addDriver(ProlificSerialDriver.class);
        probeTable.addDriver(Ch34xSerialDriver.class);
        probeTable.addDriver(GsmModemSerialDriver.class);
        probeTable.addDriver(ChromeCcdSerialDriver.class);
        return probeTable;
    }

    public static UsbSerialProber getDefaultProber() {
        return new UsbSerialProber(getDefaultProbeTable());
    }

    public List<UsbSerialDriver> findAllDrivers(UsbManager usbManager) {
        ArrayList arrayList = new ArrayList();
        Iterator<UsbDevice> it = usbManager.getDeviceList().values().iterator();
        while (it.hasNext()) {
            UsbSerialDriver probeDevice = probeDevice(it.next());
            if (probeDevice != null) {
                arrayList.add(probeDevice);
            }
        }
        return arrayList;
    }

    public UsbSerialDriver probeDevice(UsbDevice usbDevice) {
        Class<? extends UsbSerialDriver> findDriver = this.mProbeTable.findDriver(usbDevice);
        if (findDriver != null) {
            try {
                return findDriver.getConstructor(UsbDevice.class).newInstance(usbDevice);
            } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                b.w(e);
                return null;
            }
        }
        return null;
    }
}
