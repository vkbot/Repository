package c7;

import android.hardware.Camera;
import android.util.Log;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f546a = 0;

    static {
        Pattern.compile(";");
    }

    public static String a(String str, List list, String... strArr) {
        StringBuilder x9 = ai.onnxruntime.a.x("Requesting ", str, " value from among: ");
        x9.append(Arrays.toString(strArr));
        Log.i("CameraConfiguration", x9.toString());
        Log.i("CameraConfiguration", "Supported " + str + " values: " + list);
        if (list != null) {
            for (String str2 : strArr) {
                if (list.contains(str2)) {
                    Log.i("CameraConfiguration", "Can set " + str + " to: " + str2);
                    return str2;
                }
            }
        }
        Log.i("CameraConfiguration", "No supported values match");
        return null;
    }

    public static void b(Camera.Parameters parameters, boolean z9) {
        String a10;
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        if (z9) {
            a10 = a("flash mode", supportedFlashModes, "torch", "on");
        } else {
            a10 = a("flash mode", supportedFlashModes, "off");
        }
        if (a10 != null) {
            if (a10.equals(parameters.getFlashMode())) {
                Log.i("CameraConfiguration", "Flash mode already set to ".concat(a10));
            } else {
                Log.i("CameraConfiguration", "Setting flash mode to ".concat(a10));
                parameters.setFlashMode(a10);
            }
        }
    }
}
