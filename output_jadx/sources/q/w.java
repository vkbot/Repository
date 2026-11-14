package q;

import android.os.Build;
import android.util.Log;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class w {
    public static final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f5155f;

    /* renamed from: g, reason: collision with root package name */
    public static final File f5156g;

    /* renamed from: h, reason: collision with root package name */
    public static volatile w f5157h;

    /* renamed from: b, reason: collision with root package name */
    public int f5159b;
    public boolean c = true;
    public final AtomicBoolean d = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    public final int f5158a = AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH;

    static {
        boolean z9;
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = false;
        if (i10 < 29) {
            z9 = true;
        } else {
            z9 = false;
        }
        e = z9;
        if (i10 >= 28) {
            z10 = true;
        }
        f5155f = z10;
        f5156g = new File("/proc/self/fd");
    }

    public static w a() {
        if (f5157h == null) {
            synchronized (w.class) {
                try {
                    if (f5157h == null) {
                        f5157h = new w();
                    }
                } finally {
                }
            }
        }
        return f5157h;
    }

    public final int b() {
        if (Build.VERSION.SDK_INT == 28) {
            Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
            while (it.hasNext()) {
                if (Build.MODEL.startsWith((String) it.next())) {
                    return 500;
                }
            }
        }
        return this.f5158a;
    }

    public final boolean c(int i10, int i11, boolean z9, boolean z10) {
        boolean z11;
        boolean z12;
        if (!z9) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
                return false;
            }
        } else if (!f5155f) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
                return false;
            }
        } else if (e && !this.d.get()) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
                return false;
            }
        } else if (z10) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
                return false;
            }
        } else if (i10 >= 0 && i11 >= 0) {
            synchronized (this) {
                try {
                    int i12 = this.f5159b + 1;
                    this.f5159b = i12;
                    if (i12 >= 50) {
                        this.f5159b = 0;
                        int length = f5156g.list().length;
                        long b10 = b();
                        if (length < b10) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        this.c = z12;
                        if (!z12 && Log.isLoggable("Downsampler", 5)) {
                            Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + b10);
                        }
                    }
                    z11 = this.c;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z11) {
                return true;
            }
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
                return false;
            }
        } else if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
        }
        return false;
    }
}
