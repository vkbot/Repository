package ai.onnxruntime.platform;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.logging.Logger;
import kotlin.jvm.internal.ShortCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class Fp16Conversions {
    private static final Logger logger = Logger.getLogger(Fp16Conversions.class.getName());

    private Fp16Conversions() {
    }

    public static float bf16ToFloat(short s5) {
        return Float.intBitsToFloat(s5 << 16);
    }

    public static FloatBuffer convertBf16BufferToFloatBuffer(ShortBuffer shortBuffer) {
        int position = shortBuffer.position();
        int remaining = shortBuffer.remaining();
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(remaining * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        for (int i10 = 0; i10 < remaining; i10++) {
            asFloatBuffer.put(i10, bf16ToFloat(shortBuffer.get(i10 + position)));
        }
        return asFloatBuffer;
    }

    public static ShortBuffer convertFloatBufferToBf16Buffer(FloatBuffer floatBuffer) {
        int position = floatBuffer.position();
        int remaining = floatBuffer.remaining();
        ShortBuffer asShortBuffer = ByteBuffer.allocateDirect(remaining * 2).order(ByteOrder.nativeOrder()).asShortBuffer();
        for (int i10 = 0; i10 < remaining; i10++) {
            asShortBuffer.put(i10, floatToBf16(floatBuffer.get(i10 + position)));
        }
        return asShortBuffer;
    }

    public static ShortBuffer convertFloatBufferToFp16Buffer(FloatBuffer floatBuffer) {
        int position = floatBuffer.position();
        int remaining = floatBuffer.remaining();
        ShortBuffer asShortBuffer = ByteBuffer.allocateDirect(remaining * 2).order(ByteOrder.nativeOrder()).asShortBuffer();
        for (int i10 = 0; i10 < remaining; i10++) {
            asShortBuffer.put(i10, floatToFp16(floatBuffer.get(i10 + position)));
        }
        return asShortBuffer;
    }

    public static FloatBuffer convertFp16BufferToFloatBuffer(ShortBuffer shortBuffer) {
        int position = shortBuffer.position();
        int remaining = shortBuffer.remaining();
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(remaining * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        for (int i10 = 0; i10 < remaining; i10++) {
            asFloatBuffer.put(i10, fp16ToFloat(shortBuffer.get(i10 + position)));
        }
        return asFloatBuffer;
    }

    public static short floatToBf16(float f8) {
        int floatToIntBits = Float.floatToIntBits(f8);
        return (short) (((((floatToIntBits >> 16) & 1) + 32767) + floatToIntBits) >> 16);
    }

    public static short floatToFp16(float f8) {
        return mlasFloatToFp16(f8);
    }

    public static float fp16ToFloat(short s5) {
        return mlasFp16ToFloat(s5);
    }

    public static short mlasFloatToFp16(float f8) {
        int i10;
        short s5;
        int floatToIntBits = Float.floatToIntBits(f8);
        int floatToIntBits2 = Float.floatToIntBits(Float.POSITIVE_INFINITY);
        int i11 = Integer.MIN_VALUE & floatToIntBits;
        int i12 = floatToIntBits ^ i11;
        if (i12 >= 1199570944) {
            if (i12 > floatToIntBits2) {
                s5 = 32256;
            } else {
                s5 = 31744;
            }
        } else {
            if (i12 < 947912704) {
                i10 = Float.floatToIntBits(Float.intBitsToFloat(1056964608) + Float.intBitsToFloat(i12)) - 1056964608;
            } else {
                i10 = ((i12 - 939520001) + ((i12 >> 13) & 1)) >> 13;
            }
            s5 = (short) i10;
        }
        return (short) (s5 | ((short) (i11 >> 16)));
    }

    public static float mlasFp16ToFloat(short s5) {
        int i10 = (s5 & ShortCompanionObject.MAX_VALUE) << 13;
        int i11 = i10 & 260046848;
        int i12 = 939524096 + i10;
        if (i11 == 260046848) {
            i12 = i10 + 1879048192;
        } else if (i11 == 0) {
            i12 = Float.floatToIntBits(Float.intBitsToFloat(i10 + 947912704) - Float.intBitsToFloat(947912704));
        }
        return Float.intBitsToFloat(((s5 & ShortCompanionObject.MIN_VALUE) << 16) | i12);
    }
}
