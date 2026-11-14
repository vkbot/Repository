package ai.onnxruntime;

import ai.onnxruntime.OnnxValue;
import ai.onnxruntime.OrtUtil;
import ai.onnxruntime.platform.Fp16Conversions;
import j1.i;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import java.util.logging.Logger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class OnnxSparseTensor extends OnnxTensorLike {
    private static final Logger logger = Logger.getLogger(OnnxSparseTensor.class.getName());
    private final Buffer indices;
    private final LongBuffer innerIndices;
    private final SparseTensorType sparseTensorType;
    private final Buffer values;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* renamed from: ai.onnxruntime.OnnxSparseTensor$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ai$onnxruntime$OnnxJavaType;
        static final /* synthetic */ int[] $SwitchMap$ai$onnxruntime$OnnxSparseTensor$SparseTensorType;

        static {
            int[] iArr = new int[OnnxJavaType.values().length];
            $SwitchMap$ai$onnxruntime$OnnxJavaType = iArr;
            try {
                iArr[OnnxJavaType.FLOAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OnnxJavaType[OnnxJavaType.FLOAT16.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OnnxJavaType[OnnxJavaType.BFLOAT16.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OnnxJavaType[OnnxJavaType.DOUBLE.ordinal()] = 4;
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
                $SwitchMap$ai$onnxruntime$OnnxJavaType[OnnxJavaType.INT8.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OnnxJavaType[OnnxJavaType.UINT8.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OnnxJavaType[OnnxJavaType.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OnnxJavaType[OnnxJavaType.UNKNOWN.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            int[] iArr2 = new int[SparseTensorType.values().length];
            $SwitchMap$ai$onnxruntime$OnnxSparseTensor$SparseTensorType = iArr2;
            try {
                iArr2[SparseTensorType.COO.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OnnxSparseTensor$SparseTensorType[SparseTensorType.BLOCK_SPARSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OnnxSparseTensor$SparseTensorType[SparseTensorType.CSRC.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OnnxSparseTensor$SparseTensorType[SparseTensorType.UNDEFINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static final class BlockSparseTensor extends SparseTensor<IntBuffer> {
        public BlockSparseTensor(IntBuffer intBuffer, long[] jArr, Buffer buffer, long[] jArr2, long[] jArr3, OnnxJavaType onnxJavaType, long j10) {
            super(intBuffer, jArr, buffer, jArr2, jArr3, onnxJavaType, j10);
            if (OrtUtil.elementCount(jArr2) == j10) {
                if (j10 == buffer.remaining()) {
                    if (OrtUtil.elementCount(jArr) == intBuffer.remaining()) {
                        if (jArr2.length >= 3) {
                            if (jArr.length >= 2) {
                                return;
                            }
                            androidx.navigation.b.o(Arrays.toString(jArr), "Expected [numBlocks, coordinates] or larger, but indices shape was ");
                            throw null;
                        }
                        androidx.navigation.b.o(Arrays.toString(jArr2), "Expected [numBlocks, blockSize, blockSize] or larger, but data shape was ");
                        throw null;
                    }
                    b.l("Expected ", OrtUtil.elementCount(jArr), " elements in the indices buffer, found ", intBuffer.remaining());
                    throw null;
                }
                b.l("Expected ", j10, " elements in the data buffer, found ", buffer.remaining());
                throw null;
            }
            throw new IllegalArgumentException("Expected " + j10 + " entries in the data shape, found " + Arrays.toString(jArr2));
        }

        @Override // ai.onnxruntime.OnnxSparseTensor.SparseTensor
        public OnnxJavaType getIndicesType() {
            return OnnxJavaType.INT32;
        }

        @Override // ai.onnxruntime.OnnxSparseTensor.SparseTensor
        public SparseTensorType getSparsityType() {
            return SparseTensorType.BLOCK_SPARSE;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static final class COOTensor extends SparseTensor<LongBuffer> {
        public COOTensor(LongBuffer longBuffer, long[] jArr, Buffer buffer, long[] jArr2, OnnxJavaType onnxJavaType, long j10) {
            super(longBuffer, jArr, buffer, new long[]{j10}, jArr2, onnxJavaType, j10);
            if (jArr.length <= 2 && jArr.length != 0 && jArr[0] == j10) {
                long elementCount = OrtUtil.elementCount(jArr);
                if (elementCount == longBuffer.remaining()) {
                    if (buffer.remaining() == j10) {
                        return;
                    }
                    b.k("Expected data.remaining() - ", buffer.remaining(), " to equal numNonZero - ", j10);
                    throw null;
                }
                b.l("Unexpected number of indices found in buffer, expected ", elementCount, " found ", longBuffer.remaining());
                throw null;
            }
            androidx.navigation.b.o(Arrays.toString(jArr), "Invalid indices shape, expected [numNonZero, dimension] or [numNonZero] found ");
            throw null;
        }

        @Override // ai.onnxruntime.OnnxSparseTensor.SparseTensor
        public OnnxJavaType getIndicesType() {
            return OnnxJavaType.INT64;
        }

        @Override // ai.onnxruntime.OnnxSparseTensor.SparseTensor
        public SparseTensorType getSparsityType() {
            return SparseTensorType.COO;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static final class CSRCTensor extends SparseTensor<LongBuffer> {
        private final LongBuffer innerIndices;

        public CSRCTensor(LongBuffer longBuffer, LongBuffer longBuffer2, Buffer buffer, long[] jArr, OnnxJavaType onnxJavaType, long j10) {
            super(longBuffer, new long[]{longBuffer.remaining()}, buffer, new long[]{j10}, jArr, onnxJavaType, j10);
            this.innerIndices = longBuffer2;
            long j11 = jArr[0] + 1;
            if (longBuffer.remaining() == j11) {
                if (longBuffer2.remaining() == j10) {
                    return;
                }
                b.k("Inner indices should be equal to the number of non-zero elements, found ", longBuffer2.remaining(), ", expected ", j10);
                throw null;
            }
            b.k("Outer indices should be equal to the number of rows + 1 in the dense shape, found ", longBuffer.remaining(), ", expected ", j11);
            throw null;
        }

        @Override // ai.onnxruntime.OnnxSparseTensor.SparseTensor
        public OnnxJavaType getIndicesType() {
            return OnnxJavaType.INT64;
        }

        public LongBuffer getInnerIndices() {
            return this.innerIndices;
        }

        public long[] getInnerIndicesShape() {
            return new long[]{this.innerIndices.remaining()};
        }

        @Override // ai.onnxruntime.OnnxSparseTensor.SparseTensor
        public SparseTensorType getSparsityType() {
            return SparseTensorType.CSRC;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static abstract class SparseTensor<T extends Buffer> {
        private final long[] denseShape;
        final T indices;
        private final long[] indicesShape;
        private final long numNonZero;
        private final OnnxJavaType type;
        final Buffer values;
        private final long[] valuesShape;

        public SparseTensor(T t, long[] jArr, Buffer buffer, long[] jArr2, long[] jArr3, OnnxJavaType onnxJavaType, long j10) {
            this.indices = t;
            this.indicesShape = jArr;
            this.values = buffer;
            this.valuesShape = jArr2;
            this.denseShape = jArr3;
            this.type = onnxJavaType;
            this.numNonZero = j10;
            if (buffer.remaining() == j10) {
                if (onnxJavaType != OnnxJavaType.STRING) {
                    return;
                }
                i.k("String SparseTensors are not supported.");
                throw null;
            }
            throw new IllegalArgumentException("Expected numNonZero and data.remaining to be equal, found " + j10 + " and " + buffer.remaining() + " respectively");
        }

        public long[] getDenseShape() {
            return this.denseShape;
        }

        public T getIndices() {
            return this.indices;
        }

        public long[] getIndicesShape() {
            return this.indicesShape;
        }

        public abstract OnnxJavaType getIndicesType();

        public long getNumNonZeroElements() {
            return this.numNonZero;
        }

        public abstract SparseTensorType getSparsityType();

        public OnnxJavaType getType() {
            return this.type;
        }

        public Buffer getValues() {
            return this.values;
        }

        public long[] getValuesShape() {
            return this.valuesShape;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 ai.onnxruntime.OnnxSparseTensor$SparseTensorType, still in use, count: 1, list:
      (r1v1 ai.onnxruntime.OnnxSparseTensor$SparseTensorType) from 0x0030: FILLED_NEW_ARRAY (r7v3 ai.onnxruntime.OnnxSparseTensor$SparseTensorType[]) = 
      (r0v0 ai.onnxruntime.OnnxSparseTensor$SparseTensorType)
      (r1v1 ai.onnxruntime.OnnxSparseTensor$SparseTensorType)
      (r3v1 ai.onnxruntime.OnnxSparseTensor$SparseTensorType)
      (r0v0 ai.onnxruntime.OnnxSparseTensor$SparseTensorType)
      (r5v1 ai.onnxruntime.OnnxSparseTensor$SparseTensorType)
     (LINE:49) elemType: ai.onnxruntime.OnnxSparseTensor$SparseTensorType
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:238)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static final class SparseTensorType {
        UNDEFINED(0),
        COO(1),
        CSRC(2),
        BLOCK_SPARSE(4);

        private static final SparseTensorType[] values;
        public final int value;

        static {
            SparseTensorType sparseTensorType = UNDEFINED;
            values = r7;
            SparseTensorType[] sparseTensorTypeArr = {sparseTensorType, r1, r3, sparseTensorType, r5};
        }

        private SparseTensorType(int i10) {
            this.value = i10;
        }

        public static SparseTensorType mapFromInt(int i10) {
            if (i10 > 0) {
                SparseTensorType[] sparseTensorTypeArr = values;
                if (i10 < sparseTensorTypeArr.length) {
                    return sparseTensorTypeArr[i10];
                }
            }
            return UNDEFINED;
        }

        public static SparseTensorType valueOf(String str) {
            return (SparseTensorType) Enum.valueOf(SparseTensorType.class, str);
        }

        public static SparseTensorType[] values() {
            return (SparseTensorType[]) $VALUES.clone();
        }
    }

    public OnnxSparseTensor(long j10, long j11, int i10, TensorInfo tensorInfo) {
        this(j10, j11, SparseTensorType.mapFromInt(i10), tensorInfo, null, null, null);
    }

    private native void close(long j10, long j11);

    private static native long createCSRCSparseTensorFromBuffer(long j10, long j11, Buffer buffer, int i10, long j12, Buffer buffer2, int i11, long j13, Buffer buffer3, int i12, long[] jArr, long[] jArr2, int i13);

    public static <T extends Buffer> OnnxSparseTensor createSparseTensor(OrtEnvironment ortEnvironment, OrtAllocator ortAllocator, SparseTensor<T> sparseTensor) {
        if (!ortAllocator.isClosed()) {
            TensorInfo constructFromSparseTensor = TensorInfo.constructFromSparseTensor(sparseTensor);
            OnnxJavaType indicesType = sparseTensor.getIndicesType();
            OrtUtil.BufferTuple prepareBuffer = OrtUtil.prepareBuffer(sparseTensor.getIndices(), indicesType);
            OrtUtil.BufferTuple prepareBuffer2 = OrtUtil.prepareBuffer(sparseTensor.getValues(), constructFromSparseTensor.type);
            Buffer buffer = prepareBuffer.data;
            if (!(buffer instanceof LongBuffer) && !(buffer instanceof IntBuffer)) {
                n0.b.j(prepareBuffer.data.getClass(), "Unexpected type of indices buffer, found ", ", expected IntBuffer or LongBuffer");
                return null;
            }
            int i10 = AnonymousClass1.$SwitchMap$ai$onnxruntime$OnnxSparseTensor$SparseTensorType[sparseTensor.getSparsityType().ordinal()];
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    OrtUtil.BufferTuple prepareBuffer3 = OrtUtil.prepareBuffer(((CSRCTensor) sparseTensor).getInnerIndices(), indicesType);
                    return new OnnxSparseTensor(createCSRCSparseTensorFromBuffer(OnnxRuntime.ortApiHandle, ortAllocator.handle, prepareBuffer.data, prepareBuffer.pos, prepareBuffer.size, prepareBuffer3.data, prepareBuffer3.pos, prepareBuffer3.size, prepareBuffer2.data, prepareBuffer2.pos, constructFromSparseTensor.shape, sparseTensor.getValuesShape(), constructFromSparseTensor.onnxType.value), ortAllocator.handle, sparseTensor.getSparsityType(), constructFromSparseTensor, prepareBuffer.data, (LongBuffer) prepareBuffer3.data, prepareBuffer2.data);
                }
                i.k("Cannot create an UNDEFINED sparse tensor.");
                return null;
            }
            return new OnnxSparseTensor(createSparseTensorFromBuffer(OnnxRuntime.ortApiHandle, ortAllocator.handle, prepareBuffer.data, prepareBuffer.pos, prepareBuffer.size, prepareBuffer2.data, prepareBuffer2.pos, constructFromSparseTensor.shape, sparseTensor.getIndicesShape(), sparseTensor.getValuesShape(), constructFromSparseTensor.onnxType.value, sparseTensor.getSparsityType().value), ortAllocator.handle, sparseTensor.getSparsityType(), constructFromSparseTensor, prepareBuffer.data, prepareBuffer2.data);
        }
        i.l("Trying to create an OnnxSparseTensor on a closed OrtAllocator.");
        return null;
    }

    private static native long createSparseTensorFromBuffer(long j10, long j11, Buffer buffer, int i10, long j12, Buffer buffer2, int i11, long[] jArr, long[] jArr2, long[] jArr3, int i12, int i13);

    private native ByteBuffer getIndicesBuffer(long j10, long j11);

    private native long[] getIndicesShape(long j10, long j11);

    private native ByteBuffer getInnerIndicesBuffer(long j10, long j11);

    private native long[] getInnerIndicesShape(long j10, long j11);

    private native ByteBuffer getValuesBuffer(long j10, long j11);

    private native long[] getValuesShape(long j10, long j11);

    @Override // ai.onnxruntime.OnnxValue, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (!this.closed) {
                close(OnnxRuntime.ortApiHandle, this.nativeHandle);
                this.closed = true;
            } else {
                logger.warning("Closing an already closed OnnxSparseTensor.");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public Buffer getIndicesBuffer() {
        checkClosed();
        int i10 = AnonymousClass1.$SwitchMap$ai$onnxruntime$OnnxSparseTensor$SparseTensorType[this.sparseTensorType.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    i.l("UNDEFINED sparse tensor type.");
                    return null;
                }
            } else {
                IntBuffer asIntBuffer = getIndicesBuffer(OnnxRuntime.ortApiHandle, this.nativeHandle).order(ByteOrder.nativeOrder()).asIntBuffer();
                IntBuffer allocate = IntBuffer.allocate(asIntBuffer.capacity());
                allocate.put(asIntBuffer);
                allocate.rewind();
                return allocate;
            }
        }
        LongBuffer asLongBuffer = getIndicesBuffer(OnnxRuntime.ortApiHandle, this.nativeHandle).order(ByteOrder.nativeOrder()).asLongBuffer();
        LongBuffer allocate2 = LongBuffer.allocate(asLongBuffer.capacity());
        allocate2.put(asLongBuffer);
        allocate2.rewind();
        return allocate2;
    }

    public long[] getIndicesShape() {
        checkClosed();
        return getIndicesShape(OnnxRuntime.ortApiHandle, this.nativeHandle);
    }

    public LongBuffer getInnerIndicesBuffer() {
        checkClosed();
        if (this.sparseTensorType == SparseTensorType.CSRC) {
            LongBuffer asLongBuffer = getInnerIndicesBuffer(OnnxRuntime.ortApiHandle, this.nativeHandle).order(ByteOrder.nativeOrder()).asLongBuffer();
            LongBuffer allocate = LongBuffer.allocate(asLongBuffer.capacity());
            allocate.put(asLongBuffer);
            allocate.rewind();
            return allocate;
        }
        b.u(this.sparseTensorType, "Inner indices are only available for CSRC sparse tensors, this sparse tensor is ");
        return null;
    }

    public long[] getInnerIndicesShape() {
        checkClosed();
        if (this.sparseTensorType == SparseTensorType.CSRC) {
            return getInnerIndicesShape(OnnxRuntime.ortApiHandle, this.nativeHandle);
        }
        b.u(this.sparseTensorType, "Inner indices are only available for CSRC sparse tensors, this sparse tensor is ");
        return null;
    }

    public SparseTensorType getSparseTensorType() {
        return this.sparseTensorType;
    }

    @Override // ai.onnxruntime.OnnxValue
    public OnnxValue.OnnxValueType getType() {
        return OnnxValue.OnnxValueType.ONNX_TYPE_SPARSETENSOR;
    }

    @Override // ai.onnxruntime.OnnxValue
    public SparseTensor<? extends Buffer> getValue() {
        checkClosed();
        Buffer valuesBuffer = getValuesBuffer();
        long[] indicesShape = getIndicesShape(OnnxRuntime.ortApiHandle, this.nativeHandle);
        int i10 = AnonymousClass1.$SwitchMap$ai$onnxruntime$OnnxSparseTensor$SparseTensorType[this.sparseTensorType.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    LongBuffer longBuffer = (LongBuffer) getIndicesBuffer();
                    LongBuffer innerIndicesBuffer = getInnerIndicesBuffer();
                    TensorInfo tensorInfo = this.info;
                    return new CSRCTensor(longBuffer, innerIndicesBuffer, valuesBuffer, tensorInfo.shape, tensorInfo.type, valuesBuffer.remaining());
                }
                i.l("Undefined sparsity type in this sparse tensor.");
                return null;
            }
            long[] valuesShape = getValuesShape(OnnxRuntime.ortApiHandle, this.nativeHandle);
            IntBuffer intBuffer = (IntBuffer) getIndicesBuffer();
            TensorInfo tensorInfo2 = this.info;
            return new BlockSparseTensor(intBuffer, indicesShape, valuesBuffer, valuesShape, tensorInfo2.shape, tensorInfo2.type, valuesBuffer.remaining());
        }
        LongBuffer longBuffer2 = (LongBuffer) getIndicesBuffer();
        TensorInfo tensorInfo3 = this.info;
        return new COOTensor(longBuffer2, indicesShape, valuesBuffer, tensorInfo3.shape, tensorInfo3.type, valuesBuffer.remaining());
    }

    public Buffer getValuesBuffer() {
        checkClosed();
        ByteBuffer order = getValuesBuffer(OnnxRuntime.ortApiHandle, this.nativeHandle).order(ByteOrder.nativeOrder());
        switch (AnonymousClass1.$SwitchMap$ai$onnxruntime$OnnxJavaType[this.info.type.ordinal()]) {
            case 1:
                FloatBuffer asFloatBuffer = order.asFloatBuffer();
                FloatBuffer allocate = FloatBuffer.allocate(asFloatBuffer.capacity());
                allocate.put(asFloatBuffer);
                allocate.rewind();
                return allocate;
            case 2:
                return Fp16Conversions.convertFp16BufferToFloatBuffer(order.asShortBuffer());
            case 3:
                return Fp16Conversions.convertBf16BufferToFloatBuffer(order.asShortBuffer());
            case 4:
                DoubleBuffer asDoubleBuffer = order.asDoubleBuffer();
                DoubleBuffer allocate2 = DoubleBuffer.allocate(asDoubleBuffer.capacity());
                allocate2.put(asDoubleBuffer);
                allocate2.rewind();
                return allocate2;
            case 5:
                ShortBuffer asShortBuffer = order.asShortBuffer();
                ShortBuffer allocate3 = ShortBuffer.allocate(asShortBuffer.capacity());
                allocate3.put(asShortBuffer);
                allocate3.rewind();
                return allocate3;
            case 6:
                IntBuffer asIntBuffer = order.asIntBuffer();
                IntBuffer allocate4 = IntBuffer.allocate(asIntBuffer.capacity());
                allocate4.put(asIntBuffer);
                allocate4.rewind();
                return allocate4;
            case 7:
                LongBuffer asLongBuffer = order.asLongBuffer();
                LongBuffer allocate5 = LongBuffer.allocate(asLongBuffer.capacity());
                allocate5.put(asLongBuffer);
                allocate5.rewind();
                return allocate5;
            case 8:
            case 9:
            case 10:
                ByteBuffer allocate6 = ByteBuffer.allocate(order.capacity());
                allocate6.put(order);
                allocate6.rewind();
                return allocate6;
            case 11:
                i.l("Unsupported data type String");
                return null;
            default:
                i.l("Unsupported data type");
                return null;
        }
    }

    public long[] getValuesShape() {
        checkClosed();
        return getValuesShape(OnnxRuntime.ortApiHandle, this.nativeHandle);
    }

    public OnnxSparseTensor(long j10, long j11, SparseTensorType sparseTensorType, TensorInfo tensorInfo, Buffer buffer, Buffer buffer2) {
        this(j10, j11, sparseTensorType, tensorInfo, buffer, null, buffer2);
    }

    public OnnxSparseTensor(long j10, long j11, SparseTensorType sparseTensorType, TensorInfo tensorInfo, Buffer buffer, LongBuffer longBuffer, Buffer buffer2) {
        super(j10, j11, tensorInfo);
        this.sparseTensorType = sparseTensorType;
        this.indices = buffer;
        this.innerIndices = longBuffer;
        this.values = buffer2;
    }

    public static <T extends Buffer> OnnxSparseTensor createSparseTensor(OrtEnvironment ortEnvironment, SparseTensor<T> sparseTensor) {
        return createSparseTensor(ortEnvironment, ortEnvironment.defaultAllocator, sparseTensor);
    }
}
