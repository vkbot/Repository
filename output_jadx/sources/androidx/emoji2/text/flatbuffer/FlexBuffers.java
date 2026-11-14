package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import kotlin.UByte;
import kotlin.UShort;
import kotlin.text.Typography;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class FlexBuffers {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final ReadBuf EMPTY_BB = new ArrayReadWriteBuf(new byte[]{0}, 1);
    public static final int FBT_BLOB = 25;
    public static final int FBT_BOOL = 26;
    public static final int FBT_FLOAT = 3;
    public static final int FBT_INDIRECT_FLOAT = 8;
    public static final int FBT_INDIRECT_INT = 6;
    public static final int FBT_INDIRECT_UINT = 7;
    public static final int FBT_INT = 1;
    public static final int FBT_KEY = 4;
    public static final int FBT_MAP = 9;
    public static final int FBT_NULL = 0;
    public static final int FBT_STRING = 5;
    public static final int FBT_UINT = 2;
    public static final int FBT_VECTOR = 10;
    public static final int FBT_VECTOR_BOOL = 36;
    public static final int FBT_VECTOR_FLOAT = 13;
    public static final int FBT_VECTOR_FLOAT2 = 18;
    public static final int FBT_VECTOR_FLOAT3 = 21;
    public static final int FBT_VECTOR_FLOAT4 = 24;
    public static final int FBT_VECTOR_INT = 11;
    public static final int FBT_VECTOR_INT2 = 16;
    public static final int FBT_VECTOR_INT3 = 19;
    public static final int FBT_VECTOR_INT4 = 22;
    public static final int FBT_VECTOR_KEY = 14;
    public static final int FBT_VECTOR_STRING_DEPRECATED = 15;
    public static final int FBT_VECTOR_UINT = 12;
    public static final int FBT_VECTOR_UINT2 = 17;
    public static final int FBT_VECTOR_UINT3 = 20;
    public static final int FBT_VECTOR_UINT4 = 23;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class FlexBufferException extends RuntimeException {
        public FlexBufferException(String str) {
            super(str);
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class KeyVector {
        private final TypedVector vec;

        public KeyVector(TypedVector typedVector) {
            this.vec = typedVector;
        }

        public Key get(int i10) {
            if (i10 >= size()) {
                return Key.EMPTY;
            }
            TypedVector typedVector = this.vec;
            int i11 = (i10 * typedVector.byteWidth) + typedVector.end;
            TypedVector typedVector2 = this.vec;
            ReadBuf readBuf = typedVector2.bb;
            return new Key(readBuf, FlexBuffers.indirect(readBuf, i11, typedVector2.byteWidth), 1);
        }

        public int size() {
            return this.vec.size();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (int i10 = 0; i10 < this.vec.size(); i10++) {
                this.vec.get(i10).toString(sb);
                if (i10 != this.vec.size() - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static abstract class Object {
        ReadBuf bb;
        int byteWidth;
        int end;

        public Object(ReadBuf readBuf, int i10, int i11) {
            this.bb = readBuf;
            this.end = i10;
            this.byteWidth = i11;
        }

        public String toString() {
            return toString(new StringBuilder(128)).toString();
        }

        public abstract StringBuilder toString(StringBuilder sb);
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static abstract class Sized extends Object {
        protected final int size;

        public Sized(ReadBuf readBuf, int i10, int i11) {
            super(readBuf, i10, i11);
            this.size = FlexBuffers.readInt(this.bb, i10 - i11, i11);
        }

        public int size() {
            return this.size;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class TypedVector extends Vector {
        private static final TypedVector EMPTY_VECTOR = new TypedVector(FlexBuffers.EMPTY_BB, 1, 1, 1);
        private final int elemType;

        public TypedVector(ReadBuf readBuf, int i10, int i11, int i12) {
            super(readBuf, i10, i11);
            this.elemType = i12;
        }

        public static TypedVector empty() {
            return EMPTY_VECTOR;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Vector
        public Reference get(int i10) {
            if (i10 >= size()) {
                return Reference.NULL_REFERENCE;
            }
            return new Reference(this.bb, (i10 * this.byteWidth) + this.end, this.byteWidth, 1, this.elemType);
        }

        public int getElemType() {
            return this.elemType;
        }

        public boolean isEmptyVector() {
            if (this == EMPTY_VECTOR) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class Unsigned {
        public static int byteToUnsignedInt(byte b10) {
            return b10 & UByte.MAX_VALUE;
        }

        public static long intToUnsignedLong(int i10) {
            return i10 & 4294967295L;
        }

        public static int shortToUnsignedInt(short s5) {
            return s5 & UShort.MAX_VALUE;
        }
    }

    @Deprecated
    public static Reference getRoot(ByteBuffer byteBuffer) {
        ReadBuf byteBufferReadWriteBuf;
        if (byteBuffer.hasArray()) {
            byteBufferReadWriteBuf = new ArrayReadWriteBuf(byteBuffer.array(), byteBuffer.limit());
        } else {
            byteBufferReadWriteBuf = new ByteBufferReadWriteBuf(byteBuffer);
        }
        return getRoot(byteBufferReadWriteBuf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indirect(ReadBuf readBuf, int i10, int i11) {
        return (int) (i10 - readUInt(readBuf, i10, i11));
    }

    public static boolean isTypeInline(int i10) {
        if (i10 > 3 && i10 != 26) {
            return false;
        }
        return true;
    }

    public static boolean isTypedVector(int i10) {
        if ((i10 >= 11 && i10 <= 15) || i10 == 36) {
            return true;
        }
        return false;
    }

    public static boolean isTypedVectorElementType(int i10) {
        if ((i10 >= 1 && i10 <= 4) || i10 == 26) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double readDouble(ReadBuf readBuf, int i10, int i11) {
        if (i11 != 4) {
            if (i11 != 8) {
                return -1.0d;
            }
            return readBuf.getDouble(i10);
        }
        return readBuf.getFloat(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int readInt(ReadBuf readBuf, int i10, int i11) {
        return (int) readLong(readBuf, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long readLong(ReadBuf readBuf, int i10, int i11) {
        int i12;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 4) {
                    if (i11 != 8) {
                        return -1L;
                    }
                    return readBuf.getLong(i10);
                }
                i12 = readBuf.getInt(i10);
            } else {
                i12 = readBuf.getShort(i10);
            }
        } else {
            i12 = readBuf.get(i10);
        }
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long readUInt(ReadBuf readBuf, int i10, int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 4) {
                    if (i11 != 8) {
                        return -1L;
                    }
                    return readBuf.getLong(i10);
                }
                return Unsigned.intToUnsignedLong(readBuf.getInt(i10));
            }
            return Unsigned.shortToUnsignedInt(readBuf.getShort(i10));
        }
        return Unsigned.byteToUnsignedInt(readBuf.get(i10));
    }

    public static int toTypedVector(int i10, int i11) {
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        return 0;
                    }
                    return i10 + 21;
                }
                return i10 + 18;
            }
            return i10 + 15;
        }
        return i10 + 10;
    }

    public static int toTypedVectorElementType(int i10) {
        return i10 - 10;
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class Reference {
        private static final Reference NULL_REFERENCE = new Reference(FlexBuffers.EMPTY_BB, 0, 1, 0);
        private ReadBuf bb;
        private int byteWidth;
        private int end;
        private int parentWidth;
        private int type;

        public Reference(ReadBuf readBuf, int i10, int i11, int i12) {
            this(readBuf, i10, i11, 1 << (i12 & 3), i12 >> 2);
        }

        public Blob asBlob() {
            if (!isBlob() && !isString()) {
                return Blob.empty();
            }
            ReadBuf readBuf = this.bb;
            return new Blob(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
        }

        public boolean asBoolean() {
            if (isBoolean()) {
                if (this.bb.get(this.end) == 0) {
                    return false;
                }
                return true;
            }
            if (asUInt() == 0) {
                return false;
            }
            return true;
        }

        public double asFloat() {
            int i10 = this.type;
            if (i10 == 3) {
                return FlexBuffers.readDouble(this.bb, this.end, this.parentWidth);
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 5) {
                        if (i10 != 6) {
                            if (i10 != 7) {
                                if (i10 != 8) {
                                    if (i10 != 10) {
                                        if (i10 != 26) {
                                            return 0.0d;
                                        }
                                    } else {
                                        return asVector().size();
                                    }
                                } else {
                                    ReadBuf readBuf = this.bb;
                                    return FlexBuffers.readDouble(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
                                }
                            } else {
                                ReadBuf readBuf2 = this.bb;
                                return FlexBuffers.readUInt(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.byteWidth);
                            }
                        } else {
                            ReadBuf readBuf3 = this.bb;
                            return FlexBuffers.readInt(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth);
                        }
                    } else {
                        return Double.parseDouble(asString());
                    }
                }
                return FlexBuffers.readUInt(this.bb, this.end, this.parentWidth);
            }
            return FlexBuffers.readInt(this.bb, this.end, this.parentWidth);
        }

        public int asInt() {
            int i10 = this.type;
            if (i10 == 1) {
                return FlexBuffers.readInt(this.bb, this.end, this.parentWidth);
            }
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 5) {
                        if (i10 != 6) {
                            if (i10 != 7) {
                                if (i10 != 8) {
                                    if (i10 != 10) {
                                        if (i10 == 26) {
                                            return FlexBuffers.readInt(this.bb, this.end, this.parentWidth);
                                        }
                                        return 0;
                                    }
                                    return asVector().size();
                                }
                                ReadBuf readBuf = this.bb;
                                return (int) FlexBuffers.readDouble(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
                            }
                            ReadBuf readBuf2 = this.bb;
                            return (int) FlexBuffers.readUInt(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.parentWidth);
                        }
                        ReadBuf readBuf3 = this.bb;
                        return FlexBuffers.readInt(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth);
                    }
                    return Integer.parseInt(asString());
                }
                return (int) FlexBuffers.readDouble(this.bb, this.end, this.parentWidth);
            }
            return (int) FlexBuffers.readUInt(this.bb, this.end, this.parentWidth);
        }

        public Key asKey() {
            if (isKey()) {
                ReadBuf readBuf = this.bb;
                return new Key(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            return Key.empty();
        }

        public long asLong() {
            int i10 = this.type;
            if (i10 == 1) {
                return FlexBuffers.readLong(this.bb, this.end, this.parentWidth);
            }
            if (i10 == 2) {
                return FlexBuffers.readUInt(this.bb, this.end, this.parentWidth);
            }
            if (i10 != 3) {
                if (i10 != 5) {
                    if (i10 != 6) {
                        if (i10 != 7) {
                            if (i10 != 8) {
                                if (i10 != 10) {
                                    if (i10 != 26) {
                                        return 0L;
                                    }
                                    return FlexBuffers.readInt(this.bb, this.end, this.parentWidth);
                                }
                                return asVector().size();
                            }
                            ReadBuf readBuf = this.bb;
                            return (long) FlexBuffers.readDouble(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
                        }
                        ReadBuf readBuf2 = this.bb;
                        return FlexBuffers.readUInt(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.parentWidth);
                    }
                    ReadBuf readBuf3 = this.bb;
                    return FlexBuffers.readLong(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth);
                }
                try {
                    return Long.parseLong(asString());
                } catch (NumberFormatException unused) {
                    return 0L;
                }
            }
            return (long) FlexBuffers.readDouble(this.bb, this.end, this.parentWidth);
        }

        public Map asMap() {
            if (isMap()) {
                ReadBuf readBuf = this.bb;
                return new Map(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            return Map.empty();
        }

        public String asString() {
            if (isString()) {
                int indirect = FlexBuffers.indirect(this.bb, this.end, this.parentWidth);
                ReadBuf readBuf = this.bb;
                int i10 = this.byteWidth;
                return this.bb.getString(indirect, (int) FlexBuffers.readUInt(readBuf, indirect - i10, i10));
            }
            if (isKey()) {
                int indirect2 = FlexBuffers.indirect(this.bb, this.end, this.byteWidth);
                int i11 = indirect2;
                while (this.bb.get(i11) != 0) {
                    i11++;
                }
                return this.bb.getString(indirect2, i11 - indirect2);
            }
            return "";
        }

        public long asUInt() {
            int i10 = this.type;
            if (i10 == 2) {
                return FlexBuffers.readUInt(this.bb, this.end, this.parentWidth);
            }
            if (i10 == 1) {
                return FlexBuffers.readLong(this.bb, this.end, this.parentWidth);
            }
            if (i10 != 3) {
                if (i10 != 10) {
                    if (i10 != 26) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    if (i10 != 8) {
                                        return 0L;
                                    }
                                    ReadBuf readBuf = this.bb;
                                    return (long) FlexBuffers.readDouble(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.parentWidth);
                                }
                                ReadBuf readBuf2 = this.bb;
                                return FlexBuffers.readUInt(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.byteWidth);
                            }
                            ReadBuf readBuf3 = this.bb;
                            return FlexBuffers.readLong(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth);
                        }
                        return Long.parseLong(asString());
                    }
                    return FlexBuffers.readInt(this.bb, this.end, this.parentWidth);
                }
                return asVector().size();
            }
            return (long) FlexBuffers.readDouble(this.bb, this.end, this.parentWidth);
        }

        public Vector asVector() {
            if (isVector()) {
                ReadBuf readBuf = this.bb;
                return new Vector(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            int i10 = this.type;
            if (i10 == 15) {
                ReadBuf readBuf2 = this.bb;
                return new TypedVector(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.byteWidth, 4);
            }
            if (FlexBuffers.isTypedVector(i10)) {
                ReadBuf readBuf3 = this.bb;
                return new TypedVector(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth, FlexBuffers.toTypedVectorElementType(this.type));
            }
            return Vector.empty();
        }

        public int getType() {
            return this.type;
        }

        public boolean isBlob() {
            if (this.type == 25) {
                return true;
            }
            return false;
        }

        public boolean isBoolean() {
            if (this.type == 26) {
                return true;
            }
            return false;
        }

        public boolean isFloat() {
            int i10 = this.type;
            if (i10 != 3 && i10 != 8) {
                return false;
            }
            return true;
        }

        public boolean isInt() {
            int i10 = this.type;
            if (i10 == 1 || i10 == 6) {
                return true;
            }
            return false;
        }

        public boolean isIntOrUInt() {
            if (!isInt() && !isUInt()) {
                return false;
            }
            return true;
        }

        public boolean isKey() {
            if (this.type == 4) {
                return true;
            }
            return false;
        }

        public boolean isMap() {
            if (this.type == 9) {
                return true;
            }
            return false;
        }

        public boolean isNull() {
            if (this.type == 0) {
                return true;
            }
            return false;
        }

        public boolean isNumeric() {
            if (!isIntOrUInt() && !isFloat()) {
                return false;
            }
            return true;
        }

        public boolean isString() {
            if (this.type == 5) {
                return true;
            }
            return false;
        }

        public boolean isTypedVector() {
            return FlexBuffers.isTypedVector(this.type);
        }

        public boolean isUInt() {
            int i10 = this.type;
            if (i10 != 2 && i10 != 7) {
                return false;
            }
            return true;
        }

        public boolean isVector() {
            int i10 = this.type;
            if (i10 != 10 && i10 != 9) {
                return false;
            }
            return true;
        }

        public StringBuilder toString(StringBuilder sb) {
            int i10 = this.type;
            if (i10 != 36) {
                switch (i10) {
                    case 0:
                        sb.append("null");
                        return sb;
                    case 1:
                    case 6:
                        sb.append(asLong());
                        return sb;
                    case 2:
                    case 7:
                        sb.append(asUInt());
                        return sb;
                    case 3:
                    case 8:
                        sb.append(asFloat());
                        return sb;
                    case 4:
                        Key asKey = asKey();
                        sb.append(Typography.quote);
                        StringBuilder key = asKey.toString(sb);
                        key.append(Typography.quote);
                        return key;
                    case 5:
                        sb.append(Typography.quote);
                        sb.append(asString());
                        sb.append(Typography.quote);
                        return sb;
                    case 9:
                        return asMap().toString(sb);
                    case 10:
                        return asVector().toString(sb);
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        throw new FlexBufferException("not_implemented:" + this.type);
                    case 25:
                        return asBlob().toString(sb);
                    case 26:
                        sb.append(asBoolean());
                        return sb;
                    default:
                        return sb;
                }
            }
            sb.append(asVector());
            return sb;
        }

        public Reference(ReadBuf readBuf, int i10, int i11, int i12, int i13) {
            this.bb = readBuf;
            this.end = i10;
            this.parentWidth = i11;
            this.byteWidth = i12;
            this.type = i13;
        }

        public String toString() {
            return toString(new StringBuilder(128)).toString();
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class Key extends Object {
        private static final Key EMPTY = new Key(FlexBuffers.EMPTY_BB, 0, 0);

        public Key(ReadBuf readBuf, int i10, int i11) {
            super(readBuf, i10, i11);
        }

        public static Key empty() {
            return EMPTY;
        }

        public int compareTo(byte[] bArr) {
            byte b10;
            byte b11;
            int i10 = this.end;
            int i11 = 0;
            do {
                b10 = this.bb.get(i10);
                b11 = bArr[i11];
                if (b10 == 0) {
                    return b10 - b11;
                }
                i10++;
                i11++;
                if (i11 == bArr.length) {
                    return b10 - b11;
                }
            } while (b10 == b11);
            return b10 - b11;
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            if (key.end != this.end || key.byteWidth != this.byteWidth) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.end ^ this.byteWidth;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public String toString() {
            int i10 = this.end;
            while (this.bb.get(i10) != 0) {
                i10++;
            }
            int i11 = this.end;
            return this.bb.getString(i11, i10 - i11);
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public StringBuilder toString(StringBuilder sb) {
            sb.append(toString());
            return sb;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class Blob extends Sized {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        static final Blob EMPTY = new Blob(FlexBuffers.EMPTY_BB, 1, 1);

        public Blob(ReadBuf readBuf, int i10, int i11) {
            super(readBuf, i10, i11);
        }

        public static Blob empty() {
            return EMPTY;
        }

        public ByteBuffer data() {
            ByteBuffer wrap = ByteBuffer.wrap(this.bb.data());
            wrap.position(this.end);
            wrap.limit(size() + this.end);
            return wrap.asReadOnlyBuffer().slice();
        }

        public byte get(int i10) {
            return this.bb.get(this.end + i10);
        }

        public byte[] getBytes() {
            int size = size();
            byte[] bArr = new byte[size];
            for (int i10 = 0; i10 < size; i10++) {
                bArr[i10] = this.bb.get(this.end + i10);
            }
            return bArr;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Sized
        public /* bridge */ /* synthetic */ int size() {
            return super.size();
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public StringBuilder toString(StringBuilder sb) {
            sb.append(Typography.quote);
            sb.append(this.bb.getString(this.end, size()));
            sb.append(Typography.quote);
            return sb;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public String toString() {
            return this.bb.getString(this.end, size());
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class Map extends Vector {
        private static final Map EMPTY_MAP = new Map(FlexBuffers.EMPTY_BB, 1, 1);

        public Map(ReadBuf readBuf, int i10, int i11) {
            super(readBuf, i10, i11);
        }

        private int binarySearch(KeyVector keyVector, byte[] bArr) {
            int size = keyVector.size() - 1;
            int i10 = 0;
            while (i10 <= size) {
                int i11 = (i10 + size) >>> 1;
                int compareTo = keyVector.get(i11).compareTo(bArr);
                if (compareTo < 0) {
                    i10 = i11 + 1;
                } else if (compareTo > 0) {
                    size = i11 - 1;
                } else {
                    return i11;
                }
            }
            return -(i10 + 1);
        }

        public static Map empty() {
            return EMPTY_MAP;
        }

        public Reference get(byte[] bArr) {
            KeyVector keys = keys();
            int size = keys.size();
            int binarySearch = binarySearch(keys, bArr);
            if (binarySearch < 0 || binarySearch >= size) {
                return Reference.NULL_REFERENCE;
            }
            return get(binarySearch);
        }

        public KeyVector keys() {
            int i10 = this.end - (this.byteWidth * 3);
            ReadBuf readBuf = this.bb;
            int indirect = FlexBuffers.indirect(readBuf, i10, this.byteWidth);
            ReadBuf readBuf2 = this.bb;
            int i11 = this.byteWidth;
            return new KeyVector(new TypedVector(readBuf, indirect, FlexBuffers.readInt(readBuf2, i10 + i11, i11), 4));
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Vector, androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public StringBuilder toString(StringBuilder sb) {
            sb.append("{ ");
            KeyVector keys = keys();
            int size = size();
            Vector values = values();
            for (int i10 = 0; i10 < size; i10++) {
                sb.append(Typography.quote);
                sb.append(keys.get(i10).toString());
                sb.append("\" : ");
                sb.append(values.get(i10).toString());
                if (i10 != size - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" }");
            return sb;
        }

        public Vector values() {
            return new Vector(this.bb, this.end, this.byteWidth);
        }

        public Reference get(String str) {
            return get(str.getBytes(StandardCharsets.UTF_8));
        }
    }

    public static Reference getRoot(ReadBuf readBuf) {
        int limit = readBuf.limit();
        byte b10 = readBuf.get(limit - 1);
        int i10 = limit - 2;
        return new Reference(readBuf, i10 - b10, b10, Unsigned.byteToUnsignedInt(readBuf.get(i10)));
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class Vector extends Sized {
        private static final Vector EMPTY_VECTOR = new Vector(FlexBuffers.EMPTY_BB, 1, 1);

        public Vector(ReadBuf readBuf, int i10, int i11) {
            super(readBuf, i10, i11);
        }

        public static Vector empty() {
            return EMPTY_VECTOR;
        }

        public Reference get(int i10) {
            long size = size();
            long j10 = i10;
            if (j10 >= size) {
                return Reference.NULL_REFERENCE;
            }
            return new Reference(this.bb, (i10 * this.byteWidth) + this.end, this.byteWidth, Unsigned.byteToUnsignedInt(this.bb.get((int) ((size * this.byteWidth) + this.end + j10))));
        }

        public boolean isEmpty() {
            if (this == EMPTY_VECTOR) {
                return true;
            }
            return false;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Sized
        public /* bridge */ /* synthetic */ int size() {
            return super.size();
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public StringBuilder toString(StringBuilder sb) {
            sb.append("[ ");
            int size = size();
            for (int i10 = 0; i10 < size; i10++) {
                get(i10).toString(sb);
                if (i10 != size - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" ]");
            return sb;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }
}
