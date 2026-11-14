package com.sun.jna.win32;

import androidx.exifinterface.media.ExifInterface;
import com.sun.jna.FunctionMapper;
import com.sun.jna.NativeLibrary;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class W32APIFunctionMapper implements FunctionMapper {
    private final String suffix;
    public static final FunctionMapper UNICODE = new W32APIFunctionMapper(true);
    public static final FunctionMapper ASCII = new W32APIFunctionMapper(false);

    public W32APIFunctionMapper(boolean z9) {
        String str;
        if (z9) {
            str = ExifInterface.LONGITUDE_WEST;
        } else {
            str = ExifInterface.GPS_MEASUREMENT_IN_PROGRESS;
        }
        this.suffix = str;
    }

    @Override // com.sun.jna.FunctionMapper
    public String getFunctionName(NativeLibrary nativeLibrary, Method method) {
        String name = method.getName();
        if (!name.endsWith(ExifInterface.LONGITUDE_WEST) && !name.endsWith(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS)) {
            try {
                return nativeLibrary.getFunction(name + this.suffix, 63).getName();
            } catch (UnsatisfiedLinkError unused) {
            }
        }
        return name;
    }
}
