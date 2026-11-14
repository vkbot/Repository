package ai.onnxruntime;

import j1.i;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class OrtUtil {
    private static final Logger logger = Logger.getLogger(OrtUtil.class.getName());

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* renamed from: ai.onnxruntime.OrtUtil$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ai$onnxruntime$OnnxJavaType;

        static {
            int[] iArr = new int[OnnxJavaType.values().length];
            $SwitchMap$ai$onnxruntime$OnnxJavaType = iArr;
            try {
                iArr[OnnxJavaType.FLOAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OnnxJavaType[OnnxJavaType.DOUBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OnnxJavaType[OnnxJavaType.UINT8.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OnnxJavaType[OnnxJavaType.INT8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OnnxJavaType[OnnxJavaType.INT16.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OnnxJavaType[OnnxJavaType.INT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OnnxJavaType[OnnxJavaType.INT64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OnnxJavaType[OnnxJavaType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OnnxJavaType[OnnxJavaType.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OnnxJavaType[OnnxJavaType.UNKNOWN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OnnxJavaType[OnnxJavaType.FLOAT16.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OnnxJavaType[OnnxJavaType.BFLOAT16.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static final class BufferTuple {
        final long byteSize;
        final Buffer data;
        final boolean isCopy;
        final int pos;
        final long size;

        public BufferTuple(Buffer buffer, int i10, long j10, long j11, boolean z9) {
            this.data = buffer;
            this.pos = i10;
            this.byteSize = j10;
            this.size = j11;
            this.isCopy = z9;
        }
    }

    private OrtUtil() {
    }

    public static int capacityFromSize(int i10) {
        return (int) ((i10 / 0.75d) + 1.0d);
    }

    public static Buffer convertArrayToBuffer(TensorInfo tensorInfo, Object obj) {
        ByteBuffer order = ByteBuffer.allocateDirect(((int) tensorInfo.numElements) * tensorInfo.type.size).order(ByteOrder.nativeOrder());
        FloatBuffer floatBuffer = order;
        switch (AnonymousClass1.$SwitchMap$ai$onnxruntime$OnnxJavaType[tensorInfo.type.ordinal()]) {
            case 1:
                floatBuffer = order.asFloatBuffer();
                break;
            case 2:
                floatBuffer = order.asDoubleBuffer();
                break;
            case 3:
            case 4:
            case 8:
                break;
            case 5:
            case 11:
            case 12:
                floatBuffer = order.asShortBuffer();
                break;
            case 6:
                floatBuffer = order.asIntBuffer();
                break;
            case 7:
                floatBuffer = order.asLongBuffer();
                break;
            case 9:
            case 10:
            default:
                androidx.navigation.b.o(tensorInfo.type, "Unexpected type, expected Java primitive found ");
                return null;
        }
        fillBufferFromArray(tensorInfo, obj, 0, floatBuffer);
        if (floatBuffer.remaining() == 0) {
            floatBuffer.rewind();
            return floatBuffer;
        }
        throw new IllegalArgumentException("Failed to copy all elements into the buffer, expected to copy " + tensorInfo.numElements + " into a buffer of capacity " + floatBuffer.capacity() + " but had " + floatBuffer.remaining() + " values left over.");
    }

    public static Object convertBoxedPrimitiveToArray(OnnxJavaType onnxJavaType, Object obj) {
        switch (AnonymousClass1.$SwitchMap$ai$onnxruntime$OnnxJavaType[onnxJavaType.ordinal()]) {
            case 1:
                return new float[]{((Float) obj).floatValue()};
            case 2:
                return new double[]{((Double) obj).doubleValue()};
            case 3:
            case 4:
                return new byte[]{((Byte) obj).byteValue()};
            case 5:
                return new short[]{((Short) obj).shortValue()};
            case 6:
                return new int[]{((Integer) obj).intValue()};
            case 7:
                return new long[]{((Long) obj).longValue()};
            case 8:
                return new boolean[]{((Boolean) obj).booleanValue()};
            default:
                return null;
        }
    }

    public static Buffer convertBoxedPrimitiveToBuffer(OnnxJavaType onnxJavaType, Object obj) {
        switch (AnonymousClass1.$SwitchMap$ai$onnxruntime$OnnxJavaType[onnxJavaType.ordinal()]) {
            case 1:
                FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(onnxJavaType.size).order(ByteOrder.nativeOrder()).asFloatBuffer();
                asFloatBuffer.put(0, ((Float) obj).floatValue());
                return asFloatBuffer;
            case 2:
                DoubleBuffer asDoubleBuffer = ByteBuffer.allocateDirect(onnxJavaType.size).order(ByteOrder.nativeOrder()).asDoubleBuffer();
                asDoubleBuffer.put(0, ((Double) obj).doubleValue());
                return asDoubleBuffer;
            case 3:
            case 4:
                ByteBuffer order = ByteBuffer.allocateDirect(onnxJavaType.size).order(ByteOrder.nativeOrder());
                order.put(0, ((Byte) obj).byteValue());
                return order;
            case 5:
            case 11:
            case 12:
                ShortBuffer asShortBuffer = ByteBuffer.allocateDirect(onnxJavaType.size).order(ByteOrder.nativeOrder()).asShortBuffer();
                asShortBuffer.put(0, ((Short) obj).shortValue());
                return asShortBuffer;
            case 6:
                IntBuffer asIntBuffer = ByteBuffer.allocateDirect(onnxJavaType.size).order(ByteOrder.nativeOrder()).asIntBuffer();
                asIntBuffer.put(0, ((Integer) obj).intValue());
                return asIntBuffer;
            case 7:
                LongBuffer asLongBuffer = ByteBuffer.allocateDirect(onnxJavaType.size).order(ByteOrder.nativeOrder()).asLongBuffer();
                asLongBuffer.put(0, ((Long) obj).longValue());
                return asLongBuffer;
            case 8:
                ByteBuffer order2 = ByteBuffer.allocateDirect(onnxJavaType.size).order(ByteOrder.nativeOrder());
                order2.put(0, ((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                return order2;
            case 9:
            case 10:
            default:
                return null;
        }
    }

    public static Map<String, String> convertToMap(String[][] strArr) {
        if (strArr.length == 2) {
            if (strArr[0].length == strArr[1].length) {
                HashMap hashMap = new HashMap(capacityFromSize(strArr[0].length));
                int i10 = 0;
                while (true) {
                    String[] strArr2 = strArr[0];
                    if (i10 < strArr2.length) {
                        hashMap.put(strArr2[i10], strArr[1][i10]);
                        i10++;
                    } else {
                        return Collections.unmodifiableMap(hashMap);
                    }
                }
            } else {
                i.k("Invalid zipped string, must have two arrays of the same length.");
                return null;
            }
        } else {
            i.k("Invalid zipped string, must have two arrays.");
            return null;
        }
    }

    public static long elementCount(long[] jArr) {
        long j10 = 1;
        for (long j11 : jArr) {
            if (j11 >= 0) {
                j10 *= j11;
            } else {
                androidx.navigation.b.x(Arrays.toString(jArr), "Received negative value in shape ", " .");
                return 0L;
            }
        }
        return j10;
    }

    public static void fillArrayFromBuffer(TensorInfo tensorInfo, Buffer buffer, int i10, Object obj) {
        boolean z9;
        long[] jArr = tensorInfo.shape;
        if (i10 == jArr.length - 1) {
            switch (AnonymousClass1.$SwitchMap$ai$onnxruntime$OnnxJavaType[tensorInfo.type.ordinal()]) {
                case 1:
                case 11:
                case 12:
                    ((FloatBuffer) buffer).get((float[]) obj);
                    return;
                case 2:
                    ((DoubleBuffer) buffer).get((double[]) obj);
                    return;
                case 3:
                case 4:
                    ((ByteBuffer) buffer).get((byte[]) obj);
                    return;
                case 5:
                    ((ShortBuffer) buffer).get((short[]) obj);
                    return;
                case 6:
                    ((IntBuffer) buffer).get((int[]) obj);
                    return;
                case 7:
                    ((LongBuffer) buffer).get((long[]) obj);
                    return;
                case 8:
                    boolean[] zArr = (boolean[]) obj;
                    ByteBuffer byteBuffer = (ByteBuffer) buffer;
                    for (int i11 = 0; i11 < zArr.length; i11++) {
                        if (byteBuffer.get() != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        zArr[i11] = z9;
                    }
                    return;
                case 9:
                case 10:
                    androidx.navigation.b.o(tensorInfo.type, "Unexpected type, expected Java primitive found ");
                    return;
                default:
                    return;
            }
        }
        long j10 = jArr[i10];
        long length = Array.getLength(obj);
        if (j10 == length) {
            for (int i12 = 0; i12 < length; i12++) {
                fillArrayFromBuffer(tensorInfo, buffer, i10 + 1, Array.get(obj, i12));
            }
            return;
        }
        throw new IllegalArgumentException("Mismatch in array sizes, expected " + j10 + " at dim " + i10 + " from shape " + Arrays.toString(tensorInfo.shape) + ", found " + length);
    }

    private static void fillBufferFromArray(TensorInfo tensorInfo, Object obj, int i10, Buffer buffer) {
        long[] jArr = tensorInfo.shape;
        int i11 = 0;
        if (i10 == jArr.length - 1) {
            switch (AnonymousClass1.$SwitchMap$ai$onnxruntime$OnnxJavaType[tensorInfo.type.ordinal()]) {
                case 1:
                    ((FloatBuffer) buffer).put((float[]) obj);
                    return;
                case 2:
                    ((DoubleBuffer) buffer).put((double[]) obj);
                    return;
                case 3:
                case 4:
                    ((ByteBuffer) buffer).put((byte[]) obj);
                    return;
                case 5:
                case 11:
                case 12:
                    ((ShortBuffer) buffer).put((short[]) obj);
                    return;
                case 6:
                    ((IntBuffer) buffer).put((int[]) obj);
                    return;
                case 7:
                    ((LongBuffer) buffer).put((long[]) obj);
                    return;
                case 8:
                    boolean[] zArr = (boolean[]) obj;
                    ByteBuffer byteBuffer = (ByteBuffer) buffer;
                    while (i11 < zArr.length) {
                        byteBuffer.put(zArr[i11] ? (byte) 1 : (byte) 0);
                        i11++;
                    }
                    return;
                case 9:
                case 10:
                    androidx.navigation.b.o(tensorInfo.type, "Unexpected type, expected Java primitive found ");
                    return;
                default:
                    return;
            }
        }
        long j10 = jArr[i10];
        long length = Array.getLength(obj);
        if (j10 == length) {
            while (i11 < length) {
                fillBufferFromArray(tensorInfo, Array.get(obj, i11), i10 + 1, buffer);
                i11++;
            }
            return;
        }
        throw new IllegalArgumentException("Mismatch in array sizes, expected " + j10 + " at dim " + i10 + " from shape " + Arrays.toString(tensorInfo.shape) + ", found " + length);
    }

    private static void flattenString(Object[] objArr, ArrayList<String> arrayList) {
        for (Object obj : objArr) {
            Class<?> cls = obj.getClass();
            if (cls.isArray()) {
                if (cls.getComponentType().isArray()) {
                    flattenString((Object[]) obj, arrayList);
                } else if (cls.getComponentType().equals(String.class)) {
                    arrayList.addAll(Arrays.asList((String[]) obj));
                } else {
                    i.l(a.j(cls, "Found a non-String, non-array element type, "));
                    return;
                }
            } else {
                i.l(a.j(cls, "Found an element type where there should have been an array. Class = "));
                return;
            }
        }
    }

    public static Object newBooleanArray(long[] jArr) {
        return Array.newInstance((Class<?>) Boolean.TYPE, transformShape(jArr));
    }

    public static Object newByteArray(long[] jArr) {
        return Array.newInstance((Class<?>) Byte.TYPE, transformShape(jArr));
    }

    public static Object newDoubleArray(long[] jArr) {
        return Array.newInstance((Class<?>) Double.TYPE, transformShape(jArr));
    }

    public static Object newFloatArray(long[] jArr) {
        return Array.newInstance((Class<?>) Float.TYPE, transformShape(jArr));
    }

    public static Object newIntArray(long[] jArr) {
        return Array.newInstance((Class<?>) Integer.TYPE, transformShape(jArr));
    }

    public static Object newLongArray(long[] jArr) {
        return Array.newInstance((Class<?>) Long.TYPE, transformShape(jArr));
    }

    public static Object newShortArray(long[] jArr) {
        return Array.newInstance((Class<?>) Short.TYPE, transformShape(jArr));
    }

    public static Object newStringArray(long[] jArr) {
        return Array.newInstance((Class<?>) String.class, transformShape(jArr));
    }

    public static BufferTuple prepareBuffer(Buffer buffer, OnnxJavaType onnxJavaType) {
        int i10;
        Buffer put;
        Buffer buffer2;
        int i11;
        boolean z9;
        if (onnxJavaType != OnnxJavaType.STRING && onnxJavaType != OnnxJavaType.UNKNOWN) {
            if (buffer instanceof ByteBuffer) {
                i10 = 1;
            } else {
                i10 = onnxJavaType.size;
            }
            long j10 = i10;
            if (buffer.remaining() * j10 <= 2147483647L - (j10 * 8)) {
                int remaining = buffer.remaining() * i10;
                if (buffer.isDirect()) {
                    buffer2 = buffer;
                    i11 = buffer.position() * i10;
                } else {
                    int position = buffer.position();
                    ByteBuffer order = ByteBuffer.allocateDirect(remaining).order(ByteOrder.nativeOrder());
                    switch (AnonymousClass1.$SwitchMap$ai$onnxruntime$OnnxJavaType[onnxJavaType.ordinal()]) {
                        case 1:
                            put = order.asFloatBuffer().put((FloatBuffer) buffer);
                            break;
                        case 2:
                            put = order.asDoubleBuffer().put((DoubleBuffer) buffer);
                            break;
                        case 3:
                        case 4:
                        case 8:
                            put = order.put((ByteBuffer) buffer);
                            break;
                        case 5:
                        case 11:
                        case 12:
                            put = order.asShortBuffer().put((ShortBuffer) buffer);
                            break;
                        case 6:
                            put = order.asIntBuffer().put((IntBuffer) buffer);
                            break;
                        case 7:
                            put = order.asLongBuffer().put((LongBuffer) buffer);
                            break;
                        case 9:
                        case 10:
                        default:
                            b.q(onnxJavaType, "Impossible to reach here, managed to cast a buffer as an incorrect type, found ");
                            return null;
                    }
                    buffer.position(position);
                    put.rewind();
                    buffer2 = put;
                    i11 = 0;
                }
                long j11 = remaining;
                long remaining2 = buffer.remaining();
                if (buffer2 != buffer) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                return new BufferTuple(buffer2, i11, j11, remaining2, z9);
            }
            b.c(buffer.remaining(), "Cannot allocate a direct buffer of the requested size and type, size ", ", type = ", onnxJavaType);
            return null;
        }
        b.g(onnxJavaType, "Cannot create a ", " tensor from a buffer");
        return null;
    }

    private static int reshape(Object obj, Object obj2, int i10) {
        if (obj2.getClass().isArray()) {
            for (Object obj3 : (Object[]) obj2) {
                Class<?> cls = obj3.getClass();
                if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    if (!componentType.isPrimitive() && componentType != String.class) {
                        i10 = reshape(obj, obj3, i10);
                    } else {
                        int length = Array.getLength(obj3);
                        System.arraycopy(obj, i10, obj3, 0, length);
                        i10 = length + i10;
                    }
                } else {
                    i.l(a.j(cls, "Found element type when expecting an array. Class "));
                    return 0;
                }
            }
            return i10;
        }
        b.u(obj2.getClass(), "Found element type when expecting an array. Class ");
        return 0;
    }

    public static int[] transformShape(long[] jArr) {
        if (jArr.length != 0 && jArr.length <= 8) {
            int[] iArr = new int[jArr.length];
            for (int i10 = 0; i10 < jArr.length; i10++) {
                long j10 = jArr[i10];
                if (j10 >= 0 && j10 <= 2147483647L) {
                    iArr[i10] = (int) j10;
                } else {
                    androidx.navigation.b.o(Arrays.toString(jArr), "Invalid shape for a Java array, expected non-negative entries smaller than Integer.MAX_VALUE. Found ");
                    return null;
                }
            }
            return iArr;
        }
        i.k("Arrays with less than 1 and greater than 8 dimensions are not supported.");
        return null;
    }

    public static String[][] unpackMap(Map<String, String> map) {
        String[] strArr = new String[map.size()];
        String[] strArr2 = new String[map.size()];
        int i10 = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                strArr[i10] = entry.getKey();
                strArr2[i10] = entry.getValue();
                i10++;
            } else {
                androidx.navigation.b.y("Invalid map, keys and values must not be null, found key = ", entry.getKey(), ", value = ", entry.getValue());
                return null;
            }
        }
        return new String[][]{strArr, strArr2};
    }

    public static boolean validateShape(long[] jArr) {
        boolean z9;
        boolean z10;
        boolean z11 = true;
        for (long j10 : jArr) {
            if (j10 > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z12 = z11 & z9;
            if (((int) j10) == j10) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = z12 & z10;
        }
        if (z11 && jArr.length <= 8) {
            return true;
        }
        return false;
    }

    public static long[] transformShape(int[] iArr) {
        if (iArr.length != 0 && iArr.length <= 8) {
            long[] jArr = new long[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                long j10 = iArr[i10];
                if (j10 >= 1) {
                    jArr[i10] = j10;
                } else {
                    androidx.navigation.b.o(Arrays.toString(iArr), "Invalid shape for a Java array, expected positive entries smaller than Integer.MAX_VALUE. Found ");
                    return null;
                }
            }
            return jArr;
        }
        i.k("Arrays with less than 1 and greater than 8 dimensions are not supported.");
        return null;
    }

    public static String[] flattenString(Object obj) {
        if (obj instanceof String[]) {
            return (String[]) obj;
        }
        ArrayList arrayList = new ArrayList();
        flattenString((Object[]) obj, arrayList);
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static Object reshape(byte[] bArr, long[] jArr) {
        Object newByteArray = newByteArray(jArr);
        reshape(bArr, newByteArray, 0);
        return newByteArray;
    }

    public static Object reshape(short[] sArr, long[] jArr) {
        Object newShortArray = newShortArray(jArr);
        reshape(sArr, newShortArray, 0);
        return newShortArray;
    }

    public static Object reshape(int[] iArr, long[] jArr) {
        Object newIntArray = newIntArray(jArr);
        reshape(iArr, newIntArray, 0);
        return newIntArray;
    }

    public static Object reshape(long[] jArr, long[] jArr2) {
        Object newLongArray = newLongArray(jArr2);
        reshape(jArr, newLongArray, 0);
        return newLongArray;
    }

    public static Object reshape(float[] fArr, long[] jArr) {
        Object newFloatArray = newFloatArray(jArr);
        reshape(fArr, newFloatArray, 0);
        return newFloatArray;
    }

    public static Object reshape(double[] dArr, long[] jArr) {
        Object newDoubleArray = newDoubleArray(jArr);
        reshape(dArr, newDoubleArray, 0);
        return newDoubleArray;
    }

    public static Object reshape(String[] strArr, long[] jArr) {
        Object newStringArray = newStringArray(jArr);
        reshape(strArr, newStringArray, 0);
        return newStringArray;
    }

    public static Object reshape(boolean[] zArr, long[] jArr) {
        Object newBooleanArray = newBooleanArray(jArr);
        reshape(zArr, newBooleanArray, 0);
        return newBooleanArray;
    }
}
